import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AssetRoutingModule } from './asset-routing.module';
import { RouterModule } from '@angular/router';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { TranslateLoader, TranslateModule } from '@ngx-translate/core';
import { TranslateHttpLoader } from '@ngx-translate/http-loader';

export function HttpLoaderFactory(http: HttpClient) {
  return new TranslateHttpLoader(http, './assets/i18n/', '.json');
}


// Components
import { AssetsComponent } from './assets/assets.component';
import { CreateAssetComponent } from './create-asset/create-asset.component';
import { AssetDetailComponent } from './asset-detail/asset-detail.component';

// Shared Angular Material Module
import { MaterialModule } from '../../components/common/material/material.module';
import { HttpClient } from '@angular/common/http';

@NgModule({
  declarations: [
    AssetsComponent,
    CreateAssetComponent,
    AssetDetailComponent,
  ],
  imports: [
    CommonModule,
    AssetRoutingModule,
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
export class AssetModule {}
