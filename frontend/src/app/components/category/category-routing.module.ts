import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CategoryComponent } from './category/category.component';
import { CreateCategoryComponent } from './create-category/create-category.component';
import { CategoryDetailComponent } from './category-detail/category-detail.component';

const routes: Routes = [
  {
    path: '',
    children: [
      { path: '', component: CategoryComponent, data: { title: 'Category List' } },
      { path: 'create', component: CreateCategoryComponent, data: { title: 'Create Category' } },
      { path: ':productCategoryId', component: CategoryDetailComponent, data: { title: 'Category Details' } },
    ],
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class CategoryRoutingModule {}
