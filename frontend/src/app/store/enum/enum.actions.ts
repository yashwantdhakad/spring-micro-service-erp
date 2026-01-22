import { createAction, props } from '@ngrx/store';

export const loadEnums = createAction('[Enums] Load Enums');
export const loadEnumsSuccess = createAction(
  '[Enums] Load Enums Success',
  props<{ enums: string[] }>()
);
export const loadEnumsFailure = createAction(
  '[Enums] Load Enums Failure',
  props<{ error: string }>()
);
