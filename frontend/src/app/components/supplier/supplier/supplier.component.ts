import { Component, OnInit } from '@angular/core';
import { finalize } from 'rxjs/operators';
import { PartyService } from 'src/app/services/party/party.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';

@Component({
  selector: 'app-supplier',
  templateUrl: './supplier.component.html',
  styleUrls: ['./supplier.component.css'],
})
export class SupplierComponent implements OnInit {
  isLoading: boolean = false;
  queryString: string = '';
  pagination = {
    page: 1,
    rowsPerPage: 10,
  };
  items: any[] = [];
  pages: number = 0;
  supplierColumns = [
    { key: 'party_id', header: 'SUPPLIER.ID' },
    { key: 'groupName', header: 'SUPPLIER.NAME' },
    { key: 'contactNumber', header: 'SUPPLIER.PHONE' },
    { key: 'emailAddress', header: 'SUPPLIER.EMAIL' },
  ];

  constructor(
    private partyService: PartyService,
    private snackbarService: SnackbarService
  ) {}

  ngOnInit(): void {
    this.isLoading = true;
    this.getSuppliers(1, '');
  }

  getSuppliers(page: number, queryString: string): void {
    this.partyService
      .getSuppliers(page - 1, queryString)
      .pipe(finalize(() => (this.isLoading = false)))
      .subscribe({
        next: (response: any) => {
          const { resultList, documentListCount } = response;
          this.items = resultList;
          this.pages = documentListCount;
        },
        error: () => {
          this.items = [];
          this.pages = 0;
          this.snackbarService.showError('Error fetching suppliers');
        },
      });
  }

  getSupplierColumnKeys(): string[] {
    return this.supplierColumns.map((col) => col.key);
  }

  getValue(element: any, key: string): any {
    return key.split('.').reduce((acc, part) => acc && acc[part], element);
  }
}
