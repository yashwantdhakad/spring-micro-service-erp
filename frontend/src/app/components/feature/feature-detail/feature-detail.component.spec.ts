import { ComponentFixture, TestBed, fakeAsync, tick } from '@angular/core/testing';
import { FeatureDetailComponent } from './feature-detail.component';
import { ActivatedRoute } from '@angular/router';
import { of, throwError } from 'rxjs';
import { MatDialog } from '@angular/material/dialog';
import { FeatureService } from 'src/app/services/features/feature.service';

describe('FeatureDetailComponent', () => {
  let component: FeatureDetailComponent;
  let fixture: ComponentFixture<FeatureDetailComponent>;
  let featureServiceSpy: jasmine.SpyObj<FeatureService>;
  let matDialogSpy: jasmine.SpyObj<MatDialog>;

  const mockRoute = {
    params: of({ productFeatureId: 'F123' }),
  };

  const featureData = {
    productFeatureId: 'F123',
    abbrev: 'FEAT',
    description: 'Test Feature',
    products: [{ productId: 'P1', applTypeEnumId: 'TYPE1' }],
    groups: [{ productFeatureGroupId: 'G1', group: 'Group A' }],
  };

  beforeEach(async () => {
    featureServiceSpy = jasmine.createSpyObj('FeatureService', ['getFeature']);
    matDialogSpy = jasmine.createSpyObj('MatDialog', ['open']);

    await TestBed.configureTestingModule({
      declarations: [FeatureDetailComponent],
      providers: [
        { provide: ActivatedRoute, useValue: mockRoute },
        { provide: FeatureService, useValue: featureServiceSpy },
        { provide: MatDialog, useValue: matDialogSpy },
      ],
    }).compileComponents();

    fixture = TestBed.createComponent(FeatureDetailComponent);
    component = fixture.componentInstance;
  });

  it('should create the component', () => {
    expect(component).toBeTruthy();
  });

  it('should fetch feature data on init', fakeAsync(() => {
    featureServiceSpy.getFeature.and.returnValue(of(featureData));
    fixture.detectChanges(); // triggers ngOnInit
    tick();

    expect(featureServiceSpy.getFeature).toHaveBeenCalledWith('F123');
    expect(component.featureDetail).toEqual(featureData);
    expect(component.products.length).toBe(1);
    expect(component.groups.length).toBe(1);
  }));

  it('should handle error on fetchFeature', fakeAsync(() => {
    featureServiceSpy.getFeature.and.returnValue(throwError(() => new Error('Fetch failed')));
    fixture.detectChanges(); // triggers ngOnInit
    tick();

    expect(featureServiceSpy.getFeature).toHaveBeenCalled();
    expect(component.featureDetail).toBeUndefined();
  }));

  it('should open edit dialog and refetch on close', () => {
    const dialogRefSpyObj = jasmine.createSpyObj({ afterClosed: of({ productFeatureId: 'F123' }) });
    matDialogSpy.open.and.returnValue(dialogRefSpyObj);
    featureServiceSpy.getFeature.and.returnValue(of(featureData));

    component.featureDetail = featureData;
    component.editFeatureDialog();

    expect(matDialogSpy.open).toHaveBeenCalled();
    expect(featureServiceSpy.getFeature).toHaveBeenCalledWith('F123');
  });

  it('should open addFeatureToProductDialog and refetch on close', () => {
    const dialogRefSpyObj = jasmine.createSpyObj({ afterClosed: of({ productFeatureId: 'F123' }) });
    matDialogSpy.open.and.returnValue(dialogRefSpyObj);
    featureServiceSpy.getFeature.and.returnValue(of(featureData));

    component.productFeatureId = 'F123';
    component.addFeatureToProductDialog();

    expect(matDialogSpy.open).toHaveBeenCalled();
    expect(featureServiceSpy.getFeature).toHaveBeenCalledWith('F123');
  });

  it('should open addFeatureToGroupDialog and refetch on close', () => {
    const dialogRefSpyObj = jasmine.createSpyObj({ afterClosed: of({ productFeatureId: 'F123' }) });
    matDialogSpy.open.and.returnValue(dialogRefSpyObj);
    featureServiceSpy.getFeature.and.returnValue(of(featureData));

    component.productFeatureId = 'F123';
    component.addFeatureToGroupDialog();

    expect(matDialogSpy.open).toHaveBeenCalled();
    expect(featureServiceSpy.getFeature).toHaveBeenCalledWith('F123');
  });

  it('should return current datetime as string', () => {
    const result = component.getCurrentDateTime();
    expect(typeof result).toBe('string');
  });
});
