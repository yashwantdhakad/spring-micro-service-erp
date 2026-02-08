import { Component, OnDestroy, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ProductService } from 'src/app/services/product/product.service';
// In your product list component
import { MatDialog } from '@angular/material/dialog';
import { Store } from '@ngrx/store';
import { TranslateService } from '@ngx-translate/core';
import { ProductEditComponent } from 'src/app/components/product/product-edit/product-edit.component';
import { CommonService } from 'src/app/services/common/common.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';
import { EnumState } from 'src/app/store/enum/enum.state';
import { ConfirmationDialogComponent } from '../../common/confirmation-dialog/confirmation-dialog.component';
import { AddEditProductCategoryComponent } from '../add-edit-product-category/add-edit-product-category.component';
import { AddEditProductPriceComponent } from '../add-edit-product-price/add-edit-product-price.component';
import { ProductAssocComponent } from '../product-assoc/product-assoc.component';
import { ProductContentComponent } from '../product-content/product-content.component';
import { Subject } from 'rxjs';
import { finalize, takeUntil } from 'rxjs/operators';
import { SupplierProductService } from 'src/app/services/supplier-product/supplier-product.service';
import { SupplierProductDialogComponent } from 'src/app/components/supplier/supplier-product-dialog/supplier-product-dialog.component';
import { AddToProductComponent } from 'src/app/components/feature/add-to-product/add-to-product.component';
import { FeatureService } from 'src/app/services/features/feature.service';
import { ProductFacilityService } from 'src/app/services/product/product-facility.service';
import { FacilityService } from 'src/app/services/facility/facility.service';
import { AddProductFacilityDialogComponent } from '../add-product-facility-dialog/add-product-facility-dialog.component';
import { AddProductFacilityLocationDialogComponent } from '../add-product-facility-location-dialog/add-product-facility-location-dialog.component';

@Component({
  standalone: false,
  selector: 'app-product-detail',
  templateUrl: './product-detail.component.html',
  styleUrls: ['./product-detail.component.css'],
})
export class ProductDetailComponent implements OnInit, OnDestroy {
  isLoading: boolean = false;
  productId: string | undefined;

  productDetail: any;
  productTypeLabel: string | undefined;
  productTypeMap = new Map<string, string>();

  prices: any[] = [];
  displayedColumns: string[] = [
    'typeDescription',
    'description',
    'price',
    'action',
  ];
  priceTypeMap = new Map<string, string>();
  pricePurposeMap = new Map<string, string>();

  categories: any[] = [];
  categoryColumns: string[] = [
    'categoryName',
    'productCategoryTypeId',
    'fromDate',
  ];
  categoryTypeMap = new Map<string, string>();

  contents: any[] = [];
  contentColumns: string[] = [
    'description',
    'contentLocation',
  ];

  assocs: any[] = [];
  assocColumns: string[] = [
    'productName',
    'description',
    'fromDate',
    'quantity',
  ];

  toAssocs: any[] = [];
  toAssocColumns: string[] = ['productName', 'description', 'fromDate'];
  inventorySummary: any[] = [];
  inventorySummaryColumns: string[] = ['facility', 'atpTotal', 'qohTotal'];
  supplierProducts: any[] = [];
  supplierProductColumns: string[] = ['partyId', 'supplierProductName', 'lastPrice', 'action'];
  productFeatures: any[] = [];
  productFeatureColumns: string[] = [
    'productFeatureId',
    'featureDescription',
    'productFeatureApplTypeId',
    'sequenceNum',
    'fromDate',
    'action',
  ];

  productFacilities: any[] = [];
  productFacilityColumns: string[] = ['facilityId', 'facilityName', 'minimumStock', 'reorderQuantity', 'daysToShip', 'action'];
  productFacilityLocations: any[] = [];
  productFacilityLocationColumns: string[] = ['locationSeqId', 'locationName', 'minimumStock', 'moveQuantity', 'reorderQuantity', 'maximumStock', 'action'];
  facilityNameMap = new Map<string, string>();

  isConfigSaving = false;

  productPriceData: any;
  productCategoryData: any;
  priceTypeEnums: any;
  pricePurposeEnums: any;
  contentData: any;
  assocData: any;

  constructor(
    private productService: ProductService,
    private route: ActivatedRoute,
    private dialog: MatDialog,
    private store: Store<EnumState>,
    private translate: TranslateService,
    private snackbarService: SnackbarService,
    private commonService: CommonService,
    private supplierProductService: SupplierProductService,
    private featureService: FeatureService,
    private productFacilityService: ProductFacilityService,
    private facilityService: FacilityService
  ) { }

