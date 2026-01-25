INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'PL-DŚ', 'STATE', 'dolnośląskie', 'DŚ', NULL, 'DŚ', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'PL-DŚ');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'PL-KP', 'STATE', 'kujawsko-pomorskie', 'KP', NULL, 'KP', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'PL-KP');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'PL-LB', 'STATE', 'lubelskie', 'LB', NULL, 'LB', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'PL-LB');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'PL-LS', 'STATE', 'lubuskie', 'LS', NULL, 'LS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'PL-LS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'PL-ŁD', 'STATE', 'łódzkie', 'ŁD', NULL, 'ŁD', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'PL-ŁD');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'PL-MP', 'STATE', 'małopolskie', 'MP', NULL, 'MP', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'PL-MP');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'PL-MZ', 'STATE', 'mazowieckie', 'MZ', NULL, 'MZ', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'PL-MZ');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'PL-OP', 'STATE', 'opolskie', 'OP', NULL, 'OP', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'PL-OP');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'PL-PK', 'STATE', 'podkarpackie', 'PK', NULL, 'PK', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'PL-PK');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'PL-PL', 'STATE', 'podlaskie', 'PL', NULL, 'PL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'PL-PL');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'PL-PM', 'STATE', 'pomorskie', 'PM', NULL, 'PM', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'PL-PM');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'PL-ŚL', 'STATE', 'śląskie', 'ŚL', NULL, 'ŚL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'PL-ŚL');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'PL-ŚK', 'STATE', 'świętokrzyskie', 'ŚK', NULL, 'ŚK', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'PL-ŚK');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'PL-WM', 'STATE', 'warmińsko-mazurskie', 'WM', NULL, 'WM', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'PL-WM');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'PL-WP', 'STATE', 'wielkopolskie', 'WP', NULL, 'WP', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'PL-WP');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'PL-ZP', 'STATE', 'zachodniopomorskie', 'ZP', NULL, 'ZP', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'PL-ZP');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'POL', 'PL-DŚ', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'POL' AND geo_id_to = 'PL-DŚ' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'POL', 'PL-KP', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'POL' AND geo_id_to = 'PL-KP' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'POL', 'PL-LB', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'POL' AND geo_id_to = 'PL-LB' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'POL', 'PL-LS', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'POL' AND geo_id_to = 'PL-LS' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'POL', 'PL-ŁD', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'POL' AND geo_id_to = 'PL-ŁD' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'POL', 'PL-MP', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'POL' AND geo_id_to = 'PL-MP' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'POL', 'PL-MZ', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'POL' AND geo_id_to = 'PL-MZ' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'POL', 'PL-OP', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'POL' AND geo_id_to = 'PL-OP' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'POL', 'PL-PK', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'POL' AND geo_id_to = 'PL-PK' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'POL', 'PL-PL', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'POL' AND geo_id_to = 'PL-PL' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'POL', 'PL-PM', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'POL' AND geo_id_to = 'PL-PM' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'POL', 'PL-ŚL', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'POL' AND geo_id_to = 'PL-ŚL' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'POL', 'PL-ŚK', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'POL' AND geo_id_to = 'PL-ŚK' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'POL', 'PL-WM', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'POL' AND geo_id_to = 'PL-WM' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'POL', 'PL-WP', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'POL' AND geo_id_to = 'PL-WP' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'POL', 'PL-ZP', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'POL' AND geo_id_to = 'PL-ZP' AND geo_assoc_type_id = 'REGIONS');
