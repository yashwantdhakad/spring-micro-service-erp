INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'AFG', 'AF', 'AFGHANISTAN', '004'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'AFG' AND country_code = 'AF' AND country_name = 'AFGHANISTAN' AND country_number = '004');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'ALA', 'AX', 'ÅLAND ISLANDS', '248'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'ALA' AND country_code = 'AX' AND country_name = 'ÅLAND ISLANDS' AND country_number = '248');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'ALB', 'AL', 'ALBANIA', '008'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'ALB' AND country_code = 'AL' AND country_name = 'ALBANIA' AND country_number = '008');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'ATA', 'AQ', 'ANTARCTICA', '010'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'ATA' AND country_code = 'AQ' AND country_name = 'ANTARCTICA' AND country_number = '010');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'DZA', 'DZ', 'ALGERIA', '012'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'DZA' AND country_code = 'DZ' AND country_name = 'ALGERIA' AND country_number = '012');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'ASM', 'AS', 'AMERICAN SAMOA', '016'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'ASM' AND country_code = 'AS' AND country_name = 'AMERICAN SAMOA' AND country_number = '016');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'AND', 'AD', 'ANDORRA', '020'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'AND' AND country_code = 'AD' AND country_name = 'ANDORRA' AND country_number = '020');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'AGO', 'AO', 'ANGOLA', '024'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'AGO' AND country_code = 'AO' AND country_name = 'ANGOLA' AND country_number = '024');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'ATG', 'AG', 'ANTIGUA AND BARBUDA', '028'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'ATG' AND country_code = 'AG' AND country_name = 'ANTIGUA AND BARBUDA' AND country_number = '028');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'AZE', 'AZ', 'AZERBAIJAN', '031'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'AZE' AND country_code = 'AZ' AND country_name = 'AZERBAIJAN' AND country_number = '031');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'ARG', 'AR', 'ARGENTINA', '032'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'ARG' AND country_code = 'AR' AND country_name = 'ARGENTINA' AND country_number = '032');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'AUS', 'AU', 'AUSTRALIA', '036'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'AUS' AND country_code = 'AU' AND country_name = 'AUSTRALIA' AND country_number = '036');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'AUT', 'AT', 'AUSTRIA', '040'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'AUT' AND country_code = 'AT' AND country_name = 'AUSTRIA' AND country_number = '040');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'BHS', 'BS', 'BAHAMAS', '044'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'BHS' AND country_code = 'BS' AND country_name = 'BAHAMAS' AND country_number = '044');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'BHR', 'BH', 'BAHRAIN', '048'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'BHR' AND country_code = 'BH' AND country_name = 'BAHRAIN' AND country_number = '048');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'BGD', 'BD', 'BANGLADESH', '050'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'BGD' AND country_code = 'BD' AND country_name = 'BANGLADESH' AND country_number = '050');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'ARM', 'AM', 'ARMENIA', '051'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'ARM' AND country_code = 'AM' AND country_name = 'ARMENIA' AND country_number = '051');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'BRB', 'BB', 'BARBADOS', '052'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'BRB' AND country_code = 'BB' AND country_name = 'BARBADOS' AND country_number = '052');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'BEL', 'BE', 'BELGIUM', '056'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'BEL' AND country_code = 'BE' AND country_name = 'BELGIUM' AND country_number = '056');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'BMU', 'BM', 'BERMUDA', '060'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'BMU' AND country_code = 'BM' AND country_name = 'BERMUDA' AND country_number = '060');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'BTN', 'BT', 'BHUTAN', '064'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'BTN' AND country_code = 'BT' AND country_name = 'BHUTAN' AND country_number = '064');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'BOL', 'BO', 'BOLIVIA', '068'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'BOL' AND country_code = 'BO' AND country_name = 'BOLIVIA' AND country_number = '068');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'BES', 'BQ', 'BONAIRE, SINT EUSTATIUS AND SABA', '535'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'BES' AND country_code = 'BQ' AND country_name = 'BONAIRE, SINT EUSTATIUS AND SABA' AND country_number = '535');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'BIH', 'BA', 'BOSNIA AND HERZEGOWINA', '070'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'BIH' AND country_code = 'BA' AND country_name = 'BOSNIA AND HERZEGOWINA' AND country_number = '070');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'BWA', 'BW', 'BOTSWANA', '072'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'BWA' AND country_code = 'BW' AND country_name = 'BOTSWANA' AND country_number = '072');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'BVT', 'BV', 'BOUVET ISLAND', '074'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'BVT' AND country_code = 'BV' AND country_name = 'BOUVET ISLAND' AND country_number = '074');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'BRA', 'BR', 'BRAZIL', '076'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'BRA' AND country_code = 'BR' AND country_name = 'BRAZIL' AND country_number = '076');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'BLZ', 'BZ', 'BELIZE', '084'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'BLZ' AND country_code = 'BZ' AND country_name = 'BELIZE' AND country_number = '084');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'IOT', 'IO', 'BRITISH INDIAN OCEAN TERRITORY', '086'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'IOT' AND country_code = 'IO' AND country_name = 'BRITISH INDIAN OCEAN TERRITORY' AND country_number = '086');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'SLB', 'SB', 'SOLOMON ISLANDS', '090'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'SLB' AND country_code = 'SB' AND country_name = 'SOLOMON ISLANDS' AND country_number = '090');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'VGB', 'VG', 'VIRGIN ISLANDS (BRITISH)', '092'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'VGB' AND country_code = 'VG' AND country_name = 'VIRGIN ISLANDS (BRITISH)' AND country_number = '092');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'BRN', 'BN', 'BRUNEI DARUSSALAM', '096'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'BRN' AND country_code = 'BN' AND country_name = 'BRUNEI DARUSSALAM' AND country_number = '096');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'BGR', 'BG', 'BULGARIA', '100'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'BGR' AND country_code = 'BG' AND country_name = 'BULGARIA' AND country_number = '100');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'MMR', 'MM', 'MYANMAR', '104'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'MMR' AND country_code = 'MM' AND country_name = 'MYANMAR' AND country_number = '104');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'BDI', 'BI', 'BURUNDI', '108'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'BDI' AND country_code = 'BI' AND country_name = 'BURUNDI' AND country_number = '108');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'BLR', 'BY', 'BELARUS', '112'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'BLR' AND country_code = 'BY' AND country_name = 'BELARUS' AND country_number = '112');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'KHM', 'KH', 'CAMBODIA', '116'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'KHM' AND country_code = 'KH' AND country_name = 'CAMBODIA' AND country_number = '116');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'CMR', 'CM', 'CAMEROON', '120'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'CMR' AND country_code = 'CM' AND country_name = 'CAMEROON' AND country_number = '120');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'CAN', 'CA', 'CANADA', '124'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'CAN' AND country_code = 'CA' AND country_name = 'CANADA' AND country_number = '124');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'CPV', 'CV', 'CAPE VERDE', '132'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'CPV' AND country_code = 'CV' AND country_name = 'CAPE VERDE' AND country_number = '132');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'CYM', 'KY', 'CAYMAN ISLANDS', '136'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'CYM' AND country_code = 'KY' AND country_name = 'CAYMAN ISLANDS' AND country_number = '136');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'CAF', 'CF', 'CENTRAL AFRICAN REPUBLIC', '140'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'CAF' AND country_code = 'CF' AND country_name = 'CENTRAL AFRICAN REPUBLIC' AND country_number = '140');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'LKA', 'LK', 'SRI LANKA', '144'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'LKA' AND country_code = 'LK' AND country_name = 'SRI LANKA' AND country_number = '144');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'TCD', 'TD', 'CHAD', '148'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'TCD' AND country_code = 'TD' AND country_name = 'CHAD' AND country_number = '148');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'CHL', 'CL', 'CHILE', '152'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'CHL' AND country_code = 'CL' AND country_name = 'CHILE' AND country_number = '152');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'CHN', 'CN', 'CHINA', '156'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'CHN' AND country_code = 'CN' AND country_name = 'CHINA' AND country_number = '156');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'TWN', 'TW', 'TAIWAN, PROVINCE OF CHINA', '158'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'TWN' AND country_code = 'TW' AND country_name = 'TAIWAN, PROVINCE OF CHINA' AND country_number = '158');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'CXR', 'CX', 'CHRISTMAS ISLAND', '162'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'CXR' AND country_code = 'CX' AND country_name = 'CHRISTMAS ISLAND' AND country_number = '162');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'CCK', 'CC', 'COCOS (KEELING) ISLANDS', '166'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'CCK' AND country_code = 'CC' AND country_name = 'COCOS (KEELING) ISLANDS' AND country_number = '166');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'COL', 'CO', 'COLOMBIA', '170'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'COL' AND country_code = 'CO' AND country_name = 'COLOMBIA' AND country_number = '170');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'COM', 'KM', 'COMOROS', '174'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'COM' AND country_code = 'KM' AND country_name = 'COMOROS' AND country_number = '174');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'MYT', 'YT', 'MAYOTTE', '175'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'MYT' AND country_code = 'YT' AND country_name = 'MAYOTTE' AND country_number = '175');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'COG', 'CG', 'CONGO', '178'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'COG' AND country_code = 'CG' AND country_name = 'CONGO' AND country_number = '178');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'COD', 'CD', 'CONGO, THE DEMOCRATIC REPUBLIC OF THE', '180'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'COD' AND country_code = 'CD' AND country_name = 'CONGO, THE DEMOCRATIC REPUBLIC OF THE' AND country_number = '180');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'COK', 'CK', 'COOK ISLANDS', '184'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'COK' AND country_code = 'CK' AND country_name = 'COOK ISLANDS' AND country_number = '184');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'CRI', 'CR', 'COSTA RICA', '188'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'CRI' AND country_code = 'CR' AND country_name = 'COSTA RICA' AND country_number = '188');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'HRV', 'HR', 'CROATIA (local name: Hrvatska)', '191'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'HRV' AND country_code = 'HR' AND country_name = 'CROATIA (local name: Hrvatska)' AND country_number = '191');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'CUB', 'CU', 'CUBA', '192'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'CUB' AND country_code = 'CU' AND country_name = 'CUBA' AND country_number = '192');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'CUW', 'CW', 'CURAÇAO', '531'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'CUW' AND country_code = 'CW' AND country_name = 'CURAÇAO' AND country_number = '531');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'CYP', 'CY', 'CYPRUS', '196'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'CYP' AND country_code = 'CY' AND country_name = 'CYPRUS' AND country_number = '196');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'CZE', 'CZ', 'CZECHIA', '203'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'CZE' AND country_code = 'CZ' AND country_name = 'CZECHIA' AND country_number = '203');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'BEN', 'BJ', 'BENIN', '204'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'BEN' AND country_code = 'BJ' AND country_name = 'BENIN' AND country_number = '204');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'DNK', 'DK', 'DENMARK', '208'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'DNK' AND country_code = 'DK' AND country_name = 'DENMARK' AND country_number = '208');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'DMA', 'DM', 'DOMINICA', '212'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'DMA' AND country_code = 'DM' AND country_name = 'DOMINICA' AND country_number = '212');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'DOM', 'DO', 'DOMINICAN REPUBLIC', '214'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'DOM' AND country_code = 'DO' AND country_name = 'DOMINICAN REPUBLIC' AND country_number = '214');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'ECU', 'EC', 'ECUADOR', '218'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'ECU' AND country_code = 'EC' AND country_name = 'ECUADOR' AND country_number = '218');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'SLV', 'SV', 'EL SALVADOR', '222'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'SLV' AND country_code = 'SV' AND country_name = 'EL SALVADOR' AND country_number = '222');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'GNQ', 'GQ', 'EQUATORIAL GUINEA', '226'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'GNQ' AND country_code = 'GQ' AND country_name = 'EQUATORIAL GUINEA' AND country_number = '226');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'ETH', 'ET', 'ETHIOPIA', '231'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'ETH' AND country_code = 'ET' AND country_name = 'ETHIOPIA' AND country_number = '231');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'ERI', 'ER', 'ERITREA', '232'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'ERI' AND country_code = 'ER' AND country_name = 'ERITREA' AND country_number = '232');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'EST', 'EE', 'ESTONIA', '233'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'EST' AND country_code = 'EE' AND country_name = 'ESTONIA' AND country_number = '233');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'FRO', 'FO', 'FAROE ISLANDS', '234'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'FRO' AND country_code = 'FO' AND country_name = 'FAROE ISLANDS' AND country_number = '234');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'FLK', 'FK', 'FALKLAND ISLANDS (MALVINAS)', '238'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'FLK' AND country_code = 'FK' AND country_name = 'FALKLAND ISLANDS (MALVINAS)' AND country_number = '238');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'SGS', 'GS', 'SOUTH GEORGIA AND THE SOUTH SANDWICH ISLANDS', '239'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'SGS' AND country_code = 'GS' AND country_name = 'SOUTH GEORGIA AND THE SOUTH SANDWICH ISLANDS' AND country_number = '239');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'FJI', 'FJ', 'FIJI', '242'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'FJI' AND country_code = 'FJ' AND country_name = 'FIJI' AND country_number = '242');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'FIN', 'FI', 'FINLAND', '246'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'FIN' AND country_code = 'FI' AND country_name = 'FINLAND' AND country_number = '246');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'FXX', 'FX', 'FRANCE, METROPOLITAN', '249'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'FXX' AND country_code = 'FX' AND country_name = 'FRANCE, METROPOLITAN' AND country_number = '249');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'FRA', 'FR', 'FRANCE', '250'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'FRA' AND country_code = 'FR' AND country_name = 'FRANCE' AND country_number = '250');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'GUF', 'GF', 'FRENCH GUIANA', '254'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'GUF' AND country_code = 'GF' AND country_name = 'FRENCH GUIANA' AND country_number = '254');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'PYF', 'PF', 'FRENCH POLYNESIA', '258'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'PYF' AND country_code = 'PF' AND country_name = 'FRENCH POLYNESIA' AND country_number = '258');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'ATF', 'TF', 'FRENCH SOUTHERN TERRITORIES', '260'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'ATF' AND country_code = 'TF' AND country_name = 'FRENCH SOUTHERN TERRITORIES' AND country_number = '260');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'DJI', 'DJ', 'DJIBOUTI', '262'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'DJI' AND country_code = 'DJ' AND country_name = 'DJIBOUTI' AND country_number = '262');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'GAB', 'GA', 'GABON', '266'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'GAB' AND country_code = 'GA' AND country_name = 'GABON' AND country_number = '266');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'GEO', 'GE', 'GEORGIA', '268'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'GEO' AND country_code = 'GE' AND country_name = 'GEORGIA' AND country_number = '268');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'GMB', 'GM', 'GAMBIA', '270'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'GMB' AND country_code = 'GM' AND country_name = 'GAMBIA' AND country_number = '270');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'GGY', 'GG', 'GUERNSEY', '831'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'GGY' AND country_code = 'GG' AND country_name = 'GUERNSEY' AND country_number = '831');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'PSE', 'PS', 'PALESTINIAN TERRITORY, OCCUPIED', '275'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'PSE' AND country_code = 'PS' AND country_name = 'PALESTINIAN TERRITORY, OCCUPIED' AND country_number = '275');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'DEU', 'DE', 'GERMANY', '276'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'DEU' AND country_code = 'DE' AND country_name = 'GERMANY' AND country_number = '276');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'GHA', 'GH', 'GHANA', '288'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'GHA' AND country_code = 'GH' AND country_name = 'GHANA' AND country_number = '288');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'GIB', 'GI', 'GIBRALTAR', '292'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'GIB' AND country_code = 'GI' AND country_name = 'GIBRALTAR' AND country_number = '292');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'KIR', 'KI', 'KIRIBATI', '296'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'KIR' AND country_code = 'KI' AND country_name = 'KIRIBATI' AND country_number = '296');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'GRC', 'GR', 'GREECE', '300'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'GRC' AND country_code = 'GR' AND country_name = 'GREECE' AND country_number = '300');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'GRL', 'GL', 'GREENLAND', '304'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'GRL' AND country_code = 'GL' AND country_name = 'GREENLAND' AND country_number = '304');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'GRD', 'GD', 'GRENADA', '308'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'GRD' AND country_code = 'GD' AND country_name = 'GRENADA' AND country_number = '308');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'GLP', 'GP', 'GUADELOUPE', '312'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'GLP' AND country_code = 'GP' AND country_name = 'GUADELOUPE' AND country_number = '312');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'GUM', 'GU', 'GUAM', '316'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'GUM' AND country_code = 'GU' AND country_name = 'GUAM' AND country_number = '316');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'GTM', 'GT', 'GUATEMALA', '320'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'GTM' AND country_code = 'GT' AND country_name = 'GUATEMALA' AND country_number = '320');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'GIN', 'GN', 'GUINEA', '324'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'GIN' AND country_code = 'GN' AND country_name = 'GUINEA' AND country_number = '324');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'GUY', 'GY', 'GUYANA', '328'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'GUY' AND country_code = 'GY' AND country_name = 'GUYANA' AND country_number = '328');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'HTI', 'HT', 'HAITI', '332'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'HTI' AND country_code = 'HT' AND country_name = 'HAITI' AND country_number = '332');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'HMD', 'HM', 'HEARD AND MC DONALD ISLANDS', '334'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'HMD' AND country_code = 'HM' AND country_name = 'HEARD AND MC DONALD ISLANDS' AND country_number = '334');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'VAT', 'VA', 'HOLY SEE (VATICAN CITY STATE)', '336'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'VAT' AND country_code = 'VA' AND country_name = 'HOLY SEE (VATICAN CITY STATE)' AND country_number = '336');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'HND', 'HN', 'HONDURAS', '340'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'HND' AND country_code = 'HN' AND country_name = 'HONDURAS' AND country_number = '340');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'HKG', 'HK', 'HONG KONG', '344'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'HKG' AND country_code = 'HK' AND country_name = 'HONG KONG' AND country_number = '344');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'HUN', 'HU', 'HUNGARY', '348'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'HUN' AND country_code = 'HU' AND country_name = 'HUNGARY' AND country_number = '348');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'ISL', 'IS', 'ICELAND', '352'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'ISL' AND country_code = 'IS' AND country_name = 'ICELAND' AND country_number = '352');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'IND', 'IN', 'INDIA', '356'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'IND' AND country_code = 'IN' AND country_name = 'INDIA' AND country_number = '356');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'IDN', 'ID', 'INDONESIA', '360'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'IDN' AND country_code = 'ID' AND country_name = 'INDONESIA' AND country_number = '360');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'IRN', 'IR', 'IRAN (ISLAMIC REPUBLIC OF)', '364'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'IRN' AND country_code = 'IR' AND country_name = 'IRAN (ISLAMIC REPUBLIC OF)' AND country_number = '364');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'IRQ', 'IQ', 'IRAQ', '368'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'IRQ' AND country_code = 'IQ' AND country_name = 'IRAQ' AND country_number = '368');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'IRL', 'IE', 'IRELAND', '372'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'IRL' AND country_code = 'IE' AND country_name = 'IRELAND' AND country_number = '372');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'IMN', 'IM', 'ISLE OF MAN', '833'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'IMN' AND country_code = 'IM' AND country_name = 'ISLE OF MAN' AND country_number = '833');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'ISR', 'IL', 'ISRAEL', '376'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'ISR' AND country_code = 'IL' AND country_name = 'ISRAEL' AND country_number = '376');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'ITA', 'IT', 'ITALY', '380'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'ITA' AND country_code = 'IT' AND country_name = 'ITALY' AND country_number = '380');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'CIV', 'CI', 'COTE D''IVOIRE', '384'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'CIV' AND country_code = 'CI' AND country_name = 'COTE D''IVOIRE' AND country_number = '384');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'JAM', 'JM', 'JAMAICA', '388'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'JAM' AND country_code = 'JM' AND country_name = 'JAMAICA' AND country_number = '388');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'JPN', 'JP', 'JAPAN', '392'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'JPN' AND country_code = 'JP' AND country_name = 'JAPAN' AND country_number = '392');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'JEY', 'JE', 'JERSEY', '832'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'JEY' AND country_code = 'JE' AND country_name = 'JERSEY' AND country_number = '832');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'KAZ', 'KZ', 'KAZAKHSTAN', '398'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'KAZ' AND country_code = 'KZ' AND country_name = 'KAZAKHSTAN' AND country_number = '398');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'JOR', 'JO', 'JORDAN', '400'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'JOR' AND country_code = 'JO' AND country_name = 'JORDAN' AND country_number = '400');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'KEN', 'KE', 'KENYA', '404'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'KEN' AND country_code = 'KE' AND country_name = 'KENYA' AND country_number = '404');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'PRK', 'KP', 'KOREA, DEMOCRATIC PEOPLE''S REPUBLIC OF', '408'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'PRK' AND country_code = 'KP' AND country_name = 'KOREA, DEMOCRATIC PEOPLE''S REPUBLIC OF' AND country_number = '408');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'KOR', 'KR', 'KOREA, REPUBLIC OF', '410'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'KOR' AND country_code = 'KR' AND country_name = 'KOREA, REPUBLIC OF' AND country_number = '410');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'KWT', 'KW', 'KUWAIT', '414'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'KWT' AND country_code = 'KW' AND country_name = 'KUWAIT' AND country_number = '414');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'KGZ', 'KG', 'KYRGYZSTAN', '417'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'KGZ' AND country_code = 'KG' AND country_name = 'KYRGYZSTAN' AND country_number = '417');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'LAO', 'LA', 'LAO PEOPLE''S DEMOCRATIC REPUBLIC', '418'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'LAO' AND country_code = 'LA' AND country_name = 'LAO PEOPLE''S DEMOCRATIC REPUBLIC' AND country_number = '418');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'LBN', 'LB', 'LEBANON', '422'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'LBN' AND country_code = 'LB' AND country_name = 'LEBANON' AND country_number = '422');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'LSO', 'LS', 'LESOTHO', '426'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'LSO' AND country_code = 'LS' AND country_name = 'LESOTHO' AND country_number = '426');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'LVA', 'LV', 'LATVIA', '428'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'LVA' AND country_code = 'LV' AND country_name = 'LATVIA' AND country_number = '428');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'LBR', 'LR', 'LIBERIA', '430'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'LBR' AND country_code = 'LR' AND country_name = 'LIBERIA' AND country_number = '430');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'LBY', 'LY', 'LIBYAN ARAB JAMAHIRIYA', '434'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'LBY' AND country_code = 'LY' AND country_name = 'LIBYAN ARAB JAMAHIRIYA' AND country_number = '434');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'LIE', 'LI', 'LIECHTENSTEIN', '438'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'LIE' AND country_code = 'LI' AND country_name = 'LIECHTENSTEIN' AND country_number = '438');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'LTU', 'LT', 'LITHUANIA', '440'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'LTU' AND country_code = 'LT' AND country_name = 'LITHUANIA' AND country_number = '440');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'LUX', 'LU', 'LUXEMBOURG', '442'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'LUX' AND country_code = 'LU' AND country_name = 'LUXEMBOURG' AND country_number = '442');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'MAC', 'MO', 'MACAU', '446'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'MAC' AND country_code = 'MO' AND country_name = 'MACAU' AND country_number = '446');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'MDG', 'MG', 'MADAGASCAR', '450'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'MDG' AND country_code = 'MG' AND country_name = 'MADAGASCAR' AND country_number = '450');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'MWI', 'MW', 'MALAWI', '454'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'MWI' AND country_code = 'MW' AND country_name = 'MALAWI' AND country_number = '454');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'MYS', 'MY', 'MALAYSIA', '458'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'MYS' AND country_code = 'MY' AND country_name = 'MALAYSIA' AND country_number = '458');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'MDV', 'MV', 'MALDIVES', '462'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'MDV' AND country_code = 'MV' AND country_name = 'MALDIVES' AND country_number = '462');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'MLI', 'ML', 'MALI', '466'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'MLI' AND country_code = 'ML' AND country_name = 'MALI' AND country_number = '466');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'MLT', 'MT', 'MALTA', '470'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'MLT' AND country_code = 'MT' AND country_name = 'MALTA' AND country_number = '470');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'MTQ', 'MQ', 'MARTINIQUE', '474'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'MTQ' AND country_code = 'MQ' AND country_name = 'MARTINIQUE' AND country_number = '474');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'MRT', 'MR', 'MAURITANIA', '478'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'MRT' AND country_code = 'MR' AND country_name = 'MAURITANIA' AND country_number = '478');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'MUS', 'MU', 'MAURITIUS', '480'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'MUS' AND country_code = 'MU' AND country_name = 'MAURITIUS' AND country_number = '480');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'MEX', 'MX', 'MEXICO', '484'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'MEX' AND country_code = 'MX' AND country_name = 'MEXICO' AND country_number = '484');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'MCO', 'MC', 'MONACO', '492'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'MCO' AND country_code = 'MC' AND country_name = 'MONACO' AND country_number = '492');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'MNG', 'MN', 'MONGOLIA', '496'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'MNG' AND country_code = 'MN' AND country_name = 'MONGOLIA' AND country_number = '496');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'MNE', 'ME', 'MONTENEGRO', '499'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'MNE' AND country_code = 'ME' AND country_name = 'MONTENEGRO' AND country_number = '499');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'MDA', 'MD', 'MOLDOVA, REPUBLIC OF', '498'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'MDA' AND country_code = 'MD' AND country_name = 'MOLDOVA, REPUBLIC OF' AND country_number = '498');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'MSR', 'MS', 'MONTSERRAT', '500'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'MSR' AND country_code = 'MS' AND country_name = 'MONTSERRAT' AND country_number = '500');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'MAR', 'MA', 'MOROCCO', '504'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'MAR' AND country_code = 'MA' AND country_name = 'MOROCCO' AND country_number = '504');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'MOZ', 'MZ', 'MOZAMBIQUE', '508'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'MOZ' AND country_code = 'MZ' AND country_name = 'MOZAMBIQUE' AND country_number = '508');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'OMN', 'OM', 'OMAN', '512'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'OMN' AND country_code = 'OM' AND country_name = 'OMAN' AND country_number = '512');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'NAM', 'NA', 'NAMIBIA', '516'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'NAM' AND country_code = 'NA' AND country_name = 'NAMIBIA' AND country_number = '516');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'NRU', 'NR', 'NAURU', '520'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'NRU' AND country_code = 'NR' AND country_name = 'NAURU' AND country_number = '520');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'NPL', 'NP', 'NEPAL', '524'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'NPL' AND country_code = 'NP' AND country_name = 'NEPAL' AND country_number = '524');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'NLD', 'NL', 'NETHERLANDS', '528'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'NLD' AND country_code = 'NL' AND country_name = 'NETHERLANDS' AND country_number = '528');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'ANT', 'AN', 'NETHERLANDS ANTILLES', '530'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'ANT' AND country_code = 'AN' AND country_name = 'NETHERLANDS ANTILLES' AND country_number = '530');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'ABW', 'AW', 'ARUBA', '533'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'ABW' AND country_code = 'AW' AND country_name = 'ARUBA' AND country_number = '533');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'NCL', 'NC', 'NEW CALEDONIA', '540'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'NCL' AND country_code = 'NC' AND country_name = 'NEW CALEDONIA' AND country_number = '540');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'VUT', 'VU', 'VANUATU', '548'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'VUT' AND country_code = 'VU' AND country_name = 'VANUATU' AND country_number = '548');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'NZL', 'NZ', 'NEW ZEALAND', '554'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'NZL' AND country_code = 'NZ' AND country_name = 'NEW ZEALAND' AND country_number = '554');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'NIC', 'NI', 'NICARAGUA', '558'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'NIC' AND country_code = 'NI' AND country_name = 'NICARAGUA' AND country_number = '558');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'NER', 'NE', 'NIGER', '562'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'NER' AND country_code = 'NE' AND country_name = 'NIGER' AND country_number = '562');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'NGA', 'NG', 'NIGERIA', '566'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'NGA' AND country_code = 'NG' AND country_name = 'NIGERIA' AND country_number = '566');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'NIU', 'NU', 'NIUE', '570'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'NIU' AND country_code = 'NU' AND country_name = 'NIUE' AND country_number = '570');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'NFK', 'NF', 'NORFOLK ISLAND', '574'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'NFK' AND country_code = 'NF' AND country_name = 'NORFOLK ISLAND' AND country_number = '574');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'NOR', 'NO', 'NORWAY', '578'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'NOR' AND country_code = 'NO' AND country_name = 'NORWAY' AND country_number = '578');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'MNP', 'MP', 'NORTHERN MARIANA ISLANDS', '580'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'MNP' AND country_code = 'MP' AND country_name = 'NORTHERN MARIANA ISLANDS' AND country_number = '580');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'UMI', 'UM', 'UNITED STATES MINOR OUTLYING ISLANDS', '581'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'UMI' AND country_code = 'UM' AND country_name = 'UNITED STATES MINOR OUTLYING ISLANDS' AND country_number = '581');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'FSM', 'FM', 'MICRONESIA, FEDERATED STATES OF', '583'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'FSM' AND country_code = 'FM' AND country_name = 'MICRONESIA, FEDERATED STATES OF' AND country_number = '583');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'MHL', 'MH', 'MARSHALL ISLANDS', '584'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'MHL' AND country_code = 'MH' AND country_name = 'MARSHALL ISLANDS' AND country_number = '584');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'PLW', 'PW', 'PALAU', '585'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'PLW' AND country_code = 'PW' AND country_name = 'PALAU' AND country_number = '585');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'PAK', 'PK', 'PAKISTAN', '586'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'PAK' AND country_code = 'PK' AND country_name = 'PAKISTAN' AND country_number = '586');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'PAN', 'PA', 'PANAMA', '591'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'PAN' AND country_code = 'PA' AND country_name = 'PANAMA' AND country_number = '591');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'PNG', 'PG', 'PAPUA NEW GUINEA', '598'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'PNG' AND country_code = 'PG' AND country_name = 'PAPUA NEW GUINEA' AND country_number = '598');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'PRY', 'PY', 'PARAGUAY', '600'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'PRY' AND country_code = 'PY' AND country_name = 'PARAGUAY' AND country_number = '600');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'PER', 'PE', 'PERU', '604'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'PER' AND country_code = 'PE' AND country_name = 'PERU' AND country_number = '604');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'PHL', 'PH', 'PHILIPPINES', '608'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'PHL' AND country_code = 'PH' AND country_name = 'PHILIPPINES' AND country_number = '608');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'PCN', 'PN', 'PITCAIRN', '612'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'PCN' AND country_code = 'PN' AND country_name = 'PITCAIRN' AND country_number = '612');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'POL', 'PL', 'POLAND', '616'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'POL' AND country_code = 'PL' AND country_name = 'POLAND' AND country_number = '616');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'PRT', 'PT', 'PORTUGAL', '620'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'PRT' AND country_code = 'PT' AND country_name = 'PORTUGAL' AND country_number = '620');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'GNB', 'GW', 'GUINEA-BISSAU', '624'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'GNB' AND country_code = 'GW' AND country_name = 'GUINEA-BISSAU' AND country_number = '624');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'TMP', 'TP', 'EAST TIMOR', '626'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'TMP' AND country_code = 'TP' AND country_name = 'EAST TIMOR' AND country_number = '626');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'PRI', 'PR', 'PUERTO RICO', '630'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'PRI' AND country_code = 'PR' AND country_name = 'PUERTO RICO' AND country_number = '630');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'QAT', 'QA', 'QATAR', '634'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'QAT' AND country_code = 'QA' AND country_name = 'QATAR' AND country_number = '634');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'REU', 'RE', 'REUNION', '638'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'REU' AND country_code = 'RE' AND country_name = 'REUNION' AND country_number = '638');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'ROM', 'RO', 'ROMANIA', '642'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'ROM' AND country_code = 'RO' AND country_name = 'ROMANIA' AND country_number = '642');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'RUS', 'RU', 'RUSSIAN FEDERATION', '643'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'RUS' AND country_code = 'RU' AND country_name = 'RUSSIAN FEDERATION' AND country_number = '643');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'RWA', 'RW', 'RWANDA', '646'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'RWA' AND country_code = 'RW' AND country_name = 'RWANDA' AND country_number = '646');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'SHN', 'SH', 'ST. HELENA', '654'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'SHN' AND country_code = 'SH' AND country_name = 'ST. HELENA' AND country_number = '654');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'KNA', 'KN', 'SAINT KITTS AND NEVIS', '659'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'KNA' AND country_code = 'KN' AND country_name = 'SAINT KITTS AND NEVIS' AND country_number = '659');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'AIA', 'AI', 'ANGUILLA', '660'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'AIA' AND country_code = 'AI' AND country_name = 'ANGUILLA' AND country_number = '660');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'LCA', 'LC', 'SAINT LUCIA', '662'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'LCA' AND country_code = 'LC' AND country_name = 'SAINT LUCIA' AND country_number = '662');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'BLM', 'BL', 'SAINT BARTHÉLEMY', '652'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'BLM' AND country_code = 'BL' AND country_name = 'SAINT BARTHÉLEMY' AND country_number = '652');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'MAF', 'MF', 'SAINT MARTIN (FRENCH PART)', '663'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'MAF' AND country_code = 'MF' AND country_name = 'SAINT MARTIN (FRENCH PART)' AND country_number = '663');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'SPM', 'PM', 'ST. PIERRE AND MIQUELON', '666'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'SPM' AND country_code = 'PM' AND country_name = 'ST. PIERRE AND MIQUELON' AND country_number = '666');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'VCT', 'VC', 'SAINT VINCENT AND THE GRENADINES', '670'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'VCT' AND country_code = 'VC' AND country_name = 'SAINT VINCENT AND THE GRENADINES' AND country_number = '670');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'SMR', 'SM', 'SAN MARINO', '674'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'SMR' AND country_code = 'SM' AND country_name = 'SAN MARINO' AND country_number = '674');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'STP', 'ST', 'SAO TOME AND PRINCIPE', '678'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'STP' AND country_code = 'ST' AND country_name = 'SAO TOME AND PRINCIPE' AND country_number = '678');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'SAU', 'SA', 'SAUDI ARABIA', '682'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'SAU' AND country_code = 'SA' AND country_name = 'SAUDI ARABIA' AND country_number = '682');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'SEN', 'SN', 'SENEGAL', '686'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'SEN' AND country_code = 'SN' AND country_name = 'SENEGAL' AND country_number = '686');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'SRB', 'RS', 'SERBIA', '688'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'SRB' AND country_code = 'RS' AND country_name = 'SERBIA' AND country_number = '688');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'SYC', 'SC', 'SEYCHELLES', '690'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'SYC' AND country_code = 'SC' AND country_name = 'SEYCHELLES' AND country_number = '690');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'SLE', 'SL', 'SIERRA LEONE', '694'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'SLE' AND country_code = 'SL' AND country_name = 'SIERRA LEONE' AND country_number = '694');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'SGP', 'SG', 'SINGAPORE', '702'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'SGP' AND country_code = 'SG' AND country_name = 'SINGAPORE' AND country_number = '702');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'SXM', 'SX', 'SINT MAARTEN (DUTCH PART)', '534'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'SXM' AND country_code = 'SX' AND country_name = 'SINT MAARTEN (DUTCH PART)' AND country_number = '534');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'SVK', 'SK', 'SLOVAKIA (Slovak Republic)', '703'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'SVK' AND country_code = 'SK' AND country_name = 'SLOVAKIA (Slovak Republic)' AND country_number = '703');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'VNM', 'VN', 'VIET NAM', '704'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'VNM' AND country_code = 'VN' AND country_name = 'VIET NAM' AND country_number = '704');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'SVN', 'SI', 'SLOVENIA', '705'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'SVN' AND country_code = 'SI' AND country_name = 'SLOVENIA' AND country_number = '705');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'SOM', 'SO', 'SOMALIA', '706'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'SOM' AND country_code = 'SO' AND country_name = 'SOMALIA' AND country_number = '706');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'ZAF', 'ZA', 'SOUTH AFRICA', '710'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'ZAF' AND country_code = 'ZA' AND country_name = 'SOUTH AFRICA' AND country_number = '710');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'SSD', 'SS', 'SOUTH SUDAN', '728'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'SSD' AND country_code = 'SS' AND country_name = 'SOUTH SUDAN' AND country_number = '728');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'ZWE', 'ZW', 'ZIMBABWE', '716'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'ZWE' AND country_code = 'ZW' AND country_name = 'ZIMBABWE' AND country_number = '716');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'ESP', 'ES', 'SPAIN', '724'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'ESP' AND country_code = 'ES' AND country_name = 'SPAIN' AND country_number = '724');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'ESH', 'EH', 'WESTERN SAHARA', '732'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'ESH' AND country_code = 'EH' AND country_name = 'WESTERN SAHARA' AND country_number = '732');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'SDN', 'SD', 'SUDAN', '736'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'SDN' AND country_code = 'SD' AND country_name = 'SUDAN' AND country_number = '736');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'SUR', 'SR', 'SURINAME', '740'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'SUR' AND country_code = 'SR' AND country_name = 'SURINAME' AND country_number = '740');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'SJM', 'SJ', 'SVALBARD AND JAN MAYEN ISLANDS', '744'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'SJM' AND country_code = 'SJ' AND country_name = 'SVALBARD AND JAN MAYEN ISLANDS' AND country_number = '744');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'SWZ', 'SZ', 'SWAZILAND', '748'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'SWZ' AND country_code = 'SZ' AND country_name = 'SWAZILAND' AND country_number = '748');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'SWE', 'SE', 'SWEDEN', '752'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'SWE' AND country_code = 'SE' AND country_name = 'SWEDEN' AND country_number = '752');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'CHE', 'CH', 'SWITZERLAND', '756'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'CHE' AND country_code = 'CH' AND country_name = 'SWITZERLAND' AND country_number = '756');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'SYR', 'SY', 'SYRIAN ARAB REPUBLIC', '760'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'SYR' AND country_code = 'SY' AND country_name = 'SYRIAN ARAB REPUBLIC' AND country_number = '760');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'TJK', 'TJ', 'TAJIKISTAN', '762'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'TJK' AND country_code = 'TJ' AND country_name = 'TAJIKISTAN' AND country_number = '762');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'THA', 'TH', 'THAILAND', '764'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'THA' AND country_code = 'TH' AND country_name = 'THAILAND' AND country_number = '764');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'TGO', 'TG', 'TOGO', '768'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'TGO' AND country_code = 'TG' AND country_name = 'TOGO' AND country_number = '768');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'TKL', 'TK', 'TOKELAU', '772'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'TKL' AND country_code = 'TK' AND country_name = 'TOKELAU' AND country_number = '772');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'TON', 'TO', 'TONGA', '776'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'TON' AND country_code = 'TO' AND country_name = 'TONGA' AND country_number = '776');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'TTO', 'TT', 'TRINIDAD AND TOBAGO', '780'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'TTO' AND country_code = 'TT' AND country_name = 'TRINIDAD AND TOBAGO' AND country_number = '780');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'ARE', 'AE', 'UNITED ARAB EMIRATES', '784'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'ARE' AND country_code = 'AE' AND country_name = 'UNITED ARAB EMIRATES' AND country_number = '784');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'TUN', 'TN', 'TUNISIA', '788'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'TUN' AND country_code = 'TN' AND country_name = 'TUNISIA' AND country_number = '788');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'TUR', 'TR', 'TURKEY', '792'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'TUR' AND country_code = 'TR' AND country_name = 'TURKEY' AND country_number = '792');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'TKM', 'TM', 'TURKMENISTAN', '795'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'TKM' AND country_code = 'TM' AND country_name = 'TURKMENISTAN' AND country_number = '795');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'TCA', 'TC', 'TURKS AND CAICOS ISLANDS', '796'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'TCA' AND country_code = 'TC' AND country_name = 'TURKS AND CAICOS ISLANDS' AND country_number = '796');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'TUV', 'TV', 'TUVALU', '798'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'TUV' AND country_code = 'TV' AND country_name = 'TUVALU' AND country_number = '798');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'UGA', 'UG', 'UGANDA', '800'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'UGA' AND country_code = 'UG' AND country_name = 'UGANDA' AND country_number = '800');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'UKR', 'UA', 'UKRAINE', '804'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'UKR' AND country_code = 'UA' AND country_name = 'UKRAINE' AND country_number = '804');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'MKD', 'MK', 'MACEDONIA, THE FORMER YUGOSLAV REPUBLIC OF', '807'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'MKD' AND country_code = 'MK' AND country_name = 'MACEDONIA, THE FORMER YUGOSLAV REPUBLIC OF' AND country_number = '807');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'EGY', 'EG', 'EGYPT', '818'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'EGY' AND country_code = 'EG' AND country_name = 'EGYPT' AND country_number = '818');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'GBR', 'GB', 'UNITED KINGDOM', '826'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'GBR' AND country_code = 'GB' AND country_name = 'UNITED KINGDOM' AND country_number = '826');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'TZA', 'TZ', 'TANZANIA, UNITED REPUBLIC OF', '834'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'TZA' AND country_code = 'TZ' AND country_name = 'TANZANIA, UNITED REPUBLIC OF' AND country_number = '834');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'USA', 'US', 'UNITED STATES', '840'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'USA' AND country_code = 'US' AND country_name = 'UNITED STATES' AND country_number = '840');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'VIR', 'VI', 'VIRGIN ISLANDS (U.S.)', '850'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'VIR' AND country_code = 'VI' AND country_name = 'VIRGIN ISLANDS (U.S.)' AND country_number = '850');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'BFA', 'BF', 'BURKINA FASO', '854'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'BFA' AND country_code = 'BF' AND country_name = 'BURKINA FASO' AND country_number = '854');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'URY', 'UY', 'URUGUAY', '858'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'URY' AND country_code = 'UY' AND country_name = 'URUGUAY' AND country_number = '858');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'UZB', 'UZ', 'UZBEKISTAN', '860'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'UZB' AND country_code = 'UZ' AND country_name = 'UZBEKISTAN' AND country_number = '860');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'VEN', 'VE', 'VENEZUELA', '862'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'VEN' AND country_code = 'VE' AND country_name = 'VENEZUELA' AND country_number = '862');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'WLF', 'WF', 'WALLIS AND FUTUNA ISLANDS', '876'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'WLF' AND country_code = 'WF' AND country_name = 'WALLIS AND FUTUNA ISLANDS' AND country_number = '876');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'WSM', 'WS', 'SAMOA', '882'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'WSM' AND country_code = 'WS' AND country_name = 'SAMOA' AND country_number = '882');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'YEM', 'YE', 'YEMEN', '887'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'YEM' AND country_code = 'YE' AND country_name = 'YEMEN' AND country_number = '887');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'ZMB', 'ZM', 'ZAMBIA', '894'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'ZMB' AND country_code = 'ZM' AND country_name = 'ZAMBIA' AND country_number = '894');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'SCOT', 'SCT', 'SCOTLAND', '895'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'SCOT' AND country_code = 'SCT' AND country_name = 'SCOTLAND' AND country_number = '895');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'ENGL', 'ENG', 'ENGLAND', '896'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'ENGL' AND country_code = 'ENG' AND country_name = 'ENGLAND' AND country_number = '896');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'NIRL', 'NIR', 'N.IRELAND', '897'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'NIRL' AND country_code = 'NIR' AND country_name = 'N.IRELAND' AND country_number = '897');

