INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'DATA_b', 'DATA_MEASURE', 'b', NULL, 'Bit of Data'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'DATA_b');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'DATA_Kb', 'DATA_MEASURE', 'Kb', NULL, 'Kilobit of Data'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'DATA_Kb');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'DATA_Mb', 'DATA_MEASURE', 'Mb', NULL, 'Megabit of Data'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'DATA_Mb');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'DATA_Gb', 'DATA_MEASURE', 'Gb', NULL, 'Gigabit of Data'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'DATA_Gb');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'DATA_Tb', 'DATA_MEASURE', 'Tb', NULL, 'Terabit of Data'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'DATA_Tb');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'DATA_Pb', 'DATA_MEASURE', 'Pb', NULL, 'Petabit of Data'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'DATA_Pb');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'DATA_B', 'DATA_MEASURE', 'B', NULL, 'Byte of Data'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'DATA_B');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'DATA_KB', 'DATA_MEASURE', 'KB', NULL, 'Kilobyte of Data'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'DATA_KB');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'DATA_MB', 'DATA_MEASURE', 'MB', NULL, 'Megabyte of Data'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'DATA_MB');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'DATA_GB', 'DATA_MEASURE', 'GB', NULL, 'Gigabyte of Data'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'DATA_GB');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'DATA_TB', 'DATA_MEASURE', 'TB', NULL, 'Terabyte of Data'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'DATA_TB');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'DATA_PB', 'DATA_MEASURE', 'PB', NULL, 'Petabyte of Data'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'DATA_PB');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'DATASPD_bps', 'DATASPD_MEASURE', 'bps', NULL, 'Bit-per-second of Data'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'DATASPD_bps');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'DATASPD_Kbps', 'DATASPD_MEASURE', 'Kbps', NULL, 'Kilobit-per-second of Data'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'DATASPD_Kbps');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'DATASPD_Mbps', 'DATASPD_MEASURE', 'Mbps', NULL, 'Megabit-per-second of Data'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'DATASPD_Mbps');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'DATASPD_Gbps', 'DATASPD_MEASURE', 'Gbps', NULL, 'Gigabit-per-second of Data'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'DATASPD_Gbps');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'DATASPD_Tbps', 'DATASPD_MEASURE', 'Tbps', NULL, 'Terabit-per-second of Data'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'DATASPD_Tbps');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'TF_ms', 'TIME_FREQ_MEASURE', 'ms', NULL, 'Time in Milli-Seconds'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'TF_ms');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'TF_s', 'TIME_FREQ_MEASURE', 's', NULL, 'Time in Seconds'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'TF_s');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'TF_min', 'TIME_FREQ_MEASURE', 'min', NULL, 'Time in Minutes'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'TF_min');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'TF_hr', 'TIME_FREQ_MEASURE', 'hr', NULL, 'Time in Hours'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'TF_hr');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'TF_day', 'TIME_FREQ_MEASURE', 'day', NULL, 'Time in Days'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'TF_day');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'TF_wk', 'TIME_FREQ_MEASURE', 'wk', NULL, 'Time in Weeks'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'TF_wk');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'TF_mon', 'TIME_FREQ_MEASURE', 'mon', NULL, 'Time in Months'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'TF_mon');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'TF_yr', 'TIME_FREQ_MEASURE', 'yr', NULL, 'Time in Years'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'TF_yr');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'TF_decade', 'TIME_FREQ_MEASURE', 'decade', NULL, 'Time in Decades'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'TF_decade');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'TF_score', 'TIME_FREQ_MEASURE', 'score', NULL, 'Time in Scores'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'TF_score');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'TF_century', 'TIME_FREQ_MEASURE', 'century', NULL, 'Time in Centuries'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'TF_century');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'TF_millenium', 'TIME_FREQ_MEASURE', 'millenium', NULL, 'Time in Millenia'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'TF_millenium');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'LEN_A', 'LENGTH_MEASURE', 'A', NULL, 'Angstrom'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'LEN_A');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'LEN_cb', 'LENGTH_MEASURE', 'cb', NULL, 'Cable'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'LEN_cb');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'LEN_cm', 'LENGTH_MEASURE', 'cm', NULL, 'Centimeter'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'LEN_cm');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'LEN_chG', 'LENGTH_MEASURE', 'chG', NULL, 'Chain (Gunter''s/surveyor''s)'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'LEN_chG');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'LEN_chR', 'LENGTH_MEASURE', 'chR', NULL, 'Chain (Ramden''s/engineer''s)'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'LEN_chR');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'LEN_dm', 'LENGTH_MEASURE', 'dm', NULL, 'Decimeter'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'LEN_dm');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'LEN_dam', 'LENGTH_MEASURE', 'dam', NULL, 'Dekameter'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'LEN_dam');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'LEN_fm', 'LENGTH_MEASURE', 'fm', NULL, 'Fathom'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'LEN_fm');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'LEN_ft', 'LENGTH_MEASURE', 'ft', NULL, 'Foot'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'LEN_ft');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'LEN_fur', 'LENGTH_MEASURE', 'fur', NULL, 'Furlong'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'LEN_fur');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'LEN_hand', 'LENGTH_MEASURE', 'hand', NULL, 'Hand (horse''s height)'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'LEN_hand');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'LEN_in', 'LENGTH_MEASURE', 'in', NULL, 'Inch'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'LEN_in');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'LEN_km', 'LENGTH_MEASURE', 'km', NULL, 'Kilometer'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'LEN_km');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'LEN_league', 'LENGTH_MEASURE', 'league', NULL, 'League'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'LEN_league');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'LEN_lnG', 'LENGTH_MEASURE', 'lnG', NULL, 'Link (Gunter''s)'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'LEN_lnG');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'LEN_lnR', 'LENGTH_MEASURE', 'lnR', NULL, 'Link (Ramden''s)'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'LEN_lnR');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'LEN_m', 'LENGTH_MEASURE', 'm', NULL, 'Meter'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'LEN_m');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'LEN_u', 'LENGTH_MEASURE', 'u', NULL, 'Micrometer (Micron)'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'LEN_u');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'LEN_mi', 'LENGTH_MEASURE', 'mi', NULL, 'Mile (statute/land)'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'LEN_mi');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'LEN_nmi', 'LENGTH_MEASURE', 'nmi', NULL, 'Mile (nautical/sea)'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'LEN_nmi');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'LEN_mm', 'LENGTH_MEASURE', 'mm', NULL, 'Millimeter'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'LEN_mm');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'LEN_mil', 'LENGTH_MEASURE', 'mil', NULL, 'Mil (Milli-inch)'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'LEN_mil');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'LEN_point', 'LENGTH_MEASURE', 'point', NULL, 'Point (type size)'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'LEN_point');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'LEN_pica', 'LENGTH_MEASURE', 'pica', NULL, 'Pica (type size)'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'LEN_pica');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'LEN_rd', 'LENGTH_MEASURE', 'rd', NULL, 'Rod'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'LEN_rd');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'LEN_yd', 'LENGTH_MEASURE', 'yd', NULL, 'Yard'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'LEN_yd');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'AREA_A', 'AREA_MEASURE', 'A', NULL, 'Acre'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'AREA_A');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'AREA_a', 'AREA_MEASURE', 'a', NULL, 'Are'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'AREA_a');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'AREA_ha', 'AREA_MEASURE', 'ha', NULL, 'Hectare'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'AREA_ha');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'AREA_cm2', 'AREA_MEASURE', 'cm2', NULL, 'Square Centimeter'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'AREA_cm2');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'AREA_ft2', 'AREA_MEASURE', 'ft2', NULL, 'Square Foot'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'AREA_ft2');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'AREA_in2', 'AREA_MEASURE', 'in2', NULL, 'Square Inch'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'AREA_in2');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'AREA_km2', 'AREA_MEASURE', 'km2', NULL, 'Square Kilometer'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'AREA_km2');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'AREA_m2', 'AREA_MEASURE', 'm2', NULL, 'Square Meter'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'AREA_m2');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'AREA_mi2', 'AREA_MEASURE', 'mi2', NULL, 'Square Mile'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'AREA_mi2');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'AREA_mm2', 'AREA_MEASURE', 'mm2', NULL, 'Square Millimeter'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'AREA_mm2');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'AREA_rd2', 'AREA_MEASURE', 'rd2', NULL, 'Square Rod'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'AREA_rd2');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'AREA_yd2', 'AREA_MEASURE', 'yd2', NULL, 'Square Yard'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'AREA_yd2');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'VLIQ_bbl', 'VOLUME_LIQ_MEASURE', 'bbl', NULL, 'Barrel (US)'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'VLIQ_bbl');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'VLIQ_cup', 'VOLUME_LIQ_MEASURE', 'cup', NULL, 'Cup'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'VLIQ_cup');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'VLIQ_dr', 'VOLUME_LIQ_MEASURE', 'dr', NULL, 'Dram (US)'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'VLIQ_dr');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'VLIQ_gi', 'VOLUME_LIQ_MEASURE', 'gi', NULL, 'Gill (1/4 UK pint)'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'VLIQ_gi');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'VLIQ_galUK', 'VOLUME_LIQ_MEASURE', 'gal', NULL, 'Gallon (UK)'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'VLIQ_galUK');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'VLIQ_galUS', 'VOLUME_LIQ_MEASURE', 'gal', NULL, 'Gallon (US)'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'VLIQ_galUS');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'VLIQ_M3', 'VOLUME_LIQ_MEASURE', 'm3', NULL, 'Cubic meter (liquid)'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'VLIQ_M3');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'VLIQ_HL', 'VOLUME_LIQ_MEASURE', 'hL', NULL, 'Hectoliter'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'VLIQ_HL');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'VLIQ_L', 'VOLUME_LIQ_MEASURE', 'L', NULL, 'Liter'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'VLIQ_L');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'VLIQ_ml', 'VOLUME_LIQ_MEASURE', 'ml', NULL, 'Milliliter'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'VLIQ_ml');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'VLIQ_ozUK', 'VOLUME_LIQ_MEASURE', 'fl. oz (UK)', NULL, 'Ounce, fluid (UK)'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'VLIQ_ozUK');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'VLIQ_ozUS', 'VOLUME_LIQ_MEASURE', 'fl. oz (US)', NULL, 'Ounce, fluid (US)'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'VLIQ_ozUS');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'VLIQ_ptUK', 'VOLUME_LIQ_MEASURE', 'pt (UK)', NULL, 'Pint (UK)'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'VLIQ_ptUK');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'VLIQ_ptUS', 'VOLUME_LIQ_MEASURE', 'pt (US)', NULL, 'Pint (US)'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'VLIQ_ptUS');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'VLIQ_qt', 'VOLUME_LIQ_MEASURE', 'qt', NULL, 'Quart'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'VLIQ_qt');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'VLIQ_Tbs', 'VOLUME_LIQ_MEASURE', 'Tbs', NULL, 'Tablespoon'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'VLIQ_Tbs');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'VLIQ_tsp', 'VOLUME_LIQ_MEASURE', 'tsp', NULL, 'Teaspoon'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'VLIQ_tsp');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'VDRY_cm3', 'VOLUME_DRY_MEASURE', 'cm3', NULL, 'Cubic centimeter'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'VDRY_cm3');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'VDRY_ft3', 'VOLUME_DRY_MEASURE', 'ft3', NULL, 'Cubic foot'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'VDRY_ft3');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'VDRY_in3', 'VOLUME_DRY_MEASURE', 'in3', NULL, 'Cubic inch'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'VDRY_in3');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'VDRY_m3', 'VOLUME_DRY_MEASURE', 'm3', NULL, 'Cubic meter'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'VDRY_m3');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'VDRY_mm3', 'VOLUME_DRY_MEASURE', 'mm3', NULL, 'Cubic millimeter'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'VDRY_mm3');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'VDRY_ST', 'VOLUME_DRY_MEASURE', 'ST', NULL, 'Stere (cubic meter)'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'VDRY_ST');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'VDRY_yd3', 'VOLUME_DRY_MEASURE', 'yd3', NULL, 'Cubic yard'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'VDRY_yd3');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'WT_dr_avdp', 'WEIGHT_MEASURE', 'dr avdp', NULL, 'Dram (avdp)'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'WT_dr_avdp');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'WT_gr', 'WEIGHT_MEASURE', 'gr', NULL, 'Grain'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'WT_gr');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'WT_g', 'WEIGHT_MEASURE', 'g', NULL, 'Gram'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'WT_g');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'WT_kg', 'WEIGHT_MEASURE', 'kg', NULL, 'Kilogram'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'WT_kg');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'WT_mg', 'WEIGHT_MEASURE', 'mg', NULL, 'Milligram'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'WT_mg');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'WT_oz', 'WEIGHT_MEASURE', 'oz', NULL, 'Ounce (avdp)'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'WT_oz');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'WT_oz_tr', 'WEIGHT_MEASURE', 'oz tr', NULL, 'Ounce (troy)'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'WT_oz_tr');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'WT_dwt', 'WEIGHT_MEASURE', 'dwt', NULL, 'Pennyweight'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'WT_dwt');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'WT_lb', 'WEIGHT_MEASURE', 'lb', NULL, 'Pound (avdp)'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'WT_lb');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'WT_st', 'WEIGHT_MEASURE', 'st', NULL, 'Stone'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'WT_st');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'WT_lt', 'WEIGHT_MEASURE', 'lt', NULL, 'Ton (long or British)'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'WT_lt');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'WT_mt', 'WEIGHT_MEASURE', 'mt', NULL, 'Ton (metric)'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'WT_mt');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'WT_sh_t', 'WEIGHT_MEASURE', 'sh t', NULL, 'Ton (short or US)'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'WT_sh_t');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'EN_Btu', 'ENERGY_MEASURE', 'Btu', NULL, 'British Thermal Unit'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'EN_Btu');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'EN_cal15', 'ENERGY_MEASURE', 'cal15', NULL, 'Calorie (@15.5c)'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'EN_cal15');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'EN_HP', 'ENERGY_MEASURE', 'HP', NULL, 'Horsepower (mechanical)'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'EN_HP');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'EN_J', 'ENERGY_MEASURE', 'J', NULL, 'Joule (absolute)'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'EN_J');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'EN_Kw', 'ENERGY_MEASURE', 'Kw', NULL, 'Kilowatt'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'EN_Kw');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'EN_w', 'ENERGY_MEASURE', 'w', NULL, 'Watt'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'EN_w');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'TEMP_K', 'TEMP_MEASURE', 'K', NULL, 'Kelvin'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'TEMP_K');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'TEMP_C', 'TEMP_MEASURE', 'C', NULL, 'Degrees Celsius'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'TEMP_C');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'TEMP_F', 'TEMP_MEASURE', 'F', NULL, 'Degrees Fahrenheit'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'TEMP_F');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'OTH_A', 'OTHER_MEASURE', 'A', NULL, 'Amphere - Electric current'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'OTH_A');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'OTH_cd', 'OTHER_MEASURE', 'cd', NULL, 'Candela - Luminosity (intensity of light)'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'OTH_cd');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'OTH_mol', 'OTHER_MEASURE', 'mol', NULL, 'Mole - Substance (molecule)'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'OTH_mol');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'OTH_ea', 'OTHER_MEASURE', 'ea', NULL, 'Each'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'OTH_ea');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'OTH_pp', 'OTHER_MEASURE', 'pp', NULL, 'Per Person'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'OTH_pp');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'OTH_box', 'OTHER_MEASURE', 'bx', NULL, 'Box'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'OTH_box');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'OTH_pk', 'OTHER_MEASURE', 'pk', NULL, 'Package'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'OTH_pk');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'CRC', 'CURRENCY_MEASURE', 'CRC', '188', 'Costa Rica Colon'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'CRC');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'COP', 'CURRENCY_MEASURE', 'COP', '170', 'Colombian Peso'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'COP');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'CNY', 'CURRENCY_MEASURE', 'CNY', '156', 'China'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'CNY');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'CLP', 'CURRENCY_MEASURE', 'CLP', '152', 'Chilean Peso'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'CLP');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'CHF', 'CURRENCY_MEASURE', 'CHF', '756', 'Swiss Franc'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'CHF');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'CAD', 'CURRENCY_MEASURE', 'CAD', '124', 'Canadian Dollar'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'CAD');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'BZD', 'CURRENCY_MEASURE', 'BZD', '084', 'Belize Dollar'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'BZD');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'BYN', 'CURRENCY_MEASURE', 'BYN', '933', 'Belorussian Ruble'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'BYN');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'BWP', 'CURRENCY_MEASURE', 'BWP', '072', 'Botswana Pula'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'BWP');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'BSD', 'CURRENCY_MEASURE', 'BSD', '044', 'Bahaman Dollar'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'BSD');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'BRL', 'CURRENCY_MEASURE', 'BRL', '986', 'Brazilian Real'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'BRL');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'BOB', 'CURRENCY_MEASURE', 'BOB', '068', 'Bolivian Boliviano'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'BOB');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'BND', 'CURRENCY_MEASURE', 'BND', '096', 'Brunei Dollar'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'BND');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'BMD', 'CURRENCY_MEASURE', 'BMD', '060', 'Bermudan Dollar'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'BMD');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'BIF', 'CURRENCY_MEASURE', 'BIF', '108', 'Burundi Franc'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'BIF');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'BHD', 'CURRENCY_MEASURE', 'BHD', '048', 'Bahrain Dinar'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'BHD');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'BGN', 'CURRENCY_MEASURE', 'BGN', '975', 'Bulgarian Lev'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'BGN');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'BDT', 'CURRENCY_MEASURE', 'BDT', '050', 'Bangladesh Taka'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'BDT');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'BBD', 'CURRENCY_MEASURE', 'BBD', '052', 'Barbados Dollar'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'BBD');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'BAM', 'CURRENCY_MEASURE', 'BAM', '977', 'Convertible Marks'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'BAM');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'AZN', 'CURRENCY_MEASURE', 'AZN', '944', 'Azerbaijan Manat'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'AZN');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'AWG', 'CURRENCY_MEASURE', 'AWG', '533', 'Aruban Guilder'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'AWG');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'AUD', 'CURRENCY_MEASURE', 'AUD', '036', 'Australian Dollar'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'AUD');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'ARS', 'CURRENCY_MEASURE', 'ARS', '032', 'Argentina Peso'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'ARS');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'AOA', 'CURRENCY_MEASURE', 'AOA', '973', 'Angolan Kwanza'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'AOA');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'ANG', 'CURRENCY_MEASURE', 'ANG', '532', 'West Indian Guilder'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'ANG');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'AMD', 'CURRENCY_MEASURE', 'AMD', '051', 'Armenian Dram'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'AMD');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'ALL', 'CURRENCY_MEASURE', 'ALL', '008', 'Albanian Lek'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'ALL');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'AFN', 'CURRENCY_MEASURE', 'AFN', '971', 'Afghani'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'AFN');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'AED', 'CURRENCY_MEASURE', 'AED', '784', 'United Arab Emirates Dirham'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'AED');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'CUP', 'CURRENCY_MEASURE', 'CUP', '192', 'Cuban Peso'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'CUP');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'CVE', 'CURRENCY_MEASURE', 'CVE', '132', 'Cape Verde Escudo'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'CVE');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'CZK', 'CURRENCY_MEASURE', 'CZK', '203', 'Czech Koruna'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'CZK');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'DJF', 'CURRENCY_MEASURE', 'DJF', '262', 'Djibouti Franc'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'DJF');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'DKK', 'CURRENCY_MEASURE', 'DKK', '208', 'Danish Krone'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'DKK');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'DOP', 'CURRENCY_MEASURE', 'DOP', '214', 'Dominican Peso'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'DOP');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'DZD', 'CURRENCY_MEASURE', 'DZD', '012', 'Algerian Dinar'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'DZD');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'EGP', 'CURRENCY_MEASURE', 'EGP', '818', 'Egyptian Pound'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'EGP');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'ETB', 'CURRENCY_MEASURE', 'ETB', '230', 'Ethiopian Birr'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'ETB');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'EUR', 'CURRENCY_MEASURE', 'EUR', '978', 'Euro'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'EUR');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'FJD', 'CURRENCY_MEASURE', 'FJD', '242', 'Fiji Dollar'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'FJD');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'FKP', 'CURRENCY_MEASURE', 'FKP', '238', 'Falkland Pound'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'FKP');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'GBP', 'CURRENCY_MEASURE', 'GBP', '826', 'British Pound'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'GBP');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'GEL', 'CURRENCY_MEASURE', 'GEL', '981', 'Lari'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'GEL');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'GHS', 'CURRENCY_MEASURE', 'GHS', '936', 'Ghanian Cedi'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'GHS');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'GIP', 'CURRENCY_MEASURE', 'GIP', '292', 'Gibraltar Pound'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'GIP');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'GMD', 'CURRENCY_MEASURE', 'GMD', '270', 'Gambian Dalasi'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'GMD');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'GNF', 'CURRENCY_MEASURE', 'GNF', '324', 'Guinea Franc'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'GNF');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'GTQ', 'CURRENCY_MEASURE', 'GTQ', '320', 'Guatemalan Quedzal'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'GTQ');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'GYD', 'CURRENCY_MEASURE', 'GYD', '328', 'Guyanese Dollar'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'GYD');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'HKD', 'CURRENCY_MEASURE', 'HKD', '344', 'Hong Kong Dollar'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'HKD');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'HNL', 'CURRENCY_MEASURE', 'HNL', '340', 'Honduran Lempira'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'HNL');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'HRK', 'CURRENCY_MEASURE', 'HRK', '191', 'Croatian Kuna'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'HRK');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'HTG', 'CURRENCY_MEASURE', 'HTG', '332', 'Haitian Gourde'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'HTG');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'HUF', 'CURRENCY_MEASURE', 'HUF', '348', 'Hungarian forint'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'HUF');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'IDR', 'CURRENCY_MEASURE', 'IDR', '360', 'Indeonesian Rupiah'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'IDR');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'INR', 'CURRENCY_MEASURE', 'INR', '356', 'Indian Rupee'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'INR');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'IQD', 'CURRENCY_MEASURE', 'IQD', '368', 'Iraqui Dinar'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'IQD');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'IRR', 'CURRENCY_MEASURE', 'IRR', '364', 'Iranian Rial'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'IRR');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'ISK', 'CURRENCY_MEASURE', 'ISK', '352', 'Iceland Krona'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'ISK');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'JMD', 'CURRENCY_MEASURE', 'JMD', '388', 'Jamaican Dollar'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'JMD');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'JOD', 'CURRENCY_MEASURE', 'JOD', '400', 'Jordanian Dinar'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'JOD');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'JPY', 'CURRENCY_MEASURE', 'JPY', '392', 'Japanese Yen'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'JPY');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'KES', 'CURRENCY_MEASURE', 'KES', '404', 'Kenyan Shilling'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'KES');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'KHR', 'CURRENCY_MEASURE', 'KHR', '116', 'Cambodian Riel'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'KHR');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'KGS', 'CURRENCY_MEASURE', 'KGS', '417', 'Kyrgyzstan Som'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'KGS');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'KMF', 'CURRENCY_MEASURE', 'KMF', '174', 'Comoros Franc'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'KMF');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'KPW', 'CURRENCY_MEASURE', 'KPW', '408', 'North Korean Won'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'KPW');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'KRW', 'CURRENCY_MEASURE', 'KRW', '410', 'South Korean Won'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'KRW');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'KWD', 'CURRENCY_MEASURE', 'KWD', '414', 'Kuwaiti Dinar'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'KWD');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'KYD', 'CURRENCY_MEASURE', 'KYD', '136', 'Cayman Dollar'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'KYD');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'KZT', 'CURRENCY_MEASURE', 'KZT', '398', 'Kazakhstani Tenge'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'KZT');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'LAK', 'CURRENCY_MEASURE', 'LAK', '418', 'Laotian Kip'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'LAK');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'LBP', 'CURRENCY_MEASURE', 'LBP', '422', 'Lebanese Pound'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'LBP');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'LKR', 'CURRENCY_MEASURE', 'LKR', '144', 'Sri Lankan Rupee'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'LKR');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'LRD', 'CURRENCY_MEASURE', 'LRD', '430', 'Liberian Dollar'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'LRD');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'LSL', 'CURRENCY_MEASURE', 'LSL', '426', 'Lesotho Loti'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'LSL');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'LYD', 'CURRENCY_MEASURE', 'LYD', '434', 'Libyan Dinar'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'LYD');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'MAD', 'CURRENCY_MEASURE', 'MAD', '504', 'Moroccan Dirham'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'MAD');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'MDL', 'CURRENCY_MEASURE', 'MDL', '498', 'Moldavian Lei'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'MDL');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'MGA', 'CURRENCY_MEASURE', 'MGA', '969', 'Malagascy Ariary'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'MGA');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'MNT', 'CURRENCY_MEASURE', 'MNT', '496', 'Mongolian Tugrik'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'MNT');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'MOP', 'CURRENCY_MEASURE', 'MOP', '446', 'Macao Pataca'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'MOP');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'MRU', 'CURRENCY_MEASURE', 'MRU', '929', 'Mauritanian Ouguiya'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'MRU');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'MUR', 'CURRENCY_MEASURE', 'MUR', '480', 'Mauritius Rupee'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'MUR');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'MVR', 'CURRENCY_MEASURE', 'MVR', '462', 'Maldive Rufiyaa'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'MVR');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'MWK', 'CURRENCY_MEASURE', 'MWK', '454', 'Malawi Kwacha'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'MWK');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'MXN', 'CURRENCY_MEASURE', 'MXN', '484', 'Mexican Peso'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'MXN');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'MYR', 'CURRENCY_MEASURE', 'MYR', '458', 'Malaysian Ringgit'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'MYR');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'MZN', 'CURRENCY_MEASURE', 'MZN', '943', 'Mozambique Metical'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'MZN');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'NGN', 'CURRENCY_MEASURE', 'NGN', '566', 'Nigerian Naira'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'NGN');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'NIO', 'CURRENCY_MEASURE', 'NIO', '558', 'Nicaraguan Cordoba Oro'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'NIO');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'ILS', 'CURRENCY_MEASURE', 'ILS', '376', 'New Israeli Shekel'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'ILS');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'NOK', 'CURRENCY_MEASURE', 'NOK', '578', 'Norwegian Krone'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'NOK');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'NPR', 'CURRENCY_MEASURE', 'NPR', '524', 'Nepalese Rupee'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'NPR');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'NZD', 'CURRENCY_MEASURE', 'NZD', '554', 'New Zealand Dollar'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'NZD');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'OMR', 'CURRENCY_MEASURE', 'OMR', '512', 'Omani Rial'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'OMR');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'PAB', 'CURRENCY_MEASURE', 'PAB', '590', 'Panamanian Balboa'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'PAB');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'PEN', 'CURRENCY_MEASURE', 'PEN', '604', 'Peruvian Sol'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'PEN');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'PGK', 'CURRENCY_MEASURE', 'PGK', '598', 'Papua New Guinea Kina'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'PGK');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'PHP', 'CURRENCY_MEASURE', 'PHP', '608', 'Philippino Peso'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'PHP');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'PKR', 'CURRENCY_MEASURE', 'PKR', '586', 'Pakistan Rupee'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'PKR');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'PLN', 'CURRENCY_MEASURE', 'PLN', '985', 'Poland Zloty'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'PLN');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'PYG', 'CURRENCY_MEASURE', 'PYG', '600', 'Paraguayan Guarani'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'PYG');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'QAR', 'CURRENCY_MEASURE', 'QAR', '634', 'Qatar Riyal'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'QAR');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'RON', 'CURRENCY_MEASURE', 'RON', '946', 'Romanian Leu'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'RON');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'RUB', 'CURRENCY_MEASURE', 'RUB', '643', 'Russian Rouble'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'RUB');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'RWF', 'CURRENCY_MEASURE', 'RWF', '646', 'Rwanda Franc'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'RWF');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'SAR', 'CURRENCY_MEASURE', 'SAR', '682', 'Saudi Riyal'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'SAR');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'SBD', 'CURRENCY_MEASURE', 'SBD', '090', 'Solomon Islands Dollar'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'SBD');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'SCR', 'CURRENCY_MEASURE', 'SCR', '690', 'Seychelles Rupee'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'SCR');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'SDG', 'CURRENCY_MEASURE', 'SDG', '938', 'Sudanese Pound'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'SDG');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'SSP', 'CURRENCY_MEASURE', 'SSP', '728', 'South Sudanese Pound'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'SSP');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'SEK', 'CURRENCY_MEASURE', 'SEK', '752', 'Swedish Krona'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'SEK');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'SGD', 'CURRENCY_MEASURE', 'SGD', '702', 'Singapore Dollar'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'SGD');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'SHP', 'CURRENCY_MEASURE', 'SHP', '654', 'St.Helena Pound'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'SHP');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'SLL', 'CURRENCY_MEASURE', 'SLL', '694', 'Leone'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'SLL');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'SOS', 'CURRENCY_MEASURE', 'SOS', '706', 'Somalian Shilling'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'SOS');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'SRD', 'CURRENCY_MEASURE', 'SRD', '968', 'Surinam Dollar'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'SRD');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'STN', 'CURRENCY_MEASURE', 'STN', '930', 'Sao Tome and Principe Dobra'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'STN');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'SVC', 'CURRENCY_MEASURE', 'SVC', '222', 'El Salvador Colon'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'SVC');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'SYP', 'CURRENCY_MEASURE', 'SYP', '760', 'Syrian Pound'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'SYP');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'SZL', 'CURRENCY_MEASURE', 'SZL', '748', 'Swaziland Lilangeni'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'SZL');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'THB', 'CURRENCY_MEASURE', 'THB', '764', 'Thailand Baht'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'THB');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'TJS', 'CURRENCY_MEASURE', 'TJS', '972', 'Tadzhikistani Somoni'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'TJS');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'TMT', 'CURRENCY_MEASURE', 'TMT', '934', 'Turkmenistani Manat'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'TMT');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'TND', 'CURRENCY_MEASURE', 'TND', '788', 'Tunisian Dinar'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'TND');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'TOP', 'CURRENCY_MEASURE', 'TOP', '776', 'Tongan Pa''anga'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'TOP');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'TRY', 'CURRENCY_MEASURE', 'TRY', '949', 'Turkish Lira'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'TRY');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'TTD', 'CURRENCY_MEASURE', 'TTD', '780', 'Trinidad and Tobago Dollar'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'TTD');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'TWD', 'CURRENCY_MEASURE', 'TWD', '901', 'New Taiwan Dollar'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'TWD');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'TZS', 'CURRENCY_MEASURE', 'TZS', '834', 'Tanzanian Shilling'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'TZS');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'UAH', 'CURRENCY_MEASURE', 'UAH', '980', 'Ukrainian Hryvnia'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'UAH');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'UGX', 'CURRENCY_MEASURE', 'UGX', '800', 'Ugandan Shilling'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'UGX');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'USD', 'CURRENCY_MEASURE', 'USD', '840', 'United States Dollar'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'USD');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'UYU', 'CURRENCY_MEASURE', 'UYU', '858', 'Uruguay Peso'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'UYU');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'UYI', 'CURRENCY_MEASURE', 'UYI', '940', 'Uruguay Peso en Unidades Indexadas (UI)'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'UYI');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'VES', 'CURRENCY_MEASURE', 'VES', '928', 'Venezuelan Bolívar Soberano'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'VES');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'VND', 'CURRENCY_MEASURE', 'VND', '704', 'Vietnamese Dong'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'VND');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'VUV', 'CURRENCY_MEASURE', 'VUV', '548', 'Vanuatu Vatu'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'VUV');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'WST', 'CURRENCY_MEASURE', 'WST', '882', 'Samoan Tala'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'WST');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'XAF', 'CURRENCY_MEASURE', 'XAF', '950', 'Gabon C.f.A Franc'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'XAF');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'XCD', 'CURRENCY_MEASURE', 'XCD', '951', 'East Carribean Dollar'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'XCD');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'XOF', 'CURRENCY_MEASURE', 'XOF', '952', 'Benin C.f.A. Franc'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'XOF');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'YER', 'CURRENCY_MEASURE', 'YER', '886', 'Yemeni Ryal'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'YER');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'ZAR', 'CURRENCY_MEASURE', 'ZAR', '710', 'South African Rand'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'ZAR');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'ZMW', 'CURRENCY_MEASURE', 'ZMW', '967', 'Zambian Kwacha'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'ZMW');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'ZRN', 'CURRENCY_MEASURE', 'ZRN', '180', 'New Zaire'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'ZRN');

