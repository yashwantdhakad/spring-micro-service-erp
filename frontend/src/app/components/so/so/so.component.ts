import { Component, OnInit } from '@angular/core';
import { OrderService } from 'src/app/services/order/order.service';

@Component({
  selector: 'app-so',
  templateUrl: './so.component.html',
  styleUrls: ['./so.component.css'],
})
export class SOComponent implements OnInit {
  isLoading: boolean = false;
  queryString: string = '';
  pagination = {
    page: 1,
    rowsPerPage: 10,
  };
  items: any[] = [];
  pages: number = 0;
  displayedColumns: string[] = [
    'orderId',
    'customerName',
    'organizationName',
    'entryDate',
    'statusDescription',
    'storeName',
    'grandTotal',
  ];

  constructor(private orderService: OrderService) {}

  ngOnInit(): void {
    this.isLoading = true;
    this.getOrders(1, '');
  }

  getOrders(page: number, queryString: string): void {
    this.orderService.getOrders(page - 1, queryString).subscribe({
      next: (response) => {
        const { orderList, orderListCount } = response.responseMap;
        this.items = orderList;
        this.pages = orderListCount;
      },
      error: (error) => {
      },
      complete: () => {
        this.isLoading = false;
      }
    });
  }
}
