import { TestBed } from '@angular/core/testing';
import { ManufacturingService } from './manufacturing.service';
import { ApiService } from '../common/api.service';
import { of } from 'rxjs';
import { HttpResponse, HttpHeaders } from '@angular/common/http';

describe('ManufacturingService', () => {
  let service: ManufacturingService;
  let apiServiceSpy: jasmine.SpyObj<ApiService>;

  beforeEach(() => {
    const spy = jasmine.createSpyObj('ApiService', ['customGet', 'get', 'post']);

    TestBed.configureTestingModule({
      providers: [
        ManufacturingService,
        { provide: ApiService, useValue: spy }
      ]
    });

    service = TestBed.inject(ManufacturingService);
    apiServiceSpy = TestBed.inject(ApiService) as jasmine.SpyObj<ApiService>;
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });

  it('should call getJobs with correct URL', () => {
    const mockResponse = new HttpResponse({
      body: [{ workEffortId: 'WE1001' }],
      headers: new HttpHeaders({ 'x-total-count': '1' }),
    });

    apiServiceSpy.customGet.and.returnValue(of(mockResponse));

    service.getJobs(0, 'cutting').subscribe((res) => {
      expect(res).toEqual(mockResponse);
    });

    const expectedUrl = `/api/rest/s1/mantle/workEfforts?pageIndex=0&purposeEnumId=WepProductionRun&jobName=cutting`;
    expect(apiServiceSpy.customGet).toHaveBeenCalledWith(expectedUrl);
  });

  it('should call getJob with correct ID', () => {
    const mockJob = { workEffortId: 'WE123', description: 'Job Details' };
    apiServiceSpy.get.and.returnValue(of(mockJob));

    service.getJob('WE123').subscribe((res) => {
      expect(res).toEqual(mockJob);
    });

    expect(apiServiceSpy.get).toHaveBeenCalledWith('/api/rest/s1/mantle/workEfforts/WE123/run/displayInfo');
  });

  it('should call createJob with correct payload', () => {
    const params = { jobName: 'Welding' };
    const mockResponse = { workEffortId: 'WE2001' };

    apiServiceSpy.post.and.returnValue(of(mockResponse));

    service.createJob(params).subscribe((res) => {
      expect(res).toEqual(mockResponse);
    });

    expect(apiServiceSpy.post).toHaveBeenCalledWith('/api/rest/s1/mantle/workEfforts/runs', params);
  });

  it('should call getFacilities and return list', () => {
    const mockFacilities = [{ facilityId: 'FAC01' }];
    apiServiceSpy.get.and.returnValue(of(mockFacilities));

    service.getFacilities().subscribe((res) => {
      expect(res).toEqual(mockFacilities);
    });

    expect(apiServiceSpy.get).toHaveBeenCalledWith('/api/rest/s1/commerce/Facilities');
  });

  it('should call getFacilityLocations and return list', () => {
    const mockLocations = [{ locationSeqId: 'LOC01' }];
    apiServiceSpy.get.and.returnValue(of(mockLocations));

    service.getFacilityLocations().subscribe((res) => {
      expect(res).toEqual(mockLocations);
    });

    expect(apiServiceSpy.get).toHaveBeenCalledWith('/api/rest/s1/commerce/FacilityLocations');
  });
});
