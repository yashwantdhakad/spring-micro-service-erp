INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ML-BKO', 'COUNTY', 'Bamako', 'BKO', NULL, 'BA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ML-BKO');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ML-7', 'REGION', 'Gao', '7', NULL, 'GO', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ML-7');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ML-1', 'REGION', 'Kayes', '1', NULL, 'KY', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ML-1');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ML-8', 'REGION', 'Kidal', '8', NULL, 'KD', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ML-8');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ML-2', 'REGION', 'Koulikoro', '2', NULL, 'KK', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ML-2');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ML-5', 'REGION', 'Mopti', '5', NULL, 'MO', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ML-5');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ML-9', 'REGION', 'Ménaka', '9', NULL, 'ME', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ML-9');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ML-3', 'REGION', 'Sikasso', '3', NULL, 'SK', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ML-3');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ML-4', 'REGION', 'Ségou', '4', NULL, 'SG', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ML-4');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ML-10', 'REGION', 'Taoudénit', '10', NULL, 'TD', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ML-10');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ML-6', 'REGION', 'Tombouctou', '6', NULL, 'TT', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ML-6');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MLI', 'ML-BKO', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MLI' AND geo_id_to = 'ML-BKO' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MLI', 'ML-7', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MLI' AND geo_id_to = 'ML-7' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MLI', 'ML-1', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MLI' AND geo_id_to = 'ML-1' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MLI', 'ML-8', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MLI' AND geo_id_to = 'ML-8' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MLI', 'ML-2', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MLI' AND geo_id_to = 'ML-2' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MLI', 'ML-5', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MLI' AND geo_id_to = 'ML-5' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MLI', 'ML-9', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MLI' AND geo_id_to = 'ML-9' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MLI', 'ML-3', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MLI' AND geo_id_to = 'ML-3' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MLI', 'ML-4', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MLI' AND geo_id_to = 'ML-4' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MLI', 'ML-10', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MLI' AND geo_id_to = 'ML-10' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MLI', 'ML-6', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MLI' AND geo_id_to = 'ML-6' AND geo_assoc_type_id = 'REGIONS');
