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
      request.url.includes('/oms/api/orders')
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

    const req = httpMock.expectOne((request) => request.url.includes('/oms/api/orders'));
    expect(req.request.method).toBe('POST');
    expect(req.request.body).toEqual(params);
    req.flush(mockOrder);
  });

  it('should fetch customer detail', () => {
    const mockCustomer = { partyId: 'P100' };

    service.getCustomer('P100').subscribe(data => {
      expect(data).toEqual(mockCustomer);
    });

    const req = httpMock.expectOne((request) => request.url.includes('/oms/api/customers/P100'));
    expect(req.request.method).toBe('GET');
    req.flush(mockCustomer);
  });

  it('should fetch purchase orders', () => {
    const mockPOs = { list: [], count: 0 };

    service.getPurchaseOrders(0, 'sample').subscribe(data => {
      expect(data).toEqual(mockPOs);
    });

    const req = httpMock.expectOne((r) =>
      r.url.includes('/oms/api/orders') &&
      r.method === 'GET'
    );
    req.flush(mockPOs);
  });

  it('should delete order note', () => {
    const mockRes = { success: true };
    const params = { orderId: 'O1', noteId: 'N123' };

    service.deleteOrderNote(params).subscribe(data => {
      expect(data).toEqual(mockRes);
    });

    const req = httpMock.expectOne((request) => request.url.includes('/oms/api/orders/O1/notes/N123'));
    expect(req.request.method).toBe('DELETE');
    req.flush(mockRes);
  });

  it('should fetch purchase order list using getPOs', () => {
    const response = { list: [] };

    service.getPOs(1, 10, 'test').subscribe(data => {
      expect(data).toEqual(response);
    });

    const req = httpMock.expectOne(r => r.url.includes('/oms/api/orders'));
    expect(req.request.method).toBe('GET');
    req.flush(response);
  });

  it('should create customer', () => {
    const params = { name: 'c' };
    const res = { partyId: '1' };
    service.createCustomer(params).subscribe(d => expect(d).toEqual(res));
    const req = httpMock.expectOne((request) => request.url.includes('/oms/api/customers'));
    expect(req.request.method).toBe('POST');
    req.flush(res);
  });

  it('should get order detail', () => {
    const res = { orderId: 'O1' };
    service.getOrder('O1').subscribe(d => expect(d).toEqual(res));
    const req = httpMock.expectOne((request) => request.url.includes('/oms/api/orders/O1'));
    expect(req.request.method).toBe('GET');
    req.flush(res);
  });

  it('should get PO display info', () => {
    const res = { info: true };
    service.getPODisplayInfo('PO1').subscribe(d => expect(d).toEqual(res));
    const req = httpMock.expectOne((request) => request.url.includes('/oms/api/orders/PO1/display-info'));
    expect(req.request.method).toBe('GET');
    req.flush(res);
  });

  it('should add item to order', () => {
    const params = { orderId: 'O1', qty: 1 };
    const res = { ok: true };
    service.addItem(params).subscribe(d => expect(d).toEqual(res));
    const req = httpMock.expectOne((request) => request.url.includes('/oms/api/orders/O1/items'));
    expect(req.request.method).toBe('POST');
    req.flush(res);
  });

  it('should fetch product stores', () => {
    const res = [{ id: '1' }];
    service.getProductStores().subscribe(d => expect(d).toEqual(res));
    const req = httpMock.expectOne((request) => request.url.includes('/wms/api/product-stores'));
    expect(req.request.method).toBe('GET');
    req.flush(res);
  });

  it('should fetch vendor parties', () => {
    const res = [{ partyId: 'v1', groupName: 'Vendor 1' }];
    service.getVendorParties('PS1').subscribe(d => expect(d).toEqual([
      { value: 'v1', label: 'Vendor 1' }
    ]));
    const req = httpMock.expectOne((request) => request.url.includes('/oms/api/suppliers'));
    expect(req.request.method).toBe('GET');
    req.flush({ resultList: res });
  });

  it('should fetch facilities', () => {
    const res = [{ facilityId: 'f1', facilityName: 'Main' }];
    service.getFacilities().subscribe(d => expect(d).toEqual([
      { facilityId: 'f1', facilityName: 'Main', label: 'Main' }
    ]));
    const req = httpMock.expectOne((request) => request.url.includes('/wms/api/facilities'));
    expect(req.request.method).toBe('GET');
    req.flush(res);
  });

  it('should create order note', () => {
    const params = { orderId: 'O1', note: 'n' };
    const res = { ok: true };
    service.createOrderNote(params).subscribe(d => expect(d).toEqual(res));
    const req = httpMock.expectOne((request) => request.url.includes('/oms/api/orders/O1/notes'));
    expect(req.request.method).toBe('POST');
    req.flush(res);
  });

  it('should update order note', () => {
    const params = { orderId: 'O1', noteId: 'N1', note: 'n' };
    const res = { ok: true };
    service.updateOrderNote(params).subscribe(d => expect(d).toEqual(res));
    const req = httpMock.expectOne((request) => request.url.includes('/oms/api/orders/O1/notes/N1'));
    expect(req.request.method).toBe('PUT');
    req.flush(res);
  });

  it('should fetch customer parties', () => {
    const res = [{ partyId: 'c1', firstName: 'Customer', lastName: 'One' }];
    service.getCustomerParties().subscribe(d => expect(d).toEqual([
      { value: 'c1', label: 'Customer One' }
    ]));
    const req = httpMock.expectOne((request) => request.url.includes('/oms/api/customers'));
    expect(req.request.method).toBe('GET');
    req.flush({ resultList: res });
  });

  it('should create order content', () => {
    const form = new FormData();
    form.append('orderId', 'O1');
    const res = { ok: true };
    service.createOrderContent(form).subscribe(d => expect(d).toEqual(res));
    const req = httpMock.expectOne((request) => request.url.includes('/oms/api/orders/O1/contents'));
    expect(req.request.method).toBe('POST');
    req.flush(res);
  });


});
