import { ComponentFixture, TestBed } from '@angular/core/testing';
import { ProductItemComponent } from './product-item.component';
import { ReactiveFormsModule, FormBuilder } from '@angular/forms';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';
import { OrderService } from 'src/app/services/order/order.service';
import { ProductService } from 'src/app/services/product/product.service';
import { CommonService } from 'src/app/services/common/common.service';
import { of, throwError } from 'rxjs';

describe('ProductItemComponent', () => {
  let component: ProductItemComponent;
  let fixture: ComponentFixture<ProductItemComponent>;
  let orderServiceSpy: jasmine.SpyObj<OrderService>;
  let productServiceSpy: jasmine.SpyObj<ProductService>;
  let commonServiceSpy: jasmine.SpyObj<CommonService>;
  let dialogRefSpy: jasmine.SpyObj<MatDialogRef<ProductItemComponent>>;

  const mockData = {
    productItemData: {
      orderId: 'ORDER-123',
      orderPartSeqId: '0001',
      productId: 'PROD-1',
      quantity: 2,
      unitAmount: 100,
      updateExisting: false
    }
  };

  beforeEach(async () => {
    orderServiceSpy = jasmine.createSpyObj('OrderService', ['addItem', 'updateOrderNote']);
    productServiceSpy = jasmine.createSpyObj('ProductService', ['getProducts']);
    commonServiceSpy = jasmine.createSpyObj('CommonService', ['getParentEnumTypes']);
    dialogRefSpy = jasmine.createSpyObj('MatDialogRef', ['close']);

    await TestBed.configureTestingModule({
      declarations: [ProductItemComponent],
      imports: [ReactiveFormsModule],
      providers: [
        FormBuilder,
        { provide: MAT_DIALOG_DATA, useValue: mockData },
        { provide: MatDialogRef, useValue: dialogRefSpy },
        { provide: OrderService, useValue: orderServiceSpy },
        { provide: ProductService, useValue: productServiceSpy },
        { provide: CommonService, useValue: commonServiceSpy },
      ]
    }).compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ProductItemComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create the component and initialize the form', () => {
    expect(component).toBeTruthy();
    expect(component.addUpdateProductItemForm).toBeDefined();
  });

  it('should call productService for autocomplete', (done) => {
  const response = { documentList: [{ productId: 'PROD-1' }] };
  productServiceSpy.getProducts.and.returnValue(of(response));

  component.getProductsFromService('PROD-1').subscribe((result) => {
    expect(result).toEqual(response.documentList);
    done();
  });
});


  it('should call addItem and close dialog on successful submit', () => {
    orderServiceSpy.addItem.and.returnValue(of({}));
    component.addUpdateProductItemForm.patchValue({
      productId: 'PROD-1',
      quantity: 2,
      unitAmount: 100,
    });

    component.addUpdateProductItem();

    expect(orderServiceSpy.addItem).toHaveBeenCalled();
    expect(dialogRefSpy.close).toHaveBeenCalledWith(component.addUpdateProductItemForm.value);
  });

  it('should show error on addItem failure', () => {
    const errorSpy = spyOn(console, 'error');
    orderServiceSpy.addItem.and.returnValue(throwError(() => new Error('Failed')));

    component.addUpdateProductItemForm.patchValue({
      productId: 'PROD-1',
      quantity: 2,
      unitAmount: 100,
    });

    component.addUpdateProductItem();

    expect(orderServiceSpy.addItem).toHaveBeenCalled();
    expect(errorSpy).toHaveBeenCalledWith('Error saving product item:', jasmine.any(Error));
  });

  it('should fetch enum types on init', () => {
    commonServiceSpy.getParentEnumTypes.and.returnValue(of(['ENUM1']));
    component.ngOnInit();
    expect(commonServiceSpy.getParentEnumTypes).toHaveBeenCalledWith('AsClsInventory');
  });
});
