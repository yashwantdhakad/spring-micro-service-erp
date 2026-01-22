import { Component, Inject, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';
import { debounceTime, distinctUntilChanged, startWith, switchMap, map, catchError, finalize } from 'rxjs/operators';
import { Observable, of } from 'rxjs';
import { CommonService } from 'src/app/services/common/common.service';
import { FeatureService } from 'src/app/services/features/feature.service';
import { ProductService } from 'src/app/services/product/product.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';

@Component({
  selector: 'app-add-to-product',
  templateUrl: './add-to-product.component.html',
  styleUrls: ['./add-to-product.component.css'],
})
export class AddToProductComponent implements OnInit {
  createProductFeatureApplForm: FormGroup;
  isLoading = false;
  filteredProducts$!: Observable<any[]>;
  enumTypes: any[] = [];
  isNew: boolean;

  constructor(
    public dialogRef: MatDialogRef<AddToProductComponent>,
    @Inject(MAT_DIALOG_DATA) public data: { featureProductData: any },
    private fb: FormBuilder,
    private productService: ProductService,
    private featureService: FeatureService,
    private commonService: CommonService,
    private snackbarService: SnackbarService
  ) {
    const {
      isNew,
      productFeatureId,
      productId,
      applTypeEnumId,
      sequenceNum,
      amount,
      fromDate
    } = this.data?.featureProductData ?? {};

    this.isNew = isNew;

    this.createProductFeatureApplForm = this.fb.group({
      productFeatureId: [productFeatureId],
      applTypeEnumId: [applTypeEnumId || 'PfatStandard', Validators.required],
      productId: [productId, Validators.required],
      sequenceNum: [sequenceNum],
      amount: [amount],
      fromDate: [fromDate],
    });
  }

  ngOnInit(): void {
    this.loadEnumTypes();
    this.initProductAutocomplete();
  }

  private initProductAutocomplete(): void {
    this.filteredProducts$ = this.createProductFeatureApplForm.get('productId')!.valueChanges.pipe(
      startWith(''),
      debounceTime(300),
      distinctUntilChanged(),
      switchMap(value => this.getProducts(value))
    );
  }

  private getProducts(query: string): Observable<any[]> {
    if (!query) return of([]);

    return this.productService.getProducts(0, query).pipe(
      map(res => res?.documentList ?? []),
      catchError(() => {
        this.snackbarService.showError('Error fetching products');
        return of([]);
      })
    );
  }

  private loadEnumTypes(): void {
    this.commonService.getEnumTypes('ProductFeatureApplType').subscribe({
      next: (data) => {
        this.enumTypes = Array.isArray(data) ? data : [data];
      },
      error: (err) => {
        this.snackbarService.showError('Error fetching enum types');
      }
    });
  }

  createProductFeatureAppl(): void {
    if (this.createProductFeatureApplForm.invalid) return;

    this.isLoading = true;
    const values = this.createProductFeatureApplForm.value;
    const action$ = values.fromDate
      ? this.featureService.updateProductFeatureAppl(values)
      : this.featureService.createProductFeatureAppl(values);

    action$.pipe(finalize(() => this.isLoading = false)).subscribe({
      next: () => {
        const message = values.fromDate
          ? 'Product feature application updated successfully'
          : 'Product feature application created successfully';
        this.snackbarService.showSuccess(message);
        this.dialogRef.close(values);
      },
      error: (error) => {
        this.snackbarService.showError('Error in create/update product feature application');
      }
    });
  }
}
