import { ComponentFixture, TestBed, fakeAsync, tick } from '@angular/core/testing';
import { AddIdentificationComponent } from './add-identification.component';
import { ReactiveFormsModule } from '@angular/forms';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { MatSnackBarModule, MatSnackBar } from '@angular/material/snack-bar';
import { TranslateModule } from '@ngx-translate/core';
import { of, throwError } from 'rxjs';
import { CommonService } from 'src/app/services/common/common.service';
import { PartyService } from 'src/app/services/party/party.service';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

describe('AddIdentificationComponent', () => {
  let component: AddIdentificationComponent;
  let fixture: ComponentFixture<AddIdentificationComponent>;
  let partyServiceSpy: jasmine.SpyObj<PartyService>;
  let commonServiceSpy: jasmine.SpyObj<CommonService>;
  let dialogRefSpy: jasmine.SpyObj<MatDialogRef<AddIdentificationComponent>>;
  let snackBar: MatSnackBar;

  const mockDialogData = {
    identificationData: {
      partyId: 'PARTY_123',
      partyIdTypeEnumId: '',
      idValue: 'ABC123'
    }
  };

  beforeEach(async () => {
    partyServiceSpy = jasmine.createSpyObj('PartyService', ['addIdentification']);
    commonServiceSpy = jasmine.createSpyObj('CommonService', ['getEnumTypes']);
    dialogRefSpy = jasmine.createSpyObj('MatDialogRef', ['close']);

    await TestBed.configureTestingModule({
      declarations: [AddIdentificationComponent],
      imports: [
        ReactiveFormsModule,
        MatSnackBarModule,
        TranslateModule.forRoot(),
        BrowserAnimationsModule
      ],
      providers: [
        { provide: PartyService, useValue: partyServiceSpy },
        { provide: CommonService, useValue: commonServiceSpy },
        { provide: MAT_DIALOG_DATA, useValue: mockDialogData },
        { provide: MatDialogRef, useValue: dialogRefSpy }
      ]
    }).compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AddIdentificationComponent);
    component = fixture.componentInstance;
    snackBar = TestBed.inject(MatSnackBar);
    fixture.detectChanges();
  });

  it('should create the component', () => {
    expect(component).toBeTruthy();
  });

  it('should initialize form with provided data', () => {
    expect(component.addIdentificationForm.value.partyId).toBe('PARTY_123');
    expect(component.addIdentificationForm.value.idValue).toBe('ABC123');
  });

  it('should call getEnumTypes on init', () => {
    const enumTypes = [{ enumId: 'PtidPan', description: 'PAN' }];
    commonServiceSpy.getEnumTypes.and.returnValue(of(enumTypes));
    component.getEnumTypes();
    expect(commonServiceSpy.getEnumTypes).toHaveBeenCalledWith('PartyIdType');
  });

  it('should submit form and call addIdentification', fakeAsync(() => {
    const formValues = component.addIdentificationForm.value;
    partyServiceSpy.addIdentification.and.returnValue(of({}));

    component.addUpdateIdentification();
    tick();

    expect(partyServiceSpy.addIdentification).toHaveBeenCalledWith(formValues);
    expect(dialogRefSpy.close).toHaveBeenCalledWith(formValues);
  }));

  it('should show error message if addIdentification fails', fakeAsync(() => {
    spyOn(snackBar, 'open');
    partyServiceSpy.addIdentification.and.returnValue(throwError(() => new Error('API Error')));

    component.addUpdateIdentification();
    tick();

    expect(snackBar.open).toHaveBeenCalled();
  }));

  it('should not submit if form is invalid', () => {
    component.addIdentificationForm.get('idValue')?.setValue('');
    component.addUpdateIdentification();

    expect(partyServiceSpy.addIdentification).not.toHaveBeenCalled();
  });
});
