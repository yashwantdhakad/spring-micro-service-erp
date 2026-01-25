INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IL-D', 'PROVINCE', 'HaDarom', 'D', NULL, '', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IL-D');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IL-M', 'PROVINCE', 'HaMerkaz', 'M', NULL, '', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IL-M');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IL-Z', 'PROVINCE', 'HaZafon', 'Z', NULL, '', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IL-Z');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IL-HA', 'PROVINCE', 'Haifa', 'HA', NULL, '', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IL-HA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IL-TA', 'PROVINCE', 'Tel Aviv', 'TA', NULL, '', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IL-TA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IL-JM', 'PROVINCE', 'Jerusalem', 'JM', NULL, '', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IL-JM');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ISR', 'IL-D', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ISR' AND geo_id_to = 'IL-D' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ISR', 'IL-M', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ISR' AND geo_id_to = 'IL-M' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ISR', 'IL-Z', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ISR' AND geo_id_to = 'IL-Z' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ISR', 'IL-HA', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ISR' AND geo_id_to = 'IL-HA' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ISR', 'IL-TA', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ISR' AND geo_id_to = 'IL-TA' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ISR', 'IL-JM', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ISR' AND geo_id_to = 'IL-JM' AND geo_assoc_type_id = 'REGIONS');
