import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class TokenStorageService {
  private readonly TOKEN_KEY = 'token';

  setToken(token: string): void {
    document.cookie = `${this.TOKEN_KEY}=${encodeURIComponent(token)}; path=/; secure; samesite=strict`;
  }

  getToken(): string | null {
    const match = document.cookie.match(new RegExp('(^| )' + this.TOKEN_KEY + '=([^;]+)'));
    return match ? decodeURIComponent(match[2]) : null;
  }

  clearToken(): void {
    document.cookie = `${this.TOKEN_KEY}=; path=/; expires=Thu, 01 Jan 1970 00:00:00 GMT`;
  }
}
