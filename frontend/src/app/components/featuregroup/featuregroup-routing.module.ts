import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { FeaturegroupsComponent } from './featuregroups/featuregroups.component';
import { CreateFeaturegroupComponent } from './create-featuregroup/create-featuregroup.component';
import { FeaturegroupDetailComponent } from './featuregroup-detail/featuregroup-detail.component';

const routes: Routes = [
  {
    path: '',
    children: [
      { path: '', component: FeaturegroupsComponent, data: { title: 'Feature Groups List' } },
      { path: 'create', component: CreateFeaturegroupComponent, data: { title: 'Create Feature Group' } },
      { path: ':productFeatureGroupId', component: FeaturegroupDetailComponent, data: { title: 'Feature Group Details' } },
    ],
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class FeaturegroupRoutingModule {}
