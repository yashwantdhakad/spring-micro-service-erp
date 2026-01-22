import { TestBed } from '@angular/core/testing';
import { FeatureGroupService } from './feature-group.service';
import { ApiService } from '../common/api.service';
import { of } from 'rxjs';
import { HttpHeaders, HttpResponse } from '@angular/common/http';

describe('FeatureGroupService', () => {
  let service: FeatureGroupService;
  let apiServiceSpy: jasmine.SpyObj<ApiService>;

  beforeEach(() => {
    const spy = jasmine.createSpyObj('ApiService', ['customGet', 'get', 'post', 'put']);

    TestBed.configureTestingModule({
      providers: [
        FeatureGroupService,
        { provide: ApiService, useValue: spy },
      ],
    });

    service = TestBed.inject(FeatureGroupService);
    apiServiceSpy = TestBed.inject(ApiService) as jasmine.SpyObj<ApiService>;
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });

  it('should call getFeatureGroups with correct URL', () => {
    const mockResponse = new HttpResponse({
      body: [{ productFeatureGroupId: 'FG1' }],
      headers: new HttpHeaders({ 'x-total-count': '10' }),
    });

    apiServiceSpy.customGet.and.returnValue(of(mockResponse));

    service.getFeatureGroups(0, 'Test').subscribe((res) => {
      expect(res).toEqual(mockResponse);
    });

    const expectedUrl = `/api/rest/s1/commerce/featureGroups?pageIndex=0&queryString=Test`;
    expect(apiServiceSpy.customGet).toHaveBeenCalledWith(expectedUrl);
  });

  it('should call createFeatureGroup with correct payload', () => {
    const payload = { description: 'New Group' };
    const mockResponse = { productFeatureGroupId: 'FG2' };

    apiServiceSpy.post.and.returnValue(of(mockResponse));

    service.createFeatureGroup(payload).subscribe((res) => {
      expect(res).toEqual(mockResponse);
    });

    expect(apiServiceSpy.post).toHaveBeenCalledWith('/api/rest/s1/commerce/featureGroups', payload);
  });

  it('should call getFeatureGroup with correct ID', () => {
    const mockDetail = { productFeatureGroupId: 'FG1', description: 'Test Group' };

    apiServiceSpy.get.and.returnValue(of(mockDetail));

    service.getFeatureGroup('FG1').subscribe((res) => {
      expect(res).toEqual(mockDetail);
    });

    expect(apiServiceSpy.get).toHaveBeenCalledWith('/api/rest/s1/mantle/products/features/groups/FG1');
  });

  it('should update feature group', () => {
    const params = { id: 'FG1' };
    const res = { ok: true };
    apiServiceSpy.put.and.returnValue(of(res));
    service.updateFeatureGroup(params).subscribe(r => expect(r).toEqual(res));
    expect(apiServiceSpy.put).toHaveBeenCalledWith('/api/rest/s1/commerce/featureGroups/', params);
  });

  it('should create product category feature group appl', () => {
    const params = { data: true };
    const res = { ok: true };
    apiServiceSpy.post.and.returnValue(of(res));
    service.createProductCategoryFeatGrpAppl(params).subscribe(r => expect(r).toEqual(res));
    expect(apiServiceSpy.post).toHaveBeenCalledWith('/api/rest/s1/commerce/productCategoryFeatGrpAppl', params);
  });

  it('should update product category feature group appl', () => {
    const params = { data: true };
    const res = { ok: true };
    apiServiceSpy.put.and.returnValue(of(res));
    service.updateProductCategoryFeatGrpAppl(params).subscribe(r => expect(r).toEqual(res));
    expect(apiServiceSpy.put).toHaveBeenCalledWith('/api/rest/s1/commerce/productCategoryFeatGrpAppl', params);
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
