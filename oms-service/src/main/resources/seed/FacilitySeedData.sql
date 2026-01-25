INSERT INTO enumeration_type (description, enum_type_id, has_table)
SELECT 'Facility Location Type', 'FACLOC_TYPE', 0
WHERE NOT EXISTS (
    SELECT 1
    FROM enumeration_type
    WHERE description = 'Facility Location Type'
      AND enum_type_id = 'FACLOC_TYPE'
      AND has_table = 0
);

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Pick/Primary', 'PICKLOC', 'FLT_PICKLOC', 'FACLOC_TYPE', '01'
WHERE NOT EXISTS (
    SELECT 1
    FROM enumeration
    WHERE description = 'Pick/Primary'
      AND enum_code = 'PICKLOC'
      AND enum_id = 'FLT_PICKLOC'
      AND enum_type_id = 'FACLOC_TYPE'
      AND sequence_id = '01'
);

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Bulk', 'BULK', 'FLT_BULK', 'FACLOC_TYPE', '02'
WHERE NOT EXISTS (
    SELECT 1
    FROM enumeration
    WHERE description = 'Bulk'
      AND enum_code = 'BULK'
      AND enum_id = 'FLT_BULK'
      AND enum_type_id = 'FACLOC_TYPE'
      AND sequence_id = '02'
);

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Hold', 'HOLDLOC', 'FLT_HOLDLOC', 'FACLOC_TYPE', '03'
WHERE NOT EXISTS (
    SELECT 1
    FROM enumeration
    WHERE description = 'Hold'
      AND enum_code = 'HOLDLOC'
      AND enum_id = 'FLT_HOLDLOC'
      AND enum_type_id = 'FACLOC_TYPE'
      AND sequence_id = '03'
);
