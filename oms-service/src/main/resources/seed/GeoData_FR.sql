INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-01', 'COUNTY', 'Ain', '01', NULL, 'AIN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-01');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-02', 'COUNTY', 'Aisne', '02', NULL, 'AIS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-02');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-03', 'COUNTY', 'Allier', '03', NULL, 'ALL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-03');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-04', 'COUNTY', 'Alpes de Hautes-Provence', '04', NULL, 'AHP', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-04');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-05', 'COUNTY', 'Hautes-Alpes', '05', NULL, 'HAL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-05');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-06', 'COUNTY', 'Alpes-Maritimes', '06', NULL, 'ALM', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-06');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-07', 'COUNTY', 'Ardèche', '07', NULL, 'ARD', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-07');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-08', 'COUNTY', 'Ardennes', '08', NULL, 'ARE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-08');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-09', 'COUNTY', 'Ariège', '09', NULL, 'ARI', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-09');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-10', 'COUNTY', 'Aube', '10', NULL, 'AUB', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-10');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-11', 'COUNTY', 'Aude', '11', NULL, 'AUD', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-11');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-12', 'COUNTY', 'Aveyron', '12', NULL, 'AVE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-12');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-13', 'COUNTY', 'Bouches-du-Rhône', '13', NULL, 'BDR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-13');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-14', 'COUNTY', 'Calvados', '14', NULL, 'CAL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-14');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-15', 'COUNTY', 'Cantal', '15', NULL, 'CAN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-15');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-16', 'COUNTY', 'Charente', '16', NULL, 'CHA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-16');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-17', 'COUNTY', 'Charente-Maritime', '17', NULL, 'CHM', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-17');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-18', 'COUNTY', 'Cher', '18', NULL, 'CHE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-18');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-19', 'COUNTY', 'Corrèze', '19', NULL, 'COR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-19');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-20', 'COUNTY', 'Corse', '20', NULL, 'COS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-20');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-2A', 'COUNTY', 'Corse-du-Sud', '2A', NULL, 'CDS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-2A');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-2B', 'COUNTY', 'Haute-Corse', '2B', NULL, 'HCO', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-2B');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-21', 'COUNTY', 'Côte-d''Or', '21', NULL, 'COO', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-21');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-22', 'COUNTY', 'Côtes d''Armor', '22', NULL, 'COA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-22');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-23', 'COUNTY', 'Creuse', '23', NULL, 'CRE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-23');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-24', 'COUNTY', 'Dordogne', '24', NULL, 'DOR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-24');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-25', 'COUNTY', 'Doubs', '25', NULL, 'DOU', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-25');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-26', 'COUNTY', 'Drôme', '26', NULL, 'DRO', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-26');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-27', 'COUNTY', 'Eure', '27', NULL, 'EUR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-27');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-28', 'COUNTY', 'Eure-et-Loir', '28', NULL, 'EUL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-28');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-29', 'COUNTY', 'Finistère', '29', NULL, 'FIN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-29');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-30', 'COUNTY', 'Gard', '30', NULL, 'GAR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-30');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-31', 'COUNTY', 'Haute-Garonne', '31', NULL, 'HAG', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-31');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-32', 'COUNTY', 'Gers', '32', NULL, 'GER', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-32');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-33', 'COUNTY', 'Gironde', '33', NULL, 'GIR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-33');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-34', 'COUNTY', 'Hérault', '34', NULL, 'HER', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-34');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-35', 'COUNTY', 'Ille-et-Vilaine', '35', NULL, 'ILL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-35');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-36', 'COUNTY', 'Indre', '36', NULL, 'IND', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-36');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-37', 'COUNTY', 'Indre-et-Loire', '37', NULL, 'IEL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-37');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-38', 'COUNTY', 'Isère', '38', NULL, 'ISE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-38');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-39', 'COUNTY', 'Jura', '39', NULL, 'JUR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-39');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-40', 'COUNTY', 'Landes', '40', NULL, 'LAN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-40');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-41', 'COUNTY', 'Loir-et-Cher', '41', NULL, 'LEC', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-41');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-42', 'COUNTY', 'Loire', '42', NULL, 'LOI', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-42');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-43', 'COUNTY', 'Haute-Loire', '43', NULL, 'HLO', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-43');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-44', 'COUNTY', 'Loire-Atlantique', '44', NULL, 'LOA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-44');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-45', 'COUNTY', 'Loiret', '45', NULL, 'LOR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-45');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-46', 'COUNTY', 'Lot', '46', NULL, 'LOT', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-46');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-47', 'COUNTY', 'Lot-et-Garonne', '47', NULL, 'LOG', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-47');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-48', 'COUNTY', 'Lozère', '48', NULL, 'LOZ', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-48');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-49', 'COUNTY', 'Maine-et-Loire', '49', NULL, 'MEL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-49');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-50', 'COUNTY', 'Manche', '50', NULL, 'MAN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-50');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-51', 'COUNTY', 'Marne', '51', NULL, 'MAR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-51');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-52', 'COUNTY', 'Haute-Marne', '52', NULL, 'HMA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-52');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-53', 'COUNTY', 'Mayenne', '53', NULL, 'MAY', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-53');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-54', 'COUNTY', 'Meurthe-et-Moselle', '54', NULL, 'MEM', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-54');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-55', 'COUNTY', 'Meuse', '55', NULL, 'MEU', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-55');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-56', 'COUNTY', 'Morbihan', '56', NULL, 'MOR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-56');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-57', 'COUNTY', 'Moselle', '57', NULL, 'MOS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-57');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-58', 'COUNTY', 'Nièvre', '58', NULL, 'NIE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-58');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-59', 'COUNTY', 'Nord', '59', NULL, 'NOR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-59');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-60', 'COUNTY', 'Oise', '60', NULL, 'OIS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-60');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-61', 'COUNTY', 'Orne', '61', NULL, 'ORN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-61');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-62', 'COUNTY', 'Pas-de-Calais', '62', NULL, 'PDC', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-62');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-63', 'COUNTY', 'Puy-de-Dôme', '63', NULL, 'PUY', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-63');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-64', 'COUNTY', 'Pyrénées-Atlantiques', '64', NULL, 'PYA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-64');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-65', 'COUNTY', 'Hautes-Pyrénées', '65', NULL, 'HPY', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-65');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-66', 'COUNTY', 'Pyrénées-Orientales', '66', NULL, 'PYO', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-66');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-67', 'COUNTY', 'Bas-Rhin', '67', NULL, 'BRH', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-67');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-68', 'COUNTY', 'Haut-Rhin', '68', NULL, 'HRH', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-68');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-69', 'COUNTY', 'Rhône', '69', NULL, 'RHO', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-69');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-70', 'COUNTY', 'Haute-Saône', '70', NULL, 'HAS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-70');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-71', 'COUNTY', 'Saône-et-Loire', '71', NULL, 'SEL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-71');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-72', 'COUNTY', 'Sarthe', '72', NULL, 'SAR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-72');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-73', 'COUNTY', 'Savoie', '73', NULL, 'SAV', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-73');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-74', 'COUNTY', 'Haute-Savoie', '74', NULL, 'HAS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-74');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-75', 'COUNTY', 'Paris', '75', NULL, 'PAR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-75');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-76', 'COUNTY', 'Seine-Maritime', '76', NULL, 'SMA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-76');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-77', 'COUNTY', 'Seine-et-Marne', '77', NULL, 'SEM', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-77');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-78', 'COUNTY', 'Yvelines', '78', NULL, 'YVE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-78');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-79', 'COUNTY', 'Deux-Sèvres', '79', NULL, 'DSE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-79');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-80', 'COUNTY', 'Somme', '80', NULL, 'SOM', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-80');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-81', 'COUNTY', 'Tarn', '81', NULL, 'TAR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-81');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-82', 'COUNTY', 'Tarn-et-Garonne', '82', NULL, 'TAG', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-82');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-83', 'COUNTY', 'Var', '83', NULL, 'VAR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-83');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-84', 'COUNTY', 'Vaucluse', '84', NULL, 'VAU', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-84');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-85', 'COUNTY', 'Vendée', '85', NULL, 'VEN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-85');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-86', 'COUNTY', 'Vienne', '86', NULL, 'VIE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-86');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-87', 'COUNTY', 'Haute-Vienne', '87', NULL, 'HVI', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-87');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-88', 'COUNTY', 'Vosges', '88', NULL, 'VOS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-88');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-89', 'COUNTY', 'Yonne', '89', NULL, 'YON', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-89');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-90', 'COUNTY', 'Territoire-de-Belfort', '90', NULL, 'TDB', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-90');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-91', 'COUNTY', 'Essonne', '91', NULL, 'ESS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-91');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-92', 'COUNTY', 'Hauts-de-Seine', '92', NULL, 'HDS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-92');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-93', 'COUNTY', 'Seine-Saint-Denis', '93', NULL, 'SSD', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-93');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-94', 'COUNTY', 'Val-de-Marne', '94', NULL, 'VDM', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-94');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-95', 'COUNTY', 'Val-d''Oise', '95', NULL, 'VDO', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-95');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-98', 'COUNTY', 'Monaco', '98', NULL, 'MON', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-98');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-GP', 'COUNTY', 'Guadeloupe', 'GP', NULL, 'GUA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-GP');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-GF', 'COUNTY', 'Guyane', 'GF', NULL, 'GUY', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-GF');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-MQ', 'COUNTY', 'Martinique', 'MQ', NULL, 'MAR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-MQ');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-RE', 'COUNTY', 'La Réunion', 'RE', NULL, 'REU', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-RE');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-PM', 'COUNTY', 'St Pierre et Miquelon', 'PM', NULL, 'SPM', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-PM');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-YT', 'COUNTY', 'Mayotte', 'YT', NULL, 'MAY', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-YT');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-NC', 'COUNTY', 'Nouvelle-Calédonie', 'NC', NULL, 'NOC', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-NC');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-PF', 'COUNTY', 'Polynésie française', 'PF', NULL, 'POF', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-PF');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-BL', 'COUNTY', 'Saint-Barthélemy', 'PF', NULL, 'SBL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-BL');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-MT', 'COUNTY', 'Saint-Martin', 'MT', NULL, 'SMT', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-MT');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-TF', 'COUNTY', 'Terres australes françaises', 'TF', NULL, 'TAF', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-TF');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-WF', 'COUNTY', 'Wallis et Futuna', 'WF', NULL, 'WEF', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-WF');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-BEB01', 'COUNTY_CITY', 'Bourg-en-Bresse', 'BEB', NULL, 'BEB', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-BEB01');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-LAO02', 'COUNTY_CITY', 'Laon', 'LAO', NULL, 'LAO', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-LAO02');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-MOU03', 'COUNTY_CITY', 'Moulins', 'MOU', NULL, 'MOU', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-MOU03');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-DIG04', 'COUNTY_CITY', 'Digne', 'DIG', NULL, 'DIG', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-DIG04');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-GAP05', 'COUNTY_CITY', 'Gap', 'GAP', NULL, 'GAP', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-GAP05');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-NIC06', 'COUNTY_CITY', 'Nice', 'NIC', NULL, 'NIC', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-NIC06');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-PRI07', 'COUNTY_CITY', 'Privas', 'PRI', NULL, 'PRI', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-PRI07');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-CHM08', 'COUNTY_CITY', 'Charleville-Mézières', 'CHM', NULL, 'CHM', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-CHM08');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-FOI09', 'COUNTY_CITY', 'Foix', 'FOI', NULL, 'FOI', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-FOI09');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-TRO10', 'COUNTY_CITY', 'Troyes', 'TRO', NULL, 'TRO', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-TRO10');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-CAR11', 'COUNTY_CITY', 'Carcassonne', 'CAR', NULL, 'CAR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-CAR11');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-ROD12', 'COUNTY_CITY', 'Rodez', 'ROD', NULL, 'ROD', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-ROD12');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-MAR13', 'COUNTY_CITY', 'Marseille', 'MAR', NULL, 'MAR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-MAR13');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-CAE14', 'COUNTY_CITY', 'Caen', 'CAE', NULL, 'CAE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-CAE14');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-AUR15', 'COUNTY_CITY', 'Aurillac', 'AUR', NULL, 'AUR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-AUR15');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-ANG16', 'COUNTY_CITY', 'Angoulême', 'ANG', NULL, 'ANG', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-ANG16');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-LRO17', 'COUNTY_CITY', 'La Rochelle', 'LRO', NULL, 'LRO', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-LRO17');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-BOU18', 'COUNTY_CITY', 'Bourges', 'BOU', NULL, 'BOU', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-BOU18');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-TUL19', 'COUNTY_CITY', 'Tulle', 'TUL', NULL, 'TUL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-TUL19');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-AJA2A', 'COUNTY_CITY', 'Ajaccio', 'AJA', NULL, 'AJA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-AJA2A');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-BAS2B', 'COUNTY_CITY', 'Bastia', 'BAS', NULL, 'BAS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-BAS2B');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-DIJ21', 'COUNTY_CITY', 'Dijon', 'DIJ', NULL, 'DIJ', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-DIJ21');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-SBR22', 'COUNTY_CITY', 'Saint-Brieuc', 'SBR', NULL, 'SBR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-SBR22');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-GUE23', 'COUNTY_CITY', 'Guéret', 'GUE', NULL, 'GUE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-GUE23');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-PER24', 'COUNTY_CITY', 'Périgueux', 'PER', NULL, 'PER', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-PER24');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-BES25', 'COUNTY_CITY', 'Besançon', 'BES', NULL, 'BES', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-BES25');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-VAL26', 'COUNTY_CITY', 'Valence', 'VAL', NULL, 'VAL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-VAL26');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-EVR27', 'COUNTY_CITY', 'Évreux', 'EVR', NULL, 'EVR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-EVR27');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-CHA28', 'COUNTY_CITY', 'Chartres', 'CHA', NULL, 'CHA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-CHA28');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-QUI29', 'COUNTY_CITY', 'Quimper', 'QUI', NULL, 'QUI', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-QUI29');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-NIM30', 'COUNTY_CITY', 'Nîmes', 'NIM', NULL, 'NIM', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-NIM30');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-TLS31', 'COUNTY_CITY', 'Toulouse', 'TLS', NULL, 'TLS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-TLS31');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-AUC32', 'COUNTY_CITY', 'Auch', 'AUC', NULL, 'AUC', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-AUC32');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-BOR33', 'COUNTY_CITY', 'Bordeaux', 'BOR', NULL, 'BOR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-BOR33');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-MON34', 'COUNTY_CITY', 'Montpellier', 'MON', NULL, 'MON', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-MON34');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-REN35', 'COUNTY_CITY', 'Rennes', 'REN', NULL, 'REN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-REN35');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-CHT36', 'COUNTY_CITY', 'Châteauroux', 'CHT', NULL, 'CHT', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-CHT36');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-TOU37', 'COUNTY_CITY', 'Tours', 'TOU', NULL, 'TOU', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-TOU37');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-GRE38', 'COUNTY_CITY', 'Grenoble', 'GRE', NULL, 'GRE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-GRE38');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-LON39', 'COUNTY_CITY', 'Lons-le-Saunier', 'LON', NULL, 'LON', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-LON39');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-MDM40', 'COUNTY_CITY', 'Mont-de-Marsan', 'MDM', NULL, 'MDM', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-MDM40');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-BLO41', 'COUNTY_CITY', 'Blois', 'BLO', NULL, 'BLO', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-BLO41');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-SET42', 'COUNTY_CITY', 'Saint-Étienne', 'SET', NULL, 'SET', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-SET42');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-PEV43', 'COUNTY_CITY', 'Le Puy-en-Velay', 'PEV', NULL, 'PEV', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-PEV43');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-NAN44', 'COUNTY_CITY', 'Nantes', 'NAN', NULL, 'NAN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-NAN44');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-ORL45', 'COUNTY_CITY', 'Orléans', 'ORL', NULL, 'ORL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-ORL45');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-CAH46', 'COUNTY_CITY', 'Cahors', 'CAH', NULL, 'CAH', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-CAH46');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-AGE47', 'COUNTY_CITY', 'Agen', 'AGE', NULL, 'AGE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-AGE47');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-MEN48', 'COUNTY_CITY', 'Mende', 'MEN', NULL, 'MEN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-MEN48');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-ANG49', 'COUNTY_CITY', 'Angers', 'ANG', NULL, 'ANG', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-ANG49');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-SLO50', 'COUNTY_CITY', 'Saint-Lô', 'SLO', NULL, 'SLO', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-SLO50');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-CEC51', 'COUNTY_CITY', 'Châlons-en-Champagne', 'CEC', NULL, 'CEC', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-CEC51');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-CHM52', 'COUNTY_CITY', 'Chaumont', 'CHM', NULL, 'CHM', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-CHM52');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-LVL53', 'COUNTY_CITY', 'Laval', 'LVL', NULL, 'LVL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-LVL53');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-NCY54', 'COUNTY_CITY', 'Nancy', 'NCY', NULL, 'NCY', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-NCY54');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-BLD55', 'COUNTY_CITY', 'Bar-le-Duc', 'BLD', NULL, 'BLD', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-BLD55');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-VAN56', 'COUNTY_CITY', 'Vannes', 'VAN', NULL, 'VAN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-VAN56');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-MET57', 'COUNTY_CITY', 'Metz', 'MET', NULL, 'MET', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-MET57');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-NEV58', 'COUNTY_CITY', 'Nevers', 'NEV', NULL, 'NEV', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-NEV58');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-LIL59', 'COUNTY_CITY', 'Lille', 'LIL', NULL, 'LIL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-LIL59');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-BVA60', 'COUNTY_CITY', 'Beauvais', 'BVA', NULL, 'BVA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-BVA60');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-ALE61', 'COUNTY_CITY', 'Alençon', 'ALE', NULL, 'ALE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-ALE61');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-ARR62', 'COUNTY_CITY', 'Arras', 'ARR', NULL, 'ARR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-ARR62');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-CLF63', 'COUNTY_CITY', 'Clermont-Ferrand', 'CLF', NULL, 'CLF', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-CLF63');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-PAU64', 'COUNTY_CITY', 'Pau', 'PAU', NULL, 'PAU', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-PAU64');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-TBS65', 'COUNTY_CITY', 'Tarbes', 'TBS', NULL, 'TBS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-TBS65');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-PPG66', 'COUNTY_CITY', 'Perpignan', 'PPG', NULL, 'PPG', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-PPG66');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-SBG67', 'COUNTY_CITY', 'Strasbourg', 'SBG', NULL, 'SBG', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-SBG67');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-CLM68', 'COUNTY_CITY', 'Colmar', 'CLM', NULL, 'CLM', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-CLM68');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-LYO69', 'COUNTY_CITY', 'Lyon', 'LYO', NULL, 'LYO', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-LYO69');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-VSL70', 'COUNTY_CITY', 'Vesoul', 'VSL', NULL, 'VSL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-VSL70');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-MCN71', 'COUNTY_CITY', 'Mâcon', 'MCN', NULL, 'MCN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-MCN71');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-LMA72', 'COUNTY_CITY', 'Le Mans', 'LMA', NULL, 'LMA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-LMA72');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-CBY73', 'COUNTY_CITY', 'Chambéry', 'CBY', NULL, 'CBY', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-CBY73');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-ACY74', 'COUNTY_CITY', 'Annecy', 'ACY', NULL, 'ACY', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-ACY74');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-PAR75', 'COUNTY_CITY', 'Paris', 'PAR', NULL, 'PAR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-PAR75');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-ROU76', 'COUNTY_CITY', 'Rouen', 'ROU', NULL, 'ROU', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-ROU76');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-MLN77', 'COUNTY_CITY', 'Melun', 'MLN', NULL, 'MLN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-MLN77');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-VSS78', 'COUNTY_CITY', 'Versailles', 'VSS', NULL, 'VSS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-VSS78');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-NIO79', 'COUNTY_CITY', 'Niort', 'NIO', NULL, 'NIO', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-NIO79');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-AMI80', 'COUNTY_CITY', 'Amiens', 'AMI', NULL, 'AMI', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-AMI80');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-ALB81', 'COUNTY_CITY', 'Albi', 'ALB', NULL, 'ALB', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-ALB81');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-MTB82', 'COUNTY_CITY', 'Montauban', 'MTB', NULL, 'MTB', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-MTB82');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-TLN83', 'COUNTY_CITY', 'Toulon', 'TLN', NULL, 'TLN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-TLN83');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-AVG84', 'COUNTY_CITY', 'Avignon', 'AVG', NULL, 'AVG', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-AVG84');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-RSY85', 'COUNTY_CITY', 'La Roche-sur-Yon', 'RSY', NULL, 'RSY', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-RSY85');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-POI86', 'COUNTY_CITY', 'Poitiers', 'POI', NULL, 'POI', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-POI86');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-LMG87', 'COUNTY_CITY', 'Limoges', 'LMG', NULL, 'LMG', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-LMG87');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-EPI88', 'COUNTY_CITY', 'Épinal', 'EPI', NULL, 'EPI', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-EPI88');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-AXR89', 'COUNTY_CITY', 'Auxerre', 'AXR', NULL, 'AXR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-AXR89');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-BLF90', 'COUNTY_CITY', 'Belfort', 'BLF', NULL, 'BLF', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-BLF90');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-EVR91', 'COUNTY_CITY', 'Évry', 'EVR', NULL, 'EVR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-EVR91');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-NTR92', 'COUNTY_CITY', 'Nanterre', 'NTR', NULL, 'NTR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-NTR92');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-BBY93', 'COUNTY_CITY', 'Bobigny', 'BBY', NULL, 'BBY', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-BBY93');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-CTL94', 'COUNTY_CITY', 'Créteil', 'CTL', NULL, 'CTL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-CTL94');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-PTO95', 'COUNTY_CITY', 'Pontoise', 'PTO', NULL, 'PTO', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-PTO95');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-ARA', 'REGION', 'Auvergne-Rhône-Alpes', 'ARA', NULL, 'ARA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-ARA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-HDF', 'REGION', 'Hauts-de-France', 'HDF', NULL, 'HDF', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-HDF');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-PAC', 'REGION', 'Provence-Alpes-Côte d''Azur', 'PAC', NULL, 'PAC', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-PAC');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-OCC', 'REGION', 'Occitanie', 'OCC', NULL, 'OCC', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-OCC');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-NOR', 'REGION', 'Normandie', 'NOR', NULL, 'NOR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-NOR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-CVL', 'REGION', 'Centre-Val de Loire', 'CVL', NULL, 'CVL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-CVL');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-BRE', 'REGION', 'Bretagne', 'BRE', NULL, 'BRE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-BRE');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-NAQ', 'REGION', 'Nouvelle-Aquitaine', 'NAQ', NULL, 'NAQ', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-NAQ');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-COR', 'REGION', 'Corse', 'COR', NULL, 'COR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-COR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-BFC', 'REGION', 'Bourgogne-Franche-Comté', 'BFC', NULL, 'BFC', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-BFC');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-PDL', 'REGION', 'Pays de la Loire', 'PDL', NULL, 'PDL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-PDL');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-GES', 'REGION', 'Grand-Est', 'GES', NULL, 'GES', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-GES');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-IDF', 'REGION', 'Ile-de-France', 'IDF', NULL, 'IDF', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-IDF');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-GUA', 'REGION', 'Guadeloupe', 'GUA', NULL, 'GUA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-GUA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-LRE', 'REGION', 'La Réunion', 'LRE', NULL, 'LRE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-LRE');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FR-MAY', 'REGION', 'Mayotte', 'MAY', NULL, 'MAY', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FR-MAY');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-ARA', 'FR-01', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-ARA' AND geo_id_to = 'FR-01' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-HDF', 'FR-02', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-HDF' AND geo_id_to = 'FR-02' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-ARA', 'FR-03', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-ARA' AND geo_id_to = 'FR-03' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-PAC', 'FR-04', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-PAC' AND geo_id_to = 'FR-04' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-PAC', 'FR-05', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-PAC' AND geo_id_to = 'FR-05' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-PAC', 'FR-06', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-PAC' AND geo_id_to = 'FR-06' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-ARA', 'FR-07', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-ARA' AND geo_id_to = 'FR-07' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-GES', 'FR-08', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-GES' AND geo_id_to = 'FR-08' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-OCC', 'FR-09', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-OCC' AND geo_id_to = 'FR-09' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-GES', 'FR-10', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-GES' AND geo_id_to = 'FR-10' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-OCC', 'FR-11', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-OCC' AND geo_id_to = 'FR-11' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-OCC', 'FR-12', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-OCC' AND geo_id_to = 'FR-12' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-PAC', 'FR-13', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-PAC' AND geo_id_to = 'FR-13' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-NOR', 'FR-14', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-NOR' AND geo_id_to = 'FR-14' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-ARA', 'FR-15', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-ARA' AND geo_id_to = 'FR-15' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-NAQ', 'FR-16', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-NAQ' AND geo_id_to = 'FR-16' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-NAQ', 'FR-17', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-NAQ' AND geo_id_to = 'FR-17' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-CVL', 'FR-18', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-CVL' AND geo_id_to = 'FR-18' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-NAQ', 'FR-19', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-NAQ' AND geo_id_to = 'FR-19' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-COR', 'FR-20', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-COR' AND geo_id_to = 'FR-20' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-COR', 'FR-2A', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-COR' AND geo_id_to = 'FR-2A' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-COR', 'FR-2B', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-COR' AND geo_id_to = 'FR-2B' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-BFC', 'FR-21', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-BFC' AND geo_id_to = 'FR-21' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-BRE', 'FR-22', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-BRE' AND geo_id_to = 'FR-22' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-NAQ', 'FR-23', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-NAQ' AND geo_id_to = 'FR-23' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-NAQ', 'FR-24', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-NAQ' AND geo_id_to = 'FR-24' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-GES', 'FR-25', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-GES' AND geo_id_to = 'FR-25' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-ARA', 'FR-26', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-ARA' AND geo_id_to = 'FR-26' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-NOR', 'FR-27', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-NOR' AND geo_id_to = 'FR-27' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-CVL', 'FR-28', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-CVL' AND geo_id_to = 'FR-28' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-BRE', 'FR-29', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-BRE' AND geo_id_to = 'FR-29' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-OCC', 'FR-30', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-OCC' AND geo_id_to = 'FR-30' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-OCC', 'FR-31', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-OCC' AND geo_id_to = 'FR-31' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-OCC', 'FR-32', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-OCC' AND geo_id_to = 'FR-32' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-NAQ', 'FR-33', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-NAQ' AND geo_id_to = 'FR-33' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-OCC', 'FR-34', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-OCC' AND geo_id_to = 'FR-34' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-BRE', 'FR-35', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-BRE' AND geo_id_to = 'FR-35' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-CVL', 'FR-36', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-CVL' AND geo_id_to = 'FR-36' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-CVL', 'FR-37', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-CVL' AND geo_id_to = 'FR-37' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-ARA', 'FR-38', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-ARA' AND geo_id_to = 'FR-38' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-GES', 'FR-39', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-GES' AND geo_id_to = 'FR-39' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-NAQ', 'FR-40', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-NAQ' AND geo_id_to = 'FR-40' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-CVL', 'FR-41', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-CVL' AND geo_id_to = 'FR-41' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-ARA', 'FR-42', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-ARA' AND geo_id_to = 'FR-42' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-ARA', 'FR-43', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-ARA' AND geo_id_to = 'FR-43' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-PDL', 'FR-44', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-PDL' AND geo_id_to = 'FR-44' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-CVL', 'FR-45', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-CVL' AND geo_id_to = 'FR-45' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-OCC', 'FR-46', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-OCC' AND geo_id_to = 'FR-46' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-NAQ', 'FR-47', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-NAQ' AND geo_id_to = 'FR-47' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-OCC', 'FR-48', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-OCC' AND geo_id_to = 'FR-48' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-PDL', 'FR-49', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-PDL' AND geo_id_to = 'FR-49' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-NOR', 'FR-50', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-NOR' AND geo_id_to = 'FR-50' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-GES', 'FR-51', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-GES' AND geo_id_to = 'FR-51' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-GES', 'FR-52', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-GES' AND geo_id_to = 'FR-52' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-PDL', 'FR-53', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-PDL' AND geo_id_to = 'FR-53' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-GES', 'FR-54', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-GES' AND geo_id_to = 'FR-54' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-GES', 'FR-55', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-GES' AND geo_id_to = 'FR-55' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-BRE', 'FR-56', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-BRE' AND geo_id_to = 'FR-56' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-GES', 'FR-57', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-GES' AND geo_id_to = 'FR-57' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-BFC', 'FR-58', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-BFC' AND geo_id_to = 'FR-58' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-HDF', 'FR-59', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-HDF' AND geo_id_to = 'FR-59' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-HDF', 'FR-60', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-HDF' AND geo_id_to = 'FR-60' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-NOR', 'FR-61', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-NOR' AND geo_id_to = 'FR-61' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-HDF', 'FR-62', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-HDF' AND geo_id_to = 'FR-62' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-ARA', 'FR-63', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-ARA' AND geo_id_to = 'FR-63' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-NAQ', 'FR-64', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-NAQ' AND geo_id_to = 'FR-64' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-OCC', 'FR-65', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-OCC' AND geo_id_to = 'FR-65' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-OCC', 'FR-66', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-OCC' AND geo_id_to = 'FR-66' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-GES', 'FR-67', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-GES' AND geo_id_to = 'FR-67' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-GES', 'FR-68', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-GES' AND geo_id_to = 'FR-68' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-ARA', 'FR-69', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-ARA' AND geo_id_to = 'FR-69' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-GES', 'FR-70', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-GES' AND geo_id_to = 'FR-70' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-BFC', 'FR-71', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-BFC' AND geo_id_to = 'FR-71' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-PDL', 'FR-72', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-PDL' AND geo_id_to = 'FR-72' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-ARA', 'FR-73', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-ARA' AND geo_id_to = 'FR-73' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-ARA', 'FR-74', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-ARA' AND geo_id_to = 'FR-74' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-IDF', 'FR-75', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-IDF' AND geo_id_to = 'FR-75' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-NOR', 'FR-76', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-NOR' AND geo_id_to = 'FR-76' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-IDF', 'FR-77', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-IDF' AND geo_id_to = 'FR-77' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-IDF', 'FR-78', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-IDF' AND geo_id_to = 'FR-78' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-NAQ', 'FR-79', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-NAQ' AND geo_id_to = 'FR-79' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-HDF', 'FR-80', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-HDF' AND geo_id_to = 'FR-80' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-OCC', 'FR-81', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-OCC' AND geo_id_to = 'FR-81' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-OCC', 'FR-82', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-OCC' AND geo_id_to = 'FR-82' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-PAC', 'FR-83', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-PAC' AND geo_id_to = 'FR-83' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-PAC', 'FR-84', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-PAC' AND geo_id_to = 'FR-84' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-PDL', 'FR-85', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-PDL' AND geo_id_to = 'FR-85' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-NAQ', 'FR-86', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-NAQ' AND geo_id_to = 'FR-86' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-NAQ', 'FR-87', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-NAQ' AND geo_id_to = 'FR-87' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-GES', 'FR-88', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-GES' AND geo_id_to = 'FR-88' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-BFC', 'FR-89', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-BFC' AND geo_id_to = 'FR-89' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-GES', 'FR-90', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-GES' AND geo_id_to = 'FR-90' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-IDF', 'FR-91', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-IDF' AND geo_id_to = 'FR-91' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-IDF', 'FR-92', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-IDF' AND geo_id_to = 'FR-92' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-IDF', 'FR-93', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-IDF' AND geo_id_to = 'FR-93' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-IDF', 'FR-94', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-IDF' AND geo_id_to = 'FR-94' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-IDF', 'FR-95', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-IDF' AND geo_id_to = 'FR-95' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-GUA', 'FR-GP', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-GUA' AND geo_id_to = 'FR-GP' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-GF', 'FR-GF', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-GF' AND geo_id_to = 'FR-GF' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-LRE', 'FR-RE', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-LRE' AND geo_id_to = 'FR-RE' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-MAY', 'FR-YT', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-MAY' AND geo_id_to = 'FR-YT' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-MQ', 'FR-MQ', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-MQ' AND geo_id_to = 'FR-MQ' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-PM', 'FR-PM', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-PM' AND geo_id_to = 'FR-PM' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-YT', 'FR-YT', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-YT' AND geo_id_to = 'FR-YT' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-NC', 'FR-NC', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-NC' AND geo_id_to = 'FR-NC' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-PF', 'FR-PF', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-PF' AND geo_id_to = 'FR-PF' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-BL', 'FR-BL', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-BL' AND geo_id_to = 'FR-BL' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-MT', 'FR-MT', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-MT' AND geo_id_to = 'FR-MT' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-TF', 'FR-TF', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-TF' AND geo_id_to = 'FR-TF' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-WF', 'FR-WF', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-WF' AND geo_id_to = 'FR-WF' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-BEB01', 'FR-01', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-BEB01' AND geo_id_to = 'FR-01' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-LAO02', 'FR-02', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-LAO02' AND geo_id_to = 'FR-02' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-MOU03', 'FR-03', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-MOU03' AND geo_id_to = 'FR-03' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-DIG04', 'FR-04', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-DIG04' AND geo_id_to = 'FR-04' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-GAP05', 'FR-05', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-GAP05' AND geo_id_to = 'FR-05' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-NIC06', 'FR-06', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-NIC06' AND geo_id_to = 'FR-06' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-PRI07', 'FR-07', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-PRI07' AND geo_id_to = 'FR-07' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-CHM08', 'FR-08', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-CHM08' AND geo_id_to = 'FR-08' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-FOI09', 'FR-09', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-FOI09' AND geo_id_to = 'FR-09' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-TRO10', 'FR-10', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-TRO10' AND geo_id_to = 'FR-10' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-CAR11', 'FR-11', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-CAR11' AND geo_id_to = 'FR-11' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-ROD12', 'FR-12', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-ROD12' AND geo_id_to = 'FR-12' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-MAR13', 'FR-13', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-MAR13' AND geo_id_to = 'FR-13' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-CAE14', 'FR-14', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-CAE14' AND geo_id_to = 'FR-14' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-AUR15', 'FR-15', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-AUR15' AND geo_id_to = 'FR-15' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-ANG16', 'FR-16', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-ANG16' AND geo_id_to = 'FR-16' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-LRO17', 'FR-17', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-LRO17' AND geo_id_to = 'FR-17' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-BOU18', 'FR-18', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-BOU18' AND geo_id_to = 'FR-18' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-TUL19', 'FR-19', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-TUL19' AND geo_id_to = 'FR-19' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-AJA2A', 'FR-2A', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-AJA2A' AND geo_id_to = 'FR-2A' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-BAS2B', 'FR-2B', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-BAS2B' AND geo_id_to = 'FR-2B' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-DIJ21', 'FR-21', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-DIJ21' AND geo_id_to = 'FR-21' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-SBR22', 'FR-22', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-SBR22' AND geo_id_to = 'FR-22' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-GUE23', 'FR-23', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-GUE23' AND geo_id_to = 'FR-23' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-PER24', 'FR-24', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-PER24' AND geo_id_to = 'FR-24' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-BES25', 'FR-25', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-BES25' AND geo_id_to = 'FR-25' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-VAL26', 'FR-26', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-VAL26' AND geo_id_to = 'FR-26' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-EVR27', 'FR-27', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-EVR27' AND geo_id_to = 'FR-27' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-CHA28', 'FR-28', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-CHA28' AND geo_id_to = 'FR-28' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-QUI29', 'FR-29', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-QUI29' AND geo_id_to = 'FR-29' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-NIM30', 'FR-30', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-NIM30' AND geo_id_to = 'FR-30' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-TLS31', 'FR-31', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-TLS31' AND geo_id_to = 'FR-31' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-AUC32', 'FR-32', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-AUC32' AND geo_id_to = 'FR-32' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-BOR33', 'FR-33', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-BOR33' AND geo_id_to = 'FR-33' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-MON34', 'FR-34', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-MON34' AND geo_id_to = 'FR-34' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-REN35', 'FR-35', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-REN35' AND geo_id_to = 'FR-35' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-CHT36', 'FR-36', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-CHT36' AND geo_id_to = 'FR-36' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-TOU37', 'FR-37', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-TOU37' AND geo_id_to = 'FR-37' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-GRE38', 'FR-38', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-GRE38' AND geo_id_to = 'FR-38' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-LON39', 'FR-39', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-LON39' AND geo_id_to = 'FR-39' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-MDM40', 'FR-40', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-MDM40' AND geo_id_to = 'FR-40' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-BLO41', 'FR-41', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-BLO41' AND geo_id_to = 'FR-41' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-SET42', 'FR-42', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-SET42' AND geo_id_to = 'FR-42' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-PEV43', 'FR-43', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-PEV43' AND geo_id_to = 'FR-43' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-NAN44', 'FR-44', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-NAN44' AND geo_id_to = 'FR-44' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-ORL45', 'FR-45', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-ORL45' AND geo_id_to = 'FR-45' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-CAH46', 'FR-46', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-CAH46' AND geo_id_to = 'FR-46' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-AGE47', 'FR-47', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-AGE47' AND geo_id_to = 'FR-47' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-MEN48', 'FR-48', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-MEN48' AND geo_id_to = 'FR-48' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-ANG49', 'FR-49', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-ANG49' AND geo_id_to = 'FR-49' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-SLO50', 'FR-50', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-SLO50' AND geo_id_to = 'FR-50' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-CEC51', 'FR-51', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-CEC51' AND geo_id_to = 'FR-51' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-CHM52', 'FR-52', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-CHM52' AND geo_id_to = 'FR-52' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-LVL53', 'FR-53', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-LVL53' AND geo_id_to = 'FR-53' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-NCY54', 'FR-54', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-NCY54' AND geo_id_to = 'FR-54' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-BLD55', 'FR-55', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-BLD55' AND geo_id_to = 'FR-55' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-VAN56', 'FR-56', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-VAN56' AND geo_id_to = 'FR-56' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-MET57', 'FR-57', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-MET57' AND geo_id_to = 'FR-57' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-NEV58', 'FR-58', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-NEV58' AND geo_id_to = 'FR-58' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-LIL59', 'FR-59', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-LIL59' AND geo_id_to = 'FR-59' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-BVA60', 'FR-60', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-BVA60' AND geo_id_to = 'FR-60' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-ALE61', 'FR-61', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-ALE61' AND geo_id_to = 'FR-61' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-ARR62', 'FR-62', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-ARR62' AND geo_id_to = 'FR-62' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-CLF63', 'FR-63', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-CLF63' AND geo_id_to = 'FR-63' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-PAU64', 'FR-64', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-PAU64' AND geo_id_to = 'FR-64' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-TBS65', 'FR-65', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-TBS65' AND geo_id_to = 'FR-65' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-PPG66', 'FR-66', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-PPG66' AND geo_id_to = 'FR-66' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-SBG67', 'FR-67', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-SBG67' AND geo_id_to = 'FR-67' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-CLM68', 'FR-68', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-CLM68' AND geo_id_to = 'FR-68' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-LYO69', 'FR-69', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-LYO69' AND geo_id_to = 'FR-69' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-VSL70', 'FR-70', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-VSL70' AND geo_id_to = 'FR-70' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-MCN71', 'FR-71', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-MCN71' AND geo_id_to = 'FR-71' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-LMA72', 'FR-72', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-LMA72' AND geo_id_to = 'FR-72' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-CBY73', 'FR-73', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-CBY73' AND geo_id_to = 'FR-73' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-ACY74', 'FR-74', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-ACY74' AND geo_id_to = 'FR-74' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-PAR75', 'FR-75', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-PAR75' AND geo_id_to = 'FR-75' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-ROU76', 'FR-76', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-ROU76' AND geo_id_to = 'FR-76' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-MLN77', 'FR-77', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-MLN77' AND geo_id_to = 'FR-77' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-VSS78', 'FR-78', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-VSS78' AND geo_id_to = 'FR-78' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-NIO79', 'FR-79', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-NIO79' AND geo_id_to = 'FR-79' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-AMI80', 'FR-80', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-AMI80' AND geo_id_to = 'FR-80' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-ALB81', 'FR-81', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-ALB81' AND geo_id_to = 'FR-81' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-MTB82', 'FR-82', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-MTB82' AND geo_id_to = 'FR-82' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-TLN83', 'FR-83', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-TLN83' AND geo_id_to = 'FR-83' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-AVG84', 'FR-84', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-AVG84' AND geo_id_to = 'FR-84' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-RSY85', 'FR-85', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-RSY85' AND geo_id_to = 'FR-85' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-POI86', 'FR-86', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-POI86' AND geo_id_to = 'FR-86' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-LMG87', 'FR-87', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-LMG87' AND geo_id_to = 'FR-87' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-EPI88', 'FR-88', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-EPI88' AND geo_id_to = 'FR-88' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-AXR89', 'FR-89', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-AXR89' AND geo_id_to = 'FR-89' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-BLF90', 'FR-90', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-BLF90' AND geo_id_to = 'FR-90' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-EVR91', 'FR-91', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-EVR91' AND geo_id_to = 'FR-91' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-NTR92', 'FR-92', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-NTR92' AND geo_id_to = 'FR-92' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-BBY93', 'FR-93', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-BBY93' AND geo_id_to = 'FR-93' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-CTL94', 'FR-94', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-CTL94' AND geo_id_to = 'FR-94' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FR-PTO95', 'FR-95', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FR-PTO95' AND geo_id_to = 'FR-95' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FRA', 'FR-ARA', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FRA' AND geo_id_to = 'FR-ARA' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FRA', 'FR-HDF', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FRA' AND geo_id_to = 'FR-HDF' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FRA', 'FR-PAC', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FRA' AND geo_id_to = 'FR-PAC' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FRA', 'FR-OCC', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FRA' AND geo_id_to = 'FR-OCC' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FRA', 'FR-NOR', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FRA' AND geo_id_to = 'FR-NOR' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FRA', 'FR-CVL', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FRA' AND geo_id_to = 'FR-CVL' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FRA', 'FR-BRE', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FRA' AND geo_id_to = 'FR-BRE' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FRA', 'FR-NAQ', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FRA' AND geo_id_to = 'FR-NAQ' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FRA', 'FR-COR', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FRA' AND geo_id_to = 'FR-COR' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FRA', 'FR-BFC', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FRA' AND geo_id_to = 'FR-BFC' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FRA', 'FR-PDL', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FRA' AND geo_id_to = 'FR-PDL' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FRA', 'FR-GES', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FRA' AND geo_id_to = 'FR-GES' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FRA', 'FR-IDF', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FRA' AND geo_id_to = 'FR-IDF' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FRA', 'FR-GUA', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FRA' AND geo_id_to = 'FR-GUA' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FRA', 'FR-LRE', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FRA' AND geo_id_to = 'FR-LRE' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FRA', 'FR-MAY', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FRA' AND geo_id_to = 'FR-MAY' AND geo_assoc_type_id = 'REGIONS');
