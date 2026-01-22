import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Store, select } from '@ngrx/store';
import { filterEnumRecords } from 'src/app/helpers/enum-type-helper';
import { FeatureService } from 'src/app/services/features/feature.service';
import { loadEnums } from 'src/app/store/enum/enum.actions';
import { selectEnumList } from 'src/app/store/enum/enum.selector';
import { EnumState } from 'src/app/store/enum/enum.state';
import { SnackbarService } from 'src/app/services/common/snackbar.service';
import { finalize } from 'rxjs/operators';

@Component({
  selector: 'app-create-feature',
  templateUrl: './create-feature.component.html',
  styleUrls: ['./create-feature.component.css'],
})
export class CreateFeatureComponent {
  isLoading = false;
  createFeatureForm: FormGroup;
  enumTypes: any[] = [];

  constructor(
    private formBuilder: FormBuilder,
    private router: Router,
    private featureService: FeatureService,
    private store: Store<EnumState>,
    private snackbarService: SnackbarService
  ) {
    this.store.dispatch(loadEnums());
    this.store.pipe(select(selectEnumList)).subscribe((enumListObject: any) => {
      if (enumListObject) {
        this.enumTypes = filterEnumRecords(enumListObject, 'ProductFeatureType');
      }
    });

    this.createFeatureForm = this.formBuilder.group({
      productFeatureTypeEnumId: ['', Validators.required],
      abbrev: ['', Validators.required],
      description: ['', Validators.required],
    });
  }

  createFeature(): void {
    if (this.createFeatureForm.invalid) {
      this.createFeatureForm.markAllAsTouched();
      return;
    }

    const values = this.createFeatureForm.value;
    this.isLoading = true;

    this.featureService.createFeature(values).pipe(
      finalize(() => (this.isLoading = false))
    ).subscribe({
      next: (data: any) => {
        if (!data?.productFeatureId) {
          this.snackbarService.showError('Failed to create feature.');
          return;
        }

        this.snackbarService.showSuccess('Feature created successfully.');
        this.createFeatureForm.reset();
        this.router.navigate([`/features/${data.productFeatureId}`]);
      },
      error: (error) => {
        this.snackbarService.showError('Error in creating feature.');
      },
    });
  }
}
