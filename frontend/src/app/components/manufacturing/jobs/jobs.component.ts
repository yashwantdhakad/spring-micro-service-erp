import { Component, OnInit } from '@angular/core';
import { ManufacturingService } from 'src/app/services/manufacturing/manufacturing.service';
import { finalize } from 'rxjs/operators';

@Component({
  selector: 'app-jobs',
  templateUrl: './jobs.component.html',
  styleUrls: ['./jobs.component.css'],
})
export class JobsComponent implements OnInit {
  isLoading: boolean = false;
  queryString: string = '';
  pagination = {
    page: 1,
    rowsPerPage: 10,
  };
  items: any[] = [];
  pages: number = 0;

  displayedColumns: { key: string; header: string }[] = [
    { key: 'workEffortId', header: 'MANUFACTURING.JOB_ID' },
    { key: 'workEffortName', header: 'MANUFACTURING.JOB_NAME' },
    { key: 'facilityId', header: 'MANUFACTURING.FACILITY_ID' },
    { key: 'statusId', header: 'MANUFACTURING.STATUS_ID' },
    { key: 'estimatedStartDate', header: 'MANUFACTURING.START_DATE' },
  ];
  displayedColumnKeys: string[] = [];

  constructor(private manufacturingService: ManufacturingService) { }

  ngOnInit(): void {
    this.isLoading = true;
    this.displayedColumnKeys = this.displayedColumns.map(col => col.key);
    this.getJobs(1, '');
  }

  getJobs(page: number, queryString: string): void {
    this.manufacturingService
      .getJobs(page - 1, queryString)
      .pipe(finalize(() => (this.isLoading = false)))
      .subscribe({
        next: (response) => {
          this.items = response.body ?? [];
          const totalCountHeader = response.headers.get('x-total-count');
          this.pages = totalCountHeader ? parseInt(totalCountHeader, 10) : 0;
        },
        error: (error) => {
        },
      });

  }
}
