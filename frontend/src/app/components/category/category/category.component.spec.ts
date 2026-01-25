import { ComponentFixture, TestBed, fakeAsync, tick } from '@angular/core/testing';
import { of, throwError } from 'rxjs';
import { CategoryComponent } from './category.component';
import { CategoryService } from 'src/app/services/category/category.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';
import { ReactiveFormsModule } from '@angular/forms';

describe('CategoryComponent', () => {
  let component: CategoryComponent;
  let fixture: ComponentFixture<CategoryComponent>;
  let categoryService: jasmine.SpyObj<CategoryService>;
  let snackbarService: jasmine.SpyObj<SnackbarService>;

  beforeEach(async () => {
    const categorySpy = jasmine.createSpyObj('CategoryService', ['getCategories']);
    const snackbarSpy = jasmine.createSpyObj('SnackbarService', ['showError']);

    await TestBed.configureTestingModule({
      imports: [ReactiveFormsModule],
      declarations: [CategoryComponent],
      providers: [
        { provide: CategoryService, useValue: categorySpy },
        { provide: SnackbarService, useValue: snackbarSpy },
      ],
    }).compileComponents();

    categoryService = TestBed.inject(CategoryService) as jasmine.SpyObj<CategoryService>;
    snackbarService = TestBed.inject(SnackbarService) as jasmine.SpyObj<SnackbarService>;
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CategoryComponent);
    component = fixture.componentInstance;
  });

  it('should create component', () => {
    expect(component).toBeTruthy();
  });

  it('should call getCategories on ngOnInit and load data', fakeAsync(() => {
    const mockHeaders = new Headers();
    mockHeaders.append('x-total-count', '100');
    const mockResponse = {
      body: [{ productCategoryId: 'CAT1', categoryName: 'Electronics' }],
      headers: { get: () => '100' },
    };

    categoryService.getCategories.and.returnValue(of(mockResponse));
    fixture.detectChanges();
    tick(300); // For debounce

    expect(component.items.length).toBe(1);
    expect(component.pages).toBe(100);
    expect(component.isLoading).toBeFalse();
  }));

  it('should handle error in getCategories', fakeAsync(() => {
    categoryService.getCategories.and.returnValue(throwError(() => new Error('API failure')));

    fixture.detectChanges();
    tick(300);

    expect(snackbarService.showError).toHaveBeenCalledWith('Error fetching categories');
    expect(component.isLoading).toBeFalse();
  }));

  it('should update queryString and call getCategories on search', fakeAsync(() => {
    const response = {
      body: [{ productCategoryId: 'CAT1' }],
      headers: { get: () => '1' },
    };

    categoryService.getCategories.and.returnValue(of(response));
    fixture.detectChanges();
    component.searchControl.setValue('Test');
    tick(300);

    expect(categoryService.getCategories).toHaveBeenCalledWith(0, 'Test');
  }));

  it('should return correct column keys', () => {
    const keys = component.getColumnKeys();
    expect(keys).toEqual(['productCategoryId', 'categoryName', 'productCategoryTypeId']);
  });
});
