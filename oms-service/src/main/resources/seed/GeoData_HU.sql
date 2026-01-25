INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'HU-BA', 'COUNTY', 'Baranya', 'BA', NULL, 'BA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'HU-BA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'HU-BZ', 'COUNTY', 'Borsod-Abaúj-Zemplén', 'BZ', NULL, 'BZ', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'HU-BZ');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'HU-BU', 'CITY', 'Budapest', 'BU', NULL, 'BU', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'HU-BU');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'HU-BK', 'COUNTY', 'Bács-Kiskun', 'BK', NULL, 'BK', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'HU-BK');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'HU-BE', 'COUNTY', 'Békés', 'BE', NULL, 'BE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'HU-BE');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'HU-BC', 'COUNTY_CITY', 'Békéscsaba', 'BC', NULL, 'BC', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'HU-BC');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'HU-CS', 'COUNTY', 'Csongrád', 'CS', NULL, 'CS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'HU-CS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'HU-DE', 'COUNTY_CITY', 'Debrecen', 'DE', NULL, 'DE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'HU-DE');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'HU-DU', 'COUNTY_CITY', 'Dunaújváros', 'DU', NULL, 'DU', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'HU-DU');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'HU-EG', 'COUNTY_CITY', 'Eger', 'EG', NULL, 'EG', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'HU-EG');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'HU-FE', 'COUNTY', 'Fejér', 'FE', NULL, 'FE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'HU-FE');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'HU-GY', 'COUNTY_CITY', 'Győr', 'GY', NULL, 'GY', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'HU-GY');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'HU-GS', 'COUNTY', 'Győr-Moson-Sopron', 'GS', NULL, 'GS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'HU-GS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'HU-HB', 'COUNTY', 'Hajdú-Bihar', 'HB', NULL, 'HB', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'HU-HB');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'HU-HE', 'COUNTY', 'Heves', 'HE', NULL, 'HE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'HU-HE');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'HU-HV', 'COUNTY_CITY', 'Hódmezővásárhely', 'HV', NULL, 'HV', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'HU-HV');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'HU-JN', 'COUNTY', 'Jász-Nagykun-Szolnok', 'JN', NULL, 'JN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'HU-JN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'HU-KV', 'COUNTY_CITY', 'Kaposvár', 'KV', NULL, 'KV', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'HU-KV');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'HU-KM', 'COUNTY_CITY', 'Kecskemét', 'KM', NULL, 'KM', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'HU-KM');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'HU-KE', 'COUNTY', 'Komárom-Esztergom', 'KE', NULL, 'KE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'HU-KE');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'HU-MI', 'COUNTY_CITY', 'Miskolc', 'MI', NULL, 'MI', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'HU-MI');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'HU-NK', 'COUNTY_CITY', 'Nagykanizsa', 'NK', NULL, 'NK', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'HU-NK');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'HU-NY', 'COUNTY_CITY', 'Nyíregyháza', 'NY', NULL, 'NY', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'HU-NY');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'HU-NO', 'COUNTY', 'Nógrád', 'NO', NULL, 'NO', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'HU-NO');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'HU-PE', 'COUNTY', 'Pest', 'PE', NULL, 'PE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'HU-PE');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'HU-PS', 'COUNTY_CITY', 'Pécs', 'PS', NULL, 'PS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'HU-PS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'HU-ST', 'COUNTY_CITY', 'Salgótarján', 'ST', NULL, 'ST', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'HU-ST');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'HU-SO', 'COUNTY', 'Somogy', 'SO', NULL, 'SO', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'HU-SO');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'HU-SN', 'COUNTY_CITY', 'Sopron', 'SN', NULL, 'SN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'HU-SN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'HU-SZ', 'COUNTY', 'Szabolcs-Szatmár-Bereg', 'SZ', NULL, 'SZ', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'HU-SZ');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'HU-SD', 'COUNTY_CITY', 'Szeged', 'SD', NULL, 'SD', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'HU-SD');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'HU-SS', 'COUNTY_CITY', 'Szekszárd', 'SS', NULL, 'SS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'HU-SS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'HU-SK', 'COUNTY_CITY', 'Szolnok', 'SK', NULL, 'SK', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'HU-SK');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'HU-SH', 'COUNTY_CITY', 'Szombathely', 'SH', NULL, 'SH', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'HU-SH');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'HU-SF', 'COUNTY_CITY', 'Székesfehérvár', 'SF', NULL, 'SF', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'HU-SF');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'HU-TB', 'COUNTY_CITY', 'Tatabánya', 'TB', NULL, 'TB', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'HU-TB');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'HU-TO', 'COUNTY', 'Tolna', 'TO', NULL, 'TO', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'HU-TO');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'HU-VA', 'COUNTY', 'Vas', 'VA', NULL, 'VA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'HU-VA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'HU-VM', 'COUNTY_CITY', 'Veszprém', 'VM', NULL, 'VM', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'HU-VM');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'HU-VE', 'COUNTY', 'Veszprém', 'VE', NULL, 'VE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'HU-VE');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'HU-ZA', 'COUNTY', 'Zala', 'ZA', NULL, 'ZA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'HU-ZA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'HU-ZE', 'COUNTY_CITY', 'Zalaegerszeg', 'ZE', NULL, 'ZE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'HU-ZE');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'HU-ER', 'COUNTY_CITY', 'Érd', 'ER', NULL, 'ER', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'HU-ER');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'HUN', 'HU-BA', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'HUN' AND geo_id_to = 'HU-BA' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'HUN', 'HU-BZ', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'HUN' AND geo_id_to = 'HU-BZ' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'HUN', 'HU-BU', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'HUN' AND geo_id_to = 'HU-BU' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'HUN', 'HU-BK', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'HUN' AND geo_id_to = 'HU-BK' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'HUN', 'HU-BE', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'HUN' AND geo_id_to = 'HU-BE' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'HUN', 'HU-BC', 'COUNTY_CITY'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'HUN' AND geo_id_to = 'HU-BC' AND geo_assoc_type_id = 'COUNTY_CITY');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'HUN', 'HU-CS', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'HUN' AND geo_id_to = 'HU-CS' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'HUN', 'HU-DE', 'COUNTY_CITY'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'HUN' AND geo_id_to = 'HU-DE' AND geo_assoc_type_id = 'COUNTY_CITY');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'HUN', 'HU-DU', 'COUNTY_CITY'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'HUN' AND geo_id_to = 'HU-DU' AND geo_assoc_type_id = 'COUNTY_CITY');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'HUN', 'HU-EG', 'COUNTY_CITY'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'HUN' AND geo_id_to = 'HU-EG' AND geo_assoc_type_id = 'COUNTY_CITY');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'HUN', 'HU-FE', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'HUN' AND geo_id_to = 'HU-FE' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'HUN', 'HU-GY', 'COUNTY_CITY'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'HUN' AND geo_id_to = 'HU-GY' AND geo_assoc_type_id = 'COUNTY_CITY');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'HUN', 'HU-GS', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'HUN' AND geo_id_to = 'HU-GS' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'HUN', 'HU-HB', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'HUN' AND geo_id_to = 'HU-HB' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'HUN', 'HU-HE', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'HUN' AND geo_id_to = 'HU-HE' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'HUN', 'HU-HV', 'COUNTY_CITY'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'HUN' AND geo_id_to = 'HU-HV' AND geo_assoc_type_id = 'COUNTY_CITY');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'HUN', 'HU-JN', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'HUN' AND geo_id_to = 'HU-JN' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'HUN', 'HU-KV', 'COUNTY_CITY'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'HUN' AND geo_id_to = 'HU-KV' AND geo_assoc_type_id = 'COUNTY_CITY');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'HUN', 'HU-KM', 'COUNTY_CITY'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'HUN' AND geo_id_to = 'HU-KM' AND geo_assoc_type_id = 'COUNTY_CITY');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'HUN', 'HU-KE', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'HUN' AND geo_id_to = 'HU-KE' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'HUN', 'HU-MI', 'COUNTY_CITY'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'HUN' AND geo_id_to = 'HU-MI' AND geo_assoc_type_id = 'COUNTY_CITY');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'HUN', 'HU-NK', 'COUNTY_CITY'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'HUN' AND geo_id_to = 'HU-NK' AND geo_assoc_type_id = 'COUNTY_CITY');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'HUN', 'HU-NY', 'COUNTY_CITY'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'HUN' AND geo_id_to = 'HU-NY' AND geo_assoc_type_id = 'COUNTY_CITY');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'HUN', 'HU-NO', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'HUN' AND geo_id_to = 'HU-NO' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'HUN', 'HU-PE', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'HUN' AND geo_id_to = 'HU-PE' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'HUN', 'HU-PS', 'COUNTY_CITY'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'HUN' AND geo_id_to = 'HU-PS' AND geo_assoc_type_id = 'COUNTY_CITY');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'HUN', 'HU-ST', 'COUNTY_CITY'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'HUN' AND geo_id_to = 'HU-ST' AND geo_assoc_type_id = 'COUNTY_CITY');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'HUN', 'HU-SO', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'HUN' AND geo_id_to = 'HU-SO' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'HUN', 'HU-SN', 'COUNTY_CITY'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'HUN' AND geo_id_to = 'HU-SN' AND geo_assoc_type_id = 'COUNTY_CITY');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'HUN', 'HU-SZ', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'HUN' AND geo_id_to = 'HU-SZ' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'HUN', 'HU-SD', 'COUNTY_CITY'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'HUN' AND geo_id_to = 'HU-SD' AND geo_assoc_type_id = 'COUNTY_CITY');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'HUN', 'HU-SS', 'COUNTY_CITY'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'HUN' AND geo_id_to = 'HU-SS' AND geo_assoc_type_id = 'COUNTY_CITY');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'HUN', 'HU-SK', 'COUNTY_CITY'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'HUN' AND geo_id_to = 'HU-SK' AND geo_assoc_type_id = 'COUNTY_CITY');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'HUN', 'HU-SH', 'COUNTY_CITY'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'HUN' AND geo_id_to = 'HU-SH' AND geo_assoc_type_id = 'COUNTY_CITY');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'HUN', 'HU-SF', 'COUNTY_CITY'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'HUN' AND geo_id_to = 'HU-SF' AND geo_assoc_type_id = 'COUNTY_CITY');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'HUN', 'HU-TB', 'COUNTY_CITY'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'HUN' AND geo_id_to = 'HU-TB' AND geo_assoc_type_id = 'COUNTY_CITY');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'HUN', 'HU-TO', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'HUN' AND geo_id_to = 'HU-TO' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'HUN', 'HU-VA', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'HUN' AND geo_id_to = 'HU-VA' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'HUN', 'HU-VM', 'COUNTY_CITY'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'HUN' AND geo_id_to = 'HU-VM' AND geo_assoc_type_id = 'COUNTY_CITY');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'HUN', 'HU-VE', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'HUN' AND geo_id_to = 'HU-VE' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'HUN', 'HU-ZA', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'HUN' AND geo_id_to = 'HU-ZA' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'HUN', 'HU-ZE', 'COUNTY_CITY'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'HUN' AND geo_id_to = 'HU-ZE' AND geo_assoc_type_id = 'COUNTY_CITY');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'HUN', 'HU-ER', 'COUNTY_CITY'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'HUN' AND geo_id_to = 'HU-ER' AND geo_assoc_type_id = 'COUNTY_CITY');
