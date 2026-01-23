import { ComponentFixture, TestBed, fakeAsync, tick } from '@angular/core/testing';
import { SupplierComponent } from './supplier.component';
import { PartyService } from 'src/app/services/party/party.service';
import { of, throwError } from 'rxjs';
import { CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';

describe('SupplierComponent', () => {
  let component: SupplierComponent;
  let fixture: ComponentFixture<SupplierComponent>;
  let partyServiceSpy: jasmine.SpyObj<PartyService>;

  beforeEach(async () => {
    partyServiceSpy = jasmine.createSpyObj('PartyService', ['getSuppliers']);

    await TestBed.configureTestingModule({
      declarations: [SupplierComponent],
      providers: [{ provide: PartyService, useValue: partyServiceSpy }],
      schemas: [CUSTOM_ELEMENTS_SCHEMA], // To ignore unknown component tags like <mat-table>, <mat-spinner> etc.
    }).compileComponents();

    fixture = TestBed.createComponent(SupplierComponent);
    component = fixture.componentInstance;
  });

  it('should create component', () => {
    expect(component).toBeTruthy();
  });

  it('should fetch suppliers on init', fakeAsync(() => {
    const mockResponse = {
      resultList: [{ partyId: 'SUPP1', groupName: 'Test Supplier', contactNumber: '1234567890', emailAddress: 'test@example.com' }],
      documentListCount: 1,
    };
    partyServiceSpy.getSuppliers.and.returnValue(of(mockResponse));

    fixture.detectChanges(); // triggers ngOnInit
    tick();

    expect(partyServiceSpy.getSuppliers).toHaveBeenCalledWith(0, '');
    expect(component.items.length).toBe(1);
    expect(component.pages).toBe(1);
    expect(component.isLoading).toBeFalse();
  }));

  it('should handle error when getSuppliers fails', fakeAsync(() => {
    const consoleSpy = spyOn(console, 'error');
    partyServiceSpy.getSuppliers.and.returnValue(throwError(() => new Error('API Error')));

    component.getSuppliers(1, '');
    tick();

    expect(consoleSpy).toHaveBeenCalledWith('Error fetching suppliers:', jasmine.any(Error));
    expect(component.items).toEqual([]);
    expect(component.pages).toBe(0);
    expect(component.isLoading).toBeFalse();
  }));
});
