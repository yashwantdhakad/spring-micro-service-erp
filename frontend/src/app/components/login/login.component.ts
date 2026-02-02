import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { finalize } from 'rxjs/operators';
import { AuthService } from 'src/app/services/common/auth.service';
import { NavigationService } from 'src/app/services/common/navigation.service';
import { TokenStorageService } from 'src/app/services/common/token-storage.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service'; // <-- add this

@Component({
  standalone: false,
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'],
})
export class LoginComponent implements OnInit {
  loginForm!: FormGroup;
  isLoading = false;

  constructor(
    private fb: FormBuilder,
    private authService: AuthService,
    private router: Router,
    private navigationService: NavigationService,
    private tokenStorage: TokenStorageService,
    private snackbar: SnackbarService // <-- inject
  ) {}

  ngOnInit(): void {
    this.initForm();
    this.tokenStorage.clearToken(); // Clear stale token if any
  }

  private initForm(): void {
    this.loginForm = this.fb.group({
      username: ['', Validators.required],
      password: ['', Validators.required],
    });
  }

  onSubmit(): void {
    if (this.loginForm.invalid) return;

    this.isLoading = true;
    const { username, password } = this.loginForm.value;

    this.authService
      .login(username, password)
      .pipe(
        finalize(() => {
          // Always runs (success or error)
          this.isLoading = false;
        })
      )
      .subscribe({
        next: (response) => {
          console.log('Login successful:', response);
          const token = response?.accessToken;
          if (token) this.authService.setToken(token);

          const redirectUrl = this.navigationService.getLastUrl();
          const targetUrl =
            redirectUrl && redirectUrl !== '/login' ? redirectUrl : '/home';

          this.router.navigateByUrl(targetUrl);
        },
        error: (err) => {
          // Show a clear error; customize message if your API returns one
          const message =
            err?.error?.detail ||
            err?.error?.message ||
            'Invalid username or password.';
          this.snackbar.showError(message);
          // Optional: clear only the password field
          this.loginForm.get('password')?.reset();
        },
      });
  }
}
