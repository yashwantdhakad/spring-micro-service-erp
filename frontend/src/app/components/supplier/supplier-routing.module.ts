import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { SupplierComponent } from './supplier/supplier.component';
import { CreateSupplierComponent } from './create-supplier/create-supplier.component';
import { SupplierDetailComponent } from './supplier-detail/supplier-detail.component';

const routes: Routes = [
  {
    path: '',
    children: [
      { path: '', component: SupplierComponent, data: { title: 'Suppliers List' } },
      { path: 'create', component: CreateSupplierComponent, data: { title: 'Create Supplier' } },
      { path: ':partyId', component: SupplierDetailComponent, data: { title: 'Supplier Details' } },
    ],
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class SupplierRoutingModule {}
