import { ComponentFixture, TestBed } from '@angular/core/testing';
import { ReactiveFormsModule } from '@angular/forms';
import { RouterTestingModule } from '@angular/router/testing';
import { NO_ERRORS_SCHEMA } from '@angular/core';
import { CreateShipmentComponent } from './create-shipment.component';
import { ShipmentService } from 'src/app/services/shipment/shipment.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';
import { of } from 'rxjs';

describe('CreateShipmentComponent', () => {
  let component: CreateShipmentComponent;
  let fixture: ComponentFixture<CreateShipmentComponent>;

  beforeEach(() => {
    const shipmentServiceSpy = jasmine.createSpyObj('ShipmentService', ['createShipment']);
    const snackbarSpy = jasmine.createSpyObj('SnackbarService', ['showSuccess', 'showError']);

    TestBed.configureTestingModule({
      declarations: [CreateShipmentComponent],
      imports: [ReactiveFormsModule, RouterTestingModule],
      providers: [
        { provide: ShipmentService, useValue: shipmentServiceSpy },
        { provide: SnackbarService, useValue: snackbarSpy },
      ],
      schemas: [NO_ERRORS_SCHEMA],
    });
    fixture = TestBed.createComponent(CreateShipmentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('should add item and route segment on init', () => {
    expect(component.items.length).toBe(1);
    expect(component.routeSegments.length).toBe(1);
  });

  it('should submit shipment creation', () => {
    const shipmentService = TestBed.inject(ShipmentService) as jasmine.SpyObj<ShipmentService>;
    shipmentService.createShipment.and.returnValue(of({ shipment: { shipmentId: 'SHP-001' } }));

    component.shipmentForm.patchValue({
      shipmentTypeId: 'SALES_SHIPMENT',
      statusId: 'SHIPMENT_INPUT'
    });
    component.items.at(0).patchValue({ productId: 'PROD-1', quantity: '1' });

    component.createShipment();

    expect(shipmentService.createShipment).toHaveBeenCalled();
  });
});
