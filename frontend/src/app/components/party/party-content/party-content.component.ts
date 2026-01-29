import { Component, Inject, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';
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

  constructor(
    public dialogRef: MatDialogRef<PartyContentComponent>,
    @Inject(MAT_DIALOG_DATA) public data: { contentData: any },
    private fb: FormBuilder,
    private partyService: PartyService,
    private snackbarService: SnackbarService,
    private translate: TranslateService
  ) {}

  ngOnInit(): void {
    this.fileForm = this.fb.group({
      contentFile: [null, Validators.required],
      description: [''],
    });
  }

  onFileChange(event: any): void {
    const contentFile = event.target.files[0];
    this.fileForm.get('contentFile')?.setValue(contentFile);
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
