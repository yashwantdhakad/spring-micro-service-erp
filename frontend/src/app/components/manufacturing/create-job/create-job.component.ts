import { Component, OnInit } from '@angular/core';
import {
  FormArray,
  FormBuilder,
  FormControl,
  FormGroup,
  Validators,
} from '@angular/forms';
import { Router } from '@angular/router';
import { Observable, of } from 'rxjs';
import {
  debounceTime,
  distinctUntilChanged,
  map,
  startWith,
  switchMap,
  catchError,
  finalize,
} from 'rxjs/operators';
import { CommonService } from 'src/app/services/common/common.service';
import { ManufacturingService } from 'src/app/services/manufacturing/manufacturing.service';
import { ProductService } from 'src/app/services/product/product.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';

@Component({
  standalone: false,
  selector: 'app-create-job',
  templateUrl: './create-job.component.html',
  styleUrls: ['./create-job.component.css'],
})
export class CreateJobComponent implements OnInit {
  isLoading = false;
  facilities: any[] = [];
  filteredConsumeProducts: Observable<any[]>[] = [];

  createJobForm: FormGroup;
  produceProductIdControl = new FormControl('', Validators.required);
  filteredProducts$: Observable<any[]>;

  constructor(
    private fb: FormBuilder,
    private router: Router,
    private commonService: CommonService,
    private productService: ProductService,
    private manufacturingService: ManufacturingService,
    private snackbarService: SnackbarService
  ) {
    this.createJobForm = this.fb.group({
      purposeEnumId: ['WepProductionRun'],
      workEffortName: ['', Validators.required],
      facilityId: ['', Validators.required],
      estimatedStartDate: [''],
      estimatedWorkDuration: [''],
      produceProductId: this.produceProductIdControl,
      produceEstimatedQuantity: ['', Validators.required],
      produceEstimatedAmount: [''],
      consumeItems: this.fb.array([]),
    });

    this.filteredProducts$ = this.produceProductIdControl.valueChanges.pipe(
      startWith(''),
      debounceTime(300),
      distinctUntilChanged(),
      switchMap(value => this.searchProducts(value))
    );
  }

  ngOnInit(): void {
    this.loadFacilities();
    this.listenForBom();
    this.addConsumeItemRow();
    this.listenForProduceQuantity();
  }

  private searchProducts(value: string | null): Observable<any[]> {
    if (!value || typeof value !== 'string') {
      return of([]);
    }

    return this.productService.getProducts(0, value).pipe(
      map((response: any) => response?.documentList || []),
      catchError(() => {
        this.snackbarService.showError('Error fetching products');
        return of([]);
      })
    );
  }


  private loadFacilities(): void {
    this.commonService.getFacilities().subscribe({
      next: (data) => {
        this.facilities = Array.isArray(data) ? data : [data];
      },
      error: (error) => {
        this.snackbarService.showError('Error fetching facilities');
      }
    });
  }

  private listenForBom(): void {
    this.produceProductIdControl.valueChanges.pipe(
      debounceTime(300),
      distinctUntilChanged(),
      switchMap(value => {
        if (!value || typeof value !== 'string') {
          return of([]);
        }
        const trimmed = value.trim();
        if (!trimmed) {
          return of([]);
        }
        return this.manufacturingService.getJobBom(trimmed).pipe(
          catchError(() => {
            this.snackbarService.showError('Error fetching product components');
            return of([]);
          })
        );
      })
    ).subscribe((items) => {
      const list = Array.isArray(items) ? items : [];
      this.resetConsumeItems(list);
    });
  }

  private listenForProduceQuantity(): void {
    this.createJobForm.get('produceEstimatedQuantity')?.valueChanges.pipe(
      debounceTime(200),
      distinctUntilChanged()
    ).subscribe((value) => {
      this.updateConsumeQuantities(value);
    });
  }

  get consumeItemsArray(): FormArray {
    return this.createJobForm.get('consumeItems') as FormArray;
  }

  addConsumeItemRow(productId = '', estimatedQuantity = '', baseQuantity = ''): void {
    this.consumeItemsArray.push(
      this.fb.group({
        productId: [productId, Validators.required],
        estimatedQuantity: [estimatedQuantity, Validators.required],
        baseQuantity: [baseQuantity],
      })
    );
    this.initConsumeAutocomplete(this.consumeItemsArray.length - 1);
  }

  removeConsumeItemRow(index: number): void {
    if (this.consumeItemsArray.length <= 1) {
      return;
    }
    this.consumeItemsArray.removeAt(index);
    this.filteredConsumeProducts.splice(index, 1);
  }

  private resetConsumeItems(items: any[]): void {
    this.consumeItemsArray.clear();
    this.filteredConsumeProducts = [];
    if (items.length) {
      items.forEach((item) => {
        const baseQuantity = item?.estimatedQuantity ?? '';
        this.addConsumeItemRow(item?.productId ?? '', baseQuantity, baseQuantity);
      });
      this.updateConsumeQuantities(this.createJobForm.get('produceEstimatedQuantity')?.value);
    } else {
      this.addConsumeItemRow();
    }
  }

  private updateConsumeQuantities(produceQty: any): void {
    const multiplier = Number(produceQty);
    const effectiveMultiplier = Number.isNaN(multiplier) || multiplier <= 0 ? 1 : multiplier;
    this.consumeItemsArray.controls.forEach((control) => {
      const baseValue = control.get('baseQuantity')?.value;
      if (baseValue === '' || baseValue == null) {
        return;
      }
      const base = Number(baseValue);
      if (Number.isNaN(base)) {
        return;
      }
      control.get('estimatedQuantity')?.setValue(base * effectiveMultiplier, { emitEvent: false });
    });
  }

  private initConsumeAutocomplete(index: number): void {
    const control = this.consumeItemsArray.at(index)?.get('productId');
    if (!control) {
      return;
    }
    this.filteredConsumeProducts[index] = control.valueChanges.pipe(
      startWith(''),
      debounceTime(300),
      distinctUntilChanged(),
      switchMap((value) =>
        this.productService.getProducts(
          0,
          typeof value === 'string' ? value : value?.productId ?? ''
        ).pipe(
          map((response: any) => response?.documentList || []),
          catchError(() => of([]))
        )
      )
    );
  }

  createJob(): void {
    if (this.createJobForm.invalid) return;

    this.isLoading = true;
    const consumeItems = this.consumeItemsArray.controls
      .map((control) => {
        const value = control.value;
        const productId = value?.productId?.productId ?? value?.productId;
        return {
          productId,
          estimatedQuantity: value?.estimatedQuantity,
        };
      })
      .filter((item) => item.productId);
    const formData = {
      ...this.createJobForm.value,
      consumeItems,
    };

    this.manufacturingService
      .createJob(formData)
      .pipe(finalize(() => (this.isLoading = false)))
      .subscribe({
        next: (response) => {
          if (!response?.workEffortId) {
            this.snackbarService.showError('Failed to create production run');
            return;
          }

          this.createJobForm.reset();
          this.createJobForm.get('purposeEnumId')?.setValue('WepProductionRun');
          this.consumeItemsArray.clear();
          this.filteredConsumeProducts = [];
          this.addConsumeItemRow();
          this.router.navigate([`/jobs/${response.workEffortId}`]);
          this.snackbarService.showSuccess('Production run created successfully');
        },
        error: () => {
          this.snackbarService.showError('Error creating production run');
        },
      });
  }
}
