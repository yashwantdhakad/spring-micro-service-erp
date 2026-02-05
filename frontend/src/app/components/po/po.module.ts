import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { POModuleRouting } from './po-routing.module';
import { RouterModule } from '@angular/router';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { TranslateLoader, TranslateModule } from '@ngx-translate/core';
import { TranslateHttpLoader } from '@ngx-translate/http-loader';
import { HttpClient } from '@angular/common/http';

// Components
import { POComponent } from './po/po.component';
import { CreatePOComponent } from './create-po/create-po.component';
import { PODetailComponent } from './po-detail/po-detail.component';
import { POReceiveComponent } from './po-receive/po-receive.component';
import { SharedModule } from '../common/shared/shared-module';

// Shared Angular Material Module
import { MaterialModule } from '../../components/common/material/material.module';

@NgModule({
  declarations: [
    POComponent,
    CreatePOComponent,
    PODetailComponent,
    POReceiveComponent,
  ],
  imports: [
    CommonModule,
    POModuleRouting,
    RouterModule,
    FormsModule,
    ReactiveFormsModule,
    MaterialModule,
    SharedModule,
    TranslateModule.forChild({
      loader: {
        provide: TranslateLoader,
        useFactory: HttpLoaderFactory,
        deps: [HttpClient]
      }
    }),
  ],
})
export class POModule {}

export function HttpLoaderFactory(http: HttpClient) {
  return new TranslateHttpLoader(http, './assets/i18n/', '.json');
}
