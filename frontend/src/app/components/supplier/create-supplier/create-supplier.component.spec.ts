import { ComponentFixture, TestBed, fakeAsync, tick } from '@angular/core/testing';
import { CreateSupplierComponent } from './create-supplier.component';
import { ReactiveFormsModule } from '@angular/forms';
import { PartyService } from 'src/app/services/party/party.service';
import { Router } from '@angular/router';
import { of, throwError } from 'rxjs';

describe('CreateSupplierComponent', () => {
  let component: CreateSupplierComponent;
  let fixture: ComponentFixture<CreateSupplierComponent>;
  let mockPartyService: jasmine.SpyObj<PartyService>;
  let mockRouter: jasmine.SpyObj<Router>;

  beforeEach(async () => {
    mockPartyService = jasmine.createSpyObj('PartyService', ['createSupplier']);
    mockRouter = jasmine.createSpyObj('Router', ['navigate']);

    await TestBed.configureTestingModule({
      declarations: [CreateSupplierComponent],
      imports: [ReactiveFormsModule],
      providers: [
        { provide: PartyService, useValue: mockPartyService },
        { provide: Router, useValue: mockRouter }
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
      partyId: 'SUPP-1001'
    };

    mockPartyService.createSupplier.and.returnValue(of(supplierData));

    component.supplierForm.setValue({
      organizationName: 'Test Supplier',
      emailAddress: 'test@supplier.com',
      contactNumber: '1234567890',
      roleTypeId: 'Supplier'
    });

    component.createSupplier();
    tick();

    expect(component.isLoading).toBeFalse();
    expect(mockPartyService.createSupplier).toHaveBeenCalledWith(component.supplierForm.value);
    expect(mockRouter.navigate).toHaveBeenCalledWith(['/suppliers/SUPP-1001']);
  }));

  it('should handle error if API fails', fakeAsync(() => {
    const consoleSpy = spyOn(console, 'error');
    mockPartyService.createSupplier.and.returnValue(throwError(() => new Error('API Error')));

    component.supplierForm.setValue({
      organizationName: 'Test Supplier',
      emailAddress: 'test@supplier.com',
      contactNumber: '1234567890',
      roleTypeId: 'Supplier'
    });

    component.createSupplier();
    tick();

    expect(component.isLoading).toBeFalse();
    expect(consoleSpy).toHaveBeenCalledWith('Error in create supplier:', jasmine.any(Error));
  }));

  it('should not submit if form is invalid', () => {
    component.supplierForm.patchValue({ organizationName: '', emailAddress: '', contactNumber: '' });

    component.createSupplier();

    expect(mockPartyService.createSupplier).not.toHaveBeenCalled();
    expect(component.isLoading).toBeFalse();
  });
});
