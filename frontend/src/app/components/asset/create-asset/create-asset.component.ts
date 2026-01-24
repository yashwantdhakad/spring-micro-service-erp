import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators, FormControl } from '@angular/forms';
import { Router } from '@angular/router';
import { Observable, of } from 'rxjs';
import {
  debounceTime,
  distinctUntilChanged,
  map,
  startWith,
  switchMap,
  finalize,
  catchError,
} from 'rxjs/operators';
import { AssetService } from 'src/app/services/asset/asset.service';
import { CommonService } from 'src/app/services/common/common.service';
import { PartyService } from 'src/app/services/party/party.service';
import { ProductService } from 'src/app/services/product/product.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';

@Component({
  selector: 'app-create-asset',
  templateUrl: './create-asset.component.html',
  styleUrls: ['./create-asset.component.css'],
})
export class CreateAssetComponent implements OnInit {
  isLoading = false;
  createAssetForm: FormGroup;
  facilities: any[] = [];
  facilityLocations: any[] = [];
  statusList: any[] = [];
  filteredSuppliers$: Observable<any[]> = of([]);
  supplierPartyIdControl = new FormControl();
  filteredProducts$: Observable<any[]> = of([]);

  constructor(
    private fb: FormBuilder,
    private router: Router,
    private commonService: CommonService,
    private partyService: PartyService,
    private productService: ProductService,
    private assetService: AssetService,
    private snackbarService: SnackbarService
  ) {
    this.createAssetForm = this.fb.group({
      productId: ['', Validators.required],
      statusId: ['AstAvailable', Validators.required],
      facilityId: ['', Validators.required],
      locationSeqId: [''],
      receivedDate: [''],
      manufacturedDate: [''],
      expirationDate: [''],
      vendorPartyId: [''],
      quantity: ['', [Validators.required, Validators.min(1)]],
      acquireCost: ['', Validators.required],
      comments: [''],
    });

    this.createAssetForm.get('facilityId')?.valueChanges.subscribe((facilityId) => {
      this.filterLocationsByFacility(facilityId);
    });
  }

  ngOnInit(): void {
    this.initializeData();
    this.setupAutocomplete();
  }

  private setupAutocomplete(): void {
    this.filteredSuppliers$ = this.supplierPartyIdControl.valueChanges.pipe(
      startWith(''),
      debounceTime(300),
      distinctUntilChanged(),
      switchMap((value: string) => this.getSuppliersFromService(value))
    );

    this.filteredProducts$ = this.createAssetForm.get('productId')!.valueChanges.pipe(
      startWith(''),
      debounceTime(300),
      distinctUntilChanged(),
      switchMap((value: string) => this.getProductsFromService(value))
    );
  }

  private filterLocationsByFacility(facilityId: string): void {
    if (!facilityId) {
      this.facilityLocations = [];
      return;
    }
    this.facilityLocations = this.facilityLocations.filter(
      (location) => location.facilityId === facilityId
    );
    this.createAssetForm.get('locationSeqId')?.setValue('');
  }

  private initializeData(): void {
    this.getStatusItem();
    this.getFacilities();
    this.getFacilityLocations();
  }

  private getSuppliersFromService(value: string): Observable<any[]> {
    if (!value) {
      return of([]);
    }
    return this.partyService.getSuppliers(0, value).pipe(
      map((res: any) => res?.resultList ?? []),
      catchError(() => {
        this.snackbarService.showError('Error fetching suppliers.');
        return of([]);
      })
    );
  }

  private getProductsFromService(value: string): Observable<any[]> {
    if (!value) {
      return of([]);
    }
    return this.productService.getProducts(0, value).pipe(
      map((res: any) => res?.documentList ?? []),
      catchError(() => {
        this.snackbarService.showError('Error fetching products.');
        return of([]);
      })
    );
  }

  getStatusItem(): void {
    this.commonService.getStatusItems('Asset').subscribe({
      next: (data) => {
        this.statusList = Array.isArray(data) ? data : [data];
        if (this.statusList.length === 0) {
          this.statusList = this.getDefaultStatuses();
        }
      },
      error: () => {
        this.statusList = this.getDefaultStatuses();
        this.snackbarService.showError('Error fetching asset status list.');
      }
    });
  }

  getFacilities(): void {
    this.commonService.getFacilities().subscribe({
      next: (data) => {
        this.facilities = Array.isArray(data) ? data : [data];
      },
      error: () => {
        this.snackbarService.showError('Error fetching facilities.');
      }
    });
  }

  getFacilityLocations(): void {
    this.commonService.getFacilityLocations().subscribe({
      next: (data) => {
        this.facilityLocations = Array.isArray(data) ? data : [data];
      },
      error: () => {
        this.snackbarService.showError('Error fetching facility locations.');
      }
    });
  }

  receiveAsset(): void {
    if (this.createAssetForm.invalid) {
      this.createAssetForm.markAllAsTouched();
      return;
    }

    const values = this.createAssetForm.value;
    this.isLoading = true;

    const payload = {
      ...values,
      receivedDate: this.toLocalDateTime(values.receivedDate),
      manufacturedDate: this.toLocalDateTime(values.manufacturedDate),
      expirationDate: this.toLocalDateTime(values.expirationDate),
    };

    this.assetService.receiveAsset(payload).pipe(
      finalize(() => (this.isLoading = false))
    ).subscribe({
      next: (data: any) => {
        if (!data?.assetId) {
          this.snackbarService.showError('Failed to receive asset.');
          return;
        }
        this.snackbarService.showSuccess('Asset received successfully.');
        this.createAssetForm.reset({ statusId: 'AstAvailable' });
        this.router.navigate([`/assets/${data.assetId}`]);
      },
      error: () => {
        this.snackbarService.showError('Error receiving asset.');
      }
    });
  }

  private toLocalDateTime(value: any): string | null {
    if (!value) {
      return null;
    }
    if (value instanceof Date && !isNaN(value.getTime())) {
      const year = value.getFullYear();
      const month = String(value.getMonth() + 1).padStart(2, '0');
      const day = String(value.getDate()).padStart(2, '0');
      return `${year}-${month}-${day}T00:00:00`;
    }
    if (typeof value === 'string') {
      if (value.includes('T')) {
        return value;
      }
      return `${value}T00:00:00`;
    }
    return null;
  }

  private getDefaultStatuses(): any[] {
    return [
      { statusId: 'AstAvailable', description: 'Available' },
      { statusId: 'AstInUse', description: 'In Use' },
      { statusId: 'AstOutOfService', description: 'Out of Service' },
    ];
  }
}
