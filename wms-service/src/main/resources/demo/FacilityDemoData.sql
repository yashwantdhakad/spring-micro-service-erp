INSERT INTO facility (default_days_to_ship, default_inventory_item_type_id, default_weight_uom_id, description, facility_id, facility_name, facility_type_id, owner_party_id)
SELECT '25', 'NON_SERIAL_INV_ITEM', 'WT_lb', 'The Factory Store', 'FAC_01', 'The Factory', 'WAREHOUSE', 'COMPANY'
WHERE NOT EXISTS (SELECT 1 FROM facility WHERE default_days_to_ship = '25' AND default_inventory_item_type_id = 'NON_SERIAL_INV_ITEM' AND default_weight_uom_id = 'WT_lb' AND description = 'The Factory Store' AND facility_id = 'FAC_01' AND facility_name = 'The Factory' AND facility_type_id = 'WAREHOUSE' AND owner_party_id = 'COMPANY');

INSERT INTO facility_location (facility_id, location_seq_id, location_type_enum_id)
SELECT 'FAC_01', 'INTRANSIT', 'FLT_PICKLOC'
WHERE NOT EXISTS (SELECT 1 FROM facility_location WHERE facility_id = 'FAC_01' AND location_seq_id = 'INTRANSIT' AND location_type_enum_id = 'FLT_PICKLOC');

INSERT INTO facility_contact_mech (contact_mech_id, facility_id, from_date)
SELECT 'WH_PA', 'FAC_01', '2001-05-13 12:00:00.0'
WHERE NOT EXISTS (SELECT 1 FROM facility_contact_mech WHERE contact_mech_id = 'WH_PA' AND facility_id = 'FAC_01' AND from_date = '2001-05-13 12:00:00.0');

INSERT INTO facility_contact_mech (contact_mech_id, facility_id, from_date)
SELECT 'WH_EA', 'FAC_01', '2001-05-13 12:00:00.0'
WHERE NOT EXISTS (SELECT 1 FROM facility_contact_mech WHERE contact_mech_id = 'WH_EA' AND facility_id = 'FAC_01' AND from_date = '2001-05-13 12:00:00.0');

INSERT INTO facility_contact_mech (contact_mech_id, facility_id, from_date)
SELECT 'WH_TN', 'FAC_01', '2001-05-13 12:00:00.0'
WHERE NOT EXISTS (SELECT 1 FROM facility_contact_mech WHERE contact_mech_id = 'WH_TN' AND facility_id = 'FAC_01' AND from_date = '2001-05-13 12:00:00.0');

INSERT INTO facility_contact_mech_purpose (contact_mech_id, contact_mech_purpose_type_id, facility_id, from_date)
SELECT 'WH_PA', 'PRIMARY_LOCATION', 'FAC_01', '2001-05-13 12:00:00.0'
WHERE NOT EXISTS (SELECT 1 FROM facility_contact_mech_purpose WHERE contact_mech_id = 'WH_PA' AND contact_mech_purpose_type_id = 'PRIMARY_LOCATION' AND facility_id = 'FAC_01' AND from_date = '2001-05-13 12:00:00.0');

INSERT INTO facility_contact_mech_purpose (contact_mech_id, contact_mech_purpose_type_id, facility_id, from_date)
SELECT 'WH_PA', 'SHIPPING_LOCATION', 'FAC_01', '2001-05-13 12:00:00.0'
WHERE NOT EXISTS (SELECT 1 FROM facility_contact_mech_purpose WHERE contact_mech_id = 'WH_PA' AND contact_mech_purpose_type_id = 'SHIPPING_LOCATION' AND facility_id = 'FAC_01' AND from_date = '2001-05-13 12:00:00.0');

INSERT INTO facility_contact_mech_purpose (contact_mech_id, contact_mech_purpose_type_id, facility_id, from_date)
SELECT 'WH_PA', 'SHIP_ORIG_LOCATION', 'FAC_01', '2001-05-13 12:00:00.0'
WHERE NOT EXISTS (SELECT 1 FROM facility_contact_mech_purpose WHERE contact_mech_id = 'WH_PA' AND contact_mech_purpose_type_id = 'SHIP_ORIG_LOCATION' AND facility_id = 'FAC_01' AND from_date = '2001-05-13 12:00:00.0');

