import { Component, Inject, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { MatDialogRef, MAT_DIALOG_DATA, MatDialogModule } from '@angular/material/dialog';
import { MatButtonModule } from '@angular/material/button';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import { MatSelectModule } from '@angular/material/select';
import { MatProgressSpinnerModule } from '@angular/material/progress-spinner';
import { FlexLayoutModule } from '@angular/flex-layout';
import { MatCardModule } from '@angular/material/card';
import { AssetService } from 'src/app/services/asset/asset.service';
import { CommonService } from 'src/app/services/common/common.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';
import { finalize } from 'rxjs/operators';
import { Observable } from 'rxjs';
import { TranslateModule } from '@ngx-translate/core';

@Component({
    selector: 'app-variance-dialog',
    standalone: true,
    imports: [
        CommonModule,
        FormsModule,
        MatDialogModule,
        MatButtonModule,
        MatFormFieldModule,
        MatInputModule,
        MatSelectModule,
        MatProgressSpinnerModule,
        FlexLayoutModule,
        MatCardModule,
        TranslateModule
    ],
    templateUrl: './variance-dialog.component.html'
})
export class VarianceDialogComponent implements OnInit {
    isLoading = false;
    reasons$: Observable<any[]> | undefined;

    variance = {
        varianceReasonId: '',
        quantityOnHandVar: 0,
        availableToPromiseVar: 0,
        comments: ''
    };

    constructor(
        public dialogRef: MatDialogRef<VarianceDialogComponent>,
        @Inject(MAT_DIALOG_DATA) public data: { assetId: string },
        private assetService: AssetService,
        private commonService: CommonService,
        private snackbarService: SnackbarService
    ) { }

    ngOnInit(): void {
        this.reasons$ = this.commonService.getEnumTypes('IID_REASON');
    }

    save(): void {
        if (!this.variance.varianceReasonId) {
            this.snackbarService.showError('Reason is required');
            return;
        }

        this.isLoading = true;
        this.assetService.createPhysicalInventoryVariance(this.data.assetId, this.variance)
            .pipe(finalize(() => this.isLoading = false))
            .subscribe({
                next: () => {
                    this.snackbarService.showSuccess('Variance created successfully');
                    this.dialogRef.close(true);
                },
                error: () => {
                    this.snackbarService.showError('Failed to create variance');
                }
            });
    }

    cancel(): void {
        this.dialogRef.close(false);
    }
}
