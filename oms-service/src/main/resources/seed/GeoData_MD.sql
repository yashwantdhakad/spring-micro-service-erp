INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MD-AN', 'COUNTY', 'Anenii Noi', 'AN', NULL, 'AN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MD-AN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MD-BS', 'COUNTY', 'Basarabeasca', 'BS', NULL, 'BS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MD-BS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MD-BD', 'CITY', 'Bender [Tighina]', 'BD', NULL, 'BD', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MD-BD');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MD-BR', 'COUNTY', 'Briceni', 'BR', NULL, 'BR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MD-BR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MD-BA', 'CITY', 'Bălți', 'BA', NULL, 'BA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MD-BA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MD-CA', 'COUNTY', 'Cahul', 'CA', NULL, 'CA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MD-CA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MD-CT', 'COUNTY', 'Cantemir', 'CT', NULL, 'CT', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MD-CT');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MD-CU', 'CITY', 'Chișinău', 'CU', NULL, 'CU', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MD-CU');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MD-CM', 'COUNTY', 'Cimișlia', 'CM', NULL, 'CM', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MD-CM');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MD-CR', 'COUNTY', 'Criuleni', 'CR', NULL, 'CR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MD-CR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MD-CL', 'COUNTY', 'Călărași', 'CL', NULL, 'CL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MD-CL');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MD-CS', 'COUNTY', 'Căușeni', 'CS', NULL, 'CS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MD-CS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MD-DO', 'COUNTY', 'Dondușeni', 'DO', NULL, 'DO', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MD-DO');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MD-DR', 'COUNTY', 'Drochia', 'DR', NULL, 'DR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MD-DR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MD-DU', 'COUNTY', 'Dubăsari', 'DU', NULL, 'DU', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MD-DU');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MD-ED', 'COUNTY', 'Edineț', 'ED', NULL, 'ED', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MD-ED');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MD-FL', 'COUNTY', 'Florești', 'FL', NULL, 'FL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MD-FL');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MD-FA', 'COUNTY', 'Fălești', 'FA', NULL, 'FA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MD-FA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MD-GL', 'COUNTY', 'Glodeni', 'GL', NULL, 'GL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MD-GL');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MD-GA', 'TERRITORY', 'Găgăuzia', 'GA', NULL, 'GA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MD-GA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MD-HI', 'COUNTY', 'Hîncești', 'HI', NULL, 'HI', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MD-HI');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MD-IA', 'COUNTY', 'Ialoveni', 'IA', NULL, 'IA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MD-IA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MD-LE', 'COUNTY', 'Leova', 'LE', NULL, 'LE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MD-LE');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MD-NI', 'COUNTY', 'Nisporeni', 'NI', NULL, 'NI', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MD-NI');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MD-OC', 'COUNTY', 'Ocnița', 'OC', NULL, 'OC', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MD-OC');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MD-OR', 'COUNTY', 'Orhei', 'OR', NULL, 'OR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MD-OR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MD-RE', 'COUNTY', 'Rezina', 'RE', NULL, 'RE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MD-RE');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MD-RI', 'COUNTY', 'Rîșcani', 'RI', NULL, 'RI', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MD-RI');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MD-SO', 'COUNTY', 'Soroca', 'SO', NULL, 'SO', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MD-SO');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MD-ST', 'COUNTY', 'Strășeni', 'ST', NULL, 'ST', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MD-ST');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MD-SN', 'TERRITORY', 'Stînga Nistrului', 'SN', NULL, 'SN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MD-SN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MD-SI', 'COUNTY', 'Sîngerei', 'SI', NULL, 'SI', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MD-SI');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MD-TA', 'COUNTY', 'Taraclia', 'TA', NULL, 'TA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MD-TA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MD-TE', 'COUNTY', 'Telenești', 'TE', NULL, 'TE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MD-TE');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MD-UN', 'COUNTY', 'Ungheni', 'UN', NULL, 'UN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MD-UN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MD-SD', 'COUNTY', 'Șoldănești', 'SD', NULL, 'SD', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MD-SD');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MD-SV', 'COUNTY', 'Ștefan Vodă', 'SV', NULL, 'SV', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MD-SV');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MDA', 'MD-AN', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MDA' AND geo_id_to = 'MD-AN' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MDA', 'MD-BS', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MDA' AND geo_id_to = 'MD-BS' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MDA', 'MD-BD', 'COUNTY_CITY'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MDA' AND geo_id_to = 'MD-BD' AND geo_assoc_type_id = 'COUNTY_CITY');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MDA', 'MD-BR', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MDA' AND geo_id_to = 'MD-BR' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MDA', 'MD-BA', 'COUNTY_CITY'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MDA' AND geo_id_to = 'MD-BA' AND geo_assoc_type_id = 'COUNTY_CITY');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MDA', 'MD-CA', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MDA' AND geo_id_to = 'MD-CA' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MDA', 'MD-CT', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MDA' AND geo_id_to = 'MD-CT' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MDA', 'MD-CU', 'COUNTY_CITY'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MDA' AND geo_id_to = 'MD-CU' AND geo_assoc_type_id = 'COUNTY_CITY');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MDA', 'MD-CM', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MDA' AND geo_id_to = 'MD-CM' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MDA', 'MD-CR', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MDA' AND geo_id_to = 'MD-CR' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MDA', 'MD-CL', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MDA' AND geo_id_to = 'MD-CL' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MDA', 'MD-CS', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MDA' AND geo_id_to = 'MD-CS' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MDA', 'MD-DO', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MDA' AND geo_id_to = 'MD-DO' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MDA', 'MD-DR', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MDA' AND geo_id_to = 'MD-DR' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MDA', 'MD-DU', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MDA' AND geo_id_to = 'MD-DU' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MDA', 'MD-ED', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MDA' AND geo_id_to = 'MD-ED' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MDA', 'MD-FL', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MDA' AND geo_id_to = 'MD-FL' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MDA', 'MD-FA', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MDA' AND geo_id_to = 'MD-FA' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MDA', 'MD-GL', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MDA' AND geo_id_to = 'MD-GL' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MDA', 'MD-GA', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MDA' AND geo_id_to = 'MD-GA' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MDA', 'MD-HI', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MDA' AND geo_id_to = 'MD-HI' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MDA', 'MD-IA', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MDA' AND geo_id_to = 'MD-IA' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MDA', 'MD-LE', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MDA' AND geo_id_to = 'MD-LE' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MDA', 'MD-NI', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MDA' AND geo_id_to = 'MD-NI' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MDA', 'MD-OC', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MDA' AND geo_id_to = 'MD-OC' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MDA', 'MD-OR', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MDA' AND geo_id_to = 'MD-OR' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MDA', 'MD-RE', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MDA' AND geo_id_to = 'MD-RE' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MDA', 'MD-RI', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MDA' AND geo_id_to = 'MD-RI' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MDA', 'MD-SO', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MDA' AND geo_id_to = 'MD-SO' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MDA', 'MD-ST', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MDA' AND geo_id_to = 'MD-ST' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MDA', 'MD-SN', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MDA' AND geo_id_to = 'MD-SN' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MDA', 'MD-SI', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MDA' AND geo_id_to = 'MD-SI' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MDA', 'MD-TA', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MDA' AND geo_id_to = 'MD-TA' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MDA', 'MD-TE', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MDA' AND geo_id_to = 'MD-TE' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MDA', 'MD-UN', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MDA' AND geo_id_to = 'MD-UN' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MDA', 'MD-SD', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MDA' AND geo_id_to = 'MD-SD' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MDA', 'MD-SV', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MDA' AND geo_id_to = 'MD-SV' AND geo_assoc_type_id = 'REGIONS');
