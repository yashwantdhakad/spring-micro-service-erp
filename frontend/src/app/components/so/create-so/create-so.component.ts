import { Component, OnInit, OnDestroy } from '@angular/core';
import { FormArray, FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Observable, of, Subject, from, forkJoin } from 'rxjs';
import {
  debounceTime,
  distinctUntilChanged,
  switchMap,
  takeUntil,
  map,
  catchError,
  startWith,
  finalize,
  concatMap,
  toArray,
} from 'rxjs/operators';
import { MatAutocompleteSelectedEvent } from '@angular/material/autocomplete';
import { OrderService } from 'src/app/services/order/order.service';
import { PartyService } from 'src/app/services/party/party.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';
import { AddEditAddressComponent } from 'src/app/components/party/add-edit-address/add-edit-address.component';
import { MatDialog } from '@angular/material/dialog';
import { ProductService } from 'src/app/services/product/product.service';

@Component({
  selector: 'app-create-so',
  templateUrl: './create-so.component.html',
  styleUrls: ['./create-so.component.css'],
})
export class CreateSOComponent implements OnInit, OnDestroy {
  isLoading = false;
  orderForm: FormGroup;

  productStores: any[] = [];
  facilities: any[] = [];
  filteredParties: any[] = [];
  filteredCustomers$: Observable<any[]> = of([]);
  filteredProducts: Observable<any[]>[] = [];
  customerAddresses: any[] = [];
  destroy$ = new Subject<void>();
  itemTypes = [
    { id: 'PRODUCT_ORDER_ITEM', label: 'Product' },
    { id: 'WORK_ORDER_ITEM', label: 'Work' },
    { id: 'RENTAL_ORDER_ITEM', label: 'Rental' },
    { id: 'BULK_ORDER_ITEM', label: 'Bulk' },
  ];

  constructor(
    private fb: FormBuilder,
    private orderService: OrderService,
    private router: Router,
    private partyService: PartyService,
    private snackbarService: SnackbarService,
    private dialog: MatDialog,
    private productService: ProductService
  ) {
    this.orderForm = this.fb.group({
      orderTypeEnumId: ['SALES_ORDER'],
      productStoreId: ['', Validators.required],
      vendorPartyId: ['', Validators.required],
      facilityId: ['', Validators.required],
      customerPartyId: ['', Validators.required],
      shipBeforeDate: [''],
      estimatedDeliveryDate: [''],
      shippingAddress: [null],
      items: this.fb.array([this.buildItemGroup()]),
    });
  }

  ngOnInit(): void {
    this.fetchData();
    this.initProductAutocomplete(0);

    // Live customer autocomplete
    this.filteredCustomers$ = this.orderForm.get('customerPartyId')!.valueChanges.pipe(
      startWith(''),
      debounceTime(300),
      distinctUntilChanged(),
      switchMap((value: string | any) =>
        typeof value === 'string'
          ? this.getCustomersFromService(value)
          : this.getCustomersFromService(value?.name ?? '')
      ),
      takeUntil(this.destroy$)
    );
  }

  displayCustomer(customer: any): string {
    return customer && customer.name ? customer.name : '';
  }

  fetchData(): void {
    this.orderService.getProductStores().subscribe({
      next: (res) => {
        this.productStores = Array.isArray(res) ? res : [res];
      },
    });

    this.orderService.getFacilities().subscribe({
      next: (data) => {
        this.facilities = Array.isArray(data) ? data : [data];
      },
    });

    this.getVendorParties('');
  }

  getCustomersFromService(value: string): Observable<any[]> {
    return this.partyService.getCustomers(0, value).pipe(
      map((res) => res?.resultList || []),
      catchError(() => of([]))
    );
  }

  onCustomerSelected(event: MatAutocompleteSelectedEvent) {
    const partyId = event.option.value;
    this.orderForm.get('customerPartyId')?.setValue(partyId);
    if (partyId) {
      this.loadCustomerAddresses(partyId);
    } else {
      this.customerAddresses = [];
      this.orderForm.get('shippingAddress')?.setValue(null);
    }
  }

  onProductSelected(event: MatAutocompleteSelectedEvent, index: number): void {
    const productId = event.option.value;
    if (!productId) {
      return;
    }
    const productControl = this.items.at(index)?.get('productId');
    if (productControl) {
      productControl.setValue(productId);
    }
    this.applyProductPrice(index, productId);
  }


  getVendorParties(productStoreId: string): void {
    this.orderService.getVendorParties(productStoreId).subscribe({
      next: (data) => {
        this.filteredParties = data;
        // Optionally auto-select the first vendor
        if (this.filteredParties.length > 0) {
          this.orderForm.get('vendorPartyId')?.setValue(this.filteredParties[0].value);
        }
      },
    });
  }

  updateVendorParty(): void {
    const selectedStoreId = this.orderForm.get('productStoreId')?.value;
    this.getVendorParties(selectedStoreId);
  }

  get items(): FormArray {
    return this.orderForm.get('items') as FormArray;
  }

  addItemRow(): void {
    this.items.push(this.buildItemGroup());
    this.initProductAutocomplete(this.items.length - 1);
  }

  removeItemRow(index: number): void {
    if (this.items.length > 1) {
      this.items.removeAt(index);
      this.filteredProducts.splice(index, 1);
    }
  }

