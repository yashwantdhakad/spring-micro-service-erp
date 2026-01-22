import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { CommonService } from 'src/app/services/common/common.service';
import { ProductService } from 'src/app/services/product/product.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';
import { TranslateService } from '@ngx-translate/core';
import { finalize } from 'rxjs/operators';

@Component({
  selector: 'app-create-product',
  templateUrl: './create-product.component.html',
  styleUrls: ['./create-product.component.css'],
})
export class CreateProductComponent implements OnInit {
  isLoading = false;
  productForm: FormGroup;
  productTypes: any[] = [];

  constructor(
    private fb: FormBuilder,
    private commonService: CommonService,
    private productService: ProductService,
    private router: Router,
    private snackbarService: SnackbarService,
    private translate: TranslateService
  ) {
    this.productForm = this.fb.group({
      productName: ['', Validators.required],
      productTypeId: ['FINISHED_GOOD', Validators.required],
      description: [''],
      price: [
        null,
        [
          Validators.required,
          Validators.min(0),
          Validators.pattern(/^\d+(\.\d{1,2})?$/) // up to 2 decimals
        ]
      ],
    });
  }

  ngOnInit(): void {
    this.fetchProductTypes();
  }

  createProduct(): void {
    if (this.productForm.invalid) return;

    this.isLoading = true;
    const values = this.productForm.value;

    this.productService
      .createProduct(values)
      .pipe(finalize(() => (this.isLoading = false)))
      .subscribe({
        next: (data) => {
          if (data?.product?.productId) {
            this.snackbarService.showSuccess(
              this.translate.instant('PRODUCT.CREATED_SUCCESS')
            );
            this.router.navigate([`/products/${data.product.productId}`]);
          } else {
            this.snackbarService.showError(
              this.translate.instant('PRODUCT.FAILED_CREATE')
            );
          }

          this.productForm.reset({
            productTypeId: 'FINISHED_GOOD',
          });
        },
        error: () => {
          this.snackbarService.showError(
            this.translate.instant('PRODUCT.ERROR_CREATE')
          );
        },
      });
  }

  fetchProductTypes(): void {
    this.commonService.getLookupResults({}, 'product_type').subscribe({
      next: (data) => {
        this.productTypes = Array.isArray(data) ? data : [data];
      },
      error: () => {
        this.snackbarService.showError(
          this.translate.instant('PRODUCT.FETCH_TYPES_ERROR')
        );
      },
    });
  }
}
