import { ChangeDetectorRef, Component, OnInit } from '@angular/core';
import { forkJoin } from 'rxjs';
import { CommonService } from 'src/app/services/common/common.service';
import { ShipmentService } from 'src/app/services/shipment/shipment.service';
import { finalize } from 'rxjs/operators';

@Component({
  standalone: false,
  selector: 'app-shipment',
  templateUrl: './shipment.component.html',
  styleUrls: ['./shipment.component.css'],
})
export class ShipmentComponent implements OnInit {
  isLoading: boolean = false;
  queryString: string = '';
  pagination = {
    page: 1,
    rowsPerPage: 10,
  };
  items: any[] = [];
  pages: number = 0;
  statusMap = new Map<string, string>();
  shipmentTypeMap = new Map<string, string>();
  displayedColumns: string[] = [
    'shipmentId',
    'statusId',
    'shipmentTypeId',
    'destinationFacilityId',
    'primaryOrderId',
    'estimatedShipDate',
  ];

  constructor(
    private shipmentService: ShipmentService,
    private commonService: CommonService,
    private cdr: ChangeDetectorRef
  ) {}

  ngOnInit(): void {
    this.loadLookups();
    this.isLoading = true;
    this.getShipments(1, '');
  }

  private loadLookups(): void {
    forkJoin({
      statuses: this.commonService.getAllStatusItems(),
      shipmentTypes: this.commonService.getShipmentTypes(),
    }).subscribe({
      next: ({ statuses, shipmentTypes }) => {
        this.statusMap = new Map(
          (statuses || []).map((item: any) => [
            item.statusId,
            item.description || item.statusId,
          ])
        );
        this.shipmentTypeMap = new Map(
          (shipmentTypes || []).map((item: any) => [
            item.shipmentTypeId,
            item.description || item.shipmentTypeId,
          ])
        );
      },
      error: () => {
        this.statusMap = new Map();
        this.shipmentTypeMap = new Map();
      },
    });
  }

  getShipments(page: number, queryString: string): void {
    this.shipmentService
      .getShipments(page - 1, queryString)
      .subscribe({
        next: (response) => {
          const responseMap = response?.responseMap;
          this.items = responseMap?.resultList || [];
          this.pages = responseMap?.total ?? this.items.length;
          this.isLoading = false;
          this.cdr.detectChanges();
        },
        error: (err) => {
          this.isLoading = false;
          this.cdr.detectChanges();
        },
      });
  }

  getStatusDescription(statusId?: string): string {
    if (!statusId) {
      return '';
    }
    return this.statusMap.get(statusId) || statusId;
  }

  getShipmentTypeDescription(shipmentTypeId?: string): string {
    if (!shipmentTypeId) {
      return '';
    }
    return this.shipmentTypeMap.get(shipmentTypeId) || shipmentTypeId;
  }
}
