import { Component, OnInit } from '@angular/core';
import {
  FormArray,
  FormBuilder,
  FormGroup,
  Validators,
} from '@angular/forms';
import { Router } from '@angular/router';
import { Observable, of, from } from 'rxjs';
import {
  startWith,
  switchMap,
  map,
  debounceTime,
  distinctUntilChanged,
  catchError,
  finalize,
  concatMap,
  toArray,
} from 'rxjs/operators';
import { OrderService } from 'src/app/services/order/order.service';
import { PartyService } from 'src/app/services/party/party.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';
import { MatAutocompleteSelectedEvent } from '@angular/material/autocomplete';
import { ProductService } from 'src/app/services/product/product.service';
import { SupplierProductService } from 'src/app/services/supplier-product/supplier-product.service';

@Component({
  selector: 'app-create-po',
  templateUrl: './create-po.component.html',
  styleUrls: ['./create-po.component.css'],
})
export class CreatePOComponent implements OnInit {
  isLoading = false;
  poForm: FormGroup;
  customerParties: any[] = [];
  facilities: any[] = [];
  filteredSuppliers$: Observable<any[]> = of([]);
  filteredProducts: Observable<any[]>[] = [];
  itemTypes = [
    { id: 'INVENTORY_ORDER_ITEM', label: 'Inventory' },
    { id: 'SUPPLIES_ORDER_ITEM', label: 'Supplies' },
    { id: 'ASSET_ORDER_ITEM', label: 'Asset' },
  ];

  constructor(
    private formBuilder: FormBuilder,
    private orderService: OrderService,
    private router: Router,
    private partyService: PartyService,
    private snackbarService: SnackbarService,
    private productService: ProductService,
    private supplierProductService: SupplierProductService
  ) {
    const validators = Validators.required;

    this.poForm = this.formBuilder.group({
      orderTypeEnumId: ['PURCHASE_ORDER'],
      customerPartyId: ['', validators],
      facilityId: ['', validators],
      shipBeforeDate: ['', validators],
      estimatedDeliveryDate: [''],
      vendorPartyId: ['', validators], // This is the control we’ll use for autocomplete!
      items: this.formBuilder.array([this.buildItemGroup()]),
    });
  }

  ngOnInit(): void {
    this.getFacilities();
    this.getCustomerParties();
    this.initProductAutocomplete(0);

    // Autocomplete supplier using the vendorPartyId control
    this.filteredSuppliers$ = this.poForm.get('vendorPartyId')!.valueChanges.pipe(
      startWith(''),
      debounceTime(300),
      distinctUntilChanged(),
      switchMap((value) =>
        typeof value === 'string'
          ? this.partyService.getSuppliers(0, value).pipe(
              map((response: any) => response.resultList || []),
              catchError(() => of([]))
            )
          : of([])
      )
    );
  }

  displaySupplier(supplier?: any): string {
    return supplier ? supplier.name || supplier.partyId : '';
  }

  onSupplierSelected(event: MatAutocompleteSelectedEvent) {
    const supplier: any = event.option.value;
    // If value is an object, set the partyId; if just string, keep as is
    this.poForm.get('vendorPartyId')?.setValue(supplier.partyId || supplier);
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
    this.applySupplierPrice(index, productId);
  }

  get items(): FormArray {
    return this.poForm.get('items') as FormArray;
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

  createPO(): void {
    if (!this.poForm.valid) return;
    if (this.items.length === 0) {
      this.snackbarService.showError('Add at least one item.');
      return;
    }

    this.isLoading = true;
    const values = this.poForm.value;

    this.orderService
      .createOrder(values)
      .subscribe({
        next: (data) => {
          if (!data || !data.orderId) {
            this.isLoading = false;
            this.snackbarService.showError('Failed to create a purchase order.');
            return;
          }
          this.addOrderItems(data.orderId);
        },
        error: () => {
          this.isLoading = false;
          this.snackbarService.showError('Error in creating purchase order');
        },
      });
  }

  getFacilities(): void {
    this.orderService.getFacilities().subscribe({
      next: (data) => {
        this.facilities = Array.isArray(data) ? data : [data];
      },
      error: (error) => {
      },
    });
  }

  getCustomerParties(): void {
    this.orderService.getCustomerParties().subscribe({
      next: (data) => {
        this.customerParties = Array.isArray(data) ? data : [data];
        if (this.customerParties.length && !this.poForm.get('customerPartyId')?.value) {
          const first = this.customerParties[0];
          this.poForm.get('customerPartyId')?.setValue(first.value ?? first.partyId ?? first);
        }
      },
      error: (error) => {
      },
    });
  }

  private buildItemGroup(): FormGroup {
    return this.formBuilder.group({
      productId: ['', Validators.required],
      quantity: [1, Validators.required],
      unitAmount: [0, Validators.required],
      itemTypeEnumId: ['INVENTORY_ORDER_ITEM', Validators.required],
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
      )
    );
  }

  private applySupplierPrice(index: number, productId: string): void {
    const vendorPartyId = this.poForm.get('vendorPartyId')?.value;
    const unitAmountControl = this.items.at(index)?.get('unitAmount');
    if (!vendorPartyId || !unitAmountControl) {
      return;
    }

    this.supplierProductService.getLatestByPartyAndProduct(vendorPartyId, productId).subscribe({
      next: (supplierProduct: any) => {
        const priceValue = supplierProduct?.lastPrice;
        const numeric = priceValue != null ? Number(priceValue) : NaN;
        if (!Number.isNaN(numeric)) {
          unitAmountControl.setValue(numeric);
        }
      },
      error: () => {
      },
    });
  }

  private addOrderItems(orderId: string): void {
    this.items.length
      ? from(this.items.controls)
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
              this.poForm.reset();
              this.items.clear();
              this.items.push(this.buildItemGroup());
              this.filteredProducts = [];
              this.initProductAutocomplete(0);
              this.router.navigate([`/pos/${orderId}`]);
              this.snackbarService.showSuccess('Purchase order created successfully.');
            },
            error: () => {
              this.snackbarService.showError('Purchase order created, but items failed.');
              this.router.navigate([`/pos/${orderId}`]);
            },
          })
      : this.router.navigate([`/pos/${orderId}`]);
  }
}
