import { ComponentFixture, TestBed, fakeAsync, tick } from '@angular/core/testing';
import { ReactiveFormsModule } from '@angular/forms';
import { CreateCustomerComponent } from './create-customer.component';
import { PartyService } from 'src/app/services/oms/party/party.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';
import { TranslateService } from '@ngx-translate/core';
import { Store } from '@ngrx/store';
import { of, throwError } from 'rxjs';
import { Router } from '@angular/router';

describe('CreateCustomerComponent', () => {
  let component: CreateCustomerComponent;
  let fixture: ComponentFixture<CreateCustomerComponent>;
  let partyService: jasmine.SpyObj<PartyService>;
  let snackbarService: jasmine.SpyObj<SnackbarService>;
  let translateService: jasmine.SpyObj<TranslateService>;
  let router: jasmine.SpyObj<Router>;
  let store: jasmine.SpyObj<Store>;

  beforeEach(async () => {
    const partyServiceSpy = jasmine.createSpyObj('PartyService', ['createCustomer']);
    const snackbarSpy = jasmine.createSpyObj('SnackbarService', ['showSuccess', 'showError']);
    const translateSpy = jasmine.createSpyObj('TranslateService', ['instant']);
    const routerSpy = jasmine.createSpyObj('Router', ['navigate']);
    const storeSpy = jasmine.createSpyObj('Store', ['dispatch', 'pipe']);

    await TestBed.configureTestingModule({
      declarations: [CreateCustomerComponent],
      imports: [ReactiveFormsModule],
      providers: [
        { provide: PartyService, useValue: partyServiceSpy },
        { provide: SnackbarService, useValue: snackbarSpy },
        { provide: TranslateService, useValue: translateSpy },
        { provide: Router, useValue: routerSpy },
        { provide: Store, useValue: storeSpy }
      ]
    }).compileComponents();

    partyService = TestBed.inject(PartyService) as jasmine.SpyObj<PartyService>;
    snackbarService = TestBed.inject(SnackbarService) as jasmine.SpyObj<SnackbarService>;
    translateService = TestBed.inject(TranslateService) as jasmine.SpyObj<TranslateService>;
    router = TestBed.inject(Router) as jasmine.SpyObj<Router>;
    store = TestBed.inject(Store) as jasmine.SpyObj<Store>;

    store.pipe.and.returnValue(of([])); // mock geo list
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CreateCustomerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create the component', () => {
    expect(component).toBeTruthy();
  });

  it('should initialize form with default values', () => {
    const form = component.createCustomerForm;
    expect(form).toBeTruthy();
    expect(form.get('firstName')?.value).toBe('');
    expect(form.get('roleTypeId')?.value).toBe('CUSTOMER');
    expect(form.get('countryGeoId')?.value).toBe('USA');
  });

  it('should filter states by country', () => {
    const mockStates = [
      { geoId: 'USA_TX', country_geo_id: 'USA' },
      { geoId: 'USA_CA', country_geo_id: 'USA' },
      { geoId: 'CAN_ON', country_geo_id: 'CAN' },
    ];
    const result = component.filterStatesByCountry(mockStates);
    expect(result.length).toBe(2);
    expect(result[0].geoId).toBe('USA_TX');
  });

  it('should call createCustomer and navigate on success', fakeAsync(() => {
    const formValues = {
      firstName: 'John',
      lastName: 'Doe',
      emailAddress: 'john.doe@example.com',
      contactNumber: '1234567890',
      roleTypeId: 'CUSTOMER',
      address1: '123 Street',
      address2: '',
      city: 'NYC',
      postalCode: '10001',
      countryGeoId: 'USA',
      stateProvinceGeoId: 'USA_NY',
    };

    component.createCustomerForm.setValue(formValues);
    translateService.instant.and.returnValue('Customer created');
    partyService.createCustomer.and.returnValue(of({ partyId: 'CUST123' }));

    component.createCustomer();
    tick();

    expect(partyService.createCustomer).toHaveBeenCalledWith({
      ...formValues,
      toName: 'John Doe',
    });
    expect(snackbarService.showSuccess).toHaveBeenCalledWith('Customer created');
    expect(router.navigate).toHaveBeenCalledWith(['/customers/CUST123']);
  }));

  it('should show error if response does not have partyId', fakeAsync(() => {
    const formValues = { ...component.createCustomerForm.value, firstName: 'A', lastName: 'B', emailAddress: 'a@b.com', contactNumber: '1234567890', address1: 'addr', city: 'city', postalCode: '12345', stateProvinceGeoId: 'USA_CA' };
    component.createCustomerForm.setValue(formValues);
    translateService.instant.and.returnValue('Failed to create customer');
    partyService.createCustomer.and.returnValue(of({}));

    component.createCustomer();
    tick();

    expect(snackbarService.showError).toHaveBeenCalledWith('Failed to create customer');
  }));

  it('should handle error in createCustomer call', fakeAsync(() => {
    const formValues = { ...component.createCustomerForm.value, firstName: 'A', lastName: 'B', emailAddress: 'a@b.com', contactNumber: '1234567890', address1: 'addr', city: 'city', postalCode: '12345', stateProvinceGeoId: 'USA_CA' };
    component.createCustomerForm.setValue(formValues);
    translateService.instant.and.returnValue('Error occurred');
    partyService.createCustomer.and.returnValue(throwError(() => new Error('Failure')));

    component.createCustomer();
    tick();

    expect(snackbarService.showError).toHaveBeenCalledWith('Error occurred');
  }));
});
