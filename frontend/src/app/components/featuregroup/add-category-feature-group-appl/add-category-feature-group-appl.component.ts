import { Component, Inject, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';
import {
  debounceTime,
  distinctUntilChanged,
  map,
  startWith,
  switchMap,
  finalize,
} from 'rxjs/operators';
import { Observable, of } from 'rxjs';
import { CategoryService } from 'src/app/services/category/category.service';
import { CommonService } from 'src/app/services/common/common.service';
import { FeatureGroupService } from 'src/app/services/featuregroup/feature-group.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';

@Component({
  standalone: false,
  selector: 'app-add-category-feature-group-appl',
  templateUrl: './add-category-feature-group-appl.component.html',
  styleUrls: ['./add-category-feature-group-appl.component.css'],
})
export class AddCategoryFeatureGroupApplComponent implements OnInit {
  categoryFeatureGroupApplForm: FormGroup;
  isLoading: boolean = false;
  filteredCategories$: Observable<any[]> = of([]);
  enumTypes: any[] = [];

  constructor(
    public dialogRef: MatDialogRef<AddCategoryFeatureGroupApplComponent>,
    @Inject(MAT_DIALOG_DATA) public data: { featureGroupCategoryData: any },
    private fb: FormBuilder,
    private categoryService: CategoryService,
    private featureGroupService: FeatureGroupService,
    private commonService: CommonService,
    private snackbarService: SnackbarService
  ) {
    const {
      id,
      productFeatureGroupId,
      productCategoryId,
      applTypeEnumId,
      fromDate,
    } = this.data?.featureGroupCategoryData ?? {};

    this.categoryFeatureGroupApplForm = this.fb.group({
      id: [id],
      productFeatureGroupId: [productFeatureGroupId],
      applTypeEnumId: [applTypeEnumId || 'PfatStandard', Validators.required],
      productCategoryId: [productCategoryId, Validators.required],
      fromDate: [fromDate],
    });
  }

  ngOnInit(): void {
    this.loadEnumTypes();

    this.filteredCategories$ = this.categoryFeatureGroupApplForm
      .get('productCategoryId')!
      .valueChanges.pipe(
        startWith(''),
        debounceTime(300),
        distinctUntilChanged(),
        switchMap((value: string) =>
          value?.length > 0
            ? this.categoryService.getCategories(0, value).pipe(
                map((res: any) => res.body ?? [])
              )
            : of([])
        )
      );
  }

  loadEnumTypes(): void {
    this.commonService.getEnumTypes('ProductFeatureApplType').subscribe({
      next: (data) => {
        this.enumTypes = Array.isArray(data) ? data : [data];
      },
      error: (error) => {
      },
    });
  }

  createProductCategoryFeatGrpAppl(): void {
    if (this.categoryFeatureGroupApplForm.valid) {
      this.isLoading = true;
      const values = this.categoryFeatureGroupApplForm.value;

      const request$ = values.id
        ? this.featureGroupService.updateProductCategoryFeatGrpAppl(values)
        : this.featureGroupService.createProductCategoryFeatGrpAppl(values);

      request$
        .pipe(finalize(() => (this.isLoading = false)))
        .subscribe({
          next: () => {
            this.snackbarService.showSuccess(
              values.id
                ? 'Category feature group application updated successfully'
                : 'Category feature group application created successfully'
            );
            this.dialogRef.close(values);
          },
          error: () => {
            this.snackbarService.showError(
              'Error in creating/updating feature to category'
            );
          },
        });
    }
  }
}
