INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-AG', 'PROVINCE', 'Agrigento', 'AG', NULL, 'AG', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-AG');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-AL', 'PROVINCE', 'Alessandria', 'AL', NULL, 'AL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-AL');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-AN', 'PROVINCE', 'Ancona', 'AN', NULL, 'AN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-AN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-AO', 'PROVINCE', 'Aosta', 'AO', NULL, 'AO', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-AO');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-AQ', 'PROVINCE', 'L''Aquila', 'AQ', NULL, 'AQ', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-AQ');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-AR', 'PROVINCE', 'Arezzo', 'AR', NULL, 'AR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-AR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-AP', 'PROVINCE', 'Ascoli Piceno', 'AP', NULL, 'AP', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-AP');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-AT', 'PROVINCE', 'Asti', 'AT', NULL, 'AT', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-AT');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-AV', 'PROVINCE', 'Avellino', 'AV', NULL, 'AV', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-AV');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-BA', 'PROVINCE', 'Bari', 'BA', NULL, 'BA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-BA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-BT', 'PROVINCE', 'Barletta-Andria-Trani', 'BT', NULL, 'BT', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-BT');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-BL', 'PROVINCE', 'Belluno', 'BL', NULL, 'BL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-BL');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-BN', 'PROVINCE', 'Benevento', 'BN', NULL, 'BN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-BN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-BG', 'PROVINCE', 'Bergamo', 'BG', NULL, 'BG', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-BG');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-BI', 'PROVINCE', 'Biella', 'BI', NULL, 'BI', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-BI');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-BO', 'PROVINCE', 'Bologna', 'BO', NULL, 'BO', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-BO');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-BZ', 'PROVINCE', 'Bolzano', 'BZ', NULL, 'BZ', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-BZ');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-BS', 'PROVINCE', 'Brescia', 'BS', NULL, 'BS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-BS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-BR', 'PROVINCE', 'Brindisi', 'BR', NULL, 'BR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-BR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-CA', 'PROVINCE', 'Cagliari', 'CA', NULL, 'CA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-CA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-CL', 'PROVINCE', 'Caltanissetta', 'CL', NULL, 'CL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-CL');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-CB', 'PROVINCE', 'Campobasso', 'CB', NULL, 'CB', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-CB');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-CI', 'PROVINCE', 'Carbonia-Iglesias', 'CI', NULL, 'CI', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-CI');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-CE', 'PROVINCE', 'Caserta', 'CE', NULL, 'CE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-CE');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-CT', 'PROVINCE', 'Catania', 'CT', NULL, 'CT', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-CT');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-CZ', 'PROVINCE', 'Catanzaro', 'CZ', NULL, 'CZ', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-CZ');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-CH', 'PROVINCE', 'Chieti', 'CH', NULL, 'CH', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-CH');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-CO', 'PROVINCE', 'Como', 'CO', NULL, 'CO', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-CO');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-CS', 'PROVINCE', 'Cosenza', 'CS', NULL, 'CS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-CS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-CR', 'PROVINCE', 'Cremona', 'CR', NULL, 'CR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-CR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-KR', 'PROVINCE', 'Crotone', 'KR', NULL, 'KR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-KR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-CN', 'PROVINCE', 'Cuneo', 'CN', NULL, 'CN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-CN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-EN', 'PROVINCE', 'Enna', 'EN', NULL, 'EN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-EN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-FM', 'PROVINCE', 'Fermo', 'FM', NULL, 'FM', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-FM');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-FE', 'PROVINCE', 'Ferrara', 'FE', NULL, 'FE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-FE');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-FI', 'PROVINCE', 'Firenze', 'FI', NULL, 'FI', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-FI');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-FG', 'PROVINCE', 'Foggia', 'FG', NULL, 'FG', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-FG');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-FC', 'PROVINCE', 'Forli''-Cesena', 'FC', NULL, 'FC', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-FC');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-FR', 'PROVINCE', 'Frosinone', 'FR', NULL, 'FR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-FR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-GE', 'PROVINCE', 'Genova', 'GE', NULL, 'GE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-GE');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-GO', 'PROVINCE', 'Gorizia', 'GO', NULL, 'GO', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-GO');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-GR', 'PROVINCE', 'Grosseto', 'GR', NULL, 'GR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-GR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-IM', 'PROVINCE', 'Imperia', 'IM', NULL, 'IM', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-IM');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-IS', 'PROVINCE', 'Isernia', 'IS', NULL, 'IS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-IS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-LT', 'PROVINCE', 'Latina', 'LT', NULL, 'LT', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-LT');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-LE', 'PROVINCE', 'Lecce', 'LE', NULL, 'LE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-LE');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-LC', 'PROVINCE', 'Lecco', 'LC', NULL, 'LC', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-LC');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-LI', 'PROVINCE', 'Livorno', 'LI', NULL, 'LI', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-LI');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-LO', 'PROVINCE', 'Lodi', 'LO', NULL, 'LO', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-LO');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-LU', 'PROVINCE', 'Lucca', 'LU', NULL, 'LU', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-LU');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-MC', 'PROVINCE', 'Macerata', 'MC', NULL, 'MC', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-MC');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-MN', 'PROVINCE', 'Mantova', 'MN', NULL, 'MN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-MN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-MS', 'PROVINCE', 'Massa-Carrara', 'MS', NULL, 'MS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-MS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-MT', 'PROVINCE', 'Matera', 'MT', NULL, 'MT', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-MT');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-VS', 'PROVINCE', 'Medio Campidano', 'VS', NULL, 'VS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-VS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-ME', 'PROVINCE', 'Messina', 'ME', NULL, 'ME', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-ME');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-MI', 'PROVINCE', 'Milano', 'MI', NULL, 'MI', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-MI');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-MO', 'PROVINCE', 'Modena', 'MO', NULL, 'MO', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-MO');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-MB', 'PROVINCE', 'Monza e Brianza', 'MB', NULL, 'MB', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-MB');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-NA', 'PROVINCE', 'Napoli', 'NA', NULL, 'NA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-NA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-NO', 'PROVINCE', 'Novara', 'NO', NULL, 'NO', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-NO');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-NU', 'PROVINCE', 'Nuoro', 'NU', NULL, 'NU', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-NU');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-OG', 'PROVINCE', 'Ogliastra', 'OG', NULL, 'OG', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-OG');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-OT', 'PROVINCE', 'Olbia-Tempio', 'OT', NULL, 'OT', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-OT');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-OR', 'PROVINCE', 'Oristano', 'OR', NULL, 'OR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-OR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-PD', 'PROVINCE', 'Padova', 'PD', NULL, 'PD', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-PD');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-PA', 'PROVINCE', 'Palermo', 'PA', NULL, 'PA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-PA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-PR', 'PROVINCE', 'Parma', 'PR', NULL, 'PR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-PR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-PV', 'PROVINCE', 'Pavia', 'PV', NULL, 'PV', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-PV');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-PG', 'PROVINCE', 'Perugia', 'PG', NULL, 'PG', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-PG');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-PU', 'PROVINCE', 'Pesaro e Urbino', 'PU', NULL, 'PU', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-PU');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-PE', 'PROVINCE', 'Pescara', 'PE', NULL, 'PE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-PE');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-PC', 'PROVINCE', 'Piacenza', 'PC', NULL, 'PC', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-PC');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-PI', 'PROVINCE', 'Pisa', 'PI', NULL, 'PI', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-PI');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-PT', 'PROVINCE', 'Pistoia', 'PT', NULL, 'PT', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-PT');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-PN', 'PROVINCE', 'Pordenone', 'PN', NULL, 'PN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-PN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-PZ', 'PROVINCE', 'Potenza', 'PZ', NULL, 'PZ', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-PZ');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-PO', 'PROVINCE', 'Prato', 'PO', NULL, 'PO', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-PO');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-RG', 'PROVINCE', 'Ragusa', 'RG', NULL, 'RG', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-RG');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-RA', 'PROVINCE', 'Ravenna', 'RA', NULL, 'RA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-RA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-RC', 'PROVINCE', 'Reggio Calabria', 'RC', NULL, 'RC', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-RC');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-RE', 'PROVINCE', 'Reggio Emilia', 'RE', NULL, 'RE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-RE');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-RI', 'PROVINCE', 'Rieti', 'RI', NULL, 'RI', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-RI');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-RN', 'PROVINCE', 'Rimini', 'RN', NULL, 'RN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-RN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-RM', 'PROVINCE', 'Roma', 'RM', NULL, 'RM', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-RM');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-RO', 'PROVINCE', 'Rovigo', 'RO', NULL, 'RO', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-RO');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-SA', 'PROVINCE', 'Salerno', 'SA', NULL, 'SA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-SA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-SS', 'PROVINCE', 'Sassari', 'SS', NULL, 'SS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-SS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-SV', 'PROVINCE', 'Savona', 'SV', NULL, 'SV', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-SV');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-SI', 'PROVINCE', 'Siena', 'SI', NULL, 'SI', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-SI');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-SO', 'PROVINCE', 'Sondrio', 'SO', NULL, 'SO', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-SO');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-SP', 'PROVINCE', 'La Spezia', 'SP', NULL, 'SP', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-SP');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-SR', 'PROVINCE', 'Siracusa', 'SR', NULL, 'SR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-SR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-TA', 'PROVINCE', 'Taranto', 'TA', NULL, 'TA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-TA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-TE', 'PROVINCE', 'Teramo', 'TE', NULL, 'TE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-TE');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-TR', 'PROVINCE', 'Terni', 'TR', NULL, 'TR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-TR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-TP', 'PROVINCE', 'Trapani', 'TP', NULL, 'TP', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-TP');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-TN', 'PROVINCE', 'Trento', 'TN', NULL, 'TN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-TN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-TV', 'PROVINCE', 'Treviso', 'TV', NULL, 'TV', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-TV');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-TS', 'PROVINCE', 'Trieste', 'TS', NULL, 'TS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-TS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-TO', 'PROVINCE', 'Torino', 'TO', NULL, 'TO', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-TO');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-UD', 'PROVINCE', 'Udine', 'UD', NULL, 'UD', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-UD');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-VA', 'PROVINCE', 'Varese', 'VA', NULL, 'VA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-VA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-VE', 'PROVINCE', 'Venezia', 'VE', NULL, 'VE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-VE');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-VB', 'PROVINCE', 'Verbano-Cusio-Ossola', 'VB', NULL, 'VB', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-VB');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-VC', 'PROVINCE', 'Vercelli', 'VC', NULL, 'VC', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-VC');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-VR', 'PROVINCE', 'Verona', 'VR', NULL, 'VR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-VR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-VV', 'PROVINCE', 'Vibo Valentia', 'VV', NULL, 'VV', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-VV');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-VI', 'PROVINCE', 'Vicenza', 'VI', NULL, 'VI', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-VI');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IT-VT', 'PROVINCE', 'Viterbo', 'VT', NULL, 'VT', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IT-VT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-AG', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-AG' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-AL', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-AL' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-AN', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-AN' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-AO', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-AO' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-AQ', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-AQ' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-AR', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-AR' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-AP', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-AP' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-AT', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-AT' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-AV', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-AV' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-BA', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-BA' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-BT', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-BT' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-BL', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-BL' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-BN', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-BN' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-BG', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-BG' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-BI', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-BI' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-BO', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-BO' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-BZ', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-BZ' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-BS', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-BS' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-BR', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-BR' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-CA', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-CA' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-CL', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-CL' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-CB', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-CB' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-CI', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-CI' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-CE', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-CE' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-CT', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-CT' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-CZ', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-CZ' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-CH', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-CH' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-CO', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-CO' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-CS', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-CS' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-CR', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-CR' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-KR', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-KR' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-CN', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-CN' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-EN', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-EN' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-FM', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-FM' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-FE', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-FE' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-FI', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-FI' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-FG', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-FG' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-FC', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-FC' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-FR', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-FR' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-GE', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-GE' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-GO', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-GO' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-GR', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-GR' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-IM', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-IM' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-IS', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-IS' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-LT', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-LT' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-LE', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-LE' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-LC', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-LC' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-LI', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-LI' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-LO', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-LO' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-LU', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-LU' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-MC', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-MC' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-MN', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-MN' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-MS', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-MS' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-MT', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-MT' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-VS', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-VS' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-ME', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-ME' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-MI', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-MI' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-MO', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-MO' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-MB', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-MB' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-NA', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-NA' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-NO', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-NO' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-NU', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-NU' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-OG', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-OG' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-OT', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-OT' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-OR', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-OR' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-PD', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-PD' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-PA', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-PA' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-PR', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-PR' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-PV', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-PV' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-PG', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-PG' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-PU', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-PU' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-PE', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-PE' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-PC', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-PC' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-PI', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-PI' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-PT', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-PT' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-PN', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-PN' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-PZ', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-PZ' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-PO', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-PO' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-RG', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-RG' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-RA', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-RA' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-RC', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-RC' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-RE', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-RE' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-RI', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-RI' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-RN', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-RN' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-RM', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-RM' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-RO', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-RO' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-SA', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-SA' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-SS', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-SS' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-SV', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-SV' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-SI', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-SI' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-SO', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-SO' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-SP', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-SP' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-SR', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-SR' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-TA', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-TA' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-TE', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-TE' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-TR', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-TR' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-TP', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-TP' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-TN', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-TN' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-TV', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-TV' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-TS', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-TS' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-TO', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-TO' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-UD', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-UD' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-VA', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-VA' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-VE', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-VE' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-CB', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-CB' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-VC', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-VC' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-VR', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-VR' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-VV', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-VV' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-VI', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-VI' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'IT-VT', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'IT-VT' AND geo_assoc_type_id = 'REGIONS');
