import { ComponentFixture, fakeAsync, TestBed, tick } from '@angular/core/testing';
import { ProductContentComponent } from './product-content.component';
import { ReactiveFormsModule } from '@angular/forms';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { ProductService } from 'src/app/services/product/product.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';
import { TranslateModule, TranslateService } from '@ngx-translate/core';
import { of, throwError } from 'rxjs';
import { By } from '@angular/platform-browser';

describe('ProductContentComponent', () => {
  let component: ProductContentComponent;
  let fixture: ComponentFixture<ProductContentComponent>;

  const mockDialogRef = jasmine.createSpyObj('MatDialogRef', ['close']);
  const mockProductService = jasmine.createSpyObj('ProductService', ['createProductContent']);
  const mockSnackbarService = jasmine.createSpyObj('SnackbarService', ['showSuccess', 'showError']);

  const mockData = {
    contentData: { productId: 'PROD-123' }
  };

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ProductContentComponent],
      imports: [ReactiveFormsModule, TranslateModule.forRoot()],
      providers: [
        { provide: MatDialogRef, useValue: mockDialogRef },
        { provide: MAT_DIALOG_DATA, useValue: mockData },
        { provide: ProductService, useValue: mockProductService },
        { provide: SnackbarService, useValue: mockSnackbarService },
        TranslateService
      ]
    }).compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ProductContentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create the component and form', () => {
    expect(component).toBeTruthy();
    expect(component.fileForm).toBeDefined();
  });

  it('should update form control on file change', () => {
    const mockFile = new File(['content'], 'test.txt', { type: 'text/plain' });
    const event = { target: { files: [mockFile] } };

    component.onFileChange(event);
    expect(component.fileForm.get('contentFile')?.value).toBe(mockFile);
  });

  it('should call createProductContent and close dialog on success', () => {
    const mockFile = new File(['file content'], 'file.pdf', { type: 'application/pdf' });
    component.fileForm.get('contentFile')?.setValue(mockFile);

    mockProductService.createProductContent.and.returnValue(of({}));

    component.createProductContent();

    expect(mockProductService.createProductContent).toHaveBeenCalledWith(
      mockData.contentData.productId,
      jasmine.any(FormData)
    );
    expect(mockSnackbarService.showSuccess).toHaveBeenCalled();
    expect(mockDialogRef.close).toHaveBeenCalledWith(mockData.contentData);
  });

  it('should show error on failed upload', fakeAsync(() => {
    const file = new File([''], 'test-file.pdf', { type: 'application/pdf' });

    const inputDebugEl = fixture.debugElement.query(By.css('input[type="file"]'));
    const inputEl = inputDebugEl.nativeElement;

    // Trigger change event with FileList
    const event = {
      target: {
        files: [file]
      }
    };

    component.onFileChange(event);
    fixture.detectChanges();

    // Simulate a failed upload
    spyOn(mockProductService, 'createProductContent').and.returnValue(throwError(() => new Error('Upload failed')));
    component.createProductContent();
    tick();

    expect(mockSnackbarService.showError).toHaveBeenCalled();
  }));

});
