import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AssetsComponent } from './assets/assets.component';
import { CreateAssetComponent } from './create-asset/create-asset.component';
import { AssetDetailComponent } from './asset-detail/asset-detail.component';

const routes: Routes = [
  {
    path: '',
    children: [
      { path: '', component: AssetsComponent, data: { title: 'Assets List' } },
      { path: 'create', component: CreateAssetComponent, data: { title: 'Create Asset' } },
      { path: ':assetId', component: AssetDetailComponent, data: { title: 'Asset Details' } },
    ],
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class AssetRoutingModule {}
