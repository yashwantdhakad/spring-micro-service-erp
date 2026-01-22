import { ComponentFixture, TestBed, fakeAsync, tick } from '@angular/core/testing';
import { CreateFeatureComponent } from './create-feature.component';
import { ReactiveFormsModule, FormsModule } from '@angular/forms';
import { FeatureService } from 'src/app/services/features/feature.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';
import { Router } from '@angular/router';
import { provideMockStore, MockStore } from '@ngrx/store/testing';
import { of, throwError } from 'rxjs';
import { CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';

describe('CreateFeatureComponent', () => {
  let component: CreateFeatureComponent;
  let fixture: ComponentFixture<CreateFeatureComponent>;
  let featureServiceSpy: jasmine.SpyObj<FeatureService>;
  let snackbarServiceSpy: jasmine.SpyObj<SnackbarService>;
  let routerSpy: jasmine.SpyObj<Router>;
  let store: MockStore;

  const initialState = {
    enums: {
      enumList: {
        ProductFeatureType: [
          { enumId: 'PFT_SAMPLE', description: 'Sample' }
        ]
      }
    }
  };

  beforeEach(async () => {
    const featureSpy = jasmine.createSpyObj('FeatureService', ['createFeature']);
    const snackbarSpy = jasmine.createSpyObj('SnackbarService', ['showSuccess', 'showError']);
    const routerNavigateSpy = jasmine.createSpyObj('Router', ['navigate']);

    await TestBed.configureTestingModule({
      declarations: [CreateFeatureComponent],
      imports: [ReactiveFormsModule, FormsModule],
      providers: [
        { provide: FeatureService, useValue: featureSpy },
        { provide: SnackbarService, useValue: snackbarSpy },
        { provide: Router, useValue: routerNavigateSpy },
        provideMockStore({ initialState })
      ],
      schemas: [CUSTOM_ELEMENTS_SCHEMA],
    }).compileComponents();

    fixture = TestBed.createComponent(CreateFeatureComponent);
    component = fixture.componentInstance;
    store = TestBed.inject(MockStore);
    featureServiceSpy = TestBed.inject(FeatureService) as jasmine.SpyObj<FeatureService>;
    snackbarServiceSpy = TestBed.inject(SnackbarService) as jasmine.SpyObj<SnackbarService>;
    routerSpy = TestBed.inject(Router) as jasmine.SpyObj<Router>;

    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('should mark form as touched if form is invalid on submit', () => {
    component.createFeatureForm.markAsTouched();
    component.createFeature();
    expect(component.createFeatureForm.touched).toBeTrue();
  });

  it('should call createFeature and navigate on success', fakeAsync(() => {
    const mockResponse = { productFeatureId: 'TEST123' };
    component.createFeatureForm.setValue({
      productFeatureTypeEnumId: 'PFT_SAMPLE',
      abbrev: 'SMP',
      description: 'Sample Feature',
    });

    featureServiceSpy.createFeature.and.returnValue(of(mockResponse));

    component.createFeature();
    tick();

    expect(featureServiceSpy.createFeature).toHaveBeenCalled();
    expect(snackbarServiceSpy.showSuccess).toHaveBeenCalledWith('Feature created successfully.');
    expect(routerSpy.navigate).toHaveBeenCalledWith(['/features/TEST123']);
  }));

  it('should show error toast when creation response is missing productFeatureId', fakeAsync(() => {
    component.createFeatureForm.setValue({
      productFeatureTypeEnumId: 'PFT_SAMPLE',
      abbrev: 'SMP',
      description: 'Sample Feature',
    });

    featureServiceSpy.createFeature.and.returnValue(of({}));

    component.createFeature();
    tick();

    expect(snackbarServiceSpy.showError).toHaveBeenCalledWith('Failed to create feature.');
  }));

  it('should show error toast on createFeature API error', fakeAsync(() => {
    component.createFeatureForm.setValue({
      productFeatureTypeEnumId: 'PFT_SAMPLE',
      abbrev: 'SMP',
      description: 'Sample Feature',
    });

    featureServiceSpy.createFeature.and.returnValue(throwError(() => new Error('API Error')));

    component.createFeature();
    tick();

    expect(snackbarServiceSpy.showError).toHaveBeenCalledWith('Error in creating feature.');
  }));
});
