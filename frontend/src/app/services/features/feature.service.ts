import { Injectable } from '@angular/core';
import { ApiService } from '../common/api.service';
import { Observable } from 'rxjs';
import { HttpResponse } from '@angular/common/http';

@Injectable({
  providedIn: 'root',
})
export class FeatureService {
  constructor(private apiService: ApiService) { }

  getFeatures(pageIndex: number, keyword: string): Observable<HttpResponse<any>> {
    const params = {
      pageIndex: pageIndex.toString(),
      pageSize: '10',
      queryString: keyword,
    };
    const queryString = new URLSearchParams(params).toString();
    const url = `/wms/api/product-features?${queryString}`;
    return this.apiService.customGet(url); // should return Observable<HttpResponse<any>>
  }

  createFeature(params: any): Observable<any> {
    return this.apiService.post('/wms/api/product-features', params);
  }

  getFeature(productFeatureId: string): Observable<any> {
    const url = `/wms/api/product-features/by-id/${encodeURIComponent(productFeatureId)}`;
    return this.apiService.get(url);
  }

  updateFeature(params: any): Observable<any> {
    const url = `/wms/api/product-features/by-id/${encodeURIComponent(params.productFeatureId)}`;
    return this.apiService.put(url, params);
  }

  createProductFeatureAppl(params: any): Observable<any> {
    return this.apiService.post('/wms/api/product-feature-appls', params);
  }

  updateProductFeatureAppl(params: any): Observable<any> {
    const url = `/wms/api/product-feature-appls/${encodeURIComponent(params.id)}`;
    return this.apiService.put(url, params);
  }

  createProductFeatureGroupAppl(params: any): Observable<any> {
    return this.apiService.post('/wms/api/product-feature-group-appls', params);
  }

  updateProductFeatureGroupAppl(params: any): Observable<any> {
    const url = `/wms/api/product-feature-group-appls/${encodeURIComponent(params.id)}`;
    return this.apiService.put(url, params);
  }

  getProductFeatureAppls(productId: string): Observable<any[]> {
    const url = `/wms/api/product-feature-appls/product/${encodeURIComponent(productId)}`;
    return this.apiService.get(url);
  }

  deleteProductFeatureAppl(id: number): Observable<any> {
    return this.apiService.delete(`/wms/api/product-feature-appls/${id}`);
  }
}