INSERT INTO uom (uom_id, uom_type_id, abbreviation, numeric_code, description)
SELECT 'ZWL', 'CURRENCY_MEASURE', 'ZWL', '932', 'Zimbabwe Dollar'
WHERE NOT EXISTS (SELECT 1 FROM uom WHERE uom_id = 'ZWL');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'DATA_Kb', 'DATA_b', '1024', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'DATA_Kb' AND uom_id_to = 'DATA_b');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'DATA_Mb', 'DATA_Kb', '1024', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'DATA_Mb' AND uom_id_to = 'DATA_Kb');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'DATA_Gb', 'DATA_Mb', '1024', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'DATA_Gb' AND uom_id_to = 'DATA_Mb');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'DATA_Tb', 'DATA_Gb', '1024', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'DATA_Tb' AND uom_id_to = 'DATA_Gb');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'DATA_Pb', 'DATA_Tb', '1024', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'DATA_Pb' AND uom_id_to = 'DATA_Tb');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'DATA_B', 'DATA_b', '8', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'DATA_B' AND uom_id_to = 'DATA_b');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'DATA_KB', 'DATA_B', '1024', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'DATA_KB' AND uom_id_to = 'DATA_B');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'DATA_MB', 'DATA_KB', '1024', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'DATA_MB' AND uom_id_to = 'DATA_KB');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'DATA_GB', 'DATA_MB', '1024', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'DATA_GB' AND uom_id_to = 'DATA_MB');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'DATA_TB', 'DATA_GB', '1024', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'DATA_TB' AND uom_id_to = 'DATA_GB');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'DATA_PB', 'DATA_TB', '1024', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'DATA_PB' AND uom_id_to = 'DATA_TB');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'DATASPD_Kbps', 'DATASPD_bps', '1024', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'DATASPD_Kbps' AND uom_id_to = 'DATASPD_bps');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'DATASPD_Mbps', 'DATASPD_Kbps', '1024', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'DATASPD_Mbps' AND uom_id_to = 'DATASPD_Kbps');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'DATASPD_Gbps', 'DATASPD_Mbps', '1024', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'DATASPD_Gbps' AND uom_id_to = 'DATASPD_Mbps');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'DATASPD_Tbps', 'DATASPD_Gbps', '1024', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'DATASPD_Tbps' AND uom_id_to = 'DATASPD_Gbps');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'TF_s', 'TF_ms', '1000', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'TF_s' AND uom_id_to = 'TF_ms');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'TF_min', 'TF_s', '60', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'TF_min' AND uom_id_to = 'TF_s');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'TF_hr', 'TF_min', '60', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'TF_hr' AND uom_id_to = 'TF_min');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'TF_day', 'TF_hr', '24', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'TF_day' AND uom_id_to = 'TF_hr');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'TF_wk', 'TF_day', '7', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'TF_wk' AND uom_id_to = 'TF_day');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'TF_yr', 'TF_day', '365', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'TF_yr' AND uom_id_to = 'TF_day');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'TF_decade', 'TF_yr', '10', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'TF_decade' AND uom_id_to = 'TF_yr');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'TF_score', 'TF_yr', '20', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'TF_score' AND uom_id_to = 'TF_yr');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'TF_century', 'TF_yr', '100', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'TF_century' AND uom_id_to = 'TF_yr');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'TF_millenium', 'TF_yr', '1000', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'TF_millenium' AND uom_id_to = 'TF_yr');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'LEN_A', 'LEN_m', '0.0000000001', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'LEN_A' AND uom_id_to = 'LEN_m');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'LEN_A', 'LEN_in', '0.000000004', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'LEN_A' AND uom_id_to = 'LEN_in');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'LEN_cb', 'LEN_fm', '120', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'LEN_cb' AND uom_id_to = 'LEN_fm');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'LEN_cb', 'LEN_ft', '720', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'LEN_cb' AND uom_id_to = 'LEN_ft');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'LEN_cm', 'LEN_m', '0.01', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'LEN_cm' AND uom_id_to = 'LEN_m');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'LEN_chG', 'LEN_ft', '66', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'LEN_chG' AND uom_id_to = 'LEN_ft');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'LEN_chG', 'LEN_rd', '4', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'LEN_chG' AND uom_id_to = 'LEN_rd');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'LEN_chR', 'LEN_ft', '100', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'LEN_chR' AND uom_id_to = 'LEN_ft');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'LEN_dm', 'LEN_m', '0.1', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'LEN_dm' AND uom_id_to = 'LEN_m');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'LEN_dam', 'LEN_m', '10', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'LEN_dam' AND uom_id_to = 'LEN_m');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'LEN_fm', 'LEN_ft', '6', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'LEN_fm' AND uom_id_to = 'LEN_ft');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'LEN_ft', 'LEN_in', '12', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'LEN_ft' AND uom_id_to = 'LEN_in');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'LEN_ft', 'LEN_m', '0.3048', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'LEN_ft' AND uom_id_to = 'LEN_m');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'LEN_fur', 'LEN_mi', '0.125', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'LEN_fur' AND uom_id_to = 'LEN_mi');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'LEN_mi', 'LEN_fur', '8', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'LEN_mi' AND uom_id_to = 'LEN_fur');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'LEN_hand', 'LEN_in', '4', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'LEN_hand' AND uom_id_to = 'LEN_in');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'LEN_in', 'LEN_cm', '2.54', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'LEN_in' AND uom_id_to = 'LEN_cm');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'LEN_in', 'LEN_mm', '25.4', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'LEN_in' AND uom_id_to = 'LEN_mm');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'LEN_in', 'LEN_u', '25400', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'LEN_in' AND uom_id_to = 'LEN_u');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'LEN_km', 'LEN_m', '1000', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'LEN_km' AND uom_id_to = 'LEN_m');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'LEN_league', 'LEN_mi', '3', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'LEN_league' AND uom_id_to = 'LEN_mi');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'LEN_lnG', 'LEN_in', '7.92', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'LEN_lnG' AND uom_id_to = 'LEN_in');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'LEN_lnR', 'LEN_in', '12', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'LEN_lnR' AND uom_id_to = 'LEN_in');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'LEN_m', 'LEN_in', '39.37', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'LEN_m' AND uom_id_to = 'LEN_in');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'LEN_u', 'LEN_mm', '0.001', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'LEN_u' AND uom_id_to = 'LEN_mm');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'LEN_mm', 'LEN_u', '1000', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'LEN_mm' AND uom_id_to = 'LEN_u');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'LEN_mi', 'LEN_km', '1.609', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'LEN_mi' AND uom_id_to = 'LEN_km');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'LEN_mi', 'LEN_ft', '5280', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'LEN_mi' AND uom_id_to = 'LEN_ft');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'LEN_nmi', 'LEN_km', '1.85', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'LEN_nmi' AND uom_id_to = 'LEN_km');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'LEN_nmi', 'LEN_ft', '6076.11549', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'LEN_nmi' AND uom_id_to = 'LEN_ft');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'LEN_mm', 'LEN_m', '0.001', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'LEN_mm' AND uom_id_to = 'LEN_m');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'LEN_mil', 'LEN_in', '0.001', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'LEN_mil' AND uom_id_to = 'LEN_in');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'LEN_point', 'LEN_mm', '0.351', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'LEN_point' AND uom_id_to = 'LEN_mm');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'LEN_point', 'LEN_in', '0.0138', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'LEN_point' AND uom_id_to = 'LEN_in');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'LEN_pica', 'LEN_point', '12', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'LEN_pica' AND uom_id_to = 'LEN_point');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'LEN_rd', 'LEN_ft', '16.5', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'LEN_rd' AND uom_id_to = 'LEN_ft');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'LEN_yd', 'LEN_ft', '3', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'LEN_yd' AND uom_id_to = 'LEN_ft');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'AREA_A', 'AREA_ft2', '43560', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'AREA_A' AND uom_id_to = 'AREA_ft2');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'AREA_a', 'AREA_m2', '100', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'AREA_a' AND uom_id_to = 'AREA_m2');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'AREA_ha', 'AREA_m2', '10000', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'AREA_ha' AND uom_id_to = 'AREA_m2');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'AREA_ha', 'AREA_A', '2.471', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'AREA_ha' AND uom_id_to = 'AREA_A');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'AREA_cm2', 'AREA_mm2', '100', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'AREA_cm2' AND uom_id_to = 'AREA_mm2');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'AREA_cm2', 'AREA_in2', '.155', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'AREA_cm2' AND uom_id_to = 'AREA_in2');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'AREA_ft2', 'AREA_in2', '144', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'AREA_ft2' AND uom_id_to = 'AREA_in2');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'AREA_km2', 'AREA_m2', '1000000', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'AREA_km2' AND uom_id_to = 'AREA_m2');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'AREA_m2', 'AREA_cm2', '10000', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'AREA_m2' AND uom_id_to = 'AREA_cm2');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'AREA_mi2', 'AREA_A', '639.8', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'AREA_mi2' AND uom_id_to = 'AREA_A');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'AREA_rd2', 'AREA_ft2', '272.25', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'AREA_rd2' AND uom_id_to = 'AREA_ft2');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'AREA_yd2', 'AREA_ft2', '9', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'AREA_yd2' AND uom_id_to = 'AREA_ft2');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'VLIQ_bbl', 'VLIQ_galUS', '31.5', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'VLIQ_bbl' AND uom_id_to = 'VLIQ_galUS');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'VLIQ_ozUS', 'VLIQ_dr', '8', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'VLIQ_ozUS' AND uom_id_to = 'VLIQ_dr');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'VLIQ_ptUK', 'VLIQ_gi', '4', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'VLIQ_ptUK' AND uom_id_to = 'VLIQ_gi');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'VLIQ_galUK', 'VLIQ_galUS', '1.2009', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'VLIQ_galUK' AND uom_id_to = 'VLIQ_galUS');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'VLIQ_galUS', 'VLIQ_qt', '4', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'VLIQ_galUS' AND uom_id_to = 'VLIQ_qt');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'VLIQ_galUS', 'VLIQ_L', '3.785', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'VLIQ_galUS' AND uom_id_to = 'VLIQ_L');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'VLIQ_M3', 'VLIQ_L', '1000', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'VLIQ_M3' AND uom_id_to = 'VLIQ_L');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'VLIQ_L', 'VLIQ_qt', '1.056', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'VLIQ_L' AND uom_id_to = 'VLIQ_qt');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'VLIQ_ml', 'VLIQ_L', '0.001', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'VLIQ_ml' AND uom_id_to = 'VLIQ_L');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'VLIQ_L', 'VLIQ_ml', '1000', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'VLIQ_L' AND uom_id_to = 'VLIQ_ml');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'VLIQ_HL', 'VLIQ_L', '100', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'VLIQ_HL' AND uom_id_to = 'VLIQ_L');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'VLIQ_ozUK', 'VLIQ_L', '0.029', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'VLIQ_ozUK' AND uom_id_to = 'VLIQ_L');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'VLIQ_ozUK', 'VLIQ_ozUS', '0.96', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'VLIQ_ozUK' AND uom_id_to = 'VLIQ_ozUS');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'VLIQ_ozUS', 'VLIQ_Tbs', '2', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'VLIQ_ozUS' AND uom_id_to = 'VLIQ_Tbs');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'VLIQ_Tbs', 'VLIQ_tsp', '3', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'VLIQ_Tbs' AND uom_id_to = 'VLIQ_tsp');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'VLIQ_cup', 'VLIQ_Tbs', '16', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'VLIQ_cup' AND uom_id_to = 'VLIQ_Tbs');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'VLIQ_ptUK', 'VLIQ_ptUS', '1.2', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'VLIQ_ptUK' AND uom_id_to = 'VLIQ_ptUS');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'VLIQ_ptUS', 'VLIQ_ozUS', '16', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'VLIQ_ptUS' AND uom_id_to = 'VLIQ_ozUS');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'VLIQ_qt', 'VLIQ_ptUS', '2', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'VLIQ_qt' AND uom_id_to = 'VLIQ_ptUS');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'VLIQ_L', 'VDRY_m3', '0.001', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'VLIQ_L' AND uom_id_to = 'VDRY_m3');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'VLIQ_galUK', 'VDRY_m3', '0.4546', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'VLIQ_galUK' AND uom_id_to = 'VDRY_m3');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'VDRY_cm3', 'VDRY_mm3', '1000', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'VDRY_cm3' AND uom_id_to = 'VDRY_mm3');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'VDRY_cm3', 'VDRY_in3', '0.061', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'VDRY_cm3' AND uom_id_to = 'VDRY_in3');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'VDRY_ft3', 'VDRY_in3', '1728', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'VDRY_ft3' AND uom_id_to = 'VDRY_in3');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'VDRY_ST', 'VDRY_m3', '1', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'VDRY_ST' AND uom_id_to = 'VDRY_m3');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'VDRY_m3', 'VDRY_yd3', '1.3', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'VDRY_m3' AND uom_id_to = 'VDRY_yd3');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'VDRY_yd3', 'VDRY_ft3', '27', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'VDRY_yd3' AND uom_id_to = 'VDRY_ft3');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'WT_dr_avdp', 'WT_oz', '0.0625', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'WT_dr_avdp' AND uom_id_to = 'WT_oz');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'WT_gr', 'WT_oz', '0.00229', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'WT_gr' AND uom_id_to = 'WT_oz');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'WT_gr', 'WT_g', '0.0648', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'WT_gr' AND uom_id_to = 'WT_g');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'WT_kg', 'WT_g', '1000', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'WT_kg' AND uom_id_to = 'WT_g');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'WT_kg', 'WT_lb', '2.2', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'WT_kg' AND uom_id_to = 'WT_lb');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'WT_g', 'WT_kg', '0.001', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'WT_g' AND uom_id_to = 'WT_kg');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'WT_g', 'WT_mg', '1000', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'WT_g' AND uom_id_to = 'WT_mg');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'WT_g', 'WT_oz', '0.03527', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'WT_g' AND uom_id_to = 'WT_oz');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'WT_g', 'WT_lb', '0.00220462247604', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'WT_g' AND uom_id_to = 'WT_lb');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'WT_oz', 'WT_lb', '0.0625', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'WT_oz' AND uom_id_to = 'WT_lb');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'WT_oz', 'WT_g', '28', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'WT_oz' AND uom_id_to = 'WT_g');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'WT_oz_tr', 'WT_g', '30', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'WT_oz_tr' AND uom_id_to = 'WT_g');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'WT_dwt', 'WT_g', '1.555', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'WT_dwt' AND uom_id_to = 'WT_g');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'WT_lb', 'WT_oz', '16', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'WT_lb' AND uom_id_to = 'WT_oz');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'WT_st', 'WT_lb', '14', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'WT_st' AND uom_id_to = 'WT_lb');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'WT_lt', 'WT_mt', '1.02', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'WT_lt' AND uom_id_to = 'WT_mt');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'WT_lt', 'WT_lb', '2240', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'WT_lt' AND uom_id_to = 'WT_lb');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'WT_mt', 'WT_kg', '1000', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'WT_mt' AND uom_id_to = 'WT_kg');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'WT_sh_t', 'WT_lb', '2000', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'WT_sh_t' AND uom_id_to = 'WT_lb');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'EN_cal15', 'EN_J', '4.1855', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'EN_cal15' AND uom_id_to = 'EN_J');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'EN_Kw', 'EN_w', '1000', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'EN_Kw' AND uom_id_to = 'EN_w');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'EN_HP', 'EN_w', '746', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'EN_HP' AND uom_id_to = 'EN_w');

