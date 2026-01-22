import { ComponentFixture, TestBed, fakeAsync, tick } from '@angular/core/testing';
import { EditSupplierComponent } from './edit-supplier.component';
import { ReactiveFormsModule } from '@angular/forms';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';
import { PartyService } from 'src/app/services/party/party.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';
import { TranslateService } from '@ngx-translate/core';
import { of, throwError } from 'rxjs';

describe('EditSupplierComponent', () => {
  let component: EditSupplierComponent;
  let fixture: ComponentFixture<EditSupplierComponent>;
  let partyServiceSpy: jasmine.SpyObj<PartyService>;
  let snackbarServiceSpy: jasmine.SpyObj<SnackbarService>;
  let translateSpy: jasmine.SpyObj<TranslateService>;
  let dialogRefSpy: jasmine.SpyObj<MatDialogRef<EditSupplierComponent>>;

  beforeEach(async () => {
    partyServiceSpy = jasmine.createSpyObj('PartyService', ['updatePartyDetail']);
    snackbarServiceSpy = jasmine.createSpyObj('SnackbarService', ['showSuccess', 'showError']);
    translateSpy = jasmine.createSpyObj('TranslateService', ['instant']);
    dialogRefSpy = jasmine.createSpyObj('MatDialogRef', ['close']);

    await TestBed.configureTestingModule({
      declarations: [EditSupplierComponent],
      imports: [ReactiveFormsModule],
      providers: [
        { provide: PartyService, useValue: partyServiceSpy },
        { provide: SnackbarService, useValue: snackbarServiceSpy },
        { provide: TranslateService, useValue: translateSpy },
        { provide: MatDialogRef, useValue: dialogRefSpy },
        {
          provide: MAT_DIALOG_DATA,
          useValue: {
            supplierDetail: {
              partyId: 'SUPP-1001',
              organizationName: 'Supplier Inc.'
            }
          },
        },
      ],
    }).compileComponents();

    fixture = TestBed.createComponent(EditSupplierComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create component', () => {
    expect(component).toBeTruthy();
  });

  it('should call updatePartyDetail and close dialog on success', fakeAsync(() => {
    translateSpy.instant.and.callFake((key) => key);
    partyServiceSpy.updatePartyDetail.and.returnValue(of({}));

    component.updateSupplierForm.setValue({
      partyId: 'SUPP-1001',
      organizationName: 'Updated Supplier'
    });

    component.updateSupplier();
    tick();

    expect(partyServiceSpy.updatePartyDetail).toHaveBeenCalledWith(component.updateSupplierForm.value);
    expect(snackbarServiceSpy.showSuccess).toHaveBeenCalledWith('SUPPLIER.UPDATED_SUCCESS');
    expect(dialogRefSpy.close).toHaveBeenCalledWith(component.updateSupplierForm.value);
    expect(component.isLoading).toBeFalse();
  }));

  it('should handle error if API call fails', fakeAsync(() => {
    const consoleSpy = spyOn(console, 'error');
    translateSpy.instant.and.callFake((key) => key);
    partyServiceSpy.updatePartyDetail.and.returnValue(throwError(() => new Error('API Error')));

    component.updateSupplierForm.setValue({
      partyId: 'SUPP-1001',
      organizationName: 'Updated Supplier'
    });

    component.updateSupplier();
    tick();

    expect(consoleSpy).toHaveBeenCalledWith('Error in update supplier:', jasmine.any(Error));
    expect(snackbarServiceSpy.showError).toHaveBeenCalledWith('SUPPLIER.ERROR_UPDATE');
    expect(component.isLoading).toBeFalse();
  }));

  it('should not submit if form is invalid', () => {
    component.updateSupplierForm.setValue({
      partyId: 'SUPP-1001',
      organizationName: ''
    });

    component.updateSupplier();

    expect(partyServiceSpy.updatePartyDetail).not.toHaveBeenCalled();
    expect(dialogRefSpy.close).not.toHaveBeenCalled();
  });
});
