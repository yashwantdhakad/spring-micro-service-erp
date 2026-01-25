INSERT INTO party (party_id, party_type_id)
SELECT 'COMPANY', 'PARTY_GROUP'
WHERE NOT EXISTS (SELECT 1 FROM party WHERE party_id = 'COMPANY' AND party_type_id = 'PARTY_GROUP');

INSERT INTO party_group (group_name, logo_image_url, office_site_name, party_id)
SELECT 'Hermeus Corporation', '/resources/images/hermeus-logo-white.png', 'www.hermeus.com', 'COMPANY'
WHERE NOT EXISTS (SELECT 1 FROM party_group WHERE group_name = 'Hermeus Corporation' AND logo_image_url = '/resources/images/hermeus-logo-white.png' AND office_site_name = 'www.hermeus.com' AND party_id = 'COMPANY');

INSERT INTO party_role (party_id, role_type_id)
SELECT 'COMPANY', 'BILL_FROM_VENDOR'
WHERE NOT EXISTS (SELECT 1 FROM party_role WHERE party_id = 'COMPANY' AND role_type_id = 'BILL_FROM_VENDOR');

INSERT INTO party_role (party_id, role_type_id)
SELECT 'COMPANY', 'BILL_TO_CUSTOMER'
WHERE NOT EXISTS (SELECT 1 FROM party_role WHERE party_id = 'COMPANY' AND role_type_id = 'BILL_TO_CUSTOMER');

INSERT INTO party_role (party_id, role_type_id)
SELECT 'COMPANY', 'INTERNAL_ORGANIZATIO'
WHERE NOT EXISTS (SELECT 1 FROM party_role WHERE party_id = 'COMPANY' AND role_type_id = 'INTERNAL_ORGANIZATIO');

INSERT INTO party_role (party_id, role_type_id)
SELECT 'COMPANY', 'SUPPLIER_AGENT'
WHERE NOT EXISTS (SELECT 1 FROM party_role WHERE party_id = 'COMPANY' AND role_type_id = 'SUPPLIER_AGENT');

INSERT INTO party_role (party_id, role_type_id)
SELECT 'COMPANY', 'SUPPLIER'
WHERE NOT EXISTS (SELECT 1 FROM party_role WHERE party_id = 'COMPANY' AND role_type_id = 'SUPPLIER');

INSERT INTO party_role (party_id, role_type_id)
SELECT 'COMPANY', 'VENDOR'
WHERE NOT EXISTS (SELECT 1 FROM party_role WHERE party_id = 'COMPANY' AND role_type_id = 'VENDOR');

INSERT INTO party_role (party_id, role_type_id)
SELECT 'COMPANY', 'CONTACT'
WHERE NOT EXISTS (SELECT 1 FROM party_role WHERE party_id = 'COMPANY' AND role_type_id = 'CONTACT');

INSERT INTO party_role (party_id, role_type_id)
SELECT 'COMPANY', 'CUSTOMER'
WHERE NOT EXISTS (SELECT 1 FROM party_role WHERE party_id = 'COMPANY' AND role_type_id = 'CUSTOMER');

INSERT INTO party_role (party_id, role_type_id)
SELECT 'COMPANY', '_NA_'
WHERE NOT EXISTS (SELECT 1 FROM party_role WHERE party_id = 'COMPANY' AND role_type_id = '_NA_');

INSERT INTO party_role (party_id, role_type_id)
SELECT 'COMPANY', 'END_USER_CUSTOMER'
WHERE NOT EXISTS (SELECT 1 FROM party_role WHERE party_id = 'COMPANY' AND role_type_id = 'END_USER_CUSTOMER');

INSERT INTO party_role (party_id, role_type_id)
SELECT 'COMPANY', 'SHIP_TO_CUSTOMER'
WHERE NOT EXISTS (SELECT 1 FROM party_role WHERE party_id = 'COMPANY' AND role_type_id = 'SHIP_TO_CUSTOMER');

INSERT INTO party_role (party_id, role_type_id)
SELECT 'COMPANY', 'PLACING_CUSTOMER'
WHERE NOT EXISTS (SELECT 1 FROM party_role WHERE party_id = 'COMPANY' AND role_type_id = 'PLACING_CUSTOMER');

