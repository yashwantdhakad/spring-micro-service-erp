INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'b', 'Bit of Data', 'DATA_b', 'DATA_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'b' AND description = 'Bit of Data' AND uom_id = 'DATA_b' AND uom_type_id = 'DATA_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'Kb', 'Kilobit of Data', 'DATA_Kb', 'DATA_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'Kb' AND description = 'Kilobit of Data' AND uom_id = 'DATA_Kb' AND uom_type_id = 'DATA_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'Mb', 'Megabit of Data', 'DATA_Mb', 'DATA_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'Mb' AND description = 'Megabit of Data' AND uom_id = 'DATA_Mb' AND uom_type_id = 'DATA_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'Gb', 'Gigabit of Data', 'DATA_Gb', 'DATA_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'Gb' AND description = 'Gigabit of Data' AND uom_id = 'DATA_Gb' AND uom_type_id = 'DATA_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'Tb', 'Terabit of Data', 'DATA_Tb', 'DATA_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'Tb' AND description = 'Terabit of Data' AND uom_id = 'DATA_Tb' AND uom_type_id = 'DATA_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'Pb', 'Petabit of Data', 'DATA_Pb', 'DATA_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'Pb' AND description = 'Petabit of Data' AND uom_id = 'DATA_Pb' AND uom_type_id = 'DATA_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'B', 'Byte of Data', 'DATA_B', 'DATA_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'B' AND description = 'Byte of Data' AND uom_id = 'DATA_B' AND uom_type_id = 'DATA_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'KB', 'Kilobyte of Data', 'DATA_KB', 'DATA_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'KB' AND description = 'Kilobyte of Data' AND uom_id = 'DATA_KB' AND uom_type_id = 'DATA_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'MB', 'Megabyte of Data', 'DATA_MB', 'DATA_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'MB' AND description = 'Megabyte of Data' AND uom_id = 'DATA_MB' AND uom_type_id = 'DATA_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'GB', 'Gigabyte of Data', 'DATA_GB', 'DATA_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'GB' AND description = 'Gigabyte of Data' AND uom_id = 'DATA_GB' AND uom_type_id = 'DATA_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'TB', 'Terabyte of Data', 'DATA_TB', 'DATA_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'TB' AND description = 'Terabyte of Data' AND uom_id = 'DATA_TB' AND uom_type_id = 'DATA_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'PB', 'Petabyte of Data', 'DATA_PB', 'DATA_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'PB' AND description = 'Petabyte of Data' AND uom_id = 'DATA_PB' AND uom_type_id = 'DATA_MEASURE');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '1024', 'DATA_Kb', 'DATA_b'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '1024' AND uom_id = 'DATA_Kb' AND uom_id_to = 'DATA_b');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '1024', 'DATA_Mb', 'DATA_Kb'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '1024' AND uom_id = 'DATA_Mb' AND uom_id_to = 'DATA_Kb');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '1024', 'DATA_Gb', 'DATA_Mb'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '1024' AND uom_id = 'DATA_Gb' AND uom_id_to = 'DATA_Mb');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '1024', 'DATA_Tb', 'DATA_Gb'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '1024' AND uom_id = 'DATA_Tb' AND uom_id_to = 'DATA_Gb');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '1024', 'DATA_Pb', 'DATA_Tb'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '1024' AND uom_id = 'DATA_Pb' AND uom_id_to = 'DATA_Tb');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '8', 'DATA_B', 'DATA_b'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '8' AND uom_id = 'DATA_B' AND uom_id_to = 'DATA_b');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '1024', 'DATA_KB', 'DATA_B'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '1024' AND uom_id = 'DATA_KB' AND uom_id_to = 'DATA_B');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '1024', 'DATA_MB', 'DATA_KB'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '1024' AND uom_id = 'DATA_MB' AND uom_id_to = 'DATA_KB');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '1024', 'DATA_GB', 'DATA_MB'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '1024' AND uom_id = 'DATA_GB' AND uom_id_to = 'DATA_MB');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '1024', 'DATA_TB', 'DATA_GB'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '1024' AND uom_id = 'DATA_TB' AND uom_id_to = 'DATA_GB');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '1024', 'DATA_PB', 'DATA_TB'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '1024' AND uom_id = 'DATA_PB' AND uom_id_to = 'DATA_TB');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'bps', 'Bit-per-second of Data', 'DATASPD_bps', 'DATASPD_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'bps' AND description = 'Bit-per-second of Data' AND uom_id = 'DATASPD_bps' AND uom_type_id = 'DATASPD_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'Kbps', 'Kilobit-per-second of Data', 'DATASPD_Kbps', 'DATASPD_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'Kbps' AND description = 'Kilobit-per-second of Data' AND uom_id = 'DATASPD_Kbps' AND uom_type_id = 'DATASPD_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'Mbps', 'Megabit-per-second of Data', 'DATASPD_Mbps', 'DATASPD_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'Mbps' AND description = 'Megabit-per-second of Data' AND uom_id = 'DATASPD_Mbps' AND uom_type_id = 'DATASPD_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'Gbps', 'Gigabit-per-second of Data', 'DATASPD_Gbps', 'DATASPD_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'Gbps' AND description = 'Gigabit-per-second of Data' AND uom_id = 'DATASPD_Gbps' AND uom_type_id = 'DATASPD_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'Tbps', 'Terabit-per-second of Data', 'DATASPD_Tbps', 'DATASPD_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'Tbps' AND description = 'Terabit-per-second of Data' AND uom_id = 'DATASPD_Tbps' AND uom_type_id = 'DATASPD_MEASURE');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '1024', 'DATASPD_Kbps', 'DATASPD_bps'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '1024' AND uom_id = 'DATASPD_Kbps' AND uom_id_to = 'DATASPD_bps');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '1024', 'DATASPD_Mbps', 'DATASPD_Kbps'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '1024' AND uom_id = 'DATASPD_Mbps' AND uom_id_to = 'DATASPD_Kbps');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '1024', 'DATASPD_Gbps', 'DATASPD_Mbps'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '1024' AND uom_id = 'DATASPD_Gbps' AND uom_id_to = 'DATASPD_Mbps');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '1024', 'DATASPD_Tbps', 'DATASPD_Gbps'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '1024' AND uom_id = 'DATASPD_Tbps' AND uom_id_to = 'DATASPD_Gbps');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'ms', 'Time in Milli-Seconds', 'TF_ms', 'TIME_FREQ_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'ms' AND description = 'Time in Milli-Seconds' AND uom_id = 'TF_ms' AND uom_type_id = 'TIME_FREQ_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 's', 'Time in Seconds', 'TF_s', 'TIME_FREQ_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 's' AND description = 'Time in Seconds' AND uom_id = 'TF_s' AND uom_type_id = 'TIME_FREQ_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'min', 'Time in Minutes', 'TF_min', 'TIME_FREQ_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'min' AND description = 'Time in Minutes' AND uom_id = 'TF_min' AND uom_type_id = 'TIME_FREQ_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'hr', 'Time in Hours', 'TF_hr', 'TIME_FREQ_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'hr' AND description = 'Time in Hours' AND uom_id = 'TF_hr' AND uom_type_id = 'TIME_FREQ_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'day', 'Time in Days', 'TF_day', 'TIME_FREQ_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'day' AND description = 'Time in Days' AND uom_id = 'TF_day' AND uom_type_id = 'TIME_FREQ_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'wk', 'Time in Weeks', 'TF_wk', 'TIME_FREQ_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'wk' AND description = 'Time in Weeks' AND uom_id = 'TF_wk' AND uom_type_id = 'TIME_FREQ_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'mon', 'Time in Months', 'TF_mon', 'TIME_FREQ_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'mon' AND description = 'Time in Months' AND uom_id = 'TF_mon' AND uom_type_id = 'TIME_FREQ_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'yr', 'Time in Years', 'TF_yr', 'TIME_FREQ_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'yr' AND description = 'Time in Years' AND uom_id = 'TF_yr' AND uom_type_id = 'TIME_FREQ_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'decade', 'Time in Decades', 'TF_decade', 'TIME_FREQ_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'decade' AND description = 'Time in Decades' AND uom_id = 'TF_decade' AND uom_type_id = 'TIME_FREQ_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'score', 'Time in Scores', 'TF_score', 'TIME_FREQ_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'score' AND description = 'Time in Scores' AND uom_id = 'TF_score' AND uom_type_id = 'TIME_FREQ_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'century', 'Time in Centuries', 'TF_century', 'TIME_FREQ_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'century' AND description = 'Time in Centuries' AND uom_id = 'TF_century' AND uom_type_id = 'TIME_FREQ_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'millenium', 'Time in Millenia', 'TF_millenium', 'TIME_FREQ_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'millenium' AND description = 'Time in Millenia' AND uom_id = 'TF_millenium' AND uom_type_id = 'TIME_FREQ_MEASURE');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '1000', 'TF_s', 'TF_ms'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '1000' AND uom_id = 'TF_s' AND uom_id_to = 'TF_ms');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '60', 'TF_min', 'TF_s'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '60' AND uom_id = 'TF_min' AND uom_id_to = 'TF_s');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '60', 'TF_hr', 'TF_min'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '60' AND uom_id = 'TF_hr' AND uom_id_to = 'TF_min');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '24', 'TF_day', 'TF_hr'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '24' AND uom_id = 'TF_day' AND uom_id_to = 'TF_hr');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '7', 'TF_wk', 'TF_day'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '7' AND uom_id = 'TF_wk' AND uom_id_to = 'TF_day');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '365', 'TF_yr', 'TF_day'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '365' AND uom_id = 'TF_yr' AND uom_id_to = 'TF_day');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '10', 'TF_decade', 'TF_yr'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '10' AND uom_id = 'TF_decade' AND uom_id_to = 'TF_yr');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '20', 'TF_score', 'TF_yr'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '20' AND uom_id = 'TF_score' AND uom_id_to = 'TF_yr');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '100', 'TF_century', 'TF_yr'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '100' AND uom_id = 'TF_century' AND uom_id_to = 'TF_yr');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '1000', 'TF_millenium', 'TF_yr'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '1000' AND uom_id = 'TF_millenium' AND uom_id_to = 'TF_yr');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'A', 'Angstrom', 'LEN_A', 'LENGTH_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'A' AND description = 'Angstrom' AND uom_id = 'LEN_A' AND uom_type_id = 'LENGTH_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'cb', 'Cable', 'LEN_cb', 'LENGTH_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'cb' AND description = 'Cable' AND uom_id = 'LEN_cb' AND uom_type_id = 'LENGTH_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'cm', 'Centimeter', 'LEN_cm', 'LENGTH_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'cm' AND description = 'Centimeter' AND uom_id = 'LEN_cm' AND uom_type_id = 'LENGTH_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'chG', 'Chain (Gunter''s/surveyor''s)', 'LEN_chG', 'LENGTH_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'chG' AND description = 'Chain (Gunter''s/surveyor''s)' AND uom_id = 'LEN_chG' AND uom_type_id = 'LENGTH_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'chR', 'Chain (Ramden''s/engineer''s)', 'LEN_chR', 'LENGTH_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'chR' AND description = 'Chain (Ramden''s/engineer''s)' AND uom_id = 'LEN_chR' AND uom_type_id = 'LENGTH_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'dm', 'Decimeter', 'LEN_dm', 'LENGTH_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'dm' AND description = 'Decimeter' AND uom_id = 'LEN_dm' AND uom_type_id = 'LENGTH_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'dam', 'Dekameter', 'LEN_dam', 'LENGTH_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'dam' AND description = 'Dekameter' AND uom_id = 'LEN_dam' AND uom_type_id = 'LENGTH_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'fm', 'Fathom', 'LEN_fm', 'LENGTH_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'fm' AND description = 'Fathom' AND uom_id = 'LEN_fm' AND uom_type_id = 'LENGTH_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'ft', 'Foot', 'LEN_ft', 'LENGTH_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'ft' AND description = 'Foot' AND uom_id = 'LEN_ft' AND uom_type_id = 'LENGTH_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'fur', 'Furlong', 'LEN_fur', 'LENGTH_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'fur' AND description = 'Furlong' AND uom_id = 'LEN_fur' AND uom_type_id = 'LENGTH_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'hand', 'Hand (horse''s height)', 'LEN_hand', 'LENGTH_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'hand' AND description = 'Hand (horse''s height)' AND uom_id = 'LEN_hand' AND uom_type_id = 'LENGTH_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'in', 'Inch', 'LEN_in', 'LENGTH_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'in' AND description = 'Inch' AND uom_id = 'LEN_in' AND uom_type_id = 'LENGTH_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'km', 'Kilometer', 'LEN_km', 'LENGTH_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'km' AND description = 'Kilometer' AND uom_id = 'LEN_km' AND uom_type_id = 'LENGTH_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'league', 'League', 'LEN_league', 'LENGTH_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'league' AND description = 'League' AND uom_id = 'LEN_league' AND uom_type_id = 'LENGTH_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'lnG', 'Link (Gunter''s)', 'LEN_lnG', 'LENGTH_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'lnG' AND description = 'Link (Gunter''s)' AND uom_id = 'LEN_lnG' AND uom_type_id = 'LENGTH_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'lnR', 'Link (Ramden''s)', 'LEN_lnR', 'LENGTH_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'lnR' AND description = 'Link (Ramden''s)' AND uom_id = 'LEN_lnR' AND uom_type_id = 'LENGTH_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'm', 'Meter', 'LEN_m', 'LENGTH_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'm' AND description = 'Meter' AND uom_id = 'LEN_m' AND uom_type_id = 'LENGTH_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'u', 'Micrometer (Micron)', 'LEN_u', 'LENGTH_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'u' AND description = 'Micrometer (Micron)' AND uom_id = 'LEN_u' AND uom_type_id = 'LENGTH_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'mi', 'Mile (statute/land)', 'LEN_mi', 'LENGTH_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'mi' AND description = 'Mile (statute/land)' AND uom_id = 'LEN_mi' AND uom_type_id = 'LENGTH_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'nmi', 'Mile (nautical/sea)', 'LEN_nmi', 'LENGTH_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'nmi' AND description = 'Mile (nautical/sea)' AND uom_id = 'LEN_nmi' AND uom_type_id = 'LENGTH_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'mm', 'Millimeter', 'LEN_mm', 'LENGTH_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'mm' AND description = 'Millimeter' AND uom_id = 'LEN_mm' AND uom_type_id = 'LENGTH_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'mil', 'Mil (Milli-inch)', 'LEN_mil', 'LENGTH_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'mil' AND description = 'Mil (Milli-inch)' AND uom_id = 'LEN_mil' AND uom_type_id = 'LENGTH_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'point', 'Point (type size)', 'LEN_point', 'LENGTH_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'point' AND description = 'Point (type size)' AND uom_id = 'LEN_point' AND uom_type_id = 'LENGTH_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'pica', 'Pica (type size)', 'LEN_pica', 'LENGTH_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'pica' AND description = 'Pica (type size)' AND uom_id = 'LEN_pica' AND uom_type_id = 'LENGTH_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'rd', 'Rod', 'LEN_rd', 'LENGTH_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'rd' AND description = 'Rod' AND uom_id = 'LEN_rd' AND uom_type_id = 'LENGTH_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'yd', 'Yard', 'LEN_yd', 'LENGTH_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'yd' AND description = 'Yard' AND uom_id = 'LEN_yd' AND uom_type_id = 'LENGTH_MEASURE');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '0.0000000001', 'LEN_A', 'LEN_m'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '0.0000000001' AND uom_id = 'LEN_A' AND uom_id_to = 'LEN_m');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '0.000000004', 'LEN_A', 'LEN_in'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '0.000000004' AND uom_id = 'LEN_A' AND uom_id_to = 'LEN_in');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '120', 'LEN_cb', 'LEN_fm'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '120' AND uom_id = 'LEN_cb' AND uom_id_to = 'LEN_fm');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '720', 'LEN_cb', 'LEN_ft'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '720' AND uom_id = 'LEN_cb' AND uom_id_to = 'LEN_ft');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '0.01', 'LEN_cm', 'LEN_m'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '0.01' AND uom_id = 'LEN_cm' AND uom_id_to = 'LEN_m');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '66', 'LEN_chG', 'LEN_ft'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '66' AND uom_id = 'LEN_chG' AND uom_id_to = 'LEN_ft');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '4', 'LEN_chG', 'LEN_rd'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '4' AND uom_id = 'LEN_chG' AND uom_id_to = 'LEN_rd');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '100', 'LEN_chR', 'LEN_ft'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '100' AND uom_id = 'LEN_chR' AND uom_id_to = 'LEN_ft');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '0.1', 'LEN_dm', 'LEN_m'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '0.1' AND uom_id = 'LEN_dm' AND uom_id_to = 'LEN_m');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '10', 'LEN_dam', 'LEN_m'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '10' AND uom_id = 'LEN_dam' AND uom_id_to = 'LEN_m');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '6', 'LEN_fm', 'LEN_ft'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '6' AND uom_id = 'LEN_fm' AND uom_id_to = 'LEN_ft');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '12', 'LEN_ft', 'LEN_in'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '12' AND uom_id = 'LEN_ft' AND uom_id_to = 'LEN_in');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '0.3048', 'LEN_ft', 'LEN_m'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '0.3048' AND uom_id = 'LEN_ft' AND uom_id_to = 'LEN_m');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '0.125', 'LEN_fur', 'LEN_mi'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '0.125' AND uom_id = 'LEN_fur' AND uom_id_to = 'LEN_mi');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '8', 'LEN_mi', 'LEN_fur'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '8' AND uom_id = 'LEN_mi' AND uom_id_to = 'LEN_fur');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '4', 'LEN_hand', 'LEN_in'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '4' AND uom_id = 'LEN_hand' AND uom_id_to = 'LEN_in');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '2.54', 'LEN_in', 'LEN_cm'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '2.54' AND uom_id = 'LEN_in' AND uom_id_to = 'LEN_cm');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '25.4', 'LEN_in', 'LEN_mm'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '25.4' AND uom_id = 'LEN_in' AND uom_id_to = 'LEN_mm');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '25400', 'LEN_in', 'LEN_u'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '25400' AND uom_id = 'LEN_in' AND uom_id_to = 'LEN_u');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '1000', 'LEN_km', 'LEN_m'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '1000' AND uom_id = 'LEN_km' AND uom_id_to = 'LEN_m');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '3', 'LEN_league', 'LEN_mi'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '3' AND uom_id = 'LEN_league' AND uom_id_to = 'LEN_mi');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '7.92', 'LEN_lnG', 'LEN_in'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '7.92' AND uom_id = 'LEN_lnG' AND uom_id_to = 'LEN_in');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '12', 'LEN_lnR', 'LEN_in'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '12' AND uom_id = 'LEN_lnR' AND uom_id_to = 'LEN_in');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '39.37', 'LEN_m', 'LEN_in'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '39.37' AND uom_id = 'LEN_m' AND uom_id_to = 'LEN_in');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '0.001', 'LEN_u', 'LEN_mm'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '0.001' AND uom_id = 'LEN_u' AND uom_id_to = 'LEN_mm');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '1000', 'LEN_mm', 'LEN_u'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '1000' AND uom_id = 'LEN_mm' AND uom_id_to = 'LEN_u');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '1.609', 'LEN_mi', 'LEN_km'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '1.609' AND uom_id = 'LEN_mi' AND uom_id_to = 'LEN_km');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '5280', 'LEN_mi', 'LEN_ft'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '5280' AND uom_id = 'LEN_mi' AND uom_id_to = 'LEN_ft');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '1.85', 'LEN_nmi', 'LEN_km'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '1.85' AND uom_id = 'LEN_nmi' AND uom_id_to = 'LEN_km');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '6076.11549', 'LEN_nmi', 'LEN_ft'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '6076.11549' AND uom_id = 'LEN_nmi' AND uom_id_to = 'LEN_ft');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '0.001', 'LEN_mm', 'LEN_m'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '0.001' AND uom_id = 'LEN_mm' AND uom_id_to = 'LEN_m');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '0.001', 'LEN_mil', 'LEN_in'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '0.001' AND uom_id = 'LEN_mil' AND uom_id_to = 'LEN_in');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '0.351', 'LEN_point', 'LEN_mm'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '0.351' AND uom_id = 'LEN_point' AND uom_id_to = 'LEN_mm');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '0.0138', 'LEN_point', 'LEN_in'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '0.0138' AND uom_id = 'LEN_point' AND uom_id_to = 'LEN_in');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '12', 'LEN_pica', 'LEN_point'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '12' AND uom_id = 'LEN_pica' AND uom_id_to = 'LEN_point');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '16.5', 'LEN_rd', 'LEN_ft'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '16.5' AND uom_id = 'LEN_rd' AND uom_id_to = 'LEN_ft');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '3', 'LEN_yd', 'LEN_ft'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '3' AND uom_id = 'LEN_yd' AND uom_id_to = 'LEN_ft');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'A', 'Acre', 'AREA_A', 'AREA_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'A' AND description = 'Acre' AND uom_id = 'AREA_A' AND uom_type_id = 'AREA_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'a', 'Are', 'AREA_a', 'AREA_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'a' AND description = 'Are' AND uom_id = 'AREA_a' AND uom_type_id = 'AREA_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'ha', 'Hectare', 'AREA_ha', 'AREA_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'ha' AND description = 'Hectare' AND uom_id = 'AREA_ha' AND uom_type_id = 'AREA_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'cm2', 'Square Centimeter', 'AREA_cm2', 'AREA_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'cm2' AND description = 'Square Centimeter' AND uom_id = 'AREA_cm2' AND uom_type_id = 'AREA_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'ft2', 'Square Foot', 'AREA_ft2', 'AREA_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'ft2' AND description = 'Square Foot' AND uom_id = 'AREA_ft2' AND uom_type_id = 'AREA_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'in2', 'Square Inch', 'AREA_in2', 'AREA_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'in2' AND description = 'Square Inch' AND uom_id = 'AREA_in2' AND uom_type_id = 'AREA_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'km2', 'Square Kilometer', 'AREA_km2', 'AREA_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'km2' AND description = 'Square Kilometer' AND uom_id = 'AREA_km2' AND uom_type_id = 'AREA_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'm2', 'Square Meter', 'AREA_m2', 'AREA_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'm2' AND description = 'Square Meter' AND uom_id = 'AREA_m2' AND uom_type_id = 'AREA_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'mi2', 'Square Mile', 'AREA_mi2', 'AREA_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'mi2' AND description = 'Square Mile' AND uom_id = 'AREA_mi2' AND uom_type_id = 'AREA_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'mm2', 'Square Millimeter', 'AREA_mm2', 'AREA_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'mm2' AND description = 'Square Millimeter' AND uom_id = 'AREA_mm2' AND uom_type_id = 'AREA_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'rd2', 'Square Rod', 'AREA_rd2', 'AREA_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'rd2' AND description = 'Square Rod' AND uom_id = 'AREA_rd2' AND uom_type_id = 'AREA_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'yd2', 'Square Yard', 'AREA_yd2', 'AREA_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'yd2' AND description = 'Square Yard' AND uom_id = 'AREA_yd2' AND uom_type_id = 'AREA_MEASURE');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '43560', 'AREA_A', 'AREA_ft2'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '43560' AND uom_id = 'AREA_A' AND uom_id_to = 'AREA_ft2');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '100', 'AREA_a', 'AREA_m2'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '100' AND uom_id = 'AREA_a' AND uom_id_to = 'AREA_m2');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '10000', 'AREA_ha', 'AREA_m2'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '10000' AND uom_id = 'AREA_ha' AND uom_id_to = 'AREA_m2');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '2.471', 'AREA_ha', 'AREA_A'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '2.471' AND uom_id = 'AREA_ha' AND uom_id_to = 'AREA_A');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '100', 'AREA_cm2', 'AREA_mm2'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '100' AND uom_id = 'AREA_cm2' AND uom_id_to = 'AREA_mm2');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '.155', 'AREA_cm2', 'AREA_in2'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '.155' AND uom_id = 'AREA_cm2' AND uom_id_to = 'AREA_in2');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '144', 'AREA_ft2', 'AREA_in2'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '144' AND uom_id = 'AREA_ft2' AND uom_id_to = 'AREA_in2');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '1000000', 'AREA_km2', 'AREA_m2'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '1000000' AND uom_id = 'AREA_km2' AND uom_id_to = 'AREA_m2');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '10000', 'AREA_m2', 'AREA_cm2'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '10000' AND uom_id = 'AREA_m2' AND uom_id_to = 'AREA_cm2');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '639.8', 'AREA_mi2', 'AREA_A'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '639.8' AND uom_id = 'AREA_mi2' AND uom_id_to = 'AREA_A');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '272.25', 'AREA_rd2', 'AREA_ft2'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '272.25' AND uom_id = 'AREA_rd2' AND uom_id_to = 'AREA_ft2');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '9', 'AREA_yd2', 'AREA_ft2'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '9' AND uom_id = 'AREA_yd2' AND uom_id_to = 'AREA_ft2');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'bbl', 'Barrel (US)', 'VLIQ_bbl', 'VOLUME_LIQ_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'bbl' AND description = 'Barrel (US)' AND uom_id = 'VLIQ_bbl' AND uom_type_id = 'VOLUME_LIQ_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'cup', 'Cup', 'VLIQ_cup', 'VOLUME_LIQ_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'cup' AND description = 'Cup' AND uom_id = 'VLIQ_cup' AND uom_type_id = 'VOLUME_LIQ_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'dr', 'Dram (US)', 'VLIQ_dr', 'VOLUME_LIQ_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'dr' AND description = 'Dram (US)' AND uom_id = 'VLIQ_dr' AND uom_type_id = 'VOLUME_LIQ_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'gi', 'Gill (1/4 UK pint)', 'VLIQ_gi', 'VOLUME_LIQ_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'gi' AND description = 'Gill (1/4 UK pint)' AND uom_id = 'VLIQ_gi' AND uom_type_id = 'VOLUME_LIQ_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'gal', 'Gallon (UK)', 'VLIQ_galUK', 'VOLUME_LIQ_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'gal' AND description = 'Gallon (UK)' AND uom_id = 'VLIQ_galUK' AND uom_type_id = 'VOLUME_LIQ_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'gal', 'Gallon (US)', 'VLIQ_galUS', 'VOLUME_LIQ_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'gal' AND description = 'Gallon (US)' AND uom_id = 'VLIQ_galUS' AND uom_type_id = 'VOLUME_LIQ_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'm3', 'Cubic meter (liquid)', 'VLIQ_M3', 'VOLUME_LIQ_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'm3' AND description = 'Cubic meter (liquid)' AND uom_id = 'VLIQ_M3' AND uom_type_id = 'VOLUME_LIQ_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'hL', 'Hectoliter', 'VLIQ_HL', 'VOLUME_LIQ_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'hL' AND description = 'Hectoliter' AND uom_id = 'VLIQ_HL' AND uom_type_id = 'VOLUME_LIQ_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'L', 'Liter', 'VLIQ_L', 'VOLUME_LIQ_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'L' AND description = 'Liter' AND uom_id = 'VLIQ_L' AND uom_type_id = 'VOLUME_LIQ_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'ml', 'Milliliter', 'VLIQ_ml', 'VOLUME_LIQ_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'ml' AND description = 'Milliliter' AND uom_id = 'VLIQ_ml' AND uom_type_id = 'VOLUME_LIQ_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'fl. oz (UK)', 'Ounce, fluid (UK)', 'VLIQ_ozUK', 'VOLUME_LIQ_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'fl. oz (UK)' AND description = 'Ounce, fluid (UK)' AND uom_id = 'VLIQ_ozUK' AND uom_type_id = 'VOLUME_LIQ_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'fl. oz (US)', 'Ounce, fluid (US)', 'VLIQ_ozUS', 'VOLUME_LIQ_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'fl. oz (US)' AND description = 'Ounce, fluid (US)' AND uom_id = 'VLIQ_ozUS' AND uom_type_id = 'VOLUME_LIQ_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'pt (UK)', 'Pint (UK)', 'VLIQ_ptUK', 'VOLUME_LIQ_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'pt (UK)' AND description = 'Pint (UK)' AND uom_id = 'VLIQ_ptUK' AND uom_type_id = 'VOLUME_LIQ_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'pt (US)', 'Pint (US)', 'VLIQ_ptUS', 'VOLUME_LIQ_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'pt (US)' AND description = 'Pint (US)' AND uom_id = 'VLIQ_ptUS' AND uom_type_id = 'VOLUME_LIQ_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'qt', 'Quart', 'VLIQ_qt', 'VOLUME_LIQ_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'qt' AND description = 'Quart' AND uom_id = 'VLIQ_qt' AND uom_type_id = 'VOLUME_LIQ_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'Tbs', 'Tablespoon', 'VLIQ_Tbs', 'VOLUME_LIQ_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'Tbs' AND description = 'Tablespoon' AND uom_id = 'VLIQ_Tbs' AND uom_type_id = 'VOLUME_LIQ_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'tsp', 'Teaspoon', 'VLIQ_tsp', 'VOLUME_LIQ_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'tsp' AND description = 'Teaspoon' AND uom_id = 'VLIQ_tsp' AND uom_type_id = 'VOLUME_LIQ_MEASURE');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '31.5', 'VLIQ_bbl', 'VLIQ_galUS'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '31.5' AND uom_id = 'VLIQ_bbl' AND uom_id_to = 'VLIQ_galUS');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '8', 'VLIQ_ozUS', 'VLIQ_dr'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '8' AND uom_id = 'VLIQ_ozUS' AND uom_id_to = 'VLIQ_dr');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '4', 'VLIQ_ptUK', 'VLIQ_gi'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '4' AND uom_id = 'VLIQ_ptUK' AND uom_id_to = 'VLIQ_gi');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '1.2009', 'VLIQ_galUK', 'VLIQ_galUS'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '1.2009' AND uom_id = 'VLIQ_galUK' AND uom_id_to = 'VLIQ_galUS');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '4', 'VLIQ_galUS', 'VLIQ_qt'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '4' AND uom_id = 'VLIQ_galUS' AND uom_id_to = 'VLIQ_qt');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '3.785', 'VLIQ_galUS', 'VLIQ_L'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '3.785' AND uom_id = 'VLIQ_galUS' AND uom_id_to = 'VLIQ_L');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '1000', 'VLIQ_M3', 'VLIQ_L'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '1000' AND uom_id = 'VLIQ_M3' AND uom_id_to = 'VLIQ_L');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '1.056', 'VLIQ_L', 'VLIQ_qt'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '1.056' AND uom_id = 'VLIQ_L' AND uom_id_to = 'VLIQ_qt');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '0.001', 'VLIQ_ml', 'VLIQ_L'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '0.001' AND uom_id = 'VLIQ_ml' AND uom_id_to = 'VLIQ_L');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '1000', 'VLIQ_L', 'VLIQ_ml'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '1000' AND uom_id = 'VLIQ_L' AND uom_id_to = 'VLIQ_ml');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '100', 'VLIQ_HL', 'VLIQ_L'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '100' AND uom_id = 'VLIQ_HL' AND uom_id_to = 'VLIQ_L');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '0.029', 'VLIQ_ozUK', 'VLIQ_L'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '0.029' AND uom_id = 'VLIQ_ozUK' AND uom_id_to = 'VLIQ_L');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '0.96', 'VLIQ_ozUK', 'VLIQ_ozUS'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '0.96' AND uom_id = 'VLIQ_ozUK' AND uom_id_to = 'VLIQ_ozUS');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '2', 'VLIQ_ozUS', 'VLIQ_Tbs'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '2' AND uom_id = 'VLIQ_ozUS' AND uom_id_to = 'VLIQ_Tbs');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '3', 'VLIQ_Tbs', 'VLIQ_tsp'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '3' AND uom_id = 'VLIQ_Tbs' AND uom_id_to = 'VLIQ_tsp');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '16', 'VLIQ_cup', 'VLIQ_Tbs'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '16' AND uom_id = 'VLIQ_cup' AND uom_id_to = 'VLIQ_Tbs');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '1.2', 'VLIQ_ptUK', 'VLIQ_ptUS'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '1.2' AND uom_id = 'VLIQ_ptUK' AND uom_id_to = 'VLIQ_ptUS');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '16', 'VLIQ_ptUS', 'VLIQ_ozUS'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '16' AND uom_id = 'VLIQ_ptUS' AND uom_id_to = 'VLIQ_ozUS');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '2', 'VLIQ_qt', 'VLIQ_ptUS'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '2' AND uom_id = 'VLIQ_qt' AND uom_id_to = 'VLIQ_ptUS');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'cm3', 'Cubic centimeter', 'VDRY_cm3', 'VOLUME_DRY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'cm3' AND description = 'Cubic centimeter' AND uom_id = 'VDRY_cm3' AND uom_type_id = 'VOLUME_DRY_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'ft3', 'Cubic foot', 'VDRY_ft3', 'VOLUME_DRY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'ft3' AND description = 'Cubic foot' AND uom_id = 'VDRY_ft3' AND uom_type_id = 'VOLUME_DRY_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'in3', 'Cubic inch', 'VDRY_in3', 'VOLUME_DRY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'in3' AND description = 'Cubic inch' AND uom_id = 'VDRY_in3' AND uom_type_id = 'VOLUME_DRY_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'm3', 'Cubic meter', 'VDRY_m3', 'VOLUME_DRY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'm3' AND description = 'Cubic meter' AND uom_id = 'VDRY_m3' AND uom_type_id = 'VOLUME_DRY_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'mm3', 'Cubic millimeter', 'VDRY_mm3', 'VOLUME_DRY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'mm3' AND description = 'Cubic millimeter' AND uom_id = 'VDRY_mm3' AND uom_type_id = 'VOLUME_DRY_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'ST', 'Stere (cubic meter)', 'VDRY_ST', 'VOLUME_DRY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'ST' AND description = 'Stere (cubic meter)' AND uom_id = 'VDRY_ST' AND uom_type_id = 'VOLUME_DRY_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'yd3', 'Cubic yard', 'VDRY_yd3', 'VOLUME_DRY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'yd3' AND description = 'Cubic yard' AND uom_id = 'VDRY_yd3' AND uom_type_id = 'VOLUME_DRY_MEASURE');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '0.001', 'VLIQ_L', 'VDRY_m3'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '0.001' AND uom_id = 'VLIQ_L' AND uom_id_to = 'VDRY_m3');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '0.4546', 'VLIQ_galUK', 'VDRY_m3'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '0.4546' AND uom_id = 'VLIQ_galUK' AND uom_id_to = 'VDRY_m3');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '1000', 'VDRY_cm3', 'VDRY_mm3'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '1000' AND uom_id = 'VDRY_cm3' AND uom_id_to = 'VDRY_mm3');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '0.061', 'VDRY_cm3', 'VDRY_in3'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '0.061' AND uom_id = 'VDRY_cm3' AND uom_id_to = 'VDRY_in3');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '1728', 'VDRY_ft3', 'VDRY_in3'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '1728' AND uom_id = 'VDRY_ft3' AND uom_id_to = 'VDRY_in3');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '1', 'VDRY_ST', 'VDRY_m3'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '1' AND uom_id = 'VDRY_ST' AND uom_id_to = 'VDRY_m3');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '1.3', 'VDRY_m3', 'VDRY_yd3'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '1.3' AND uom_id = 'VDRY_m3' AND uom_id_to = 'VDRY_yd3');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '27', 'VDRY_yd3', 'VDRY_ft3'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '27' AND uom_id = 'VDRY_yd3' AND uom_id_to = 'VDRY_ft3');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'dr avdp', 'Dram (avdp)', 'WT_dr_avdp', 'WEIGHT_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'dr avdp' AND description = 'Dram (avdp)' AND uom_id = 'WT_dr_avdp' AND uom_type_id = 'WEIGHT_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'gr', 'Grain', 'WT_gr', 'WEIGHT_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'gr' AND description = 'Grain' AND uom_id = 'WT_gr' AND uom_type_id = 'WEIGHT_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'g', 'Gram', 'WT_g', 'WEIGHT_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'g' AND description = 'Gram' AND uom_id = 'WT_g' AND uom_type_id = 'WEIGHT_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'kg', 'Kilogram', 'WT_kg', 'WEIGHT_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'kg' AND description = 'Kilogram' AND uom_id = 'WT_kg' AND uom_type_id = 'WEIGHT_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'mg', 'Milligram', 'WT_mg', 'WEIGHT_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'mg' AND description = 'Milligram' AND uom_id = 'WT_mg' AND uom_type_id = 'WEIGHT_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'oz', 'Ounce (avdp)', 'WT_oz', 'WEIGHT_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'oz' AND description = 'Ounce (avdp)' AND uom_id = 'WT_oz' AND uom_type_id = 'WEIGHT_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'oz tr', 'Ounce (troy)', 'WT_oz_tr', 'WEIGHT_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'oz tr' AND description = 'Ounce (troy)' AND uom_id = 'WT_oz_tr' AND uom_type_id = 'WEIGHT_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'dwt', 'Pennyweight', 'WT_dwt', 'WEIGHT_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'dwt' AND description = 'Pennyweight' AND uom_id = 'WT_dwt' AND uom_type_id = 'WEIGHT_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'lb', 'Pound (avdp)', 'WT_lb', 'WEIGHT_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'lb' AND description = 'Pound (avdp)' AND uom_id = 'WT_lb' AND uom_type_id = 'WEIGHT_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'st', 'Stone', 'WT_st', 'WEIGHT_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'st' AND description = 'Stone' AND uom_id = 'WT_st' AND uom_type_id = 'WEIGHT_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'lt', 'Ton (long or British)', 'WT_lt', 'WEIGHT_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'lt' AND description = 'Ton (long or British)' AND uom_id = 'WT_lt' AND uom_type_id = 'WEIGHT_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'mt', 'Ton (metric)', 'WT_mt', 'WEIGHT_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'mt' AND description = 'Ton (metric)' AND uom_id = 'WT_mt' AND uom_type_id = 'WEIGHT_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'sh t', 'Ton (short or US)', 'WT_sh_t', 'WEIGHT_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'sh t' AND description = 'Ton (short or US)' AND uom_id = 'WT_sh_t' AND uom_type_id = 'WEIGHT_MEASURE');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '0.0625', 'WT_dr_avdp', 'WT_oz'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '0.0625' AND uom_id = 'WT_dr_avdp' AND uom_id_to = 'WT_oz');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '0.00229', 'WT_gr', 'WT_oz'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '0.00229' AND uom_id = 'WT_gr' AND uom_id_to = 'WT_oz');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '0.0648', 'WT_gr', 'WT_g'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '0.0648' AND uom_id = 'WT_gr' AND uom_id_to = 'WT_g');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '1000', 'WT_kg', 'WT_g'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '1000' AND uom_id = 'WT_kg' AND uom_id_to = 'WT_g');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '2.2', 'WT_kg', 'WT_lb'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '2.2' AND uom_id = 'WT_kg' AND uom_id_to = 'WT_lb');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '0.001', 'WT_g', 'WT_kg'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '0.001' AND uom_id = 'WT_g' AND uom_id_to = 'WT_kg');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '1000', 'WT_g', 'WT_mg'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '1000' AND uom_id = 'WT_g' AND uom_id_to = 'WT_mg');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '0.03527', 'WT_g', 'WT_oz'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '0.03527' AND uom_id = 'WT_g' AND uom_id_to = 'WT_oz');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '0.00220462247604', 'WT_g', 'WT_lb'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '0.00220462247604' AND uom_id = 'WT_g' AND uom_id_to = 'WT_lb');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '0.0625', 'WT_oz', 'WT_lb'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '0.0625' AND uom_id = 'WT_oz' AND uom_id_to = 'WT_lb');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '28', 'WT_oz', 'WT_g'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '28' AND uom_id = 'WT_oz' AND uom_id_to = 'WT_g');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '30', 'WT_oz_tr', 'WT_g'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '30' AND uom_id = 'WT_oz_tr' AND uom_id_to = 'WT_g');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '1.555', 'WT_dwt', 'WT_g'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '1.555' AND uom_id = 'WT_dwt' AND uom_id_to = 'WT_g');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '16', 'WT_lb', 'WT_oz'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '16' AND uom_id = 'WT_lb' AND uom_id_to = 'WT_oz');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '14', 'WT_st', 'WT_lb'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '14' AND uom_id = 'WT_st' AND uom_id_to = 'WT_lb');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '1.02', 'WT_lt', 'WT_mt'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '1.02' AND uom_id = 'WT_lt' AND uom_id_to = 'WT_mt');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '2240', 'WT_lt', 'WT_lb'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '2240' AND uom_id = 'WT_lt' AND uom_id_to = 'WT_lb');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '1000', 'WT_mt', 'WT_kg'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '1000' AND uom_id = 'WT_mt' AND uom_id_to = 'WT_kg');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '2000', 'WT_sh_t', 'WT_lb'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '2000' AND uom_id = 'WT_sh_t' AND uom_id_to = 'WT_lb');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'Btu', 'British Thermal Unit', 'EN_Btu', 'ENERGY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'Btu' AND description = 'British Thermal Unit' AND uom_id = 'EN_Btu' AND uom_type_id = 'ENERGY_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'cal15', 'Calorie (@15.5c)', 'EN_cal15', 'ENERGY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'cal15' AND description = 'Calorie (@15.5c)' AND uom_id = 'EN_cal15' AND uom_type_id = 'ENERGY_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'HP', 'Horsepower (mechanical)', 'EN_HP', 'ENERGY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'HP' AND description = 'Horsepower (mechanical)' AND uom_id = 'EN_HP' AND uom_type_id = 'ENERGY_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'J', 'Joule (absolute)', 'EN_J', 'ENERGY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'J' AND description = 'Joule (absolute)' AND uom_id = 'EN_J' AND uom_type_id = 'ENERGY_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'Kw', 'Kilowatt', 'EN_Kw', 'ENERGY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'Kw' AND description = 'Kilowatt' AND uom_id = 'EN_Kw' AND uom_type_id = 'ENERGY_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'w', 'Watt', 'EN_w', 'ENERGY_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'w' AND description = 'Watt' AND uom_id = 'EN_w' AND uom_type_id = 'ENERGY_MEASURE');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '4.1855', 'EN_cal15', 'EN_J'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '4.1855' AND uom_id = 'EN_cal15' AND uom_id_to = 'EN_J');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '1000', 'EN_Kw', 'EN_w'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '1000' AND uom_id = 'EN_Kw' AND uom_id_to = 'EN_w');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '746', 'EN_HP', 'EN_w'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '746' AND uom_id = 'EN_HP' AND uom_id_to = 'EN_w');

