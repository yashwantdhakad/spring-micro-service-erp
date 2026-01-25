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

@Component({
  selector: 'app-product-detail',
  templateUrl: './product-detail.component.html',
  styleUrls: ['./product-detail.component.css'],
})
export class ProductDetailComponent implements OnInit, OnDestroy {
  isLoading: boolean = false;
  productId: string | undefined;

  productDetail: any;

  prices: any[] = [];
  displayedColumns: string[] = [
    'typeDescription',
    'description',
    'price',
    'action',
  ];

  categories: any[] = [];
  categoryColumns: string[] = [
    'categoryName',
    'productCategoryTypeId',
    'fromDate',
  ];

  contents: any[] = [];
  contentColumns: string[] = [
    'description',
    'productContentTypeEnumId',
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
    private commonService: CommonService
  ) { }

  private destroy$ = new Subject<void>();

  ngOnInit(): void {
    this.route.params.pipe(takeUntil(this.destroy$)).subscribe((params) => {
      this.productId = params['productId'];
      if (this.productId) {
        this.isLoading = true;
        this.getProduct(this.productId);
      }
    });
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
      },
      error: () => {
        this.snackbarService.showError(
          this.translate.instant('Error fetching product price purpose types.')
        );
      },
    });
  }

  getProduct(productId: string): void {
    this.isLoading = true;

    this.productService.getProduct(productId).pipe(
      finalize(() => (this.isLoading = false))
    ).subscribe({
      next: (response) => {
        const { product, prices, categories, contents, assocs, toAssocs } = response;

        this.productDetail = product;
        this.prices = prices;
        this.categories = categories;
        this.contents = contents;
        this.assocs = assocs;
        this.toAssocs = toAssocs;
      },
      error: () => {
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
}