INSERT INTO uom_conversion (uom_id, uom_id_to, conversion_factor, custom_method_id, decimal_scale, rounding_mode)
SELECT 'EN_Kw', 'EN_HP', '1.3410', NULL, NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM uom_conversion WHERE uom_id = 'EN_Kw' AND uom_id_to = 'EN_HP');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'AF', 'AFG', '004', 'AFGHANISTAN'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'AF');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'AX', 'ALA', '248', 'ÅLAND ISLANDS'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'AX');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'AL', 'ALB', '008', 'ALBANIA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'AL');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'AQ', 'ATA', '010', 'ANTARCTICA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'AQ');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'DZ', 'DZA', '012', 'ALGERIA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'DZ');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'AS', 'ASM', '016', 'AMERICAN SAMOA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'AS');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'AD', 'AND', '020', 'ANDORRA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'AD');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'AO', 'AGO', '024', 'ANGOLA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'AO');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'AG', 'ATG', '028', 'ANTIGUA AND BARBUDA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'AG');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'AZ', 'AZE', '031', 'AZERBAIJAN'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'AZ');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'AR', 'ARG', '032', 'ARGENTINA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'AR');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'AU', 'AUS', '036', 'AUSTRALIA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'AU');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'AT', 'AUT', '040', 'AUSTRIA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'AT');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'BS', 'BHS', '044', 'BAHAMAS'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'BS');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'BH', 'BHR', '048', 'BAHRAIN'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'BH');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'BD', 'BGD', '050', 'BANGLADESH'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'BD');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'AM', 'ARM', '051', 'ARMENIA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'AM');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'BB', 'BRB', '052', 'BARBADOS'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'BB');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'BE', 'BEL', '056', 'BELGIUM'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'BE');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'BM', 'BMU', '060', 'BERMUDA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'BM');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'BT', 'BTN', '064', 'BHUTAN'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'BT');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'BO', 'BOL', '068', 'BOLIVIA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'BO');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'BQ', 'BES', '535', 'BONAIRE, SINT EUSTATIUS AND SABA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'BQ');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'BA', 'BIH', '070', 'BOSNIA AND HERZEGOWINA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'BA');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'BW', 'BWA', '072', 'BOTSWANA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'BW');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'BV', 'BVT', '074', 'BOUVET ISLAND'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'BV');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'BR', 'BRA', '076', 'BRAZIL'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'BR');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'BZ', 'BLZ', '084', 'BELIZE'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'BZ');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'IO', 'IOT', '086', 'BRITISH INDIAN OCEAN TERRITORY'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'IO');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'SB', 'SLB', '090', 'SOLOMON ISLANDS'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'SB');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'VG', 'VGB', '092', 'VIRGIN ISLANDS (BRITISH)'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'VG');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'BN', 'BRN', '096', 'BRUNEI DARUSSALAM'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'BN');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'BG', 'BGR', '100', 'BULGARIA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'BG');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'MM', 'MMR', '104', 'MYANMAR'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'MM');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'BI', 'BDI', '108', 'BURUNDI'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'BI');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'BY', 'BLR', '112', 'BELARUS'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'BY');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'KH', 'KHM', '116', 'CAMBODIA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'KH');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'CM', 'CMR', '120', 'CAMEROON'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'CM');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'CA', 'CAN', '124', 'CANADA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'CA');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'CV', 'CPV', '132', 'CAPE VERDE'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'CV');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'KY', 'CYM', '136', 'CAYMAN ISLANDS'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'KY');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'CF', 'CAF', '140', 'CENTRAL AFRICAN REPUBLIC'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'CF');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'LK', 'LKA', '144', 'SRI LANKA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'LK');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'TD', 'TCD', '148', 'CHAD'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'TD');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'CL', 'CHL', '152', 'CHILE'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'CL');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'CN', 'CHN', '156', 'CHINA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'CN');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'TW', 'TWN', '158', 'TAIWAN, PROVINCE OF CHINA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'TW');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'CX', 'CXR', '162', 'CHRISTMAS ISLAND'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'CX');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'CC', 'CCK', '166', 'COCOS (KEELING) ISLANDS'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'CC');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'CO', 'COL', '170', 'COLOMBIA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'CO');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'KM', 'COM', '174', 'COMOROS'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'KM');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'YT', 'MYT', '175', 'MAYOTTE'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'YT');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'CG', 'COG', '178', 'CONGO'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'CG');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'CD', 'COD', '180', 'CONGO, THE DEMOCRATIC REPUBLIC OF THE'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'CD');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'CK', 'COK', '184', 'COOK ISLANDS'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'CK');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'CR', 'CRI', '188', 'COSTA RICA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'CR');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'HR', 'HRV', '191', 'CROATIA (local name: Hrvatska)'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'HR');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'CU', 'CUB', '192', 'CUBA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'CU');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'CW', 'CUW', '531', 'CURAÇAO'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'CW');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'CY', 'CYP', '196', 'CYPRUS'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'CY');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'CZ', 'CZE', '203', 'CZECHIA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'CZ');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'BJ', 'BEN', '204', 'BENIN'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'BJ');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'DK', 'DNK', '208', 'DENMARK'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'DK');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'DM', 'DMA', '212', 'DOMINICA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'DM');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'DO', 'DOM', '214', 'DOMINICAN REPUBLIC'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'DO');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'EC', 'ECU', '218', 'ECUADOR'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'EC');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'SV', 'SLV', '222', 'EL SALVADOR'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'SV');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'GQ', 'GNQ', '226', 'EQUATORIAL GUINEA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'GQ');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'ET', 'ETH', '231', 'ETHIOPIA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'ET');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'ER', 'ERI', '232', 'ERITREA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'ER');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'EE', 'EST', '233', 'ESTONIA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'EE');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'FO', 'FRO', '234', 'FAROE ISLANDS'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'FO');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'FK', 'FLK', '238', 'FALKLAND ISLANDS (MALVINAS)'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'FK');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'GS', 'SGS', '239', 'SOUTH GEORGIA AND THE SOUTH SANDWICH ISLANDS'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'GS');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'FJ', 'FJI', '242', 'FIJI'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'FJ');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'FI', 'FIN', '246', 'FINLAND'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'FI');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'FX', 'FXX', '249', 'FRANCE, METROPOLITAN'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'FX');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'FR', 'FRA', '250', 'FRANCE'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'FR');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'GF', 'GUF', '254', 'FRENCH GUIANA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'GF');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'PF', 'PYF', '258', 'FRENCH POLYNESIA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'PF');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'TF', 'ATF', '260', 'FRENCH SOUTHERN TERRITORIES'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'TF');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'DJ', 'DJI', '262', 'DJIBOUTI'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'DJ');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'GA', 'GAB', '266', 'GABON'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'GA');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'GE', 'GEO', '268', 'GEORGIA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'GE');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'GM', 'GMB', '270', 'GAMBIA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'GM');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'GG', 'GGY', '831', 'GUERNSEY'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'GG');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'PS', 'PSE', '275', 'PALESTINIAN TERRITORY, OCCUPIED'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'PS');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'DE', 'DEU', '276', 'GERMANY'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'DE');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'GH', 'GHA', '288', 'GHANA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'GH');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'GI', 'GIB', '292', 'GIBRALTAR'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'GI');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'KI', 'KIR', '296', 'KIRIBATI'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'KI');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'GR', 'GRC', '300', 'GREECE'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'GR');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'GL', 'GRL', '304', 'GREENLAND'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'GL');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'GD', 'GRD', '308', 'GRENADA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'GD');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'GP', 'GLP', '312', 'GUADELOUPE'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'GP');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'GU', 'GUM', '316', 'GUAM'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'GU');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'GT', 'GTM', '320', 'GUATEMALA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'GT');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'GN', 'GIN', '324', 'GUINEA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'GN');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'GY', 'GUY', '328', 'GUYANA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'GY');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'HT', 'HTI', '332', 'HAITI'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'HT');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'HM', 'HMD', '334', 'HEARD AND MC DONALD ISLANDS'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'HM');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'VA', 'VAT', '336', 'HOLY SEE (VATICAN CITY STATE)'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'VA');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'HN', 'HND', '340', 'HONDURAS'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'HN');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'HK', 'HKG', '344', 'HONG KONG'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'HK');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'HU', 'HUN', '348', 'HUNGARY'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'HU');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'IS', 'ISL', '352', 'ICELAND'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'IS');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'IN', 'IND', '356', 'INDIA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'IN');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'ID', 'IDN', '360', 'INDONESIA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'ID');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'IR', 'IRN', '364', 'IRAN (ISLAMIC REPUBLIC OF)'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'IR');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'IQ', 'IRQ', '368', 'IRAQ'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'IQ');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'IE', 'IRL', '372', 'IRELAND'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'IE');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'IM', 'IMN', '833', 'ISLE OF MAN'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'IM');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'IL', 'ISR', '376', 'ISRAEL'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'IL');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'IT', 'ITA', '380', 'ITALY'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'IT');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'CI', 'CIV', '384', 'COTE D''IVOIRE'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'CI');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'JM', 'JAM', '388', 'JAMAICA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'JM');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'JP', 'JPN', '392', 'JAPAN'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'JP');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'JE', 'JEY', '832', 'JERSEY'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'JE');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'KZ', 'KAZ', '398', 'KAZAKHSTAN'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'KZ');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'JO', 'JOR', '400', 'JORDAN'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'JO');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'KE', 'KEN', '404', 'KENYA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'KE');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'KP', 'PRK', '408', 'KOREA, DEMOCRATIC PEOPLE''S REPUBLIC OF'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'KP');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'KR', 'KOR', '410', 'KOREA, REPUBLIC OF'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'KR');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'KW', 'KWT', '414', 'KUWAIT'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'KW');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'KG', 'KGZ', '417', 'KYRGYZSTAN'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'KG');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'LA', 'LAO', '418', 'LAO PEOPLE''S DEMOCRATIC REPUBLIC'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'LA');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'LB', 'LBN', '422', 'LEBANON'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'LB');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'LS', 'LSO', '426', 'LESOTHO'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'LS');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'LV', 'LVA', '428', 'LATVIA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'LV');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'LR', 'LBR', '430', 'LIBERIA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'LR');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'LY', 'LBY', '434', 'LIBYAN ARAB JAMAHIRIYA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'LY');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'LI', 'LIE', '438', 'LIECHTENSTEIN'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'LI');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'LT', 'LTU', '440', 'LITHUANIA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'LT');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'LU', 'LUX', '442', 'LUXEMBOURG'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'LU');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'MO', 'MAC', '446', 'MACAU'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'MO');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'MG', 'MDG', '450', 'MADAGASCAR'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'MG');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'MW', 'MWI', '454', 'MALAWI'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'MW');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'MY', 'MYS', '458', 'MALAYSIA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'MY');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'MV', 'MDV', '462', 'MALDIVES'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'MV');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'ML', 'MLI', '466', 'MALI'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'ML');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'MT', 'MLT', '470', 'MALTA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'MT');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'MQ', 'MTQ', '474', 'MARTINIQUE'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'MQ');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'MR', 'MRT', '478', 'MAURITANIA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'MR');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'MU', 'MUS', '480', 'MAURITIUS'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'MU');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'MX', 'MEX', '484', 'MEXICO'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'MX');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'MC', 'MCO', '492', 'MONACO'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'MC');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'MN', 'MNG', '496', 'MONGOLIA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'MN');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'ME', 'MNE', '499', 'MONTENEGRO'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'ME');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'MD', 'MDA', '498', 'MOLDOVA, REPUBLIC OF'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'MD');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'MS', 'MSR', '500', 'MONTSERRAT'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'MS');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'MA', 'MAR', '504', 'MOROCCO'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'MA');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'MZ', 'MOZ', '508', 'MOZAMBIQUE'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'MZ');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'OM', 'OMN', '512', 'OMAN'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'OM');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'NA', 'NAM', '516', 'NAMIBIA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'NA');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'NR', 'NRU', '520', 'NAURU'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'NR');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'NP', 'NPL', '524', 'NEPAL'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'NP');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'NL', 'NLD', '528', 'NETHERLANDS'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'NL');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'AN', 'ANT', '530', 'NETHERLANDS ANTILLES'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'AN');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'AW', 'ABW', '533', 'ARUBA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'AW');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'NC', 'NCL', '540', 'NEW CALEDONIA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'NC');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'VU', 'VUT', '548', 'VANUATU'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'VU');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'NZ', 'NZL', '554', 'NEW ZEALAND'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'NZ');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'NI', 'NIC', '558', 'NICARAGUA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'NI');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'NE', 'NER', '562', 'NIGER'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'NE');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'NG', 'NGA', '566', 'NIGERIA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'NG');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'NU', 'NIU', '570', 'NIUE'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'NU');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'NF', 'NFK', '574', 'NORFOLK ISLAND'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'NF');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'NO', 'NOR', '578', 'NORWAY'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'NO');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'MP', 'MNP', '580', 'NORTHERN MARIANA ISLANDS'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'MP');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'UM', 'UMI', '581', 'UNITED STATES MINOR OUTLYING ISLANDS'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'UM');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'FM', 'FSM', '583', 'MICRONESIA, FEDERATED STATES OF'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'FM');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'MH', 'MHL', '584', 'MARSHALL ISLANDS'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'MH');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'PW', 'PLW', '585', 'PALAU'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'PW');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'PK', 'PAK', '586', 'PAKISTAN'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'PK');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'PA', 'PAN', '591', 'PANAMA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'PA');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'PG', 'PNG', '598', 'PAPUA NEW GUINEA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'PG');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'PY', 'PRY', '600', 'PARAGUAY'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'PY');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'PE', 'PER', '604', 'PERU'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'PE');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'PH', 'PHL', '608', 'PHILIPPINES'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'PH');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'PN', 'PCN', '612', 'PITCAIRN'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'PN');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'PL', 'POL', '616', 'POLAND'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'PL');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'PT', 'PRT', '620', 'PORTUGAL'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'PT');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'GW', 'GNB', '624', 'GUINEA-BISSAU'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'GW');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'TP', 'TMP', '626', 'EAST TIMOR'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'TP');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'PR', 'PRI', '630', 'PUERTO RICO'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'PR');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'QA', 'QAT', '634', 'QATAR'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'QA');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'RE', 'REU', '638', 'REUNION'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'RE');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'RO', 'ROM', '642', 'ROMANIA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'RO');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'RU', 'RUS', '643', 'RUSSIAN FEDERATION'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'RU');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'RW', 'RWA', '646', 'RWANDA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'RW');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'SH', 'SHN', '654', 'ST. HELENA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'SH');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'KN', 'KNA', '659', 'SAINT KITTS AND NEVIS'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'KN');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'AI', 'AIA', '660', 'ANGUILLA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'AI');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'LC', 'LCA', '662', 'SAINT LUCIA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'LC');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'BL', 'BLM', '652', 'SAINT BARTHÉLEMY'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'BL');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'MF', 'MAF', '663', 'SAINT MARTIN (FRENCH PART)'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'MF');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'PM', 'SPM', '666', 'ST. PIERRE AND MIQUELON'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'PM');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'VC', 'VCT', '670', 'SAINT VINCENT AND THE GRENADINES'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'VC');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'SM', 'SMR', '674', 'SAN MARINO'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'SM');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'ST', 'STP', '678', 'SAO TOME AND PRINCIPE'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'ST');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'SA', 'SAU', '682', 'SAUDI ARABIA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'SA');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'SN', 'SEN', '686', 'SENEGAL'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'SN');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'RS', 'SRB', '688', 'SERBIA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'RS');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'SC', 'SYC', '690', 'SEYCHELLES'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'SC');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'SL', 'SLE', '694', 'SIERRA LEONE'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'SL');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'SG', 'SGP', '702', 'SINGAPORE'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'SG');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'SX', 'SXM', '534', 'SINT MAARTEN (DUTCH PART)'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'SX');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'SK', 'SVK', '703', 'SLOVAKIA (Slovak Republic)'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'SK');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'VN', 'VNM', '704', 'VIET NAM'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'VN');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'SI', 'SVN', '705', 'SLOVENIA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'SI');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'SO', 'SOM', '706', 'SOMALIA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'SO');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'ZA', 'ZAF', '710', 'SOUTH AFRICA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'ZA');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'SS', 'SSD', '728', 'SOUTH SUDAN'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'SS');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'ZW', 'ZWE', '716', 'ZIMBABWE'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'ZW');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'ES', 'ESP', '724', 'SPAIN'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'ES');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'EH', 'ESH', '732', 'WESTERN SAHARA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'EH');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'SD', 'SDN', '736', 'SUDAN'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'SD');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'SR', 'SUR', '740', 'SURINAME'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'SR');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'SJ', 'SJM', '744', 'SVALBARD AND JAN MAYEN ISLANDS'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'SJ');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'SZ', 'SWZ', '748', 'SWAZILAND'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'SZ');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'SE', 'SWE', '752', 'SWEDEN'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'SE');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'CH', 'CHE', '756', 'SWITZERLAND'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'CH');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'SY', 'SYR', '760', 'SYRIAN ARAB REPUBLIC'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'SY');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'TJ', 'TJK', '762', 'TAJIKISTAN'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'TJ');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'TH', 'THA', '764', 'THAILAND'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'TH');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'TG', 'TGO', '768', 'TOGO'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'TG');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'TK', 'TKL', '772', 'TOKELAU'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'TK');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'TO', 'TON', '776', 'TONGA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'TO');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'TT', 'TTO', '780', 'TRINIDAD AND TOBAGO'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'TT');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'AE', 'ARE', '784', 'UNITED ARAB EMIRATES'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'AE');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'TN', 'TUN', '788', 'TUNISIA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'TN');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'TR', 'TUR', '792', 'TURKEY'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'TR');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'TM', 'TKM', '795', 'TURKMENISTAN'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'TM');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'TC', 'TCA', '796', 'TURKS AND CAICOS ISLANDS'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'TC');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'TV', 'TUV', '798', 'TUVALU'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'TV');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'UG', 'UGA', '800', 'UGANDA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'UG');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'UA', 'UKR', '804', 'UKRAINE'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'UA');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'MK', 'MKD', '807', 'MACEDONIA, THE FORMER YUGOSLAV REPUBLIC OF'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'MK');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'EG', 'EGY', '818', 'EGYPT'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'EG');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'GB', 'GBR', '826', 'UNITED KINGDOM'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'GB');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'TZ', 'TZA', '834', 'TANZANIA, UNITED REPUBLIC OF'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'TZ');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'US', 'USA', '840', 'UNITED STATES'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'US');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'VI', 'VIR', '850', 'VIRGIN ISLANDS (U.S.)'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'VI');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'BF', 'BFA', '854', 'BURKINA FASO'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'BF');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'UY', 'URY', '858', 'URUGUAY'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'UY');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'UZ', 'UZB', '860', 'UZBEKISTAN'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'UZ');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'VE', 'VEN', '862', 'VENEZUELA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'VE');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'WF', 'WLF', '876', 'WALLIS AND FUTUNA ISLANDS'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'WF');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'WS', 'WSM', '882', 'SAMOA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'WS');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'YE', 'YEM', '887', 'YEMEN'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'YE');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'ZM', 'ZMB', '894', 'ZAMBIA'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'ZM');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'SCT', 'SCOT', '895', 'SCOTLAND'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'SCT');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'ENG', 'ENGL', '896', 'ENGLAND'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'ENG');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'NIR', 'NIRL', '897', 'N.IRELAND'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'NIR');

