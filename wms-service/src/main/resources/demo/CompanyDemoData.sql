INSERT INTO product_store (allow_password, auth_declined_message, auth_error_message, auth_fraud_message, auto_approve_invoice, auto_approve_order, auto_save_cart, balance_res_on_order_creation, check_inventory, company_name, default_currency_uom_id, default_locale_string, default_sales_channel_enum_id, digital_item_approved_status, explode_order_items, header_approved_status, header_cancel_status, header_declined_status, inventory_facility_id, item_approved_status, item_cancel_status, item_declined_status, one_inventory_facility, order_number_prefix, pay_to_party_id, primary_store_group_id, prod_search_exclude_variants, product_store_id, prorate_shipping, prorate_taxes, req_return_inventory_receive, require_inventory, reserve_inventory, reserve_order_enum_id, retry_failed_auths, ship_if_capture_fails, store_credit_valid_days, store_name, subtitle, title, use_primary_email_username, view_cart_on_add)
SELECT 'Y', 'There has been a problem with your method of payment. Please try a different method or call customer service.', 'Problem connecting to payment processor;

we will continue to retry and notify you by email.', 'Your order has been rejected and your account has been disabled due to fraud.', 'Y', 'N', 'Y', 'N', 'N', 'Hermeus', 'USD', 'en_IN', 'WEB_SALES_CHANNEL', 'ITEM_APPROVED', 'N', 'ORDER_APPROVED', 'ORDER_CANCELLED', 'ORDER_REJECTED', 'FAC_01', 'ITEM_APPROVED', 'ITEM_CANCELLED', 'ITEM_REJECTED', 'N', 'H', 'COMPANY', 'STORE_GROUP', 'Y', 'STORE', 'Y', 'Y', 'N', 'N', 'Y', 'INVRO_FIFO_REC', 'Y', 'N', '90', 'Hermeus', 'Hermeus', 'Hermeus', 'Y', 'N'
WHERE NOT EXISTS (SELECT 1 FROM product_store WHERE allow_password = 'Y' AND auth_declined_message = 'There has been a problem with your method of payment. Please try a different method or call customer service.' AND auth_error_message = 'Problem connecting to payment processor;

we will continue to retry and notify you by email.' AND auth_fraud_message = 'Your order has been rejected and your account has been disabled due to fraud.' AND auto_approve_invoice = 'Y' AND auto_approve_order = 'N' AND auto_save_cart = 'Y' AND balance_res_on_order_creation = 'N' AND check_inventory = 'N' AND company_name = 'Hermeus' AND default_currency_uom_id = 'USD' AND default_locale_string = 'en_IN' AND default_sales_channel_enum_id = 'WEB_SALES_CHANNEL' AND digital_item_approved_status = 'ITEM_APPROVED' AND explode_order_items = 'N' AND header_approved_status = 'ORDER_APPROVED' AND header_cancel_status = 'ORDER_CANCELLED' AND header_declined_status = 'ORDER_REJECTED' AND inventory_facility_id = 'FAC_01' AND item_approved_status = 'ITEM_APPROVED' AND item_cancel_status = 'ITEM_CANCELLED' AND item_declined_status = 'ITEM_REJECTED' AND one_inventory_facility = 'N' AND order_number_prefix = 'H' AND pay_to_party_id = 'COMPANY' AND primary_store_group_id = 'STORE_GROUP' AND prod_search_exclude_variants = 'Y' AND product_store_id = 'STORE' AND prorate_shipping = 'Y' AND prorate_taxes = 'Y' AND req_return_inventory_receive = 'N' AND require_inventory = 'N' AND reserve_inventory = 'Y' AND reserve_order_enum_id = 'INVRO_FIFO_REC' AND retry_failed_auths = 'Y' AND ship_if_capture_fails = 'N' AND store_credit_valid_days = '90' AND store_name = 'Hermeus' AND subtitle = 'Hermeus' AND title = 'Hermeus' AND use_primary_email_username = 'Y' AND view_cart_on_add = 'N');

INSERT INTO prod_catalog (catalog_name, prod_catalog_id, use_quick_add)
SELECT 'Hermeus Catalog', 'CATALOG', 'Y'
WHERE NOT EXISTS (SELECT 1 FROM prod_catalog WHERE catalog_name = 'Hermeus Catalog' AND prod_catalog_id = 'CATALOG' AND use_quick_add = 'Y');

INSERT INTO web_site (allow_product_store_change, is_default, product_store_id)
SELECT 'N', 'Y', 'STORE'
WHERE NOT EXISTS (SELECT 1 FROM web_site WHERE allow_product_store_change = 'N' AND is_default = 'Y' AND product_store_id = 'STORE');

INSERT INTO product_store_catalog (from_date, prod_catalog_id, product_store_id, sequence_num)
SELECT '2018-01-01 12:00:00.000', 'CATALOG', 'STORE', '2'
WHERE NOT EXISTS (SELECT 1 FROM product_store_catalog WHERE from_date = '2018-01-01 12:00:00.000' AND prod_catalog_id = 'CATALOG' AND product_store_id = 'STORE' AND sequence_num = '2');

INSERT INTO content (content_id, content_name, content_type_id, description, status_id)
SELECT 'PT_TRUNK', 'Webstore Site''s Publish Point', 'WEB_SITE_PUB_PT', 'Root publish point for WebStore website', 'CTNT_PUBLISHED'
WHERE NOT EXISTS (SELECT 1 FROM content WHERE content_id = 'PT_TRUNK' AND content_name = 'Webstore Site''s Publish Point' AND content_type_id = 'WEB_SITE_PUB_PT' AND description = 'Root publish point for WebStore website' AND status_id = 'CTNT_PUBLISHED');

INSERT INTO web_site_content (content_id, from_date, web_site_content_type_id, web_site_id)
SELECT 'PT_TRUNK', '2018-01-01 12:00:00.000', 'PUBLISH_POINT', 'WEBSTORE'
WHERE NOT EXISTS (SELECT 1 FROM web_site_content WHERE content_id = 'PT_TRUNK' AND from_date = '2018-01-01 12:00:00.000' AND web_site_content_type_id = 'PUBLISH_POINT' AND web_site_id = 'WEBSTORE');

INSERT INTO content (content_id, content_name, content_type_id, status_id)
SELECT 'KYWRD_SEARCH', 'Content for category decorator', 'DOCUMENT', 'CTNT_PUBLISHED'
WHERE NOT EXISTS (SELECT 1 FROM content WHERE content_id = 'KYWRD_SEARCH' AND content_name = 'Content for category decorator' AND content_type_id = 'DOCUMENT' AND status_id = 'CTNT_PUBLISHED');

INSERT INTO web_site_content (content_id, from_date, web_site_content_type_id, web_site_id)
SELECT 'KYWRD_SEARCH', '2018-01-01 12:00:00.000', 'KYWRD_SEARCH', 'WEBSTORE'
WHERE NOT EXISTS (SELECT 1 FROM web_site_content WHERE content_id = 'KYWRD_SEARCH' AND from_date = '2018-01-01 12:00:00.000' AND web_site_content_type_id = 'KYWRD_SEARCH' AND web_site_id = 'WEBSTORE');

INSERT INTO product_store_shipment_meth (party_id, product_store_id, product_store_ship_meth_id, role_type_id, shipment_method_type_id)
SELECT '_NA_', 'STORE', 'SHIP_METH', 'CARRIER', 'LOCAL_DELIVERY'
WHERE NOT EXISTS (SELECT 1 FROM product_store_shipment_meth WHERE party_id = '_NA_' AND product_store_id = 'STORE' AND product_store_ship_meth_id = 'SHIP_METH' AND role_type_id = 'CARRIER' AND shipment_method_type_id = 'LOCAL_DELIVERY');

INSERT INTO carrier_shipment_method (party_id, role_type_id, sequence_number, shipment_method_type_id)
SELECT '_NA_', 'CARRIER', '1', 'LOCAL_DELIVERY'
WHERE NOT EXISTS (SELECT 1 FROM carrier_shipment_method WHERE party_id = '_NA_' AND role_type_id = 'CARRIER' AND sequence_number = '1' AND shipment_method_type_id = 'LOCAL_DELIVERY');

INSERT INTO product_store_email_setting (email_type, from_address, product_store_id, subject, xslfo_attach_screen_location)
SELECT 'PRDS_ODR_COMPLETE', 'no-reply@hermeus.com', 'STORE', 'Order Complete Notification for Order #${orderId}', 'component://hwmapps/widget/customerservice/OrderPrintScreens.xml#OrderPDF'
WHERE NOT EXISTS (SELECT 1 FROM product_store_email_setting WHERE email_type = 'PRDS_ODR_COMPLETE' AND from_address = 'no-reply@hermeus.com' AND product_store_id = 'STORE' AND subject = 'Order Complete Notification for Order #${orderId}' AND xslfo_attach_screen_location = 'component://hwmapps/widget/customerservice/OrderPrintScreens.xml#OrderPDF');
