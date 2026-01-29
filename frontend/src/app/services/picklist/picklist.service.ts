import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { ApiService } from '../common/api.service';

@Injectable({
  providedIn: 'root',
})
export class PicklistService {
  constructor(private apiService: ApiService) {}

  getPicklists(filters: {
    facilityId?: string;
    statusId?: string;
    fromDate?: string;
    toDate?: string;
  }): Observable<any> {
    const params = new URLSearchParams();
    if (filters.facilityId) {
      params.append('facilityId', filters.facilityId);
    }
    if (filters.statusId) {
      params.append('statusId', filters.statusId);
    }
    if (filters.fromDate) {
      params.append('fromDate', filters.fromDate);
    }
    if (filters.toDate) {
      params.append('toDate', filters.toDate);
    }

    const suffix = params.toString();
    const url = suffix
      ? `/wms/api/picklists-view/summary?${suffix}`
      : '/wms/api/picklists-view/summary';
    return this.apiService.get(url);
  }

  getPicklist(picklistId: string): Observable<any> {
    const url = `/wms/api/picklists-view/${encodeURIComponent(picklistId)}`;
    return this.apiService.get(url);
  }

  assignPicker(picklistId: string, partyId: string): Observable<any> {
    const url = '/wms/api/picklist-roles';
    const payload = {
      picklistId,
      partyId,
      roleTypeId: 'PICKER',
      fromDate: new Date().toISOString(),
    };
    return this.apiService.post(url, payload);
  }
}
