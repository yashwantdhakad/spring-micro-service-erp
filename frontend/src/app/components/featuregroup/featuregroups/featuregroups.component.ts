import { ChangeDetectorRef, Component, OnInit } from '@angular/core';
import { FeatureGroupService } from 'src/app/services/featuregroup/feature-group.service';
import { finalize } from 'rxjs/operators';
import { HttpResponse } from '@angular/common/http';

@Component({
  standalone: false,
  selector: 'app-featuregroups',
  templateUrl: './featuregroups.component.html',
  styleUrls: ['./featuregroups.component.css'],
})
export class FeaturegroupsComponent implements OnInit {
  isLoading = false;
  queryString = '';
  pagination = {
    page: 1,
    rowsPerPage: 10,
  };
  items: any[] = [];
  pages = 0;

  displayedColumns = [
    { key: 'productFeatureGroupId', header: 'FEATUREGROUP.ID' },
    { key: 'description', header: 'COMMON.DESCRIPTION' },
  ];

  constructor(
    private featureGroupService: FeatureGroupService,
    private cdr: ChangeDetectorRef
  ) {}

  ngOnInit(): void {
    this.isLoading = true;
    this.fetchFeatureGroups(this.pagination.page, this.queryString);
  }

  fetchFeatureGroups(page: number, query: string): void {
    const pageIndex = page - 1;

    this.featureGroupService.getFeatureGroups(pageIndex, query)
      .subscribe({
        next: (response: HttpResponse<any[]>) => {
          this.items = response.body ?? [];
          const totalCount = response.headers?.get('x-total-count');
          this.pages = totalCount ? parseInt(totalCount, 10) : 0;
          this.isLoading = false;
          this.cdr.detectChanges();
        },
        error: (error) => {
          this.isLoading = false;
          this.cdr.detectChanges();
        }
      });
  }

  getColumnKeys(): string[] {
    return this.displayedColumns.map(col => col.key);
  }
}