INSERT INTO country_code (country_abbr, country_code, country_name, country_number)
SELECT 'WALS', 'WLS', 'WALES', '898'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_abbr = 'WALS' AND country_code = 'WLS' AND country_name = 'WALES' AND country_number = '898');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Edinburgh', 'SCT'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Edinburgh' AND country_code = 'SCT');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'London', 'ENG'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'London' AND country_code = 'ENG');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Belfast', 'NIR'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Belfast' AND country_code = 'NIR');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Cardiff', 'WLS'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Cardiff' AND country_code = 'WLS');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Andorra', 'AD'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Andorra' AND country_code = 'AD');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Abu Dhabi', 'AE'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Abu Dhabi' AND country_code = 'AE');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Kabul', 'AF'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Kabul' AND country_code = 'AF');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'St. Johns', 'AG'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'St. Johns' AND country_code = 'AG');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'The Valley', 'AI'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'The Valley' AND country_code = 'AI');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Tiran', 'AL'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Tiran' AND country_code = 'AL');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Yerevan', 'AM'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Yerevan' AND country_code = 'AM');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Willemstad', 'AN'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Willemstad' AND country_code = 'AN');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Luanda', 'AO'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Luanda' AND country_code = 'AO');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'None', 'AQ'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'None' AND country_code = 'AQ');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Buenos Aires', 'AR'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Buenos Aires' AND country_code = 'AR');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Pago Pago', 'AS'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Pago Pago' AND country_code = 'AS');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Vienna', 'AT'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Vienna' AND country_code = 'AT');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Canberra', 'AU'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Canberra' AND country_code = 'AU');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Oranjestad', 'AW'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Oranjestad' AND country_code = 'AW');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Baku', 'AZ'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Baku' AND country_code = 'AZ');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Sarajevo', 'BA'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Sarajevo' AND country_code = 'BA');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Bridgetown', 'BB'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Bridgetown' AND country_code = 'BB');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Dhaka', 'BD'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Dhaka' AND country_code = 'BD');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Brussels', 'BE'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Brussels' AND country_code = 'BE');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Ouagadougou', 'BF'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Ouagadougou' AND country_code = 'BF');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Sofia', 'BG'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Sofia' AND country_code = 'BG');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Al-Manamah', 'BH'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Al-Manamah' AND country_code = 'BH');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Bujumbura', 'BI'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Bujumbura' AND country_code = 'BI');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Porto-Novo', 'BJ'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Porto-Novo' AND country_code = 'BJ');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Hamilton', 'BM'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Hamilton' AND country_code = 'BM');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Bandar Seri Begawan', 'BN'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Bandar Seri Begawan' AND country_code = 'BN');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'La Paz', 'BO'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'La Paz' AND country_code = 'BO');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Brasilia', 'BR'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Brasilia' AND country_code = 'BR');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Nassau', 'BS'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Nassau' AND country_code = 'BS');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Thimphu', 'BT'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Thimphu' AND country_code = 'BT');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'None', 'BV'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'None' AND country_code = 'BV');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Gaborone', 'BW'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Gaborone' AND country_code = 'BW');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Minsk', 'BY'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Minsk' AND country_code = 'BY');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Belmopan', 'BZ'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Belmopan' AND country_code = 'BZ');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Ottawa', 'CA'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Ottawa' AND country_code = 'CA');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'West Island', 'CC'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'West Island' AND country_code = 'CC');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Kinshasa', 'CD'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Kinshasa' AND country_code = 'CD');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Bangui', 'CF'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Bangui' AND country_code = 'CF');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Brazzaville', 'CG'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Brazzaville' AND country_code = 'CG');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Bern', 'CH'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Bern' AND country_code = 'CH');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Abidjan', 'CI'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Abidjan' AND country_code = 'CI');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Avarua', 'CK'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Avarua' AND country_code = 'CK');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Santiago', 'CL'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Santiago' AND country_code = 'CL');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Yaounde', 'CM'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Yaounde' AND country_code = 'CM');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Beijing', 'CN'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Beijing' AND country_code = 'CN');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Bogota', 'CO'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Bogota' AND country_code = 'CO');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'San Jose', 'CR'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'San Jose' AND country_code = 'CR');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Havana', 'CU'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Havana' AND country_code = 'CU');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Praia', 'CV'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Praia' AND country_code = 'CV');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'The Settlement', 'CX'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'The Settlement' AND country_code = 'CX');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Nicosia', 'CY'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Nicosia' AND country_code = 'CY');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Prague', 'CZ'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Prague' AND country_code = 'CZ');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Berlin', 'DE'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Berlin' AND country_code = 'DE');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Djibouti', 'DJ'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Djibouti' AND country_code = 'DJ');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Copenhagen', 'DK'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Copenhagen' AND country_code = 'DK');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Roseau', 'DM'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Roseau' AND country_code = 'DM');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Santo Domingo', 'DO'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Santo Domingo' AND country_code = 'DO');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Algiers', 'DZ'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Algiers' AND country_code = 'DZ');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Quito', 'EC'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Quito' AND country_code = 'EC');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Tallinn', 'EE'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Tallinn' AND country_code = 'EE');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Cairo', 'EG'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Cairo' AND country_code = 'EG');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'El Aaiun', 'EH'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'El Aaiun' AND country_code = 'EH');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Asmara', 'ER'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Asmara' AND country_code = 'ER');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Madrid', 'ES'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Madrid' AND country_code = 'ES');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Addis Ababa', 'ET'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Addis Ababa' AND country_code = 'ET');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Helsinki', 'FI'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Helsinki' AND country_code = 'FI');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Suva', 'FJ'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Suva' AND country_code = 'FJ');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Stanley', 'FK'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Stanley' AND country_code = 'FK');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Palikir', 'FM'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Palikir' AND country_code = 'FM');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Torshavn', 'FO'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Torshavn' AND country_code = 'FO');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Paris', 'FR'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Paris' AND country_code = 'FR');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Libreville', 'GA'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Libreville' AND country_code = 'GA');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'London', 'GB'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'London' AND country_code = 'GB');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'St. George''s', 'GD'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'St. George''s' AND country_code = 'GD');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Tbilisi', 'GE'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Tbilisi' AND country_code = 'GE');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Cayenne', 'GF'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Cayenne' AND country_code = 'GF');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Accra', 'GH'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Accra' AND country_code = 'GH');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Gibraltar', 'GI'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Gibraltar' AND country_code = 'GI');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Godthab', 'GL'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Godthab' AND country_code = 'GL');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Banjul', 'GM'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Banjul' AND country_code = 'GM');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Conakry', 'GN'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Conakry' AND country_code = 'GN');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Basse-Terre', 'GP'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Basse-Terre' AND country_code = 'GP');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Malabo', 'GQ'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Malabo' AND country_code = 'GQ');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Athens', 'GR'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Athens' AND country_code = 'GR');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'None', 'GS'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'None' AND country_code = 'GS');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Guatemala City', 'GT'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Guatemala City' AND country_code = 'GT');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Agana', 'GU'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Agana' AND country_code = 'GU');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Bissau', 'GW'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Bissau' AND country_code = 'GW');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Georgetown', 'GY'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Georgetown' AND country_code = 'GY');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Victoria', 'HK'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Victoria' AND country_code = 'HK');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'None', 'HM'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'None' AND country_code = 'HM');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Tegucigalpa', 'HN'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Tegucigalpa' AND country_code = 'HN');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Zagreb', 'HR'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Zagreb' AND country_code = 'HR');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Port-au-Prince', 'HT'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Port-au-Prince' AND country_code = 'HT');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Budapest', 'HU'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Budapest' AND country_code = 'HU');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Jakarta', 'ID'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Jakarta' AND country_code = 'ID');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Dublin', 'IE'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Dublin' AND country_code = 'IE');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Jerusalem', 'IL'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Jerusalem' AND country_code = 'IL');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'New Delhi', 'IN'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'New Delhi' AND country_code = 'IN');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'None', 'IO'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'None' AND country_code = 'IO');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Baghdad', 'IQ'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Baghdad' AND country_code = 'IQ');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Tehran', 'IR'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Tehran' AND country_code = 'IR');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Reykjavik', 'IS'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Reykjavik' AND country_code = 'IS');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Rome', 'IT'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Rome' AND country_code = 'IT');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Kingston', 'JM'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Kingston' AND country_code = 'JM');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Amman', 'JO'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Amman' AND country_code = 'JO');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Tokyo', 'JP'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Tokyo' AND country_code = 'JP');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Nairobi', 'KE'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Nairobi' AND country_code = 'KE');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Bishkek', 'KG'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Bishkek' AND country_code = 'KG');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Phnom Penh', 'KH'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Phnom Penh' AND country_code = 'KH');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Tarawa', 'KI'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Tarawa' AND country_code = 'KI');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Moroni', 'KM'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Moroni' AND country_code = 'KM');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Basseterre', 'KN'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Basseterre' AND country_code = 'KN');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Pyongyang', 'KP'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Pyongyang' AND country_code = 'KP');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Seoul', 'KR'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Seoul' AND country_code = 'KR');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Kuwait City', 'KW'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Kuwait City' AND country_code = 'KW');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Georgetown', 'KY'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Georgetown' AND country_code = 'KY');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Astana', 'KZ'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Astana' AND country_code = 'KZ');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Vientiane', 'LA'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Vientiane' AND country_code = 'LA');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Beirut', 'LB'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Beirut' AND country_code = 'LB');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Castries', 'LC'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Castries' AND country_code = 'LC');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Vaduz', 'LI'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Vaduz' AND country_code = 'LI');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Colombo', 'LK'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Colombo' AND country_code = 'LK');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Monrovia', 'LR'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Monrovia' AND country_code = 'LR');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Maseru', 'LS'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Maseru' AND country_code = 'LS');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Vilnius', 'LT'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Vilnius' AND country_code = 'LT');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Luxembourg', 'LU'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Luxembourg' AND country_code = 'LU');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Riga', 'LV'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Riga' AND country_code = 'LV');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Tripoli', 'LY'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Tripoli' AND country_code = 'LY');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Rabat', 'MA'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Rabat' AND country_code = 'MA');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Monaco', 'MC'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Monaco' AND country_code = 'MC');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Kishinev', 'MD'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Kishinev' AND country_code = 'MD');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Antananarivo', 'MG'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Antananarivo' AND country_code = 'MG');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Majuro', 'MH'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Majuro' AND country_code = 'MH');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Skopje', 'MK'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Skopje' AND country_code = 'MK');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Bamako', 'ML'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Bamako' AND country_code = 'ML');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Rangoon', 'MM'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Rangoon' AND country_code = 'MM');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Ulan Bator', 'MN'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Ulan Bator' AND country_code = 'MN');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Macau', 'MO'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Macau' AND country_code = 'MO');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Saipan', 'MP'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Saipan' AND country_code = 'MP');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Fort-de-France', 'MQ'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Fort-de-France' AND country_code = 'MQ');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Nouakchott', 'MR'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Nouakchott' AND country_code = 'MR');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Plymouth', 'MS'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Plymouth' AND country_code = 'MS');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Valletta', 'MT'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Valletta' AND country_code = 'MT');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Port Louis', 'MU'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Port Louis' AND country_code = 'MU');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Male', 'MV'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Male' AND country_code = 'MV');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Lilongwe', 'MW'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Lilongwe' AND country_code = 'MW');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Mexico City', 'MX'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Mexico City' AND country_code = 'MX');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Kuala Lumpur', 'MY'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Kuala Lumpur' AND country_code = 'MY');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Maputo', 'MZ'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Maputo' AND country_code = 'MZ');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Windhoek', 'NA'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Windhoek' AND country_code = 'NA');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Noumea', 'NC'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Noumea' AND country_code = 'NC');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Niamey', 'NE'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Niamey' AND country_code = 'NE');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Kingston', 'NF'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Kingston' AND country_code = 'NF');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Lagos', 'NG'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Lagos' AND country_code = 'NG');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Managua', 'NI'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Managua' AND country_code = 'NI');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Amsterdam', 'NL'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Amsterdam' AND country_code = 'NL');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Oslo', 'NO'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Oslo' AND country_code = 'NO');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Kathmandu', 'NP'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Kathmandu' AND country_code = 'NP');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Yaren', 'NR'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Yaren' AND country_code = 'NR');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Alofi', 'NU'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Alofi' AND country_code = 'NU');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Wellington', 'NZ'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Wellington' AND country_code = 'NZ');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Muscat', 'OM'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Muscat' AND country_code = 'OM');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Panama City', 'PA'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Panama City' AND country_code = 'PA');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Lima', 'PE'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Lima' AND country_code = 'PE');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Papeete', 'PF'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Papeete' AND country_code = 'PF');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Port Moresby', 'PG'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Port Moresby' AND country_code = 'PG');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Manila', 'PH'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Manila' AND country_code = 'PH');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Islamabad', 'PK'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Islamabad' AND country_code = 'PK');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Warsaw', 'PL'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Warsaw' AND country_code = 'PL');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'St. Pierre', 'PM'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'St. Pierre' AND country_code = 'PM');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Adamstown', 'PN'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Adamstown' AND country_code = 'PN');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'San Juan', 'PR'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'San Juan' AND country_code = 'PR');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Lisbon', 'PT'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Lisbon' AND country_code = 'PT');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Koror', 'PW'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Koror' AND country_code = 'PW');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Asuncion', 'PY'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Asuncion' AND country_code = 'PY');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Doha', 'QA'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Doha' AND country_code = 'QA');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Saint-Denis', 'RE'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Saint-Denis' AND country_code = 'RE');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Bucharest', 'RO'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Bucharest' AND country_code = 'RO');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Moscow', 'RU'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Moscow' AND country_code = 'RU');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Kigali', 'RW'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Kigali' AND country_code = 'RW');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Riyadh', 'SA'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Riyadh' AND country_code = 'SA');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Honiara', 'SB'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Honiara' AND country_code = 'SB');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Victoria', 'SC'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Victoria' AND country_code = 'SC');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Khartoum', 'SD'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Khartoum' AND country_code = 'SD');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Stockholm', 'SE'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Stockholm' AND country_code = 'SE');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Singapore', 'SG'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Singapore' AND country_code = 'SG');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Jamestown', 'SH'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Jamestown' AND country_code = 'SH');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Ljubljana', 'SI'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Ljubljana' AND country_code = 'SI');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Longyearbyen', 'SJ'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Longyearbyen' AND country_code = 'SJ');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Bratislava', 'SK'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Bratislava' AND country_code = 'SK');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Freetown', 'SL'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Freetown' AND country_code = 'SL');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'San Marino', 'SM'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'San Marino' AND country_code = 'SM');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Dakar', 'SN'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Dakar' AND country_code = 'SN');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Mogadishu', 'SO'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Mogadishu' AND country_code = 'SO');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Paramaribo', 'SR'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Paramaribo' AND country_code = 'SR');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Sao Tome', 'ST'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Sao Tome' AND country_code = 'ST');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'San Salvador', 'SV'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'San Salvador' AND country_code = 'SV');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Damascus', 'SY'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Damascus' AND country_code = 'SY');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Mbabane', 'SZ'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Mbabane' AND country_code = 'SZ');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Grand Turk', 'TC'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Grand Turk' AND country_code = 'TC');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'N''Djamena', 'TD'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'N''Djamena' AND country_code = 'TD');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'None', 'TF'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'None' AND country_code = 'TF');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Lome', 'TG'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Lome' AND country_code = 'TG');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Bangkok', 'TH'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Bangkok' AND country_code = 'TH');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Dushanbe', 'TJ'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Dushanbe' AND country_code = 'TJ');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'None', 'TK'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'None' AND country_code = 'TK');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Ashgabat', 'TM'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Ashgabat' AND country_code = 'TM');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Tunis', 'TN'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Tunis' AND country_code = 'TN');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Nuku''alofa', 'TO'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Nuku''alofa' AND country_code = 'TO');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Dili', 'TP'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Dili' AND country_code = 'TP');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Ankara', 'TR'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Ankara' AND country_code = 'TR');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Port of Spain', 'TT'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Port of Spain' AND country_code = 'TT');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Funafuti', 'TV'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Funafuti' AND country_code = 'TV');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Taipei', 'TW'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Taipei' AND country_code = 'TW');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Dodoma', 'TZ'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Dodoma' AND country_code = 'TZ');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Kiev', 'UA'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Kiev' AND country_code = 'UA');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Kampala', 'UG'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Kampala' AND country_code = 'UG');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'None', 'UM'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'None' AND country_code = 'UM');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Washington', 'US'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Washington' AND country_code = 'US');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Montevideo', 'UY'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Montevideo' AND country_code = 'UY');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Tashkent', 'UZ'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Tashkent' AND country_code = 'UZ');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Vatican City', 'VA'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Vatican City' AND country_code = 'VA');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Kingstown', 'VC'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Kingstown' AND country_code = 'VC');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Caracas', 'VE'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Caracas' AND country_code = 'VE');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Road Town', 'VG'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Road Town' AND country_code = 'VG');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Charlotte Amalie', 'VI'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Charlotte Amalie' AND country_code = 'VI');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Hanoi', 'VN'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Hanoi' AND country_code = 'VN');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Port Vila', 'VU'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Port Vila' AND country_code = 'VU');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Mata-Utu', 'WF'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Mata-Utu' AND country_code = 'WF');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Apia', 'WS'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Apia' AND country_code = 'WS');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'San''a', 'YE'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'San''a' AND country_code = 'YE');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Dzaoudzi', 'YT'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Dzaoudzi' AND country_code = 'YT');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Pretoria', 'ZA'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Pretoria' AND country_code = 'ZA');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Lusaka', 'ZM'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Lusaka' AND country_code = 'ZM');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Harare', 'ZW'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Harare' AND country_code = 'ZW');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Podgorica', 'ME'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Podgorica' AND country_code = 'ME');

