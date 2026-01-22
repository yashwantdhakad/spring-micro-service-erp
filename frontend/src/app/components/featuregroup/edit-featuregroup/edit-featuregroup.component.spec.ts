import { ComponentFixture, TestBed, fakeAsync, tick } from '@angular/core/testing';
import { EditFeaturegroupComponent } from './edit-featuregroup.component';
import { ReactiveFormsModule } from '@angular/forms';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';
import { FeatureGroupService } from 'src/app/services/featuregroup/feature-group.service';
import { of, throwError } from 'rxjs';

describe('EditFeaturegroupComponent', () => {
  let component: EditFeaturegroupComponent;
  let fixture: ComponentFixture<EditFeaturegroupComponent>;
  let featureGroupServiceSpy: jasmine.SpyObj<FeatureGroupService>;
  let dialogRefSpy: jasmine.SpyObj<MatDialogRef<EditFeaturegroupComponent>>;

  const mockData = {
    featureGroupDetail: {
      productFeatureGroupId: 'FG001',
      description: 'Test Group'
    }
  };

  beforeEach(async () => {
    featureGroupServiceSpy = jasmine.createSpyObj('FeatureGroupService', ['updateFeatureGroup']);
    dialogRefSpy = jasmine.createSpyObj('MatDialogRef', ['close']);

    await TestBed.configureTestingModule({
      imports: [ReactiveFormsModule],
      declarations: [EditFeaturegroupComponent],
      providers: [
        { provide: FeatureGroupService, useValue: featureGroupServiceSpy },
        { provide: MAT_DIALOG_DATA, useValue: mockData },
        { provide: MatDialogRef, useValue: dialogRefSpy }
      ]
    }).compileComponents();

    fixture = TestBed.createComponent(EditFeaturegroupComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create component', () => {
    expect(component).toBeTruthy();
  });

  it('should initialize form with data', () => {
    expect(component.featureGroupForm.value).toEqual({
      productFeatureGroupId: 'FG001',
      description: 'Test Group'
    });
  });

  it('should not submit if form is invalid', () => {
    component.featureGroupForm.controls['description'].setValue('');
    component.updateFeature();
    expect(featureGroupServiceSpy.updateFeatureGroup).not.toHaveBeenCalled();
  });

  it('should call updateFeatureGroup and close dialog on success', fakeAsync(() => {
    featureGroupServiceSpy.updateFeatureGroup.and.returnValue(of({ success: true }));

    component.featureGroupForm.controls['description'].setValue('Updated Group');
    component.updateFeature();
    tick();

    expect(featureGroupServiceSpy.updateFeatureGroup).toHaveBeenCalledWith({
      productFeatureGroupId: 'FG001',
      description: 'Updated Group'
    });
    expect(dialogRefSpy.close).toHaveBeenCalledWith({
      productFeatureGroupId: 'FG001',
      description: 'Updated Group'
    });
  }));

  it('should log error on service failure', fakeAsync(() => {
    const consoleSpy = spyOn(console, 'error');
    featureGroupServiceSpy.updateFeatureGroup.and.returnValue(throwError(() => new Error('Update failed')));

    component.featureGroupForm.controls['description'].setValue('Failed Update');
    component.updateFeature();
    tick();

    expect(consoleSpy).toHaveBeenCalledWith('Error in update feature group:', jasmine.any(Error));
    expect(dialogRefSpy.close).not.toHaveBeenCalled();
  }));
});
