import { ChangeDetectorRef, Component, OnDestroy, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Subject, takeUntil, finalize } from 'rxjs';
import { AssetService } from 'src/app/services/asset/asset.service';
import { CommonService } from 'src/app/services/common/common.service';
import { FacilityService } from 'src/app/services/facility/facility.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';

@Component({
  standalone: false,
  selector: 'app-asset-detail',
  templateUrl: './asset-detail.component.html',
  styleUrls: ['./asset-detail.component.css'],
})
export class AssetDetailComponent implements OnInit, OnDestroy {
  isLoading: boolean = false;
  assetId: string | undefined;

  assetDetail: any;
  facilityName: string | null = null;
  inventoryItemTypeMap = new Map<string, string>();
  statusMap = new Map<string, string>();
  details: any[] = [];
  detailColumns: string[] = [
    'inventoryItemDetailSeqId',
    'workEffortId',
    'orderId',
    'receiptId',
    'productId',
    'quantityOnHandDiff',
    'availableToPromiseDiff',
    'effectiveDate',
  ];

  orderReservations: any[] = [];
  orderReservationColumns: string[] = [
    'orderId',
    'orderItemSeqId',
    'shipGroupSeqId',
    'quantity',
    'quantityNotAvailable',
    'reservedDatetime',
  ];

  workEffortReservations: any[] = [];
  workEffortReservationColumns: string[] = [
    'workEffortId',
    'quantity',
    'quantityNotAvailable',
    'reservedDatetime',
  ];

  receipts: any[] = [];
  receiptColumns: string[] = [
    'receiptId',
    'shipmentId',
    'productId',
    'quantityAccepted',
    'receivedByUserLoginId',
    'datetimeReceived',
  ];

  private destroy$ = new Subject<void>();

  constructor(
    private assetService: AssetService,
    private commonService: CommonService,
    private facilityService: FacilityService,
    private route: ActivatedRoute,
    private snackbarService: SnackbarService,
    private cdr: ChangeDetectorRef
  ) {}

  ngOnInit(): void {
    this.loadLookups();
    this.route.params
      .pipe(takeUntil(this.destroy$))
      .subscribe((params) => {
        this.assetId = params['assetId'];
        if (this.assetId) {
          this.getAsset(this.assetId);
        }
      });
  }

  getAsset(assetId: string): void {
    setTimeout(() => {
      this.isLoading = true;
      this.cdr.markForCheck();
    }, 0);

    this.assetService
      .getAsset(assetId)
      .pipe(
        takeUntil(this.destroy$),
        finalize(() => {
          setTimeout(() => {
            this.isLoading = false;
            this.cdr.markForCheck();
          }, 0);
        })
      )
      .subscribe({
        next: (response) => {
          const asset = response?.asset || response;
          const details = response?.details || [];
          const receipts = response?.receipts || [];
          setTimeout(() => {
            this.assetDetail = asset;
            this.details = details;
            this.receipts = receipts;
            this.orderReservations = [];
            this.workEffortReservations = [];
            this.facilityName = null;
            if (this.assetDetail?.facilityId) {
              this.loadFacilityName(this.assetDetail.facilityId);
            }
            const inventoryItemId = this.assetDetail?.inventoryItemId || assetId;
            this.loadReservations(inventoryItemId);
            this.cdr.markForCheck();
          }, 0);
        },
        error: (error) => {
          this.snackbarService.showError('Error fetching asset details.');
          setTimeout(() => {
            this.cdr.markForCheck();
          }, 0);
        },
      });
  }

  private loadLookups(): void {
    this.assetService.getInventoryItemTypes()
      .pipe(takeUntil(this.destroy$))
      .subscribe({
        next: (types) => {
          const list = Array.isArray(types) ? types : [];
          this.inventoryItemTypeMap = new Map(
            list.map((type: any) => [
              type.inventoryItemTypeId,
              type.description || type.inventoryItemTypeId,
            ])
          );
        },
        error: () => {
          this.inventoryItemTypeMap = new Map();
        },
      });

    this.commonService.getAllStatusItems()
      .pipe(takeUntil(this.destroy$))
      .subscribe({
        next: (items) => {
          const list = Array.isArray(items) ? items : [];
          this.statusMap = new Map(
            list.map((item: any) => [
              item.statusId,
              item.description || item.statusId,
            ])
          );
        },
        error: () => {
          this.statusMap = new Map();
        },
      });
  }

  getInventoryItemTypeLabel(typeId?: string): string {
    if (!typeId) {
      return '';
    }
    return this.inventoryItemTypeMap.get(typeId) || typeId;
  }

  getStatusLabel(statusId?: string): string {
    if (!statusId) {
      return '';
    }
    return this.statusMap.get(statusId) || statusId;
  }

  private loadFacilityName(facilityId: string): void {
    this.facilityService
      .getFacility(facilityId)
      .pipe(takeUntil(this.destroy$))
      .subscribe({
        next: (response) => {
          const facility = response?.facility || response;
          setTimeout(() => {
            this.facilityName = facility?.facilityName || facilityId;
            this.cdr.markForCheck();
          }, 0);
        },
        error: () => {
          setTimeout(() => {
            this.facilityName = facilityId;
            this.cdr.markForCheck();
          }, 0);
        },
      });
  }

  private loadReservations(inventoryItemId?: string): void {
    if (!inventoryItemId) {
      this.orderReservations = [];
      this.workEffortReservations = [];
      return;
    }

    this.assetService
      .getOrderReservations(inventoryItemId)
      .pipe(takeUntil(this.destroy$))
      .subscribe({
        next: (response) => {
          setTimeout(() => {
            this.orderReservations = Array.isArray(response) ? response : [];
            this.cdr.markForCheck();
          }, 0);
        },
        error: () => {
          setTimeout(() => {
            this.orderReservations = [];
            this.cdr.markForCheck();
          }, 0);
        },
      });

    this.assetService
      .getWorkEffortReservations(inventoryItemId)
      .pipe(takeUntil(this.destroy$))
      .subscribe({
        next: (response) => {
          setTimeout(() => {
            this.workEffortReservations = Array.isArray(response) ? response : [];
            this.cdr.markForCheck();
          }, 0);
        },
        error: () => {
          setTimeout(() => {
            this.workEffortReservations = [];
            this.cdr.markForCheck();
          }, 0);
        },
      });
  }

  ngOnDestroy(): void {
    this.destroy$.next();
    this.destroy$.complete();
  }
}
