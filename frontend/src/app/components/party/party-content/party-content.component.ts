import { Component, Inject, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';
import { CommonService } from 'src/app/services/common/common.service';
import { PartyService } from 'src/app/services/party/party.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';
import { TranslateService } from '@ngx-translate/core';
import { finalize } from 'rxjs/operators';

@Component({
  selector: 'app-party-content',
  templateUrl: './party-content.component.html',
  styleUrls: ['./party-content.component.css'],
})
export class PartyContentComponent implements OnInit {
  fileForm!: FormGroup;
  isLoading: boolean = false;
  enumTypes: any[] | undefined;

  constructor(
    public dialogRef: MatDialogRef<PartyContentComponent>,
    @Inject(MAT_DIALOG_DATA) public data: { contentData: any },
    private fb: FormBuilder,
    private partyService: PartyService,
    private snackbarService: SnackbarService,
    private commonService: CommonService,
    private translate: TranslateService
  ) {}

  ngOnInit(): void {
    this.fileForm = this.fb.group({
      contentFile: [null, Validators.required],
      partyContentTypeEnumId: ['', Validators.required],
      description: [''],
    });

    this.getEnumTypes();
  }

  onFileChange(event: any): void {
    const contentFile = event.target.files[0];
    this.fileForm.get('contentFile')?.setValue(contentFile);
  }

  getEnumTypes(): void {
    this.commonService.getEnumTypes('PartyContentType').subscribe({
      next: (data) => {
        this.enumTypes = Array.isArray(data) ? data : [data];
      },
      error: (error) => {
      }
    });
  }

  createPartyContent(): void {
    if (this.fileForm.valid) {
      this.isLoading = true;

      const formData = new FormData();
      const fileInputElement = document.getElementById('fileInput') as HTMLInputElement;

      formData.append('partyId', this.data.contentData.partyId.toString());

      if (fileInputElement?.files?.[0]) {
        formData.append('contentFile', fileInputElement.files[0]);
      }

      formData.append('partyContentTypeEnumId', this.fileForm.get('partyContentTypeEnumId')?.value);
      formData.append('description', this.fileForm.get('description')?.value || '');

      this.partyService.createPartyContent(formData).pipe(
        finalize(() => {
          this.isLoading = false;
          if (fileInputElement) {
            fileInputElement.value = '';
          }
        })
      ).subscribe({
        next: () => {
          this.dialogRef.close(this.data?.contentData);
          this.fileForm.reset();
          this.snackbarService.showSuccess(
            this.translate.instant('PARTY.CONTENT_SAVE_SUCCESS')
          );
        },
        error: (error) => {
          this.snackbarService.showError(
            this.translate.instant('PARTY.CONTENT_SAVE_ERROR')
          );
        }
      });
    }
  }
}
