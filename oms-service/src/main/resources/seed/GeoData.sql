INSERT INTO geo_type (description, geo_type_id, has_table)
SELECT 'City', 'CITY', 0
WHERE NOT EXISTS (SELECT 1 FROM geo_type WHERE description = 'City' AND geo_type_id = 'CITY' AND has_table = 0);

INSERT INTO geo_type (description, geo_type_id, has_table)
SELECT 'Group', 'GROUP', 0
WHERE NOT EXISTS (SELECT 1 FROM geo_type WHERE description = 'Group' AND geo_type_id = 'GROUP' AND has_table = 0);

INSERT INTO geo_type (description, geo_type_id, has_table)
SELECT 'State', 'STATE', 0
WHERE NOT EXISTS (SELECT 1 FROM geo_type WHERE description = 'State' AND geo_type_id = 'STATE' AND has_table = 0);

INSERT INTO geo_type (description, geo_type_id, has_table)
SELECT 'Postal Code', 'POSTAL_CODE', 0
WHERE NOT EXISTS (SELECT 1 FROM geo_type WHERE description = 'Postal Code' AND geo_type_id = 'POSTAL_CODE' AND has_table = 0);

INSERT INTO geo_type (description, geo_type_id, has_table)
SELECT 'Country', 'COUNTRY', 0
WHERE NOT EXISTS (SELECT 1 FROM geo_type WHERE description = 'Country' AND geo_type_id = 'COUNTRY' AND has_table = 0);

INSERT INTO geo_type (description, geo_type_id, has_table)
SELECT 'County', 'COUNTY', 0
WHERE NOT EXISTS (SELECT 1 FROM geo_type WHERE description = 'County' AND geo_type_id = 'COUNTY' AND has_table = 0);

INSERT INTO geo_type (description, geo_type_id, has_table)
SELECT 'County-City', 'COUNTY_CITY', 0
WHERE NOT EXISTS (SELECT 1 FROM geo_type WHERE description = 'County-City' AND geo_type_id = 'COUNTY_CITY' AND has_table = 0);

INSERT INTO geo_type (description, geo_type_id, has_table)
SELECT 'Municipality', 'MUNICIPALITY', 0
WHERE NOT EXISTS (SELECT 1 FROM geo_type WHERE description = 'Municipality' AND geo_type_id = 'MUNICIPALITY' AND has_table = 0);

INSERT INTO geo_type (description, geo_type_id, has_table)
SELECT 'Province', 'PROVINCE', 0
WHERE NOT EXISTS (SELECT 1 FROM geo_type WHERE description = 'Province' AND geo_type_id = 'PROVINCE' AND has_table = 0);

INSERT INTO geo_type (description, geo_type_id, has_table)
SELECT 'Region', 'REGION', 0
WHERE NOT EXISTS (SELECT 1 FROM geo_type WHERE description = 'Region' AND geo_type_id = 'REGION' AND has_table = 0);

INSERT INTO geo_type (description, geo_type_id, has_table)
SELECT 'Territory', 'TERRITORY', 0
WHERE NOT EXISTS (SELECT 1 FROM geo_type WHERE description = 'Territory' AND geo_type_id = 'TERRITORY' AND has_table = 0);

INSERT INTO geo_type (description, geo_type_id, has_table, parent_type_id)
SELECT 'Sales Territory', 'SALES_TERRITORY', 0, 'TERRITORY'
WHERE NOT EXISTS (SELECT 1 FROM geo_type WHERE description = 'Sales Territory' AND geo_type_id = 'SALES_TERRITORY' AND has_table = 0 AND parent_type_id = 'TERRITORY');

INSERT INTO geo_type (description, geo_type_id, has_table, parent_type_id)
SELECT 'Service Territory', 'SERVICE_TERRITORY', 0, 'TERRITORY'
WHERE NOT EXISTS (SELECT 1 FROM geo_type WHERE description = 'Service Territory' AND geo_type_id = 'SERVICE_TERRITORY' AND has_table = 0 AND parent_type_id = 'TERRITORY');

INSERT INTO geo_assoc_type (description, geo_assoc_type_id)
SELECT 'Geo Group Member', 'GROUP_MEMBER'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc_type WHERE description = 'Geo Group Member' AND geo_assoc_type_id = 'GROUP_MEMBER');

INSERT INTO geo_assoc_type (description, geo_assoc_type_id)
SELECT 'For a region of a larger Geo, i.e. states, counties, provinces...', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc_type WHERE description = 'For a region of a larger Geo, i.e. states, counties, provinces...' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc_type (description, geo_assoc_type_id)
SELECT 'City in a county', 'COUNTY_CITY'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc_type WHERE description = 'City in a county' AND geo_assoc_type_id = 'COUNTY_CITY');

