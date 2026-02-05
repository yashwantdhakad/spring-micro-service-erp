import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { SOModuleRouting } from './so-routing.module';
import { RouterModule } from '@angular/router';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { TranslateLoader, TranslateModule } from '@ngx-translate/core';
import { TranslateHttpLoader } from '@ngx-translate/http-loader';
import { HttpClient } from '@angular/common/http';

// Components
import { SOComponent } from './so/so.component';
import { CreateSOComponent } from './create-so/create-so.component';
import { SODetailComponent } from './so-detail/so-detail.component';
import { SharedModule } from '../common/shared/shared-module';

// Shared Angular Material Module
import { MaterialModule } from '../../components/common/material/material.module';

@NgModule({
  declarations: [
    SOComponent,
    CreateSOComponent,
    SODetailComponent,
  ],
  imports: [
    CommonModule,
    SOModuleRouting,
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
export class SOModule {}

export function HttpLoaderFactory(http: HttpClient) {
  return new TranslateHttpLoader(http, './assets/i18n/', '.json');
}
