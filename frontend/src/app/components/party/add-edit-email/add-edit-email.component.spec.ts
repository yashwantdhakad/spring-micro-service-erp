import { ComponentFixture, TestBed, fakeAsync, tick } from '@angular/core/testing';
import { AddEditEmailComponent } from './add-edit-email.component';
import { ReactiveFormsModule } from '@angular/forms';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';
import { MatSnackBarModule, MatSnackBar } from '@angular/material/snack-bar';
import { TranslateModule, TranslateService } from '@ngx-translate/core';
import { of, throwError } from 'rxjs';
import { PartyService } from 'src/app/services/party/party.service';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

describe('AddEditEmailComponent', () => {
  let component: AddEditEmailComponent;
  let fixture: ComponentFixture<AddEditEmailComponent>;
  let partyServiceSpy: jasmine.SpyObj<PartyService>;
  let dialogRefSpy: jasmine.SpyObj<MatDialogRef<AddEditEmailComponent>>;
  let snackBar: MatSnackBar;

  const mockDialogData = {
    addEditEmailData: {
      partyId: 'PARTY_001',
      contactMechId: 'CM001',
      contactMechPurposeId: 'PRIMARY_EMAIL',
      emailAddress: 'test@example.com',
    },
  };

  beforeEach(async () => {
    partyServiceSpy = jasmine.createSpyObj('PartyService', ['addEmail']);
    dialogRefSpy = jasmine.createSpyObj('MatDialogRef', ['close']);

    await TestBed.configureTestingModule({
      declarations: [AddEditEmailComponent],
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
    fixture = TestBed.createComponent(AddEditEmailComponent);
    component = fixture.componentInstance;
    snackBar = TestBed.inject(MatSnackBar);
    fixture.detectChanges();
  });

  it('should create the component', () => {
    expect(component).toBeTruthy();
  });

  it('should initialize form with injected data', () => {
    expect(component.addEditEmailForm.get('emailAddress')?.value).toBe('test@example.com');
    expect(component.addEditEmailForm.get('partyId')?.value).toBe('PARTY_001');
  });

  it('should call partyService.addEmail on valid form submission', fakeAsync(() => {
    const values = component.addEditEmailForm.value;
    partyServiceSpy.addEmail.and.returnValue(of({}));

    component.addEditEmail();
    tick();

    expect(partyServiceSpy.addEmail).toHaveBeenCalledWith(values);
    expect(dialogRefSpy.close).toHaveBeenCalledWith(values);
  }));

  it('should not call addEmail when form is invalid', () => {
    component.addEditEmailForm.patchValue({ emailAddress: '' }); // make invalid
    component.addEditEmail();

    expect(partyServiceSpy.addEmail).not.toHaveBeenCalled();
    expect(dialogRefSpy.close).not.toHaveBeenCalled();
  });

  it('should show error message when addEmail fails', fakeAsync(() => {
    partyServiceSpy.addEmail.and.returnValue(throwError(() => new Error('Service error')));

    spyOn(snackBar, 'open');

    component.addEditEmail();
    tick();

    expect(partyServiceSpy.addEmail).toHaveBeenCalled();
    expect(snackBar.open).toHaveBeenCalled();
  }));
});
