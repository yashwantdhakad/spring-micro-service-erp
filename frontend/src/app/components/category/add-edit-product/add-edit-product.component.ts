import { Component, Inject, OnDestroy, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';
import { Observable, Subject } from 'rxjs';
import { debounceTime, distinctUntilChanged, finalize, map, startWith, switchMap, takeUntil } from 'rxjs/operators';
import { CategoryService } from 'src/app/services/category/category.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service'; // Import SnackbarService
import { ProductService } from 'src/app/services/product/product.service';

@Component({
  standalone: false,
  selector: 'app-add-edit-product',
  templateUrl: './add-edit-product.component.html',
  styleUrls: ['./add-edit-product.component.css'],
})
export class AddEditProductComponent implements OnInit, OnDestroy {
  addProductToCategoryForm: FormGroup;
  isLoading: boolean = false;
  filteredProducts$: Observable<any[]> = new Observable<any[]>();
  private destroy$ = new Subject<void>();

  constructor(
    public dialogRef: MatDialogRef<AddEditProductComponent>,
    @Inject(MAT_DIALOG_DATA) public data: { categoryProductData: any },
    private fb: FormBuilder,
    private productService: ProductService,
    private categoryService: CategoryService,
    private snackbarService: SnackbarService // Inject SnackbarService
  ) {
    const { productCategoryId, productId, fromDate, thruDate } = this.data?.categoryProductData ?? {};

    this.addProductToCategoryForm = this.fb.group({
      productCategoryId: [productCategoryId],
      productId: [productId, Validators.required],
      fromDate: [fromDate],
      thruDate: [thruDate],
    });
  }

  ngOnInit(): void {
    this.filteredProducts$ = this.addProductToCategoryForm.get('productId')!.valueChanges.pipe(
      startWith(''),
      debounceTime(300),
      distinctUntilChanged(),
      switchMap(value => this.getProductsFromService(value ?? ''))
    );
  }

  private getProductsFromService(value: string): Observable<any[]> {
    return this.productService.getProducts(0, value).pipe(
      map((response: any) => response.documentList || [])
    );
  }

  ngOnDestroy(): void {
    this.destroy$.next();
    this.destroy$.complete();
  }

  addProductToCategory(): void {
    if (!this.addProductToCategoryForm.valid) {
      this.addProductToCategoryForm.markAllAsTouched();
      return;
    }

    this.isLoading = true;
    const values = this.addProductToCategoryForm.value;

    this.categoryService
      .addProductToCategory(values)
      .pipe(
        finalize(() => (this.isLoading = false)),
        takeUntil(this.destroy$)
      )
      .subscribe({
        next: () => {
          this.addProductToCategoryForm.reset();
          this.dialogRef.close({ productCategoryId: values.productCategoryId, refresh: true });
          this.snackbarService.showSuccess('Product added to category successfully');
        },
        error: () => {
          this.snackbarService.showError('Error adding product to category');
        },
      });
  }

}
