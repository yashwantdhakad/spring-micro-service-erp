import { TestBed } from '@angular/core/testing';
import { MatSnackBar } from '@angular/material/snack-bar';

import { SnackbarService } from './snackbar.service';

describe('SnackbarService', () => {
  let service: SnackbarService;
  let snackBarSpy: jasmine.SpyObj<MatSnackBar>;

  beforeEach(() => {
    const spy = jasmine.createSpyObj('MatSnackBar', ['open']);
    TestBed.configureTestingModule({
      providers: [
        SnackbarService,
        { provide: MatSnackBar, useValue: spy }
      ]
    });
    service = TestBed.inject(SnackbarService);
    snackBarSpy = TestBed.inject(MatSnackBar) as jasmine.SpyObj<MatSnackBar>;
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });

  it('should show success message', () => {
    service.showSuccess('ok');
    expect(snackBarSpy.open).toHaveBeenCalledWith(
      'ok',
      'Close',
      jasmine.objectContaining({ panelClass: ['primary'] })
    );
  });

  it('should show error message', () => {
    service.showError('bad');
    expect(snackBarSpy.open).toHaveBeenCalledWith(
      'bad',
      'Close',
      jasmine.objectContaining({ panelClass: ['warn'] })
    );
  });
});
