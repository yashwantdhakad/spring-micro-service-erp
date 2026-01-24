import { ComponentFixture, TestBed, fakeAsync, tick } from '@angular/core/testing';
import { CreateAssetComponent } from './create-asset.component';
import { ReactiveFormsModule, FormsModule } from '@angular/forms';
import { of, throwError } from 'rxjs';
import { Router } from '@angular/router';
import { AssetService } from 'src/app/services/asset/asset.service';
import { CommonService } from 'src/app/services/common/common.service';
import { PartyService } from 'src/app/services/party/party.service';
import { ProductService } from 'src/app/services/product/product.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';
import { HttpClientTestingModule } from '@angular/common/http/testing';

describe('CreateAssetComponent', () => {
  let component: CreateAssetComponent;
  let fixture: ComponentFixture<CreateAssetComponent>;
  let mockAssetService: jasmine.SpyObj<AssetService>;
  let mockSnackbarService: jasmine.SpyObj<SnackbarService>;
  let mockRouter = { navigate: jasmine.createSpy('navigate') };
  let mockCommonService: jasmine.SpyObj<CommonService>;

  beforeEach(async () => {
    mockAssetService = jasmine.createSpyObj('AssetService', ['receiveAsset']);
    mockSnackbarService = jasmine.createSpyObj('SnackbarService', ['showSuccess', 'showError']);
    mockCommonService = jasmine.createSpyObj('CommonService', ['getStatusItems', 'getFacilities', 'getFacilityLocations']);
    mockCommonService.getStatusItems.and.returnValue(of([]));
    mockCommonService.getFacilities.and.returnValue(of([]));
    mockCommonService.getFacilityLocations.and.returnValue(of([]));

    await TestBed.configureTestingModule({
      declarations: [CreateAssetComponent],
      imports: [ReactiveFormsModule, FormsModule, HttpClientTestingModule],
      providers: [
        { provide: AssetService, useValue: mockAssetService },
        { provide: SnackbarService, useValue: mockSnackbarService },
        { provide: Router, useValue: mockRouter },
        { provide: CommonService, useValue: mockCommonService },
        PartyService,
        ProductService,
      ],
    }).compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CreateAssetComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create the CreateAssetComponent', () => {
    expect(component).toBeTruthy();
  });

  it('should not call receiveAsset when form is invalid', () => {
    component.createAssetForm.patchValue({ productId: '' });
    component.receiveAsset();
    expect(mockAssetService.receiveAsset).not.toHaveBeenCalled();
  });

  it('should call receiveAsset and navigate when success response received', fakeAsync(() => {
    const assetData = { assetId: 'AS123' };
    mockAssetService.receiveAsset.and.returnValue(of(assetData));
    component.createAssetForm.patchValue({
      productId: 'PROD001',
      statusId: 'AstAvailable',
      facilityId: 'FAC001',
      quantity: 1,
      acquireCost: 100
    });

    component.receiveAsset();
    tick();

    expect(mockAssetService.receiveAsset).toHaveBeenCalled();
    expect(mockSnackbarService.showSuccess).toHaveBeenCalledWith('Asset received successfully.');
    expect(mockRouter.navigate).toHaveBeenCalledWith(['/assets/AS123']);
  }));

  it('should show error snackbar when receiveAsset returns no assetId', fakeAsync(() => {
    mockAssetService.receiveAsset.and.returnValue(of({}));
    component.createAssetForm.patchValue({
      productId: 'PROD001',
      statusId: 'AstAvailable',
      facilityId: 'FAC001',
      quantity: 1,
      acquireCost: 100
    });

    component.receiveAsset();
    tick();

    expect(mockSnackbarService.showError).toHaveBeenCalledWith('Failed to receive asset.');
  }));

  it('should handle error during receiveAsset call', fakeAsync(() => {
    mockAssetService.receiveAsset.and.returnValue(throwError(() => new Error('Server error')));
    component.createAssetForm.patchValue({
      productId: 'PROD001',
      statusId: 'AstAvailable',
      facilityId: 'FAC001',
      quantity: 1,
      acquireCost: 100
    });

    component.receiveAsset();
    tick();

    expect(mockSnackbarService.showError).toHaveBeenCalledWith('Error receiving asset.');
  }));
});
