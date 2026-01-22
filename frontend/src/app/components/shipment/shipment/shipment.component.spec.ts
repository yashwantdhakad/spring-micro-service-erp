import { ComponentFixture, TestBed, waitForAsync } from '@angular/core/testing';
import { of, throwError } from 'rxjs';
import { ShipmentComponent } from './shipment.component';
import { ShipmentService } from 'src/app/services/shipment/shipment.service';
import { MatPaginatorModule } from '@angular/material/paginator';
import { MatProgressSpinnerModule } from '@angular/material/progress-spinner';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import { MatCardModule } from '@angular/material/card';
import { MatIconModule } from '@angular/material/icon';
import { NoopAnimationsModule } from '@angular/platform-browser/animations';
import { RouterTestingModule } from '@angular/router/testing';
import { FormsModule } from '@angular/forms';

describe('ShipmentComponent', () => {
  let component: ShipmentComponent;
  let fixture: ComponentFixture<ShipmentComponent>;
  let shipmentService: jasmine.SpyObj<ShipmentService>;

  beforeEach(waitForAsync(() => {
    const shipmentServiceSpy = jasmine.createSpyObj('ShipmentService', ['getShipments']);

    TestBed.configureTestingModule({
      declarations: [ShipmentComponent],
      imports: [
        MatPaginatorModule,
        MatProgressSpinnerModule,
        MatFormFieldModule,
        MatInputModule,
        MatCardModule,
        MatIconModule,
        NoopAnimationsModule,
        RouterTestingModule,
        FormsModule
      ],
      providers: [
        { provide: ShipmentService, useValue: shipmentServiceSpy },
      ],
    }).compileComponents();

    shipmentService = TestBed.inject(ShipmentService) as jasmine.SpyObj<ShipmentService>;
    fixture = TestBed.createComponent(ShipmentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  }));

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('should fetch shipments on initialization', async () => {
    const mockResponse = {
      body: [
        { shipmentId: '1', statusDescription: 'Pending', shipmentTypeEnumId: 'TypeA', destinationFacilityName: 'FacilityA', orderId: '123', shipBeforeDate: new Date() },
      ],
      headers: { get: () => '1' },
    };

    shipmentService.getShipments.and.returnValue(of(mockResponse));

    await component.getShipments(1, '');

    expect(shipmentService.getShipments).toHaveBeenCalledWith(0, '');
    expect(component.items.length).toBe(1);
    expect(component.pages).toBe(1);
  });

  it('should handle error when fetching shipments', async () => {
    shipmentService.getShipments.and.returnValue(throwError(() => 'Error'));

    await component.getShipments(1, '');

    expect(component.isLoading).toBe(false);
  });

  it('should search shipments based on query string', async () => {
    const mockResponse = {
      body: [
        { shipmentId: '1', statusDescription: 'Pending', shipmentTypeEnumId: 'TypeA', destinationFacilityName: 'FacilityA', orderId: '123', shipBeforeDate: new Date() },
      ],
      headers: { get: () => '1' },
    };

    shipmentService.getShipments.and.returnValue(of(mockResponse));

    component.queryString = '123';
    await component.getShipments(1, component.queryString);

    expect(shipmentService.getShipments).toHaveBeenCalledWith(0, '123');
  });
});
