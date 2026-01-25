INSERT INTO enumeration_type (description, enum_type_id, has_table)
SELECT 'Order Sales Channel', 'ORDER_SALES_CHANNEL', 0
WHERE NOT EXISTS (SELECT 1 FROM enumeration_type WHERE description = 'Order Sales Channel' AND enum_type_id = 'ORDER_SALES_CHANNEL' AND has_table = 0);

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Web Channel', 'WEB_CHANNEL', 'WEB_SALES_CHANNEL', 'ORDER_SALES_CHANNEL', '01'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Web Channel' AND enum_code = 'WEB_CHANNEL' AND enum_id = 'WEB_SALES_CHANNEL' AND enum_type_id = 'ORDER_SALES_CHANNEL' AND sequence_id = '01');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Fax Channel', 'FAX_CHANNEL', 'FAX_SALES_CHANNEL', 'ORDER_SALES_CHANNEL', '03'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Fax Channel' AND enum_code = 'FAX_CHANNEL' AND enum_id = 'FAX_SALES_CHANNEL' AND enum_type_id = 'ORDER_SALES_CHANNEL' AND sequence_id = '03');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Phone Channel', 'PHONE_CHANNEL', 'PHONE_SALES_CHANNEL', 'ORDER_SALES_CHANNEL', '04'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Phone Channel' AND enum_code = 'PHONE_CHANNEL' AND enum_id = 'PHONE_SALES_CHANNEL' AND enum_type_id = 'ORDER_SALES_CHANNEL' AND sequence_id = '04');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'E-Mail Channel', 'EMAIL_CHANNEL', 'EMAIL_SALES_CHANNEL', 'ORDER_SALES_CHANNEL', '05'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'E-Mail Channel' AND enum_code = 'EMAIL_CHANNEL' AND enum_id = 'EMAIL_SALES_CHANNEL' AND enum_type_id = 'ORDER_SALES_CHANNEL' AND sequence_id = '05');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Snail Mail Channel', 'SNAIL_CHANNEL', 'SNAIL_SALES_CHANNEL', 'ORDER_SALES_CHANNEL', '06'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Snail Mail Channel' AND enum_code = 'SNAIL_CHANNEL' AND enum_id = 'SNAIL_SALES_CHANNEL' AND enum_type_id = 'ORDER_SALES_CHANNEL' AND sequence_id = '06');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Affiliate Channel', 'AFFIL_CHANNEL', 'AFFIL_SALES_CHANNEL', 'ORDER_SALES_CHANNEL', '07'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Affiliate Channel' AND enum_code = 'AFFIL_CHANNEL' AND enum_id = 'AFFIL_SALES_CHANNEL' AND enum_type_id = 'ORDER_SALES_CHANNEL' AND sequence_id = '07');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'eBay Channel', 'EBAY_CHANNEL', 'EBAY_SALES_CHANNEL', 'ORDER_SALES_CHANNEL', '08'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'eBay Channel' AND enum_code = 'EBAY_CHANNEL' AND enum_id = 'EBAY_SALES_CHANNEL' AND enum_type_id = 'ORDER_SALES_CHANNEL' AND sequence_id = '08');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Unknown Channel', 'UNKOWN_CHANNEL', 'UNKNWN_SALES_CHANNEL', 'ORDER_SALES_CHANNEL', '99'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Unknown Channel' AND enum_code = 'UNKOWN_CHANNEL' AND enum_id = 'UNKNWN_SALES_CHANNEL' AND enum_type_id = 'ORDER_SALES_CHANNEL' AND sequence_id = '99');

INSERT INTO enumeration_type (description, enum_type_id, has_table)
SELECT 'Order Item Change Type', 'ODR_ITM_CHANGE_TYPE', 0
WHERE NOT EXISTS (SELECT 1 FROM enumeration_type WHERE description = 'Order Item Change Type' AND enum_type_id = 'ODR_ITM_CHANGE_TYPE' AND has_table = 0);

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Order Item Update', 'ITM_UPDATE', 'ODR_ITM_UPDATE', 'ODR_ITM_CHANGE_TYPE', '01'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Order Item Update' AND enum_code = 'ITM_UPDATE' AND enum_id = 'ODR_ITM_UPDATE' AND enum_type_id = 'ODR_ITM_CHANGE_TYPE' AND sequence_id = '01');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Order Item Cancel', 'ITM_CANCEL', 'ODR_ITM_CANCEL', 'ODR_ITM_CHANGE_TYPE', '02'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Order Item Cancel' AND enum_code = 'ITM_CANCEL' AND enum_id = 'ODR_ITM_CANCEL' AND enum_type_id = 'ODR_ITM_CHANGE_TYPE' AND sequence_id = '02');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Order Item Append', 'ITM_APPEND', 'ODR_ITM_APPEND', 'ODR_ITM_CHANGE_TYPE', '03'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Order Item Append' AND enum_code = 'ITM_APPEND' AND enum_id = 'ODR_ITM_APPEND' AND enum_type_id = 'ODR_ITM_CHANGE_TYPE' AND sequence_id = '03');

INSERT INTO enumeration_type (description, enum_type_id, has_table)
SELECT 'Order Item Change Reason', 'ODR_ITM_CH_REASON', 0
WHERE NOT EXISTS (SELECT 1 FROM enumeration_type WHERE description = 'Order Item Change Reason' AND enum_type_id = 'ODR_ITM_CH_REASON' AND has_table = 0);

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Mis-Ordered Item', 'MISORDER', 'OICR_MISORDER_ITEM', 'ODR_ITM_CH_REASON', '01'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Mis-Ordered Item' AND enum_code = 'MISORDER' AND enum_id = 'OICR_MISORDER_ITEM' AND enum_type_id = 'ODR_ITM_CH_REASON' AND sequence_id = '01');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Changed Mind', 'CHANGE_MIND', 'OICR_CHANGE_MIND', 'ODR_ITM_CH_REASON', '02'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Changed Mind' AND enum_code = 'CHANGE_MIND' AND enum_id = 'OICR_CHANGE_MIND' AND enum_type_id = 'ODR_ITM_CH_REASON' AND sequence_id = '02');