INSERT INTO facility_contact_mech_purpose (contact_mech_id, contact_mech_purpose_type_id, facility_id, from_date)
SELECT 'WH_EA', 'PRIMARY_EMAIL', 'FAC_01', '2001-05-13 12:00:00.0'
WHERE NOT EXISTS (SELECT 1 FROM facility_contact_mech_purpose WHERE contact_mech_id = 'WH_EA' AND contact_mech_purpose_type_id = 'PRIMARY_EMAIL' AND facility_id = 'FAC_01' AND from_date = '2001-05-13 12:00:00.0');

INSERT INTO facility_contact_mech_purpose (contact_mech_id, contact_mech_purpose_type_id, facility_id, from_date)
SELECT 'WH_TN', 'PHONE_SHIPPING', 'FAC_01', '2001-05-13 12:00:00.0'
WHERE NOT EXISTS (SELECT 1 FROM facility_contact_mech_purpose WHERE contact_mech_id = 'WH_TN' AND contact_mech_purpose_type_id = 'PHONE_SHIPPING' AND facility_id = 'FAC_01' AND from_date = '2001-05-13 12:00:00.0');

INSERT INTO facility_contact_mech_purpose (contact_mech_id, contact_mech_purpose_type_id, facility_id, from_date)
SELECT 'WH_TN', 'PHONE_SHIP_ORIG', 'FAC_01', '2001-05-13 12:00:00.0'
WHERE NOT EXISTS (SELECT 1 FROM facility_contact_mech_purpose WHERE contact_mech_id = 'WH_TN' AND contact_mech_purpose_type_id = 'PHONE_SHIP_ORIG' AND facility_id = 'FAC_01' AND from_date = '2001-05-13 12:00:00.0');

INSERT INTO facility (default_days_to_ship, default_inventory_item_type_id, default_weight_uom_id, description, facility_id, facility_name, facility_type_id, owner_party_id)
SELECT '25', 'NON_SERIAL_INV_ITEM', 'WT_lb', 'Site ND Store', 'SITE_ND', 'Site ND', 'WAREHOUSE', 'COMPANY'
WHERE NOT EXISTS (SELECT 1 FROM facility WHERE default_days_to_ship = '25' AND default_inventory_item_type_id = 'NON_SERIAL_INV_ITEM' AND default_weight_uom_id = 'WT_lb' AND description = 'Site ND Store' AND facility_id = 'SITE_ND' AND facility_name = 'Site ND' AND facility_type_id = 'WAREHOUSE' AND owner_party_id = 'COMPANY');

INSERT INTO facility_location (facility_id, location_seq_id, location_type_enum_id)
SELECT 'SITE_ND', 'INTRANSIT', 'FLT_PICKLOC'
WHERE NOT EXISTS (SELECT 1 FROM facility_location WHERE facility_id = 'SITE_ND' AND location_seq_id = 'INTRANSIT' AND location_type_enum_id = 'FLT_PICKLOC');

INSERT INTO facility_contact_mech (contact_mech_id, facility_id, from_date)
SELECT 'WH_PA_1', 'SITE_ND', '2001-05-13 12:00:00.0'
WHERE NOT EXISTS (SELECT 1 FROM facility_contact_mech WHERE contact_mech_id = 'WH_PA_1' AND facility_id = 'SITE_ND' AND from_date = '2001-05-13 12:00:00.0');

INSERT INTO facility_contact_mech (contact_mech_id, facility_id, from_date)
SELECT 'WH_EA_1', 'SITE_ND', '2001-05-13 12:00:00.0'
WHERE NOT EXISTS (SELECT 1 FROM facility_contact_mech WHERE contact_mech_id = 'WH_EA_1' AND facility_id = 'SITE_ND' AND from_date = '2001-05-13 12:00:00.0');

INSERT INTO facility_contact_mech (contact_mech_id, facility_id, from_date)
SELECT 'WH_TN_1', 'SITE_ND', '2001-05-13 12:00:00.0'
WHERE NOT EXISTS (SELECT 1 FROM facility_contact_mech WHERE contact_mech_id = 'WH_TN_1' AND facility_id = 'SITE_ND' AND from_date = '2001-05-13 12:00:00.0');

