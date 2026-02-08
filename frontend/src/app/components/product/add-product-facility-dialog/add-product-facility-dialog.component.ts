import { Component, Inject, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';
import { TranslateService } from '@ngx-translate/core';
import { FacilityService } from 'src/app/services/facility/facility.service';
import { ProductFacilityService } from 'src/app/services/product/product-facility.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';

@Component({
    standalone: false,
    selector: 'app-add-product-facility-dialog',
    templateUrl: './add-product-facility-dialog.component.html',
    styleUrls: ['./add-product-facility-dialog.component.css']
})
export class AddProductFacilityDialogComponent implements OnInit {
    form: FormGroup;
    facilities: any[] = [];
    isLoading = false;

    constructor(
        private fb: FormBuilder,
        private dialogRef: MatDialogRef<AddProductFacilityDialogComponent>,
        @Inject(MAT_DIALOG_DATA) public data: { productId: string, productFacility?: any },
        private facilityService: FacilityService,
        private productFacilityService: ProductFacilityService,
        private snackbar: SnackbarService,
        private translate: TranslateService
    ) {
        this.form = this.fb.group({
            facilityId: [data.productFacility?.facilityId || '', Validators.required],
            minimumStock: [data.productFacility?.minimumStock || '', Validators.required],
            reorderQuantity: [data.productFacility?.reorderQuantity || '', Validators.required],
            daysToShip: [data.productFacility?.daysToShip || '']
        });
    }

    ngOnInit(): void {
        this.loadFacilities();
    }

    loadFacilities(): void {
        this.facilityService.getFacilities().subscribe({
            next: (data) => {
                this.facilities = Array.isArray(data) ? data : [];
            },
            error: () => this.snackbar.showError(this.translate.instant('COMMON.ERROR_LOADING_DATA'))
        });
    }

    save(): void {
        if (this.form.invalid) return;

        this.isLoading = true;
        const payload = {
            ...this.form.value,
            productId: this.data.productId
        };

        const request = this.data.productFacility
            ? this.productFacilityService.updateProductFacility(this.data.productFacility.id, payload)
            : this.productFacilityService.createProductFacility(payload);

        request.subscribe({
            next: (res) => {
                this.isLoading = false;
                this.dialogRef.close(res);
                this.snackbar.showSuccess(this.translate.instant('COMMON.SAVE_SUCCESS'));
            },
            error: () => {
                this.isLoading = false;
                this.snackbar.showError(this.translate.instant('COMMON.SAVE_ERROR'));
            }
        });
    }

    close(): void {
        this.dialogRef.close();
    }
}
