import { ComponentFixture, TestBed, fakeAsync, tick } from '@angular/core/testing';
import { AddEditCreditCardComponent } from './add-edit-credit-card.component';
import { ReactiveFormsModule } from '@angular/forms';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';
import { MatSnackBarModule } from '@angular/material/snack-bar';
import { of, throwError } from 'rxjs';
import { CommonService } from 'src/app/services/common/common.service';
import { PartyService } from 'src/app/services/party/party.service';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

describe('AddEditCreditCardComponent', () => {
  let component: AddEditCreditCardComponent;
  let fixture: ComponentFixture<AddEditCreditCardComponent>;
  let partyServiceSpy: jasmine.SpyObj<PartyService>;
  let commonServiceSpy: jasmine.SpyObj<CommonService>;
  let dialogRefSpy: jasmine.SpyObj<MatDialogRef<AddEditCreditCardComponent>>;

  const mockData = {
    creditCardData: {
      partyId: 'PARTY_001',
      paymentMethodId: '',
      firstNameOnAccount: 'John',
      lastNameOnAccount: 'Doe',
      cardNumber: '4111111111111111',
      expireMonth: 12,
      expireYear: 2030,
      creditCardTypeEnumId: 'CctVisa',
      countryGeoId: 'USA',
      stateProvinceGeoId: 'USA_CA',
      address1: '123 Test St',
      city: 'Testville',
      postalCode: '12345',
      toName: 'John Doe',
      countries: [{ geoId: 'USA', geoName: 'United States' }],
      states: [{ geoId: 'USA_CA', geoName: 'California' }],
    }
  };

  beforeEach(async () => {
    partyServiceSpy = jasmine.createSpyObj('PartyService', [
      'createUpdatePaymentMethod',
      'getPaymentGatewayConfig',
    ]);
    commonServiceSpy = jasmine.createSpyObj('CommonService', ['getEnumTypes']);
    dialogRefSpy = jasmine.createSpyObj('MatDialogRef', ['close']);

    await TestBed.configureTestingModule({
      declarations: [AddEditCreditCardComponent],
      imports: [ReactiveFormsModule, MatSnackBarModule, BrowserAnimationsModule],
      providers: [
        { provide: PartyService, useValue: partyServiceSpy },
        { provide: CommonService, useValue: commonServiceSpy },
        { provide: MAT_DIALOG_DATA, useValue: mockData },
        { provide: MatDialogRef, useValue: dialogRefSpy },
      ],
    }).compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AddEditCreditCardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create component', () => {
    expect(component).toBeTruthy();
  });

  it('should initialize form with provided credit card data', () => {
    const form = component.addEditCreditCardForm;
    expect(form.get('firstNameOnAccount')?.value).toBe('John');
    expect(form.get('lastNameOnAccount')?.value).toBe('Doe');
    expect(component.states.length).toBeGreaterThan(0);
  });

  it('should call PartyService.createUpdatePaymentMethod on valid form submission', fakeAsync(() => {
    const form = component.addEditCreditCardForm;
    partyServiceSpy.createUpdatePaymentMethod.and.returnValue(of({}));

    form.markAllAsTouched();
    component.addEditCreditCard();

    tick();
    expect(partyServiceSpy.createUpdatePaymentMethod).toHaveBeenCalled();
    expect(dialogRefSpy.close).toHaveBeenCalled();
  }));

  it('should not submit form if invalid', () => {
    component.addEditCreditCardForm.patchValue({ firstNameOnAccount: '' }); // Make form invalid
    component.addEditCreditCard();

    expect(partyServiceSpy.createUpdatePaymentMethod).not.toHaveBeenCalled();
  });

  it('should show error if service fails', fakeAsync(() => {
    const form = component.addEditCreditCardForm;
    partyServiceSpy.createUpdatePaymentMethod.and.returnValue(
      throwError(() => new Error('error'))
    );

    form.markAllAsTouched();
    component.addEditCreditCard();

    tick();
    expect(partyServiceSpy.createUpdatePaymentMethod).toHaveBeenCalled();
    expect(dialogRefSpy.close).not.toHaveBeenCalled();
  }));
});
