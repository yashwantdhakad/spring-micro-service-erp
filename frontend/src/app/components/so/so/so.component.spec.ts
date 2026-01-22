import { ComponentFixture, TestBed } from '@angular/core/testing';
import { SOComponent } from './so.component';
import { OrderService } from 'src/app/services/order/order.service';
import { of, throwError } from 'rxjs';

describe('SOComponent', () => {
  let component: SOComponent;
  let fixture: ComponentFixture<SOComponent>;
  let mockOrderService: jasmine.SpyObj<OrderService>;

  const mockOrderResponse = {
    responseMap: {
      orderList: [
        {
          orderId: 'ORD-001',
          customerName: 'John Doe',
          organizationName: 'ABC Corp',
          entryDate: '2023-01-01',
          statusDescription: 'Approved',
          storeName: 'Main Store',
          grandTotal: 500,
        }
      ],
      orderListCount: 1,
    }
  };

  beforeEach(async () => {
    mockOrderService = jasmine.createSpyObj('OrderService', ['getOrders']);

    await TestBed.configureTestingModule({
      declarations: [SOComponent],
      providers: [
        { provide: OrderService, useValue: mockOrderService }
      ]
    }).compileComponents();

    fixture = TestBed.createComponent(SOComponent);
    component = fixture.componentInstance;
  });

  it('should create the component', () => {
    mockOrderService.getOrders.and.returnValue(of(mockOrderResponse));
    fixture.detectChanges();
    expect(component).toBeTruthy();
  });

  it('should load orders on init and set items/pages correctly', () => {
    mockOrderService.getOrders.and.returnValue(of(mockOrderResponse));
    fixture.detectChanges();

    expect(mockOrderService.getOrders).toHaveBeenCalledWith(0, '');
    expect(component.items.length).toBe(1);
    expect(component.pages).toBe(1);
    expect(component.isLoading).toBeFalse();
  });

  it('should handle API error gracefully', () => {
    const consoleSpy = spyOn(console, 'error');
    mockOrderService.getOrders.and.returnValue(throwError(() => new Error('API Error')));

    fixture.detectChanges();

    expect(mockOrderService.getOrders).toHaveBeenCalled();
    expect(consoleSpy).toHaveBeenCalledWith('Error fetching orders:', jasmine.any(Error));
    expect(component.isLoading).toBeFalse();
    expect(component.items).toEqual([]);
  });
});
