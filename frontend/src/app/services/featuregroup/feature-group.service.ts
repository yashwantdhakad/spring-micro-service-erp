import { Injectable } from '@angular/core';
import { ApiService } from '../common/api.service';
import { Observable } from 'rxjs';
import { HttpResponse } from '@angular/common/http';

@Injectable({
  providedIn: 'root',
})
export class FeatureGroupService {
  constructor(private apiService: ApiService) {}

  getFeatureGroups(pageIndex: number, keyword: string): Observable<HttpResponse<any>> {
    const params = {
      pageIndex: pageIndex.toString(),
      pageSize: '10',
      queryString: keyword,
    };
    const queryString = new URLSearchParams(params).toString();
    const url = `/wms/api/product-feature-groups?${queryString}`;
    return this.apiService.customGet(url); // should return Observable<HttpResponse<any>>
  }

  createFeatureGroup(params: any): Observable<any> {
    return this.apiService.post('/wms/api/product-feature-groups', params);
  }

  getFeatureGroup(productFeatureGroupId: string): Observable<any> {
    const url = `/wms/api/product-feature-groups/by-id/${encodeURIComponent(productFeatureGroupId)}`;
    return this.apiService.get(url);
  }

  updateFeatureGroup(params: any): Observable<any> {
    const url = `/wms/api/product-feature-groups/by-id/${encodeURIComponent(params.productFeatureGroupId)}`;
    return this.apiService.put(url, params);
  }

  createProductCategoryFeatGrpAppl(params: any): Observable<any> {
    return this.apiService.post('/wms/api/product-feature-cat-grp-appls', params);
  }

  updateProductCategoryFeatGrpAppl(params: any): Observable<any> {
    const url = `/wms/api/product-feature-cat-grp-appls/${encodeURIComponent(params.id)}`;
    return this.apiService.put(url, params);
  }

  createProductFeatureGroupAppl(params: any): Observable<any> {
    return this.apiService.post('/wms/api/product-feature-group-appls', params);
  }

  updateProductFeatureGroupAppl(params: any): Observable<any> {
    const url = `/wms/api/product-feature-group-appls/${encodeURIComponent(params.id)}`;
    return this.apiService.put(url, params);
  }
}
