INSERT INTO period_type (description, period_length, period_type_id, uom_id)
SELECT 'Fiscal Year', '1', 'FISCAL_YEAR', 'TF_yr'
WHERE NOT EXISTS (SELECT 1 FROM period_type WHERE description = 'Fiscal Year' AND period_length = '1' AND period_type_id = 'FISCAL_YEAR' AND uom_id = 'TF_yr');

INSERT INTO period_type (description, period_length, period_type_id, uom_id)
SELECT 'Fiscal Quarter', '3', 'FISCAL_QUARTER', 'TF_mon'
WHERE NOT EXISTS (SELECT 1 FROM period_type WHERE description = 'Fiscal Quarter' AND period_length = '3' AND period_type_id = 'FISCAL_QUARTER' AND uom_id = 'TF_mon');

INSERT INTO period_type (description, period_length, period_type_id, uom_id)
SELECT 'Fiscal Month', '1', 'FISCAL_MONTH', 'TF_mon'
WHERE NOT EXISTS (SELECT 1 FROM period_type WHERE description = 'Fiscal Month' AND period_length = '1' AND period_type_id = 'FISCAL_MONTH' AND uom_id = 'TF_mon');

INSERT INTO period_type (description, period_length, period_type_id, uom_id)
SELECT 'Fiscal Week', '1', 'FISCAL_WEEK', 'TF_wk'
WHERE NOT EXISTS (SELECT 1 FROM period_type WHERE description = 'Fiscal Week' AND period_length = '1' AND period_type_id = 'FISCAL_WEEK' AND uom_id = 'TF_wk');

INSERT INTO period_type (description, period_length, period_type_id, uom_id)
SELECT 'Fiscal Bi-Week', '2', 'FISCAL_BIWEEK', 'TF_wk'
WHERE NOT EXISTS (SELECT 1 FROM period_type WHERE description = 'Fiscal Bi-Week' AND period_length = '2' AND period_type_id = 'FISCAL_BIWEEK' AND uom_id = 'TF_wk');

INSERT INTO period_type (description, period_length, period_type_id, uom_id)
SELECT 'Sales Quarter', '3', 'SALES_QUARTER', 'TF_mon'
WHERE NOT EXISTS (SELECT 1 FROM period_type WHERE description = 'Sales Quarter' AND period_length = '3' AND period_type_id = 'SALES_QUARTER' AND uom_id = 'TF_mon');

INSERT INTO period_type (description, period_length, period_type_id, uom_id)
SELECT 'Sales Month', '1', 'SALES_MONTH', 'TF_mon'
WHERE NOT EXISTS (SELECT 1 FROM period_type WHERE description = 'Sales Month' AND period_length = '1' AND period_type_id = 'SALES_MONTH' AND uom_id = 'TF_mon');
