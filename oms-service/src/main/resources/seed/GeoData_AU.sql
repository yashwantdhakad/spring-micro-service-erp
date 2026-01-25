INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'AU-ACT', 'TERRITORY', 'Australian Capital Territory', 'ACT', NULL, 'ACT', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'AU-ACT');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'AU-NSW', 'STATE', 'New South Wales', 'NSW', NULL, 'NSW', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'AU-NSW');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'AU-NT', 'TERRITORY', 'Northern Territory', 'NT', NULL, 'NT', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'AU-NT');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'AU-QLD', 'STATE', 'Queensland', 'QLD', NULL, 'QLD', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'AU-QLD');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'AU-SA', 'STATE', 'South Australia', 'SA', NULL, 'SA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'AU-SA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'AU-TAS', 'STATE', 'Tasmania', 'TAS', NULL, 'TAS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'AU-TAS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'AU-VIC', 'STATE', 'Victoria', 'VIC', NULL, 'VIC', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'AU-VIC');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'AU-WA', 'STATE', 'Western Australia', 'WA', NULL, 'WA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'AU-WA');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'AUS', 'AU-ACT', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'AUS' AND geo_id_to = 'AU-ACT' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'AUS', 'AU-NSW', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'AUS' AND geo_id_to = 'AU-NSW' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'AUS', 'AU-NT', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'AUS' AND geo_id_to = 'AU-NT' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'AUS', 'AU-QLD', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'AUS' AND geo_id_to = 'AU-QLD' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'AUS', 'AU-SA', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'AUS' AND geo_id_to = 'AU-SA' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'AUS', 'AU-TAS', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'AUS' AND geo_id_to = 'AU-TAS' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'AUS', 'AU-VIC', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'AUS' AND geo_id_to = 'AU-VIC' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'AUS', 'AU-WA', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'AUS' AND geo_id_to = 'AU-WA' AND geo_assoc_type_id = 'REGIONS');
