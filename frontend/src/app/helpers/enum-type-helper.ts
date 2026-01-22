// enum-type-helper.ts

interface EnumRecord {
  enumTypeId: string;
  [key: string]: any;
}

export function filterEnumRecords(
  enumListObject: EnumRecord[],
  enumTypeId: string
): EnumRecord[] {
  if (!Array.isArray(enumListObject)) {
    console.warn('filterEnumRecords: Provided enumListObject is not an array.');
    return [];
  }

  return enumListObject.filter(
    (record) => !enumTypeId || record.enumTypeId === enumTypeId
  );
}
