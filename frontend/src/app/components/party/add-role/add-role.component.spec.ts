import { ComponentFixture, TestBed, fakeAsync, tick } from '@angular/core/testing';
import { AddRoleComponent } from './add-role.component';
import { ReactiveFormsModule } from '@angular/forms';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { MatSnackBarModule, MatSnackBar } from '@angular/material/snack-bar';
import { CommonService } from 'src/app/services/common/common.service';
import { PartyService } from 'src/app/services/oms/party/party.service';
import { of, throwError } from 'rxjs';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

describe('AddRoleComponent', () => {
  let component: AddRoleComponent;
  let fixture: ComponentFixture<AddRoleComponent>;
  let commonServiceSpy: jasmine.SpyObj<CommonService>;
  let partyServiceSpy: jasmine.SpyObj<PartyService>;
  let dialogRefSpy: jasmine.SpyObj<MatDialogRef<AddRoleComponent>>;
  let snackBar: MatSnackBar;

  const mockDialogData = {
    roleData: {
      partyId: 'PARTY_001',
      roleTypeId: 'RoleAdmin'
    }
  };

  beforeEach(async () => {
    commonServiceSpy = jasmine.createSpyObj('CommonService', ['getRoleTypes']);
    partyServiceSpy = jasmine.createSpyObj('PartyService', ['addRole']);
    dialogRefSpy = jasmine.createSpyObj('MatDialogRef', ['close']);

    await TestBed.configureTestingModule({
      declarations: [AddRoleComponent],
      imports: [
        ReactiveFormsModule,
        MatSnackBarModule,
        BrowserAnimationsModule
      ],
      providers: [
        { provide: CommonService, useValue: commonServiceSpy },
        { provide: PartyService, useValue: partyServiceSpy },
        { provide: MAT_DIALOG_DATA, useValue: mockDialogData },
        { provide: MatDialogRef, useValue: dialogRefSpy }
      ]
    }).compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AddRoleComponent);
    component = fixture.componentInstance;
    snackBar = TestBed.inject(MatSnackBar);
    fixture.detectChanges();
  });

  it('should create AddRoleComponent', () => {
    expect(component).toBeTruthy();
  });

  it('should initialize form with provided role data', () => {
    expect(component.roleForm.value.partyId).toBe('PARTY_001');
    expect(component.roleForm.value.roleTypeId).toBe('RoleAdmin');
  });

  it('should call getRoleTypes on init', () => {
    const roleTypes = [{ enumId: 'RoleAdmin', description: 'Administrator' }];
    commonServiceSpy.getRoleTypes.and.returnValue(of(roleTypes));
    component.getRoleTypes();
    expect(commonServiceSpy.getRoleTypes).toHaveBeenCalledWith('PartyIdType');
  });

  it('should call addRole and close dialog on success', fakeAsync(() => {
    const formValues = component.roleForm.value;
    partyServiceSpy.addRole.and.returnValue(of({}));

    component.addRole();
    tick();

    expect(partyServiceSpy.addRole).toHaveBeenCalledWith(formValues);
    expect(dialogRefSpy.close).toHaveBeenCalledWith(formValues);
  }));

  it('should show error on addRole failure', fakeAsync(() => {
    partyServiceSpy.addRole.and.returnValue(throwError(() => new Error('API Error')));
    spyOn(snackBar, 'open');

    component.addRole();
    tick();

    expect(snackBar.open).toHaveBeenCalledWith('Error adding role', 'Close', { duration: 3000 });
  }));

  it('should not call addRole if form is invalid', () => {
    component.roleForm.get('roleTypeId')?.setValue('');
    component.addRole();

    expect(partyServiceSpy.addRole).not.toHaveBeenCalled();
  });
});
