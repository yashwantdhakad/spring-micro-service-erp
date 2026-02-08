import { Injectable } from '@angular/core';
import { ApiService } from '../common/api.service';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class AssetService {
  constructor(private apiService: ApiService) { }

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

  getInventoryItemTypes(): Observable<any> {
    const url = '/wms/api/inventory-item-types';
    return this.apiService.get(url);
  }

  getOrderReservations(inventoryItemId: string): Observable<any> {
    const url = `/oms/api/order-item-ship-grp-inv-res?inventoryItemId=${encodeURIComponent(inventoryItemId)}`;
    return this.apiService.get(url);
  }

  getWorkEffortReservations(inventoryItemId: string): Observable<any> {
    const url = `/wms/api/work-effort-inv-reservations?inventoryItemId=${encodeURIComponent(inventoryItemId)}`;
    return this.apiService.get(url);
  }

  receiveAsset(params: any): Observable<any> {
    const url = '/wms/api/assets/receive';
    return this.apiService.post(url, params);
  }
  createPhysicalInventoryVariance(assetId: string, variance: any): Observable<any> {
    const url = `/wms/api/assets/${encodeURIComponent(assetId)}/variances`;
    return this.apiService.post(url, variance);
  }

  getVarianceReasons(): Observable<any> {
    const url = '/wms/api/variance-reasons';
    return this.apiService.get(url);
  }
}
