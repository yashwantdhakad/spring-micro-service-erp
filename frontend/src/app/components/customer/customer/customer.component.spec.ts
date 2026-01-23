import { ComponentFixture, TestBed } from '@angular/core/testing';
import { of, throwError } from 'rxjs';
import { CustomerComponent } from './customer.component';
import { PartyService } from 'src/app/services/party/party.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';

describe('CustomerComponent', () => {
  let component: CustomerComponent;
  let fixture: ComponentFixture<CustomerComponent>;
  let partyServiceSpy: jasmine.SpyObj<PartyService>;
  let snackbarServiceSpy: jasmine.SpyObj<SnackbarService>;

  beforeEach(async () => {
    const partySpy = jasmine.createSpyObj('PartyService', ['getCustomers']);
    const snackbarSpy = jasmine.createSpyObj('SnackbarService', ['showError']);

    await TestBed.configureTestingModule({
      declarations: [CustomerComponent],
      providers: [
        { provide: PartyService, useValue: partySpy },
        { provide: SnackbarService, useValue: snackbarSpy },
      ],
    }).compileComponents();

    fixture = TestBed.createComponent(CustomerComponent);
    component = fixture.componentInstance;
    partyServiceSpy = TestBed.inject(PartyService) as jasmine.SpyObj<PartyService>;
    snackbarServiceSpy = TestBed.inject(SnackbarService) as jasmine.SpyObj<SnackbarService>;
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('should fetch customers on init', () => {
    const response = { resultList: [{ partyId: 'P1' }], documentListCount: 1 };
    partyServiceSpy.getCustomers.and.returnValue(of(response));

    fixture.detectChanges(); // triggers ngOnInit

    expect(component.items.length).toBe(1);
    expect(component.pages).toBe(1);
    expect(partyServiceSpy.getCustomers).toHaveBeenCalledWith(0, '');
  });

  it('should handle error during getCustomers', () => {
    partyServiceSpy.getCustomers.and.returnValue(throwError(() => new Error('API error')));

    component.getCustomers(1, '');

    expect(snackbarServiceSpy.showError).toHaveBeenCalledWith('Error fetching customers');
  });

  it('should return column keys from config', () => {
    const keys = component.getCustomerColumnKeys();
    expect(keys).toEqual(['partyId', 'firstName', 'lastName', 'contactNumber', 'emailAddress']);
  });

  it('should return value for direct and nested properties', () => {
    const element = { name: 'John', contact: { phone: '12345' } };
    expect(component.getValue(element, 'name')).toBe('John');
    expect(component.getValue(element, 'contact.phone')).toBe('12345');
  });
});