INSERT INTO country_capital (country_capital, country_code)
SELECT 'Belgrade', 'RS'
WHERE NOT EXISTS (SELECT 1 FROM country_capital WHERE country_capital = 'Belgrade' AND country_code = 'RS');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'AD', '376'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'AD' AND tele_code = '376');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'AE', '971'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'AE' AND tele_code = '971');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'AF', '93'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'AF' AND tele_code = '93');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'AG', '1-268'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'AG' AND tele_code = '1-268');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'AI', '1-264'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'AI' AND tele_code = '1-264');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'AL', '355'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'AL' AND tele_code = '355');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'AM', '374'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'AM' AND tele_code = '374');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'AN', '599'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'AN' AND tele_code = '599');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'AO', '244'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'AO' AND tele_code = '244');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'AQ', '672'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'AQ' AND tele_code = '672');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'AR', '54'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'AR' AND tele_code = '54');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'AS', '684'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'AS' AND tele_code = '684');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'AT', '43'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'AT' AND tele_code = '43');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'AU', '61'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'AU' AND tele_code = '61');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'AW', '297'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'AW' AND tele_code = '297');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'AZ', '994'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'AZ' AND tele_code = '994');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'BA', '387'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'BA' AND tele_code = '387');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'BB', '1-246'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'BB' AND tele_code = '1-246');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'BD', '880'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'BD' AND tele_code = '880');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'BE', '32'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'BE' AND tele_code = '32');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'BF', '226'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'BF' AND tele_code = '226');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'BG', '359'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'BG' AND tele_code = '359');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'BH', '973'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'BH' AND tele_code = '973');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'BI', '257'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'BI' AND tele_code = '257');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'BJ', '229'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'BJ' AND tele_code = '229');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'BM', '1-441'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'BM' AND tele_code = '1-441');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'BN', '673'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'BN' AND tele_code = '673');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'BO', '591'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'BO' AND tele_code = '591');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'BR', '55'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'BR' AND tele_code = '55');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'BS', '1-242'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'BS' AND tele_code = '1-242');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'BT', '975'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'BT' AND tele_code = '975');

