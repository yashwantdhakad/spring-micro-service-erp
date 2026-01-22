import { TestBed } from '@angular/core/testing';
import { FeatureService } from './feature.service';
import { ApiService } from '../common/api.service';
import { of } from 'rxjs';
import { HttpHeaders, HttpResponse } from '@angular/common/http';

describe('FeatureService', () => {
  let service: FeatureService;
  let apiServiceSpy: jasmine.SpyObj<ApiService>;

  beforeEach(() => {
    const spy = jasmine.createSpyObj('ApiService', ['customGet', 'get', 'post', 'put']);

    TestBed.configureTestingModule({
      providers: [
        FeatureService,
        { provide: ApiService, useValue: spy }
      ]
    });

    service = TestBed.inject(FeatureService);
    apiServiceSpy = TestBed.inject(ApiService) as jasmine.SpyObj<ApiService>;
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });

  it('should call getFeatures with correct URL and return data', () => {
    const mockResponse = new HttpResponse({
      body: [{ productFeatureId: 'F1' }],
      headers: new HttpHeaders({ 'x-total-count': '5' }),
    });

    apiServiceSpy.customGet.and.returnValue(of(mockResponse));

    service.getFeatures(0, 'test').subscribe((res) => {
      expect(res).toEqual(mockResponse);
    });

    const expectedUrl = '/api/rest/s1/mantle/products/features?pageIndex=0&queryString=test';
    expect(apiServiceSpy.customGet).toHaveBeenCalledWith(expectedUrl);
  });

  it('should call createFeature with correct params and return result', () => {
    const payload = { description: 'New Feature' };
    const mockResult = { productFeatureId: 'F2' };

    apiServiceSpy.post.and.returnValue(of(mockResult));

    service.createFeature(payload).subscribe((res) => {
      expect(res).toEqual(mockResult);
    });

    expect(apiServiceSpy.post).toHaveBeenCalledWith('/api/rest/s1/commerce/features', payload);
  });

  it('should call getFeature with correct ID and return detail', () => {
    const mockDetail = { productFeatureId: 'F1', description: 'Size' };

    apiServiceSpy.get.and.returnValue(of(mockDetail));

    service.getFeature('F1').subscribe((res) => {
      expect(res).toEqual(mockDetail);
    });

    expect(apiServiceSpy.get).toHaveBeenCalledWith('/api/rest/s1/mantle/products/features/F1');
  });

  it('should update feature', () => {
    const params = { id: 'F1' };
    const res = { ok: true };
    apiServiceSpy.put.and.returnValue(of(res));
    service.updateFeature(params).subscribe(r => expect(r).toEqual(res));
    expect(apiServiceSpy.put).toHaveBeenCalledWith('/api/rest/s1/commerce/features/', params);
  });

  it('should create product feature appl', () => {
    const params = { data: true };
    const res = { ok: true };
    apiServiceSpy.post.and.returnValue(of(res));
    service.createProductFeatureAppl(params).subscribe(r => expect(r).toEqual(res));
    expect(apiServiceSpy.post).toHaveBeenCalledWith('/api/rest/s1/commerce/productFeatureAppl', params);
  });

  it('should update product feature appl', () => {
    const params = { data: true };
    const res = { ok: true };
    apiServiceSpy.put.and.returnValue(of(res));
    service.updateProductFeatureAppl(params).subscribe(r => expect(r).toEqual(res));
    expect(apiServiceSpy.put).toHaveBeenCalledWith('/api/rest/s1/commerce/productFeatureAppl', params);
  });

  it('should create product feature group appl', () => {
    const params = { data: true };
    const res = { ok: true };
    apiServiceSpy.post.and.returnValue(of(res));
    service.createProductFeatureGroupAppl(params).subscribe(r => expect(r).toEqual(res));
    expect(apiServiceSpy.post).toHaveBeenCalledWith('/api/rest/s1/commerce/productFeatureGroupAppl', params);
  });

  it('should update product feature group appl', () => {
    const params = { data: true };
    const res = { ok: true };
    apiServiceSpy.put.and.returnValue(of(res));
    service.updateProductFeatureGroupAppl(params).subscribe(r => expect(r).toEqual(res));
    expect(apiServiceSpy.put).toHaveBeenCalledWith('/api/rest/s1/commerce/productFeatureGroupAppl', params);
  });
});
