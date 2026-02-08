import { Component, Inject, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';
import { Observable, of } from 'rxjs';
import { debounceTime, distinctUntilChanged, map, switchMap } from 'rxjs/operators';
import { ProductService } from 'src/app/services/product/product.service';
import { SupplierProductService } from 'src/app/services/supplier-product/supplier-product.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';
import { PartyService } from 'src/app/services/oms/party/party.service';
import { ChangeDetectorRef } from '@angular/core';

@Component({
  standalone: false,
  selector: 'app-supplier-product-dialog',
  templateUrl: './supplier-product-dialog.component.html',
  styleUrls: ['./supplier-product-dialog.component.css'],
})
export class SupplierProductDialogComponent implements OnInit {
  supplierProductForm: FormGroup;
  filteredProducts$: Observable<any[]> = of([]);
  filteredSuppliers$: Observable<any[]> = of([]);
  isLoading = false;
  isPartyLocked = false;
  isProductLocked = false;

  constructor(
    private fb: FormBuilder,
    private productService: ProductService,
    private partyService: PartyService,
    private supplierProductService: SupplierProductService,
    private snackbarService: SnackbarService,
    private dialogRef: MatDialogRef<SupplierProductDialogComponent>,
    private cdr: ChangeDetectorRef,
    @Inject(MAT_DIALOG_DATA) public data: { partyId?: string; productId?: string }
  ) {
    this.supplierProductForm = this.fb.group({
      partyId: ['', Validators.required],
      productId: ['', Validators.required],
      supplierProductName: [''],
      lastPrice: [''],
    });
  }

  ngOnInit(): void {
    if (this.data?.partyId) {
      this.supplierProductForm.get('partyId')?.setValue(this.data.partyId);
      this.isPartyLocked = true;
    }
    if (this.data?.productId) {
      this.supplierProductForm.get('productId')?.setValue(this.data.productId);
      this.isProductLocked = true;
    }

    this.filteredProducts$ = this.supplierProductForm.get('productId')!.valueChanges.pipe(
      debounceTime(300),
      distinctUntilChanged(),
      switchMap((value) =>
        this.productService.getProducts(0, typeof value === 'string' ? value : '')
          .pipe(map((response: any) => response?.documentList || []))
      )
    );

    this.filteredSuppliers$ = this.supplierProductForm.get('partyId')!.valueChanges.pipe(
      debounceTime(300),
      distinctUntilChanged(),
      switchMap((value) =>
        this.partyService.getSuppliers(0, typeof value === 'string' ? value : '').pipe(
          map((response: any) => response?.resultList || [])
        )
      )
    );
  }

  onSupplierProductSelected(productId: string): void {
    if (productId) {
      this.supplierProductForm.get('productId')?.setValue(productId);
    }
  }

  onSupplierSelected(partyId: string): void {
    if (partyId) {
      this.supplierProductForm.get('partyId')?.setValue(partyId);
    }
  }

  save(): void {
    if (this.supplierProductForm.invalid) {
      this.supplierProductForm.markAllAsTouched();
      return;
    }

    const values = this.supplierProductForm.value;
    const payload = {
      partyId: this.isPartyLocked ? this.data.partyId : values.partyId,
      productId: this.isProductLocked ? this.data.productId : values.productId,
      supplierProductName: values.supplierProductName || null,
      lastPrice: values.lastPrice || null,
    };

    this.isLoading = true;
    this.cdr.markForCheck();
    this.supplierProductService.create(payload).subscribe({
      next: () => {
        setTimeout(() => {
          this.isLoading = false;
          this.cdr.markForCheck();
          this.snackbarService.showSuccess('Supplier product added.');
          this.dialogRef.close(true);
        }, 0);
      },
      error: () => {
        setTimeout(() => {
          this.isLoading = false;
          this.cdr.markForCheck();
          this.snackbarService.showError('Failed to add supplier product.');
        }, 0);
      },
    });
  }

  cancel(): void {
    this.dialogRef.close();
  }
}
