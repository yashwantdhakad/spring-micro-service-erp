INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'DE-BW', 'STATE', 'Baden-Württemberg', 'BW', NULL, 'BW', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'DE-BW');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'DE-BY', 'STATE', 'Bayern', 'BY', NULL, 'BY', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'DE-BY');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'DE-BE', 'STATE', 'Berlin', 'BE', NULL, 'BE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'DE-BE');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'DE-BB', 'STATE', 'Brandenburg', 'BB', NULL, 'BB', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'DE-BB');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'DE-HB', 'STATE', 'Bremen', 'HB', NULL, 'HB', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'DE-HB');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'DE-HH', 'STATE', 'Hamburg', 'HH', NULL, 'HH', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'DE-HH');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'DE-HE', 'STATE', 'Hessen', 'HE', NULL, 'HE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'DE-HE');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'DE-MV', 'STATE', 'Mecklenburg-Vorpommern', 'MV', NULL, 'MV', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'DE-MV');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'DE-NI', 'STATE', 'Niedersachsen', 'NI', NULL, 'NI', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'DE-NI');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'DE-NW', 'STATE', 'Nordrhein-Westfalen', 'NW', NULL, 'NW', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'DE-NW');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'DE-RP', 'STATE', 'Rheinland-Pfalz', 'RP', NULL, 'RP', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'DE-RP');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'DE-SL', 'STATE', 'Saarland', 'SL', NULL, 'SL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'DE-SL');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'DE-SH', 'STATE', 'Schleswig-Holstein', 'SH', NULL, 'SH', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'DE-SH');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'DE-SN', 'STATE', 'Sachsen', 'SN', NULL, 'SN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'DE-SN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'DE-ST', 'STATE', 'Sachsen-Anhalt', 'ST', NULL, 'ST', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'DE-ST');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'DE-TH', 'STATE', 'Thüringen', 'TH', NULL, 'TH', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'DE-TH');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'DEU', 'DE-BW', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'DEU' AND geo_id_to = 'DE-BW' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'DEU', 'DE-BY', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'DEU' AND geo_id_to = 'DE-BY' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'DEU', 'DE-BE', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'DEU' AND geo_id_to = 'DE-BE' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'DEU', 'DE-BB', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'DEU' AND geo_id_to = 'DE-BB' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'DEU', 'DE-HB', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'DEU' AND geo_id_to = 'DE-HB' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'DEU', 'DE-HH', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'DEU' AND geo_id_to = 'DE-HH' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'DEU', 'DE-HE', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'DEU' AND geo_id_to = 'DE-HE' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'DEU', 'DE-MV', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'DEU' AND geo_id_to = 'DE-MV' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'DEU', 'DE-NI', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'DEU' AND geo_id_to = 'DE-NI' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'DEU', 'DE-NW', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'DEU' AND geo_id_to = 'DE-NW' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'DEU', 'DE-RP', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'DEU' AND geo_id_to = 'DE-RP' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'DEU', 'DE-SL', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'DEU' AND geo_id_to = 'DE-SL' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'DEU', 'DE-SH', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'DEU' AND geo_id_to = 'DE-SH' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'DEU', 'DE-SN', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'DEU' AND geo_id_to = 'DE-SN' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'DEU', 'DE-ST', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'DEU' AND geo_id_to = 'DE-ST' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'DEU', 'DE-TH', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'DEU' AND geo_id_to = 'DE-TH' AND geo_assoc_type_id = 'REGIONS');
