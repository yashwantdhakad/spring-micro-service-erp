import { Component, Inject } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';
import { FeatureService } from 'src/app/services/features/feature.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';
import { finalize } from 'rxjs/operators';

@Component({
  standalone: false,
  selector: 'app-edit-feature',
  templateUrl: './edit-feature.component.html',
  styleUrls: ['./edit-feature.component.css'],
})
export class EditFeatureComponent {
  featureForm: FormGroup;
  isLoading: boolean = false;

  constructor(
    public dialogRef: MatDialogRef<EditFeatureComponent>,
    @Inject(MAT_DIALOG_DATA) public data: { featureDetail: any },
    private fb: FormBuilder,
    private featureService: FeatureService,
    private snackbarService: SnackbarService
  ) {
    const { productFeatureId, abbrev, description } = this.data?.featureDetail ?? {};

    this.featureForm = this.fb.group({
      productFeatureId: [productFeatureId],
      abbrev: [abbrev, Validators.required],
      description: [description, Validators.required],
    });
  }

  updateFeature(): void {
    if (this.featureForm.valid) {
      this.isLoading = true;
      const values = this.featureForm.value;

      this.featureService.updateFeature(values).pipe(
        finalize(() => this.isLoading = false)
      ).subscribe({
        next: () => {
          this.snackbarService.showSuccess('Feature updated successfully.');
          this.dialogRef.close(values);
        },
        error: (error) => {
          this.snackbarService.showError('Error in updating feature.');
        }
      });
    }
  }
}
