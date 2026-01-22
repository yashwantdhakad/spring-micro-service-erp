import { Component, Inject, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';
import {
  debounceTime,
  distinctUntilChanged,
  startWith,
  switchMap,
  finalize,
  map,
} from 'rxjs/operators';
import { Observable, from, of } from 'rxjs';
import { FeatureGroupService } from 'src/app/services/featuregroup/feature-group.service';
import { FeatureService } from 'src/app/services/features/feature.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';

@Component({
  selector: 'app-add-product-feature-group-appl',
  templateUrl: './add-product-feature-group-appl.component.html',
  styleUrls: ['./add-product-feature-group-appl.component.css'],
})
export class AddProductFeatureGroupApplComponent implements OnInit {
  productFeatureGroupApplForm: FormGroup;
  isLoading: boolean = false;
  filteredFeatures$: Observable<any[]> = new Observable<any[]>();

  constructor(
    public dialogRef: MatDialogRef<AddProductFeatureGroupApplComponent>,
    @Inject(MAT_DIALOG_DATA) public data: { featureGroupProductData: any },
    private fb: FormBuilder,
    private featureService: FeatureService,
    private featureGroupService: FeatureGroupService,
    private snackbarService: SnackbarService
  ) {
    const { productFeatureGroupId, productFeatureId, fromDate } =
      this.data?.featureGroupProductData ?? {};

    this.productFeatureGroupApplForm = this.fb.group({
      productFeatureGroupId: [productFeatureGroupId],
      productFeatureId: [productFeatureId, Validators.required],
      fromDate: [fromDate],
    });
  }

  ngOnInit(): void {
    this.filteredFeatures$ = this.productFeatureGroupApplForm
      .get('productFeatureId')!
      .valueChanges.pipe(
        startWith(''),
        debounceTime(300),
        distinctUntilChanged(),
        switchMap((value) => this.getFeatures(value))
      );
  }

  public getFeatures(value: string): Observable<any[]> {
    if (!value || value.length < 1) {
      return of([]);
    }
    return from(this.featureService.getFeatures(0, value)).pipe(
      map((response: any) => response.body ?? [])
    );
  }

  createProductFeatGrpAppl(): void {
    if (this.productFeatureGroupApplForm.valid) {
      this.isLoading = true;
      const values = this.productFeatureGroupApplForm.value;

      const request$ = values.fromDate
        ? this.featureGroupService.updateProductFeatureGroupAppl(values)
        : this.featureGroupService.createProductFeatureGroupAppl(values);

      request$.pipe(
        finalize(() => (this.isLoading = false))
      ).subscribe({
        next: () => {
          const message = values.fromDate
            ? 'Feature group application updated successfully'
            : 'Feature group application created successfully';
          this.snackbarService.showSuccess(message);
          this.dialogRef.close(values);
        },
        error: (error) => {
          this.snackbarService.showError('Error in creating/updating feature to group');
        },
      });
    }
  }
}
