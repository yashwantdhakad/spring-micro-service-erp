import { Component, OnInit } from '@angular/core';
import { finalize } from 'rxjs';
import { ProductService } from 'src/app/services/product/product.service';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css'],
})
export class ProductComponent implements OnInit {
  isLoading = false;
  queryString = '';
  pagination = {
    page: 1,
    rowsPerPage: 10,
  };
  items: any[] = [];
  pages = 0;
  displayedColumns: string[] = ['productId', 'productName', 'productTypeId'];

  customerColumns = [
    { key: 'productId', header: 'COMMON.ID' },
    { key: 'productName', header: 'PRODUCT.NAME' },
    { key: 'productTypeId', header: 'PRODUCT.TYPE' },
  ];

  constructor(private productService: ProductService) { }

  ngOnInit(): void {
    this.isLoading = true;
    this.getProducts(1, '');
  }

  getProducts(page: number, queryString: string): void {
    this.productService
      .getProducts(page - 1, queryString)
      .pipe(finalize(() => this.isLoading = false))
      .subscribe({
        next: (data: any) => {
          console.log(data);
          this.items = data?.documentList ?? [];
          this.pages = data?.documentListCount ?? 0;
        },
        error: (err) => {
          this.items = [];
          this.pages = 0;
        }
      });
  }

  getCustomerColumnKeys(): string[] {
    return this.customerColumns.map((col) => col.key);
  }

  getValue(element: any, key: string): any {
    return key.split('.').reduce((acc, part) => acc && acc[part], element);
  }
}
