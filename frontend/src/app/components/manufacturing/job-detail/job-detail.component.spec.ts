import { ComponentFixture, TestBed } from '@angular/core/testing';
import { JobDetailComponent } from './job-detail.component';
import { ActivatedRoute } from '@angular/router';
import { of, throwError } from 'rxjs';
import { ManufacturingService } from 'src/app/services/manufacturing/manufacturing.service';
import { MatDialog } from '@angular/material/dialog';

describe('JobDetailComponent', () => {
  let component: JobDetailComponent;
  let fixture: ComponentFixture<JobDetailComponent>;
  let manufacturingServiceSpy: jasmine.SpyObj<ManufacturingService>;
  let activatedRouteStub: any;

  beforeEach(async () => {
    manufacturingServiceSpy = jasmine.createSpyObj('ManufacturingService', ['getJob']);
    activatedRouteStub = {
      params: of({ workEffortId: 'JOB123' })
    };

    await TestBed.configureTestingModule({
      declarations: [JobDetailComponent],
      providers: [
        { provide: ManufacturingService, useValue: manufacturingServiceSpy },
        { provide: ActivatedRoute, useValue: activatedRouteStub },
        { provide: MatDialog, useValue: {} },
      ]
    }).compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(JobDetailComponent);
    component = fixture.componentInstance;
  });

  it('should create the component', () => {
    expect(component).toBeTruthy();
  });

  it('should call fetchJobDetail on init with route param', () => {
    const mockJob = {
      workEffort: { workEffortId: 'JOB123', workEffortName: 'Job 1' },
      consumeList: [{ productId: 'P1' }],
      produceList: [{ productId: 'P2' }],
    };
    manufacturingServiceSpy.getJob.and.returnValue(of(mockJob));

    fixture.detectChanges(); // triggers ngOnInit

    expect(component.workEffortId).toBe('JOB123');
    expect(manufacturingServiceSpy.getJob).toHaveBeenCalledWith('JOB123');
    expect(component.jobDetail.workEffortId).toBe('JOB123');
    expect(component.productsToConsume.length).toBe(1);
    expect(component.productsToProduce.length).toBe(1);
  });

  it('should handle error when fetchJobDetail fails', () => {
    manufacturingServiceSpy.getJob.and.returnValue(throwError(() => new Error('fetch failed')));

    fixture.detectChanges(); // triggers ngOnInit

    expect(manufacturingServiceSpy.getJob).toHaveBeenCalledWith('JOB123');
    expect(component.jobDetail).toEqual({});
  });

  it('getCurrentDateTime should return formatted string', () => {
    const result = component.getCurrentDateTime();
    expect(typeof result).toBe('string');
    expect(result.length).toBeGreaterThan(0);
  });
});
