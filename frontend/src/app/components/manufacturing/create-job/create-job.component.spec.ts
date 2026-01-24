import { ComponentFixture, TestBed, fakeAsync, tick } from '@angular/core/testing';
import { CreateJobComponent } from './create-job.component';
import { ReactiveFormsModule, FormsModule } from '@angular/forms';
import { Router } from '@angular/router';
import { of, throwError } from 'rxjs';
import { CommonService } from 'src/app/services/common/common.service';
import { ProductService } from 'src/app/services/product/product.service';
import { ManufacturingService } from 'src/app/services/manufacturing/manufacturing.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';

describe('CreateJobComponent', () => {
  let component: CreateJobComponent;
  let fixture: ComponentFixture<CreateJobComponent>;
  let routerSpy: jasmine.SpyObj<Router>;
  let productServiceSpy: jasmine.SpyObj<ProductService>;
  let commonServiceSpy: jasmine.SpyObj<CommonService>;
  let manufacturingServiceSpy: jasmine.SpyObj<ManufacturingService>;
  let snackbarSpy: jasmine.SpyObj<SnackbarService>;

  beforeEach(async () => {
    routerSpy = jasmine.createSpyObj('Router', ['navigate']);
    productServiceSpy = jasmine.createSpyObj('ProductService', ['getProducts']);
    commonServiceSpy = jasmine.createSpyObj('CommonService', ['getFacilities']);
    manufacturingServiceSpy = jasmine.createSpyObj('ManufacturingService', ['createJob', 'getJobBom']);
    snackbarSpy = jasmine.createSpyObj('SnackbarService', ['showError', 'showSuccess']);

    await TestBed.configureTestingModule({
      declarations: [CreateJobComponent],
      imports: [ReactiveFormsModule, FormsModule],
      providers: [
        { provide: Router, useValue: routerSpy },
        { provide: ProductService, useValue: productServiceSpy },
        { provide: CommonService, useValue: commonServiceSpy },
        { provide: ManufacturingService, useValue: manufacturingServiceSpy },
        { provide: SnackbarService, useValue: snackbarSpy },
      ],
    }).compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CreateJobComponent);
    component = fixture.componentInstance;
    manufacturingServiceSpy.getJobBom.and.returnValue(of([]));
    fixture.detectChanges();
  });

  it('should create the component', () => {
    expect(component).toBeTruthy();
  });

  it('should load facilities on init', () => {
    const mockFacilities = [{ facilityId: 'FAC001', facilityName: 'Main' }];
    commonServiceSpy.getFacilities.and.returnValue(of(mockFacilities));

    component.ngOnInit();

    expect(commonServiceSpy.getFacilities).toHaveBeenCalled();
    expect(component.facilities).toEqual(mockFacilities);
  });

  it('should handle error while loading facilities', () => {
    commonServiceSpy.getFacilities.and.returnValue(throwError(() => new Error('fail')));

    component.ngOnInit();

    expect(snackbarSpy.showError).toHaveBeenCalledWith('Error fetching facilities');
  });

  it('should search products', fakeAsync(() => {
    const mockProducts = { documentList: [{ productId: 'P001' }] };
    productServiceSpy.getProducts.and.returnValue(of(mockProducts));
    manufacturingServiceSpy.getJobBom.and.returnValue(of([]));

    component.produceProductIdControl.setValue('product');
    tick(400); // debounce time

    component.filteredProducts$.subscribe((products) => {
      expect(products).toEqual(mockProducts.documentList);
    });
  }));

  it('should create job on valid form', () => {
    const mockResponse = { workEffortId: 'WE123' };
    manufacturingServiceSpy.createJob.and.returnValue(of(mockResponse));

    component.createJobForm.setValue({
      purposeEnumId: 'WepProductionRun',
      workEffortName: 'Test Job',
      facilityId: 'FAC001',
      estimatedStartDate: '',
      estimatedWorkDuration: '',
      produceProductId: 'PROD001',
      produceEstimatedQuantity: 10,
      produceEstimatedAmount: ''
    });

    component.createJob();

    expect(manufacturingServiceSpy.createJob).toHaveBeenCalledWith(jasmine.objectContaining({
      consumeItems: [],
    }));
    expect(routerSpy.navigate).toHaveBeenCalledWith(['/jobs/WE123']);
    expect(snackbarSpy.showSuccess).toHaveBeenCalledWith('Production run created successfully');
  });

  it('should show error if create job fails', () => {
    manufacturingServiceSpy.createJob.and.returnValue(throwError(() => new Error('fail')));

    component.createJobForm.patchValue({
      workEffortName: 'test',
      facilityId: 'fac1',
      produceProductId: 'prod1',
      produceEstimatedQuantity: 5,
    });

    component.createJob();

    expect(snackbarSpy.showError).toHaveBeenCalledWith('Error creating production run');
  });
});
