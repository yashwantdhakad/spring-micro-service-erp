import { Component, OnDestroy, OnInit } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { ActivatedRoute } from '@angular/router';
import { CategoryService } from 'src/app/services/category/category.service';
import { CommonService } from 'src/app/services/common/common.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';
import { ConfirmationDialogComponent } from '../../common/confirmation-dialog/confirmation-dialog.component';
import { AddEditProductComponent } from '../add-edit-product/add-edit-product.component';
import { EditCategoryComponent } from '../edit-category/edit-category.component';
import { Subject } from 'rxjs';
import { finalize, takeUntil } from 'rxjs/operators';

@Component({
  standalone: false,
  selector: 'app-category-detail',
  templateUrl: './category-detail.component.html',
  styleUrls: ['./category-detail.component.css'],
})
export class CategoryDetailComponent implements OnInit, OnDestroy {
  isLoading: boolean = false;
  productCategoryId: string | undefined;
  categoryDetail: any;
  categoryTypeLabel: string | undefined;
  categoryTypeMap = new Map<string, string>();
  products: any[] = [];
  productColumns = [
    { key: 'productId', header: 'COMMON.ID' },
    { key: 'product.productName', header: 'COMMON.PRODUCT_NAME' },
    { key: 'fromDate', header: 'CATEGORY.FROM_DATE', isDate: true },
    { key: 'sequenceNum', header: 'CATEGORY.SEQUENCE_NO' },
    { key: 'action', header: 'COMMON.ACTION' }
  ];
  categoryProductData: any;
  getCurrentDateTime(): string {
    return new Date().toString();
  }

  constructor(
    private readonly categoryService: CategoryService,
    private readonly route: ActivatedRoute,
    private dialog: MatDialog,
    private commonService: CommonService,
    private snackbarService: SnackbarService // Inject SnackbarService
  ) { }

  private destroy$ = new Subject<void>();

  ngOnInit(): void {
    this.route.params.pipe(takeUntil(this.destroy$)).subscribe((params) => {
      this.productCategoryId = params['productCategoryId'];
      if (this.productCategoryId) {
        this.isLoading = true;
        this.getCategory(this.productCategoryId);
      }
    });
    this.loadCategoryTypes();
  }

  ngOnDestroy(): void {
    this.destroy$.next();
    this.destroy$.complete();
  }

  getCategory(productCategoryId: string): void {
    this.isLoading = true;

    this.categoryService.getCategory(productCategoryId).pipe(
      finalize(() => (this.isLoading = false))
    ).subscribe({
      next: (response) => {
        this.categoryDetail = response.category;
        this.categoryTypeLabel = this.categoryTypeMap.get(this.categoryDetail?.productCategoryTypeId);
        this.products = response.products;
      },
      error: (error) => {
        this.snackbarService.showError('Error fetching products');
      }
    });
  }


  addProductToCategoryDialog(params: any = null) {
    this.categoryProductData = {
      ...params,
      productCategoryId: this.productCategoryId,
    };

    const dialogRef = this.dialog
      .open(AddEditProductComponent, {
        data: {
          categoryProductData: this.categoryProductData,
        },
      })
      .afterClosed()
      .subscribe((result) => {
        if (result && result?.productCategoryId) {
          this.getCategory(result.productCategoryId);
        }
      });
  }

  deleteProductCategoryDialog(params: any): void {
    this.dialog.open(ConfirmationDialogComponent, {
      data: {
        title: 'Delete Product',
        message: 'Are you sure you want to delete this product?',
      },
    })
      .afterClosed()
      .subscribe({
        next: (result) => {
          if (result) {
            this.categoryService.deleteProductCategory(params).subscribe({
              next: () => {
                this.getCategory(params.productCategoryId);
                this.snackbarService.showSuccess('Product deleted successfully');
              },
              error: (error) => {
                this.snackbarService.showError('Error deleting product');
              },
            });
          }
        },
        error: (error) => {
          this.snackbarService.showError('Unexpected error while confirming deletion');
        }
      });
  }

  editCategoryDialog() {
    const dialogRef = this.dialog
      .open(EditCategoryComponent, {
        data: {
          categoryDetail: this.categoryDetail,
        },
      })
      .afterClosed()
      .subscribe((result) => {
        if (result && result.productCategoryId) {
          this.getCategory(result.productCategoryId);
        }
      });
  }

  getProductColumnKeys(): string[] {
    return this.productColumns.map(col => col.key);
  }

  private loadCategoryTypes(): void {
    this.commonService.getLookupResults({}, 'product_category_type').pipe(takeUntil(this.destroy$)).subscribe({
      next: (types: any[]) => {
        const list = Array.isArray(types) ? types : [];
        this.categoryTypeMap = new Map(
          list.map((type: any) => [
            type.productCategoryTypeId,
            type.description || type.productCategoryTypeId,
          ])
        );
        if (this.categoryDetail?.productCategoryTypeId) {
          this.categoryTypeLabel = this.categoryTypeMap.get(this.categoryDetail.productCategoryTypeId);
        }
      },
    });
  }

  getValue(element: any, key: string): any {
    return key.split('.').reduce((o, k) => (o ? o[k] : ''), element);
  }
}
