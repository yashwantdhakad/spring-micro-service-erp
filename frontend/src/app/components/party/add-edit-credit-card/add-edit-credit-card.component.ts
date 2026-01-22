import { Component, Inject, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';
import { MatSnackBar } from '@angular/material/snack-bar';
import { finalize } from 'rxjs/operators';
import { CommonService } from 'src/app/services/common/common.service';
import { PartyService } from 'src/app/services/party/party.service';

@Component({
  selector: 'app-add-edit-credit-card',
  templateUrl: './add-edit-credit-card.component.html',
  styleUrls: ['./add-edit-credit-card.component.css'],
})
export class AddEditCreditCardComponent implements OnInit {
  addEditCreditCardForm: FormGroup = new FormGroup({});
  isLoading = false;
  states: any[] = [];
  countries: any[] = [];
  enumTypes: any[] = [];
  paymentGatewayConfigs: any[] = [];
  months: number[] = Array.from({ length: 12 }, (_, i) => i + 1);
  years: number[] = Array.from({ length: 10 }, (_, i) => new Date().getFullYear() + i);

  constructor(
    private commonService: CommonService,
    private partyService: PartyService,
    public dialogRef: MatDialogRef<AddEditCreditCardComponent>,
    @Inject(MAT_DIALOG_DATA) public data: { creditCardData: any },
    private fb: FormBuilder,
    private snackBar: MatSnackBar
  ) {}

  ngOnInit(): void {
    const { creditCardData } = this.data;
    this.countries = creditCardData.countries || [];
    this.states = this.filterStatesByCountry(creditCardData.states || []);

    this.getEnumTypes();
    this.getPaymentGatewayConfig();
    this.initializeForm();
  }

  initializeForm(): void {
    const d = this.data.creditCardData;
    const required = Validators.required;

    this.addEditCreditCardForm = this.fb.group({
      partyId: [d.partyId],
      paymentMethodId: [d.paymentMethodId],
      paymentMethodTypeEnumId: [d.paymentMethodTypeEnumId || 'PmtCreditCard'],
      postalContactMechId: [d.postalContactMechId],
      description: [d.description],
      firstNameOnAccount: [d.firstNameOnAccount, [required]],
      lastNameOnAccount: [d.lastNameOnAccount, [required]],
      companyNameOnAccount: [d.companyNameOnAccount],
      creditCardTypeEnumId: [d.creditCardTypeEnumId || 'CctAmericanExpress', [required]],
      cardNumber: [d.cardNumber, [required]],
      validateSecurityCode: [d.validateSecurityCode],
      expireMonth: [d.expireMonth, [required]],
      expireYear: [d.expireYear, [required]],
      paymentGatewayConfigId: [d.paymentGatewayConfigId],
      toName: [d.toName, [required]],
      address1: [d.address1, [required]],
      address2: [d.address2],
      city: [d.city, [required]],
      postalCode: [d.postalCode, [required]],
      countryGeoId: [d.countryGeoId || 'USA', [required]],
      stateProvinceGeoId: [d.stateProvinceGeoId || '', [required]],
    });

    this.addEditCreditCardForm.get('countryGeoId')?.valueChanges.subscribe(() => {
      this.states = this.filterStatesByCountry(this.data.creditCardData.states || []);
      this.addEditCreditCardForm.get('stateProvinceGeoId')?.setValue('');
    });
  }

  getEnumTypes(): void {
    this.commonService.getEnumTypes('CreditCardType').subscribe({
      next: (data) => {
        this.enumTypes = Array.isArray(data) ? data : [data];
      },
      error: (err) => {
      },
    });
  }

  getPaymentGatewayConfig(): void {
    this.partyService.getPaymentGatewayConfig().subscribe({
      next: (data) => {
        this.paymentGatewayConfigs = Array.isArray(data) ? data : [data];
      },
      error: (err) => {
      },
    });
  }

  filterStatesByCountry(states: any[]): any[] {
    const selectedCountry = this.addEditCreditCardForm.get('countryGeoId')?.value || 'USA';
    return states.filter((state: any) => state.geoId.startsWith(`${selectedCountry}_`));
  }

  addEditCreditCard(): void {
    if (this.addEditCreditCardForm.valid) {
      this.isLoading = true;
      const values = this.addEditCreditCardForm.value;

      this.partyService.createUpdatePaymentMethod(values)
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
