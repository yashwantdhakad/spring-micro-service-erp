import { ComponentFixture, TestBed, fakeAsync, tick } from '@angular/core/testing';
import { FeaturegroupsComponent } from './featuregroups.component';
import { FeatureGroupService } from 'src/app/services/featuregroup/feature-group.service';
import { of, throwError } from 'rxjs';
import { HttpHeaders, HttpResponse } from '@angular/common/http';

describe('FeaturegroupsComponent', () => {
  let component: FeaturegroupsComponent;
  let fixture: ComponentFixture<FeaturegroupsComponent>;
  let featureGroupServiceSpy: jasmine.SpyObj<FeatureGroupService>;

  beforeEach(async () => {
    featureGroupServiceSpy = jasmine.createSpyObj('FeatureGroupService', ['getFeatureGroups']);

    await TestBed.configureTestingModule({
      declarations: [FeaturegroupsComponent],
      providers: [
        { provide: FeatureGroupService, useValue: featureGroupServiceSpy }
      ]
    }).compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FeaturegroupsComponent);
    component = fixture.componentInstance;
  });

  it('should create the component', () => {
    expect(component).toBeTruthy();
  });

  it('should fetch feature groups on init', fakeAsync(() => {
    const mockBody = [{ productFeatureGroupId: 'FG001', description: 'Group 1' }];
    const mockHeaders = new HttpHeaders({ 'x-total-count': '15' });
    const mockResponse = new HttpResponse({ body: mockBody, headers: mockHeaders });

    featureGroupServiceSpy.getFeatureGroups.and.returnValue(of(mockResponse));

    fixture.detectChanges(); // triggers ngOnInit
    tick();

    expect(featureGroupServiceSpy.getFeatureGroups).toHaveBeenCalledWith(0, '');
    expect(component.items.length).toBe(1);
    expect(component.pages).toBe(15);
  }));

  it('should handle error when fetching feature groups fails', fakeAsync(() => {
    const consoleSpy = spyOn(console, 'error');
    featureGroupServiceSpy.getFeatureGroups.and.returnValue(
      throwError(() => new Error('API error'))
    );

    fixture.detectChanges(); // triggers ngOnInit
    tick();

    expect(consoleSpy).toHaveBeenCalledWith('Error fetching feature groups:', jasmine.any(Error));
    expect(component.items.length).toBe(0);
  }));

  it('should return correct column keys', () => {
    const result = component.getColumnKeys();
    expect(result).toEqual(['productFeatureGroupId', 'description']);
  });
});
