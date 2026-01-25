import { ComponentFixture, TestBed, fakeAsync, tick } from '@angular/core/testing';
import { of, throwError } from 'rxjs';
import { ActivatedRoute } from '@angular/router';
import { MatDialog } from '@angular/material/dialog';
import { CategoryService } from 'src/app/services/category/category.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';
import { CategoryDetailComponent } from './category-detail.component';

describe('CategoryDetailComponent', () => {
  let component: CategoryDetailComponent;
  let fixture: ComponentFixture<CategoryDetailComponent>;
  let categoryService: jasmine.SpyObj<CategoryService>;
  let snackbarService: jasmine.SpyObj<SnackbarService>;
  let dialog: jasmine.SpyObj<MatDialog>;

  const mockRoute = {
    params: of({ productCategoryId: 'CAT123' }),
  };

  beforeEach(async () => {
    const categorySpy = jasmine.createSpyObj('CategoryService', ['getCategory', 'deleteProductCategory']);
    const snackbarSpy = jasmine.createSpyObj('SnackbarService', ['showSuccess', 'showError']);
    const dialogSpy = jasmine.createSpyObj('MatDialog', ['open']);

    await TestBed.configureTestingModule({
      declarations: [CategoryDetailComponent],
      providers: [
        { provide: CategoryService, useValue: categorySpy },
        { provide: SnackbarService, useValue: snackbarSpy },
        { provide: MatDialog, useValue: dialogSpy },
        { provide: ActivatedRoute, useValue: mockRoute },
      ],
    }).compileComponents();

    categoryService = TestBed.inject(CategoryService) as jasmine.SpyObj<CategoryService>;
    snackbarService = TestBed.inject(SnackbarService) as jasmine.SpyObj<SnackbarService>;
    dialog = TestBed.inject(MatDialog) as jasmine.SpyObj<MatDialog>;
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CategoryDetailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create the component', () => {
    expect(component).toBeTruthy();
  });

  it('should call getCategory on init with route param', fakeAsync(() => {
    categoryService.getCategory.and.returnValue(of({
      products: [{ productId: 'P1' }],
    }));

    tick(); // simulate async
    expect(categoryService.getCategory).toHaveBeenCalledWith('CAT123');
    expect(component.products.length).toBe(1);
    expect(component.isLoading).toBeFalse();
  }));

  it('should handle error in getCategory', fakeAsync(() => {
    categoryService.getCategory.and.returnValue(throwError(() => new Error('Failed')));

    component.getCategory('CAT123');
    tick();

    expect(snackbarService.showError).toHaveBeenCalledWith('Error fetching products');
  }));

  it('should open addProductToCategoryDialog and refresh if dialog returns result', fakeAsync(() => {
    const dialogRef = { afterClosed: () => of({ productCategoryId: 'CAT123' }) };
    spyOn(dialogRef, 'afterClosed').and.callThrough();
    dialog.open.and.returnValue(dialogRef as any);

    categoryService.getCategory.and.returnValue(of({ products: [] }));

    component.addProductToCategoryDialog();
    tick();

    expect(dialog.open).toHaveBeenCalled();
    expect(categoryService.getCategory).toHaveBeenCalledWith('CAT123');
  }));

  it('should open editCategoryDialog and refresh on success', fakeAsync(() => {
    const dialogRef = { afterClosed: () => of({ productCategoryId: 'CAT123' }) };
    dialog.open.and.returnValue(dialogRef as any);

    categoryService.getCategory.and.returnValue(of({ products: [] }));

    component.editCategoryDialog();
    tick();

    expect(dialog.open).toHaveBeenCalled();
    expect(categoryService.getCategory).toHaveBeenCalledWith('CAT123');
  }));

  it('should handle deleteProductCategoryDialog with confirm', fakeAsync(() => {
    const dialogRef = {
      afterClosed: () => of(true),
      close: () => {},
    };
    dialog.open.and.returnValue(dialogRef as any);

    categoryService.deleteProductCategory.and.returnValue(of(undefined));
    categoryService.getCategory.and.returnValue(of({ products: [] }));

    component.deleteProductCategoryDialog({ productCategoryId: 'CAT123' });
    tick();

    expect(categoryService.deleteProductCategory).toHaveBeenCalled();
    expect(snackbarService.showSuccess).toHaveBeenCalledWith('Product deleted successfully');
  }));

  it('should handle deleteProductCategoryDialog error', fakeAsync(() => {
    const dialogRef = {
      afterClosed: () => of(true),
      close: () => {},
    };
    dialog.open.and.returnValue(dialogRef as any);

    categoryService.deleteProductCategory.and.returnValue(throwError(() => new Error('error')));

    component.deleteProductCategoryDialog({ productCategoryId: 'CAT123' });
    tick();

    expect(snackbarService.showError).toHaveBeenCalledWith('Error deleting product');
  }));

  it('should not delete if confirmation is cancelled', fakeAsync(() => {
    const dialogRef = {
      afterClosed: () => of(false),
      close: () => {},
    };
    dialog.open.and.returnValue(dialogRef as any);

    component.deleteProductCategoryDialog({ productCategoryId: 'CAT123' });
    tick();
    expect(categoryService.deleteProductCategory).not.toHaveBeenCalled();
  }));

  it('should return product column keys', () => {
    const keys = component.getProductColumnKeys();
    expect(keys).toEqual(['productId', 'product.productName', 'fromDate', 'sequenceNum', 'action']);
  });

  it('should return correct value for dot notation keys in getValue', () => {
    const product = {
      productId: 'P1',
      product: { productName: 'Sample' },
    };

    expect(component.getValue(product, 'product.productName')).toBe('Sample');
    expect(component.getValue(product, 'product.missingKey')).toBe('');
  });
});
