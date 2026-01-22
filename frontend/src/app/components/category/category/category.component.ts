import { Component, OnInit } from '@angular/core';
import { CategoryService } from 'src/app/services/category/category.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service'; // Import SnackbarService
import { debounceTime, distinctUntilChanged, Subject } from 'rxjs';

@Component({
  selector: 'app-category',
  templateUrl: './category.component.html',
  styleUrls: ['./category.component.css'],
})
export class CategoryComponent implements OnInit {
  isLoading: boolean = false;
  queryString: string = '';
  pagination = {
    page: 1,
    rowsPerPage: 10,
  };
  items: any[] = [];
  pages: number = 0;
  displayedColumns = [
    { key: 'productCategoryId', header: 'CATEGORY.ID' },
    { key: 'categoryName', header: 'CATEGORY.NAME' },
    { key: 'productCategoryTypeId', header: 'CATEGORY.TYPE' },
  ];
  private searchSubject: Subject<string> = new Subject<string>();

  constructor(
    private categoryService: CategoryService,
    private snackbarService: SnackbarService // Inject SnackbarService
  ) { }

  ngOnInit(): void {
    this.isLoading = true;
    this.getCategories(1, '');

    // Debounce search input
    this.searchSubject.pipe(
      debounceTime(300),
      distinctUntilChanged()
    ).subscribe(query => {
      this.getCategories(1, query);
    });
  }

  onSearch(): void {
    this.isLoading = true;
    this.searchSubject.next(this.queryString);
  }

  getCategories(page: number, queryString: string): void {
    this.categoryService.getCategories(page - 1, queryString).subscribe({
      next: (response) => {
        const { body, headers } = response;
        this.items = body;
        this.pages = parseInt(headers.get('x-total-count') || '0', 10);
      },
      error: (error) => {
        this.snackbarService.showError('Error fetching categories');
      },
      complete: () => {
        this.isLoading = false;
      }
    });
  }


  getColumnKeys(): string[] {
    return this.displayedColumns.map(col => col.key);
  }
}
