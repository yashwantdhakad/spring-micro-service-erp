import { Component, Inject, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';
import {
  Observable,
  debounceTime,
  distinctUntilChanged,
  from,
  map,
  startWith,
  switchMap,
} from 'rxjs';
import { ManufacturingService } from 'src/app/services/manufacturing/manufacturing.service';
import { ProductService } from 'src/app/services/product/product.service';

@Component({
  selector: 'app-consumable-item',
  templateUrl: './consumable-item.component.html',
  styleUrls: ['./consumable-item.component.css'],
})
export class ConsumableItemComponent implements OnInit {
  addConsumableForm: FormGroup;
  isLoading = false;
  filteredProducts$: Observable<any[]> = new Observable<any[]>();

  constructor(
    public dialogRef: MatDialogRef<ConsumableItemComponent>,
    @Inject(MAT_DIALOG_DATA) public data: { consumableData: any },
    private fb: FormBuilder,
    private manufacturingService: ManufacturingService,
    private productService: ProductService
  ) {
    const { workEffortId, productId, estimatedQuantity } =
      this.data?.consumableData ?? {};

    this.addConsumableForm = this.fb.group({
      workEffortId: [workEffortId],
      productId: [productId, Validators.required],
      estimatedQuantity: [estimatedQuantity || '1', Validators.required],
    });
  }

  ngOnInit(): void {
    this.setupAutocomplete();
  }

  private setupAutocomplete(): void {
    this.filteredProducts$ = this.addConsumableForm.get('productId')!.valueChanges.pipe(
      startWith(''),
      debounceTime(300),
      distinctUntilChanged(),
      switchMap((value) => this.getProductsFromService(value))
    );
  }

  private getProductsFromService(value: string): Observable<any[]> {
    return from(this.productService.getProducts(0, value)).pipe(
      map((response: any) => response.documentList)
    );
  }

  addConsumable(): void {
    if (this.addConsumableForm.invalid) {
      return;
    }
    this.isLoading = true;
    const values = this.addConsumableForm.value;
    const payload = {
      productId: values.productId,
      estimatedQuantity: values.estimatedQuantity,
    };

    this.manufacturingService.addConsumable(values.workEffortId, payload).subscribe({
      next: () => {
        this.dialogRef.close(payload);
        this.addConsumableForm.reset();
      },
      error: () => {
      },
      complete: () => {
        this.isLoading = false;
      },
    });
  }
}
