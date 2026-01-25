INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CH-AG', 'STATE', 'Aargau', 'AG', NULL, 'AG', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CH-AG');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CH-AI', 'STATE', 'Appenzell Innerrhoden', 'AI', NULL, 'AI', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CH-AI');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CH-AR', 'STATE', 'Appenzell Ausserrhoden', 'AR', NULL, 'AR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CH-AR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CH-BE', 'STATE', 'Bern', 'BE', NULL, 'BE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CH-BE');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CH-BL', 'STATE', 'Basel-Landschaft', 'BL', NULL, 'BL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CH-BL');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CH-BS', 'STATE', 'Basel-Stadt', 'BS', NULL, 'BS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CH-BS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CH-FR', 'STATE', 'Fribourg', 'FR', NULL, 'FR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CH-FR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CH-GE', 'STATE', 'Genève', 'GE', NULL, 'GE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CH-GE');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CH-GL', 'STATE', 'Glarus', 'GL', NULL, 'GL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CH-GL');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CH-GR', 'STATE', 'Graubünden', 'GR', NULL, 'GR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CH-GR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CH-JU', 'STATE', 'Jura', 'JU', NULL, 'JU', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CH-JU');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CH-LU', 'STATE', 'Luzern', 'LU', NULL, 'LU', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CH-LU');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CH-NE', 'STATE', 'Neuchâtel', 'NE', NULL, 'NE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CH-NE');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CH-NW', 'STATE', 'Nidwalden', 'NW', NULL, 'NW', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CH-NW');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CH-OW', 'STATE', 'Obwalden', 'OW', NULL, 'OW', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CH-OW');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CH-SG', 'STATE', 'St. Gallen', 'SG', NULL, 'SG', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CH-SG');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CH-SH', 'STATE', 'Schaffhausen', 'SH', NULL, 'SH', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CH-SH');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CH-SO', 'STATE', 'Solothurn', 'SO', NULL, 'SO', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CH-SO');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CH-SZ', 'STATE', 'Schwyz', 'SZ', NULL, 'SZ', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CH-SZ');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CH-TG', 'STATE', 'Thurgau', 'TG', NULL, 'TG', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CH-TG');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CH-TI', 'STATE', 'Ticino', 'TI', NULL, 'TI', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CH-TI');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CH-UR', 'STATE', 'Uri', 'UR', NULL, 'UR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CH-UR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CH-VD', 'STATE', 'Vaud', 'VD', NULL, 'VD', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CH-VD');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CH-VS', 'STATE', 'Valais', 'VS', NULL, 'VS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CH-VS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CH-ZG', 'STATE', 'Zug', 'ZG', NULL, 'ZG', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CH-ZG');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CH-ZH', 'STATE', 'Zürich', 'ZH', NULL, 'ZH', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CH-ZH');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHE', 'CH-AG', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHE' AND geo_id_to = 'CH-AG' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHE', 'CH-AI', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHE' AND geo_id_to = 'CH-AI' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHE', 'CH-AR', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHE' AND geo_id_to = 'CH-AR' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHE', 'CH-BE', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHE' AND geo_id_to = 'CH-BE' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHE', 'CH-BL', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHE' AND geo_id_to = 'CH-BL' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHE', 'CH-BS', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHE' AND geo_id_to = 'CH-BS' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHE', 'CH-FR', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHE' AND geo_id_to = 'CH-FR' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHE', 'CH-GE', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHE' AND geo_id_to = 'CH-GE' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHE', 'CH-GL', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHE' AND geo_id_to = 'CH-GL' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHE', 'CH-GR', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHE' AND geo_id_to = 'CH-GR' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHE', 'CH-JU', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHE' AND geo_id_to = 'CH-JU' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHE', 'CH-LU', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHE' AND geo_id_to = 'CH-LU' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHE', 'CH-NE', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHE' AND geo_id_to = 'CH-NE' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHE', 'CH-NW', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHE' AND geo_id_to = 'CH-NW' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHE', 'CH-OW', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHE' AND geo_id_to = 'CH-OW' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHE', 'CH-SG', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHE' AND geo_id_to = 'CH-SG' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHE', 'CH-SH', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHE' AND geo_id_to = 'CH-SH' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHE', 'CH-SO', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHE' AND geo_id_to = 'CH-SO' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHE', 'CH-SZ', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHE' AND geo_id_to = 'CH-SZ' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHE', 'CH-TG', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHE' AND geo_id_to = 'CH-TG' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHE', 'CH-TI', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHE' AND geo_id_to = 'CH-TI' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHE', 'CH-UR', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHE' AND geo_id_to = 'CH-UR' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHE', 'CH-VD', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHE' AND geo_id_to = 'CH-VD' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHE', 'CH-VS', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHE' AND geo_id_to = 'CH-VS' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHE', 'CH-ZG', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHE' AND geo_id_to = 'CH-ZG' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHE', 'CH-ZH', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHE' AND geo_id_to = 'CH-ZH' AND geo_assoc_type_id = 'REGIONS');
