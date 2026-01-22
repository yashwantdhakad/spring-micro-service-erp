import { ComponentFixture, TestBed } from '@angular/core/testing';
import { AddEditProductPriceComponent } from './add-edit-product-price.component';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { ReactiveFormsModule } from '@angular/forms';
import { CommonService } from 'src/app/services/common/common.service';
import { ProductService } from 'src/app/services/product/product.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';
import { of, throwError } from 'rxjs';

describe('AddEditProductPriceComponent', () => {
  let component: AddEditProductPriceComponent;
  let fixture: ComponentFixture<AddEditProductPriceComponent>;

  const mockDialogRef = jasmine.createSpyObj('MatDialogRef', ['close']);
  const mockCommonService = jasmine.createSpyObj('CommonService', ['getUoms']);
  const mockProductService = jasmine.createSpyObj('ProductService', ['addProductPrice', 'updateProductPrice']);
  const mockSnackbarService = jasmine.createSpyObj('SnackbarService', ['showSuccess', 'showError']);

  const mockData = {
    productPriceData: {
      productId: 'PROD-1',
      price: 100,
      pricePurposeEnums: [{ enumId: 'PppPurchase' }],
      priceTypeEnums: [{ enumId: 'PptCurrent' }],
    },
  };

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ReactiveFormsModule],
      declarations: [AddEditProductPriceComponent],
      providers: [
        { provide: MatDialogRef, useValue: mockDialogRef },
        { provide: MAT_DIALOG_DATA, useValue: mockData },
        { provide: CommonService, useValue: mockCommonService },
        { provide: ProductService, useValue: mockProductService },
        { provide: SnackbarService, useValue: mockSnackbarService },
      ],
    }).compileComponents();

    fixture = TestBed.createComponent(AddEditProductPriceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create the component and initialize form', () => {
    expect(component).toBeTruthy();
    expect(component.addUpdateProductPriceForm.value.productId).toEqual('PROD-1');
  });

  it('should fetch UOMs on init', () => {
    const mockUoms = [{ uomId: 'USD', description: 'Dollar' }];
    mockCommonService.getUoms.and.returnValue(of(mockUoms));

    component.getUoms();

    expect(mockCommonService.getUoms).toHaveBeenCalledWith('UT_CURRENCY_MEASURE');
  });

  it('should call addProductPrice on submit when productPriceId is not present', () => {
    mockProductService.addProductPrice.and.returnValue(of({}));

    component.addUpdateProductPriceForm.patchValue({ price: 150, priceUomId: 'USD' });
    component.addUpdateProductPrice();

    expect(mockProductService.addProductPrice).toHaveBeenCalled();
    expect(mockSnackbarService.showSuccess).toHaveBeenCalledWith('Product price added successfully.');
    expect(mockDialogRef.close).toHaveBeenCalled();
  });

  it('should call updateProductPrice when productPriceId is present', () => {
    component.addUpdateProductPriceForm.patchValue({
      productPriceId: 'PRICE-001',
      price: 200,
      priceUomId: 'USD',
    });

    mockProductService.updateProductPrice.and.returnValue(of({}));

    component.addUpdateProductPrice();

    expect(mockProductService.updateProductPrice).toHaveBeenCalled();
    expect(mockSnackbarService.showSuccess).toHaveBeenCalledWith('Product price updated successfully.');
    expect(mockDialogRef.close).toHaveBeenCalled();
  });

  it('should show error snackbar when add/update fails', () => {
    mockProductService.addProductPrice.and.returnValue(throwError(() => new Error('Failure')));

    component.addUpdateProductPriceForm.patchValue({ price: 123, priceUomId: 'USD' });
    component.addUpdateProductPrice();

    expect(mockSnackbarService.showError).toHaveBeenCalledWith('Error adding/updating product price.');
  });
});
