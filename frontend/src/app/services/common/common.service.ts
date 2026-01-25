import { Injectable } from '@angular/core';
import { Store } from '@ngrx/store';
import { Observable, forkJoin, of, throwError } from 'rxjs';
import { catchError, map, tap } from 'rxjs/operators';
import * as GeoActions from 'src/app/store/geo/geo.actions';
import * as EnumActions from 'src/app/store/enum/enum.actions';
import { ApiService } from './api.service';

@Injectable({
  providedIn: 'root',
})
export class CommonService {
  constructor(private apiService: ApiService, private store: Store) {}

  getEnumTypes(enumTypeId: string): Observable<any> {
    return this.apiService.get<any[]>('/oms/api/common/enumerations').pipe(
      map((items) =>
        (items || []).filter((item) => item?.enumTypeId === enumTypeId)
      ),
      catchError(this.handleError)
    );
  }

  getStatusItems(statusTypeId: string): Observable<any> {
    return this.apiService.get<any[]>('/oms/api/common/status-items').pipe(
      map((items) =>
        (items || []).filter((item) => item?.statusTypeId === statusTypeId)
      ),
      catchError(this.handleError)
    );
  }

  getParentEnumTypes(parentEnumId: string): Observable<any> {
    return this.apiService.get<any[]>('/oms/api/common/enumeration-types').pipe(
      map((items) =>
        (items || []).filter((item) => item?.parentTypeId === parentEnumId)
      ),
      catchError(this.handleError)
    );
  }

  getUoms(uomTypeEnumId: string): Observable<any> {
    return this.apiService.get<any[]>('/oms/api/common/uoms').pipe(
      map((items) =>
        (items || []).filter((item) => item?.uomTypeId === uomTypeEnumId)
      ),
      catchError(this.handleError)
    );
  }

  getGeoList(geoTypeEnumId: string): Observable<any> {
    return this.fetchGeosWithAssocs().pipe(
      map((items) => items.filter((item) => item?.geoTypeId === geoTypeEnumId)),
      catchError(this.handleError)
    );
  }

  getRoleTypes(enumTypeId: string): Observable<any> {
    return this.apiService.get<any[]>('/party/api/role-types').pipe(
      map((items) =>
        (items || []).filter((item) =>
          enumTypeId ? item?.parentTypeId === enumTypeId : true
        )
      ),
      catchError(this.handleError)
    );
  }

  getGeos(): Observable<any[]> {
    return this.fetchGeosWithAssocs().pipe(
      tap((geos: any) => this.store.dispatch(GeoActions.loadGeosSuccess({ geos }))),
      catchError((error) => {
        this.store.dispatch(GeoActions.loadGeosFailure({ error: error.message }));
        return throwError(() => new Error(error.message));
      })
    );
  }

  getEnums(): Observable<any[]> {
    return this.apiService.get<any[]>('/oms/api/common/enumerations').pipe(
      tap((enums: any) => this.store.dispatch(EnumActions.loadEnumsSuccess({ enums }))),
      catchError((error) => {
        this.store.dispatch(EnumActions.loadEnumsFailure({ error: error.message }));
        return throwError(() => new Error(error.message));
      })
    );
  }

  getFacilities(): Observable<any> {
    return this.apiService.get('/wms/api/facilities').pipe(
      map((facilities: any) =>
        (Array.isArray(facilities) ? facilities : [facilities]).map((facility: any) => ({
          ...facility,
          label: facility.facilityName || facility.facilityId,
        }))
      ),
      catchError(this.handleError)
    );
  }

  getFacilityLocations(): Observable<any> {
    return this.apiService.get('/wms/api/facility-locations').pipe(
      catchError(this.handleError)
    );
  }