INSERT INTO country_code (country_code, country_abbr, country_number, country_name)
SELECT 'WLS', 'WALS', '898', 'WALES'
WHERE NOT EXISTS (SELECT 1 FROM country_code WHERE country_code = 'WLS');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6301', 'aar', 'aar', 'aa', 'Afar', 'Hamitic', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6301');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6302', 'abk', 'abk', 'ab', 'Abkhazian', 'Ibero-caucasian', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6302');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6303', 'ace', 'ace', NULL, 'Achinese', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6303');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6304', 'ach', 'ach', NULL, 'Acoli', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6304');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6305', 'ada', 'ada', NULL, 'Adangme', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6305');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6306', 'afa', 'afa', NULL, 'Afro-Asiatic (Other)', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6306');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6307', 'afh', 'afh', NULL, 'Afrihili', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6307');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6308', 'afr', 'afr', 'af', 'Afrikaans', 'Germanic', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6308');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6309', 'aka', 'aka', NULL, 'Akan', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6309');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6310', 'akk', 'akk', NULL, 'Akkadian', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6310');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6311', 'ale', 'ale', NULL, 'Aleut', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6311');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6312', 'alg', 'alg', NULL, 'Algonquian languages', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6312');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6313', 'amh', 'amh', 'am', 'Amharic', 'Semitic', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6313');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6314', 'ang', 'ang', NULL, 'English, Old (ca. 450-1100)', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6314');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6315', 'apa', 'apa', NULL, 'Apache languages', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6315');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6316', 'ara', 'ara', 'ar', 'Arabic', 'Semitic', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6316');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6317', 'arc', 'arc', NULL, 'Aramaic', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6317');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6318', 'arn', 'arn', NULL, 'Araucanian', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6318');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6319', 'arp', 'arp', NULL, 'Arapaho', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6319');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6320', 'art', 'art', NULL, 'Artificial (Other)', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6320');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6321', 'arw', 'arw', NULL, 'Arawak', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6321');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6322', 'asm', 'asm', 'as', 'Assamese', 'Indian', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6322');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6323', 'ath', 'ath', NULL, 'Athapascan languages', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6323');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6324', 'aus', 'aus', NULL, 'Australian languages', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6324');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6325', 'ava', 'ava', NULL, 'Avaric', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6325');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6326', 'ave', 'ave', 'ae', 'Avestan', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6326');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6327', 'awa', 'awa', NULL, 'Awadhi', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6327');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6328', 'aym', 'aym', 'ay', 'Aymara', 'Amerindian', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6328');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6329', 'aze', 'aze', 'az', 'Azerbaijani', 'Turkic/altaic', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6329');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6330', 'bad', 'bad', NULL, 'Banda', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6330');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6331', 'bai', 'bai', NULL, 'Bamileke languages', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6331');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6332', 'bak', 'bak', 'ba', 'Bashkir', 'Turkic/altaic', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6332');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6333', 'bal', 'bal', NULL, 'Baluchi', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6333');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6334', 'bam', 'bam', NULL, 'Bambara', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6334');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6335', 'ban', 'ban', NULL, 'Balinese', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6335');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6336', 'bas', 'bas', NULL, 'Basa', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6336');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6337', 'bat', 'bat', NULL, 'Baltic (Other)', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6337');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6338', 'bej', 'bej', NULL, 'Beja', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6338');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6339', 'bel', 'bel', 'be', 'Belarusian', 'Slavic', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6339');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6340', 'bem', 'bem', NULL, 'Bemba', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6340');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6341', 'ben', 'ben', 'bn', 'Bengali', 'Indian', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6341');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6342', 'ber', 'ber', NULL, 'Berber (Other)', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6342');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6343', 'bho', 'bho', NULL, 'Bhojpuri', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6343');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6344', 'bih', 'bih', 'bh', 'Bihari', 'Indian', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6344');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6345', 'bik', 'bik', NULL, 'Bikol', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6345');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6346', 'bin', 'bin', NULL, 'Bini', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6346');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6347', 'bis', 'bis', 'bi', 'Bislama', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6347');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6348', 'bla', 'bla', NULL, 'Siksika', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6348');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6349', 'bnt', 'bnt', NULL, 'Bantu (Other)', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6349');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6350', 'bod', 'tib', 'bo', 'Tibetan', 'Asian', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6350');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6351', 'bos', 'bos', 'bs', 'Bosnian', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6351');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6352', 'bra', 'bra', NULL, 'Braj', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6352');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6353', 'bre', 'bre', 'br', 'Breton', 'Celtic', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6353');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6354', 'btk', 'btk', NULL, 'Batak (Indonesia)', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6354');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6355', 'bua', 'bua', NULL, 'Buriat', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6355');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6356', 'bug', 'bug', NULL, 'Buginese', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6356');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6357', 'bul', 'bul', 'bg', 'Bulgarian', 'Slavic', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6357');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6358', 'cad', 'cad', NULL, 'Caddo', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6358');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6359', 'cai', 'cai', NULL, 'Central American Indian (Other)', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6359');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6360', 'car', 'car', NULL, 'Carib', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6360');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6361', 'cat', 'cat', 'ca', 'Catalan', 'Romance', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6361');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6362', 'cau', 'cau', NULL, 'Caucasian (Other)', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6362');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6363', 'ceb', 'ceb', NULL, 'Cebuano', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6363');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6364', 'cel', 'cel', NULL, 'Celtic (Other)', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6364');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6365', 'ces', 'cze', 'cs', 'Czech', 'Slavic', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6365');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6366', 'cha', 'cha', 'ch', 'Chamorro', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6366');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6367', 'chb', 'chb', NULL, 'Chibcha', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6367');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6368', 'che', 'che', 'ce', 'Chechen', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6368');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6369', 'chg', 'chg', NULL, 'Chagatai', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6369');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6370', 'chk', 'chk', NULL, 'Chuukese', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6370');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6371', 'chm', 'chm', NULL, 'Mari', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6371');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6372', 'chn', 'chn', NULL, 'Chinook jargon', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6372');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6373', 'cho', 'cho', NULL, 'Choctaw', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6373');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6374', 'chp', 'chp', NULL, 'Chipewyan', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6374');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6375', 'chr', 'chr', NULL, 'Cherokee', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6375');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6376', 'chu', 'chu', 'cu', 'Church Slavic', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6376');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6377', 'chv', 'chv', 'cv', 'Chuvash', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6377');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6378', 'chy', 'chy', NULL, 'Cheyenne', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6378');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6379', 'cmc', 'cmc', NULL, 'Chamic languages', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6379');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6380', 'cop', 'cop', NULL, 'Coptic', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6380');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6381', 'cor', 'cor', 'kw', 'Cornish', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6381');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6382', 'cos', 'cos', 'co', 'Corsican', 'Romance', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6382');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6383', 'cpe', 'cpe', NULL, 'Creoles and pidgins, English based (Other)', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6383');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6384', 'cpf', 'cpf', NULL, 'Creoles and pidgins, French-based (Other)', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6384');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6385', 'cpp', 'cpp', NULL, 'Creoles and pidgins, Portuguese-based (Other)', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6385');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6386', 'cre', 'cre', NULL, 'Cree', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6386');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6387', 'crp', 'crp', NULL, 'Creoles and pidgins (Other)', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6387');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6388', 'cus', 'cus', NULL, 'Cushitic (Other)', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6388');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6389', 'cym', 'wel', 'cy', 'Welsh', 'Celtic', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6389');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6390', 'dak', 'dak', NULL, 'Dakota', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6390');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6391', 'dan', 'dan', 'da', 'Danish', 'Germanic', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6391');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6392', 'day', 'day', NULL, 'Dayak', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6392');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6393', 'del', 'del', NULL, 'Delaware', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6393');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6394', 'den', 'den', NULL, 'Slave (Athapascan)', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6394');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6395', 'deu', 'ger', 'de', 'German', 'Germanic', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6395');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6396', 'dgr', 'dgr', NULL, 'Dogrib', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6396');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6397', 'din', 'din', NULL, 'Dinka', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6397');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6398', 'div', 'div', NULL, 'Divehi', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6398');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6399', 'doi', 'doi', NULL, 'Dogri', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6399');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6400', 'dra', 'dra', NULL, 'Dravidian (Other)', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6400');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6401', 'dua', 'dua', NULL, 'Duala', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6401');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6402', 'dum', 'dum', NULL, 'Dutch, Middle (ca. 1050-1350)', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6402');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6403', 'dyu', 'dyu', NULL, 'Dyula', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6403');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6404', 'dzo', 'dzo', 'dz', 'Dzongkha', 'Asian', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6404');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6405', 'efi', 'efi', NULL, 'Efik', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6405');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6406', 'egy', 'egy', NULL, 'Egyptian (Ancient)', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6406');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6407', 'eka', 'eka', NULL, 'Ekajuk', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6407');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6408', 'ell', 'gre', 'el', 'Greek, Modern (1453-)', 'Latin/greek', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6408');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6409', 'elx', 'elx', NULL, 'Elamite', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6409');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6410', 'eng', 'eng', 'en', 'English', 'Germanic', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6410');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6411', 'enm', 'enm', NULL, 'English, Middle (1100-1500)', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6411');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6412', 'epo', 'epo', 'eo', 'Esperanto', 'International aux.', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6412');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6413', 'est', 'est', 'et', 'Estonian', 'Finno-ugric', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6413');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6414', 'eus', 'baq', 'eu', 'Basque', 'Basque', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6414');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6415', 'ewe', 'ewe', NULL, 'Ewe', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6415');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6416', 'ewo', 'ewo', NULL, 'Ewondo', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6416');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6417', 'fan', 'fan', NULL, 'Fang', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6417');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6418', 'fao', 'fao', 'fo', 'Faroese', 'Germanic', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6418');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6419', 'fas', 'per', 'fa', 'Persian', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6419');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6420', 'fat', 'fat', NULL, 'Fanti', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6420');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6421', 'fij', 'fij', 'fj', 'Fijian', 'Oceanic/indonesian', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6421');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6422', 'fin', 'fin', 'fi', 'Finnish', 'Finno-ugric', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6422');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6423', 'fiu', 'fiu', NULL, 'Finno-Ugrian (Other)', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6423');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6424', 'fon', 'fon', NULL, 'Fon', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6424');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6425', 'fra', 'fre', 'fr', 'French', 'Romance', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6425');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6426', 'frm', 'frm', NULL, 'French, Middle (ca. 1400-1600)', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6426');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6427', 'fro', 'fro', NULL, 'French, Old (842-ca. 1400)', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6427');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6428', 'fry', 'fry', 'fy', 'Frisian', 'Germanic', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6428');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6429', 'ful', 'ful', NULL, 'Fulah', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6429');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6430', 'fur', 'fur', NULL, 'Friulian', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6430');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6431', 'gaa', 'gaa', NULL, 'Ga', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6431');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6432', 'gay', 'gay', NULL, 'Gayo', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6432');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6433', 'gba', 'gba', NULL, 'Gbaya', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6433');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6434', 'gem', 'gem', NULL, 'Germanic (Other)', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6434');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6435', 'gez', 'gez', NULL, 'Geez', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6435');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6436', 'gil', 'gil', NULL, 'Gilbertese', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6436');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6437', 'gla', 'gla', 'gd', 'Gaelic (Scots)', 'Celtic', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6437');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6438', 'gle', 'gle', 'ga', 'Irish', 'Celtic', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6438');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6439', 'glg', 'glg', 'gl', 'Gallegan', 'Romance', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6439');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6440', 'glv', 'glv', 'gv', 'Manx', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6440');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6441', 'gmh', 'gmh', NULL, 'German, Middle High (ca. 1050-1500)', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6441');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6442', 'goh', 'goh', NULL, 'German, Old High (ca. 750-1050)', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6442');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6443', 'gon', 'gon', NULL, 'Gondi', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6443');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6444', 'gor', 'gor', NULL, 'Gorontalo', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6444');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6445', 'got', 'got', NULL, 'Gothic', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6445');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6446', 'grb', 'grb', NULL, 'Grebo', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6446');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6447', 'grc', 'grc', NULL, 'Greek, Ancient (to 1453)', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6447');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6448', 'grn', 'grn', 'gn', 'Guarani', 'Amerindian', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6448');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6449', 'guj', 'guj', 'gu', 'Gujarati', 'Indian', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6449');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6450', 'gwi', 'gwi', NULL, 'Gwich´in', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6450');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6451', 'hai', 'hai', NULL, 'Haida', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6451');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6452', 'hau', 'hau', 'ha', 'Hausa', 'Negro-african', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6452');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6453', 'haw', 'haw', NULL, 'Hawaiian', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6453');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6454', 'heb', 'heb', 'he', 'Hebrew', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6454');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6455', 'her', 'her', 'hz', 'Herero', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6455');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6456', 'hil', 'hil', NULL, 'Hiligaynon', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6456');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6457', 'him', 'him', NULL, 'Himachali', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6457');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6458', 'hin', 'hin', 'hi', 'Hindi', 'Indian', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6458');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6459', 'hit', 'hit', NULL, 'Hittite', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6459');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6460', 'hmn', 'hmn', NULL, 'Hmong', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6460');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6461', 'hmo', 'hmo', 'ho', 'Hiri Motu', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6461');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6462', 'hrv', 'scr', 'hr', 'Croatian', 'Slavic', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6462');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6463', 'hun', 'hun', 'hu', 'Hungarian', 'Finno-ugric', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6463');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6464', 'hup', 'hup', NULL, 'Hupa', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6464');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6465', 'hye', 'arm', 'hy', 'Armenian', 'Indo-european (other)', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6465');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6466', 'iba', 'iba', NULL, 'Iban', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6466');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6467', 'ibo', 'ibo', NULL, 'Igbo', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6467');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6468', 'ijo', 'ijo', NULL, 'Ijo', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6468');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6469', 'iku', 'iku', 'iu', 'Inuktitut', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6469');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6470', 'ile', 'ile', 'ie', 'Interlingue', 'International aux.', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6470');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6471', 'ilo', 'ilo', NULL, 'Iloko', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6471');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6472', 'ina', 'ina', 'ia', 'Interlingua', 'International aux.', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6472');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6473', 'inc', 'inc', NULL, 'Indic (Other)', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6473');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6474', 'ind', 'ind', 'id', 'Indonesian', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6474');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6475', 'ine', 'ine', NULL, 'Indo-European (Other)', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6475');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6476', 'ipk', 'ipk', 'ik', 'Inupiaq', 'Eskimo', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6476');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6477', 'ira', 'ira', NULL, 'Iranian (Other)', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6477');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6478', 'iro', 'iro', NULL, 'Iroquoian languages', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6478');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6479', 'isl', 'ice', 'is', 'Icelandic', 'Germanic', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6479');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6480', 'ita', 'ita', 'it', 'Italian', 'Romance', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6480');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6481', 'jaw', 'jav', 'jw', 'Javanese', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6481');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6482', 'jpn', 'jpn', 'ja', 'Japanese', 'Asian', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6482');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6483', 'jpr', 'jpr', NULL, 'Judeo-Persian', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6483');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6484', 'kaa', 'kaa', NULL, 'Kara-Kalpak', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6484');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6485', 'kab', 'kab', NULL, 'Kabyle', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6485');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6486', 'kac', 'kac', NULL, 'Kachin', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6486');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6487', 'kal', 'kal', 'kl', 'Kalaallisut', 'Eskimo', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6487');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6488', 'kam', 'kam', NULL, 'Kamba', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6488');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6489', 'kan', 'kan', 'kn', 'Kannada', 'Dravidian', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6489');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6490', 'kar', 'kar', NULL, 'Karen', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6490');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6491', 'kas', 'kas', 'ks', 'Kashmiri', 'Indian', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6491');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6492', 'kat', 'geo', 'ka', 'Georgian', 'Ibero-caucasian', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6492');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6493', 'kau', 'kau', NULL, 'Kanuri', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6493');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6494', 'kaw', 'kaw', NULL, 'Kawi', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6494');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6495', 'kaz', 'kaz', 'kk', 'Kazakh', 'Turkic/altaic', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6495');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6496', 'kha', 'kha', NULL, 'Khasi', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6496');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6497', 'khi', 'khi', NULL, 'Khoisan (Other)', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6497');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6498', 'khm', 'khm', 'km', 'Khmer', 'Asian', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6498');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6499', 'kho', 'kho', NULL, 'Khotanese', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6499');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6500', 'kik', 'kik', 'ki', 'Kikuyu', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6500');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6501', 'kin', 'kin', 'rw', 'Kinyarwanda', 'Negro-african', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6501');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6502', 'kir', 'kir', 'ky', 'Kirghiz', 'Turkic/altaic', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6502');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6503', 'kmb', 'kmb', NULL, 'Kimbundu', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6503');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6504', 'kok', 'kok', NULL, 'Konkani', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6504');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6505', 'kom', 'kom', 'kv', 'Komi', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6505');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6506', 'kon', 'kon', NULL, 'Kongo', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6506');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6507', 'kor', 'kor', 'ko', 'Korean', 'Asian', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6507');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6508', 'kos', 'kos', NULL, 'Kosraean', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6508');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6509', 'kpe', 'kpe', NULL, 'Kpelle', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6509');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6510', 'kro', 'kro', NULL, 'Kru', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6510');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6511', 'kru', 'kru', NULL, 'Kurukh', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6511');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6512', 'kum', 'kum', NULL, 'Kumyk', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6512');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6513', 'kur', 'kur', 'ku', 'Kurdish', 'Iranian', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6513');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6514', 'kut', 'kut', NULL, 'Kutenai', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6514');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6515', 'lad', 'lad', NULL, 'Ladino', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6515');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6516', 'lah', 'lah', NULL, 'Lahnda', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6516');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6517', 'lam', 'lam', NULL, 'Lamba', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6517');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6518', 'lao', 'lao', 'lo', 'Lao', 'Asian', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6518');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6519', 'lat', 'lat', 'la', 'Latin', 'Latin/greek', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6519');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6520', 'lav', 'lav', 'lv', 'Latvian', 'Baltic', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6520');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6521', 'lez', 'lez', NULL, 'Lezghian', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6521');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6522', 'lin', 'lin', 'ln', 'Lingala', 'Negro-african', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6522');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6523', 'lit', 'lit', 'lt', 'Lithuanian', 'Baltic', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6523');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6524', 'lol', 'lol', NULL, 'Mongo', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6524');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6525', 'loz', 'loz', NULL, 'Lozi', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6525');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6526', 'ltz', 'ltz', 'lb', 'Letzeburgesch', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6526');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6527', 'lua', 'lua', NULL, 'Luba-Lulua', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6527');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6528', 'lub', 'lub', NULL, 'Luba-Katanga', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6528');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6529', 'lug', 'lug', NULL, 'Ganda', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6529');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6530', 'lui', 'lui', NULL, 'Luiseno', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6530');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6531', 'lun', 'lun', NULL, 'Lunda', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6531');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6532', 'luo', 'luo', NULL, 'Luo (Kenya and Tanzania)', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6532');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6533', 'lus', 'lus', NULL, 'lushai', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6533');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6534', 'mad', 'mad', NULL, 'Madurese', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6534');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6535', 'mag', 'mag', NULL, 'Magahi', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6535');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6536', 'mah', 'mah', 'mh', 'Marshall', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6536');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6537', 'mai', 'mai', NULL, 'Maithili', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6537');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6538', 'mak', 'mak', NULL, 'Makasar', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6538');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6539', 'mal', 'mal', 'ml', 'Malayalam', 'Dravidian', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6539');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6540', 'man', 'man', NULL, 'Mandingo', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6540');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6541', 'map', 'map', NULL, 'Austronesian (Other)', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6541');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6542', 'mar', 'mar', 'mr', 'Marathi', 'Indian', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6542');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6543', 'mas', 'mas', NULL, 'Masai', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6543');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6544', 'mdr', 'mdr', NULL, 'Mandar', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6544');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6545', 'men', 'men', NULL, 'Mende', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6545');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6546', 'mga', 'mga', NULL, 'Irish, Middle (900-1200)', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6546');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6547', 'mic', 'mic', NULL, 'Micmac', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6547');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6548', 'min', 'min', NULL, 'Minangkabau', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6548');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6549', 'mis', 'mis', NULL, 'Miscellaneous languages', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6549');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6550', 'mkd', 'mac', 'mk', 'Macedonian', 'Slavic', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6550');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6551', 'mkh', 'mkh', NULL, 'Mon-Khmer (Other)', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6551');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6552', 'mlg', 'mlg', 'mg', 'Malagasy', 'Oceanic/indonesian', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6552');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6553', 'mlt', 'mlt', 'mt', 'Maltese', 'Semitic', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6553');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6554', 'mnc', 'mnc', NULL, 'Manchu', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6554');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6555', 'mni', 'mni', NULL, 'Manipuri', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6555');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6556', 'mno', 'mno', NULL, 'Manobo languages', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6556');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6557', 'moh', 'moh', NULL, 'Mohawk', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6557');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6558', 'mol', 'mol', 'mo', 'Moldavian', 'Romance', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6558');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6559', 'mon', 'mon', 'mn', 'Mongolian', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6559');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6560', 'mos', 'mos', NULL, 'Mossi', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6560');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6561', 'mri', 'mao', 'mi', 'Maori', 'Oceanic/indonesian', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6561');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6562', 'msa', 'may', 'ms', 'Malay', 'Oceanic/indonesian', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6562');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6563', 'mul', 'mul', NULL, 'Multiple languages', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6563');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6564', 'mun', 'mun', NULL, 'Munda languages', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6564');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6565', 'mus', 'mus', NULL, 'Creek', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6565');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6566', 'mwr', 'mwr', NULL, 'Marwari', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6566');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6567', 'mya', 'bur', 'my', 'Burmese', 'Asian', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6567');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6568', 'myn', 'myn', NULL, 'Mayan languages', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6568');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6569', 'nah', 'nah', NULL, 'Nahuatl', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6569');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6570', 'nai', 'nai', NULL, 'North American Indian', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6570');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6571', 'nau', 'nau', 'na', 'Nauru', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6571');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6572', 'nav', 'nav', 'nv', 'Navajo', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6572');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6573', 'nbl', 'nbl', 'nr', 'Ndebele, South', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6573');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6574', 'nde', 'nde', 'nd', 'Ndebele, North', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6574');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6575', 'ndo', 'ndo', 'ng', 'Ndonga', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6575');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6576', 'nds', 'nds', NULL, 'Low German; Low Saxon; German, Low; Saxon, Low', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6576');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6577', 'nep', 'nep', 'ne', 'Nepali', 'Indian', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6577');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6578', 'new', 'new', NULL, 'Newari', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6578');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6579', 'nia', 'nia', NULL, 'Nias', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6579');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6580', 'nic', 'nic', NULL, 'Niger-Kordofanian (Other)', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6580');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6581', 'niu', 'niu', NULL, 'Niuean', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6581');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6582', 'nld', 'dut', 'nl', 'Dutch', 'Germanic', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6582');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6583', 'nno', 'nno', 'nn', 'Norwegian Nynorsk', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6583');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6584', 'nob', 'nob', 'nb', 'Norwegian Bokmål', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6584');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6585', 'non', 'non', NULL, 'Norse, Old', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6585');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6586', 'nor', 'nor', 'no', 'Norwegian', 'Germanic', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6586');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6587', 'nso', 'nso', NULL, 'Sotho, Northern', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6587');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6588', 'nub', 'nub', NULL, 'Nubian languages', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6588');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6589', 'nya', 'nya', 'ny', 'Chichewa; Nyanja', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6589');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6590', 'nym', 'nym', NULL, 'Nyamwezi', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6590');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6591', 'nyn', 'nyn', NULL, 'Nyankole', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6591');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6592', 'nyo', 'nyo', NULL, 'Nyoro', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6592');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6593', 'nzi', 'nzi', NULL, 'Nzima', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6593');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6594', 'oci', 'oci', 'oc', 'Occitan (post 1500); Provençal', 'Romance', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6594');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6595', 'oji', 'oji', NULL, 'Ojibwa', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6595');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6596', 'ori', 'ori', 'or', 'Oriya', 'Indian', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6596');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6597', 'orm', 'orm', 'om', 'Oromo', 'Hamitic', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6597');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6598', 'osa', 'osa', NULL, 'Osage', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6598');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6599', 'oss', 'oss', 'os', 'Ossetian; Ossetic', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6599');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6600', 'ota', 'ota', NULL, 'Turkish, Ottoman (1500-1928)', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6600');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6601', 'oto', 'oto', NULL, 'Otomian languages', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6601');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6602', 'paa', 'paa', NULL, 'Papuan (Other)', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6602');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6603', 'pag', 'pag', NULL, 'Pangasinan', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6603');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6604', 'pal', 'pal', NULL, 'Pahlavi', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6604');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6605', 'pam', 'pam', NULL, 'Pampanga', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6605');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6606', 'pan', 'pan', 'pa', 'Panjabi', 'Indian', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6606');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6607', 'pap', 'pap', NULL, 'Papiamento', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6607');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6608', 'pau', 'pau', NULL, 'Palauan', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6608');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6609', 'peo', 'peo', NULL, 'Persian, Old (ca. 600-400 b.c.)', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6609');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6610', 'phi', 'phi', NULL, 'Philippine (Other)', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6610');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6611', 'pli', 'pli', 'pi', 'Pali', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6611');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6612', 'pol', 'pol', 'pl', 'Polish', 'Slavic', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6612');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6613', 'pon', 'pon', NULL, 'Pohnpeian', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6613');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6614', 'por', 'por', 'pt', 'Portuguese', 'Romance', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6614');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6615', 'pra', 'pra', NULL, 'Prakrit languages', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6615');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6616', 'pro', 'pro', NULL, 'Provençal, Old (to 1500)', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6616');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6617', 'pus', 'pus', 'ps', 'Pushto', 'Iranian', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6617');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6618', 'que', 'que', 'qu', 'Quechua', 'Amerindian', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6618');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6619', 'raj', 'raj', NULL, 'Rajasthani', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6619');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6620', 'rap', 'rap', NULL, 'Rapanui', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6620');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6621', 'rar', 'rar', NULL, 'Rarotongan', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6621');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6622', 'roa', 'roa', NULL, 'Romance (Other)', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6622');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6623', 'rom', 'rom', NULL, 'Romany', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6623');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6624', 'ron', 'rum', 'ro', 'Romanian', 'Romance', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6624');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6625', 'run', 'run', 'rn', 'Rundi', 'Negro-african', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6625');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6626', 'rus', 'rus', 'ru', 'Russian', 'Slavic', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6626');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6627', 'sad', 'sad', NULL, 'Sandawe', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6627');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6628', 'sag', 'sag', 'sg', 'Sango', 'Negro-african', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6628');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6629', 'sah', 'sah', NULL, 'Yakut', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6629');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6630', 'sai', 'sai', NULL, 'South American Indian (Other)', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6630');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6631', 'sal', 'sal', NULL, 'Salishan languages', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6631');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6632', 'sam', 'sam', NULL, 'Samaritan Aramaic', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6632');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6633', 'san', 'san', 'sa', 'Sanskrit', 'Indian', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6633');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6634', 'sas', 'sas', NULL, 'Sasak', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6634');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6635', 'sat', 'sat', NULL, 'Santali', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6635');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6636', 'sco', 'sco', NULL, 'Scots', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6636');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6637', 'sel', 'sel', NULL, 'Selkup', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6637');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6638', 'sem', 'sem', NULL, 'Semitic (Other)', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6638');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6639', 'sga', 'sga', NULL, 'Irish, Old (to 900)', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6639');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6640', 'sgn', 'sgn', NULL, 'Sign Languages', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6640');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6641', 'shn', 'shn', NULL, 'Shan', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6641');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6642', 'sid', 'sid', NULL, 'Sidamo', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6642');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6643', 'sin', 'sin', 'si', 'Sinhalese', 'Indian', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6643');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6644', 'sio', 'sio', NULL, 'Siouan languages', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6644');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6645', 'sit', 'sit', NULL, 'Sino-Tibetan (Other)', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6645');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6646', 'sla', 'sla', NULL, 'Slavic (Other)', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6646');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6647', 'slk', 'slo', 'sk', 'Slovak', 'Slavic', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6647');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6648', 'slv', 'slv', 'sl', 'Slovenian', 'Slavic', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6648');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6649', 'sme', 'sme', 'se', 'Northern Sami', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6649');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6650', 'smi', 'smi', NULL, 'Sami languages (Other)', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6650');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6651', 'smo', 'smo', 'sm', 'Samoan', 'Oceanic/indonesian', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6651');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6652', 'sna', 'sna', 'sn', 'Shona', 'Negro-african', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6652');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6653', 'snd', 'snd', 'sd', 'Sindhi', 'Indian', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6653');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6654', 'snk', 'snk', NULL, 'Soninke', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6654');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6655', 'sog', 'sog', NULL, 'Sogdian', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6655');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6656', 'som', 'som', 'so', 'Somali', 'Hamitic', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6656');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6657', 'son', 'son', NULL, 'Songhai', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6657');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6658', 'sot', 'sot', 'st', 'Sotho, Southern', 'Negro-african', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6658');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6659', 'spa', 'spa', 'es', 'Spanish', 'Romance', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6659');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6660', 'sqi', 'alb', 'sq', 'Albanian', 'Indo-european (other)', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6660');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6661', 'srd', 'srd', 'sc', 'Sardinian', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6661');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6662', 'srp', 'scc', 'sr', 'Serbian', 'Slavic', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6662');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6663', 'srr', 'srr', NULL, 'Serer', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6663');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6664', 'ssa', 'ssa', NULL, 'Nilo-Saharan (Other)', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6664');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6665', 'ssw', 'ssw', 'ss', 'Swati', 'Negro-african', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6665');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6666', 'suk', 'suk', NULL, 'Sukuma', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6666');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6667', 'sun', 'sun', 'su', 'Sundanese', 'Oceanic/indonesian', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6667');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6668', 'sus', 'sus', NULL, 'Susu', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6668');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6669', 'sux', 'sux', NULL, 'Sumerian', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6669');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6670', 'swa', 'swa', 'sw', 'Swahili', 'Negro-african', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6670');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6671', 'swe', 'swe', 'sv', 'Swedish', 'Germanic', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6671');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6672', 'syr', 'syr', NULL, 'Syriac', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6672');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6673', 'tah', 'tah', 'ty', 'Tahitian', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6673');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6674', 'tai', 'tai', NULL, 'Tai (Other)', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6674');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6675', 'tam', 'tam', 'ta', 'Tamil', 'Dravidian', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6675');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6676', 'tat', 'tat', 'tt', 'Tatar', 'Turkic/altaic', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6676');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6677', 'tel', 'tel', 'te', 'Telugu', 'Dravidian', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6677');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6678', 'tem', 'tem', NULL, 'Timne', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6678');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6679', 'ter', 'ter', NULL, 'Tereno', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6679');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6680', 'tet', 'tet', NULL, 'Tetum', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6680');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6681', 'tgk', 'tgk', 'tg', 'Tajik', 'Iranian', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6681');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6682', 'tgl', 'tgl', 'tl', 'Tagalog', 'Oceanic/indonesian', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6682');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6683', 'tha', 'tha', 'th', 'Thai', 'Asian', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6683');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6684', 'tig', 'tig', NULL, 'Tigre', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6684');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6685', 'tir', 'tir', 'ti', 'Tigrinya', 'Semitic', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6685');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6686', 'tiv', 'tiv', NULL, 'Tiv', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6686');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6687', 'tkl', 'tkl', NULL, 'Tokelau', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6687');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6688', 'tli', 'tli', NULL, 'Tlingit', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6688');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6689', 'tmh', 'tmh', NULL, 'Tamashek', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6689');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6690', 'tog', 'tog', NULL, 'Tonga (Nyasa)', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6690');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6691', 'ton', 'ton', 'to', 'Tonga (Tonga Islands)', 'Oceanic/indonesian', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6691');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6692', 'tpi', 'tpi', NULL, 'Tok Pisin', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6692');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6693', 'tsi', 'tsi', NULL, 'Tsimshian', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6693');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6694', 'tsn', 'tsn', 'tn', 'Tswana', 'Negro-african', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6694');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6695', 'tso', 'tso', 'ts', 'Tsonga', 'Negro-african', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6695');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6696', 'tuk', 'tuk', 'tk', 'Turkmen', 'Turkic/altaic', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6696');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6697', 'tum', 'tum', NULL, 'Tumbuka', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6697');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6698', 'tur', 'tur', 'tr', 'Turkish', 'Turkic/altaic', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6698');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6699', 'tut', 'tut', NULL, 'Altaic (Other)', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6699');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6700', 'tvl', 'tvl', NULL, 'Tuvalu', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6700');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6701', 'twi', 'twi', 'tw', 'Twi', 'Negro-african', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6701');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6702', 'tyv', 'tyv', NULL, 'Tuvinian', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6702');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6703', 'uga', 'uga', NULL, 'Ugaritic', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6703');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6704', 'uig', 'uig', 'ug', 'Uighur', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6704');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6705', 'ukr', 'ukr', 'uk', 'Ukrainian', 'Slavic', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6705');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6706', 'umb', 'umb', NULL, 'Umbundu', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6706');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6707', 'und', 'und', NULL, 'Undetermined', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6707');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6708', 'urd', 'urd', 'ur', 'Urdu', 'Indian', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6708');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6709', 'uzb', 'uzb', 'uz', 'Uzbek', 'Turkic/altaic', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6709');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6710', 'vai', 'vai', NULL, 'Vai', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6710');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6711', 'ven', 'ven', NULL, 'Venda', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6711');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6712', 'vie', 'vie', 'vi', 'Vietnamese', 'Asian', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6712');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6713', 'vol', 'vol', 'vo', 'Volapük', 'International aux.', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6713');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6714', 'vot', 'vot', NULL, 'Votic', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6714');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6715', 'wak', 'wak', NULL, 'Wakashan languages', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6715');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6716', 'wal', 'wal', NULL, 'Walamo', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6716');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6717', 'war', 'war', NULL, 'Waray', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6717');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6718', 'was', 'was', NULL, 'Washo', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6718');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6719', 'wen', 'wen', NULL, 'Sorbian languages', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6719');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6720', 'wol', 'wol', 'wo', 'Wolof', 'Negro-african', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6720');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6721', 'xho', 'xho', 'xh', 'Xhosa', 'Negro-african', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6721');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6722', 'yao', 'yao', NULL, 'Yao', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6722');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6723', 'yap', 'yap', NULL, 'Yapese', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6723');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6724', 'yid', 'yid', 'yi', 'Yiddish', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6724');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6725', 'yor', 'yor', 'yo', 'Yoruba', 'Negro-african', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6725');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6726', 'ypk', 'ypk', NULL, 'Yupik languages', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6726');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6727', 'zap', 'zap', NULL, 'Zapotec', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6727');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6728', 'zen', 'zen', NULL, 'Zenaga', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6728');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6729', 'zha', 'zha', 'za', 'Zhuang', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6729');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6730', 'zho', 'chi', 'zh', 'Chinese', 'Asian', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6730');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6731', 'znd', 'znd', NULL, 'Zande', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6731');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6732', 'zul', 'zul', 'zu', 'Zulu', 'Negro-african', NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6732');

