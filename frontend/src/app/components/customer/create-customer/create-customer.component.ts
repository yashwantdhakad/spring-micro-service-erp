import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Store, select } from '@ngrx/store';
import { filterGeoRecords } from 'src/app/helpers/geo-type-helper';
import { PartyService } from 'src/app/services/party/party.service';
import { loadGeos } from 'src/app/store/geo/geo.actions';
import { selectGeoList } from 'src/app/store/geo/geo.selector';
import { GeoState } from 'src/app/store/geo/geo.state';
import { SnackbarService } from 'src/app/services/common/snackbar.service';
import { finalize } from 'rxjs/operators';
import { TranslateService } from '@ngx-translate/core';

@Component({
  selector: 'app-create-customer',
  templateUrl: './create-customer.component.html',
  styleUrls: ['./create-customer.component.css'],
})
export class CreateCustomerComponent implements OnInit {
  isLoading: boolean = false;
  createCustomerForm: FormGroup;
  states: any[] = [];
  filteredStates: any[] = [];
  countries: any[] = [];

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
      roleTypeId: ['Customer'],
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
    this.store.pipe(select(selectGeoList)).subscribe((geoListObject: any) => {
      console.log('geoListObject', geoListObject);

      if (geoListObject) {
        this.countries = filterGeoRecords(geoListObject, 'COUNTRY');
        this.states = filterGeoRecords(geoListObject, 'STATE');
        this.filteredStates = this.filterStates(this.states, 'USA');
        console.log('this.countries', this.countries);
        console.log('this.filteredStates', this.filteredStates);
        console.log('this.states', this.states);
      }
    });

    this.createCustomerForm.get('countryGeoId')?.valueChanges.subscribe(() => {
      if (this.states) {
        this.filteredStates = this.filterStatesByCountry(this.states);
      }
      this.createCustomerForm.get('stateProvinceGeoId')?.setValue('');
    });
  }

  filterStatesByCountry(states: any[]): any[] {
    const selectedCountryGeoId =
      this.createCustomerForm.get('countryGeoId')?.value || 'USA';
      console.log(selectedCountryGeoId)
    return states.filter((state: any) =>
      state.country_geo_id === (`${selectedCountryGeoId}`)
    );
  }

  filterStates(states: any[], countryGeoId: string): any[] {
    return states.filter((state: any) =>
      state.country_geo_id === (`${countryGeoId}`)
    );
  }

  createCustomer(): void {
    if (this.createCustomerForm.valid) {
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
            console.log(data);
            if (data?.party_id) {
              this.snackbarService.showSuccess(
                this.translate.instant('CUSTOMER.CREATED_SUCCESS')
              );
              this.router.navigate([`/customers/${data.party_id}`]);
              this.createCustomerForm.reset();
            } else {
              this.snackbarService.showError(
                this.translate.instant('CUSTOMER.FAILED_CREATE')
              );
            }
          },
          error: (error) => {
            this.snackbarService.showError(
              this.translate.instant('CUSTOMER.ERROR_CREATE')
            );
          },
        });
    }
  }
}