INSERT INTO country_tele_code (country_code)
SELECT 'BV'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'BV');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'BW', '267'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'BW' AND tele_code = '267');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'BY', '375'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'BY' AND tele_code = '375');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'BZ', '501'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'BZ' AND tele_code = '501');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'CA', '1'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'CA' AND tele_code = '1');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'CC', '61'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'CC' AND tele_code = '61');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'CD', '243'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'CD' AND tele_code = '243');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'CF', '236'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'CF' AND tele_code = '236');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'CG', '242'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'CG' AND tele_code = '242');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'CH', '41'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'CH' AND tele_code = '41');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'CI', '225'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'CI' AND tele_code = '225');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'CK', '682'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'CK' AND tele_code = '682');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'CL', '56'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'CL' AND tele_code = '56');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'CM', '237'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'CM' AND tele_code = '237');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'CN', '86'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'CN' AND tele_code = '86');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'CO', '57'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'CO' AND tele_code = '57');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'CR', '506'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'CR' AND tele_code = '506');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'CU', '53'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'CU' AND tele_code = '53');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'CV', '238'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'CV' AND tele_code = '238');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'CX', '61'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'CX' AND tele_code = '61');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'CY', '357'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'CY' AND tele_code = '357');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'CZ', '420'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'CZ' AND tele_code = '420');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'DE', '49'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'DE' AND tele_code = '49');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'DJ', '253'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'DJ' AND tele_code = '253');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'DK', '45'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'DK' AND tele_code = '45');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'DM', '1-767'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'DM' AND tele_code = '1-767');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'DO', '809'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'DO' AND tele_code = '809');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'DZ', '213'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'DZ' AND tele_code = '213');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'EC', '593'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'EC' AND tele_code = '593');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'EE', '372'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'EE' AND tele_code = '372');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'EG', '20'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'EG' AND tele_code = '20');

