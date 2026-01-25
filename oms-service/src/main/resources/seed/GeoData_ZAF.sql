INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ZAF-01', 'PROVINCE', 'Eastern Cape', '01', NULL, 'EC', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ZAF-01');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ZAF-02', 'PROVINCE', 'Free State', '02', NULL, 'FS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ZAF-02');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ZAF-03', 'PROVINCE', 'Gauteng', '03', NULL, 'GP', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ZAF-03');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ZAF-04', 'PROVINCE', 'KwaZulu-Natal', '04', NULL, 'KZN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ZAF-04');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ZAF-05', 'PROVINCE', 'Limpopo', '05', NULL, 'LP', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ZAF-05');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ZAF-06', 'PROVINCE', 'Mpumalanga', '06', NULL, 'MP', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ZAF-06');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ZAF-07', 'PROVINCE', 'Northern Cape', '07', NULL, 'NC', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ZAF-07');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ZAF-08', 'PROVINCE', 'North West', '08', NULL, 'NW', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ZAF-08');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ZAF-09', 'PROVINCE', 'Western Cape', '09', NULL, 'WC', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ZAF-09');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ZAF', 'ZAF-01', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ZAF' AND geo_id_to = 'ZAF-01' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ZAF', 'ZAF-02', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ZAF' AND geo_id_to = 'ZAF-02' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ZAF', 'ZAF-03', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ZAF' AND geo_id_to = 'ZAF-03' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ZAF', 'ZAF-04', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ZAF' AND geo_id_to = 'ZAF-04' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ZAF', 'ZAF-05', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ZAF' AND geo_id_to = 'ZAF-05' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ZAF', 'ZAF-06', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ZAF' AND geo_id_to = 'ZAF-06' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ZAF', 'ZAF-07', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ZAF' AND geo_id_to = 'ZAF-07' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ZAF', 'ZAF-08', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ZAF' AND geo_id_to = 'ZAF-08' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ZAF', 'ZAF-09', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ZAF' AND geo_id_to = 'ZAF-09' AND geo_assoc_type_id = 'REGIONS');