INSERT INTO status_type (description, has_table, status_type_id)
SELECT 'Order', 0, 'ORDER_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_type WHERE description = 'Order' AND has_table = 0 AND status_type_id = 'ORDER_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Created', '01', 'CREATED', 'ORDER_CREATED', 'ORDER_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Created' AND sequence_id = '01' AND status_code = 'CREATED' AND status_id = 'ORDER_CREATED' AND status_type_id = 'ORDER_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Processing', '04', 'PROCESSING', 'ORDER_PROCESSING', 'ORDER_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Processing' AND sequence_id = '04' AND status_code = 'PROCESSING' AND status_id = 'ORDER_PROCESSING' AND status_type_id = 'ORDER_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Approved', '05', 'APPROVED', 'ORDER_APPROVED', 'ORDER_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Approved' AND sequence_id = '05' AND status_code = 'APPROVED' AND status_id = 'ORDER_APPROVED' AND status_type_id = 'ORDER_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Sent', '03', 'SENT', 'ORDER_SENT', 'ORDER_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Sent' AND sequence_id = '03' AND status_code = 'SENT' AND status_id = 'ORDER_SENT' AND status_type_id = 'ORDER_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Held', '06', 'HELD', 'ORDER_HOLD', 'ORDER_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Held' AND sequence_id = '06' AND status_code = 'HELD' AND status_id = 'ORDER_HOLD' AND status_type_id = 'ORDER_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Completed', '10', 'COMPLETED', 'ORDER_COMPLETED', 'ORDER_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Completed' AND sequence_id = '10' AND status_code = 'COMPLETED' AND status_id = 'ORDER_COMPLETED' AND status_type_id = 'ORDER_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Rejected', '98', 'REJECTED', 'ORDER_REJECTED', 'ORDER_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Rejected' AND sequence_id = '98' AND status_code = 'REJECTED' AND status_id = 'ORDER_REJECTED' AND status_type_id = 'ORDER_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Cancelled', '99', 'CANCELLED', 'ORDER_CANCELLED', 'ORDER_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Cancelled' AND sequence_id = '99' AND status_code = 'CANCELLED' AND status_id = 'ORDER_CANCELLED' AND status_type_id = 'ORDER_STATUS');

INSERT INTO status_type (description, has_table, parent_type_id, status_type_id)
SELECT 'Order Item', 0, 'ORDER_STATUS', 'ORDER_ITEM_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_type WHERE description = 'Order Item' AND has_table = 0 AND parent_type_id = 'ORDER_STATUS' AND status_type_id = 'ORDER_ITEM_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Created', '01', 'CREATED', 'ITEM_CREATED', 'ORDER_ITEM_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Created' AND sequence_id = '01' AND status_code = 'CREATED' AND status_id = 'ITEM_CREATED' AND status_type_id = 'ORDER_ITEM_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Approved', '05', 'APPROVED', 'ITEM_APPROVED', 'ORDER_ITEM_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Approved' AND sequence_id = '05' AND status_code = 'APPROVED' AND status_id = 'ITEM_APPROVED' AND status_type_id = 'ORDER_ITEM_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Completed', '10', 'COMPLETED', 'ITEM_COMPLETED', 'ORDER_ITEM_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Completed' AND sequence_id = '10' AND status_code = 'COMPLETED' AND status_id = 'ITEM_COMPLETED' AND status_type_id = 'ORDER_ITEM_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Rejected', '98', 'REJECTED', 'ITEM_REJECTED', 'ORDER_ITEM_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Rejected' AND sequence_id = '98' AND status_code = 'REJECTED' AND status_id = 'ITEM_REJECTED' AND status_type_id = 'ORDER_ITEM_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Cancelled', '99', 'CANCELLED', 'ITEM_CANCELLED', 'ORDER_ITEM_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Cancelled' AND sequence_id = '99' AND status_code = 'CANCELLED' AND status_id = 'ITEM_CANCELLED' AND status_type_id = 'ORDER_ITEM_STATUS');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'ORDER_CREATED', 'ORDER_PROCESSING', 'Process Order'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'ORDER_CREATED' AND status_id_to = 'ORDER_PROCESSING' AND transition_name = 'Process Order');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'ORDER_CREATED', 'ORDER_APPROVED', 'Approve Order'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'ORDER_CREATED' AND status_id_to = 'ORDER_APPROVED' AND transition_name = 'Approve Order');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'ORDER_CREATED', 'ORDER_HOLD', 'Hold Order'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'ORDER_CREATED' AND status_id_to = 'ORDER_HOLD' AND transition_name = 'Hold Order');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'ORDER_CREATED', 'ORDER_REJECTED', 'Reject Order'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'ORDER_CREATED' AND status_id_to = 'ORDER_REJECTED' AND transition_name = 'Reject Order');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'ORDER_CREATED', 'ORDER_CANCELLED', 'Cancel Order'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'ORDER_CREATED' AND status_id_to = 'ORDER_CANCELLED' AND transition_name = 'Cancel Order');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'ORDER_PROCESSING', 'ORDER_HOLD', 'Hold Order'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'ORDER_PROCESSING' AND status_id_to = 'ORDER_HOLD' AND transition_name = 'Hold Order');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'ORDER_PROCESSING', 'ORDER_APPROVED', 'Approve Order'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'ORDER_PROCESSING' AND status_id_to = 'ORDER_APPROVED' AND transition_name = 'Approve Order');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'ORDER_PROCESSING', 'ORDER_REJECTED', 'Reject Order'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'ORDER_PROCESSING' AND status_id_to = 'ORDER_REJECTED' AND transition_name = 'Reject Order');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'ORDER_PROCESSING', 'ORDER_CANCELLED', 'Cancel Order'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'ORDER_PROCESSING' AND status_id_to = 'ORDER_CANCELLED' AND transition_name = 'Cancel Order');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'ORDER_APPROVED', 'ORDER_SENT', 'Send Order'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'ORDER_APPROVED' AND status_id_to = 'ORDER_SENT' AND transition_name = 'Send Order');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'ORDER_APPROVED', 'ORDER_PROCESSING', 'Process Order'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'ORDER_APPROVED' AND status_id_to = 'ORDER_PROCESSING' AND transition_name = 'Process Order');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'ORDER_APPROVED', 'ORDER_COMPLETED', 'Complete Order'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'ORDER_APPROVED' AND status_id_to = 'ORDER_COMPLETED' AND transition_name = 'Complete Order');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'ORDER_APPROVED', 'ORDER_CANCELLED', 'Cancel Order'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'ORDER_APPROVED' AND status_id_to = 'ORDER_CANCELLED' AND transition_name = 'Cancel Order');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'ORDER_APPROVED', 'ORDER_HOLD', 'Hold Order'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'ORDER_APPROVED' AND status_id_to = 'ORDER_HOLD' AND transition_name = 'Hold Order');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'ORDER_HOLD', 'ORDER_PROCESSING', 'Process Order'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'ORDER_HOLD' AND status_id_to = 'ORDER_PROCESSING' AND transition_name = 'Process Order');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'ORDER_HOLD', 'ORDER_APPROVED', 'Approve Order'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'ORDER_HOLD' AND status_id_to = 'ORDER_APPROVED' AND transition_name = 'Approve Order');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'ORDER_HOLD', 'ORDER_CANCELLED', 'Cancel Order'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'ORDER_HOLD' AND status_id_to = 'ORDER_CANCELLED' AND transition_name = 'Cancel Order');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'ORDER_SENT', 'ORDER_COMPLETED', 'Order Completed'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'ORDER_SENT' AND status_id_to = 'ORDER_COMPLETED' AND transition_name = 'Order Completed');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'ORDER_SENT', 'ORDER_CANCELLED', 'Order Cancelled'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'ORDER_SENT' AND status_id_to = 'ORDER_CANCELLED' AND transition_name = 'Order Cancelled');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'ORDER_COMPLETED', 'ORDER_APPROVED', 'Approve Order'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'ORDER_COMPLETED' AND status_id_to = 'ORDER_APPROVED' AND transition_name = 'Approve Order');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'ITEM_CREATED', 'ITEM_APPROVED', 'Approve Item'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'ITEM_CREATED' AND status_id_to = 'ITEM_APPROVED' AND transition_name = 'Approve Item');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'ITEM_CREATED', 'ITEM_REJECTED', 'Reject Item'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'ITEM_CREATED' AND status_id_to = 'ITEM_REJECTED' AND transition_name = 'Reject Item');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'ITEM_CREATED', 'ITEM_CANCELLED', 'Cancel Item'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'ITEM_CREATED' AND status_id_to = 'ITEM_CANCELLED' AND transition_name = 'Cancel Item');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'ITEM_APPROVED', 'ITEM_COMPLETED', 'Complete Item'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'ITEM_APPROVED' AND status_id_to = 'ITEM_COMPLETED' AND transition_name = 'Complete Item');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'ITEM_APPROVED', 'ITEM_CANCELLED', 'Cancel Item'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'ITEM_APPROVED' AND status_id_to = 'ITEM_CANCELLED' AND transition_name = 'Cancel Item');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'ITEM_COMPLETED', 'ITEM_APPROVED', 'Approve Item'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'ITEM_COMPLETED' AND status_id_to = 'ITEM_APPROVED' AND transition_name = 'Approve Item');