  private destroy$ = new Subject<void>();

  ngOnInit(): void {
    this.route.params.pipe(takeUntil(this.destroy$)).subscribe((params) => {
      this.productId = params['productId'];
      if (this.productId) {
        this.setLoading(true);
        this.getProduct(this.productId);
      }
    });
    this.loadProductTypes();
    this.loadCategoryTypes();
    this.fetchProductPriceTypes();
    this.fetchProductPricePurposeTypes();

  }

  ngOnDestroy(): void {
    this.destroy$.next();
    this.destroy$.complete();
  }
  fetchProductPriceTypes(): void {
    this.commonService
      .getLookupResults({}, 'productpricetype')
      .pipe(takeUntil(this.destroy$))
      .subscribe({
        next: (data: any) => {
          this.priceTypeEnums = Array.isArray(data) ? data : [data];
          this.priceTypeMap = new Map(
            (this.priceTypeEnums || []).map((item: any) => [
              item.productPriceTypeId,
              item.description || item.productPriceTypeId,
            ])
          );
        },
        error: () => {
          this.snackbarService.showError(
            this.translate.instant('Error fetching product price types.')
          );
        },
      });
  }

  fetchProductPricePurposeTypes(): void {
    this.commonService
      .getLookupResults({}, 'productpricepurpose')
      .pipe(takeUntil(this.destroy$))
      .subscribe({
        next: (data: any) => {
          this.pricePurposeEnums = Array.isArray(data) ? data : [data];
          this.pricePurposeMap = new Map(
            (this.pricePurposeEnums || []).map((item: any) => [
              item.productPricePurposeId,
              item.description || item.productPricePurposeId,
            ])
          );
        },
        error: () => {
          this.snackbarService.showError(
            this.translate.instant('Error fetching product price purpose types.')
          );
        },
      });
  }

  getProduct(productId: string): void {
    this.setLoading(true);

    this.productService.getProduct(productId).subscribe({
      next: (response) => {
        const { product, prices, categories, contents, assocs, toAssocs } = response;

        this.productDetail = product;
        this.productTypeLabel = this.productTypeMap.get(product?.productTypeId);
        const priceList = Array.isArray(prices) ? prices : [];
        this.prices = priceList.filter((item) => !item?.thruDate);
        this.categories = categories;
        this.contents = contents;
        this.assocs = assocs;
        this.toAssocs = toAssocs;
        this.loadInventorySummary(productId);
        this.loadSupplierProducts(productId);
        this.loadProductFeatures(productId);
        this.loadFacilities(); // Load facilities and then product facilities
        this.setLoading(false);
      },
      error: () => {
        this.setLoading(false);
      },
    });
  }

  loadInventorySummary(productId: string): void {
    this.productService.getInventorySummary(productId).subscribe({
      next: (summary) => {
        setTimeout(() => {
          this.inventorySummary = Array.isArray(summary) ? summary : [];
        }, 0);
      },
      error: () => {
        setTimeout(() => {
          this.inventorySummary = [];
        }, 0);
      },
    });
  }

  loadProductFeatures(productId: string): void {
    this.featureService.getProductFeatureAppls(productId).subscribe({
      next: (items) => {
        setTimeout(() => {
          this.productFeatures = Array.isArray(items) ? items : [];
        }, 0);
      },
      error: () => {
        setTimeout(() => {
          this.productFeatures = [];
        }, 0);
      },
    });
  }

  addProductFeatureDialog(params: any = null): void {
    if (!this.productId) {
      return;
    }

    const featureProductData = {
      ...params,
      productId: this.productId,
      isNew: false,
    };

    this.dialog
      .open(AddToProductComponent, {
        data: { featureProductData },
      })
      .afterClosed()
      .subscribe((result) => {
        if (this.productId) {
          this.loadProductFeatures(this.productId);
        }
      });
  }

  loadSupplierProducts(productId: string): void {
    this.supplierProductService.listByProduct(productId).subscribe({
      next: (items) => {
        setTimeout(() => {
          this.supplierProducts = Array.isArray(items) ? items : [];
        }, 0);
      },
      error: () => {
        setTimeout(() => {
          this.supplierProducts = [];
        }, 0);
      },
    });
  }

  loadProductTypes(): void {
    this.commonService.getLookupResults({}, 'product_type').pipe(takeUntil(this.destroy$)).subscribe({
      next: (types: any[]) => {
        const list = Array.isArray(types) ? types : [];
        this.productTypeMap = new Map(
          list.map((type: any) => [
            type.productTypeId,
            type.description || type.productTypeId,
          ])
        );
        if (this.productDetail?.productTypeId) {
          this.productTypeLabel = this.productTypeMap.get(this.productDetail.productTypeId);
        }
      },
    });
  }

