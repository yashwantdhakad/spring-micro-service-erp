import { Component, Inject } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';
import { finalize } from 'rxjs/operators';
import { SnackbarService } from 'src/app/services/common/snackbar.service';
import { UserService } from 'src/app/services/security/user.service';

@Component({
  selector: 'app-edit-user',
  templateUrl: './edit-user.component.html',
  styleUrls: ['./edit-user.component.css'],
})
export class EditUserComponent {
  isLoading = false;

  userForm = this.fb.group({
    userLoginId: [{ value: '', disabled: true }],
    password: [''],
    firstName: [''],
    lastName: [''],
    enabled: [true, Validators.required],
    requirePasswordChange: [false],
  });

  constructor(
    private fb: FormBuilder,
    private userService: UserService,
    private snackbarService: SnackbarService,
    public dialogRef: MatDialogRef<EditUserComponent>,
    @Inject(MAT_DIALOG_DATA)
    public data: {
      userLoginId: string;
      user: any;
    }
  ) {
    this.userForm.patchValue({
      userLoginId: data?.userLoginId,
      firstName: data?.user?.firstName || '',
      lastName: data?.user?.lastName || '',
      enabled: data?.user?.enabled ?? true,
      requirePasswordChange: data?.user?.requirePasswordChange ?? false,
    });
  }

  updateUser(): void {
    if (this.userForm.invalid) {
      this.userForm.markAllAsTouched();
      return;
    }

    this.isLoading = true;
    const payload = { ...this.userForm.getRawValue() } as any;
    const userLoginId = this.data?.userLoginId || payload.userLoginId;
    delete payload.userLoginId;
    if (!payload.password) {
      delete payload.password;
    }

    this.userService
      .updateUser(userLoginId, payload)
      .pipe(finalize(() => (this.isLoading = false)))
      .subscribe({
        next: () => {
          this.snackbarService.showSuccess('User updated successfully');
          this.dialogRef.close(true);
        },
        error: () => {
          this.snackbarService.showError('Failed to update user');
        },
      });
  }
}
