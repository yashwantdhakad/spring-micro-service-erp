import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Router } from '@angular/router';
import { TokenStorageService } from './token-storage.service';
import { ApiConfigService } from './api-config.service';

@Injectable({
  providedIn: 'root',
})
export class AuthService {
  constructor(
    private http: HttpClient,
    private router: Router,
    private tokenStorage: TokenStorageService,
    private apiConfig: ApiConfigService
  ) {}

  /**
   * Logs in the user by making an HTTP POST request to the login endpoint.
   * @param username - The username of the user.
   * @param password - The password of the user.
   * @returns An observable of the HTTP response.
   */
  login(userLoginId: string, password: string): Observable<any> {
    const url = this.apiConfig.buildUrl('/security/auth/login');
    return this.http.post(url, { userLoginId, password });
  }

  /**
   * Logs out the user by removing the token from session storage and navigating to the login page.
   */
  logout(): void {
    this.tokenStorage.clearToken();
    this.router.navigateByUrl('/login');
  }

  /**
   * Sets the authentication token in session storage.
   * @param token - The authentication token.
   */
  setToken(token: string): void {
    this.tokenStorage.setToken(token);
  }

  /**
   * Retrieves the authentication token from session storage.
   * @returns The authentication token, or null if not found.
   */
  getToken(): string | null {
    return this.tokenStorage.getToken();
  }

  /**
   * Checks if the user is authenticated by verifying the presence of a token in session storage.
   * @returns True if the user is authenticated, false otherwise.
   */
  isAuthenticated(): boolean {
    return this.getToken() !== null;
  }
}