INSERT INTO status_type (description, has_table, status_type_id)
SELECT 'Payment Preference', 0, 'PAYMENT_PREF_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_type WHERE description = 'Payment Preference' AND has_table = 0 AND status_type_id = 'PAYMENT_PREF_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Not-Received', '01', 'NOT_RECEIVED', 'PAYMENT_NOT_RECEIVED', 'PAYMENT_PREF_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Not-Received' AND sequence_id = '01' AND status_code = 'NOT_RECEIVED' AND status_id = 'PAYMENT_NOT_RECEIVED' AND status_type_id = 'PAYMENT_PREF_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Received', '02', 'RECEIVED', 'PAYMENT_RECEIVED', 'PAYMENT_PREF_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Received' AND sequence_id = '02' AND status_code = 'RECEIVED' AND status_id = 'PAYMENT_RECEIVED' AND status_type_id = 'PAYMENT_PREF_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Not-Authorized', '01', 'NOT_AUTHORIZED', 'PAYMENT_NOT_AUTH', 'PAYMENT_PREF_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Not-Authorized' AND sequence_id = '01' AND status_code = 'NOT_AUTHORIZED' AND status_id = 'PAYMENT_NOT_AUTH' AND status_type_id = 'PAYMENT_PREF_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Authorized', '02', 'AUTHORIZED', 'PAYMENT_AUTHORIZED', 'PAYMENT_PREF_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Authorized' AND sequence_id = '02' AND status_code = 'AUTHORIZED' AND status_id = 'PAYMENT_AUTHORIZED' AND status_type_id = 'PAYMENT_PREF_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Settled', '03', 'SETTLED', 'PAYMENT_SETTLED', 'PAYMENT_PREF_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Settled' AND sequence_id = '03' AND status_code = 'SETTLED' AND status_id = 'PAYMENT_SETTLED' AND status_type_id = 'PAYMENT_PREF_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Declined', '04', 'DECLINED', 'PAYMENT_DECLINED', 'PAYMENT_PREF_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Declined' AND sequence_id = '04' AND status_code = 'DECLINED' AND status_id = 'PAYMENT_DECLINED' AND status_type_id = 'PAYMENT_PREF_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Refunded', '05', 'REFUNDED', 'PAYMENT_REFUNDED', 'PAYMENT_PREF_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Refunded' AND sequence_id = '05' AND status_code = 'REFUNDED' AND status_id = 'PAYMENT_REFUNDED' AND status_type_id = 'PAYMENT_PREF_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Cancelled', '99', 'CANCELLED', 'PAYMENT_CANCELLED', 'PAYMENT_PREF_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Cancelled' AND sequence_id = '99' AND status_code = 'CANCELLED' AND status_id = 'PAYMENT_CANCELLED' AND status_type_id = 'PAYMENT_PREF_STATUS');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'PAYMENT_NOT_RECEIVED', 'PAYMENT_RECEIVED', 'Payment Received'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'PAYMENT_NOT_RECEIVED' AND status_id_to = 'PAYMENT_RECEIVED' AND transition_name = 'Payment Received');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'PAYMENT_NOT_RECEIVED', 'PAYMENT_CANCELLED', 'Payment Cancelled'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'PAYMENT_NOT_RECEIVED' AND status_id_to = 'PAYMENT_CANCELLED' AND transition_name = 'Payment Cancelled');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'PAYMENT_NOT_AUTH', 'PAYMENT_AUTHORIZED', 'Payment Authorized'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'PAYMENT_NOT_AUTH' AND status_id_to = 'PAYMENT_AUTHORIZED' AND transition_name = 'Payment Authorized');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'PAYMENT_NOT_AUTH', 'PAYMENT_CANCELLED', 'Payment Cancelled'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'PAYMENT_NOT_AUTH' AND status_id_to = 'PAYMENT_CANCELLED' AND transition_name = 'Payment Cancelled');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'PAYMENT_AUTHORIZED', 'PAYMENT_SETTLED', 'Payment Settled'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'PAYMENT_AUTHORIZED' AND status_id_to = 'PAYMENT_SETTLED' AND transition_name = 'Payment Settled');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'PAYMENT_AUTHORIZED', 'PAYMENT_CANCELLED', 'Payment Cancelled'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'PAYMENT_AUTHORIZED' AND status_id_to = 'PAYMENT_CANCELLED' AND transition_name = 'Payment Cancelled');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'PAYMENT_SETTLED', 'PAYMENT_REFUNDED', 'Payment Refunded'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'PAYMENT_SETTLED' AND status_id_to = 'PAYMENT_REFUNDED' AND transition_name = 'Payment Refunded');

