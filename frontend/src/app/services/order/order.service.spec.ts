import { TestBed } from '@angular/core/testing';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
import { OrderService } from './order.service';
import { ApiService } from '../common/api.service';

describe('OrderService', () => {
  let service: OrderService;
  let httpMock: HttpTestingController;

  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [HttpClientTestingModule],
      providers: [OrderService, ApiService]
    });
    service = TestBed.inject(OrderService);
    httpMock = TestBed.inject(HttpTestingController);
  });

  afterEach(() => {
    httpMock.verify();
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });

  it('should fetch orders', () => {
    const mockData = { orders: [], total: 0 };
    const keyword = 'test';
    const pageIndex = 1;

    service.getOrders(pageIndex, keyword).subscribe(data => {
      expect(data).toEqual(mockData);
    });

    const req = httpMock.expectOne((request) =>
      request.url.includes('/api/rest/s1/commerce/orders')
    );
    expect(req.request.method).toBe('GET');
    req.flush(mockData);
  });

  it('should create an order', () => {
    const mockOrder = { id: 'ORD1001' };
    const params = { customerId: 'C100' };

    service.createOrder(params).subscribe(data => {
      expect(data).toEqual(mockOrder);
    });

    const req = httpMock.expectOne('/api/rest/s1/mantle/orders');
    expect(req.request.method).toBe('POST');
    expect(req.request.body).toEqual(params);
    req.flush(mockOrder);
  });

  it('should fetch customer detail', () => {
    const mockCustomer = { partyId: 'P100' };

    service.getCustomer('P100').subscribe(data => {
      expect(data).toEqual(mockCustomer);
    });

    const req = httpMock.expectOne('/api/rest/s1/commerce/getCustomerDetail?partyId=P100');
    expect(req.request.method).toBe('GET');
    req.flush(mockCustomer);
  });

  it('should fetch purchase orders', () => {
    const mockPOs = { list: [], count: 0 };

    service.getPurchaseOrders(0, 'sample').subscribe(data => {
      expect(data).toEqual(mockPOs);
    });

    const req = httpMock.expectOne((r) =>
      r.url.includes('/api/rest/s1/commerce/getPurchaseOrders') &&
      r.method === 'GET'
    );
    req.flush(mockPOs);
  });

  it('should delete order note', () => {
    const mockRes = { success: true };
    const params = { noteId: 'N123' };

    service.deleteOrderNote(params).subscribe(data => {
      expect(data).toEqual(mockRes);
    });

    const req = httpMock.expectOne('/api/rest/s1/commerce/createOrderNote');
    expect(req.request.method).toBe('POST');
    expect(req.request.body).toEqual(params);
    req.flush(mockRes);
  });

  it('should fetch purchase order list using getPOs', () => {
    const response = { list: [] };

    service.getPOs(1, 10, 'test').subscribe(data => {
      expect(data).toEqual(response);
    });

    const req = httpMock.expectOne(r => r.url.includes('/api/rest/s1/commerce/orders'));
    expect(req.request.method).toBe('GET');
    req.flush(response);
  });

  it('should create customer', () => {
    const params = { name: 'c' };
    const res = { partyId: '1' };
    service.createCustomer(params).subscribe(d => expect(d).toEqual(res));
    const req = httpMock.expectOne('/api/customers');
    expect(req.request.method).toBe('POST');
    req.flush(res);
  });

  it('should get order detail', () => {
    const res = { orderId: 'O1' };
    service.getOrder('O1').subscribe(d => expect(d).toEqual(res));
    const req = httpMock.expectOne('/api/rest/s1/mantle/orders/O1');
    expect(req.request.method).toBe('GET');
    req.flush(res);
  });

  it('should get PO display info', () => {
    const res = { info: true };
    service.getPODisplayInfo('PO1').subscribe(d => expect(d).toEqual(res));
    const req = httpMock.expectOne('/api/rest/s1/mantle/orders/PO1/displayInfo');
    expect(req.request.method).toBe('GET');
    req.flush(res);
  });

  it('should add item to order', () => {
    const params = { orderId: 'O1', qty: 1 };
    const res = { ok: true };
    service.addItem(params).subscribe(d => expect(d).toEqual(res));
    const req = httpMock.expectOne('/api/rest/s1/mantle/orders/O1/items');
    expect(req.request.method).toBe('POST');
    req.flush(res);
  });

  it('should fetch product stores', () => {
    const res = [{ id: '1' }];
    service.getProductStores().subscribe(d => expect(d).toEqual(res));
    const req = httpMock.expectOne('/api/rest/s1/commerce/ProductStore');
    expect(req.request.method).toBe('GET');
    req.flush(res);
  });

  it('should fetch vendor parties', () => {
    const res = [{ id: 'v1' }];
    service.getVendorParties('PS1').subscribe(d => expect(d).toEqual(res));
    const req = httpMock.expectOne('/api/rest/s1/commerce/VendorParty?productStoreId=PS1');
    expect(req.request.method).toBe('GET');
    req.flush(res);
  });

  it('should fetch facilities', () => {
    const res = [{ id: 'f1' }];
    service.getFacilities().subscribe(d => expect(d).toEqual(res));
    const req = httpMock.expectOne('/api/rest/s1/commerce/Facilities');
    expect(req.request.method).toBe('GET');
    req.flush(res);
  });

  it('should create order note', () => {
    const params = { note: 'n' };
    const res = { ok: true };
    service.createOrderNote(params).subscribe(d => expect(d).toEqual(res));
    const req = httpMock.expectOne('/api/rest/s1/commerce/OrderNote');
    expect(req.request.method).toBe('POST');
    req.flush(res);
  });

  it('should update order note', () => {
    const params = { note: 'n' };
    const res = { ok: true };
    service.updateOrderNote(params).subscribe(d => expect(d).toEqual(res));
    const req = httpMock.expectOne('/api/rest/s1/commerce/OrderNote');
    expect(req.request.method).toBe('PATCH');
    req.flush(res);
  });

  it('should fetch customer parties', () => {
    const res = [{ id: 'c1' }];
    service.getCustomerParties().subscribe(d => expect(d).toEqual(res));
    const req = httpMock.expectOne('/api/rest/s1/commerce/VendorParty');
    expect(req.request.method).toBe('GET');
    req.flush(res);
  });

  it('should create order content', () => {
    const form = new FormData();
    const res = { ok: true };
    service.createOrderContent(form).subscribe(d => expect(d).toEqual(res));
    const req = httpMock.expectOne('/api/rest/s1/commerce/OrderContent');
    expect(req.request.method).toBe('POST');
    req.flush(res);
  });


});
