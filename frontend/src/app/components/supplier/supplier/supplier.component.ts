import { Component, OnDestroy, OnInit, ViewChild } from '@angular/core';
import { FormControl } from '@angular/forms';
import { MatSort, Sort } from '@angular/material/sort';
import { Subject } from 'rxjs';
import { debounceTime, distinctUntilChanged, finalize, map, startWith, switchMap, takeUntil, tap } from 'rxjs/operators';
import { PartyService } from 'src/app/services/party/party.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';

@Component({
  selector: 'app-supplier',
  templateUrl: './supplier.component.html',
  styleUrls: ['./supplier.component.css'],
})
export class SupplierComponent implements OnInit, OnDestroy {
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
  currentSort?: Sort;
  supplierColumns = [
    { key: 'partyId', header: 'SUPPLIER.ID' },
    { key: 'groupName', header: 'SUPPLIER.NAME' },
    { key: 'contactNumber', header: 'SUPPLIER.PHONE' },
    { key: 'emailAddress', header: 'SUPPLIER.EMAIL' },
  ];

  constructor(
    private partyService: PartyService,
    private snackbarService: SnackbarService
  ) {}

  private destroy$ = new Subject<void>();

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
        switchMap((value) =>
          this.partyService.getSuppliers(
            0,
            value,
            this.currentSort?.active,
            this.currentSort?.direction
          )
        ),
        takeUntil(this.destroy$)
      )
      .subscribe({
        next: (response: any) => {
          const { resultList, documentListCount } = response;
          this.items = resultList;
          this.pages = documentListCount;
        },
        error: () => {
          this.items = [];
          this.pages = 0;
          this.snackbarService.showError('Error fetching suppliers');
        },
      });

    this.getSuppliers(1, '');
  }

  ngOnDestroy(): void {
    this.destroy$.next();
    this.destroy$.complete();
  }

  onPageChange(pageIndex: number): void {
    const page = pageIndex + 1;
    this.pagination.page = page;
    this.getSuppliers(page, this.queryString);
  }

  private getSuppliers(page: number, queryString: string): void {
    this.isLoading = true;
    this.partyService
      .getSuppliers(page - 1, queryString, this.currentSort?.active, this.currentSort?.direction)
      .pipe(finalize(() => (this.isLoading = false)))
      .subscribe({
        next: (response: any) => {
          const { resultList, documentListCount } = response;
          this.items = resultList;
          this.pages = documentListCount;
        },
        error: () => {
          this.items = [];
          this.pages = 0;
          this.snackbarService.showError('Error fetching suppliers');
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
    this.getSuppliers(this.pagination.page, this.queryString);
  }

  getSupplierColumnKeys(): string[] {
    return this.supplierColumns.map((col) => col.key);
  }

  getValue(element: any, key: string): any {
    return key.split('.').reduce((acc, part) => acc && acc[part], element);
  }
}
