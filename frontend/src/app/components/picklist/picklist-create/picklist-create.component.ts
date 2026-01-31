import { Component, OnDestroy, OnInit } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { SelectionModel } from '@angular/cdk/collections';
import { Subject, finalize, forkJoin, takeUntil } from 'rxjs';
import { CommonService } from 'src/app/services/common/common.service';
import { OrderService } from 'src/app/services/order/order.service';
import { PicklistCreateItemsDialogComponent } from './picklist-create-items-dialog.component';

@Component({
  selector: 'app-picklist-create',
  templateUrl: './picklist-create.component.html',
  styleUrls: ['./picklist-create.component.css'],
})
export class PicklistCreateComponent implements OnInit, OnDestroy {
  isLoading = false;
  picklists: any[] = [];
  allPicklists: any[] = [];
  selection = new SelectionModel<any>(true, []);
  facilities: any[] = [];
  facilityMap = new Map<string, string>();

  filters = {
    facilityId: '',
  };

  displayedColumns = [
    'select',
    'orderId',
    'statusId',
    'facilityId',
    'pickQuantity',
    'itemCount',
    'createdDate',
  ];

  private destroy$ = new Subject<void>();

  constructor(
    private commonService: CommonService,
    private orderService: OrderService,
    private dialog: MatDialog
  ) {}

  ngOnInit(): void {
    this.loadLookups();
    this.loadPicklists();
  }

  loadPicklists(): void {
    this.isLoading = true;
    this.orderService
      .getReservedOrders()
      .pipe(
        takeUntil(this.destroy$),
        finalize(() => (this.isLoading = false))
      )
      .subscribe({
        next: (response) => {
          this.allPicklists = Array.isArray(response) ? response : [];
          this.applyFilters();
        },
        error: () => {
          this.allPicklists = [];
          this.applyFilters();
        },
      });
  }

  resetFilters(): void {
    this.filters = {
      facilityId: '',
    };
    this.applyFilters();
  }

  getFacilityLabel(facilityId?: string): string {
    if (!facilityId) {
      return '';
    }
    return this.facilityMap.get(facilityId) || facilityId;
  }

  private loadLookups(): void {
    this.commonService
      .getFacilities()
      .pipe(takeUntil(this.destroy$))
      .subscribe({
        next: (facilities) => {
          const list = Array.isArray(facilities) ? facilities : [];
          this.facilities = list;
          this.facilityMap = new Map(
            list.map((facility: any) => [
              facility.facilityId,
              facility.facilityName || facility.facilityId,
            ])
          );
        },
        error: () => {
          this.facilities = [];
          this.facilityMap = new Map();
        },
      });
  }

  toggleAllRows(): void {
    if (this.isAllSelected()) {
      this.selection.clear();
      return;
    }
    this.selection.select(...this.picklists);
  }

  isAllSelected(): boolean {
    const numSelected = this.selection.selected.length;
    const numRows = this.picklists.length;
    return numRows > 0 && numSelected === numRows;
  }

  checkboxLabel(row?: any): string {
    if (!row) {
      return `${this.isAllSelected() ? 'deselect' : 'select'} all`;
    }
    return `${this.selection.isSelected(row) ? 'deselect' : 'select'} row`;
  }

  openOrderItems(orderId: string): void {
    if (!orderId) {
      return;
    }
    this.orderService.getReservedOrderItems(orderId).subscribe({
      next: (response) => {
        const list = Array.isArray(response) ? response : [];
        this.dialog.open(PicklistCreateItemsDialogComponent, {
          width: '700px',
          data: { orderId, items: list },
        });
      },
    });
  }

  createPicklists(): void {
    const orderIds = this.selection.selected
      .map((item) => item.orderId)
      .filter((orderId) => !!orderId);

    if (orderIds.length === 0) {
      return;
    }

    this.isLoading = true;
    forkJoin(orderIds.map((orderId) => this.orderService.createPicklist(orderId)))
      .pipe(finalize(() => (this.isLoading = false)))
      .subscribe({
        next: () => {
          this.selection.clear();
          this.loadPicklists();
        },
        error: () => {
          this.loadPicklists();
        },
      });
  }

  ngOnDestroy(): void {
    this.destroy$.next();
    this.destroy$.complete();
  }

  private applyFilters(): void {
    const facilityId = this.filters.facilityId;
    this.picklists = this.allPicklists.filter((item) => {
      if (facilityId && item.facilityId !== facilityId) {
        return false;
      }
      return true;
    });
    this.selection.clear();
  }
}
