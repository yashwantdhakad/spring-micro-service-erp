import { Injectable } from '@angular/core';
import { Store } from '@ngrx/store';
import { Observable, throwError } from 'rxjs';
import { catchError, tap } from 'rxjs/operators';
import * as GeoActions from 'src/app/store/geo/geo.actions';
import * as EnumActions from 'src/app/store/enum/enum.actions';
import { ApiService } from './api.service';

@Injectable({
  providedIn: 'root',
})
export class CommonService {
  constructor(private apiService: ApiService, private store: Store) {}

  getEnumTypes(enumTypeId: string): Observable<any> {
    return this.apiService.post('/api/rest/s1/commerce/getEnumTypes', { enumTypeId }).pipe(
      catchError(this.handleError)
    );
  }

  getStatusItems(statusTypeId: string): Observable<any> {
    return this.apiService.post('/api/rest/s1/commerce/getStatusItems', { statusTypeId }).pipe(
      catchError(this.handleError)
    );
  }

  getParentEnumTypes(parentEnumId: string): Observable<any> {
    const url = `/api/rest/s1/moqui/basic/enums?pageNoLimit=true&parentEnumId=${parentEnumId}`;
    return this.apiService.get(url).pipe(
      catchError(this.handleError)
    );
  }

  getUoms(uomTypeEnumId: string): Observable<any> {
    const url = `/api/rest/s1/moqui/basic/uoms?pageNoLimit=true&uomTypeEnumId=${uomTypeEnumId}`;
    return this.apiService.get(url).pipe(
      catchError(this.handleError)
    );
  }

  getGeoList(geoTypeEnumId: string): Observable<any> {
    const url = `/api/rest/s1/moqui/basic/geos?pageNoLimit=true&geoTypeEnumId=${geoTypeEnumId}`;
    return this.apiService.get(url).pipe(
      catchError(this.handleError)
    );
  }

  getRoleTypes(enumTypeId: string): Observable<any> {
    const url = `/api/rest/s1/commerce/roleTypes?enumTypeId=${enumTypeId}`;
    return this.apiService.get(url).pipe(
      catchError(this.handleError)
    );
  }

  getGeos(): Observable<any[]> {
    return this.apiService.post('/api/rest/s1/commerce/getGeos', { geoTypeEnumId: '', geoId: '' }).pipe(
      tap((geos: any) => this.store.dispatch(GeoActions.loadGeosSuccess({ geos }))),
      catchError((error) => {
        this.store.dispatch(GeoActions.loadGeosFailure({ error: error.message }));
        return throwError(() => new Error(error.message));
      })
    );
  }

  getEnums(): Observable<any[]> {
    return this.apiService.get('/api/rest/s1/moqui/basic/enums?pageNoLimit=true').pipe(
      tap((enums: any) => this.store.dispatch(EnumActions.loadEnumsSuccess({ enums }))),
      catchError((error) => {
        this.store.dispatch(EnumActions.loadEnumsFailure({ error: error.message }));
        return throwError(() => new Error(error.message));
      })
    );
  }

  getFacilities(): Observable<any> {
    return this.apiService.get('/api/rest/s1/commerce/Facilities').pipe(
      catchError(this.handleError)
    );
  }

  getFacilityLocations(): Observable<any> {
    return this.apiService.get('/api/rest/s1/commerce/FacilityLocations').pipe(
      catchError(this.handleError)
    );
  }

 getLookupResults(
  params: { field?: string; value?: string | number | string[] } = {},
  table: string
): Observable<any> {
  const q: string[] = [`table=${encodeURIComponent(table)}`];

  if (params.field) {
    q.push(`field=${encodeURIComponent(params.field)}`);
  }

  if (params.value !== undefined && params.value !== null && params.value !== '') {
    const val =
      Array.isArray(params.value)
        ? params.value.join(',')              // e.g. A,B,C
        : String(params.value);               // no auto-quoting
    q.push(`value=${encodeURIComponent(val)}`);
  }

  const url = `/api/lookup?${q.join('&')}`;
  return this.apiService.get(url).pipe(catchError(this.handleError));
}

// /api/lookup?table=geo&field=geo_type_id&value=COUNTRY
// this.getLookupResults({ field: 'geo_type_id', value: 'COUNTRY' }, 'geo');

// /api/lookup?table=producttype
// this.getLookupResults({}, 'producttype');

// /api/lookup?table=geo&field=country_geo_id&value=IN,US
// this.getLookupResults({ field: 'country_geo_id', value: ['IN','US'] }, 'geo');


  setSnackbar(setValue: any): void {
    // Your existing logic
  }

  private handleError(error: any): Observable<never> {
    return throwError(() => error);
  }
}
