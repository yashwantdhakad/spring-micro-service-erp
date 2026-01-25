import { ComponentFixture, TestBed } from '@angular/core/testing';
import { ProductEditComponent } from './product-edit.component';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';
import { FormBuilder, ReactiveFormsModule } from '@angular/forms';
import { of, throwError } from 'rxjs';
import { ProductService } from 'src/app/services/product/product.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';

describe('ProductEditComponent', () => {
  let component: ProductEditComponent;
  let fixture: ComponentFixture<ProductEditComponent>;
  let productServiceSpy: jasmine.SpyObj<ProductService>;
  let snackbarSpy: jasmine.SpyObj<SnackbarService>;
  let dialogRefSpy: jasmine.SpyObj<MatDialogRef<ProductEditComponent>>;

  const mockDialogData = {
    productDetail: {
      productId: 'PROD-123',
      productName: 'Test Product',
    },
  };

  beforeEach(async () => {
    productServiceSpy = jasmine.createSpyObj('ProductService', ['updateProduct']);
    snackbarSpy = jasmine.createSpyObj('SnackbarService', ['showSuccess', 'showError']);
    dialogRefSpy = jasmine.createSpyObj('MatDialogRef', ['close']);

    await TestBed.configureTestingModule({
      declarations: [ProductEditComponent],
      imports: [ReactiveFormsModule],
      providers: [
        FormBuilder,
        { provide: MAT_DIALOG_DATA, useValue: mockDialogData },
        { provide: ProductService, useValue: productServiceSpy },
        { provide: SnackbarService, useValue: snackbarSpy },
        { provide: MatDialogRef, useValue: dialogRefSpy },
      ],
    }).compileComponents();

    fixture = TestBed.createComponent(ProductEditComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create the component and form should be initialized with values', () => {
    expect(component).toBeTruthy();
    expect(component.updateProductForm.value.productId).toBe('PROD-123');
    expect(component.updateProductForm.value.productName).toBe('Test Product');
  });

  it('should call updateProduct and close dialog on success', () => {
    const updatedValue = {
      productId: 'PROD-123',
      productName: 'Updated Product',
    };

    component.updateProductForm.setValue(updatedValue);
    productServiceSpy.updateProduct.and.returnValue(of({}));

    component.updateProduct();

    expect(productServiceSpy.updateProduct).toHaveBeenCalledWith(updatedValue);
    expect(snackbarSpy.showSuccess).toHaveBeenCalledWith('Product updated successfully.');
    expect(dialogRefSpy.close).toHaveBeenCalledWith(updatedValue);
  });

  it('should show error on updateProduct failure', () => {
    component.updateProductForm.setValue({
      productId: 'PROD-123',
      productName: 'Fail Product',
    });

    productServiceSpy.updateProduct.and.returnValue(
      throwError(() => new Error('Update failed'))
    );

    component.updateProduct();

    expect(snackbarSpy.showError).toHaveBeenCalledWith('Error in updating product.');
    expect(dialogRefSpy.close).not.toHaveBeenCalled();
  });

  it('should not submit the form if invalid', () => {
    component.updateProductForm.controls['productName'].setValue('');
    component.updateProduct();

    expect(productServiceSpy.updateProduct).not.toHaveBeenCalled();
  });
});
