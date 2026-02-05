// shared.module.ts
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { PartyAddressListComponent } from '../../party/party-address/party-address-list.component';
import { ShippingInstructionDialogComponent } from '../../order/shipping-instruction-dialog/shipping-instruction-dialog.component';
import { MaterialModule } from '../../common/material/material.module';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { TranslateLoader, TranslateModule } from '@ngx-translate/core';
import { TranslateHttpLoader } from '@ngx-translate/http-loader';
import { HttpClient } from '@angular/common/http';

export function HttpLoaderFactory(http: HttpClient) {
  return new TranslateHttpLoader(http, './assets/i18n/', '.json');
}

@NgModule({
  declarations: [PartyAddressListComponent, ShippingInstructionDialogComponent],
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
  exports: [PartyAddressListComponent, ShippingInstructionDialogComponent] // So other modules can use it
})
export class SharedModule { }
