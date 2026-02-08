import { ComponentFixture, TestBed, fakeAsync, tick } from '@angular/core/testing';
import { AddEditAddressComponent } from './add-edit-address.component';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';
import { ReactiveFormsModule } from '@angular/forms';
import { of, throwError } from 'rxjs';
import { PartyService } from 'src/app/services/oms/party/party.service';
import { CommonService } from 'src/app/services/common/common.service';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { OrderService } from 'src/app/services/order/order.service';

describe('AddEditAddressComponent', () => {
  let component: AddEditAddressComponent;
  let fixture: ComponentFixture<AddEditAddressComponent>;
  let mockPartyService: jasmine.SpyObj<PartyService>;
  let mockCommonService: jasmine.SpyObj<CommonService>;
  let mockOrderService: jasmine.SpyObj<OrderService>;
  let mockDialogRef: jasmine.SpyObj<MatDialogRef<AddEditAddressComponent>>;

  const mockAddressData = {
    partyId: 'PARTY-1',
    contactMechPurposeId: '',
    contactMechId: 'ADDR-1',
    toName: 'John Doe',
    address1: '123 Test St',
    address2: '',
    city: 'Testville',
    postalCode: '12345',
    countryGeoId: 'USA',
    stateProvinceGeoId: 'USA_CA',
    countries: [{ geoId: 'USA', geoName: 'United States' }],
    states: [
      { geoId: 'USA_CA', geoName: 'California' },
      { geoId: 'USA_TX', geoName: 'Texas' }
    ]
  };

  beforeEach(async () => {
    mockPartyService = jasmine.createSpyObj('PartyService', ['updatePostalAddress', 'addPostalAddress']);
    mockCommonService = jasmine.createSpyObj('CommonService', ['getLookupResults']);
    mockOrderService = jasmine.createSpyObj('OrderService', ['addOrderAddress', 'updateOrderAddress']);
    mockDialogRef = jasmine.createSpyObj('MatDialogRef', ['close']);

    await TestBed.configureTestingModule({
      imports: [ReactiveFormsModule, BrowserAnimationsModule],
      declarations: [AddEditAddressComponent],
      providers: [
        { provide: PartyService, useValue: mockPartyService },
        { provide: OrderService, useValue: mockOrderService },
        { provide: CommonService, useValue: mockCommonService },
        { provide: MAT_DIALOG_DATA, useValue: { addressData: mockAddressData } },
        { provide: MatDialogRef, useValue: mockDialogRef },
      ],
    }).compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AddEditAddressComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create the component', () => {
    expect(component).toBeTruthy();
  });

  it('should initialize form with address data', () => {
    expect(component.addEditAddressForm.get('toName')?.value).toEqual('John Doe');
    expect(component.states.length).toBeGreaterThan(0);
  });

  it('should reset stateProvinceGeoId on country change', fakeAsync(() => {
    component.addEditAddressForm.get('countryGeoId')?.setValue('USA');
    tick(300); // simulate async
    expect(component.addEditAddressForm.get('stateProvinceGeoId')?.value).toBe('');
  }));

  it('should call partyService.updatePostalAddress and close dialog on success', () => {
    mockPartyService.updatePostalAddress.and.returnValue(of({}));

    component.addEditAddressForm.markAllAsTouched();
    component.addEditAddress();

    expect(mockPartyService.updatePostalAddress).toHaveBeenCalled();
    expect(mockDialogRef.close).toHaveBeenCalled();
  });

  it('should show error and not close dialog on service failure', () => {
    mockPartyService.updatePostalAddress.and.returnValue(throwError(() => new Error('Service error')));

    component.addEditAddressForm.markAllAsTouched();
    component.addEditAddress();

    expect(mockPartyService.updatePostalAddress).toHaveBeenCalled();
    expect(mockDialogRef.close).not.toHaveBeenCalled();
  });
});
