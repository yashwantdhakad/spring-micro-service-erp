import { Injectable } from '@angular/core';
import { Store } from '@ngrx/store';
import { Observable, forkJoin, of, throwError } from 'rxjs';
import { catchError, map, shareReplay, tap } from 'rxjs/operators';
import * as GeoActions from 'src/app/store/geo/geo.actions';
import * as EnumActions from 'src/app/store/enum/enum.actions';
import { ApiService } from './api.service';

@Injectable({
  providedIn: 'root',
})
export class CommonService {
  constructor(private apiService: ApiService, private store: Store) { }

  private enumTypeCache = new Map<string, Observable<any[]>>();
  private statusItemCache = new Map<string, Observable<any[]>>();
  private statusAllCache$: Observable<any[]> | null = null;
  private parentEnumTypeCache = new Map<string, Observable<any[]>>();
  private uomCache = new Map<string, Observable<any[]>>();
  private roleTypeCache = new Map<string, Observable<any[]>>();
  private shipmentTypeCache$: Observable<any[]> | null = null;
  private shipmentMethodTypeCache$: Observable<any[]> | null = null;
  private geosCache$: Observable<any[]> | null = null;

  getEnumTypes(enumTypeId: string): Observable<any> {
    if (!this.enumTypeCache.has(enumTypeId)) {
      const request$ = this.apiService.get<any[]>('/oms/api/common/enumerations').pipe(
        map((items) =>
          (items || []).filter((item) => item?.enumTypeId === enumTypeId)
        ),
        shareReplay(1),
        catchError((error) => {
          this.enumTypeCache.delete(enumTypeId);
          return this.handleError(error);
        })
      );
      this.enumTypeCache.set(enumTypeId, request$);
    }
    return this.enumTypeCache.get(enumTypeId)!;
  }

  getStatusItems(statusTypeId: string): Observable<any> {
    if (!this.statusItemCache.has(statusTypeId)) {
      const request$ = this.apiService.get<any[]>('/oms/api/common/status-items').pipe(
        map((items) =>
          (items || []).filter((item) => item?.statusTypeId === statusTypeId)
        ),
        shareReplay(1),
        catchError((error) => {
          this.statusItemCache.delete(statusTypeId);
          return this.handleError(error);
        })
      );
      this.statusItemCache.set(statusTypeId, request$);
    }
    return this.statusItemCache.get(statusTypeId)!;
  }

  getAllStatusItems(): Observable<any[]> {
    if (!this.statusAllCache$) {
      this.statusAllCache$ = this.apiService.get<any[]>('/oms/api/common/status-items').pipe(
        shareReplay(1),
        catchError((error) => {
          this.statusAllCache$ = null;
          return this.handleError(error);
        })
      );
    }
    return this.statusAllCache$;
  }

  getParentEnumTypes(parentEnumId: string): Observable<any> {
    if (!this.parentEnumTypeCache.has(parentEnumId)) {
      const request$ = this.apiService.get<any[]>('/oms/api/common/enumeration-types').pipe(
        map((items) =>
          (items || []).filter((item) => item?.parentTypeId === parentEnumId)
        ),
        shareReplay(1),
        catchError((error) => {
          this.parentEnumTypeCache.delete(parentEnumId);
          return this.handleError(error);
        })
      );
      this.parentEnumTypeCache.set(parentEnumId, request$);
    }
    return this.parentEnumTypeCache.get(parentEnumId)!;
  }

  getUoms(uomTypeEnumId: string): Observable<any> {
    if (!this.uomCache.has(uomTypeEnumId)) {
      const request$ = this.apiService.get<any[]>('/oms/api/common/uoms').pipe(
        map((items) =>
          (items || []).filter((item) => item?.uomTypeId === uomTypeEnumId)
        ),
        shareReplay(1),
        catchError((error) => {
          this.uomCache.delete(uomTypeEnumId);
          return this.handleError(error);
        })
      );
      this.uomCache.set(uomTypeEnumId, request$);
    }
    return this.uomCache.get(uomTypeEnumId)!;
  }

  getGeoList(geoTypeEnumId: string): Observable<any> {
    return this.fetchGeosWithAssocs().pipe(
      map((items) => items.filter((item) => item?.geoTypeId === geoTypeEnumId)),
      catchError(this.handleError)
    );
  }

  getRoleTypes(enumTypeId: string): Observable<any> {
    if (!this.roleTypeCache.has(enumTypeId)) {
      const request$ = this.apiService.get<any[]>('/party/api/role-types').pipe(
        map((items) =>
          (items || []).filter((item) =>
            enumTypeId ? item?.parentTypeId === enumTypeId : true
          )
        ),
        shareReplay(1),
        catchError((error) => {
          this.roleTypeCache.delete(enumTypeId);
          return this.handleError(error);
        })
      );
      this.roleTypeCache.set(enumTypeId, request$);
    }
    return this.roleTypeCache.get(enumTypeId)!;
  }

  getShipmentTypes(): Observable<any[]> {
    if (!this.shipmentTypeCache$) {
      this.shipmentTypeCache$ = this.apiService.get<any[]>('/wms/api/shipment-types').pipe(
        shareReplay(1),
        catchError((error) => {
          this.shipmentTypeCache$ = null;
          return this.handleError(error);
        })
      );
    }
    return this.shipmentTypeCache$;
  }

  getShipmentMethodTypes(): Observable<any[]> {
    if (!this.shipmentMethodTypeCache$) {
      this.shipmentMethodTypeCache$ = this.apiService.get<any[]>('/wms/api/shipment-method-types').pipe(
        shareReplay(1),
        catchError((error) => {
          this.shipmentMethodTypeCache$ = null;
          return this.handleError(error);
        })
      );
    }
    return this.shipmentMethodTypeCache$;
  }

  getOrderItemTypes(): Observable<any[]> {
    const itemTypes = [
      { orderItemTypeId: 'INVENTORY_ORDER_ITEM', description: 'PO: Inventory' },
      { orderItemTypeId: 'SUPPLIES_ORDER_ITEM', description: 'PO: Supplies (to Expense)' },
      { orderItemTypeId: 'ASSET_ORDER_ITEM', description: 'PO: Fixed Asset' },
      { orderItemTypeId: 'PRODUCT_ORDER_ITEM', description: 'Product Item' },
      { orderItemTypeId: 'WORK_ORDER_ITEM', description: 'Work Item' },
      { orderItemTypeId: 'RENTAL_ORDER_ITEM', description: 'Rental Item' },
      { orderItemTypeId: 'BULK_ORDER_ITEM', description: 'Bulk Item' },
    ];
    return of(itemTypes);
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

  getValidStatusChanges(statusId: string): Observable<any[]> {
    return this.apiService.get<any[]>(`/oms/api/common/status-valid-changes/by-status/${statusId}`).pipe(
      catchError(this.handleError)
    );
  }

  // this.getLookupResults({ field: 'geo_type_id', value: 'COUNTRY' }, 'geo');

  private fetchGeosWithAssocs(): Observable<any[]> {
    if (!this.geosCache$) {
      this.geosCache$ = forkJoin({
        geos: this.apiService.get<any[]>('/oms/api/common/geos'),
        assocs: this.apiService.get<any[]>('/oms/api/common/geo-assocs'),
      }).pipe(
        map(({ geos, assocs }) => {
          const assocMap = this.buildGeoCountryMap(assocs || []);
          return this.normalizeGeos(geos || [], assocMap);
        }),
        shareReplay(1),
        catchError((error) => {
          this.geosCache$ = null;
          return this.handleError(error);
        })
      );
    }
    return this.geosCache$;
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