INSERT INTO standard_language (standard_language_id, lang_code3t, lang_code3b, lang_code2, lang_name, lang_family, lang_charset)
SELECT '6733', 'zun', 'zun', NULL, 'Zuni', NULL, NULL
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE standard_language_id = '6733');

INSERT INTO period_type (period_type_id, description, period_length, uom_id)
SELECT 'FISCAL_YEAR', 'Fiscal Year', '1', 'TF_yr'
WHERE NOT EXISTS (SELECT 1 FROM period_type WHERE period_type_id = 'FISCAL_YEAR');

INSERT INTO period_type (period_type_id, description, period_length, uom_id)
SELECT 'FISCAL_QUARTER', 'Fiscal Quarter', '3', 'TF_mon'
WHERE NOT EXISTS (SELECT 1 FROM period_type WHERE period_type_id = 'FISCAL_QUARTER');

INSERT INTO period_type (period_type_id, description, period_length, uom_id)
SELECT 'FISCAL_MONTH', 'Fiscal Month', '1', 'TF_mon'
WHERE NOT EXISTS (SELECT 1 FROM period_type WHERE period_type_id = 'FISCAL_MONTH');

INSERT INTO period_type (period_type_id, description, period_length, uom_id)
SELECT 'FISCAL_WEEK', 'Fiscal Week', '1', 'TF_wk'
WHERE NOT EXISTS (SELECT 1 FROM period_type WHERE period_type_id = 'FISCAL_WEEK');

