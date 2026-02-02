import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { finalize } from 'rxjs/operators';
import { SnackbarService } from 'src/app/services/common/snackbar.service';
import { UserService } from 'src/app/services/security/user.service';

@Component({
  standalone: false,
  selector: 'app-create-user',
  templateUrl: './create-user.component.html',
  styleUrls: ['./create-user.component.css'],
})
export class CreateUserComponent implements OnInit {
  isLoading = false;
  userForm = this.fb.group({
    userLoginId: ['', Validators.required],
    password: ['', Validators.required],
    firstName: [''],
    lastName: [''],
    enabled: [true, Validators.required],
    requirePasswordChange: [false],
  });

  constructor(
    private fb: FormBuilder,
    private userService: UserService,
    private snackbarService: SnackbarService,
    private router: Router
  ) {}

  ngOnInit(): void {
  }

  createUser(): void {
    if (this.userForm.invalid) {
      this.userForm.markAllAsTouched();
      return;
    }

    this.isLoading = true;
    this.userService
      .createUser(this.userForm.value)
      .pipe(finalize(() => (this.isLoading = false)))
      .subscribe({
        next: (response: any) => {
          const createdId = response?.userDetail?.user?.userLoginId || this.userForm.value.userLoginId;
          this.snackbarService.showSuccess('User created successfully');
          this.userForm.reset({
            enabled: true,
            requirePasswordChange: false,
          });
          if (createdId) {
            this.router.navigate(['/users', createdId]);
          }
        },
        error: () => {
          this.snackbarService.showError('Failed to create user');
        },
      });
  }
}