 getLookupResults(
  params: { field?: string; value?: string | number | string[] } = {},
  table: string
): Observable<any> {
  const tableKey = table?.toLowerCase() || '';
  const filterParams = (items: any[]) => {
    if (!params.field) {
      return items;
    }
    const rawField = params.field;
    const camelField = rawField.replace(/_([a-z])/g, (_, char) => char.toUpperCase());
    const field = rawField in (items[0] || {}) ? rawField : camelField;
    const rawValue = params.value;
    const values = Array.isArray(rawValue)
      ? rawValue.map(String)
      : rawValue !== undefined && rawValue !== null
        ? String(rawValue).split(',').map((val) => val.trim()).filter(Boolean)
        : [];

    return items.filter((item) => {
      const itemValue = item?.[field];
      if (values.length === 0) {
        return true;
      }
      return values.includes(String(itemValue));
    });
  };

  if (tableKey === 'geo') {
    return this.fetchGeosWithAssocs().pipe(
      map((items) => filterParams(items)),
      catchError(this.handleError)
    );
  }
  if (tableKey === 'product_type' || tableKey === 'producttype') {
    return this.apiService.get<any[]>('/wms/api/product-types').pipe(
      map((items) => filterParams(items || [])),
      catchError(this.handleError)
    );
  }
  if (tableKey === 'product_category_type' || tableKey === 'productcategorytype') {
    return this.apiService.get<any[]>('/wms/api/product-category-types').pipe(
      map((items) => filterParams(items || [])),
      catchError(this.handleError)
    );
  }
  if (tableKey === 'productpricetype') {
    return this.apiService.get<any[]>('/wms/api/product-price-types').pipe(
      map((items) => filterParams(items || [])),
      catchError(this.handleError)
    );
  }
  if (tableKey === 'productpricepurpose') {
    const purposes = [
      { productPricePurposeId: 'DEPOSIT', description: 'Deposit price' },
      { productPricePurposeId: 'PURCHASE', description: 'Purchase/Initial' },
      { productPricePurposeId: 'RECURRING_CHARGE', description: 'Recurring Charge' },
      { productPricePurposeId: 'USAGE_CHARGE', description: 'Usage Charge' },
      { productPricePurposeId: 'COMPONENT_PRICE', description: 'Component Price' },
    ];
    return of(filterParams(purposes));
  }
  if (tableKey === 'roletypes') {
    return this.apiService.get<any[]>('/party/api/role-types').pipe(
      map((items) => filterParams(items || [])),
      catchError(this.handleError)
    );
  }

  return of([]);
}

// this.getLookupResults({ field: 'geo_type_id', value: 'COUNTRY' }, 'geo');

  private fetchGeosWithAssocs(): Observable<any[]> {
    return forkJoin({
      geos: this.apiService.get<any[]>('/oms/api/common/geos'),
      assocs: this.apiService.get<any[]>('/oms/api/common/geo-assocs'),
    }).pipe(
      map(({ geos, assocs }) => {
        const assocMap = this.buildGeoCountryMap(assocs || []);
        return this.normalizeGeos(geos || [], assocMap);
      }),
      catchError(this.handleError)
    );
  }

  private buildGeoCountryMap(assocs: any[]): Map<string, string> {
    const map = new Map<string, string>();
    (assocs || []).forEach((assoc) => {
      const assocType = assoc?.geoAssocTypeId ?? assoc?.geo_assoc_type_id;
      if (assocType && assocType !== 'REGIONS') {
        return;
      }
      const countryId = assoc?.geoId ?? assoc?.geo_id;
      const regionId = assoc?.geoIdTo ?? assoc?.geo_id_to;
      if (countryId && regionId) {
        map.set(String(regionId), String(countryId));
      }
    });
    return map;
  }

  private normalizeGeos(items: any[], assocMap: Map<string, string>): any[] {
    return (items || []).map((geo) => {
      const geoId = geo?.geoId ?? geo?.geo_id;
      const geoTypeId = geo?.geoTypeId ?? geo?.geo_type_id;
      const geoName = geo?.geoName ?? geo?.geo_name;
      const geoCode = geo?.geoCode ?? geo?.geo_code;
      const geoSecCode = geo?.geoSecCode ?? geo?.geo_sec_code;
      const assocCountry = assocMap.get(String(geoId));
      const countryGeoId =
        geo?.country_geo_id ||
        assocCountry ||
        (typeof geoId === 'string' && geoId.includes('_') ? geoId.split('_')[0] : null);

      return {
        ...geo,
        geoId,
        geoTypeId,
        geoName,
        geoCode,
        geoSecCode,
        geo_id: geoId,
        geo_type_id: geoTypeId,
        geo_name: geoName,
        geo_code: geoCode,
        geo_sec_code: geoSecCode,
        country_geo_id: countryGeoId,
      };
    });
  }


  setSnackbar(setValue: any): void {
    // Your existing logic
  }

  private handleError(error: any): Observable<never> {
    return throwError(() => error);
  }
}
