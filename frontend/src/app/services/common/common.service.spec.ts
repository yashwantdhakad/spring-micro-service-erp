import { TestBed } from '@angular/core/testing';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
import { provideMockStore, MockStore } from '@ngrx/store/testing';
import { CommonService } from './common.service';
import { ApiService } from './api.service';
import { Store } from '@ngrx/store';
import * as GeoActions from 'src/app/store/geo/geo.actions';
import * as EnumActions from 'src/app/store/enum/enum.actions';

describe('CommonService', () => {
  let service: CommonService;
  let httpMock: HttpTestingController;
  let store: MockStore;

  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [HttpClientTestingModule],
      providers: [
        CommonService,
        ApiService,
        provideMockStore({})
      ]
    });
    service = TestBed.inject(CommonService);
    httpMock = TestBed.inject(HttpTestingController);
    store = TestBed.inject(Store) as MockStore;
    spyOn(store, 'dispatch');
  });

  afterEach(() => {
    httpMock.verify();
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });

  it('should fetch enum types', async () => {
    const mockResponse = { enumId: 'TEST_ENUM', description: 'Test Enum' };
    const enumTypeId = 'TEST_ENUM_TYPE';

    service.getEnumTypes(enumTypeId).subscribe(response => {
      expect(response).toEqual(mockResponse);
    });

    const req = httpMock.expectOne('/api/rest/s1/commerce/getEnumTypes');
    expect(req.request.method).toBe('POST');
    req.flush(mockResponse);
  });

  it('should fetch status items', async () => {
    const mockResponse = { statusId: 'TEST_STATUS', description: 'Test Status' };
    const statusTypeId = 'TEST_STATUS_TYPE';

    service.getStatusItems(statusTypeId).subscribe(response => {
      expect(response).toEqual(mockResponse);
    });

    const req = httpMock.expectOne('/api/rest/s1/commerce/getStatusItems');
    expect(req.request.method).toBe('POST');
    req.flush(mockResponse);
  });

  it('should fetch parent enum types', async () => {
    const mockResponse = [{ enumId: 'PARENT_ENUM', description: 'Parent Enum' }];
    const parentEnumId = 'PARENT_ENUM_ID';

    service.getParentEnumTypes(parentEnumId).subscribe(response => {
      expect(response).toEqual(mockResponse);
    });

    const req = httpMock.expectOne(`/api/rest/s1/moqui/basic/enums?pageNoLimit=true&parentEnumId=${parentEnumId}`);
    expect(req.request.method).toBe('GET');
    req.flush(mockResponse);
  });

  it('should fetch UOMs', async () => {
    const mockResponse = [{ uomId: 'UOM', description: 'Unit of Measure' }];
    const uomTypeEnumId = 'UOM_TYPE_ENUM_ID';

    service.getUoms(uomTypeEnumId).subscribe(response => {
      expect(response).toEqual(mockResponse);
    });

    const req = httpMock.expectOne(`/api/rest/s1/moqui/basic/uoms?pageNoLimit=true&uomTypeEnumId=${uomTypeEnumId}`);
    expect(req.request.method).toBe('GET');
    req.flush(mockResponse);
  });

  it('should fetch geo list', async () => {
    const mockResponse = [{ geoId: 'GEO', description: 'Geography' }];
    const geoTypeEnumId = 'TEST_GEO_TYPE';

    service.getGeoList(geoTypeEnumId).subscribe(response => {
      expect(response).toEqual(mockResponse);
    });

    const req = httpMock.expectOne(`/api/rest/s1/moqui/basic/geos?pageNoLimit=true&geoTypeEnumId=${geoTypeEnumId}`);
    expect(req.request.method).toBe('GET');
    req.flush(mockResponse);
  });

  it('should handle getGeos error', () => {
    const mockError = new ErrorEvent('Network error');

    service.getGeos().subscribe(
      () => fail('expected an error, not geos'),
      error => {
        expect(error.message).toContain('Network error');
        expect(store.dispatch).toHaveBeenCalledWith(GeoActions.loadGeosFailure({ error: 'Network error' }));
      }
    );

    const req = httpMock.expectOne('/api/rest/s1/commerce/getGeos');
    req.error(mockError);
  });

  it('should fetch facilities', async () => {
    const mockResponse = [{ facilityId: 'FACILITY', description: 'Facility' }];

    service.getFacilities().subscribe(response => {
      expect(response).toEqual(mockResponse);
    });

    const req = httpMock.expectOne('/wms/api/facilities');
    expect(req.request.method).toBe('GET');
    req.flush(mockResponse);
  });

  it('should fetch facility locations', async () => {
    const mockResponse = [{ locationId: 'LOCATION', description: 'Location' }];

    service.getFacilityLocations().subscribe(response => {
      expect(response).toEqual(mockResponse);
    });

    const req = httpMock.expectOne('/wms/api/facility-locations');
    expect(req.request.method).toBe('GET');
    req.flush(mockResponse);
  });

  it('should handle getEnumTypes error', async () => {
    const enumTypeId = 'TEST_ENUM_TYPE';
    const mockError = new ErrorEvent('Network error');

    service.getEnumTypes(enumTypeId).subscribe({
      next: () => fail("Expected an error, not data"),
      error: (error) => {
        expect(error).toBeTruthy();
      }
    });

    const req = httpMock.expectOne('/api/rest/s1/commerce/getEnumTypes');
    req.error(mockError);
  });

  it('should fetch role types', async () => {
    const mockResponse = [{ roleTypeId: 'ROLE_TYPE', description: 'Role Type' }];
    const enumTypeId = 'ROLE_ENUM_ID';

    service.getRoleTypes(enumTypeId).subscribe(response => {
      expect(response).toEqual(mockResponse);
    });

    const req = httpMock.expectOne(`/api/rest/s1/commerce/roleTypes?enumTypeId=${enumTypeId}`);
    expect(req.request.method).toBe('GET');
    req.flush(mockResponse);
  });

  it('should fetch lookup results', async () => {
    const mockResponse = { result: 'LOOKUP_RESULT' };
    const params = { param1: 'value1' };
    const lookupFor = 'LOOKUP_TYPE';

    service.getLookupResults(params, lookupFor).subscribe(response => {
      expect(response).toEqual(mockResponse);
    });

    const req = httpMock.expectOne(`/api/rest/s1/lookup/${lookupFor}`);
    expect(req.request.method).toBe('POST');
    req.flush(mockResponse);
  });
});
