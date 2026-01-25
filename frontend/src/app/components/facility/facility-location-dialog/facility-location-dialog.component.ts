import { Component, Inject } from '@angular/core';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { CommonService } from 'src/app/services/common/common.service';

@Component({
  selector: 'app-facility-location-dialog',
  templateUrl: './facility-location-dialog.component.html',
  styleUrls: ['./facility-location-dialog.component.css']
})
export class FacilityLocationDialogComponent {
  form: FormGroup;
  locationTypes: any[] = [];

  constructor(
    private fb: FormBuilder,
    private commonService: CommonService,
    public dialogRef: MatDialogRef<FacilityLocationDialogComponent>,
    @Inject(MAT_DIALOG_DATA) public data: any
  ) {
    this.form = this.fb.group({
      facilityId: [data.facilityId, Validators.required],
      locationSeqId: [data.locationSeqId || '', Validators.required],
      locationTypeEnumId: [data.locationTypeEnumId || '', Validators.required],
      areaId: [data.areaId || '']
    });

    this.loadLocationTypes();
  }

  private loadLocationTypes(): void {
    this.commonService.getEnumTypes('FACLOC_TYPE').subscribe({
      next: (data) => {
        this.locationTypes = Array.isArray(data) ? data : [data];
      },
    });
  }

  save(): void {
    if (this.form.valid) {
      const payload = { ...this.form.value };
      if (this.data?.id) {
        payload.id = this.data.id;
      }
      this.dialogRef.close(payload);
    }
  }

  cancel(): void {
    this.dialogRef.close();
  }
}
