import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { FacilityComponent } from './facility/facility.component';
import { FacilityDetailComponent } from './facility-detail/facility-detail.component';
import { FacilityCreateComponent } from './facility-create/facility-create.component';

const routes: Routes = [
  {
    path: '',
    children: [
      { path: '', component: FacilityComponent, data: { title: 'Facilities' } },
      { path: 'create', component: FacilityCreateComponent, data: { title: 'Create Facility' } },
      { path: ':facilityId', component: FacilityDetailComponent, data: { title: 'Facility Detail' } },
    ],
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class FacilityRoutingModule {}
