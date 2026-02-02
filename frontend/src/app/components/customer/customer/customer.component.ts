import { Component, OnDestroy, OnInit, ViewChild } from '@angular/core';
import { FormControl } from '@angular/forms';
import { MatSort, Sort } from '@angular/material/sort';
import { PartyService } from 'src/app/services/party/party.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';
import { Subject, asyncScheduler } from 'rxjs';
import { debounceTime, distinctUntilChanged, finalize, map, observeOn, startWith, switchMap, takeUntil, tap } from 'rxjs/operators';

@Component({
  standalone: false,
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css'],
})
export class CustomerComponent implements OnInit, OnDestroy {
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
  private initialLoad = true;

  customerColumns = [
    { key: 'partyId', header: 'COMMON.ID' },
    { key: 'firstName', header: 'CUSTOMER.FIRST_NAME' },
    { key: 'lastName', header: 'CUSTOMER.LAST_NAME' },
    { key: 'contactNumber', header: 'CUSTOMER.PHONE' },
    { key: 'emailAddress', header: 'CUSTOMER.EMAIL' },
  ];

  constructor(
    private partyService: PartyService,
    private snackbarService: SnackbarService
  ) {}

  private destroy$ = new Subject<void>();

  ngOnInit(): void {
    setTimeout(() => this.setupSearch(), 0);
  }

  private setupSearch(): void {
    this.searchControl.valueChanges
      .pipe(
        startWith(''),
        map((value) => (value ?? '').toString()),
        debounceTime(300),
        distinctUntilChanged(),
        tap((value) => {
          this.queryString = value;
          this.pagination.page = 1;
          if (this.initialLoad) {
            this.isLoading = true;
          }
        }),
        switchMap((value) => this.partyService
          .getCustomers(0, value, this.currentSort?.active, this.currentSort?.direction)
          .pipe(finalize(() => {
            if (this.initialLoad) {
              this.isLoading = false;
              this.initialLoad = false;
            }
          }))
        ),
        observeOn(asyncScheduler),
        takeUntil(this.destroy$)
      )
      .subscribe({
        next: (response) => {
          const { resultList, documentListCount } = response;
          setTimeout(() => {
            this.items = resultList;
            this.pages = documentListCount;
          }, 0);
        },
        error: () => {
          this.snackbarService.showError('Error fetching customers');
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
    this.getCustomers(page, this.queryString);
  }

  private getCustomers(page: number, queryString: string): void {
    this.isLoading = true;
    this.partyService
      .getCustomers(page - 1, queryString, this.currentSort?.active, this.currentSort?.direction)
      .pipe(finalize(() => (this.isLoading = false)))
      .subscribe({
        next: (response) => {
          const { resultList, documentListCount } = response;
          this.items = resultList;
          this.pages = documentListCount;
        },
        error: () => {
          this.snackbarService.showError('Error fetching customers');
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
    this.getCustomers(this.pagination.page, this.queryString);
  }

  getCustomerColumnKeys(): string[] {
    return this.customerColumns.map((col) => col.key);
  }

  getValue(element: any, key: string): any {
    return key.split('.').reduce((acc, part) => acc && acc[part], element);
  }
}
