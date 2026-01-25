INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'CRC', 'Costa Rica Colon', '188', 'CRC', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'CRC' AND description = 'Costa Rica Colon' AND numeric_code = '188' AND uom_id = 'CRC' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'COP', 'Colombian Peso', '170', 'COP', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'COP' AND description = 'Colombian Peso' AND numeric_code = '170' AND uom_id = 'COP' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'CNY', 'China', '156', 'CNY', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'CNY' AND description = 'China' AND numeric_code = '156' AND uom_id = 'CNY' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'CLP', 'Chilean Peso', '152', 'CLP', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'CLP' AND description = 'Chilean Peso' AND numeric_code = '152' AND uom_id = 'CLP' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'CHF', 'Swiss Franc', '756', 'CHF', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'CHF' AND description = 'Swiss Franc' AND numeric_code = '756' AND uom_id = 'CHF' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'CAD', 'Canadian Dollar', '124', 'CAD', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'CAD' AND description = 'Canadian Dollar' AND numeric_code = '124' AND uom_id = 'CAD' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'BZD', 'Belize Dollar', '084', 'BZD', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'BZD' AND description = 'Belize Dollar' AND numeric_code = '084' AND uom_id = 'BZD' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'BYN', 'Belorussian Ruble', '933', 'BYN', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'BYN' AND description = 'Belorussian Ruble' AND numeric_code = '933' AND uom_id = 'BYN' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'BWP', 'Botswana Pula', '072', 'BWP', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'BWP' AND description = 'Botswana Pula' AND numeric_code = '072' AND uom_id = 'BWP' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'BSD', 'Bahaman Dollar', '044', 'BSD', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'BSD' AND description = 'Bahaman Dollar' AND numeric_code = '044' AND uom_id = 'BSD' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'BRL', 'Brazilian Real', '986', 'BRL', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'BRL' AND description = 'Brazilian Real' AND numeric_code = '986' AND uom_id = 'BRL' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'BOB', 'Bolivian Boliviano', '068', 'BOB', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'BOB' AND description = 'Bolivian Boliviano' AND numeric_code = '068' AND uom_id = 'BOB' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'BND', 'Brunei Dollar', '096', 'BND', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'BND' AND description = 'Brunei Dollar' AND numeric_code = '096' AND uom_id = 'BND' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'BMD', 'Bermudan Dollar', '060', 'BMD', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'BMD' AND description = 'Bermudan Dollar' AND numeric_code = '060' AND uom_id = 'BMD' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'BIF', 'Burundi Franc', '108', 'BIF', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'BIF' AND description = 'Burundi Franc' AND numeric_code = '108' AND uom_id = 'BIF' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'BHD', 'Bahrain Dinar', '048', 'BHD', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'BHD' AND description = 'Bahrain Dinar' AND numeric_code = '048' AND uom_id = 'BHD' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'BGN', 'Bulgarian Lev', '975', 'BGN', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'BGN' AND description = 'Bulgarian Lev' AND numeric_code = '975' AND uom_id = 'BGN' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'BDT', 'Bangladesh Taka', '050', 'BDT', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'BDT' AND description = 'Bangladesh Taka' AND numeric_code = '050' AND uom_id = 'BDT' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'BBD', 'Barbados Dollar', '052', 'BBD', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'BBD' AND description = 'Barbados Dollar' AND numeric_code = '052' AND uom_id = 'BBD' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'BAM', 'Convertible Marks', '977', 'BAM', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'BAM' AND description = 'Convertible Marks' AND numeric_code = '977' AND uom_id = 'BAM' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'AZN', 'Azerbaijan Manat', '944', 'AZN', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'AZN' AND description = 'Azerbaijan Manat' AND numeric_code = '944' AND uom_id = 'AZN' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'AWG', 'Aruban Guilder', '533', 'AWG', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'AWG' AND description = 'Aruban Guilder' AND numeric_code = '533' AND uom_id = 'AWG' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'AUD', 'Australian Dollar', '036', 'AUD', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'AUD' AND description = 'Australian Dollar' AND numeric_code = '036' AND uom_id = 'AUD' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'ARS', 'Argentina Peso', '032', 'ARS', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'ARS' AND description = 'Argentina Peso' AND numeric_code = '032' AND uom_id = 'ARS' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'AOA', 'Angolan Kwanza', '973', 'AOA', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'AOA' AND description = 'Angolan Kwanza' AND numeric_code = '973' AND uom_id = 'AOA' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'ANG', 'West Indian Guilder', '532', 'ANG', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'ANG' AND description = 'West Indian Guilder' AND numeric_code = '532' AND uom_id = 'ANG' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'AMD', 'Armenian Dram', '051', 'AMD', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'AMD' AND description = 'Armenian Dram' AND numeric_code = '051' AND uom_id = 'AMD' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'ALL', 'Albanian Lek', '008', 'ALL', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'ALL' AND description = 'Albanian Lek' AND numeric_code = '008' AND uom_id = 'ALL' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'AFN', 'Afghani', '971', 'AFN', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'AFN' AND description = 'Afghani' AND numeric_code = '971' AND uom_id = 'AFN' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'AED', 'United Arab Emirates Dirham', '784', 'AED', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'AED' AND description = 'United Arab Emirates Dirham' AND numeric_code = '784' AND uom_id = 'AED' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'CUP', 'Cuban Peso', '192', 'CUP', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'CUP' AND description = 'Cuban Peso' AND numeric_code = '192' AND uom_id = 'CUP' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'CVE', 'Cape Verde Escudo', '132', 'CVE', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'CVE' AND description = 'Cape Verde Escudo' AND numeric_code = '132' AND uom_id = 'CVE' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'CZK', 'Czech Koruna', '203', 'CZK', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'CZK' AND description = 'Czech Koruna' AND numeric_code = '203' AND uom_id = 'CZK' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'DJF', 'Djibouti Franc', '262', 'DJF', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'DJF' AND description = 'Djibouti Franc' AND numeric_code = '262' AND uom_id = 'DJF' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'DKK', 'Danish Krone', '208', 'DKK', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'DKK' AND description = 'Danish Krone' AND numeric_code = '208' AND uom_id = 'DKK' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'DOP', 'Dominican Peso', '214', 'DOP', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'DOP' AND description = 'Dominican Peso' AND numeric_code = '214' AND uom_id = 'DOP' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'DZD', 'Algerian Dinar', '012', 'DZD', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'DZD' AND description = 'Algerian Dinar' AND numeric_code = '012' AND uom_id = 'DZD' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'EGP', 'Egyptian Pound', '818', 'EGP', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'EGP' AND description = 'Egyptian Pound' AND numeric_code = '818' AND uom_id = 'EGP' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'ETB', 'Ethiopian Birr', '230', 'ETB', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'ETB' AND description = 'Ethiopian Birr' AND numeric_code = '230' AND uom_id = 'ETB' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'EUR', 'Euro', '978', 'EUR', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'EUR' AND description = 'Euro' AND numeric_code = '978' AND uom_id = 'EUR' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'FJD', 'Fiji Dollar', '242', 'FJD', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'FJD' AND description = 'Fiji Dollar' AND numeric_code = '242' AND uom_id = 'FJD' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'FKP', 'Falkland Pound', '238', 'FKP', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'FKP' AND description = 'Falkland Pound' AND numeric_code = '238' AND uom_id = 'FKP' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'GBP', 'British Pound', '826', 'GBP', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'GBP' AND description = 'British Pound' AND numeric_code = '826' AND uom_id = 'GBP' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'GEL', 'Lari', '981', 'GEL', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'GEL' AND description = 'Lari' AND numeric_code = '981' AND uom_id = 'GEL' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'GHS', 'Ghanian Cedi', '936', 'GHS', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'GHS' AND description = 'Ghanian Cedi' AND numeric_code = '936' AND uom_id = 'GHS' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'GIP', 'Gibraltar Pound', '292', 'GIP', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'GIP' AND description = 'Gibraltar Pound' AND numeric_code = '292' AND uom_id = 'GIP' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'GMD', 'Gambian Dalasi', '270', 'GMD', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'GMD' AND description = 'Gambian Dalasi' AND numeric_code = '270' AND uom_id = 'GMD' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'GNF', 'Guinea Franc', '324', 'GNF', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'GNF' AND description = 'Guinea Franc' AND numeric_code = '324' AND uom_id = 'GNF' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'GTQ', 'Guatemalan Quedzal', '320', 'GTQ', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'GTQ' AND description = 'Guatemalan Quedzal' AND numeric_code = '320' AND uom_id = 'GTQ' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'GYD', 'Guyanese Dollar', '328', 'GYD', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'GYD' AND description = 'Guyanese Dollar' AND numeric_code = '328' AND uom_id = 'GYD' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'HKD', 'Hong Kong Dollar', '344', 'HKD', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'HKD' AND description = 'Hong Kong Dollar' AND numeric_code = '344' AND uom_id = 'HKD' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'HNL', 'Honduran Lempira', '340', 'HNL', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'HNL' AND description = 'Honduran Lempira' AND numeric_code = '340' AND uom_id = 'HNL' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'HRK', 'Croatian Kuna', '191', 'HRK', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'HRK' AND description = 'Croatian Kuna' AND numeric_code = '191' AND uom_id = 'HRK' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'HTG', 'Haitian Gourde', '332', 'HTG', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'HTG' AND description = 'Haitian Gourde' AND numeric_code = '332' AND uom_id = 'HTG' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'HUF', 'Hungarian forint', '348', 'HUF', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'HUF' AND description = 'Hungarian forint' AND numeric_code = '348' AND uom_id = 'HUF' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'IDR', 'Indeonesian Rupiah', '360', 'IDR', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'IDR' AND description = 'Indeonesian Rupiah' AND numeric_code = '360' AND uom_id = 'IDR' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'INR', 'Indian Rupee', '356', 'INR', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'INR' AND description = 'Indian Rupee' AND numeric_code = '356' AND uom_id = 'INR' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'IQD', 'Iraqui Dinar', '368', 'IQD', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'IQD' AND description = 'Iraqui Dinar' AND numeric_code = '368' AND uom_id = 'IQD' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'IRR', 'Iranian Rial', '364', 'IRR', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'IRR' AND description = 'Iranian Rial' AND numeric_code = '364' AND uom_id = 'IRR' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'ISK', 'Iceland Krona', '352', 'ISK', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'ISK' AND description = 'Iceland Krona' AND numeric_code = '352' AND uom_id = 'ISK' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'JMD', 'Jamaican Dollar', '388', 'JMD', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'JMD' AND description = 'Jamaican Dollar' AND numeric_code = '388' AND uom_id = 'JMD' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'JOD', 'Jordanian Dinar', '400', 'JOD', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'JOD' AND description = 'Jordanian Dinar' AND numeric_code = '400' AND uom_id = 'JOD' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'JPY', 'Japanese Yen', '392', 'JPY', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'JPY' AND description = 'Japanese Yen' AND numeric_code = '392' AND uom_id = 'JPY' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'KES', 'Kenyan Shilling', '404', 'KES', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'KES' AND description = 'Kenyan Shilling' AND numeric_code = '404' AND uom_id = 'KES' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'KHR', 'Cambodian Riel', '116', 'KHR', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'KHR' AND description = 'Cambodian Riel' AND numeric_code = '116' AND uom_id = 'KHR' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'KGS', 'Kyrgyzstan Som', '417', 'KGS', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'KGS' AND description = 'Kyrgyzstan Som' AND numeric_code = '417' AND uom_id = 'KGS' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'KMF', 'Comoros Franc', '174', 'KMF', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'KMF' AND description = 'Comoros Franc' AND numeric_code = '174' AND uom_id = 'KMF' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'KPW', 'North Korean Won', '408', 'KPW', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'KPW' AND description = 'North Korean Won' AND numeric_code = '408' AND uom_id = 'KPW' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'KRW', 'South Korean Won', '410', 'KRW', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'KRW' AND description = 'South Korean Won' AND numeric_code = '410' AND uom_id = 'KRW' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'KWD', 'Kuwaiti Dinar', '414', 'KWD', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'KWD' AND description = 'Kuwaiti Dinar' AND numeric_code = '414' AND uom_id = 'KWD' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'KYD', 'Cayman Dollar', '136', 'KYD', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'KYD' AND description = 'Cayman Dollar' AND numeric_code = '136' AND uom_id = 'KYD' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'KZT', 'Kazakhstani Tenge', '398', 'KZT', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'KZT' AND description = 'Kazakhstani Tenge' AND numeric_code = '398' AND uom_id = 'KZT' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'LAK', 'Laotian Kip', '418', 'LAK', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'LAK' AND description = 'Laotian Kip' AND numeric_code = '418' AND uom_id = 'LAK' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'LBP', 'Lebanese Pound', '422', 'LBP', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'LBP' AND description = 'Lebanese Pound' AND numeric_code = '422' AND uom_id = 'LBP' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'LKR', 'Sri Lankan Rupee', '144', 'LKR', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'LKR' AND description = 'Sri Lankan Rupee' AND numeric_code = '144' AND uom_id = 'LKR' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'LRD', 'Liberian Dollar', '430', 'LRD', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'LRD' AND description = 'Liberian Dollar' AND numeric_code = '430' AND uom_id = 'LRD' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'LSL', 'Lesotho Loti', '426', 'LSL', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'LSL' AND description = 'Lesotho Loti' AND numeric_code = '426' AND uom_id = 'LSL' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'LYD', 'Libyan Dinar', '434', 'LYD', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'LYD' AND description = 'Libyan Dinar' AND numeric_code = '434' AND uom_id = 'LYD' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'MAD', 'Moroccan Dirham', '504', 'MAD', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'MAD' AND description = 'Moroccan Dirham' AND numeric_code = '504' AND uom_id = 'MAD' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'MDL', 'Moldavian Lei', '498', 'MDL', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'MDL' AND description = 'Moldavian Lei' AND numeric_code = '498' AND uom_id = 'MDL' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'MGA', 'Malagascy Ariary', '969', 'MGA', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'MGA' AND description = 'Malagascy Ariary' AND numeric_code = '969' AND uom_id = 'MGA' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'MNT', 'Mongolian Tugrik', '496', 'MNT', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'MNT' AND description = 'Mongolian Tugrik' AND numeric_code = '496' AND uom_id = 'MNT' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'MOP', 'Macao Pataca', '446', 'MOP', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'MOP' AND description = 'Macao Pataca' AND numeric_code = '446' AND uom_id = 'MOP' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'MRU', 'Mauritanian Ouguiya', '929', 'MRU', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'MRU' AND description = 'Mauritanian Ouguiya' AND numeric_code = '929' AND uom_id = 'MRU' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'MUR', 'Mauritius Rupee', '480', 'MUR', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'MUR' AND description = 'Mauritius Rupee' AND numeric_code = '480' AND uom_id = 'MUR' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'MVR', 'Maldive Rufiyaa', '462', 'MVR', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'MVR' AND description = 'Maldive Rufiyaa' AND numeric_code = '462' AND uom_id = 'MVR' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'MWK', 'Malawi Kwacha', '454', 'MWK', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'MWK' AND description = 'Malawi Kwacha' AND numeric_code = '454' AND uom_id = 'MWK' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'MXN', 'Mexican Peso', '484', 'MXN', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'MXN' AND description = 'Mexican Peso' AND numeric_code = '484' AND uom_id = 'MXN' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'MYR', 'Malaysian Ringgit', '458', 'MYR', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'MYR' AND description = 'Malaysian Ringgit' AND numeric_code = '458' AND uom_id = 'MYR' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'MZN', 'Mozambique Metical', '943', 'MZN', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'MZN' AND description = 'Mozambique Metical' AND numeric_code = '943' AND uom_id = 'MZN' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'NGN', 'Nigerian Naira', '566', 'NGN', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'NGN' AND description = 'Nigerian Naira' AND numeric_code = '566' AND uom_id = 'NGN' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'NIO', 'Nicaraguan Cordoba Oro', '558', 'NIO', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'NIO' AND description = 'Nicaraguan Cordoba Oro' AND numeric_code = '558' AND uom_id = 'NIO' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'ILS', 'New Israeli Shekel', '376', 'ILS', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'ILS' AND description = 'New Israeli Shekel' AND numeric_code = '376' AND uom_id = 'ILS' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'NOK', 'Norwegian Krone', '578', 'NOK', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'NOK' AND description = 'Norwegian Krone' AND numeric_code = '578' AND uom_id = 'NOK' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'NPR', 'Nepalese Rupee', '524', 'NPR', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'NPR' AND description = 'Nepalese Rupee' AND numeric_code = '524' AND uom_id = 'NPR' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'NZD', 'New Zealand Dollar', '554', 'NZD', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'NZD' AND description = 'New Zealand Dollar' AND numeric_code = '554' AND uom_id = 'NZD' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'OMR', 'Omani Rial', '512', 'OMR', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'OMR' AND description = 'Omani Rial' AND numeric_code = '512' AND uom_id = 'OMR' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'PAB', 'Panamanian Balboa', '590', 'PAB', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'PAB' AND description = 'Panamanian Balboa' AND numeric_code = '590' AND uom_id = 'PAB' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'PEN', 'Peruvian Sol', '604', 'PEN', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'PEN' AND description = 'Peruvian Sol' AND numeric_code = '604' AND uom_id = 'PEN' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'PGK', 'Papua New Guinea Kina', '598', 'PGK', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'PGK' AND description = 'Papua New Guinea Kina' AND numeric_code = '598' AND uom_id = 'PGK' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'PHP', 'Philippino Peso', '608', 'PHP', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'PHP' AND description = 'Philippino Peso' AND numeric_code = '608' AND uom_id = 'PHP' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'PKR', 'Pakistan Rupee', '586', 'PKR', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'PKR' AND description = 'Pakistan Rupee' AND numeric_code = '586' AND uom_id = 'PKR' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'PLN', 'Poland Zloty', '985', 'PLN', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'PLN' AND description = 'Poland Zloty' AND numeric_code = '985' AND uom_id = 'PLN' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'PYG', 'Paraguayan Guarani', '600', 'PYG', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'PYG' AND description = 'Paraguayan Guarani' AND numeric_code = '600' AND uom_id = 'PYG' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'QAR', 'Qatar Riyal', '634', 'QAR', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'QAR' AND description = 'Qatar Riyal' AND numeric_code = '634' AND uom_id = 'QAR' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'RON', 'Romanian Leu', '946', 'RON', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'RON' AND description = 'Romanian Leu' AND numeric_code = '946' AND uom_id = 'RON' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'RUB', 'Russian Rouble', '643', 'RUB', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'RUB' AND description = 'Russian Rouble' AND numeric_code = '643' AND uom_id = 'RUB' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'RWF', 'Rwanda Franc', '646', 'RWF', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'RWF' AND description = 'Rwanda Franc' AND numeric_code = '646' AND uom_id = 'RWF' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'SAR', 'Saudi Riyal', '682', 'SAR', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'SAR' AND description = 'Saudi Riyal' AND numeric_code = '682' AND uom_id = 'SAR' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'SBD', 'Solomon Islands Dollar', '090', 'SBD', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'SBD' AND description = 'Solomon Islands Dollar' AND numeric_code = '090' AND uom_id = 'SBD' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'SCR', 'Seychelles Rupee', '690', 'SCR', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'SCR' AND description = 'Seychelles Rupee' AND numeric_code = '690' AND uom_id = 'SCR' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'SDG', 'Sudanese Pound', '938', 'SDG', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'SDG' AND description = 'Sudanese Pound' AND numeric_code = '938' AND uom_id = 'SDG' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'SSP', 'South Sudanese Pound', '728', 'SSP', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'SSP' AND description = 'South Sudanese Pound' AND numeric_code = '728' AND uom_id = 'SSP' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'SEK', 'Swedish Krona', '752', 'SEK', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'SEK' AND description = 'Swedish Krona' AND numeric_code = '752' AND uom_id = 'SEK' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'SGD', 'Singapore Dollar', '702', 'SGD', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'SGD' AND description = 'Singapore Dollar' AND numeric_code = '702' AND uom_id = 'SGD' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'SHP', 'St.Helena Pound', '654', 'SHP', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'SHP' AND description = 'St.Helena Pound' AND numeric_code = '654' AND uom_id = 'SHP' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'SLL', 'Leone', '694', 'SLL', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'SLL' AND description = 'Leone' AND numeric_code = '694' AND uom_id = 'SLL' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'SOS', 'Somalian Shilling', '706', 'SOS', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'SOS' AND description = 'Somalian Shilling' AND numeric_code = '706' AND uom_id = 'SOS' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'SRD', 'Surinam Dollar', '968', 'SRD', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'SRD' AND description = 'Surinam Dollar' AND numeric_code = '968' AND uom_id = 'SRD' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'STN', 'Sao Tome and Principe Dobra', '930', 'STN', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'STN' AND description = 'Sao Tome and Principe Dobra' AND numeric_code = '930' AND uom_id = 'STN' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'SVC', 'El Salvador Colon', '222', 'SVC', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'SVC' AND description = 'El Salvador Colon' AND numeric_code = '222' AND uom_id = 'SVC' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'SYP', 'Syrian Pound', '760', 'SYP', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'SYP' AND description = 'Syrian Pound' AND numeric_code = '760' AND uom_id = 'SYP' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'SZL', 'Swaziland Lilangeni', '748', 'SZL', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'SZL' AND description = 'Swaziland Lilangeni' AND numeric_code = '748' AND uom_id = 'SZL' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'THB', 'Thailand Baht', '764', 'THB', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'THB' AND description = 'Thailand Baht' AND numeric_code = '764' AND uom_id = 'THB' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'TJS', 'Tadzhikistani Somoni', '972', 'TJS', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'TJS' AND description = 'Tadzhikistani Somoni' AND numeric_code = '972' AND uom_id = 'TJS' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'TMT', 'Turkmenistani Manat', '934', 'TMT', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'TMT' AND description = 'Turkmenistani Manat' AND numeric_code = '934' AND uom_id = 'TMT' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'TND', 'Tunisian Dinar', '788', 'TND', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'TND' AND description = 'Tunisian Dinar' AND numeric_code = '788' AND uom_id = 'TND' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'TOP', 'Tongan Pa''anga', '776', 'TOP', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'TOP' AND description = 'Tongan Pa''anga' AND numeric_code = '776' AND uom_id = 'TOP' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'TRY', 'Turkish Lira', '949', 'TRY', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'TRY' AND description = 'Turkish Lira' AND numeric_code = '949' AND uom_id = 'TRY' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'TTD', 'Trinidad and Tobago Dollar', '780', 'TTD', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'TTD' AND description = 'Trinidad and Tobago Dollar' AND numeric_code = '780' AND uom_id = 'TTD' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'TWD', 'New Taiwan Dollar', '901', 'TWD', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'TWD' AND description = 'New Taiwan Dollar' AND numeric_code = '901' AND uom_id = 'TWD' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'TZS', 'Tanzanian Shilling', '834', 'TZS', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'TZS' AND description = 'Tanzanian Shilling' AND numeric_code = '834' AND uom_id = 'TZS' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'UAH', 'Ukrainian Hryvnia', '980', 'UAH', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'UAH' AND description = 'Ukrainian Hryvnia' AND numeric_code = '980' AND uom_id = 'UAH' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'UGX', 'Ugandan Shilling', '800', 'UGX', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'UGX' AND description = 'Ugandan Shilling' AND numeric_code = '800' AND uom_id = 'UGX' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'USD', 'United States Dollar', '840', 'USD', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'USD' AND description = 'United States Dollar' AND numeric_code = '840' AND uom_id = 'USD' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'UYU', 'Uruguay Peso', '858', 'UYU', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'UYU' AND description = 'Uruguay Peso' AND numeric_code = '858' AND uom_id = 'UYU' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'UYI', 'Uruguay Peso en Unidades Indexadas (UI)', '940', 'UYI', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'UYI' AND description = 'Uruguay Peso en Unidades Indexadas (UI)' AND numeric_code = '940' AND uom_id = 'UYI' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'VES', 'Venezuelan Bolívar Soberano', '928', 'VES', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'VES' AND description = 'Venezuelan Bolívar Soberano' AND numeric_code = '928' AND uom_id = 'VES' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'VND', 'Vietnamese Dong', '704', 'VND', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'VND' AND description = 'Vietnamese Dong' AND numeric_code = '704' AND uom_id = 'VND' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'VUV', 'Vanuatu Vatu', '548', 'VUV', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'VUV' AND description = 'Vanuatu Vatu' AND numeric_code = '548' AND uom_id = 'VUV' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'WST', 'Samoan Tala', '882', 'WST', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'WST' AND description = 'Samoan Tala' AND numeric_code = '882' AND uom_id = 'WST' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'XAF', 'Gabon C.f.A Franc', '950', 'XAF', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'XAF' AND description = 'Gabon C.f.A Franc' AND numeric_code = '950' AND uom_id = 'XAF' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'XCD', 'East Carribean Dollar', '951', 'XCD', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'XCD' AND description = 'East Carribean Dollar' AND numeric_code = '951' AND uom_id = 'XCD' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'XOF', 'Benin C.f.A. Franc', '952', 'XOF', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'XOF' AND description = 'Benin C.f.A. Franc' AND numeric_code = '952' AND uom_id = 'XOF' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'YER', 'Yemeni Ryal', '886', 'YER', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'YER' AND description = 'Yemeni Ryal' AND numeric_code = '886' AND uom_id = 'YER' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'ZAR', 'South African Rand', '710', 'ZAR', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'ZAR' AND description = 'South African Rand' AND numeric_code = '710' AND uom_id = 'ZAR' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'ZMW', 'Zambian Kwacha', '967', 'ZMW', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'ZMW' AND description = 'Zambian Kwacha' AND numeric_code = '967' AND uom_id = 'ZMW' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'ZRN', 'New Zaire', '180', 'ZRN', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'ZRN' AND description = 'New Zaire' AND numeric_code = '180' AND uom_id = 'ZRN' AND uom_type_id = 'CURRENCY_MEASURE');

INSERT INTO uom (abbreviation, description, numeric_code, uom_id, uom_type_id)
SELECT 'ZWL', 'Zimbabwe Dollar', '932', 'ZWL', 'CURRENCY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'ZWL' AND description = 'Zimbabwe Dollar' AND numeric_code = '932' AND uom_id = 'ZWL' AND uom_type_id = 'CURRENCY_MEASURE');