INSERT INTO geo_assoc_type (description, geo_assoc_type_id)
SELECT 'Administrative Main City of a County', 'COUNTY_SEAT'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc_type WHERE description = 'Administrative Main City of a County' AND geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc_type (description, geo_assoc_type_id)
SELECT 'Postal code associated to a GeoType', 'POSTAL_CODE'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc_type WHERE description = 'Postal code associated to a GeoType' AND geo_assoc_type_id = 'POSTAL_CODE');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name)
SELECT '_NA_', '_NA_', '_NA_', 'Not Applicable'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = '_NA_' AND geo_code = '_NA_' AND geo_id = '_NA_' AND geo_name = 'Not Applicable');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'AFG', 'AF', 'AFG', 'Afghanistan', '004', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'AFG' AND geo_code = 'AF' AND geo_id = 'AFG' AND geo_name = 'Afghanistan' AND geo_sec_code = '004' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'ALA', 'AX', 'ALA', 'Åland islands', '248', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'ALA' AND geo_code = 'AX' AND geo_id = 'ALA' AND geo_name = 'Åland islands' AND geo_sec_code = '248' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'ALB', 'AL', 'ALB', 'Albania', '008', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'ALB' AND geo_code = 'AL' AND geo_id = 'ALB' AND geo_name = 'Albania' AND geo_sec_code = '008' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'DZA', 'DZ', 'DZA', 'Algeria', '012', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'DZA' AND geo_code = 'DZ' AND geo_id = 'DZA' AND geo_name = 'Algeria' AND geo_sec_code = '012' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'ASM', 'AS', 'ASM', 'American Samoa', '016', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'ASM' AND geo_code = 'AS' AND geo_id = 'ASM' AND geo_name = 'American Samoa' AND geo_sec_code = '016' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'AND', 'AD', 'AND', 'Andorra', '020', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'AND' AND geo_code = 'AD' AND geo_id = 'AND' AND geo_name = 'Andorra' AND geo_sec_code = '020' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'AGO', 'AO', 'AGO', 'Angola', '024', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'AGO' AND geo_code = 'AO' AND geo_id = 'AGO' AND geo_name = 'Angola' AND geo_sec_code = '024' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'AIA', 'AI', 'AIA', 'Anguilla', '660', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'AIA' AND geo_code = 'AI' AND geo_id = 'AIA' AND geo_name = 'Anguilla' AND geo_sec_code = '660' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'ATA', 'AQ', 'ATA', 'Antarctica', '010', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'ATA' AND geo_code = 'AQ' AND geo_id = 'ATA' AND geo_name = 'Antarctica' AND geo_sec_code = '010' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'ATG', 'AG', 'ATG', 'Antigua And Barbuda', '028', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'ATG' AND geo_code = 'AG' AND geo_id = 'ATG' AND geo_name = 'Antigua And Barbuda' AND geo_sec_code = '028' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'ARG', 'AR', 'ARG', 'Argentina', '032', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'ARG' AND geo_code = 'AR' AND geo_id = 'ARG' AND geo_name = 'Argentina' AND geo_sec_code = '032' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'ARM', 'AM', 'ARM', 'Armenia', '051', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'ARM' AND geo_code = 'AM' AND geo_id = 'ARM' AND geo_name = 'Armenia' AND geo_sec_code = '051' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'ABW', 'AW', 'ABW', 'Aruba', '533', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'ABW' AND geo_code = 'AW' AND geo_id = 'ABW' AND geo_name = 'Aruba' AND geo_sec_code = '533' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'AUS', 'AU', 'AUS', 'Australia', '036', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'AUS' AND geo_code = 'AU' AND geo_id = 'AUS' AND geo_name = 'Australia' AND geo_sec_code = '036' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'AUT', 'AT', 'AUT', 'Austria', '040', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'AUT' AND geo_code = 'AT' AND geo_id = 'AUT' AND geo_name = 'Austria' AND geo_sec_code = '040' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'AZE', 'AZ', 'AZE', 'Azerbaijan', '031', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'AZE' AND geo_code = 'AZ' AND geo_id = 'AZE' AND geo_name = 'Azerbaijan' AND geo_sec_code = '031' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'BHS', 'BS', 'BHS', 'Bahamas', '044', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'BHS' AND geo_code = 'BS' AND geo_id = 'BHS' AND geo_name = 'Bahamas' AND geo_sec_code = '044' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'BHR', 'BH', 'BHR', 'Bahrain', '048', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'BHR' AND geo_code = 'BH' AND geo_id = 'BHR' AND geo_name = 'Bahrain' AND geo_sec_code = '048' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'BGD', 'BD', 'BGD', 'Bangladesh', '050', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'BGD' AND geo_code = 'BD' AND geo_id = 'BGD' AND geo_name = 'Bangladesh' AND geo_sec_code = '050' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'BRB', 'BB', 'BRB', 'Barbados', '052', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'BRB' AND geo_code = 'BB' AND geo_id = 'BRB' AND geo_name = 'Barbados' AND geo_sec_code = '052' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'BLR', 'BY', 'BLR', 'Belarus', '112', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'BLR' AND geo_code = 'BY' AND geo_id = 'BLR' AND geo_name = 'Belarus' AND geo_sec_code = '112' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'BEL', 'BE', 'BEL', 'Belgium', '056', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'BEL' AND geo_code = 'BE' AND geo_id = 'BEL' AND geo_name = 'Belgium' AND geo_sec_code = '056' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'BES', 'BQ', 'BES', 'Bonaire, Sint Eustatius and Saba', '535', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'BES' AND geo_code = 'BQ' AND geo_id = 'BES' AND geo_name = 'Bonaire, Sint Eustatius and Saba' AND geo_sec_code = '535' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'BLZ', 'BZ', 'BLZ', 'Belize', '084', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'BLZ' AND geo_code = 'BZ' AND geo_id = 'BLZ' AND geo_name = 'Belize' AND geo_sec_code = '084' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'BEN', 'BJ', 'BEN', 'Benin', '204', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'BEN' AND geo_code = 'BJ' AND geo_id = 'BEN' AND geo_name = 'Benin' AND geo_sec_code = '204' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'BMU', 'BM', 'BMU', 'Bermuda', '060', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'BMU' AND geo_code = 'BM' AND geo_id = 'BMU' AND geo_name = 'Bermuda' AND geo_sec_code = '060' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'BTN', 'BT', 'BTN', 'Bhutan', '064', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'BTN' AND geo_code = 'BT' AND geo_id = 'BTN' AND geo_name = 'Bhutan' AND geo_sec_code = '064' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'BOL', 'BO', 'BOL', 'Bolivia', '068', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'BOL' AND geo_code = 'BO' AND geo_id = 'BOL' AND geo_name = 'Bolivia' AND geo_sec_code = '068' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'BIH', 'BA', 'BIH', 'Bosnia And Herzegowina', '070', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'BIH' AND geo_code = 'BA' AND geo_id = 'BIH' AND geo_name = 'Bosnia And Herzegowina' AND geo_sec_code = '070' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'BWA', 'BW', 'BWA', 'Botswana', '072', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'BWA' AND geo_code = 'BW' AND geo_id = 'BWA' AND geo_name = 'Botswana' AND geo_sec_code = '072' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'BVT', 'BV', 'BVT', 'Bouvet Island', '074', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'BVT' AND geo_code = 'BV' AND geo_id = 'BVT' AND geo_name = 'Bouvet Island' AND geo_sec_code = '074' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'BRA', 'BR', 'BRA', 'Brazil', '076', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'BRA' AND geo_code = 'BR' AND geo_id = 'BRA' AND geo_name = 'Brazil' AND geo_sec_code = '076' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'IOT', 'IO', 'IOT', 'British Indian Ocean Territory', '086', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'IOT' AND geo_code = 'IO' AND geo_id = 'IOT' AND geo_name = 'British Indian Ocean Territory' AND geo_sec_code = '086' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'BRN', 'BN', 'BRN', 'Brunei Darussalam', '096', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'BRN' AND geo_code = 'BN' AND geo_id = 'BRN' AND geo_name = 'Brunei Darussalam' AND geo_sec_code = '096' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'BGR', 'BG', 'BGR', 'Bulgaria', '100', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'BGR' AND geo_code = 'BG' AND geo_id = 'BGR' AND geo_name = 'Bulgaria' AND geo_sec_code = '100' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'BFA', 'BF', 'BFA', 'Burkina Faso', '854', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'BFA' AND geo_code = 'BF' AND geo_id = 'BFA' AND geo_name = 'Burkina Faso' AND geo_sec_code = '854' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'BDI', 'BI', 'BDI', 'Burundi', '108', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'BDI' AND geo_code = 'BI' AND geo_id = 'BDI' AND geo_name = 'Burundi' AND geo_sec_code = '108' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'KHM', 'KH', 'KHM', 'Cambodia', '116', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'KHM' AND geo_code = 'KH' AND geo_id = 'KHM' AND geo_name = 'Cambodia' AND geo_sec_code = '116' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'CMR', 'CM', 'CMR', 'Cameroon', '120', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'CMR' AND geo_code = 'CM' AND geo_id = 'CMR' AND geo_name = 'Cameroon' AND geo_sec_code = '120' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'CAN', 'CA', 'CAN', 'Canada', '124', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'CAN' AND geo_code = 'CA' AND geo_id = 'CAN' AND geo_name = 'Canada' AND geo_sec_code = '124' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'CPV', 'CV', 'CPV', 'Cape Verde', '132', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'CPV' AND geo_code = 'CV' AND geo_id = 'CPV' AND geo_name = 'Cape Verde' AND geo_sec_code = '132' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'CYM', 'KY', 'CYM', 'Cayman Islands', '136', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'CYM' AND geo_code = 'KY' AND geo_id = 'CYM' AND geo_name = 'Cayman Islands' AND geo_sec_code = '136' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'CAF', 'CF', 'CAF', 'Central African Republic', '140', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'CAF' AND geo_code = 'CF' AND geo_id = 'CAF' AND geo_name = 'Central African Republic' AND geo_sec_code = '140' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'TCD', 'TD', 'TCD', 'Chad', '148', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'TCD' AND geo_code = 'TD' AND geo_id = 'TCD' AND geo_name = 'Chad' AND geo_sec_code = '148' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'CHL', 'CL', 'CHL', 'Chile', '152', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'CHL' AND geo_code = 'CL' AND geo_id = 'CHL' AND geo_name = 'Chile' AND geo_sec_code = '152' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'CHN', 'CN', 'CHN', 'China', '156', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'CHN' AND geo_code = 'CN' AND geo_id = 'CHN' AND geo_name = 'China' AND geo_sec_code = '156' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'CXR', 'CX', 'CXR', 'Christmas Island', '162', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'CXR' AND geo_code = 'CX' AND geo_id = 'CXR' AND geo_name = 'Christmas Island' AND geo_sec_code = '162' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'CCK', 'CC', 'CCK', 'Cocos (keeling) Islands', '166', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'CCK' AND geo_code = 'CC' AND geo_id = 'CCK' AND geo_name = 'Cocos (keeling) Islands' AND geo_sec_code = '166' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'COL', 'CO', 'COL', 'Colombia', '170', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'COL' AND geo_code = 'CO' AND geo_id = 'COL' AND geo_name = 'Colombia' AND geo_sec_code = '170' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'COM', 'KM', 'COM', 'Comoros', '174', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'COM' AND geo_code = 'KM' AND geo_id = 'COM' AND geo_name = 'Comoros' AND geo_sec_code = '174' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'COG', 'CG', 'COG', 'Congo', '178', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'COG' AND geo_code = 'CG' AND geo_id = 'COG' AND geo_name = 'Congo' AND geo_sec_code = '178' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'COD', 'CD', 'COD', 'Congo, The Democratic Republic Of The', '180', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'COD' AND geo_code = 'CD' AND geo_id = 'COD' AND geo_name = 'Congo, The Democratic Republic Of The' AND geo_sec_code = '180' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'COK', 'CK', 'COK', 'Cook Islands', '184', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'COK' AND geo_code = 'CK' AND geo_id = 'COK' AND geo_name = 'Cook Islands' AND geo_sec_code = '184' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'CRI', 'CR', 'CRI', 'Costa Rica', '188', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'CRI' AND geo_code = 'CR' AND geo_id = 'CRI' AND geo_name = 'Costa Rica' AND geo_sec_code = '188' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'CIV', 'CI', 'CIV', 'Cote D''ivoire', '384', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'CIV' AND geo_code = 'CI' AND geo_id = 'CIV' AND geo_name = 'Cote D''ivoire' AND geo_sec_code = '384' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'HRV', 'HR', 'HRV', 'Croatia (local Name: Hrvatska)', '191', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'HRV' AND geo_code = 'HR' AND geo_id = 'HRV' AND geo_name = 'Croatia (local Name: Hrvatska)' AND geo_sec_code = '191' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'CUB', 'CU', 'CUB', 'Cuba', '192', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'CUB' AND geo_code = 'CU' AND geo_id = 'CUB' AND geo_name = 'Cuba' AND geo_sec_code = '192' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'CUW', 'CW', 'CUW', 'Curaçao', '531', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'CUW' AND geo_code = 'CW' AND geo_id = 'CUW' AND geo_name = 'Curaçao' AND geo_sec_code = '531' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'CYP', 'CY', 'CYP', 'Cyprus', '196', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'CYP' AND geo_code = 'CY' AND geo_id = 'CYP' AND geo_name = 'Cyprus' AND geo_sec_code = '196' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'CZE', 'CZ', 'CZE', 'Czech Republic', '203', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'CZE' AND geo_code = 'CZ' AND geo_id = 'CZE' AND geo_name = 'Czech Republic' AND geo_sec_code = '203' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'DNK', 'DK', 'DNK', 'Denmark', '208', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'DNK' AND geo_code = 'DK' AND geo_id = 'DNK' AND geo_name = 'Denmark' AND geo_sec_code = '208' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'DJI', 'DJ', 'DJI', 'Djibouti', '262', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'DJI' AND geo_code = 'DJ' AND geo_id = 'DJI' AND geo_name = 'Djibouti' AND geo_sec_code = '262' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'DMA', 'DM', 'DMA', 'Dominica', '212', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'DMA' AND geo_code = 'DM' AND geo_id = 'DMA' AND geo_name = 'Dominica' AND geo_sec_code = '212' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'DOM', 'DO', 'DOM', 'Dominican Republic', '214', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'DOM' AND geo_code = 'DO' AND geo_id = 'DOM' AND geo_name = 'Dominican Republic' AND geo_sec_code = '214' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'TLS', 'TL', 'TLS', 'East Timor', '626', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'TLS' AND geo_code = 'TL' AND geo_id = 'TLS' AND geo_name = 'East Timor' AND geo_sec_code = '626' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'ECU', 'EC', 'ECU', 'Ecuador', '218', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'ECU' AND geo_code = 'EC' AND geo_id = 'ECU' AND geo_name = 'Ecuador' AND geo_sec_code = '218' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'EGY', 'EG', 'EGY', 'Egypt', '818', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'EGY' AND geo_code = 'EG' AND geo_id = 'EGY' AND geo_name = 'Egypt' AND geo_sec_code = '818' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'SLV', 'SV', 'SLV', 'El Salvador', '222', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'SLV' AND geo_code = 'SV' AND geo_id = 'SLV' AND geo_name = 'El Salvador' AND geo_sec_code = '222' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'ENGL', 'ENG', 'ENGL', 'England', '896', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'ENGL' AND geo_code = 'ENG' AND geo_id = 'ENGL' AND geo_name = 'England' AND geo_sec_code = '896' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'GNQ', 'GQ', 'GNQ', 'Equatorial Guinea', '226', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'GNQ' AND geo_code = 'GQ' AND geo_id = 'GNQ' AND geo_name = 'Equatorial Guinea' AND geo_sec_code = '226' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'ERI', 'ER', 'ERI', 'Eritrea', '232', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'ERI' AND geo_code = 'ER' AND geo_id = 'ERI' AND geo_name = 'Eritrea' AND geo_sec_code = '232' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'EST', 'EE', 'EST', 'Estonia', '233', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'EST' AND geo_code = 'EE' AND geo_id = 'EST' AND geo_name = 'Estonia' AND geo_sec_code = '233' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'ETH', 'ET', 'ETH', 'Ethiopia', '231', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'ETH' AND geo_code = 'ET' AND geo_id = 'ETH' AND geo_name = 'Ethiopia' AND geo_sec_code = '231' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'FLK', 'FK', 'FLK', 'Falkland Islands (malvinas)', '238', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'FLK' AND geo_code = 'FK' AND geo_id = 'FLK' AND geo_name = 'Falkland Islands (malvinas)' AND geo_sec_code = '238' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'FRO', 'FO', 'FRO', 'Faroe Islands', '234', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'FRO' AND geo_code = 'FO' AND geo_id = 'FRO' AND geo_name = 'Faroe Islands' AND geo_sec_code = '234' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'FJI', 'FJ', 'FJI', 'Fiji', '242', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'FJI' AND geo_code = 'FJ' AND geo_id = 'FJI' AND geo_name = 'Fiji' AND geo_sec_code = '242' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'FIN', 'FI', 'FIN', 'Finland', '246', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'FIN' AND geo_code = 'FI' AND geo_id = 'FIN' AND geo_name = 'Finland' AND geo_sec_code = '246' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'FXX', 'FX', 'FXX', 'France, Metropolitan', '249', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'FXX' AND geo_code = 'FX' AND geo_id = 'FXX' AND geo_name = 'France, Metropolitan' AND geo_sec_code = '249' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'FRA', 'FR', 'FRA', 'France', '250', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'FRA' AND geo_code = 'FR' AND geo_id = 'FRA' AND geo_name = 'France' AND geo_sec_code = '250' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'GUF', 'GF', 'GUF', 'French Guiana', '254', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'GUF' AND geo_code = 'GF' AND geo_id = 'GUF' AND geo_name = 'French Guiana' AND geo_sec_code = '254' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'PYF', 'PF', 'PYF', 'French Polynesia', '258', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'PYF' AND geo_code = 'PF' AND geo_id = 'PYF' AND geo_name = 'French Polynesia' AND geo_sec_code = '258' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'ATF', 'TF', 'ATF', 'French Southern Territories', '260', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'ATF' AND geo_code = 'TF' AND geo_id = 'ATF' AND geo_name = 'French Southern Territories' AND geo_sec_code = '260' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'GAB', 'GA', 'GAB', 'Gabon', '266', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'GAB' AND geo_code = 'GA' AND geo_id = 'GAB' AND geo_name = 'Gabon' AND geo_sec_code = '266' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'GMB', 'GM', 'GMB', 'Gambia', '270', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'GMB' AND geo_code = 'GM' AND geo_id = 'GMB' AND geo_name = 'Gambia' AND geo_sec_code = '270' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'GEO', 'GE', 'GEO', 'Georgia', '268', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'GEO' AND geo_code = 'GE' AND geo_id = 'GEO' AND geo_name = 'Georgia' AND geo_sec_code = '268' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'DEU', 'DE', 'DEU', 'Germany', '276', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'DEU' AND geo_code = 'DE' AND geo_id = 'DEU' AND geo_name = 'Germany' AND geo_sec_code = '276' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'GHA', 'GH', 'GHA', 'Ghana', '288', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'GHA' AND geo_code = 'GH' AND geo_id = 'GHA' AND geo_name = 'Ghana' AND geo_sec_code = '288' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'GIB', 'GI', 'GIB', 'Gibraltar', '292', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'GIB' AND geo_code = 'GI' AND geo_id = 'GIB' AND geo_name = 'Gibraltar' AND geo_sec_code = '292' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'GRC', 'GR', 'GRC', 'Greece', '300', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'GRC' AND geo_code = 'GR' AND geo_id = 'GRC' AND geo_name = 'Greece' AND geo_sec_code = '300' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'GRL', 'GL', 'GRL', 'Greenland', '304', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'GRL' AND geo_code = 'GL' AND geo_id = 'GRL' AND geo_name = 'Greenland' AND geo_sec_code = '304' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'GRD', 'GD', 'GRD', 'Grenada', '308', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'GRD' AND geo_code = 'GD' AND geo_id = 'GRD' AND geo_name = 'Grenada' AND geo_sec_code = '308' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'GLP', 'GP', 'GLP', 'Guadeloupe', '312', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'GLP' AND geo_code = 'GP' AND geo_id = 'GLP' AND geo_name = 'Guadeloupe' AND geo_sec_code = '312' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'GUM', 'GU', 'GUM', 'Guam', '316', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'GUM' AND geo_code = 'GU' AND geo_id = 'GUM' AND geo_name = 'Guam' AND geo_sec_code = '316' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'GTM', 'GT', 'GTM', 'Guatemala', '320', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'GTM' AND geo_code = 'GT' AND geo_id = 'GTM' AND geo_name = 'Guatemala' AND geo_sec_code = '320' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'GGY', 'GG', 'GGY', 'Guernsey', '831', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'GGY' AND geo_code = 'GG' AND geo_id = 'GGY' AND geo_name = 'Guernsey' AND geo_sec_code = '831' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'GIN', 'GN', 'GIN', 'Guinea', '324', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'GIN' AND geo_code = 'GN' AND geo_id = 'GIN' AND geo_name = 'Guinea' AND geo_sec_code = '324' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'GNB', 'GW', 'GNB', 'Guinea-bissau', '624', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'GNB' AND geo_code = 'GW' AND geo_id = 'GNB' AND geo_name = 'Guinea-bissau' AND geo_sec_code = '624' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'GUY', 'GY', 'GUY', 'Guyana', '328', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'GUY' AND geo_code = 'GY' AND geo_id = 'GUY' AND geo_name = 'Guyana' AND geo_sec_code = '328' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'HTI', 'HT', 'HTI', 'Haiti', '332', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'HTI' AND geo_code = 'HT' AND geo_id = 'HTI' AND geo_name = 'Haiti' AND geo_sec_code = '332' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'HMD', 'HM', 'HMD', 'Heard And Mc Donald Islands', '334', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'HMD' AND geo_code = 'HM' AND geo_id = 'HMD' AND geo_name = 'Heard And Mc Donald Islands' AND geo_sec_code = '334' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'VAT', 'VA', 'VAT', 'Holy See (vatican City State)', '336', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'VAT' AND geo_code = 'VA' AND geo_id = 'VAT' AND geo_name = 'Holy See (vatican City State)' AND geo_sec_code = '336' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'HND', 'HN', 'HND', 'Honduras', '340', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'HND' AND geo_code = 'HN' AND geo_id = 'HND' AND geo_name = 'Honduras' AND geo_sec_code = '340' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'HKG', 'HK', 'HKG', 'Hong Kong', '344', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'HKG' AND geo_code = 'HK' AND geo_id = 'HKG' AND geo_name = 'Hong Kong' AND geo_sec_code = '344' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'HUN', 'HU', 'HUN', 'Hungary', '348', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'HUN' AND geo_code = 'HU' AND geo_id = 'HUN' AND geo_name = 'Hungary' AND geo_sec_code = '348' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'ISL', 'IS', 'ISL', 'Iceland', '352', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'ISL' AND geo_code = 'IS' AND geo_id = 'ISL' AND geo_name = 'Iceland' AND geo_sec_code = '352' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'IND', 'IN', 'IND', 'India', '356', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'IND' AND geo_code = 'IN' AND geo_id = 'IND' AND geo_name = 'India' AND geo_sec_code = '356' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'IDN', 'ID', 'IDN', 'Indonesia', '360', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'IDN' AND geo_code = 'ID' AND geo_id = 'IDN' AND geo_name = 'Indonesia' AND geo_sec_code = '360' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'IRN', 'IR', 'IRN', 'Iran (islamic Republic Of)', '364', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'IRN' AND geo_code = 'IR' AND geo_id = 'IRN' AND geo_name = 'Iran (islamic Republic Of)' AND geo_sec_code = '364' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'IRQ', 'IQ', 'IRQ', 'Iraq', '368', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'IRQ' AND geo_code = 'IQ' AND geo_id = 'IRQ' AND geo_name = 'Iraq' AND geo_sec_code = '368' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'IRL', 'IE', 'IRL', 'Ireland', '372', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'IRL' AND geo_code = 'IE' AND geo_id = 'IRL' AND geo_name = 'Ireland' AND geo_sec_code = '372' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'IMN', 'IM', 'IMN', 'Isle of Man', '833', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'IMN' AND geo_code = 'IM' AND geo_id = 'IMN' AND geo_name = 'Isle of Man' AND geo_sec_code = '833' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'ISR', 'IL', 'ISR', 'Israel', '376', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'ISR' AND geo_code = 'IL' AND geo_id = 'ISR' AND geo_name = 'Israel' AND geo_sec_code = '376' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'ITA', 'IT', 'ITA', 'Italy', '380', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'ITA' AND geo_code = 'IT' AND geo_id = 'ITA' AND geo_name = 'Italy' AND geo_sec_code = '380' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'JAM', 'JM', 'JAM', 'Jamaica', '388', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'JAM' AND geo_code = 'JM' AND geo_id = 'JAM' AND geo_name = 'Jamaica' AND geo_sec_code = '388' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'JPN', 'JP', 'JPN', 'Japan', '392', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'JPN' AND geo_code = 'JP' AND geo_id = 'JPN' AND geo_name = 'Japan' AND geo_sec_code = '392' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'JEY', 'JE', 'JEY', 'Jersey', '832', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'JEY' AND geo_code = 'JE' AND geo_id = 'JEY' AND geo_name = 'Jersey' AND geo_sec_code = '832' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'JOR', 'JO', 'JOR', 'Jordan', '400', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'JOR' AND geo_code = 'JO' AND geo_id = 'JOR' AND geo_name = 'Jordan' AND geo_sec_code = '400' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'KAZ', 'KZ', 'KAZ', 'Kazakhstan', '398', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'KAZ' AND geo_code = 'KZ' AND geo_id = 'KAZ' AND geo_name = 'Kazakhstan' AND geo_sec_code = '398' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'KEN', 'KE', 'KEN', 'Kenya', '404', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'KEN' AND geo_code = 'KE' AND geo_id = 'KEN' AND geo_name = 'Kenya' AND geo_sec_code = '404' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'KIR', 'KI', 'KIR', 'Kiribati', '296', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'KIR' AND geo_code = 'KI' AND geo_id = 'KIR' AND geo_name = 'Kiribati' AND geo_sec_code = '296' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'PRK', 'KP', 'PRK', 'Korea, Democratic People''s Republic Of', '408', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'PRK' AND geo_code = 'KP' AND geo_id = 'PRK' AND geo_name = 'Korea, Democratic People''s Republic Of' AND geo_sec_code = '408' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'KOR', 'KR', 'KOR', 'Korea, Republic Of', '410', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'KOR' AND geo_code = 'KR' AND geo_id = 'KOR' AND geo_name = 'Korea, Republic Of' AND geo_sec_code = '410' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'KWT', 'KW', 'KWT', 'Kuwait', '414', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'KWT' AND geo_code = 'KW' AND geo_id = 'KWT' AND geo_name = 'Kuwait' AND geo_sec_code = '414' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'KGZ', 'KG', 'KGZ', 'Kyrgyzstan', '417', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'KGZ' AND geo_code = 'KG' AND geo_id = 'KGZ' AND geo_name = 'Kyrgyzstan' AND geo_sec_code = '417' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'LAO', 'LA', 'LAO', 'Lao People''s Democratic Republic', '418', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'LAO' AND geo_code = 'LA' AND geo_id = 'LAO' AND geo_name = 'Lao People''s Democratic Republic' AND geo_sec_code = '418' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'LVA', 'LV', 'LVA', 'Latvia', '428', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'LVA' AND geo_code = 'LV' AND geo_id = 'LVA' AND geo_name = 'Latvia' AND geo_sec_code = '428' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'LBN', 'LB', 'LBN', 'Lebanon', '422', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'LBN' AND geo_code = 'LB' AND geo_id = 'LBN' AND geo_name = 'Lebanon' AND geo_sec_code = '422' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'LSO', 'LS', 'LSO', 'Lesotho', '426', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'LSO' AND geo_code = 'LS' AND geo_id = 'LSO' AND geo_name = 'Lesotho' AND geo_sec_code = '426' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'LBR', 'LR', 'LBR', 'Liberia', '430', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'LBR' AND geo_code = 'LR' AND geo_id = 'LBR' AND geo_name = 'Liberia' AND geo_sec_code = '430' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'LBY', 'LY', 'LBY', 'Libyan Arab Jamahiriya', '434', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'LBY' AND geo_code = 'LY' AND geo_id = 'LBY' AND geo_name = 'Libyan Arab Jamahiriya' AND geo_sec_code = '434' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'LIE', 'LI', 'LIE', 'Liechtenstein', '438', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'LIE' AND geo_code = 'LI' AND geo_id = 'LIE' AND geo_name = 'Liechtenstein' AND geo_sec_code = '438' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'LTU', 'LT', 'LTU', 'Lithuania', '440', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'LTU' AND geo_code = 'LT' AND geo_id = 'LTU' AND geo_name = 'Lithuania' AND geo_sec_code = '440' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'LUX', 'LU', 'LUX', 'Luxembourg', '442', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'LUX' AND geo_code = 'LU' AND geo_id = 'LUX' AND geo_name = 'Luxembourg' AND geo_sec_code = '442' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'MAC', 'MO', 'MAC', 'Macau', '446', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'MAC' AND geo_code = 'MO' AND geo_id = 'MAC' AND geo_name = 'Macau' AND geo_sec_code = '446' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'MKD', 'MK', 'MKD', 'Macedonia, The Former Yugoslav Republic Of', '807', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'MKD' AND geo_code = 'MK' AND geo_id = 'MKD' AND geo_name = 'Macedonia, The Former Yugoslav Republic Of' AND geo_sec_code = '807' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'MDG', 'MG', 'MDG', 'Madagascar', '450', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'MDG' AND geo_code = 'MG' AND geo_id = 'MDG' AND geo_name = 'Madagascar' AND geo_sec_code = '450' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'MWI', 'MW', 'MWI', 'Malawi', '454', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'MWI' AND geo_code = 'MW' AND geo_id = 'MWI' AND geo_name = 'Malawi' AND geo_sec_code = '454' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'MYS', 'MY', 'MYS', 'Malaysia', '458', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'MYS' AND geo_code = 'MY' AND geo_id = 'MYS' AND geo_name = 'Malaysia' AND geo_sec_code = '458' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'MDV', 'MV', 'MDV', 'Maldives', '462', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'MDV' AND geo_code = 'MV' AND geo_id = 'MDV' AND geo_name = 'Maldives' AND geo_sec_code = '462' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'MLI', 'ML', 'MLI', 'Mali', '466', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'MLI' AND geo_code = 'ML' AND geo_id = 'MLI' AND geo_name = 'Mali' AND geo_sec_code = '466' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'MLT', 'MT', 'MLT', 'Malta', '470', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'MLT' AND geo_code = 'MT' AND geo_id = 'MLT' AND geo_name = 'Malta' AND geo_sec_code = '470' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'MHL', 'MH', 'MHL', 'Marshall Islands', '584', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'MHL' AND geo_code = 'MH' AND geo_id = 'MHL' AND geo_name = 'Marshall Islands' AND geo_sec_code = '584' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'MTQ', 'MQ', 'MTQ', 'Martinique', '474', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'MTQ' AND geo_code = 'MQ' AND geo_id = 'MTQ' AND geo_name = 'Martinique' AND geo_sec_code = '474' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'MRT', 'MR', 'MRT', 'Mauritania', '478', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'MRT' AND geo_code = 'MR' AND geo_id = 'MRT' AND geo_name = 'Mauritania' AND geo_sec_code = '478' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'MUS', 'MU', 'MUS', 'Mauritius', '480', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'MUS' AND geo_code = 'MU' AND geo_id = 'MUS' AND geo_name = 'Mauritius' AND geo_sec_code = '480' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'MYT', 'YT', 'MYT', 'Mayotte', '175', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'MYT' AND geo_code = 'YT' AND geo_id = 'MYT' AND geo_name = 'Mayotte' AND geo_sec_code = '175' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'MEX', 'MX', 'MEX', 'Mexico', '484', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'MEX' AND geo_code = 'MX' AND geo_id = 'MEX' AND geo_name = 'Mexico' AND geo_sec_code = '484' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'FSM', 'FM', 'FSM', 'Micronesia, Federated States Of', '583', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'FSM' AND geo_code = 'FM' AND geo_id = 'FSM' AND geo_name = 'Micronesia, Federated States Of' AND geo_sec_code = '583' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'MDA', 'MD', 'MDA', 'Moldova, Republic Of', '498', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'MDA' AND geo_code = 'MD' AND geo_id = 'MDA' AND geo_name = 'Moldova, Republic Of' AND geo_sec_code = '498' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'MCO', 'MC', 'MCO', 'Monaco', '492', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'MCO' AND geo_code = 'MC' AND geo_id = 'MCO' AND geo_name = 'Monaco' AND geo_sec_code = '492' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'MNG', 'MN', 'MNG', 'Mongolia', '496', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'MNG' AND geo_code = 'MN' AND geo_id = 'MNG' AND geo_name = 'Mongolia' AND geo_sec_code = '496' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'MNE', 'ME', 'MNE', 'Montenegro', '499', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'MNE' AND geo_code = 'ME' AND geo_id = 'MNE' AND geo_name = 'Montenegro' AND geo_sec_code = '499' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'MSR', 'MS', 'MSR', 'Montserrat', '500', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'MSR' AND geo_code = 'MS' AND geo_id = 'MSR' AND geo_name = 'Montserrat' AND geo_sec_code = '500' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'MAR', 'MA', 'MAR', 'Morocco', '504', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'MAR' AND geo_code = 'MA' AND geo_id = 'MAR' AND geo_name = 'Morocco' AND geo_sec_code = '504' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'MOZ', 'MZ', 'MOZ', 'Mozambique', '508', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'MOZ' AND geo_code = 'MZ' AND geo_id = 'MOZ' AND geo_name = 'Mozambique' AND geo_sec_code = '508' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'MMR', 'MM', 'MMR', 'Myanmar', '104', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'MMR' AND geo_code = 'MM' AND geo_id = 'MMR' AND geo_name = 'Myanmar' AND geo_sec_code = '104' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'NIRL', 'NIR', 'NIRL', 'N.Ireland', '897', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'NIRL' AND geo_code = 'NIR' AND geo_id = 'NIRL' AND geo_name = 'N.Ireland' AND geo_sec_code = '897' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'NAM', 'NA', 'NAM', 'Namibia', '516', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'NAM' AND geo_code = 'NA' AND geo_id = 'NAM' AND geo_name = 'Namibia' AND geo_sec_code = '516' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'NRU', 'NR', 'NRU', 'Nauru', '520', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'NRU' AND geo_code = 'NR' AND geo_id = 'NRU' AND geo_name = 'Nauru' AND geo_sec_code = '520' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'NPL', 'NP', 'NPL', 'Nepal', '524', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'NPL' AND geo_code = 'NP' AND geo_id = 'NPL' AND geo_name = 'Nepal' AND geo_sec_code = '524' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'NLD', 'NL', 'NLD', 'Netherlands', '528', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'NLD' AND geo_code = 'NL' AND geo_id = 'NLD' AND geo_name = 'Netherlands' AND geo_sec_code = '528' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'ANT', 'AN', 'ANT', 'Netherlands Antilles', '530', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'ANT' AND geo_code = 'AN' AND geo_id = 'ANT' AND geo_name = 'Netherlands Antilles' AND geo_sec_code = '530' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'NCL', 'NC', 'NCL', 'New Caledonia', '540', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'NCL' AND geo_code = 'NC' AND geo_id = 'NCL' AND geo_name = 'New Caledonia' AND geo_sec_code = '540' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'NZL', 'NZ', 'NZL', 'New Zealand', '554', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'NZL' AND geo_code = 'NZ' AND geo_id = 'NZL' AND geo_name = 'New Zealand' AND geo_sec_code = '554' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'NIC', 'NI', 'NIC', 'Nicaragua', '558', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'NIC' AND geo_code = 'NI' AND geo_id = 'NIC' AND geo_name = 'Nicaragua' AND geo_sec_code = '558' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'NER', 'NE', 'NER', 'Niger', '562', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'NER' AND geo_code = 'NE' AND geo_id = 'NER' AND geo_name = 'Niger' AND geo_sec_code = '562' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'NGA', 'NG', 'NGA', 'Nigeria', '566', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'NGA' AND geo_code = 'NG' AND geo_id = 'NGA' AND geo_name = 'Nigeria' AND geo_sec_code = '566' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'NIU', 'NU', 'NIU', 'Niue', '570', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'NIU' AND geo_code = 'NU' AND geo_id = 'NIU' AND geo_name = 'Niue' AND geo_sec_code = '570' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'NFK', 'NF', 'NFK', 'Norfolk Island', '574', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'NFK' AND geo_code = 'NF' AND geo_id = 'NFK' AND geo_name = 'Norfolk Island' AND geo_sec_code = '574' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'MNP', 'MP', 'MNP', 'Northern Mariana Islands', '580', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'MNP' AND geo_code = 'MP' AND geo_id = 'MNP' AND geo_name = 'Northern Mariana Islands' AND geo_sec_code = '580' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'NOR', 'NO', 'NOR', 'Norway', '578', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'NOR' AND geo_code = 'NO' AND geo_id = 'NOR' AND geo_name = 'Norway' AND geo_sec_code = '578' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'OMN', 'OM', 'OMN', 'Oman', '512', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'OMN' AND geo_code = 'OM' AND geo_id = 'OMN' AND geo_name = 'Oman' AND geo_sec_code = '512' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'PAK', 'PK', 'PAK', 'Pakistan', '586', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'PAK' AND geo_code = 'PK' AND geo_id = 'PAK' AND geo_name = 'Pakistan' AND geo_sec_code = '586' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'PLW', 'PW', 'PLW', 'Palau', '585', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'PLW' AND geo_code = 'PW' AND geo_id = 'PLW' AND geo_name = 'Palau' AND geo_sec_code = '585' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'PSE', 'PS', 'PSE', 'Palestinian Territory, Occupied', '275', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'PSE' AND geo_code = 'PS' AND geo_id = 'PSE' AND geo_name = 'Palestinian Territory, Occupied' AND geo_sec_code = '275' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'PAN', 'PA', 'PAN', 'Panama', '591', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'PAN' AND geo_code = 'PA' AND geo_id = 'PAN' AND geo_name = 'Panama' AND geo_sec_code = '591' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'PNG', 'PG', 'PNG', 'Papua New Guinea', '598', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'PNG' AND geo_code = 'PG' AND geo_id = 'PNG' AND geo_name = 'Papua New Guinea' AND geo_sec_code = '598' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'PRY', 'PY', 'PRY', 'Paraguay', '600', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'PRY' AND geo_code = 'PY' AND geo_id = 'PRY' AND geo_name = 'Paraguay' AND geo_sec_code = '600' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'PER', 'PE', 'PER', 'Peru', '604', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'PER' AND geo_code = 'PE' AND geo_id = 'PER' AND geo_name = 'Peru' AND geo_sec_code = '604' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'PHL', 'PH', 'PHL', 'Philippines', '608', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'PHL' AND geo_code = 'PH' AND geo_id = 'PHL' AND geo_name = 'Philippines' AND geo_sec_code = '608' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'PCN', 'PN', 'PCN', 'Pitcairn', '612', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'PCN' AND geo_code = 'PN' AND geo_id = 'PCN' AND geo_name = 'Pitcairn' AND geo_sec_code = '612' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'POL', 'PL', 'POL', 'Poland', '616', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'POL' AND geo_code = 'PL' AND geo_id = 'POL' AND geo_name = 'Poland' AND geo_sec_code = '616' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'PRT', 'PT', 'PRT', 'Portugal', '620', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'PRT' AND geo_code = 'PT' AND geo_id = 'PRT' AND geo_name = 'Portugal' AND geo_sec_code = '620' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'PRI', 'PR', 'PRI', 'Puerto Rico', '630', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'PRI' AND geo_code = 'PR' AND geo_id = 'PRI' AND geo_name = 'Puerto Rico' AND geo_sec_code = '630' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'QAT', 'QA', 'QAT', 'Qatar', '634', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'QAT' AND geo_code = 'QA' AND geo_id = 'QAT' AND geo_name = 'Qatar' AND geo_sec_code = '634' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'REU', 'RE', 'REU', 'Reunion', '638', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'REU' AND geo_code = 'RE' AND geo_id = 'REU' AND geo_name = 'Reunion' AND geo_sec_code = '638' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'ROU', 'RO', 'ROU', 'Romania', '642', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'ROU' AND geo_code = 'RO' AND geo_id = 'ROU' AND geo_name = 'Romania' AND geo_sec_code = '642' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'RUS', 'RU', 'RUS', 'Russian Federation', '643', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'RUS' AND geo_code = 'RU' AND geo_id = 'RUS' AND geo_name = 'Russian Federation' AND geo_sec_code = '643' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'RWA', 'RW', 'RWA', 'Rwanda', '646', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'RWA' AND geo_code = 'RW' AND geo_id = 'RWA' AND geo_name = 'Rwanda' AND geo_sec_code = '646' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'KNA', 'KN', 'KNA', 'Saint Kitts And Nevis', '659', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'KNA' AND geo_code = 'KN' AND geo_id = 'KNA' AND geo_name = 'Saint Kitts And Nevis' AND geo_sec_code = '659' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'LCA', 'LC', 'LCA', 'Saint Lucia', '662', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'LCA' AND geo_code = 'LC' AND geo_id = 'LCA' AND geo_name = 'Saint Lucia' AND geo_sec_code = '662' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'VCT', 'VC', 'VCT', 'Saint Vincent And The Grenadines', '670', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'VCT' AND geo_code = 'VC' AND geo_id = 'VCT' AND geo_name = 'Saint Vincent And The Grenadines' AND geo_sec_code = '670' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'BLM', 'BL', 'BLM', 'Saint Barthélemy', '652', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'BLM' AND geo_code = 'BL' AND geo_id = 'BLM' AND geo_name = 'Saint Barthélemy' AND geo_sec_code = '652' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'MAF', 'MF', 'MAF', 'Saint Martin (French part)', '663', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'MAF' AND geo_code = 'MF' AND geo_id = 'MAF' AND geo_name = 'Saint Martin (French part)' AND geo_sec_code = '663' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'WSM', 'WS', 'WSM', 'Samoa', '882', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'WSM' AND geo_code = 'WS' AND geo_id = 'WSM' AND geo_name = 'Samoa' AND geo_sec_code = '882' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'SMR', 'SM', 'SMR', 'San Marino', '674', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'SMR' AND geo_code = 'SM' AND geo_id = 'SMR' AND geo_name = 'San Marino' AND geo_sec_code = '674' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'STP', 'ST', 'STP', 'Sao Tome And Principe', '678', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'STP' AND geo_code = 'ST' AND geo_id = 'STP' AND geo_name = 'Sao Tome And Principe' AND geo_sec_code = '678' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'SAU', 'SA', 'SAU', 'Saudi Arabia', '682', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'SAU' AND geo_code = 'SA' AND geo_id = 'SAU' AND geo_name = 'Saudi Arabia' AND geo_sec_code = '682' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'SCOT', 'SCT', 'SCOT', 'Scotland', '895', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'SCOT' AND geo_code = 'SCT' AND geo_id = 'SCOT' AND geo_name = 'Scotland' AND geo_sec_code = '895' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'SEN', 'SN', 'SEN', 'Senegal', '686', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'SEN' AND geo_code = 'SN' AND geo_id = 'SEN' AND geo_name = 'Senegal' AND geo_sec_code = '686' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'SRB', 'RS', 'SRB', 'Serbia', '688', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'SRB' AND geo_code = 'RS' AND geo_id = 'SRB' AND geo_name = 'Serbia' AND geo_sec_code = '688' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'SYC', 'SC', 'SYC', 'Seychelles', '690', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'SYC' AND geo_code = 'SC' AND geo_id = 'SYC' AND geo_name = 'Seychelles' AND geo_sec_code = '690' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'SLE', 'SL', 'SLE', 'Sierra Leone', '694', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'SLE' AND geo_code = 'SL' AND geo_id = 'SLE' AND geo_name = 'Sierra Leone' AND geo_sec_code = '694' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'SGP', 'SG', 'SGP', 'Singapore', '702', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'SGP' AND geo_code = 'SG' AND geo_id = 'SGP' AND geo_name = 'Singapore' AND geo_sec_code = '702' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'SVK', 'SK', 'SVK', 'Slovakia (slovak Republic)', '703', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'SVK' AND geo_code = 'SK' AND geo_id = 'SVK' AND geo_name = 'Slovakia (slovak Republic)' AND geo_sec_code = '703' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'SXM', 'SX', 'SXM', 'Sint Maarten (Dutch part)', '534', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'SXM' AND geo_code = 'SX' AND geo_id = 'SXM' AND geo_name = 'Sint Maarten (Dutch part)' AND geo_sec_code = '534' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'SVN', 'SI', 'SVN', 'Slovenia', '705', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'SVN' AND geo_code = 'SI' AND geo_id = 'SVN' AND geo_name = 'Slovenia' AND geo_sec_code = '705' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'SLB', 'SB', 'SLB', 'Solomon Islands', '090', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'SLB' AND geo_code = 'SB' AND geo_id = 'SLB' AND geo_name = 'Solomon Islands' AND geo_sec_code = '090' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'SOM', 'SO', 'SOM', 'Somalia', '706', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'SOM' AND geo_code = 'SO' AND geo_id = 'SOM' AND geo_name = 'Somalia' AND geo_sec_code = '706' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'SGS', 'GS', 'SGS', 'South Georgia And The South Sandwich Islands', '239', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'SGS' AND geo_code = 'GS' AND geo_id = 'SGS' AND geo_name = 'South Georgia And The South Sandwich Islands' AND geo_sec_code = '239' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'ZAF', 'ZA', 'ZAF', 'South Africa', '710', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'ZAF' AND geo_code = 'ZA' AND geo_id = 'ZAF' AND geo_name = 'South Africa' AND geo_sec_code = '710' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'SSD', 'SS', 'SSD', 'South Sudan', '728', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'SSD' AND geo_code = 'SS' AND geo_id = 'SSD' AND geo_name = 'South Sudan' AND geo_sec_code = '728' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'ESP', 'ES', 'ESP', 'Spain', '724', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'ESP' AND geo_code = 'ES' AND geo_id = 'ESP' AND geo_name = 'Spain' AND geo_sec_code = '724' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'LKA', 'LK', 'LKA', 'Sri Lanka', '144', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'LKA' AND geo_code = 'LK' AND geo_id = 'LKA' AND geo_name = 'Sri Lanka' AND geo_sec_code = '144' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'SHN', 'SH', 'SHN', 'St. Helena', '654', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'SHN' AND geo_code = 'SH' AND geo_id = 'SHN' AND geo_name = 'St. Helena' AND geo_sec_code = '654' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'SPM', 'PM', 'SPM', 'St. Pierre And Miquelon', '666', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'SPM' AND geo_code = 'PM' AND geo_id = 'SPM' AND geo_name = 'St. Pierre And Miquelon' AND geo_sec_code = '666' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'SDN', 'SD', 'SDN', 'Sudan', '736', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'SDN' AND geo_code = 'SD' AND geo_id = 'SDN' AND geo_name = 'Sudan' AND geo_sec_code = '736' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'SUR', 'SR', 'SUR', 'Suriname', '740', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'SUR' AND geo_code = 'SR' AND geo_id = 'SUR' AND geo_name = 'Suriname' AND geo_sec_code = '740' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'SJM', 'SJ', 'SJM', 'Svalbard And Jan Mayen Islands', '744', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'SJM' AND geo_code = 'SJ' AND geo_id = 'SJM' AND geo_name = 'Svalbard And Jan Mayen Islands' AND geo_sec_code = '744' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'SWZ', 'SZ', 'SWZ', 'Swaziland', '748', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'SWZ' AND geo_code = 'SZ' AND geo_id = 'SWZ' AND geo_name = 'Swaziland' AND geo_sec_code = '748' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'SWE', 'SE', 'SWE', 'Sweden', '752', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'SWE' AND geo_code = 'SE' AND geo_id = 'SWE' AND geo_name = 'Sweden' AND geo_sec_code = '752' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'CHE', 'CH', 'CHE', 'Switzerland', '756', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'CHE' AND geo_code = 'CH' AND geo_id = 'CHE' AND geo_name = 'Switzerland' AND geo_sec_code = '756' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'SYR', 'SY', 'SYR', 'Syrian Arab Republic', '760', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'SYR' AND geo_code = 'SY' AND geo_id = 'SYR' AND geo_name = 'Syrian Arab Republic' AND geo_sec_code = '760' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'TWN', 'TW', 'TWN', 'Taiwan', '158', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'TWN' AND geo_code = 'TW' AND geo_id = 'TWN' AND geo_name = 'Taiwan' AND geo_sec_code = '158' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'TJK', 'TJ', 'TJK', 'Tajikistan', '762', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'TJK' AND geo_code = 'TJ' AND geo_id = 'TJK' AND geo_name = 'Tajikistan' AND geo_sec_code = '762' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'TZA', 'TZ', 'TZA', 'Tanzania, United Republic Of', '834', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'TZA' AND geo_code = 'TZ' AND geo_id = 'TZA' AND geo_name = 'Tanzania, United Republic Of' AND geo_sec_code = '834' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'THA', 'TH', 'THA', 'Thailand', '764', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'THA' AND geo_code = 'TH' AND geo_id = 'THA' AND geo_name = 'Thailand' AND geo_sec_code = '764' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'TGO', 'TG', 'TGO', 'Togo', '768', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'TGO' AND geo_code = 'TG' AND geo_id = 'TGO' AND geo_name = 'Togo' AND geo_sec_code = '768' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'TKL', 'TK', 'TKL', 'Tokelau', '772', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'TKL' AND geo_code = 'TK' AND geo_id = 'TKL' AND geo_name = 'Tokelau' AND geo_sec_code = '772' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'TON', 'TO', 'TON', 'Tonga', '776', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'TON' AND geo_code = 'TO' AND geo_id = 'TON' AND geo_name = 'Tonga' AND geo_sec_code = '776' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'TTO', 'TT', 'TTO', 'Trinidad And Tobago', '780', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'TTO' AND geo_code = 'TT' AND geo_id = 'TTO' AND geo_name = 'Trinidad And Tobago' AND geo_sec_code = '780' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'TUN', 'TN', 'TUN', 'Tunisia', '788', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'TUN' AND geo_code = 'TN' AND geo_id = 'TUN' AND geo_name = 'Tunisia' AND geo_sec_code = '788' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'TUR', 'TR', 'TUR', 'Turkey', '792', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'TUR' AND geo_code = 'TR' AND geo_id = 'TUR' AND geo_name = 'Turkey' AND geo_sec_code = '792' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'TKM', 'TM', 'TKM', 'Turkmenistan', '795', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'TKM' AND geo_code = 'TM' AND geo_id = 'TKM' AND geo_name = 'Turkmenistan' AND geo_sec_code = '795' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'TCA', 'TC', 'TCA', 'Turks And Caicos Islands', '796', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'TCA' AND geo_code = 'TC' AND geo_id = 'TCA' AND geo_name = 'Turks And Caicos Islands' AND geo_sec_code = '796' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'TUV', 'TV', 'TUV', 'Tuvalu', '798', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'TUV' AND geo_code = 'TV' AND geo_id = 'TUV' AND geo_name = 'Tuvalu' AND geo_sec_code = '798' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'UGA', 'UG', 'UGA', 'Uganda', '800', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'UGA' AND geo_code = 'UG' AND geo_id = 'UGA' AND geo_name = 'Uganda' AND geo_sec_code = '800' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'UKR', 'UA', 'UKR', 'Ukraine', '804', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'UKR' AND geo_code = 'UA' AND geo_id = 'UKR' AND geo_name = 'Ukraine' AND geo_sec_code = '804' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'USA', 'US', 'USA', 'United States', '840', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'USA' AND geo_code = 'US' AND geo_id = 'USA' AND geo_name = 'United States' AND geo_sec_code = '840' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'UMI', 'UM', 'UMI', 'United States Minor Outlying Islands', '581', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'UMI' AND geo_code = 'UM' AND geo_id = 'UMI' AND geo_name = 'United States Minor Outlying Islands' AND geo_sec_code = '581' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'ARE', 'AE', 'ARE', 'United Arab Emirates', '784', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'ARE' AND geo_code = 'AE' AND geo_id = 'ARE' AND geo_name = 'United Arab Emirates' AND geo_sec_code = '784' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'GBR', 'GB', 'GBR', 'United Kingdom', '826', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'GBR' AND geo_code = 'GB' AND geo_id = 'GBR' AND geo_name = 'United Kingdom' AND geo_sec_code = '826' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'URY', 'UY', 'URY', 'Uruguay', '858', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'URY' AND geo_code = 'UY' AND geo_id = 'URY' AND geo_name = 'Uruguay' AND geo_sec_code = '858' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'UZB', 'UZ', 'UZB', 'Uzbekistan', '860', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'UZB' AND geo_code = 'UZ' AND geo_id = 'UZB' AND geo_name = 'Uzbekistan' AND geo_sec_code = '860' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'VUT', 'VU', 'VUT', 'Vanuatu', '548', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'VUT' AND geo_code = 'VU' AND geo_id = 'VUT' AND geo_name = 'Vanuatu' AND geo_sec_code = '548' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'VEN', 'VE', 'VEN', 'Venezuela', '862', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'VEN' AND geo_code = 'VE' AND geo_id = 'VEN' AND geo_name = 'Venezuela' AND geo_sec_code = '862' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'VNM', 'VN', 'VNM', 'Viet Nam', '704', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'VNM' AND geo_code = 'VN' AND geo_id = 'VNM' AND geo_name = 'Viet Nam' AND geo_sec_code = '704' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'VGB', 'VG', 'VGB', 'Virgin Islands (british)', '092', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'VGB' AND geo_code = 'VG' AND geo_id = 'VGB' AND geo_name = 'Virgin Islands (british)' AND geo_sec_code = '092' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'VIR', 'VI', 'VIR', 'Virgin Islands (u.s.)', '850', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'VIR' AND geo_code = 'VI' AND geo_id = 'VIR' AND geo_name = 'Virgin Islands (u.s.)' AND geo_sec_code = '850' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'WALS', 'WLS', 'WALS', 'Wales', '898', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'WALS' AND geo_code = 'WLS' AND geo_id = 'WALS' AND geo_name = 'Wales' AND geo_sec_code = '898' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'WLF', 'WF', 'WLF', 'Wallis And Futuna Islands', '876', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'WLF' AND geo_code = 'WF' AND geo_id = 'WLF' AND geo_name = 'Wallis And Futuna Islands' AND geo_sec_code = '876' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'ESH', 'EH', 'ESH', 'Western Sahara', '732', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'ESH' AND geo_code = 'EH' AND geo_id = 'ESH' AND geo_name = 'Western Sahara' AND geo_sec_code = '732' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'YEM', 'YE', 'YEM', 'Yemen', '887', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'YEM' AND geo_code = 'YE' AND geo_id = 'YEM' AND geo_name = 'Yemen' AND geo_sec_code = '887' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'YUG', 'YU', 'YUG', 'Yugoslavia', '891', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'YUG' AND geo_code = 'YU' AND geo_id = 'YUG' AND geo_name = 'Yugoslavia' AND geo_sec_code = '891' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'ZMB', 'ZM', 'ZMB', 'Zambia', '894', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'ZMB' AND geo_code = 'ZM' AND geo_id = 'ZMB' AND geo_name = 'Zambia' AND geo_sec_code = '894' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_sec_code, geo_type_id)
SELECT 'ZWE', 'ZW', 'ZWE', 'Zimbabwe', '716', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'ZWE' AND geo_code = 'ZW' AND geo_id = 'ZWE' AND geo_name = 'Zimbabwe' AND geo_sec_code = '716' AND geo_type_id = 'COUNTRY');

