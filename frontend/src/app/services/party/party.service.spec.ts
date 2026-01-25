import { TestBed } from '@angular/core/testing';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
import { PartyService } from './party.service';
import { ApiService } from '../common/api.service';
import { HttpResponse } from '@angular/common/http';
import { of } from 'rxjs';

describe('PartyService', () => {
  let service: PartyService;
  let httpTestingController: HttpTestingController;
  let apiService: ApiService;

  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [HttpClientTestingModule],
      providers: [PartyService, ApiService]
    });

    service = TestBed.inject(PartyService);
    httpTestingController = TestBed.inject(HttpTestingController);
    apiService = TestBed.inject(ApiService);
  });

  afterEach(() => {
    httpTestingController.verify();
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });

  it('should fetch customers', async () => {
    const mockResponse = of({ documentList: [{ partyId: '1', name: 'Customer 1' }], documentListCount: 1 });

    const response = await service.getCustomers(1, 'keyword');
    const req = httpTestingController.expectOne('/party/api/customers?page=1&query=keyword');
    expect(req.request.method).toBe('GET');
    req.flush(mockResponse);

    expect(response).toEqual(mockResponse);
  });

  it('should fetch parties', async () => {
    const mockResponse = of({ documentList: [{ partyId: '1', name: 'Party 1' }], documentListCount: 1 });

    const response = await service.getParties(1, 10, 'keyword');
    const req = httpTestingController.expectOne('/api/rest/s1/commerce/parties?pageIndex=0&roleTypeId=Supplier&pageSize=10&anyField=keyword');
    expect(req.request.method).toBe('GET');
    req.flush(mockResponse);

    expect(response).toEqual(mockResponse);
  });

  it('should create a customer', async () => {
    const params = { name: 'Customer 1' };
    const mockResponse = of({ success: true });

    const response = await service.createCustomer(params);
    const req = httpTestingController.expectOne('/party/api/customers');
    expect(req.request.method).toBe('POST');
    req.flush(mockResponse);

    expect(response).toEqual(mockResponse);
  });

  it('should fetch a customer', async () => {
    const mockResponse = of({ partyId: '1', name: 'Customer 1' });

    const response = await service.getCustomer('1');
    const req = httpTestingController.expectOne('/party/api/customers/1');
    expect(req.request.method).toBe('GET');
    req.flush(mockResponse);

    expect(response).toEqual(mockResponse);
  });

  it('should fetch suppliers', async () => {
    const mockResponse = of({ documentList: [{ partyId: '1', name: 'Supplier 1' }], documentListCount: 1 });

    const response = await service.getSuppliers(1, 'keyword');
    const req = httpTestingController.expectOne('/party/api/suppliers?page=1&query=keyword');
    expect(req.request.method).toBe('GET');
    req.flush(mockResponse);

    expect(response).toEqual(mockResponse);
  });

  it('should create a supplier', async () => {
    const params = { name: 'Supplier 1' };
    const mockResponse = of({ success: true });

    const response = await service.createSupplier(params);
    const req = httpTestingController.expectOne('/party/api/suppliers');
    expect(req.request.method).toBe('POST');
    req.flush(mockResponse);

    expect(response).toEqual(mockResponse);
  });

  it('should fetch a supplier', async () => {
    const mockResponse = of({ partyId: '1', name: 'Supplier 1' });

    const response = await service.getSupplier('1');
    const req = httpTestingController.expectOne('/party/api/suppliers/1');
    expect(req.request.method).toBe('GET');
    req.flush(mockResponse);

    expect(response).toEqual(mockResponse);
  });

  it('should update customer detail', async () => {
    const params = { partyId: 'CUST1', firstName: 'John' };
    const mockResponse = of({ success: true });

    const response = await service.updateCustomer(params);
    const req = httpTestingController.expectOne('/party/api/customers/CUST1');
    expect(req.request.method).toBe('PUT');
    req.flush(mockResponse);

    expect(response).toEqual(mockResponse);
  });

  it('should update supplier detail', async () => {
    const params = { partyId: 'SUPP1', groupName: 'Supplier 1' };
    const mockResponse = of({ success: true });

    const response = await service.updateSupplier(params);
    const req = httpTestingController.expectOne('/party/api/suppliers/SUPP1');
    expect(req.request.method).toBe('PUT');
    req.flush(mockResponse);

    expect(response).toEqual(mockResponse);
  });

  it('should update address', async () => {
    const params = { address: '123 Main St' };
    const mockResponse = of({ success: true });

    const response = await service.updateAddress(params);
    const req = httpTestingController.expectOne('/api/rest/s1/commerce/contactMechs');
    expect(req.request.method).toBe('PUT');
    req.flush(mockResponse);

    expect(response).toEqual(mockResponse);
  });

  // Add similar test cases for other methods...

  it('should update email address', async () => {
    const params = { email: 'test@example.com' };
    const mockResponse = of({ success: true });

    const response = await service.updateEmailAddress(params);
    const req = httpTestingController.expectOne('/api/rest/s1/commerce/contactMechs');
    expect(req.request.method).toBe('PUT');
    req.flush(mockResponse);

    expect(response).toEqual(mockResponse);
  });

  it('should update phone number', async () => {
    const params = { phone: '123-456-7890' };
    const mockResponse = of({ success: true });

    const response = await service.updatePhoneNumber(params);
    const req = httpTestingController.expectOne('/api/rest/s1/commerce/contactMechs');
    expect(req.request.method).toBe('PUT');
    req.flush(mockResponse);

    expect(response).toEqual(mockResponse);
  });

  it('should delete role', async () => {
    const params = { roleId: '1' };
    const mockResponse = of({ success: true });

    const response = await service.deleteRole(params);
    const req = httpTestingController.expectOne('/api/rest/s1/commerce/deletePartyRole');
    expect(req.request.method).toBe('POST');
    req.flush(mockResponse);

    expect(response).toEqual(mockResponse);
  });

  it('should add email or phone', async () => {
    const params = { contact: '123-456-7890' };
    const mockResponse = of({ success: true });

    const response = await service.addEmailPhone(params);
    const req = httpTestingController.expectOne('/api/rest/s1/commerce/contactMechs');
    expect(req.request.method).toBe('PUT');
    req.flush(mockResponse);

    expect(response).toEqual(mockResponse);
  });

  it('should add email', async () => {
    const params = { email: 'test@example.com' };
    const mockResponse = of({ success: true });

    const response = await service.addEmail(params);
    const req = httpTestingController.expectOne('/api/rest/s1/commerce/contactMechs');
    expect(req.request.method).toBe('PUT');
    req.flush(mockResponse);

    expect(response).toEqual(mockResponse);
  });

  it('should add phone', async () => {
    const params = { phone: '123-456-7890' };
    const mockResponse = of({ success: true });

    const response = await service.addPhone(params);
    const req = httpTestingController.expectOne('/api/rest/s1/commerce/contactMechs');
    expect(req.request.method).toBe('PUT');
    req.flush(mockResponse);

    expect(response).toEqual(mockResponse);
  });

  it('should delete contact mech', async () => {
    const params = { mechId: '1' };
    const mockResponse = of({ success: true });

    const response = await service.deleteContactMech(params);
    const req = httpTestingController.expectOne('/api/rest/s1/commerce/partyContactMech');
    expect(req.request.method).toBe('POST');
    req.flush(mockResponse);

    expect(response).toEqual(mockResponse);
  });

  it('should add role', async () => {
    const params = { roleId: '1' };
    const mockResponse = of({ success: true });

    const response = await service.addRole(params);
    const req = httpTestingController.expectOne('/api/rest/s1/commerce/partyRole');
    expect(req.request.method).toBe('POST');
    req.flush(mockResponse);

    expect(response).toEqual(mockResponse);
  });

  it('should get classifications', async () => {
    const params = { classificationId: '1' };
    const mockResponse = of({ classifications: [{ id: '1', name: 'Classification 1' }] });

    const response = await service.getClassifications(params);
    const req = httpTestingController.expectOne('/api/rest/s1/commerce/getClassifications');
    expect(req.request.method).toBe('POST');
    req.flush(mockResponse);

    expect(response).toEqual(mockResponse);
  });

  it('should delete classification', async () => {
    const params = { classificationId: '1' };
    const mockResponse = of({ success: true });

    const response = await service.deleteClassification(params);
    const req = httpTestingController.expectOne('/api/rest/s1/commerce/deletePartyClassification');
    expect(req.request.method).toBe('POST');
    req.flush(mockResponse);

    expect(response).toEqual(mockResponse);
  });

  it('should add classification', async () => {
    const params = { classificationId: '1' };
    const mockResponse = of({ success: true });

    const response = await service.addClassification(params);
    const req = httpTestingController.expectOne('/api/rest/s1/commerce/createClassification');
    expect(req.request.method).toBe('POST');
    req.flush(mockResponse);

    expect(response).toEqual(mockResponse);
  });

  it('should add identification', async () => {
    const params = { id: '1' };
    const mockResponse = of({ success: true });

    const response = await service.addIdentification(params);
    const req = httpTestingController.expectOne('/api/rest/s1/commerce/identifications');
    expect(req.request.method).toBe('POST');
    req.flush(mockResponse);

    expect(response).toEqual(mockResponse);
  });

  it('should delete identification', async () => {
    const params = { id: '1' };
    const mockResponse = of({ success: true });

    const response = await service.deleteIdentification(params);
    const req = httpTestingController.expectOne('/api/rest/s1/commerce/deleteIdentification');
    expect(req.request.method).toBe('POST');
    req.flush(mockResponse);

    expect(response).toEqual(mockResponse);
  });

  it('should get payment gateway config', async () => {
    const mockResponse = of({ config: 'gatewayConfig' });

    const response = await service.getPaymentGatewayConfig();
    const req = httpTestingController.expectOne('/api/rest/s1/commerce/paymentGatewayConfigList');
    expect(req.request.method).toBe('GET');
    req.flush(mockResponse);

    expect(response).toEqual(mockResponse);
  });

  it('should create or update payment method', async () => {
    const params = { method: 'credit card' };
    const mockResponse = of({ success: true });

    const response = await service.createUpdatePaymentMethod(params);
    const req = httpTestingController.expectOne('/api/rest/s1/commerce/paymentMethod');
    expect(req.request.method).toBe('POST');
    req.flush(mockResponse);

    expect(response).toEqual(mockResponse);
  });

  it('should delete payment method', async () => {
    const params = { methodId: '1' };
    const mockResponse = of({ success: true });

    const response = await service.deletePaymentMethod(params);
    const req = httpTestingController.expectOne('/api/rest/s1/commerce/deletePaymentMethod');
    expect(req.request.method).toBe('POST');
    req.flush(mockResponse);

    expect(response).toEqual(mockResponse);
  });

  it('should create party note', async () => {
    const params = { note: 'Party note' };
    const mockResponse = of({ success: true });

    const response = await service.createPartyNote(params);
    const req = httpTestingController.expectOne('/api/rest/s1/commerce/PartyNote');
    expect(req.request.method).toBe('POST');
    req.flush(mockResponse);

    expect(response).toEqual(mockResponse);
  });

  it('should update party note', async () => {
    const params = { note: 'Updated note' };
    const mockResponse = of({ success: true });

    const response = await service.updatePartyNote(params);
    const req = httpTestingController.expectOne('/api/rest/s1/commerce/PartyNote');
    expect(req.request.method).toBe('PATCH');
    req.flush(mockResponse);

    expect(response).toEqual(mockResponse);
  });

  it('should create party content', async () => {
    const formData = new FormData();
    formData.append('file', new Blob(), 'filename.jpg');
    const mockResponse = of({ success: true });

    const response = await service.createPartyContent(formData);
    const req = httpTestingController.expectOne('/api/rest/s1/commerce/PartyContent');
    expect(req.request.method).toBe('POST');
    req.flush(mockResponse);

    expect(response).toEqual(mockResponse);
  });

  it('should get party postal contact mech by purpose', async () => {
    const mockResponse = {
      customerDetail: {
        postalAddressList: [
          { contactMechPurposeId: 'purposeId', address1: '123 Main St' },
        ],
      },
    };

    const response = await service.getPartyPostalContactMechByPurpose('1', 'purposeId');
    const req = httpTestingController.expectOne('/party/api/customers/1');
    expect(req.request.method).toBe('GET');
    req.flush(mockResponse);

    expect(response).toEqual([{ contactMechPurposeId: 'purposeId', address1: '123 Main St' }]);
  });
});
