import { HttpClientTestingModule } from '@angular/common/http/testing';
import { ComponentFixture, TestBed, fakeAsync, flush, tick } from '@angular/core/testing';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';
import { of } from 'rxjs';
import { CategoryService } from 'src/app/services/category/category.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';
import { ProductService } from 'src/app/services/product/product.service';
import { AddEditProductComponent } from './add-edit-product.component';

describe('AddEditProductComponent', () => {
  let component: AddEditProductComponent;
  let fixture: ComponentFixture<AddEditProductComponent>;
  let categoryServiceSpy: jasmine.SpyObj<CategoryService>;
  let productServiceSpy: jasmine.SpyObj<ProductService>;
  let snackbarSpy: jasmine.SpyObj<SnackbarService>;
  let dialogRefSpy: jasmine.SpyObj<MatDialogRef<AddEditProductComponent>>;

  const mockDialogData = {
    categoryProductData: {
      productCategoryId: 'CAT123',
      productId: 'PROD001',
      fromDate: '2024-01-01',
      thruDate: '2024-12-31',
    },
  };

  beforeEach(async () => {
    const categorySpy = jasmine.createSpyObj('CategoryService', ['addProductToCategory']);
    const productSpy = jasmine.createSpyObj('ProductService', ['getProducts']);
    const snackbarService = jasmine.createSpyObj('SnackbarService', ['showSuccess', 'showError']);
    const dialogRef = jasmine.createSpyObj('MatDialogRef', ['close']);

    await TestBed.configureTestingModule({
      declarations: [AddEditProductComponent],
      imports: [ReactiveFormsModule, FormsModule, HttpClientTestingModule],
      providers: [
        { provide: CategoryService, useValue: categorySpy },
        { provide: ProductService, useValue: productSpy },
        { provide: SnackbarService, useValue: snackbarService },
        { provide: MatDialogRef, useValue: dialogRef },
        { provide: MAT_DIALOG_DATA, useValue: mockDialogData },
      ],
    }).compileComponents();

    categoryServiceSpy = TestBed.inject(CategoryService) as jasmine.SpyObj<CategoryService>;
    productServiceSpy = TestBed.inject(ProductService) as jasmine.SpyObj<ProductService>;
    snackbarSpy = TestBed.inject(SnackbarService) as jasmine.SpyObj<SnackbarService>;
    dialogRefSpy = TestBed.inject(MatDialogRef) as jasmine.SpyObj<MatDialogRef<AddEditProductComponent>>;
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AddEditProductComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create component', () => {
    expect(component).toBeTruthy();
  });

  it('should initialize form with injected data', () => {
    expect(component.addProductToCategoryForm.value).toEqual({
      productCategoryId: 'CAT123',
      productId: 'PROD001',
      fromDate: '2024-01-01',
      thruDate: '2024-12-31',
    });
  });

  it('should not call service if form is invalid', fakeAsync(() => {
    component.addProductToCategoryForm.controls['productId'].setValue('');
    component.addProductToCategoryForm.controls['productId'].markAsTouched();
    component.addProductToCategoryForm.updateValueAndValidity();

    component.addProductToCategory().then(() => {
      expect(categoryServiceSpy.addProductToCategory).not.toHaveBeenCalled();
    });
  }));

  it('should call service and close dialog on success', fakeAsync(async() => {
    const formValues = component.addProductToCategoryForm.value;
    categoryServiceSpy.addProductToCategory.and.returnValue(of({ success: true }));

    component.addProductToCategory();
    tick();

    expect(categoryServiceSpy.addProductToCategory).toHaveBeenCalledWith(formValues);
    expect(dialogRefSpy.close).toHaveBeenCalledWith(formValues);
    expect(snackbarSpy.showSuccess).toHaveBeenCalledWith('Product added to category successfully');
    flush();
  }));

  it('should handle service error gracefully', fakeAsync(async () => {
    categoryServiceSpy.addProductToCategory.and.returnValue(await Promise.reject(new Error('API Error')));

    component.addProductToCategory();
    tick();

    expect(snackbarSpy.showError).toHaveBeenCalledWith('Error adding product to category');
    flush();
  }));
});
