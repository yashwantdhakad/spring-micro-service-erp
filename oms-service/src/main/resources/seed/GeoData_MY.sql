INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MY-01', 'STATE', 'Johor', '01', NULL, 'JHR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MY-01');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MY-02', 'STATE', 'Kedah', '02', NULL, 'KDH', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MY-02');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MY-03', 'STATE', 'Kelantan', '03', NULL, 'KTN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MY-03');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MY-04', 'STATE', 'Malacca', '04', NULL, 'MLK', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MY-04');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MY-05', 'STATE', 'Negeri Sembilan', '05', NULL, 'NSN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MY-05');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MY-06', 'STATE', 'Pahang', '06', NULL, 'PHG', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MY-06');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MY-07', 'STATE', 'Penang', '07', NULL, 'PNG', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MY-07');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MY-08', 'STATE', 'Perak', '08', NULL, 'PRK', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MY-08');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MY-09', 'STATE', 'Perlis', '09', NULL, 'PLS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MY-09');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MY-10', 'STATE', 'Selangor', '10', NULL, 'SGR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MY-10');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MY-11', 'STATE', 'Terengganu', '11', NULL, 'TRG', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MY-11');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MY-12', 'STATE', 'Sabah', '12', NULL, 'SBH', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MY-12');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MY-13', 'STATE', 'Sarawak', '13', NULL, 'SRW', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MY-13');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MY-14', 'TERRITORY', 'Federal Territory of Kuala Lumpur', '14', NULL, 'KUL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MY-14');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MY-15', 'TERRITORY', 'Federal Territory of Labuan', '15', NULL, 'LBN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MY-15');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MY-16', 'TERRITORY', 'Federal Territory of Putrajaya', '16', NULL, 'PJY', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MY-16');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MYS', 'MY-01', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MYS' AND geo_id_to = 'MY-01' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MYS', 'MY-02', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MYS' AND geo_id_to = 'MY-02' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MYS', 'MY-03', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MYS' AND geo_id_to = 'MY-03' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MYS', 'MY-04', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MYS' AND geo_id_to = 'MY-04' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MYS', 'MY-05', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MYS' AND geo_id_to = 'MY-05' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MYS', 'MY-06', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MYS' AND geo_id_to = 'MY-06' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MYS', 'MY-07', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MYS' AND geo_id_to = 'MY-07' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MYS', 'MY-08', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MYS' AND geo_id_to = 'MY-08' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MYS', 'MY-09', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MYS' AND geo_id_to = 'MY-09' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MYS', 'MY-10', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MYS' AND geo_id_to = 'MY-10' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MYS', 'MY-11', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MYS' AND geo_id_to = 'MY-11' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MYS', 'MY-12', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MYS' AND geo_id_to = 'MY-12' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MYS', 'MY-13', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MYS' AND geo_id_to = 'MY-13' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MYS', 'MY-14', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MYS' AND geo_id_to = 'MY-14' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MYS', 'MY-15', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MYS' AND geo_id_to = 'MY-15' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MYS', 'MY-16', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MYS' AND geo_id_to = 'MY-16' AND geo_assoc_type_id = 'REGIONS');
