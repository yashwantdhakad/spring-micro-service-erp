import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutComponent } from './components/about/about.component';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { HomeGuard } from './home.guard';

const routes: Routes = [
  { path: 'home', component: HomeComponent, canActivate: [HomeGuard] },
  { path: 'login', component: LoginComponent },
  { path: 'about', component: AboutComponent },
  {
    path: 'customers',
    loadChildren: () =>
      import('./components/customer/customer.module').then((m) => m.CustomerModule),
  },
  {
    path: 'suppliers',
    loadChildren: () =>
      import('./components/supplier/supplier.module').then((m) => m.SupplierModule),
  },
  {
    path: 'users',
    loadChildren: () =>
      import('./components/user/user.module').then((m) => m.UserModule),
  },
  {
    path: 'products',
    loadChildren: () =>
      import('./components/product/product.module').then((m) => m.ProductModule),
  },
  {
    path: 'features',
    loadChildren: () =>
      import('./components/feature/feature.module').then((m) => m.FeatureModule),
  },
  // {
  //   path: 'featuregroups',
  //   loadChildren: () =>
  //     import('./components/featuregroup/featuregroup.module').then((m) => m.FeaturegroupModule),
  // },
  {
    path: 'category',
    loadChildren: () =>
      import('./components/category/category.module').then((m) => m.CategoryModule),
  },
  {
    path: 'orders',
    loadChildren: () =>
      import('./components/so/so.module').then((m) => m.SOModule),
  },
  {
    path: 'pos',
    loadChildren: () =>
      import('./components/po/po.module').then((m) => m.POModule),
  },
  {
    path: 'shipments',
    loadChildren: () =>
      import('./components/shipment/shipment.module').then((m) => m.ShipmentModule),
  },
  {
    path: 'assets',
    loadChildren: () =>
      import('./components/asset/asset.module').then((m) => m.AssetModule),
  },
  {
    path: 'facilities',
    loadChildren: () =>
      import('./components/facility/facility.module').then((m) => m.FacilityModule),
  },
  {
    path: 'jobs',
    loadChildren: () =>
      import('./components/manufacturing/manufacturing.module').then((m) => m.ManufacturingModule),
  },
  {
    path: 'picklists',
    loadChildren: () =>
      import('./components/picklist/picklist.module').then((m) => m.PicklistModule),
  },
  { path: '', redirectTo: '/home', pathMatch: 'full' },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule { }
