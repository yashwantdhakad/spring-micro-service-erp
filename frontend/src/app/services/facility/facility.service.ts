import { Injectable } from '@angular/core';
import { ApiService } from '../common/api.service';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class FacilityService {
  constructor(private apiService: ApiService) {}

  getFacilities(): Observable<any> {
    const url = '/api/facilities';
    return this.apiService.get(url);
  }

  getFacility(facilityId: string): Observable<any> {
    const url = `/api/facilities/${facilityId}`;
    return this.apiService.get(url);
  }

  createFacility(payload: any): Observable<any> {
    const url = '/api/facilities';
    return this.apiService.post(url, payload);
  }

  getFacilityTypes(): Observable<any> {
    const url = '/api/facilities/types';
    return this.apiService.get(url);
  }

  createFacilityLocation(payload: any): Observable<any> {
    const url = '/api/facility-locations';
    return this.apiService.post(url, payload);
  }

  updateFacilityLocation(id: number, payload: any): Observable<any> {
    const url = `/api/facility-locations/${id}`;
    return this.apiService.put(url, payload);
  }
}