INSERT INTO status_type (description, has_table, status_type_id)
SELECT 'Order Delivery Schedule', 0, 'ORDER_DEL_SCH'
WHERE NOT EXISTS (SELECT 1 FROM status_type WHERE description = 'Order Delivery Schedule' AND has_table = 0 AND status_type_id = 'ORDER_DEL_SCH');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Supplier Submitted', '01', 'SUBMITTED', 'ODS_SUBMITTED', 'ORDER_DEL_SCH'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Supplier Submitted' AND sequence_id = '01' AND status_code = 'SUBMITTED' AND status_id = 'ODS_SUBMITTED' AND status_type_id = 'ORDER_DEL_SCH');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Accepted', '02', 'ACCEPTED', 'ODS_ACCEPTED', 'ORDER_DEL_SCH'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Accepted' AND sequence_id = '02' AND status_code = 'ACCEPTED' AND status_id = 'ODS_ACCEPTED' AND status_type_id = 'ORDER_DEL_SCH');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Schedule Approved', '03', 'APPROVED', 'ODS_APPROVED', 'ORDER_DEL_SCH'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Schedule Approved' AND sequence_id = '03' AND status_code = 'APPROVED' AND status_id = 'ODS_APPROVED' AND status_type_id = 'ORDER_DEL_SCH');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Delivery Arranged', '04', 'ARRANGED', 'ODS_ARRANGED', 'ORDER_DEL_SCH'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Delivery Arranged' AND sequence_id = '04' AND status_code = 'ARRANGED' AND status_id = 'ODS_ARRANGED' AND status_type_id = 'ORDER_DEL_SCH');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Delivery Cancelled', '99', 'CANCELLED', 'ODS_CANCELLED', 'ORDER_DEL_SCH'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Delivery Cancelled' AND sequence_id = '99' AND status_code = 'CANCELLED' AND status_id = 'ODS_CANCELLED' AND status_type_id = 'ORDER_DEL_SCH');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'ODS_SUBMITTED', 'ODS_ACCEPTED', 'Accept Delivery Information'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'ODS_SUBMITTED' AND status_id_to = 'ODS_ACCEPTED' AND transition_name = 'Accept Delivery Information');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'ODS_ACCEPTED', 'ODS_APPROVED', 'Approve Delivery Schedule'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'ODS_ACCEPTED' AND status_id_to = 'ODS_APPROVED' AND transition_name = 'Approve Delivery Schedule');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'ODS_APPROVED', 'ODS_ARRANGED', 'Arrange Delivery'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'ODS_APPROVED' AND status_id_to = 'ODS_ARRANGED' AND transition_name = 'Arrange Delivery');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'ODS_SUBMITTED', 'ODS_CANCELLED', 'Cancel Delivery'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'ODS_SUBMITTED' AND status_id_to = 'ODS_CANCELLED' AND transition_name = 'Cancel Delivery');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'ODS_ACCEPTED', 'ODS_CANCELLED', 'Cancel Delivery'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'ODS_ACCEPTED' AND status_id_to = 'ODS_CANCELLED' AND transition_name = 'Cancel Delivery');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'ODS_APPROVED', 'ODS_CANCELLED', 'Cancel Delivery'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'ODS_APPROVED' AND status_id_to = 'ODS_CANCELLED' AND transition_name = 'Cancel Delivery');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'ODS_ARRANGED', 'ODS_CANCELLED', 'Cancel Delivery'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'ODS_ARRANGED' AND status_id_to = 'ODS_CANCELLED' AND transition_name = 'Cancel Delivery');

