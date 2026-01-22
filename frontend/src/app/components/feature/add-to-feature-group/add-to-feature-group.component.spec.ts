import { ComponentFixture, TestBed, fakeAsync, tick } from '@angular/core/testing';
import { AddToFeatureGroupComponent } from './add-to-feature-group.component';
import { ReactiveFormsModule, FormsModule } from '@angular/forms';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';
import { FeatureGroupService } from 'src/app/services/featuregroup/feature-group.service';
import { FeatureService } from 'src/app/services/features/feature.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';
import { of, throwError } from 'rxjs';
import { HttpClientTestingModule } from '@angular/common/http/testing';
import { HttpHeaders, HttpResponse } from '@angular/common/http';

describe('AddToFeatureGroupComponent', () => {
  let component: AddToFeatureGroupComponent;
  let fixture: ComponentFixture<AddToFeatureGroupComponent>;
  let featureGroupServiceSpy: jasmine.SpyObj<FeatureGroupService>;
  let featureServiceSpy: jasmine.SpyObj<FeatureService>;
  let snackbarSpy: jasmine.SpyObj<SnackbarService>;
  let dialogRefSpy: jasmine.SpyObj<MatDialogRef<AddToFeatureGroupComponent>>;

  const dialogData = {
    featureGroupData: {
      productFeatureId: 'F001',
      productFeatureGroupId: 'FG001',
      sequenceNum: 10,
      fromDate: null,
      isNew: true
    }
  };

  beforeEach(async () => {
    featureGroupServiceSpy = jasmine.createSpyObj('FeatureGroupService', ['getFeatureGroups']);
    featureServiceSpy = jasmine.createSpyObj('FeatureService', ['createProductFeatureGroupAppl', 'updateProductFeatureGroupAppl']);
    snackbarSpy = jasmine.createSpyObj('SnackbarService', ['showSuccess', 'showError']);
    dialogRefSpy = jasmine.createSpyObj('MatDialogRef', ['close']);

    await TestBed.configureTestingModule({
      imports: [ReactiveFormsModule, FormsModule, HttpClientTestingModule],
      declarations: [AddToFeatureGroupComponent],
      providers: [
        { provide: MAT_DIALOG_DATA, useValue: dialogData },
        { provide: MatDialogRef, useValue: dialogRefSpy },
        { provide: FeatureGroupService, useValue: featureGroupServiceSpy },
        { provide: FeatureService, useValue: featureServiceSpy },
        { provide: SnackbarService, useValue: snackbarSpy },
      ],
    }).compileComponents();

    fixture = TestBed.createComponent(AddToFeatureGroupComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create the component and initialize the form', () => {
    expect(component).toBeTruthy();
    expect(component.createProductFeatureGroupApplForm.valid).toBeTrue();
  });

  it('should call createProductFeatureGroupAppl on valid form (create)', () => {
    featureServiceSpy.createProductFeatureGroupAppl.and.returnValue(of({}));

    component.createProductFeatureGroupAppl();

    expect(featureServiceSpy.createProductFeatureGroupAppl).toHaveBeenCalledWith(
      jasmine.objectContaining({
        productFeatureId: 'F001',
        productFeatureGroupId: 'FG001',
        sequenceNum: 10,
        fromDate: null,
      })
    );
    expect(dialogRefSpy.close).toHaveBeenCalled();
    expect(snackbarSpy.showSuccess).toHaveBeenCalled();
  });

  it('should call updateProductFeatureGroupAppl on valid form with fromDate', () => {
    const form = component.createProductFeatureGroupApplForm;
    form.patchValue({ fromDate: '2023-01-01' });

    featureServiceSpy.updateProductFeatureGroupAppl.and.returnValue(of({}));

    component.createProductFeatureGroupAppl();

    expect(featureServiceSpy.updateProductFeatureGroupAppl).toHaveBeenCalled();
    expect(snackbarSpy.showSuccess).toHaveBeenCalled();
    expect(dialogRefSpy.close).toHaveBeenCalled();
  });

  it('should show error message when API fails', () => {
    featureServiceSpy.createProductFeatureGroupAppl.and.returnValue(throwError(() => new Error('API error')));

    component.createProductFeatureGroupAppl();

    expect(snackbarSpy.showError).toHaveBeenCalledWith('Error in creating/updating feature to group');
  });

  it('should not call service if form is invalid', () => {
    component.createProductFeatureGroupApplForm.controls['productFeatureGroupId'].setValue('');

    component.createProductFeatureGroupAppl();

    expect(featureServiceSpy.createProductFeatureGroupAppl).not.toHaveBeenCalled();
    expect(featureServiceSpy.updateProductFeatureGroupAppl).not.toHaveBeenCalled();
  });

  it('should filter feature groups when productFeatureGroupId changes', fakeAsync(() => {
    // const mockFeatureGroups = { body: [{ id: 'FG001' }, { id: 'FG002' }] };
    const mockFeatureGroups = new HttpResponse({
      body: [{ id: 'FG001' }, { id: 'FG002' }],
      headers: new HttpHeaders({ 'x-total-count': '2' }),
      status: 200,
      statusText: 'OK',
      url: '/api/rest/s1/commerce/featureGroups',
    });
    featureGroupServiceSpy.getFeatureGroups.and.returnValue(of(mockFeatureGroups));

    component.ngOnInit();
    component.createProductFeatureGroupApplForm.get('productFeatureGroupId')?.setValue('FG');

    tick(300); // simulate debounce
    component.filteredGroups$.subscribe(groups => {
      expect(groups.length).toBe(2);
    });
  }));
});
