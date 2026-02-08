import { Component, Inject } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';
import { PartyService } from 'src/app/services/oms/party/party.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';
import { finalize } from 'rxjs/operators';

@Component({
  standalone: false,
  selector: 'app-party-note',
  templateUrl: './party-note.component.html',
  styleUrls: ['./party-note.component.css'],
})
export class PartyNoteComponent {
  addUpdateNoteForm: FormGroup;
  isLoading: boolean = false;

  constructor(
    public dialogRef: MatDialogRef<PartyNoteComponent>,
    @Inject(MAT_DIALOG_DATA) public data: { noteData: any },
    private fb: FormBuilder,
    private partyService: PartyService,
    private snackbarService: SnackbarService
  ) {
    const { partyId, noteId, noteDate, noteText } = this.data?.noteData ?? {};

    this.addUpdateNoteForm = this.fb.group({
      partyId: [partyId],
      noteId: [noteId],
      noteDate: [noteDate],
      noteText: [noteText, Validators.required],
    });
  }


  addUpdateNote(): void {
    if (this.addUpdateNoteForm.valid) {
      this.isLoading = true;
      const values = this.addUpdateNoteForm.value;

      const noteObservable = values.noteId
        ? this.partyService.updatePartyNote(values)
        : this.partyService.createPartyNote(values);

      noteObservable.pipe(
        finalize(() => this.isLoading = false)
      ).subscribe({
        next: () => {
          this.snackbarService.showSuccess('Party note saved successfully.');
          this.addUpdateNoteForm.reset();
          this.dialogRef.close(values);
        },
        error: (error) => {
          this.snackbarService.showError('Error in saving party note');
        }
      });
    }
  }
}
