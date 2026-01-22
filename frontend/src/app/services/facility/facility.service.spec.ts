import { TestBed } from '@angular/core/testing';
import { FacilityService } from './facility.service';
import { ApiService } from '../common/api.service';
import { of } from 'rxjs';

describe('FacilityService', () => {
  let service: FacilityService;
  let apiServiceSpy: jasmine.SpyObj<ApiService>;

  beforeEach(() => {
    const spy = jasmine.createSpyObj('ApiService', ['get']);

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

    expect(apiServiceSpy.get).toHaveBeenCalledWith('/api/facilities');
  });

  it('should call getFacility with correct URL', () => {
    const mockDetail = { facilityId: 'FAC01' };
    apiServiceSpy.get.and.returnValue(of(mockDetail));

    service.getFacility('FAC01').subscribe(res => {
      expect(res).toEqual(mockDetail);
    });

    expect(apiServiceSpy.get).toHaveBeenCalledWith('/api/facilities/FAC01');
  });

  it('should call getFacilityTypes with correct URL', () => {
    const mockTypes = [{ facility_type_id: 'PLANT' }];
    apiServiceSpy.get.and.returnValue(of(mockTypes));

    service.getFacilityTypes().subscribe(res => {
      expect(res).toEqual(mockTypes);
    });

    expect(apiServiceSpy.get).toHaveBeenCalledWith('/api/facilities/types');
  });
});
