// enum-type-helper.spec.ts
import { filterEnumRecords } from './enum-type-helper';

interface EnumRecord {
  enumTypeId: string;
  [key: string]: any;
}

describe('filterEnumRecords', () => {
  const enumList: EnumRecord[] = [
    { enumTypeId: 'type1', value: 'value1' },
    { enumTypeId: 'type2', value: 'value2' },
    { enumTypeId: 'type1', value: 'value3' },
    { enumTypeId: 'type3', value: 'value4' },
  ];

  it('should filter records by enumTypeId', () => {
    const result = filterEnumRecords(enumList, 'type1');
    expect(result).toEqual([
      { enumTypeId: 'type1', value: 'value1' },
      { enumTypeId: 'type1', value: 'value3' },
    ]);
  });

  it('should return all records when enumTypeId is an empty string', () => {
    const result = filterEnumRecords(enumList, '');
    expect(result).toEqual(enumList);
  });

  it('should return an empty array when enumListObject is not an array', () => {
    const result = filterEnumRecords(null as any, 'type1');
    expect(result).toEqual([]);
  });

  it('should return an empty array when no records match the enumTypeId', () => {
    const result = filterEnumRecords(enumList, 'type4');
    expect(result).toEqual([]);
  });

  it('should return an empty array when enumListObject is an empty array', () => {
    const result = filterEnumRecords([], 'type1');
    expect(result).toEqual([]);
  });

  it('should log a warning when enumListObject is not an array', () => {
    spyOn(console, 'warn');
    filterEnumRecords(null as any, 'type1');
    expect(console.warn).toHaveBeenCalledWith(
      'filterEnumRecords: Provided enumListObject is not an array.'
    );
  });
});
