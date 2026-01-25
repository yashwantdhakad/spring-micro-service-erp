INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-AN', 'REGION', 'Andalucía', 'AN', NULL, 'AN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-AN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-AR', 'REGION', 'Aragón', 'AR', NULL, 'AR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-AR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-AS', 'REGION', 'Oviedo', 'O', NULL, 'O', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-AS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-CN', 'REGION', 'Canarias', 'CN', NULL, 'CN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-CN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-CAN', 'REGION', 'Cantabria', 'S', NULL, 'S', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-CAN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-CM', 'REGION', 'Castilla-La Mancha', 'CM', NULL, 'CM', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-CM');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-CL', 'REGION', 'Castilla y León', 'CL', NULL, 'CL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-CL');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-CT', 'REGION', 'Cataluña', 'CT', NULL, 'CT', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-CT');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-EX', 'REGION', 'Extremadura', 'EX', NULL, 'EX', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-EX');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-GA', 'REGION', 'Galicia', 'GA', NULL, 'GA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-GA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-IB', 'REGION', 'Islas Baleares', 'IB', NULL, 'IB', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-IB');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-LR', 'REGION', 'La Rioja', 'LO', NULL, 'LO', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-LR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-MAD', 'REGION', 'Madrid', 'M', NULL, 'M', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-MAD');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-MUR', 'REGION', 'Región de Murcia', 'MU', NULL, 'MU', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-MUR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-NAV', 'REGION', 'Navarra', 'NA', NULL, 'NA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-NAV');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-VC', 'REGION', 'Comunidad Valenciana', 'VC', NULL, 'VC', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-VC');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-PV', 'REGION', 'País Vasco', 'PV', NULL, 'PV', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-PV');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-VI', 'PROVINCE', 'Álava', 'VI', NULL, 'VI', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-VI');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-AB', 'PROVINCE', 'Albacete', 'AB', NULL, 'AB', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-AB');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-A', 'PROVINCE', 'Alicante', 'A', NULL, 'A', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-A');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-AL', 'PROVINCE', 'Almería', 'AL', NULL, 'AL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-AL');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-O', 'PROVINCE', 'Asturias', 'O', NULL, 'O', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-O');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-AV', 'PROVINCE', 'Ávila', 'AV', NULL, 'AV', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-AV');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-BA', 'PROVINCE', 'Badajoz', 'BA', NULL, 'BA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-BA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-PM', 'PROVINCE', 'Islas Baleares', 'PM', NULL, 'PM', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-PM');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-B', 'PROVINCE', 'Barcelona', 'B', NULL, 'B', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-B');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-BU', 'PROVINCE', 'Burgos', 'BU', NULL, 'BU', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-BU');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-CC', 'PROVINCE', 'Cáceres', 'CC', NULL, 'CC', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-CC');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-CA', 'PROVINCE', 'Cádiz', 'CA', NULL, 'CA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-CA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-S', 'PROVINCE', 'Cantabria', 'S', NULL, 'S', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-S');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-CS', 'PROVINCE', 'Castellón', 'CS', NULL, 'CS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-CS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-CE', 'PROVINCE', 'Ceuta', 'CE', NULL, 'CE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-CE');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-CR', 'PROVINCE', 'Ciudad Real', 'CR', NULL, 'CR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-CR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-CO', 'PROVINCE', 'Córdoba', 'CO', NULL, 'CO', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-CO');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-CU', 'PROVINCE', 'Cuenca', 'CU', NULL, 'CU', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-CU');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-GI', 'PROVINCE', 'Gerona', 'GI', NULL, 'GI', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-GI');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-GR', 'PROVINCE', 'Granada', 'GR', NULL, 'GR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-GR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-GU', 'PROVINCE', 'Guadalajara', 'GU', NULL, 'GU', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-GU');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-SS', 'PROVINCE', 'Guipúzcoa', 'SS', NULL, 'SS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-SS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-H', 'PROVINCE', 'Huelva', 'H', NULL, 'H', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-H');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-HU', 'PROVINCE', 'Huesca', 'HU', NULL, 'HU', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-HU');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-J', 'PROVINCE', 'Jaén', 'J', NULL, 'J', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-J');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-C', 'PROVINCE', 'La Coruña', 'C', NULL, 'C', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-C');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-LO', 'PROVINCE', 'Logroño', 'LO', NULL, 'LO', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-LO');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-GC', 'PROVINCE', 'Las Palmas', 'GC', NULL, 'GC', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-GC');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-LE', 'PROVINCE', 'León', 'LE', NULL, 'LE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-LE');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-L', 'PROVINCE', 'Lérida', 'L', NULL, 'L', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-L');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-LU', 'PROVINCE', 'Lugo', 'LU', NULL, 'LU', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-LU');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-M', 'PROVINCE', 'Madrid', 'M', NULL, 'M', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-M');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-MA', 'PROVINCE', 'Málaga', 'MA', NULL, 'MA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-MA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-ML', 'PROVINCE', 'Melilla', 'ML', NULL, 'ML', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-ML');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-MU', 'PROVINCE', 'Murcia', 'MU', NULL, 'MU', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-MU');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-NA', 'PROVINCE', 'Navarra', 'NA', NULL, 'NA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-NA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-OR', 'PROVINCE', 'Orense', 'OR', NULL, 'OR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-OR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-P', 'PROVINCE', 'Palencia', 'P', NULL, 'P', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-P');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-PO', 'PROVINCE', 'Pontevedra', 'PO', NULL, 'PO', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-PO');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-SA', 'PROVINCE', 'Salamanca', 'SA', NULL, 'SA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-SA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-TF', 'PROVINCE', 'Santa Cruz de Tenerife', 'TF', NULL, 'TF', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-TF');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-SG', 'PROVINCE', 'Segovia', 'SG', NULL, 'SG', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-SG');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-SE', 'PROVINCE', 'Sevilla', 'SE', NULL, 'SE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-SE');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-SO', 'PROVINCE', 'Soria', 'SO', NULL, 'SO', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-SO');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-T', 'PROVINCE', 'Tarragona', 'T', NULL, 'T', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-T');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-TE', 'PROVINCE', 'Teruel', 'TE', NULL, 'TE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-TE');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-TO', 'PROVINCE', 'Toledo', 'TO', NULL, 'TO', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-TO');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-V', 'PROVINCE', 'Valencia', 'V', NULL, 'V', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-V');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-VA', 'PROVINCE', 'Valladolid', 'VA', NULL, 'VA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-VA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-BI', 'PROVINCE', 'Vizcaya', 'BI', NULL, 'BI', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-BI');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-ZA', 'PROVINCE', 'Zamora', 'ZA', NULL, 'ZA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-ZA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ES-Z', 'PROVINCE', 'Zaragoza', 'Z', NULL, 'Z', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ES-Z');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ES-PV', 'ES-VI', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ES-PV' AND geo_id_to = 'ES-VI' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ES-PV', 'ES-SS', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ES-PV' AND geo_id_to = 'ES-SS' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ES-PV', 'ES-BI', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ES-PV' AND geo_id_to = 'ES-BI' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ES-CM', 'ES-AB', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ES-CM' AND geo_id_to = 'ES-AB' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ES-CM', 'ES-GU', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ES-CM' AND geo_id_to = 'ES-GU' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ES-CM', 'ES-CU', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ES-CM' AND geo_id_to = 'ES-CU' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ES-CM', 'ES-TO', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ES-CM' AND geo_id_to = 'ES-TO' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ES-VC', 'ES-A', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ES-VC' AND geo_id_to = 'ES-A' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ES-VC', 'ES-CS', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ES-VC' AND geo_id_to = 'ES-CS' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ES-VC', 'ES-V', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ES-VC' AND geo_id_to = 'ES-V' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ES-AN', 'ES-AL', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ES-AN' AND geo_id_to = 'ES-AL' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ES-AN', 'ES-CA', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ES-AN' AND geo_id_to = 'ES-CA' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ES-AN', 'ES-GR', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ES-AN' AND geo_id_to = 'ES-GR' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ES-AN', 'ES-MA', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ES-AN' AND geo_id_to = 'ES-MA' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ES-AN', 'ES-CO', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ES-AN' AND geo_id_to = 'ES-CO' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ES-AN', 'ES-H', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ES-AN' AND geo_id_to = 'ES-H' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ES-AN', 'ES-SE', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ES-AN' AND geo_id_to = 'ES-SE' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ES-AN', 'ES-J', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ES-AN' AND geo_id_to = 'ES-J' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ES-AS', 'ES-O', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ES-AS' AND geo_id_to = 'ES-O' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ES-CL', 'ES-AV', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ES-CL' AND geo_id_to = 'ES-AV' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ES-CL', 'ES-CR', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ES-CL' AND geo_id_to = 'ES-CR' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ES-CL', 'ES-LE', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ES-CL' AND geo_id_to = 'ES-LE' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ES-CL', 'ES-SA', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ES-CL' AND geo_id_to = 'ES-SA' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ES-CL', 'ES-SO', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ES-CL' AND geo_id_to = 'ES-SO' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ES-CL', 'ES-SG', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ES-CL' AND geo_id_to = 'ES-SG' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ES-CL', 'ES-ZA', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ES-CL' AND geo_id_to = 'ES-ZA' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ES-CL', 'ES-VA', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ES-CL' AND geo_id_to = 'ES-VA' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ES-CL', 'ES-P', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ES-CL' AND geo_id_to = 'ES-P' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ES-CL', 'ES-BU', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ES-CL' AND geo_id_to = 'ES-BU' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ES-EX', 'ES-BA', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ES-EX' AND geo_id_to = 'ES-BA' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ES-EX', 'ES-CC', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ES-EX' AND geo_id_to = 'ES-CC' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ES-IB', 'ES-PM', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ES-IB' AND geo_id_to = 'ES-PM' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ES-CT', 'ES-B', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ES-CT' AND geo_id_to = 'ES-B' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ES-CT', 'ES-GI', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ES-CT' AND geo_id_to = 'ES-GI' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ES-CT', 'ES-L', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ES-CT' AND geo_id_to = 'ES-L' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ES-CT', 'ES-T', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ES-CT' AND geo_id_to = 'ES-T' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ES-CAN', 'ES-S', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ES-CAN' AND geo_id_to = 'ES-S' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ESP', 'ES-CE', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ESP' AND geo_id_to = 'ES-CE' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ESP', 'ES-ML', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ESP' AND geo_id_to = 'ES-ML' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ES-AR', 'ES-HU', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ES-AR' AND geo_id_to = 'ES-HU' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ES-AR', 'ES-TE', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ES-AR' AND geo_id_to = 'ES-TE' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ES-AR', 'ES-Z', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ES-AR' AND geo_id_to = 'ES-Z' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ES-GA', 'ES-C', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ES-GA' AND geo_id_to = 'ES-C' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ES-GA', 'ES-LU', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ES-GA' AND geo_id_to = 'ES-LU' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ES-GA', 'ES-OR', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ES-GA' AND geo_id_to = 'ES-OR' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ES-GA', 'ES-PO', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ES-GA' AND geo_id_to = 'ES-PO' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ES-LR', 'ES-LO', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ES-LR' AND geo_id_to = 'ES-LO' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ES-CN', 'ES-GC', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ES-CN' AND geo_id_to = 'ES-GC' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ES-CN', 'ES-TF', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ES-CN' AND geo_id_to = 'ES-TF' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ES-MAD', 'ES-M', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ES-MAD' AND geo_id_to = 'ES-M' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ES-MUR', 'ES-MU', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ES-MUR' AND geo_id_to = 'ES-MU' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ES-NAV', 'ES-NA', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ES-NAV' AND geo_id_to = 'ES-NA' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ESP', 'ES-AN', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ESP' AND geo_id_to = 'ES-AN' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ESP', 'ES-AR', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ESP' AND geo_id_to = 'ES-AR' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ESP', 'ES-AS', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ESP' AND geo_id_to = 'ES-AS' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ESP', 'ES-CN', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ESP' AND geo_id_to = 'ES-CN' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ESP', 'ES-CAN', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ESP' AND geo_id_to = 'ES-CAN' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ESP', 'ES-CM', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ESP' AND geo_id_to = 'ES-CM' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ESP', 'ES-CL', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ESP' AND geo_id_to = 'ES-CL' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ESP', 'ES-CT', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ESP' AND geo_id_to = 'ES-CT' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ESP', 'ES-EX', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ESP' AND geo_id_to = 'ES-EX' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ESP', 'ES-GA', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ESP' AND geo_id_to = 'ES-GA' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ESP', 'ES-IB', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ESP' AND geo_id_to = 'ES-IB' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ESP', 'ES-LR', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ESP' AND geo_id_to = 'ES-LR' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ESP', 'ES-MAD', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ESP' AND geo_id_to = 'ES-MAD' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ESP', 'ES-MUR', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ESP' AND geo_id_to = 'ES-MUR' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ESP', 'ES-NAV', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ESP' AND geo_id_to = 'ES-NAV' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ESP', 'ES-VC', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ESP' AND geo_id_to = 'ES-VC' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ESP', 'ES-PV', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ESP' AND geo_id_to = 'ES-PV' AND geo_assoc_type_id = 'REGIONS');
