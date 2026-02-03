import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Observable, forkJoin, of } from 'rxjs';
import { catchError, debounceTime, distinctUntilChanged, map, startWith, switchMap } from 'rxjs/operators';
import { ManufacturingService } from 'src/app/services/manufacturing/manufacturing.service';
import { ProductService } from 'src/app/services/product/product.service';

@Component({
  standalone: false,
  selector: 'app-bom-create',
  templateUrl: './bom-create.component.html',
  styleUrls: ['./bom-create.component.css'],
})
export class BomCreateComponent implements OnInit {
  form!: FormGroup;
  bomTypes: any[] = [];
  items: any[] = [];
  filteredItemProducts$!: Observable<any[]>;
  filteredComponentProducts$!: Observable<any[]>;
  componentProductControl = new FormControl('');
  newItem = {
    sequenceNum: '',
    quantity: 1,
    fromDate: null as Date | null,
  };
  isSaving = false;

  displayedColumns = [
    'component',
    'sequenceNum',
    'quantity',
    'fromDate',
    'action',
  ];

  constructor(
    private fb: FormBuilder,
    private manufacturingService: ManufacturingService,
    private productService: ProductService,
    private router: Router
  ) {}

  ngOnInit(): void {
    this.form = this.fb.group({
      bomType: ['', Validators.required],
      operation: [''],
      item: ['', Validators.required],
    });

    this.manufacturingService.getProductAssocTypes().subscribe({
      next: (types) => {
        const list = Array.isArray(types) ? types : [];
        this.bomTypes = list.filter((type: any) => this.isBomType(type?.productAssocTypeId));
        if (!this.form.get('bomType')?.value && this.bomTypes.length) {
          const defaultType =
            this.bomTypes.find((type: any) =>
              (type?.productAssocTypeId || '').toUpperCase().includes('MANUF_COMPONENT')
            ) || this.bomTypes[0];
          this.form.patchValue({ bomType: defaultType.productAssocTypeId });
        }
      },
    });

    const itemControl = this.form.get('item') as FormControl;
    this.filteredItemProducts$ = itemControl.valueChanges.pipe(
      startWith(''),
      debounceTime(300),
      distinctUntilChanged(),
      switchMap((value) => this.searchProducts(value))
    );

    this.filteredComponentProducts$ = this.componentProductControl.valueChanges.pipe(
      startWith(''),
      debounceTime(300),
      distinctUntilChanged(),
      switchMap((value) => this.searchProducts(value))
    );
  }

  addItem(): void {
    const componentProductId = this.componentProductControl.value || '';
    if (!componentProductId) {
      return;
    }
    this.items = [
      ...this.items,
      {
        componentProductId,
        sequenceNum: this.newItem.sequenceNum || '',
        quantity: this.newItem.quantity || 1,
        fromDate: this.newItem.fromDate,
      },
    ];
    this.newItem = {
      sequenceNum: '',
      quantity: 1,
      fromDate: null,
    };
    this.componentProductControl.setValue('');
  }

  removeItem(index: number): void {
    this.items = this.items.filter((_, i) => i !== index);
  }

  save(): void {
    if (this.form.invalid || !this.items.length) {
      this.form.markAllAsTouched();
      return;
    }
    const parentProductId = this.form.value.item;
    const assocTypeId = this.form.value.bomType;
    const requests = this.items.map((item) =>
      this.manufacturingService.addProductAssoc(parentProductId, {
        toProductId: item.componentProductId,
        productAssocTypeEnumId: assocTypeId,
        quantity: String(item.quantity || 1),
        fromDate: this.toIsoString(item.fromDate) || new Date().toISOString(),
        sequenceNum: item.sequenceNum || undefined,
      })
    );

    this.isSaving = true;
    forkJoin(requests).subscribe({
      next: () => {
        this.isSaving = false;
        this.router.navigate(['/jobs/boms', parentProductId]);
      },
      error: () => {
        this.isSaving = false;
      },
    });
  }

  private isBomType(typeId?: string): boolean {
    const value = (typeId || '').toUpperCase();
    return value.includes('BOM') || value.includes('COMPONENT');
  }

  private searchProducts(value: string | null): Observable<any[]> {
    if (!value || typeof value !== 'string') {
      return of([]);
    }
    const keyword = value.trim();
    if (!keyword) {
      return of([]);
    }
    return this.productService.getProducts(0, keyword).pipe(
      map((response: any) => response?.documentList || []),
      catchError(() => of([]))
    );
  }

  private toIsoString(value: Date | string | null): string | null {
    if (!value) {
      return null;
    }
    if (value instanceof Date) {
      return value.toISOString();
    }
    const parsed = new Date(value);
    return Number.isNaN(parsed.getTime()) ? null : parsed.toISOString();
  }
}
