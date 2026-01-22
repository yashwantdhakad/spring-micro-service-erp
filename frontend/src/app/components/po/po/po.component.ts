import { Component, OnInit } from '@angular/core';
import { OrderService } from 'src/app/services/order/order.service';
import { DatePipe } from '@angular/common';
import { finalize } from 'rxjs';

@Component({
  selector: 'app-po',
  templateUrl: './po.component.html',
  styleUrls: ['./po.component.css'],
  providers: [DatePipe],
})
export class POComponent implements OnInit {
  isLoading: boolean = false;
  queryString: string = '';
  pagination = {
    page: 1,
    rowsPerPage: 10,
  };
  items: any[] = [];
  pages: number = 0;

  displayedColumns: { key: string; value: string }[] = [
    { key: 'orderId', value: 'PO.ID' },
    { key: 'organizationName', value: 'PO.BILL_TO' },
    { key: 'vendorOrganizationName', value: 'PO.SHIP_TO' },
    { key: 'entryDate', value: 'PO.ORDER_DATE' },
    { key: 'statusDescription', value: 'PO.STATUS' },
    { key: 'facilityName', value: 'PO.FACILITY' },
    { key: 'quantityTotal', value: 'PO.QUANTITY' },
    { key: 'grandTotal', value: 'PO.TOTAL' },
  ];
  displayedColumnKeys: string[] = this.displayedColumns.map((c) => c.key);

  constructor(
    private orderService: OrderService,
    private datePipe: DatePipe
  ) { }

  ngOnInit(): void {
    this.isLoading = true;
    this.getOrders(1, 10, '');
  }

  getOrders(page: number, pageSize: number, queryString: string): void {
    this.orderService.getPOs(page - 1, pageSize, queryString)
      .pipe(finalize(() => this.isLoading = false))
      .subscribe({
        next: (response) => {
          const { orderList, orderListCount } = response.responseMap;
          this.items = orderList.map((order: any) => ({
            ...order,
            entryDate: this.datePipe.transform(order.entryDate, 'MMMM d, y'),
          }));
          this.pages = orderListCount;
        },
        error: (error) => {
        },
      });
  }

}