INSERT INTO geo (abbreviation, geo_code, geo_id, geo_name, geo_type_id)
SELECT 'EU', 'EU', 'EU', 'European Union', 'GROUP'
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE abbreviation = 'EU' AND geo_code = 'EU' AND geo_id = 'EU' AND geo_name = 'European Union' AND geo_type_id = 'GROUP');

INSERT INTO geo_assoc (geo_assoc_type_id, geo_id, geo_id_to)
SELECT 'GROUP_MEMBER', 'DEU', 'EU'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_assoc_type_id = 'GROUP_MEMBER' AND geo_id = 'DEU' AND geo_id_to = 'EU');

INSERT INTO geo_assoc (geo_assoc_type_id, geo_id, geo_id_to)
SELECT 'GROUP_MEMBER', 'AUT', 'EU'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_assoc_type_id = 'GROUP_MEMBER' AND geo_id = 'AUT' AND geo_id_to = 'EU');

INSERT INTO geo_assoc (geo_assoc_type_id, geo_id, geo_id_to)
SELECT 'GROUP_MEMBER', 'BEL', 'EU'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_assoc_type_id = 'GROUP_MEMBER' AND geo_id = 'BEL' AND geo_id_to = 'EU');

INSERT INTO geo_assoc (geo_assoc_type_id, geo_id, geo_id_to)
SELECT 'GROUP_MEMBER', 'BGR', 'EU'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_assoc_type_id = 'GROUP_MEMBER' AND geo_id = 'BGR' AND geo_id_to = 'EU');