INSERT INTO facility_contact_mech_purpose (contact_mech_id, contact_mech_purpose_type_id, facility_id, from_date)
SELECT 'WH_PA_1', 'PRIMARY_LOCATION', 'SITE_ND', '2001-05-13 12:00:00.0'
WHERE NOT EXISTS (SELECT 1 FROM facility_contact_mech_purpose WHERE contact_mech_id = 'WH_PA_1' AND contact_mech_purpose_type_id = 'PRIMARY_LOCATION' AND facility_id = 'SITE_ND' AND from_date = '2001-05-13 12:00:00.0');

INSERT INTO facility_contact_mech_purpose (contact_mech_id, contact_mech_purpose_type_id, facility_id, from_date)
SELECT 'WH_PA_1', 'SHIPPING_LOCATION', 'SITE_ND', '2001-05-13 12:00:00.0'
WHERE NOT EXISTS (SELECT 1 FROM facility_contact_mech_purpose WHERE contact_mech_id = 'WH_PA_1' AND contact_mech_purpose_type_id = 'SHIPPING_LOCATION' AND facility_id = 'SITE_ND' AND from_date = '2001-05-13 12:00:00.0');

INSERT INTO facility_contact_mech_purpose (contact_mech_id, contact_mech_purpose_type_id, facility_id, from_date)
SELECT 'WH_PA_1', 'SHIP_ORIG_LOCATION', 'SITE_ND', '2001-05-13 12:00:00.0'
WHERE NOT EXISTS (SELECT 1 FROM facility_contact_mech_purpose WHERE contact_mech_id = 'WH_PA_1' AND contact_mech_purpose_type_id = 'SHIP_ORIG_LOCATION' AND facility_id = 'SITE_ND' AND from_date = '2001-05-13 12:00:00.0');

INSERT INTO facility_contact_mech_purpose (contact_mech_id, contact_mech_purpose_type_id, facility_id, from_date)
SELECT 'WH_EA_1', 'PRIMARY_EMAIL', 'SITE_ND', '2001-05-13 12:00:00.0'
WHERE NOT EXISTS (SELECT 1 FROM facility_contact_mech_purpose WHERE contact_mech_id = 'WH_EA_1' AND contact_mech_purpose_type_id = 'PRIMARY_EMAIL' AND facility_id = 'SITE_ND' AND from_date = '2001-05-13 12:00:00.0');

INSERT INTO facility_contact_mech_purpose (contact_mech_id, contact_mech_purpose_type_id, facility_id, from_date)
SELECT 'WH_TN_1', 'PHONE_SHIPPING', 'SITE_ND', '2001-05-13 12:00:00.0'
WHERE NOT EXISTS (SELECT 1 FROM facility_contact_mech_purpose WHERE contact_mech_id = 'WH_TN_1' AND contact_mech_purpose_type_id = 'PHONE_SHIPPING' AND facility_id = 'SITE_ND' AND from_date = '2001-05-13 12:00:00.0');

INSERT INTO facility_contact_mech_purpose (contact_mech_id, contact_mech_purpose_type_id, facility_id, from_date)
SELECT 'WH_TN_1', 'PHONE_SHIP_ORIG', 'SITE_ND', '2001-05-13 12:00:00.0'
WHERE NOT EXISTS (SELECT 1 FROM facility_contact_mech_purpose WHERE contact_mech_id = 'WH_TN_1' AND contact_mech_purpose_type_id = 'PHONE_SHIP_ORIG' AND facility_id = 'SITE_ND' AND from_date = '2001-05-13 12:00:00.0');

INSERT INTO facility (default_days_to_ship, default_inventory_item_type_id, default_weight_uom_id, description, facility_id, facility_name, facility_type_id, owner_party_id)
SELECT '25', 'NON_SERIAL_INV_ITEM', 'WT_lb', 'Site 27 Store', 'SITE_27', 'Site 27', 'WAREHOUSE', 'COMPANY'
WHERE NOT EXISTS (SELECT 1 FROM facility WHERE default_days_to_ship = '25' AND default_inventory_item_type_id = 'NON_SERIAL_INV_ITEM' AND default_weight_uom_id = 'WT_lb' AND description = 'Site 27 Store' AND facility_id = 'SITE_27' AND facility_name = 'Site 27' AND facility_type_id = 'WAREHOUSE' AND owner_party_id = 'COMPANY');

