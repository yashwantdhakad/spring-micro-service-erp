import { ComponentFixture, TestBed } from '@angular/core/testing';
import { ReactiveFormsModule } from '@angular/forms';
import { RouterTestingModule } from '@angular/router/testing';
import { of } from 'rxjs';
import { FacilityService } from 'src/app/services/facility/facility.service';

import { FacilityCreateComponent } from './facility-create.component';

describe('FacilityCreateComponent', () => {
  let component: FacilityCreateComponent;
  let fixture: ComponentFixture<FacilityCreateComponent>;
  let facilityService: jasmine.SpyObj<FacilityService>;

  beforeEach(async () => {
    const serviceSpy = jasmine.createSpyObj('FacilityService', ['createFacility', 'getFacilityTypes']);

    await TestBed.configureTestingModule({
      declarations: [FacilityCreateComponent],
      imports: [ReactiveFormsModule, RouterTestingModule],
      providers: [{ provide: FacilityService, useValue: serviceSpy }],
    }).compileComponents();

    facilityService = TestBed.inject(FacilityService) as jasmine.SpyObj<FacilityService>;
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FacilityCreateComponent);
    component = fixture.componentInstance;
    facilityService.getFacilityTypes.and.returnValue(of([]));
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('should call service on submit', () => {
    facilityService.createFacility.and.returnValue(of({}));
    component.form.setValue({
      facilityId: 'F1',
      facilityName: 'Name',
      facilityTypeId: '',
      ownerPartyId: '',
    });
    component.submit();
    expect(facilityService.createFacility).toHaveBeenCalled();
  });
});
