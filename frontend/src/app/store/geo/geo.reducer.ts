import { createReducer, on } from '@ngrx/store';
import * as GeoActions from './geo.actions';
import { GeoState } from './geo.state'; // make sure this interface exists
const initialState: GeoState = {
  geoList: [],
  loading: false,
  error: null,
};
export const geoReducer = createReducer(
  initialState,
  on(GeoActions.loadGeos, (state) => ({
    ...state,
    loading: true,
    error: null,
  })),
  on(GeoActions.loadGeosSuccess, (state, { geos }) => ({
    ...state,
    geoList: geos,
    loading: false,
    error: null,
  })),
  on(GeoActions.loadGeosFailure, (state, { error }) => ({
    ...state,
    loading: false,
    error,
  }))
);
