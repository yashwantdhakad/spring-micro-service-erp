import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ProductComponent } from './product/product.component';
import { CreateProductComponent } from './create-product/create-product.component';
import { ProductDetailComponent } from './product-detail/product-detail.component';

const routes: Routes = [
  {
    path: '',
    children: [
      { path: '', component: ProductComponent, data: { title: 'Products List' } },
      { path: 'create', component: CreateProductComponent, data: { title: 'Create Product' } },
      { path: ':productId', component: ProductDetailComponent, data: { title: 'Product Details' } },
    ],
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class ProductRoutingModule {}
