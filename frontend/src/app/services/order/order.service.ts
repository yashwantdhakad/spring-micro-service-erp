import { Injectable } from '@angular/core';
import { ApiService } from '../common/api.service';
import { Observable, map } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class OrderService {
  constructor(private apiService: ApiService) { }

  getOrders(pageIndex: number, keyword: string, sortBy?: string, sortDirection?: string): Observable<any> {
    const params = new URLSearchParams();
    params.append('page', pageIndex.toString());
    params.append('size', '10');
    params.append('queryString', keyword);
    params.append('orderTypeId', 'SALES_ORDER');
    if (sortBy) {
      params.append('sortBy', sortBy);
    }
    if (sortDirection) {
      params.append('sortDirection', sortDirection);
    }

    const url = `/oms/api/orders?${params.toString()}`;
    return this.apiService.get(url);
  }

  getPOs(pageIndex: number, pageSize: number, keyword: string, sortBy?: string, sortDirection?: string): Observable<any> {
    const params = new URLSearchParams();
    params.append('page', pageIndex.toString());
    params.append('size', pageSize.toString());
    params.append('queryString', keyword);
    params.append('orderTypeId', 'PURCHASE_ORDER');
    if (sortBy) {
      params.append('sortBy', sortBy);
    }
    if (sortDirection) {
      params.append('sortDirection', sortDirection);
    }

    const url = `/oms/api/orders?${params.toString()}`;
    return this.apiService.get(url);
  }

  createCustomer(params: any): Observable<any> {
    const url = '/party/api/customers';
    return this.apiService.post(url, params);
  }

  getCustomer(partyId: string): Observable<any> {
    const url = `/party/api/customers/${encodeURIComponent(partyId)}`;
    return this.apiService.get(url);
  }

  getOrder(orderId: string): Observable<any> {
    const url = `/oms/api/orders/${encodeURIComponent(orderId)}`;
    return this.apiService.get(url);
  }

  getOrderById(id: number | string): Observable<any> {
    const url = `/oms/api/orders/by-id/${encodeURIComponent(String(id))}`;
    return this.apiService.get(url);
  }

  getPODisplayInfo(orderId: string): Observable<any> {
    const url = `/oms/api/orders/${encodeURIComponent(orderId)}/display-info`;
    return this.apiService.get(url);
  }

  getOrderDisplayInfoById(id: number | string): Observable<any> {
    const url = `/oms/api/orders/by-id/${encodeURIComponent(String(id))}/display-info`;
    return this.apiService.get(url);
  }

  createOrder(params: any): Observable<any> {
    return this.apiService.post('/oms/api/orders', params);
  }

  approvePurchaseOrder(orderId: string): Observable<any> {
    return this.updateOrderStatus(orderId, 'ORDER_APPROVED');
  }

  approveSalesOrder(orderId: string): Observable<any> {
    return this.updateOrderStatus(orderId, 'ORDER_APPROVED');
  }

  receivePurchaseOrder(orderId: string, payload: any): Observable<any> {
    const url = `/oms/api/orders/${encodeURIComponent(orderId)}/receive`;
    return this.apiService.post(url, payload);
  }

  getOrderInvoices(orderId: string): Observable<any> {
    const url = `/oms/api/orders/${encodeURIComponent(orderId)}/invoices`;
    return this.apiService.get(url);
  }

  getOrderShipments(orderId: string): Observable<any> {
    const url = `/wms/api/shipments/by-order/${encodeURIComponent(orderId)}`;
    return this.apiService.get(url);
  }

  getOrderPdf(orderId: string): Observable<Blob> {
    const url = `/oms/api/orders/${encodeURIComponent(orderId)}/pdf`;
    return this.apiService.getBlob(url);
  }

  getOrderPicklists(orderId: string): Observable<any> {
    const url = `/wms/api/picklists/by-order/${encodeURIComponent(orderId)}`;
    return this.apiService.get(url);
  }

  getReservationStatus(orderId: string): Observable<any> {
    const url = `/oms/api/orders/${encodeURIComponent(orderId)}/reservation-status`;
    return this.apiService.get(url);
  }

  getReservedOrders(): Observable<any> {
    const url = '/oms/api/orders/reserved';
    return this.apiService.get(url);
  }

  getReservedOrderItems(orderId: string): Observable<any> {
    const url = `/oms/api/orders/${encodeURIComponent(orderId)}/reserved-items`;
    return this.apiService.get(url);
  }

  createPicklist(orderId: string): Observable<any> {
    const url = `/oms/api/orders/${encodeURIComponent(orderId)}/picklist`;
    return this.apiService.post(url, {});
  }

  markPicklistPicked(picklistId: string): Observable<any> {
    const url = `/wms/api/picklists/${encodeURIComponent(picklistId)}/mark-picked`;
    return this.apiService.post(url, {});
  }

  shipShipment(shipmentId: string): Observable<any> {
    const url = `/wms/api/shipments/${encodeURIComponent(shipmentId)}/ship`;
    return this.apiService.post(url, {});
  }

  addOrderAddress(orderId: string, payload: any): Observable<any> {
    const url = `/oms/api/orders/${encodeURIComponent(orderId)}/addresses`;
    return this.apiService.post(url, payload);
  }

  updateOrderAddress(orderId: string, contactMechId: string, payload: any): Observable<any> {
    const url = `/oms/api/orders/${encodeURIComponent(orderId)}/addresses/${encodeURIComponent(contactMechId)}`;
    return this.apiService.put(url, payload);
  }

  addItem(params: any): Observable<any> {
    const url = `/oms/api/orders/${encodeURIComponent(params.orderId)}/items`;
    return this.apiService.post(url, params);
  }

  updateOrderStatus(orderId: string, statusId: string): Observable<any> {
    const url = `/oms/api/orders/${encodeURIComponent(orderId)}/status`;
    return this.apiService.post(url, { statusId });
  }

  updateOrderItemQuantity(orderId: string, orderItemSeqId: string, quantity: number, unitAmount?: number): Observable<any> {
    const url = `/oms/api/orders/${encodeURIComponent(orderId)}/items/${encodeURIComponent(orderItemSeqId)}/quantity`;
    const payload: any = { quantity };
    if (unitAmount !== undefined) {
      payload.unitAmount = unitAmount;
    }
    return this.apiService.put(url, payload);
  }

  cancelOrderItem(orderId: string, orderItemSeqId: string): Observable<any> {
    const url = `/oms/api/orders/${encodeURIComponent(orderId)}/items/${encodeURIComponent(orderItemSeqId)}/cancel`;
    return this.apiService.post(url, {});
  }

  updateShippingInstructions(orderId: string, shipGroupSeqId: string, shippingInstructions: string): Observable<any> {
    const url = `/oms/api/orders/${encodeURIComponent(orderId)}/ship-groups/${encodeURIComponent(shipGroupSeqId)}/shipping-instructions`;
    return this.apiService.put(url, { shippingInstructions });
  }

  getProductStores(): Observable<any> {
    const url = '/wms/api/product-stores';
    return this.apiService.get(url);
  }

  getVendorParties(productStoreId: string): Observable<any> {
    const params = new URLSearchParams();
    if (productStoreId) {
      params.append('query', productStoreId);
    }
    const url = `/party/api/suppliers?${params.toString()}`;
    return this.apiService.get(url).pipe(
      map((response: any) =>
        (response?.resultList || []).map((supplier: any) => ({
          value: supplier.partyId,
          label: supplier.groupName || supplier.partyId,
        }))
      )
    );
  }

  getFacilities(): Observable<any> {
    const url = '/wms/api/facilities';
    return this.apiService.get(url).pipe(
      map((facilities: any) =>
        ((facilities as any[]) || []).map((facility) => ({
          ...facility,
          label: facility.facilityName || facility.facilityId,
        }))
      )
    );
  }

  getPurchaseOrders(pageIndex: number, keyword: string): Observable<any> {
    const params = new URLSearchParams({
      page: pageIndex.toString(),
      size: '10',
      queryString: keyword,
      orderTypeId: 'PURCHASE_ORDER',
    });

    const url = `/oms/api/orders?${params.toString()}`;
    return this.apiService.get(url);
  }

  createOrderNote(params: any): Observable<any> {
    const url = `/oms/api/orders/${encodeURIComponent(params.orderId)}/notes`;
    return this.apiService.post(url, params);
  }

  updateOrderNote(params: any): Observable<any> {
    const url = `/oms/api/orders/${encodeURIComponent(params.orderId)}/notes/${encodeURIComponent(params.noteId)}`;
    return this.apiService.put(url, params);
  }

  deleteOrderNote(params: any): Observable<any> {
    const url = `/oms/api/orders/${encodeURIComponent(params.orderId)}/notes/${encodeURIComponent(params.noteId)}`;
    return this.apiService.delete(url);
  }

  getCustomerParties(): Observable<any> {
    const url = '/party/api/customers';
    return this.apiService.get(url).pipe(
      map((response: any) =>
        (response?.resultList || []).map((customer: any) => ({
          value: customer.partyId,
          label: [customer.firstName, customer.lastName].filter(Boolean).join(' ') || customer.partyId,
        }))
      )
    );
  }

  createOrderContent(params: any): Observable<any> {
    const orderId = params.get('orderId');
    const url = `/oms/api/orders/${encodeURIComponent(orderId)}/contents`;
    return this.apiService.postFormData(url, params);
  }

  downloadOrderContent(orderId: string, contentId: string): Observable<Blob> {
    const url = `/oms/api/orders/${encodeURIComponent(orderId)}/contents/${encodeURIComponent(contentId)}`;
    return this.apiService.getBlob(url);
  }
}
