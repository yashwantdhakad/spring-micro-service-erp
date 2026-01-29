import { Injectable } from '@angular/core';
import { ApiService } from '../common/api.service';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';

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
    const url = `/wms/api/products?${queryString}`;
    return this.apiService.get(url).pipe(
      map((response: any) => {
        const list = Array.isArray(response?.documentList) ? response.documentList : [];
        const mappedList = list.map((item: any) => ({
          ...item,
          name: item?.productName || item?.name || item?.productId,
        }));
        return {
          ...response,
          documentList: mappedList,
        };
      })
    );
  }

  createProduct(params: any): Observable<any> {
    return this.apiService.post('/wms/api/products', params);
  }

  getProduct(productId: string): Observable<any> {
    const url = `/wms/api/products/${encodeURIComponent(productId)}`;
    return this.apiService.get(url);
  }

  getInventorySummary(productId: string): Observable<any[]> {
    const url = `/wms/api/inventory-items/summary?productId=${encodeURIComponent(productId)}`;
    return this.apiService.get<any[]>(url);
  }

  updateProduct(params: any): Observable<any> {
    const url = `/wms/api/products/${encodeURIComponent(params.productId)}`;
    return this.apiService.put(url, params);
  }

  addProductPrice(params: any): Observable<any> {
    const url = `/wms/api/products/${encodeURIComponent(params.productId)}/prices`;
    return this.apiService.post(url, params);
  }

  deleteProductPrice(params: any): Observable<any> {
    const url = `/wms/api/products/${encodeURIComponent(params.productId)}/prices/${encodeURIComponent(params.productPriceId)}`;
    return this.apiService.delete(url);
  }

  updateProductPrice(params: any): Observable<any> {
    const url = `/wms/api/products/${encodeURIComponent(params.productId)}/prices/${encodeURIComponent(params.productPriceId)}`;
    return this.apiService.put(url, params);
  }

  addProductCategory(params: any): Observable<any> {
    const url = `/wms/api/products/${encodeURIComponent(params.productId)}/categories`;
    return this.apiService.post(url, params);
  }

  deleteProduct(productId: string): Observable<any> {
    const url = `/wms/api/products/${encodeURIComponent(productId)}`;
    return this.apiService.delete(url);
  }

  createProductAssoc(params: any): Observable<any> {
    const url = `/wms/api/products/${encodeURIComponent(params.productId)}/assocs`;
    return this.apiService.post(url, params);
  }

  createProductContent(productId: string, formData: FormData): Observable<any> {
    const url = `/wms/api/products/${encodeURIComponent(productId)}/contents`;
    return this.apiService.postFormData(url, formData);
  }

  downloadProductContent(productId: string, contentId: string): Observable<Blob> {
    const url = `/wms/api/products/${encodeURIComponent(productId)}/contents/${encodeURIComponent(contentId)}`;
    return this.apiService.getBlob(url);
  }

  getProductAssocTypes(): Observable<any> {
    return this.apiService.get<any[]>('/wms/api/product-assoc-types').pipe(
      map((items) =>
        (items || []).map((item) => ({
          ...item,
          enumId: item?.enumId ?? item?.productAssocTypeId,
        }))
      )
    );
  }
}
