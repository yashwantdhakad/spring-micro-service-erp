import { ComponentFixture, TestBed, fakeAsync, tick } from '@angular/core/testing';
import { of, throwError } from 'rxjs';
import { ProductComponent } from './product.component';
import { ProductService } from 'src/app/services/product/product.service';

describe('ProductComponent', () => {
  let component: ProductComponent;
  let fixture: ComponentFixture<ProductComponent>;
  let productService: jasmine.SpyObj<ProductService>;

  const mockProducts = {
    documentList: [
      { id: 'P001', name: 'Product 1', type: 'Type A', assetClass: 'Class A', assetType: 'Asset X' },
      { id: 'P002', name: 'Product 2', type: 'Type B', assetClass: 'Class B', assetType: 'Asset Y' }
    ],
    documentListCount: 20
  };

  beforeEach(async () => {
    const productServiceSpy = jasmine.createSpyObj('ProductService', ['getProducts']);

    await TestBed.configureTestingModule({
      declarations: [ProductComponent],
      providers: [
        { provide: ProductService, useValue: productServiceSpy }
      ]
    }).compileComponents();

    productService = TestBed.inject(ProductService) as jasmine.SpyObj<ProductService>;
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ProductComponent);
    component = fixture.componentInstance;
  });

  it('should create the component', () => {
    expect(component).toBeTruthy();
  });

  it('should define displayed columns correctly', () => {
    expect(component.displayedColumns).toEqual(['id', 'name', 'type', 'assetClass', 'assetType']);
  });

  it('should call getProducts on init', fakeAsync(() => {
    productService.getProducts.and.returnValue(of(mockProducts));
    fixture.detectChanges(); // triggers ngOnInit
    tick();

    expect(productService.getProducts).toHaveBeenCalledWith(0, '');
    expect(component.items.length).toBe(2);
    expect(component.pages).toBe(20);
    expect(component.isLoading).toBeFalse();
  }));

  it('should handle getProducts success', fakeAsync(() => {
    productService.getProducts.and.returnValue(of(mockProducts));
    component.getProducts(1, '');
    tick();

    expect(component.items.length).toBe(2);
    expect(component.pages).toBe(20);
    expect(component.isLoading).toBeFalse();
  }));

  it('should handle getProducts error', fakeAsync(() => {
    productService.getProducts.and.returnValue(throwError(() => new Error('Failed')));
    component.getProducts(1, 'test');
    tick();

    expect(component.items).toEqual([]);
    expect(component.pages).toBe(0);
    expect(component.isLoading).toBeFalse();
  }));
});
