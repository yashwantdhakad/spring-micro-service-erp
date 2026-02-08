import { Component, Inject, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';
import { MatSnackBar } from '@angular/material/snack-bar';
import { forkJoin, of } from 'rxjs';
import { finalize } from 'rxjs/operators';
import { CommonService } from 'src/app/services/common/common.service';
import { PartyService } from 'src/app/services/oms/party/party.service';

@Component({
  standalone: false,
  selector: 'app-add-edit-credit-card',
  templateUrl: './add-edit-credit-card.component.html',
  styleUrls: ['./add-edit-credit-card.component.css'],
})
export class AddEditCreditCardComponent implements OnInit {
  addEditCreditCardForm: FormGroup = new FormGroup({});
  isLoading = false;
  states: any[] = [];
  countries: any[] = [];
  allStates: any[] = [];
  enumTypes: any[] = [];
  existingAddresses: any[] = [];
  months: number[] = Array.from({ length: 12 }, (_, i) => i + 1);
  years: number[] = Array.from({ length: 10 }, (_, i) => new Date().getFullYear() + i);

  constructor(
    private commonService: CommonService,
    private partyService: PartyService,
    public dialogRef: MatDialogRef<AddEditCreditCardComponent>,
    @Inject(MAT_DIALOG_DATA) public data: { creditCardData: any },
    private fb: FormBuilder,
    private snackBar: MatSnackBar
  ) { }

  ngOnInit(): void {
    const { creditCardData } = this.data;
    this.existingAddresses = Array.isArray(creditCardData.postalAddressList)
      ? creditCardData.postalAddressList
      : [];

    this.initializeForm();
    this.loadGeoOptions();

    this.getEnumerations();
  }

  initializeForm(): void {
    const d = this.data.creditCardData;
    const required = Validators.required;
    const shouldCreateNewAddress = this.existingAddresses.length === 0;
    const defaultAddressId = d.postalContactMechId || this.getDefaultAddressId();

    this.addEditCreditCardForm = this.fb.group({
      partyId: [d.partyId],
      paymentMethodId: [d.paymentMethodId],
      paymentMethodTypeEnumId: [d.paymentMethodTypeEnumId || 'PmtCreditCard'],
      postalContactMechId: [d.postalContactMechId],
      roleTypeId: [d.roleTypeId || 'CUSTOMER'],
      description: [d.description],
      firstNameOnAccount: [d.firstNameOnAccount, [required]],
      lastNameOnAccount: [d.lastNameOnAccount, [required]],
      companyNameOnAccount: [d.companyNameOnAccount],
      creditCardTypeEnumId: [d.creditCardTypeEnumId, [required]], // Removed default 'CctAmericanExpress' to force selection
      cardNumber: [d.cardNumber, [required]],
      validateSecurityCode: [d.validateSecurityCode],
      expireMonth: [d.expireMonth, [required]],
      expireYear: [d.expireYear, [required]],
      toName: [d.toName, [required]],
      address1: [d.address1, [required]],
      address2: [d.address2],
      city: [d.city, [required]],
      postalCode: [d.postalCode, [required]],
      countryGeoId: [d.countryGeoId || 'USA', [required]],
      stateProvinceGeoId: [d.stateProvinceGeoId || 'UT', [required]],
      createNewAddress: [shouldCreateNewAddress],
      existingAddressId: [defaultAddressId],
      copyFromAddressId: [''],
    });

    this.addEditCreditCardForm.get('countryGeoId')?.valueChanges.subscribe(() => {
      this.states = this.filterStatesByCountry(this.allStates);
      this.addEditCreditCardForm.get('stateProvinceGeoId')?.setValue('');
    });

    this.addEditCreditCardForm.get('createNewAddress')?.valueChanges.subscribe((useNewAddress) => {
      if (useNewAddress) {
        this.addEditCreditCardForm.get('postalContactMechId')?.setValue('');
        this.applyAddressValidators(true);
        if (!this.addEditCreditCardForm.get('countryGeoId')?.value) {
          this.addEditCreditCardForm.get('countryGeoId')?.setValue('USA');
        }
      } else {
        this.applyAddressValidators(false);
        const selectedId = this.addEditCreditCardForm.get('existingAddressId')?.value;
        this.addEditCreditCardForm.get('postalContactMechId')?.setValue(selectedId || '');
        this.clearAddressFields();
      }
    });

    this.addEditCreditCardForm.get('existingAddressId')?.valueChanges.subscribe((contactMechId) => {
      if (!this.addEditCreditCardForm.get('createNewAddress')?.value) {
        this.addEditCreditCardForm.get('postalContactMechId')?.setValue(contactMechId || '');
      }
    });

    this.addEditCreditCardForm.get('copyFromAddressId')?.valueChanges.subscribe((contactMechId) => {
      if (!contactMechId) return;
      const address = this.findAddressById(contactMechId);
      if (address) {
        this.applyAddressFromExisting(address);
      }
    });

    if (shouldCreateNewAddress) {
      this.applyAddressValidators(true);
    } else {
      this.applyAddressValidators(false);
      this.addEditCreditCardForm.get('postalContactMechId')?.setValue(defaultAddressId || '');
      this.clearAddressFields();
    }
  }

  getEnumerations(): void {
    this.partyService.getEnumerations('CREDIT_CARD_TYPE').subscribe({
      next: (data) => {
        this.enumTypes = Array.isArray(data) ? data : [data];
      },
      error: (err) => {
        // Handle error if needed
      },
    });
  }

  filterStatesByCountry(states: any[] = []): any[] {
    if (!Array.isArray(states)) {
      return [];
    }
    const selectedCountry = this.addEditCreditCardForm.get('countryGeoId')?.value || 'USA';
    return states.filter((state: any) => {
      const countryId = state.country_geo_id ?? state.countryGeoId;
      if (countryId) {
        return countryId === selectedCountry;
      }
      const geoId = state.geoId ?? '';
      return typeof geoId === 'string' && geoId.startsWith(`${selectedCountry}_`);
    });
  }

  getAddressLabel(address: any): string {
    if (!address) return '';
    const purpose = address.contactMechPurposeId ? `${address.contactMechPurposeId}: ` : '';
    const parts = [
      address.address1,
      address.address2,
      address.city,
      address.stateProvinceGeoId,
      address.postalCode,
      address.countryGeoId,
    ].filter(Boolean);
    return `${parts.join(', ')}`;
  }

  private getDefaultAddressId(): string {
    const primary = this.existingAddresses.find(
      (address) => address?.contactMechPurposeId === 'PRIMARY_LOCATION'
    );
    return (primary || this.existingAddresses[0] || {}).contactMechId || '';
  }

  private findAddressById(contactMechId: string): any | undefined {
    return this.existingAddresses.find((address) => address?.contactMechId === contactMechId);
  }

  private applyAddressFromExisting(address: any): void {
    this.addEditCreditCardForm.patchValue({
      toName: address.toName || '',
      address1: address.address1 || '',
      address2: address.address2 || '',
      city: address.city || '',
      postalCode: address.postalCode || '',
    });

    if (address.countryGeoId) {
      this.addEditCreditCardForm.get('countryGeoId')?.setValue(address.countryGeoId);
      this.states = this.filterStatesByCountry(this.allStates);
    }

    if (address.stateProvinceGeoId) {
      this.addEditCreditCardForm.get('stateProvinceGeoId')?.setValue(address.stateProvinceGeoId);
    }
  }

  private applyAddressValidators(useNewAddress: boolean): void {
    const required = Validators.required;
    const fields = ['toName', 'address1', 'city', 'postalCode', 'countryGeoId', 'stateProvinceGeoId'];

    fields.forEach((field) => {
      const control = this.addEditCreditCardForm.get(field);
      if (!control) return;
      if (useNewAddress) {
        control.addValidators(required);
      } else {
        control.removeValidators(required);
      }
      control.updateValueAndValidity();
    });
  }

  private clearAddressFields(): void {
    this.addEditCreditCardForm.patchValue({
      toName: '',
      address1: '',
      address2: '',
      city: '',
      postalCode: '',
      countryGeoId: 'USA',
      stateProvinceGeoId: '',
      copyFromAddressId: '',
    });
  }

  private loadGeoOptions(): void {
    const providedCountries = this.data.creditCardData.countries || [];
    const providedStates = this.data.creditCardData.states || [];
    const countries$ = providedCountries.length
      ? of(providedCountries)
      : this.commonService.getLookupResults({ field: 'geo_type_id', value: 'COUNTRY' }, 'geo');
    const states$ = providedStates.length
      ? of(providedStates)
      : this.commonService.getLookupResults({ field: 'geo_type_id', value: 'STATE' }, 'geo');

    forkJoin({ countries: countries$, states: states$ }).subscribe({
      next: ({ countries, states }) => {
        this.countries = countries || [];
        this.allStates = states || [];
        this.states = this.filterStatesByCountry(this.allStates);
      },
    });
  }

  addEditCreditCard(): void {
    if (this.addEditCreditCardForm.valid) {
      this.isLoading = true;
      const values = { ...this.addEditCreditCardForm.value };
      const createNewAddress = !!values.createNewAddress;
      const expireMonth = String(values.expireMonth || '').padStart(2, '0');
      const expireYear = values.expireYear ? String(values.expireYear) : '';

      const payload = {
        cardType: values.creditCardTypeEnumId,
        cardNumber: values.cardNumber,
        expireDate: expireMonth && expireYear ? `${expireMonth}/${expireYear}` : null,
        firstNameOnCard: values.firstNameOnAccount,
        lastNameOnCard: values.lastNameOnAccount,
        postalAddressId: createNewAddress ? null : values.postalContactMechId,
        address1: createNewAddress ? values.address1 : null,
        address2: createNewAddress ? values.address2 : null,
        city: createNewAddress ? values.city : null,
        postalCode: createNewAddress ? values.postalCode : null,
        countryGeoId: createNewAddress ? values.countryGeoId : null,
        stateProvinceGeoId: createNewAddress ? values.stateProvinceGeoId : null,
        roleTypeId: values.roleTypeId,
      };

      this.partyService.createCreditCard(values.partyId, payload)
        .pipe(finalize(() => (this.isLoading = false)))
        .subscribe({
          next: () => {
            this.snackBar.open('Credit card information saved successfully', 'Close', {
              duration: 3000,
            });
            this.addEditCreditCardForm.reset();
            this.dialogRef.close(values);
          },
          error: (error) => {
            this.snackBar.open('Error in saving credit card information', 'Close', {
              duration: 3000,
            });
          },
        });
    }
  }
}