INSERT INTO country_tele_code (country_code)
SELECT 'EH'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'EH');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'ER', '291'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'ER' AND tele_code = '291');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'ES', '34'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'ES' AND tele_code = '34');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'ET', '251'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'ET' AND tele_code = '251');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'FI', '358'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'FI' AND tele_code = '358');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'FJ', '679'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'FJ' AND tele_code = '679');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'FK', '500'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'FK' AND tele_code = '500');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'FM', '691'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'FM' AND tele_code = '691');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'FO', '298'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'FO' AND tele_code = '298');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'FR', '33'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'FR' AND tele_code = '33');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'GA', '241'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'GA' AND tele_code = '241');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'GB', '44'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'GB' AND tele_code = '44');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'GD', '1-473'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'GD' AND tele_code = '1-473');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'GE', '995'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'GE' AND tele_code = '995');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'GF', '594'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'GF' AND tele_code = '594');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'GH', '233'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'GH' AND tele_code = '233');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'GI', '350'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'GI' AND tele_code = '350');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'GL', '299'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'GL' AND tele_code = '299');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'GM', '220'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'GM' AND tele_code = '220');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'GN', '224'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'GN' AND tele_code = '224');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'GP', '590'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'GP' AND tele_code = '590');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'GQ', '240'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'GQ' AND tele_code = '240');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'GR', '30'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'GR' AND tele_code = '30');

