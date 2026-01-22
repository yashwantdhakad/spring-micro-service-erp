import { Component, Inject, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';
import { OrderService } from 'src/app/services/order/order.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';
import { finalize } from 'rxjs/operators';

@Component({
  selector: 'app-content',
  templateUrl: './content.component.html',
  styleUrls: ['./content.component.css'],
})
export class ContentComponent implements OnInit {
  fileForm!: FormGroup;
  isLoading: boolean = false;

  constructor(
    public dialogRef: MatDialogRef<ContentComponent>,
    @Inject(MAT_DIALOG_DATA) public data: { contentData: any },
    private fb: FormBuilder,
    private orderService: OrderService,
    private snackbarService: SnackbarService
  ) {}

  ngOnInit(): void {
    this.fileForm = this.fb.group({
      contentFile: [null, Validators.required],
      description: ['', Validators.required],
    });
  }

  onFileChange(event: any): void {
    const contentFile = event.target.files[0];
    this.fileForm.get('contentFile')?.setValue(contentFile);
  }

  createOrderContent(): void {
    if (this.fileForm.valid) {
      this.isLoading = true;
      const formData = new FormData();

      formData.append('orderId', this.data.contentData.orderId.toString());
      formData.append('description', this.fileForm.get('description')?.value);
      formData.append('contentFile', this.fileForm.get('contentFile')?.value);

      this.orderService
        .createOrderContent(formData)
        .pipe(finalize(() => (this.isLoading = false)))
        .subscribe({
          next: () => {
            this.dialogRef.close(true);
            this.fileForm.reset();
            this.snackbarService.showSuccess('Order content created successfully.');
          },
          error: () => {
            this.snackbarService.showError('Error in uploading order content');
          },
        });
    }
  }
}
