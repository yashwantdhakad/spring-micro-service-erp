INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MX-AG', 'STATE', 'Aguascalientes', 'AGU', NULL, 'AGU', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MX-AG');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MX-BN', 'STATE', 'Baja California', 'BCN', NULL, 'BCN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MX-BN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MX-BS', 'STATE', 'Baja California Sur', 'BCS', NULL, 'BCS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MX-BS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MX-CM', 'STATE', 'Campeche', 'CAM', NULL, 'CAM', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MX-CM');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MX-CP', 'STATE', 'Chiapas', 'CHP', NULL, 'CHP', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MX-CP');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MX-CH', 'STATE', 'Chihuahua', 'CHH', NULL, 'CHH', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MX-CH');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MX-CA', 'STATE', 'Coahuila', 'COA', NULL, 'COA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MX-CA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MX-CL', 'STATE', 'Colima', 'COL', NULL, 'COL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MX-CL');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MX-DF', 'STATE', 'Distrito Federal', 'DIF', NULL, 'DIF', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MX-DF');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MX-DU', 'STATE', 'Durango', 'DUR', NULL, 'DUR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MX-DU');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MX-GJ', 'STATE', 'Guanajuato', 'GUA', NULL, 'GUA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MX-GJ');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MX-GR', 'STATE', 'Guerrero', 'GRO', NULL, 'GRO', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MX-GR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MX-HI', 'STATE', 'Hidalgo', 'HID', NULL, 'HID', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MX-HI');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MX-JA', 'STATE', 'Jalisco', 'JAL', NULL, 'JAL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MX-JA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MX-MX', 'STATE', 'México', 'MEX', NULL, 'MEX', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MX-MX');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MX-MC', 'STATE', 'Michoacán', 'MIC', NULL, 'MIC', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MX-MC');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MX-MR', 'STATE', 'Morelos', 'MOR', NULL, 'MOR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MX-MR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MX-NA', 'STATE', 'Nayarit', 'NAY', NULL, 'NAY', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MX-NA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MX-NL', 'STATE', 'Nuevo León', 'NLE', NULL, 'NLE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MX-NL');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MX-OA', 'STATE', 'Oaxaca', 'OAX', NULL, 'OAX', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MX-OA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MX-PU', 'STATE', 'Puebla', 'PUE', NULL, 'PUE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MX-PU');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MX-QE', 'STATE', 'Querétaro', 'QUE', NULL, 'QUE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MX-QE');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MX-QR', 'STATE', 'Quintana Roo', 'ROO', NULL, 'ROO', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MX-QR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MX-SL', 'STATE', 'San Luis Potosí', 'SLP', NULL, 'SLP', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MX-SL');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MX-SI', 'STATE', 'Sinaloa', 'SIN', NULL, 'SIN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MX-SI');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MX-SO', 'STATE', 'Sonora', 'SON', NULL, 'SON', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MX-SO');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MX-TB', 'STATE', 'Tabasco', 'TAB', NULL, 'TAB', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MX-TB');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MX-TM', 'STATE', 'Tamaulipas', 'TAM', NULL, 'TAM', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MX-TM');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MX-TL', 'STATE', 'Tlaxcala', 'TLA', NULL, 'TLA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MX-TL');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MX-VE', 'STATE', 'Veracruz', 'VER', NULL, 'VER', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MX-VE');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MX-YU', 'STATE', 'Yucatán', 'YUC', NULL, 'YUC', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MX-YU');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MX-ZA', 'STATE', 'Zacatecas', 'ZAC', NULL, 'ZAC', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MX-ZA');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MEX', 'MX-AG', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MEX' AND geo_id_to = 'MX-AG' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MEX', 'MX-BN', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MEX' AND geo_id_to = 'MX-BN' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MEX', 'MX-BS', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MEX' AND geo_id_to = 'MX-BS' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MEX', 'MX-CM', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MEX' AND geo_id_to = 'MX-CM' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MEX', 'MX-CP', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MEX' AND geo_id_to = 'MX-CP' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MEX', 'MX-CH', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MEX' AND geo_id_to = 'MX-CH' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MEX', 'MX-CA', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MEX' AND geo_id_to = 'MX-CA' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MEX', 'MX-CL', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MEX' AND geo_id_to = 'MX-CL' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MEX', 'MX-DF', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MEX' AND geo_id_to = 'MX-DF' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MEX', 'MX-DU', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MEX' AND geo_id_to = 'MX-DU' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MEX', 'MX-GJ', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MEX' AND geo_id_to = 'MX-GJ' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MEX', 'MX-GR', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MEX' AND geo_id_to = 'MX-GR' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MEX', 'MX-HI', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MEX' AND geo_id_to = 'MX-HI' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MEX', 'MX-JA', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MEX' AND geo_id_to = 'MX-JA' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MEX', 'MX-MX', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MEX' AND geo_id_to = 'MX-MX' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MEX', 'MX-MC', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MEX' AND geo_id_to = 'MX-MC' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MEX', 'MX-MR', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MEX' AND geo_id_to = 'MX-MR' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MEX', 'MX-NA', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MEX' AND geo_id_to = 'MX-NA' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MEX', 'MX-NL', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MEX' AND geo_id_to = 'MX-NL' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MEX', 'MX-OA', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MEX' AND geo_id_to = 'MX-OA' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MEX', 'MX-PU', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MEX' AND geo_id_to = 'MX-PU' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MEX', 'MX-QE', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MEX' AND geo_id_to = 'MX-QE' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MEX', 'MX-QR', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MEX' AND geo_id_to = 'MX-QR' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MEX', 'MX-SL', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MEX' AND geo_id_to = 'MX-SL' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MEX', 'MX-SI', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MEX' AND geo_id_to = 'MX-SI' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MEX', 'MX-SO', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MEX' AND geo_id_to = 'MX-SO' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MEX', 'MX-TB', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MEX' AND geo_id_to = 'MX-TB' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MEX', 'MX-TM', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MEX' AND geo_id_to = 'MX-TM' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MEX', 'MX-TL', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MEX' AND geo_id_to = 'MX-TL' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MEX', 'MX-VE', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MEX' AND geo_id_to = 'MX-VE' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MEX', 'MX-YU', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MEX' AND geo_id_to = 'MX-YU' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MEX', 'MX-ZA', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MEX' AND geo_id_to = 'MX-ZA' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MEXCAN', 'GROUP', 'Mexico/Canada', 'MEXCAN', NULL, 'MEXCAN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MEXCAN');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MEX', 'MEXCAN', 'GROUP_MEMBER'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MEX' AND geo_id_to = 'MEXCAN' AND geo_assoc_type_id = 'GROUP_MEMBER');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CAN', 'MEXCAN', 'GROUP_MEMBER'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CAN' AND geo_id_to = 'MEXCAN' AND geo_assoc_type_id = 'GROUP_MEMBER');
