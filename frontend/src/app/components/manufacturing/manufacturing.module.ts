import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ManufacturingRoutingModule } from './manufacturing-routing.module';
import { RouterModule } from '@angular/router';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { TranslateLoader, TranslateModule } from '@ngx-translate/core';
import { TranslateHttpLoader } from '@ngx-translate/http-loader';
import { HttpClient } from '@angular/common/http';

// Components
import { JobsComponent } from './jobs/jobs.component';
import { CreateJobComponent } from './create-job/create-job.component';
import { JobDetailComponent } from './job-detail/job-detail.component';
import { ConsumableItemComponent } from './consumable-item/consumable-item.component';
import { ProduceItemComponent } from './produce-item/produce-item.component';
import { BomsComponent } from './boms/boms.component';
import { BomDetailComponent } from './bom-detail/bom-detail.component';
import { BomAddComponentDialogComponent } from './bom-add-component-dialog/bom-add-component-dialog.component';
import { BomCreateComponent } from './bom-create/bom-create.component';
import { BomCreateItemDialogComponent } from './bom-create-item-dialog/bom-create-item-dialog.component';

// Shared Angular Material Module
import { MaterialModule } from '../../components/common/material/material.module';

@NgModule({
  declarations: [
    JobsComponent,
    CreateJobComponent,
    JobDetailComponent,
    ConsumableItemComponent,
    ProduceItemComponent,
    BomsComponent,
    BomDetailComponent,
    BomAddComponentDialogComponent,
    BomCreateComponent,
    BomCreateItemDialogComponent,
  ],
  imports: [
    CommonModule,
    ManufacturingRoutingModule,
    RouterModule,
    FormsModule,
    ReactiveFormsModule,
    MaterialModule,
    TranslateModule.forChild({
      loader: {
        provide: TranslateLoader,
        useFactory: HttpLoaderFactory,
        deps: [HttpClient]
      }
    }),
  ],
})
export class ManufacturingModule {}

export function HttpLoaderFactory(http: HttpClient) {
  return new TranslateHttpLoader(http, './assets/i18n/', '.json');
}
