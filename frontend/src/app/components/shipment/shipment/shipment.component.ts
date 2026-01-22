import { Component, OnInit } from '@angular/core';
import { ShipmentService } from 'src/app/services/shipment/shipment.service';
import { finalize } from 'rxjs/operators';

@Component({
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
  displayedColumns: string[] = [
    'shipmentId',
    'status',
    'type',
    'facility',
    'orderId',
    'shipBeforeDate',
  ];

  constructor(private shipmentService: ShipmentService) {}

  ngOnInit(): void {
    this.isLoading = true;
    this.getShipments(1, '');
  }

  getShipments(page: number, queryString: string): void {
    this.shipmentService
      .getShipments(page - 1, queryString)
      .pipe(finalize(() => (this.isLoading = false)))
      .subscribe({
        next: (response) => {
          // Adjust according to actual API shape
          this.items = response.body || response || [];
          this.pages = response.total || 0;
        },
        error: (err) => {
        },
      });
  }
}
