import { Injectable } from '@angular/core';
import { ApiService } from '../common/api.service';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class CategoryService {
  constructor(private apiService: ApiService) {}

  getCategories(pageIndex: number, keyword: string): Observable<any> {
    const params = new URLSearchParams();
    params.set('page', pageIndex.toString());
    params.set('categoryName', keyword);

    const url = `/api/categories?${params.toString()}`;
    return this.apiService.customGet(url); // already returns Observable
  }

  createCategory(params: any): Observable<any> {
    return this.apiService.post('/api/categories', params);
  }

  updateCategory(params: any): Observable<any> {
    const url = `/api/categories/${encodeURIComponent(params.productCategoryId)}`;
    return this.apiService.put(url, params);
  }

  getCategory(categoryId: string): Observable<any> {
    const url = `/api/categories/${encodeURIComponent(categoryId)}`;
    return this.apiService.get(url);
  }

  addProductToCategory(params: any): Observable<any> {
    const url = `/api/products/${params.productId}/categories`;
    return this.apiService.post(url, params);
  }

  deleteProductCategory(params: any): Observable<any> {
    const url = `/api/rest/s1/commerce/productCategoryMember`;
    return this.apiService.patch(url, params);
  }
}
