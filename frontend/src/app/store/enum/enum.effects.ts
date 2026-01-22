import { Injectable } from '@angular/core';
import { Actions, createEffect, ofType } from '@ngrx/effects';
import { of } from 'rxjs';
import { catchError, map, switchMap } from 'rxjs/operators';
import { CommonService } from '../../services/common/common.service';
import * as EnumActions from './enum.actions';

@Injectable()
export class EnumEffects {
  constructor(
    private actions$: Actions,
    private commonService: CommonService
  ) {}

  loadEnums$ = createEffect(() =>
    this.actions$.pipe(
      ofType(EnumActions.loadEnums),
      switchMap(() =>
        this.commonService.getEnums().pipe(
          map((enums: string[]) => EnumActions.loadEnumsSuccess({ enums })),
          catchError((error) =>
            of(EnumActions.loadEnumsFailure({ error: error.message || 'Unknown error' }))
          )
        )
      )
    )
  );
}
