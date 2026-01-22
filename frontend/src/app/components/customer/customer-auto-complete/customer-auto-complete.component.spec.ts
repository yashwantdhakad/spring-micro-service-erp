import { ComponentFixture, TestBed } from '@angular/core/testing';
import { ReactiveFormsModule, FormsModule } from '@angular/forms';
import { CustomerAutoCompleteComponent } from './customer-auto-complete.component';
import { PartyService } from 'src/app/services/party/party.service';
import { By } from '@angular/platform-browser';

describe('CustomerAutoCompleteComponent', () => {
  let component: CustomerAutoCompleteComponent;
  let fixture: ComponentFixture<CustomerAutoCompleteComponent>;
  let partyService: jasmine.SpyObj<PartyService>;

  beforeEach(async () => {
    const partySpy = jasmine.createSpyObj('PartyService', ['getCustomers']);

    await TestBed.configureTestingModule({
      declarations: [CustomerAutoCompleteComponent],
      imports: [ReactiveFormsModule, FormsModule],
      providers: [{ provide: PartyService, useValue: partySpy }],
    }).compileComponents();

    partyService = TestBed.inject(PartyService) as jasmine.SpyObj<PartyService>;
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CustomerAutoCompleteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create the component', () => {
    expect(component).toBeTruthy();
  });

  it('should bind @Input value correctly', () => {
    component.value = 'CUST123';
    fixture.detectChanges();
    expect(component.value).toBe('CUST123');
  });

  it('should emit valueChange on customer selection', () => {
    spyOn(component.valueChange, 'emit');
    const customer = { id: 'CUST001', name: 'Test Customer' };

    component.onCustomerSelected(customer);

    expect(component.value).toBe('CUST001');
    expect(component.valueChange.emit).toHaveBeenCalledWith('CUST001');
  });

  it('should handle null customer in selection gracefully', () => {
    spyOn(component.valueChange, 'emit');
    component.onCustomerSelected(null);

    expect(component.value).toBeNull();
    expect(component.valueChange.emit).toHaveBeenCalledWith(undefined);
  });

  it('should initialize customer control', () => {
    expect(component.customerCtrl).toBeDefined();
  });
});
