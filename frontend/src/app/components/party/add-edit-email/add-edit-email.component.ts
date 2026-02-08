import { Component, Inject } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';
import { MatSnackBar } from '@angular/material/snack-bar';
import { TranslateService } from '@ngx-translate/core';
import { PartyService } from 'src/app/services/oms/party/party.service';
import { finalize } from 'rxjs/operators';

@Component({
  standalone: false,
  selector: 'app-add-edit-email',
  templateUrl: './add-edit-email.component.html',
  styleUrls: ['./add-edit-email.component.css'],
})
export class AddEditEmailComponent {
  addEditEmailForm: FormGroup;
  isLoading = false;

  constructor(
    private partyService: PartyService,
    public dialogRef: MatDialogRef<AddEditEmailComponent>,
    @Inject(MAT_DIALOG_DATA) public data: { addEditEmailData: any },
    private fb: FormBuilder,
    private snackBar: MatSnackBar,
    private translate: TranslateService
  ) {
    const {
      partyId,
      contactMechId,
      contactMechPurposeId,
      emailAddress,
    } = data?.addEditEmailData || {};

    this.addEditEmailForm = this.fb.group({
      partyId: [partyId],
      contactMechId: [contactMechId],
      contactMechPurposeId: [
        contactMechPurposeId || 'PRIMARY_EMAIL',
      ],
      emailAddress: [emailAddress, [Validators.required, Validators.email]],
    });
  }

  addEditEmail(): void {
    if (this.addEditEmailForm.valid) {
      this.isLoading = true;
      const values = this.addEditEmailForm.value;

      this.partyService
        .addEmail(values)
        .pipe(finalize(() => (this.isLoading = false)))
        .subscribe({
          next: () => {
            this.snackBar.open(
              this.translate.instant('PARTY.EMAIL_SAVE_SUCCESS'),
              this.translate.instant('PARTY.CLOSE'),
              {
                duration: 3000,
              }
            );
            this.addEditEmailForm.reset();
            this.dialogRef.close(values);
          },
          error: (error) => {
            this.snackBar.open(
              this.translate.instant('PARTY.EMAIL_SAVE_ERROR'),
              this.translate.instant('PARTY.CLOSE'),
              {
                duration: 3000,
              }
            );
          },
        });
    }
  }
}
