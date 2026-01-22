import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ShipmentService } from 'src/app/services/shipment/shipment.service';
import { finalize } from 'rxjs/operators';

@Component({
  selector: 'app-shipment-detail',
  templateUrl: './shipment-detail.component.html',
  styleUrls: ['./shipment-detail.component.css'],
})
export class ShipmentDetailComponent implements OnInit {
  isLoading: boolean = false;
  shipmentId: string | undefined;

  shipmentDetail: any;
  items: any[] = [];
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
  ) {}

  ngOnInit(): void {
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
      .pipe(finalize(() => this.isLoading = false))
      .subscribe({
        next: (response) => {
          this.shipmentDetail = response;
          this.items = response.items || [];
          this.shipmentRouteSegments = response.routeSegments || [];
        },
        error: (error) => {
        }
      });
  }

  getCurrentDateTime(): string {
    return new Date().toString();
  }
}
