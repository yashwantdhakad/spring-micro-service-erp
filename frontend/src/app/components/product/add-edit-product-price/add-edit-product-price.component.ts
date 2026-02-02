import { Component, Inject } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';
import { CommonService } from 'src/app/services/common/common.service';
import { ProductService } from 'src/app/services/product/product.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';
import { finalize } from 'rxjs/operators';

@Component({
  standalone: false,
  selector: 'app-add-edit-product-price',
  templateUrl: './add-edit-product-price.component.html',
  styleUrls: ['./add-edit-product-price.component.css'],
})
export class AddEditProductPriceComponent {
  addUpdateProductPriceForm: FormGroup;
  isLoading: boolean = false;
  priceTypeEnums: any[] | undefined;
  pricePurposeEnums: any[] | undefined;
  priceUomOptions: any[] = [];

  constructor(
    public dialogRef: MatDialogRef<AddEditProductPriceComponent>,
    @Inject(MAT_DIALOG_DATA) public data: { productPriceData: any },
    private fb: FormBuilder,
    private productService: ProductService,
    private commonService: CommonService,
    private snackbarService: SnackbarService
  ) {
    const {
      productId,
      productPriceId,
      productPriceTypeId,
      productPricePurposeId,
      price,
      currencyUomId,
    } = this.data?.productPriceData ?? {};

    this.priceTypeEnums = this.data.productPriceData.priceTypeEnums;
    this.pricePurposeEnums = this.data.productPriceData.pricePurposeEnums;

    this.addUpdateProductPriceForm = this.fb.group({
      productId: [productId],
      productPriceTypeId: [productPriceTypeId || 'DEFAULT_PRICE', Validators.required],
      productPricePurposeId: [productPricePurposeId || 'PURCHASE', Validators.required],
      price: [price, Validators.required],
      currencyUomId: [currencyUomId || 'USD', Validators.required],
      productPriceId: [productPriceId],
    });

    this.getUoms();
  }

  getUoms(): void {
    this.commonService.getUoms('UT_CURRENCY_MEASURE').subscribe({
      next: (data) => {
        this.priceUomOptions = Array.isArray(data) ? data : [data];
      },
      error: (error) => {
        this.snackbarService.showError('Error fetching UOM types.');
      }
    });
  }

  addUpdateProductPrice(): void {
    if (this.addUpdateProductPriceForm.valid) {
      this.isLoading = true;
      const values = this.addUpdateProductPriceForm.value;

      const request$ = values.productPriceId
        ? this.productService.updateProductPrice(values)
        : this.productService.addProductPrice(values);

      request$
        .pipe(finalize(() => (this.isLoading = false)))
        .subscribe({
          next: () => {
            const message = values.productPriceId
              ? 'Product price updated successfully.'
              : 'Product price added successfully.';
            this.snackbarService.showSuccess(message);
            this.addUpdateProductPriceForm.reset();
            this.dialogRef.close(values);
          },
          error: () => {
            this.snackbarService.showError('Error adding/updating product price.');
          },
        });
    }
  }
}
