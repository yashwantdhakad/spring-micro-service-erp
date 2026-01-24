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
    params.append('page', pageIndex.toString());
    params.append('size', '10');
    if (keyword) {
      params.append('queryString', keyword);
    }

    const url = `/wms/api/assets?${params.toString()}`;
    return this.apiService.get(url);
  }

  getAsset(assetId: string): Observable<any> {
    const url = `/wms/api/assets/${encodeURIComponent(assetId)}`;
    return this.apiService.get(url);
  }

  receiveAsset(params: any): Observable<any> {
    const url = '/wms/api/assets/receive';
    return this.apiService.post(url, params);
  }
}
