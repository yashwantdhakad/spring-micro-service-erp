import { ComponentFixture, TestBed } from '@angular/core/testing';
import { SupplierDetailComponent } from './supplier-detail.component';
import { PartyService } from 'src/app/services/party/party.service';
import { ActivatedRoute } from '@angular/router';
import { MatDialog } from '@angular/material/dialog';
import { Store } from '@ngrx/store';
import { of, throwError } from 'rxjs';
import { NO_ERRORS_SCHEMA } from '@angular/core';

describe('SupplierDetailComponent', () => {
  let component: SupplierDetailComponent;
  let fixture: ComponentFixture<SupplierDetailComponent>;
  let partyServiceSpy: jasmine.SpyObj<PartyService>;
  let matDialogSpy: jasmine.SpyObj<MatDialog>;
  let storeSpy: jasmine.SpyObj<Store<any>>;

  beforeEach(async () => {
    partyServiceSpy = jasmine.createSpyObj('PartyService', ['getSupplier', 'deleteIdentification', 'deleteContactMech', 'deleteRole']);
    matDialogSpy = jasmine.createSpyObj('MatDialog', ['open']);
    storeSpy = jasmine.createSpyObj('Store', ['dispatch', 'pipe']);

    await TestBed.configureTestingModule({
      declarations: [SupplierDetailComponent],
      providers: [
        { provide: PartyService, useValue: partyServiceSpy },
        { provide: MatDialog, useValue: matDialogSpy },
        { provide: Store, useValue: storeSpy },
        {
          provide: ActivatedRoute,
          useValue: {
            params: of({ partyId: 'SUP123' }),
          },
        },
      ],
      schemas: [NO_ERRORS_SCHEMA], // ignore unknown Angular Material and custom components
    }).compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SupplierDetailComponent);
    component = fixture.componentInstance;
  });

  it('should create the component', () => {
    expect(component).toBeTruthy();
  });

  it('should call getSupplier on init with route param', () => {
    const mockResponse = {
      supplierDetail: {
        party: { partyId: 'SUP123' },
        partyRoleList: [],
        partyIdentificationList: [],
        emailAddressList: [],
        telecomNumberList: [],
        postalAddressList: [],
        payments: [],
        partyNoteList: [],
      },
    };
    partyServiceSpy.getSupplier.and.returnValue(of(mockResponse));

    fixture.detectChanges();

    expect(component.partyId).toBe('SUP123');
    expect(partyServiceSpy.getSupplier).toHaveBeenCalledWith('SUP123');
    expect(component.supplierDetail.partyId).toBe('SUP123');
  });

  it('should handle getSupplier error', () => {
    const consoleSpy = spyOn(console, 'error');
    partyServiceSpy.getSupplier.and.returnValue(throwError(() => new Error('API error')));

    component.getSupplier('SUP123');

    expect(consoleSpy).toHaveBeenCalledWith('Error fetching supplier details:', jasmine.any(Error));
  });

  it('should filter email addresses by purpose', () => {
    const emailList = [
      { contactMechPurposeId: 'PRIMARY_EMAIL', emailAddress: 'a@example.com' },
      { contactMechPurposeId: 'BILLING_EMAIL', emailAddress: 'b@example.com' },
    ];
    const result = component.filterEmailAddressList(emailList, 'PRIMARY_EMAIL');
    expect(result.length).toBe(1);
    expect(result[0].emailAddress).toBe('a@example.com');
  });

  it('should mask credit card number properly', () => {
    const rawCard = '4111111111111111';
    const masked = component.maskCreditCardNumber(rawCard);
    expect(masked).toBe('************1111');
  });
});
