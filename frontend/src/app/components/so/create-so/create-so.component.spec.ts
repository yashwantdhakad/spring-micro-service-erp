import { ComponentFixture, TestBed } from '@angular/core/testing';
import { ReactiveFormsModule } from '@angular/forms';
import { Router } from '@angular/router';
import { of, throwError } from 'rxjs';
import { CreateSOComponent } from './create-so.component';
import { OrderService } from 'src/app/services/order/order.service';
import { PartyService } from 'src/app/services/party/party.service';
import { MatDialog } from '@angular/material/dialog';

describe('CreateSOComponent', () => {
  let component: CreateSOComponent;
  let fixture: ComponentFixture<CreateSOComponent>;
  let mockOrderService: any;
  let mockPartyService: any;
  let mockRouter: any;
  let mockDialog: any;

  beforeEach(async () => {
    mockOrderService = {
      getProductStores: jasmine.createSpy().and.returnValue(of([
        { productStoreId: 'STORE1', payToPartyId: 'VENDOR1' }
      ])),
      getFacilities: jasmine.createSpy().and.returnValue(of([])),
      createOrder: jasmine.createSpy().and.returnValue(of({ orderId: 'ORDER123' }))
    };

    mockPartyService = {
      getCustomers: jasmine.createSpy().and.returnValue(of({ resultList: [] })),
      getPartyPostalContactMechByPurpose: jasmine.createSpy().and.returnValue(of([])),
    };

    mockRouter = {
      navigate: jasmine.createSpy()
    };
    mockDialog = {
      open: jasmine.createSpy().and.returnValue({ afterClosed: () => of(true) }),
    };

    await TestBed.configureTestingModule({
      declarations: [CreateSOComponent],
      imports: [ReactiveFormsModule],
      providers: [
        { provide: OrderService, useValue: mockOrderService },
        { provide: PartyService, useValue: mockPartyService },
        { provide: Router, useValue: mockRouter },
        { provide: MatDialog, useValue: mockDialog }
      ]
    }).compileComponents();

    fixture = TestBed.createComponent(CreateSOComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create the component', () => {
    expect(component).toBeTruthy();
  });

  it('should call fetchData on init', () => {
    expect(mockOrderService.getProductStores).toHaveBeenCalled();
    expect(mockOrderService.getFacilities).toHaveBeenCalled();
  });

  it('should create order and navigate on success', () => {
    component.orderForm.patchValue({
      productStoreId: 'STORE1',
      facilityId: 'FAC1',
      customerPartyId: 'CUST1',
      shippingAddress: {
        contactMechId: 'ADDR1',
        address1: '123 Main',
      }
    });
    component.updateVendorParty();

    component.createOrder();

    expect(mockOrderService.createOrder).toHaveBeenCalled();
    expect(mockRouter.navigate).toHaveBeenCalledWith(['/orders/ORDER123']);
  });

  it('should handle createOrder error gracefully', () => {
    mockOrderService.createOrder.and.returnValue(throwError(() => new Error('Server Error')));
    
    component.orderForm.patchValue({
      productStoreId: 'STORE1',
      facilityId: 'FAC1',
      customerPartyId: 'CUST1'
    });
    component.updateVendorParty();

    component.createOrder();

    expect(mockRouter.navigate).not.toHaveBeenCalled();
  });
});
