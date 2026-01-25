import { ComponentFixture, TestBed, fakeAsync, tick } from '@angular/core/testing';
import { CreateSupplierComponent } from './create-supplier.component';
import { ReactiveFormsModule } from '@angular/forms';
import { PartyService } from 'src/app/services/party/party.service';
import { Router } from '@angular/router';
import { of, throwError } from 'rxjs';
import { SnackbarService } from 'src/app/services/common/snackbar.service';
import { TranslateService } from '@ngx-translate/core';

describe('CreateSupplierComponent', () => {
  let component: CreateSupplierComponent;
  let fixture: ComponentFixture<CreateSupplierComponent>;
  let mockPartyService: jasmine.SpyObj<PartyService>;
  let mockRouter: jasmine.SpyObj<Router>;
  let snackbarServiceSpy: jasmine.SpyObj<SnackbarService>;
  let translateServiceSpy: jasmine.SpyObj<TranslateService>;

  beforeEach(async () => {
    mockPartyService = jasmine.createSpyObj('PartyService', ['createSupplier']);
    mockRouter = jasmine.createSpyObj('Router', ['navigate']);
    snackbarServiceSpy = jasmine.createSpyObj('SnackbarService', ['showSuccess', 'showError']);
    translateServiceSpy = jasmine.createSpyObj('TranslateService', ['instant']);

    await TestBed.configureTestingModule({
      declarations: [CreateSupplierComponent],
      imports: [ReactiveFormsModule],
      providers: [
        { provide: PartyService, useValue: mockPartyService },
        { provide: Router, useValue: mockRouter },
        { provide: SnackbarService, useValue: snackbarServiceSpy },
        { provide: TranslateService, useValue: translateServiceSpy },
      ]
    }).compileComponents();

    fixture = TestBed.createComponent(CreateSupplierComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create component', () => {
    expect(component).toBeTruthy();
  });

  it('should call partyService.createSupplier and navigate on success', fakeAsync(() => {
    const supplierData = {
      partyId: 'SUPP1001'
    };

    translateServiceSpy.instant.and.returnValue('SUPPLIER.CREATED_SUCCESS');
    mockPartyService.createSupplier.and.returnValue(of(supplierData));

    component.supplierForm.setValue({
      groupName: 'Test Supplier',
      emailAddress: 'test@supplier.com',
      contactNumber: '1234567890',
      roleTypeId: 'SUPPLIER'
    });

    component.createSupplier();
    tick();

    expect(component.isLoading).toBeFalse();
    expect(mockPartyService.createSupplier).toHaveBeenCalledWith(component.supplierForm.value);
    expect(mockRouter.navigate).toHaveBeenCalledWith(['/suppliers/SUPP1001']);
    expect(snackbarServiceSpy.showSuccess).toHaveBeenCalledWith('SUPPLIER.CREATED_SUCCESS');
  }));

  it('should handle error if API fails', fakeAsync(() => {
    mockPartyService.createSupplier.and.returnValue(throwError(() => new Error('API Error')));
    translateServiceSpy.instant.and.returnValue('SUPPLIER.ERROR_CREATE');

    component.supplierForm.setValue({
      groupName: 'Test Supplier',
      emailAddress: 'test@supplier.com',
      contactNumber: '1234567890',
      roleTypeId: 'SUPPLIER'
    });

    component.createSupplier();
    tick();

    expect(component.isLoading).toBeFalse();
    expect(snackbarServiceSpy.showError).toHaveBeenCalledWith('SUPPLIER.ERROR_CREATE');
  }));

  it('should not submit if form is invalid', () => {
    component.supplierForm.patchValue({ groupName: '', emailAddress: '', contactNumber: '' });

    component.createSupplier();

    expect(mockPartyService.createSupplier).not.toHaveBeenCalled();
    expect(component.isLoading).toBeFalse();
  });
});
