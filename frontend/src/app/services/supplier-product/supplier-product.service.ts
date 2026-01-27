import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { ApiService } from '../common/api.service';

@Injectable({
  providedIn: 'root',
})
export class SupplierProductService {
  constructor(private apiService: ApiService) {}

  listByParty(partyId: string): Observable<any[]> {
    const url = `/wms/api/supplier-products?partyId=${encodeURIComponent(partyId)}`;
    return this.apiService.get<any[]>(url);
  }

  getLatestByPartyAndProduct(partyId: string, productId: string): Observable<any> {
    const url = `/wms/api/supplier-products/by-party-product?partyId=${encodeURIComponent(
      partyId
    )}&productId=${encodeURIComponent(productId)}`;
    return this.apiService.get<any>(url);
  }

  create(payload: any): Observable<any> {
    return this.apiService.post('/wms/api/supplier-products', payload);
  }

  delete(id: number): Observable<any> {
    return this.apiService.delete(`/wms/api/supplier-products/${id}`);
  }
}