INSERT INTO geo_assoc (geo_assoc_type_id, geo_id, geo_id_to)
SELECT 'GROUP_MEMBER', 'CYP', 'EU'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_assoc_type_id = 'GROUP_MEMBER' AND geo_id = 'CYP' AND geo_id_to = 'EU');

INSERT INTO geo_assoc (geo_assoc_type_id, geo_id, geo_id_to)
SELECT 'GROUP_MEMBER', 'DNK', 'EU'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_assoc_type_id = 'GROUP_MEMBER' AND geo_id = 'DNK' AND geo_id_to = 'EU');

INSERT INTO geo_assoc (geo_assoc_type_id, geo_id, geo_id_to)
SELECT 'GROUP_MEMBER', 'ESP', 'EU'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_assoc_type_id = 'GROUP_MEMBER' AND geo_id = 'ESP' AND geo_id_to = 'EU');

INSERT INTO geo_assoc (geo_assoc_type_id, geo_id, geo_id_to)
SELECT 'GROUP_MEMBER', 'EST', 'EU'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_assoc_type_id = 'GROUP_MEMBER' AND geo_id = 'EST' AND geo_id_to = 'EU');

INSERT INTO geo_assoc (geo_assoc_type_id, geo_id, geo_id_to)
SELECT 'GROUP_MEMBER', 'FIN', 'EU'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_assoc_type_id = 'GROUP_MEMBER' AND geo_id = 'FIN' AND geo_id_to = 'EU');

