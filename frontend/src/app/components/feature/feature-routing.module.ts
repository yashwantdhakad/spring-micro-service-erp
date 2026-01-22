import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { FeaturesComponent } from './features/features.component';
import { CreateFeatureComponent } from './create-feature/create-feature.component';
import { FeatureDetailComponent } from './feature-detail/feature-detail.component';

const routes: Routes = [
  {
    path: '',
    children: [
      { path: '', component: FeaturesComponent, data: { title: 'Features List' } },
      { path: 'create', component: CreateFeatureComponent, data: { title: 'Create Feature' } },
      { path: ':productFeatureId', component: FeatureDetailComponent, data: { title: 'Feature Details' } },
    ],
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class FeatureRoutingModule {}
