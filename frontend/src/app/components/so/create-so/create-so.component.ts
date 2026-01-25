import { Component, OnInit, OnDestroy } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Observable, of, Subject, forkJoin } from 'rxjs';
import {
  debounceTime,
  distinctUntilChanged,
  switchMap,
  takeUntil,
  map,
  catchError,
  startWith,
  finalize,
} from 'rxjs/operators';
import { MatAutocompleteSelectedEvent } from '@angular/material/autocomplete';
import { OrderService } from 'src/app/services/order/order.service';
import { PartyService } from 'src/app/services/party/party.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';
import { AddEditAddressComponent } from 'src/app/components/party/add-edit-address/add-edit-address.component';
import { MatDialog } from '@angular/material/dialog';

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
  customerAddresses: any[] = [];
  destroy$ = new Subject<void>();

  constructor(
    private fb: FormBuilder,
    private orderService: OrderService,
    private router: Router,
    private partyService: PartyService,
    private snackbarService: SnackbarService,
    private dialog: MatDialog
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
    });
  }

  ngOnInit(): void {
    this.fetchData();

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

  createOrder(): void {
    if (this.orderForm.invalid) return;
    this.isLoading = true;
    const values = this.orderForm.value;
    const shippingAddress = this.buildOrderAddress(values.shippingAddress);
    const payload = {
      ...values,
      shippingAddress,
    };

    this.orderService
      .createOrder(payload)
      .pipe(finalize(() => (this.isLoading = false)))
      .subscribe({
        next: (data) => {
          if (data?.orderId) {
            this.snackbarService.showSuccess('Sales order created successfully.');
            this.router.navigate([`/orders/${data.orderId}`]);
          } else {
            this.snackbarService.showError('Failed to create sales order.');
          }
          this.orderForm.reset();
        },
        error: () => {
          this.snackbarService.showError('Error creating sales order.');
        },
      });
  }

  loadCustomerAddresses(partyId: string): void {
    const primary$ = this.partyService.getPartyPostalContactMechByPurpose(partyId, 'PRIMARY_LOCATION', 'customer');
    const shipping$ = this.partyService.getPartyPostalContactMechByPurpose(partyId, 'SHIPPING_LOCATION', 'customer');

    forkJoin({ primary: primary$, shipping: shipping$ }).subscribe({
      next: ({ primary, shipping }) => {
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
      contactMechPurposeTypeId: address.contactMechPurposeId || 'SHIPPING_LOCATION',
      toName: address.toName,
      address1: address.address1,
      address2: address.address2,
      city: address.city,
      postalCode: address.postalCode,
      countryGeoId: address.countryGeoId,
      stateProvinceGeoId: address.stateProvinceGeoId,
    };
  }

  ngOnDestroy(): void {
    this.destroy$.next();
    this.destroy$.complete();
  }
}
