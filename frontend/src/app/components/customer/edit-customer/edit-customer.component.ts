import { Component, Inject } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';
import { PartyService } from 'src/app/services/party/party.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';
import { TranslateService } from '@ngx-translate/core';
import { finalize } from 'rxjs/operators';

@Component({
  standalone: false,
  selector: 'app-edit-customer',
  templateUrl: './edit-customer.component.html',
  styleUrls: ['./edit-customer.component.css']
})
export class EditCustomerComponent {
  updateCustomerForm: FormGroup;
  isLoading: boolean = false;

  constructor(
    public dialogRef: MatDialogRef<EditCustomerComponent>,
    @Inject(MAT_DIALOG_DATA) public data: { customerDetail: any },
    private fb: FormBuilder,
    private partyService: PartyService,
    private snackbarService: SnackbarService,
    private translate: TranslateService
  ) {
    const { partyId, firstName, lastName } = this.data?.customerDetail ?? {};

    this.updateCustomerForm = this.fb.group({
      partyId: [partyId],
      firstName: [firstName, Validators.required],
      lastName: [lastName, Validators.required],
    });
  }

  updateCustomer(): void {
    if (this.updateCustomerForm.invalid) {
      this.updateCustomerForm.markAllAsTouched();
      return;
    }
    this.isLoading = true;
    const values = this.updateCustomerForm.value;

    this.partyService.updateCustomer(values)
      .pipe(finalize(() => this.isLoading = false))
      .subscribe({
        next: () => {
          this.updateCustomerForm.reset();
          this.dialogRef.close(values);
          this.snackbarService.showSuccess(
            this.translate.instant('CUSTOMER.UPDATED_SUCCESS')
          );
        },
        error: () => {
          this.snackbarService.showError(
            this.translate.instant('CUSTOMER.ERROR_UPDATE')
          );
        }
      });
  }
}
