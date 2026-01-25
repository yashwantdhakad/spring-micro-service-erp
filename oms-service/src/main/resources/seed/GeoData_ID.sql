INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ID-AC', 'PROVINCE', 'Aceh', 'AC', NULL, 'AC', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ID-AC');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ID-BA', 'PROVINCE', 'Bali', 'BA', NULL, 'BA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ID-BA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ID-BT', 'PROVINCE', 'Banten', 'BT', NULL, 'BT', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ID-BT');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ID-BE', 'PROVINCE', 'Bengkulu', 'BE', NULL, 'BE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ID-BE');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ID-GO', 'PROVINCE', 'Gorontalo', 'GO', NULL, 'GO', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ID-GO');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ID-JK', 'COUNTY', 'Jakarta Raya', 'JK', NULL, 'JK', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ID-JK');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ID-JA', 'PROVINCE', 'Jambi', 'JA', NULL, 'JA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ID-JA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ID-JB', 'PROVINCE', 'Jawa Barat', 'JB', NULL, 'JB', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ID-JB');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ID-JT', 'PROVINCE', 'Jawa Tengah', 'JT', NULL, 'JT', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ID-JT');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ID-JI', 'PROVINCE', 'Jawa Timur', 'JI', NULL, 'JI', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ID-JI');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ID-KB', 'PROVINCE', 'Kalimantan Barat', 'KB', NULL, 'KB', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ID-KB');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ID-KS', 'PROVINCE', 'Kalimantan Selatan', 'KS', NULL, 'KS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ID-KS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ID-KT', 'PROVINCE', 'Kalimantan Tengah', 'KT', NULL, 'KT', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ID-KT');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ID-KI', 'PROVINCE', 'Kalimantan Timur', 'KI', NULL, 'KI', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ID-KI');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ID-KU', 'PROVINCE', 'Kalimantan Utara', 'KU', NULL, 'KU', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ID-KU');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ID-BB', 'PROVINCE', 'Kepulauan Bangka Belitung', 'BB', NULL, 'BB', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ID-BB');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ID-KR', 'PROVINCE', 'Kepulauan Riau', 'KR', NULL, 'KR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ID-KR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ID-LA', 'PROVINCE', 'Lampung', 'LA', NULL, 'LA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ID-LA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ID-MA', 'PROVINCE', 'Maluku', 'MA', NULL, 'MA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ID-MA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ID-MU', 'PROVINCE', 'Maluku Utara', 'MU', NULL, 'MU', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ID-MU');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ID-NB', 'PROVINCE', 'Nusa Tenggara Barat', 'NB', NULL, 'NB', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ID-NB');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ID-NT', 'PROVINCE', 'Nusa Tenggara Timur', 'NT', NULL, 'NT', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ID-NT');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ID-PA', 'PROVINCE', 'Papua', 'PA', NULL, 'PA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ID-PA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ID-PB', 'PROVINCE', 'Papua Barat', 'PB', NULL, 'PB', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ID-PB');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ID-RI', 'PROVINCE', 'Riau', 'RI', NULL, 'RI', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ID-RI');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ID-SR', 'PROVINCE', 'Sulawesi Barat', 'SR', NULL, 'SR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ID-SR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ID-SN', 'PROVINCE', 'Sulawesi Selatan', 'SN', NULL, 'SN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ID-SN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ID-ST', 'PROVINCE', 'Sulawesi Tengah', 'ST', NULL, 'ST', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ID-ST');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ID-SG', 'PROVINCE', 'Sulawesi Tenggara', 'SG', NULL, 'SG', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ID-SG');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ID-SA', 'PROVINCE', 'Sulawesi Utara', 'SA', NULL, 'SA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ID-SA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ID-SB', 'PROVINCE', 'Sumatera Barat', 'SB', NULL, 'SB', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ID-SB');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ID-SS', 'PROVINCE', 'Sumatera Selatan', 'SS', NULL, 'SS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ID-SS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ID-SU', 'PROVINCE', 'Sumatera Utara', 'SU', NULL, 'SU', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ID-SU');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ID-YO', 'REGION', 'Yogyakarta', 'YO', NULL, 'YO', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ID-YO');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IDN', 'ID-AC', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IDN' AND geo_id_to = 'ID-AC' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IDN', 'ID-BA', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IDN' AND geo_id_to = 'ID-BA' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IDN', 'ID-BT', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IDN' AND geo_id_to = 'ID-BT' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IDN', 'ID-BE', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IDN' AND geo_id_to = 'ID-BE' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IDN', 'ID-GO', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IDN' AND geo_id_to = 'ID-GO' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IDN', 'ID-JK', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IDN' AND geo_id_to = 'ID-JK' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IDN', 'ID-JA', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IDN' AND geo_id_to = 'ID-JA' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IDN', 'ID-JB', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IDN' AND geo_id_to = 'ID-JB' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IDN', 'ID-JT', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IDN' AND geo_id_to = 'ID-JT' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IDN', 'ID-JI', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IDN' AND geo_id_to = 'ID-JI' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IDN', 'ID-KB', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IDN' AND geo_id_to = 'ID-KB' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IDN', 'ID-KS', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IDN' AND geo_id_to = 'ID-KS' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IDN', 'ID-KT', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IDN' AND geo_id_to = 'ID-KT' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IDN', 'ID-KI', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IDN' AND geo_id_to = 'ID-KI' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IDN', 'ID-KU', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IDN' AND geo_id_to = 'ID-KU' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IDN', 'ID-BB', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IDN' AND geo_id_to = 'ID-BB' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IDN', 'ID-KR', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IDN' AND geo_id_to = 'ID-KR' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IDN', 'ID-LA', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IDN' AND geo_id_to = 'ID-LA' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IDN', 'ID-MA', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IDN' AND geo_id_to = 'ID-MA' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IDN', 'ID-MU', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IDN' AND geo_id_to = 'ID-MU' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IDN', 'ID-NB', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IDN' AND geo_id_to = 'ID-NB' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IDN', 'ID-NT', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IDN' AND geo_id_to = 'ID-NT' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IDN', 'ID-PA', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IDN' AND geo_id_to = 'ID-PA' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IDN', 'ID-PB', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IDN' AND geo_id_to = 'ID-PB' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IDN', 'ID-RI', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IDN' AND geo_id_to = 'ID-RI' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IDN', 'ID-SR', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IDN' AND geo_id_to = 'ID-SR' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IDN', 'ID-SN', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IDN' AND geo_id_to = 'ID-SN' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IDN', 'ID-ST', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IDN' AND geo_id_to = 'ID-ST' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IDN', 'ID-SG', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IDN' AND geo_id_to = 'ID-SG' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IDN', 'ID-SA', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IDN' AND geo_id_to = 'ID-SA' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IDN', 'ID-SB', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IDN' AND geo_id_to = 'ID-SB' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IDN', 'ID-SS', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IDN' AND geo_id_to = 'ID-SS' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IDN', 'ID-SU', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IDN' AND geo_id_to = 'ID-SU' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IDN', 'ID-YO', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IDN' AND geo_id_to = 'ID-YO' AND geo_assoc_type_id = 'REGIONS');
