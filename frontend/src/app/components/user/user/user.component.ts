import { Component, OnDestroy, OnInit, ViewChild } from '@angular/core';
import { FormControl } from '@angular/forms';
import { MatSort, Sort } from '@angular/material/sort';
import { Subject } from 'rxjs';
import { debounceTime, distinctUntilChanged, finalize, map, startWith, switchMap, takeUntil, tap } from 'rxjs/operators';
import { SnackbarService } from 'src/app/services/common/snackbar.service';
import { UserService } from 'src/app/services/security/user.service';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css'],
})
export class UserComponent implements OnInit, OnDestroy {
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
  currentSort?: Sort;

  userColumns = [
    { key: 'userLoginId', header: 'USER.ID' },
    { key: 'partyId', header: 'USER.PARTY_ID' },
    { key: 'enabled', header: 'USER.STATUS' },
    { key: 'roles', header: 'USER.ROLES' },
  ];

  private destroy$ = new Subject<void>();

  constructor(private userService: UserService, private snackbarService: SnackbarService) {}

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
          this.userService.listUsers(
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
          const { resultList, documentListCount } = response || {};
          this.items = Array.isArray(resultList) ? resultList : [];
          this.pages = documentListCount ?? 0;
        },
        error: () => {
          this.items = [];
          this.pages = 0;
          this.snackbarService.showError('Error fetching users');
        },
      });

    this.getUsers(1, '');
  }

  ngOnDestroy(): void {
    this.destroy$.next();
    this.destroy$.complete();
  }

  onPageChange(pageIndex: number): void {
    const page = pageIndex + 1;
    this.pagination.page = page;
    this.getUsers(page, this.queryString);
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
    this.getUsers(this.pagination.page, this.queryString);
  }

  getUserColumnKeys(): string[] {
    return this.userColumns.map((col) => col.key);
  }

  getValue(element: any, key: string): any {
    if (key === 'roles') {
      return this.formatRoles(element?.roles);
    }
    return key.split('.').reduce((acc, part) => acc && acc[part], element);
  }

  private formatRoles(roles: any): string {
    if (!Array.isArray(roles)) {
      return '';
    }
    return roles
      .map((role) => role?.groupName || role?.groupId)
      .filter(Boolean)
      .join(', ');
  }

  private getUsers(page: number, query: string): void {
    this.isLoading = true;
    this.userService
      .listUsers(page - 1, query, this.currentSort?.active, this.currentSort?.direction)
      .pipe(finalize(() => (this.isLoading = false)))
      .subscribe({
        next: (response: any) => {
          const { resultList, documentListCount } = response || {};
          this.items = Array.isArray(resultList) ? resultList : [];
          this.pages = documentListCount ?? 0;
        },
        error: () => {
          this.items = [];
          this.pages = 0;
          this.snackbarService.showError('Error fetching users');
        },
      });
  }
}
