import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { SupplierRoutingModule } from './supplier-routing.module';
import { RouterModule } from '@angular/router';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { TranslateLoader, TranslateModule } from '@ngx-translate/core';
import { TranslateHttpLoader } from '@ngx-translate/http-loader';
import { HttpClient } from '@angular/common/http';

// Components
import { SupplierComponent } from './supplier/supplier.component';
import { CreateSupplierComponent } from './create-supplier/create-supplier.component';
import { SupplierDetailComponent } from './supplier-detail/supplier-detail.component';
import { SupplierProductDialogComponent } from './supplier-product-dialog/supplier-product-dialog.component';
import { SharedModule } from '../common/shared/shared-module';

// Angular Material Modules
import { MaterialModule } from '../../components/common/material/material.module';

@NgModule({
    declarations: [
        SupplierComponent,
        CreateSupplierComponent,
        SupplierDetailComponent,
        SupplierProductDialogComponent,
    ],
    imports: [
        CommonModule,
        SupplierRoutingModule,
        RouterModule,
        FormsModule,
        ReactiveFormsModule,

        // Material Modules
        MaterialModule,
        // Shared Module
        SharedModule,
        TranslateModule.forChild({
            loader: {
                provide: TranslateLoader,
                useFactory: HttpLoaderFactory,
                deps: [HttpClient]
            }
        }),
    ],
})
export class SupplierModule { }

export function HttpLoaderFactory(http: HttpClient) {
    return new TranslateHttpLoader(http, './assets/i18n/', '.json');
}
