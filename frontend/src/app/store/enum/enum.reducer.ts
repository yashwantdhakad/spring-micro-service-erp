import { createReducer, on } from '@ngrx/store';
import * as EnumActions from './enum.actions';
import { EnumState } from './enum.state';

export const initialState: EnumState = {
  enumList: [],
  loading: false,
  error: null,
};

export const enumReducer = createReducer(
  initialState,
  on(EnumActions.loadEnums, (state) => ({
    ...state,
    loading: true,
    error: null,
  })),
  on(EnumActions.loadEnumsSuccess, (state, { enums }) => ({
    ...state,
    enumList: enums,
    loading: false,
    error: null,
  })),
  on(EnumActions.loadEnumsFailure, (state, { error }) => ({
    ...state,
    loading: false,
    error,
  }))
);
