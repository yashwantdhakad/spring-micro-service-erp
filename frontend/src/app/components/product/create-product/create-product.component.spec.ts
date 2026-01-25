import { ComponentFixture, TestBed, fakeAsync, tick } from '@angular/core/testing';
import { ReactiveFormsModule } from '@angular/forms';
import { Router } from '@angular/router';
import { of, throwError } from 'rxjs';
import { CreateProductComponent } from './create-product.component';
import { CommonService } from 'src/app/services/common/common.service';
import { ProductService } from 'src/app/services/product/product.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';
import { TranslateService } from '@ngx-translate/core';

describe('CreateProductComponent', () => {
  let component: CreateProductComponent;
  let fixture: ComponentFixture<CreateProductComponent>;
  let commonService: jasmine.SpyObj<CommonService>;
  let productService: jasmine.SpyObj<ProductService>;
  let snackbarService: jasmine.SpyObj<SnackbarService>;
  let router: jasmine.SpyObj<Router>;
  let translateService: jasmine.SpyObj<TranslateService>;

  beforeEach(async () => {
    const commonSpy = jasmine.createSpyObj('CommonService', ['getLookupResults']);
    const productSpy = jasmine.createSpyObj('ProductService', ['createProduct']);
    const snackbarSpy = jasmine.createSpyObj('SnackbarService', ['showSuccess', 'showError']);
    const routerSpy = jasmine.createSpyObj('Router', ['navigate']);
    const translateSpy = jasmine.createSpyObj('TranslateService', ['instant']);

    await TestBed.configureTestingModule({
      declarations: [CreateProductComponent],
      imports: [ReactiveFormsModule],
      providers: [
        { provide: CommonService, useValue: commonSpy },
        { provide: ProductService, useValue: productSpy },
        { provide: SnackbarService, useValue: snackbarSpy },
        { provide: Router, useValue: routerSpy },
        { provide: TranslateService, useValue: translateSpy },
      ],
    }).compileComponents();

    commonService = TestBed.inject(CommonService) as jasmine.SpyObj<CommonService>;
    productService = TestBed.inject(ProductService) as jasmine.SpyObj<ProductService>;
    snackbarService = TestBed.inject(SnackbarService) as jasmine.SpyObj<SnackbarService>;
    router = TestBed.inject(Router) as jasmine.SpyObj<Router>;
    translateService = TestBed.inject(TranslateService) as jasmine.SpyObj<TranslateService>;
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CreateProductComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create component', () => {
    expect(component).toBeTruthy();
  });

  it('should initialize product form with default values', () => {
    const form = component.productForm;
    expect(form).toBeTruthy();
    expect(form.get('productTypeId')?.value).toBe('FINISHED_GOOD');
  });

  it('should fetch product types on init', () => {
    commonService.getLookupResults.and.returnValue(of([{ productTypeId: 'FINISHED_GOOD' }]));

    component.fetchProductTypes();

    expect(commonService.getLookupResults).toHaveBeenCalledWith({}, 'product_type');
    expect(component.productTypes.length).toBe(1);
  });

  it('should show error if fetch product types fails', () => {
    translateService.instant.and.returnValue('Error fetching types');
    commonService.getLookupResults.and.returnValue(throwError(() => new Error()));

    component.fetchProductTypes();

    expect(snackbarService.showError).toHaveBeenCalledWith('Error fetching types');
  });

  it('should not submit if form is invalid', () => {
    component.productForm.get('productName')?.setValue('');
    component.createProduct();
    expect(productService.createProduct).not.toHaveBeenCalled();
  });

  it('should submit product and navigate on success', fakeAsync(() => {
    const formData = {
      productName: 'Product 1',
      productTypeId: 'FINISHED_GOOD',
      price: 10,
      description: '',
    };

    translateService.instant.and.returnValue('Created');
    component.productForm.setValue(formData);
    productService.createProduct.and.returnValue(of({ product: { productId: 'P001' } }));

    component.createProduct();
    tick();

    expect(productService.createProduct).toHaveBeenCalledWith(formData);
    expect(snackbarService.showSuccess).toHaveBeenCalledWith('Created');
    expect(router.navigate).toHaveBeenCalledWith(['/products/P001']);
    expect(component.isLoading).toBeFalse();
  }));

  it('should show error message if product creation returns no productId', fakeAsync(() => {
    translateService.instant.and.returnValue('Failed');
    component.productForm.setValue({
      productName: 'Test',
      productTypeId: 'FINISHED_GOOD',
      price: 10,
      description: '',
    });

    productService.createProduct.and.returnValue(of({}));

    component.createProduct();
    tick();

    expect(snackbarService.showError).toHaveBeenCalledWith('Failed');
  }));

  it('should handle error on product creation', fakeAsync(() => {
    translateService.instant.and.returnValue('Create error');
    component.productForm.setValue({
      productName: 'Test',
      productTypeId: 'FINISHED_GOOD',
      price: 10,
      description: '',
    });

    productService.createProduct.and.returnValue(throwError(() => new Error()));

    component.createProduct();
    tick();

    expect(snackbarService.showError).toHaveBeenCalledWith('Create error');
  }));
});
