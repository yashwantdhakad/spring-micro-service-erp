INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CO-AMA', 'STATE', 'Amazonas', 'AMA', NULL, 'AMA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CO-AMA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CO-ANT', 'STATE', 'Antioquia', 'ANT', NULL, 'ANT', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CO-ANT');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CO-ARA', 'STATE', 'Arauca', 'ARA', NULL, 'ARA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CO-ARA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CO-ATL', 'STATE', 'Atlántico', 'ATL', NULL, 'ATL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CO-ATL');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CO-BOL', 'STATE', 'Bolívar', 'BOL', NULL, 'BOL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CO-BOL');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CO-BOY', 'STATE', 'Boyacá', 'BOY', NULL, 'BOY', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CO-BOY');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CO-CAL', 'STATE', 'Caldas', 'CAL', NULL, 'CAL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CO-CAL');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CO-CAQ', 'STATE', 'Caquetá', 'CAQ', NULL, 'CAQ', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CO-CAQ');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CO-CAS', 'STATE', 'Casanare', 'CAS', NULL, 'CAS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CO-CAS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CO-CAU', 'STATE', 'Cauca', 'CAU', NULL, 'CAU', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CO-CAU');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CO-CES', 'STATE', 'Cesar', 'CES', NULL, 'CES', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CO-CES');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CO-CHO', 'STATE', 'Chocó', 'CHO', NULL, 'CHO', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CO-CHO');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CO-COR', 'STATE', 'Córdoba', 'COR', NULL, 'COR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CO-COR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CO-CUN', 'STATE', 'Cundinamarca', 'CUN', NULL, 'CUN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CO-CUN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CO-DC', 'STATE', 'Bogotá D.C.', 'DC', NULL, 'DC', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CO-DC');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CO-GUA', 'STATE', 'Guainía', 'GUA', NULL, 'GUA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CO-GUA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CO-GUV', 'STATE', 'Guaviare', 'GUV', NULL, 'GUV', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CO-GUV');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CO-HUI', 'STATE', 'Huila', 'HUI', NULL, 'HUI', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CO-HUI');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CO-LAG', 'STATE', 'La Guajira', 'LAG', NULL, 'LAG', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CO-LAG');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CO-MAG', 'STATE', 'Magdalena', 'MAG', NULL, 'MAG', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CO-MAG');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CO-MET', 'STATE', 'Meta', 'MET', NULL, 'MET', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CO-MET');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CO-NAR', 'STATE', 'Nariño', 'NAR', NULL, 'NAR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CO-NAR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CO-NSA', 'STATE', 'Norte de Santander', 'NSA', NULL, 'NSA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CO-NSA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CO-PUT', 'STATE', 'Putumayo', 'PUT', NULL, 'PUT', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CO-PUT');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CO-QUI', 'STATE', 'Quindío', 'QUI', NULL, 'QUI', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CO-QUI');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CO-RIS', 'STATE', 'Risaralda', 'RIS', NULL, 'RIS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CO-RIS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CO-SAN', 'STATE', 'Santander', 'SAN', NULL, 'SAN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CO-SAN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CO-SAP', 'STATE', 'San Andrés y Providencia', 'SAP', NULL, 'SAP', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CO-SAP');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CO-SUC', 'STATE', 'Sucre', 'SUC', NULL, 'SUC', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CO-SUC');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CO-TOL', 'STATE', 'Tolima', 'TOL', NULL, 'TOL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CO-TOL');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CO-VAC', 'STATE', 'Valle del Cauca', 'VAC', NULL, 'VAC', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CO-VAC');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CO-VAU', 'STATE', 'Vaupés', 'VAU', NULL, 'VAU', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CO-VAU');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CO-VID', 'STATE', 'Vichada', 'VID', NULL, 'VID', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CO-VID');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'COL', 'CO-AMA', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'COL' AND geo_id_to = 'CO-AMA' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'COL', 'CO-ANT', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'COL' AND geo_id_to = 'CO-ANT' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'COL', 'CO-ARA', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'COL' AND geo_id_to = 'CO-ARA' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'COL', 'CO-ATL', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'COL' AND geo_id_to = 'CO-ATL' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'COL', 'CO-BOL', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'COL' AND geo_id_to = 'CO-BOL' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'COL', 'CO-BOY', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'COL' AND geo_id_to = 'CO-BOY' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'COL', 'CO-CAL', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'COL' AND geo_id_to = 'CO-CAL' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'COL', 'CO-CAQ', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'COL' AND geo_id_to = 'CO-CAQ' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'COL', 'CO-CAS', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'COL' AND geo_id_to = 'CO-CAS' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'COL', 'CO-CAU', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'COL' AND geo_id_to = 'CO-CAU' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'COL', 'CO-CES', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'COL' AND geo_id_to = 'CO-CES' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'COL', 'CO-CHO', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'COL' AND geo_id_to = 'CO-CHO' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'COL', 'CO-COR', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'COL' AND geo_id_to = 'CO-COR' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'COL', 'CO-CUN', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'COL' AND geo_id_to = 'CO-CUN' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'COL', 'CO-DC', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'COL' AND geo_id_to = 'CO-DC' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'COL', 'CO-GUA', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'COL' AND geo_id_to = 'CO-GUA' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'COL', 'CO-GUV', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'COL' AND geo_id_to = 'CO-GUV' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'COL', 'CO-HUI', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'COL' AND geo_id_to = 'CO-HUI' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'COL', 'CO-LAG', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'COL' AND geo_id_to = 'CO-LAG' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'COL', 'CO-MAG', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'COL' AND geo_id_to = 'CO-MAG' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'COL', 'CO-MET', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'COL' AND geo_id_to = 'CO-MET' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'COL', 'CO-NAR', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'COL' AND geo_id_to = 'CO-NAR' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'COL', 'CO-NSA', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'COL' AND geo_id_to = 'CO-NSA' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'COL', 'CO-PUT', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'COL' AND geo_id_to = 'CO-PUT' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'COL', 'CO-QUI', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'COL' AND geo_id_to = 'CO-QUI' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'COL', 'CO-RIS', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'COL' AND geo_id_to = 'CO-RIS' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'COL', 'CO-SAN', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'COL' AND geo_id_to = 'CO-SAN' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'COL', 'CO-SAP', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'COL' AND geo_id_to = 'CO-SAP' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'COL', 'CO-SUC', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'COL' AND geo_id_to = 'CO-SUC' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'COL', 'CO-TOL', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'COL' AND geo_id_to = 'CO-TOL' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'COL', 'CO-VAC', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'COL' AND geo_id_to = 'CO-VAC' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'COL', 'CO-VAU', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'COL' AND geo_id_to = 'CO-VAU' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'COL', 'CO-VID', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'COL' AND geo_id_to = 'CO-VID' AND geo_assoc_type_id = 'REGIONS');
