INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'EC-A', 'PROVINCE', 'Azuay', 'A', NULL, 'AZ', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'EC-A');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'EC-B', 'PROVINCE', 'Bolívar', 'B', NULL, 'BO', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'EC-B');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'EC-C', 'PROVINCE', 'Carchi', 'C', NULL, 'CR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'EC-C');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'EC-F', 'PROVINCE', 'Cañar', 'F', NULL, 'CN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'EC-F');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'EC-H', 'PROVINCE', 'Chimborazo', 'H', NULL, 'CB', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'EC-H');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'EC-X', 'PROVINCE', 'Cotopaxi', 'X', NULL, 'CT', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'EC-X');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'EC-O', 'PROVINCE', 'El Oro', 'O', NULL, 'EO', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'EC-O');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'EC-E', 'PROVINCE', 'Esmeraldas', 'E', NULL, 'ES', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'EC-E');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'EC-W', 'PROVINCE', 'Galápagos', 'W', NULL, 'GA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'EC-W');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'EC-G', 'PROVINCE', 'Guayas', 'G', NULL, 'GY', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'EC-G');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'EC-I', 'PROVINCE', 'Imbabura', 'I', NULL, 'IM', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'EC-I');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'EC-L', 'PROVINCE', 'Loja', 'L', NULL, 'LJ', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'EC-L');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'EC-R', 'PROVINCE', 'Los Ríos', 'R', NULL, 'LR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'EC-R');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'EC-M', 'PROVINCE', 'Manabí', 'M', NULL, 'MN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'EC-M');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'EC-S', 'PROVINCE', 'Morona Santiago', 'S', NULL, 'MS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'EC-S');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'EC-N', 'PROVINCE', 'Napo', 'N', NULL, 'NA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'EC-N');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'EC-D', 'PROVINCE', 'Orellana', 'D', NULL, 'OR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'EC-D');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'EC-Y', 'PROVINCE', 'Pastaza', 'Y', NULL, 'PA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'EC-Y');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'EC-P', 'PROVINCE', 'Pichincha', 'P', NULL, 'PC', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'EC-P');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'EC-SE', 'PROVINCE', 'Santa Elena', 'SE', NULL, 'SE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'EC-SE');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'EC-SD', 'PROVINCE', 'Santo Domingo de los Tsáchilas', 'SD', NULL, 'SD', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'EC-SD');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'EC-U', 'PROVINCE', 'Sucumbíos', 'U', NULL, 'SU', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'EC-U');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'EC-T', 'PROVINCE', 'Tungurahua', 'T', NULL, 'TU', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'EC-T');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'EC-Z', 'PROVINCE', 'Zamora Chinchipe', 'Z', NULL, 'ZC', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'EC-Z');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ECU', 'EC-A', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ECU' AND geo_id_to = 'EC-A' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ECU', 'EC-B', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ECU' AND geo_id_to = 'EC-B' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ECU', 'EC-C', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ECU' AND geo_id_to = 'EC-C' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ECU', 'EC-F', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ECU' AND geo_id_to = 'EC-F' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ECU', 'EC-H', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ECU' AND geo_id_to = 'EC-H' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ECU', 'EC-X', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ECU' AND geo_id_to = 'EC-X' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ECU', 'EC-O', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ECU' AND geo_id_to = 'EC-O' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ECU', 'EC-E', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ECU' AND geo_id_to = 'EC-E' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ECU', 'EC-W', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ECU' AND geo_id_to = 'EC-W' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ECU', 'EC-G', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ECU' AND geo_id_to = 'EC-G' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ECU', 'EC-I', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ECU' AND geo_id_to = 'EC-I' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ECU', 'EC-L', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ECU' AND geo_id_to = 'EC-L' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ECU', 'EC-R', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ECU' AND geo_id_to = 'EC-R' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ECU', 'EC-M', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ECU' AND geo_id_to = 'EC-M' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ECU', 'EC-S', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ECU' AND geo_id_to = 'EC-S' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ECU', 'EC-N', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ECU' AND geo_id_to = 'EC-N' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ECU', 'EC-D', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ECU' AND geo_id_to = 'EC-D' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ECU', 'EC-Y', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ECU' AND geo_id_to = 'EC-Y' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ECU', 'EC-P', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ECU' AND geo_id_to = 'EC-P' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ECU', 'EC-SE', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ECU' AND geo_id_to = 'EC-SE' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ECU', 'EC-SD', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ECU' AND geo_id_to = 'EC-SD' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ECU', 'EC-U', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ECU' AND geo_id_to = 'EC-U' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ECU', 'EC-T', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ECU' AND geo_id_to = 'EC-T' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ECU', 'EC-Z', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ECU' AND geo_id_to = 'EC-Z' AND geo_assoc_type_id = 'REGIONS');