INSERT INTO facility_location (facility_id, location_seq_id, location_type_enum_id)
SELECT 'SITE_27', 'INTRANSIT', 'FLT_PICKLOC'
WHERE NOT EXISTS (SELECT 1 FROM facility_location WHERE facility_id = 'SITE_27' AND location_seq_id = 'INTRANSIT' AND location_type_enum_id = 'FLT_PICKLOC');

INSERT INTO facility_contact_mech (contact_mech_id, facility_id, from_date)
SELECT 'WH_PA_2', 'SITE_27', '2001-05-13 12:00:00.0'
WHERE NOT EXISTS (SELECT 1 FROM facility_contact_mech WHERE contact_mech_id = 'WH_PA_2' AND facility_id = 'SITE_27' AND from_date = '2001-05-13 12:00:00.0');

INSERT INTO facility_contact_mech (contact_mech_id, facility_id, from_date)
SELECT 'WH_EA_2', 'SITE_27', '2001-05-13 12:00:00.0'
WHERE NOT EXISTS (SELECT 1 FROM facility_contact_mech WHERE contact_mech_id = 'WH_EA_2' AND facility_id = 'SITE_27' AND from_date = '2001-05-13 12:00:00.0');

INSERT INTO facility_contact_mech (contact_mech_id, facility_id, from_date)
SELECT 'WH_TN_2', 'SITE_27', '2001-05-13 12:00:00.0'
WHERE NOT EXISTS (SELECT 1 FROM facility_contact_mech WHERE contact_mech_id = 'WH_TN_2' AND facility_id = 'SITE_27' AND from_date = '2001-05-13 12:00:00.0');

INSERT INTO facility_contact_mech_purpose (contact_mech_id, contact_mech_purpose_type_id, facility_id, from_date)
SELECT 'WH_PA_2', 'PRIMARY_LOCATION', 'SITE_27', '2001-05-13 12:00:00.0'
WHERE NOT EXISTS (SELECT 1 FROM facility_contact_mech_purpose WHERE contact_mech_id = 'WH_PA_2' AND contact_mech_purpose_type_id = 'PRIMARY_LOCATION' AND facility_id = 'SITE_27' AND from_date = '2001-05-13 12:00:00.0');

INSERT INTO facility_contact_mech_purpose (contact_mech_id, contact_mech_purpose_type_id, facility_id, from_date)
SELECT 'WH_PA_2', 'SHIPPING_LOCATION', 'SITE_27', '2001-05-13 12:00:00.0'
WHERE NOT EXISTS (SELECT 1 FROM facility_contact_mech_purpose WHERE contact_mech_id = 'WH_PA_2' AND contact_mech_purpose_type_id = 'SHIPPING_LOCATION' AND facility_id = 'SITE_27' AND from_date = '2001-05-13 12:00:00.0');

INSERT INTO facility_contact_mech_purpose (contact_mech_id, contact_mech_purpose_type_id, facility_id, from_date)
SELECT 'WH_PA_2', 'SHIP_ORIG_LOCATION', 'SITE_27', '2001-05-13 12:00:00.0'
WHERE NOT EXISTS (SELECT 1 FROM facility_contact_mech_purpose WHERE contact_mech_id = 'WH_PA_2' AND contact_mech_purpose_type_id = 'SHIP_ORIG_LOCATION' AND facility_id = 'SITE_27' AND from_date = '2001-05-13 12:00:00.0');

INSERT INTO facility_contact_mech_purpose (contact_mech_id, contact_mech_purpose_type_id, facility_id, from_date)
SELECT 'WH_EA_2', 'PRIMARY_EMAIL', 'SITE_27', '2001-05-13 12:00:00.0'
WHERE NOT EXISTS (SELECT 1 FROM facility_contact_mech_purpose WHERE contact_mech_id = 'WH_EA_2' AND contact_mech_purpose_type_id = 'PRIMARY_EMAIL' AND facility_id = 'SITE_27' AND from_date = '2001-05-13 12:00:00.0');

