import { Component, OnInit, ViewChild } from '@angular/core';
import { OrderService } from 'src/app/services/order/order.service';
import { DatePipe } from '@angular/common';
import { finalize } from 'rxjs';
import { MatSort, Sort } from '@angular/material/sort';

@Component({
  selector: 'app-po',
  templateUrl: './po.component.html',
  styleUrls: ['./po.component.css'],
  providers: [DatePipe],
})
export class POComponent implements OnInit {
  @ViewChild(MatSort) sort?: MatSort;
  isLoading: boolean = false;
  queryString: string = '';
  pagination = {
    page: 1,
    rowsPerPage: 10,
  };
  items: any[] = [];
  pages: number = 0;
  currentSort?: Sort;

  displayedColumns: { key: string; value: string }[] = [
    { key: 'orderId', value: 'COMMON.ID' },
    { key: 'organizationName', value: 'PO.BILL_TO' },
    { key: 'vendorOrganizationName', value: 'PO.SHIP_TO' },
    { key: 'entryDate', value: 'PO.ORDER_DATE' },
    { key: 'statusDescription', value: 'COMMON.STATUS' },
    { key: 'facilityName', value: 'COMMON.FACILITY' },
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
    this.orderService.getPOs(page - 1, pageSize, queryString, this.currentSort?.active, this.currentSort?.direction)
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

  onSortChange(sort: Sort): void {
    let direction = sort.direction;
    if (!direction) {
      if (this.currentSort?.active === sort.active) {
        direction = this.currentSort.direction === 'asc' ? 'desc' : 'asc';
      } else {
        direction = 'asc';
      }
    } else if (this.currentSort?.active === sort.active && this.currentSort.direction === direction) {
      direction = direction === 'asc' ? 'desc' : 'asc';
    }
    this.currentSort = { active: sort.active, direction };
    if (this.sort) {
      this.sort.active = sort.active;
      this.sort.direction = direction;
    }
    this.getOrders(this.pagination.page, this.pagination.rowsPerPage, this.queryString);
  }

}
