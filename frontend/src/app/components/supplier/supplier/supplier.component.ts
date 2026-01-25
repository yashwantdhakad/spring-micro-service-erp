import { Component, OnDestroy, OnInit } from '@angular/core';
import { FormControl } from '@angular/forms';
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
  isLoading: boolean = false;
  queryString: string = '';
  searchControl = new FormControl('');
  pagination = {
    page: 1,
    rowsPerPage: 10,
  };
  items: any[] = [];
  pages: number = 0;
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
        tap(() => (this.isLoading = true)),
        switchMap((value) =>
          this.partyService
            .getSuppliers(0, value)
            .pipe(finalize(() => (this.isLoading = false)))
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
      .getSuppliers(page - 1, queryString)
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

  getSupplierColumnKeys(): string[] {
    return this.supplierColumns.map((col) => col.key);
  }

  getValue(element: any, key: string): any {
    return key.split('.').reduce((acc, part) => acc && acc[part], element);
  }
}
