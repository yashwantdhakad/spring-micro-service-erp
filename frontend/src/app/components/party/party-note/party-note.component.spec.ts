import { ComponentFixture, TestBed } from '@angular/core/testing';
import { PartyNoteComponent } from './party-note.component';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';
import { FormBuilder, ReactiveFormsModule } from '@angular/forms';
import { PartyService } from 'src/app/services/party/party.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';
import { of, throwError } from 'rxjs';

describe('PartyNoteComponent', () => {
  let component: PartyNoteComponent;
  let fixture: ComponentFixture<PartyNoteComponent>;
  let mockDialogRef: jasmine.SpyObj<MatDialogRef<PartyNoteComponent>>;
  let mockPartyService: jasmine.SpyObj<PartyService>;
  let mockSnackbarService: jasmine.SpyObj<SnackbarService>;

  beforeEach(async () => {
    mockDialogRef = jasmine.createSpyObj('MatDialogRef', ['close']);
    mockPartyService = jasmine.createSpyObj('PartyService', ['createPartyNote', 'updatePartyNote']);
    mockSnackbarService = jasmine.createSpyObj('SnackbarService', ['showSuccess', 'showError']);

    await TestBed.configureTestingModule({
      declarations: [PartyNoteComponent],
      imports: [ReactiveFormsModule],
      providers: [
        FormBuilder,
        { provide: MAT_DIALOG_DATA, useValue: { noteData: { partyId: 'PARTY_1', noteText: 'Initial note' } } },
        { provide: MatDialogRef, useValue: mockDialogRef },
        { provide: PartyService, useValue: mockPartyService },
        { provide: SnackbarService, useValue: mockSnackbarService }
      ]
    }).compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PartyNoteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create component', () => {
    expect(component).toBeTruthy();
  });

  it('should call createPartyNote on addUpdateNote if noteDate is not present', () => {
    component.addUpdateNoteForm.patchValue({ noteText: 'Test note' });
    mockPartyService.createPartyNote.and.returnValue(of({}));

    component.addUpdateNote();

    expect(mockPartyService.createPartyNote).toHaveBeenCalled();
    expect(mockSnackbarService.showSuccess).toHaveBeenCalledWith('Party note saved successfully.');
    expect(mockDialogRef.close).toHaveBeenCalled();
  });

  it('should call updatePartyNote on addUpdateNote if noteDate is present', () => {
    component.addUpdateNoteForm.patchValue({ noteDate: '2025-07-01', noteText: 'Updated note' });
    mockPartyService.updatePartyNote.and.returnValue(of({}));

    component.addUpdateNote();

    expect(mockPartyService.updatePartyNote).toHaveBeenCalled();
    expect(mockSnackbarService.showSuccess).toHaveBeenCalled();
    expect(mockDialogRef.close).toHaveBeenCalled();
  });

  it('should show error if addUpdateNote fails', () => {
    component.addUpdateNoteForm.patchValue({ noteText: 'Failure case' });
    mockPartyService.createPartyNote.and.returnValue(throwError(() => new Error('Failure')));

    component.addUpdateNote();

    expect(mockSnackbarService.showError).toHaveBeenCalledWith('Error in saving party note');
  });

  it('should not call service if form is invalid', () => {
    component.addUpdateNoteForm.patchValue({ noteText: '' });  // Invalid due to required

    component.addUpdateNote();

    expect(mockPartyService.createPartyNote).not.toHaveBeenCalled();
    expect(mockPartyService.updatePartyNote).not.toHaveBeenCalled();
  });
});