INSERT INTO contact_mech (contact_mech_id, contact_mech_type_id)
SELECT '9000', 'POSTAL_ADDRESS'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech WHERE contact_mech_id = '9000' AND contact_mech_type_id = 'POSTAL_ADDRESS');

INSERT INTO contact_mech (contact_mech_id, contact_mech_type_id, info_string)
SELECT 'COMPANY', 'EMAIL_ADDRESS', 'info@hermeus.com'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech WHERE contact_mech_id = 'COMPANY' AND contact_mech_type_id = 'EMAIL_ADDRESS' AND info_string = 'info@hermeus.com');

INSERT INTO contact_mech (contact_mech_id, contact_mech_type_id)
SELECT '9001', 'TELECOM_NUMBER'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech WHERE contact_mech_id = '9001' AND contact_mech_type_id = 'TELECOM_NUMBER');

INSERT INTO telecom_number (area_code, contact_mech_id, contact_number, country_code)
SELECT '470', '9001', '223-4927', '1'
WHERE NOT EXISTS (SELECT 1 FROM telecom_number WHERE area_code = '470' AND contact_mech_id = '9001' AND contact_number = '223-4927' AND country_code = '1');

INSERT INTO party_contact_mech (allow_solicitation, contact_mech_id, from_date, party_id)
SELECT 'Y', '9000', '2014-01-01 00:00:00', 'COMPANY'
WHERE NOT EXISTS (SELECT 1 FROM party_contact_mech WHERE allow_solicitation = 'Y' AND contact_mech_id = '9000' AND from_date = '2014-01-01 00:00:00' AND party_id = 'COMPANY');

INSERT INTO party_contact_mech (allow_solicitation, contact_mech_id, from_date, party_id, verified)
SELECT 'Y', 'COMPANY', '2014-01-01 00:00:00', 'COMPANY', 'Y'
WHERE NOT EXISTS (SELECT 1 FROM party_contact_mech WHERE allow_solicitation = 'Y' AND contact_mech_id = 'COMPANY' AND from_date = '2014-01-01 00:00:00' AND party_id = 'COMPANY' AND verified = 'Y');

INSERT INTO party_contact_mech (allow_solicitation, contact_mech_id, from_date, party_id)
SELECT 'Y', '9001', '2014-05-13 00:00:00', 'COMPANY'
WHERE NOT EXISTS (SELECT 1 FROM party_contact_mech WHERE allow_solicitation = 'Y' AND contact_mech_id = '9001' AND from_date = '2014-05-13 00:00:00' AND party_id = 'COMPANY');

INSERT INTO postal_address (address1, city, contact_mech_id, country_geo_id, postal_code, state_province_geo_id, to_name)
SELECT '3960 Dekalb Technology Parkway', 'Doraville', '9000', 'USA', '30340', 'GA', 'Hermeus'
WHERE NOT EXISTS (SELECT 1 FROM postal_address WHERE address1 = '3960 Dekalb Technology Parkway' AND city = 'Doraville' AND contact_mech_id = '9000' AND country_geo_id = 'USA' AND postal_code = '30340' AND state_province_geo_id = 'GA' AND to_name = 'Hermeus');

INSERT INTO party_contact_mech_purpose (contact_mech_id, contact_mech_purpose_type_id, from_date, party_id)
SELECT 'COMPANY', 'PRIMARY_EMAIL', '2015-01-01 00:00:00', 'COMPANY'
WHERE NOT EXISTS (SELECT 1 FROM party_contact_mech_purpose WHERE contact_mech_id = 'COMPANY' AND contact_mech_purpose_type_id = 'PRIMARY_EMAIL' AND from_date = '2015-01-01 00:00:00' AND party_id = 'COMPANY');

INSERT INTO party_contact_mech_purpose (contact_mech_id, contact_mech_purpose_type_id, from_date, party_id)
SELECT '9000', 'BILLING_LOCATION', '2014-01-01 00:00:00', 'COMPANY'
WHERE NOT EXISTS (SELECT 1 FROM party_contact_mech_purpose WHERE contact_mech_id = '9000' AND contact_mech_purpose_type_id = 'BILLING_LOCATION' AND from_date = '2014-01-01 00:00:00' AND party_id = 'COMPANY');