INSERT INTO status_type (description, has_table, status_type_id)
SELECT 'Order Return Status For Customer Returns', 0, 'ORDER_RETURN_STTS'
WHERE NOT EXISTS (SELECT 1 FROM status_type WHERE description = 'Order Return Status For Customer Returns' AND has_table = 0 AND status_type_id = 'ORDER_RETURN_STTS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Requested', '01', 'REQUESTED', 'RETURN_REQUESTED', 'ORDER_RETURN_STTS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Requested' AND sequence_id = '01' AND status_code = 'REQUESTED' AND status_id = 'RETURN_REQUESTED' AND status_type_id = 'ORDER_RETURN_STTS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Accepted', '02', 'ACCEPTED', 'RETURN_ACCEPTED', 'ORDER_RETURN_STTS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Accepted' AND sequence_id = '02' AND status_code = 'ACCEPTED' AND status_id = 'RETURN_ACCEPTED' AND status_type_id = 'ORDER_RETURN_STTS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Received', '03', 'RECEIVED', 'RETURN_RECEIVED', 'ORDER_RETURN_STTS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Received' AND sequence_id = '03' AND status_code = 'RECEIVED' AND status_id = 'RETURN_RECEIVED' AND status_type_id = 'ORDER_RETURN_STTS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Completed', '10', 'COMPLETED', 'RETURN_COMPLETED', 'ORDER_RETURN_STTS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Completed' AND sequence_id = '10' AND status_code = 'COMPLETED' AND status_id = 'RETURN_COMPLETED' AND status_type_id = 'ORDER_RETURN_STTS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Manual Refund Required', '11', 'MANUAL_REFUND', 'RETURN_MAN_REFUND', 'ORDER_RETURN_STTS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Manual Refund Required' AND sequence_id = '11' AND status_code = 'MANUAL_REFUND' AND status_id = 'RETURN_MAN_REFUND' AND status_type_id = 'ORDER_RETURN_STTS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Cancelled', '99', 'CANCELLED', 'RETURN_CANCELLED', 'ORDER_RETURN_STTS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Cancelled' AND sequence_id = '99' AND status_code = 'CANCELLED' AND status_id = 'RETURN_CANCELLED' AND status_type_id = 'ORDER_RETURN_STTS');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'RETURN_REQUESTED', 'RETURN_ACCEPTED', 'Requested Return Accepted'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'RETURN_REQUESTED' AND status_id_to = 'RETURN_ACCEPTED' AND transition_name = 'Requested Return Accepted');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'RETURN_REQUESTED', 'RETURN_CANCELLED', 'Requested Return Cancelled'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'RETURN_REQUESTED' AND status_id_to = 'RETURN_CANCELLED' AND transition_name = 'Requested Return Cancelled');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'RETURN_ACCEPTED', 'RETURN_RECEIVED', 'Accepted Return Received'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'RETURN_ACCEPTED' AND status_id_to = 'RETURN_RECEIVED' AND transition_name = 'Accepted Return Received');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'RETURN_ACCEPTED', 'RETURN_CANCELLED', 'Accepted Return Cancelled'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'RETURN_ACCEPTED' AND status_id_to = 'RETURN_CANCELLED' AND transition_name = 'Accepted Return Cancelled');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'RETURN_RECEIVED', 'RETURN_COMPLETED', 'Received Return Completed'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'RETURN_RECEIVED' AND status_id_to = 'RETURN_COMPLETED' AND transition_name = 'Received Return Completed');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'RETURN_RECEIVED', 'RETURN_CANCELLED', 'Received Return Cancelled'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'RETURN_RECEIVED' AND status_id_to = 'RETURN_CANCELLED' AND transition_name = 'Received Return Cancelled');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'RETURN_RECEIVED', 'RETURN_MAN_REFUND', 'Received Return Requires Manual Refund'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'RETURN_RECEIVED' AND status_id_to = 'RETURN_MAN_REFUND' AND transition_name = 'Received Return Requires Manual Refund');

INSERT INTO status_type (description, has_table, status_type_id)
SELECT 'Order Return Status For Supplier Returns', 0, 'PORDER_RETURN_STTS'
WHERE NOT EXISTS (SELECT 1 FROM status_type WHERE description = 'Order Return Status For Supplier Returns' AND has_table = 0 AND status_type_id = 'PORDER_RETURN_STTS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Requested', '01', 'REQUESTED', 'SUP_RETURN_REQUESTED', 'PORDER_RETURN_STTS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Requested' AND sequence_id = '01' AND status_code = 'REQUESTED' AND status_id = 'SUP_RETURN_REQUESTED' AND status_type_id = 'PORDER_RETURN_STTS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Accepted', '02', 'ACCEPTED', 'SUP_RETURN_ACCEPTED', 'PORDER_RETURN_STTS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Accepted' AND sequence_id = '02' AND status_code = 'ACCEPTED' AND status_id = 'SUP_RETURN_ACCEPTED' AND status_type_id = 'PORDER_RETURN_STTS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Shipped', '03', 'SHIPPED', 'SUP_RETURN_SHIPPED', 'PORDER_RETURN_STTS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Shipped' AND sequence_id = '03' AND status_code = 'SHIPPED' AND status_id = 'SUP_RETURN_SHIPPED' AND status_type_id = 'PORDER_RETURN_STTS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Completed', '10', 'COMPLETED', 'SUP_RETURN_COMPLETED', 'PORDER_RETURN_STTS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Completed' AND sequence_id = '10' AND status_code = 'COMPLETED' AND status_id = 'SUP_RETURN_COMPLETED' AND status_type_id = 'PORDER_RETURN_STTS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Cancelled', '99', 'CANCELLED', 'SUP_RETURN_CANCELLED', 'PORDER_RETURN_STTS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Cancelled' AND sequence_id = '99' AND status_code = 'CANCELLED' AND status_id = 'SUP_RETURN_CANCELLED' AND status_type_id = 'PORDER_RETURN_STTS');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'SUP_RETURN_REQUESTED', 'SUP_RETURN_ACCEPTED', 'Requested Return Accepted'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'SUP_RETURN_REQUESTED' AND status_id_to = 'SUP_RETURN_ACCEPTED' AND transition_name = 'Requested Return Accepted');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'SUP_RETURN_REQUESTED', 'SUP_RETURN_CANCELLED', 'Requested Return Cancelled'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'SUP_RETURN_REQUESTED' AND status_id_to = 'SUP_RETURN_CANCELLED' AND transition_name = 'Requested Return Cancelled');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'SUP_RETURN_ACCEPTED', 'SUP_RETURN_SHIPPED', 'Accepted Return Shipped'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'SUP_RETURN_ACCEPTED' AND status_id_to = 'SUP_RETURN_SHIPPED' AND transition_name = 'Accepted Return Shipped');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'SUP_RETURN_ACCEPTED', 'SUP_RETURN_CANCELLED', 'Accepted Return Cancelled'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'SUP_RETURN_ACCEPTED' AND status_id_to = 'SUP_RETURN_CANCELLED' AND transition_name = 'Accepted Return Cancelled');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'SUP_RETURN_SHIPPED', 'SUP_RETURN_COMPLETED', 'Shipped Return Completed'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'SUP_RETURN_SHIPPED' AND status_id_to = 'SUP_RETURN_COMPLETED' AND transition_name = 'Shipped Return Completed');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'SUP_RETURN_SHIPPED', 'SUP_RETURN_CANCELLED', 'Shipped Return Cancelled'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'SUP_RETURN_SHIPPED' AND status_id_to = 'SUP_RETURN_CANCELLED' AND transition_name = 'Shipped Return Cancelled');

