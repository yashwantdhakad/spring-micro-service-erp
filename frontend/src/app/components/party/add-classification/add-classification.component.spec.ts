import { ComponentFixture, TestBed, waitForAsync, fakeAsync, tick } from '@angular/core/testing';
import { ReactiveFormsModule } from '@angular/forms';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { MatInputModule } from '@angular/material/input';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatSelectModule } from '@angular/material/select';
import { MatButtonModule } from '@angular/material/button';
import { MatCardModule } from '@angular/material/card';
import { MatProgressSpinnerModule } from '@angular/material/progress-spinner';
import { NoopAnimationsModule } from '@angular/platform-browser/animations';
import { of, throwError } from 'rxjs';
import { CommonService } from 'src/app/services/common/common.service';
import { PartyService } from 'src/app/services/oms/party/party.service';
import { AddClassificationComponent } from './add-classification.component';

describe('AddClassificationComponent', () => {
  let component: AddClassificationComponent;
  let fixture: ComponentFixture<AddClassificationComponent>;
  let commonService: jasmine.SpyObj<CommonService>;
  let partyService: jasmine.SpyObj<PartyService>;
  let dialogRef: jasmine.SpyObj<MatDialogRef<AddClassificationComponent>>;

  const mockDialogData = {
    classificationData: {
      partyId: '123',
      classificationTypeEnumId: 'Type1',
      partyClassificationId: 'Class1'
    }
  };

  beforeEach(waitForAsync(() => {
    const commonServiceSpy = jasmine.createSpyObj('CommonService', ['getEnumTypes']);
    const partyServiceSpy = jasmine.createSpyObj('PartyService', ['getClassifications', 'addClassification']);
    const dialogRefSpy = jasmine.createSpyObj('MatDialogRef', ['close']);

    TestBed.configureTestingModule({
      declarations: [AddClassificationComponent],
      imports: [
        ReactiveFormsModule,
        MatInputModule,
        MatFormFieldModule,
        MatSelectModule,
        MatButtonModule,
        MatCardModule,
        MatProgressSpinnerModule,
        NoopAnimationsModule,
      ],
      providers: [
        { provide: CommonService, useValue: commonServiceSpy },
        { provide: PartyService, useValue: partyServiceSpy },
        { provide: MatDialogRef, useValue: dialogRefSpy },
        { provide: MAT_DIALOG_DATA, useValue: mockDialogData }
      ]
    }).compileComponents();

    commonService = TestBed.inject(CommonService) as jasmine.SpyObj<CommonService>;
    partyService = TestBed.inject(PartyService) as jasmine.SpyObj<PartyService>;
    dialogRef = TestBed.inject(MatDialogRef) as jasmine.SpyObj<MatDialogRef<AddClassificationComponent>>;

    commonService.getEnumTypes.and.returnValue(of([]));
    partyService.getClassifications.and.returnValue(of([]));
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AddClassificationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('should initialize the form with provided data', () => {
    expect(component.addClassificationForm.value).toEqual(mockDialogData.classificationData);
  });

  it('should mark form as invalid when required fields are missing', () => {
    component.addClassificationForm.patchValue({
      classificationTypeEnumId: '',
      partyClassificationId: ''
    });
    expect(component.addClassificationForm.valid).toBeFalse();
  });

  it('should call addUpdateClassification and close dialog on success', fakeAsync(() => {
    const values = {
      partyId: '123',
      classificationTypeEnumId: 'Type1',
      partyClassificationId: 'Class1'
    };

    component.addClassificationForm.setValue(values);
    partyService.addClassification.and.returnValue(of({}));

    component.addUpdateClassification();
    tick();

    expect(partyService.addClassification).toHaveBeenCalledWith(values);
    expect(dialogRef.close).toHaveBeenCalledWith(values);
  }));

  it('should handle addClassification error gracefully', fakeAsync(() => {
    const values = {
      partyId: '123',
      classificationTypeEnumId: 'Type1',
      partyClassificationId: 'Class1'
    };

    component.addClassificationForm.setValue(values);
    partyService.addClassification.and.returnValue(throwError(() => new Error('Failed')));

    component.addUpdateClassification();
    tick();

    expect(partyService.addClassification).toHaveBeenCalledWith(values);
    expect(dialogRef.close).not.toHaveBeenCalled();
  }));

  it('should load enum types on init', fakeAsync(() => {
    const enums = [{ enumId: 'Enum1', description: 'Sample Enum' }];
    commonService.getEnumTypes.and.returnValue(of(enums));

    component['loadEnumTypes']();
    tick();

    expect(commonService.getEnumTypes).toHaveBeenCalled();
    expect(component.enumTypes).toEqual(enums);
  }));

  it('should load classifications on init', fakeAsync(() => {
    const classifications = [{ partyClassificationId: 'Class1', description: 'Class Description' }];
    partyService.getClassifications.and.returnValue(of(classifications));

    component['loadClassifications']();
    tick();

    expect(partyService.getClassifications).toHaveBeenCalledWith({ classificationTypeEnumId: 'PcltCustomer' });
    expect(component.classifications).toEqual(classifications);
  }));
});
