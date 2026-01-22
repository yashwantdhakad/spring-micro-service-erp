import { createAction, props } from '@ngrx/store';

export const loadGeos = createAction('[Geo] Load Geos');
export const loadGeosSuccess = createAction('[Geo] Load Geos Success', props<{ geos: string[] }>());
export const loadGeosFailure = createAction('[Geo] Load Geos Failure', props<{ error: string }>());
