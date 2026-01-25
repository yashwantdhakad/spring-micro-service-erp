INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'NL-DR', 'PROVINCE', 'Drenthe', 'DR', NULL, 'DR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'NL-DR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'NL-FL', 'PROVINCE', 'Flevoland', 'FL', NULL, 'FL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'NL-FL');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'NL-FR', 'PROVINCE', 'Friesland', 'FR', NULL, 'FR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'NL-FR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'NL-GL', 'PROVINCE', 'Gelderland', 'GL', NULL, 'GL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'NL-GL');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'NL-GR', 'PROVINCE', 'Groningen', 'GR', NULL, 'GR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'NL-GR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'NL-LB', 'PROVINCE', 'Limburg', 'LB', NULL, 'LB', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'NL-LB');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'NL-NB', 'PROVINCE', 'Noord-Brabant', 'NB', NULL, 'NB', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'NL-NB');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'NL-NH', 'PROVINCE', 'Noord-Holland', 'NH', NULL, 'NH', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'NL-NH');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'NL-OV', 'PROVINCE', 'Overijssel', 'OV', NULL, 'OV', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'NL-OV');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'NL-UT', 'PROVINCE', 'Utrecht', 'UT', NULL, 'UT', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'NL-UT');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'NL-ZE', 'PROVINCE', 'Zeeland', 'ZE', NULL, 'ZE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'NL-ZE');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'NL-ZH', 'PROVINCE', 'Zuid-Holland', 'ZH', NULL, 'ZH', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'NL-ZH');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'NL-ZL', 'PROVINCE', 'Zeeland', 'ZL', NULL, 'ZL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'NL-ZL');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'NLD', 'NL-DR', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'NLD' AND geo_id_to = 'NL-DR' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'NLD', 'NL-FL', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'NLD' AND geo_id_to = 'NL-FL' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'NLD', 'NL-FR', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'NLD' AND geo_id_to = 'NL-FR' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'NLD', 'NL-GL', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'NLD' AND geo_id_to = 'NL-GL' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'NLD', 'NL-GR', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'NLD' AND geo_id_to = 'NL-GR' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'NLD', 'NL-LB', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'NLD' AND geo_id_to = 'NL-LB' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'NLD', 'NL-NB', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'NLD' AND geo_id_to = 'NL-NB' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'NLD', 'NL-NH', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'NLD' AND geo_id_to = 'NL-NH' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'NLD', 'NL-OV', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'NLD' AND geo_id_to = 'NL-OV' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'NLD', 'NL-UT', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'NLD' AND geo_id_to = 'NL-UT' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'NLD', 'NL-ZE', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'NLD' AND geo_id_to = 'NL-ZE' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'NLD', 'NL-ZH', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'NLD' AND geo_id_to = 'NL-ZH' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'NLD', 'NL-ZL', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'NLD' AND geo_id_to = 'NL-ZL' AND geo_assoc_type_id = 'REGIONS');
