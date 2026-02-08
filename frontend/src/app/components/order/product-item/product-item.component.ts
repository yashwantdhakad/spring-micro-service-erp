import { Component, Inject, OnInit } from '@angular/core';
import {
  FormBuilder,
  FormControl,
  FormGroup,
  Validators,
} from '@angular/forms';
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
import { CommonService } from 'src/app/services/common/common.service';
import { OrderService } from 'src/app/services/order/order.service';
import { ProductService } from 'src/app/services/product/product.service';

@Component({
  standalone: false,
  selector: 'app-product-item',
  templateUrl: './product-item.component.html',
  styleUrls: ['./product-item.component.css'],
})
export class ProductItemComponent implements OnInit {
  addUpdateProductItemForm: FormGroup;
  isLoading: boolean = false;
  filteredProducts$: Observable<any[]> = new Observable<any[]>();
  itemProductIdControl = new FormControl();
  enumTypes: any[] | undefined;
  itemTypes = [
    { key: 'ItemInventory', text: 'Inventory' },
    { key: 'ItemAsset', text: 'Fixed Asset' },
    { key: 'ItemExpSupplies', text: 'Supplies' },
    { key: 'ItemProduct', text: 'Product' },
    { key: 'ItemRental', text: 'Rental Asset' },
    { key: 'ItemReplacement', text: 'Replacement' },
  ];

  constructor(
    public dialogRef: MatDialogRef<ProductItemComponent>,
    @Inject(MAT_DIALOG_DATA) public data: { productItemData: any },
    private fb: FormBuilder,
    private orderService: OrderService,
    private productService: ProductService,
    private commonService: CommonService
  ) {
    const {
      orderId,
      orderPartSeqId,
      orderItemSeqId,
      updateExisting,
      requireInventory,
      productId,
      quantity,
      unitAmount,
      calcAmount,
      standardCost,
      requiredByDate,
      itemTypeEnumId,
    } = this.data?.productItemData ?? {};

    this.addUpdateProductItemForm = this.fb.group({
      orderId: [orderId],
      orderPartSeqId: [orderPartSeqId],
      orderItemSeqId: [orderItemSeqId],
      updateExisting: [updateExisting || false],
      requireInventory: [requireInventory || false],
      productId: [productId, Validators.required],
      quantity: [quantity, Validators.required],
      calcAmount: [calcAmount],
      standardCost: [standardCost],
      unitAmount: [unitAmount, Validators.required],
      requiredByDate: [requiredByDate],
      itemTypeEnumId: [itemTypeEnumId],
    });
  }


  private setupAutocomplete(): void {
    this.filteredProducts$ = this.addUpdateProductItemForm.get('productId')!.valueChanges.pipe(
      startWith(''),
      debounceTime(300),
      distinctUntilChanged(),
      switchMap((value) => this.getProductsFromService(value))
    );
  }

  public getProductsFromService(value: string): Observable<any[]> {
    return from(this.productService.getProducts(0, value)).pipe(
      map((response: any) => response.documentList)
    );
  }

  ngOnInit(): void {
    this.setupAutocomplete();

    // Check if we are in update mode
    const updateExisting = this.addUpdateProductItemForm.get('updateExisting')?.value;
    if (updateExisting) {
      this.addUpdateProductItemForm.get('productId')?.disable();
      this.addUpdateProductItemForm.get('itemTypeEnumId')?.disable();
    }
  }


  addUpdateProductItem(): void {
    if (!this.addUpdateProductItemForm.valid) return;

    this.isLoading = true;
    const values = this.addUpdateProductItemForm.value;

    const action$ = values.updateExisting
      ? this.orderService.updateOrderItemQuantity(values.orderId, values.orderItemSeqId, values.quantity, values.unitAmount)
      : this.orderService.addItem(values);

    action$.subscribe({
      next: () => {
        this.isLoading = false;
        this.dialogRef.close(values);
        this.addUpdateProductItemForm.reset();
      },
      error: (err) => {
        this.isLoading = false;
      },
      complete: () => {
        this.isLoading = false;
      },
    });
  }
}
