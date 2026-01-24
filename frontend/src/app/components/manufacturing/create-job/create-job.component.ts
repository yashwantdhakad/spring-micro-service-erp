import { Component, OnInit } from '@angular/core';
import {
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
  selector: 'app-create-job',
  templateUrl: './create-job.component.html',
  styleUrls: ['./create-job.component.css'],
})
export class CreateJobComponent implements OnInit {
  isLoading = false;
  facilities: any[] = [];
  consumeItems: any[] = [];

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
      this.consumeItems = Array.isArray(items) ? items : [];
    });
  }

  createJob(): void {
    if (this.createJobForm.invalid) return;

    this.isLoading = true;
    const formData = {
      ...this.createJobForm.value,
      consumeItems: this.consumeItems,
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
          this.consumeItems = [];
          this.router.navigate([`/jobs/${response.workEffortId}`]);
          this.snackbarService.showSuccess('Production run created successfully');
        },
        error: () => {
          this.snackbarService.showError('Error creating production run');
        },
      });
  }
}