INSERT INTO party_contact_mech_purpose (contact_mech_id, contact_mech_purpose_type_id, from_date, party_id)
SELECT '9000', 'GENERAL_LOCATION', '2014-01-01 00:00:00', 'COMPANY'
WHERE NOT EXISTS (SELECT 1 FROM party_contact_mech_purpose WHERE contact_mech_id = '9000' AND contact_mech_purpose_type_id = 'GENERAL_LOCATION' AND from_date = '2014-01-01 00:00:00' AND party_id = 'COMPANY');

INSERT INTO party_contact_mech_purpose (contact_mech_id, contact_mech_purpose_type_id, from_date, party_id)
SELECT '9000', 'PAYMENT_LOCATION', '2014-01-01 00:00:00', 'COMPANY'
WHERE NOT EXISTS (SELECT 1 FROM party_contact_mech_purpose WHERE contact_mech_id = '9000' AND contact_mech_purpose_type_id = 'PAYMENT_LOCATION' AND from_date = '2014-01-01 00:00:00' AND party_id = 'COMPANY');

INSERT INTO party_contact_mech_purpose (contact_mech_id, contact_mech_purpose_type_id, from_date, party_id)
SELECT '9000', 'SHIPPING_LOCATION', '2006-06-21 00:00:00', 'COMPANY'
WHERE NOT EXISTS (SELECT 1 FROM party_contact_mech_purpose WHERE contact_mech_id = '9000' AND contact_mech_purpose_type_id = 'SHIPPING_LOCATION' AND from_date = '2006-06-21 00:00:00' AND party_id = 'COMPANY');

INSERT INTO party_contact_mech_purpose (contact_mech_id, contact_mech_purpose_type_id, from_date, party_id)
SELECT '9001', 'PHONE_BILLING', '2014-05-13 00:00:00', 'COMPANY'
WHERE NOT EXISTS (SELECT 1 FROM party_contact_mech_purpose WHERE contact_mech_id = '9001' AND contact_mech_purpose_type_id = 'PHONE_BILLING' AND from_date = '2014-05-13 00:00:00' AND party_id = 'COMPANY');

INSERT INTO party_acctg_preference (base_currency_uom_id, cogs_method_id, enable_accounting, error_gl_journal_id, invoice_id_prefix, invoice_seq_cust_meth_id, order_id_prefix, party_id, quote_id_prefix, tax_form_id)
SELECT 'USD', 'COGS_AVG_COST', 1, 'ERROR_JOURNAL', 'CI', 'INV_HOOK_ENF_SEQ', '', 'COMPANY', 'CQ', ''
WHERE NOT EXISTS (SELECT 1 FROM party_acctg_preference WHERE base_currency_uom_id = 'USD' AND cogs_method_id = 'COGS_AVG_COST' AND enable_accounting = 1 AND error_gl_journal_id = 'ERROR_JOURNAL' AND invoice_id_prefix = 'CI' AND invoice_seq_cust_meth_id = 'INV_HOOK_ENF_SEQ' AND order_id_prefix = '' AND party_id = 'COMPANY' AND quote_id_prefix = 'CQ' AND tax_form_id = '');

INSERT INTO contact_mech (contact_mech_id, contact_mech_type_id)
SELECT 'WH_TN', 'TELECOM_NUMBER'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech WHERE contact_mech_id = 'WH_TN' AND contact_mech_type_id = 'TELECOM_NUMBER');

INSERT INTO contact_mech (contact_mech_id, contact_mech_type_id)
SELECT 'WH_PA', 'POSTAL_ADDRESS'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech WHERE contact_mech_id = 'WH_PA' AND contact_mech_type_id = 'POSTAL_ADDRESS');

INSERT INTO contact_mech (contact_mech_id, contact_mech_type_id, info_string)
SELECT 'WH_EA', 'EMAIL_ADDRESS', 'info@hermeus.com'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech WHERE contact_mech_id = 'WH_EA' AND contact_mech_type_id = 'EMAIL_ADDRESS' AND info_string = 'info@hermeus.com');

