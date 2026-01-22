import { Component } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { ActivatedRoute } from '@angular/router';
import { Store, select } from '@ngrx/store';
import { AddEditAddressComponent } from 'src/app/components/party/add-edit-address/add-edit-address.component';
import { AddEditEmailComponent } from 'src/app/components/party/add-edit-email/add-edit-email.component';
import { AddEditPhoneComponent } from 'src/app/components/party/add-edit-phone/add-edit-phone.component';
import { AddIdentificationComponent } from 'src/app/components/party/add-identification/add-identification.component';
import { AddRoleComponent } from 'src/app/components/party/add-role/add-role.component';
import { filterGeoRecords } from 'src/app/helpers/geo-type-helper';
import { PartyService } from 'src/app/services/party/party.service';
import { loadGeos } from 'src/app/store/geo/geo.actions';
import { selectGeoList } from 'src/app/store/geo/geo.selector';
import { GeoState } from 'src/app/store/geo/geo.state';
import { ConfirmationDialogComponent } from '../../common/confirmation-dialog/confirmation-dialog.component';
import { EditSupplierComponent } from '../edit-supplier/edit-supplier.component';
import { AddEditCreditCardComponent } from '../../party/add-edit-credit-card/add-edit-credit-card.component';
import { AddEditBankAccountComponent } from '../../party/add-edit-bank-account/add-edit-bank-account.component';
import { PartyNoteComponent } from '../../party/party-note/party-note.component';
import { finalize } from 'rxjs';

@Component({
  selector: 'app-supplier-detail',
  templateUrl: './supplier-detail.component.html',
  styleUrls: ['./supplier-detail.component.css'],
})
export class SupplierDetailComponent {
  roles: any;
  partyIdentificationList: any;
  postalAddressList: any;
  emailAddressList: any;
  telecomNumberList: any;
  payments: any;
  isLoading: boolean = false;
  partyId: string | undefined;

  supplierDetail: any;
  partyRoleList: any;
  primaryAddressList: any;
  primaryPhoneList: any;
  billingPhoneList: any;
  shippingPhoneList: any;
  shippingAddressList: any;
  billingAddress: any;
  addEditAddress: any;
  shippingEmailAddressList: any;
  billingEmailAddressList: any;
  addEditEmailAddress: any;
  primaryEmailAddressList: any;
  primaryEmailAddress: any;
  identificationData: any;
  roleData: any;
  emailPhoneData: any;
  addEditPhoneData: any;
  addEditEmailData: any;
  addressData: any;
  countries: any;
  states: any;
  geoRecords: any[] | undefined;
  roleTypes: any[] | undefined;
  creditCardData: any;
  bankAccountData: any;
  noteData: any;

  partyNotes: any;
  noteColumns: string[] = ['noteText', 'noteDate', 'userId', 'action'];

  constructor(
    private partyService: PartyService,
    private route: ActivatedRoute,
    private dialog: MatDialog,
    private store: Store<GeoState>
  ) {}

  ngOnInit(): void {
    this.route.params.subscribe((params) => {
      this.partyId = params['partyId'];
      if (this.partyId) {
        this.isLoading = true;
        this.getSupplier(this.partyId);
      }
    });

    this.store.dispatch(loadGeos());
    this.store.pipe(select(selectGeoList)).subscribe((geoListObject: any) => {
      if (geoListObject) {
        this.countries = filterGeoRecords(geoListObject, 'GEOT_COUNTRY');
        this.states = filterGeoRecords(geoListObject, 'GEOT_STATE');
      }
    });
  }

  getSupplier(partyId: string): void {
    this.partyService.getSupplier(partyId).pipe(
      finalize(() => (this.isLoading = false))
    ).subscribe({
      next: (response) => {
        const { supplierDetail } = response;
        const {
          partyRoleList,
          party,
          partyIdentificationList,
          emailAddressList,
          telecomNumberList,
          postalAddressList,
          payments,
          partyNoteList,
        } = supplierDetail;

        this.roles = partyRoleList;
        this.supplierDetail = party;
        this.partyRoleList = partyRoleList;
        this.partyIdentificationList = partyIdentificationList;
        this.emailAddressList = emailAddressList;
        this.telecomNumberList = telecomNumberList;
        this.postalAddressList = postalAddressList;
        this.payments = payments;
        this.partyNotes = partyNoteList;
      },
      error: (err) => {
      },
    });
  }

  filterEmailAddressList(emailAddressList: any, purpose: string) {
    return (
      emailAddressList?.filter(
        (email: any) => email.contactMechPurposeId === purpose
      ) || ''
    );
  }

  filterTelecomNumberList(telecomNumberList: any, purpose: string) {
    return (
      telecomNumberList?.filter(
        (telecomNumber: any) =>
          telecomNumber.contactMechPurposeId === purpose
      ) || ''
    );
  }

  editSupplierDialog() {
    const dialogRef = this.dialog
      .open(EditSupplierComponent, {
        data: {
          supplierDetail: this.supplierDetail,
        },
      })
      .afterClosed()
      .subscribe((result) => {
        if (result && result.partyId) {
          this.getSupplier(result.partyId);
        }
      });
  }

  addIdentificationDialog(params: any = null) {
    this.identificationData = {
      ...params,
      partyId: this.partyId,
    };

    const dialogRef = this.dialog
      .open(AddIdentificationComponent, {
        data: {
          identificationData: this.identificationData,
        },
      })
      .afterClosed()
      .subscribe((result) => {
        if (result && result.partyId) {
          this.getSupplier(result.partyId);
        }
      });
  }

