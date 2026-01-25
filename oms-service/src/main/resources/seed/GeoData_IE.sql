INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IE-CRLW', 'COUNTY', 'Carlow', 'CW', NULL, 'CRLW', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IE-CRLW');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IE-CAVN', 'COUNTY', 'Cavan', 'CN', NULL, 'CAVN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IE-CAVN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IE-CLARE', 'COUNTY', 'Clare', 'CE', NULL, 'CLARE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IE-CLARE');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IE-CORK', 'COUNTY', 'Cork', 'CO', NULL, 'CORK', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IE-CORK');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IE-DNGL', 'COUNTY', 'Donegal', 'DL', NULL, 'DNGL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IE-DNGL');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IE-DBLN', 'COUNTY', 'Dublin', 'D', NULL, 'DBLN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IE-DBLN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IE-GALW', 'COUNTY', 'Galway', 'G', NULL, 'GALW', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IE-GALW');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IE-KERRY', 'COUNTY', 'Kerry', 'KY', NULL, 'KERRY', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IE-KERRY');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IE-KLDR', 'COUNTY', 'Kildare', 'KE', NULL, 'KLDR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IE-KLDR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IE-KLKNY', 'COUNTY', 'Kilkenny', 'KK', NULL, 'KLKNY', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IE-KLKNY');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IE-LAOIS', 'COUNTY', 'Laois', 'LS', NULL, 'LAOIS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IE-LAOIS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IE-L', 'COUNTY', 'Leinster', 'L', NULL, 'LTRM', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IE-L');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IE-LTRM', 'COUNTY', 'Leitrim', 'LM', NULL, 'LTRM', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IE-LTRM');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IE-LMRK', 'COUNTY', 'Limerick', 'LK', NULL, 'LMRK', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IE-LMRK');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IE-LGFD', 'COUNTY', 'Longford', 'LD', NULL, 'LGFD', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IE-LGFD');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IE-LOUTH', 'COUNTY', 'Louth', 'LH', NULL, 'LOUTH', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IE-LOUTH');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IE-MAYO', 'COUNTY', 'Mayo', 'MO', NULL, 'MAYO', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IE-MAYO');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IE-MEATH', 'COUNTY', 'Meath', 'MH', NULL, 'MEATH', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IE-MEATH');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IE-MNGHN', 'COUNTY', 'Monaghan', 'MN', NULL, 'MNGHN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IE-MNGHN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IE-M', 'COUNTY', 'Munster', 'M', NULL, 'MNGHN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IE-M');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IE-OFLY', 'COUNTY', 'Offaly', 'OY', NULL, 'OFLY', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IE-OFLY');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IE-RSCMN', 'COUNTY', 'Roscommon', 'RN', NULL, 'RSCMN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IE-RSCMN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IE-SLIGO', 'COUNTY', 'Sligo', 'SO', NULL, 'SLIGO', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IE-SLIGO');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IE-TPRY', 'COUNTY', 'Tipperary', 'TA', NULL, 'TPRY', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IE-TPRY');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IE-U', 'COUNTY', 'Ulster', 'U', NULL, 'TPRY', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IE-U');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IE-WTFD', 'COUNTY', 'Waterford', 'WD', NULL, 'WTFD', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IE-WTFD');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IE-WMETH', 'COUNTY', 'Westmeath', 'WH', NULL, 'WMETH', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IE-WMETH');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IE-WXFD', 'COUNTY', 'Wexford', 'WX', NULL, 'WXFD', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IE-WXFD');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IE-WKLW', 'COUNTY', 'Wicklow', 'WW', NULL, 'WKLW', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IE-WKLW');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IRL', 'IE-L', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IRL' AND geo_id_to = 'IE-L' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IRL', 'IE-M', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IRL' AND geo_id_to = 'IE-M' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IRL', 'IE-U', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IRL' AND geo_id_to = 'IE-U' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IRL', 'IE-CRLW', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IRL' AND geo_id_to = 'IE-CRLW' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IRL', 'IE-CAVN', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IRL' AND geo_id_to = 'IE-CAVN' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IRL', 'IE-CLARE', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IRL' AND geo_id_to = 'IE-CLARE' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IRL', 'IE-CORK', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IRL' AND geo_id_to = 'IE-CORK' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IRL', 'IE-DNGL', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IRL' AND geo_id_to = 'IE-DNGL' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IRL', 'IE-DBLN', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IRL' AND geo_id_to = 'IE-DBLN' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IRL', 'IE-GALW', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IRL' AND geo_id_to = 'IE-GALW' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IRL', 'IE-KERRY', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IRL' AND geo_id_to = 'IE-KERRY' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IRL', 'IE-KLDR', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IRL' AND geo_id_to = 'IE-KLDR' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IRL', 'IE-KLKNY', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IRL' AND geo_id_to = 'IE-KLKNY' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IRL', 'IE-LAOIS', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IRL' AND geo_id_to = 'IE-LAOIS' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IRL', 'IE-LTRM', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IRL' AND geo_id_to = 'IE-LTRM' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IRL', 'IE-LMRK', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IRL' AND geo_id_to = 'IE-LMRK' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IRL', 'IE-LGFD', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IRL' AND geo_id_to = 'IE-LGFD' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IRL', 'IE-LOUTH', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IRL' AND geo_id_to = 'IE-LOUTH' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IRL', 'IE-MAYO', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IRL' AND geo_id_to = 'IE-MAYO' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IRL', 'IE-MEATH', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IRL' AND geo_id_to = 'IE-MEATH' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IRL', 'IE-MNGHN', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IRL' AND geo_id_to = 'IE-MNGHN' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IRL', 'IE-OFLY', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IRL' AND geo_id_to = 'IE-OFLY' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IRL', 'IE-RSCMN', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IRL' AND geo_id_to = 'IE-RSCMN' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IRL', 'IE-SLIGO', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IRL' AND geo_id_to = 'IE-SLIGO' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IRL', 'IE-TPRY', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IRL' AND geo_id_to = 'IE-TPRY' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IRL', 'IE-WTFD', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IRL' AND geo_id_to = 'IE-WTFD' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IRL', 'IE-WMETH', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IRL' AND geo_id_to = 'IE-WMETH' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IRL', 'IE-WXFD', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IRL' AND geo_id_to = 'IE-WXFD' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IRL', 'IE-WKLW', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IRL' AND geo_id_to = 'IE-WKLW' AND geo_assoc_type_id = 'REGIONS');