INSERT INTO postal_address (address1, city, contact_mech_id, country_geo_id, postal_code, state_province_geo_id, to_name)
SELECT '3960 Dekalb Technology Parkway', 'Doraville', 'WH_PA', 'USA', '30340', 'GA', 'The Factory'
WHERE NOT EXISTS (SELECT 1 FROM postal_address WHERE address1 = '3960 Dekalb Technology Parkway' AND city = 'Doraville' AND contact_mech_id = 'WH_PA' AND country_geo_id = 'USA' AND postal_code = '30340' AND state_province_geo_id = 'GA' AND to_name = 'The Factory');

INSERT INTO telecom_number (area_code, contact_mech_id, contact_number, country_code)
SELECT '470', 'WH_TN', '223-4927', '1'
WHERE NOT EXISTS (SELECT 1 FROM telecom_number WHERE area_code = '470' AND contact_mech_id = 'WH_TN' AND contact_number = '223-4927' AND country_code = '1');

INSERT INTO contact_mech (contact_mech_id, contact_mech_type_id)
SELECT 'WH_TN_1', 'TELECOM_NUMBER'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech WHERE contact_mech_id = 'WH_TN_1' AND contact_mech_type_id = 'TELECOM_NUMBER');

INSERT INTO contact_mech (contact_mech_id, contact_mech_type_id)
SELECT 'WH_PA_1', 'POSTAL_ADDRESS'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech WHERE contact_mech_id = 'WH_PA_1' AND contact_mech_type_id = 'POSTAL_ADDRESS');

INSERT INTO contact_mech (contact_mech_id, contact_mech_type_id, info_string)
SELECT 'WH_EA_1', 'EMAIL_ADDRESS', 'info@hermeus.com'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech WHERE contact_mech_id = 'WH_EA_1' AND contact_mech_type_id = 'EMAIL_ADDRESS' AND info_string = 'info@hermeus.com');

INSERT INTO postal_address (address1, city, contact_mech_id, country_geo_id, postal_code, state_province_geo_id, to_name)
SELECT '1165 Franklin St', 'South Bend', 'WH_PA_1', 'USA', '46601', 'IN', 'Site ND'
WHERE NOT EXISTS (SELECT 1 FROM postal_address WHERE address1 = '1165 Franklin St' AND city = 'South Bend' AND contact_mech_id = 'WH_PA_1' AND country_geo_id = 'USA' AND postal_code = '46601' AND state_province_geo_id = 'IN' AND to_name = 'Site ND');

INSERT INTO telecom_number (area_code, contact_mech_id, contact_number, country_code)
SELECT '470', 'WH_TN_1', '223-4927', '1'
WHERE NOT EXISTS (SELECT 1 FROM telecom_number WHERE area_code = '470' AND contact_mech_id = 'WH_TN_1' AND contact_number = '223-4927' AND country_code = '1');

INSERT INTO contact_mech (contact_mech_id, contact_mech_type_id)
SELECT 'WH_TN_2', 'TELECOM_NUMBER'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech WHERE contact_mech_id = 'WH_TN_2' AND contact_mech_type_id = 'TELECOM_NUMBER');

INSERT INTO contact_mech (contact_mech_id, contact_mech_type_id)
SELECT 'WH_PA_2', 'POSTAL_ADDRESS'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech WHERE contact_mech_id = 'WH_PA_2' AND contact_mech_type_id = 'POSTAL_ADDRESS');

INSERT INTO contact_mech (contact_mech_id, contact_mech_type_id, info_string)
SELECT 'WH_EA_2', 'EMAIL_ADDRESS', 'info@hermeus.com'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech WHERE contact_mech_id = 'WH_EA_2' AND contact_mech_type_id = 'EMAIL_ADDRESS' AND info_string = 'info@hermeus.com');

INSERT INTO postal_address (address1, city, contact_mech_id, country_geo_id, postal_code, state_province_geo_id, to_name)
SELECT '1954 Airport Rd', 'Atlanta', 'WH_PA_2', 'USA', '84101', 'GA', 'Site 27'
WHERE NOT EXISTS (SELECT 1 FROM postal_address WHERE address1 = '1954 Airport Rd' AND city = 'Atlanta' AND contact_mech_id = 'WH_PA_2' AND country_geo_id = 'USA' AND postal_code = '84101' AND state_province_geo_id = 'GA' AND to_name = 'Site 27');

