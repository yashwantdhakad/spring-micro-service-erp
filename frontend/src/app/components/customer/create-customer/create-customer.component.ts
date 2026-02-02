import { Component, OnDestroy, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Store, select } from '@ngrx/store';
import { filterGeoRecords } from 'src/app/helpers/geo-type-helper';
import { PartyService } from 'src/app/services/party/party.service';
import { loadGeos } from 'src/app/store/geo/geo.actions';
import { selectGeoList } from 'src/app/store/geo/geo.selector';
import { GeoState } from 'src/app/store/geo/geo.state';
import { SnackbarService } from 'src/app/services/common/snackbar.service';
import { Subject } from 'rxjs';
import { finalize, takeUntil } from 'rxjs/operators';
import { TranslateService } from '@ngx-translate/core';

@Component({
  standalone: false,
  selector: 'app-create-customer',
  templateUrl: './create-customer.component.html',
  styleUrls: ['./create-customer.component.css'],
})
export class CreateCustomerComponent implements OnInit, OnDestroy {
  isLoading: boolean = false;
  createCustomerForm: FormGroup;
  states: any[] = [];
  filteredStates: any[] = [];
  countries: any[] = [];
  private destroy$ = new Subject<void>();

  constructor(
    private fb: FormBuilder,
    private partyService: PartyService,
    private router: Router,
    private store: Store<GeoState>,
    private snackbarService: SnackbarService,
    private translate: TranslateService
  ) {
    const requiredValidator = Validators.required;

    this.createCustomerForm = this.fb.group({
      firstName: ['', Validators.required],
      lastName: ['', Validators.required],
      emailAddress: ['', [Validators.required, Validators.email]],
      contactNumber: ['', [Validators.required, Validators.minLength(10)]],
      roleTypeId: ['CUSTOMER'],
      address1: ['', [requiredValidator]],
      address2: [''],
      city: ['', [requiredValidator]],
      postalCode: ['', [requiredValidator]],
      countryGeoId: ['USA', [requiredValidator]],
      stateProvinceGeoId: ['UT', [requiredValidator]],
    });
  }

  ngOnInit(): void {
    this.store.dispatch(loadGeos());
    this.store.pipe(select(selectGeoList), takeUntil(this.destroy$)).subscribe((geoListObject: any) => {
      if (geoListObject) {
        this.countries = filterGeoRecords(geoListObject, 'COUNTRY');
        this.states = filterGeoRecords(geoListObject, 'STATE');
        this.filteredStates = this.filterStatesByCountry(this.states);
      }
    });

    this.createCustomerForm.get('countryGeoId')?.valueChanges
      .pipe(takeUntil(this.destroy$))
      .subscribe(() => {
        this.filteredStates = this.filterStatesByCountry(this.states);
      this.createCustomerForm.get('stateProvinceGeoId')?.setValue('');
      });
  }

  ngOnDestroy(): void {
    this.destroy$.next();
    this.destroy$.complete();
  }

  filterStatesByCountry(states: any[] = []): any[] {
    const selectedCountryGeoId =
      this.createCustomerForm.get('countryGeoId')?.value || 'USA';
    return states.filter((state: any) => {
      const countryId = state.country_geo_id ?? state.countryGeoId;
      return !countryId || countryId === `${selectedCountryGeoId}`;
    });
  }

  createCustomer(): void {
    if (this.createCustomerForm.invalid) {
      this.createCustomerForm.markAllAsTouched();
      return;
    }
    this.isLoading = true;
    const values = this.createCustomerForm.value;
    const payload = {
      ...values,
      toName: `${values.firstName} ${values.lastName}`.trim(),
    };

    this.partyService
      .createCustomer(payload)
      .pipe(finalize(() => (this.isLoading = false)))
      .subscribe({
        next: (data) => {
          if (data?.partyId) {
            this.snackbarService.showSuccess(
              this.translate.instant('CUSTOMER.CREATED_SUCCESS')
            );
            this.router.navigate([`/customers/${data.partyId}`]);
            this.createCustomerForm.reset({
              roleTypeId: 'CUSTOMER',
              countryGeoId: 'USA',
              stateProvinceGeoId: 'UT',
            });
          } else {
            this.snackbarService.showError(
              this.translate.instant('CUSTOMER.FAILED_CREATE')
            );
          }
        },
        error: () => {
          this.snackbarService.showError(
            this.translate.instant('CUSTOMER.ERROR_CREATE')
          );
        },
      });
  }
}
