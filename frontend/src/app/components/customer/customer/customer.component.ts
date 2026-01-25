import { Component, OnDestroy, OnInit } from '@angular/core';
import { FormControl } from '@angular/forms';
import { PartyService } from 'src/app/services/party/party.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';
import { Subject } from 'rxjs';
import { debounceTime, distinctUntilChanged, finalize, map, startWith, switchMap, takeUntil, tap } from 'rxjs/operators';

@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css'],
})
export class CustomerComponent implements OnInit, OnDestroy {
  isLoading: boolean = false;
  queryString: string = '';
  searchControl = new FormControl('');
  pagination = {
    page: 1,
    rowsPerPage: 10,
  };
  items: any[] = [];
  pages: number = 0;

  customerColumns = [
    { key: 'partyId', header: 'CUSTOMER.ID' },
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
          this.partyService
            .getCustomers(0, value)
            .pipe(finalize(() => (this.isLoading = false)))
        ),
        takeUntil(this.destroy$)
      )
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
      .getCustomers(page - 1, queryString)
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

  getCustomerColumnKeys(): string[] {
    return this.customerColumns.map((col) => col.key);
  }

  getValue(element: any, key: string): any {
    return key.split('.').reduce((acc, part) => acc && acc[part], element);
  }
}
