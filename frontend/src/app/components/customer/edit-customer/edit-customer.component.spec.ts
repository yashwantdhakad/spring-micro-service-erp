import { ComponentFixture, TestBed } from '@angular/core/testing';
import { EditCustomerComponent } from './edit-customer.component';
import { FormBuilder, ReactiveFormsModule } from '@angular/forms';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { PartyService } from 'src/app/services/oms/party/party.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';
import { TranslateModule, TranslateService } from '@ngx-translate/core';
import { of, throwError } from 'rxjs';

describe('EditCustomerComponent', () => {
  let component: EditCustomerComponent;
  let fixture: ComponentFixture<EditCustomerComponent>;
  let partyServiceSpy: jasmine.SpyObj<PartyService>;
  let snackbarSpy: jasmine.SpyObj<SnackbarService>;
  let dialogRefSpy: jasmine.SpyObj<MatDialogRef<EditCustomerComponent>>;

  const dialogData = {
    customerDetail: {
      partyId: 'PARTY_1',
      firstName: 'John',
      lastName: 'Doe'
    }
  };

  beforeEach(async () => {
    partyServiceSpy = jasmine.createSpyObj('PartyService', ['updateCustomer']);
    snackbarSpy = jasmine.createSpyObj('SnackbarService', ['showSuccess', 'showError']);
    dialogRefSpy = jasmine.createSpyObj('MatDialogRef', ['close']);

    await TestBed.configureTestingModule({
      imports: [ReactiveFormsModule, TranslateModule.forRoot()],
      declarations: [EditCustomerComponent],
      providers: [
        FormBuilder,
        { provide: PartyService, useValue: partyServiceSpy },
        { provide: SnackbarService, useValue: snackbarSpy },
        { provide: MatDialogRef, useValue: dialogRefSpy },
        { provide: MAT_DIALOG_DATA, useValue: dialogData }
      ]
    }).compileComponents();

    fixture = TestBed.createComponent(EditCustomerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create the component and initialize form', () => {
    expect(component).toBeTruthy();
    expect(component.updateCustomerForm.value.firstName).toBe('John');
    expect(component.updateCustomerForm.valid).toBeTrue();
  });

  it('should call updateCustomer and close dialog on success', () => {
    partyServiceSpy.updateCustomer.and.returnValue(of({}));

    component.updateCustomer();

    expect(component.isLoading).toBeTrue();
    expect(partyServiceSpy.updateCustomer).toHaveBeenCalledWith({
      partyId: 'PARTY_1',
      firstName: 'John',
      lastName: 'Doe'
    });
    expect(dialogRefSpy.close).toHaveBeenCalled();
    expect(snackbarSpy.showSuccess).toHaveBeenCalled();
  });

  it('should show error message on update failure', () => {
    partyServiceSpy.updateCustomer.and.returnValue(throwError(() => new Error('Failed')));

    component.updateCustomer();

    expect(partyServiceSpy.updateCustomer).toHaveBeenCalled();
    expect(snackbarSpy.showError).toHaveBeenCalled();
  });

  it('should not call service if form is invalid', () => {
    component.updateCustomerForm.controls['firstName'].setValue('');
    component.updateCustomerForm.controls['lastName'].setValue('');
    
    component.updateCustomer();

    expect(partyServiceSpy.updateCustomer).not.toHaveBeenCalled();
  });
});
