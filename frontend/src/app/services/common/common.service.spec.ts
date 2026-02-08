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
    const enumTypeId = 'TEST_ENUM_TYPE';
    const mockResponse = [
      { enumId: 'TEST_ENUM', enumTypeId: 'TEST_ENUM_TYPE', description: 'Test Enum' },
      { enumId: 'OTHER', enumTypeId: 'OTHER_TYPE', description: 'Other' },
    ];

    service.getEnumTypes(enumTypeId).subscribe(response => {
      expect(response).toEqual([mockResponse[0]]);
    });

    const req = httpMock.expectOne('/oms/api/common/enumerations');
    expect(req.request.method).toBe('GET');
    req.flush(mockResponse);
  });

  it('should fetch status items', async () => {
    const statusTypeId = 'TEST_STATUS_TYPE';
    const mockResponse = [
      { statusId: 'TEST_STATUS', statusTypeId: 'TEST_STATUS_TYPE', description: 'Test Status' },
      { statusId: 'OTHER', statusTypeId: 'OTHER_TYPE', description: 'Other' },
    ];

    service.getStatusItems(statusTypeId).subscribe(response => {
      expect(response).toEqual([mockResponse[0]]);
    });

    const req = httpMock.expectOne('/oms/api/common/status-items');
    expect(req.request.method).toBe('GET');
    req.flush(mockResponse);
  });

  it('should fetch parent enum types', async () => {
    const parentEnumId = 'PARENT_ENUM_ID';
    const mockResponse = [
      { enumTypeId: 'PARENT_ENUM', parentTypeId: 'PARENT_ENUM_ID', description: 'Parent Enum' },
      { enumTypeId: 'OTHER', parentTypeId: 'OTHER', description: 'Other' },
    ];

    service.getParentEnumTypes(parentEnumId).subscribe(response => {
      expect(response).toEqual([mockResponse[0]]);
    });

    const req = httpMock.expectOne('/oms/api/common/enumeration-types');
    expect(req.request.method).toBe('GET');
    req.flush(mockResponse);
  });

  it('should fetch UOMs', async () => {
    const uomTypeEnumId = 'UOM_TYPE_ENUM_ID';
    const mockResponse = [
      { uomId: 'UOM', uomTypeId: 'UOM_TYPE_ENUM_ID', description: 'Unit of Measure' },
      { uomId: 'OTHER', uomTypeId: 'OTHER', description: 'Other' },
    ];

    service.getUoms(uomTypeEnumId).subscribe(response => {
      expect(response).toEqual([mockResponse[0]]);
    });

    const req = httpMock.expectOne('/oms/api/common/uoms');
    expect(req.request.method).toBe('GET');
    req.flush(mockResponse);
  });

  it('should fetch geo list', async () => {
    const geoTypeEnumId = 'TEST_GEO_TYPE';
    const mockResponse = [
      { geoId: 'GEO', geoTypeId: 'TEST_GEO_TYPE', description: 'Geography' },
      { geoId: 'OTHER', geoTypeId: 'OTHER', description: 'Other' },
    ];
    const mockAssocs = [];

    service.getGeoList(geoTypeEnumId).subscribe(response => {
      expect(response).toEqual([mockResponse[0]]);
    });

    const geoReq = httpMock.expectOne('/oms/api/common/geos');
    const assocReq = httpMock.expectOne('/oms/api/common/geo-assocs');
    expect(geoReq.request.method).toBe('GET');
    expect(assocReq.request.method).toBe('GET');
    geoReq.flush(mockResponse);
    assocReq.flush(mockAssocs);
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

    const geoReq = httpMock.expectOne('/oms/api/common/geos');
    const assocReq = httpMock.expectOne('/oms/api/common/geo-assocs');
    geoReq.error(mockError);
    assocReq.flush([]);
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

    const req = httpMock.expectOne('/oms/api/common/enumerations');
    req.error(mockError);
  });

  it('should fetch role types', async () => {
    const enumTypeId = 'ROLE_ENUM_ID';
    const mockResponse = [
      { roleTypeId: 'ROLE_TYPE', parentTypeId: 'ROLE_ENUM_ID', description: 'Role Type' },
      { roleTypeId: 'OTHER', parentTypeId: 'OTHER', description: 'Other' },
    ];

    service.getRoleTypes(enumTypeId).subscribe(response => {
      expect(response).toEqual([mockResponse[0]]);
    });

    const req = httpMock.expectOne('/oms/api/role-types');
    expect(req.request.method).toBe('GET');
    req.flush(mockResponse);
  });

  it('should fetch lookup results', async () => {
    const mockResponse = [
      { geoId: 'USA', geoTypeId: 'COUNTRY' },
      { geoId: 'CA', geoTypeId: 'STATE' },
    ];
    const params = { field: 'geo_type_id', value: 'COUNTRY' };
    const lookupFor = 'geo';
    const mockAssocs = [{ geoId: 'USA', geoIdTo: 'CA', geoAssocTypeId: 'REGIONS' }];

    service.getLookupResults(params, lookupFor).subscribe(response => {
      expect(response).toEqual([mockResponse[0]]);
    });

    const geoReq = httpMock.expectOne('/oms/api/common/geos');
    const assocReq = httpMock.expectOne('/oms/api/common/geo-assocs');
    expect(geoReq.request.method).toBe('GET');
    expect(assocReq.request.method).toBe('GET');
    geoReq.flush(mockResponse);
    assocReq.flush(mockAssocs);
  });
});
