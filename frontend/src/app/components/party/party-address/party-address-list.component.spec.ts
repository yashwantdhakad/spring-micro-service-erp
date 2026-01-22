import { ComponentFixture, TestBed } from '@angular/core/testing';
import { PartyAddressListComponent } from './party-address-list.component';
import { MatDialog, MatDialogModule } from '@angular/material/dialog';
import { NO_ERRORS_SCHEMA } from '@angular/core';
import { of } from 'rxjs';
import { PartyService } from 'src/app/services/party/party.service';

describe('PartyAddressListComponent', () => {
  let component: PartyAddressListComponent;
  let fixture: ComponentFixture<PartyAddressListComponent>;
  let dialogSpy: jasmine.SpyObj<MatDialog>;
  let partyServiceSpy: jasmine.SpyObj<PartyService>;

  beforeEach(async () => {
    dialogSpy = jasmine.createSpyObj('MatDialog', ['open']);
    partyServiceSpy = jasmine.createSpyObj('PartyService', ['deletePostalAddress']);

    await TestBed.configureTestingModule({
      declarations: [PartyAddressListComponent],
      imports: [MatDialogModule],
      providers: [
        { provide: MatDialog, useValue: dialogSpy },
        { provide: PartyService, useValue: partyServiceSpy },
      ],
      schemas: [NO_ERRORS_SCHEMA]  // Ignores unknown child components
    }).compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PartyAddressListComponent);
    component = fixture.componentInstance;

    component.partyId = 'PARTY_001';
    component.purposeId = 'PostalShipping';
    component.addressList = [
      {
        postalAddress: {
          toName: 'John Doe',
          address1: '123 Main St',
          city: 'NYC',
          countryGeoId: 'USA',
          postalCode: '10001',
          stateProvinceGeoId: 'USA_NY',
        },
        postalContactMechPurpose: {
          contactMechPurposeId: 'PostalShipping'
        }
      },
      {
        postalAddress: {
          toName: 'Jane Smith',
          address1: '456 Other St',
          city: 'LA',
          countryGeoId: 'USA',
          postalCode: '90001',
          stateProvinceGeoId: 'USA_CA',
        },
        postalContactMechPurpose: {
          contactMechPurposeId: 'Billing'
        }
      }
    ];

    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('should filter addresses by purposeId', () => {
    const filtered = component.filteredAddresses;
    expect(filtered.length).toBe(1);
    expect(filtered[0].postalAddress.toName).toBe('John Doe');
  });

  it('should open dialog and emit addressUpdated on result', () => {
    const afterClosed$ = of({ partyId: 'PARTY_001' });
    dialogSpy.open.and.returnValue({ afterClosed: () => afterClosed$ } as any);

    spyOn(component.addressUpdated, 'emit');

    component.editAddress(component.filteredAddresses[0]);

    expect(dialogSpy.open).toHaveBeenCalled();
    expect(component.addressUpdated.emit).toHaveBeenCalledWith('PARTY_001');
  });

  it('should not emit addressUpdated if dialog result has no partyId', () => {
    dialogSpy.open.and.returnValue({ afterClosed: () => of(null) } as any);

    spyOn(component.addressUpdated, 'emit');

    component.editAddress(component.filteredAddresses[0]);

    expect(component.addressUpdated.emit).not.toHaveBeenCalled();
  });

  it('should delete address when confirmed', () => {
    dialogSpy.open.and.returnValue({ afterClosed: () => of(true) } as any);
    partyServiceSpy.deletePostalAddress.and.returnValue(of({}));
    spyOn(component.addressUpdated, 'emit');

    const params = { contactMechId: 'ID', partyId: 'PARTY_001' };
    component.deleteAddressDialog(params);

    expect(partyServiceSpy.deletePostalAddress).toHaveBeenCalledWith(params);
    expect(component.addressUpdated.emit).toHaveBeenCalledWith('PARTY_001');
  });

  it('should not delete address when cancelled', () => {
    dialogSpy.open.and.returnValue({ afterClosed: () => of(false) } as any);
    spyOn(component.addressUpdated, 'emit');

    const params = { contactMechId: 'ID', partyId: 'PARTY_001' };
    component.deleteAddressDialog(params);

    expect(partyServiceSpy.deletePostalAddress).not.toHaveBeenCalled();
    expect(component.addressUpdated.emit).not.toHaveBeenCalled();
  });
});
