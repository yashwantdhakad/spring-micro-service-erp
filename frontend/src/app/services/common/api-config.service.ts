import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root',
})
export class ApiConfigService {
  readonly baseUrl = environment.apiUrl;

  buildUrl(endpoint: string): string {
    if (endpoint.startsWith('http')) {
      return endpoint;
    }
    if (endpoint.startsWith('/')) {
      return `${this.baseUrl}${endpoint}`;
    }
    return `${this.baseUrl}/${endpoint}`;
  }
}
