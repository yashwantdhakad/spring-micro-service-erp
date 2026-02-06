import { ComponentFixture, TestBed, fakeAsync, tick } from '@angular/core/testing';
import { CreatePOComponent } from './create-po.component';
import { ReactiveFormsModule } from '@angular/forms';
import { OrderService } from 'src/app/services/order/order.service';
import { PartyService } from 'src/app/services/party/party.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';
import { Router } from '@angular/router';
import { of, throwError } from 'rxjs';

describe('CreatePOComponent', () => {
  let component: CreatePOComponent;
  let fixture: ComponentFixture<CreatePOComponent>;
  let mockOrderService: jasmine.SpyObj<OrderService>;
  let mockPartyService: jasmine.SpyObj<PartyService>;
  let mockSnackbarService: jasmine.SpyObj<SnackbarService>;
  let mockRouter: jasmine.SpyObj<Router>;

  beforeEach(async () => {
    mockOrderService = jasmine.createSpyObj('OrderService', ['getFacilities', 'getCustomerParties', 'createOrder']);
    mockPartyService = jasmine.createSpyObj('PartyService', ['getSuppliers']);
    mockSnackbarService = jasmine.createSpyObj('SnackbarService', ['showSuccess', 'showError']);
    mockRouter = jasmine.createSpyObj('Router', ['navigate']);

    await TestBed.configureTestingModule({
      declarations: [CreatePOComponent],
      imports: [ReactiveFormsModule],
      providers: [
        { provide: OrderService, useValue: mockOrderService },
        { provide: PartyService, useValue: mockPartyService },
        { provide: SnackbarService, useValue: mockSnackbarService },
        { provide: Router, useValue: mockRouter },
      ],
    }).compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CreatePOComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create component', () => {
    expect(component).toBeTruthy();
  });

  it('should initialize and fetch facilities and customer parties', () => {
    const mockFacilities = [{ facilityId: 'FAC1' }];
    const mockParties = [{ partyId: 'PARTY1' }];

    mockOrderService.getFacilities.and.returnValue(of(mockFacilities));
    mockOrderService.getCustomerParties.and.returnValue(of(mockParties));

    component.ngOnInit();

    expect(mockOrderService.getFacilities).toHaveBeenCalled();
    expect(mockOrderService.getCustomerParties).toHaveBeenCalled();
  });

  it('should not call createOrder if form is invalid', () => {
    component.poForm.patchValue({ vendorPartyId: '' }); // Required field left blank

    component.createPO();

    expect(mockOrderService.createOrder).not.toHaveBeenCalled();
  });

  it('should call createOrder and navigate on success', () => {
    const orderId = 'PO123';
    component.poForm.patchValue({
      vendorPartyId: 'VEND1',
      customerPartyId: 'CUST1',
      facilityId: 'FAC1',
      shipBeforeDate: '2025-08-01',
    });

    mockOrderService.createOrder.and.returnValue(of({ orderId, id: 101 }));

    component.createPO();

    expect(mockOrderService.createOrder).toHaveBeenCalled();
    expect(mockRouter.navigate).toHaveBeenCalledWith([`/pos/${101}`]);
    expect(mockSnackbarService.showSuccess).toHaveBeenCalled();
  });

  it('should show error if createOrder fails', () => {
    component.poForm.patchValue({
      vendorPartyId: 'VEND1',
      customerPartyId: 'CUST1',
      facilityId: 'FAC1',
      shipBeforeDate: '2025-08-01',
    });

    mockOrderService.createOrder.and.returnValue(throwError(() => new Error('API failure')));

    component.createPO();

    expect(mockSnackbarService.showError).toHaveBeenCalledWith('Error in creating purchase order');
  });

  it('should fetch and map supplier list during autocomplete', fakeAsync(() => {
    const response = { resultList: [{ partyId: 'VEND_1', name: 'Vendor 1' }] };
    mockPartyService.getSuppliers.and.returnValue(of(response));

    component.poForm.get('vendorPartyId')?.setValue('ven');
    tick(300); // simulate debounce

    component.filteredSuppliers$.subscribe((list) => {
      expect(list).toEqual(response.resultList);
    });
  }));
});
