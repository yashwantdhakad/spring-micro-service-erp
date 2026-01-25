INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CN-BJ', 'MUNICIPALITY', '北京', 'BJ', NULL, '京', 'Beijing'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CN-BJ');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CN-CQ', 'MUNICIPALITY', '重庆', 'CQ', NULL, '渝', 'Chongqing'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CN-CQ');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CN-SH', 'MUNICIPALITY', '上海', 'SH', NULL, '沪', 'Shanghai'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CN-SH');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CN-TJ', 'MUNICIPALITY', '天津', 'TJ', NULL, '津', 'Tianjin'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CN-TJ');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CN-HL', 'PROVINCE', '黑龙江', 'HL', NULL, '黑', 'Heilongjiang'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CN-HL');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CN-JL', 'PROVINCE', '吉林', 'JL', NULL, '吉', 'Jilin'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CN-JL');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CN-LN', 'PROVINCE', '辽宁', 'LN', NULL, '辽', 'Liaoning'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CN-LN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CN-QH', 'PROVINCE', '青海', 'QH', NULL, '青', 'Qinghai'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CN-QH');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CN-GS', 'PROVINCE', '甘肃', 'GS', NULL, '甘', 'Gansu'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CN-GS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CN-SN', 'PROVINCE', '陕西', 'SN', NULL, '陕', 'Shaanxi'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CN-SN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CN-SX', 'PROVINCE', '山西', 'SX', NULL, '晋', 'Shanxi'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CN-SX');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CN-HE', 'PROVINCE', '河北', 'HE', NULL, '冀', 'Hebei'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CN-HE');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CN-SC', 'PROVINCE', '四川', 'SC', NULL, '川', 'Sichuan'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CN-SC');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CN-HB', 'PROVINCE', '湖北', 'HB', NULL, '鄂', 'Hubei'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CN-HB');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CN-HA', 'PROVINCE', '河南', 'HA', NULL, '豫', 'Henan'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CN-HA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CN-SD', 'PROVINCE', '山东', 'SD', NULL, '鲁', 'Shandong'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CN-SD');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CN-AH', 'PROVINCE', '安徽', 'AH', NULL, '皖', 'Anhui'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CN-AH');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CN-JS', 'PROVINCE', '江苏', 'JS', NULL, '苏', 'Jiangsu'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CN-JS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CN-YN', 'PROVINCE', '云南', 'YN', NULL, '滇', 'Yunnan'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CN-YN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CN-GZ', 'PROVINCE', '贵州', 'GZ', NULL, '黔', 'Guizhou'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CN-GZ');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CN-HN', 'PROVINCE', '湖南', 'HN', NULL, '湘', 'Hunan'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CN-HN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CN-JX', 'PROVINCE', '江西', 'JX', NULL, '赣', 'Jiangxi'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CN-JX');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CN-ZJ', 'PROVINCE', '浙江', 'ZJ', NULL, '浙', 'Zhejiang'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CN-ZJ');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CN-HI', 'PROVINCE', '海南', 'HI', NULL, '琼', 'Hainan'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CN-HI');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CN-GD', 'PROVINCE', '广东', 'GD', NULL, '粤', 'Guangdong'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CN-GD');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CN-FJ', 'PROVINCE', '福建', 'FJ', NULL, '闽', 'Fujian'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CN-FJ');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CN-TW', 'PROVINCE', '台湾', 'TW', NULL, '台', 'Taiwan'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CN-TW');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CN-GX', 'REGION', '广西', 'GX', NULL, '桂', 'Guangxi'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CN-GX');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CN-NM', 'REGION', '内蒙古', 'NM', NULL, '内蒙古', 'Inner Mongolia'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CN-NM');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CN-NX', 'REGION', '宁夏', 'NX', NULL, '宁', 'Ningxia'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CN-NX');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CN-XJ', 'REGION', '新疆', 'XJ', NULL, '新', 'Xinjiang'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CN-XJ');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CN-XZ', 'REGION', '西藏', 'XZ', NULL, '藏', 'Tibet'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CN-XZ');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CN-HK', 'REGION', '香港', 'HK', NULL, '香港', 'Hong Kong'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CN-HK');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CN-MO', 'REGION', '澳门', 'MO', NULL, '澳门', 'Macau'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CN-MO');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHN', 'CN-BJ', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHN' AND geo_id_to = 'CN-BJ' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHN', 'CN-CQ', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHN' AND geo_id_to = 'CN-CQ' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHN', 'CN-SH', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHN' AND geo_id_to = 'CN-SH' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHN', 'CN-TJ', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHN' AND geo_id_to = 'CN-TJ' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHN', 'CN-HL', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHN' AND geo_id_to = 'CN-HL' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHN', 'CN-JL', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHN' AND geo_id_to = 'CN-JL' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHN', 'CN-LN', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHN' AND geo_id_to = 'CN-LN' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHN', 'CN-QH', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHN' AND geo_id_to = 'CN-QH' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHN', 'CN-GS', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHN' AND geo_id_to = 'CN-GS' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHN', 'CN-SN', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHN' AND geo_id_to = 'CN-SN' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHN', 'CN-SX', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHN' AND geo_id_to = 'CN-SX' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHN', 'CN-HE', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHN' AND geo_id_to = 'CN-HE' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHN', 'CN-SC', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHN' AND geo_id_to = 'CN-SC' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHN', 'CN-HB', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHN' AND geo_id_to = 'CN-HB' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHN', 'CN-HA', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHN' AND geo_id_to = 'CN-HA' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHN', 'CN-SD', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHN' AND geo_id_to = 'CN-SD' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHN', 'CN-AH', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHN' AND geo_id_to = 'CN-AH' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHN', 'CN-JS', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHN' AND geo_id_to = 'CN-JS' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHN', 'CN-YN', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHN' AND geo_id_to = 'CN-YN' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHN', 'CN-GZ', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHN' AND geo_id_to = 'CN-GZ' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHN', 'CN-HN', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHN' AND geo_id_to = 'CN-HN' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHN', 'CN-JX', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHN' AND geo_id_to = 'CN-JX' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHN', 'CN-ZJ', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHN' AND geo_id_to = 'CN-ZJ' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHN', 'CN-HI', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHN' AND geo_id_to = 'CN-HI' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHN', 'CN-GD', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHN' AND geo_id_to = 'CN-GD' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHN', 'CN-FJ', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHN' AND geo_id_to = 'CN-FJ' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHN', 'CN-TW', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHN' AND geo_id_to = 'CN-TW' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHN', 'CN-GX', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHN' AND geo_id_to = 'CN-GX' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHN', 'CN-NM', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHN' AND geo_id_to = 'CN-NM' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHN', 'CN-NX', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHN' AND geo_id_to = 'CN-NX' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHN', 'CN-XJ', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHN' AND geo_id_to = 'CN-XJ' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHN', 'CN-XZ', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHN' AND geo_id_to = 'CN-XZ' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHN', 'CN-HK', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHN' AND geo_id_to = 'CN-HK' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CHN', 'CN-MO', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CHN' AND geo_id_to = 'CN-MO' AND geo_assoc_type_id = 'REGIONS');
