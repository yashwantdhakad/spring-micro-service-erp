import { ComponentFixture, TestBed, fakeAsync, tick } from '@angular/core/testing';
import { AddProductFeatureGroupApplComponent } from './add-product-feature-group-appl.component';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';
import { FormBuilder, ReactiveFormsModule } from '@angular/forms';
import { of, throwError } from 'rxjs';
import { FeatureService } from 'src/app/services/features/feature.service';
import { FeatureGroupService } from 'src/app/services/featuregroup/feature-group.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';
import { HttpResponse } from '@angular/common/http';

describe('AddProductFeatureGroupApplComponent', () => {
  let component: AddProductFeatureGroupApplComponent;
  let fixture: ComponentFixture<AddProductFeatureGroupApplComponent>;
  let featureServiceSpy: jasmine.SpyObj<FeatureService>;
  let featureGroupServiceSpy: jasmine.SpyObj<FeatureGroupService>;
  let snackbarServiceSpy: jasmine.SpyObj<SnackbarService>;

  beforeEach(async () => {
    featureServiceSpy = jasmine.createSpyObj('FeatureService', ['getFeatures']);
    featureGroupServiceSpy = jasmine.createSpyObj('FeatureGroupService', [
      'createProductFeatureGroupAppl',
      'updateProductFeatureGroupAppl',
    ]);
    snackbarServiceSpy = jasmine.createSpyObj('SnackbarService', ['showSuccess', 'showError']);

    await TestBed.configureTestingModule({
      declarations: [AddProductFeatureGroupApplComponent],
      imports: [ReactiveFormsModule],
      providers: [
        FormBuilder,
        { provide: MAT_DIALOG_DATA, useValue: { featureGroupProductData: {} } },
        { provide: MatDialogRef, useValue: { close: jasmine.createSpy('close') } },
        { provide: FeatureService, useValue: featureServiceSpy },
        { provide: FeatureGroupService, useValue: featureGroupServiceSpy },
        { provide: SnackbarService, useValue: snackbarServiceSpy },
      ],
    }).compileComponents();

    fixture = TestBed.createComponent(AddProductFeatureGroupApplComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create the component', () => {
    expect(component).toBeTruthy();
  });

  it('should call getFeatures and return feature list', fakeAsync(() => {
    const mockResponse = new HttpResponse({
      body: [{ id: 'F001' }],
      status: 200,
      statusText: 'OK',
    });
    featureServiceSpy.getFeatures.and.returnValue(of(mockResponse));
    component.getFeatures('feature').subscribe((res) => {
      expect(res.length).toBe(1);
      expect(res[0].id).toBe('F001');
    });
    tick();
  }));

  it('should submit form and call create service', fakeAsync(() => {
    const formValue = {
      productFeatureId: 'F001',
      productFeatureGroupId: 'G001',
      fromDate: null,
    };
    component.productFeatureGroupApplForm.setValue(formValue);
    featureGroupServiceSpy.createProductFeatureGroupAppl.and.returnValue(of({}));

    component.createProductFeatGrpAppl();
    tick();

    expect(featureGroupServiceSpy.createProductFeatureGroupAppl).toHaveBeenCalledWith(formValue);
    expect(snackbarServiceSpy.showSuccess).toHaveBeenCalledWith(
      'Feature group application created successfully'
    );
  }));

  it('should submit form and call update service when fromDate is present', fakeAsync(() => {
    const formValue = {
      productFeatureId: 'F001',
      productFeatureGroupId: 'G001',
      fromDate: '2024-01-01',
    };
    component.productFeatureGroupApplForm.setValue(formValue);
    featureGroupServiceSpy.updateProductFeatureGroupAppl.and.returnValue(of({}));

    component.createProductFeatGrpAppl();
    tick();

    expect(featureGroupServiceSpy.updateProductFeatureGroupAppl).toHaveBeenCalledWith(formValue);
    expect(snackbarServiceSpy.showSuccess).toHaveBeenCalledWith(
      'Feature group application updated successfully'
    );
  }));

  it('should handle error in createProductFeatGrpAppl', fakeAsync(() => {
    component.productFeatureGroupApplForm.setValue({
      productFeatureId: 'F001',
      productFeatureGroupId: 'G001',
      fromDate: null,
    });
    featureGroupServiceSpy.createProductFeatureGroupAppl.and.returnValue(
      throwError(() => new Error('Failed'))
    );

    component.createProductFeatGrpAppl();
    tick();

    expect(snackbarServiceSpy.showError).toHaveBeenCalledWith(
      'Error in creating/updating feature to group'
    );
  }));
});
