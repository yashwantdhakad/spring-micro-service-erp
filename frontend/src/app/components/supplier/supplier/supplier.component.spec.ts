import { ComponentFixture, TestBed, fakeAsync, tick } from '@angular/core/testing';
import { SupplierComponent } from './supplier.component';
import { PartyService } from 'src/app/services/oms/party/party.service';
import { of, throwError } from 'rxjs';
import { CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { ReactiveFormsModule } from '@angular/forms';
import { SnackbarService } from 'src/app/services/common/snackbar.service';

describe('SupplierComponent', () => {
  let component: SupplierComponent;
  let fixture: ComponentFixture<SupplierComponent>;
  let partyServiceSpy: jasmine.SpyObj<PartyService>;
  let snackbarServiceSpy: jasmine.SpyObj<SnackbarService>;

  beforeEach(async () => {
    partyServiceSpy = jasmine.createSpyObj('PartyService', ['getSuppliers']);
    snackbarServiceSpy = jasmine.createSpyObj('SnackbarService', ['showError']);

    await TestBed.configureTestingModule({
      imports: [ReactiveFormsModule],
      declarations: [SupplierComponent],
      providers: [
        { provide: PartyService, useValue: partyServiceSpy },
        { provide: SnackbarService, useValue: snackbarServiceSpy },
      ],
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
    tick(300);

    expect(partyServiceSpy.getSuppliers).toHaveBeenCalledWith(0, '');
    expect(component.items.length).toBe(1);
    expect(component.pages).toBe(1);
    expect(component.isLoading).toBeFalse();
  }));

  it('should handle error when getSuppliers fails', fakeAsync(() => {
    partyServiceSpy.getSuppliers.and.returnValue(throwError(() => new Error('API Error')));

    fixture.detectChanges();
    tick(300);

    expect(snackbarServiceSpy.showError).toHaveBeenCalledWith('Error fetching suppliers');
    expect(component.items).toEqual([]);
    expect(component.pages).toBe(0);
    expect(component.isLoading).toBeFalse();
  }));

  it('should request next page', () => {
    const mockResponse = { resultList: [{ partyId: 'SUPP2' }], documentListCount: 2 };
    partyServiceSpy.getSuppliers.and.returnValue(of(mockResponse));
    component.queryString = 'supp';

    component.onPageChange(1);

    expect(partyServiceSpy.getSuppliers).toHaveBeenCalledWith(1, 'supp');
  });
});
