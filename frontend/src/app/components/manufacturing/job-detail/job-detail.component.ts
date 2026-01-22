import { Component, OnInit } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { ActivatedRoute } from '@angular/router';
import { ManufacturingService } from 'src/app/services/manufacturing/manufacturing.service';
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
}
