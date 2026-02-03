import { ChangeDetectorRef, Component, OnInit } from '@angular/core';
import { finalize, map, tap } from 'rxjs/operators';
import { ManufacturingService } from 'src/app/services/manufacturing/manufacturing.service';

@Component({
  standalone: false,
  selector: 'app-boms',
  templateUrl: './boms.component.html',
  styleUrls: ['./boms.component.css'],
})
export class BomsComponent implements OnInit {
  isLoading = false;
  productFilter = '';
  selectedBomType = '';
  bomTypes: any[] = [];
  boms: any[] = [];
  pagedBoms: any[] = [];
  pagination = {
    page: 1,
    rowsPerPage: 10,
  };
  pages = 0;

  columns = [
    { key: 'bomId', label: 'BOM.ID' },
    { key: 'product', label: 'BOM.PRODUCT' },
  ];

  constructor(
    private manufacturingService: ManufacturingService,
    private cdr: ChangeDetectorRef
  ) {}

  ngOnInit(): void {
    this.loadBomTypes();
    this.loadBoms();
  }

  loadBomTypes(): void {
    this.manufacturingService.getProductAssocTypes().subscribe({
      next: (types) => {
        const list = Array.isArray(types) ? types : [];
        this.bomTypes = list.filter((type: any) => this.isBomType(type?.productAssocTypeId));
      },
      error: () => {
        this.bomTypes = [];
      },
    });
  }

  loadBoms(): void {
    this.isLoading = true;
    this.manufacturingService
      .getBoms(
        this.pagination.page - 1,
        this.pagination.rowsPerPage,
        this.productFilter,
        this.selectedBomType
      )
      .pipe(
        map((response: any) => ({
          items: Array.isArray(response?.documentList) ? response.documentList : [],
          total: response?.documentListCount ?? 0,
        })),
        tap(({ items, total }) => {
          this.boms = items.map((item: any) => ({
            bomId: item.productId,
            bomName: item.productName || item.productId,
            productId: item.productId,
            productName: item.productName || item.productId,
            bomType: item.bomTypeId,
            bomTypeLabel: item.bomTypeLabel || item.bomTypeId,
          }));
          this.pagedBoms = this.boms;
          this.pages = total;
        }),
        finalize(() => {
          this.isLoading = false;
          this.cdr.detectChanges();
        })
      )
      .subscribe();
  }

  applyFilters(): void {
    this.pagination.page = 1;
    this.loadBoms();
  }

  clearFilters(): void {
    this.productFilter = '';
    this.selectedBomType = '';
    this.pagination.page = 1;
    this.applyFilters();
  }

  onPageChange(pageIndex: number): void {
    this.pagination.page = pageIndex + 1;
    this.loadBoms();
  }

  private isBomType(typeId?: string): boolean {
    const value = (typeId || '').toUpperCase();
    return value.includes('BOM') || value.includes('COMPONENT');
  }
}
