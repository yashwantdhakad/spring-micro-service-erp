import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { TranslateLoader, TranslateModule } from '@ngx-translate/core';
import { TranslateHttpLoader } from '@ngx-translate/http-loader';
import { HttpClient } from '@angular/common/http';

import { PicklistRoutingModule } from './picklist-routing.module';
import { PicklistsComponent } from './picklists/picklists.component';
import { PicklistDetailComponent } from './picklist-detail/picklist-detail.component';
import { PicklistAssignPickerDialogComponent } from './picklist-detail/picklist-assign-picker-dialog.component';
import { MaterialModule } from '../../components/common/material/material.module';

@NgModule({
  declarations: [
    PicklistsComponent,
    PicklistDetailComponent,
    PicklistAssignPickerDialogComponent,
  ],
  imports: [
    CommonModule,
    PicklistRoutingModule,
    RouterModule,
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
})
export class PicklistModule {}

export function HttpLoaderFactory(http: HttpClient) {
  return new TranslateHttpLoader(http, './assets/i18n/', '.json');
}
