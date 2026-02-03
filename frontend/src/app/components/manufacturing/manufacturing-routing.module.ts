import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { JobsComponent } from './jobs/jobs.component';
import { CreateJobComponent } from './create-job/create-job.component';
import { JobDetailComponent } from './job-detail/job-detail.component';
import { BomsComponent } from './boms/boms.component';
import { BomDetailComponent } from './bom-detail/bom-detail.component';
import { BomCreateComponent } from './bom-create/bom-create.component';

const routes: Routes = [
  {
    path: '',
    children: [
      { path: 'boms/create', component: BomCreateComponent, data: { title: 'Create BOM' } },
      { path: 'boms', component: BomsComponent, data: { title: 'BOMs' } },
      { path: 'boms/:productId', component: BomDetailComponent, data: { title: 'BOM Detail' } },
      { path: '', component: JobsComponent, data: { title: 'Jobs List' } },
      { path: 'create', component: CreateJobComponent, data: { title: 'Create Job' } },
      { path: ':workEffortId', component: JobDetailComponent, data: { title: 'Job Details' } },
    ],
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class ManufacturingRoutingModule {}