INSERT INTO facility_contact_mech_purpose (contact_mech_id, contact_mech_purpose_type_id, facility_id, from_date)
SELECT 'WH_TN_2', 'PHONE_SHIPPING', 'SITE_27', '2001-05-13 12:00:00.0'
WHERE NOT EXISTS (SELECT 1 FROM facility_contact_mech_purpose WHERE contact_mech_id = 'WH_TN_2' AND contact_mech_purpose_type_id = 'PHONE_SHIPPING' AND facility_id = 'SITE_27' AND from_date = '2001-05-13 12:00:00.0');

INSERT INTO facility_contact_mech_purpose (contact_mech_id, contact_mech_purpose_type_id, facility_id, from_date)
SELECT 'WH_TN_2', 'PHONE_SHIP_ORIG', 'SITE_27', '2001-05-13 12:00:00.0'
WHERE NOT EXISTS (SELECT 1 FROM facility_contact_mech_purpose WHERE contact_mech_id = 'WH_TN_2' AND contact_mech_purpose_type_id = 'PHONE_SHIP_ORIG' AND facility_id = 'SITE_27' AND from_date = '2001-05-13 12:00:00.0');

INSERT INTO facility (default_days_to_ship, default_inventory_item_type_id, default_weight_uom_id, description, facility_id, facility_name, facility_type_id, owner_party_id)
SELECT '25', 'NON_SERIAL_INV_ITEM', 'WT_lb', 'The Shop Store', 'THE_SHOP', 'The Shop', 'WAREHOUSE', 'COMPANY'
WHERE NOT EXISTS (SELECT 1 FROM facility WHERE default_days_to_ship = '25' AND default_inventory_item_type_id = 'NON_SERIAL_INV_ITEM' AND default_weight_uom_id = 'WT_lb' AND description = 'The Shop Store' AND facility_id = 'THE_SHOP' AND facility_name = 'The Shop' AND facility_type_id = 'WAREHOUSE' AND owner_party_id = 'COMPANY');

INSERT INTO facility_location (facility_id, location_seq_id, location_type_enum_id)
SELECT 'THE_SHOP', 'INTRANSIT', 'FLT_PICKLOC'
WHERE NOT EXISTS (SELECT 1 FROM facility_location WHERE facility_id = 'THE_SHOP' AND location_seq_id = 'INTRANSIT' AND location_type_enum_id = 'FLT_PICKLOC');

INSERT INTO facility_contact_mech (contact_mech_id, facility_id, from_date)
SELECT 'WH_PA_3', 'THE_SHOP', '2001-05-13 12:00:00.0'
WHERE NOT EXISTS (SELECT 1 FROM facility_contact_mech WHERE contact_mech_id = 'WH_PA_3' AND facility_id = 'THE_SHOP' AND from_date = '2001-05-13 12:00:00.0');

INSERT INTO facility_contact_mech (contact_mech_id, facility_id, from_date)
SELECT 'WH_EA_3', 'THE_SHOP', '2001-05-13 12:00:00.0'
WHERE NOT EXISTS (SELECT 1 FROM facility_contact_mech WHERE contact_mech_id = 'WH_EA_3' AND facility_id = 'THE_SHOP' AND from_date = '2001-05-13 12:00:00.0');

INSERT INTO facility_contact_mech (contact_mech_id, facility_id, from_date)
SELECT 'WH_TN_3', 'THE_SHOP', '2001-05-13 12:00:00.0'
WHERE NOT EXISTS (SELECT 1 FROM facility_contact_mech WHERE contact_mech_id = 'WH_TN_3' AND facility_id = 'THE_SHOP' AND from_date = '2001-05-13 12:00:00.0');

INSERT INTO facility_contact_mech_purpose (contact_mech_id, contact_mech_purpose_type_id, facility_id, from_date)
SELECT 'WH_PA_3', 'PRIMARY_LOCATION', 'THE_SHOP', '2001-05-13 12:00:00.0'
WHERE NOT EXISTS (SELECT 1 FROM facility_contact_mech_purpose WHERE contact_mech_id = 'WH_PA_3' AND contact_mech_purpose_type_id = 'PRIMARY_LOCATION' AND facility_id = 'THE_SHOP' AND from_date = '2001-05-13 12:00:00.0');

