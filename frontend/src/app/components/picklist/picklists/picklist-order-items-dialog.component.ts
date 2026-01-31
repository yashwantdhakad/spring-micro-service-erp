import { Component, Inject } from '@angular/core';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';

@Component({
  selector: 'app-picklist-order-items-dialog',
  templateUrl: './picklist-order-items-dialog.component.html',
  styleUrls: ['./picklist-order-items-dialog.component.css'],
})
export class PicklistOrderItemsDialogComponent {
  displayedColumns = ['product', 'quantity', 'location', 'lotId'];

  constructor(
    private dialogRef: MatDialogRef<PicklistOrderItemsDialogComponent>,
    @Inject(MAT_DIALOG_DATA) public data: { orderId: string; items: any[] }
  ) {}

  close(): void {
    this.dialogRef.close();
  }

  getProductLabel(item: any): string {
    return item?.productName || item?.productId || item?.inventoryItemId || '';
  }
}
