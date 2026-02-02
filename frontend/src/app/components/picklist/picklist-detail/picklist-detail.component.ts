import { ChangeDetectorRef, Component, OnDestroy, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Subject, finalize, takeUntil } from 'rxjs';
import { PicklistService } from 'src/app/services/picklist/picklist.service';
import { CommonService } from 'src/app/services/common/common.service';
import { PartyService } from 'src/app/services/party/party.service';
import { MatDialog } from '@angular/material/dialog';
import { SnackbarService } from 'src/app/services/common/snackbar.service';
import { PicklistAssignPickerDialogComponent } from './picklist-assign-picker-dialog.component';

@Component({
  standalone: false,
  selector: 'app-picklist-detail',
  templateUrl: './picklist-detail.component.html',
  styleUrls: ['./picklist-detail.component.css'],
})
export class PicklistDetailComponent implements OnInit, OnDestroy {
  isLoading = false;
  picklistId: string | null = null;
  picklistDetail: any;
  bins: any[] = [];
  facilityMap = new Map<string, string>();
  picklistStatusMap = new Map<string, string>();
  itemStatusMap = new Map<string, string>();
  pickerNameMap = new Map<string, string>();

  itemColumns: string[] = [
    'orderId',
    'orderItemSeqId',
    'shipGroupSeqId',
    'inventoryItemId',
    'itemStatusId',
    'quantity',
  ];

  private destroy$ = new Subject<void>();

  constructor(
    private route: ActivatedRoute,
    private picklistService: PicklistService,
    private commonService: CommonService,
    private partyService: PartyService,
    private dialog: MatDialog,
    private snackbarService: SnackbarService,
    private cdr: ChangeDetectorRef
  ) {}

  ngOnInit(): void {
    this.loadLookups();
    this.loadPickerNames();
    this.route.params.pipe(takeUntil(this.destroy$)).subscribe((params) => {
      this.picklistId = params['picklistId'];
      if (this.picklistId) {
        this.loadPicklist(this.picklistId);
      }
    });
  }

  loadPicklist(picklistId: string): void {
    this.isLoading = true;
    this.picklistService
      .getPicklist(picklistId)
      .pipe(
        takeUntil(this.destroy$)
      )
      .subscribe({
        next: (response) => {
          this.picklistDetail = response || {};
          this.bins = Array.isArray(this.picklistDetail?.bins)
            ? this.picklistDetail.bins
            : [];
          this.isLoading = false;
          this.cdr.detectChanges();
        },
        error: () => {
          this.picklistDetail = null;
          this.bins = [];
          this.isLoading = false;
          this.cdr.detectChanges();
        },
      });
  }

  openAssignPickerDialog(): void {
    if (!this.picklistId) {
      return;
    }
    const dialogRef = this.dialog.open(PicklistAssignPickerDialogComponent, {
      width: '480px',
      autoFocus: true,
      restoreFocus: true,
      data: { picklistId: this.picklistId },
    });

    dialogRef.afterClosed().subscribe((result) => {
      if (!result?.partyId || !this.picklistId) {
        return;
      }
      this.picklistService.assignPicker(this.picklistId, result.partyId).subscribe({
        next: () => {
          this.snackbarService.showSuccess('Picker assigned.');
          this.loadPicklist(this.picklistId as string);
        },
        error: () => {
          this.snackbarService.showError('Failed to assign picker.');
        },
      });
    });
  }

  getFacilityLabel(facilityId?: string): string {
    if (!facilityId) {
      return '';
    }
    return this.facilityMap.get(facilityId) || facilityId;
  }

  getPicklistStatusLabel(statusId?: string): string {
    if (!statusId) {
      return '';
    }
    return this.picklistStatusMap.get(statusId) || statusId;
  }

  getItemStatusLabel(statusId?: string): string {
    if (!statusId) {
      return '';
    }
    return this.itemStatusMap.get(statusId) || statusId;
  }

  getPickerName(partyId?: string): string {
    if (!partyId) {
      return '';
    }
    return this.pickerNameMap.get(partyId) || partyId;
  }

  private loadLookups(): void {
    this.commonService
      .getFacilities()
      .pipe(takeUntil(this.destroy$))
      .subscribe({
        next: (facilities) => {
          const list = Array.isArray(facilities) ? facilities : [];
          this.facilityMap = new Map(
            list.map((facility: any) => [
              facility.facilityId,
              facility.facilityName || facility.facilityId,
            ])
          );
        },
        error: () => {
          this.facilityMap = new Map();
        },
      });

    this.commonService
      .getStatusItems('PICKLIST_STATUS')
      .pipe(takeUntil(this.destroy$))
      .subscribe({
        next: (items) => {
          const list = Array.isArray(items) ? items : [];
          this.picklistStatusMap = new Map(
            list.map((item: any) => [
              item.statusId,
              item.description || item.statusId,
            ])
          );
        },
        error: () => {
          this.picklistStatusMap = new Map();
        },
      });

    this.commonService
      .getStatusItems('PICKITEM_STATUS')
      .pipe(takeUntil(this.destroy$))
      .subscribe({
        next: (items) => {
          const list = Array.isArray(items) ? items : [];
          this.itemStatusMap = new Map(
            list.map((item: any) => [
              item.statusId,
              item.description || item.statusId,
            ])
          );
        },
        error: () => {
          this.itemStatusMap = new Map();
        },
      });
  }

  private loadPickerNames(): void {
    this.partyService
      .getPartyRoleSummaries('PICKER')
      .pipe(takeUntil(this.destroy$))
      .subscribe({
        next: (roles) => {
          const list = Array.isArray(roles) ? roles : [];
          this.pickerNameMap = new Map(
            list.map((role: any) => [role.partyId, role.name || role.partyId])
          );
        },
        error: () => {
          this.pickerNameMap = new Map();
        },
      });
  }

  ngOnDestroy(): void {
    this.destroy$.next();
    this.destroy$.complete();
  }
}
