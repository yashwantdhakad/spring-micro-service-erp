import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ShipmentRoutingModule } from './shipment-routing.module';
import { RouterModule } from '@angular/router';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { TranslateLoader, TranslateModule } from '@ngx-translate/core';
import { TranslateHttpLoader } from '@ngx-translate/http-loader';
import { HttpClient } from '@angular/common/http';

// Components
import { ShipmentComponent } from './shipment/shipment.component';
import { CreateShipmentComponent } from './create-shipment/create-shipment.component';
import { ShipmentDetailComponent } from './shipment-detail/shipment-detail.component';

// Shared Angular Material Module
import { MaterialModule } from '../../components/common/material/material.module';

@NgModule({
  declarations: [
    ShipmentComponent,
    CreateShipmentComponent,
    ShipmentDetailComponent,
  ],
  imports: [
    CommonModule,
    ShipmentRoutingModule,
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
export class ShipmentModule {}

export function HttpLoaderFactory(http: HttpClient) {
  return new TranslateHttpLoader(http, './assets/i18n/', '.json');
}
