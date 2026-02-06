import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FeatureRoutingModule } from './feature-routing.module';
import { RouterModule } from '@angular/router';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { TranslateLoader, TranslateModule } from '@ngx-translate/core';
import { TranslateHttpLoader } from '@ngx-translate/http-loader';
import { HttpClient } from '@angular/common/http';


// Components
import { FeaturesComponent } from './features/features.component';
import { CreateFeatureComponent } from './create-feature/create-feature.component';
import { FeatureDetailComponent } from './feature-detail/feature-detail.component';
import { AddToFeatureGroupComponent } from './add-to-feature-group/add-to-feature-group.component';
import { AddToProductComponent } from './add-to-product/add-to-product.component';
import { EditFeatureComponent } from './edit-feature/edit-feature.component';

// Shared Angular Material Module
import { MaterialModule } from '../../components/common/material/material.module';

@NgModule({
  declarations: [
    FeaturesComponent,
    CreateFeatureComponent,
    FeatureDetailComponent,
    AddToFeatureGroupComponent,
    AddToProductComponent,
    EditFeatureComponent,
  ],
  imports: [
    CommonModule,
    FeatureRoutingModule,
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
    }),
  ],
})
export class FeatureModule { }

export function HttpLoaderFactory(http: HttpClient) {
  return new TranslateHttpLoader(http, './assets/i18n/', '.json');
}