INSERT INTO geo_assoc (geo_assoc_type_id, geo_id, geo_id_to)
SELECT 'GROUP_MEMBER', 'FRA', 'EU'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_assoc_type_id = 'GROUP_MEMBER' AND geo_id = 'FRA' AND geo_id_to = 'EU');

INSERT INTO geo_assoc (geo_assoc_type_id, geo_id, geo_id_to)
SELECT 'GROUP_MEMBER', 'GRC', 'EU'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_assoc_type_id = 'GROUP_MEMBER' AND geo_id = 'GRC' AND geo_id_to = 'EU');

INSERT INTO geo_assoc (geo_assoc_type_id, geo_id, geo_id_to)
SELECT 'GROUP_MEMBER', 'HUN', 'EU'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_assoc_type_id = 'GROUP_MEMBER' AND geo_id = 'HUN' AND geo_id_to = 'EU');

INSERT INTO geo_assoc (geo_assoc_type_id, geo_id, geo_id_to)
SELECT 'GROUP_MEMBER', 'HRV', 'EU'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_assoc_type_id = 'GROUP_MEMBER' AND geo_id = 'HRV' AND geo_id_to = 'EU');

INSERT INTO geo_assoc (geo_assoc_type_id, geo_id, geo_id_to)
SELECT 'GROUP_MEMBER', 'IRL', 'EU'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_assoc_type_id = 'GROUP_MEMBER' AND geo_id = 'IRL' AND geo_id_to = 'EU');

