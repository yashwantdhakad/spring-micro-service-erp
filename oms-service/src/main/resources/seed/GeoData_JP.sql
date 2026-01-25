INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'JP-01', 'PROVINCE', '北海道', '01', NULL, 'HK', 'Hokkaido'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'JP-01');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'JP-02', 'PROVINCE', '青森県', '02', NULL, 'AO', 'Aomori'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'JP-02');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'JP-03', 'PROVINCE', '岩手県', '03', NULL, 'IT', 'Iwate'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'JP-03');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'JP-04', 'PROVINCE', '宮城県', '04', NULL, 'MG', 'Miyagi'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'JP-04');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'JP-05', 'PROVINCE', '秋田県', '05', NULL, 'AK', 'Akita'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'JP-05');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'JP-06', 'PROVINCE', '山形県', '06', NULL, 'YG', 'Yamagata'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'JP-06');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'JP-07', 'PROVINCE', '福島県', '07', NULL, 'FS', 'Fukushima'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'JP-07');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'JP-08', 'PROVINCE', '茨城県', '08', NULL, 'IB', 'Ibaraki'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'JP-08');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'JP-09', 'PROVINCE', '栃木県', '09', NULL, 'TC', 'Tochigi'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'JP-09');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'JP-10', 'PROVINCE', '群馬県', '10', NULL, 'GU', 'Gunma'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'JP-10');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'JP-11', 'PROVINCE', '埼玉県', '11', NULL, 'ST', 'Saitama'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'JP-11');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'JP-12', 'PROVINCE', '千葉県', '12', NULL, 'CB', 'Chiba'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'JP-12');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'JP-13', 'PROVINCE', '東京都', '13', NULL, 'TY', 'Tokyo'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'JP-13');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'JP-14', 'PROVINCE', '神奈川県', '14', NULL, 'KN', 'Kanagawa'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'JP-14');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'JP-15', 'PROVINCE', '新潟県', '15', NULL, 'NI', 'Niigata'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'JP-15');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'JP-16', 'PROVINCE', '富山県', '16', NULL, 'TM', 'Toyama'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'JP-16');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'JP-17', 'PROVINCE', '石川県', '17', NULL, 'IS', 'Ishikawa'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'JP-17');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'JP-18', 'PROVINCE', '福井県', '18', NULL, 'FI', 'Fukui'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'JP-18');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'JP-19', 'PROVINCE', '山梨県', '19', NULL, 'YN', 'Yamanashi'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'JP-19');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'JP-20', 'PROVINCE', '長野県', '20', NULL, 'NA', 'Nagano'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'JP-20');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'JP-21', 'PROVINCE', '岐阜県', '21', NULL, 'GI', 'Gifu'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'JP-21');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'JP-22', 'PROVINCE', '静岡県', '22', NULL, 'SZ', 'Shizuoka'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'JP-22');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'JP-23', 'PROVINCE', '愛知県', '23', NULL, 'AI', 'Aichi'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'JP-23');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'JP-24', 'PROVINCE', '三重県', '24', NULL, 'ME', 'Mie'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'JP-24');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'JP-25', 'PROVINCE', '滋賀県', '25', NULL, 'SI', 'Shiga'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'JP-25');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'JP-26', 'PROVINCE', '京都府', '26', NULL, 'KY', 'Kyoto'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'JP-26');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'JP-27', 'PROVINCE', '大阪府', '27', NULL, 'OS', 'Osaka'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'JP-27');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'JP-28', 'PROVINCE', '兵庫県', '28', NULL, 'HG', 'Hyogo'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'JP-28');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'JP-29', 'PROVINCE', '奈良県', '29', NULL, 'NR', 'Nara'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'JP-29');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'JP-30', 'PROVINCE', '和歌山県', '30', NULL, 'WA', 'Wakayama'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'JP-30');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'JP-31', 'PROVINCE', '鳥取県', '31', NULL, 'TT', 'Tottori'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'JP-31');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'JP-32', 'PROVINCE', '島根県', '32', NULL, 'SM', 'Shimane'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'JP-32');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'JP-33', 'PROVINCE', '岡山県', '33', NULL, 'OY', 'Okayama'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'JP-33');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'JP-34', 'PROVINCE', '広島県', '34', NULL, 'HS', 'Hiroshima'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'JP-34');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'JP-35', 'PROVINCE', '山口県', '35', NULL, 'YA', 'Yamaguchi'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'JP-35');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'JP-36', 'PROVINCE', '徳島県', '36', NULL, 'TK', 'Tokushima'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'JP-36');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'JP-37', 'PROVINCE', '香川県', '37', NULL, 'KA', 'Kagawa'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'JP-37');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'JP-38', 'PROVINCE', '愛媛県', '38', NULL, 'EH', 'Ehime'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'JP-38');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'JP-39', 'PROVINCE', '高知県', '39', NULL, 'KO', 'Kochi'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'JP-39');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'JP-40', 'PROVINCE', '福岡県', '40', NULL, 'FO', 'Fukuoka'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'JP-40');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'JP-41', 'PROVINCE', '佐賀県', '41', NULL, 'SG', 'Saga'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'JP-41');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'JP-42', 'PROVINCE', '長崎県', '42', NULL, 'NS', 'Nagasaki'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'JP-42');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'JP-43', 'PROVINCE', '熊本県', '43', NULL, 'KU', 'Kumamoto'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'JP-43');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'JP-44', 'PROVINCE', '大分県', '44', NULL, 'OI', 'Oita'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'JP-44');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'JP-45', 'PROVINCE', '宮崎県', '45', NULL, 'MZ', 'Miyazaki'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'JP-45');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'JP-46', 'PROVINCE', '鹿児島県', '46', NULL, 'KG', 'Kagoshima'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'JP-46');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'JP-47', 'PROVINCE', '沖縄県', '47', NULL, 'OK', 'Okinawa'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'JP-47');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'JPN', 'JP-01', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'JPN' AND geo_id_to = 'JP-01' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'JPN', 'JP-02', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'JPN' AND geo_id_to = 'JP-02' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'JPN', 'JP-03', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'JPN' AND geo_id_to = 'JP-03' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'JPN', 'JP-04', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'JPN' AND geo_id_to = 'JP-04' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'JPN', 'JP-05', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'JPN' AND geo_id_to = 'JP-05' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'JPN', 'JP-06', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'JPN' AND geo_id_to = 'JP-06' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'JPN', 'JP-07', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'JPN' AND geo_id_to = 'JP-07' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'JPN', 'JP-08', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'JPN' AND geo_id_to = 'JP-08' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'JPN', 'JP-09', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'JPN' AND geo_id_to = 'JP-09' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'JPN', 'JP-10', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'JPN' AND geo_id_to = 'JP-10' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'JPN', 'JP-11', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'JPN' AND geo_id_to = 'JP-11' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'JPN', 'JP-12', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'JPN' AND geo_id_to = 'JP-12' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'JPN', 'JP-13', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'JPN' AND geo_id_to = 'JP-13' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'JPN', 'JP-14', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'JPN' AND geo_id_to = 'JP-14' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'JPN', 'JP-15', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'JPN' AND geo_id_to = 'JP-15' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'JPN', 'JP-16', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'JPN' AND geo_id_to = 'JP-16' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'JPN', 'JP-17', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'JPN' AND geo_id_to = 'JP-17' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'JPN', 'JP-18', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'JPN' AND geo_id_to = 'JP-18' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'JPN', 'JP-19', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'JPN' AND geo_id_to = 'JP-19' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'JPN', 'JP-20', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'JPN' AND geo_id_to = 'JP-20' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'JPN', 'JP-21', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'JPN' AND geo_id_to = 'JP-21' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'JPN', 'JP-22', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'JPN' AND geo_id_to = 'JP-22' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'JPN', 'JP-23', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'JPN' AND geo_id_to = 'JP-23' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'JPN', 'JP-24', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'JPN' AND geo_id_to = 'JP-24' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'JPN', 'JP-25', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'JPN' AND geo_id_to = 'JP-25' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'JPN', 'JP-26', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'JPN' AND geo_id_to = 'JP-26' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'JPN', 'JP-27', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'JPN' AND geo_id_to = 'JP-27' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'JPN', 'JP-28', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'JPN' AND geo_id_to = 'JP-28' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'JPN', 'JP-29', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'JPN' AND geo_id_to = 'JP-29' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'JPN', 'JP-30', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'JPN' AND geo_id_to = 'JP-30' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'JPN', 'JP-31', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'JPN' AND geo_id_to = 'JP-31' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'JPN', 'JP-32', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'JPN' AND geo_id_to = 'JP-32' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'JPN', 'JP-33', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'JPN' AND geo_id_to = 'JP-33' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'JPN', 'JP-34', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'JPN' AND geo_id_to = 'JP-34' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'JPN', 'JP-35', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'JPN' AND geo_id_to = 'JP-35' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'JPN', 'JP-36', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'JPN' AND geo_id_to = 'JP-36' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'JPN', 'JP-37', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'JPN' AND geo_id_to = 'JP-37' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'JPN', 'JP-38', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'JPN' AND geo_id_to = 'JP-38' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'JPN', 'JP-39', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'JPN' AND geo_id_to = 'JP-39' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'JPN', 'JP-40', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'JPN' AND geo_id_to = 'JP-40' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'JPN', 'JP-41', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'JPN' AND geo_id_to = 'JP-41' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'JPN', 'JP-42', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'JPN' AND geo_id_to = 'JP-42' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'JPN', 'JP-43', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'JPN' AND geo_id_to = 'JP-43' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'JPN', 'JP-44', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'JPN' AND geo_id_to = 'JP-44' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'JPN', 'JP-45', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'JPN' AND geo_id_to = 'JP-45' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'JPN', 'JP-46', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'JPN' AND geo_id_to = 'JP-46' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'JPN', 'JP-47', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'JPN' AND geo_id_to = 'JP-47' AND geo_assoc_type_id = 'REGIONS');
