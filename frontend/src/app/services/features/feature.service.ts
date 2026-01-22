import { Injectable } from '@angular/core';
import { ApiService } from '../common/api.service';
import { Observable } from 'rxjs';
import { HttpResponse } from '@angular/common/http';

@Injectable({
  providedIn: 'root',
})
export class FeatureService {
  constructor(private apiService: ApiService) {}

  getFeatures(pageIndex: number, keyword: string): Observable<HttpResponse<any>> {
    const params = {
      pageIndex: pageIndex.toString(),
      queryString: keyword,
    };
    const queryString = new URLSearchParams(params).toString();
    const url = `/api/rest/s1/mantle/products/features?${queryString}`;
    return this.apiService.customGet(url); // should return Observable<HttpResponse<any>>
  }

  createFeature(params: any): Observable<any> {
    return this.apiService.post('/api/rest/s1/commerce/features', params);
  }

  getFeature(productFeatureId: string): Observable<any> {
    const url = `/api/rest/s1/mantle/products/features/${productFeatureId}`;
    return this.apiService.get(url);
  }

  updateFeature(params: any): Observable<any> {
    return this.apiService.put('/api/rest/s1/commerce/features/', params);
  }

  createProductFeatureAppl(params: any): Observable<any> {
    return this.apiService.post('/api/rest/s1/commerce/productFeatureAppl', params);
  }

  updateProductFeatureAppl(params: any): Observable<any> {
    return this.apiService.put('/api/rest/s1/commerce/productFeatureAppl', params);
  }

  createProductFeatureGroupAppl(params: any): Observable<any> {
    return this.apiService.post('/api/rest/s1/commerce/productFeatureGroupAppl', params);
  }

  updateProductFeatureGroupAppl(params: any): Observable<any> {
    return this.apiService.put('/api/rest/s1/commerce/productFeatureGroupAppl', params);
  }
}
