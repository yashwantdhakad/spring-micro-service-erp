import { ComponentFixture, TestBed } from '@angular/core/testing';
import { JobsComponent } from './jobs.component';
import { ManufacturingService } from 'src/app/services/manufacturing/manufacturing.service';
import { of, throwError } from 'rxjs';
import { HttpResponse, HttpHeaders } from '@angular/common/http';

describe('JobsComponent', () => {
  let component: JobsComponent;
  let fixture: ComponentFixture<JobsComponent>;
  let manufacturingServiceSpy: jasmine.SpyObj<ManufacturingService>;

  beforeEach(async () => {
    manufacturingServiceSpy = jasmine.createSpyObj('ManufacturingService', ['getJobs']);

    await TestBed.configureTestingModule({
      declarations: [JobsComponent],
      providers: [
        { provide: ManufacturingService, useValue: manufacturingServiceSpy },
      ],
    }).compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(JobsComponent);
    component = fixture.componentInstance;
  });

  it('should create component', () => {
    expect(component).toBeTruthy();
  });

  it('should initialize column keys and fetch jobs on init', () => {
    const mockJobs = [{ workEffortId: 'JOB1' }];
    const headers = new HttpHeaders({ 'x-total-count': '1' });
    const mockResponse = new HttpResponse({ body: mockJobs, headers });

    manufacturingServiceSpy.getJobs.and.returnValue(of(mockResponse));

    fixture.detectChanges(); // triggers ngOnInit

    expect(component.displayedColumnKeys).toEqual([
      'workEffortId',
      'workEffortName',
      'facilityId',
      'statusId',
      'estimatedStartDate',
    ]);
    expect(manufacturingServiceSpy.getJobs).toHaveBeenCalledWith(0, '');
    expect(component.items.length).toBe(1);
    expect(component.pages).toBe(1);
    expect(component.isLoading).toBeFalse();
  });

  it('should handle error when getJobs fails', () => {
    const errorSpy = spyOn(console, 'error');
    manufacturingServiceSpy.getJobs.and.returnValue(throwError(() => new Error('fetch failed')));

    fixture.detectChanges(); // triggers ngOnInit

    expect(manufacturingServiceSpy.getJobs).toHaveBeenCalledWith(0, '');
    expect(component.items.length).toBe(0);
    expect(errorSpy).toHaveBeenCalledWith('Error fetching jobs:', jasmine.any(Error));
    expect(component.isLoading).toBeFalse();
  });
});
