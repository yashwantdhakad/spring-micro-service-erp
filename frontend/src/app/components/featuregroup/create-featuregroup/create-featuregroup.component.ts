import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { finalize } from 'rxjs/operators';
import { FeatureGroupService } from 'src/app/services/featuregroup/feature-group.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service'; // Optional

@Component({
  standalone: false,
  selector: 'app-create-featuregroup',
  templateUrl: './create-featuregroup.component.html',
  styleUrls: ['./create-featuregroup.component.css'],
})
export class CreateFeaturegroupComponent {
  isLoading: boolean = false;
  createFeatureGroupForm: FormGroup;

  constructor(
    private formBuilder: FormBuilder,
    private router: Router,
    private featureGroupService: FeatureGroupService,
    private snackbarService: SnackbarService // Optional
  ) {
    this.createFeatureGroupForm = this.formBuilder.group({
      description: ['', Validators.required],
    });
  }

  createFeatureGroup(): void {
    if (this.createFeatureGroupForm.invalid) {
      this.createFeatureGroupForm.markAllAsTouched();
      return;
    }

    const values = this.createFeatureGroupForm.value;
    this.isLoading = true;

    this.featureGroupService.createFeatureGroup(values).pipe(
      finalize(() => this.isLoading = false)
    ).subscribe({
      next: (data: any) => {
        if (!data?.productFeatureGroupId) {
          this.snackbarService.showError?.('Failed to create feature group.');
          return;
        }

        this.snackbarService.showSuccess?.('Feature group created successfully.');
        this.createFeatureGroupForm.reset();
        this.router.navigate([`/featuregroups/${data.productFeatureGroupId}`]);
      },
      error: (error) => {
        this.snackbarService.showError?.('Error creating feature group.');
      }
    });
  }
}
