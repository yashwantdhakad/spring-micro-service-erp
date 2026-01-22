import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { JobsComponent } from './jobs/jobs.component';
import { CreateJobComponent } from './create-job/create-job.component';
import { JobDetailComponent } from './job-detail/job-detail.component';

const routes: Routes = [
  {
    path: '',
    children: [
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