INSERT INTO period_type (period_type_id, description, period_length, uom_id)
SELECT 'FISCAL_BIWEEK', 'Fiscal Bi-Week', '2', 'TF_wk'
WHERE NOT EXISTS (SELECT 1 FROM period_type WHERE period_type_id = 'FISCAL_BIWEEK');

INSERT INTO period_type (period_type_id, description, period_length, uom_id)
SELECT 'SALES_QUARTER', 'Sales Quarter', '3', 'TF_mon'
WHERE NOT EXISTS (SELECT 1 FROM period_type WHERE period_type_id = 'SALES_QUARTER');

INSERT INTO period_type (period_type_id, description, period_length, uom_id)
SELECT 'SALES_MONTH', 'Sales Month', '1', 'TF_mon'
WHERE NOT EXISTS (SELECT 1 FROM period_type WHERE period_type_id = 'SALES_MONTH');

INSERT INTO geo_type (geo_type_id, parent_type_id, has_table, description)
SELECT 'CITY', NULL, 0, 'City'
WHERE NOT EXISTS (SELECT 1 FROM geo_type WHERE geo_type_id = 'CITY');

INSERT INTO geo_type (geo_type_id, parent_type_id, has_table, description)
SELECT 'GROUP', NULL, 0, 'Group'
WHERE NOT EXISTS (SELECT 1 FROM geo_type WHERE geo_type_id = 'GROUP');

