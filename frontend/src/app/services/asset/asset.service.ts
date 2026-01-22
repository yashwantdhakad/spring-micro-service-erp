import { Injectable } from '@angular/core';
import { ApiService } from '../common/api.service';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class AssetService {
  constructor(private apiService: ApiService) {}

  getAssets(pageIndex: number, keyword: string): Observable<any> {
    const params = new URLSearchParams();
    params.append('pageIndex', pageIndex.toString());
    if (keyword) {
      params.append('query', keyword);
    }

    const url = `/api/rest/s1/mantle/assets?${params.toString()}`;
    return this.apiService.customGet(url); // returns Observable
  }

  getAsset(assetId: string): Observable<any> {
    const url = `/api/rest/s1/mantle/assets/${assetId}`;
    return this.apiService.get(url); // returns Observable
  }

  receiveAsset(params: any): Observable<any> {
    const url = '/api/rest/s1/mantle/assets/receive';
    return this.apiService.post(url, params); // returns Observable
  }
}