INSERT INTO facility_contact_mech_purpose (contact_mech_id, contact_mech_purpose_type_id, facility_id, from_date)
SELECT 'WH_PA_3', 'SHIPPING_LOCATION', 'THE_SHOP', '2001-05-13 12:00:00.0'
WHERE NOT EXISTS (SELECT 1 FROM facility_contact_mech_purpose WHERE contact_mech_id = 'WH_PA_3' AND contact_mech_purpose_type_id = 'SHIPPING_LOCATION' AND facility_id = 'THE_SHOP' AND from_date = '2001-05-13 12:00:00.0');

INSERT INTO facility_contact_mech_purpose (contact_mech_id, contact_mech_purpose_type_id, facility_id, from_date)
SELECT 'WH_PA_3', 'SHIP_ORIG_LOCATION', 'THE_SHOP', '2001-05-13 12:00:00.0'
WHERE NOT EXISTS (SELECT 1 FROM facility_contact_mech_purpose WHERE contact_mech_id = 'WH_PA_3' AND contact_mech_purpose_type_id = 'SHIP_ORIG_LOCATION' AND facility_id = 'THE_SHOP' AND from_date = '2001-05-13 12:00:00.0');

INSERT INTO facility_contact_mech_purpose (contact_mech_id, contact_mech_purpose_type_id, facility_id, from_date)
SELECT 'WH_EA_3', 'PRIMARY_EMAIL', 'THE_SHOP', '2001-05-13 12:00:00.0'
WHERE NOT EXISTS (SELECT 1 FROM facility_contact_mech_purpose WHERE contact_mech_id = 'WH_EA_3' AND contact_mech_purpose_type_id = 'PRIMARY_EMAIL' AND facility_id = 'THE_SHOP' AND from_date = '2001-05-13 12:00:00.0');

INSERT INTO facility_contact_mech_purpose (contact_mech_id, contact_mech_purpose_type_id, facility_id, from_date)
SELECT 'WH_TN_3', 'PHONE_SHIPPING', 'THE_SHOP', '2001-05-13 12:00:00.0'
WHERE NOT EXISTS (SELECT 1 FROM facility_contact_mech_purpose WHERE contact_mech_id = 'WH_TN_3' AND contact_mech_purpose_type_id = 'PHONE_SHIPPING' AND facility_id = 'THE_SHOP' AND from_date = '2001-05-13 12:00:00.0');

INSERT INTO facility_contact_mech_purpose (contact_mech_id, contact_mech_purpose_type_id, facility_id, from_date)
SELECT 'WH_TN_3', 'PHONE_SHIP_ORIG', 'THE_SHOP', '2001-05-13 12:00:00.0'
WHERE NOT EXISTS (SELECT 1 FROM facility_contact_mech_purpose WHERE contact_mech_id = 'WH_TN_3' AND contact_mech_purpose_type_id = 'PHONE_SHIP_ORIG' AND facility_id = 'THE_SHOP' AND from_date = '2001-05-13 12:00:00.0');

INSERT INTO facility (default_days_to_ship, default_inventory_item_type_id, default_weight_uom_id, description, facility_id, facility_name, facility_type_id, owner_party_id)
SELECT '25', 'NON_SERIAL_INV_ITEM', 'WT_lb', 'The Vanguard', 'THE_VAN', 'The Vanguard', 'WAREHOUSE', 'COMPANY'
WHERE NOT EXISTS (SELECT 1 FROM facility WHERE default_days_to_ship = '25' AND default_inventory_item_type_id = 'NON_SERIAL_INV_ITEM' AND default_weight_uom_id = 'WT_lb' AND description = 'The Vanguard' AND facility_id = 'THE_VAN' AND facility_name = 'The Vanguard' AND facility_type_id = 'WAREHOUSE' AND owner_party_id = 'COMPANY');