INSERT INTO telecom_number (area_code, contact_mech_id, contact_number, country_code)
SELECT '470', 'WH_TN_2', '223-4927', '1'
WHERE NOT EXISTS (SELECT 1 FROM telecom_number WHERE area_code = '470' AND contact_mech_id = 'WH_TN_2' AND contact_number = '223-4927' AND country_code = '1');

INSERT INTO contact_mech (contact_mech_id, contact_mech_type_id)
SELECT 'WH_TN_3', 'TELECOM_NUMBER'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech WHERE contact_mech_id = 'WH_TN_3' AND contact_mech_type_id = 'TELECOM_NUMBER');

INSERT INTO contact_mech (contact_mech_id, contact_mech_type_id)
SELECT 'WH_PA_3', 'POSTAL_ADDRESS'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech WHERE contact_mech_id = 'WH_PA_3' AND contact_mech_type_id = 'POSTAL_ADDRESS');

INSERT INTO contact_mech (contact_mech_id, contact_mech_type_id, info_string)
SELECT 'WH_EA_3', 'EMAIL_ADDRESS', 'info@hermeus.com'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech WHERE contact_mech_id = 'WH_EA_3' AND contact_mech_type_id = 'EMAIL_ADDRESS' AND info_string = 'info@hermeus.com');

INSERT INTO postal_address (address1, city, contact_mech_id, country_geo_id, postal_code, state_province_geo_id, to_name)
SELECT '3401 Jack Northrop Ave', 'Hawthorne', 'WH_PA_3', 'USA', '90250', 'CA', 'The Shop'
WHERE NOT EXISTS (SELECT 1 FROM postal_address WHERE address1 = '3401 Jack Northrop Ave' AND city = 'Hawthorne' AND contact_mech_id = 'WH_PA_3' AND country_geo_id = 'USA' AND postal_code = '90250' AND state_province_geo_id = 'CA' AND to_name = 'The Shop');

INSERT INTO telecom_number (area_code, contact_mech_id, contact_number, country_code)
SELECT '470', 'WH_TN_3', '223-4927', '1'
WHERE NOT EXISTS (SELECT 1 FROM telecom_number WHERE area_code = '470' AND contact_mech_id = 'WH_TN_3' AND contact_number = '223-4927' AND country_code = '1');

INSERT INTO contact_mech (contact_mech_id, contact_mech_type_id)
SELECT 'THE_VAN_TN', 'TELECOM_NUMBER'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech WHERE contact_mech_id = 'THE_VAN_TN' AND contact_mech_type_id = 'TELECOM_NUMBER');

INSERT INTO contact_mech (contact_mech_id, contact_mech_type_id)
SELECT 'THE_VAN_PA', 'POSTAL_ADDRESS'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech WHERE contact_mech_id = 'THE_VAN_PA' AND contact_mech_type_id = 'POSTAL_ADDRESS');

INSERT INTO contact_mech (contact_mech_id, contact_mech_type_id, info_string)
SELECT 'THE_VAN_EA', 'EMAIL_ADDRESS', 'info@hermeus.com'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech WHERE contact_mech_id = 'THE_VAN_EA' AND contact_mech_type_id = 'EMAIL_ADDRESS' AND info_string = 'info@hermeus.com');

INSERT INTO postal_address (address1, city, contact_mech_id, country_geo_id, postal_code, state_province_geo_id, to_name)
SELECT '1700 N Moore St Suite 1800', 'Arlington', 'THE_VAN_PA', 'USA', '22209', 'VA', 'The Vanguard'
WHERE NOT EXISTS (SELECT 1 FROM postal_address WHERE address1 = '1700 N Moore St Suite 1800' AND city = 'Arlington' AND contact_mech_id = 'THE_VAN_PA' AND country_geo_id = 'USA' AND postal_code = '22209' AND state_province_geo_id = 'VA' AND to_name = 'The Vanguard');

INSERT INTO telecom_number (area_code, contact_mech_id, contact_number, country_code)
SELECT '470', 'THE_VAN_TN', '223-4927', '1'
WHERE NOT EXISTS (SELECT 1 FROM telecom_number WHERE area_code = '470' AND contact_mech_id = 'THE_VAN_TN' AND contact_number = '223-4927' AND country_code = '1');