INSERT INTO uom_conversion (conversion_factor, uom_id, uom_id_to)
SELECT '1.3410', 'EN_Kw', 'EN_HP'
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE conversion_factor = '1.3410' AND uom_id = 'EN_Kw' AND uom_id_to = 'EN_HP');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'K', 'Kelvin', 'TEMP_K', 'TEMP_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'K' AND description = 'Kelvin' AND uom_id = 'TEMP_K' AND uom_type_id = 'TEMP_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'C', 'Degrees Celsius', 'TEMP_C', 'TEMP_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'C' AND description = 'Degrees Celsius' AND uom_id = 'TEMP_C' AND uom_type_id = 'TEMP_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'F', 'Degrees Fahrenheit', 'TEMP_F', 'TEMP_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'F' AND description = 'Degrees Fahrenheit' AND uom_id = 'TEMP_F' AND uom_type_id = 'TEMP_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'A', 'Amphere - Electric current', 'OTH_A', 'OTHER_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'A' AND description = 'Amphere - Electric current' AND uom_id = 'OTH_A' AND uom_type_id = 'OTHER_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'cd', 'Candela - Luminosity (intensity of light)', 'OTH_cd', 'OTHER_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'cd' AND description = 'Candela - Luminosity (intensity of light)' AND uom_id = 'OTH_cd' AND uom_type_id = 'OTHER_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'mol', 'Mole - Substance (molecule)', 'OTH_mol', 'OTHER_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'mol' AND description = 'Mole - Substance (molecule)' AND uom_id = 'OTH_mol' AND uom_type_id = 'OTHER_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'ea', 'Each', 'OTH_ea', 'OTHER_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'ea' AND description = 'Each' AND uom_id = 'OTH_ea' AND uom_type_id = 'OTHER_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'pp', 'Per Person', 'OTH_pp', 'OTHER_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'pp' AND description = 'Per Person' AND uom_id = 'OTH_pp' AND uom_type_id = 'OTHER_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'bx', 'Box', 'OTH_box', 'OTHER_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'bx' AND description = 'Box' AND uom_id = 'OTH_box' AND uom_type_id = 'OTHER_MEASURE');

INSERT INTO uom (abbreviation, description, uom_id, uom_type_id)
SELECT 'pk', 'Package', 'OTH_pk', 'OTHER_MEASURE'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE abbreviation = 'pk' AND description = 'Package' AND uom_id = 'OTH_pk' AND uom_type_id = 'OTHER_MEASURE');
