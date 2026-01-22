import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FacilityRoutingModule } from './facility-routing.module';
import { RouterModule } from '@angular/router';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { TranslateLoader, TranslateModule } from '@ngx-translate/core';
import { TranslateHttpLoader } from '@ngx-translate/http-loader';
import { HttpClient } from '@angular/common/http';

// Components
import { FacilityComponent } from './facility/facility.component';
import { FacilityDetailComponent } from './facility-detail/facility-detail.component';
import { FacilityCreateComponent } from './facility-create/facility-create.component';
import { FacilityLocationDialogComponent } from './facility-location-dialog/facility-location-dialog.component';

// Angular Material Modules
import { MaterialModule } from '../common/material/material.module';

export function HttpLoaderFactory(http: HttpClient) {
  return new TranslateHttpLoader(http, './assets/i18n/', '.json');
}

@NgModule({
  declarations: [
    FacilityComponent,
    FacilityDetailComponent,
    FacilityCreateComponent,
    FacilityLocationDialogComponent,
  ],
  imports: [
    CommonModule,
    FacilityRoutingModule,
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
  ]
})
export class FacilityModule { }
