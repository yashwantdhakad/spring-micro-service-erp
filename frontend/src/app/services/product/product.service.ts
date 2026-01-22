import { Injectable } from '@angular/core';
import { ApiService } from '../common/api.service';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class ProductService {
  constructor(private apiService: ApiService) {}

  getProducts(pageIndex: number, keyword: string): Observable<any> {
    const params = {
      page: pageIndex.toString(),
      queryString: keyword,
    };
    const queryString = new URLSearchParams(params).toString();
    const url = `/api/products?${queryString}`;
    return this.apiService.get(url);
  }

  createProduct(params: any): Observable<any> {
    return this.apiService.post('/api/products/', params);
  }

  getProduct(productId: string): Observable<any> {
    const url = `/api/products/${productId}`;
    return this.apiService.get(url);
  }

  updateProduct(params: any): Observable<any> {
    const url = `/api/products/${encodeURIComponent(params.productId)}`;
    return this.apiService.put(url, params);
  }

  addProductPrice(params: any): Observable<any> {
    const url = `/api/products/${encodeURIComponent(params.productId)}/prices`;
    return this.apiService.post(url, params);
  }

  deleteProductPrice(params: any): Observable<any> {
    const url = `/api/products/${encodeURIComponent(params.productId)}/prices/${encodeURIComponent(params.productPriceId)}`;
    return this.apiService.delete(url);
  }

  updateProductPrice(params: any): Observable<any> {
    const url = `/api/products/${encodeURIComponent(params.productId)}/prices/${encodeURIComponent(params.productPriceId)}`;
    return this.apiService.put(url, params);
  }

  addProductCategory(params: any): Observable<any> {
    const url = `/api/products/${params.productId}/categories`;
    return this.apiService.post(url, params);
  }

  deleteProduct(productId: string): Observable<any> {
    const url = `/api/rest/s1/commerce/deleteProduct/${productId}`;
    return this.apiService.post(url, {});
  }

  createProductAssoc(params: any): Observable<any> {
    const url = `/api/rest/s1/commerce/createProductAssoc`;
    return this.apiService.post(url, params);
  }

  createProductContent(params: any): Observable<any> {
    const url = `/api/rest/s1/commerce/createProductContent`;
    return this.apiService.post(url, params);
  }
}
