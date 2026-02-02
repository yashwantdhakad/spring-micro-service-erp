import { Component, Inject, OnInit } from '@angular/core';
import {
  FormBuilder,
  FormControl,
  FormGroup,
  Validators,
} from '@angular/forms';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';
import {
  Observable,
  from,
  debounceTime,
  distinctUntilChanged,
  map,
  startWith,
  switchMap,
  finalize,
} from 'rxjs';
import { CommonService } from 'src/app/services/common/common.service';
import { ProductService } from 'src/app/services/product/product.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';
import { TranslateService } from '@ngx-translate/core';

@Component({
  standalone: false,
  selector: 'app-product-assoc',
  templateUrl: './product-assoc.component.html',
  styleUrls: ['./product-assoc.component.css'],
})
export class ProductAssocComponent implements OnInit {
  addProductAssocForm: FormGroup;
  enumTypes: any[] | undefined;
  isLoading: boolean = false;
  filteredProducts$: Observable<any[]> = new Observable<any[]>();
  assocProductIdControl = new FormControl();

  constructor(
    private commonService: CommonService,
    private productService: ProductService,
    private snackbarService: SnackbarService,
    public dialogRef: MatDialogRef<ProductAssocComponent>,
    @Inject(MAT_DIALOG_DATA) public data: { assocData: any },
    private fb: FormBuilder,
    private translate: TranslateService
  ) {
    const {
      productId,
      toProductId,
      productAssocTypeEnumId,
      quantity,
      fromDate,
    } = data?.assocData || {};

    this.addProductAssocForm = this.fb.group({
      productId: [productId],
      toProductId: [toProductId, Validators.required],
      productAssocTypeEnumId: [productAssocTypeEnumId, Validators.required],
      quantity: [quantity],
      fromDate: [fromDate],
    });

    this.getEnumTypes();
  }

  ngOnInit(): void {
    this.filteredProducts$ = this.assocProductIdControl.valueChanges.pipe(
      startWith(''),
      debounceTime(300),
      distinctUntilChanged(),
      switchMap((value) => this.getProductsFromService(value))
    );
  }

  private getProductsFromService(value: string): Observable<any[]> {
    return from(this.productService.getProducts(0, value)).pipe(
      map((response: any) => response.documentList)
    );
  }

  getEnumTypes(): void {
    this.productService.getProductAssocTypes().subscribe({
      next: (data) => {
        this.enumTypes = Array.isArray(data) ? data : [data];
      },
        error: (error) => {
          this.snackbarService.showError(
            this.translate.instant('PRODUCT.FETCH_TYPES_ERROR')
          );
        }
    });
  }

  createProductAssoc(): void {
    if (this.addProductAssocForm.valid) {
      this.isLoading = true;
      const values = this.addProductAssocForm.value;

      this.productService
        .createProductAssoc(values)
        .pipe(finalize(() => (this.isLoading = false)))
        .subscribe({
          next: () => {
            this.snackbarService.showSuccess(
              this.translate.instant('PRODUCT.ASSOC_SAVE_SUCCESS')
            );
            this.addProductAssocForm.reset({ productAssocTypeEnumId: '' });
            this.dialogRef.close(values);
          },
          error: () => {
            this.snackbarService.showError(
              this.translate.instant('PRODUCT.ASSOC_SAVE_ERROR')
            );
          },
        });
    }
  }
}
