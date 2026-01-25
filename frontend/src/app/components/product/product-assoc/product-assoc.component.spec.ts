import { ComponentFixture, TestBed } from '@angular/core/testing';
import { ProductAssocComponent } from './product-assoc.component';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';
import { ReactiveFormsModule, FormsModule } from '@angular/forms';
import { ProductService } from 'src/app/services/product/product.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';
import { of, throwError } from 'rxjs';
import { TranslateModule, TranslateService } from '@ngx-translate/core';

describe('ProductAssocComponent', () => {
  let component: ProductAssocComponent;
  let fixture: ComponentFixture<ProductAssocComponent>;

  const mockProductService = jasmine.createSpyObj('ProductService', ['getProducts', 'createProductAssoc', 'getProductAssocTypes']);
  const mockSnackbarService = jasmine.createSpyObj('SnackbarService', ['showSuccess', 'showError']);
  const mockDialogRef = jasmine.createSpyObj('MatDialogRef', ['close']);

  const mockData = {
    assocData: {
      productId: 'PROD-001',
      toProductId: 'PROD-002',
      productAssocTypeEnumId: 'PA_COMP',
      quantity: 1,
      fromDate: '2025-07-27',
    },
  };

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ReactiveFormsModule, FormsModule, TranslateModule.forRoot()],
      declarations: [ProductAssocComponent],
      providers: [
        { provide: MatDialogRef, useValue: mockDialogRef },
        { provide: MAT_DIALOG_DATA, useValue: mockData },
        { provide: ProductService, useValue: mockProductService },
        { provide: SnackbarService, useValue: mockSnackbarService },
        TranslateService,
      ],
    }).compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ProductAssocComponent);
    component = fixture.componentInstance;
    mockProductService.getProductAssocTypes.and.returnValue(of([]));
    fixture.detectChanges();
  });

  it('should create component and initialize form with data', () => {
    expect(component).toBeTruthy();
    expect(component.addProductAssocForm.value.productId).toBe('PROD-001');
  });

  it('should call getEnumTypes and populate enumTypes', () => {
    const mockEnum = [{ productAssocTypeId: 'PA_COMP', description: 'Component' }];
    mockProductService.getProductAssocTypes.and.returnValue(of(mockEnum));
    component.getEnumTypes();
    expect(mockProductService.getProductAssocTypes).toHaveBeenCalled();
  });

  it('should call createProductAssoc() and submit form successfully', () => {
    const formValues = component.addProductAssocForm.value;
    mockProductService.createProductAssoc.and.returnValue(of({}));

    component.createProductAssoc();

    expect(mockProductService.createProductAssoc).toHaveBeenCalledWith(formValues);
    expect(mockSnackbarService.showSuccess).toHaveBeenCalled();
    expect(mockDialogRef.close).toHaveBeenCalledWith(formValues);
  });

  it('should show error when createProductAssoc() fails', () => {
    mockProductService.createProductAssoc.and.returnValue(throwError(() => new Error('Creation failed')));

    component.createProductAssoc();

    expect(mockSnackbarService.showError).toHaveBeenCalled();
  });

  it('should not call API if form is invalid', () => {
    component.addProductAssocForm.get('toProductId')?.setValue(null);
    component.createProductAssoc();
    expect(mockProductService.createProductAssoc).not.toHaveBeenCalled();
  });
});
