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

    const url = `/wms/api/jobs?${params.toString()}`;
    return this.apiService.get(url);
  }

  getJob(workEffortId: string): Observable<any> {
    const url = `/wms/api/jobs/${encodeURIComponent(workEffortId)}`;
    return this.apiService.get(url);
  }

  createJob(params: any): Observable<any> {
    return this.apiService.post('/wms/api/jobs', params);
  }

  getJobBom(productId: string): Observable<any> {
    const params = new URLSearchParams({
      productId: productId,
    });
    return this.apiService.get(`/wms/api/jobs/bom?${params.toString()}`);
  }

  getBoms(pageIndex: number, pageSize: number, queryString: string, bomTypeId?: string): Observable<any> {
    const params = new URLSearchParams();
    params.append('page', pageIndex.toString());
    params.append('size', pageSize.toString());
    if (queryString) {
      params.append('queryString', queryString);
    }
    if (bomTypeId) {
      params.append('bomTypeId', bomTypeId);
    }
    return this.apiService.get(`/wms/api/boms?${params.toString()}`);
  }

  getProductDetail(productId: string): Observable<any> {
    return this.apiService.get(`/wms/api/products/${encodeURIComponent(productId)}`);
  }

  getProductAssocTypes(): Observable<any[]> {
    return this.apiService.get('/wms/api/product-assoc-types');
  }

  addProductAssoc(productId: string, payload: any): Observable<any> {
    return this.apiService.post(`/wms/api/products/${encodeURIComponent(productId)}/assocs`, payload);
  }

  updateProductAssoc(assocId: number, payload: any): Observable<any> {
    return this.apiService.patch(`/wms/api/product-assocs/${assocId}`, payload);
  }

  expireProductAssoc(assocId: number): Observable<any> {
    return this.apiService.post(`/wms/api/product-assocs/${assocId}/expire`, {});
  }

  approveJob(workEffortId: string): Observable<any> {
    return this.apiService.post(`/wms/api/jobs/${encodeURIComponent(workEffortId)}/approve`, {});
  }

  startJob(workEffortId: string): Observable<any> {
    return this.apiService.post(`/wms/api/jobs/${encodeURIComponent(workEffortId)}/start`, {});
  }

  completeJob(workEffortId: string): Observable<any> {
    return this.apiService.post(`/wms/api/jobs/${encodeURIComponent(workEffortId)}/complete`, {});
  }

  closeJob(workEffortId: string): Observable<any> {
    return this.apiService.post(`/wms/api/jobs/${encodeURIComponent(workEffortId)}/close`, {});
  }

  addConsumable(workEffortId: string, payload: any): Observable<any> {
    return this.apiService.post(`/wms/api/jobs/${encodeURIComponent(workEffortId)}/consumables`, payload);
  }

  reserveConsumable(workEffortId: string, wegsId: number, payload: any): Observable<any> {
    return this.apiService.post(
      `/wms/api/jobs/${encodeURIComponent(workEffortId)}/consumables/${wegsId}/reserve`,
      payload
    );
  }

  releaseConsumable(workEffortId: string, wegsId: number, payload: any): Observable<any> {
    return this.apiService.post(
      `/wms/api/jobs/${encodeURIComponent(workEffortId)}/consumables/${wegsId}/release`,
      payload
    );
  }

  issueConsumable(workEffortId: string, wegsId: number, payload: any): Observable<any> {
    return this.apiService.post(
      `/wms/api/jobs/${encodeURIComponent(workEffortId)}/consumables/${wegsId}/issue`,
      payload
    );
  }

  cancelConsumable(workEffortId: string, wegsId: number): Observable<any> {
    return this.apiService.post(
      `/wms/api/jobs/${encodeURIComponent(workEffortId)}/consumables/${wegsId}/cancel`,
      {}
    );
  }

  produceItem(workEffortId: string, payload: any): Observable<any> {
    return this.apiService.post(`/wms/api/jobs/${encodeURIComponent(workEffortId)}/produce`, payload);
  }
}
