import { ComponentFixture, TestBed, fakeAsync, tick } from '@angular/core/testing';
import { ReactiveFormsModule } from '@angular/forms';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';
import { MatSnackBar } from '@angular/material/snack-bar';
import { of, throwError } from 'rxjs';
import { AddEditBankAccountComponent } from './add-edit-bank-account.component';
import { PartyService } from 'src/app/services/party/party.service';

describe('AddEditBankAccountComponent', () => {
  let component: AddEditBankAccountComponent;
  let fixture: ComponentFixture<AddEditBankAccountComponent>;
  let partyService: jasmine.SpyObj<PartyService>;
  let dialogRef: jasmine.SpyObj<MatDialogRef<AddEditBankAccountComponent>>;
  let snackBar: jasmine.SpyObj<MatSnackBar>;

  const dialogData = {
    bankAccountData: {
      partyId: 'PARTY123',
      paymentMethodId: null,
      postalContactMechId: null,
      description: 'Test Account',
      firstNameOnAccount: 'John',
      lastNameOnAccount: 'Doe',
      companyNameOnAccount: '',
      routingNumber: '111000025',
      bankName: 'Bank of Test',
      accountNumber: '1234567890',
      toName: 'John Doe',
      address1: '123 Test St',
      address2: '',
      city: 'Testville',
      postalCode: '12345',
      countryGeoId: 'USA',
      stateProvinceGeoId: 'USA_CA',
      countries: [{ geoId: 'USA', geoName: 'United States' }],
      states: [
        { geoId: 'USA_CA', geoName: 'California' },
        { geoId: 'USA_TX', geoName: 'Texas' },
        { geoId: 'CAN_ON', geoName: 'Ontario' }
      ]
    }
  };

  beforeEach(async () => {
    const partyServiceSpy = jasmine.createSpyObj('PartyService', ['createUpdatePaymentMethod']);
    const dialogRefSpy = jasmine.createSpyObj('MatDialogRef', ['close']);
    const snackBarSpy = jasmine.createSpyObj('MatSnackBar', ['open']);

    await TestBed.configureTestingModule({
      declarations: [AddEditBankAccountComponent],
      imports: [ReactiveFormsModule],
      providers: [
        { provide: PartyService, useValue: partyServiceSpy },
        { provide: MatSnackBar, useValue: snackBarSpy },
        { provide: MatDialogRef, useValue: dialogRefSpy },
        { provide: MAT_DIALOG_DATA, useValue: dialogData }
      ]
    }).compileComponents();

    partyService = TestBed.inject(PartyService) as jasmine.SpyObj<PartyService>;
    dialogRef = TestBed.inject(MatDialogRef) as jasmine.SpyObj<MatDialogRef<AddEditBankAccountComponent>>;
    snackBar = TestBed.inject(MatSnackBar) as jasmine.SpyObj<MatSnackBar>;
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AddEditBankAccountComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create the component', () => {
    expect(component).toBeTruthy();
  });

  it('should initialize the form with provided bankAccountData', () => {
    const form = component.addEditBankAccountForm;
    expect(form.get('firstNameOnAccount')?.value).toBe('John');
    expect(form.get('bankName')?.value).toBe('Bank of Test');
    expect(form.get('countryGeoId')?.value).toBe('USA');
  });

  it('should filter states by selected country', () => {
    const filtered = component.filterStatesByCountry(dialogData.bankAccountData.states);
    expect(filtered.length).toBe(2);
    expect(filtered[0].geoId).toBe('USA_CA');
  });

  it('should call createUpdatePaymentMethod and close dialog on success', fakeAsync(() => {
    const formValues = component.addEditBankAccountForm.value;
    partyService.createUpdatePaymentMethod.and.returnValue(of({}));

    component.addEditBankAccount();
    tick();

    expect(partyService.createUpdatePaymentMethod).toHaveBeenCalledWith(formValues);
    expect(snackBar.open).toHaveBeenCalledWith(
      'Bank account information saved successfully',
      'Close',
      { duration: 3000 }
    );
    expect(dialogRef.close).toHaveBeenCalledWith(formValues);
  }));

  it('should handle error on createUpdatePaymentMethod failure', fakeAsync(() => {
    const formValues = component.addEditBankAccountForm.value;
    partyService.createUpdatePaymentMethod.and.returnValue(throwError(() => new Error('API failure')));

    component.addEditBankAccount();
    tick();

    expect(snackBar.open).toHaveBeenCalledWith(
      'Error in saving bank account information',
      'Close',
      { duration: 3000 }
    );
  }));

  it('should reset stateProvinceGeoId when countryGeoId changes', fakeAsync(() => {
    component.addEditBankAccountForm.get('countryGeoId')?.setValue('USA');
    tick();
    expect(component.addEditBankAccountForm.get('stateProvinceGeoId')?.value).toBe('');
    expect(component.states.length).toBeGreaterThan(0);
  }));
});
