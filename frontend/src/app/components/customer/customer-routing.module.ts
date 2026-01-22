import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CustomerComponent } from './customer/customer.component';
import { CreateCustomerComponent } from './create-customer/create-customer.component';
import { CustomerDetailComponent } from './customer-detail/customer-detail.component';

const routes: Routes = [
  {
    path: '',
    children: [
      { path: '', component: CustomerComponent, data: { title: 'Customers List' } },
      { path: 'create', component: CreateCustomerComponent, data: { title: 'Create Customer' } },
      { path: ':partyId', component: CustomerDetailComponent, data: { title: 'Customer Details' } },
    ],
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class CustomerRoutingModule {}
