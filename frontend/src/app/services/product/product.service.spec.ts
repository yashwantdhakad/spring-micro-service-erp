import { TestBed } from '@angular/core/testing';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
import { ProductService } from './product.service';
import { ApiService } from '../common/api.service';

describe('ProductService', () => {
  let service: ProductService;
  let httpMock: HttpTestingController;

  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [HttpClientTestingModule],
      providers: [ProductService, ApiService],
    });

    service = TestBed.inject(ProductService);
    httpMock = TestBed.inject(HttpTestingController);
  });

  afterEach(() => {
    httpMock.verify();
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });

  it('should fetch products', (done) => {
    const dummyResponse = { documentList: [{ productId: 'P100', productName: 'Test Product' }] };

    service.getProducts(0, 'Test').subscribe((data) => {
      expect(data).toEqual(dummyResponse);
      done();
    });

    const req = httpMock.expectOne((request) =>
      request.url.includes('/api/rest/s1/commerce/getProducts') &&
      request.method === 'GET'
    );
    expect(req.request.params.get('queryString')).toBe('Test');
    req.flush(dummyResponse);
  });

  it('should create product', () => {
    const params = { name: 'p1' };
    const res = { productId: 'P1' };
    service.createProduct(params).subscribe(d => expect(d).toEqual(res));
    const req = httpMock.expectOne('/api/rest/s1/commerce/createProduct');
    expect(req.request.method).toBe('POST');
    req.flush(res);
  });

  it('should get product detail', () => {
    const res = { productId: 'P1' };
    service.getProduct('P1').subscribe(d => expect(d).toEqual(res));
    const req = httpMock.expectOne('/api/rest/s1/mantle/products/P1');
    expect(req.request.method).toBe('GET');
    req.flush(res);
  });

  it('should update product', () => {
    const params = { productId: 'P1' };
    const res = { ok: true };
    service.updateProduct(params).subscribe(d => expect(d).toEqual(res));
    const req = httpMock.expectOne('/api/rest/s1/mantle/products/P1');
    expect(req.request.method).toBe('PATCH');
    req.flush(res);
  });

  it('should add product price', () => {
    const params = { productId: 'P1' };
    const res = { ok: true };
    service.addProductPrice(params).subscribe(d => expect(d).toEqual(res));
    const req = httpMock.expectOne('/api/rest/s1/mantle/products/P1/prices');
    expect(req.request.method).toBe('POST');
    req.flush(res);
  });

  it('should delete product price', () => {
    const params = { productId: 'P1', productPriceId: 'PP1' };
    const res = { ok: true };
    service.deleteProductPrice(params).subscribe(d => expect(d).toEqual(res));
    const req = httpMock.expectOne('/api/rest/s1/mantle/products/P1/prices/PP1');
    expect(req.request.method).toBe('DELETE');
    req.flush(res);
  });

  it('should update product price', () => {
    const params = { productId: 'P1', productPriceId: 'PP1' };
    const res = { ok: true };
    service.updateProductPrice(params).subscribe(d => expect(d).toEqual(res));
    const req = httpMock.expectOne('/api/rest/s1/mantle/products/P1/prices/PP1');
    expect(req.request.method).toBe('PATCH');
    req.flush(res);
  });

  it('should add product category', () => {
    const params = { productId: 'P1' };
    const res = { ok: true };
    service.addProductCategory(params).subscribe(d => expect(d).toEqual(res));
    const req = httpMock.expectOne('/api/rest/s1/mantle/products/P1/categories');
    expect(req.request.method).toBe('POST');
    req.flush(res);
  });

  it('should delete product', () => {
    const res = { ok: true };
    service.deleteProduct('P1').subscribe(d => expect(d).toEqual(res));
    const req = httpMock.expectOne('/api/rest/s1/commerce/deleteProduct/P1');
    expect(req.request.method).toBe('POST');
    req.flush(res);
  });

  it('should create product assoc', () => {
    const params = { assoc: true };
    const res = { ok: true };
    service.createProductAssoc(params).subscribe(d => expect(d).toEqual(res));
    const req = httpMock.expectOne('/api/rest/s1/commerce/createProductAssoc');
    expect(req.request.method).toBe('POST');
    req.flush(res);
  });

  it('should create product content', () => {
    const params = { data: 'c' };
    const res = { ok: true };
    service.createProductContent(params).subscribe(d => expect(d).toEqual(res));
    const req = httpMock.expectOne('/api/rest/s1/commerce/createProductContent');
    expect(req.request.method).toBe('POST');
    req.flush(res);
  });
});
