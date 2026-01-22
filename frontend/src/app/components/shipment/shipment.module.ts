import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ShipmentRoutingModule } from './shipment-routing.module';
import { RouterModule } from '@angular/router';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

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
  ],
})
export class ShipmentModule {}
