import { ComponentFixture, TestBed } from '@angular/core/testing';
import { POComponent } from './po.component';
import { OrderService } from 'src/app/services/order/order.service';
import { DatePipe } from '@angular/common';
import { of, throwError } from 'rxjs';

describe('POComponent', () => {
  let component: POComponent;
  let fixture: ComponentFixture<POComponent>;
  let orderServiceSpy: jasmine.SpyObj<OrderService>;

  beforeEach(async () => {
    const spy = jasmine.createSpyObj('OrderService', ['getPOs']);

    await TestBed.configureTestingModule({
      declarations: [POComponent],
      providers: [
        { provide: OrderService, useValue: spy },
        DatePipe
      ]
    }).compileComponents();

    orderServiceSpy = TestBed.inject(OrderService) as jasmine.SpyObj<OrderService>;
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(POComponent);
    component = fixture.componentInstance;
  });

  it('should create the component', () => {
    expect(component).toBeTruthy();
  });

  it('should call getOrders on init and populate items', () => {
    const mockResponse = {
      responseMap: {
        orderList: [
          {
            orderId: 'PO-001',
            organizationName: 'Org A',
            vendorOrganizationName: 'Vendor X',
            entryDate: '2025-07-01T00:00:00Z',
            statusDescription: 'Created',
            facilityName: 'Facility Y',
            quantityTotal: 10,
            grandTotal: 500
          }
        ],
        orderListCount: 1
      }
    };

    orderServiceSpy.getPOs.and.returnValue(of(mockResponse));

    fixture.detectChanges(); // triggers ngOnInit()

    expect(orderServiceSpy.getPOs).toHaveBeenCalledWith(0, 10, '');
    expect(component.items.length).toBe(1);
    expect(component.items[0].entryDate).toContain('2025'); // transformed by DatePipe
    expect(component.pages).toBe(1);
    expect(component.isLoading).toBeFalse();
  });

  it('should handle error in getOrders gracefully', () => {
    orderServiceSpy.getPOs.and.returnValue(throwError(() => new Error('API error')));

    fixture.detectChanges(); // triggers ngOnInit()

    expect(orderServiceSpy.getPOs).toHaveBeenCalled();
    expect(component.items.length).toBe(0);
    expect(component.isLoading).toBeFalse();
  });
});
