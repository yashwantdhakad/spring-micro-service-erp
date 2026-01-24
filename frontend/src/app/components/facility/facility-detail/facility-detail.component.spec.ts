import { ComponentFixture, TestBed, fakeAsync, tick } from '@angular/core/testing';
import { NO_ERRORS_SCHEMA } from '@angular/core';
import { FacilityDetailComponent } from './facility-detail.component';
import { FacilityService } from 'src/app/services/facility/facility.service';
import { ActivatedRoute } from '@angular/router';
import { of, throwError, Subject } from 'rxjs';
import { MatDialog } from '@angular/material/dialog';

describe('FacilityDetailComponent', () => {
  let component: FacilityDetailComponent;
  let fixture: ComponentFixture<FacilityDetailComponent>;
  let facilityService: jasmine.SpyObj<FacilityService>;
  let routeSubject: Subject<any>;

  beforeEach(async () => {
    const facilitySpy = jasmine.createSpyObj('FacilityService', ['getFacility', 'createFacilityLocation', 'updateFacilityLocation']);
    const matDialogSpy = jasmine.createSpyObj('MatDialog', ['open']);
    routeSubject = new Subject();

    await TestBed.configureTestingModule({
      declarations: [FacilityDetailComponent],
      providers: [
        { provide: FacilityService, useValue: facilitySpy },
        { provide: ActivatedRoute, useValue: { params: routeSubject.asObservable() } },
        { provide: MatDialog, useValue: matDialogSpy }
      ],
      schemas: [NO_ERRORS_SCHEMA]
    }).compileComponents();

    facilityService = TestBed.inject(FacilityService) as jasmine.SpyObj<FacilityService>;
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FacilityDetailComponent);
    component = fixture.componentInstance;
  });

  it('should create component', () => {
    expect(component).toBeTruthy();
  });

  it('should load facility on init', fakeAsync(() => {
    facilityService.getFacility.and.returnValue(of({ facility: { facilityId: 'F1' }, locations: [] }));
    fixture.detectChanges();
    routeSubject.next({ facilityId: 'F1' });
    tick();
    expect(facilityService.getFacility).toHaveBeenCalledWith('F1');
  }));

  it('should handle error when fetching facility fails', () => {
    facilityService.getFacility.and.returnValue(throwError(() => new Error('Error')));
    component.getFacility('F1');
    expect(component.locations.length).toBe(0);
  });
});
