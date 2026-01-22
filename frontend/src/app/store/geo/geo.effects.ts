import { Injectable } from '@angular/core';
import { Actions, createEffect, ofType } from '@ngrx/effects';
import { of } from 'rxjs';
import { catchError, map, switchMap } from 'rxjs/operators';
import * as GeoActions from './geo.actions'; // Make sure this path is correct
import { CommonService } from '../../services/common/common.service'; // Adjust path if needed

@Injectable()
export class GeoEffects {
  constructor(
    private actions$: Actions,
    private commonService: CommonService
  ) { }

  loadGeos$ = createEffect(() =>
    this.actions$.pipe(
      ofType(GeoActions.loadGeos),
      switchMap(() =>
        this.commonService.getLookupResults({}, 'geo').pipe().pipe(
          map((geos: string[]) => GeoActions.loadGeosSuccess({ geos })),
          catchError((error: any) =>
            of(GeoActions.loadGeosFailure({ error: error.message || 'Unknown error' }))
          )
        )
      )
    )
  );
}
