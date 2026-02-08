import { ChangeDetectorRef, Component, OnInit } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { ActivatedRoute } from '@angular/router';
import { FeatureService } from 'src/app/services/features/feature.service';
import { EditFeatureComponent } from '../edit-feature/edit-feature.component';
import { AddToProductComponent } from '../add-to-product/add-to-product.component';
import { AddToFeatureGroupComponent } from '../add-to-feature-group/add-to-feature-group.component';
import { finalize } from 'rxjs/operators';
import { ConfirmationDialogComponent } from '../../common/confirmation-dialog/confirmation-dialog.component';

@Component({
  standalone: false,
  selector: 'app-feature-detail',
  templateUrl: './feature-detail.component.html',
  styleUrls: ['./feature-detail.component.css'],
})
export class FeatureDetailComponent implements OnInit {
  isLoading = false;
  productFeatureId?: string;

  featureDetail: any;
  products: any[] = [];
  productsColumns: string[] = [
    'productId',
    'applTypeEnumId',
    'sequenceNum',
    'fromDate',
    'actions',
  ];

  groups: any[] = [];
  groupsColumns: string[] = [
    'productFeatureGroupId',
    'group',
    'sequenceNum',
    'fromDate',
    'actions',
  ];

  featureProductData: any;
  featureGroupData: any;

  constructor(
    private readonly featureService: FeatureService,
    private readonly route: ActivatedRoute,
    private readonly dialog: MatDialog,
    private cdr: ChangeDetectorRef
  ) { }

  ngOnInit(): void {
    this.route.params.subscribe((params) => {
      this.productFeatureId = params['productFeatureId'];
      if (this.productFeatureId) {
        this.fetchFeature(this.productFeatureId);
      }
    });
  }

  fetchFeature(productFeatureId: string): void {
    this.isLoading = true;

    this.featureService
      .getFeature(productFeatureId)
      .subscribe({
        next: (response) => {
          this.featureDetail = response;
          this.products = response?.products ?? [];
          this.groups = response?.groups ?? [];
          this.isLoading = false;
          this.cdr.detectChanges();
        },
        error: (error) => {
          this.isLoading = false;
          this.cdr.detectChanges();
        },
      });
  }

  editFeatureDialog(): void {
    this.dialog
      .open(EditFeatureComponent, {
        data: { featureDetail: this.featureDetail },
      })
      .afterClosed()
      .subscribe((result) => {
        if (result?.productFeatureId) {
          this.fetchFeature(result.productFeatureId);
        }
      });
  }

  addFeatureToProductDialog(params: any = null): void {
    this.featureProductData = {
      ...params,
      productFeatureId: this.productFeatureId,
    };

    this.dialog
      .open(AddToProductComponent, {
        data: { featureProductData: this.featureProductData },
      })
      .afterClosed()
      .subscribe((result) => {
        if (result?.productFeatureId) {
          this.fetchFeature(result.productFeatureId);
        }
      });
  }

  addFeatureToGroupDialog(params: any = null): void {
    this.featureGroupData = {
      ...params,
      productFeatureId: this.productFeatureId,
    };

    this.dialog
      .open(AddToFeatureGroupComponent, {
        data: { featureGroupData: this.featureGroupData },
      })
      .afterClosed()
      .subscribe((result) => {
        if (result?.productFeatureId) {
          this.fetchFeature(result.productFeatureId);
        }
      });
  }

  deleteProductFeatureAppl(item: any): void {
    const dialogRef = this.dialog.open(ConfirmationDialogComponent, {
      data: {
        title: 'Confirm Deletion',
        message: 'Are you sure you want to remove this product association?',
      },
    });

    dialogRef.afterClosed().subscribe((result) => {
      if (result) {
        this.isLoading = true;
        this.featureService.deleteProductFeatureAppl(item.id).subscribe({
          next: () => {
            this.isLoading = false;
            this.fetchFeature(this.productFeatureId!);
          },
          error: (error) => {
            this.isLoading = false;
            console.error('Error deleting product feature appl', error);
          },
        });
      }
    });
  }

  getCurrentDateTime(): string {
    return new Date().toString();
  }
}
