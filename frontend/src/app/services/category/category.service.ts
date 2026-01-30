import { Injectable } from '@angular/core';
import { ApiService } from '../common/api.service';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class CategoryService {
  constructor(private apiService: ApiService) {}

  getCategories(pageIndex: number, keyword: string, sortBy?: string, sortDirection?: string): Observable<any> {
    const params = new URLSearchParams();
    params.set('page', pageIndex.toString());
    params.set('categoryName', keyword);
    if (sortBy) {
      params.set('sortBy', sortBy);
    }
    if (sortDirection) {
      params.set('sortDirection', sortDirection);
    }

    const url = `/wms/api/product-categories?${params.toString()}`;
    return this.apiService.customGet(url); // already returns Observable
  }

  createCategory(params: any): Observable<any> {
    return this.apiService.post('/wms/api/product-categories', params);
  }

  updateCategory(params: any): Observable<any> {
    const url = `/wms/api/product-categories/${encodeURIComponent(params.productCategoryId)}`;
    return this.apiService.put(url, params);
  }

  getCategory(categoryId: string): Observable<any> {
    const url = `/wms/api/product-categories/${encodeURIComponent(categoryId)}`;
    return this.apiService.get(url);
  }

  addProductToCategory(params: any): Observable<any> {
    const url = `/wms/api/products/${encodeURIComponent(params.productId)}/categories`;
    return this.apiService.post(url, params);
  }

  deleteProductCategory(params: any): Observable<any> {
    const url = `/wms/api/product-categories/${encodeURIComponent(params.productCategoryId)}/products/${encodeURIComponent(params.productId)}`;
    return this.apiService.delete(url);
  }
}
