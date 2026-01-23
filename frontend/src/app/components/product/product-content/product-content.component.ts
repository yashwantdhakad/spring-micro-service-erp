import { Component, Inject, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';
import { ProductService } from 'src/app/services/product/product.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';
import { TranslateService } from '@ngx-translate/core';
import { finalize } from 'rxjs/operators';

@Component({
  selector: 'app-product-content',
  templateUrl: './product-content.component.html',
  styleUrls: ['./product-content.component.css'],
})
export class ProductContentComponent implements OnInit {
  fileForm!: FormGroup;
  isLoading: boolean = false;

  constructor(
    public dialogRef: MatDialogRef<ProductContentComponent>,
    @Inject(MAT_DIALOG_DATA) public data: { contentData: any },
    private fb: FormBuilder,
    private productService: ProductService,
    private snackbarService: SnackbarService,
    private translate: TranslateService
  ) {}

  ngOnInit(): void {
    this.fileForm = this.fb.group({
      contentFile: [null, Validators.required],
    });
  }

  onFileChange(event: any): void {
    const contentFile = event.target.files[0];
    if (contentFile) {
      this.fileForm.get('contentFile')?.setValue(contentFile);
    }
  }

  createProductContent(): void {
    if (this.fileForm.valid) {
      this.isLoading = true;

      const formData = new FormData();
      const file = this.fileForm.get('contentFile')?.value;

      formData.append('productId', this.data.contentData.productId.toString());
      formData.append('contentFile', file);

      this.productService
        .createProductContent(this.data.contentData.productId, formData)
        .pipe(finalize(() => (this.isLoading = false)))
        .subscribe({
          next: () => {
            this.snackbarService.showSuccess(
              this.translate.instant('PRODUCT.CONTENT_SAVE_SUCCESS')
            );
            this.fileForm.reset();
            this.dialogRef.close(this.data.contentData);
          },
          error: () => {
            this.snackbarService.showError(
              this.translate.instant('PRODUCT.CONTENT_SAVE_ERROR')
            );
          },
        });
    }
  }
}
