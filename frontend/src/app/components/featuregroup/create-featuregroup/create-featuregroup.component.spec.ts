import { ComponentFixture, TestBed, fakeAsync, tick } from '@angular/core/testing';
import { CreateFeaturegroupComponent } from './create-featuregroup.component';
import { ReactiveFormsModule, FormsModule } from '@angular/forms';
import { Router } from '@angular/router';
import { of, throwError } from 'rxjs';
import { FeatureGroupService } from 'src/app/services/featuregroup/feature-group.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';

describe('CreateFeaturegroupComponent', () => {
  let component: CreateFeaturegroupComponent;
  let fixture: ComponentFixture<CreateFeaturegroupComponent>;
  let featureGroupServiceSpy: jasmine.SpyObj<FeatureGroupService>;
  let routerSpy: jasmine.SpyObj<Router>;
  let snackbarServiceSpy: jasmine.SpyObj<SnackbarService>;

  beforeEach(async () => {
    featureGroupServiceSpy = jasmine.createSpyObj('FeatureGroupService', ['createFeatureGroup']);
    routerSpy = jasmine.createSpyObj('Router', ['navigate']);
    snackbarServiceSpy = jasmine.createSpyObj('SnackbarService', ['showSuccess', 'showError']);

    await TestBed.configureTestingModule({
      imports: [ReactiveFormsModule, FormsModule],
      declarations: [CreateFeaturegroupComponent],
      providers: [
        { provide: FeatureGroupService, useValue: featureGroupServiceSpy },
        { provide: Router, useValue: routerSpy },
        { provide: SnackbarService, useValue: snackbarServiceSpy },
      ]
    }).compileComponents();

    fixture = TestBed.createComponent(CreateFeaturegroupComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create component', () => {
    expect(component).toBeTruthy();
  });

  it('should mark form as touched if invalid', () => {
    component.createFeatureGroupForm.controls['description'].setValue('');
    component.createFeatureGroup();

    expect(component.createFeatureGroupForm.touched).toBeTrue();
    expect(component.createFeatureGroupForm.invalid).toBeTrue();
  });

  it('should call createFeatureGroup and navigate on success', fakeAsync(() => {
    const mockResponse = { productFeatureGroupId: 'FG001' };
    featureGroupServiceSpy.createFeatureGroup.and.returnValue(of(mockResponse));

    component.createFeatureGroupForm.controls['description'].setValue('Test Group');
    component.createFeatureGroup();
    tick();

    expect(featureGroupServiceSpy.createFeatureGroup).toHaveBeenCalledWith({
      description: 'Test Group',
    });
    expect(snackbarServiceSpy.showSuccess).toHaveBeenCalledWith('Feature group created successfully.');
    expect(routerSpy.navigate).toHaveBeenCalledWith(['/featuregroups/FG001']);
  }));

  it('should show error message if response does not contain ID', fakeAsync(() => {
    featureGroupServiceSpy.createFeatureGroup.and.returnValue(of({}));

    component.createFeatureGroupForm.controls['description'].setValue('No ID Group');
    component.createFeatureGroup();
    tick();

    expect(snackbarServiceSpy.showError).toHaveBeenCalledWith('Failed to create feature group.');
    expect(routerSpy.navigate).not.toHaveBeenCalled();
  }));

  it('should show error message on service failure', fakeAsync(() => {
    featureGroupServiceSpy.createFeatureGroup.and.returnValue(
      throwError(() => new Error('Server error'))
    );

    component.createFeatureGroupForm.controls['description'].setValue('Error Group');
    component.createFeatureGroup();
    tick();

    expect(snackbarServiceSpy.showError).toHaveBeenCalledWith('Error creating feature group.');
  }));
});
