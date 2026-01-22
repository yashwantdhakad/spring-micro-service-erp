import { TestBed } from '@angular/core/testing';
import { CategoryService } from './category.service';
import { ApiService } from '../common/api.service';
import { of } from 'rxjs';
import { HttpHeaders, HttpResponse } from '@angular/common/http';

describe('CategoryService', () => {
  let service: CategoryService;
  let apiServiceSpy: jasmine.SpyObj<ApiService>;

  beforeEach(() => {
    const spy = jasmine.createSpyObj('ApiService', ['customGet', 'post', 'patch', 'get']);

    TestBed.configureTestingModule({
      providers: [
        CategoryService,
        { provide: ApiService, useValue: spy }
      ]
    });

    service = TestBed.inject(CategoryService);
    apiServiceSpy = TestBed.inject(ApiService) as jasmine.SpyObj<ApiService>;
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });

  it('should call getCategories with correct URL and params', () => {
    const mockResponse = new HttpResponse({
      body: [{ categoryId: 'CAT01' }],
      headers: new HttpHeaders({ 'x-total-count': '10' }),
    });

    apiServiceSpy.customGet.and.returnValue(of(mockResponse));

    const pageIndex = 0;
    const keyword = 'electronics';

    service.getCategories(pageIndex, keyword).subscribe((res) => {
      expect(res).toEqual(mockResponse);
    });

    const expectedUrl = `/api/rest/s1/commerce/getCategories?pageIndex=0&categoryName=electronics`;
    expect(apiServiceSpy.customGet).toHaveBeenCalledWith(expectedUrl);
  });

  it('should call createCategory with correct payload', () => {
    const params = { categoryName: 'New Category' };
    const mockResponse = { productCategoryId: 'CAT02' };

    apiServiceSpy.post.and.returnValue(of(mockResponse));

    service.createCategory(params).subscribe((res) => {
      expect(res).toEqual(mockResponse);
    });

    expect(apiServiceSpy.post).toHaveBeenCalledWith('/api/rest/s1/commerce/category', params);
  });

  it('should call getCategory with correct ID', () => {
    const mockCategory = { productCategoryId: 'CAT01' };
    apiServiceSpy.get.and.returnValue(of(mockCategory));

    service.getCategory('CAT01').subscribe((res) => {
      expect(res).toEqual(mockCategory);
    });

    expect(apiServiceSpy.get).toHaveBeenCalledWith('/api/rest/s1/mantle/products/categories/CAT01');
  });

  it('should update category', () => {
    const params = { id: 'CAT01' };
    const res = { ok: true };
    apiServiceSpy.patch.and.returnValue(of(res));
    service.updateCategory(params).subscribe(r => expect(r).toEqual(res));
    expect(apiServiceSpy.patch).toHaveBeenCalledWith('/api/rest/s1/commerce/category', params);
  });

  it('should add product to category', () => {
    const params = { productId: 'P1' };
    const res = { ok: true };
    apiServiceSpy.post.and.returnValue(of(res));
    service.addProductToCategory(params).subscribe(r => expect(r).toEqual(res));
    expect(apiServiceSpy.post).toHaveBeenCalledWith('/api/rest/s1/commerce/productCategoryMember', params);
  });

  it('should delete product category', () => {
    const params = { productId: 'P1' };
    const res = { ok: true };
    apiServiceSpy.patch.and.returnValue(of(res));
    service.deleteProductCategory(params).subscribe(r => expect(r).toEqual(res));
    expect(apiServiceSpy.patch).toHaveBeenCalledWith('/api/rest/s1/commerce/productCategoryMember', params);
  });
});
