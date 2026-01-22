import { ComponentFixture, TestBed, fakeAsync, tick } from '@angular/core/testing';
import { FeaturesComponent } from './features.component';
import { FeatureService } from 'src/app/services/features/feature.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';
import { of, throwError } from 'rxjs';
import { HttpHeaders, HttpResponse } from '@angular/common/http';

describe('FeaturesComponent', () => {
  let component: FeaturesComponent;
  let fixture: ComponentFixture<FeaturesComponent>;
  let featureServiceSpy: jasmine.SpyObj<FeatureService>;
  let snackbarServiceSpy: jasmine.SpyObj<SnackbarService>;

  beforeEach(async () => {
    featureServiceSpy = jasmine.createSpyObj('FeatureService', ['getFeatures']);
    snackbarServiceSpy = jasmine.createSpyObj('SnackbarService', ['showError']);

    await TestBed.configureTestingModule({
      declarations: [FeaturesComponent],
      providers: [
        { provide: FeatureService, useValue: featureServiceSpy },
        { provide: SnackbarService, useValue: snackbarServiceSpy }
      ]
    }).compileComponents();

    fixture = TestBed.createComponent(FeaturesComponent);
    component = fixture.componentInstance;
  });

  it('should create the component', () => {
    expect(component).toBeTruthy();
  });

  it('should fetch features on init', fakeAsync(() => {
    const mockData = [{ productFeatureId: 'F1', description: 'Test', abbrev: 'T1', productFeatureTypeEnumId: 'TYPE1' }];
    const headers = new HttpHeaders({ 'x-total-count': '1' });
    const mockResponse = new HttpResponse({ body: mockData, headers });

    featureServiceSpy.getFeatures.and.returnValue(of(mockResponse));

    fixture.detectChanges(); // triggers ngOnInit
    tick();

    expect(featureServiceSpy.getFeatures).toHaveBeenCalledWith(0, '');
    expect(component.items).toEqual(mockData);
    expect(component.pages).toBe(1);
  }));

  it('should show error message on fetch failure', fakeAsync(() => {
    featureServiceSpy.getFeatures.and.returnValue(throwError(() => new Error('Failed')));
    fixture.detectChanges();
    tick();

    expect(snackbarServiceSpy.showError).toHaveBeenCalledWith('Error fetching features');
    expect(component.items.length).toBe(0);
    expect(component.pages).toBe(0);
  }));

  it('getValue should return nested value', () => {
    const item = { details: { name: 'Feature Name' } };
    const result = component.getValue(item, 'details.name');
    expect(result).toBe('Feature Name');
  });

  it('getValue should return undefined if path is invalid', () => {
    const item = {};
    const result = component.getValue(item, 'details.name');
    expect(result).toBeUndefined();
  });

  it('getColumnKeys should return displayed column keys', () => {
    const keys = component.getColumnKeys();
    expect(keys).toEqual(['productFeatureId', 'description', 'abbrev', 'productFeatureTypeEnumId']);
  });
});
