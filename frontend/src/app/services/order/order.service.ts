import { Injectable } from '@angular/core';
import { ApiService } from '../common/api.service';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class OrderService {
  constructor(private apiService: ApiService) {}

  getOrders(pageIndex: number, keyword: string): Observable<any> {
    const params = new URLSearchParams();
    params.append('pageIndex', pageIndex.toString());
    params.append('queryString', keyword);
    params.append('orderTypeEnumId', 'SALES_ORDER');

    const url = `/api/rest/s1/commerce/orders?${params.toString()}`;
    return this.apiService.get(url);
  }

  getPOs(pageIndex: number, pageSize: number, keyword: string): Observable<any> {
    const params = new URLSearchParams();
    params.append('pageIndex', pageIndex.toString());
    params.append('queryString', keyword);
    params.append('pageSize', pageSize.toString());
    params.append('orderTypeEnumId', 'PURCHASE_ORDER');

    const url = `/api/rest/s1/commerce/orders?${params.toString()}`;
    return this.apiService.get(url);
  }

  createCustomer(params: any): Observable<any> {
    const url = '/api/customers';
    return this.apiService.post(url, params);
  }

  getCustomer(partyId: string): Observable<any> {
    const url = `/api/rest/s1/commerce/getCustomerDetail?partyId=${encodeURIComponent(partyId)}`;
    return this.apiService.get(url);
  }

  getOrder(orderId: string): Observable<any> {
    const url = `/api/rest/s1/mantle/orders/${orderId}`;
    return this.apiService.get(url);
  }

  getPODisplayInfo(orderId: string): Observable<any> {
    const url = `/api/rest/s1/mantle/orders/${orderId}/displayInfo`;
    return this.apiService.get(url);
  }

  createOrder(params: any): Observable<any> {
    return this.apiService.post('/api/rest/s1/mantle/orders', params);
  }

  addItem(params: any): Observable<any> {
    const url = `/api/rest/s1/mantle/orders/${params.orderId}/items`;
    return this.apiService.post(url, params);
  }

  getProductStores(): Observable<any> {
    const url = '/api/rest/s1/commerce/ProductStore';
    return this.apiService.get(url);
  }

  getVendorParties(productStoreId: string): Observable<any> {
    const params = new URLSearchParams({ productStoreId });
    const url = `/api/rest/s1/commerce/VendorParty?${params.toString()}`;
    return this.apiService.get(url);
  }

  getFacilities(): Observable<any> {
    const url = '/api/rest/s1/commerce/Facilities';
    return this.apiService.get(url);
  }

  getPurchaseOrders(pageIndex: number, keyword: string): Observable<any> {
    const params = new URLSearchParams({
      pageIndex: pageIndex.toString(),
      anyField: keyword,
    });

    const url = `/api/rest/s1/commerce/getPurchaseOrders?${params.toString()}`;
    return this.apiService.get(url);
  }

  createOrderNote(params: any): Observable<any> {
    return this.apiService.post(`/api/rest/s1/commerce/OrderNote`, params);
  }

  updateOrderNote(params: any): Observable<any> {
    return this.apiService.patch(`/api/rest/s1/commerce/OrderNote`, params);
  }

  deleteOrderNote(params: any): Observable<any> {
    return this.apiService.post(`/api/rest/s1/commerce/createOrderNote`, params);
  }

  getCustomerParties(): Observable<any> {
    const url = '/api/rest/s1/commerce/VendorParty';
    return this.apiService.get(url);
  }

  createOrderContent(params: any): Observable<any> {
    return this.apiService.postFormData(`/api/rest/s1/commerce/OrderContent`, params);
  }
}