// geo-type-helper.spec.ts
import { filterGeoRecords } from './geo-type-helper';

interface GeoRecord {
  geoTypeEnumId: string;
  [key: string]: any;
}

describe('filterGeoRecords', () => {
  const geoListObject = {
    geoList: [
      { geoTypeEnumId: 'type1', value: 'value1' },
      { geoTypeEnumId: 'type2', value: 'value2' },
      { geoTypeEnumId: 'type1', value: 'value3' },
      { geoTypeEnumId: 'type3', value: 'value4' },
    ],
  };

  it('should filter records by geoTypeEnumId', () => {
    const result = filterGeoRecords(geoListObject, 'type1');
    expect(result).toEqual([
      { geoTypeEnumId: 'type1', value: 'value1' },
      { geoTypeEnumId: 'type1', value: 'value3' },
    ]);
  });

  it('should return all records when geoTypeEnumId is an empty string', () => {
    const result = filterGeoRecords(geoListObject, '');
    expect(result).toEqual(geoListObject.geoList);
  });

  it('should return an empty array when geoListObject is not provided', () => {
    const result = filterGeoRecords(null, 'type1');
    expect(result).toEqual([]);
  });

  it('should return an empty array when no records match the geoTypeEnumId', () => {
    const result = filterGeoRecords(geoListObject, 'type4');
    expect(result).toEqual([]);
  });

  it('should return an empty array when geoListObject.geoList is an empty array', () => {
    const result = filterGeoRecords({ geoList: [] }, 'type1');
    expect(result).toEqual([]);
  });

  it('should log a warning when geoListObject.geoList is not an array', () => {
    spyOn(console, 'warn');
    filterGeoRecords({ geoList: null as any }, 'type1');
    expect(console.warn).toHaveBeenCalledWith(
      'filterGeoRecords: Provided geoListObject.geoList is not an array.'
    );
  });
});
