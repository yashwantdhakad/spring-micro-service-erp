// shared.module.ts
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { PartyAddressListComponent } from '../../party/party-address/party-address-list.component';
import { ShippingInstructionDialogComponent } from '../../order/shipping-instruction-dialog/shipping-instruction-dialog.component';
import { AddEditAddressComponent } from '../../party/add-edit-address/add-edit-address.component';
import { AddEditEmailComponent } from '../../party/add-edit-email/add-edit-email.component';
import { AddEditPhoneComponent } from '../../party/add-edit-phone/add-edit-phone.component';
import { AddRoleComponent } from '../../party/add-role/add-role.component';
import { AddClassificationComponent } from '../../party/add-classification/add-classification.component';
import { AddIdentificationComponent } from '../../party/add-identification/add-identification.component';
import { AddEditCreditCardComponent } from '../../party/add-edit-credit-card/add-edit-credit-card.component';
import { AddEditBankAccountComponent } from '../../party/add-edit-bank-account/add-edit-bank-account.component';
import { PartyNoteComponent } from '../../party/party-note/party-note.component';
import { PartyContentComponent } from '../../party/party-content/party-content.component';
import { MaterialModule } from '../../common/material/material.module';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { TranslateLoader, TranslateModule } from '@ngx-translate/core';
import { TranslateHttpLoader } from '@ngx-translate/http-loader';
import { HttpClient } from '@angular/common/http';

export function HttpLoaderFactory(http: HttpClient) {
  return new TranslateHttpLoader(http, './assets/i18n/', '.json');
}

@NgModule({
  declarations: [
    PartyAddressListComponent,
    ShippingInstructionDialogComponent,
    AddEditAddressComponent,
    AddEditEmailComponent,
    AddEditPhoneComponent,
    AddRoleComponent,
    AddClassificationComponent,
    AddIdentificationComponent,
    AddEditCreditCardComponent,
    AddEditBankAccountComponent,
    PartyNoteComponent,
    PartyContentComponent
  ],
  imports: [
    CommonModule,
    FormsModule,
    ReactiveFormsModule,
    MaterialModule,
    TranslateModule.forChild({
      loader: {
        provide: TranslateLoader,
        useFactory: HttpLoaderFactory,
        deps: [HttpClient]
      }
    })
  ],
  exports: [
    PartyAddressListComponent,
    ShippingInstructionDialogComponent,
    AddEditAddressComponent,
    AddEditEmailComponent,
    AddEditPhoneComponent,
    AddRoleComponent,
    AddClassificationComponent,
    AddIdentificationComponent,
    AddEditCreditCardComponent,
    AddEditBankAccountComponent,
    PartyNoteComponent,
    PartyContentComponent
  ] // So other modules can use it
})
export class SharedModule { }
