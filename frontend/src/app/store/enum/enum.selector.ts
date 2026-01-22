import { createFeatureSelector, createSelector } from '@ngrx/store';
import { EnumState } from './enum.state';

export const selectEnumState = createFeatureSelector<EnumState>('enum');

export const selectEnumList = createSelector(
  selectEnumState,
  (state) => state.enumList
);

export const selectEnumLoading = createSelector(
  selectEnumState,
  (state) => state.loading
);

export const selectEnumError = createSelector(
  selectEnumState,
  (state) => state.error
);
