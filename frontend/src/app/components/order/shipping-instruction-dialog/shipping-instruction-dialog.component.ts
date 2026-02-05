import { Component, Inject } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';

export interface ShippingInstructionDialogData {
  titleKey: string;
  shippingInstructions?: string | null;
}

@Component({
  standalone: false,
  selector: 'app-shipping-instruction-dialog',
  templateUrl: './shipping-instruction-dialog.component.html',
  styleUrls: ['./shipping-instruction-dialog.component.css']
})
export class ShippingInstructionDialogComponent {
  form = new FormGroup({
    shippingInstructions: new FormControl(this.data?.shippingInstructions || ''),
  });

  constructor(
    private dialogRef: MatDialogRef<ShippingInstructionDialogComponent>,
    @Inject(MAT_DIALOG_DATA) public data: ShippingInstructionDialogData
  ) {}

  save(): void {
    const value = this.form.value.shippingInstructions || '';
    this.dialogRef.close(value);
  }

  cancel(): void {
    this.dialogRef.close(null);
  }
}
