import { ComponentFixture, TestBed, fakeAsync, tick } from '@angular/core/testing';
import { of, throwError } from 'rxjs';
import { FacilityComponent } from './facility.component';
import { FacilityService } from 'src/app/services/facility/facility.service';

describe('FacilityComponent', () => {
  let component: FacilityComponent;
  let fixture: ComponentFixture<FacilityComponent>;
  let facilityService: jasmine.SpyObj<FacilityService>;

  beforeEach(async () => {
    const facilitySpy = jasmine.createSpyObj('FacilityService', ['getFacilities']);

    await TestBed.configureTestingModule({
      declarations: [FacilityComponent],
      providers: [
        { provide: FacilityService, useValue: facilitySpy }
      ]
    }).compileComponents();

    facilityService = TestBed.inject(FacilityService) as jasmine.SpyObj<FacilityService>;
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FacilityComponent);
    component = fixture.componentInstance;
  });

  it('should create the component', () => {
    facilityService.getFacilities.and.returnValue(of([]));
    fixture.detectChanges();
    expect(component).toBeTruthy();
  });

  it('should load facilities on init', fakeAsync(() => {
    const mockFacilities = [{ facilityId: 'F1' }];
    facilityService.getFacilities.and.returnValue(of(mockFacilities));
    fixture.detectChanges();
    tick();
    expect(facilityService.getFacilities).toHaveBeenCalled();
    expect(component.items).toEqual(mockFacilities);
    expect(component.isLoading).toBeFalse();
  }));

  it('should handle loadFacilities error', fakeAsync(() => {
    facilityService.getFacilities.and.returnValue(throwError(() => new Error('Err')));
    fixture.detectChanges();
    tick();
    expect(component.items).toEqual([]);
    expect(component.isLoading).toBeFalse();
  }));
});
