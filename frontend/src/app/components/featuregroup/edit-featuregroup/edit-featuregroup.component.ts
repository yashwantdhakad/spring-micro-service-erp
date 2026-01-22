import { Component, Inject } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';
import { finalize } from 'rxjs/operators';
import { FeatureGroupService } from 'src/app/services/featuregroup/feature-group.service';

@Component({
  selector: 'app-edit-featuregroup',
  templateUrl: './edit-featuregroup.component.html',
  styleUrls: ['./edit-featuregroup.component.css'],
})
export class EditFeaturegroupComponent {
  featureGroupForm: FormGroup;
  isLoading: boolean = false;

  constructor(
    public dialogRef: MatDialogRef<EditFeaturegroupComponent>,
    @Inject(MAT_DIALOG_DATA) public data: { featureGroupDetail: any },
    private fb: FormBuilder,
    private featureGroupService: FeatureGroupService
  ) {
    const { productFeatureGroupId, description } =
      this.data?.featureGroupDetail ?? {};

    this.featureGroupForm = this.fb.group({
      productFeatureGroupId: [productFeatureGroupId],
      description: [description, Validators.required],
    });
  }

  updateFeature(): void {
    if (this.featureGroupForm.valid) {
      this.isLoading = true;
      const values = this.featureGroupForm.value;

      this.featureGroupService.updateFeatureGroup(values).pipe(
        finalize(() => (this.isLoading = false))
      ).subscribe({
        next: () => {
          this.featureGroupForm.reset();
          this.dialogRef.close(values);
        },
        error: (error) => {
        }
      });
    }
  }
}
