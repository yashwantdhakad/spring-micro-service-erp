import { Component, Inject } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';
import { MatSnackBar } from '@angular/material/snack-bar';
import { TranslateService } from '@ngx-translate/core';
import { PartyService } from 'src/app/services/party/party.service';
import { finalize } from 'rxjs/operators';

@Component({
  selector: 'app-add-edit-phone',
  templateUrl: './add-edit-phone.component.html',
  styleUrls: ['./add-edit-phone.component.css'],
})
export class AddEditPhoneComponent {
  addEditPhoneForm: FormGroup;
  isLoading: boolean = false;
  phonePattern: string = '^[0-9]{10}$';

  constructor(
    private partyService: PartyService,
    public dialogRef: MatDialogRef<AddEditPhoneComponent>,
    @Inject(MAT_DIALOG_DATA) public data: { addEditPhoneData: any },
    private fb: FormBuilder,
    private snackBar: MatSnackBar,
    private translate: TranslateService
  ) {
    const addEditPhoneData = data?.addEditPhoneData || {};
    const contactNumber = addEditPhoneData.contactNumber || '';

    this.addEditPhoneForm = this.fb.group({
      partyId: [addEditPhoneData.partyId || null],
      contactMechId: [addEditPhoneData.contactMechId],
      contactMechPurposeId: [
        addEditPhoneData.contactMechPurposeId || 'PhonePrimary',
      ],
      contactNumber: [
        contactNumber,
        [Validators.required, Validators.pattern(this.phonePattern)],
      ],
      areaCode: [addEditPhoneData.areaCode || ''],
      countryCode: [addEditPhoneData.countryCode || ''],
    });
  }

  addEditPhone(): void {
    if (this.addEditPhoneForm.valid) {
      this.isLoading = true;
      const values = this.addEditPhoneForm.value;

      const request$ = values.contactMechId
        ? this.partyService.updatePhoneNumber(values)
        : this.partyService.addPhone(values);

      request$
        .pipe(finalize(() => (this.isLoading = false)))
        .subscribe({
          next: () => {
            this.snackBar.open(
              this.translate.instant('PARTY.PHONE_SAVE_SUCCESS'),
              this.translate.instant('PARTY.CLOSE'),
              {
                duration: 3000,
              }
            );
            this.addEditPhoneForm.reset();
            this.dialogRef.close(values);
          },
          error: (error) => {
            this.snackBar.open(
              this.translate.instant('PARTY.PHONE_SAVE_ERROR'),
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
