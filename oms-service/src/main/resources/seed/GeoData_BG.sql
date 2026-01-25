INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BG-01', 'PROVINCE', 'Blagoevgrad', '01', NULL, 'E', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BG-01');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BG-02', 'PROVINCE', 'Burgas', '02', NULL, 'A', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BG-02');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BG-03', 'PROVINCE', 'Varna', '03', NULL, 'B', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BG-03');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BG-04', 'PROVINCE', 'Veliko Tarnovo', '04', NULL, 'BT', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BG-04');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BG-05', 'PROVINCE', 'Vidin', '05', NULL, 'BH', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BG-05');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BG-06', 'PROVINCE', 'Vratsa', '06', NULL, 'BP', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BG-06');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BG-07', 'PROVINCE', 'Gabrovo', '07', NULL, 'EB', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BG-07');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BG-08', 'PROVINCE', 'Dobrich', '08', NULL, 'TX', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BG-08');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BG-09', 'PROVINCE', 'Kardzhali', '09', NULL, 'K', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BG-09');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BG-10', 'PROVINCE', 'Kyustendil', '10', NULL, 'KH', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BG-10');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BG-11', 'PROVINCE', 'Lovech', '11', NULL, 'OB', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BG-11');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BG-12', 'PROVINCE', 'Montana', '12', NULL, 'M', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BG-12');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BG-13', 'PROVINCE', 'Pazardzhik', '13', NULL, 'PA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BG-13');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BG-14', 'PROVINCE', 'Pernik', '14', NULL, 'PK', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BG-14');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BG-15', 'PROVINCE', 'Pleven', '15', NULL, 'EH', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BG-15');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BG-16', 'PROVINCE', 'Plovdiv', '16', NULL, 'PB', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BG-16');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BG-17', 'PROVINCE', 'Razgrad', '17', NULL, 'PP', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BG-17');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BG-18', 'PROVINCE', 'Ruse', '18', NULL, 'P', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BG-18');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BG-19', 'PROVINCE', 'Silistra', '19', NULL, 'CC', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BG-19');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BG-20', 'PROVINCE', 'Sliven', '20', NULL, 'CH', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BG-20');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BG-21', 'PROVINCE', 'Smolyan', '21', NULL, 'CM', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BG-21');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BG-22', 'PROVINCE', 'Sofia', '22', NULL, 'C', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BG-22');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BG-23', 'PROVINCE', 'Sofia Province', '23', NULL, 'CO', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BG-23');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BG-24', 'PROVINCE', 'Stara Zagora', '24', NULL, 'CT', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BG-24');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BG-25', 'PROVINCE', 'Targovishte', '25', NULL, 'T', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BG-25');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BG-26', 'PROVINCE', 'Haskovo', '26', NULL, 'X', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BG-26');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BG-27', 'PROVINCE', 'Shumen', '27', NULL, 'H', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BG-27');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BG-28', 'PROVINCE', 'Yambol', '28', NULL, 'Y', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BG-28');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'BGR', 'BG-01', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'BGR' AND geo_id_to = 'BG-01' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'BGR', 'BG-02', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'BGR' AND geo_id_to = 'BG-02' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'BGR', 'BG-03', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'BGR' AND geo_id_to = 'BG-03' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'BGR', 'BG-04', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'BGR' AND geo_id_to = 'BG-04' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'BGR', 'BG-05', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'BGR' AND geo_id_to = 'BG-05' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'BGR', 'BG-06', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'BGR' AND geo_id_to = 'BG-06' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'BGR', 'BG-07', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'BGR' AND geo_id_to = 'BG-07' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'BGR', 'BG-08', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'BGR' AND geo_id_to = 'BG-08' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'BGR', 'BG-09', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'BGR' AND geo_id_to = 'BG-09' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'BGR', 'BG-10', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'BGR' AND geo_id_to = 'BG-10' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'BGR', 'BG-11', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'BGR' AND geo_id_to = 'BG-11' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'BGR', 'BG-12', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'BGR' AND geo_id_to = 'BG-12' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'BGR', 'BG-13', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'BGR' AND geo_id_to = 'BG-13' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'BGR', 'BG-14', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'BGR' AND geo_id_to = 'BG-14' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'BGR', 'BG-15', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'BGR' AND geo_id_to = 'BG-15' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'BGR', 'BG-16', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'BGR' AND geo_id_to = 'BG-16' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'BGR', 'BG-17', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'BGR' AND geo_id_to = 'BG-17' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'BGR', 'BG-18', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'BGR' AND geo_id_to = 'BG-18' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'BGR', 'BG-19', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'BGR' AND geo_id_to = 'BG-19' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'BGR', 'BG-20', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'BGR' AND geo_id_to = 'BG-20' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'BGR', 'BG-21', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'BGR' AND geo_id_to = 'BG-21' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'BGR', 'BG-22', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'BGR' AND geo_id_to = 'BG-22' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'BGR', 'BG-23', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'BGR' AND geo_id_to = 'BG-23' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'BGR', 'BG-24', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'BGR' AND geo_id_to = 'BG-24' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'BGR', 'BG-25', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'BGR' AND geo_id_to = 'BG-25' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'BGR', 'BG-26', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'BGR' AND geo_id_to = 'BG-26' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'BGR', 'BG-27', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'BGR' AND geo_id_to = 'BG-27' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'BGR', 'BG-28', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'BGR' AND geo_id_to = 'BG-28' AND geo_assoc_type_id = 'REGIONS');
