import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { finalize } from 'rxjs/operators';
import { PartyService } from 'src/app/services/party/party.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';
import { TranslateService } from '@ngx-translate/core';

@Component({
  standalone: false,
  selector: 'app-create-supplier',
  templateUrl: './create-supplier.component.html',
  styleUrls: ['./create-supplier.component.css'],
})
export class CreateSupplierComponent {
  isLoading: boolean = false;
  supplierForm: FormGroup;

  constructor(
    private fb: FormBuilder,
    private partyService: PartyService,
    private router: Router,
    private snackbarService: SnackbarService,
    private translate: TranslateService
  ) {
    this.supplierForm = this.fb.group({
      groupName: ['', Validators.required],
      emailAddress: ['', [Validators.required, Validators.email]],
      contactNumber: ['', [Validators.required, Validators.minLength(10)]],
      roleTypeId: ['SUPPLIER'],
    });
  }

  createSupplier(): void {
    if (this.supplierForm.invalid) {
      this.supplierForm.markAllAsTouched();
      return;
    }
    this.isLoading = true;
    const values = this.supplierForm.value;

    this.partyService
      .createSupplier(values)
      .pipe(finalize(() => (this.isLoading = false)))
      .subscribe({
        next: (data) => {
          if (data?.partyId) {
            this.snackbarService.showSuccess(
              this.translate.instant('SUPPLIER.CREATED_SUCCESS')
            );
            this.router.navigate([`/suppliers/${data.partyId}`]);
            this.supplierForm.reset({ roleTypeId: 'SUPPLIER' });
          } else {
            this.snackbarService.showError(
              this.translate.instant('SUPPLIER.FAILED_CREATE')
            );
          }
        },
        error: () => {
          this.snackbarService.showError(
            this.translate.instant('SUPPLIER.ERROR_CREATE')
          );
        },
      });
  }
}
