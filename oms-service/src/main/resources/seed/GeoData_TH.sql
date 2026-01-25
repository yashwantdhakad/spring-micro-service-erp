INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-10', 'PROVINCE', 'Bangkok', '10', NULL, 'BKK', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-10');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-37', 'PROVINCE', 'Amnat Charoen', '37', NULL, 'ACR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-37');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-15', 'PROVINCE', 'Ang Thong', '15', NULL, 'ATG', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-15');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-38', 'PROVINCE', 'Bueng Kan', '38', NULL, 'BK', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-38');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-31', 'PROVINCE', 'Buriram', '31', NULL, 'BRM', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-31');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-24', 'PROVINCE', 'Chachoengsao', '24', NULL, 'CCO', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-24');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-18', 'PROVINCE', 'Chainat', '18', NULL, 'CNT', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-18');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-36', 'PROVINCE', 'Chaiyaphum', '36', NULL, 'CPM', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-36');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-22', 'PROVINCE', 'Chanthaburi', '22', NULL, 'CTI', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-22');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-50', 'PROVINCE', 'Chiang Mai', '50', NULL, 'CMI', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-50');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-57', 'PROVINCE', 'Chiang Rai', '57', NULL, 'CRI', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-57');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-20', 'PROVINCE', 'Chonburi', '20', NULL, 'CBI', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-20');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-86', 'PROVINCE', 'Chumphon', '86', NULL, 'CPN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-86');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-46', 'PROVINCE', 'Kalasin', '46', NULL, 'KSN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-46');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-62', 'PROVINCE', 'Kamphaeng Phet', '62', NULL, 'KPT', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-62');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-71', 'PROVINCE', 'Kanchanaburi', '71', NULL, 'KRI', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-71');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-40', 'PROVINCE', 'Khon Kaen', '40', NULL, 'KKN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-40');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-81', 'PROVINCE', 'Krabi', '81', NULL, 'KBI', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-81');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-52', 'PROVINCE', 'Lampang', '52', NULL, 'LPG', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-52');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-51', 'PROVINCE', 'Lamphun', '51', NULL, 'LPN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-51');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-42', 'PROVINCE', 'Loei', '42', NULL, 'LEI', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-42');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-16', 'PROVINCE', 'Lopburi', '16', NULL, 'LRI', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-16');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-58', 'PROVINCE', 'Mae Hong Son', '58', NULL, 'MSN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-58');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-44', 'PROVINCE', 'Maha Sarakham', '44', NULL, 'MKM', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-44');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-49', 'PROVINCE', 'Mukdahan', '49', NULL, 'MDH', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-49');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-26', 'PROVINCE', 'Nakhon Nayok', '26', NULL, 'NYK', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-26');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-73', 'PROVINCE', 'Nakhon Pathom', '73', NULL, 'NPT', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-73');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-48', 'PROVINCE', 'Nakhon Phanom', '48', NULL, 'NPM', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-48');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-30', 'PROVINCE', 'Nakhon Ratchasima', '30', NULL, 'NMA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-30');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-60', 'PROVINCE', 'Nakhon Sawan', '60', NULL, 'NSN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-60');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-80', 'PROVINCE', 'Nakhon Si Thammarat', '80', NULL, 'NRT', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-80');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-55', 'PROVINCE', 'Nan', '55', NULL, 'NAN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-55');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-96', 'PROVINCE', 'Narathiwat', '96', NULL, 'NWT', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-96');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-39', 'PROVINCE', 'Nong Bua Lamphu', '39', NULL, 'NBP', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-39');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-43', 'PROVINCE', 'Nong Khai', '43', NULL, 'NKI', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-43');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-12', 'PROVINCE', 'Nonthaburi', '12', NULL, 'NBI', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-12');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-13', 'PROVINCE', 'Pathum Thani', '13', NULL, 'PTE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-13');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-94', 'PROVINCE', 'Pattani', '94', NULL, 'PTN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-94');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-82', 'PROVINCE', 'Phang Nga', '82', NULL, 'PNA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-82');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-93', 'PROVINCE', 'Phatthalung', '93', NULL, 'PLG', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-93');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-56', 'PROVINCE', 'Phayao', '56', NULL, 'PYO', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-56');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-67', 'PROVINCE', 'Phetchabun', '67', NULL, 'PNB', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-67');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-76', 'PROVINCE', 'Phetchaburi', '76', NULL, 'PBI', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-76');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-66', 'PROVINCE', 'Phichit', '66', NULL, 'PCT', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-66');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-65', 'PROVINCE', 'Phitsanulok', '65', NULL, 'PLK', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-65');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-14', 'PROVINCE', 'Phra Nakhon Si Ayutthaya', '14', NULL, 'AYA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-14');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-54', 'PROVINCE', 'Phrae', '54', NULL, 'PRE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-54');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-83', 'PROVINCE', 'Phuket', '83', NULL, 'PKT', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-83');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-25', 'PROVINCE', 'Prachinburi', '25', NULL, 'PRI', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-25');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-77', 'PROVINCE', 'Prachuap Khiri Khan', '77', NULL, 'PKN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-77');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-85', 'PROVINCE', 'Ranong', '85', NULL, 'RNG', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-85');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-70', 'PROVINCE', 'Ratchaburi', '70', NULL, 'RBR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-70');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-21', 'PROVINCE', 'Rayong', '21', NULL, 'RYG', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-21');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-45', 'PROVINCE', 'Roi Et', '45', NULL, 'RET', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-45');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-27', 'PROVINCE', 'Sa Kaeo', '27', NULL, 'SKW', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-27');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-47', 'PROVINCE', 'Sakon Nakhon', '47', NULL, 'SNK', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-47');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-11', 'PROVINCE', 'Samut Prakan', '11', NULL, 'SPK', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-11');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-74', 'PROVINCE', 'Samut Sakhon', '74', NULL, 'SKN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-74');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-75', 'PROVINCE', 'Samut Songkhram', '75', NULL, 'SKM', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-75');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-19', 'PROVINCE', 'Saraburi', '19', NULL, 'SRI', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-19');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-91', 'PROVINCE', 'Satun', '91', NULL, 'STN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-91');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-17', 'PROVINCE', 'Sing Buri', '17', NULL, 'SBR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-17');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-33', 'PROVINCE', 'Sisaket', '33', NULL, 'SSK', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-33');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-90', 'PROVINCE', 'Songkhla', '90', NULL, 'SKA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-90');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-64', 'PROVINCE', 'Sukhothai', '64', NULL, 'STI', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-64');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-72', 'PROVINCE', 'Suphan Buri', '72', NULL, 'SPB', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-72');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-84', 'PROVINCE', 'Surat Thani', '84', NULL, 'SNI', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-84');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-32', 'PROVINCE', 'Surin', '32', NULL, 'SRN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-32');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-63', 'PROVINCE', 'Tak', '63', NULL, 'TAK', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-63');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-92', 'PROVINCE', 'Trang', '92', NULL, 'TRG', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-92');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-23', 'PROVINCE', 'Trat', '23', NULL, 'TRT', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-23');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-34', 'PROVINCE', 'Ubon Ratchathani', '34', NULL, 'UBN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-34');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-41', 'PROVINCE', 'Udon Thani', '41', NULL, 'UDN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-41');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-61', 'PROVINCE', 'Uthai Thani', '61', NULL, 'UTI', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-61');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-53', 'PROVINCE', 'Uttaradit', '53', NULL, 'UTD', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-53');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-95', 'PROVINCE', 'Yala', '95', NULL, 'YLA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-95');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TH-35', 'PROVINCE', 'Yasothon', '35', NULL, 'YST', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TH-35');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-10', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-10' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-37', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-37' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-15', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-15' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-38', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-38' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-31', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-31' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-24', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-24' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-18', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-18' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-36', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-36' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-22', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-22' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-50', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-50' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-57', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-57' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-20', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-20' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-86', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-86' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-46', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-46' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-62', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-62' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-71', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-71' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-40', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-40' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-81', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-81' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-52', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-52' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-51', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-51' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-42', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-42' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-16', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-16' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-58', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-58' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-44', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-44' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-49', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-49' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-26', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-26' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-73', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-73' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-48', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-48' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-30', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-30' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-60', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-60' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-80', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-80' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-55', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-55' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-96', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-96' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-39', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-39' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-43', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-43' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-12', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-12' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-13', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-13' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-94', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-94' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-82', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-82' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-93', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-93' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-56', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-56' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-67', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-67' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-76', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-76' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-66', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-66' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-65', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-65' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-14', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-14' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-54', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-54' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-83', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-83' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-25', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-25' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-77', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-77' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-85', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-85' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-70', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-70' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-21', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-21' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-45', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-45' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-27', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-27' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-47', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-47' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-11', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-11' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-74', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-74' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-75', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-75' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-19', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-19' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-91', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-91' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-17', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-17' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-33', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-33' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-90', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-90' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-64', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-64' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-72', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-72' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-84', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-84' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-32', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-32' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-63', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-63' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-92', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-92' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-23', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-23' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-34', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-34' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-41', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-41' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-61', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-61' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-53', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-53' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-95', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-95' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'THA', 'TH-35', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'THA' AND geo_id_to = 'TH-35' AND geo_assoc_type_id = 'REGIONS');
