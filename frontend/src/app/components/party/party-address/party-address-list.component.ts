// party-address-list.component.ts
import { Component, Input, Output, EventEmitter } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { AddEditAddressComponent } from '../add-edit-address/add-edit-address.component';
import { ConfirmationDialogComponent } from '../../common/confirmation-dialog/confirmation-dialog.component';
import { PartyService } from 'src/app/services/party/party.service';

@Component({
  selector: 'app-party-address-list',
  templateUrl: './party-address-list.component.html',
  styleUrls: ['./party-address-list.component.css']
})
export class PartyAddressListComponent {
  @Input() addressList: any[] = [];
  @Input() countries: any[] = [];
  @Input() states: any[] = [];
  @Input() partyId: string = '';
  @Input() editable: boolean = true;
  @Input() purposeId: string = '';  // Example: 'PostalShipping'

  @Output() addressUpdated = new EventEmitter<string>();

  showAllAddresses = false;

  constructor(private dialog: MatDialog, private partyService: PartyService,) { }

  get filteredAddresses() {
    return (this.addressList || []).filter(
      addr => addr?.contactMechPurposeId === this.purposeId
    );
  }

  get visibleAddresses() {
    const list = this.filteredAddresses;
    return this.showAllAddresses ? list : list.slice(0, 2);
  }

  get canToggleAddresses() {
    return this.filteredAddresses.length > 2;
  }

  toggleAddresses(): void {
    this.showAllAddresses = !this.showAllAddresses;
  }


  editAddress(primaryAddress: any = {}): void {
    const addressData = {
      toName: primaryAddress?.toName || '',
      contactMechId: primaryAddress?.contactMechId || '',
      address1: primaryAddress?.address1 || '',
      address2: primaryAddress?.address2 || '',
      city: primaryAddress?.city || '',
      postalCode: primaryAddress?.postalCode || '',
      countryGeoId: primaryAddress?.countryGeoId || 'USA',
      stateProvinceGeoId: primaryAddress?.stateProvinceGeoId || 'UT',
      contactMechPurposeId:
        primaryAddress?.contactMechPurposeId || this.purposeId,

      partyId: this.partyId,
      countries: this.countries,
      states: this.states,
    };
    console.log('addressData', addressData);

    this.dialog
      .open(AddEditAddressComponent, {
        data: { addressData },
      })
      .afterClosed()
      .subscribe((result) => {
        if (this.partyId) {
          this.addressUpdated.emit(this.partyId);
        }
      });
  }

  async deleteAddressDialog(params: any): Promise<void> {
    const dialogRef = this.dialog.open(ConfirmationDialogComponent, {
      data: {
        title: 'Address',
        message: 'Are you sure you want to delete address?',
      },
    });

    dialogRef.afterClosed().subscribe((result) => {
      if (result && this.partyId) {
        this.partyService.deletePostalAddress(params).subscribe(() => {
          this.addressUpdated.emit(this.partyId);
        });
      }
    });
  }

}
