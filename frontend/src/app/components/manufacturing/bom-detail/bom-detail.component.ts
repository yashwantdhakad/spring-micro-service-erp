import { ChangeDetectorRef, Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { MatDialog } from '@angular/material/dialog';
import { Observable, forkJoin, of } from 'rxjs';
import { catchError, finalize, map, switchMap, tap } from 'rxjs/operators';
import { ManufacturingService } from 'src/app/services/manufacturing/manufacturing.service';
import { BomAddComponentDialogComponent } from '../bom-add-component-dialog/bom-add-component-dialog.component';
import { ConfirmationDialogComponent } from '../../common/confirmation-dialog/confirmation-dialog.component';

@Component({
  standalone: false,
  selector: 'app-bom-detail',
  templateUrl: './bom-detail.component.html',
  styleUrls: ['./bom-detail.component.css'],
})
export class BomDetailComponent implements OnInit {
  isLoading = false;
  productId = '';
  productName = '';
  bomTypeLabel = '';
  bomTypeId = '';
  components: any[] = [];
  bomSimulationRows: any[] = [];
  bomTypes: any[] = [];

  componentColumns = [
    'seq',
    'component',
    'sequenceNum',
    'quantity',
    'fromDate',
    'thruDate',
    'scrap',
    'inst',
    'action',
  ];

  simulationColumns = [
    'level',
    'productId',
    'virtual',
    'productName',
    'quantity',
  ];

  constructor(
    private route: ActivatedRoute,
    private manufacturingService: ManufacturingService,
    private dialog: MatDialog,
    private cdr: ChangeDetectorRef
  ) {}

  ngOnInit(): void {
    this.route.paramMap
      .pipe(
        map((params) => params.get('productId') || ''),
        tap((productId) => (this.productId = productId)),
        switchMap((productId) => this.loadBom(productId))
      )
      .subscribe();
  }

  loadBom(productId: string): Observable<void> {
    if (!productId) {
      return of(void 0);
    }
    this.isLoading = true;
    return forkJoin({
      productDetail: this.manufacturingService.getProductDetail(productId).pipe(catchError(() => of(null))),
      bomTypes: this.manufacturingService.getProductAssocTypes().pipe(catchError(() => of([]))),
    }).pipe(
      tap(({ productDetail, bomTypes }) => {
        this.bomTypes = Array.isArray(bomTypes) ? bomTypes : [];
        const product = productDetail?.product;
        this.productName = product?.productName || product?.name || productId;
        this.bomTypeLabel = 'Manufacturing';

        const assocs = Array.isArray(productDetail?.assocs) ? productDetail.assocs : [];
        const components = assocs.filter((assoc: any) =>
          this.isBomType(assoc?.type?.productAssocTypeId || assoc?.productAssocTypeId)
        );

        this.components = components.map((assoc: any, index: number) => ({
          assocId: assoc?.id,
          seq: index + 1,
          componentId: assoc?.toProduct?.productId || assoc?.toProductId,
          componentName: assoc?.toProduct?.productName || assoc?.toProduct?.name,
          assocTypeId: assoc?.type?.productAssocTypeId || assoc?.productAssocTypeId,
          sequenceNum: assoc?.sequenceNum,
          quantity: assoc?.quantity || '-',
          fromDate: assoc?.fromDate,
          thruDate: assoc?.thruDate,
          scrap: assoc?.scrapFactor || '-',
          inst: assoc?.instruction || '-',
        }));

        if (!this.bomTypeId && this.components.length) {
          this.bomTypeId = this.components[0].assocTypeId || '';
        }
        if (!this.bomTypeId) {
          this.bomTypeId = this.getDefaultBomTypeId();
        }

        this.bomSimulationRows = this.buildSimulationRows();
      }),
      map(() => void 0),
      finalize(() => {
        this.isLoading = false;
        this.cdr.detectChanges();
      })
    );
  }

  openAddComponentDialog(): void {
    if (!this.productId) {
      return;
    }
    this.dialog
      .open(BomAddComponentDialogComponent, {
        width: '520px',
        data: {
          productId: this.productId,
          bomTypeId: this.bomTypeId || this.getDefaultBomTypeId(),
        },
      })
      .afterClosed()
      .subscribe((saved) => {
        if (saved) {
          this.loadBom(this.productId).subscribe();
        }
      });
  }

  openEditComponentDialog(item: any): void {
    if (!this.productId || !item?.assocId) {
      return;
    }
    this.dialog
      .open(BomAddComponentDialogComponent, {
        width: '520px',
        data: {
          productId: this.productId,
          bomTypeId: this.bomTypeId,
          mode: 'edit',
          assocId: item.assocId,
          componentProductId: item.componentId,
          quantity: item.quantity,
          sequenceNum: item.sequenceNum,
          fromDate: item.fromDate,
        },
      })
      .afterClosed()
      .subscribe((saved) => {
        if (saved) {
          this.loadBom(this.productId).subscribe();
        }
      });
  }

  confirmDeleteComponent(item: any): void {
    if (!item?.assocId) {
      return;
    }
    const dialogRef = this.dialog.open(ConfirmationDialogComponent, {
      width: '350px',
      data: {
        message: 'Are you sure you want to expire this component?',
      },
    });

    dialogRef.afterClosed().subscribe((confirmed) => {
      if (!confirmed) {
        return;
      }
      this.manufacturingService.expireProductAssoc(item.assocId).subscribe({
        next: () => this.loadBom(this.productId).subscribe(),
      });
    });
  }

  private buildSimulationRows(): any[] {
    const rows: any[] = [];
    rows.push({
      level: 0,
      productId: this.productId,
      productName: this.productName,
      quantity: 1,
      virtual: '',
    });
    this.components.forEach((component) => {
      rows.push({
        level: 1,
        productId: component.componentId,
        productName: component.componentName || component.componentId,
        quantity: component.quantity,
        virtual: '',
      });
    });
    return rows;
  }

  private isBomType(typeId?: string): boolean {
    const value = (typeId || '').toUpperCase();
    return value.includes('BOM') || value.includes('COMPONENT');
  }

  private getDefaultBomTypeId(): string {
    const bomTypes = this.bomTypes.filter((type: any) => this.isBomType(type?.productAssocTypeId));
    if (!bomTypes.length) {
      return '';
    }
    const preferred =
      bomTypes.find((type: any) =>
        (type?.productAssocTypeId || '').toUpperCase().includes('BILL_OF_MATERIAL')
      ) || bomTypes[0];
    return preferred?.productAssocTypeId || '';
  }
}
