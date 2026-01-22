import { ComponentFixture, TestBed, fakeAsync, tick } from '@angular/core/testing';
import { EditFeatureComponent } from './edit-feature.component';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';
import { ReactiveFormsModule } from '@angular/forms';
import { FeatureService } from 'src/app/services/features/feature.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';
import { of, throwError } from 'rxjs';
import { CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';

describe('EditFeatureComponent', () => {
  let component: EditFeatureComponent;
  let fixture: ComponentFixture<EditFeatureComponent>;
  let featureServiceSpy: jasmine.SpyObj<FeatureService>;
  let snackbarServiceSpy: jasmine.SpyObj<SnackbarService>;
  let dialogRefSpy: jasmine.SpyObj<MatDialogRef<EditFeatureComponent>>;

  const mockData = {
    featureDetail: {
      productFeatureId: 'TEST123',
      abbrev: 'SMP',
      description: 'Sample Feature'
    }
  };

  beforeEach(async () => {
    featureServiceSpy = jasmine.createSpyObj('FeatureService', ['updateFeature']);
    snackbarServiceSpy = jasmine.createSpyObj('SnackbarService', ['showSuccess', 'showError']);
    dialogRefSpy = jasmine.createSpyObj('MatDialogRef', ['close']);

    await TestBed.configureTestingModule({
      declarations: [EditFeatureComponent],
      imports: [ReactiveFormsModule],
      providers: [
        { provide: FeatureService, useValue: featureServiceSpy },
        { provide: SnackbarService, useValue: snackbarServiceSpy },
        { provide: MatDialogRef, useValue: dialogRefSpy },
        { provide: MAT_DIALOG_DATA, useValue: mockData }
      ],
      schemas: [CUSTOM_ELEMENTS_SCHEMA]
    }).compileComponents();

    fixture = TestBed.createComponent(EditFeatureComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create the component', () => {
    expect(component).toBeTruthy();
  });

  it('should initialize the form with data', () => {
    expect(component.featureForm.value).toEqual({
      productFeatureId: 'TEST123',
      abbrev: 'SMP',
      description: 'Sample Feature'
    });
  });

  it('should not call updateFeature if form is invalid', () => {
    component.featureForm.controls['abbrev'].setValue('');
    component.updateFeature();
    expect(featureServiceSpy.updateFeature).not.toHaveBeenCalled();
  });

  it('should call updateFeature and close dialog on success', fakeAsync(() => {
    const mockResponse = {};
    featureServiceSpy.updateFeature.and.returnValue(of(mockResponse));

    component.updateFeature();
    tick();

    expect(featureServiceSpy.updateFeature).toHaveBeenCalledWith(component.featureForm.value);
    expect(snackbarServiceSpy.showSuccess).toHaveBeenCalledWith('Feature updated successfully.');
    expect(dialogRefSpy.close).toHaveBeenCalledWith(component.featureForm.value);
  }));

  it('should show error message on update failure', fakeAsync(() => {
    featureServiceSpy.updateFeature.and.returnValue(throwError(() => new Error('Update failed')));

    component.updateFeature();
    tick();

    expect(snackbarServiceSpy.showError).toHaveBeenCalledWith('Error in updating feature.');
  }));
});
