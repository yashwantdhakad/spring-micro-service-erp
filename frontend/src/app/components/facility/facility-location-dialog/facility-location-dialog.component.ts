import { Component, Inject } from '@angular/core';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-facility-location-dialog',
  templateUrl: './facility-location-dialog.component.html',
  styleUrls: ['./facility-location-dialog.component.css']
})
export class FacilityLocationDialogComponent {
  form: FormGroup;

  constructor(
    private fb: FormBuilder,
    public dialogRef: MatDialogRef<FacilityLocationDialogComponent>,
    @Inject(MAT_DIALOG_DATA) public data: any
  ) {
    this.form = this.fb.group({
      facility_id: [data.facility_id, Validators.required],
      location_seq_id: [data.location_seq_id || '', Validators.required],
      location_type_enum_id: [data.location_type_enum_id || '', Validators.required],
      area_id: [data.area_id || '']
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
