import { ChangeDetectorRef, Component, Inject } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';
import { MatSnackBar } from '@angular/material/snack-bar';
import { CommonService } from 'src/app/services/common/common.service';
import { PartyService } from 'src/app/services/oms/party/party.service';
import { finalize } from 'rxjs/operators';

@Component({
  standalone: false,
  selector: 'app-add-role',
  templateUrl: './add-role.component.html',
  styleUrls: ['./add-role.component.css'],
})
export class AddRoleComponent {
  roleForm: FormGroup;
  roleTypes: any[] | undefined;
  isLoading: boolean = false;

  constructor(
    private commonService: CommonService,
    private partyService: PartyService,
    private snackBar: MatSnackBar,
    public dialogRef: MatDialogRef<AddRoleComponent>,
    @Inject(MAT_DIALOG_DATA) public data: { roleData: any },
    private fb: FormBuilder,
    private cdr: ChangeDetectorRef
  ) {
    this.roleForm = this.fb.group({
      partyId: [data?.roleData?.partyId || null],
      roleTypeId: [data?.roleData?.roleTypeId, Validators.required],
    });

    this.getRoleTypes();
  }

  getRoleTypes(): void {
    setTimeout(() => {
      this.isLoading = true;
      this.cdr.markForCheck();
    }, 0);
    this.commonService.getLookupResults({}, 'roletypes').subscribe({
      next: (response) => {
        const roles = Array.isArray(response) ? response : [response];
        setTimeout(() => {
          this.roleTypes = roles;
          this.isLoading = false;
          this.cdr.markForCheck();
        }, 0);
      },
      error: (error) => {
        setTimeout(() => {
          this.isLoading = false;
          this.cdr.markForCheck();
        }, 0);
      }
    });
  }

  addRole(): void {
    if (!this.roleForm.valid) return;

    const values = this.roleForm.value;
    setTimeout(() => {
      this.isLoading = true;
      this.cdr.markForCheck();
    }, 0);

    this.partyService.addRole(values).pipe(
      finalize(() => setTimeout(() => {
        this.isLoading = false;
        this.cdr.markForCheck();
      }, 0))
    ).subscribe({
      next: () => {
        this.snackBar.open('Role added successfully', 'Close', { duration: 3000 });
        this.roleForm.reset({ roleTypeId: '' });
        this.dialogRef.close(values);
      },
      error: (error) => {
        this.snackBar.open('Error adding role', 'Close', { duration: 3000 });
      }
    });
  }
}
