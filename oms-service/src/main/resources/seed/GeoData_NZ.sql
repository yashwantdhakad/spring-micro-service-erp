INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'NZ-NTL', 'REGION', 'Northland', 'NTL', NULL, 'Ntl', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'NZ-NTL');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'NZ-AUK', 'REGION', 'Auckland', 'AUK', NULL, 'Auk', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'NZ-AUK');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'NZ-WKO', 'REGION', 'Waikato', 'WKO', NULL, 'Wko', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'NZ-WKO');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'NZ-BOP', 'REGION', 'Bay of Plenty', 'BOP', NULL, 'BoP', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'NZ-BOP');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'NZ-GIS', 'REGION', 'Gisborne', 'GIS', NULL, 'Gis', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'NZ-GIS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'NZ-HKB', 'REGION', 'Hawkes Bay', 'HKB', NULL, 'HkB', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'NZ-HKB');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'NZ-TKI', 'REGION', 'Taranaki', 'TKI', NULL, 'Tki', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'NZ-TKI');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'NZ-MWT', 'REGION', 'Manawatu-Whanganui', 'MWT', NULL, 'Mwt', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'NZ-MWT');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'NZ-WGN', 'REGION', 'Wellington', 'WGN', NULL, 'Wgn', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'NZ-WGN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'NZ-MBH', 'REGION', 'Marlborough', 'MBH', NULL, 'Mbh', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'NZ-MBH');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'NZ-NSN', 'REGION', 'Nelson', 'NSN', NULL, 'Nsn', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'NZ-NSN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'NZ-TAS', 'REGION', 'Tasman', 'TAS', NULL, 'Tas', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'NZ-TAS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'NZ-CAN', 'REGION', 'Canterbury', 'CAN', NULL, 'Can', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'NZ-CAN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'NZ-WTC', 'REGION', 'West Coast', 'WTC', NULL, 'WtC', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'NZ-WTC');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'NZ-OTA', 'REGION', 'Otago', 'OTA', NULL, 'Ota', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'NZ-OTA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'NZ-STL', 'REGION', 'Southland', 'STL', NULL, 'Stl', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'NZ-STL');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'NZ-CIT', 'TERRITORY', 'Chatham Islands', 'CIT', NULL, 'CIT', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'NZ-CIT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'NZL', 'NZ-NTL', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'NZL' AND geo_id_to = 'NZ-NTL' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'NZL', 'NZ-AUK', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'NZL' AND geo_id_to = 'NZ-AUK' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'NZL', 'NZ-WKO', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'NZL' AND geo_id_to = 'NZ-WKO' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'NZL', 'NZ-BOP', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'NZL' AND geo_id_to = 'NZ-BOP' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'NZL', 'NZ-GIS', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'NZL' AND geo_id_to = 'NZ-GIS' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'NZL', 'NZ-HKB', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'NZL' AND geo_id_to = 'NZ-HKB' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'NZL', 'NZ-TKI', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'NZL' AND geo_id_to = 'NZ-TKI' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'NZL', 'NZ-MWT', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'NZL' AND geo_id_to = 'NZ-MWT' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'NZL', 'NZ-WGN', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'NZL' AND geo_id_to = 'NZ-WGN' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'NZL', 'NZ-MBH', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'NZL' AND geo_id_to = 'NZ-MBH' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'NZL', 'NZ-NSN', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'NZL' AND geo_id_to = 'NZ-NSN' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'NZL', 'NZ-TAS', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'NZL' AND geo_id_to = 'NZ-TAS' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'NZL', 'NZ-CAN', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'NZL' AND geo_id_to = 'NZ-CAN' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'NZL', 'NZ-WTC', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'NZL' AND geo_id_to = 'NZ-WTC' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'NZL', 'NZ-OTA', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'NZL' AND geo_id_to = 'NZ-OTA' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'NZL', 'NZ-STL', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'NZL' AND geo_id_to = 'NZ-STL' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'NZL', 'NZ-CIT', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'NZL' AND geo_id_to = 'NZ-CIT' AND geo_assoc_type_id = 'REGIONS');