INSERT INTO facility_location (facility_id, location_seq_id, location_type_enum_id)
SELECT 'THE_VAN', 'INTRANSIT', 'FLT_PICKLOC'
WHERE NOT EXISTS (SELECT 1 FROM facility_location WHERE facility_id = 'THE_VAN' AND location_seq_id = 'INTRANSIT' AND location_type_enum_id = 'FLT_PICKLOC');

INSERT INTO facility_contact_mech (contact_mech_id, facility_id, from_date)
SELECT 'THE_VAN_PA', 'THE_VAN', '2001-05-13 12:00:00.0'
WHERE NOT EXISTS (SELECT 1 FROM facility_contact_mech WHERE contact_mech_id = 'THE_VAN_PA' AND facility_id = 'THE_VAN' AND from_date = '2001-05-13 12:00:00.0');

INSERT INTO facility_contact_mech (contact_mech_id, facility_id, from_date)
SELECT 'THE_VAN_EA', 'THE_VAN', '2001-05-13 12:00:00.0'
WHERE NOT EXISTS (SELECT 1 FROM facility_contact_mech WHERE contact_mech_id = 'THE_VAN_EA' AND facility_id = 'THE_VAN' AND from_date = '2001-05-13 12:00:00.0');

INSERT INTO facility_contact_mech (contact_mech_id, facility_id, from_date)
SELECT 'THE_VAN_TN', 'THE_VAN', '2001-05-13 12:00:00.0'
WHERE NOT EXISTS (SELECT 1 FROM facility_contact_mech WHERE contact_mech_id = 'THE_VAN_TN' AND facility_id = 'THE_VAN' AND from_date = '2001-05-13 12:00:00.0');

INSERT INTO facility_contact_mech_purpose (contact_mech_id, contact_mech_purpose_type_id, facility_id, from_date)
SELECT 'THE_VAN_PA', 'PRIMARY_LOCATION', 'THE_VAN', '2001-05-13 12:00:00.0'
WHERE NOT EXISTS (SELECT 1 FROM facility_contact_mech_purpose WHERE contact_mech_id = 'THE_VAN_PA' AND contact_mech_purpose_type_id = 'PRIMARY_LOCATION' AND facility_id = 'THE_VAN' AND from_date = '2001-05-13 12:00:00.0');

INSERT INTO facility_contact_mech_purpose (contact_mech_id, contact_mech_purpose_type_id, facility_id, from_date)
SELECT 'THE_VAN_PA', 'SHIPPING_LOCATION', 'THE_VAN', '2001-05-13 12:00:00.0'
WHERE NOT EXISTS (SELECT 1 FROM facility_contact_mech_purpose WHERE contact_mech_id = 'THE_VAN_PA' AND contact_mech_purpose_type_id = 'SHIPPING_LOCATION' AND facility_id = 'THE_VAN' AND from_date = '2001-05-13 12:00:00.0');

INSERT INTO facility_contact_mech_purpose (contact_mech_id, contact_mech_purpose_type_id, facility_id, from_date)
SELECT 'THE_VAN_PA', 'SHIP_ORIG_LOCATION', 'THE_VAN', '2001-05-13 12:00:00.0'
WHERE NOT EXISTS (SELECT 1 FROM facility_contact_mech_purpose WHERE contact_mech_id = 'THE_VAN_PA' AND contact_mech_purpose_type_id = 'SHIP_ORIG_LOCATION' AND facility_id = 'THE_VAN' AND from_date = '2001-05-13 12:00:00.0');

INSERT INTO facility_contact_mech_purpose (contact_mech_id, contact_mech_purpose_type_id, facility_id, from_date)
SELECT 'THE_VAN_EA', 'PRIMARY_EMAIL', 'THE_VAN', '2001-05-13 12:00:00.0'
WHERE NOT EXISTS (SELECT 1 FROM facility_contact_mech_purpose WHERE contact_mech_id = 'THE_VAN_EA' AND contact_mech_purpose_type_id = 'PRIMARY_EMAIL' AND facility_id = 'THE_VAN' AND from_date = '2001-05-13 12:00:00.0');

