import { TestBed } from '@angular/core/testing';
import { AssetService } from './asset.service';
import { ApiService } from '../common/api.service';
import { of } from 'rxjs';
import { HttpHeaders, HttpResponse } from '@angular/common/http';

describe('AssetService', () => {
  let service: AssetService;
  let apiServiceSpy: jasmine.SpyObj<ApiService>;

  beforeEach(() => {
    const spy = jasmine.createSpyObj('ApiService', ['customGet', 'get', 'post']);

    TestBed.configureTestingModule({
      providers: [
        AssetService,
        { provide: ApiService, useValue: spy }
      ]
    });

    service = TestBed.inject(AssetService);
    apiServiceSpy = TestBed.inject(ApiService) as jasmine.SpyObj<ApiService>;
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });

  it('should call getAssets with correct URL', () => {
    const headers = new HttpHeaders({ 'x-total-count': '42' });
    const mockResponse = new HttpResponse({ body: [], headers });

    apiServiceSpy.customGet.and.returnValue(of(mockResponse));

    service.getAssets(0, 'test').subscribe(res => {
      expect(res).toEqual(mockResponse);
    });

    const expectedUrl = `/api/rest/s1/mantle/assets?pageIndex=0&query=test`;
    expect(apiServiceSpy.customGet).toHaveBeenCalledWith(expectedUrl);
  });

  it('should call getAsset with correct assetId', () => {
    const mockAsset = { assetId: 'A1001' };
    apiServiceSpy.get.and.returnValue(of(mockAsset));

    service.getAsset('A1001').subscribe(res => {
      expect(res).toEqual(mockAsset);
    });

    expect(apiServiceSpy.get).toHaveBeenCalledWith('/api/rest/s1/mantle/assets/A1001');
  });

  it('should call receiveAsset with correct params', () => {
    const params = { productId: 'P1001', quantity: 1 };
    const response = { assetId: 'A2001' };
    apiServiceSpy.post.and.returnValue(of(response));

    service.receiveAsset(params).subscribe(res => {
      expect(res).toEqual(response);
    });

    expect(apiServiceSpy.post).toHaveBeenCalledWith('/api/rest/s1/mantle/assets/receive', params);
  });
});
