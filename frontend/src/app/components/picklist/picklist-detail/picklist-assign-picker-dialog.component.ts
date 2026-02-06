import { Component, Inject, OnDestroy, OnInit } from '@angular/core';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';
import { Subject, finalize, takeUntil } from 'rxjs';
import { PartyService } from 'src/app/services/party/party.service';

@Component({
  standalone: false,
  selector: 'app-picklist-assign-picker-dialog',
  templateUrl: './picklist-assign-picker-dialog.component.html',
  styleUrls: ['./picklist-assign-picker-dialog.component.css'],
})
export class PicklistAssignPickerDialogComponent implements OnInit, OnDestroy {
  isLoading = true;
  pickers: { partyId: string; name: string }[] = [];
  selectedPartyId: string | null = null;

  private destroy$ = new Subject<void>();

  constructor(
    private partyService: PartyService,
    private dialogRef: MatDialogRef<PicklistAssignPickerDialogComponent>,
    @Inject(MAT_DIALOG_DATA) public data: { picklistId: string }
  ) {}

  ngOnInit(): void {
    this.loadPickers();
  }

  loadPickers(): void {
    this.partyService
      .getPartyRoleSummaries('PICKER')
      .pipe(
        takeUntil(this.destroy$),
        finalize(() => setTimeout(() => (this.isLoading = false), 0))
      )
      .subscribe({
        next: (response: any) => {
          const roles = Array.isArray(response) ? response : [];
          const seen = new Set<string>();
          this.pickers = roles
            .filter((role: any) => role?.partyId)
            .filter((role: any) => {
              if (seen.has(role.partyId)) {
                return false;
              }
              seen.add(role.partyId);
              return true;
            })
            .map((role: any) => ({
              partyId: role.partyId,
              name: role.name || role.partyId,
            }));
        },
        error: () => {
          this.pickers = [];
        },
      });
  }

  onSelect(partyId: string): void {
    this.selectedPartyId = partyId;
  }

  assign(): void {
    if (!this.selectedPartyId) {
      return;
    }
    this.dialogRef.close({ partyId: this.selectedPartyId });
  }

  cancel(): void {
    this.dialogRef.close();
  }

  ngOnDestroy(): void {
    this.destroy$.next();
    this.destroy$.complete();
  }
}