  createOrder(): void {
    if (this.orderForm.invalid) return;
    if (this.items.length === 0) {
      this.snackbarService.showError('Add at least one item.');
      return;
    }
    this.isLoading = true;
    const values = this.orderForm.value;
    const shippingAddress = this.buildOrderAddress(values.shippingAddress);
    const payload = {
      ...values,
      shippingAddress,
    };

    this.orderService
      .createOrder(payload)
      .subscribe({
        next: (data) => {
          if (data?.orderId) {
            this.addOrderItems(data.orderId);
          } else {
            this.isLoading = false;
            this.snackbarService.showError('Failed to create sales order.');
          }
        },
        error: () => {
          this.isLoading = false;
          this.snackbarService.showError('Error creating sales order.');
        },
      });
  }

  loadCustomerAddresses(partyId: string): void {
    const primary$ = this.partyService.getPartyPostalContactMechByPurpose(partyId, 'PRIMARY_LOCATION', 'customer');
    const shipping$ = this.partyService.getPartyPostalContactMechByPurpose(partyId, 'SHIPPING_LOCATION', 'customer');

    forkJoin({ primary: primary$, shipping: shipping$ }).subscribe({
      next: ({ primary, shipping }: { primary: any; shipping: any }) => {
        const primaryList = Array.isArray(primary) ? primary : [];
        const shippingList = Array.isArray(shipping) ? shipping : [];
        const addresses = ([] as any[]).concat(primaryList, shippingList);
        const unique = new Map(addresses.map((address: any) => [address.contactMechId, address]));
        this.customerAddresses = Array.from(unique.values());
        const current = this.orderForm.get('shippingAddress')?.value;
        if (!current && this.customerAddresses.length) {
          this.orderForm.get('shippingAddress')?.setValue(this.customerAddresses[0]);
        }
      },
      error: () => {
        this.customerAddresses = [];
      },
    });
  }

  addCustomerAddress(): void {
    const partyId = this.orderForm.get('customerPartyId')?.value;
    if (!partyId) {
      return;
    }
    const addressData = {
      partyId,
      contactMechPurposeId: 'SHIPPING_LOCATION',
      defaultPurpose: 'SHIPPING_LOCATION',
    };

    this.dialog.open(AddEditAddressComponent, {
      data: { addressData },
    }).afterClosed().subscribe(() => {
      this.loadCustomerAddresses(partyId);
    });
  }

  formatAddress(address: any): string {
    if (!address) {
      return '';
    }
    const parts = [address.toName, address.address1, address.address2, address.city, address.stateProvinceGeoId, address.postalCode]
      .filter((part) => !!part);
    return parts.join(', ');
  }

  private buildOrderAddress(address: any): any | null {
    if (!address) {
      return null;
    }
    return {
      contactMechId: address.contactMechId,
      contactMechPurposeTypeId: 'SHIPPING_LOCATION',
      toName: address.toName,
      address1: address.address1,
      address2: address.address2,
      city: address.city,
      postalCode: address.postalCode,
      countryGeoId: address.countryGeoId,
      stateProvinceGeoId: address.stateProvinceGeoId,
    };
  }

  private buildItemGroup(): FormGroup {
    return this.fb.group({
      productId: ['', Validators.required],
      quantity: [1, Validators.required],
      unitAmount: [0, Validators.required],
      itemTypeEnumId: ['PRODUCT_ORDER_ITEM', Validators.required],
    });
  }

  private initProductAutocomplete(index: number): void {
    const control = this.items.at(index)?.get('productId');
    if (!control) {
      return;
    }
    this.filteredProducts[index] = control.valueChanges.pipe(
      startWith(''),
      debounceTime(300),
      distinctUntilChanged(),
      switchMap((value) =>
        this.productService.getProducts(0, typeof value === 'string' ? value : value?.productId ?? '').pipe(
          map((response: any) => response?.documentList || []),
          catchError(() => of([]))
        )
      ),
      takeUntil(this.destroy$)
    );
  }

  private applyProductPrice(index: number, productId: string): void {
    const unitAmountControl = this.items.at(index)?.get('unitAmount');
    if (!unitAmountControl) {
      return;
    }

    this.productService.getProduct(productId).subscribe({
      next: (response: any) => {
        const prices = Array.isArray(response?.prices) ? response.prices : [];
        const preferred =
          prices.find((price: any) => price?.productPriceTypeId === 'DEFAULT_PRICE') ||
          prices.find((price: any) => price?.productPriceTypeId === 'LIST_PRICE') ||
          prices[0];
        const priceValue = preferred?.price;
        const numeric = priceValue != null ? Number(priceValue) : NaN;
        if (!Number.isNaN(numeric)) {
          unitAmountControl.setValue(numeric);
        }
      },
    });
  }

  private addOrderItems(orderId: string): void {
    from(this.items.controls)
      .pipe(
        concatMap((control) => {
          const value = control.value;
          const productId = value?.productId?.productId ?? value.productId;
          return this.orderService.addItem({
            orderId,
            orderPartSeqId: '00001',
            productId,
            quantity: value.quantity,
            unitAmount: value.unitAmount,
            itemTypeEnumId: value.itemTypeEnumId,
          });
        }),
        toArray(),
        finalize(() => (this.isLoading = false))
      )
      .subscribe({
        next: () => {
          this.snackbarService.showSuccess('Sales order created successfully.');
          this.orderForm.reset();
          this.items.clear();
          this.items.push(this.buildItemGroup());
          this.filteredProducts = [];
          this.initProductAutocomplete(0);
          this.router.navigate([`/orders/${orderId}`]);
        },
        error: () => {
          this.snackbarService.showError('Sales order created, but items failed.');
          this.router.navigate([`/orders/${orderId}`]);
        },
      });
  }

  ngOnDestroy(): void {
    this.destroy$.next();
    this.destroy$.complete();
  }
}
