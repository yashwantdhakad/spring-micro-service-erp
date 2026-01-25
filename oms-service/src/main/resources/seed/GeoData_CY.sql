INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CY-04', 'COUNTY', 'Famagusta', '04', NULL, 'FA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CY-04');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CY-06', 'COUNTY', 'Kyrenia', '06', NULL, 'KY', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CY-06');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CY-03', 'COUNTY', 'Larnaca', '03', NULL, 'LA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CY-03');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CY-02', 'COUNTY', 'Limassol', '02', NULL, 'LI', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CY-02');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CY-01', 'COUNTY', 'Nicosia', '01', NULL, 'NI', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CY-01');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CY-05', 'COUNTY', 'Paphos', '05', NULL, 'PA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CY-05');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CYP', 'CY-04', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CYP' AND geo_id_to = 'CY-04' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CYP', 'CY-06', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CYP' AND geo_id_to = 'CY-06' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CYP', 'CY-03', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CYP' AND geo_id_to = 'CY-03' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CYP', 'CY-03', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CYP' AND geo_id_to = 'CY-03' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CYP', 'CY-01', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CYP' AND geo_id_to = 'CY-01' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CYP', 'CY-05', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CYP' AND geo_id_to = 'CY-05' AND geo_assoc_type_id = 'REGIONS');
