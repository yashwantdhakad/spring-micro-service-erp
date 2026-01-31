import { Component, Inject, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';
import { finalize } from 'rxjs/operators';
import { SnackbarService } from 'src/app/services/common/snackbar.service';
import { UserService } from 'src/app/services/security/user.service';

@Component({
  selector: 'app-add-user-role',
  templateUrl: './add-user-role.component.html',
  styleUrls: ['./add-user-role.component.css'],
})
export class AddUserRoleComponent implements OnInit {
  isLoading = false;
  roles: any[] = [];

  roleForm = this.fb.group({
    roleIds: this.fb.control<string[] | null>(null, Validators.required),
  });

  constructor(
    private fb: FormBuilder,
    private userService: UserService,
    private snackbarService: SnackbarService,
    public dialogRef: MatDialogRef<AddUserRoleComponent>,
    @Inject(MAT_DIALOG_DATA)
    public data: { userLoginId: string; selectedRoleIds: string[] }
  ) {}

  ngOnInit(): void {
    this.roleForm.patchValue({
      roleIds: this.data?.selectedRoleIds ?? null,
    });

    this.userService.listRoles().subscribe({
      next: (roles) => (this.roles = Array.isArray(roles) ? roles : []),
      error: () => (this.roles = []),
    });
  }

  saveRoles(): void {
    if (this.roleForm.invalid) {
      this.roleForm.markAllAsTouched();
      return;
    }

    this.isLoading = true;
    const roleIds = this.roleForm.value.roleIds || [];

    this.userService
      .updateUser(this.data.userLoginId, { roleIds })
      .pipe(finalize(() => (this.isLoading = false)))
      .subscribe({
        next: () => {
          this.snackbarService.showSuccess('Roles updated successfully');
          this.dialogRef.close(true);
        },
        error: () => {
          this.snackbarService.showError('Failed to update roles');
        },
      });
  }
}