  loadCategoryTypes(): void {
    this.commonService.getLookupResults({}, 'product_category_type').pipe(takeUntil(this.destroy$)).subscribe({
      next: (types: any[]) => {
        const list = Array.isArray(types) ? types : [];
        this.categoryTypeMap = new Map(
          list.map((type: any) => [
            type.productCategoryTypeId,
            type.description || type.productCategoryTypeId,
          ])
        );
      },
    });
  }

  getCategoryTypeDescription(typeId: string): string {
    return this.categoryTypeMap.get(typeId) || typeId;
  }

  getPriceTypeDescription(typeId: string): string {
    return this.priceTypeMap.get(typeId) || typeId;
  }

  getPricePurposeDescription(purposeId: string): string {
    return this.pricePurposeMap.get(purposeId) || purposeId;
  }

  isFlagEnabled(value: any): boolean {
    return value === 'Y' || value === true;
  }

  updateConfiguration(field: string, checked: boolean): void {
    if (!this.productId || this.isConfigSaving) {
      return;
    }
    const payload: any = {
      productId: this.productId,
      [field]: checked ? 'Y' : 'N',
    };
    this.isConfigSaving = true;
    this.productService.updateProduct(payload).pipe(
      finalize(() => {
        this.isConfigSaving = false;
      })
    ).subscribe({
      next: () => {
        if (this.productDetail) {
          this.productDetail[field] = checked ? 'Y' : 'N';
        }
        this.snackbarService.showSuccess(this.translate.instant('PRODUCT.CONFIG_UPDATE_SUCCESS'));
      },
      error: () => {
        this.snackbarService.showError(this.translate.instant('PRODUCT.CONFIG_UPDATE_ERROR'));
      },
    });
  }


  editProductDialog() {
    const dialogRef = this.dialog
      .open(ProductEditComponent, {
        data: {
          productDetail: this.productDetail,
        },
      })
      .afterClosed()
      .subscribe((result) => {
        if (result && result.productId) {
          this.getProduct(result.productId);
        }
      });
  }

  addUpdateProductPriceDialog(params: any = null) {
    this.productPriceData = {
      ...params,
      productId: this.productId,
      priceTypeEnums: this.priceTypeEnums,
      pricePurposeEnums: this.pricePurposeEnums,
    };

    const dialogRef = this.dialog
      .open(AddEditProductPriceComponent, {
        data: {
          productPriceData: this.productPriceData,
        },
      })
      .afterClosed()
      .subscribe((result) => {
        if (result?.productId) {
          this.getProduct(result.productId);
        }
      });
  }

  async deleteProductPriceDialog(params: any): Promise<void> {
    const dialogRef = this.dialog.open(ConfirmationDialogComponent, {
      data: {
        title: this.translate.instant('PRODUCT.DELETE_PRICE_TITLE'),
        message: this.translate.instant('PRODUCT.DELETE_PRICE_MESSAGE'),
      },
    });

    dialogRef.afterClosed().subscribe((result) => {
      if (result) {
        this.productService.deleteProductPrice(params).subscribe(() => {
          this.getProduct(params.productId);
        });
      } else {
        dialogRef.close();
      }
    });

  }

  addProductCategoryDialog(params: any = null) {
    this.productCategoryData = {
      ...params,
      productId: this.productId,
    };

    const dialogRef = this.dialog
      .open(AddEditProductCategoryComponent, {
        data: {
          productCategoryData: this.productCategoryData,
        },
      })
      .afterClosed()
      .subscribe((result) => {
        if (result?.productId) {
          this.getProduct(result.productId);
        }
      });
  }

  addUpdateProductContentDialog(params: any = null) {
    this.contentData = {
      ...params,
      productId: this.productId,
    };

    const dialogRef = this.dialog
      .open(ProductContentComponent, {
        data: {
          contentData: this.contentData,
        },
      })
      .afterClosed()
      .subscribe((result) => {
        if (result?.productId) {
          this.getProduct(result.productId);
        }
      });
  }

  openProductContent(item: any): void {
    if (!this.productId || !item?.contentId) {
      return;
    }
    this.productService.downloadProductContent(this.productId, item.contentId).subscribe({
      next: (blob) => {
        const url = URL.createObjectURL(blob);
        window.open(url, '_blank', 'noopener');
        setTimeout(() => URL.revokeObjectURL(url), 10000);
      },
      error: () => {
      },
    });
  }

