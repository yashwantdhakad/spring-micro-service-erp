import { Component, OnInit, OnDestroy } from '@angular/core';
import { AssetService } from 'src/app/services/asset/asset.service';
import { HttpResponse } from '@angular/common/http';
import { Subject, finalize, takeUntil } from 'rxjs';

@Component({
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

  displayedColumns = [
    { key: 'assetId', header: 'ASSET.ASSET_ID' },
    { key: 'assetName', header: 'ASSET.ASSET_NAME' },
    { key: 'facilityId', header: 'ASSET.FACILITY_ID' },
    { key: 'assetTypeEnumId', header: 'ASSET.ASSET_TYPE_ENUM_ID' },
    { key: 'classEnumId', header: 'ASSET.CLASS_ENUM_ID' },
    { key: 'statusId', header: 'ASSET.STATUS_ID' },
    { key: 'quantityOnHandTotal', header: 'ASSET.QUANTITY_ON_HAND_TOTAL' },
    { key: 'availableToPromiseTotal', header: 'ASSET.AVAILABLE_TO_PROMISE_TOTAL' },
    { key: 'acquireCost', header: 'ASSET.ACQUIRE_COST' },
    { key: 'serialNumber', header: 'ASSET.SERIAL_NUMBER' },
    { key: 'receivedDate', header: 'ASSET.RECEIVED_DATE' },
    { key: 'acquiredDate', header: 'ASSET.ACQUIRED_DATE' },
    { key: 'expectedEndOfLife', header: 'ASSET.EXPECTED_END_OF_LIFE' },
  ];
  displayedColumnKeys = this.displayedColumns.map(col => col.key);

  private destroy$ = new Subject<void>();

  constructor(private assetService: AssetService) {}

  ngOnInit(): void {
    this.isLoading = true;
    this.getAssets(this.pagination.page, this.queryString);
  }

  getAssets(page: number, queryString: string): void {
    this.assetService.getAssets(page - 1, queryString)
      .pipe(
        takeUntil(this.destroy$),
        finalize(() => (this.isLoading = false))
      )
      .subscribe({
        next: (response: HttpResponse<any>) => {
          this.items = response.body || [];
          const totalCount = response.headers.get('x-total-count');
          this.pages = totalCount ? parseInt(totalCount, 10) : 0;
        },
        error: (error) => {
        }
      });
  }

  ngOnDestroy(): void {
    this.destroy$.next();
    this.destroy$.complete();
  }
}
