import { ComponentFixture, TestBed } from '@angular/core/testing';
import { AssetDetailComponent } from './asset-detail.component';
import { ActivatedRoute } from '@angular/router';
import { of, throwError, Subject } from 'rxjs';
import { AssetService } from 'src/app/services/asset/asset.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';

describe('AssetDetailComponent', () => {
  let component: AssetDetailComponent;
  let fixture: ComponentFixture<AssetDetailComponent>;
  let assetService: jasmine.SpyObj<AssetService>;
  let snackbarService: jasmine.SpyObj<SnackbarService>;
  let routeSubject: Subject<any>;

  beforeEach(async () => {
    const assetSpy = jasmine.createSpyObj('AssetService', ['getAsset']);
    const snackbarSpy = jasmine.createSpyObj('SnackbarService', ['showError']);
    routeSubject = new Subject();

    await TestBed.configureTestingModule({
      declarations: [AssetDetailComponent],
      providers: [
        { provide: AssetService, useValue: assetSpy },
        { provide: SnackbarService, useValue: snackbarSpy },
        {
          provide: ActivatedRoute,
          useValue: { params: routeSubject.asObservable() },
        },
      ],
    }).compileComponents();

    assetService = TestBed.inject(AssetService) as jasmine.SpyObj<AssetService>;
    snackbarService = TestBed.inject(SnackbarService) as jasmine.SpyObj<SnackbarService>;
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AssetDetailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create the component', () => {
    expect(component).toBeTruthy();
  });

  it('should call getAsset when assetId is present in route', () => {
    const mockResponse = {
      details: [{ assetDetailId: 'AD123' }],
      receipts: [{ assetReceiptId: 'AR123' }],
    };
    assetService.getAsset.and.returnValue(of(mockResponse));

    routeSubject.next({ assetId: 'A001' });

    expect(component.assetId).toBe('A001');
    expect(assetService.getAsset).toHaveBeenCalledWith('A001');
  });

  it('should assign data correctly on getAsset success', () => {
    const mockData = {
      details: [{ assetDetailId: 'D1' }],
      receipts: [{ assetReceiptId: 'R1' }],
    };
    assetService.getAsset.and.returnValue(of(mockData));

    component.getAsset('A001');

    expect(component.assetDetail).toEqual(mockData);
    expect(component.details.length).toBe(1);
    expect(component.receipts.length).toBe(1);
  });

  it('should handle error in getAsset and call showError', () => {
    assetService.getAsset.and.returnValue(throwError(() => new Error('Failed')));

    component.getAsset('A001');

    expect(snackbarService.showError).toHaveBeenCalledWith('Error fetching asset details.');
  });

  it('should clean up destroy$ on ngOnDestroy', () => {
    const destroySpy = spyOn(component['destroy$'], 'next');
    component.ngOnDestroy();
    expect(destroySpy).toHaveBeenCalled();
  });
});
