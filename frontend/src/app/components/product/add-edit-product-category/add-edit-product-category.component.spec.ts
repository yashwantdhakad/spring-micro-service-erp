import { ComponentFixture, TestBed } from '@angular/core/testing';
import { AddEditProductCategoryComponent } from './add-edit-product-category.component';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { FormBuilder, ReactiveFormsModule } from '@angular/forms';
import { of, throwError } from 'rxjs';
import { CategoryService } from 'src/app/services/category/category.service';
import { ProductService } from 'src/app/services/product/product.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';
import { NoopAnimationsModule } from '@angular/platform-browser/animations';

describe('AddEditProductCategoryComponent', () => {
  let component: AddEditProductCategoryComponent;
  let fixture: ComponentFixture<AddEditProductCategoryComponent>;

  let mockCategoryService: jasmine.SpyObj<CategoryService>;
  let mockProductService: jasmine.SpyObj<ProductService>;
  let mockSnackbarService: jasmine.SpyObj<SnackbarService>;
  let mockDialogRef: jasmine.SpyObj<MatDialogRef<AddEditProductCategoryComponent>>;

  beforeEach(async () => {
    mockCategoryService = jasmine.createSpyObj('CategoryService', ['getCategories']);
    mockProductService = jasmine.createSpyObj('ProductService', ['addProductCategory']);
    mockSnackbarService = jasmine.createSpyObj('SnackbarService', ['showSuccess', 'showError']);
    mockDialogRef = jasmine.createSpyObj('MatDialogRef', ['close']);

    await TestBed.configureTestingModule({
      imports: [ReactiveFormsModule, NoopAnimationsModule],
      declarations: [AddEditProductCategoryComponent],
      providers: [
        FormBuilder,
        { provide: MatDialogRef, useValue: mockDialogRef },
        { provide: MAT_DIALOG_DATA, useValue: { productCategoryData: { productId: 'P1001' } } },
        { provide: ProductService, useValue: mockProductService },
        { provide: CategoryService, useValue: mockCategoryService },
        { provide: SnackbarService, useValue: mockSnackbarService }
      ]
    }).compileComponents();

    fixture = TestBed.createComponent(AddEditProductCategoryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create component', () => {
    expect(component).toBeTruthy();
  });

  it('should initialize form with productId from dialog data', () => {
    expect(component.addProductCategoryForm.value.productId).toBe('P1001');
  });

  it('should call productService.addProductCategory and show success snackbar on successful submit', () => {
    component.addProductCategoryForm.setValue({
      productId: 'P1001',
      productCategoryId: 'CAT100'
    });

    mockProductService.addProductCategory.and.returnValue(of({}));

    component.addProductCategory();

    expect(mockProductService.addProductCategory).toHaveBeenCalledWith({
      productId: 'P1001',
      productCategoryId: 'CAT100'
    });

    expect(mockSnackbarService.showSuccess).toHaveBeenCalledWith('Product category added successfully.');
    expect(mockDialogRef.close).toHaveBeenCalled();
  });

  it('should show error snackbar on addProductCategory error', () => {
    component.addProductCategoryForm.setValue({
      productId: 'P1001',
      productCategoryId: 'CAT100'
    });

    mockProductService.addProductCategory.and.returnValue(throwError(() => new Error('Failed')));

    component.addProductCategory();

    expect(mockSnackbarService.showError).toHaveBeenCalledWith('Error adding product category.');
  });

  it('displayCategoryFn should return category name from cachedCategories', () => {
    component.cachedCategories = [
      { productCategoryId: 'CAT100', categoryName: 'Hardware' }
    ];

    const result = component.displayCategoryFn('CAT100');
    expect(result).toBe('Hardware');
  });

  it('displayCategoryFn should return raw ID if category not found', () => {
    component.cachedCategories = [
      { productCategoryId: 'CAT100', categoryName: 'Hardware' }
    ];

    const result = component.displayCategoryFn('UNKNOWN');
    expect(result).toBe('UNKNOWN');
  });
});
