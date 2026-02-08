import { ChangeDetectorRef, Component, OnDestroy } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MatDialog } from '@angular/material/dialog';
import { ActivatedRoute } from '@angular/router';
import { Store, select } from '@ngrx/store';
import { AddClassificationComponent } from 'src/app/components/party/add-classification/add-classification.component';
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
import { EditCustomerComponent } from '../edit-customer/edit-customer.component';
import { AddEditCreditCardComponent } from '../../party/add-edit-credit-card/add-edit-credit-card.component';
import { AddEditBankAccountComponent } from '../../party/add-edit-bank-account/add-edit-bank-account.component';
import { PartyNoteComponent } from '../../party/party-note/party-note.component';
import { PartyContentComponent } from '../../party/party-content/party-content.component';
import { Subject } from 'rxjs';
import { finalize, takeUntil } from 'rxjs/operators';
import {
  Party,
  PartyRole,
  PartyClassification,
  PartyIdentification,
  PostalAddress,
  EmailAddress,
  TelecomNumber,
  PartyNote,
  PartyContent
} from 'src/app/models/party.model';

@Component({
  standalone: false,
  selector: 'app-customer-detail',
  templateUrl: './customer-detail.component.html',
  styleUrls: ['./customer-detail.component.css'],
})
export class CustomerDetailComponent implements OnDestroy {
  roles: PartyRole[] = [];
  partyClassifications: PartyClassification[] = [];
  partyIdentificationList: PartyIdentification[] = [];
  postalAddressList: PostalAddress[] = [];
  emailAddressList: EmailAddress[] = [];
  telecomNumberList: TelecomNumber[] = [];
  payments: any[] = [];
  emailData: any = {}; // Assuming you have declared the emailData variable
  isLoading: boolean = false;
  emailForm: FormGroup; // Define the form group
  partyId: string | undefined;

  customerDetail: Party | undefined;
  partyRoleList: PartyRole[] = [];
  primaryAddressList: PostalAddress[] = [];
  primaryPhoneList: TelecomNumber[] = [];
  billingPhoneList: TelecomNumber[] = [];
  shippingPhoneList: TelecomNumber[] = [];
  shippingAddressList: PostalAddress[] = [];
  billingAddress: PostalAddress | undefined;
  addEditAddress: any;
  shippingEmailAddressList: EmailAddress[] = [];
  billingEmailAddressList: EmailAddress[] = [];
  addEditEmailAddress: any;
  primaryEmailAddressList: EmailAddress[] = [];
  primaryEmailAddress: EmailAddress | undefined;
  identificationData: any;
  classificationData: any;
  roleData: any;
  emailPhoneData: any;
  addEditPhoneData: any;
  addEditEmailData: any;
  addressData: any;
  countries: any;
  states: any;
  geoRecords: any[] | undefined;
  creditCardData: any;
  bankAccountData: any;

  contents: any[] = [];
  contentColumns: string[] = ['description', 'contentDate', 'contentLocation'];
  contentData: any;

  partyNotes: PartyNote[] = [];
  noteColumns: string[] = ['noteText', 'noteDate', 'userId', 'action'];
  noteData: any;

  constructor(
    private fb: FormBuilder,
    private partyService: PartyService,
    private route: ActivatedRoute,
    private dialog: MatDialog,
    private store: Store<GeoState>,
    private cdr: ChangeDetectorRef
  ) {
    this.emailForm = this.fb.group({
      organizationName: ['', Validators.required],
      emailAddress: ['', [Validators.required, Validators.email]],
      contactNumber: ['', [Validators.required, Validators.minLength(10)]],
      roleTypeId: ['Supplier'],
    });
  }

  private destroy$ = new Subject<void>();

  ngOnInit(): void {
    this.route.params.pipe(takeUntil(this.destroy$)).subscribe((params) => {
      this.partyId = params['partyId'];
      if (this.partyId) {
        setTimeout(() => {
          this.isLoading = true;
          this.cdr.markForCheck();
        }, 0);
        this.getCustomer(this.partyId);
      }
    });

    this.store.dispatch(loadGeos());
    this.store
      .pipe(select(selectGeoList), takeUntil(this.destroy$))
      .subscribe((geoListObject: any) => {
        if (geoListObject) {
          const countries = filterGeoRecords(geoListObject, 'COUNTRY');
          const states = filterGeoRecords(geoListObject, 'STATE');
          setTimeout(() => {
            this.countries = countries;
            this.states = states;
            this.cdr.markForCheck();
          }, 0);
        }
      });
  }

  ngOnDestroy(): void {
    this.destroy$.next();
    this.destroy$.complete();
  }