INSERT INTO geo_assoc (geo_assoc_type_id, geo_id, geo_id_to)
SELECT 'GROUP_MEMBER', 'ITA', 'EU'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_assoc_type_id = 'GROUP_MEMBER' AND geo_id = 'ITA' AND geo_id_to = 'EU');

INSERT INTO geo_assoc (geo_assoc_type_id, geo_id, geo_id_to)
SELECT 'GROUP_MEMBER', 'LVA', 'EU'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_assoc_type_id = 'GROUP_MEMBER' AND geo_id = 'LVA' AND geo_id_to = 'EU');

INSERT INTO geo_assoc (geo_assoc_type_id, geo_id, geo_id_to)
SELECT 'GROUP_MEMBER', 'LTU', 'EU'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_assoc_type_id = 'GROUP_MEMBER' AND geo_id = 'LTU' AND geo_id_to = 'EU');

INSERT INTO geo_assoc (geo_assoc_type_id, geo_id, geo_id_to)
SELECT 'GROUP_MEMBER', 'LUX', 'EU'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_assoc_type_id = 'GROUP_MEMBER' AND geo_id = 'LUX' AND geo_id_to = 'EU');

INSERT INTO geo_assoc (geo_assoc_type_id, geo_id, geo_id_to)
SELECT 'GROUP_MEMBER', 'MLT', 'EU'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_assoc_type_id = 'GROUP_MEMBER' AND geo_id = 'MLT' AND geo_id_to = 'EU');

