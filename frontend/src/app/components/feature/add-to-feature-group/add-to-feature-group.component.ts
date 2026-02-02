import { Component, Inject, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';
import { debounceTime, distinctUntilChanged, startWith, switchMap, finalize, map } from 'rxjs/operators';
import { Observable, of } from 'rxjs';
import { FeatureGroupService } from 'src/app/services/featuregroup/feature-group.service';
import { FeatureService } from 'src/app/services/features/feature.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';

@Component({
  standalone: false,
  selector: 'app-add-to-feature-group',
  templateUrl: './add-to-feature-group.component.html',
  styleUrls: ['./add-to-feature-group.component.css'],
})
export class AddToFeatureGroupComponent implements OnInit {
  createProductFeatureGroupApplForm: FormGroup;
  isLoading: boolean = false;
  filteredGroups$!: Observable<any[]>;
  isNew: boolean;

  constructor(
    public dialogRef: MatDialogRef<AddToFeatureGroupComponent>,
    @Inject(MAT_DIALOG_DATA) public data: { featureGroupData: any },
    private fb: FormBuilder,
    private featureService: FeatureService,
    private featureGroupService: FeatureGroupService,
    private snackbarService: SnackbarService
  ) {
    const {
      productFeatureId,
      productFeatureGroupId,
      isNew,
      sequenceNum,
      fromDate,
    } = this.data?.featureGroupData ?? {};

    this.isNew = isNew;

    this.createProductFeatureGroupApplForm = this.fb.group({
      productFeatureId: [productFeatureId],
      productFeatureGroupId: [productFeatureGroupId, Validators.required],
      sequenceNum: [sequenceNum],
      fromDate: [fromDate],
    });
  }

  ngOnInit(): void {
    this.filteredGroups$ = this.createProductFeatureGroupApplForm.get('productFeatureGroupId')!.valueChanges.pipe(
      startWith(''),
      debounceTime(300),
      distinctUntilChanged(),
      switchMap(value =>
        value && value.length > 0
          ? this.featureGroupService.getFeatureGroups(0, value).pipe(map(res => res.body ?? []))
          : of([])
      )
    );
  }

  createProductFeatureGroupAppl(): void {
    if (this.createProductFeatureGroupApplForm.valid) {
      this.isLoading = true;
      const values = this.createProductFeatureGroupApplForm.value;

      const operation$ = values.fromDate
        ? this.featureService.updateProductFeatureGroupAppl(values)
        : this.featureService.createProductFeatureGroupAppl(values);

      operation$
        .pipe(finalize(() => this.isLoading = false))
        .subscribe({
          next: () => {
            const message = values.fromDate
              ? 'Product feature group application updated successfully'
              : 'Product feature group application created successfully';

            this.snackbarService.showSuccess(message);
            this.dialogRef.close(values);
          },
          error: (err) => {
            this.snackbarService.showError('Error in creating/updating feature to group');
          }
        });
    }
  }
}
