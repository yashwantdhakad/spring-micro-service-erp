import { Component, OnDestroy, OnInit } from '@angular/core';
import { Subject, finalize, takeUntil } from 'rxjs';
import { PicklistService } from 'src/app/services/picklist/picklist.service';
import { CommonService } from 'src/app/services/common/common.service';

@Component({
  selector: 'app-picklists',
  templateUrl: './picklists.component.html',
  styleUrls: ['./picklists.component.css'],
})
export class PicklistsComponent implements OnInit, OnDestroy {
  isLoading = false;
  picklists: any[] = [];
  facilities: any[] = [];
  statusOptions: any[] = [];
  facilityMap = new Map<string, string>();
  statusMap = new Map<string, string>();

  filters = {
    facilityId: '',
    statusId: '',
    fromDate: null as Date | null,
    toDate: null as Date | null,
  };

  displayedColumns = [
    'picklistId',
    'statusId',
    'facilityId',
    'orderCount',
    'itemCount',
    'pickerId',
    'createdDate',
  ];

  private destroy$ = new Subject<void>();

  constructor(
    private picklistService: PicklistService,
    private commonService: CommonService
  ) {}

  ngOnInit(): void {
    this.loadLookups();
    this.loadPicklists();
  }

  loadPicklists(): void {
    this.isLoading = true;
    this.picklistService
      .getPicklists({
        facilityId: this.filters.facilityId || undefined,
        statusId: this.filters.statusId || undefined,
        fromDate: this.formatDate(this.filters.fromDate),
        toDate: this.formatDate(this.filters.toDate),
      })
      .pipe(
        takeUntil(this.destroy$),
        finalize(() => (this.isLoading = false))
      )
      .subscribe({
        next: (response) => {
          this.picklists = Array.isArray(response) ? response : [];
        },
        error: () => {
          this.picklists = [];
        },
      });
  }

  resetFilters(): void {
    this.filters = {
      facilityId: '',
      statusId: '',
      fromDate: null,
      toDate: null,
    };
    this.loadPicklists();
  }

  getFacilityLabel(facilityId?: string): string {
    if (!facilityId) {
      return '';
    }
    return this.facilityMap.get(facilityId) || facilityId;
  }

  getStatusLabel(statusId?: string): string {
    if (!statusId) {
      return '';
    }
    return this.statusMap.get(statusId) || statusId;
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

    this.commonService
      .getStatusItems('PICKLIST_STATUS')
      .pipe(takeUntil(this.destroy$))
      .subscribe({
        next: (items) => {
          const list = Array.isArray(items) ? items : [];
          this.statusOptions = list;
          this.statusMap = new Map(
            list.map((item: any) => [
              item.statusId,
              item.description || item.statusId,
            ])
          );
        },
        error: () => {
          this.statusOptions = [];
          this.statusMap = new Map();
        },
      });
  }

  private formatDate(date: Date | null): string | undefined {
    if (!date) {
      return undefined;
    }
    return date.toISOString().split('T')[0];
  }

  ngOnDestroy(): void {
    this.destroy$.next();
    this.destroy$.complete();
  }
}