INSERT INTO geo_assoc (geo_assoc_type_id, geo_id, geo_id_to)
SELECT 'GROUP_MEMBER', 'NLD', 'EU'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_assoc_type_id = 'GROUP_MEMBER' AND geo_id = 'NLD' AND geo_id_to = 'EU');

INSERT INTO geo_assoc (geo_assoc_type_id, geo_id, geo_id_to)
SELECT 'GROUP_MEMBER', 'POL', 'EU'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_assoc_type_id = 'GROUP_MEMBER' AND geo_id = 'POL' AND geo_id_to = 'EU');

INSERT INTO geo_assoc (geo_assoc_type_id, geo_id, geo_id_to)
SELECT 'GROUP_MEMBER', 'PRT', 'EU'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_assoc_type_id = 'GROUP_MEMBER' AND geo_id = 'PRT' AND geo_id_to = 'EU');

INSERT INTO geo_assoc (geo_assoc_type_id, geo_id, geo_id_to)
SELECT 'GROUP_MEMBER', 'ROU', 'EU'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_assoc_type_id = 'GROUP_MEMBER' AND geo_id = 'ROU' AND geo_id_to = 'EU');

INSERT INTO geo_assoc (geo_assoc_type_id, geo_id, geo_id_to)
SELECT 'GROUP_MEMBER', 'GBR', 'EU'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_assoc_type_id = 'GROUP_MEMBER' AND geo_id = 'GBR' AND geo_id_to = 'EU');

INSERT INTO geo_assoc (geo_assoc_type_id, geo_id, geo_id_to)
SELECT 'GROUP_MEMBER', 'CZE', 'EU'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_assoc_type_id = 'GROUP_MEMBER' AND geo_id = 'CZE' AND geo_id_to = 'EU');

INSERT INTO geo_assoc (geo_assoc_type_id, geo_id, geo_id_to)
SELECT 'GROUP_MEMBER', 'SVK', 'EU'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_assoc_type_id = 'GROUP_MEMBER' AND geo_id = 'SVK' AND geo_id_to = 'EU');

INSERT INTO geo_assoc (geo_assoc_type_id, geo_id, geo_id_to)
SELECT 'GROUP_MEMBER', 'SVN', 'EU'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_assoc_type_id = 'GROUP_MEMBER' AND geo_id = 'SVN' AND geo_id_to = 'EU');

INSERT INTO geo_assoc (geo_assoc_type_id, geo_id, geo_id_to)
SELECT 'GROUP_MEMBER', 'SWE', 'EU'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_assoc_type_id = 'GROUP_MEMBER' AND geo_id = 'SWE' AND geo_id_to = 'EU');

