import { Component, Inject } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';
import { CategoryService } from 'src/app/services/category/category.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';
import { finalize } from 'rxjs/operators';

@Component({
  standalone: false,
  selector: 'app-edit-category',
  templateUrl: './edit-category.component.html',
  styleUrls: ['./edit-category.component.css'],
})
export class EditCategoryComponent {
  updateCategoryForm: FormGroup;
  isLoading: boolean = false;

  constructor(
    public dialogRef: MatDialogRef<EditCategoryComponent>,
    @Inject(MAT_DIALOG_DATA) public data: { categoryDetail: any },
    private fb: FormBuilder,
    private categoryService: CategoryService,
    private snackbarService: SnackbarService
  ) {
    const { productCategoryId, categoryName, description } =
      this.data?.categoryDetail ?? {};

    this.updateCategoryForm = this.fb.group({
      productCategoryId: [productCategoryId],
      categoryName: [categoryName, Validators.required],
      description: [description],
    });
  }

  updateCategory(): void {
    if (this.updateCategoryForm.invalid) {
      this.updateCategoryForm.markAllAsTouched();
      return;
    }
    this.isLoading = true;
    const values = this.updateCategoryForm.value;

    this.categoryService
      .updateCategory(values)
      .pipe(finalize(() => (this.isLoading = false)))
      .subscribe({
        next: () => {
          this.updateCategoryForm.reset();
          this.dialogRef.close(values);
          this.snackbarService.showSuccess('Category updated successfully.');
        },
        error: () => {
          this.snackbarService.showError('Failed to update category.');
        },
      });
  }

}
