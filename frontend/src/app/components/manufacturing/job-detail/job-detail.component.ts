import { Component, OnInit } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { ActivatedRoute } from '@angular/router';
import { ManufacturingService } from 'src/app/services/manufacturing/manufacturing.service';
import { ConsumableItemComponent } from '../consumable-item/consumable-item.component';
import { ConfirmationDialogComponent } from '../../common/confirmation-dialog/confirmation-dialog.component';
import { finalize } from 'rxjs/operators';

@Component({
  selector: 'app-job-detail',
  templateUrl: './job-detail.component.html',
  styleUrls: ['./job-detail.component.css'],
})
export class JobDetailComponent implements OnInit {
  isLoading = false;
  workEffortId: string | undefined;

  jobDetail: any = {};
  productsToProduce: any[] = [];
  productsToConsume: any[] = [];

  productsToProduceColumns: string[] = [
    'productId',
    'productName',
    'atp',
    'qoh',
    'estimatedQuantity',
    'uom',
    'produced',
  ];

  productsToConsumeColumns: string[] = [
    'productId',
    'productName',
    'atp',
    'qoh',
    'estimatedQuantity',
    'uom',
    'consumed',
    'status',
    'actions',
  ];

  constructor(
    private readonly manufacturingService: ManufacturingService,
    private readonly route: ActivatedRoute,
    private readonly dialog: MatDialog
  ) {}

  ngOnInit(): void {
    this.route.params.subscribe((params) => {
      this.workEffortId = params['workEffortId'];
      if (this.workEffortId) {
        this.fetchJobDetail(this.workEffortId);
      }
    });
  }

  getCurrentDateTime(): string {
    return new Date().toLocaleString();
  }

  fetchJobDetail(workEffortId: string): void {
    this.isLoading = true;

    this.manufacturingService.getJob(workEffortId)
      .pipe(finalize(() => (this.isLoading = false)))
      .subscribe({
        next: (response) => {
          this.jobDetail = response?.workEffort ?? {};
          this.productsToConsume = response?.consumeList ?? [];
          this.productsToProduce = response?.produceList ?? [];
        },
        error: (error) => {
        },
      });
  }

  addConsumable(): void {
    if (!this.workEffortId) {
      return;
    }
    this.dialog.open(ConsumableItemComponent, {
      data: { consumableData: { workEffortId: this.workEffortId } },
    }).afterClosed().subscribe(() => {
      if (this.workEffortId) {
        this.fetchJobDetail(this.workEffortId);
      }
    });
  }

  approveJob(): void {
    if (!this.workEffortId) {
      return;
    }
    this.manufacturingService.approveJob(this.workEffortId).subscribe({
      next: () => {
        this.fetchJobDetail(this.workEffortId as string);
      },
      error: () => {
      },
    });
  }

  startJob(): void {
    if (!this.workEffortId) {
      return;
    }
    this.manufacturingService.startJob(this.workEffortId).subscribe({
      next: () => {
        this.fetchJobDetail(this.workEffortId as string);
      },
      error: () => {
      },
    });
  }

  reserveConsumable(item: any): void {
    if (!this.workEffortId || !item?.id) {
      return;
    }
    const payload = {};
    this.manufacturingService.reserveConsumable(this.workEffortId, item.id, payload).subscribe({
      next: () => {
        this.fetchJobDetail(this.workEffortId as string);
      },
      error: () => {
      },
    });
  }

  releaseConsumable(item: any): void {
    if (!this.workEffortId || !item?.id) {
      return;
    }
    const payload = {};
    this.manufacturingService.releaseConsumable(this.workEffortId, item.id, payload).subscribe({
      next: () => {
        this.fetchJobDetail(this.workEffortId as string);
      },
      error: () => {
      },
    });
  }

  issueConsumable(item: any): void {
    if (!this.workEffortId || !item?.id) {
      return;
    }
    const payload = {};
    this.manufacturingService.issueConsumable(this.workEffortId, item.id, payload).subscribe({
      next: () => {
        this.fetchJobDetail(this.workEffortId as string);
      },
      error: () => {
      },
    });
  }

  cancelConsumable(item: any): void {
    if (!this.workEffortId || !item?.id) {
      return;
    }
    const dialogRef = this.dialog.open(ConfirmationDialogComponent, {
      data: {
        title: 'Consumable Item',
        message: 'Are you sure you want to cancel this item?',
      },
    });
    dialogRef.afterClosed().subscribe((result) => {
      if (!result) {
        return;
      }
      this.manufacturingService.cancelConsumable(this.workEffortId as string, item.id).subscribe({
        next: () => {
          this.fetchJobDetail(this.workEffortId as string);
        },
        error: () => {
        },
      });
    });
  }

  isCancelled(item: any): boolean {
    return (item?.statusId || '').toUpperCase() === 'WEGS_CANCELLED';
  }

  isReserved(item: any): boolean {
    return (item?.statusId || '').toUpperCase() === 'WEGS_RESERVED';
  }

  isIssued(item: any): boolean {
    return (item?.statusId || '').toUpperCase() === 'WEGS_ISSUED';
  }

  isApproved(): boolean {
    return (this.jobDetail?.currentStatusId || '').toUpperCase() === 'PRUN_APPROVED'
      || (this.jobDetail?.currentStatusId || '').toUpperCase() === 'PRUN_RUNNING';
  }

  isRunning(): boolean {
    return (this.jobDetail?.currentStatusId || '').toUpperCase() === 'PRUN_RUNNING';
  }

  statusLabel(statusId?: string): string {
    const map: Record<string, string> = {
      PRUN_CREATED: 'Created',
      PRUN_APPROVED: 'Approved',
      PRUN_RUNNING: 'Running',
      WEGS_CREATED: 'Created',
      WEGS_RESERVED: 'Reserved',
      WEGS_ISSUED: 'Issued',
      WEGS_CANCELLED: 'Cancelled',
    };
    if (!statusId) {
      return '';
    }
    return map[statusId] || statusId.replace(/_/g, ' ');
  }
}
