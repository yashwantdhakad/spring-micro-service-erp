import { createFeatureSelector, createSelector } from "@ngrx/store";
import { GeoState } from "./geo.state";

export const selectGeoState = createFeatureSelector<GeoState>('geo');

export const selectGeoList = createSelector(
  selectGeoState,
  (geoState: GeoState) => geoState.geoList
);

export const selectGeoLoading = createSelector(
  selectGeoState,
  (geoState: GeoState) => geoState.loading
);

export const selectGeoError = createSelector(
  selectGeoState,
  (geoState: GeoState) => geoState.error
);
