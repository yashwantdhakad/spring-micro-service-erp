INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'AB', 'PROVINCE', 'Alberta', 'AB', NULL, 'AB', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'AB');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BC', 'PROVINCE', 'British Columbia', 'BC', NULL, 'BC', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BC');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MB', 'PROVINCE', 'Manitoba', 'MB', NULL, 'MB', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MB');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'NB', 'PROVINCE', 'New Brunswick', 'NB', NULL, 'NB', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'NB');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'NL', 'PROVINCE', 'Newfoundland and Labrador', 'NL', NULL, 'NL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'NL');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'NS', 'PROVINCE', 'Nova Scotia', 'NS', NULL, 'NS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'NS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'NT', 'PROVINCE', 'Northwest Territories', 'NT', NULL, 'NT', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'NT');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'NU', 'PROVINCE', 'Nunavut', 'NU', NULL, 'NU', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'NU');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ON', 'PROVINCE', 'Ontario', 'ON', NULL, 'ON', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ON');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'PE', 'PROVINCE', 'Prince Edward Island', 'PE', NULL, 'PE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'PE');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'QC', 'PROVINCE', 'Quebec', 'QC', NULL, 'QC', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'QC');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'SK', 'PROVINCE', 'Saskatchewan', 'SK', NULL, 'SK', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'SK');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'YT', 'PROVINCE', 'Yukon', 'YT', NULL, 'YT', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'YT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CAN', 'AB', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CAN' AND geo_id_to = 'AB' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CAN', 'BC', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CAN' AND geo_id_to = 'BC' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CAN', 'MB', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CAN' AND geo_id_to = 'MB' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CAN', 'NB', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CAN' AND geo_id_to = 'NB' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CAN', 'NL', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CAN' AND geo_id_to = 'NL' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CAN', 'NS', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CAN' AND geo_id_to = 'NS' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CAN', 'NT', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CAN' AND geo_id_to = 'NT' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CAN', 'NU', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CAN' AND geo_id_to = 'NU' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CAN', 'ON', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CAN' AND geo_id_to = 'ON' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CAN', 'PE', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CAN' AND geo_id_to = 'PE' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CAN', 'QC', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CAN' AND geo_id_to = 'QC' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CAN', 'SK', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CAN' AND geo_id_to = 'SK' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CAN', 'YT', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CAN' AND geo_id_to = 'YT' AND geo_assoc_type_id = 'REGIONS');
