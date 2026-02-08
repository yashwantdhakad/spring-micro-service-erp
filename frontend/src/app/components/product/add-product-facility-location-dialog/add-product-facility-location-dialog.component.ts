import { Component, Inject, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';
import { TranslateService } from '@ngx-translate/core';
import { FacilityService } from 'src/app/services/facility/facility.service';
import { ProductFacilityService } from 'src/app/services/product/product-facility.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';

@Component({
    standalone: false,
    selector: 'app-add-product-facility-location-dialog',
    templateUrl: './add-product-facility-location-dialog.component.html',
    styleUrls: ['./add-product-facility-location-dialog.component.css']
})
export class AddProductFacilityLocationDialogComponent implements OnInit {
    form: FormGroup;
    locations: any[] = [];
    isLoading = false;

    constructor(
        private fb: FormBuilder,
        private dialogRef: MatDialogRef<AddProductFacilityLocationDialogComponent>,
        @Inject(MAT_DIALOG_DATA) public data: { productId: string, facilityId: string, facilityName: string, productFacilityLocation?: any },
        private facilityService: FacilityService,
        private productFacilityService: ProductFacilityService,
        private snackbar: SnackbarService,
        private translate: TranslateService
    ) {
        this.form = this.fb.group({
            locationSeqId: [data.productFacilityLocation?.locationSeqId || '', Validators.required],
            minimumStock: [data.productFacilityLocation?.minimumStock || ''],
            moveQuantity: [data.productFacilityLocation?.moveQuantity || ''],
            reorderQuantity: [data.productFacilityLocation?.reorderQuantity || ''],
            maximumStock: [data.productFacilityLocation?.maximumStock || '']
        });
    }

    ngOnInit(): void {
        this.loadLocations();
    }

    loadLocations(): void {
        // We want all locations, so we pass a large page size
        // Note: This API might return a Page object or a List. 
        // Assuming standard pagination response structure if paginated.
        this.facilityService.getFacilityLocations(this.data.facilityId, 0, 1000).subscribe({
            next: (response) => {
                if (response && response.content) {
                    this.locations = response.content;
                } else if (Array.isArray(response)) {
                    this.locations = response;
                } else {
                    this.locations = [];
                }
            },
            error: () => this.snackbar.showError(this.translate.instant('COMMON.ERROR_LOADING_DATA'))
        });
    }

    save(): void {
        if (this.form.invalid) return;

        this.isLoading = true;
        const payload = {
            ...this.form.value,
            productId: this.data.productId,
            facilityId: this.data.facilityId
        };

        const request = this.data.productFacilityLocation
            ? this.productFacilityService.updateProductFacilityLocation(this.data.productFacilityLocation.id, payload)
            : this.productFacilityService.createProductFacilityLocation(payload);

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
