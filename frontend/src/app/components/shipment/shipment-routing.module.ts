import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ShipmentComponent } from './shipment/shipment.component';
import { CreateShipmentComponent } from './create-shipment/create-shipment.component';
import { ShipmentDetailComponent } from './shipment-detail/shipment-detail.component';

const routes: Routes = [
  {
    path: '',
    children: [
      { path: '', component: ShipmentComponent, data: { title: 'Shipments List' } },
      { path: 'create', component: CreateShipmentComponent, data: { title: 'Create Shipment' } },
      { path: ':shipmentId', component: ShipmentDetailComponent, data: { title: 'Shipment Details' } },
    ],
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class ShipmentRoutingModule {}
