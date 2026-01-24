import { Component, OnInit } from '@angular/core';
import {
  FormBuilder,
  FormGroup,
  Validators,
} from '@angular/forms';
import { Router } from '@angular/router';
import { Observable, of } from 'rxjs';
import {
  startWith,
  switchMap,
  map,
  debounceTime,
  distinctUntilChanged,
  catchError,
  finalize,
} from 'rxjs/operators';
import { OrderService } from 'src/app/services/order/order.service';
import { PartyService } from 'src/app/services/party/party.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';
import { MatAutocompleteSelectedEvent } from '@angular/material/autocomplete';

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

  constructor(
    private formBuilder: FormBuilder,
    private orderService: OrderService,
    private router: Router,
    private partyService: PartyService,
    private snackbarService: SnackbarService
  ) {
    const validators = Validators.required;

    this.poForm = this.formBuilder.group({
      orderTypeEnumId: ['PURCHASE_ORDER'],
      customerPartyId: ['', validators],
      facilityId: ['', validators],
      shipBeforeDate: ['', validators],
      estimatedDeliveryDate: [''],
      vendorPartyId: ['', validators], // This is the control we’ll use for autocomplete!
    });
  }

  ngOnInit(): void {
    this.getFacilities();
    this.getCustomerParties();

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

  createPO(): void {
    if (!this.poForm.valid) return;

    this.isLoading = true;
    const values = this.poForm.value;

    this.orderService
      .createOrder(values)
      .pipe(finalize(() => (this.isLoading = false)))
      .subscribe({
        next: (data) => {
          if (!data || !data.orderId) {
            this.snackbarService.showError('Failed to create a purchase order.');
            return;
          }
          this.poForm.reset();
          this.router.navigate([`/pos/${data.orderId}`]);
          this.snackbarService.showSuccess('Purchase order created successfully.');
        },
        error: () => {
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
      },
      error: (error) => {
      },
    });
  }
}
