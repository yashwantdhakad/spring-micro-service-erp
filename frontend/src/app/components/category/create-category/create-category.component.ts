import { Component, OnDestroy, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { CommonService } from 'src/app/services/common/common.service';
import { CategoryService } from 'src/app/services/category/category.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';
import { Subject } from 'rxjs';
import { finalize, takeUntil } from 'rxjs/operators';

@Component({
  standalone: false,
  selector: 'app-create-category',
  templateUrl: './create-category.component.html',
  styleUrls: ['./create-category.component.css'],
})
export class CreateCategoryComponent implements OnInit, OnDestroy {
  isLoading: boolean = false;
  categoryForm: FormGroup;
  categoryTypes: any[] = [];
  private destroy$ = new Subject<void>();

  constructor(
    private fb: FormBuilder,
    private commonService: CommonService,
    private categoryService: CategoryService,
    private router: Router,
    private snackbarService: SnackbarService
  ) {
    this.categoryForm = this.fb.group({
      categoryName: ['', Validators.required],
      productCategoryTypeId: ['CATALOG_CATEGORY', Validators.required],
      description: [''],
    });
  }

  ngOnInit(): void {
    this.getCategoryTypes();
  }

  ngOnDestroy(): void {
    this.destroy$.next();
    this.destroy$.complete();
  }

  getCategoryTypes(): void {
  this.isLoading = true;

  this.commonService
    .getLookupResults({}, 'product_category_type')
    .pipe(finalize(() => (this.isLoading = false)), takeUntil(this.destroy$))
    .subscribe({
      next: (data) => {
        this.categoryTypes = Array.isArray(data) ? data : [data];
      },
      error: () => {
        this.snackbarService.showError('Error fetching category types.');
      },
    });
}

  createCategory(): void {
  if (this.categoryForm.invalid) {
    this.categoryForm.markAllAsTouched();
    return;
  }

  this.isLoading = true;
  const values = this.categoryForm.value;

  this.categoryService
    .createCategory(values)
    .pipe(finalize(() => (this.isLoading = false)))
    .subscribe({
      next: (data) => {
        if (data?.productCategoryId) {
          this.router.navigate([`/category/${data.productCategoryId}`]);
          this.snackbarService.showSuccess('Category created successfully.');
          this.categoryForm.reset({ productCategoryTypeId: 'CATALOG_CATEGORY' });
        } else {
          this.snackbarService.showError('Failed to create a category.');
        }
      },
      error: () => {
        this.snackbarService.showError('Error creating category.');
      },
    });
}

}
