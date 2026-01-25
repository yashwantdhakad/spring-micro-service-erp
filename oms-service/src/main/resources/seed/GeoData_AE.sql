INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'AE-AZ', 'TERRITORY', 'Abū Z̧aby', 'AZ', NULL, 'AZ', 'Abu Dhabi'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'AE-AZ');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'AE-FU', 'TERRITORY', 'Al Fujayrah', 'FU', NULL, 'FU', 'Fujairah'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'AE-FU');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'AE-SH', 'TERRITORY', 'Ash Shāriqah', 'SH', NULL, 'SH', 'Sharjah'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'AE-SH');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'AE-DU', 'TERRITORY', 'Dubayy', 'DU', NULL, 'DU', 'Dubai'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'AE-DU');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'AE-RK', 'TERRITORY', 'Ra’s al Khaymah', 'RK', NULL, 'RK', 'Ras Al Khaimah'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'AE-RK');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'AE-UQ', 'TERRITORY', 'Umm al Qaywayn', 'UQ', NULL, 'UQ', 'Umm Al Quwain'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'AE-UQ');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'AE-AJ', 'TERRITORY', '‘Ajmān', 'AJ', NULL, 'AJ', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'AE-AJ');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ARE', 'AE-AZ', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ARE' AND geo_id_to = 'AE-AZ' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ARE', 'AE-FU', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ARE' AND geo_id_to = 'AE-FU' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ARE', 'AE-SH', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ARE' AND geo_id_to = 'AE-SH' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ARE', 'AE-DU', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ARE' AND geo_id_to = 'AE-DU' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ARE', 'AE-RK', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ARE' AND geo_id_to = 'AE-RK' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ARE', 'AE-UQ', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ARE' AND geo_id_to = 'AE-UQ' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ARE', 'AE-AJ', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ARE' AND geo_id_to = 'AE-AJ' AND geo_assoc_type_id = 'REGIONS');
