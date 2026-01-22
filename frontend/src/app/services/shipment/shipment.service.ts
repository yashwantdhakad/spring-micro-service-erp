import { Injectable } from '@angular/core';
import { ApiService } from '../common/api.service';
import { Observable } from 'rxjs';
import { HttpResponse } from '@angular/common/http';

@Injectable({
  providedIn: 'root',
})
export class ShipmentService {
  constructor(private apiService: ApiService) {}

  getShipments(pageIndex: number, keyword: string): Observable<any> {
    const params = new URLSearchParams();
    params.append('pageIndex', pageIndex.toString());
    params.append('queryString', keyword);

    const url = `/api/rest/s1/mantle/shipments?${params.toString()}`;
    return this.apiService.customGet(url);
  }

  getShipment(shipmentId: string): Observable<any> {
    const url = `/api/rest/s1/mantle/shipments/${shipmentId}`;
    return this.apiService.get(url);
  }
}
