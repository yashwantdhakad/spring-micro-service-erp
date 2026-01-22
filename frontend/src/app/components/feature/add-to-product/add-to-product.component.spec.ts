import { ComponentFixture, TestBed, fakeAsync, tick } from '@angular/core/testing';
import { AddToProductComponent } from './add-to-product.component';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { FormBuilder, ReactiveFormsModule } from '@angular/forms';
import { HttpClientTestingModule } from '@angular/common/http/testing';
import { of, throwError } from 'rxjs';
import { CommonService } from 'src/app/services/common/common.service';
import { FeatureService } from 'src/app/services/features/feature.service';
import { ProductService } from 'src/app/services/product/product.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';

describe('AddToProductComponent', () => {
  let component: AddToProductComponent;
  let fixture: ComponentFixture<AddToProductComponent>;
  let mockCommonService: jasmine.SpyObj<CommonService>;
  let mockFeatureService: jasmine.SpyObj<FeatureService>;
  let mockProductService: jasmine.SpyObj<ProductService>;
  let mockSnackbarService: jasmine.SpyObj<SnackbarService>;

  beforeEach(async () => {
    mockCommonService = jasmine.createSpyObj('CommonService', ['getEnumTypes']);
    mockFeatureService = jasmine.createSpyObj('FeatureService', [
      'createProductFeatureAppl',
      'updateProductFeatureAppl',
    ]);
    mockProductService = jasmine.createSpyObj('ProductService', ['getProducts']);
    mockSnackbarService = jasmine.createSpyObj('SnackbarService', ['showError', 'showSuccess']);

    await TestBed.configureTestingModule({
      declarations: [AddToProductComponent],
      imports: [ReactiveFormsModule, HttpClientTestingModule],
      providers: [
        FormBuilder,
        { provide: MatDialogRef, useValue: { close: jasmine.createSpy('close') } },
        { provide: MAT_DIALOG_DATA, useValue: { featureProductData: {} } },
        { provide: CommonService, useValue: mockCommonService },
        { provide: FeatureService, useValue: mockFeatureService },
        { provide: ProductService, useValue: mockProductService },
        { provide: SnackbarService, useValue: mockSnackbarService },
      ],
    }).compileComponents();

    fixture = TestBed.createComponent(AddToProductComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create the component', () => {
    expect(component).toBeTruthy();
  });

  it('should call getEnumTypes on init', () => {
    mockCommonService.getEnumTypes.and.returnValue(of([{ id: 'test' }]));
    component.ngOnInit();
    expect(mockCommonService.getEnumTypes).toHaveBeenCalledWith('ProductFeatureApplType');
  });

  it('should show success on successful createProductFeatureAppl', () => {
    component.createProductFeatureApplForm.setValue({
      productFeatureId: 'F1',
      applTypeEnumId: 'PfatStandard',
      productId: 'P1',
      sequenceNum: 1,
      amount: 10,
      fromDate: undefined
    });
    mockFeatureService.createProductFeatureAppl.and.returnValue(of({ success: true }));

    component.createProductFeatureAppl();
    expect(mockFeatureService.createProductFeatureAppl).toHaveBeenCalled();
    expect(mockSnackbarService.showSuccess).toHaveBeenCalledWith('Product feature application created successfully');
  });

  it('should show error on failed createProductFeatureAppl', () => {
    component.createProductFeatureApplForm.setValue({
      productFeatureId: 'F1',
      applTypeEnumId: 'PfatStandard',
      productId: 'P1',
      sequenceNum: 1,
      amount: 10,
      fromDate: undefined
    });
    mockFeatureService.createProductFeatureAppl.and.returnValue(throwError(() => new Error('Error')));

    component.createProductFeatureAppl();
    expect(mockSnackbarService.showError).toHaveBeenCalledWith('Error in create/update product feature application');
  });
});
