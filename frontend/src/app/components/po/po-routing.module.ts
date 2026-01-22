import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { POComponent } from './po/po.component';
import { CreatePOComponent } from './create-po/create-po.component';
import { PODetailComponent } from './po-detail/po-detail.component';

const routes: Routes = [
  {
    path: '',
    children: [
      { path: '', component: POComponent, data: { title: 'PO List' } },
      { path: 'create', component: CreatePOComponent, data: { title: 'Create PO' } },
      { path: ':orderId', component: PODetailComponent, data: { title: 'PO Details' } },
    ],
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class POModuleRouting {}
