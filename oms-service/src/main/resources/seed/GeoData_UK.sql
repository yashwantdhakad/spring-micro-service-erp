INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-ABDN', 'COUNTY', 'Aberdeenshire', 'ABDN', NULL, 'ABDN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-ABDN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-ANGS', 'COUNTY', 'Angus/Forfarshire', 'ANGS', NULL, 'ANGS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-ANGS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-ARGL', 'COUNTY', 'Argyllshire', 'ARGL', NULL, 'ARGL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-ARGL');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-AYRS', 'COUNTY', 'Ayrshire', 'AYRS', NULL, 'AYRS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-AYRS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-BANF', 'COUNTY', 'Banffshire', 'BANF', NULL, 'BANF', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-BANF');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-BDFD', 'COUNTY', 'Bedfordshire', 'BDFD', NULL, 'BDFD', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-BDFD');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-BRKS', 'COUNTY', 'Berkshire', 'BRKS', NULL, 'BRKS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-BRKS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-BWKS', 'COUNTY', 'Berwickshire', 'BWKS', NULL, 'BWKS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-BWKS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-BUCKS', 'COUNTY', 'Buckinghamshire', 'BUCKS', NULL, 'BUCKS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-BUCKS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-BUTE', 'COUNTY', 'Buteshire', 'BUTE', NULL, 'BUTE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-BUTE');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-CTHN', 'COUNTY', 'Caithness', 'CTHN', NULL, 'CTHN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-CTHN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-CAMBS', 'COUNTY', 'Cambridgeshire', 'CAMBS', NULL, 'CAMBS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-CAMBS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-CDGN', 'COUNTY', 'Cardiganshire/Ceredigion', 'CDGN', NULL, 'CDGN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-CDGN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-CHES', 'COUNTY', 'Cheshire', 'CHES', NULL, 'CHES', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-CHES');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-CLAK', 'COUNTY', 'Clackmannanshire', 'CLAK', NULL, 'CLAK', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-CLAK');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-CNWL', 'COUNTY', 'Cornwall', 'CNWL', NULL, 'CNWL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-CNWL');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-CMTY', 'COUNTY', 'Cromartyshire', 'CMTY', NULL, 'CMTY', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-CMTY');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-CUMB', 'COUNTY', 'Cumberland', 'CUMB', NULL, 'CUMB', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-CUMB');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-DRBYS', 'COUNTY', 'Derbyshire', 'DRBYS', NULL, 'DRBYS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-DRBYS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-DEVON', 'COUNTY', 'Devon', 'DEVON', NULL, 'DEVON', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-DEVON');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-DRST', 'COUNTY', 'Dorset', 'DRST', NULL, 'DRST', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-DRST');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-DMFS', 'COUNTY', 'Dumfriesshire', 'DMFS', NULL, 'DMFS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-DMFS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-DMBR', 'COUNTY', 'Dunbartonshire/Dumbartonshire', 'DMBR', NULL, 'DMBR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-DMBR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-DRHM', 'COUNTY', 'Durham', 'DRHM', NULL, 'DRHM', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-DRHM');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-ESSX', 'COUNTY', 'Essex', 'ESSX', NULL, 'ESSX', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-ESSX');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-FIFE', 'COUNTY', 'Fife', 'FIFE', NULL, 'FIFE', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-FIFE');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-GLAM', 'COUNTY', 'Glamorgan/Morgannwg', 'GLAM', NULL, 'GLAM', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-GLAM');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-GLOU', 'COUNTY', 'Gloucestershire', 'GLOU', NULL, 'GLOU', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-GLOU');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-HAMPS', 'COUNTY', 'Hampshire', 'HAMPS', NULL, 'HAMPS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-HAMPS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-HRFDS', 'COUNTY', 'Herefordshire', 'HRFDS', NULL, 'HRFDS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-HRFDS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-HERTS', 'COUNTY', 'Hertfordshire', 'HERTS', NULL, 'HERTS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-HERTS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-HUNTS', 'COUNTY', 'Huntingdonshire', 'HUNTS', NULL, 'HUNTS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-HUNTS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-INVER', 'COUNTY', 'Inverness-shire', 'INVER', NULL, 'INVER', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-INVER');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-KENT', 'COUNTY', 'Kent', 'KENT', NULL, 'KENT', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-KENT');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-KNDN', 'COUNTY', 'Kincardineshire', 'KNDN', NULL, 'KNDN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-KNDN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-KRSS', 'COUNTY', 'Kinross-shire', 'KRSS', NULL, 'KRSS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-KRSS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-KRCUD', 'COUNTY', 'Kirkcudbrightshire', 'KRCUD', NULL, 'KRCUD', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-KRCUD');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-LRKS', 'COUNTY', 'Lanarkshire', 'LRKS', NULL, 'LRKS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-LRKS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-LANCS', 'COUNTY', 'Lancashire', 'LANCS', NULL, 'LANCS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-LANCS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-LIECS', 'COUNTY', 'Leicestershire', 'LIECS', NULL, 'LIECS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-LIECS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-LINCS', 'COUNTY', 'Lincolnshire', 'LINCS', NULL, 'LINCS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-LINCS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-MIENT', 'COUNTY', 'Merioneth/Meirionnydd', 'MIENT', NULL, 'MIENT', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-MIENT');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-MSEX', 'COUNTY', 'Middlesex', 'MSEX', NULL, 'MSEX', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-MSEX');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-MLOTH', 'COUNTY', 'Midlothian/Edinburghshire', 'MLOTH', NULL, 'MLOTH', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-MLOTH');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-MORAY', 'COUNTY', 'Morayshire', 'MORAY', NULL, 'MORAY', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-MORAY');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-NAIRN', 'COUNTY', 'Nairnshire', 'NAIRN', NULL, 'NAIRN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-NAIRN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-NFLK', 'COUNTY', 'Norfolk', 'NFLK', NULL, 'NFLK', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-NFLK');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-NHANTS', 'COUNTY', 'Northamptonshire', 'NHANTS', NULL, 'NHANTS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-NHANTS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-NHUMB', 'COUNTY', 'Northumberland', 'NHUMB', NULL, 'NHUMB', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-NHUMB');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-NOTTS', 'COUNTY', 'Nottinghamshire', 'NOTTS', NULL, 'NOTTS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-NOTTS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-ORK', 'COUNTY', 'Orkney', 'ORK', NULL, 'ORK', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-ORK');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-OXFD', 'COUNTY', 'Oxfordshire', 'OXFD', NULL, 'OXFD', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-OXFD');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-PEEBS', 'COUNTY', 'Peeblesshire', 'PEEBS', NULL, 'PEEBS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-PEEBS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-PERTH', 'COUNTY', 'Perthshire', 'PERTH', NULL, 'PERTH', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-PERTH');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-RNFR', 'COUNTY', 'Renfrewshire', 'RNFR', NULL, 'RNFR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-RNFR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-ROSS', 'COUNTY', 'Ross-shire', 'ROSS', NULL, 'ROSS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-ROSS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-ROXB', 'COUNTY', 'Roxburghshire', 'ROXB', NULL, 'ROXB', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-ROXB');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-RUTL', 'COUNTY', 'Rutland', 'RUTL', NULL, 'RUTL', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-RUTL');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-SELKS', 'COUNTY', 'Selkirkshire', 'SELKS', NULL, 'SELKS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-SELKS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-SHET', 'COUNTY', 'Shetland', 'SHET', NULL, 'SHET', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-SHET');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-SHROPS', 'COUNTY', 'Shropshire', 'SHROPS', NULL, 'SHROPS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-SHROPS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-SOMST', 'COUNTY', 'Somerset', 'SOMST', NULL, 'SOMST', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-SOMST');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-STAFFS', 'COUNTY', 'Staffordshire', 'STAFFS', NULL, 'STAFFS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-STAFFS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-STLNG', 'COUNTY', 'Stirlingshire', 'STLNG', NULL, 'STLNG', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-STLNG');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-SFFK', 'COUNTY', 'Suffolk', 'SFFK', NULL, 'SFFK', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-SFFK');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-SURR', 'COUNTY', 'Surrey', 'SURR', NULL, 'SURR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-SURR');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-SUSX', 'COUNTY', 'Sussex', 'SUSX', NULL, 'SUSX', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-SUSX');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-SUTH', 'COUNTY', 'Sutherland', 'SUTH', NULL, 'SUTH', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-SUTH');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-WWKS', 'COUNTY', 'Warwickshire', 'WWKS', NULL, 'WWKS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-WWKS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-WMLD', 'COUNTY', 'Westmorland', 'WMLD', NULL, 'WMLD', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-WMLD');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-WGNSH', 'COUNTY', 'Wigtownshire', 'WGNSH', NULL, 'WGNSH', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-WGNSH');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-WILTS', 'COUNTY', 'Wiltshire', 'WILTS', NULL, 'WILTS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-WILTS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-WORCS', 'COUNTY', 'Worcestershire', 'WORCS', NULL, 'WORCS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-WORCS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-YORKS', 'COUNTY', 'Yorkshire', 'YORKS', NULL, 'YORKS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-YORKS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-AGSY', 'COUNTY', 'Anglesey/Sir Fon', 'AGSY', NULL, 'AGSY', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-AGSY');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-BREK', 'COUNTY', 'Brecknockshire/Sir Frycheiniog', 'BREK', NULL, 'BREK', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-BREK');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-CNFN', 'COUNTY', 'Caernarfonshire/Sir Gaernarfon', 'CNFN', NULL, 'CNFN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-CNFN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-CMRN', 'COUNTY', 'Carmarthenshire/Sir Gaerfyrddin', 'CMRN', NULL, 'CMRN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-CMRN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-DENB', 'COUNTY', 'Denbighshire/Sir Ddinbych', 'DENB', NULL, 'DENB', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-DENB');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-ELOTH', 'COUNTY', 'East Lothian/Haddingtonshire', 'ELOTH', NULL, 'ELOTH', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-ELOTH');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-FTSH', 'COUNTY', 'Flintshire/Sir Fflint', 'FTSH', NULL, 'FTSH', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-FTSH');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-MMTH', 'COUNTY', 'Monmouthshire/Sir Fynwy', 'MMTH', NULL, 'MMTH', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-MMTH');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-MNTGS', 'COUNTY', 'Montgomeryshire/Sir Drefaldwyn', 'MNTGS', NULL, 'MNTGS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-MNTGS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-PMBRK', 'COUNTY', 'Pembrokeshire/Sir Benfro', 'PMBRK', NULL, 'PMBRK', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-PMBRK');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-RNRS', 'COUNTY', 'Radnorshire/Sir Faesyfed', 'RNRS', NULL, 'RNRS', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-RNRS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'GB-WLOTH', 'COUNTY', 'West Lothian/Linlithgowshire', 'WLOTH', NULL, 'WLOTH', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'GB-WLOTH');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'SCOT', 'GB-ABDN', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'SCOT' AND geo_id_to = 'GB-ABDN' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'SCOT', 'GB-ANGS', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'SCOT' AND geo_id_to = 'GB-ANGS' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'SCOT', 'GB-ARGL', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'SCOT' AND geo_id_to = 'GB-ARGL' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'SCOT', 'GB-AYRS', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'SCOT' AND geo_id_to = 'GB-AYRS' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'SCOT', 'GB-BANF', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'SCOT' AND geo_id_to = 'GB-BANF' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ENGL', 'GB-BDFD', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ENGL' AND geo_id_to = 'GB-BDFD' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ENGL', 'GB-BRKS', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ENGL' AND geo_id_to = 'GB-BRKS' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ENGL', 'GB-BWKS', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ENGL' AND geo_id_to = 'GB-BWKS' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ENGL', 'GB-BUCKS', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ENGL' AND geo_id_to = 'GB-BUCKS' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'SCOT', 'GB-BUTE', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'SCOT' AND geo_id_to = 'GB-BUTE' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'WALS', 'GB-CTHN', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'WALS' AND geo_id_to = 'GB-CTHN' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ENGL', 'GB-CAMBS', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ENGL' AND geo_id_to = 'GB-CAMBS' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'WALS', 'GB-CDGN', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'WALS' AND geo_id_to = 'GB-CDGN' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ENGL', 'GB-CHES', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ENGL' AND geo_id_to = 'GB-CHES' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'SCOT', 'GB-CLAK', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'SCOT' AND geo_id_to = 'GB-CLAK' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ENGL', 'GB-CNWL', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ENGL' AND geo_id_to = 'GB-CNWL' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'SCOT', 'GB-CMTY', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'SCOT' AND geo_id_to = 'GB-CMTY' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ENGL', 'GB-CUMB', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ENGL' AND geo_id_to = 'GB-CUMB' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ENGL', 'GB-DRBYS', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ENGL' AND geo_id_to = 'GB-DRBYS' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ENGL', 'GB-DEVON', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ENGL' AND geo_id_to = 'GB-DEVON' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ENGL', 'GB-DRST', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ENGL' AND geo_id_to = 'GB-DRST' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'SCOT', 'GB-DMFS', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'SCOT' AND geo_id_to = 'GB-DMFS' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'SCOT', 'GB-DMBR', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'SCOT' AND geo_id_to = 'GB-DMBR' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ENGL', 'GB-DRHM', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ENGL' AND geo_id_to = 'GB-DRHM' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ENGL', 'GB-ESSX', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ENGL' AND geo_id_to = 'GB-ESSX' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'SCOT', 'GB-FIFE', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'SCOT' AND geo_id_to = 'GB-FIFE' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'WALS', 'GB-GLAM', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'WALS' AND geo_id_to = 'GB-GLAM' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ENGL', 'GB-GLOU', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ENGL' AND geo_id_to = 'GB-GLOU' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ENGL', 'GB-HAMPS', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ENGL' AND geo_id_to = 'GB-HAMPS' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ENGL', 'GB-HRFDS', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ENGL' AND geo_id_to = 'GB-HRFDS' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ENGL', 'GB-HERTS', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ENGL' AND geo_id_to = 'GB-HERTS' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ENGL', 'GB-HUNTS', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ENGL' AND geo_id_to = 'GB-HUNTS' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'SCOT', 'GB-INVER', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'SCOT' AND geo_id_to = 'GB-INVER' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ENGL', 'GB-KENT', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ENGL' AND geo_id_to = 'GB-KENT' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'SCOT', 'GB-KNDN', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'SCOT' AND geo_id_to = 'GB-KNDN' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'SCOT', 'GB-KRSS', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'SCOT' AND geo_id_to = 'GB-KRSS' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'SCOT', 'GB-KRCUD', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'SCOT' AND geo_id_to = 'GB-KRCUD' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'SCOT', 'GB-LRKS', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'SCOT' AND geo_id_to = 'GB-LRKS' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ENGL', 'GB-LANCS', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ENGL' AND geo_id_to = 'GB-LANCS' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ENGL', 'GB-LIECS', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ENGL' AND geo_id_to = 'GB-LIECS' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ENGL', 'GB-LINCS', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ENGL' AND geo_id_to = 'GB-LINCS' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'WALS', 'GB-MIENT', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'WALS' AND geo_id_to = 'GB-MIENT' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ENGL', 'GB-MSEX', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ENGL' AND geo_id_to = 'GB-MSEX' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'SCOT', 'GB-MLOTH', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'SCOT' AND geo_id_to = 'GB-MLOTH' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'SCOT', 'GB-MORAY', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'SCOT' AND geo_id_to = 'GB-MORAY' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'SCOT', 'GB-NAIRN', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'SCOT' AND geo_id_to = 'GB-NAIRN' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ENGL', 'GB-NFLK', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ENGL' AND geo_id_to = 'GB-NFLK' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ENGL', 'GB-NHANTS', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ENGL' AND geo_id_to = 'GB-NHANTS' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ENGL', 'GB-NHUMB', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ENGL' AND geo_id_to = 'GB-NHUMB' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ENGL', 'GB-NOTTS', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ENGL' AND geo_id_to = 'GB-NOTTS' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'SCOT', 'GB-ORK', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'SCOT' AND geo_id_to = 'GB-ORK' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ENGL', 'GB-OXFD', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ENGL' AND geo_id_to = 'GB-OXFD' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'SCOT', 'GB-PEEBS', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'SCOT' AND geo_id_to = 'GB-PEEBS' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'SCOT', 'GB-PERTH', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'SCOT' AND geo_id_to = 'GB-PERTH' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'SCOT', 'GB-RNFR', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'SCOT' AND geo_id_to = 'GB-RNFR' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'SCOT', 'GB-ROSS', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'SCOT' AND geo_id_to = 'GB-ROSS' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'SCOT', 'GB-ROXB', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'SCOT' AND geo_id_to = 'GB-ROXB' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ENGL', 'GB-RUTL', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ENGL' AND geo_id_to = 'GB-RUTL' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'SCOT', 'GB-SELKS', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'SCOT' AND geo_id_to = 'GB-SELKS' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'SCOT', 'GB-SHET', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'SCOT' AND geo_id_to = 'GB-SHET' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ENGL', 'GB-SHROPS', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ENGL' AND geo_id_to = 'GB-SHROPS' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ENGL', 'GB-SOMST', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ENGL' AND geo_id_to = 'GB-SOMST' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ENGL', 'GB-STAFFS', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ENGL' AND geo_id_to = 'GB-STAFFS' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'SCOT', 'GB-STLNG', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'SCOT' AND geo_id_to = 'GB-STLNG' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ENGL', 'GB-SFFK', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ENGL' AND geo_id_to = 'GB-SFFK' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ENGL', 'GB-SURR', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ENGL' AND geo_id_to = 'GB-SURR' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ENGL', 'GB-SUSX', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ENGL' AND geo_id_to = 'GB-SUSX' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'SCOT', 'GB-SUTH', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'SCOT' AND geo_id_to = 'GB-SUTH' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ENGL', 'GB-WWKS', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ENGL' AND geo_id_to = 'GB-WWKS' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ENGL', 'GB-WMLD', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ENGL' AND geo_id_to = 'GB-WMLD' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'SCOT', 'GB-WGNSH', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'SCOT' AND geo_id_to = 'GB-WGNSH' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ENGL', 'GB-WILTS', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ENGL' AND geo_id_to = 'GB-WILTS' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ENGL', 'GB-WORCS', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ENGL' AND geo_id_to = 'GB-WORCS' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'ENGL', 'GB-YORKS', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'ENGL' AND geo_id_to = 'GB-YORKS' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'WALS', 'GB-AGSY', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'WALS' AND geo_id_to = 'GB-AGSY' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'WALS', 'GB-BREK', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'WALS' AND geo_id_to = 'GB-BREK' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'WALS', 'GB-CNFN', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'WALS' AND geo_id_to = 'GB-CNFN' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'WALS', 'GB-CMRN', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'WALS' AND geo_id_to = 'GB-CMRN' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'WALS', 'GB-DENB', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'WALS' AND geo_id_to = 'GB-DENB' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'SCOT', 'GB-ELOTH', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'SCOT' AND geo_id_to = 'GB-ELOTH' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'WALS', 'GB-FTSH', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'WALS' AND geo_id_to = 'GB-FTSH' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'WALS', 'GB-MMTH', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'WALS' AND geo_id_to = 'GB-MMTH' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'WALS', 'GB-MNTGS', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'WALS' AND geo_id_to = 'GB-MNTGS' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'WALS', 'GB-PMBRK', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'WALS' AND geo_id_to = 'GB-PMBRK' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'WALS', 'GB-RNRS', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'WALS' AND geo_id_to = 'GB-RNRS' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'SCOT', 'GB-WLOTH', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'SCOT' AND geo_id_to = 'GB-WLOTH' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'NIRL-ATRM', 'COUNTY', 'Antrim', 'ATRM', NULL, 'ATRM', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'NIRL-ATRM');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'NIRL-ARMG', 'COUNTY', 'Armagh', 'ARMG', NULL, 'ARMG', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'NIRL-ARMG');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'NIRL-DOWN', 'COUNTY', 'Down', 'DOWN', NULL, 'DOWN', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'NIRL-DOWN');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'NIRL-FMNH', 'COUNTY', 'Fermanagh', 'FMNH', NULL, 'FMNH', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'NIRL-FMNH');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'NIRL-LDRY', 'COUNTY', 'Londonderry', 'LDRY', NULL, 'LDRY', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'NIRL-LDRY');

INSERT INTO geo (geo_id, geo_type_id, geo_name, geo_code, geo_sec_code, abbreviation, well_known_text)
SELECT 'NIRL-TYR', 'COUNTY', 'Tyrone', 'TYR', NULL, 'TYR', NULL
WHERE NOT EXISTS (SELECT 1 FROM geo WHERE geo_id = 'NIRL-TYR');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'NIRL', 'NIRL-ATRM', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'NIRL' AND geo_id_to = 'NIRL-ATRM' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'NIRL', 'NIRL-ARMG', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'NIRL' AND geo_id_to = 'NIRL-ARMG' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'NIRL', 'NIRL-DOWN', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'NIRL' AND geo_id_to = 'NIRL-DOWN' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'NIRL', 'NIRL-FMNH', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'NIRL' AND geo_id_to = 'NIRL-FMNH' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'NIRL', 'NIRL-LDRY', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'NIRL' AND geo_id_to = 'NIRL-LDRY' AND geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc (geo_id, geo_id_to, geo_assoc_type_id)
SELECT 'NIRL', 'NIRL-TYR', 'REGIONS'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc WHERE geo_id = 'NIRL' AND geo_id_to = 'NIRL-TYR' AND geo_assoc_type_id = 'REGIONS');