INSERT INTO country_tele_code (country_code)
SELECT 'GS'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'GS');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'GT', '502'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'GT' AND tele_code = '502');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'GU', '1-671'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'GU' AND tele_code = '1-671');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'GW', '245'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'GW' AND tele_code = '245');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'GY', '592'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'GY' AND tele_code = '592');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'HK', '852'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'HK' AND tele_code = '852');

INSERT INTO country_tele_code (country_code)
SELECT 'HM'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'HM');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'HN', '504'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'HN' AND tele_code = '504');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'HR', '385'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'HR' AND tele_code = '385');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'HT', '509'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'HT' AND tele_code = '509');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'HU', '36'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'HU' AND tele_code = '36');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'ID', '62'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'ID' AND tele_code = '62');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'IE', '353'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'IE' AND tele_code = '353');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'IL', '972'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'IL' AND tele_code = '972');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'IN', '91'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'IN' AND tele_code = '91');

INSERT INTO country_tele_code (country_code)
SELECT 'IO'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'IO');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'IQ', '964'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'IQ' AND tele_code = '964');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'IR', '98'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'IR' AND tele_code = '98');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'IS', '354'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'IS' AND tele_code = '354');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'IT', '39'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'IT' AND tele_code = '39');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'JM', '1-876'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'JM' AND tele_code = '1-876');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'JO', '962'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'JO' AND tele_code = '962');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'JP', '81'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'JP' AND tele_code = '81');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'KE', '254'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'KE' AND tele_code = '254');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'KG', '996'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'KG' AND tele_code = '996');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'KH', '855'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'KH' AND tele_code = '855');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'KI', '686'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'KI' AND tele_code = '686');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'KM', '269'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'KM' AND tele_code = '269');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'KN', '1-869'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'KN' AND tele_code = '1-869');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'KP', '850'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'KP' AND tele_code = '850');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'KR', '82'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'KR' AND tele_code = '82');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'KW', '965'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'KW' AND tele_code = '965');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'KY', '1-345'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'KY' AND tele_code = '1-345');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'KZ', '7'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'KZ' AND tele_code = '7');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'LA', '856'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'LA' AND tele_code = '856');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'LB', '961'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'LB' AND tele_code = '961');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'LC', '1-758'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'LC' AND tele_code = '1-758');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'LI', '423'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'LI' AND tele_code = '423');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'LK', '94'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'LK' AND tele_code = '94');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'LR', '231'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'LR' AND tele_code = '231');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'LS', '266'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'LS' AND tele_code = '266');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'LT', '370'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'LT' AND tele_code = '370');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'LU', '352'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'LU' AND tele_code = '352');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'LV', '371'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'LV' AND tele_code = '371');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'LY', '218'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'LY' AND tele_code = '218');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'MA', '212'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'MA' AND tele_code = '212');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'MC', '377'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'MC' AND tele_code = '377');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'MD', '373'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'MD' AND tele_code = '373');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'MG', '261'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'MG' AND tele_code = '261');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'MH', '692'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'MH' AND tele_code = '692');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'MK', '389'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'MK' AND tele_code = '389');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'ML', '223'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'ML' AND tele_code = '223');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'MM', '95'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'MM' AND tele_code = '95');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'MN', '976'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'MN' AND tele_code = '976');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'MO', '853'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'MO' AND tele_code = '853');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'MP', '670'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'MP' AND tele_code = '670');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'MQ', '596'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'MQ' AND tele_code = '596');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'MR', '222'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'MR' AND tele_code = '222');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'MS', '1-664'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'MS' AND tele_code = '1-664');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'MT', '356'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'MT' AND tele_code = '356');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'MU', '230'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'MU' AND tele_code = '230');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'MV', '960'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'MV' AND tele_code = '960');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'MW', '265'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'MW' AND tele_code = '265');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'MX', '52'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'MX' AND tele_code = '52');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'MY', '60'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'MY' AND tele_code = '60');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'MZ', '258'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'MZ' AND tele_code = '258');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'NA', '264'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'NA' AND tele_code = '264');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'NC', '687'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'NC' AND tele_code = '687');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'NE', '227'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'NE' AND tele_code = '227');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'NF', '672'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'NF' AND tele_code = '672');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'NG', '234'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'NG' AND tele_code = '234');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'NI', '505'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'NI' AND tele_code = '505');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'NL', '31'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'NL' AND tele_code = '31');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'NO', '47'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'NO' AND tele_code = '47');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'NP', '977'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'NP' AND tele_code = '977');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'NR', '674'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'NR' AND tele_code = '674');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'NU', '683'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'NU' AND tele_code = '683');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'NZ', '64'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'NZ' AND tele_code = '64');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'OM', '968'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'OM' AND tele_code = '968');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'PA', '507'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'PA' AND tele_code = '507');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'PE', '51'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'PE' AND tele_code = '51');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'PF', '689'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'PF' AND tele_code = '689');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'PG', '675'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'PG' AND tele_code = '675');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'PH', '63'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'PH' AND tele_code = '63');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'PK', '92'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'PK' AND tele_code = '92');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'PL', '48'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'PL' AND tele_code = '48');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'PM', '508'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'PM' AND tele_code = '508');

