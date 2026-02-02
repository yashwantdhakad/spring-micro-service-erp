import { Component, Inject, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';
import { finalize } from 'rxjs/operators';
import { CommonService } from 'src/app/services/common/common.service';
import { ManufacturingService } from 'src/app/services/manufacturing/manufacturing.service';

@Component({
  standalone: false,
  selector: 'app-produce-item',
  templateUrl: './produce-item.component.html',
  styleUrls: ['./produce-item.component.css'],
})
export class ProduceItemComponent implements OnInit {
  produceForm: FormGroup;
  facilityLocations: any[] = [];
  isLoading = false;
  facilityId: string | undefined;
  productLabel = '';

  constructor(
    public dialogRef: MatDialogRef<ProduceItemComponent>,
    @Inject(MAT_DIALOG_DATA) public data: { produceData: any },
    private fb: FormBuilder,
    private commonService: CommonService,
    private manufacturingService: ManufacturingService
  ) {
    const { workEffortId, productId, productName, facilityId } =
      this.data?.produceData ?? {};

    this.facilityId = facilityId;
    this.productLabel = productName ? `${productName} (${productId})` : productId;

    this.produceForm = this.fb.group({
      workEffortId: [workEffortId],
      productId: [productId, Validators.required],
      quantity: ['1', [Validators.required, Validators.min(1)]],
      locationSeqId: ['', Validators.required],
    });
  }

  ngOnInit(): void {
    this.loadFacilityLocations();
  }

  private loadFacilityLocations(): void {
    this.commonService.getFacilityLocations().subscribe({
      next: (data) => {
        const locations = Array.isArray(data) ? data : [data];
        this.facilityLocations = this.facilityId
          ? locations.filter((location) => location.facilityId === this.facilityId)
          : locations;
      },
      error: () => {
        this.facilityLocations = [];
      },
    });
  }

  produce(): void {
    if (this.produceForm.invalid) {
      this.produceForm.markAllAsTouched();
      return;
    }

    const values = this.produceForm.value;
    this.isLoading = true;

    const payload = {
      productId: values.productId,
      quantity: values.quantity,
      locationSeqId: values.locationSeqId,
    };

    this.manufacturingService
      .produceItem(values.workEffortId, payload)
      .pipe(finalize(() => (this.isLoading = false)))
      .subscribe({
        next: (response) => {
          this.dialogRef.close(response);
          this.produceForm.reset({
            workEffortId: values.workEffortId,
            productId: values.productId,
            quantity: '1',
            locationSeqId: '',
          });
        },
        error: () => {
        },
      });
  }
}