INSERT INTO geo_type (geo_type_id, parent_type_id, has_table, description)
SELECT 'STATE', NULL, 0, 'State'
WHERE NOT EXISTS (SELECT 1 FROM geo_type WHERE geo_type_id = 'STATE');

INSERT INTO geo_type (geo_type_id, parent_type_id, has_table, description)
SELECT 'POSTAL_CODE', NULL, 0, 'Postal Code'
WHERE NOT EXISTS (SELECT 1 FROM geo_type WHERE geo_type_id = 'POSTAL_CODE');

INSERT INTO geo_type (geo_type_id, parent_type_id, has_table, description)
SELECT 'COUNTRY', NULL, 0, 'Country'
WHERE NOT EXISTS (SELECT 1 FROM geo_type WHERE geo_type_id = 'COUNTRY');

INSERT INTO geo_type (geo_type_id, parent_type_id, has_table, description)
SELECT 'COUNTY', NULL, 0, 'County'
WHERE NOT EXISTS (SELECT 1 FROM geo_type WHERE geo_type_id = 'COUNTY');

INSERT INTO geo_type (geo_type_id, parent_type_id, has_table, description)
SELECT 'COUNTY_CITY', NULL, 0, 'County-City'
WHERE NOT EXISTS (SELECT 1 FROM geo_type WHERE geo_type_id = 'COUNTY_CITY');

