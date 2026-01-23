import { Injectable } from '@angular/core';
import { ApiService } from '../common/api.service';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class PartyService {
  constructor(private apiService: ApiService) { }

  getCustomers(page: number, keyword: string): Observable<any> {
    const params = new URLSearchParams({
      page: page.toString(),
      query: keyword,
    });
    const url = `/party/api/customers?${params.toString()}`;
    return this.apiService.get(url);
  }

  getParties(page: number, pageSize: number, keyword: string): Observable<any> {
    const params = new URLSearchParams({
      page: page.toString(),
      roleTypeId: 'Supplier',
      pageSize: pageSize.toString(),
      anyField: keyword,
    });
    const url = `/api/rest/s1/commerce/parties?${params.toString()}`;
    return this.apiService.get(url);
  }

  createCustomer(params: any): Observable<any> {
    return this.apiService.post('/party/api/customers', params);
  }

  getCustomer(partyId: string): Observable<any> {
    const url = `/party/api/customers/${encodeURIComponent(partyId)}`;
    return this.apiService.get(url);
  }

  getSuppliers(page: number, keyword: string): Observable<any> {
    const params = new URLSearchParams({
      page: page.toString(),
      query: keyword,
    });
    const url = `/party/api/suppliers?${params.toString()}`;
    return this.apiService.get(url);
  }

  createSupplier(params: any): Observable<any> {
    return this.apiService.post('/party/api/suppliers', params);
  }

  getSupplier(partyId: string): Observable<any> {
    const url = `/party/api/suppliers/${encodeURIComponent(partyId)}`;
    return this.apiService.get(url);
  }

  updateCustomer(params: any): Observable<any> {
    const partyId = encodeURIComponent(params.partyId);
    const url = `/party/api/customers/${partyId}`;
    const { partyId: _, ...body } = params;
    return this.apiService.put(url, body);
  }

  updateSupplier(params: any): Observable<any> {
    const partyId = encodeURIComponent(params.partyId);
    const url = `/party/api/suppliers/${partyId}`;
    const { partyId: _, ...body } = params;
    return this.apiService.put(url, body);
  }

  addPostalAddress(partyId: string | number, payload: any) {
    const url = `/party/api/parties/${encodeURIComponent(partyId)}/postal-addresses`;
    return this.apiService.post(url, payload);
  }

  updatePostalAddress(partyId: string | number,contactMechId: string | number, payload: any) {
    // Adjust this path if your backend uses a different one
    const url = `/party/api/parties/${encodeURIComponent(partyId)}/postal-addresses/${encodeURIComponent(contactMechId)}`;
    return this.apiService.put(url, payload);
  }

  addAddress(params: any): Observable<any> {
    console.log('params', params);
    const partyId = encodeURIComponent(params.partyId);
    const url = `/party/api/parties/${partyId}/postal-addresses`;

    const { partyId: _, contactMechId: __, ...body } = params;

    return this.apiService.post(url, params);
  }

  updateAddress(params: any): Observable<any> {
    console.log('params', params);
    const partyId = encodeURIComponent(params.partyId);
    const contactMechId = encodeURIComponent(params.contactMechId);
    const url = `/party/api/parties/${partyId}/postal-addresses/${contactMechId}`;

    const { partyId: _, contactMechId: __, ...body } = params;

    return this.apiService.put(url, params);
  }

  updateEmailAddress(params: any): Observable<any> {
    return this.apiService.put('/api/rest/s1/commerce/contactMechs', params);
  }

  deleteRole(params: any): Observable<any> {
    return this.apiService.post('/api/rest/s1/commerce/deletePartyRole', params);
  }

  addEmailPhone(params: any): Observable<any> {
    return this.apiService.put('/api/rest/s1/commerce/contactMechs', params);
  }

  addEmail(params: any): Observable<any> {
    const partyId = encodeURIComponent(params.partyId);
    const contactMechId = params.contactMechId;
    const baseUrl = `/party/api/parties/${partyId}/emails`;

    const { partyId: _, contactMechId: __, ...body } = params;

    if (contactMechId) {
      const url = `${baseUrl}/${encodeURIComponent(contactMechId)}`;
      return this.apiService.put(url, body);
    }
    return this.apiService.post(baseUrl, body);
  }

  addPhone(params: any): Observable<any> {
    const partyId = encodeURIComponent(params.partyId);
    const url = `/party/api/parties/${partyId}/telecom-numbers`;

    const { partyId: _, ...body } = params;

    return this.apiService.post(url, params);
  }

  updatePhoneNumber(params: any): Observable<any> {
    const partyId = encodeURIComponent(params.partyId);
    const contactMechId = encodeURIComponent(params.contactMechId);
    const url = `/party/api/parties/${partyId}/telecom-numbers/${contactMechId}`;

    const { partyId: _, contactMechId: __, ...body } = params;

    return this.apiService.put(url, body);
  }

  deleteContactMech(params: any): Observable<any> {
    const partyId = encodeURIComponent(params.partyId);
    const contactMechId = encodeURIComponent(params.contactMechId);
    const url = `/party/api/parties/${partyId}/telecom-numbers/${contactMechId}`;
    return this.apiService.delete(url);
  }

  deleteEmail(params: any): Observable<any> {
    const partyId = encodeURIComponent(params.partyId);
    const contactMechId = encodeURIComponent(params.contactMechId);
    const url = `/party/api/parties/${partyId}/emails/${contactMechId}`;
    return this.apiService.delete(url);
  }

  deletePostalAddress(params: any): Observable<any> {
    const partyId = encodeURIComponent(params.partyId);
    const contactMechId = encodeURIComponent(params.contactMechId);
    const url = `/party/api/parties/${partyId}/postal-addresses/${contactMechId}`;
    return this.apiService.delete(url);
  }


  addRole(params: any): Observable<any> {
    return this.apiService.post('/api/rest/s1/commerce/partyRole', params);
  }

  getClassifications(params: any): Observable<any> {
    return this.apiService.post('/api/rest/s1/commerce/getClassifications', params);
  }

  deleteClassification(params: any): Observable<any> {
    return this.apiService.post('/api/rest/s1/commerce/deletePartyClassification', params);
  }

  addClassification(params: any): Observable<any> {
    return this.apiService.post('/api/rest/s1/commerce/createClassification', params);
  }

  addIdentification(params: any): Observable<any> {
    return this.apiService.post('/api/rest/s1/commerce/identifications', params);
  }

  deleteIdentification(params: any): Observable<any> {
    return this.apiService.post('/api/rest/s1/commerce/deleteIdentification', params);
  }

  getPaymentGatewayConfig(): Observable<any> {
    const url = `/api/rest/s1/commerce/paymentGatewayConfigList`;
    return this.apiService.get(url);
  }

  createUpdatePaymentMethod(params: any): Observable<any> {
    return this.apiService.post('/api/rest/s1/commerce/paymentMethod', params);
  }

  deletePaymentMethod(params: any): Observable<any> {
    return this.apiService.post('/api/rest/s1/commerce/deletePaymentMethod', params);
  }

  // createPartyNote(params: any): Observable<any> {
  //   return this.apiService.post(`/api/rest/s1/commerce/PartyNote`, params);
  // }
  createPartyNote(params: any): Observable<any> {
    // Expecting params to contain { partyId, noteDate, noteText }
    const partyId = encodeURIComponent(params.partyId);
    const url = `/party/api/parties/${partyId}/notes`;

    // Remove partyId from body if backend only wants noteDate/noteText
    const { partyId: _, ...body } = params;

    return this.apiService.post(url, body);
  }

  updatePartyNote(params: any): Observable<any> {
    const partyId = encodeURIComponent(params.partyId);
    const noteId = encodeURIComponent(params.noteId);
    const url = `/party/api/parties/${partyId}/notes/${noteId}`;

    const { partyId: _, noteId: __, ...body } = params;

    return this.apiService.put(url, body);
  }

  deletePartyNote(params: any): Observable<any> {
    const partyId = encodeURIComponent(params.partyId);
    const noteId = encodeURIComponent(params.noteId);
    const url = `/party/api/parties/${partyId}/notes/${noteId}`;
    return this.apiService.delete(url);
  }

  // updatePartyNote(params: any): Observable<any> {
  //   return this.apiService.patch(`/api/rest/s1/commerce/PartyNote`, params);
  // }

  createPartyContent(params: any): Observable<any> {
    return this.apiService.postFormData(`/api/rest/s1/commerce/PartyContent`, params);
  }

  getPartyPostalContactMechByPurpose(partyId: string, contactMechPurposeId: string): Observable<any> {
    const url = `/api/rest/s1/mantle/parties/${partyId}/contactMechs/infoList?contactMechPurposeId=${contactMechPurposeId}&getAll=false`;
    return this.apiService.get(url);
  }
}