INSERT INTO facility_contact_mech_purpose (contact_mech_id, contact_mech_purpose_type_id, facility_id, from_date)
SELECT 'THE_VAN_TN', 'PHONE_SHIPPING', 'THE_VAN', '2001-05-13 12:00:00.0'
WHERE NOT EXISTS (SELECT 1 FROM facility_contact_mech_purpose WHERE contact_mech_id = 'THE_VAN_TN' AND contact_mech_purpose_type_id = 'PHONE_SHIPPING' AND facility_id = 'THE_VAN' AND from_date = '2001-05-13 12:00:00.0');

INSERT INTO facility_contact_mech_purpose (contact_mech_id, contact_mech_purpose_type_id, facility_id, from_date)
SELECT 'THE_VAN_TN', 'PHONE_SHIP_ORIG', 'THE_VAN', '2001-05-13 12:00:00.0'
WHERE NOT EXISTS (SELECT 1 FROM facility_contact_mech_purpose WHERE contact_mech_id = 'THE_VAN_TN' AND contact_mech_purpose_type_id = 'PHONE_SHIP_ORIG' AND facility_id = 'THE_VAN' AND from_date = '2001-05-13 12:00:00.0');

INSERT INTO product_store_facility (facility_id, from_date, product_store_id, sequence_num)
SELECT 'FAC_01', '2018-01-01 12:00:00.000', 'STORE', '1'
WHERE NOT EXISTS (SELECT 1 FROM product_store_facility WHERE facility_id = 'FAC_01' AND from_date = '2018-01-01 12:00:00.000' AND product_store_id = 'STORE' AND sequence_num = '1');

INSERT INTO product_store_facility (facility_id, from_date, product_store_id, sequence_num)
SELECT 'SITE_27', '2018-01-01 12:00:00.000', 'STORE', '2'
WHERE NOT EXISTS (SELECT 1 FROM product_store_facility WHERE facility_id = 'SITE_27' AND from_date = '2018-01-01 12:00:00.000' AND product_store_id = 'STORE' AND sequence_num = '2');

INSERT INTO product_store_facility (facility_id, from_date, product_store_id, sequence_num)
SELECT 'SITE_ND', '2018-01-01 12:00:00.000', 'STORE', '3'
WHERE NOT EXISTS (SELECT 1 FROM product_store_facility WHERE facility_id = 'SITE_ND' AND from_date = '2018-01-01 12:00:00.000' AND product_store_id = 'STORE' AND sequence_num = '3');

INSERT INTO product_store_facility (facility_id, from_date, product_store_id, sequence_num)
SELECT 'THE_SHOP', '2018-01-01 12:00:00.000', 'STORE', '4'
WHERE NOT EXISTS (SELECT 1 FROM product_store_facility WHERE facility_id = 'THE_SHOP' AND from_date = '2018-01-01 12:00:00.000' AND product_store_id = 'STORE' AND sequence_num = '4');

INSERT INTO product_store_facility (facility_id, from_date, product_store_id, sequence_num)
SELECT 'THE_VAN', '2018-01-01 12:00:00.000', 'STORE', '5'
WHERE NOT EXISTS (SELECT 1 FROM product_store_facility WHERE facility_id = 'THE_VAN' AND from_date = '2018-01-01 12:00:00.000' AND product_store_id = 'STORE' AND sequence_num = '5');

INSERT INTO facility_location (area_id, facility_id, location_seq_id, location_type_enum_id)
SELECT '01-HL', 'FAC_01', 'WH_LOC_HL1', 'FLT_HOLDLOC'
WHERE NOT EXISTS (SELECT 1 FROM facility_location WHERE area_id = '01-HL' AND facility_id = 'FAC_01' AND location_seq_id = 'WH_LOC_HL1' AND location_type_enum_id = 'FLT_HOLDLOC');

INSERT INTO facility_location (area_id, facility_id, location_seq_id, location_type_enum_id)
SELECT '02-HL', 'FAC_01', 'WH_LOC_HL2', 'FLT_HOLDLOC'
WHERE NOT EXISTS (SELECT 1 FROM facility_location WHERE area_id = '02-HL' AND facility_id = 'FAC_01' AND location_seq_id = 'WH_LOC_HL2' AND location_type_enum_id = 'FLT_HOLDLOC');
