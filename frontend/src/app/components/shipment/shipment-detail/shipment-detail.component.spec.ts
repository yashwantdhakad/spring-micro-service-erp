import { ComponentFixture, TestBed } from '@angular/core/testing';
import { NO_ERRORS_SCHEMA } from '@angular/core';
import { ShipmentDetailComponent } from './shipment-detail.component';
import { ActivatedRoute } from '@angular/router';
import { of, throwError } from 'rxjs';
import { ShipmentService } from 'src/app/services/shipment/shipment.service';

describe('ShipmentDetailComponent', () => {
  let component: ShipmentDetailComponent;
  let fixture: ComponentFixture<ShipmentDetailComponent>;
  let shipmentServiceSpy: jasmine.SpyObj<ShipmentService>;

  const mockRoute = {
    params: of({ shipmentId: 'SHIP-1001' })
  };

  const mockShipmentResponse = {
    shipment: {
      shipmentId: 'SHIP-1001',
      shipmentTypeId: 'SALES_SHIPMENT',
      statusId: 'SHIPMENT_INPUT'
    },
    items: [
      {
        shipmentItemSeqId: '00001',
        productId: 'PROD-1',
        quantity: '2'
      }
    ],
    routeSegments: [
      {
        shipmentRouteSegmentId: '00001',
        destFacilityId: 'MAIN_FACILITY'
      }
    ]
  };

  beforeEach(async () => {
    shipmentServiceSpy = jasmine.createSpyObj('ShipmentService', ['getShipment']);

    await TestBed.configureTestingModule({
      declarations: [ShipmentDetailComponent],
      providers: [
        { provide: ActivatedRoute, useValue: mockRoute },
        { provide: ShipmentService, useValue: shipmentServiceSpy }
      ],
      schemas: [NO_ERRORS_SCHEMA]
    }).compileComponents();

    fixture = TestBed.createComponent(ShipmentDetailComponent);
    component = fixture.componentInstance;
  });

  it('should create component', () => {
    shipmentServiceSpy.getShipment.and.returnValue(of(mockShipmentResponse));
    fixture.detectChanges();
    expect(component).toBeTruthy();
  });

  it('should call getShipment with shipmentId from route and populate data', () => {
    shipmentServiceSpy.getShipment.and.returnValue(of(mockShipmentResponse));
    fixture.detectChanges();

    expect(shipmentServiceSpy.getShipment).toHaveBeenCalledWith('SHIP-1001');
    expect(component.shipmentDetail.shipmentId).toEqual('SHIP-1001');
    expect(component.items.length).toBe(1);
    expect(component.shipmentRouteSegments.length).toBe(1);
    expect(component.isLoading).toBeFalse();
  });

  it('should handle error from getShipment gracefully', () => {
    shipmentServiceSpy.getShipment.and.returnValue(throwError(() => new Error('API failed')));

    fixture.detectChanges();

    expect(shipmentServiceSpy.getShipment).toHaveBeenCalledWith('SHIP-1001');
    expect(component.isLoading).toBeFalse();
  });

  it('should return current date time string from getCurrentDateTime', () => {
    const result = component.getCurrentDateTime();
    expect(typeof result).toBe('string');
    expect(result.length).toBeGreaterThan(0);
  });
});
