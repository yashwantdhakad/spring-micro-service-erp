import { Component, Inject, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ReactiveFormsModule, FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MatDialogRef, MAT_DIALOG_DATA, MatDialogModule } from '@angular/material/dialog';
import { MatButtonModule } from '@angular/material/button';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import { MatSelectModule } from '@angular/material/select';
import { MatProgressSpinnerModule } from '@angular/material/progress-spinner';
import { FlexLayoutModule } from '@angular/flex-layout';
import { MatCardModule } from '@angular/material/card';
import { AssetService } from 'src/app/services/asset/asset.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';
import { finalize } from 'rxjs/operators';
import { TranslateModule } from '@ngx-translate/core';

@Component({
    selector: 'app-variance-dialog',
    standalone: true,
    imports: [
        CommonModule,
        ReactiveFormsModule,
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
    reasons: any[] = [];
    varianceForm: FormGroup;

    constructor(
        public dialogRef: MatDialogRef<VarianceDialogComponent>,
        @Inject(MAT_DIALOG_DATA) public data: { assetId: string },
        private assetService: AssetService,
        private snackbarService: SnackbarService,
        private fb: FormBuilder
    ) {
        this.varianceForm = this.fb.group({
            varianceReasonId: ['', Validators.required],
            quantityOnHandVar: [0],
            availableToPromiseVar: [0],
            comments: ['']
        });
    }

    ngOnInit(): void {
        this.assetService.getVarianceReasons().subscribe({
            next: (data) => {
                this.reasons = Array.isArray(data) ? data : data ? [data] : [];
            },
            error: () => {
                this.reasons = [];
            }
        });
    }

    save(): void {
        if (this.varianceForm.invalid) {
            this.varianceForm.markAllAsTouched();
            return;
        }

        this.isLoading = true;
        const varianceData = this.varianceForm.value;

        this.assetService.createPhysicalInventoryVariance(this.data.assetId, varianceData)
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
