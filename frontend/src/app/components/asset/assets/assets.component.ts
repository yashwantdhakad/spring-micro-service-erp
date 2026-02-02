import { ChangeDetectorRef, Component, OnInit, OnDestroy } from '@angular/core';
import { AssetService } from 'src/app/services/asset/asset.service';
import { CommonService } from 'src/app/services/common/common.service';
import { Subject, finalize, takeUntil } from 'rxjs';

@Component({
  standalone: false,
  selector: 'app-assets',
  templateUrl: './assets.component.html',
  styleUrls: ['./assets.component.css'],
})
export class AssetsComponent implements OnInit, OnDestroy {
  isLoading: boolean = false;
  queryString: string = '';
  pagination = {
    page: 1,
    rowsPerPage: 10,
  };
  items: any[] = [];
  pages: number = 0;
  inventoryItemTypeMap = new Map<string, string>();
  statusMap = new Map<string, string>();

  displayedColumns = [
    { key: 'inventoryItemId', header: 'ASSET.ASSET_ID' },
    { key: 'productId', header: 'COMMON.PRODUCT_ID' },
    { key: 'facilityId', header: 'COMMON.FACILITY_ID' },
    { key: 'inventoryItemTypeId', header: 'ASSET.ASSET_TYPE_ENUM_ID' },
    { key: 'statusId', header: 'COMMON.STATUS_ID' },
    { key: 'quantityOnHandTotal', header: 'ASSET.QUANTITY_ON_HAND_TOTAL' },
    { key: 'availableToPromiseTotal', header: 'ASSET.AVAILABLE_TO_PROMISE_TOTAL' },
    { key: 'unitCost', header: 'ASSET.ACQUIRE_COST' },
    { key: 'serialNumber', header: 'ASSET.SERIAL_NUMBER' },
    { key: 'datetimeReceived', header: 'ASSET.RECEIVED_DATE' },
    { key: 'datetimeManufactured', header: 'ASSET.ACQUIRED_DATE' },
    { key: 'expireDate', header: 'ASSET.EXPECTED_END_OF_LIFE' },
  ];
  displayedColumnKeys = this.displayedColumns.map(col => col.key);

  private destroy$ = new Subject<void>();

  constructor(
    private assetService: AssetService,
    private commonService: CommonService,
    private cdr: ChangeDetectorRef
  ) {}

  ngOnInit(): void {
    this.isLoading = true;
    this.loadLookups();
    this.getAssets(this.pagination.page, this.queryString);
  }

  getAssets(page: number, queryString: string): void {
    this.assetService.getAssets(page - 1, queryString)
      .pipe(takeUntil(this.destroy$))
      .subscribe({
        next: (response: any) => {
          const responseMap = response?.responseMap;
          this.items = responseMap?.resultList || [];
          this.pages = responseMap?.total ?? this.items.length;
          this.isLoading = false;
          this.cdr.detectChanges();
        },
        error: (error) => {
          this.isLoading = false;
          this.cdr.detectChanges();
        }
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
        }
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
        }
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

  ngOnDestroy(): void {
    this.destroy$.next();
    this.destroy$.complete();
  }
}
