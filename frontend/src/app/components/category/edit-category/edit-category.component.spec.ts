import { ComponentFixture, TestBed, fakeAsync, tick } from '@angular/core/testing';
import { EditCategoryComponent } from './edit-category.component';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';
import { CategoryService } from 'src/app/services/category/category.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';
import { ReactiveFormsModule } from '@angular/forms';
import { of, throwError } from 'rxjs';

describe('EditCategoryComponent', () => {
  let component: EditCategoryComponent;
  let fixture: ComponentFixture<EditCategoryComponent>;
  let categoryServiceSpy: jasmine.SpyObj<CategoryService>;
  let snackbarServiceSpy: jasmine.SpyObj<SnackbarService>;
  let dialogRefSpy: jasmine.SpyObj<MatDialogRef<EditCategoryComponent>>;

  const mockData = {
    categoryDetail: {
      productCategoryId: 'CAT1001',
      categoryName: 'Electronics',
      description: 'Electronic items',
    },
  };

  beforeEach(async () => {
    categoryServiceSpy = jasmine.createSpyObj('CategoryService', ['updateCategory']);
    snackbarServiceSpy = jasmine.createSpyObj('SnackbarService', ['showSuccess', 'showError']);
    dialogRefSpy = jasmine.createSpyObj('MatDialogRef', ['close']);

    await TestBed.configureTestingModule({
      imports: [ReactiveFormsModule],
      declarations: [EditCategoryComponent],
      providers: [
        { provide: MAT_DIALOG_DATA, useValue: mockData },
        { provide: CategoryService, useValue: categoryServiceSpy },
        { provide: SnackbarService, useValue: snackbarServiceSpy },
        { provide: MatDialogRef, useValue: dialogRefSpy },
      ],
    }).compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EditCategoryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create EditCategoryComponent', () => {
    expect(component).toBeTruthy();
  });

  it('should initialize form with provided data', () => {
    const formValue = component.updateCategoryForm.value;
    expect(formValue.productCategoryId).toBe(mockData.categoryDetail.productCategoryId);
    expect(formValue.categoryName).toBe(mockData.categoryDetail.categoryName);
    expect(formValue.description).toBe(mockData.categoryDetail.description);
  });

  it('should call updateCategory() and close dialog on success', fakeAsync(() => {
    categoryServiceSpy.updateCategory.and.returnValue(of({ success: true }));

    component.updateCategoryForm.setValue({
      productCategoryId: 'CAT1001',
      categoryName: 'Updated Name',
      description: 'Updated description',
    });

    component.updateCategory();
    tick(); // simulate async

    expect(categoryServiceSpy.updateCategory).toHaveBeenCalled();
    expect(snackbarServiceSpy.showSuccess).toHaveBeenCalledWith('Category updated successfully.');
    expect(dialogRefSpy.close).toHaveBeenCalledWith(jasmine.objectContaining({
      categoryName: 'Updated Name',
    }));
  }));

  it('should show error if updateCategory fails', fakeAsync(() => {
    categoryServiceSpy.updateCategory.and.returnValue(of('API error'));

    component.updateCategory();
    tick(); // simulate async

    expect(snackbarServiceSpy.showError).toHaveBeenCalledWith('Failed to update category.');
    expect(dialogRefSpy.close).not.toHaveBeenCalled();
  }));
});