  async deleteIdentificationDialog(params: any): Promise<void> {
    const dialogRef = this.dialog.open(ConfirmationDialogComponent, {
      data: {
        title: 'Identification',
        message: 'Are you sure you want to delete identification?',
      },
    });

    dialogRef.afterClosed().subscribe((result) => {
      if (result) {
        this.partyService.deleteIdentification(params).subscribe(() => {
          this.getSupplier(params.partyId);
        });
      }
    });
  }

  addRoleDialog(params: any = null) {
    const roleData = {
      ...params,
      partyId: this.partyId,
    };

    const dialogRef = this.dialog.open(AddRoleComponent, {
      data: { roleData },
    });

    dialogRef.afterClosed().subscribe((result) => {
      if (result && result.partyId) {
        this.getSupplier(result.partyId);
      }
    });
  }

  async deleteRoleDialog(params: any): Promise<void> {
    const dialogRef = this.dialog.open(ConfirmationDialogComponent, {
      data: {
        title: 'Role',
        message: 'Are you sure you want to delete role?',
      },
    });

    dialogRef.afterClosed().subscribe((result) => {
      if (result) {
        this.partyService.deleteRole(params).subscribe(() => {
          this.getSupplier(params.partyId);
        });
      }
    });
  }

  addEditPhoneDialog(params: any = null) {
    const addEditPhoneData = params
      ? { ...params, partyId: this.partyId }
      : { partyId: this.partyId };

    const dialogRef = this.dialog
      .open(AddEditPhoneComponent, {
        data: {
          addEditPhoneData,
        },
      })
      .afterClosed()
      .subscribe((result) => {
        if (result && result.partyId) {
          this.getSupplier(result.partyId);
        }
      });
  }

  addEditEmailDialog(params: any = null) {
    const addEditEmailData = params
      ? { ...params, partyId: this.partyId }
      : { partyId: this.partyId };

    const dialogRef = this.dialog
      .open(AddEditEmailComponent, {
        data: { addEditEmailData },
      })
      .afterClosed()
      .subscribe((result) => {
        if (result && result.partyId) {
          this.getSupplier(result.partyId);
        }
      });
  }

  async deleteEmailDialog(params: any): Promise<void> {
    const dialogRef = this.dialog.open(ConfirmationDialogComponent, {
      data: {
        title: 'Delete Email',
        message: 'Are you sure you want to delete this email?',
      },
    });

    dialogRef.afterClosed().subscribe((result) => {
      if (result) {
        this.partyService.deleteEmail(params).subscribe(() => {
          this.getSupplier(params.partyId);
        });
      }
    });
  }

  async deletePhoneDialog(params: any): Promise<void> {
    const dialogRef = this.dialog.open(ConfirmationDialogComponent, {
      data: {
        title: 'Delete Phone',
        message: 'Are you sure you want to delete this contact number?',
      },
    });

    dialogRef.afterClosed().subscribe((result) => {
      if (result) {
        this.partyService.deleteContactMech(params).subscribe(() => {
          this.getSupplier(params.partyId);
        });
      }
    });
  }

  addEditAddressDialog(params: any = null) {
    this.addressData = {
      ...params,
      partyId: this.partyId,
      countries: this.countries,
      states: this.states,
    };

    const dialogRef = this.dialog
      .open(AddEditAddressComponent, {
        data: {
          addressData: this.addressData,
        },
      })
      .afterClosed()
      .subscribe((result) => {
        if (result?.partyId) {
          this.getSupplier(result.partyId);
        }
      });
  }

  addEditCreditCardDialog(params: any = null) {
    this.creditCardData = {
      ...params,
      partyId: this.partyId,
      countries: this.countries,
      states: this.states,
    };

    const dialogRef = this.dialog
      .open(AddEditCreditCardComponent, {
        data: {
          creditCardData: this.creditCardData,
        },
      })
      .afterClosed()
      .subscribe((result) => {
        if (result?.partyId) {
          this.getSupplier(result.partyId);
        }
      });
  }

  maskCreditCardNumber(creditCardNumber: string): string {
    const maskedNumber = creditCardNumber.replace(/\d(?=\d{4})/g, '*');

    return maskedNumber;
  }

  addEditBankAccountDialog(params: any = null) {
    this.bankAccountData = {
      ...params,
      partyId: this.partyId,
      countries: this.countries,
      states: this.states,
    };

    const dialogRef = this.dialog
      .open(AddEditBankAccountComponent, {
        data: {
          bankAccountData: this.bankAccountData,
        },
      })
      .afterClosed()
      .subscribe((result) => {
        if (result?.partyId) {
          this.getSupplier(result.partyId);
        }
      });
  }

  addUpdateNoteDialog(params: any = null) {
    this.noteData = {
      ...params,
      partyId: this.partyId,
    };

    const dialogRef = this.dialog
      .open(PartyNoteComponent, {
        data: {
          noteData: this.noteData,
        },
      })
      .afterClosed()
      .subscribe((result) => {
        if (result?.partyId) {
          this.getSupplier(result.partyId);
        }
      });
  }
  async deleteNoteDialog(params: any): Promise<void> {
    const dialogRef = this.dialog.open(ConfirmationDialogComponent, {
      data: {
        title: 'Delete Note',
        message: 'Are you sure you want to delete this note?',
      },
    });
    dialogRef.afterClosed().subscribe((result) => {
      if (result) {
        this.partyService.deletePartyNote(params).subscribe(() => {
          this.getSupplier(params.partyId);
        });
      }
    });

  }
}
