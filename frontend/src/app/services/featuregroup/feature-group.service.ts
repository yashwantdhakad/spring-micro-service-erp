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
      queryString: keyword,
    };
    const queryString = new URLSearchParams(params).toString();
    const url = `/api/rest/s1/commerce/featureGroups?${queryString}`;
    return this.apiService.customGet(url); // should return Observable<HttpResponse<any>>
  }

  createFeatureGroup(params: any): Observable<any> {
    return this.apiService.post('/api/rest/s1/commerce/featureGroups', params);
  }

  getFeatureGroup(productFeatureGroupId: string): Observable<any> {
    const url = `/api/rest/s1/mantle/products/features/groups/${productFeatureGroupId}`;
    return this.apiService.get(url);
  }

  updateFeatureGroup(params: any): Observable<any> {
    const url = `/api/rest/s1/commerce/featureGroups/`;
    return this.apiService.put(url, params);
  }

  createProductCategoryFeatGrpAppl(params: any): Observable<any> {
    return this.apiService.post('/api/rest/s1/commerce/productCategoryFeatGrpAppl', params);
  }

  updateProductCategoryFeatGrpAppl(params: any): Observable<any> {
    return this.apiService.put('/api/rest/s1/commerce/productCategoryFeatGrpAppl', params);
  }

  createProductFeatureGroupAppl(params: any): Observable<any> {
    return this.apiService.post('/api/rest/s1/commerce/productFeatureGroupAppl', params);
  }

  updateProductFeatureGroupAppl(params: any): Observable<any> {
    return this.apiService.put('/api/rest/s1/commerce/productFeatureGroupAppl', params);
  }
}
