INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IN-AN', 'TERRITORY', 'Andaman and Nicobar Islands', 'AN', NULL, 'AN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IN-AN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IN-AP', 'STATE', 'Andhra Pradesh', 'AP', NULL, 'AP', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IN-AP');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IN-AR', 'STATE', 'Arunachal Pradesh', 'AR', NULL, 'AR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IN-AR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IN-AS', 'STATE', 'Assam', 'AS', NULL, 'AS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IN-AS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IN-BR', 'STATE', 'Bihar', 'BR', NULL, 'BR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IN-BR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IN-CH', 'TERRITORY', 'Chandigarh', 'CH', NULL, 'CH', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IN-CH');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IN-CT', 'STATE', 'Chhattisgarh', 'CT', NULL, 'CT', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IN-CT');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IN-DN', 'TERRITORY', 'Dadra and Nagar Haveli', 'DN', NULL, 'DN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IN-DN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IN-DD', 'TERRITORY', 'Daman and Diu', 'DD', NULL, 'DD', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IN-DD');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IN-DL', 'TERRITORY', 'Delhi', 'DL', NULL, 'DL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IN-DL');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IN-GA', 'STATE', 'Goa', 'GA', NULL, 'GA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IN-GA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IN-GJ', 'STATE', 'Gujarat', 'GJ', NULL, 'GJ', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IN-GJ');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IN-HR', 'STATE', 'Haryana', 'HR', NULL, 'HR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IN-HR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IN-HP', 'STATE', 'Himachal Pradesh', 'HP', NULL, 'HP', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IN-HP');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IN-JK', 'TERRITORY', 'Jammu and Kashmir', 'JK', NULL, 'JK', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IN-JK');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IN-JH', 'STATE', 'Jharkhand', 'JH', NULL, 'JH', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IN-JH');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IN-KA', 'STATE', 'Karnataka', 'KA', NULL, 'KA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IN-KA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IN-KL', 'STATE', 'Kerala', 'KL', NULL, 'KL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IN-KL');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IN-LA', 'TERRITORY', 'Ladakh', 'LA', NULL, 'LA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IN-LA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IN-LD', 'TERRITORY', 'Lakshadweep', 'LD', NULL, 'LD', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IN-LD');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IN-MP', 'STATE', 'Madhya Pradesh', 'MP', NULL, 'MP', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IN-MP');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IN-MH', 'STATE', 'Maharashtra', 'MH', NULL, 'MH', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IN-MH');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IN-MN', 'STATE', 'Manipur', 'MN', NULL, 'MN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IN-MN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IN-ML', 'STATE', 'Meghalaya', 'ML', NULL, 'ML', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IN-ML');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IN-MZ', 'STATE', 'Mizoram', 'MZ', NULL, 'MZ', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IN-MZ');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IN-NL', 'STATE', 'Nagaland', 'NL', NULL, 'NL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IN-NL');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IN-OR', 'STATE', 'Odisha', 'OR', NULL, 'OR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IN-OR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IN-PY', 'TERRITORY', 'Puducherry', 'PY', NULL, 'PY', 'Pondicherry'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IN-PY');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IN-PB', 'STATE', 'Punjab', 'PB', NULL, 'PB', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IN-PB');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IN-RJ', 'STATE', 'Rajasthan', 'RJ', NULL, 'RJ', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IN-RJ');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IN-SK', 'STATE', 'Sikkim', 'SK', NULL, 'SK', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IN-SK');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IN-TN', 'STATE', 'Tamil Nadu', 'TN', NULL, 'TN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IN-TN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IN-TG', 'STATE', 'Telangana', 'TG', NULL, 'TG', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IN-TG');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IN-TR', 'STATE', 'Tripura', 'TR', NULL, 'TR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IN-TR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IN-UP', 'STATE', 'Uttar Pradesh', 'UP', NULL, 'UP', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IN-UP');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IN-UT', 'STATE', 'Uttarakhand', 'UT', NULL, 'UT', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IN-UT');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IN-WB', 'STATE', 'West Bengal', 'WB', NULL, 'WB', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IN-WB');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IND', 'IN-AN', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IND' AND geo_id_to = 'IN-AN' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IND', 'IN-AP', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IND' AND geo_id_to = 'IN-AP' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IND', 'IN-AR', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IND' AND geo_id_to = 'IN-AR' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IND', 'IN-AS', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IND' AND geo_id_to = 'IN-AS' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IND', 'IN-BR', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IND' AND geo_id_to = 'IN-BR' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IND', 'IN-CH', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IND' AND geo_id_to = 'IN-CH' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IND', 'IN-CT', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IND' AND geo_id_to = 'IN-CT' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IND', 'IN-DL', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IND' AND geo_id_to = 'IN-DL' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IND', 'IN-DN', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IND' AND geo_id_to = 'IN-DN' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IND', 'IN-DD', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IND' AND geo_id_to = 'IN-DD' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IND', 'IN-GA', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IND' AND geo_id_to = 'IN-GA' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IND', 'IN-GJ', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IND' AND geo_id_to = 'IN-GJ' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IND', 'IN-HR', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IND' AND geo_id_to = 'IN-HR' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IND', 'IN-HP', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IND' AND geo_id_to = 'IN-HP' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IND', 'IN-JK', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IND' AND geo_id_to = 'IN-JK' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IND', 'IN-JH', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IND' AND geo_id_to = 'IN-JH' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IND', 'IN-KA', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IND' AND geo_id_to = 'IN-KA' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IND', 'IN-KL', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IND' AND geo_id_to = 'IN-KL' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IND', 'IN-LA', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IND' AND geo_id_to = 'IN-LA' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IND', 'IN-LD', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IND' AND geo_id_to = 'IN-LD' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IND', 'IN-MP', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IND' AND geo_id_to = 'IN-MP' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IND', 'IN-MH', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IND' AND geo_id_to = 'IN-MH' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IND', 'IN-MN', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IND' AND geo_id_to = 'IN-MN' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IND', 'IN-ML', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IND' AND geo_id_to = 'IN-ML' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IND', 'IN-MZ', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IND' AND geo_id_to = 'IN-MZ' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IND', 'IN-NL', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IND' AND geo_id_to = 'IN-NL' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IND', 'IN-OR', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IND' AND geo_id_to = 'IN-OR' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IND', 'IN-PY', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IND' AND geo_id_to = 'IN-PY' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IND', 'IN-PB', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IND' AND geo_id_to = 'IN-PB' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IND', 'IN-RJ', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IND' AND geo_id_to = 'IN-RJ' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IND', 'IN-SK', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IND' AND geo_id_to = 'IN-SK' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IND', 'IN-TN', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IND' AND geo_id_to = 'IN-TN' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IND', 'IN-TG', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IND' AND geo_id_to = 'IN-TG' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IND', 'IN-TR', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IND' AND geo_id_to = 'IN-TR' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IND', 'IN-UP', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IND' AND geo_id_to = 'IN-UP' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IND', 'IN-UT', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IND' AND geo_id_to = 'IN-UT' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IND', 'IN-WB', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IND' AND geo_id_to = 'IN-WB' AND geo_assoc_type_id = 'REGIONS');
