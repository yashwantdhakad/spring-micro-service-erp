// geo-type-helper.ts

interface GeoRecord {
  geo_type_id: string;
  [geo_id: string]: any;
}

interface GeoListObject {
  geoList: GeoRecord[];
}

export function filterGeoRecords(
  geoListObject: GeoListObject | null | undefined,
  geo_type_id: string
): GeoRecord[] {
  const geoRecords = geoListObject;

  if (!Array.isArray(geoRecords)) {
    console.warn('filterGeoRecords: Provided geoListObject is not an array.');
    return [];
  }

  return geoRecords.filter(
    (record) => !geo_type_id || record.geo_type_id === geo_type_id
  );
}