INSERT INTO geo_assoc (geo_assoc_type_id, geo_id, geo_id_to)
SELECT 'GROUP_MEMBER', 'SCOT', 'GBR'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_assoc_type_id = 'GROUP_MEMBER' AND geo_id = 'SCOT' AND geo_id_to = 'GBR');

INSERT INTO geo_assoc (geo_assoc_type_id, geo_id, geo_id_to)
SELECT 'GROUP_MEMBER', 'ENGL', 'GBR'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_assoc_type_id = 'GROUP_MEMBER' AND geo_id = 'ENGL' AND geo_id_to = 'GBR');

INSERT INTO geo_assoc (geo_assoc_type_id, geo_id, geo_id_to)
SELECT 'GROUP_MEMBER', 'NIRL', 'GBR'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_assoc_type_id = 'GROUP_MEMBER' AND geo_id = 'NIRL' AND geo_id_to = 'GBR');

INSERT INTO geo_assoc (geo_assoc_type_id, geo_id, geo_id_to)
SELECT 'GROUP_MEMBER', 'WALS', 'GBR'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_assoc_type_id = 'GROUP_MEMBER' AND geo_id = 'WALS' AND geo_id_to = 'GBR');

INSERT INTO country_address_format (geo_assoc_type_id, geo_id)
SELECT 'REGIONS', 'DEU'
WHERE NOT EXISTS (SELECT 1 FROM country_address_format WHERE geo_assoc_type_id = 'REGIONS' AND geo_id = 'DEU');

INSERT INTO country_address_format (geo_assoc_type_id, geo_id)
SELECT 'GROUP_MEMBER', 'GBR'
WHERE NOT EXISTS (SELECT 1 FROM country_address_format WHERE geo_assoc_type_id = 'GROUP_MEMBER' AND geo_id = 'GBR');

INSERT INTO country_address_format (geo_assoc_type_id, geo_id)
SELECT 'REGIONS', 'ENGL'
WHERE NOT EXISTS (SELECT 1 FROM country_address_format WHERE geo_assoc_type_id = 'REGIONS' AND geo_id = 'ENGL');

INSERT INTO country_address_format (geo_assoc_type_id, geo_id)
SELECT 'REGIONS', 'NIRL'
WHERE NOT EXISTS (SELECT 1 FROM country_address_format WHERE geo_assoc_type_id = 'REGIONS' AND geo_id = 'NIRL');

INSERT INTO country_address_format (geo_assoc_type_id, geo_id)
SELECT 'REGIONS', 'WALS'
WHERE NOT EXISTS (SELECT 1 FROM country_address_format WHERE geo_assoc_type_id = 'REGIONS' AND geo_id = 'WALS');

INSERT INTO country_address_format (geo_assoc_type_id, geo_id)
SELECT 'REGIONS', 'SCOT'
WHERE NOT EXISTS (SELECT 1 FROM country_address_format WHERE geo_assoc_type_id = 'REGIONS' AND geo_id = 'SCOT');

INSERT INTO country_address_format (geo_assoc_type_id, geo_id)
SELECT 'REGIONS', 'USA'
WHERE NOT EXISTS (SELECT 1 FROM country_address_format WHERE geo_assoc_type_id = 'REGIONS' AND geo_id = 'USA');

INSERT INTO country_address_format (geo_assoc_type_id, geo_id)
SELECT 'REGIONS', 'CAN'
WHERE NOT EXISTS (SELECT 1 FROM country_address_format WHERE geo_assoc_type_id = 'REGIONS' AND geo_id = 'CAN');

INSERT INTO country_address_format (geo_assoc_type_id, geo_id)
SELECT 'REGIONS', 'AUS'
WHERE NOT EXISTS (SELECT 1 FROM country_address_format WHERE geo_assoc_type_id = 'REGIONS' AND geo_id = 'AUS');

INSERT INTO country_address_format (geo_assoc_type_id, geo_id)
SELECT 'REGIONS', 'BGR'
WHERE NOT EXISTS (SELECT 1 FROM country_address_format WHERE geo_assoc_type_id = 'REGIONS' AND geo_id = 'BGR');

INSERT INTO country_address_format (geo_assoc_type_id, geo_id)
SELECT 'REGIONS', 'BRA'
WHERE NOT EXISTS (SELECT 1 FROM country_address_format WHERE geo_assoc_type_id = 'REGIONS' AND geo_id = 'BRA');

INSERT INTO country_address_format (geo_assoc_type_id, geo_id)
SELECT 'REGIONS', 'CHN'
WHERE NOT EXISTS (SELECT 1 FROM country_address_format WHERE geo_assoc_type_id = 'REGIONS' AND geo_id = 'CHN');

INSERT INTO country_address_format (geo_assoc_type_id, geo_id)
SELECT 'REGIONS', 'COL'
WHERE NOT EXISTS (SELECT 1 FROM country_address_format WHERE geo_assoc_type_id = 'REGIONS' AND geo_id = 'COL');

INSERT INTO country_address_format (geo_assoc_type_id, geo_id)
SELECT 'REGIONS', 'MEX'
WHERE NOT EXISTS (SELECT 1 FROM country_address_format WHERE geo_assoc_type_id = 'REGIONS' AND geo_id = 'MEX');

INSERT INTO country_address_format (geo_assoc_type_id, geo_id, has_postal_code_ext, postal_code_regex, require_postal_code, require_postal_code_ext, require_state_province_id)
SELECT 'REGIONS', 'NLD', 0, '^[1-9][\d]{3}\s?(?!(sa|sd|ss|SA|SD|SS))([a-eghj-opr-tv-xzA-EGHJ-OPR-TV-XZ]{2})?$ ', 1, 0, 'N'
WHERE NOT EXISTS (SELECT 1 FROM country_address_format WHERE geo_assoc_type_id = 'REGIONS' AND geo_id = 'NLD' AND has_postal_code_ext = 0 AND postal_code_regex = '^[1-9][\d]{3}\s?(?!(sa|sd|ss|SA|SD|SS))([a-eghj-opr-tv-xzA-EGHJ-OPR-TV-XZ]{2})?$ ' AND require_postal_code = 1 AND require_postal_code_ext = 0 AND require_state_province_id = 'N');

INSERT INTO country_address_format (geo_assoc_type_id, geo_id)
SELECT 'REGIONS', 'POL'
WHERE NOT EXISTS (SELECT 1 FROM country_address_format WHERE geo_assoc_type_id = 'REGIONS' AND geo_id = 'POL');

INSERT INTO country_address_format (geo_assoc_type_id, geo_id)
SELECT 'REGIONS', 'IND'
WHERE NOT EXISTS (SELECT 1 FROM country_address_format WHERE geo_assoc_type_id = 'REGIONS' AND geo_id = 'IND');

INSERT INTO country_address_format (geo_assoc_type_id, geo_id)
SELECT 'REGIONS', 'ITA'
WHERE NOT EXISTS (SELECT 1 FROM country_address_format WHERE geo_assoc_type_id = 'REGIONS' AND geo_id = 'ITA');

INSERT INTO country_address_format (geo_assoc_type_id, geo_id)
SELECT 'REGIONS', 'CHE'
WHERE NOT EXISTS (SELECT 1 FROM country_address_format WHERE geo_assoc_type_id = 'REGIONS' AND geo_id = 'CHE');

INSERT INTO country_address_format (geo_id, has_postal_code_ext, postal_code_regex, require_postal_code, require_postal_code_ext, require_state_province_id)
SELECT 'FRA', 0, '^(([0-8][0-9])|(9[0-5]))[0-9]{3}$', 1, 0, 'N'
WHERE NOT EXISTS (SELECT 1 FROM country_address_format WHERE geo_id = 'FRA' AND has_postal_code_ext = 0 AND postal_code_regex = '^(([0-8][0-9])|(9[0-5]))[0-9]{3}$' AND require_postal_code = 1 AND require_postal_code_ext = 0 AND require_state_province_id = 'N');

INSERT INTO country_address_format (geo_assoc_type_id, geo_id)
SELECT 'REGIONS', 'MYS'
WHERE NOT EXISTS (SELECT 1 FROM country_address_format WHERE geo_assoc_type_id = 'REGIONS' AND geo_id = 'MYS');

INSERT INTO country_address_format (geo_assoc_type_id, geo_id)
SELECT 'REGIONS', 'THA'
WHERE NOT EXISTS (SELECT 1 FROM country_address_format WHERE geo_assoc_type_id = 'REGIONS' AND geo_id = 'THA');

INSERT INTO country_address_format (geo_assoc_type_id, geo_id)
SELECT 'REGIONS', 'ISR'
WHERE NOT EXISTS (SELECT 1 FROM country_address_format WHERE geo_assoc_type_id = 'REGIONS' AND geo_id = 'ISR');

INSERT INTO country_address_format (geo_id)
SELECT 'CHL'
WHERE NOT EXISTS (SELECT 1 FROM country_address_format WHERE geo_id = 'CHL');

INSERT INTO country_address_format (geo_assoc_type_id, geo_id)
SELECT 'REGIONS', 'TUR'
WHERE NOT EXISTS (SELECT 1 FROM country_address_format WHERE geo_assoc_type_id = 'REGIONS' AND geo_id = 'TUR');

INSERT INTO country_address_format (geo_assoc_type_id, geo_id)
SELECT 'REGIONS', 'ZAF'
WHERE NOT EXISTS (SELECT 1 FROM country_address_format WHERE geo_assoc_type_id = 'REGIONS' AND geo_id = 'ZAF');

INSERT INTO country_address_format (geo_assoc_type_id, geo_id, postal_code_regex)
SELECT 'REGIONS', 'JPN', '\d{3}-\d{4}'
WHERE NOT EXISTS (SELECT 1 FROM country_address_format WHERE geo_assoc_type_id = 'REGIONS' AND geo_id = 'JPN' AND postal_code_regex = '\d{3}-\d{4}');
