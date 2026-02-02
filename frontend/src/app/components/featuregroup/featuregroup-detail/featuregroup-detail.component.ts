import { ChangeDetectorRef, Component, OnInit } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { ActivatedRoute } from '@angular/router';
import { finalize } from 'rxjs/operators';
import { FeatureGroupService } from 'src/app/services/featuregroup/feature-group.service';
import { EditFeaturegroupComponent } from '../edit-featuregroup/edit-featuregroup.component';
import { AddProductFeatureGroupApplComponent } from '../add-product-feature-group-appl/add-product-feature-group-appl.component';
import { AddCategoryFeatureGroupApplComponent } from '../add-category-feature-group-appl/add-category-feature-group-appl.component';

@Component({
  standalone: false,
  selector: 'app-featuregroup-detail',
  templateUrl: './featuregroup-detail.component.html',
  styleUrls: ['./featuregroup-detail.component.css'],
})
export class FeaturegroupDetailComponent implements OnInit {
  isLoading = false;
  productFeatureGroupId?: string;

  featureGroupDetail: any;
  categories: any[] = [];
  features: any[] = [];

  categoriesColumns: string[] = [
    'productCategoryId',
    'categoryName',
    'applTypeEnumId',
    'fromDate',
  ];

  featuresColumns: string[] = [
    'productFeatureId',
    'description',
    'abbrev',
    'productFeatureTypeEnumId',
    'sequenceNum',
    'fromDate',
  ];

  featureGroupCategoryData: any;
  featureGroupProductData: any;

  constructor(
    private readonly featureGroupService: FeatureGroupService,
    private readonly route: ActivatedRoute,
    private dialog: MatDialog,
    private cdr: ChangeDetectorRef
  ) {}

  ngOnInit(): void {
    this.route.params.subscribe((params) => {
      this.productFeatureGroupId = params['productFeatureGroupId'];
      if (this.productFeatureGroupId) {
        this.fetchFeatureGroup(this.productFeatureGroupId);
      }
    });
  }

  fetchFeatureGroup(productFeatureGroupId: string): void {
    this.isLoading = true;

    this.featureGroupService
      .getFeatureGroup(productFeatureGroupId)
      .subscribe({
        next: (response) => {
          this.featureGroupDetail = response;
          this.categories = response?.categories ?? [];
          this.features = response?.features ?? [];
          this.isLoading = false;
          this.cdr.detectChanges();
        },
        error: (err) => {
          this.isLoading = false;
          this.cdr.detectChanges();
        },
      });
  }

  editFeatureGroupDialog(): void {
    this.dialog
      .open(EditFeaturegroupComponent, {
        data: { featureGroupDetail: this.featureGroupDetail },
      })
      .afterClosed()
      .subscribe((result) => {
        if (result?.productFeatureGroupId) {
          this.fetchFeatureGroup(result.productFeatureGroupId);
        }
      });
  }

  createProductFeatureGroupApplDialog(params: any = null): void {
    this.featureGroupProductData = {
      ...params,
      productFeatureGroupId: this.productFeatureGroupId,
    };

    this.dialog
      .open(AddProductFeatureGroupApplComponent, {
        data: { featureGroupProductData: this.featureGroupProductData },
      })
      .afterClosed()
      .subscribe((result) => {
        if (result?.productFeatureGroupId) {
          this.fetchFeatureGroup(result.productFeatureGroupId);
        }
      });
  }

  createProductCategoryFeatGrpApplDialog(params: any = null): void {
    this.featureGroupCategoryData = {
      ...params,
      productFeatureGroupId: this.productFeatureGroupId,
    };

    this.dialog
      .open(AddCategoryFeatureGroupApplComponent, {
        data: { featureGroupCategoryData: this.featureGroupCategoryData },
      })
      .afterClosed()
      .subscribe((result) => {
        if (result?.productFeatureGroupId) {
          this.fetchFeatureGroup(result.productFeatureGroupId);
        }
      });
  }

  getCurrentDateTime(): string {
    return new Date().toString();
  }
}
