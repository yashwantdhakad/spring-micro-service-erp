import { Component, OnDestroy, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { MatDialog } from '@angular/material/dialog';
import { Subject } from 'rxjs';
import { finalize, takeUntil } from 'rxjs/operators';
import { SnackbarService } from 'src/app/services/common/snackbar.service';
import { UserService } from 'src/app/services/security/user.service';
import { PartyService } from 'src/app/services/party/party.service';
import { EditUserComponent } from '../edit-user/edit-user.component';
import { AddRoleComponent } from '../../party/add-role/add-role.component';
import { ConfirmationDialogComponent } from '../../common/confirmation-dialog/confirmation-dialog.component';

@Component({
  selector: 'app-user-detail',
  templateUrl: './user-detail.component.html',
  styleUrls: ['./user-detail.component.css'],
})
export class UserDetailComponent implements OnInit, OnDestroy {
  userLoginId = '';
  isLoading = false;
  userDetail: any;
  userRoles: any[] = [];

  private destroy$ = new Subject<void>();

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private userService: UserService,
    private partyService: PartyService,
    private snackbarService: SnackbarService,
    private dialog: MatDialog
  ) {}

  ngOnInit(): void {
    this.route.params.pipe(takeUntil(this.destroy$)).subscribe((params) => {
      this.userLoginId = params['userLoginId'];
      if (this.userLoginId) {
        this.loadUser();
      }
    });

  }

  ngOnDestroy(): void {
    this.destroy$.next();
    this.destroy$.complete();
  }

  loadUser(): void {
    this.isLoading = true;
    this.userService
      .getUser(this.userLoginId)
      .pipe(finalize(() => (this.isLoading = false)))
      .subscribe({
        next: (response: any) => {
          this.userDetail = response?.userDetail;
          const partyId = this.userDetail?.user?.partyId;
          if (partyId) {
            this.loadPartyRoles(partyId);
          } else {
            this.userRoles = [];
          }
        },
        error: () => {
          this.snackbarService.showError('Failed to load user');
          this.router.navigate(['/users']);
        },
      });
  }

  openEditDialog(): void {
    const detail = this.userDetail || {};
    const user = detail.user || {};
    const selectedRoleIds = Array.isArray(detail.roles) ? detail.roles.map((role: any) => role.groupId) : [];
    const selectedPermissionIds = Array.isArray(detail.permissions)
      ? detail.permissions.map((permission: any) => permission.permissionId)
      : [];

    this.dialog
      .open(EditUserComponent, {
        data: {
          userLoginId: this.userLoginId,
          user,
        },
      })
      .afterClosed()
      .subscribe((updated) => {
        if (updated) {
          this.loadUser();
        }
      });
  }

  openRoleDialog(): void {
    const partyId = this.userDetail?.user?.partyId;
    if (!partyId) {
      this.snackbarService.showError('Party ID is required to add roles');
      return;
    }
    const roleData = { partyId };
    this.dialog
      .open(AddRoleComponent, {
        data: { roleData },
      })
      .afterClosed()
      .subscribe((result) => {
        if (result?.partyId) {
          this.loadPartyRoles(result.partyId);
        }
      });
  }

  async deleteRoleDialog(role: any): Promise<void> {
    const partyId = this.userDetail?.user?.partyId;
    if (!partyId || !role?.roleTypeId) {
      return;
    }
    const dialogRef = this.dialog.open(ConfirmationDialogComponent, {
      data: {
        title: 'Role',
        message: 'Are you sure you want to delete role?',
      },
    });
    dialogRef.afterClosed().subscribe((result) => {
      if (result) {
        this.partyService.deleteRole({ partyId, roleTypeId: role.roleTypeId }).subscribe(() => {
          this.loadPartyRoles(partyId);
        });
      }
    });
  }

  private loadPartyRoles(partyId: string): void {
    this.partyService.getPartyRolesByPartyId(partyId).subscribe({
      next: (roles) => (this.userRoles = Array.isArray(roles) ? roles : []),
      error: () => (this.userRoles = []),
    });
  }
}
