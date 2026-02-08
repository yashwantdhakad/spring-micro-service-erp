import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { ApiService } from '../common/api.service';

@Injectable({
    providedIn: 'root',
})
export class ProductFacilityService {
    private readonly facilitiesPath = '/wms/api/product-facilities';
    private readonly locationsPath = '/wms/api/product-facility-locations';

    constructor(private apiService: ApiService) { }

    // Product Facility Methods
    getProductFacilities(productId: string): Observable<any> {
        return this.apiService.get(`${this.facilitiesPath}?productId=${productId}`);
    }

    createProductFacility(data: any): Observable<any> {
        return this.apiService.post(this.facilitiesPath, data);
    }

    updateProductFacility(id: number, data: any): Observable<any> {
        return this.apiService.put(`${this.facilitiesPath}/${id}`, data);
    }

    deleteProductFacility(id: number): Observable<any> {
        return this.apiService.delete(`${this.facilitiesPath}/${id}`);
    }

    // Product Facility Location Methods
    getProductFacilityLocations(
        productId: string,
        facilityId?: string
    ): Observable<any> {
        let url = `${this.locationsPath}?productId=${productId}`;
        if (facilityId) {
            url += `&facilityId=${facilityId}`;
        }
        return this.apiService.get(url);
    }

    createProductFacilityLocation(data: any): Observable<any> {
        return this.apiService.post(this.locationsPath, data);
    }

    updateProductFacilityLocation(id: number, data: any): Observable<any> {
        return this.apiService.put(`${this.locationsPath}/${id}`, data);
    }

    deleteProductFacilityLocation(id: number): Observable<any> {
        return this.apiService.delete(`${this.locationsPath}/${id}`);
    }
}
