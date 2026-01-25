INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'KP-04', 'PROVINCE', 'Chagang-do', '04', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'KP-04');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'KP-09', 'PROVINCE', 'Hamgyǒng-bukto', '09', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'KP-09');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'KP-08', 'PROVINCE', 'Hamgyǒng-namdo', '08', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'KP-08');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'KP-06', 'PROVINCE', 'Hwanghae-bukto', '06', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'KP-06');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'KP-05', 'PROVINCE', 'Hwanghae-namdo', '05', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'KP-05');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'KP-07', 'PROVINCE', 'Kangwǒn-do', '07', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'KP-07');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'KP-14', 'CITY', 'Namp’o', '14', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'KP-14');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'KP-03', 'PROVINCE', 'P''yǒngan-bukto', '03', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'KP-03');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'KP-02', 'PROVINCE', 'P''yǒngan-namdo', '02', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'KP-02');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'KP-01', 'CITY', 'P''yǒngyang', '01', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'KP-01');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'KP-13', 'CITY', 'Rasǒn', '13', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'KP-13');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'KP-10', 'PROVINCE', 'Ryanggang-do', '10', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'KP-10');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'PRK', 'KP-04', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'PRK' AND geo_id_to = 'KP-04' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'PRK', 'KP-09', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'PRK' AND geo_id_to = 'KP-09' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'PRK', 'KP-08', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'PRK' AND geo_id_to = 'KP-08' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'PRK', 'KP-06', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'PRK' AND geo_id_to = 'KP-06' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'PRK', 'KP-05', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'PRK' AND geo_id_to = 'KP-05' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'PRK', 'KP-07', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'PRK' AND geo_id_to = 'KP-07' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'PRK', 'KP-14', 'COUNTY_CITY'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'PRK' AND geo_id_to = 'KP-14' AND geo_assoc_type_id = 'COUNTY_CITY');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'PRK', 'KP-03', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'PRK' AND geo_id_to = 'KP-03' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'PRK', 'KP-02', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'PRK' AND geo_id_to = 'KP-02' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'PRK', 'KP-01', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'PRK' AND geo_id_to = 'KP-01' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'PRK', 'KP-13', 'COUNTY_CITY'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'PRK' AND geo_id_to = 'KP-13' AND geo_assoc_type_id = 'COUNTY_CITY');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'PRK', 'KP-10', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'PRK' AND geo_id_to = 'KP-10' AND geo_assoc_type_id = 'REGIONS');
