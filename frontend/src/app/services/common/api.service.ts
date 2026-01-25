import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpResponse, HttpErrorResponse } from '@angular/common/http';
import { Observable, throwError } from 'rxjs';
import { catchError } from 'rxjs/operators';
import { TokenStorageService } from './token-storage.service';
import { ApiConfigService } from './api-config.service';

@Injectable({
  providedIn: 'root',
})
export class ApiService {
  constructor(
    private http: HttpClient,
    private tokenStorage: TokenStorageService,
    private apiConfig: ApiConfigService
  ) {}

  private getHeaders(contentType?: string): HttpHeaders {
    const token = this.tokenStorage.getToken();
    let headers = new HttpHeaders();

    if (token) {
      headers = headers.set('Authorization', `Bearer ${token}`);
    }

    if (contentType) {
      headers = headers.set('Content-Type', contentType);
    }

    return headers;
  }


  private handleError(error: HttpErrorResponse): Observable<never> {
    let errorMessage = 'An unknown error occurred!';
    if (error.error instanceof ErrorEvent) {
      // Client-side error
      errorMessage = `Error: ${error.error.message}`;
    } else {
      // Server-side error
      errorMessage = `Error Code: ${error.status}\nMessage: ${error.message}`;
    }
    return throwError(() => new Error(errorMessage));
  }

  get<T>(endpoint: string): Observable<T> {
    const url = this.apiConfig.buildUrl(endpoint);
    return this.http.get<T>(url, { headers: this.getHeaders() }).pipe(
      catchError(this.handleError)
    );
  }

  customGet<T>(endpoint: string): Observable<HttpResponse<T>> {
    const url = this.apiConfig.buildUrl(endpoint);
    return this.http.get<T>(url, { headers: this.getHeaders(), observe: 'response' }).pipe(
      catchError(this.handleError)
    );
  }

  post<T>(endpoint: string, body: any): Observable<T> {
    const url = this.apiConfig.buildUrl(endpoint);
    return this.http.post<T>(url, body, { headers: this.getHeaders('application/json') }).pipe(
      catchError(this.handleError)
    );
  }

  put<T>(endpoint: string, body: any): Observable<T> {
    const url = this.apiConfig.buildUrl(endpoint);
    return this.http.put<T>(url, body, { headers: this.getHeaders('application/json') }).pipe(
      catchError(this.handleError)
    );
  }

  delete<T>(endpoint: string): Observable<T> {
    const url = this.apiConfig.buildUrl(endpoint);
    return this.http.delete<T>(url, { headers: this.getHeaders() }).pipe(
      catchError(this.handleError)
    );
  }

  patch<T>(endpoint: string, data: any): Observable<T> {
    const url = this.apiConfig.buildUrl(endpoint);
    return this.http.patch<T>(url, data, { headers: this.getHeaders('application/json') }).pipe(
      catchError(this.handleError)
    );
  }

  postFormData<T>(endpoint: string, formData: FormData): Observable<T> {
    const url = this.apiConfig.buildUrl(endpoint);
    return this.http.post<T>(url, formData, { headers: this.getHeaders() }).pipe(
      catchError(this.handleError)
    );
  }
}
