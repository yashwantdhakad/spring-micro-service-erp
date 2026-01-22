import { ComponentFixture, TestBed, fakeAsync, tick } from '@angular/core/testing';
import { AddEditPhoneComponent } from './add-edit-phone.component';
import { ReactiveFormsModule } from '@angular/forms';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';
import { MatSnackBarModule, MatSnackBar } from '@angular/material/snack-bar';
import { TranslateModule, TranslateService } from '@ngx-translate/core';
import { of, throwError } from 'rxjs';
import { PartyService } from 'src/app/services/party/party.service';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

describe('AddEditPhoneComponent', () => {
  let component: AddEditPhoneComponent;
  let fixture: ComponentFixture<AddEditPhoneComponent>;
  let partyServiceSpy: jasmine.SpyObj<PartyService>;
  let dialogRefSpy: jasmine.SpyObj<MatDialogRef<AddEditPhoneComponent>>;
  let snackBar: MatSnackBar;

  const mockDialogData = {
    addEditPhoneData: {
      partyId: 'PARTY_001',
      telecomContactMechId: null,
      telecomContactMechPurposeId: 'PhonePrimary',
      contactNumber: '1234567890',
      areaCode: '022',
      countryCode: '+91',
    },
  };

  beforeEach(async () => {
    partyServiceSpy = jasmine.createSpyObj('PartyService', ['addPhone', 'updatePhoneNumber']);
    dialogRefSpy = jasmine.createSpyObj('MatDialogRef', ['close']);

    await TestBed.configureTestingModule({
      declarations: [AddEditPhoneComponent],
      imports: [
        ReactiveFormsModule,
        MatSnackBarModule,
        TranslateModule.forRoot(),
        BrowserAnimationsModule,
      ],
      providers: [
        { provide: PartyService, useValue: partyServiceSpy },
        { provide: MAT_DIALOG_DATA, useValue: mockDialogData },
        { provide: MatDialogRef, useValue: dialogRefSpy },
      ],
    }).compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AddEditPhoneComponent);
    component = fixture.componentInstance;
    snackBar = TestBed.inject(MatSnackBar);
    fixture.detectChanges();
  });

  it('should create the component', () => {
    expect(component).toBeTruthy();
  });

  it('should initialize form with provided dialog data', () => {
    expect(component.addEditPhoneForm.get('contactNumber')?.value).toBe('1234567890');
    expect(component.addEditPhoneForm.valid).toBeTrue();
  });

  it('should call partyService.addPhone when telecomContactMechId is null', fakeAsync(() => {
    const values = component.addEditPhoneForm.value;
    partyServiceSpy.addPhone.and.returnValue(of({}));

    component.addEditPhone();
    tick();

    expect(partyServiceSpy.addPhone).toHaveBeenCalledWith(values);
    expect(dialogRefSpy.close).toHaveBeenCalledWith(values);
  }));

  it('should call partyService.updatePhoneNumber when telecomContactMechId is provided', fakeAsync(() => {
    component.addEditPhoneForm.patchValue({ telecomContactMechId: 'TCM123' });
    const values = component.addEditPhoneForm.value;
    partyServiceSpy.updatePhoneNumber.and.returnValue(of({}));

    component.addEditPhone();
    tick();

    expect(partyServiceSpy.updatePhoneNumber).toHaveBeenCalledWith(values);
    expect(dialogRefSpy.close).toHaveBeenCalledWith(values);
  }));

  it('should show error snackbar on service error', fakeAsync(() => {
    spyOn(snackBar, 'open');
    partyServiceSpy.addPhone.and.returnValue(throwError(() => new Error('Error')));

    component.addEditPhone();
    tick();

    expect(snackBar.open).toHaveBeenCalled();
  }));

  it('should not submit if form is invalid', () => {
    component.addEditPhoneForm.patchValue({ contactNumber: 'invalid' });
    expect(component.addEditPhoneForm.valid).toBeFalse();

    component.addEditPhone();

    expect(partyServiceSpy.addPhone).not.toHaveBeenCalled();
  });
});
