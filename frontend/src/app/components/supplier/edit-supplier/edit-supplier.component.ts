import { Component, Inject } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';
import { TranslateService } from '@ngx-translate/core';
import { SnackbarService } from 'src/app/services/common/snackbar.service';
import { PartyService } from 'src/app/services/party/party.service';
import { finalize } from 'rxjs/operators';

@Component({
  selector: 'app-edit-supplier',
  templateUrl: './edit-supplier.component.html',
  styleUrls: ['./edit-supplier.component.css'],
})
export class EditSupplierComponent {
  updateSupplierForm: FormGroup;
  isLoading: boolean = false;

  constructor(
    public dialogRef: MatDialogRef<EditSupplierComponent>,
    @Inject(MAT_DIALOG_DATA) public data: { supplierDetail: any },
    private fb: FormBuilder,
    private partyService: PartyService,
    private snackbarService: SnackbarService,
    private translate: TranslateService
  ) {
    const { partyId, groupName } = this.data?.supplierDetail ?? {};

    this.updateSupplierForm = this.fb.group({
      partyId: [partyId],
      groupName: [groupName, Validators.required],
    });
  }

  updateSupplier(): void {
    if (this.updateSupplierForm.valid) {
      this.isLoading = true;
      const values = this.updateSupplierForm.value;

      this.partyService
        .updateSupplier(values)
        .pipe(finalize(() => (this.isLoading = false)))
        .subscribe({
          next: () => {
            this.updateSupplierForm.reset();
            this.dialogRef.close(values);
            this.snackbarService.showSuccess(
              this.translate.instant('SUPPLIER.UPDATED_SUCCESS')
            );
          },
          error: () => {
            this.snackbarService.showError(
              this.translate.instant('SUPPLIER.ERROR_UPDATE')
            );
          },
        });
    }
  }
}
