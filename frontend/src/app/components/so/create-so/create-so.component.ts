import { Component, OnInit, OnDestroy } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Observable, of, Subject } from 'rxjs';
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
  destroy$ = new Subject<void>();

  constructor(
    private fb: FormBuilder,
    private orderService: OrderService,
    private router: Router,
    private partyService: PartyService,
    private snackbarService: SnackbarService
  ) {
    this.orderForm = this.fb.group({
      orderTypeEnumId: ['SALES_ORDER'],
      productStoreId: ['', Validators.required],
      vendorPartyId: ['', Validators.required],
      facilityId: ['', Validators.required],
      customerPartyId: ['', Validators.required],
      shipBeforeDate: [''],
      estimatedDeliveryDate: [''],
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
        this.productStores = Array.isArray(res?.resultList)
          ? res.resultList
          : [res.resultList];
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
    this.orderForm.get('customerPartyId')?.setValue(event.option.value);
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

    this.orderService
      .createOrder(values)
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

  ngOnDestroy(): void {
    this.destroy$.next();
    this.destroy$.complete();
  }
}
