INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BR-AC', 'STATE', 'Acre', 'AC', NULL, 'AC', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BR-AC');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BR-AL', 'STATE', 'Alagoas', 'AL', NULL, 'AL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BR-AL');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BR-AM', 'STATE', 'Amazonas', 'AM', NULL, 'AM', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BR-AM');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BR-AP', 'STATE', 'Amapá', 'AP', NULL, 'AP', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BR-AP');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BR-BA', 'STATE', 'Bahia', 'BA', NULL, 'BA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BR-BA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BR-CE', 'STATE', 'Ceará', 'CE', NULL, 'CE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BR-CE');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BR-DF', 'STATE', 'Distrito Federal', 'DF', NULL, 'DF', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BR-DF');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BR-ES', 'STATE', 'Espírito Santo', 'ES', NULL, 'ES', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BR-ES');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BR-GO', 'STATE', 'Goiás', 'GO', NULL, 'GO', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BR-GO');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BR-MA', 'STATE', 'Maranhão', 'MA', NULL, 'MA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BR-MA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BR-MG', 'STATE', 'Minas Gerais', 'MG', NULL, 'MG', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BR-MG');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BR-MS', 'STATE', 'Mato Grosso do Sul', 'MS', NULL, 'MS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BR-MS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BR-MT', 'STATE', 'Mato Grosso', 'MT', NULL, 'MT', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BR-MT');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BR-PA', 'STATE', 'Pará', 'PA', NULL, 'PA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BR-PA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BR-PB', 'STATE', 'Paraíba', 'PB', NULL, 'PB', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BR-PB');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BR-PE', 'STATE', 'Pernambuco', 'PE', NULL, 'PE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BR-PE');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BR-PI', 'STATE', 'Piauí', 'PI', NULL, 'PI', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BR-PI');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BR-PR', 'STATE', 'Paraná', 'PR', NULL, 'PR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BR-PR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BR-RJ', 'STATE', 'Rio de Janeiro', 'RJ', NULL, 'RJ', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BR-RJ');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BR-RN', 'STATE', 'Rio Grande do Norte', 'RN', NULL, 'RN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BR-RN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BR-RO', 'STATE', 'Rondônia', 'RO', NULL, 'RO', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BR-RO');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BR-RR', 'STATE', 'Roraima', 'RR', NULL, 'RR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BR-RR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BR-RS', 'STATE', 'Rio Grande do Sul', 'RS', NULL, 'RS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BR-RS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BR-SC', 'STATE', 'Santa Catarina', 'SC', NULL, 'SC', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BR-SC');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BR-SE', 'STATE', 'Sergipe', 'SE', NULL, 'SE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BR-SE');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BR-SP', 'STATE', 'São Paulo', 'SP', NULL, 'SP', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BR-SP');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BR-TO', 'STATE', 'Tocantins', 'TO', NULL, 'TO', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BR-TO');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'BRA', 'BR-AL', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'BRA' AND geo_id_to = 'BR-AL' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'BRA', 'BR-AM', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'BRA' AND geo_id_to = 'BR-AM' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'BRA', 'BR-AP', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'BRA' AND geo_id_to = 'BR-AP' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'BRA', 'BR-BA', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'BRA' AND geo_id_to = 'BR-BA' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'BRA', 'BR-CE', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'BRA' AND geo_id_to = 'BR-CE' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'BRA', 'BR-DF', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'BRA' AND geo_id_to = 'BR-DF' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'BRA', 'BR-ES', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'BRA' AND geo_id_to = 'BR-ES' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'BRA', 'BR-GO', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'BRA' AND geo_id_to = 'BR-GO' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'BRA', 'BR-MA', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'BRA' AND geo_id_to = 'BR-MA' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'BRA', 'BR-MG', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'BRA' AND geo_id_to = 'BR-MG' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'BRA', 'BR-MS', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'BRA' AND geo_id_to = 'BR-MS' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'BRA', 'BR-MT', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'BRA' AND geo_id_to = 'BR-MT' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'BRA', 'BR-PA', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'BRA' AND geo_id_to = 'BR-PA' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'BRA', 'BR-PB', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'BRA' AND geo_id_to = 'BR-PB' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'BRA', 'BR-PE', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'BRA' AND geo_id_to = 'BR-PE' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'BRA', 'BR-PI', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'BRA' AND geo_id_to = 'BR-PI' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'BRA', 'BR-PR', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'BRA' AND geo_id_to = 'BR-PR' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'BRA', 'BR-RJ', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'BRA' AND geo_id_to = 'BR-RJ' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'BRA', 'BR-RN', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'BRA' AND geo_id_to = 'BR-RN' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'BRA', 'BR-RO', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'BRA' AND geo_id_to = 'BR-RO' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'BRA', 'BR-RR', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'BRA' AND geo_id_to = 'BR-RR' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'BRA', 'BR-RS', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'BRA' AND geo_id_to = 'BR-RS' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'BRA', 'BR-SC', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'BRA' AND geo_id_to = 'BR-SC' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'BRA', 'BR-SE', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'BRA' AND geo_id_to = 'BR-SE' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'BRA', 'BR-SP', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'BRA' AND geo_id_to = 'BR-SP' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'BRA', 'BR-TO', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'BRA' AND geo_id_to = 'BR-TO' AND geo_assoc_type_id = 'REGIONS');
