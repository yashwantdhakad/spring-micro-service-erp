INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT '_NA_', NULL, 'Not Applicable', '_NA_', NULL, '_NA_', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = '_NA_');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'AFG', 'COUNTRY', 'Afghanistan', 'AF', '004', 'AFG', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'AFG');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ALA', 'COUNTRY', 'Åland islands', 'AX', '248', 'ALA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ALA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ALB', 'COUNTRY', 'Albania', 'AL', '008', 'ALB', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ALB');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'DZA', 'COUNTRY', 'Algeria', 'DZ', '012', 'DZA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'DZA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ASM', 'COUNTRY', 'American Samoa', 'AS', '016', 'ASM', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ASM');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'AND', 'COUNTRY', 'Andorra', 'AD', '020', 'AND', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'AND');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'AGO', 'COUNTRY', 'Angola', 'AO', '024', 'AGO', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'AGO');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'AIA', 'COUNTRY', 'Anguilla', 'AI', '660', 'AIA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'AIA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ATA', 'COUNTRY', 'Antarctica', 'AQ', '010', 'ATA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ATA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ATG', 'COUNTRY', 'Antigua And Barbuda', 'AG', '028', 'ATG', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ATG');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ARG', 'COUNTRY', 'Argentina', 'AR', '032', 'ARG', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ARG');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ARM', 'COUNTRY', 'Armenia', 'AM', '051', 'ARM', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ARM');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ABW', 'COUNTRY', 'Aruba', 'AW', '533', 'ABW', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ABW');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'AUS', 'COUNTRY', 'Australia', 'AU', '036', 'AUS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'AUS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'AUT', 'COUNTRY', 'Austria', 'AT', '040', 'AUT', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'AUT');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'AZE', 'COUNTRY', 'Azerbaijan', 'AZ', '031', 'AZE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'AZE');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BHS', 'COUNTRY', 'Bahamas', 'BS', '044', 'BHS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BHS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BHR', 'COUNTRY', 'Bahrain', 'BH', '048', 'BHR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BHR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BGD', 'COUNTRY', 'Bangladesh', 'BD', '050', 'BGD', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BGD');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BRB', 'COUNTRY', 'Barbados', 'BB', '052', 'BRB', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BRB');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BLR', 'COUNTRY', 'Belarus', 'BY', '112', 'BLR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BLR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BEL', 'COUNTRY', 'Belgium', 'BE', '056', 'BEL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BEL');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BES', 'COUNTRY', 'Bonaire, Sint Eustatius and Saba', 'BQ', '535', 'BES', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BES');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BLZ', 'COUNTRY', 'Belize', 'BZ', '084', 'BLZ', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BLZ');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BEN', 'COUNTRY', 'Benin', 'BJ', '204', 'BEN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BEN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BMU', 'COUNTRY', 'Bermuda', 'BM', '060', 'BMU', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BMU');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BTN', 'COUNTRY', 'Bhutan', 'BT', '064', 'BTN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BTN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BOL', 'COUNTRY', 'Bolivia', 'BO', '068', 'BOL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BOL');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BIH', 'COUNTRY', 'Bosnia And Herzegowina', 'BA', '070', 'BIH', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BIH');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BWA', 'COUNTRY', 'Botswana', 'BW', '072', 'BWA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BWA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BVT', 'COUNTRY', 'Bouvet Island', 'BV', '074', 'BVT', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BVT');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BRA', 'COUNTRY', 'Brazil', 'BR', '076', 'BRA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BRA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IOT', 'COUNTRY', 'British Indian Ocean Territory', 'IO', '086', 'IOT', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IOT');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BRN', 'COUNTRY', 'Brunei Darussalam', 'BN', '096', 'BRN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BRN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BGR', 'COUNTRY', 'Bulgaria', 'BG', '100', 'BGR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BGR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BFA', 'COUNTRY', 'Burkina Faso', 'BF', '854', 'BFA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BFA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BDI', 'COUNTRY', 'Burundi', 'BI', '108', 'BDI', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BDI');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'KHM', 'COUNTRY', 'Cambodia', 'KH', '116', 'KHM', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'KHM');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CMR', 'COUNTRY', 'Cameroon', 'CM', '120', 'CMR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CMR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CAN', 'COUNTRY', 'Canada', 'CA', '124', 'CAN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CAN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CPV', 'COUNTRY', 'Cape Verde', 'CV', '132', 'CPV', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CPV');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CYM', 'COUNTRY', 'Cayman Islands', 'KY', '136', 'CYM', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CYM');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CAF', 'COUNTRY', 'Central African Republic', 'CF', '140', 'CAF', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CAF');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TCD', 'COUNTRY', 'Chad', 'TD', '148', 'TCD', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TCD');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CHL', 'COUNTRY', 'Chile', 'CL', '152', 'CHL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CHL');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CHN', 'COUNTRY', 'China', 'CN', '156', 'CHN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CHN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CXR', 'COUNTRY', 'Christmas Island', 'CX', '162', 'CXR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CXR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CCK', 'COUNTRY', 'Cocos (keeling) Islands', 'CC', '166', 'CCK', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CCK');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'COL', 'COUNTRY', 'Colombia', 'CO', '170', 'COL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'COL');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'COM', 'COUNTRY', 'Comoros', 'KM', '174', 'COM', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'COM');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'COG', 'COUNTRY', 'Congo', 'CG', '178', 'COG', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'COG');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'COD', 'COUNTRY', 'Congo, The Democratic Republic Of The', 'CD', '180', 'COD', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'COD');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'COK', 'COUNTRY', 'Cook Islands', 'CK', '184', 'COK', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'COK');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CRI', 'COUNTRY', 'Costa Rica', 'CR', '188', 'CRI', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CRI');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CIV', 'COUNTRY', 'Cote D''ivoire', 'CI', '384', 'CIV', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CIV');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'HRV', 'COUNTRY', 'Croatia (local Name: Hrvatska)', 'HR', '191', 'HRV', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'HRV');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CUB', 'COUNTRY', 'Cuba', 'CU', '192', 'CUB', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CUB');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CUW', 'COUNTRY', 'Curaçao', 'CW', '531', 'CUW', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CUW');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CYP', 'COUNTRY', 'Cyprus', 'CY', '196', 'CYP', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CYP');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CZE', 'COUNTRY', 'Czech Republic', 'CZ', '203', 'CZE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CZE');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'DNK', 'COUNTRY', 'Denmark', 'DK', '208', 'DNK', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'DNK');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'DJI', 'COUNTRY', 'Djibouti', 'DJ', '262', 'DJI', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'DJI');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'DMA', 'COUNTRY', 'Dominica', 'DM', '212', 'DMA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'DMA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'DOM', 'COUNTRY', 'Dominican Republic', 'DO', '214', 'DOM', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'DOM');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TLS', 'COUNTRY', 'East Timor', 'TL', '626', 'TLS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TLS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ECU', 'COUNTRY', 'Ecuador', 'EC', '218', 'ECU', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ECU');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'EGY', 'COUNTRY', 'Egypt', 'EG', '818', 'EGY', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'EGY');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'SLV', 'COUNTRY', 'El Salvador', 'SV', '222', 'SLV', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'SLV');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ENGL', 'COUNTRY', 'England', 'ENG', '896', 'ENGL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ENGL');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GNQ', 'COUNTRY', 'Equatorial Guinea', 'GQ', '226', 'GNQ', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GNQ');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ERI', 'COUNTRY', 'Eritrea', 'ER', '232', 'ERI', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ERI');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'EST', 'COUNTRY', 'Estonia', 'EE', '233', 'EST', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'EST');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ETH', 'COUNTRY', 'Ethiopia', 'ET', '231', 'ETH', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ETH');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FLK', 'COUNTRY', 'Falkland Islands (malvinas)', 'FK', '238', 'FLK', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FLK');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FRO', 'COUNTRY', 'Faroe Islands', 'FO', '234', 'FRO', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FRO');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FJI', 'COUNTRY', 'Fiji', 'FJ', '242', 'FJI', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FJI');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FIN', 'COUNTRY', 'Finland', 'FI', '246', 'FIN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FIN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FXX', 'COUNTRY', 'France, Metropolitan', 'FX', '249', 'FXX', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FXX');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FRA', 'COUNTRY', 'France', 'FR', '250', 'FRA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FRA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GUF', 'COUNTRY', 'French Guiana', 'GF', '254', 'GUF', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GUF');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'PYF', 'COUNTRY', 'French Polynesia', 'PF', '258', 'PYF', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'PYF');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ATF', 'COUNTRY', 'French Southern Territories', 'TF', '260', 'ATF', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ATF');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GAB', 'COUNTRY', 'Gabon', 'GA', '266', 'GAB', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GAB');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GMB', 'COUNTRY', 'Gambia', 'GM', '270', 'GMB', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GMB');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GEO', 'COUNTRY', 'Georgia', 'GE', '268', 'GEO', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GEO');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'DEU', 'COUNTRY', 'Germany', 'DE', '276', 'DEU', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'DEU');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GHA', 'COUNTRY', 'Ghana', 'GH', '288', 'GHA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GHA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GIB', 'COUNTRY', 'Gibraltar', 'GI', '292', 'GIB', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GIB');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GRC', 'COUNTRY', 'Greece', 'GR', '300', 'GRC', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GRC');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GRL', 'COUNTRY', 'Greenland', 'GL', '304', 'GRL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GRL');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GRD', 'COUNTRY', 'Grenada', 'GD', '308', 'GRD', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GRD');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GLP', 'COUNTRY', 'Guadeloupe', 'GP', '312', 'GLP', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GLP');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GUM', 'COUNTRY', 'Guam', 'GU', '316', 'GUM', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GUM');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GTM', 'COUNTRY', 'Guatemala', 'GT', '320', 'GTM', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GTM');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GGY', 'COUNTRY', 'Guernsey', 'GG', '831', 'GGY', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GGY');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GIN', 'COUNTRY', 'Guinea', 'GN', '324', 'GIN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GIN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GNB', 'COUNTRY', 'Guinea-bissau', 'GW', '624', 'GNB', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GNB');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GUY', 'COUNTRY', 'Guyana', 'GY', '328', 'GUY', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GUY');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'HTI', 'COUNTRY', 'Haiti', 'HT', '332', 'HTI', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'HTI');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'HMD', 'COUNTRY', 'Heard And Mc Donald Islands', 'HM', '334', 'HMD', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'HMD');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'VAT', 'COUNTRY', 'Holy See (vatican City State)', 'VA', '336', 'VAT', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'VAT');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'HND', 'COUNTRY', 'Honduras', 'HN', '340', 'HND', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'HND');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'HKG', 'COUNTRY', 'Hong Kong', 'HK', '344', 'HKG', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'HKG');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'HUN', 'COUNTRY', 'Hungary', 'HU', '348', 'HUN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'HUN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ISL', 'COUNTRY', 'Iceland', 'IS', '352', 'ISL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ISL');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IND', 'COUNTRY', 'India', 'IN', '356', 'IND', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IND');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IDN', 'COUNTRY', 'Indonesia', 'ID', '360', 'IDN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IDN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IRN', 'COUNTRY', 'Iran (islamic Republic Of)', 'IR', '364', 'IRN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IRN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IRQ', 'COUNTRY', 'Iraq', 'IQ', '368', 'IRQ', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IRQ');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IRL', 'COUNTRY', 'Ireland', 'IE', '372', 'IRL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IRL');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'IMN', 'COUNTRY', 'Isle of Man', 'IM', '833', 'IMN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'IMN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ISR', 'COUNTRY', 'Israel', 'IL', '376', 'ISR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ISR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ITA', 'COUNTRY', 'Italy', 'IT', '380', 'ITA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ITA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'JAM', 'COUNTRY', 'Jamaica', 'JM', '388', 'JAM', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'JAM');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'JPN', 'COUNTRY', 'Japan', 'JP', '392', 'JPN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'JPN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'JEY', 'COUNTRY', 'Jersey', 'JE', '832', 'JEY', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'JEY');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'JOR', 'COUNTRY', 'Jordan', 'JO', '400', 'JOR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'JOR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'KAZ', 'COUNTRY', 'Kazakhstan', 'KZ', '398', 'KAZ', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'KAZ');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'KEN', 'COUNTRY', 'Kenya', 'KE', '404', 'KEN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'KEN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'KIR', 'COUNTRY', 'Kiribati', 'KI', '296', 'KIR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'KIR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'PRK', 'COUNTRY', 'Korea, Democratic People''s Republic Of', 'KP', '408', 'PRK', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'PRK');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'KOR', 'COUNTRY', 'Korea, Republic Of', 'KR', '410', 'KOR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'KOR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'KWT', 'COUNTRY', 'Kuwait', 'KW', '414', 'KWT', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'KWT');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'KGZ', 'COUNTRY', 'Kyrgyzstan', 'KG', '417', 'KGZ', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'KGZ');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'LAO', 'COUNTRY', 'Lao People''s Democratic Republic', 'LA', '418', 'LAO', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'LAO');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'LVA', 'COUNTRY', 'Latvia', 'LV', '428', 'LVA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'LVA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'LBN', 'COUNTRY', 'Lebanon', 'LB', '422', 'LBN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'LBN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'LSO', 'COUNTRY', 'Lesotho', 'LS', '426', 'LSO', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'LSO');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'LBR', 'COUNTRY', 'Liberia', 'LR', '430', 'LBR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'LBR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'LBY', 'COUNTRY', 'Libyan Arab Jamahiriya', 'LY', '434', 'LBY', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'LBY');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'LIE', 'COUNTRY', 'Liechtenstein', 'LI', '438', 'LIE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'LIE');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'LTU', 'COUNTRY', 'Lithuania', 'LT', '440', 'LTU', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'LTU');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'LUX', 'COUNTRY', 'Luxembourg', 'LU', '442', 'LUX', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'LUX');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MAC', 'COUNTRY', 'Macau', 'MO', '446', 'MAC', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MAC');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MKD', 'COUNTRY', 'Macedonia, The Former Yugoslav Republic Of', 'MK', '807', 'MKD', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MKD');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MDG', 'COUNTRY', 'Madagascar', 'MG', '450', 'MDG', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MDG');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MWI', 'COUNTRY', 'Malawi', 'MW', '454', 'MWI', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MWI');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MYS', 'COUNTRY', 'Malaysia', 'MY', '458', 'MYS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MYS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MDV', 'COUNTRY', 'Maldives', 'MV', '462', 'MDV', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MDV');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MLI', 'COUNTRY', 'Mali', 'ML', '466', 'MLI', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MLI');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MLT', 'COUNTRY', 'Malta', 'MT', '470', 'MLT', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MLT');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MHL', 'COUNTRY', 'Marshall Islands', 'MH', '584', 'MHL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MHL');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MTQ', 'COUNTRY', 'Martinique', 'MQ', '474', 'MTQ', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MTQ');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MRT', 'COUNTRY', 'Mauritania', 'MR', '478', 'MRT', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MRT');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MUS', 'COUNTRY', 'Mauritius', 'MU', '480', 'MUS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MUS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MYT', 'COUNTRY', 'Mayotte', 'YT', '175', 'MYT', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MYT');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MEX', 'COUNTRY', 'Mexico', 'MX', '484', 'MEX', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MEX');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'FSM', 'COUNTRY', 'Micronesia, Federated States Of', 'FM', '583', 'FSM', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'FSM');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MDA', 'COUNTRY', 'Moldova, Republic Of', 'MD', '498', 'MDA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MDA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MCO', 'COUNTRY', 'Monaco', 'MC', '492', 'MCO', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MCO');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MNG', 'COUNTRY', 'Mongolia', 'MN', '496', 'MNG', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MNG');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MNE', 'COUNTRY', 'Montenegro', 'ME', '499', 'MNE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MNE');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MSR', 'COUNTRY', 'Montserrat', 'MS', '500', 'MSR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MSR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MAR', 'COUNTRY', 'Morocco', 'MA', '504', 'MAR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MAR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MOZ', 'COUNTRY', 'Mozambique', 'MZ', '508', 'MOZ', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MOZ');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MMR', 'COUNTRY', 'Myanmar', 'MM', '104', 'MMR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MMR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'NIRL', 'COUNTRY', 'N.Ireland', 'NIR', '897', 'NIRL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'NIRL');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'NAM', 'COUNTRY', 'Namibia', 'NA', '516', 'NAM', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'NAM');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'NRU', 'COUNTRY', 'Nauru', 'NR', '520', 'NRU', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'NRU');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'NPL', 'COUNTRY', 'Nepal', 'NP', '524', 'NPL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'NPL');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'NLD', 'COUNTRY', 'Netherlands', 'NL', '528', 'NLD', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'NLD');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ANT', 'COUNTRY', 'Netherlands Antilles', 'AN', '530', 'ANT', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ANT');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'NCL', 'COUNTRY', 'New Caledonia', 'NC', '540', 'NCL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'NCL');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'NZL', 'COUNTRY', 'New Zealand', 'NZ', '554', 'NZL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'NZL');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'NIC', 'COUNTRY', 'Nicaragua', 'NI', '558', 'NIC', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'NIC');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'NER', 'COUNTRY', 'Niger', 'NE', '562', 'NER', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'NER');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'NGA', 'COUNTRY', 'Nigeria', 'NG', '566', 'NGA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'NGA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'NIU', 'COUNTRY', 'Niue', 'NU', '570', 'NIU', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'NIU');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'NFK', 'COUNTRY', 'Norfolk Island', 'NF', '574', 'NFK', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'NFK');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MNP', 'COUNTRY', 'Northern Mariana Islands', 'MP', '580', 'MNP', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MNP');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'NOR', 'COUNTRY', 'Norway', 'NO', '578', 'NOR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'NOR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'OMN', 'COUNTRY', 'Oman', 'OM', '512', 'OMN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'OMN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'PAK', 'COUNTRY', 'Pakistan', 'PK', '586', 'PAK', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'PAK');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'PLW', 'COUNTRY', 'Palau', 'PW', '585', 'PLW', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'PLW');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'PSE', 'COUNTRY', 'Palestinian Territory, Occupied', 'PS', '275', 'PSE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'PSE');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'PAN', 'COUNTRY', 'Panama', 'PA', '591', 'PAN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'PAN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'PNG', 'COUNTRY', 'Papua New Guinea', 'PG', '598', 'PNG', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'PNG');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'PRY', 'COUNTRY', 'Paraguay', 'PY', '600', 'PRY', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'PRY');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'PER', 'COUNTRY', 'Peru', 'PE', '604', 'PER', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'PER');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'PHL', 'COUNTRY', 'Philippines', 'PH', '608', 'PHL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'PHL');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'PCN', 'COUNTRY', 'Pitcairn', 'PN', '612', 'PCN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'PCN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'POL', 'COUNTRY', 'Poland', 'PL', '616', 'POL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'POL');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'PRT', 'COUNTRY', 'Portugal', 'PT', '620', 'PRT', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'PRT');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'PRI', 'COUNTRY', 'Puerto Rico', 'PR', '630', 'PRI', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'PRI');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'QAT', 'COUNTRY', 'Qatar', 'QA', '634', 'QAT', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'QAT');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'REU', 'COUNTRY', 'Reunion', 'RE', '638', 'REU', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'REU');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ROU', 'COUNTRY', 'Romania', 'RO', '642', 'ROU', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ROU');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'RUS', 'COUNTRY', 'Russian Federation', 'RU', '643', 'RUS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'RUS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'RWA', 'COUNTRY', 'Rwanda', 'RW', '646', 'RWA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'RWA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'KNA', 'COUNTRY', 'Saint Kitts And Nevis', 'KN', '659', 'KNA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'KNA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'LCA', 'COUNTRY', 'Saint Lucia', 'LC', '662', 'LCA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'LCA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'VCT', 'COUNTRY', 'Saint Vincent And The Grenadines', 'VC', '670', 'VCT', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'VCT');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'BLM', 'COUNTRY', 'Saint Barthélemy', 'BL', '652', 'BLM', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'BLM');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'MAF', 'COUNTRY', 'Saint Martin (French part)', 'MF', '663', 'MAF', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'MAF');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'WSM', 'COUNTRY', 'Samoa', 'WS', '882', 'WSM', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'WSM');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'SMR', 'COUNTRY', 'San Marino', 'SM', '674', 'SMR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'SMR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'STP', 'COUNTRY', 'Sao Tome And Principe', 'ST', '678', 'STP', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'STP');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'SAU', 'COUNTRY', 'Saudi Arabia', 'SA', '682', 'SAU', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'SAU');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'SCOT', 'COUNTRY', 'Scotland', 'SCT', '895', 'SCOT', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'SCOT');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'SEN', 'COUNTRY', 'Senegal', 'SN', '686', 'SEN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'SEN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'SRB', 'COUNTRY', 'Serbia', 'RS', '688', 'SRB', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'SRB');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'SYC', 'COUNTRY', 'Seychelles', 'SC', '690', 'SYC', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'SYC');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'SLE', 'COUNTRY', 'Sierra Leone', 'SL', '694', 'SLE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'SLE');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'SGP', 'COUNTRY', 'Singapore', 'SG', '702', 'SGP', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'SGP');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'SVK', 'COUNTRY', 'Slovakia (slovak Republic)', 'SK', '703', 'SVK', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'SVK');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'SXM', 'COUNTRY', 'Sint Maarten (Dutch part)', 'SX', '534', 'SXM', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'SXM');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'SVN', 'COUNTRY', 'Slovenia', 'SI', '705', 'SVN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'SVN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'SLB', 'COUNTRY', 'Solomon Islands', 'SB', '090', 'SLB', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'SLB');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'SOM', 'COUNTRY', 'Somalia', 'SO', '706', 'SOM', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'SOM');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'SGS', 'COUNTRY', 'South Georgia And The South Sandwich Islands', 'GS', '239', 'SGS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'SGS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ZAF', 'COUNTRY', 'South Africa', 'ZA', '710', 'ZAF', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ZAF');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'SSD', 'COUNTRY', 'South Sudan', 'SS', '728', 'SSD', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'SSD');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ESP', 'COUNTRY', 'Spain', 'ES', '724', 'ESP', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ESP');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'LKA', 'COUNTRY', 'Sri Lanka', 'LK', '144', 'LKA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'LKA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'SHN', 'COUNTRY', 'St. Helena', 'SH', '654', 'SHN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'SHN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'SPM', 'COUNTRY', 'St. Pierre And Miquelon', 'PM', '666', 'SPM', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'SPM');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'SDN', 'COUNTRY', 'Sudan', 'SD', '736', 'SDN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'SDN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'SUR', 'COUNTRY', 'Suriname', 'SR', '740', 'SUR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'SUR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'SJM', 'COUNTRY', 'Svalbard And Jan Mayen Islands', 'SJ', '744', 'SJM', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'SJM');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'SWZ', 'COUNTRY', 'Swaziland', 'SZ', '748', 'SWZ', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'SWZ');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'SWE', 'COUNTRY', 'Sweden', 'SE', '752', 'SWE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'SWE');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'CHE', 'COUNTRY', 'Switzerland', 'CH', '756', 'CHE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'CHE');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'SYR', 'COUNTRY', 'Syrian Arab Republic', 'SY', '760', 'SYR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'SYR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TWN', 'COUNTRY', 'Taiwan', 'TW', '158', 'TWN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TWN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TJK', 'COUNTRY', 'Tajikistan', 'TJ', '762', 'TJK', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TJK');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TZA', 'COUNTRY', 'Tanzania, United Republic Of', 'TZ', '834', 'TZA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TZA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'THA', 'COUNTRY', 'Thailand', 'TH', '764', 'THA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'THA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TGO', 'COUNTRY', 'Togo', 'TG', '768', 'TGO', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TGO');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TKL', 'COUNTRY', 'Tokelau', 'TK', '772', 'TKL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TKL');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TON', 'COUNTRY', 'Tonga', 'TO', '776', 'TON', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TON');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TTO', 'COUNTRY', 'Trinidad And Tobago', 'TT', '780', 'TTO', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TTO');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TUN', 'COUNTRY', 'Tunisia', 'TN', '788', 'TUN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TUN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TUR', 'COUNTRY', 'Turkey', 'TR', '792', 'TUR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TUR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TKM', 'COUNTRY', 'Turkmenistan', 'TM', '795', 'TKM', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TKM');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TCA', 'COUNTRY', 'Turks And Caicos Islands', 'TC', '796', 'TCA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TCA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'TUV', 'COUNTRY', 'Tuvalu', 'TV', '798', 'TUV', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'TUV');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'UGA', 'COUNTRY', 'Uganda', 'UG', '800', 'UGA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'UGA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'UKR', 'COUNTRY', 'Ukraine', 'UA', '804', 'UKR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'UKR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'USA', 'COUNTRY', 'United States', 'US', '840', 'USA', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'USA');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'UMI', 'COUNTRY', 'United States Minor Outlying Islands', 'UM', '581', 'UMI', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'UMI');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ARE', 'COUNTRY', 'United Arab Emirates', 'AE', '784', 'ARE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ARE');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GBR', 'COUNTRY', 'United Kingdom', 'GB', '826', 'GBR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GBR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'URY', 'COUNTRY', 'Uruguay', 'UY', '858', 'URY', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'URY');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'UZB', 'COUNTRY', 'Uzbekistan', 'UZ', '860', 'UZB', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'UZB');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'VUT', 'COUNTRY', 'Vanuatu', 'VU', '548', 'VUT', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'VUT');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'VEN', 'COUNTRY', 'Venezuela', 'VE', '862', 'VEN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'VEN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'VNM', 'COUNTRY', 'Viet Nam', 'VN', '704', 'VNM', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'VNM');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'VGB', 'COUNTRY', 'Virgin Islands (british)', 'VG', '092', 'VGB', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'VGB');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'VIR', 'COUNTRY', 'Virgin Islands (u.s.)', 'VI', '850', 'VIR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'VIR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'WALS', 'COUNTRY', 'Wales', 'WLS', '898', 'WALS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'WALS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'WLF', 'COUNTRY', 'Wallis And Futuna Islands', 'WF', '876', 'WLF', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'WLF');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ESH', 'COUNTRY', 'Western Sahara', 'EH', '732', 'ESH', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ESH');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'YEM', 'COUNTRY', 'Yemen', 'YE', '887', 'YEM', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'YEM');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'YUG', 'COUNTRY', 'Yugoslavia', 'YU', '891', 'YUG', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'YUG');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ZMB', 'COUNTRY', 'Zambia', 'ZM', '894', 'ZMB', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ZMB');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'ZWE', 'COUNTRY', 'Zimbabwe', 'ZW', '716', 'ZWE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'ZWE');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'EU', 'GROUP', 'European Union', 'EU', NULL, 'EU', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'EU');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'DEU', 'EU', 'GROUP_MEMBER'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'DEU' AND geo_id_to = 'EU' AND geo_assoc_type_id = 'GROUP_MEMBER');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'AUT', 'EU', 'GROUP_MEMBER'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'AUT' AND geo_id_to = 'EU' AND geo_assoc_type_id = 'GROUP_MEMBER');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'BEL', 'EU', 'GROUP_MEMBER'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'BEL' AND geo_id_to = 'EU' AND geo_assoc_type_id = 'GROUP_MEMBER');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'BGR', 'EU', 'GROUP_MEMBER'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'BGR' AND geo_id_to = 'EU' AND geo_assoc_type_id = 'GROUP_MEMBER');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CYP', 'EU', 'GROUP_MEMBER'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CYP' AND geo_id_to = 'EU' AND geo_assoc_type_id = 'GROUP_MEMBER');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'DNK', 'EU', 'GROUP_MEMBER'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'DNK' AND geo_id_to = 'EU' AND geo_assoc_type_id = 'GROUP_MEMBER');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ESP', 'EU', 'GROUP_MEMBER'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ESP' AND geo_id_to = 'EU' AND geo_assoc_type_id = 'GROUP_MEMBER');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'EST', 'EU', 'GROUP_MEMBER'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'EST' AND geo_id_to = 'EU' AND geo_assoc_type_id = 'GROUP_MEMBER');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FIN', 'EU', 'GROUP_MEMBER'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FIN' AND geo_id_to = 'EU' AND geo_assoc_type_id = 'GROUP_MEMBER');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'FRA', 'EU', 'GROUP_MEMBER'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'FRA' AND geo_id_to = 'EU' AND geo_assoc_type_id = 'GROUP_MEMBER');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'GRC', 'EU', 'GROUP_MEMBER'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'GRC' AND geo_id_to = 'EU' AND geo_assoc_type_id = 'GROUP_MEMBER');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'HUN', 'EU', 'GROUP_MEMBER'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'HUN' AND geo_id_to = 'EU' AND geo_assoc_type_id = 'GROUP_MEMBER');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'HRV', 'EU', 'GROUP_MEMBER'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'HRV' AND geo_id_to = 'EU' AND geo_assoc_type_id = 'GROUP_MEMBER');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'IRL', 'EU', 'GROUP_MEMBER'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'IRL' AND geo_id_to = 'EU' AND geo_assoc_type_id = 'GROUP_MEMBER');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ITA', 'EU', 'GROUP_MEMBER'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ITA' AND geo_id_to = 'EU' AND geo_assoc_type_id = 'GROUP_MEMBER');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'LVA', 'EU', 'GROUP_MEMBER'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'LVA' AND geo_id_to = 'EU' AND geo_assoc_type_id = 'GROUP_MEMBER');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'LTU', 'EU', 'GROUP_MEMBER'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'LTU' AND geo_id_to = 'EU' AND geo_assoc_type_id = 'GROUP_MEMBER');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'LUX', 'EU', 'GROUP_MEMBER'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'LUX' AND geo_id_to = 'EU' AND geo_assoc_type_id = 'GROUP_MEMBER');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'MLT', 'EU', 'GROUP_MEMBER'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'MLT' AND geo_id_to = 'EU' AND geo_assoc_type_id = 'GROUP_MEMBER');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'NLD', 'EU', 'GROUP_MEMBER'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'NLD' AND geo_id_to = 'EU' AND geo_assoc_type_id = 'GROUP_MEMBER');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'POL', 'EU', 'GROUP_MEMBER'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'POL' AND geo_id_to = 'EU' AND geo_assoc_type_id = 'GROUP_MEMBER');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'PRT', 'EU', 'GROUP_MEMBER'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'PRT' AND geo_id_to = 'EU' AND geo_assoc_type_id = 'GROUP_MEMBER');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ROU', 'EU', 'GROUP_MEMBER'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ROU' AND geo_id_to = 'EU' AND geo_assoc_type_id = 'GROUP_MEMBER');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'GBR', 'EU', 'GROUP_MEMBER'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'GBR' AND geo_id_to = 'EU' AND geo_assoc_type_id = 'GROUP_MEMBER');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'CZE', 'EU', 'GROUP_MEMBER'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'CZE' AND geo_id_to = 'EU' AND geo_assoc_type_id = 'GROUP_MEMBER');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'SVK', 'EU', 'GROUP_MEMBER'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'SVK' AND geo_id_to = 'EU' AND geo_assoc_type_id = 'GROUP_MEMBER');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'SVN', 'EU', 'GROUP_MEMBER'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'SVN' AND geo_id_to = 'EU' AND geo_assoc_type_id = 'GROUP_MEMBER');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'SWE', 'EU', 'GROUP_MEMBER'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'SWE' AND geo_id_to = 'EU' AND geo_assoc_type_id = 'GROUP_MEMBER');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'SCOT', 'GBR', 'GROUP_MEMBER'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'SCOT' AND geo_id_to = 'GBR' AND geo_assoc_type_id = 'GROUP_MEMBER');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ENGL', 'GBR', 'GROUP_MEMBER'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ENGL' AND geo_id_to = 'GBR' AND geo_assoc_type_id = 'GROUP_MEMBER');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'NIRL', 'GBR', 'GROUP_MEMBER'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'NIRL' AND geo_id_to = 'GBR' AND geo_assoc_type_id = 'GROUP_MEMBER');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'WALS', 'GBR', 'GROUP_MEMBER'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'WALS' AND geo_id_to = 'GBR' AND geo_assoc_type_id = 'GROUP_MEMBER');
