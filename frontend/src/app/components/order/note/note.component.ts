import { Component, Inject } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';
import { OrderService } from 'src/app/services/order/order.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';
import { finalize } from 'rxjs/operators';

@Component({
  selector: 'app-note',
  templateUrl: './note.component.html',
  styleUrls: ['./note.component.css'],
})
export class NoteComponent {
  addUpdateNoteForm: FormGroup;
  isLoading: boolean = false;

  constructor(
    public dialogRef: MatDialogRef<NoteComponent>,
    @Inject(MAT_DIALOG_DATA) public data: { noteData: any },
    private fb: FormBuilder,
    private orderService: OrderService,
    private snackbarService: SnackbarService
  ) {
    const { orderId, noteDate, noteText } = this.data?.noteData ?? {};

    this.addUpdateNoteForm = this.fb.group({
      orderId: [orderId],
      noteDate: [noteDate],
      noteText: [noteText, Validators.required],
    });
  }

  addUpdateNote(): void {
    if (!this.addUpdateNoteForm.valid) {
      return;
    }

    this.isLoading = true;
    const values = this.addUpdateNoteForm.value;

    const noteObservable = values.noteDate
      ? this.orderService.updateOrderNote(values)
      : this.orderService.createOrderNote(values);

    noteObservable
      .pipe(finalize(() => (this.isLoading = false)))
      .subscribe({
        next: (data) => {
          this.snackbarService.showSuccess('Note saved successfully.');
          this.addUpdateNoteForm.reset();
          this.dialogRef.close(data);
        },
        error: () => {
          this.snackbarService.showError('Error saving note.');
        },
      });
  }
}
