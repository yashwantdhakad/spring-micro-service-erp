import { Component, Inject } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';
import { ProductService } from 'src/app/services/product/product.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';
import { finalize } from 'rxjs/operators';

@Component({
  selector: 'app-product-edit',
  templateUrl: './product-edit.component.html',
})
export class ProductEditComponent {
  updateProductForm: FormGroup;
  isLoading: boolean = false;

  constructor(
    public dialogRef: MatDialogRef<ProductEditComponent>,
    @Inject(MAT_DIALOG_DATA) public data: { productDetail: any },
    private fb: FormBuilder,
    private productService: ProductService,
    private snackbarService: SnackbarService
  ) {
    const { productId, productName } = this.data?.productDetail ?? {};

    this.updateProductForm = this.fb.group({
      productId: [productId],
      productName: [productName, Validators.required],
    });
  }

  updateProduct(): void {
    if (this.updateProductForm.valid) {
      this.isLoading = true;
      const values = this.updateProductForm.value;

      this.productService
        .updateProduct(values)
        .pipe(finalize(() => (this.isLoading = false)))
        .subscribe({
          next: () => {
            this.snackbarService.showSuccess('Product updated successfully.');
            this.updateProductForm.reset();
            this.dialogRef.close(values);
          },
          error: () => {
            this.snackbarService.showError('Error in updating product.');
          },
        });
    }
  }
}
