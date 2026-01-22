import { ComponentFixture, TestBed, fakeAsync, tick } from '@angular/core/testing';
import { FeaturegroupDetailComponent } from './featuregroup-detail.component';
import { of, throwError } from 'rxjs';
import { ActivatedRoute } from '@angular/router';
import { MatDialog } from '@angular/material/dialog';
import { FeatureGroupService } from 'src/app/services/featuregroup/feature-group.service';

describe('FeaturegroupDetailComponent', () => {
  let component: FeaturegroupDetailComponent;
  let fixture: ComponentFixture<FeaturegroupDetailComponent>;
  let featureGroupServiceSpy: jasmine.SpyObj<FeatureGroupService>;
  let matDialogSpy: jasmine.SpyObj<MatDialog>;

  beforeEach(async () => {
    const activatedRouteStub = {
      params: of({ productFeatureGroupId: 'FG123' })
    };

    featureGroupServiceSpy = jasmine.createSpyObj('FeatureGroupService', ['getFeatureGroup']);
    matDialogSpy = jasmine.createSpyObj('MatDialog', ['open']);

    await TestBed.configureTestingModule({
      declarations: [FeaturegroupDetailComponent],
      providers: [
        { provide: ActivatedRoute, useValue: activatedRouteStub },
        { provide: FeatureGroupService, useValue: featureGroupServiceSpy },
        { provide: MatDialog, useValue: matDialogSpy }
      ]
    }).compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FeaturegroupDetailComponent);
    component = fixture.componentInstance;
  });

  it('should create component', () => {
    expect(component).toBeTruthy();
  });

  it('should fetch feature group on init', fakeAsync(() => {
    const responseMock = {
      categories: [{ productCategoryId: 'PC001' }],
      features: [{ productFeatureId: 'PF001' }]
    };
    featureGroupServiceSpy.getFeatureGroup.and.returnValue(of(responseMock));

    fixture.detectChanges(); // triggers ngOnInit
    tick();

    expect(featureGroupServiceSpy.getFeatureGroup).toHaveBeenCalledWith('FG123');
    expect(component.categories.length).toBe(1);
    expect(component.features.length).toBe(1);
  }));

  it('should handle error when fetching feature group fails', fakeAsync(() => {
    const consoleSpy = spyOn(console, 'error');
    featureGroupServiceSpy.getFeatureGroup.and.returnValue(throwError(() => new Error('Fetch Error')));

    fixture.detectChanges(); // triggers ngOnInit
    tick();

    expect(consoleSpy).toHaveBeenCalledWith('Error fetching feature group:', jasmine.any(Error));
  }));

  it('should reopen edit feature group dialog and refresh data on close', fakeAsync(() => {
    featureGroupServiceSpy.getFeatureGroup.and.returnValue(of({}));
    matDialogSpy.open.and.returnValue({
      afterClosed: () => of({ productFeatureGroupId: 'FG123' })
    } as any);

    component.featureGroupDetail = { id: 'test' };
    component.editFeatureGroupDialog();
    tick();

    expect(matDialogSpy.open).toHaveBeenCalled();
    expect(featureGroupServiceSpy.getFeatureGroup).toHaveBeenCalledWith('FG123');
  }));

  it('should return current date/time string', () => {
    const result = component.getCurrentDateTime();
    expect(typeof result).toBe('string');
    expect(result).toContain(new Date().getFullYear().toString());
  });
});