INSERT INTO status_type (description, has_table, status_type_id)
SELECT 'Custom Request Status', 0, 'CUSTREQ_STTS'
WHERE NOT EXISTS (SELECT 1 FROM status_type WHERE description = 'Custom Request Status' AND has_table = 0 AND status_type_id = 'CUSTREQ_STTS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Draft', '00', 'DRAFT', 'CRQ_DRAFT', 'CUSTREQ_STTS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Draft' AND sequence_id = '00' AND status_code = 'DRAFT' AND status_id = 'CRQ_DRAFT' AND status_type_id = 'CUSTREQ_STTS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Submitted', '01', 'SUBMITTED', 'CRQ_SUBMITTED', 'CUSTREQ_STTS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Submitted' AND sequence_id = '01' AND status_code = 'SUBMITTED' AND status_id = 'CRQ_SUBMITTED' AND status_type_id = 'CUSTREQ_STTS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Accepted', '02', 'ACCEPTED', 'CRQ_ACCEPTED', 'CUSTREQ_STTS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Accepted' AND sequence_id = '02' AND status_code = 'ACCEPTED' AND status_id = 'CRQ_ACCEPTED' AND status_type_id = 'CUSTREQ_STTS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Reviewed', '03', 'REVIEWED', 'CRQ_REVIEWED', 'CUSTREQ_STTS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Reviewed' AND sequence_id = '03' AND status_code = 'REVIEWED' AND status_id = 'CRQ_REVIEWED' AND status_type_id = 'CUSTREQ_STTS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Pending Cust.', '09', 'PENDING', 'CRQ_PENDING', 'CUSTREQ_STTS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Pending Cust.' AND sequence_id = '09' AND status_code = 'PENDING' AND status_id = 'CRQ_PENDING' AND status_type_id = 'CUSTREQ_STTS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Completed', '04', 'COMPLETED', 'CRQ_COMPLETED', 'CUSTREQ_STTS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Completed' AND sequence_id = '04' AND status_code = 'COMPLETED' AND status_id = 'CRQ_COMPLETED' AND status_type_id = 'CUSTREQ_STTS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Rejected', '98', 'REJECTED', 'CRQ_REJECTED', 'CUSTREQ_STTS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Rejected' AND sequence_id = '98' AND status_code = 'REJECTED' AND status_id = 'CRQ_REJECTED' AND status_type_id = 'CUSTREQ_STTS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Cancelled', '99', 'CANCELLED', 'CRQ_CANCELLED', 'CUSTREQ_STTS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Cancelled' AND sequence_id = '99' AND status_code = 'CANCELLED' AND status_id = 'CRQ_CANCELLED' AND status_type_id = 'CUSTREQ_STTS');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'CRQ_DRAFT', 'CRQ_ACCEPTED', 'Accept Request'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'CRQ_DRAFT' AND status_id_to = 'CRQ_ACCEPTED' AND transition_name = 'Accept Request');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'CRQ_DRAFT', 'CRQ_SUBMITTED', 'Submit Request'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'CRQ_DRAFT' AND status_id_to = 'CRQ_SUBMITTED' AND transition_name = 'Submit Request');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'CRQ_DRAFT', 'CRQ_CANCELLED', 'Cancel Request'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'CRQ_DRAFT' AND status_id_to = 'CRQ_CANCELLED' AND transition_name = 'Cancel Request');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'CRQ_SUBMITTED', 'CRQ_ACCEPTED', 'Accept Request'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'CRQ_SUBMITTED' AND status_id_to = 'CRQ_ACCEPTED' AND transition_name = 'Accept Request');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'CRQ_SUBMITTED', 'CRQ_COMPLETED', 'Complete Request'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'CRQ_SUBMITTED' AND status_id_to = 'CRQ_COMPLETED' AND transition_name = 'Complete Request');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'CRQ_SUBMITTED', 'CRQ_REJECTED', 'Reject Request'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'CRQ_SUBMITTED' AND status_id_to = 'CRQ_REJECTED' AND transition_name = 'Reject Request');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'CRQ_SUBMITTED', 'CRQ_CANCELLED', 'Cancel Request'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'CRQ_SUBMITTED' AND status_id_to = 'CRQ_CANCELLED' AND transition_name = 'Cancel Request');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'CRQ_SUBMITTED', 'CRQ_PENDING', 'Pending customer'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'CRQ_SUBMITTED' AND status_id_to = 'CRQ_PENDING' AND transition_name = 'Pending customer');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'CRQ_PENDING', 'CRQ_SUBMITTED', 'Submit Request'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'CRQ_PENDING' AND status_id_to = 'CRQ_SUBMITTED' AND transition_name = 'Submit Request');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'CRQ_PENDING', 'CRQ_ACCEPTED', 'Accept Request'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'CRQ_PENDING' AND status_id_to = 'CRQ_ACCEPTED' AND transition_name = 'Accept Request');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'CRQ_PENDING', 'CRQ_REVIEWED', 'Review Request'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'CRQ_PENDING' AND status_id_to = 'CRQ_REVIEWED' AND transition_name = 'Review Request');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'CRQ_PENDING', 'CRQ_CANCELLED', 'Cancel Request'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'CRQ_PENDING' AND status_id_to = 'CRQ_CANCELLED' AND transition_name = 'Cancel Request');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'CRQ_ACCEPTED', 'CRQ_REVIEWED', 'Review Request'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'CRQ_ACCEPTED' AND status_id_to = 'CRQ_REVIEWED' AND transition_name = 'Review Request');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'CRQ_ACCEPTED', 'CRQ_COMPLETED', 'Complete Request'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'CRQ_ACCEPTED' AND status_id_to = 'CRQ_COMPLETED' AND transition_name = 'Complete Request');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'CRQ_ACCEPTED', 'CRQ_CANCELLED', 'Cancel Request'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'CRQ_ACCEPTED' AND status_id_to = 'CRQ_CANCELLED' AND transition_name = 'Cancel Request');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'CRQ_ACCEPTED', 'CRQ_PENDING', 'Pending Customer'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'CRQ_ACCEPTED' AND status_id_to = 'CRQ_PENDING' AND transition_name = 'Pending Customer');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'CRQ_REVIEWED', 'CRQ_COMPLETED', 'Complete Request'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'CRQ_REVIEWED' AND status_id_to = 'CRQ_COMPLETED' AND transition_name = 'Complete Request');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'CRQ_REVIEWED', 'CRQ_CANCELLED', 'Cancel Request'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'CRQ_REVIEWED' AND status_id_to = 'CRQ_CANCELLED' AND transition_name = 'Cancel Request');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'CRQ_REVIEWED', 'CRQ_PENDING', 'Pending Customer'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'CRQ_REVIEWED' AND status_id_to = 'CRQ_PENDING' AND transition_name = 'Pending Customer');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'CRQ_COMPLETED', 'CRQ_REVIEWED', 'Re-open Request'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'CRQ_COMPLETED' AND status_id_to = 'CRQ_REVIEWED' AND transition_name = 'Re-open Request');

