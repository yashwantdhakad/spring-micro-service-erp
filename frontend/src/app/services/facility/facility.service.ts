import { Injectable } from '@angular/core';
import { ApiService } from '../common/api.service';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class FacilityService {
  constructor(private apiService: ApiService) {}

  getFacilities(): Observable<any> {
    const url = '/wms/api/facilities';
    return this.apiService.get(url);
  }

  getFacility(facilityId: string): Observable<any> {
    const url = `/wms/api/facilities/${encodeURIComponent(facilityId)}`;
    return this.apiService.get(url);
  }

  createFacility(payload: any): Observable<any> {
    const url = '/wms/api/facilities';
    return this.apiService.post(url, payload);
  }

  getFacilityTypes(): Observable<any> {
    const url = '/wms/api/facility-types';
    return this.apiService.get(url);
  }

  createFacilityLocation(payload: any): Observable<any> {
    const url = '/wms/api/facility-locations';
    return this.apiService.post(url, payload);
  }

  updateFacilityLocation(id: number, payload: any): Observable<any> {
    const url = `/wms/api/facility-locations/${id}`;
    return this.apiService.put(url, payload);
  }

  getFacilityContactMechs(facilityId: string): Observable<any> {
    const url = `/wms/api/facility-contact-mechs/by-facility/${encodeURIComponent(facilityId)}`;
    return this.apiService.get(url);
  }

  getFacilityContactMechPurposes(facilityId: string): Observable<any> {
    const url = `/wms/api/facility-contact-mech-purposes/by-facility/${encodeURIComponent(facilityId)}`;
    return this.apiService.get(url);
  }
}
