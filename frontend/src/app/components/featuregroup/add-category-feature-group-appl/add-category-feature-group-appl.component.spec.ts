import { ComponentFixture, TestBed, fakeAsync, tick } from '@angular/core/testing';
import { ReactiveFormsModule } from '@angular/forms';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';
import { of, throwError } from 'rxjs';
import { AddCategoryFeatureGroupApplComponent } from './add-category-feature-group-appl.component';
import { CategoryService } from 'src/app/services/category/category.service';
import { FeatureGroupService } from 'src/app/services/featuregroup/feature-group.service';
import { CommonService } from 'src/app/services/common/common.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';

describe('AddCategoryFeatureGroupApplComponent', () => {
  let component: AddCategoryFeatureGroupApplComponent;
  let fixture: ComponentFixture<AddCategoryFeatureGroupApplComponent>;
  let categoryService: jasmine.SpyObj<CategoryService>;
  let featureGroupService: jasmine.SpyObj<FeatureGroupService>;
  let commonService: jasmine.SpyObj<CommonService>;
  let snackbarService: jasmine.SpyObj<SnackbarService>;
  let dialogRef: jasmine.SpyObj<MatDialogRef<AddCategoryFeatureGroupApplComponent>>;

  const dialogData = {
    featureGroupCategoryData: {
      productFeatureGroupId: 'FG001',
      productCategoryId: 'CAT001',
      applTypeEnumId: 'PfatStandard',
      fromDate: '', // for create
    },
  };

  beforeEach(async () => {
    const categorySpy = jasmine.createSpyObj('CategoryService', ['getCategories']);
    const featureGroupSpy = jasmine.createSpyObj('FeatureGroupService', [
      'createProductCategoryFeatGrpAppl',
      'updateProductCategoryFeatGrpAppl',
    ]);
    const commonSpy = jasmine.createSpyObj('CommonService', ['getEnumTypes']);
    const snackbarSpy = jasmine.createSpyObj('SnackbarService', ['showSuccess', 'showError']);
    const dialogSpy = jasmine.createSpyObj('MatDialogRef', ['close']);

    const mockCommonService = {
      getEnumTypes: jasmine.createSpy().and.returnValue(of([])), // return mock enum types here
    };

    await TestBed.configureTestingModule({
      declarations: [AddCategoryFeatureGroupApplComponent],
      imports: [ReactiveFormsModule],
      providers: [
        { provide: CommonService, useValue: mockCommonService },
        { provide: CategoryService, useValue: categorySpy },
        { provide: FeatureGroupService, useValue: featureGroupSpy },
        { provide: CommonService, useValue: commonSpy },
        { provide: SnackbarService, useValue: snackbarSpy },
        { provide: MatDialogRef, useValue: dialogSpy },
        { provide: MAT_DIALOG_DATA, useValue: dialogData },
      ],
    }).compileComponents();

    categoryService = TestBed.inject(CategoryService) as jasmine.SpyObj<CategoryService>;
    featureGroupService = TestBed.inject(FeatureGroupService) as jasmine.SpyObj<FeatureGroupService>;
    commonService = TestBed.inject(CommonService) as jasmine.SpyObj<CommonService>;
    snackbarService = TestBed.inject(SnackbarService) as jasmine.SpyObj<SnackbarService>;
    dialogRef = TestBed.inject(MatDialogRef) as jasmine.SpyObj<MatDialogRef<AddCategoryFeatureGroupApplComponent>>;
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AddCategoryFeatureGroupApplComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create component', () => {
    expect(component).toBeTruthy();
  });

  it('should initialize form with provided data', () => {
    const form = component.categoryFeatureGroupApplForm;
    expect(form.get('productFeatureGroupId')?.value).toBe('FG001');
    expect(form.get('productCategoryId')?.value).toBe('CAT001');
    expect(form.get('applTypeEnumId')?.value).toBe('PfatStandard');
  });

  it('should call getEnumTypes on init', () => {
    commonService.getEnumTypes.and.returnValue(of([{ enumId: 'PfatStandard' }]));
    component.loadEnumTypes();
    expect(commonService.getEnumTypes).toHaveBeenCalledWith('ProductFeatureApplType');
  });

  it('should handle getEnumTypes error', () => {
    spyOn(console, 'error');
    commonService.getEnumTypes.and.returnValue(throwError(() => new Error('Enum error')));
    component.loadEnumTypes();
    expect(console.error).toHaveBeenCalled();
  });

  it('should call createProductCategoryFeatGrpAppl and close dialog on success', fakeAsync(() => {
    featureGroupService.createProductCategoryFeatGrpAppl.and.returnValue(of({}));
    component.createProductCategoryFeatGrpAppl();
    tick();

    expect(featureGroupService.createProductCategoryFeatGrpAppl).toHaveBeenCalled();
    expect(snackbarService.showSuccess).toHaveBeenCalledWith(
      'Category feature group application created successfully'
    );
    expect(dialogRef.close).toHaveBeenCalled();
  }));

  it('should call updateProductCategoryFeatGrpAppl and close dialog on success', fakeAsync(() => {
    // Simulate update by setting fromDate
    component.categoryFeatureGroupApplForm.get('fromDate')?.setValue('2023-01-01');
    featureGroupService.updateProductCategoryFeatGrpAppl.and.returnValue(of({}));

    component.createProductCategoryFeatGrpAppl();
    tick();

    expect(featureGroupService.updateProductCategoryFeatGrpAppl).toHaveBeenCalled();
    expect(snackbarService.showSuccess).toHaveBeenCalledWith(
      'Category feature group application updated successfully'
    );
    expect(dialogRef.close).toHaveBeenCalled();
  }));

  it('should handle error in create/update flow', fakeAsync(() => {
    featureGroupService.createProductCategoryFeatGrpAppl.and.returnValue(
      throwError(() => new Error('Create Error'))
    );

    component.createProductCategoryFeatGrpAppl();
    tick();

    expect(snackbarService.showError).toHaveBeenCalledWith(
      'Error in creating/updating feature to category'
    );
  }));

  it('should return empty array if category input is empty', fakeAsync(() => {
    categoryService.getCategories.and.returnValue(of({ body: [] }));

    component.ngOnInit();
    const control = component.categoryFeatureGroupApplForm.get('productCategoryId');
    control?.setValue('');
    tick(300);

    component.filteredCategories$.subscribe((result) => {
      expect(result).toEqual([]);
    });
  }));

  it('should return filtered categories for valid input', fakeAsync(() => {
    categoryService.getCategories.and.returnValue(of({ body: [{ categoryId: 'CAT100' }] }));

    component.ngOnInit();
    const control = component.categoryFeatureGroupApplForm.get('productCategoryId');
    control?.setValue('Electronics');
    tick(300);

    component.filteredCategories$.subscribe((result) => {
      expect(result.length).toBe(1);
      expect(result[0].categoryId).toBe('CAT100');
    });
  }));
});
