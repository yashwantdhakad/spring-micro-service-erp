import { ComponentFixture, TestBed } from '@angular/core/testing';
import { ContentComponent } from './content.component';
import { FormBuilder, ReactiveFormsModule } from '@angular/forms';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';
import { OrderService } from 'src/app/services/order/order.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';
import { of, throwError } from 'rxjs';

describe('ContentComponent', () => {
  let component: ContentComponent;
  let fixture: ComponentFixture<ContentComponent>;
  let orderServiceSpy: jasmine.SpyObj<OrderService>;
  let snackbarSpy: jasmine.SpyObj<SnackbarService>;
  let dialogRefSpy: jasmine.SpyObj<MatDialogRef<ContentComponent>>;

  const mockData = { contentData: { orderId: 'ORDER-123' } };

  beforeEach(async () => {
    orderServiceSpy = jasmine.createSpyObj('OrderService', ['createOrderContent']);
    snackbarSpy = jasmine.createSpyObj('SnackbarService', ['showSuccess', 'showError']);
    dialogRefSpy = jasmine.createSpyObj('MatDialogRef', ['close']);

    await TestBed.configureTestingModule({
      declarations: [ContentComponent],
      imports: [ReactiveFormsModule],
      providers: [
        FormBuilder,
        { provide: OrderService, useValue: orderServiceSpy },
        { provide: SnackbarService, useValue: snackbarSpy },
        { provide: MatDialogRef, useValue: dialogRefSpy },
        { provide: MAT_DIALOG_DATA, useValue: mockData }
      ]
    }).compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ContentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create the component and initialize form', () => {
    expect(component).toBeTruthy();
    expect(component.fileForm).toBeDefined();
  });

  it('should set file input on change', () => {
    const file = new File(['dummy content'], 'test.txt');
    const event = { target: { files: [file] } };

    component.onFileChange(event);
    expect(component.fileForm.get('contentFile')?.value).toBe(file);
  });

  it('should call orderService and show success message on valid form submit', () => {
    const file = new File(['test'], 'file.txt');
    component.fileForm.setValue({
      contentFile: file,
      description: 'Sample file upload'
    });

    orderServiceSpy.createOrderContent.and.returnValue(of({}));

    component.createOrderContent();

    expect(orderServiceSpy.createOrderContent).toHaveBeenCalled();
    expect(snackbarSpy.showSuccess).toHaveBeenCalledWith('Order content created successfully.');
    expect(dialogRefSpy.close).toHaveBeenCalledWith(true);
  });

  it('should show error message on upload failure', () => {
    const file = new File(['test'], 'file.txt');
    component.fileForm.setValue({
      contentFile: file,
      description: 'Failed upload'
    });

    orderServiceSpy.createOrderContent.and.returnValue(throwError(() => new Error('Upload failed')));

    component.createOrderContent();

    expect(orderServiceSpy.createOrderContent).toHaveBeenCalled();
    expect(snackbarSpy.showError).toHaveBeenCalledWith('Error in uploading order content');
    expect(dialogRefSpy.close).not.toHaveBeenCalled();
  });
});
