import { Component, Inject, OnDestroy, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';
import { Observable, Subject } from 'rxjs';
import { debounceTime, distinctUntilChanged, finalize, map, startWith, switchMap, takeUntil } from 'rxjs/operators';
import { CategoryService } from 'src/app/services/category/category.service';
import { ProductService } from 'src/app/services/product/product.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';

@Component({
  selector: 'app-add-edit-product-category',
  templateUrl: './add-edit-product-category.component.html',
  styleUrls: ['./add-edit-product-category.component.css'],
})
export class AddEditProductCategoryComponent implements OnInit, OnDestroy {
  addProductCategoryForm: FormGroup;

  isLoading: boolean = false;
  cachedCategories: any[] = [];
  private destroy$ = new Subject<void>();

  filteredCategories$: Observable<any[]> = new Observable<any[]>();
  get productCategoryIdControl(): FormControl {
    return this.addProductCategoryForm.get('productCategoryId') as FormControl;
  }


  constructor(
    public dialogRef: MatDialogRef<AddEditProductCategoryComponent>,
    @Inject(MAT_DIALOG_DATA) public data: { productCategoryData: any },
    private fb: FormBuilder,
    private productService: ProductService,
    private categoryService: CategoryService,
    private snackbarService: SnackbarService
  ) {
    const { productId } = this.data?.productCategoryData ?? {};

    this.addProductCategoryForm = this.fb.group({
      productId: [productId],
      productCategoryId: ['', Validators.required],
    });
  }

  ngOnInit(): void {
    this.filteredCategories$ = this.productCategoryIdControl.valueChanges.pipe(
      startWith(''),
      debounceTime(300),
      distinctUntilChanged(),
      switchMap((value) => this.getCategoriesFromService(value))
    );
  }

  private getCategoriesFromService(value: string): Observable<any[]> {
    return this.categoryService.getCategories(0, value).pipe(
      map((response: any) => {
        this.cachedCategories = response.body;
        return response.body;
      })
    );
  }

  ngOnDestroy(): void {
    this.destroy$.next();
    this.destroy$.complete();
  }

  addProductCategory(): void {
    if (this.addProductCategoryForm.valid) {
      this.isLoading = true;
      const values = this.addProductCategoryForm.value;

      this.productService
        .addProductCategory(values)
        .pipe(
          finalize(() => (this.isLoading = false)),
          takeUntil(this.destroy$)
        )
        .subscribe({
          next: () => {
            this.snackbarService.showSuccess('Product category added successfully.');
            this.addProductCategoryForm.reset();
            this.dialogRef.close(values);
          },
          error: () => {
            this.snackbarService.showError('Error adding product category.');
          },
        });
    }
  }

  displayCategoryFn = (categoryId: string): string => {
    const match = this.cachedCategories.find(
      (c) => c.productCategoryId === categoryId
    );
    return match ? match.categoryName : categoryId;
  };


}
