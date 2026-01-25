import { Component, OnDestroy, OnInit } from '@angular/core';
import { FormControl } from '@angular/forms';
import { Subject } from 'rxjs';
import { debounceTime, distinctUntilChanged, finalize, map, startWith, switchMap, takeUntil, tap } from 'rxjs/operators';
import { ProductService } from 'src/app/services/product/product.service';

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
  displayedColumns: string[] = ['productId', 'productName', 'productTypeId'];

  customerColumns = [
    { key: 'productId', header: 'COMMON.ID' },
    { key: 'productName', header: 'PRODUCT.NAME' },
    { key: 'productTypeId', header: 'PRODUCT.TYPE' },
  ];

  constructor(private productService: ProductService) { }

  ngOnInit(): void {
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
    return key.split('.').reduce((acc, part) => acc && acc[part], element);
  }

  private destroy$ = new Subject<void>();
}
