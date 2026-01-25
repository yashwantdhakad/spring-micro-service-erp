INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'LA-AT', 'PROVINCE', 'Attapu', 'AT', NULL, 'AT', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'LA-AT');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'LA-BK', 'PROVINCE', 'Bokèo', 'BK', NULL, 'BK', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'LA-BK');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'LA-BL', 'PROVINCE', 'Bolikhamxai', 'BL', NULL, 'BL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'LA-BL');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'LA-CH', 'PROVINCE', 'Champasak', 'CH', NULL, 'CH', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'LA-CH');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'LA-HO', 'PROVINCE', 'Houaphan', 'HO', NULL, 'HO', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'LA-HO');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'LA-KH', 'PROVINCE', 'Khammouan', 'KH', NULL, 'KH', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'LA-KH');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'LA-LM', 'PROVINCE', 'Louang Namtha', 'LM', NULL, 'LM', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'LA-LM');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'LA-LP', 'PROVINCE', 'Louangphabang', 'LP', NULL, 'LP', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'LA-LP');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'LA-OU', 'PROVINCE', 'Oudômxai', 'OU', NULL, 'OU', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'LA-OU');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'LA-PH', 'PROVINCE', 'Phôngsali', 'PH', NULL, 'PH', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'LA-PH');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'LA-SL', 'PROVINCE', 'Salavan', 'SL', NULL, 'SL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'LA-SL');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'LA-SV', 'PROVINCE', 'Savannakhét', 'SV', NULL, 'SV', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'LA-SV');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'LA-VT', 'GROUP', 'Viangchan', 'VT', NULL, 'VT', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'LA-VT');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'LA-VI', 'PROVINCE', 'Viangchan', 'VI', NULL, 'VI', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'LA-VI');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'LA-XA', 'PROVINCE', 'Xaignabouli', 'XA', NULL, 'XA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'LA-XA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'LA-XS', 'PROVINCE', 'Xaisômboun', 'XS', NULL, 'XS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'LA-XS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'LA-XI', 'PROVINCE', 'Xiangkhouang', 'XI', NULL, 'XI', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'LA-XI');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'LA-XE', 'PROVINCE', 'Xékong', 'XE', NULL, 'XE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'LA-XE');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'LAO', 'LA-AT', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'LAO' AND geo_id_to = 'LA-AT' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'LAO', 'LA-BK', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'LAO' AND geo_id_to = 'LA-BK' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'LAO', 'LA-BL', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'LAO' AND geo_id_to = 'LA-BL' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'LAO', 'LA-CH', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'LAO' AND geo_id_to = 'LA-CH' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'LAO', 'LA-HO', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'LAO' AND geo_id_to = 'LA-HO' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'LAO', 'LA-KH', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'LAO' AND geo_id_to = 'LA-KH' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'LAO', 'LA-LM', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'LAO' AND geo_id_to = 'LA-LM' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'LAO', 'LA-LP', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'LAO' AND geo_id_to = 'LA-LP' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'LAO', 'LA-OU', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'LAO' AND geo_id_to = 'LA-OU' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'LAO', 'LA-PH', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'LAO' AND geo_id_to = 'LA-PH' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'LAO', 'LA-SL', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'LAO' AND geo_id_to = 'LA-SL' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'LAO', 'LA-SV', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'LAO' AND geo_id_to = 'LA-SV' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'LAO', 'LA-VT', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'LAO' AND geo_id_to = 'LA-VT' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'LAO', 'LA-VI', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'LAO' AND geo_id_to = 'LA-VI' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'LAO', 'LA-XA', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'LAO' AND geo_id_to = 'LA-XA' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'LAO', 'LA-XS', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'LAO' AND geo_id_to = 'LA-XS' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'LAO', 'LA-XI', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'LAO' AND geo_id_to = 'LA-XI' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'LAO', 'LA-XE', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'LAO' AND geo_id_to = 'LA-XE' AND geo_assoc_type_id = 'REGIONS');
