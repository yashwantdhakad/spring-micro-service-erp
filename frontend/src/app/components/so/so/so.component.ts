import { ChangeDetectorRef, Component, OnInit, ViewChild } from '@angular/core';
import { OrderService } from 'src/app/services/order/order.service';
import { MatSort, Sort } from '@angular/material/sort';

@Component({
  standalone: false,
  selector: 'app-so',
  templateUrl: './so.component.html',
  styleUrls: ['./so.component.css'],
})
export class SOComponent implements OnInit {
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
  displayedColumns: string[] = [
    'id',
    'orderId',
    'customerName',
    'organizationName',
    'entryDate',
    'statusDescription',
    'storeName',
    'grandTotal',
  ];

  constructor(
    private orderService: OrderService,
    private cdr: ChangeDetectorRef
  ) {}

  ngOnInit(): void {
    this.isLoading = true;
    this.getOrders(1, '');
  }

  getOrders(page: number, queryString: string): void {
    this.orderService.getOrders(page - 1, queryString, this.currentSort?.active, this.currentSort?.direction).subscribe({
      next: (response) => {
        const { orderList, orderListCount } = response.responseMap;
        this.items = orderList;
        this.pages = orderListCount;
        this.isLoading = false;
        this.cdr.detectChanges();
      },
      error: (error) => {
        this.isLoading = false;
        this.cdr.detectChanges();
      }
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
    this.getOrders(this.pagination.page, this.queryString);
  }
}
