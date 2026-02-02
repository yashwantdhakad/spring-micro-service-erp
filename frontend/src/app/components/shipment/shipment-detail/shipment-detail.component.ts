import { ChangeDetectorRef, Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { forkJoin } from 'rxjs';
import { CommonService } from 'src/app/services/common/common.service';
import { ShipmentService } from 'src/app/services/shipment/shipment.service';
import { finalize } from 'rxjs/operators';

@Component({
  standalone: false,
  selector: 'app-shipment-detail',
  templateUrl: './shipment-detail.component.html',
  styleUrls: ['./shipment-detail.component.css'],
})
export class ShipmentDetailComponent implements OnInit {
  isLoading: boolean = false;
  shipmentId: string | undefined;

  shipmentDetail: any;
  items: any[] = [];
  statusMap = new Map<string, string>();
  shipmentTypeMap = new Map<string, string>();
  shipmentMethodTypeMap = new Map<string, string>();
  itemColumns: string[] = [
    'shipmentItemSourceId',
    'orderId',
    'orderItemSeqId',
    'quantity',
    'quantityNotHandled',
    'status',
  ];

  shipmentRouteSegments: any[] = [];
  shipmentRouteSegColumns: string[] = [
    'routeSegSeqId',
    'destFacility',
    'destTelecom',
    'destPostal',
  ];

  constructor(
    private readonly shipmentService: ShipmentService,
    private readonly route: ActivatedRoute,
    private readonly commonService: CommonService,
    private cdr: ChangeDetectorRef
  ) {}

  ngOnInit(): void {
    this.loadLookups();
    this.route.params.subscribe((params) => {
      this.shipmentId = params['shipmentId'];
      if (this.shipmentId) {
        this.getShipment(this.shipmentId);
      }
    });
  }

  getShipment(shipmentId: string): void {
    this.isLoading = true;
    this.shipmentService.getShipment(shipmentId)
      .subscribe({
        next: (response) => {
          this.shipmentDetail = response?.shipment || response;
          this.items = response?.items || [];
          this.shipmentRouteSegments = response?.routeSegments || [];
          this.isLoading = false;
          this.cdr.detectChanges();
        },
        error: (error) => {
          this.isLoading = false;
          this.cdr.detectChanges();
        }
      });
  }

  private loadLookups(): void {
    forkJoin({
      statuses: this.commonService.getAllStatusItems(),
      shipmentTypes: this.commonService.getShipmentTypes(),
      shipmentMethodTypes: this.commonService.getShipmentMethodTypes(),
    }).subscribe({
      next: ({ statuses, shipmentTypes, shipmentMethodTypes }) => {
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
        this.shipmentMethodTypeMap = new Map(
          (shipmentMethodTypes || []).map((item: any) => [
            item.shipmentMethodTypeId,
            item.description || item.shipmentMethodTypeId,
          ])
        );
      },
      error: () => {
        this.statusMap = new Map();
        this.shipmentTypeMap = new Map();
        this.shipmentMethodTypeMap = new Map();
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

  getShipmentMethodDescription(shipmentMethodTypeId?: string): string {
    if (!shipmentMethodTypeId) {
      return '';
    }
    return this.shipmentMethodTypeMap.get(shipmentMethodTypeId) || shipmentMethodTypeId;
  }

  getCurrentDateTime(): string {
    return new Date().toString();
  }
}