INSERT INTO country_tele_code (country_code)
SELECT 'PN'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'PN');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'PR', '1-787'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'PR' AND tele_code = '1-787');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'PT', '351'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'PT' AND tele_code = '351');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'PW', '680'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'PW' AND tele_code = '680');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'PY', '595'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'PY' AND tele_code = '595');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'QA', '974'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'QA' AND tele_code = '974');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'RE', '262'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'RE' AND tele_code = '262');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'RO', '40'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'RO' AND tele_code = '40');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'RU', '7'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'RU' AND tele_code = '7');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'RW', '250'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'RW' AND tele_code = '250');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'SA', '966'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'SA' AND tele_code = '966');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'SB', '677'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'SB' AND tele_code = '677');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'SC', '248'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'SC' AND tele_code = '248');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'SD', '249'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'SD' AND tele_code = '249');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'SE', '46'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'SE' AND tele_code = '46');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'SG', '65'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'SG' AND tele_code = '65');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'SH', '290'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'SH' AND tele_code = '290');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'SI', '386'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'SI' AND tele_code = '386');

INSERT INTO country_tele_code (country_code)
SELECT 'SJ'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'SJ');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'SK', '421'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'SK' AND tele_code = '421');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'SL', '232'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'SL' AND tele_code = '232');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'SM', '378'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'SM' AND tele_code = '378');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'SN', '221'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'SN' AND tele_code = '221');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'SO', '252'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'SO' AND tele_code = '252');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'SR', '597'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'SR' AND tele_code = '597');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'ST', '239'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'ST' AND tele_code = '239');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'SV', '503'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'SV' AND tele_code = '503');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'SY', '963'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'SY' AND tele_code = '963');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'SZ', '268'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'SZ' AND tele_code = '268');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'TC', '1-649'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'TC' AND tele_code = '1-649');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'TD', '235'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'TD' AND tele_code = '235');