INSERT INTO status_type (description, has_table, status_type_id)
SELECT 'Requirement Status', 0, 'REQUIREMENT_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_type WHERE description = 'Requirement Status' AND has_table = 0 AND status_type_id = 'REQUIREMENT_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Proposed', '01', 'PROPOSED', 'REQ_PROPOSED', 'REQUIREMENT_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Proposed' AND sequence_id = '01' AND status_code = 'PROPOSED' AND status_id = 'REQ_PROPOSED' AND status_type_id = 'REQUIREMENT_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Created', '01', 'CREATED', 'REQ_CREATED', 'REQUIREMENT_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Created' AND sequence_id = '01' AND status_code = 'CREATED' AND status_id = 'REQ_CREATED' AND status_type_id = 'REQUIREMENT_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Approved', '02', 'APPROVED', 'REQ_APPROVED', 'REQUIREMENT_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Approved' AND sequence_id = '02' AND status_code = 'APPROVED' AND status_id = 'REQ_APPROVED' AND status_type_id = 'REQUIREMENT_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Ordered', '03', 'ORDERED', 'REQ_ORDERED', 'REQUIREMENT_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Ordered' AND sequence_id = '03' AND status_code = 'ORDERED' AND status_id = 'REQ_ORDERED' AND status_type_id = 'REQUIREMENT_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Rejected', '98', 'REJECTED', 'REQ_REJECTED', 'REQUIREMENT_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Rejected' AND sequence_id = '98' AND status_code = 'REJECTED' AND status_id = 'REQ_REJECTED' AND status_type_id = 'REQUIREMENT_STATUS');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'REQ_PROPOSED', 'REQ_APPROVED', 'Accept Requirement'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'REQ_PROPOSED' AND status_id_to = 'REQ_APPROVED' AND transition_name = 'Accept Requirement');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'REQ_PROPOSED', 'REQ_REJECTED', 'Reject Requirement'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'REQ_PROPOSED' AND status_id_to = 'REQ_REJECTED' AND transition_name = 'Reject Requirement');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'REQ_CREATED', 'REQ_APPROVED', 'Accept Requirement'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'REQ_CREATED' AND status_id_to = 'REQ_APPROVED' AND transition_name = 'Accept Requirement');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'REQ_CREATED', 'REQ_REJECTED', 'Reject Requirement'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'REQ_CREATED' AND status_id_to = 'REQ_REJECTED' AND transition_name = 'Reject Requirement');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'REQ_APPROVED', 'REQ_ORDERED', 'Order Requirement'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'REQ_APPROVED' AND status_id_to = 'REQ_ORDERED' AND transition_name = 'Order Requirement');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'REQ_APPROVED', 'REQ_REJECTED', 'Reject Requirement'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'REQ_APPROVED' AND status_id_to = 'REQ_REJECTED' AND transition_name = 'Reject Requirement');

INSERT INTO status_type (description, has_table, status_type_id)
SELECT 'Quote Status', 0, 'QUOTE_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_type WHERE description = 'Quote Status' AND has_table = 0 AND status_type_id = 'QUOTE_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Created', '01', 'CREATED', 'QUO_CREATED', 'QUOTE_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Created' AND sequence_id = '01' AND status_code = 'CREATED' AND status_id = 'QUO_CREATED' AND status_type_id = 'QUOTE_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Approved', '02', 'APPROVED', 'QUO_APPROVED', 'QUOTE_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Approved' AND sequence_id = '02' AND status_code = 'APPROVED' AND status_id = 'QUO_APPROVED' AND status_type_id = 'QUOTE_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Ordered', '03', 'ORDERED', 'QUO_ORDERED', 'QUOTE_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Ordered' AND sequence_id = '03' AND status_code = 'ORDERED' AND status_id = 'QUO_ORDERED' AND status_type_id = 'QUOTE_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Rejected', '98', 'REJECTED', 'QUO_REJECTED', 'QUOTE_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Rejected' AND sequence_id = '98' AND status_code = 'REJECTED' AND status_id = 'QUO_REJECTED' AND status_type_id = 'QUOTE_STATUS');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'QUO_CREATED', 'QUO_APPROVED', 'Accept Quote'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'QUO_CREATED' AND status_id_to = 'QUO_APPROVED' AND transition_name = 'Accept Quote');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'QUO_CREATED', 'QUO_REJECTED', 'Reject Quote'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'QUO_CREATED' AND status_id_to = 'QUO_REJECTED' AND transition_name = 'Reject Quote');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'QUO_APPROVED', 'QUO_ORDERED', 'Order Quote'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'QUO_APPROVED' AND status_id_to = 'QUO_ORDERED' AND transition_name = 'Order Quote');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'QUO_APPROVED', 'QUO_REJECTED', 'Reject Quote'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'QUO_APPROVED' AND status_id_to = 'QUO_REJECTED' AND transition_name = 'Reject Quote');

INSERT INTO status_type (description, has_table, status_type_id)
SELECT 'Allocation Plan Status', 0, 'ALLOC_PLAN_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_type WHERE description = 'Allocation Plan Status' AND has_table = 0 AND status_type_id = 'ALLOC_PLAN_STATUS');

INSERT INTO status_type (description, has_table, parent_type_id, status_type_id)
SELECT 'Allocation Plan Item Status', 0, 'ALLOC_PLAN_STATUS', 'ALLOC_PLAN_ITEM_STTS'
WHERE NOT EXISTS (SELECT 1 FROM status_type WHERE description = 'Allocation Plan Item Status' AND has_table = 0 AND parent_type_id = 'ALLOC_PLAN_STATUS' AND status_type_id = 'ALLOC_PLAN_ITEM_STTS');