INSERT INTO geo_type (geo_type_id, parent_type_id, has_table, description)
SELECT 'MUNICIPALITY', NULL, 0, 'Municipality'
WHERE NOT EXISTS (SELECT 1 FROM geo_type WHERE geo_type_id = 'MUNICIPALITY');

INSERT INTO geo_type (geo_type_id, parent_type_id, has_table, description)
SELECT 'PROVINCE', NULL, 0, 'Province'
WHERE NOT EXISTS (SELECT 1 FROM geo_type WHERE geo_type_id = 'PROVINCE');

INSERT INTO geo_type (geo_type_id, parent_type_id, has_table, description)
SELECT 'REGION', NULL, 0, 'Region'
WHERE NOT EXISTS (SELECT 1 FROM geo_type WHERE geo_type_id = 'REGION');

INSERT INTO geo_type (geo_type_id, parent_type_id, has_table, description)
SELECT 'TERRITORY', NULL, 0, 'Territory'
WHERE NOT EXISTS (SELECT 1 FROM geo_type WHERE geo_type_id = 'TERRITORY');

INSERT INTO geo_type (geo_type_id, parent_type_id, has_table, description)
SELECT 'SALES_TERRITORY', 'TERRITORY', 0, 'Sales Territory'
WHERE NOT EXISTS (SELECT 1 FROM geo_type WHERE geo_type_id = 'SALES_TERRITORY');

INSERT INTO geo_type (geo_type_id, parent_type_id, has_table, description)
SELECT 'SERVICE_TERRITORY', 'TERRITORY', 0, 'Service Territory'
WHERE NOT EXISTS (SELECT 1 FROM geo_type WHERE geo_type_id = 'SERVICE_TERRITORY');

INSERT INTO geo_assoc_type (geo_assoc_type_id, description)
SELECT 'GROUP_MEMBER', 'Geo Group Member'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc_type WHERE geo_assoc_type_id = 'GROUP_MEMBER');

INSERT INTO geo_assoc_type (geo_assoc_type_id, description)
SELECT 'REGIONS', 'For a region of a larger Geo, i.e. states, counties, provinces...'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc_type WHERE geo_assoc_type_id = 'REGIONS');

INSERT INTO geo_assoc_type (geo_assoc_type_id, description)
SELECT 'COUNTY_CITY', 'City in a county'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc_type WHERE geo_assoc_type_id = 'COUNTY_CITY');

INSERT INTO geo_assoc_type (geo_assoc_type_id, description)
SELECT 'COUNTY_SEAT', 'Administrative Main City of a County'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc_type WHERE geo_assoc_type_id = 'COUNTY_SEAT');

INSERT INTO geo_assoc_type (geo_assoc_type_id, description)
SELECT 'POSTAL_CODE', 'Postal code associated to a GeoType'
WHERE NOT EXISTS (SELECT 1 FROM geo_assoc_type WHERE geo_assoc_type_id = 'POSTAL_CODE');

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