INSERT INTO country_tele_code (country_code)
SELECT 'TF'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'TF');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'TG', '228'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'TG' AND tele_code = '228');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'TH', '66'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'TH' AND tele_code = '66');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'TJ', '992'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'TJ' AND tele_code = '992');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'TK', '690'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'TK' AND tele_code = '690');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'TM', '993'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'TM' AND tele_code = '993');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'TN', '216'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'TN' AND tele_code = '216');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'TO', '676'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'TO' AND tele_code = '676');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'TP', '670'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'TP' AND tele_code = '670');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'TR', '90'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'TR' AND tele_code = '90');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'TT', '1-868'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'TT' AND tele_code = '1-868');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'TV', '688'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'TV' AND tele_code = '688');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'TW', '886'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'TW' AND tele_code = '886');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'TZ', '255'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'TZ' AND tele_code = '255');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'UA', '380'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'UA' AND tele_code = '380');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'UG', '256'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'UG' AND tele_code = '256');

INSERT INTO country_tele_code (country_code)
SELECT 'UM'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'UM');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'US', '1'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'US' AND tele_code = '1');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'UY', '598'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'UY' AND tele_code = '598');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'UZ', '998'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'UZ' AND tele_code = '998');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'VA', '39'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'VA' AND tele_code = '39');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'VC', '1-784'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'VC' AND tele_code = '1-784');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'VE', '58'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'VE' AND tele_code = '58');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'VG', '1-284'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'VG' AND tele_code = '1-284');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'VI', '1-340'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'VI' AND tele_code = '1-340');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'VN', '84'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'VN' AND tele_code = '84');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'VU', '678'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'VU' AND tele_code = '678');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'WF', '681'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'WF' AND tele_code = '681');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'WS', '684'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'WS' AND tele_code = '684');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'YE', '967'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'YE' AND tele_code = '967');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'YT', '269'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'YT' AND tele_code = '269');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'RS', '381'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'RS' AND tele_code = '381');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'ME', '382'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'ME' AND tele_code = '382');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'ZA', '27'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'ZA' AND tele_code = '27');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'ZM', '260'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'ZM' AND tele_code = '260');

INSERT INTO country_tele_code (country_code, tele_code)
SELECT 'ZW', '263'
WHERE NOT EXISTS (SELECT 1 FROM country_tele_code WHERE country_code = 'ZW' AND tele_code = '263');
