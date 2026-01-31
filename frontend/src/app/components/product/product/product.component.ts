import { Component, OnDestroy, OnInit, ViewChild } from '@angular/core';
import { FormControl } from '@angular/forms';
import { MatSort, Sort } from '@angular/material/sort';
import { Subject } from 'rxjs';
import { debounceTime, distinctUntilChanged, finalize, map, startWith, switchMap, takeUntil, tap } from 'rxjs/operators';
import { ProductService } from 'src/app/services/product/product.service';
import { CommonService } from 'src/app/services/common/common.service';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css'],
})
export class ProductComponent implements OnInit, OnDestroy {
  @ViewChild(MatSort) sort?: MatSort;
  isLoading = false;
  queryString = '';
  searchControl = new FormControl('');
  pagination = {
    page: 1,
    rowsPerPage: 10,
  };
  items: any[] = [];
  pages = 0;
  displayedColumns: string[] = ['productId', 'productName', 'internalName', 'description', 'productTypeId'];
  currentSort?: Sort;

  customerColumns = [
    { key: 'productId', header: 'PRODUCT.PRODUCT_ID' },
    { key: 'productName', header: 'PRODUCT.NAME' },
    { key: 'internalName', header: 'PRODUCT.INTERNAL_NAME' },
    { key: 'description', header: 'PRODUCT.DESCRIPTION' },
    { key: 'productTypeId', header: 'PRODUCT.TYPE' },
  ];
  productTypeMap = new Map<string, string>();

  constructor(
    private productService: ProductService,
    private commonService: CommonService
  ) { }

  ngOnInit(): void {
    this.loadProductTypes();
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
          this.productService.getProducts(
            0,
            value,
            this.currentSort?.active,
            this.currentSort?.direction
          )
        ),
        takeUntil(this.destroy$)
      )
      .subscribe({
        next: (data: any) => {
          const list = Array.isArray(data?.documentList) ? data.documentList : [];
          this.items = list;
          this.pages = data?.documentListCount ?? 0;
        },
        error: () => {
          this.items = [];
          this.pages = 0;
        }
      });

    this.getProducts(1, '');
  }

  ngOnDestroy(): void {
    this.destroy$.next();
    this.destroy$.complete();
  }

  onPageChange(pageIndex: number): void {
    const page = pageIndex + 1;
    this.pagination.page = page;
    this.getProducts(page, this.queryString);
  }

  private getProducts(page: number, queryString: string): void {
    this.isLoading = true;
    this.productService
      .getProducts(page - 1, queryString, this.currentSort?.active, this.currentSort?.direction)
      .pipe(finalize(() => this.isLoading = false))
      .subscribe({
        next: (data: any) => {
          const list = Array.isArray(data?.documentList) ? data.documentList : [];
          this.items = list;
          this.pages = data?.documentListCount ?? 0;
        },
        error: (err) => {
          this.items = [];
          this.pages = 0;
        }
      });
  }

  getCustomerColumnKeys(): string[] {
    return this.customerColumns.map((col) => col.key);
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
    this.getProducts(this.pagination.page, this.queryString);
  }

  getValue(element: any, key: string): any {
    if (key === 'productTypeId') {
      const typeId = element?.productTypeId;
      return this.productTypeMap.get(typeId) || typeId;
    }
    return key.split('.').reduce((acc, part) => acc && acc[part], element);
  }


  private loadProductTypes(): void {
    this.commonService.getLookupResults({}, 'product_type').subscribe({
      next: (types: any[]) => {
        const list = Array.isArray(types) ? types : [];
        this.productTypeMap = new Map(
          list.map((type: any) => [
            type.productTypeId,
            type.description || type.productTypeId,
          ])
        );
      },
    });
  }

  private destroy$ = new Subject<void>();
}
