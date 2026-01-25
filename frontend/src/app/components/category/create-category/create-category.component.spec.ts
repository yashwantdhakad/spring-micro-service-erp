import { ComponentFixture, TestBed, fakeAsync, tick } from '@angular/core/testing';
import { CreateCategoryComponent } from './create-category.component';
import { ReactiveFormsModule } from '@angular/forms';
import { of, throwError } from 'rxjs';
import { Router } from '@angular/router';
import { CategoryService } from 'src/app/services/category/category.service';
import { CommonService } from 'src/app/services/common/common.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';

describe('CreateCategoryComponent', () => {
  let component: CreateCategoryComponent;
  let fixture: ComponentFixture<CreateCategoryComponent>;
  let categoryServiceSpy: jasmine.SpyObj<CategoryService>;
  let commonServiceSpy: jasmine.SpyObj<CommonService>;
  let snackbarServiceSpy: jasmine.SpyObj<SnackbarService>;
  let routerSpy: jasmine.SpyObj<Router>;

  beforeEach(async () => {
    const categorySpy = jasmine.createSpyObj('CategoryService', ['createCategory']);
    const commonSpy = jasmine.createSpyObj('CommonService', ['getLookupResults']);
    const snackbarSpy = jasmine.createSpyObj('SnackbarService', ['showError', 'showSuccess']);
    const routerMock = jasmine.createSpyObj('Router', ['navigate']);

    await TestBed.configureTestingModule({
      declarations: [CreateCategoryComponent],
      imports: [ReactiveFormsModule],
      providers: [
        { provide: CategoryService, useValue: categorySpy },
        { provide: CommonService, useValue: commonSpy },
        { provide: SnackbarService, useValue: snackbarSpy },
        { provide: Router, useValue: routerMock },
      ],
    }).compileComponents();

    fixture = TestBed.createComponent(CreateCategoryComponent);
    component = fixture.componentInstance;
    categoryServiceSpy = TestBed.inject(CategoryService) as jasmine.SpyObj<CategoryService>;
    commonServiceSpy = TestBed.inject(CommonService) as jasmine.SpyObj<CommonService>;
    snackbarServiceSpy = TestBed.inject(SnackbarService) as jasmine.SpyObj<SnackbarService>;
    routerSpy = TestBed.inject(Router) as jasmine.SpyObj<Router>;
  });

  it('should create component', () => {
    expect(component).toBeTruthy();
  });

  it('should fetch category types on init', () => {
    const enumTypes = [{ id: 'CATALOG_CATEGORY', name: 'Catalog' }];
    commonServiceSpy.getLookupResults.and.returnValue(of(enumTypes));

    component.ngOnInit();

    expect(commonServiceSpy.getLookupResults).toHaveBeenCalledWith({}, 'product_category_type');
    expect(component.categoryTypes).toEqual(enumTypes);
  });

  it('should handle error when fetching category types', () => {
    commonServiceSpy.getLookupResults.and.returnValue(throwError(() => new Error('API Error')));

    component.ngOnInit();

    expect(snackbarServiceSpy.showError).toHaveBeenCalledWith('Error fetching category types.');
  });

  it('should not create category if form is invalid', () => {
    component.categoryForm.controls['categoryName'].setValue(''); // required
    component.createCategory();

    expect(categoryServiceSpy.createCategory).not.toHaveBeenCalled();
  });

  it('should create category successfully', () => {
    const formData = {
      categoryName: 'Electronics',
      productCategoryTypeId: 'CATALOG_CATEGORY',
      description: 'Gadgets',
    };

    component.categoryForm.setValue(formData);

    categoryServiceSpy.createCategory.and.returnValue(of({ productCategoryId: 'CAT1001' }));

    component.createCategory();

    expect(categoryServiceSpy.createCategory).toHaveBeenCalledWith(formData);
    expect(routerSpy.navigate).toHaveBeenCalledWith(['/category/CAT1001']);
    expect(snackbarServiceSpy.showSuccess).toHaveBeenCalledWith('Category created successfully.');
  });

  it('should show error if category creation fails', () => {
    const formData = {
      categoryName: 'Books',
      productCategoryTypeId: 'CATALOG_CATEGORY',
      description: '',
    };

    component.categoryForm.setValue(formData);

    categoryServiceSpy.createCategory.and.returnValue(throwError(() => new Error('Creation error')));

    component.createCategory();

    expect(snackbarServiceSpy.showError).toHaveBeenCalledWith('Error creating category.');
  });
});
