import { Component, OnInit } from '@angular/core';
import { FeatureService } from 'src/app/services/features/feature.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';
import { finalize } from 'rxjs/operators';
import { HttpResponse } from '@angular/common/http';

@Component({
  standalone: false,
  selector: 'app-features',
  templateUrl: './features.component.html',
  styleUrls: ['./features.component.css'],
})
export class FeaturesComponent implements OnInit {
  isLoading = false;
  queryString = '';
  pagination = {
    page: 1,
    rowsPerPage: 10,
  };
  items: any[] = [];
  pages = 0;

  displayedColumns = [
    { key: 'productFeatureId', header: 'FEATURE.ID' },
    { key: 'description', header: 'COMMON.DESCRIPTION' },
    { key: 'abbrev', header: 'FEATURE.ABBREV' },
    { key: 'productFeatureTypeEnumId', header: 'COMMON.TYPE_ID' },
  ];

  constructor(
    private featureService: FeatureService,
    private snackbarService: SnackbarService
  ) { }

  ngOnInit(): void {
    this.isLoading = true;
    this.fetchFeatures(this.pagination.page, this.queryString);
  }

  fetchFeatures(page: number, query: string): void {
    this.featureService.getFeatures(page - 1, query)
      .pipe(finalize(() => (this.isLoading = false)))
      .subscribe({
        next: (response: HttpResponse<any[]>) => {
          this.items = response.body ?? [];
          const totalCount = response.headers?.get('x-total-count');
          this.pages = totalCount ? parseInt(totalCount, 10) : 0;
        },
        error: (error) => {
          this.snackbarService.showError('Error fetching features');
        },
      });
  }

  getValue(item: any, key: string): any {
    return key.split('.').reduce((acc, part) => acc && acc[part], item);
  }

  getColumnKeys(): string[] {
    return this.displayedColumns.map(col => col.key);
  }
}
