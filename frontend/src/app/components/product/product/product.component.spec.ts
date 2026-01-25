import { ComponentFixture, TestBed, fakeAsync, tick } from '@angular/core/testing';
import { of, throwError } from 'rxjs';
import { ProductComponent } from './product.component';
import { ProductService } from 'src/app/services/product/product.service';
import { ReactiveFormsModule } from '@angular/forms';

describe('ProductComponent', () => {
  let component: ProductComponent;
  let fixture: ComponentFixture<ProductComponent>;
  let productService: jasmine.SpyObj<ProductService>;

  const mockProducts = {
    documentList: [
      { productId: 'P001', productName: 'Product 1', productTypeId: 'Type A' },
      { productId: 'P002', productName: 'Product 2', productTypeId: 'Type B' }
    ],
    documentListCount: 20
  };

  beforeEach(async () => {
    const productServiceSpy = jasmine.createSpyObj('ProductService', ['getProducts']);

    await TestBed.configureTestingModule({
      imports: [ReactiveFormsModule],
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

  it('should define customer columns correctly', () => {
    expect(component.getCustomerColumnKeys()).toEqual(['productId', 'productName', 'productTypeId']);
  });

  it('should call getProducts on init', fakeAsync(() => {
    productService.getProducts.and.returnValue(of(mockProducts));
    fixture.detectChanges(); // triggers ngOnInit
    tick(300);

    expect(productService.getProducts).toHaveBeenCalledWith(0, '');
    expect(component.items.length).toBe(2);
    expect(component.pages).toBe(20);
    expect(component.isLoading).toBeFalse();
  }));

  it('should handle page change', fakeAsync(() => {
    productService.getProducts.and.returnValue(of(mockProducts));
    component.queryString = 'test';
    component.onPageChange(1);
    tick();

    expect(productService.getProducts).toHaveBeenCalledWith(1, 'test');
  }));

  it('should handle getProducts error', fakeAsync(() => {
    productService.getProducts.and.returnValue(throwError(() => new Error('Failed')));
    fixture.detectChanges();
    tick(300);

    expect(component.items).toEqual([]);
    expect(component.pages).toBe(0);
    expect(component.isLoading).toBeFalse();
  }));
});
