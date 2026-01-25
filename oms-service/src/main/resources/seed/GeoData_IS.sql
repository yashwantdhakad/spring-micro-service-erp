INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IS-7', 'REGION', 'Austurland', '7', NULL, 'AL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IS-7');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IS-1', 'REGION', 'Höfuðborgarsvæði', '1', NULL, 'HO', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IS-1');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IS-6', 'REGION', 'Norðurland eystra', '6', NULL, 'NE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IS-6');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IS-5', 'REGION', 'Norðurland vestra', '5', NULL, 'NV', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IS-5');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IS-8', 'REGION', 'Suðurland', '8', NULL, 'SL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IS-8');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IS-2', 'REGION', 'Suðurnes', '2', NULL, 'SU', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IS-2');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IS-4', 'REGION', 'Vestfirðir', '4', NULL, 'VF', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IS-4');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IS-3', 'REGION', 'Vesturland', '3', NULL, 'VL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IS-3');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ISL', 'IS-7', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ISL' AND geo_id_to = 'IS-7' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ISL', 'IS-1', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ISL' AND geo_id_to = 'IS-1' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ISL', 'IS-6', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ISL' AND geo_id_to = 'IS-6' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ISL', 'IS-5', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ISL' AND geo_id_to = 'IS-5' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ISL', 'IS-8', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ISL' AND geo_id_to = 'IS-8' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ISL', 'IS-2', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ISL' AND geo_id_to = 'IS-2' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ISL', 'IS-4', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ISL' AND geo_id_to = 'IS-4' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ISL', 'IS-3', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ISL' AND geo_id_to = 'IS-3' AND geo_assoc_type_id = 'REGIONS');
