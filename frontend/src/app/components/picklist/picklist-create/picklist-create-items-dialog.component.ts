import { Component, Inject } from '@angular/core';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';

@Component({
  standalone: false,
  selector: 'app-picklist-create-items-dialog',
  templateUrl: './picklist-create-items-dialog.component.html',
  styleUrls: ['./picklist-create-items-dialog.component.css'],
})
export class PicklistCreateItemsDialogComponent {
  displayedColumns = ['product', 'reservedQuantity', 'inventoryItemId', 'orderItemSeqId'];

  constructor(
    private dialogRef: MatDialogRef<PicklistCreateItemsDialogComponent>,
    @Inject(MAT_DIALOG_DATA) public data: { orderId: string; items: any[] }
  ) {}

  close(): void {
    this.dialogRef.close();
  }

  getProductLabel(item: any): string {
    return item?.description || item?.productId || '';
  }
}
