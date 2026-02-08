import { Component, Inject, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';
import { MatSnackBar } from '@angular/material/snack-bar';
import { finalize } from 'rxjs/operators';
import { PartyService } from 'src/app/services/oms/party/party.service';

@Component({
  standalone: false,
  selector: 'app-add-edit-bank-account',
  templateUrl: './add-edit-bank-account.component.html',
  styleUrls: ['./add-edit-bank-account.component.css'],
})
export class AddEditBankAccountComponent implements OnInit {
  addEditBankAccountForm: FormGroup = new FormGroup({});
  isLoading = false;
  states: any[] = [];
  countries: any[] = [];

  constructor(
    private partyService: PartyService,
    public dialogRef: MatDialogRef<AddEditBankAccountComponent>,
    @Inject(MAT_DIALOG_DATA) public data: { bankAccountData: any },
    private fb: FormBuilder,
    private snackBar: MatSnackBar
  ) {}

  ngOnInit(): void {
    const { bankAccountData } = this.data;
    this.countries = bankAccountData.countries || [];
    this.states = this.filterStatesByCountry(bankAccountData.states || []);
    this.initializeForm();
  }

  initializeForm(): void {
    const d = this.data.bankAccountData;
    const required = Validators.required;

    this.addEditBankAccountForm = this.fb.group({
      partyId: [d.partyId],
      paymentMethodId: [d.paymentMethodId],
      paymentMethodTypeEnumId: [d.paymentMethodTypeEnumId || 'PmtBankAccount'],
      postalContactMechId: [d.postalContactMechId],
      description: [d.description],
      firstNameOnAccount: [d.firstNameOnAccount, [required]],
      lastNameOnAccount: [d.lastNameOnAccount, [required]],
      companyNameOnAccount: [d.companyNameOnAccount],
      routingNumber: [d.routingNumber],
      bankName: [d.bankName, [required]],
      accountNumber: [d.accountNumber, [required]],
      toName: [d.toName, [required]],
      address1: [d.address1, [required]],
      address2: [d.address2],
      city: [d.city, [required]],
      postalCode: [d.postalCode, [required]],
      countryGeoId: [d.countryGeoId || 'USA', [required]],
      stateProvinceGeoId: [d.stateProvinceGeoId || '', [required]],
    });

    this.addEditBankAccountForm.get('countryGeoId')?.valueChanges.subscribe(() => {
      this.states = this.filterStatesByCountry(this.data.bankAccountData.states || []);
      this.addEditBankAccountForm.get('stateProvinceGeoId')?.setValue('');
    });
  }

  filterStatesByCountry(states: any[]): any[] {
    const selectedCountry = this.addEditBankAccountForm.get('countryGeoId')?.value || 'USA';
    return states.filter((state: any) => state.geoId.startsWith(`${selectedCountry}_`));
  }

  addEditBankAccount(): void {
    if (this.addEditBankAccountForm.valid) {
      this.isLoading = true;
      const values = this.addEditBankAccountForm.value;

      this.partyService.createUpdatePaymentMethod(values)
        .pipe(finalize(() => (this.isLoading = false)))
        .subscribe({
          next: () => {
            this.snackBar.open('Bank account information saved successfully', 'Close', {
              duration: 3000,
            });
            this.addEditBankAccountForm.reset();
            this.dialogRef.close(values);
          },
          error: (error) => {
            this.snackBar.open('Error in saving bank account information', 'Close', {
              duration: 3000,
            });
          },
        });
    }
  }
}
