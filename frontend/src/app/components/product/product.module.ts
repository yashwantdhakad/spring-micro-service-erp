import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ProductRoutingModule } from './product-routing.module';
import { RouterModule } from '@angular/router';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { TranslateLoader, TranslateModule } from '@ngx-translate/core';
import { TranslateHttpLoader } from '@ngx-translate/http-loader';
import { HttpClient } from '@angular/common/http';

// Components
import { ProductComponent } from './product/product.component';
import { CreateProductComponent } from './create-product/create-product.component';
import { ProductDetailComponent } from './product-detail/product-detail.component';
import { ProductEditComponent } from './product-edit/product-edit.component';
import { AddEditProductPriceComponent } from './add-edit-product-price/add-edit-product-price.component';
import { ProductContentComponent } from './product-content/product-content.component';
import { ProductAssocComponent } from './product-assoc/product-assoc.component';
import { AddEditProductCategoryComponent } from './add-edit-product-category/add-edit-product-category.component';
import { AddProductFacilityDialogComponent } from './add-product-facility-dialog/add-product-facility-dialog.component';
import { AddProductFacilityLocationDialogComponent } from './add-product-facility-location-dialog/add-product-facility-location-dialog.component';

// Shared Angular Material Modules
import { MaterialModule } from '../../components/common/material/material.module';
import { SupplierModule } from '../supplier/supplier.module';

@NgModule({
  declarations: [
    ProductComponent,
    CreateProductComponent,
    ProductDetailComponent,
    ProductEditComponent,
    AddEditProductPriceComponent,
    ProductContentComponent,
    ProductAssocComponent,
    AddEditProductCategoryComponent,
    AddProductFacilityDialogComponent,
    AddProductFacilityLocationDialogComponent
  ],
  imports: [
    CommonModule,
    ProductRoutingModule,
    RouterModule,
    FormsModule,
    ReactiveFormsModule,

    // Shared Material Module
    MaterialModule,
    SupplierModule,
    TranslateModule.forChild({
      loader: {
        provide: TranslateLoader,
        useFactory: HttpLoaderFactory,
        deps: [HttpClient]
      }
    }),
  ],
})
export class ProductModule { }

export function HttpLoaderFactory(http: HttpClient) {
  return new TranslateHttpLoader(http, './assets/i18n/', '.json');
}
