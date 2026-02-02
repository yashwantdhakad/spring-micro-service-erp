import { Component, OnDestroy, OnInit, ViewChild } from '@angular/core';
import { FormControl } from '@angular/forms';
import { MatSort, Sort } from '@angular/material/sort';
import { CategoryService } from 'src/app/services/category/category.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service'; // Import SnackbarService
import { CommonService } from 'src/app/services/common/common.service';
import { Subject } from 'rxjs';
import { debounceTime, distinctUntilChanged, finalize, map, startWith, switchMap, takeUntil, tap } from 'rxjs/operators';

@Component({
  standalone: false,
  selector: 'app-category',
  templateUrl: './category.component.html',
  styleUrls: ['./category.component.css'],
})
export class CategoryComponent implements OnInit, OnDestroy {
  @ViewChild(MatSort) sort?: MatSort;
  isLoading: boolean = false;
  queryString: string = '';
  searchControl = new FormControl('');
  pagination = {
    page: 1,
    rowsPerPage: 10,
  };
  items: any[] = [];
  pages: number = 0;
  displayedColumns = [
    { key: 'productCategoryId', header: 'COMMON.ID' },
    { key: 'categoryName', header: 'CATEGORY.NAME' },
    { key: 'productCategoryTypeId', header: 'CATEGORY.TYPE' },
  ];
  categoryTypeMap = new Map<string, string>();
  currentSort?: Sort;
  private destroy$ = new Subject<void>();

  constructor(
    private categoryService: CategoryService,
    private snackbarService: SnackbarService, // Inject SnackbarService
    private commonService: CommonService
  ) { }

  ngOnInit(): void {
    this.loadCategoryTypes();
    this.searchControl.valueChanges
      .pipe(
        startWith(''),
        map((value) => (value ?? '').toString()),
        debounceTime(300),
        distinctUntilChanged(),
        tap((value) => {
          this.queryString = value;
          this.pagination.page = 1;
        }),
        switchMap((value) =>
          this.categoryService.getCategories(
            0,
            value,
            this.currentSort?.active,
            this.currentSort?.direction
          )
        ),
        takeUntil(this.destroy$)
      )
      .subscribe({
        next: (response) => {
          const { body, headers } = response;
          const list = Array.isArray(body) ? body : [];
          this.items = list;
          this.pages = parseInt(headers.get('x-total-count') || '0', 10);
        },
        error: () => {
          this.snackbarService.showError('Error fetching categories');
        },
      });

    this.getCategories(1, '');
  }

  ngOnDestroy(): void {
    this.destroy$.next();
    this.destroy$.complete();
  }

  onPageChange(pageIndex: number): void {
    const page = pageIndex + 1;
    this.pagination.page = page;
    this.getCategories(page, this.queryString);
  }

  private getCategories(page: number, queryString: string): void {
    this.isLoading = true;
    this.categoryService.getCategories(page - 1, queryString, this.currentSort?.active, this.currentSort?.direction)
      .pipe(finalize(() => (this.isLoading = false)))
      .subscribe({
      next: (response) => {
        const { body, headers } = response;
        const list = Array.isArray(body) ? body : [];
        this.items = list;
        this.pages = parseInt(headers.get('x-total-count') || '0', 10);
      },
      error: () => {
        this.snackbarService.showError('Error fetching categories');
      },
    });
  }

  onSortChange(sort: Sort): void {
    let direction = sort.direction;
    if (!direction) {
      if (this.currentSort?.active === sort.active) {
        direction = this.currentSort.direction === 'asc' ? 'desc' : 'asc';
      } else {
        direction = 'asc';
      }
    } else if (this.currentSort?.active === sort.active && this.currentSort.direction === direction) {
      direction = direction === 'asc' ? 'desc' : 'asc';
    }
    this.currentSort = { active: sort.active, direction };
    if (this.sort) {
      this.sort.active = sort.active;
      this.sort.direction = direction;
    }
    this.getCategories(this.pagination.page, this.queryString);
  }


  getColumnKeys(): string[] {
    return this.displayedColumns.map(col => col.key);
  }

  getValue(item: any, key: string): any {
    if (key === 'productCategoryTypeId') {
      const typeId = item?.productCategoryTypeId;
      return this.categoryTypeMap.get(typeId) || typeId;
    }
    return item?.[key];
  }


  private loadCategoryTypes(): void {
    this.commonService.getLookupResults({}, 'product_category_type').subscribe({
      next: (types: any[]) => {
        const list = Array.isArray(types) ? types : [];
        this.categoryTypeMap = new Map(
          list.map((type: any) => [
            type.productCategoryTypeId,
            type.description || type.productCategoryTypeId,
          ])
        );
      },
    });
  }
}
