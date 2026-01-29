import { Injectable } from '@angular/core';
import { ApiService } from '../common/api.service';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class ManufacturingService {
  constructor(private apiService: ApiService) {}

  getJobs(pageIndex: number, pageSize: number, keyword: string): Observable<any> {
    const params = new URLSearchParams();
    params.append('page', pageIndex.toString());
    params.append('size', pageSize.toString());
    if (keyword) {
      params.append('queryString', keyword);
    }

    const url = `/mfg/api/jobs?${params.toString()}`;
    return this.apiService.get(url);
  }

  getJob(workEffortId: string): Observable<any> {
    const url = `/mfg/api/jobs/${encodeURIComponent(workEffortId)}`;
    return this.apiService.get(url);
  }

  createJob(params: any): Observable<any> {
    return this.apiService.post('/mfg/api/jobs', params);
  }

  getJobBom(productId: string): Observable<any> {
    const params = new URLSearchParams({
      productId: productId,
    });
    return this.apiService.get(`/mfg/api/jobs/bom?${params.toString()}`);
  }

  approveJob(workEffortId: string): Observable<any> {
    return this.apiService.post(`/mfg/api/jobs/${encodeURIComponent(workEffortId)}/approve`, {});
  }

  startJob(workEffortId: string): Observable<any> {
    return this.apiService.post(`/mfg/api/jobs/${encodeURIComponent(workEffortId)}/start`, {});
  }

  addConsumable(workEffortId: string, payload: any): Observable<any> {
    return this.apiService.post(`/mfg/api/jobs/${encodeURIComponent(workEffortId)}/consumables`, payload);
  }

  reserveConsumable(workEffortId: string, wegsId: number, payload: any): Observable<any> {
    return this.apiService.post(
      `/mfg/api/jobs/${encodeURIComponent(workEffortId)}/consumables/${wegsId}/reserve`,
      payload
    );
  }

  releaseConsumable(workEffortId: string, wegsId: number, payload: any): Observable<any> {
    return this.apiService.post(
      `/mfg/api/jobs/${encodeURIComponent(workEffortId)}/consumables/${wegsId}/release`,
      payload
    );
  }

  issueConsumable(workEffortId: string, wegsId: number, payload: any): Observable<any> {
    return this.apiService.post(
      `/mfg/api/jobs/${encodeURIComponent(workEffortId)}/consumables/${wegsId}/issue`,
      payload
    );
  }

  cancelConsumable(workEffortId: string, wegsId: number): Observable<any> {
    return this.apiService.post(
      `/mfg/api/jobs/${encodeURIComponent(workEffortId)}/consumables/${wegsId}/cancel`,
      {}
    );
  }
}
