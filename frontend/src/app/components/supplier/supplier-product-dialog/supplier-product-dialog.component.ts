import { Component, Inject, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';
import { Observable, of } from 'rxjs';
import { debounceTime, distinctUntilChanged, map, switchMap } from 'rxjs/operators';
import { ProductService } from 'src/app/services/product/product.service';
import { SupplierProductService } from 'src/app/services/supplier-product/supplier-product.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';

@Component({
  selector: 'app-supplier-product-dialog',
  templateUrl: './supplier-product-dialog.component.html',
  styleUrls: ['./supplier-product-dialog.component.css'],
})
export class SupplierProductDialogComponent implements OnInit {
  supplierProductForm: FormGroup;
  filteredProducts$: Observable<any[]> = of([]);
  isLoading = false;

  constructor(
    private fb: FormBuilder,
    private productService: ProductService,
    private supplierProductService: SupplierProductService,
    private snackbarService: SnackbarService,
    private dialogRef: MatDialogRef<SupplierProductDialogComponent>,
    @Inject(MAT_DIALOG_DATA) public data: { partyId: string }
  ) {
    this.supplierProductForm = this.fb.group({
      productId: ['', Validators.required],
      supplierProductName: [''],
      lastPrice: [''],
    });
  }

  ngOnInit(): void {
    this.filteredProducts$ = this.supplierProductForm.get('productId')!.valueChanges.pipe(
      debounceTime(300),
      distinctUntilChanged(),
      switchMap((value) =>
        this.productService.getProducts(0, typeof value === 'string' ? value : '')
          .pipe(map((response: any) => response?.documentList || []))
      )
    );
  }

  onSupplierProductSelected(productId: string): void {
    if (productId) {
      this.supplierProductForm.get('productId')?.setValue(productId);
    }
  }

  save(): void {
    if (this.supplierProductForm.invalid || !this.data?.partyId) {
      this.supplierProductForm.markAllAsTouched();
      return;
    }

    const values = this.supplierProductForm.value;
    const payload = {
      partyId: this.data.partyId,
      productId: values.productId,
      supplierProductName: values.supplierProductName || null,
      lastPrice: values.lastPrice || null,
    };

    this.isLoading = true;
    this.supplierProductService.create(payload).subscribe({
      next: () => {
        this.isLoading = false;
        this.snackbarService.showSuccess('Supplier product added.');
        this.dialogRef.close(true);
      },
      error: () => {
        this.isLoading = false;
        this.snackbarService.showError('Failed to add supplier product.');
      },
    });
  }

  cancel(): void {
    this.dialogRef.close();
  }
}
