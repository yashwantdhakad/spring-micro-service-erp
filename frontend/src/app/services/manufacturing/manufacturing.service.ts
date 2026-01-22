import { Injectable } from '@angular/core';
import { ApiService } from '../common/api.service';
import { Observable } from 'rxjs';
import { HttpResponse } from '@angular/common/http';

@Injectable({
  providedIn: 'root',
})
export class ManufacturingService {
  constructor(private apiService: ApiService) {}

  getJobs(pageIndex: number, keyword: string): Observable<HttpResponse<any>> {
    const params = new URLSearchParams();
    params.append('pageIndex', pageIndex.toString());
    params.append('purposeEnumId', 'WepProductionRun');
    if (keyword) {
      params.append('jobName', keyword);
    }

    const url = `/api/rest/s1/mantle/workEfforts?${params.toString()}`;
    return this.apiService.customGet(url); // Expected to return Observable<HttpResponse<any>>
  }

  getJob(workEffortId: string): Observable<any> {
    const url = `/api/rest/s1/mantle/workEfforts/${workEffortId}/run/displayInfo`;
    return this.apiService.get(url);
  }

  getFacilities(): Observable<any> {
    return this.apiService.get('/api/rest/s1/commerce/Facilities');
  }

  getFacilityLocations(): Observable<any> {
    return this.apiService.get('/api/rest/s1/commerce/FacilityLocations');
  }

  createJob(params: any): Observable<any> {
    return this.apiService.post('/api/rest/s1/mantle/workEfforts/runs', params);
  }
}
