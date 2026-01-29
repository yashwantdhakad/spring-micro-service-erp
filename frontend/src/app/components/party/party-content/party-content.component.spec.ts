import { ComponentFixture, TestBed, fakeAsync, tick } from '@angular/core/testing';
import { ReactiveFormsModule } from '@angular/forms';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { of, throwError } from 'rxjs';
import { PartyContentComponent } from './party-content.component';
import { PartyService } from 'src/app/services/party/party.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';
import { TranslateService } from '@ngx-translate/core';

describe('PartyContentComponent', () => {
  let component: PartyContentComponent;
  let fixture: ComponentFixture<PartyContentComponent>;
  let partyService: jasmine.SpyObj<PartyService>;
  let snackbarService: jasmine.SpyObj<SnackbarService>;
  let dialogRef: jasmine.SpyObj<MatDialogRef<PartyContentComponent>>;
  let translateService: jasmine.SpyObj<TranslateService>;

  const mockData = {
    contentData: {
      partyId: 'PARTY123',
    },
  };

  beforeEach(async () => {
    const partySpy = jasmine.createSpyObj('PartyService', ['createPartyContent']);
    const snackbarSpy = jasmine.createSpyObj('SnackbarService', ['showSuccess', 'showError']);
    const dialogSpy = jasmine.createSpyObj('MatDialogRef', ['close']);
    const translateSpy = jasmine.createSpyObj('TranslateService', ['instant']);

    await TestBed.configureTestingModule({
      declarations: [PartyContentComponent],
      imports: [ReactiveFormsModule],
      providers: [
        { provide: PartyService, useValue: partySpy },
        { provide: SnackbarService, useValue: snackbarSpy },
        { provide: TranslateService, useValue: translateSpy },
        { provide: MatDialogRef, useValue: dialogSpy },
        { provide: MAT_DIALOG_DATA, useValue: mockData },
      ]
    }).compileComponents();

    partyService = TestBed.inject(PartyService) as jasmine.SpyObj<PartyService>;
    snackbarService = TestBed.inject(SnackbarService) as jasmine.SpyObj<SnackbarService>;
    dialogRef = TestBed.inject(MatDialogRef) as jasmine.SpyObj<MatDialogRef<PartyContentComponent>>;
    translateService = TestBed.inject(TranslateService) as jasmine.SpyObj<TranslateService>;
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PartyContentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create the component', () => {
    expect(component).toBeTruthy();
  });

  it('should initialize fileForm with required controls', () => {
    expect(component.fileForm.contains('contentFile')).toBeTrue();
    expect(component.fileForm.contains('description')).toBeTrue();
  });

  it('should update form control value on file change', () => {
    const file = new File(['dummy'], 'test.txt');
    const event = { target: { files: [file] } };

    component.onFileChange(event);

    expect(component.fileForm.get('contentFile')?.value).toBe(file);
  });

  it('should call createPartyContent on valid form submission', fakeAsync(() => {
    const fakeFile = new File(['dummy'], 'file.pdf', { type: 'application/pdf' });
    const fileInput = document.createElement('input');
    fileInput.type = 'file';
    fileInput.id = 'fileInput';
    fileInput.files = {
      0: fakeFile,
      length: 1,
      item: (index: number) => fakeFile
    } as unknown as FileList;

    document.body.appendChild(fileInput);

    translateService.instant.and.returnValue('Success');

    component.fileForm.setValue({
      contentFile: fakeFile,
      description: 'Some note',
    });

    partyService.createPartyContent.and.returnValue(of({}));

    component.createPartyContent();
    tick();

    expect(partyService.createPartyContent).toHaveBeenCalled();
    expect(snackbarService.showSuccess).toHaveBeenCalledWith('Success');
    expect(dialogRef.close).toHaveBeenCalledWith(mockData.contentData);

    document.body.removeChild(fileInput);
  }));

  it('should handle error in createPartyContent', fakeAsync(() => {
    translateService.instant.and.returnValue('Upload failed');

    const fakeFile = new File(['dummy'], 'fail.txt');
    const fileInput = document.createElement('input');
    fileInput.type = 'file';
    fileInput.id = 'fileInput';
    fileInput.files = {
      0: fakeFile,
      length: 1,
      item: (index: number) => fakeFile
    } as unknown as FileList;
    document.body.appendChild(fileInput);

    component.fileForm.setValue({
      contentFile: fakeFile,
      description: 'Desc',
    });

    partyService.createPartyContent.and.returnValue(throwError(() => new Error('Upload Error')));

    component.createPartyContent();
    tick();

    expect(snackbarService.showError).toHaveBeenCalledWith('Upload failed');
    document.body.removeChild(fileInput);
  }));
});
