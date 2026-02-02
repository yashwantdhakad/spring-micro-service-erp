import { Component, Inject } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';
import { MatSnackBar } from '@angular/material/snack-bar';
import { TranslateService } from '@ngx-translate/core';
import { CommonService } from 'src/app/services/common/common.service';
import { PartyService } from 'src/app/services/party/party.service';
import { finalize } from 'rxjs/operators';

@Component({
  standalone: false,
  selector: 'app-add-identification',
  templateUrl: './add-identification.component.html',
  styleUrls: ['./add-identification.component.css'],
})
export class AddIdentificationComponent {
  addIdentificationForm: FormGroup;
  enumTypes: any[] | undefined;
  isLoading: boolean = false;

  constructor(
    private commonService: CommonService,
    private partyService: PartyService,
    private snackBar: MatSnackBar,
    public dialogRef: MatDialogRef<AddIdentificationComponent>,
    @Inject(MAT_DIALOG_DATA) public data: { identificationData: any },
    private fb: FormBuilder,
    private translate: TranslateService
  ) {
    const { partyId, partyIdTypeEnumId, idValue } = data?.identificationData;

    this.addIdentificationForm = this.fb.group({
      partyId: [partyId],
      partyIdTypeEnumId: [partyIdTypeEnumId || 'PtidArn', Validators.required],
      idValue: [idValue, Validators.required],
    });

    this.getEnumTypes();
  }

  getEnumTypes(): void {
    this.commonService.getEnumTypes('PartyIdType').subscribe({
      next: (data) => {
        this.enumTypes = Array.isArray(data) ? data : [data];
      },
      error: (error) => {
      },
    });
  }

  addUpdateIdentification(): void {
    if (!this.addIdentificationForm.valid) return;

    const values = this.addIdentificationForm.value;
    this.isLoading = true;

    this.partyService.addIdentification(values).pipe(
      finalize(() => (this.isLoading = false))
    ).subscribe({
      next: () => {
        this.snackBar.open(
          this.translate.instant('PARTY.IDENTIFICATION_SAVE_SUCCESS'),
          this.translate.instant('PARTY.CLOSE'),
          { duration: 3000 }
        );
        this.addIdentificationForm.reset({
          partyIdTypeEnumId: 'PtidArn',
        });
        this.dialogRef.close(values);
      },
      error: (error) => {
        this.snackBar.open(
          this.translate.instant('PARTY.IDENTIFICATION_SAVE_ERROR'),
          this.translate.instant('PARTY.CLOSE'),
          { duration: 3000 }
        );
      },
    });
  }
}
