import { TestBed } from '@angular/core/testing';
import { ManufacturingService } from './manufacturing.service';
import { ApiService } from '../common/api.service';
import { of } from 'rxjs';

describe('ManufacturingService', () => {
  let service: ManufacturingService;
  let apiServiceSpy: jasmine.SpyObj<ApiService>;

  beforeEach(() => {
    const spy = jasmine.createSpyObj('ApiService', ['get', 'post']);

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
    const mockResponse = { responseMap: { resultList: [{ workEffortId: 'WE1001' }], total: 1 } };

    apiServiceSpy.get.and.returnValue(of(mockResponse));

    service.getJobs(0, 10, 'cutting').subscribe((res) => {
      expect(res).toEqual(mockResponse);
    });

    const expectedUrl = `/mfg/api/jobs?page=0&size=10&queryString=cutting`;
    expect(apiServiceSpy.get).toHaveBeenCalledWith(expectedUrl);
  });

  it('should call getJob with correct ID', () => {
    const mockJob = { workEffortId: 'WE123', description: 'Job Details' };
    apiServiceSpy.get.and.returnValue(of(mockJob));

    service.getJob('WE123').subscribe((res) => {
      expect(res).toEqual(mockJob);
    });

    expect(apiServiceSpy.get).toHaveBeenCalledWith('/mfg/api/jobs/WE123');
  });

  it('should call createJob with correct payload', () => {
    const params = { jobName: 'Welding' };
    const mockResponse = { workEffortId: 'WE2001' };

    apiServiceSpy.post.and.returnValue(of(mockResponse));

    service.createJob(params).subscribe((res) => {
      expect(res).toEqual(mockResponse);
    });

    expect(apiServiceSpy.post).toHaveBeenCalledWith('/mfg/api/jobs', params);
  });

  it('should call getJobBom with correct product', () => {
    const mockBom = [{ productId: 'P1', estimatedQuantity: '1' }];
    apiServiceSpy.get.and.returnValue(of(mockBom));

    service.getJobBom('P1').subscribe((res) => {
      expect(res).toEqual(mockBom);
    });

    expect(apiServiceSpy.get).toHaveBeenCalledWith('/mfg/api/jobs/bom?productId=P1');
  });
});
