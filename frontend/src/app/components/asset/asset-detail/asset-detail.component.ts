import { Component, OnDestroy, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Subject, takeUntil, finalize } from 'rxjs';
import { AssetService } from 'src/app/services/asset/asset.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';

@Component({
  selector: 'app-asset-detail',
  templateUrl: './asset-detail.component.html',
  styleUrls: ['./asset-detail.component.css'],
})
export class AssetDetailComponent implements OnInit, OnDestroy {
  isLoading: boolean = false;
  assetId: string | undefined;

  assetDetail: any;
  details: any[] = [];
  detailColumns: string[] = [
    'inventoryItemDetailSeqId',
    'orderId',
    'receiptId',
    'productId',
    'quantityOnHandDiff',
    'availableToPromiseDiff',
    'effectiveDate',
  ];

  receipts: any[] = [];
  receiptColumns: string[] = [
    'receiptId',
    'productId',
    'quantityAccepted',
    'receivedByUserLoginId',
    'datetimeReceived',
  ];

  private destroy$ = new Subject<void>();

  constructor(
    private assetService: AssetService,
    private route: ActivatedRoute,
    private snackbarService: SnackbarService
  ) {}

  ngOnInit(): void {
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
    this.isLoading = true;

    this.assetService
      .getAsset(assetId)
      .pipe(
        takeUntil(this.destroy$),
        finalize(() => (this.isLoading = false))
      )
      .subscribe({
        next: (response) => {
          this.assetDetail = response?.asset || response;
          this.details = response?.details || [];
          this.receipts = response?.receipts || [];
        },
        error: (error) => {
          this.snackbarService.showError('Error fetching asset details.');
        },
      });
  }

  ngOnDestroy(): void {
    this.destroy$.next();
    this.destroy$.complete();
  }
}
