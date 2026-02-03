import { Component, Inject, OnInit } from '@angular/core';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';
import { forkJoin, of } from 'rxjs';
import { catchError, map } from 'rxjs/operators';
import { ManufacturingService } from 'src/app/services/manufacturing/manufacturing.service';
import { ProductService } from 'src/app/services/product/product.service';

@Component({
  standalone: false,
  selector: 'app-bom-add-component-dialog',
  templateUrl: './bom-add-component-dialog.component.html',
  styleUrls: ['./bom-add-component-dialog.component.css'],
})
export class BomAddComponentDialogComponent implements OnInit {
  productId = '';
  products: any[] = [];
  componentProductId = '';
  quantity = 1;
  assocTypeId = '';
  sequenceNum = '';
  fromDate: Date | null = null;
  isSaving = false;
  queryString = '';
  isEdit = false;
  assocId: number | null = null;

  constructor(
    @Inject(MAT_DIALOG_DATA) public data: any,
    private dialogRef: MatDialogRef<BomAddComponentDialogComponent>,
    private manufacturingService: ManufacturingService,
    private productService: ProductService
  ) {
    this.productId = data?.productId;
    this.assocTypeId = data?.bomTypeId || '';
    this.isEdit = data?.mode === 'edit';
    this.assocId = data?.assocId ?? null;
    if (data?.componentProductId) {
      this.componentProductId = data.componentProductId;
    }
    if (data?.quantity) {
      this.quantity = Number(data.quantity) || this.quantity;
    }
    if (data?.sequenceNum) {
      this.sequenceNum = data.sequenceNum;
    }
    if (data?.fromDate) {
      const parsed = new Date(data.fromDate);
      this.fromDate = Number.isNaN(parsed.getTime()) ? null : parsed;
    }
  }

  ngOnInit(): void {
    this.loadProducts();
  }

  loadProducts(): void {
    const keyword = this.queryString || '';
    this.productService.getProducts(0, keyword).pipe(
      map((response: any) => Array.isArray(response?.documentList) ? response.documentList : []),
      catchError(() => of([]))
    ).subscribe((list) => {
      this.products = list;
    });
  }

  save(): void {
    if (!this.productId || !this.componentProductId || !this.assocTypeId) {
      return;
    }
    this.isSaving = true;
    if (this.isEdit && this.assocId != null) {
      const payload = {
        quantity: String(this.quantity || 1),
        fromDate: this.toIsoString(this.fromDate) || new Date().toISOString(),
        sequenceNum: this.sequenceNum || undefined,
      };
      this.manufacturingService.updateProductAssoc(this.assocId, payload).subscribe({
        next: () => {
          this.isSaving = false;
          this.dialogRef.close(true);
        },
        error: () => {
          this.isSaving = false;
        },
      });
      return;
    }

    const payload = {
      toProductId: this.componentProductId,
      productAssocTypeEnumId: this.assocTypeId,
      quantity: String(this.quantity || 1),
      fromDate: this.toIsoString(this.fromDate) || new Date().toISOString(),
      sequenceNum: this.sequenceNum || undefined,
    };
    this.manufacturingService.addProductAssoc(this.productId, payload).subscribe({
      next: () => {
        this.isSaving = false;
        this.dialogRef.close(true);
      },
      error: () => {
        this.isSaving = false;
      },
    });
  }

  close(): void {
    this.dialogRef.close(false);
  }

  private toIsoString(value: Date | string | null): string | null {
    if (!value) {
      return null;
    }
    if (value instanceof Date) {
      return value.toISOString();
    }
    const parsed = new Date(value);
    return Number.isNaN(parsed.getTime()) ? null : parsed.toISOString();
  }
}