INSERT INTO enumeration_type (description, enum_type_id, has_table)
SELECT 'Allocation Plan Method', 'ALLOC_PLAN_METHOD', 0
WHERE NOT EXISTS (SELECT 1 FROM enumeration_type WHERE description = 'Allocation Plan Method' AND enum_type_id = 'ALLOC_PLAN_METHOD' AND has_table = 0);

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Created', '01', 'CREATED', 'ALLOC_PLAN_CREATED', 'ALLOC_PLAN_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Created' AND sequence_id = '01' AND status_code = 'CREATED' AND status_id = 'ALLOC_PLAN_CREATED' AND status_type_id = 'ALLOC_PLAN_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Approved', '02', 'APPROVED', 'ALLOC_PLAN_APPROVED', 'ALLOC_PLAN_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Approved' AND sequence_id = '02' AND status_code = 'APPROVED' AND status_id = 'ALLOC_PLAN_APPROVED' AND status_type_id = 'ALLOC_PLAN_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Completed', '03', 'COMPLETED', 'ALLOC_PLAN_COMPLETED', 'ALLOC_PLAN_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Completed' AND sequence_id = '03' AND status_code = 'COMPLETED' AND status_id = 'ALLOC_PLAN_COMPLETED' AND status_type_id = 'ALLOC_PLAN_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Cancelled', '04', 'CANCELLED', 'ALLOC_PLAN_CANCELLED', 'ALLOC_PLAN_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Cancelled' AND sequence_id = '04' AND status_code = 'CANCELLED' AND status_id = 'ALLOC_PLAN_CANCELLED' AND status_type_id = 'ALLOC_PLAN_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Created', '01', 'CREATED', 'ALLOC_PLAN_ITEM_CRTD', 'ALLOC_PLAN_ITEM_STTS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Created' AND sequence_id = '01' AND status_code = 'CREATED' AND status_id = 'ALLOC_PLAN_ITEM_CRTD' AND status_type_id = 'ALLOC_PLAN_ITEM_STTS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Approved', '02', 'APPROVED', 'ALLOC_PLAN_ITEM_APRV', 'ALLOC_PLAN_ITEM_STTS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Approved' AND sequence_id = '02' AND status_code = 'APPROVED' AND status_id = 'ALLOC_PLAN_ITEM_APRV' AND status_type_id = 'ALLOC_PLAN_ITEM_STTS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Completed', '03', 'COMPLETED', 'ALLOC_PLAN_ITEM_CMPL', 'ALLOC_PLAN_ITEM_STTS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Completed' AND sequence_id = '03' AND status_code = 'COMPLETED' AND status_id = 'ALLOC_PLAN_ITEM_CMPL' AND status_type_id = 'ALLOC_PLAN_ITEM_STTS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Cancelled', '04', 'CANCELLED', 'ALLOC_PLAN_ITEM_CNCL', 'ALLOC_PLAN_ITEM_STTS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Cancelled' AND sequence_id = '04' AND status_code = 'CANCELLED' AND status_id = 'ALLOC_PLAN_ITEM_CNCL' AND status_type_id = 'ALLOC_PLAN_ITEM_STTS');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Auto', 'AUTO', 'AUTO', 'ALLOC_PLAN_METHOD', '01'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Auto' AND enum_code = 'AUTO' AND enum_id = 'AUTO' AND enum_type_id = 'ALLOC_PLAN_METHOD' AND sequence_id = '01');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Manual', 'MANUAL', 'MANUAL', 'ALLOC_PLAN_METHOD', '02'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Manual' AND enum_code = 'MANUAL' AND enum_id = 'MANUAL' AND enum_type_id = 'ALLOC_PLAN_METHOD' AND sequence_id = '02');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'ALLOC_PLAN_CREATED', 'ALLOC_PLAN_APPROVED', 'Approve'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'ALLOC_PLAN_CREATED' AND status_id_to = 'ALLOC_PLAN_APPROVED' AND transition_name = 'Approve');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'ALLOC_PLAN_CREATED', 'ALLOC_PLAN_CANCELLED', 'Cancel'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'ALLOC_PLAN_CREATED' AND status_id_to = 'ALLOC_PLAN_CANCELLED' AND transition_name = 'Cancel');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'ALLOC_PLAN_APPROVED', 'ALLOC_PLAN_CREATED', 'Create'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'ALLOC_PLAN_APPROVED' AND status_id_to = 'ALLOC_PLAN_CREATED' AND transition_name = 'Create');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'ALLOC_PLAN_APPROVED', 'ALLOC_PLAN_COMPLETED', 'Complete'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'ALLOC_PLAN_APPROVED' AND status_id_to = 'ALLOC_PLAN_COMPLETED' AND transition_name = 'Complete');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'ALLOC_PLAN_APPROVED', 'ALLOC_PLAN_CANCELLED', 'Cancel'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'ALLOC_PLAN_APPROVED' AND status_id_to = 'ALLOC_PLAN_CANCELLED' AND transition_name = 'Cancel');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'ALLOC_PLAN_ITEM_CRTD', 'ALLOC_PLAN_ITEM_APRV', 'Approve'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'ALLOC_PLAN_ITEM_CRTD' AND status_id_to = 'ALLOC_PLAN_ITEM_APRV' AND transition_name = 'Approve');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'ALLOC_PLAN_ITEM_CRTD', 'ALLOC_PLAN_ITEM_CNCL', 'Cancel'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'ALLOC_PLAN_ITEM_CRTD' AND status_id_to = 'ALLOC_PLAN_ITEM_CNCL' AND transition_name = 'Cancel');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'ALLOC_PLAN_ITEM_APRV', 'ALLOC_PLAN_ITEM_CRTD', 'Create'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'ALLOC_PLAN_ITEM_APRV' AND status_id_to = 'ALLOC_PLAN_ITEM_CRTD' AND transition_name = 'Create');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'ALLOC_PLAN_ITEM_APRV', 'ALLOC_PLAN_ITEM_CMPL', 'Complete'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'ALLOC_PLAN_ITEM_APRV' AND status_id_to = 'ALLOC_PLAN_ITEM_CMPL' AND transition_name = 'Complete');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'ALLOC_PLAN_ITEM_APRV', 'ALLOC_PLAN_ITEM_CNCL', 'Cancel'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'ALLOC_PLAN_ITEM_APRV' AND status_id_to = 'ALLOC_PLAN_ITEM_CNCL' AND transition_name = 'Cancel');
