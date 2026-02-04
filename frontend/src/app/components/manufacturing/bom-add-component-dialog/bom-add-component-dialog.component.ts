import { ChangeDetectorRef, Component, Inject, OnInit } from '@angular/core';
import { FormControl } from '@angular/forms';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';
import { Observable, of } from 'rxjs';
import { catchError, debounceTime, distinctUntilChanged, map, startWith, switchMap } from 'rxjs/operators';
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
  componentProductControl = new FormControl('');
  filteredProducts$!: Observable<any[]>;
  quantity = 1;
  assocTypeId = '';
  sequenceNum = '';
  fromDate: Date | null = null;
  isSaving = false;
  isEdit = false;
  assocId: number | null = null;

  constructor(
    @Inject(MAT_DIALOG_DATA) public data: any,
    private dialogRef: MatDialogRef<BomAddComponentDialogComponent>,
    private manufacturingService: ManufacturingService,
    private productService: ProductService,
    private cdr: ChangeDetectorRef
  ) {
    this.productId = data?.productId;
    this.assocTypeId = data?.bomTypeId || '';
    this.isEdit = data?.mode === 'edit';
    this.assocId = data?.assocId ?? null;
    if (data?.componentProductId) {
      this.componentProductControl.setValue(data.componentProductId);
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
    this.filteredProducts$ = this.componentProductControl.valueChanges.pipe(
      startWith(''),
      debounceTime(300),
      distinctUntilChanged(),
      switchMap((value) => this.searchProducts(value))
    );
    if (this.isEdit) {
      this.componentProductControl.disable({ emitEvent: false });
    }
  }

  save(): void {
    const componentProductId = this.componentProductControl.value || '';
    console.log('[BOM Add Component] submit', {
      productId: this.productId,
      componentProductId,
      assocTypeId: this.assocTypeId,
      sequenceNum: this.sequenceNum,
      quantity: this.quantity,
      fromDate: this.fromDate,
      isEdit: this.isEdit,
      assocId: this.assocId,
    });
    if (!this.productId || !componentProductId || !this.assocTypeId) {
      console.warn('[BOM Add Component] missing required fields', {
        productId: this.productId,
        componentProductId,
        assocTypeId: this.assocTypeId,
      });
      return;
    }
    this.isSaving = true;
    if (this.isEdit && this.assocId != null) {
      const payload = {
        quantity: String(this.quantity || 1),
        fromDate: this.toIsoString(this.fromDate) || new Date().toISOString(),
        sequenceNum: this.sequenceNum || undefined,
      };
      console.log('[BOM Add Component] update payload', payload);
      this.manufacturingService.updateProductAssoc(this.assocId, payload).subscribe({
        next: () => {
          console.log('[BOM Add Component] update success');
          this.isSaving = false;
          this.dialogRef.close(true);
        },
        error: (error) => {
          console.error('[BOM Add Component] update error', error);
          this.isSaving = false;
        },
      });
      return;
    }

    const payload = {
      toProductId: componentProductId,
      productAssocTypeEnumId: this.assocTypeId,
      quantity: String(this.quantity || 1),
      fromDate: this.toIsoString(this.fromDate) || new Date().toISOString(),
      sequenceNum: this.sequenceNum || undefined,
    };
    console.log('[BOM Add Component] create payload', payload);
    this.manufacturingService.addProductAssoc(this.productId, payload).subscribe({
      next: () => {
        console.log('[BOM Add Component] create success');
        this.isSaving = false;
        this.dialogRef.close(true);
      },
      error: (error) => {
        console.error('[BOM Add Component] create error', error);
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

  private searchProducts(value: string | null): Observable<any[]> {
    if (!value || typeof value !== 'string') {
      return of([]);
    }
    const keyword = value.trim();
    if (!keyword) {
      return of([]);
    }
    return this.productService.getProducts(0, keyword).pipe(
      map((response: any) => Array.isArray(response?.documentList) ? response.documentList : []),
      map((items: any[]) => items.filter((item) => item?.isVirtual !== 'Y')),
      catchError(() => of([]))
    );
  }
}