  addUpdateProductAssocDialog(params: any = null) {
    this.assocData = {
      ...params,
      productId: this.productId,
    };

    const dialogRef = this.dialog
      .open(ProductAssocComponent, {
        data: {
          assocData: this.assocData,
        },
      })
      .afterClosed()
      .subscribe((result) => {
        if (result?.productId) {
          this.getProduct(result.productId);
        }
      });
  }

  addSupplierProductDialog(): void {
    if (!this.productId) {
      return;
    }
    this.dialog
      .open(SupplierProductDialogComponent, {
        data: { productId: this.productId },
      })
      .afterClosed()
      .subscribe((result) => {
        if (result && this.productId) {
          this.loadSupplierProducts(this.productId);
        }
      });
  }

  deleteSupplierProduct(item: any): void {
    if (!item?.id) {
      return;
    }
    const dialogRef = this.dialog.open(ConfirmationDialogComponent, {
      data: {
        title: 'Supplier Product',
        message: 'Are you sure you want to delete this supplier product?',
      },
    });

    dialogRef.afterClosed().subscribe((result) => {
      if (result) {
        this.supplierProductService.delete(item.id).subscribe({
          next: () => this.loadSupplierProducts(this.productId || ''),
        });
      }
    });
  }

  loadFacilities(): void {
    this.facilityService.getFacilities().subscribe({
      next: (facilities: any[]) => {
        const list = Array.isArray(facilities) ? facilities : [];
        this.facilityNameMap = new Map(list.map(f => [f.facilityId, f.facilityName || f.facilityId]));
        this.loadProductFacilities(); // Reload to update names
      }
    });
  }

  loadProductFacilities(): void {
    if (!this.productId) return;
    this.productFacilityService.getProductFacilities(this.productId).subscribe({
      next: (data) => {
        const facilities = Array.isArray(data) ? data : [];
        this.productFacilities = facilities.map(f => ({
          ...f,
          facilityName: this.facilityNameMap.get(f.facilityId) || f.facilityId,
          locations: [], // Placeholder for locations
          expanded: false // Default to collapsed
        }));
        this.loadProductFacilityLocations();
      }
    });
  }

  loadProductFacilityLocations(): void {
    if (!this.productId) return;
    this.productFacilityService.getProductFacilityLocations(this.productId).subscribe({
      next: (data) => {
        this.productFacilityLocations = Array.isArray(data) ? data : [];
        // Distribute locations to facilities
        this.productFacilities.forEach(pf => {
          pf.locations = this.productFacilityLocations.filter(pfl => pfl.facilityId === pf.facilityId);
        });
      }
    });
  }

  addProductFacilityDialog(productFacility?: any): void {
    if (!this.productId) return;
    this.dialog.open(AddProductFacilityDialogComponent, {
      data: { productId: this.productId, productFacility }
    }).afterClosed().subscribe(res => {
      if (res) this.loadProductFacilities();
    });
  }

  deleteProductFacility(item: any): void {
    const dialogRef = this.dialog.open(ConfirmationDialogComponent, {
      data: {
        title: 'Product Facility',
        message: 'Are you sure you want to delete this facility configuration?',
      },
    });

    dialogRef.afterClosed().subscribe((result) => {
      if (result) {
        this.productFacilityService.deleteProductFacility(item.id).subscribe({
          next: () => this.loadProductFacilities(),
        });
      }
    });
  }

  addProductFacilityLocationDialog(facility: any, productFacilityLocation?: any): void {
    if (!this.productId) return;
    this.dialog.open(AddProductFacilityLocationDialogComponent, {
      data: {
        productId: this.productId,
        facilityId: facility.facilityId,
        facilityName: facility.facilityName,
        productFacilityLocation
      }
    }).afterClosed().subscribe(res => {
      if (res) this.loadProductFacilityLocations();
    });
  }

  deleteProductFacilityLocation(item: any): void {
    const dialogRef = this.dialog.open(ConfirmationDialogComponent, {
      data: {
        title: 'Product Facility Location',
        message: 'Are you sure you want to delete this location configuration?',
      },
    });

    dialogRef.afterClosed().subscribe((result) => {
      if (result) {
        this.productFacilityService.deleteProductFacilityLocation(item.id).subscribe({
          next: () => this.loadProductFacilityLocations(),
        });
      }
    });
  }

  private setLoading(isLoading: boolean): void {
    setTimeout(() => {
      this.isLoading = isLoading;
    }, 0);
  }
}