  getCustomer(partyId: string): void {
    setTimeout(() => {
      this.isLoading = true;
      this.cdr.markForCheck();
    }, 0);
    this.partyService.getCustomer(partyId).subscribe({
      next: (response) => {
        const { customerDetail } = response;
        const {
          partyRoleList,
          party,
          pcaaList,
          partyIdentificationList,
          emailAddressList,
          telecomNumberList,
          postalAddressList,
          payments,
          partyNoteList,
          contentList,
        } = customerDetail;

        setTimeout(() => {
          this.roles = partyRoleList;
          this.customerDetail = party;
          this.partyRoleList = partyRoleList;
          this.partyClassifications = pcaaList;
          this.partyIdentificationList = partyIdentificationList;
          this.emailAddressList = emailAddressList;
          this.telecomNumberList = telecomNumberList;
          this.postalAddressList = postalAddressList;
          this.payments = payments;
          this.partyNotes = partyNoteList;
          this.contents = contentList;
          this.isLoading = false;
          this.cdr.markForCheck();
        }, 0);
      },
      error: () => {
        setTimeout(() => {
          this.isLoading = false;
          this.cdr.markForCheck();
        }, 0);
      },
    });
  }

  filterEmailAddressList(emailAddressList: EmailAddress[], purpose: string): EmailAddress[] {
    return (
      emailAddressList?.filter(
        (email: EmailAddress) => email.contactMechPurposeId === purpose
      ) || []
    );
  }

  filterTelecomNumberList(telecomNumberList: TelecomNumber[], purpose: string): TelecomNumber[] {
    return (
      telecomNumberList?.filter(
        (telecomNumber: TelecomNumber) =>
          telecomNumber.contactMechPurposeId === purpose
      ) || []
    );
  }

  editSupplierDialog() {
    const dialogRef = this.dialog
      .open(EditCustomerComponent, {
        data: {
          customerDetail: this.customerDetail,
        },
      })
      .afterClosed()
      .subscribe((result) => {
        if (result && result.partyId) {
          this.getCustomer(result.partyId);
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
          this.getCustomer(result.partyId);
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
          this.getCustomer(params.partyId);
        });
      }
    });

  }

  addClassificationDialog(params: any = null) {
    const classificationData =
      params && params.classificationTypeEnumId == null
        ? { partyId: this.partyId }
        : { ...params, partyId: this.partyId };

    const dialogRef = this.dialog
      .open(AddClassificationComponent, {
        data: { classificationData },
      })
      .afterClosed()
      .subscribe((result) => {
        if (result?.partyId) {
          this.getCustomer(result.partyId);
        }
      });
  }

  async deleteClassificationDialog(params: any): Promise<void> {
    const dialogRef = this.dialog.open(ConfirmationDialogComponent, {
      data: {
        title: 'Classification',
        message: 'Are you sure you want to delete classification?',
      },
    });

    dialogRef.afterClosed().subscribe((result) => {
      if (result) {
        this.partyService.deleteClassification(params).subscribe(() => {
          this.getCustomer(params.partyId);
        });
      }
    });
  }

  addRoleDialog(params: any = null) {
    const roleData = { ...params, partyId: this.partyId };
    const dialogRef = this.dialog
      .open(AddRoleComponent, {
        data: {
          roleData,
        },
      })
      .afterClosed()
      .subscribe((result) => {
        if (result && result.partyId) {
          this.getCustomer(result.partyId);
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
          this.getCustomer(params.partyId);
        });
      }
    });
  }

  addEditPhoneDialog(params: any = null) {
    const addEditPhoneData = { ...params, partyId: this.partyId };

    const dialogRef = this.dialog
      .open(AddEditPhoneComponent, {
        data: {
          addEditPhoneData,
        },
      })
      .afterClosed()
      .subscribe((result) => {
        if (result && result.partyId) {
          this.getCustomer(result.partyId);
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
          this.getCustomer(result.partyId);
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
          this.getCustomer(params.partyId);
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
          this.getCustomer(params.partyId);
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
          this.getCustomer(result.partyId);
        }
      });
  }

  addEditCreditCardDialog(params: any = null) {
    this.creditCardData = {
      ...params,
      partyId: this.partyId,
      countries: this.countries,
      states: this.states,
      postalAddressList: this.postalAddressList,
      roleTypeId: 'CUSTOMER',
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
          this.getCustomer(result.partyId);
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
          this.getCustomer(result.partyId);
        }
      });
  }

  addUpdateNoteDialog(params: any = null) {
    console.log(params);
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
          this.getCustomer(result.partyId);
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
          this.getCustomer(params.partyId);
        });
      }
    });

  }

  addUpdateContentDialog(params: any = null) {
    this.contentData = {
      ...params,
      partyId: this.partyId,
    };

    const dialogRef = this.dialog
      .open(PartyContentComponent, {
        data: {
          contentData: this.contentData,
        },
      })
      .afterClosed()
      .subscribe((result) => {
        if (result?.partyId) {
          this.getCustomer(result.partyId);
        }
      });
  }

  openPartyContent(item: any): void {
    if (!this.partyId || !item?.contentId) {
      return;
    }
    this.partyService.downloadPartyContent(this.partyId, item.contentId).subscribe({
      next: (blob) => {
        const url = URL.createObjectURL(blob);
        window.open(url, '_blank', 'noopener');
        setTimeout(() => URL.revokeObjectURL(url), 10000);
      },
      error: () => {
      },
    });
  }
}
