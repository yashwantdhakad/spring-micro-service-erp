import { Component, OnDestroy, OnInit } from '@angular/core';
import { FormControl } from '@angular/forms';
import { CategoryService } from 'src/app/services/category/category.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service'; // Import SnackbarService
import { CommonService } from 'src/app/services/common/common.service';
import { Subject } from 'rxjs';
import { debounceTime, distinctUntilChanged, finalize, map, startWith, switchMap, takeUntil, tap } from 'rxjs/operators';

@Component({
  selector: 'app-category',
  templateUrl: './category.component.html',
  styleUrls: ['./category.component.css'],
})
export class CategoryComponent implements OnInit, OnDestroy {
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
    { key: 'productCategoryId', header: 'CATEGORY.ID' },
    { key: 'categoryName', header: 'CATEGORY.NAME' },
    { key: 'productCategoryTypeId', header: 'CATEGORY.TYPE' },
  ];
  categoryTypeMap = new Map<string, string>();
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
        tap(() => (this.isLoading = true)),
        switchMap((value) =>
          this.categoryService
            .getCategories(0, value)
            .pipe(finalize(() => (this.isLoading = false)))
        ),
        takeUntil(this.destroy$)
      )
      .subscribe({
        next: (response) => {
          const { body, headers } = response;
          this.items = body;
          this.pages = parseInt(headers.get('x-total-count') || '0', 10);
        },
        error: () => {
          this.snackbarService.showError('Error fetching categories');
        },
      });
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
    this.categoryService.getCategories(page - 1, queryString)
      .pipe(finalize(() => (this.isLoading = false)))
      .subscribe({
      next: (response) => {
        const { body, headers } = response;
        this.items = body;
        this.pages = parseInt(headers.get('x-total-count') || '0', 10);
      },
      error: () => {
        this.snackbarService.showError('Error fetching categories');
      },
    });
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
