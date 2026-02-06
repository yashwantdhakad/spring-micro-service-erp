import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { SOComponent } from './so/so.component';
import { CreateSOComponent } from './create-so/create-so.component';
import { SODetailComponent } from './so-detail/so-detail.component';

const routes: Routes = [
  {
    path: '',
    children: [
      { path: '', component: SOComponent, data: { title: 'SO List' } },
      { path: 'create', component: CreateSOComponent, data: { title: 'Create SO' } },
      { path: ':id', component: SODetailComponent, data: { title: 'SO Details' } },
    ],
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class SOModuleRouting {}
