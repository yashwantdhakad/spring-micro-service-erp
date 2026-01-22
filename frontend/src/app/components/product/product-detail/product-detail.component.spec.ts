import { ComponentFixture, TestBed } from '@angular/core/testing';
import { ProductDetailComponent } from './product-detail.component';
import { ProductService } from 'src/app/services/product/product.service';
import { ActivatedRoute } from '@angular/router';
import { of, throwError } from 'rxjs';
import { MatDialog } from '@angular/material/dialog';
import { TranslateModule, TranslateService } from '@ngx-translate/core';
import { Store, StoreModule } from '@ngrx/store';
import { provideMockStore, MockStore } from '@ngrx/store/testing';

describe('ProductDetailComponent', () => {
  let component: ProductDetailComponent;
  let fixture: ComponentFixture<ProductDetailComponent>;
  let productServiceSpy: jasmine.SpyObj<ProductService>;
  let dialogSpy: jasmine.SpyObj<MatDialog>;
  let mockStore: MockStore;
  let translate: TranslateService;

  const mockActivatedRoute = {
    params: of({ productId: 'PROD-1' })
  };

  const productResponseMock = {
    productId: 'PROD-1',
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

    dialogSpy = jasmine.createSpyObj('MatDialog', ['open']);

    await TestBed.configureTestingModule({
      declarations: [ProductDetailComponent],
      imports: [TranslateModule.forRoot()],
      providers: [
        { provide: ProductService, useValue: productServiceSpy },
        { provide: MatDialog, useValue: dialogSpy },
        { provide: ActivatedRoute, useValue: mockActivatedRoute },
        provideMockStore({}),
        TranslateService
      ]
    }).compileComponents();

    fixture = TestBed.createComponent(ProductDetailComponent);
    component = fixture.componentInstance;
    mockStore = TestBed.inject(Store) as MockStore;
    translate = TestBed.inject(TranslateService);
  });

  it('should create the component', () => {
    expect(component).toBeTruthy();
  });

  it('should load product on init', () => {
    productServiceSpy.getProduct.and.returnValue(of(productResponseMock));

    fixture.detectChanges();

    expect(component.productDetail).toEqual(productResponseMock);
    expect(component.prices.length).toBe(1);
    expect(component.categories.length).toBe(1);
  });

  it('should handle getProduct error', () => {
    const consoleSpy = spyOn(console, 'error');
    productServiceSpy.getProduct.and.returnValue(throwError(() => new Error('API error')));

    component.getProduct('PROD-1');

    expect(consoleSpy).toHaveBeenCalledWith('Error fetching product details:', jasmine.any(Error));
  });

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
