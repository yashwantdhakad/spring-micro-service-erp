import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PicklistsComponent } from './picklists/picklists.component';
import { PicklistCreateComponent } from './picklist-create/picklist-create.component';
import { PicklistDetailComponent } from './picklist-detail/picklist-detail.component';

const routes: Routes = [
  { path: '', component: PicklistsComponent },
  { path: 'create', component: PicklistCreateComponent },
  { path: ':picklistId', component: PicklistDetailComponent },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class PicklistRoutingModule {}
