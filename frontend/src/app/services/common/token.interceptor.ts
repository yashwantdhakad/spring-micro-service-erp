import { Injectable } from '@angular/core';
import {
  HttpInterceptor,
  HttpRequest,
  HttpHandler,
  HttpEvent,
  HttpErrorResponse,
} from '@angular/common/http';
import { Observable, throwError } from 'rxjs';
import { catchError } from 'rxjs/operators';
import { Router } from '@angular/router';
import { NavigationService } from './navigation.service';
import { TokenStorageService } from './token-storage.service';

@Injectable()
export class TokenInterceptor implements HttpInterceptor {
  constructor(
    private router: Router,
    private navigationService: NavigationService,
    private tokenStorage: TokenStorageService
  ) {}

  /**
   * Intercepts HTTP requests to add an authorization header and handle errors.
   * @param request - The outgoing HTTP request.
   * @param next - The next handler in the chain.
   * @returns An observable of the HTTP event.
   */
  intercept(
    request: HttpRequest<any>,
    next: HttpHandler
  ): Observable<HttpEvent<any>> {
    // Clone the request to add the authorization header
    const clonedRequest = request.clone({
      setHeaders: {
        SessionToken: this.tokenStorage.getToken() || '',
      },
    });

    return next.handle(clonedRequest).pipe(
      catchError((error: HttpErrorResponse) => this.handleError(error))
    );
  }

  /**
   * Handles HTTP errors, including unauthorized access.
   * @param error - The HTTP error response.
   * @returns An observable that throws an error.
   */
  private handleError(error: HttpErrorResponse): Observable<never> {
    if (error.status === 401 || error.status === 403) {
      // Unauthorized, token is invalid, redirect to login page
      this.navigationService.setLastUrl(this.router.url); // Store the last URL
      this.tokenStorage.clearToken();
      this.router.navigate(['/login']);
    }
    return throwError(() => new Error(error.message));
  }
}
