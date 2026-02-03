import { Component } from '@angular/core';
import { MatDialogRef } from '@angular/material/dialog';

@Component({
  standalone: false,
  selector: 'app-bom-create-item-dialog',
  templateUrl: './bom-create-item-dialog.component.html',
  styleUrls: ['./bom-create-item-dialog.component.css'],
})
export class BomCreateItemDialogComponent {
  componentProductId = '';
  quantity = 1;
  fromDate = '';

  constructor(private dialogRef: MatDialogRef<BomCreateItemDialogComponent>) {}

  save(): void {
    if (!this.componentProductId) {
      return;
    }
    this.dialogRef.close({
      componentProductId: this.componentProductId,
      quantity: this.quantity,
      fromDate: this.fromDate,
    });
  }

  close(): void {
    this.dialogRef.close(null);
  }
}
