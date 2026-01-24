import { Injectable } from '@angular/core';
import { ApiService } from '../common/api.service';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class ShipmentService {
  constructor(private apiService: ApiService) {}

  getShipments(pageIndex: number, keyword: string): Observable<any> {
    const params = new URLSearchParams();
    params.append('page', pageIndex.toString());
    params.append('size', '10');
    params.append('queryString', keyword);

    const url = `/wms/api/shipments?${params.toString()}`;
    return this.apiService.get(url);
  }

  getShipment(shipmentId: string): Observable<any> {
    const url = `/wms/api/shipments/${encodeURIComponent(shipmentId)}`;
    return this.apiService.get(url);
  }

  createShipment(payload: any): Observable<any> {
    const url = `/wms/api/shipments`;
    return this.apiService.post(url, payload);
  }
}
