import { ComponentFixture, TestBed } from '@angular/core/testing';
import { AssetsComponent } from './assets.component';
import { AssetService } from 'src/app/services/asset/asset.service';
import { HttpClientTestingModule } from '@angular/common/http/testing';
import { of, throwError } from 'rxjs';

describe('AssetsComponent', () => {
  let component: AssetsComponent;
  let fixture: ComponentFixture<AssetsComponent>;
  let assetService: jasmine.SpyObj<AssetService>;

  beforeEach(async () => {
    const assetServiceSpy = jasmine.createSpyObj('AssetService', ['getAssets']);

    await TestBed.configureTestingModule({
      declarations: [AssetsComponent],
      imports: [HttpClientTestingModule],
      providers: [
        { provide: AssetService, useValue: assetServiceSpy },
      ]
    }).compileComponents();

    fixture = TestBed.createComponent(AssetsComponent);
    component = fixture.componentInstance;
    assetService = TestBed.inject(AssetService) as jasmine.SpyObj<AssetService>;
  });

  it('should create the component', () => {
    expect(component).toBeTruthy();
  });

  it('should call getAssets() on ngOnInit', () => {
    const mockResponse = {
      responseMap: { resultList: [{ inventoryItemId: 'A001' }], total: 1 }
    };

    assetService.getAssets.and.returnValue(of(mockResponse));
    fixture.detectChanges(); // triggers ngOnInit

    expect(assetService.getAssets).toHaveBeenCalledWith(0, '');
    expect(component.items.length).toBe(1);
    expect(component.pages).toBe(1);
  });

  it('should handle error response gracefully', () => {
    assetService.getAssets.and.returnValue(throwError(() => new Error('API error')));

    component.getAssets(1, '');
    expect(component.items).toEqual([]);
  });

  it('should update loading state properly', (done) => {
    const mockResponse = { responseMap: { resultList: [], total: 0 } };

    assetService.getAssets.and.returnValue(of(mockResponse));

    component.getAssets(1, '');
    expect(component.isLoading).toBeTrue();

    setTimeout(() => {
      expect(component.isLoading).toBeFalse();
      done();
    });
  });

  it('should clean up destroy$ on ngOnDestroy', () => {
    const destroySpy = spyOn(component['destroy$'], 'next');
    component.ngOnDestroy();
    expect(destroySpy).toHaveBeenCalled();
  });
});
