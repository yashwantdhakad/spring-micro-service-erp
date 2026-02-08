import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { ApiService } from '../common/api.service';

@Injectable({
  providedIn: 'root',
})
export class UserService {
  constructor(private apiService: ApiService) {}

  listUsers(page: number, query: string, sortBy?: string, sortDirection?: string): Observable<any> {
    const params = new URLSearchParams({
      page: page.toString(),
      pageSize: '10',
      query: query ?? '',
    });
    if (sortBy) {
      params.append('sortBy', sortBy);
    }
    if (sortDirection) {
      params.append('sortDirection', sortDirection);
    }
    return this.apiService.get(`/oms/security/users?${params.toString()}`);
  }

  getUser(userLoginId: string): Observable<any> {
    return this.apiService.get(`/oms/security/users/${encodeURIComponent(userLoginId)}`);
  }

  createUser(payload: any): Observable<any> {
    return this.apiService.post('/oms/security/users', payload);
  }

  updateUser(userLoginId: string, payload: any): Observable<any> {
    return this.apiService.put(`/oms/security/users/${encodeURIComponent(userLoginId)}`, payload);
  }

  deleteUser(userLoginId: string): Observable<any> {
    return this.apiService.delete(`/oms/security/users/${encodeURIComponent(userLoginId)}`);
  }

  listRoles(): Observable<any> {
    return this.apiService.get('/oms/security/security-groups').pipe(
      map((response: any) => {
        if (Array.isArray(response)) {
          return response;
        }
        return Array.isArray(response?.resultList) ? response.resultList : [];
      })
    );
  }

  listPermissions(): Observable<any> {
    return this.apiService.get('/oms/security/security-permissions').pipe(
      map((response: any) => {
        if (Array.isArray(response)) {
          return response;
        }
        return Array.isArray(response?.resultList) ? response.resultList : [];
      })
    );
  }
}
