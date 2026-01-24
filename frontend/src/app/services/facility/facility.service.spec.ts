import { TestBed } from '@angular/core/testing';
import { FacilityService } from './facility.service';
import { ApiService } from '../common/api.service';
import { of } from 'rxjs';

describe('FacilityService', () => {
  let service: FacilityService;
  let apiServiceSpy: jasmine.SpyObj<ApiService>;

  beforeEach(() => {
    const spy = jasmine.createSpyObj('ApiService', ['get', 'post', 'put']);

    TestBed.configureTestingModule({
      providers: [
        FacilityService,
        { provide: ApiService, useValue: spy },
      ],
    });

    service = TestBed.inject(FacilityService);
    apiServiceSpy = TestBed.inject(ApiService) as jasmine.SpyObj<ApiService>;
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });

  it('should call getFacilities with correct URL', () => {
    const mockResponse = [{ facilityId: 'FAC01' }];
    apiServiceSpy.get.and.returnValue(of(mockResponse));

    service.getFacilities().subscribe(res => {
      expect(res).toEqual(mockResponse);
    });

    expect(apiServiceSpy.get).toHaveBeenCalledWith('/wms/api/facilities');
  });

  it('should call getFacility with correct URL', () => {
    const mockDetail = { facilityId: 'FAC01' };
    apiServiceSpy.get.and.returnValue(of(mockDetail));

    service.getFacility('FAC01').subscribe(res => {
      expect(res).toEqual(mockDetail);
    });

    expect(apiServiceSpy.get).toHaveBeenCalledWith('/wms/api/facilities/FAC01');
  });

  it('should call getFacilityTypes with correct URL', () => {
    const mockTypes = [{ facilityTypeId: 'PLANT' }];
    apiServiceSpy.get.and.returnValue(of(mockTypes));

    service.getFacilityTypes().subscribe(res => {
      expect(res).toEqual(mockTypes);
    });

    expect(apiServiceSpy.get).toHaveBeenCalledWith('/wms/api/facility-types');
  });

  it('should call createFacility with correct URL', () => {
    const payload = { facilityId: 'FAC02', facilityName: 'Test' };
    apiServiceSpy.post.and.returnValue(of(payload));

    service.createFacility(payload).subscribe(res => {
      expect(res).toEqual(payload);
    });

    expect(apiServiceSpy.post).toHaveBeenCalledWith('/wms/api/facilities', payload);
  });

  it('should call createFacilityLocation with correct URL', () => {
    const payload = { facilityId: 'FAC02', locationSeqId: '00001' };
    apiServiceSpy.post.and.returnValue(of(payload));

    service.createFacilityLocation(payload).subscribe(res => {
      expect(res).toEqual(payload);
    });

    expect(apiServiceSpy.post).toHaveBeenCalledWith('/wms/api/facility-locations', payload);
  });

  it('should call updateFacilityLocation with correct URL', () => {
    const payload = { id: 1, facilityId: 'FAC02', locationSeqId: '00001' };
    apiServiceSpy.put.and.returnValue(of(payload));

    service.updateFacilityLocation(1, payload).subscribe(res => {
      expect(res).toEqual(payload);
    });

    expect(apiServiceSpy.put).toHaveBeenCalledWith('/wms/api/facility-locations/1', payload);
  });
});
