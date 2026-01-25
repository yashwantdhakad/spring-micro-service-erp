import { ComponentFixture, TestBed } from '@angular/core/testing';
import { CustomerDetailComponent } from './customer-detail.component';
import { PartyService } from 'src/app/services/party/party.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';
import { ActivatedRoute } from '@angular/router';
import { of } from 'rxjs';
import { StoreModule, Store } from '@ngrx/store';
import { MatDialog } from '@angular/material/dialog';
import { geoReducer } from 'src/app/store/geo/geo.reducer';

describe('CustomerDetailComponent', () => {
  let component: CustomerDetailComponent;
  let fixture: ComponentFixture<CustomerDetailComponent>;
  let partyServiceSpy: jasmine.SpyObj<PartyService>;
  let dialogSpy: jasmine.SpyObj<MatDialog>;

  beforeEach(async () => {
    const partyServiceMock = jasmine.createSpyObj('PartyService', [
      'getCustomer',
      'deleteIdentification',
      'deleteClassification',
      'deleteRole',
      'deleteContactMech',
      'deleteEmail'
    ]);
    const matDialogSpy = jasmine.createSpyObj('MatDialog', ['open']);

    await TestBed.configureTestingModule({
      declarations: [CustomerDetailComponent],
      imports: [
        StoreModule.forRoot({ geo: geoReducer }),
      ],
      providers: [
        { provide: PartyService, useValue: partyServiceMock },
        { provide: SnackbarService, useValue: jasmine.createSpyObj('SnackbarService', ['showError', 'showSuccess']) },
        { provide: MatDialog, useValue: matDialogSpy },
        {
          provide: ActivatedRoute,
          useValue: {
            params: of({ partyId: 'TEST_ID' })
          }
        }
      ]
    }).compileComponents();

    fixture = TestBed.createComponent(CustomerDetailComponent);
    component = fixture.componentInstance;
    partyServiceSpy = TestBed.inject(PartyService) as jasmine.SpyObj<PartyService>;
    dialogSpy = TestBed.inject(MatDialog) as jasmine.SpyObj<MatDialog>;
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('should call getCustomer on init with correct partyId', () => {
    const mockCustomer = {
      customerDetail: {
        partyRoleList: [],
        party: { firstName: 'Test', lastName: 'Customer' },
        pcaaList: [],
        partyIdentificationList: [],
        emailAddressList: [],
        telecomNumberList: [],
        postalAddressList: [],
        payments: [],
        partyNoteList: [],
        contentList: []
      }
    };

    partyServiceSpy.getCustomer.and.returnValue(of(mockCustomer));

    fixture.detectChanges();

    expect(partyServiceSpy.getCustomer).toHaveBeenCalledWith('TEST_ID');
    expect(component.customerDetail.firstName).toBe('Test');
    expect(component.roles).toEqual([]);
  });

  it('should call deleteContactMech when deleting phone', () => {
    dialogSpy.open.and.returnValue({ afterClosed: () => of(true) } as any);
    partyServiceSpy.deleteContactMech.and.returnValue(of({}));

    const params = { partyId: 'TEST_ID' };
    component['partyId'] = 'TEST_ID';
    component.getCustomer = jasmine.createSpy('getCustomer');

    component['deletePhoneDialog'](params);

    expect(partyServiceSpy.deleteContactMech).toHaveBeenCalledTimes(1);
  });
});
