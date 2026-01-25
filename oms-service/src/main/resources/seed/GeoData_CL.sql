INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CL-AN', 'STATE', 'Antofagasta', 'CL-02', NULL, 'CL-02', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CL-AN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CL-AR', 'STATE', 'Araucanía', 'CL-09', NULL, 'CL-09', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CL-AR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CL-AP', 'STATE', 'Arica y Parinacota', 'CL-15', NULL, 'CL-15', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CL-AP');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CL-AT', 'STATE', 'Atacama', 'CL-03', NULL, 'CL-03', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CL-AT');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CL-AI', 'STATE', 'Aysén', 'CL-11', NULL, 'CL-11', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CL-AI');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CL-BI', 'STATE', 'Biobío', 'CL-08', NULL, 'CL-08', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CL-BI');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CL-CO', 'STATE', 'Coquimbo', 'CL-04', NULL, 'CL-04', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CL-CO');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CL-LI', 'STATE', 'Libertador General Bernardo O''Higgins', 'CL-06', NULL, 'CL-06', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CL-LI');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CL-LL', 'STATE', 'Los Lagos', 'CL-10', NULL, 'CL-10', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CL-LL');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CL-LR', 'STATE', 'Los Ríos', 'CL-14', NULL, 'CL-14', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CL-LR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CL-MA', 'STATE', 'Magallanes', 'CL-12', NULL, 'CL-12', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CL-MA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CL-ML', 'STATE', 'Maule', 'CL-07', NULL, 'CL-07', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CL-ML');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CL-RM', 'STATE', 'Región Metropolitana de Santiago', 'CL-RM', NULL, 'CL-RM', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CL-RM');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CL-TA', 'STATE', 'Tarapacá', 'CL-01', NULL, 'CL-01', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CL-TA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CL-VS', 'STATE', 'Valparaíso', 'CL-05', NULL, 'CL-05', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CL-VS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHL', 'CL-AN', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHL' AND geo_id_to = 'CL-AN' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHL', 'CL-AR', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHL' AND geo_id_to = 'CL-AR' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHL', 'CL-AP', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHL' AND geo_id_to = 'CL-AP' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHL', 'CL-AT', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHL' AND geo_id_to = 'CL-AT' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHL', 'CL-AI', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHL' AND geo_id_to = 'CL-AI' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHL', 'CL-BI', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHL' AND geo_id_to = 'CL-BI' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHL', 'CL-CO', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHL' AND geo_id_to = 'CL-CO' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHL', 'CL-LI', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHL' AND geo_id_to = 'CL-LI' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHL', 'CL-LL', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHL' AND geo_id_to = 'CL-LL' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHL', 'CL-LR', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHL' AND geo_id_to = 'CL-LR' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHL', 'CL-MA', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHL' AND geo_id_to = 'CL-MA' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHL', 'CL-ML', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHL' AND geo_id_to = 'CL-ML' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHL', 'CL-RM', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHL' AND geo_id_to = 'CL-RM' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHL', 'CL-TA', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHL' AND geo_id_to = 'CL-TA' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHL', 'CL-VS', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHL' AND geo_id_to = 'CL-VS' AND geo_assoc_type_id = 'REGIONS');
