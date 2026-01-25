import { Component, Inject, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';
import { forkJoin, of } from 'rxjs';
import { finalize } from 'rxjs/operators';
import { PartyService } from 'src/app/services/party/party.service';
import { CommonService } from 'src/app/services/common/common.service';

@Component({
  selector: 'app-add-edit-address',
  templateUrl: './add-edit-address.component.html',
  styleUrls: ['./add-edit-address.component.css'],
})
export class AddEditAddressComponent implements OnInit {
  addEditAddressForm: FormGroup = new FormGroup({});
  isLoading = false;
  states: any[] = [];
  countries: any[] = [];

  constructor(
    private partyService: PartyService,
    private commonService: CommonService,
    public dialogRef: MatDialogRef<AddEditAddressComponent>,
    @Inject(MAT_DIALOG_DATA) public data: { addressData: any },
    private fb: FormBuilder
  ) { }

  ngOnInit(): void {
    this.initializeForm();
    this.loadGeoOptions();
  }

  initializeForm(): void {
    const address = this.data.addressData;
    const required = Validators.required;
    console.log('address', address);

    this.addEditAddressForm = this.fb.group({
      partyId: [address.partyId],
      contactMechId: [address.contactMechId],
      contactMechPurposeId: [address.contactMechPurposeId || 'SHIP_ORIG_LOCATION'],
      toName: [address.toName, [required]],
      address1: [address.address1, [required]],
      address2: [address.address2],
      city: [address.city, [required]],
      postalCode: [address.postalCode, [required]],
      countryGeoId: [address.countryGeoId || 'USA', [required]],
      stateProvinceGeoId: [address.stateProvinceGeoId || 'UT', [required]],
    });

    this.addEditAddressForm.get('countryGeoId')?.valueChanges.subscribe((countryGeoId) => {
      this.states = this.filterStatesByCountry(this.data.addressData.states);
      this.addEditAddressForm.get('stateProvinceGeoId')?.setValue('');
    });
  }

  filterStatesByCountry(states: any[] = []): any[] {
    if (!Array.isArray(states)) {
      return [];
    }
    const selectedCountry = this.addEditAddressForm.get('countryGeoId')?.value || 'USA';
    return states.filter((state) => {
      const countryId = state.country_geo_id ?? state.countryGeoId;
      return !countryId || countryId === `${selectedCountry}`;
    });
  }

  private loadGeoOptions(): void {
    const providedCountries = this.data.addressData.countries || [];
    const providedStates = this.data.addressData.states || [];
    const countries$ = providedCountries.length
      ? of(providedCountries)
      : this.commonService.getLookupResults({ field: 'geo_type_id', value: 'COUNTRY' }, 'geo');
    const states$ = providedStates.length
      ? of(providedStates)
      : this.commonService.getLookupResults({ field: 'geo_type_id', value: 'STATE' }, 'geo');

    forkJoin({ countries: countries$, states: states$ }).subscribe({
      next: ({ countries, states }) => {
        this.countries = countries || [];
        this.states = this.filterStatesByCountry(states || []);
      },
    });
  }

  addEditAddress(): void {
    if (this.addEditAddressForm.invalid) return;

    this.isLoading = true;
    const v = this.addEditAddressForm.value;
    console.log("v", v);

    // Build payload in snake_case (match FastAPI/Pydantic)
    const payload = {
      toName: v.toName ?? null,
      address1: v.address1,
      address2: v.address2 ?? null,
      city: v.city,
      postalCode: v.postalCode ?? null,
      countryGeoId: v.countryGeoId ?? null,
      stateProvinceGeoId: v.stateProvinceGeoId ?? null,
      contactMechPurposeId: v.contactMechPurposeId ?? null
    };

    // Choose API call: create vs update
    const call$ = v.contactMechId
      ? this.partyService.updatePostalAddress(v.partyId, v.contactMechId, payload)
      : this.partyService.addPostalAddress(v.partyId, payload);

    call$
      .pipe(finalize(() => (this.isLoading = false)))
      .subscribe({
        next: (res) => {
          this.addEditAddressForm.reset();
          this.dialogRef.close(res ?? v);  // return latest info
        },
        error: (err) => {
          console.error('Error saving address:', err);
          // show snackbar if you have one
        },
      });
  }

}
