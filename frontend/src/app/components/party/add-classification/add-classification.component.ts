import { Component, Inject } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';
import { finalize } from 'rxjs/operators';
import { CommonService } from 'src/app/services/common/common.service';
import { PartyService } from 'src/app/services/party/party.service';

@Component({
  standalone: false,
  selector: 'app-add-classification',
  templateUrl: './add-classification.component.html',
  styleUrls: ['./add-classification.component.css'],
})
export class AddClassificationComponent {
  addClassificationForm: FormGroup;
  enumTypes: any[] = [];
  classifications: any[] = [];
  isLoading = false;

  constructor(
    private commonService: CommonService,
    private partyService: PartyService,
    public dialogRef: MatDialogRef<AddClassificationComponent>,
    @Inject(MAT_DIALOG_DATA) public data: { classificationData: any },
    private fb: FormBuilder
  ) {
    const { partyId, classificationTypeEnumId, partyClassificationId } =
      data?.classificationData || {};

    this.addClassificationForm = this.fb.group({
      partyId: [partyId],
      classificationTypeEnumId: [classificationTypeEnumId, Validators.required],
      partyClassificationId: [partyClassificationId, Validators.required],
    });

    this.loadEnumTypes();
    this.loadClassifications();
  }

  private loadClassifications(): void {
    this.partyService.getClassifications({ classificationTypeEnumId: 'PcltCustomer' })
      .subscribe({
        next: (data: any) => {
          this.classifications = Array.isArray(data) ? data : [data];
        },
        error: (err) => {
        }
      });
  }

  private loadEnumTypes(): void {
    this.commonService.getEnumTypes('PartyClassificationType')
      .subscribe({
        next: (data: any) => {
          this.enumTypes = Array.isArray(data) ? data : [data];
        },
        error: (err) => {
        }
      });
  }

  addUpdateClassification(): void {
    if (this.addClassificationForm.valid) {
      this.isLoading = true;
      const values = this.addClassificationForm.value;

      this.partyService.addClassification(values)
        .pipe(finalize(() => this.isLoading = false))
        .subscribe({
          next: () => {
            this.addClassificationForm.reset({ classificationTypeEnumId: '' });
            this.dialogRef.close(values);
          },
          error: (err) => {
          }
        });
    }
  }
}
