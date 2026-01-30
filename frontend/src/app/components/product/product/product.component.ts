import { Component, OnDestroy, OnInit } from '@angular/core';
import { FormControl } from '@angular/forms';
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
        tap(() => (this.isLoading = true)),
        switchMap((value) =>
          this.productService
            .getProducts(0, value)
            .pipe(finalize(() => (this.isLoading = false)))
        ),
        takeUntil(this.destroy$)
      )
      .subscribe({
        next: (data: any) => {
          this.items = data?.documentList ?? [];
          this.pages = data?.documentListCount ?? 0;
        },
        error: () => {
          this.items = [];
          this.pages = 0;
        }
      });
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
      .getProducts(page - 1, queryString)
      .pipe(finalize(() => this.isLoading = false))
      .subscribe({
        next: (data: any) => {
          this.items = data?.documentList ?? [];
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
