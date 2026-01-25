import { ComponentFixture, TestBed, fakeAsync, tick } from '@angular/core/testing';
import { ProductDetailComponent } from './product-detail.component';
import { ProductService } from 'src/app/services/product/product.service';
import { ActivatedRoute } from '@angular/router';
import { of, throwError } from 'rxjs';
import { MatDialog } from '@angular/material/dialog';
import { TranslateModule, TranslateService } from '@ngx-translate/core';
import { Store } from '@ngrx/store';
import { provideMockStore, MockStore } from '@ngrx/store/testing';
import { CommonService } from 'src/app/services/common/common.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';

describe('ProductDetailComponent', () => {
  let component: ProductDetailComponent;
  let fixture: ComponentFixture<ProductDetailComponent>;
  let productServiceSpy: jasmine.SpyObj<ProductService>;
  let dialogSpy: jasmine.SpyObj<MatDialog>;
  let mockStore: MockStore;
  let translate: TranslateService;
  let commonServiceSpy: jasmine.SpyObj<CommonService>;
  let snackbarSpy: jasmine.SpyObj<SnackbarService>;

  const mockActivatedRoute = {
    params: of({ productId: 'PROD-1' })
  };

  const productResponseMock = {
    product: { productId: 'PROD-1' },
    prices: [{ price: 99 }],
    categories: [{ categoryName: 'Electronics' }],
    contents: [{ contentLocation: 'file.pdf' }],
    assocs: [],
    toAssocs: []
  };

  beforeEach(async () => {
    productServiceSpy = jasmine.createSpyObj('ProductService', [
      'getProduct',
      'deleteProductPrice'
    ]);
    commonServiceSpy = jasmine.createSpyObj('CommonService', ['getLookupResults']);
    snackbarSpy = jasmine.createSpyObj('SnackbarService', ['showError']);

    dialogSpy = jasmine.createSpyObj('MatDialog', ['open']);

    await TestBed.configureTestingModule({
      declarations: [ProductDetailComponent],
      imports: [TranslateModule.forRoot()],
      providers: [
        { provide: ProductService, useValue: productServiceSpy },
        { provide: MatDialog, useValue: dialogSpy },
        { provide: ActivatedRoute, useValue: mockActivatedRoute },
        { provide: CommonService, useValue: commonServiceSpy },
        { provide: SnackbarService, useValue: snackbarSpy },
        provideMockStore({}),
        TranslateService
      ]
    }).compileComponents();

    fixture = TestBed.createComponent(ProductDetailComponent);
    component = fixture.componentInstance;
    mockStore = TestBed.inject(Store) as MockStore;
    translate = TestBed.inject(TranslateService);
    commonServiceSpy.getLookupResults.and.returnValue(of([]));
  });

  it('should create the component', () => {
    expect(component).toBeTruthy();
  });

  it('should load product on init', () => {
    commonServiceSpy.getLookupResults.and.returnValue(of([]));
    productServiceSpy.getProduct.and.returnValue(of(productResponseMock));

    fixture.detectChanges();

    expect(component.productDetail).toEqual(productResponseMock.product);
    expect(component.prices.length).toBe(1);
    expect(component.categories.length).toBe(1);
  });

  it('should handle getProduct error', fakeAsync(() => {
    commonServiceSpy.getLookupResults.and.returnValue(of([]));
    productServiceSpy.getProduct.and.returnValue(throwError(() => new Error('API error')));

    component.getProduct('PROD-1');
    tick();

    expect(component.isLoading).toBeFalse();
  }));

  it('should open dialog for price and reload on success', () => {
    const afterClosedMock = of({ productId: 'PROD-1' });
    dialogSpy.open.and.returnValue({ afterClosed: () => afterClosedMock } as any);
    productServiceSpy.getProduct.and.returnValue(of(productResponseMock));

    component.addUpdateProductPriceDialog();

    expect(dialogSpy.open).toHaveBeenCalled();
  });

  it('should open delete dialog and delete price on confirm', () => {
    const afterClosedMock = of(true);
    const deleteParams = { productId: 'PROD-1' };

    dialogSpy.open.and.returnValue({ afterClosed: () => afterClosedMock } as any);
    productServiceSpy.deleteProductPrice.and.returnValue(of({}));
    productServiceSpy.getProduct.and.returnValue(of(productResponseMock));

    component.deleteProductPriceDialog(deleteParams);

    expect(dialogSpy.open).toHaveBeenCalled();
    expect(productServiceSpy.deleteProductPrice).toHaveBeenCalledWith(deleteParams);
  });
});
