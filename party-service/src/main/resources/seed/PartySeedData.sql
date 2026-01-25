INSERT INTO contact_mech_purpose_type (contact_mech_purpose_type_id, description, has_table)
SELECT 'SHIPPING_LOCATION', 'Shipping Destination Address', 'N'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_purpose_type WHERE contact_mech_purpose_type_id = 'SHIPPING_LOCATION' AND description = 'Shipping Destination Address' AND has_table = 'N');

INSERT INTO contact_mech_purpose_type (contact_mech_purpose_type_id, description, has_table)
SELECT 'SHIP_ORIG_LOCATION', 'Shipping Origin Address', 'N'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_purpose_type WHERE contact_mech_purpose_type_id = 'SHIP_ORIG_LOCATION' AND description = 'Shipping Origin Address' AND has_table = 'N');

INSERT INTO contact_mech_purpose_type (contact_mech_purpose_type_id, description, has_table)
SELECT 'BILLING_LOCATION', 'Billing (AP) Address', 'N'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_purpose_type WHERE contact_mech_purpose_type_id = 'BILLING_LOCATION' AND description = 'Billing (AP) Address' AND has_table = 'N');

INSERT INTO contact_mech_purpose_type (contact_mech_purpose_type_id, description, has_table)
SELECT 'PAYMENT_LOCATION', 'Payment (AR) Address', 'N'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_purpose_type WHERE contact_mech_purpose_type_id = 'PAYMENT_LOCATION' AND description = 'Payment (AR) Address' AND has_table = 'N');

INSERT INTO contact_mech_purpose_type (contact_mech_purpose_type_id, description, has_table)
SELECT 'GENERAL_LOCATION', 'General Correspondence Address', 'N'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_purpose_type WHERE contact_mech_purpose_type_id = 'GENERAL_LOCATION' AND description = 'General Correspondence Address' AND has_table = 'N');

INSERT INTO contact_mech_purpose_type (contact_mech_purpose_type_id, description, has_table)
SELECT 'PUR_RET_LOCATION', 'Purchase Return Address', 'N'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_purpose_type WHERE contact_mech_purpose_type_id = 'PUR_RET_LOCATION' AND description = 'Purchase Return Address' AND has_table = 'N');

INSERT INTO contact_mech_purpose_type (contact_mech_purpose_type_id, description, has_table)
SELECT 'PRIMARY_LOCATION', 'Primary Address', 'N'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_purpose_type WHERE contact_mech_purpose_type_id = 'PRIMARY_LOCATION' AND description = 'Primary Address' AND has_table = 'N');

INSERT INTO contact_mech_purpose_type (contact_mech_purpose_type_id, description, has_table)
SELECT 'PREVIOUS_LOCATION', 'Previous Address', 'N'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_purpose_type WHERE contact_mech_purpose_type_id = 'PREVIOUS_LOCATION' AND description = 'Previous Address' AND has_table = 'N');

INSERT INTO contact_mech_purpose_type (contact_mech_purpose_type_id, description, has_table)
SELECT 'PHONE_SHIPPING', 'Shipping Destination Phone Number', 'N'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_purpose_type WHERE contact_mech_purpose_type_id = 'PHONE_SHIPPING' AND description = 'Shipping Destination Phone Number' AND has_table = 'N');

INSERT INTO contact_mech_purpose_type (contact_mech_purpose_type_id, description, has_table)
SELECT 'PHONE_SHIP_ORIG', 'Shipping Origin Phone Number', 'N'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_purpose_type WHERE contact_mech_purpose_type_id = 'PHONE_SHIP_ORIG' AND description = 'Shipping Origin Phone Number' AND has_table = 'N');

INSERT INTO contact_mech_purpose_type (contact_mech_purpose_type_id, description, has_table)
SELECT 'PHONE_BILLING', 'Billing (AP) Phone Number', 'N'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_purpose_type WHERE contact_mech_purpose_type_id = 'PHONE_BILLING' AND description = 'Billing (AP) Phone Number' AND has_table = 'N');

INSERT INTO contact_mech_purpose_type (contact_mech_purpose_type_id, description, has_table)
SELECT 'PHONE_DID', 'Direct Inward Dialing Phone Number', 'N'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_purpose_type WHERE contact_mech_purpose_type_id = 'PHONE_DID' AND description = 'Direct Inward Dialing Phone Number' AND has_table = 'N');

INSERT INTO contact_mech_purpose_type (contact_mech_purpose_type_id, description, has_table)
SELECT 'PHONE_PAYMENT', 'Payment (AR) Phone Number', 'N'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_purpose_type WHERE contact_mech_purpose_type_id = 'PHONE_PAYMENT' AND description = 'Payment (AR) Phone Number' AND has_table = 'N');

INSERT INTO contact_mech_purpose_type (contact_mech_purpose_type_id, description, has_table)
SELECT 'PHONE_HOME', 'Main Home Phone Number', 'N'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_purpose_type WHERE contact_mech_purpose_type_id = 'PHONE_HOME' AND description = 'Main Home Phone Number' AND has_table = 'N');

INSERT INTO contact_mech_purpose_type (contact_mech_purpose_type_id, description, has_table)
SELECT 'PHONE_WORK', 'Main Work Phone Number', 'N'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_purpose_type WHERE contact_mech_purpose_type_id = 'PHONE_WORK' AND description = 'Main Work Phone Number' AND has_table = 'N');

INSERT INTO contact_mech_purpose_type (contact_mech_purpose_type_id, description, has_table)
SELECT 'PHONE_WORK_SEC', 'Secondary Work Phone Number', 'N'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_purpose_type WHERE contact_mech_purpose_type_id = 'PHONE_WORK_SEC' AND description = 'Secondary Work Phone Number' AND has_table = 'N');

INSERT INTO contact_mech_purpose_type (contact_mech_purpose_type_id, description, has_table)
SELECT 'FAX_NUMBER', 'Main Fax Number', 'N'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_purpose_type WHERE contact_mech_purpose_type_id = 'FAX_NUMBER' AND description = 'Main Fax Number' AND has_table = 'N');

INSERT INTO contact_mech_purpose_type (contact_mech_purpose_type_id, description, has_table)
SELECT 'FAX_NUMBER_SEC', 'Secondary Fax Number', 'N'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_purpose_type WHERE contact_mech_purpose_type_id = 'FAX_NUMBER_SEC' AND description = 'Secondary Fax Number' AND has_table = 'N');

INSERT INTO contact_mech_purpose_type (contact_mech_purpose_type_id, description, has_table)
SELECT 'FAX_SHIPPING', 'Shipping Destination Fax Number', 'N'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_purpose_type WHERE contact_mech_purpose_type_id = 'FAX_SHIPPING' AND description = 'Shipping Destination Fax Number' AND has_table = 'N');

INSERT INTO contact_mech_purpose_type (contact_mech_purpose_type_id, description, has_table)
SELECT 'FAX_BILLING', 'Billing Destination Fax Number', 'N'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_purpose_type WHERE contact_mech_purpose_type_id = 'FAX_BILLING' AND description = 'Billing Destination Fax Number' AND has_table = 'N');

INSERT INTO contact_mech_purpose_type (contact_mech_purpose_type_id, description, has_table)
SELECT 'PHONE_MOBILE', 'Main Mobile Phone Number', 'N'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_purpose_type WHERE contact_mech_purpose_type_id = 'PHONE_MOBILE' AND description = 'Main Mobile Phone Number' AND has_table = 'N');

INSERT INTO contact_mech_purpose_type (contact_mech_purpose_type_id, description, has_table)
SELECT 'PHONE_ASSISTANT', 'Assistant''s Phone Number', 'N'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_purpose_type WHERE contact_mech_purpose_type_id = 'PHONE_ASSISTANT' AND description = 'Assistant''s Phone Number' AND has_table = 'N');

INSERT INTO contact_mech_purpose_type (contact_mech_purpose_type_id, description, has_table)
SELECT 'PRIMARY_PHONE', 'Primary Phone Number', 'N'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_purpose_type WHERE contact_mech_purpose_type_id = 'PRIMARY_PHONE' AND description = 'Primary Phone Number' AND has_table = 'N');

INSERT INTO contact_mech_purpose_type (contact_mech_purpose_type_id, description, has_table)
SELECT 'PHONE_QUICK', 'Quick Calls Phone Number', 'N'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_purpose_type WHERE contact_mech_purpose_type_id = 'PHONE_QUICK' AND description = 'Quick Calls Phone Number' AND has_table = 'N');

INSERT INTO contact_mech_purpose_type (contact_mech_purpose_type_id, description, has_table)
SELECT 'MARKETING_EMAIL', 'Primary Marketing Email Address', 'N'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_purpose_type WHERE contact_mech_purpose_type_id = 'MARKETING_EMAIL' AND description = 'Primary Marketing Email Address' AND has_table = 'N');

INSERT INTO contact_mech_purpose_type (contact_mech_purpose_type_id, description, has_table)
SELECT 'PRIMARY_EMAIL', 'Primary Email Address', 'N'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_purpose_type WHERE contact_mech_purpose_type_id = 'PRIMARY_EMAIL' AND description = 'Primary Email Address' AND has_table = 'N');

INSERT INTO contact_mech_purpose_type (contact_mech_purpose_type_id, description, has_table)
SELECT 'BILLING_EMAIL', 'Billing (AP) Email', 'N'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_purpose_type WHERE contact_mech_purpose_type_id = 'BILLING_EMAIL' AND description = 'Billing (AP) Email' AND has_table = 'N');

INSERT INTO contact_mech_purpose_type (contact_mech_purpose_type_id, description, has_table)
SELECT 'PAYMENT_EMAIL', 'Payment (AR) Email', 'N'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_purpose_type WHERE contact_mech_purpose_type_id = 'PAYMENT_EMAIL' AND description = 'Payment (AR) Email' AND has_table = 'N');

INSERT INTO contact_mech_purpose_type (contact_mech_purpose_type_id, description, has_table)
SELECT 'OTHER_EMAIL', 'Other Email Address', 'N'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_purpose_type WHERE contact_mech_purpose_type_id = 'OTHER_EMAIL' AND description = 'Other Email Address' AND has_table = 'N');

INSERT INTO contact_mech_purpose_type (contact_mech_purpose_type_id, description, has_table)
SELECT 'SUPPORT_EMAIL', 'Support Email', 'N'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_purpose_type WHERE contact_mech_purpose_type_id = 'SUPPORT_EMAIL' AND description = 'Support Email' AND has_table = 'N');

INSERT INTO contact_mech_purpose_type (contact_mech_purpose_type_id, description, has_table)
SELECT 'ORDER_EMAIL', 'Order Notification Email Address', 'N'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_purpose_type WHERE contact_mech_purpose_type_id = 'ORDER_EMAIL' AND description = 'Order Notification Email Address' AND has_table = 'N');

INSERT INTO contact_mech_purpose_type (contact_mech_purpose_type_id, description, has_table)
SELECT 'PRIMARY_WEB_URL', 'Primary Website URL', 'N'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_purpose_type WHERE contact_mech_purpose_type_id = 'PRIMARY_WEB_URL' AND description = 'Primary Website URL' AND has_table = 'N');

INSERT INTO contact_mech_purpose_type (contact_mech_purpose_type_id, description, has_table)
SELECT 'TWITTER_URL', 'Twitter Website URL', 'N'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_purpose_type WHERE contact_mech_purpose_type_id = 'TWITTER_URL' AND description = 'Twitter Website URL' AND has_table = 'N');

INSERT INTO contact_mech_purpose_type (contact_mech_purpose_type_id, description, has_table)
SELECT 'FACEBOOK_URL', 'Facebook Website URL', 'N'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_purpose_type WHERE contact_mech_purpose_type_id = 'FACEBOOK_URL' AND description = 'Facebook Website URL' AND has_table = 'N');

INSERT INTO contact_mech_purpose_type (contact_mech_purpose_type_id, description, has_table)
SELECT 'LINKEDIN_URL', 'LinkedIn Website URL', 'N'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_purpose_type WHERE contact_mech_purpose_type_id = 'LINKEDIN_URL' AND description = 'LinkedIn Website URL' AND has_table = 'N');

INSERT INTO contact_mech_type (contact_mech_type_id, description, has_table)
SELECT 'ELECTRONIC_ADDRESS', 'Electronic Address', 'N'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_type WHERE contact_mech_type_id = 'ELECTRONIC_ADDRESS' AND description = 'Electronic Address' AND has_table = 'N');

INSERT INTO contact_mech_type (contact_mech_type_id, description, has_table)
SELECT 'POSTAL_ADDRESS', 'Postal Address', 'Y'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_type WHERE contact_mech_type_id = 'POSTAL_ADDRESS' AND description = 'Postal Address' AND has_table = 'Y');

INSERT INTO contact_mech_type (contact_mech_type_id, description, has_table)
SELECT 'TELECOM_NUMBER', 'Phone Number', 'Y'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_type WHERE contact_mech_type_id = 'TELECOM_NUMBER' AND description = 'Phone Number' AND has_table = 'Y');

INSERT INTO contact_mech_type (contact_mech_type_id, description, has_table, parent_type_id)
SELECT 'EMAIL_ADDRESS', 'Email Address', 'N', 'ELECTRONIC_ADDRESS'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_type WHERE contact_mech_type_id = 'EMAIL_ADDRESS' AND description = 'Email Address' AND has_table = 'N' AND parent_type_id = 'ELECTRONIC_ADDRESS');

INSERT INTO contact_mech_type (contact_mech_type_id, description, has_table, parent_type_id)
SELECT 'IP_ADDRESS', 'Internet IP Address', 'N', 'ELECTRONIC_ADDRESS'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_type WHERE contact_mech_type_id = 'IP_ADDRESS' AND description = 'Internet IP Address' AND has_table = 'N' AND parent_type_id = 'ELECTRONIC_ADDRESS');

INSERT INTO contact_mech_type (contact_mech_type_id, description, has_table, parent_type_id)
SELECT 'DOMAIN_NAME', 'Internet Domain Name', 'N', 'ELECTRONIC_ADDRESS'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_type WHERE contact_mech_type_id = 'DOMAIN_NAME' AND description = 'Internet Domain Name' AND has_table = 'N' AND parent_type_id = 'ELECTRONIC_ADDRESS');

INSERT INTO contact_mech_type (contact_mech_type_id, description, has_table, parent_type_id)
SELECT 'WEB_ADDRESS', 'Web URL/Address', 'N', 'ELECTRONIC_ADDRESS'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_type WHERE contact_mech_type_id = 'WEB_ADDRESS' AND description = 'Web URL/Address' AND has_table = 'N' AND parent_type_id = 'ELECTRONIC_ADDRESS');

INSERT INTO contact_mech_type (contact_mech_type_id, description, has_table, parent_type_id)
SELECT 'INTERNAL_PARTYID', 'Internal Note via partyId', 'N', 'ELECTRONIC_ADDRESS'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_type WHERE contact_mech_type_id = 'INTERNAL_PARTYID' AND description = 'Internal Note via partyId' AND has_table = 'N' AND parent_type_id = 'ELECTRONIC_ADDRESS');

INSERT INTO contact_mech_type (contact_mech_type_id, description, has_table, parent_type_id)
SELECT 'FTP_ADDRESS', 'Ftp server connection', 'Y', 'ELECTRONIC_ADDRESS'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_type WHERE contact_mech_type_id = 'FTP_ADDRESS' AND description = 'Ftp server connection' AND has_table = 'Y' AND parent_type_id = 'ELECTRONIC_ADDRESS');

INSERT INTO contact_mech_type_purpose (contact_mech_purpose_type_id, contact_mech_type_id)
SELECT 'BILLING_EMAIL', 'EMAIL_ADDRESS'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_type_purpose WHERE contact_mech_purpose_type_id = 'BILLING_EMAIL' AND contact_mech_type_id = 'EMAIL_ADDRESS');

INSERT INTO contact_mech_type_purpose (contact_mech_purpose_type_id, contact_mech_type_id)
SELECT 'MARKETING_EMAIL', 'EMAIL_ADDRESS'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_type_purpose WHERE contact_mech_purpose_type_id = 'MARKETING_EMAIL' AND contact_mech_type_id = 'EMAIL_ADDRESS');

INSERT INTO contact_mech_type_purpose (contact_mech_purpose_type_id, contact_mech_type_id)
SELECT 'PAYMENT_EMAIL', 'EMAIL_ADDRESS'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_type_purpose WHERE contact_mech_purpose_type_id = 'PAYMENT_EMAIL' AND contact_mech_type_id = 'EMAIL_ADDRESS');

INSERT INTO contact_mech_type_purpose (contact_mech_purpose_type_id, contact_mech_type_id)
SELECT 'ORDER_EMAIL', 'EMAIL_ADDRESS'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_type_purpose WHERE contact_mech_purpose_type_id = 'ORDER_EMAIL' AND contact_mech_type_id = 'EMAIL_ADDRESS');

INSERT INTO contact_mech_type_purpose (contact_mech_purpose_type_id, contact_mech_type_id)
SELECT 'OTHER_EMAIL', 'EMAIL_ADDRESS'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_type_purpose WHERE contact_mech_purpose_type_id = 'OTHER_EMAIL' AND contact_mech_type_id = 'EMAIL_ADDRESS');

INSERT INTO contact_mech_type_purpose (contact_mech_purpose_type_id, contact_mech_type_id)
SELECT 'PRIMARY_EMAIL', 'EMAIL_ADDRESS'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_type_purpose WHERE contact_mech_purpose_type_id = 'PRIMARY_EMAIL' AND contact_mech_type_id = 'EMAIL_ADDRESS');

INSERT INTO contact_mech_type_purpose (contact_mech_purpose_type_id, contact_mech_type_id)
SELECT 'SHIPPING_LOCATION', 'POSTAL_ADDRESS'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_type_purpose WHERE contact_mech_purpose_type_id = 'SHIPPING_LOCATION' AND contact_mech_type_id = 'POSTAL_ADDRESS');

INSERT INTO contact_mech_type_purpose (contact_mech_purpose_type_id, contact_mech_type_id)
SELECT 'SHIP_ORIG_LOCATION', 'POSTAL_ADDRESS'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_type_purpose WHERE contact_mech_purpose_type_id = 'SHIP_ORIG_LOCATION' AND contact_mech_type_id = 'POSTAL_ADDRESS');

INSERT INTO contact_mech_type_purpose (contact_mech_purpose_type_id, contact_mech_type_id)
SELECT 'BILLING_LOCATION', 'POSTAL_ADDRESS'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_type_purpose WHERE contact_mech_purpose_type_id = 'BILLING_LOCATION' AND contact_mech_type_id = 'POSTAL_ADDRESS');

INSERT INTO contact_mech_type_purpose (contact_mech_purpose_type_id, contact_mech_type_id)
SELECT 'PAYMENT_LOCATION', 'POSTAL_ADDRESS'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_type_purpose WHERE contact_mech_purpose_type_id = 'PAYMENT_LOCATION' AND contact_mech_type_id = 'POSTAL_ADDRESS');

INSERT INTO contact_mech_type_purpose (contact_mech_purpose_type_id, contact_mech_type_id)
SELECT 'GENERAL_LOCATION', 'POSTAL_ADDRESS'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_type_purpose WHERE contact_mech_purpose_type_id = 'GENERAL_LOCATION' AND contact_mech_type_id = 'POSTAL_ADDRESS');

INSERT INTO contact_mech_type_purpose (contact_mech_purpose_type_id, contact_mech_type_id)
SELECT 'PUR_RET_LOCATION', 'POSTAL_ADDRESS'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_type_purpose WHERE contact_mech_purpose_type_id = 'PUR_RET_LOCATION' AND contact_mech_type_id = 'POSTAL_ADDRESS');

INSERT INTO contact_mech_type_purpose (contact_mech_purpose_type_id, contact_mech_type_id)
SELECT 'PRIMARY_LOCATION', 'POSTAL_ADDRESS'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_type_purpose WHERE contact_mech_purpose_type_id = 'PRIMARY_LOCATION' AND contact_mech_type_id = 'POSTAL_ADDRESS');

INSERT INTO contact_mech_type_purpose (contact_mech_purpose_type_id, contact_mech_type_id)
SELECT 'PREVIOUS_LOCATION', 'POSTAL_ADDRESS'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_type_purpose WHERE contact_mech_purpose_type_id = 'PREVIOUS_LOCATION' AND contact_mech_type_id = 'POSTAL_ADDRESS');

INSERT INTO contact_mech_type_purpose (contact_mech_purpose_type_id, contact_mech_type_id)
SELECT 'FAX_NUMBER', 'TELECOM_NUMBER'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_type_purpose WHERE contact_mech_purpose_type_id = 'FAX_NUMBER' AND contact_mech_type_id = 'TELECOM_NUMBER');

INSERT INTO contact_mech_type_purpose (contact_mech_purpose_type_id, contact_mech_type_id)
SELECT 'FAX_NUMBER_SEC', 'TELECOM_NUMBER'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_type_purpose WHERE contact_mech_purpose_type_id = 'FAX_NUMBER_SEC' AND contact_mech_type_id = 'TELECOM_NUMBER');

INSERT INTO contact_mech_type_purpose (contact_mech_purpose_type_id, contact_mech_type_id)
SELECT 'PHONE_DID', 'TELECOM_NUMBER'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_type_purpose WHERE contact_mech_purpose_type_id = 'PHONE_DID' AND contact_mech_type_id = 'TELECOM_NUMBER');

INSERT INTO contact_mech_type_purpose (contact_mech_purpose_type_id, contact_mech_type_id)
SELECT 'PHONE_HOME', 'TELECOM_NUMBER'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_type_purpose WHERE contact_mech_purpose_type_id = 'PHONE_HOME' AND contact_mech_type_id = 'TELECOM_NUMBER');

INSERT INTO contact_mech_type_purpose (contact_mech_purpose_type_id, contact_mech_type_id)
SELECT 'PHONE_MOBILE', 'TELECOM_NUMBER'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_type_purpose WHERE contact_mech_purpose_type_id = 'PHONE_MOBILE' AND contact_mech_type_id = 'TELECOM_NUMBER');

INSERT INTO contact_mech_type_purpose (contact_mech_purpose_type_id, contact_mech_type_id)
SELECT 'PHONE_WORK', 'TELECOM_NUMBER'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_type_purpose WHERE contact_mech_purpose_type_id = 'PHONE_WORK' AND contact_mech_type_id = 'TELECOM_NUMBER');

INSERT INTO contact_mech_type_purpose (contact_mech_purpose_type_id, contact_mech_type_id)
SELECT 'PHONE_WORK_SEC', 'TELECOM_NUMBER'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_type_purpose WHERE contact_mech_purpose_type_id = 'PHONE_WORK_SEC' AND contact_mech_type_id = 'TELECOM_NUMBER');

INSERT INTO contact_mech_type_purpose (contact_mech_purpose_type_id, contact_mech_type_id)
SELECT 'PHONE_SHIPPING', 'TELECOM_NUMBER'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_type_purpose WHERE contact_mech_purpose_type_id = 'PHONE_SHIPPING' AND contact_mech_type_id = 'TELECOM_NUMBER');

INSERT INTO contact_mech_type_purpose (contact_mech_purpose_type_id, contact_mech_type_id)
SELECT 'PHONE_SHIP_ORIG', 'TELECOM_NUMBER'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_type_purpose WHERE contact_mech_purpose_type_id = 'PHONE_SHIP_ORIG' AND contact_mech_type_id = 'TELECOM_NUMBER');

INSERT INTO contact_mech_type_purpose (contact_mech_purpose_type_id, contact_mech_type_id)
SELECT 'PHONE_BILLING', 'TELECOM_NUMBER'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_type_purpose WHERE contact_mech_purpose_type_id = 'PHONE_BILLING' AND contact_mech_type_id = 'TELECOM_NUMBER');

INSERT INTO contact_mech_type_purpose (contact_mech_purpose_type_id, contact_mech_type_id)
SELECT 'PHONE_PAYMENT', 'TELECOM_NUMBER'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_type_purpose WHERE contact_mech_purpose_type_id = 'PHONE_PAYMENT' AND contact_mech_type_id = 'TELECOM_NUMBER');

INSERT INTO contact_mech_type_purpose (contact_mech_purpose_type_id, contact_mech_type_id)
SELECT 'PRIMARY_PHONE', 'TELECOM_NUMBER'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_type_purpose WHERE contact_mech_purpose_type_id = 'PRIMARY_PHONE' AND contact_mech_type_id = 'TELECOM_NUMBER');

INSERT INTO contact_mech_type_purpose (contact_mech_purpose_type_id, contact_mech_type_id)
SELECT 'PHONE_QUICK', 'TELECOM_NUMBER'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_type_purpose WHERE contact_mech_purpose_type_id = 'PHONE_QUICK' AND contact_mech_type_id = 'TELECOM_NUMBER');

INSERT INTO contact_mech_type_purpose (contact_mech_purpose_type_id, contact_mech_type_id)
SELECT 'FAX_SHIPPING', 'TELECOM_NUMBER'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_type_purpose WHERE contact_mech_purpose_type_id = 'FAX_SHIPPING' AND contact_mech_type_id = 'TELECOM_NUMBER');

INSERT INTO contact_mech_type_purpose (contact_mech_purpose_type_id, contact_mech_type_id)
SELECT 'FAX_BILLING', 'TELECOM_NUMBER'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_type_purpose WHERE contact_mech_purpose_type_id = 'FAX_BILLING' AND contact_mech_type_id = 'TELECOM_NUMBER');

INSERT INTO contact_mech_type_purpose (contact_mech_purpose_type_id, contact_mech_type_id)
SELECT 'PHONE_ASSISTANT', 'TELECOM_NUMBER'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_type_purpose WHERE contact_mech_purpose_type_id = 'PHONE_ASSISTANT' AND contact_mech_type_id = 'TELECOM_NUMBER');

INSERT INTO contact_mech_type_purpose (contact_mech_purpose_type_id, contact_mech_type_id)
SELECT 'PRIMARY_WEB_URL', 'WEB_ADDRESS'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_type_purpose WHERE contact_mech_purpose_type_id = 'PRIMARY_WEB_URL' AND contact_mech_type_id = 'WEB_ADDRESS');

INSERT INTO contact_mech_type_purpose (contact_mech_purpose_type_id, contact_mech_type_id)
SELECT 'TWITTER_URL', 'WEB_ADDRESS'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_type_purpose WHERE contact_mech_purpose_type_id = 'TWITTER_URL' AND contact_mech_type_id = 'WEB_ADDRESS');

INSERT INTO contact_mech_type_purpose (contact_mech_purpose_type_id, contact_mech_type_id)
SELECT 'FACEBOOK_URL', 'WEB_ADDRESS'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_type_purpose WHERE contact_mech_purpose_type_id = 'FACEBOOK_URL' AND contact_mech_type_id = 'WEB_ADDRESS');

INSERT INTO contact_mech_type_purpose (contact_mech_purpose_type_id, contact_mech_type_id)
SELECT 'LINKEDIN_URL', 'WEB_ADDRESS'
WHERE NOT EXISTS (SELECT 1 FROM contact_mech_type_purpose WHERE contact_mech_purpose_type_id = 'LINKEDIN_URL' AND contact_mech_type_id = 'WEB_ADDRESS');

INSERT INTO party_content_type (description, party_content_type_id)
SELECT 'Internal Content', 'INTERNAL'
WHERE NOT EXISTS (SELECT 1 FROM party_content_type WHERE description = 'Internal Content' AND party_content_type_id = 'INTERNAL');

INSERT INTO party_content_type (description, party_content_type_id)
SELECT 'User Defined Content', 'USERDEF'
WHERE NOT EXISTS (SELECT 1 FROM party_content_type WHERE description = 'User Defined Content' AND party_content_type_id = 'USERDEF');

INSERT INTO party_content_type (description, party_content_type_id)
SELECT 'Logo Image URL', 'LGOIMGURL'
WHERE NOT EXISTS (SELECT 1 FROM party_content_type WHERE description = 'Logo Image URL' AND party_content_type_id = 'LGOIMGURL');

INSERT INTO party_content_type (description, party_content_type_id)
SELECT 'Vendor Shipping Info', 'VNDSHPINF'
WHERE NOT EXISTS (SELECT 1 FROM party_content_type WHERE description = 'Vendor Shipping Info' AND party_content_type_id = 'VNDSHPINF');

INSERT INTO role_type (description, has_table, role_type_id)
SELECT 'Main Role', 'N', 'MAIN_ROLE'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Main Role' AND has_table = 'N' AND role_type_id = 'MAIN_ROLE');

INSERT INTO role_type (description, has_table, role_type_id)
SELECT 'Account Lead', 'N', 'ACCOUNT_LEAD'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Account Lead' AND has_table = 'N' AND role_type_id = 'ACCOUNT_LEAD');

INSERT INTO role_type (description, has_table, role_type_id)
SELECT 'Administrator', 'N', 'ADMIN'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Administrator' AND has_table = 'N' AND role_type_id = 'ADMIN');

INSERT INTO role_type (description, has_table, role_type_id)
SELECT 'Agent', 'N', 'AGENT'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Agent' AND has_table = 'N' AND role_type_id = 'AGENT');

INSERT INTO role_type (description, has_table, role_type_id)
SELECT 'Automated Agent', 'N', 'AUTOMATED_AGENT_ROLE'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Automated Agent' AND has_table = 'N' AND role_type_id = 'AUTOMATED_AGENT_ROLE');

INSERT INTO role_type (description, has_table, role_type_id)
SELECT 'Calendar', 'N', 'CALENDAR_ROLE'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Calendar' AND has_table = 'N' AND role_type_id = 'CALENDAR_ROLE');

INSERT INTO role_type (description, has_table, role_type_id)
SELECT 'Client', 'N', 'CLIENT'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Client' AND has_table = 'N' AND role_type_id = 'CLIENT');

INSERT INTO role_type (description, has_table, role_type_id)
SELECT 'Communication Participant', 'N', 'COMMEVENT_ROLE'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Communication Participant' AND has_table = 'N' AND role_type_id = 'COMMEVENT_ROLE');

INSERT INTO role_type (description, has_table, role_type_id)
SELECT 'Consumer', 'N', 'CONSUMER'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Consumer' AND has_table = 'N' AND role_type_id = 'CONSUMER');

INSERT INTO role_type (description, has_table, role_type_id)
SELECT 'Contractor', 'N', 'CONTRACTOR'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Contractor' AND has_table = 'N' AND role_type_id = 'CONTRACTOR');

INSERT INTO role_type (description, has_table, role_type_id)
SELECT 'Customer', 'N', 'CUSTOMER'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Customer' AND has_table = 'N' AND role_type_id = 'CUSTOMER');

INSERT INTO role_type (description, has_table, role_type_id)
SELECT 'Distribution Channel', 'N', 'DISTRIBUTION_CHANNEL'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Distribution Channel' AND has_table = 'N' AND role_type_id = 'DISTRIBUTION_CHANNEL');

INSERT INTO role_type (description, has_table, role_type_id)
SELECT 'ISP', 'N', 'ISP'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'ISP' AND has_table = 'N' AND role_type_id = 'ISP');

INSERT INTO role_type (description, has_table, role_type_id)
SELECT 'Hosting Server', 'N', 'HOSTING_SERVER'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Hosting Server' AND has_table = 'N' AND role_type_id = 'HOSTING_SERVER');

INSERT INTO role_type (description, has_table, role_type_id)
SELECT 'Manufacturer', 'N', 'MANUFACTURER'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Manufacturer' AND has_table = 'N' AND role_type_id = 'MANUFACTURER');

INSERT INTO role_type (description, has_table, role_type_id)
SELECT 'Not Applicable', 'N', '_NA_'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Not Applicable' AND has_table = 'N' AND role_type_id = '_NA_');

INSERT INTO role_type (description, has_table, parent_type_id, role_type_id)
SELECT 'Organization', 'N', 'MAIN_ROLE', 'ORGANIZATION_ROLE'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Organization' AND has_table = 'N' AND parent_type_id = 'MAIN_ROLE' AND role_type_id = 'ORGANIZATION_ROLE');

INSERT INTO role_type (description, has_table, role_type_id)
SELECT 'Owner', 'N', 'OWNER'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Owner' AND has_table = 'N' AND role_type_id = 'OWNER');

INSERT INTO role_type (description, has_table, role_type_id)
SELECT 'Prospect', 'N', 'PROSPECT'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Prospect' AND has_table = 'N' AND role_type_id = 'PROSPECT');

INSERT INTO role_type (description, has_table, role_type_id)
SELECT 'Person', 'N', 'PERSON_ROLE'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Person' AND has_table = 'N' AND role_type_id = 'PERSON_ROLE');

INSERT INTO role_type (description, has_table, role_type_id)
SELECT 'Referrer', 'N', 'REFERRER'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Referrer' AND has_table = 'N' AND role_type_id = 'REFERRER');

INSERT INTO role_type (description, has_table, role_type_id)
SELECT 'Request Role', 'N', 'REQUEST_ROLE'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Request Role' AND has_table = 'N' AND role_type_id = 'REQUEST_ROLE');

INSERT INTO role_type (description, has_table, parent_type_id, role_type_id)
SELECT 'Request Manager', 'N', 'REQUEST_ROLE', 'REQ_MANAGER'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Request Manager' AND has_table = 'N' AND parent_type_id = 'REQUEST_ROLE' AND role_type_id = 'REQ_MANAGER');

INSERT INTO role_type (description, has_table, parent_type_id, role_type_id)
SELECT 'Requesting Party', 'N', 'REQUEST_ROLE', 'REQ_REQUESTER'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Requesting Party' AND has_table = 'N' AND parent_type_id = 'REQUEST_ROLE' AND role_type_id = 'REQ_REQUESTER');

INSERT INTO role_type (description, has_table, parent_type_id, role_type_id)
SELECT 'Request Taker', 'N', 'REQUEST_ROLE', 'REQ_TAKER'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Request Taker' AND has_table = 'N' AND parent_type_id = 'REQUEST_ROLE' AND role_type_id = 'REQ_TAKER');

INSERT INTO role_type (description, has_table, parent_type_id, role_type_id)
SELECT 'Request Respondent', 'N', 'REQUEST_ROLE', 'REQ_RESPOND'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Request Respondent' AND has_table = 'N' AND parent_type_id = 'REQUEST_ROLE' AND role_type_id = 'REQ_RESPOND');

INSERT INTO role_type (description, has_table, parent_type_id, role_type_id)
SELECT 'Sales Force Autm.', 'N', 'MAIN_ROLE', 'SFA_ROLE'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Sales Force Autm.' AND has_table = 'N' AND parent_type_id = 'MAIN_ROLE' AND role_type_id = 'SFA_ROLE');

INSERT INTO role_type (description, has_table, role_type_id)
SELECT 'Shareholder', 'N', 'SHAREHOLDER'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Shareholder' AND has_table = 'N' AND role_type_id = 'SHAREHOLDER');

INSERT INTO role_type (description, has_table, role_type_id)
SELECT 'Subscriber', 'N', 'SUBSCRIBER'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Subscriber' AND has_table = 'N' AND role_type_id = 'SUBSCRIBER');

INSERT INTO role_type (description, has_table, role_type_id)
SELECT 'Vendor', 'N', 'VENDOR'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Vendor' AND has_table = 'N' AND role_type_id = 'VENDOR');

INSERT INTO role_type (description, has_table, role_type_id)
SELECT 'Visitor', 'N', 'VISITOR'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Visitor' AND has_table = 'N' AND role_type_id = 'VISITOR');

INSERT INTO role_type (description, has_table, role_type_id)
SELECT 'Web Master', 'N', 'WEB_MASTER'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Web Master' AND has_table = 'N' AND role_type_id = 'WEB_MASTER');

INSERT INTO role_type (description, has_table, role_type_id)
SELECT 'Workflow', 'N', 'WORKFLOW_ROLE'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Workflow' AND has_table = 'N' AND role_type_id = 'WORKFLOW_ROLE');

INSERT INTO role_type (description, has_table, role_type_id)
SELECT 'Accountant', 'N', 'ACCOUNTANT'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Accountant' AND has_table = 'N' AND role_type_id = 'ACCOUNTANT');

INSERT INTO role_type (description, has_table, parent_type_id, role_type_id)
SELECT 'Account', 'N', 'SFA_ROLE', 'ACCOUNT'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Account' AND has_table = 'N' AND parent_type_id = 'SFA_ROLE' AND role_type_id = 'ACCOUNT');

INSERT INTO role_type (description, has_table, parent_type_id, role_type_id)
SELECT 'Addressee', 'N', 'COMMEVENT_ROLE', 'ADDRESSEE'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Addressee' AND has_table = 'N' AND parent_type_id = 'COMMEVENT_ROLE' AND role_type_id = 'ADDRESSEE');

INSERT INTO role_type (description, has_table, parent_type_id, role_type_id)
SELECT 'Association', 'N', 'ORGANIZATION_ROLE', 'ASSOCIATION'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Association' AND has_table = 'N' AND parent_type_id = 'ORGANIZATION_ROLE' AND role_type_id = 'ASSOCIATION');

INSERT INTO role_type (description, has_table, parent_type_id, role_type_id)
SELECT 'Bill-From Vendor', 'N', 'VENDOR', 'BILL_FROM_VENDOR'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Bill-From Vendor' AND has_table = 'N' AND parent_type_id = 'VENDOR' AND role_type_id = 'BILL_FROM_VENDOR');

INSERT INTO role_type (description, has_table, parent_type_id, role_type_id)
SELECT 'Bill-To Customer', 'N', 'CUSTOMER', 'BILL_TO_CUSTOMER'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Bill-To Customer' AND has_table = 'N' AND parent_type_id = 'CUSTOMER' AND role_type_id = 'BILL_TO_CUSTOMER');

INSERT INTO role_type (description, has_table, parent_type_id, role_type_id)
SELECT 'Blind Copy', 'N', 'COMMEVENT_ROLE', 'BCC'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Blind Copy' AND has_table = 'N' AND parent_type_id = 'COMMEVENT_ROLE' AND role_type_id = 'BCC');

INSERT INTO role_type (description, has_table, parent_type_id, role_type_id)
SELECT 'Bulk Customer', 'N', 'CUSTOMER', 'BULK_CUSTOMER'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Bulk Customer' AND has_table = 'N' AND parent_type_id = 'CUSTOMER' AND role_type_id = 'BULK_CUSTOMER');

INSERT INTO role_type (description, has_table, parent_type_id, role_type_id)
SELECT 'Calendar Attendee', 'N', 'CALENDAR_ROLE', 'CAL_ATTENDEE'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Calendar Attendee' AND has_table = 'N' AND parent_type_id = 'CALENDAR_ROLE' AND role_type_id = 'CAL_ATTENDEE');

INSERT INTO role_type (description, has_table, parent_type_id, role_type_id)
SELECT 'Calendar Delegate', 'N', 'CALENDAR_ROLE', 'CAL_DELEGATE'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Calendar Delegate' AND has_table = 'N' AND parent_type_id = 'CALENDAR_ROLE' AND role_type_id = 'CAL_DELEGATE');

INSERT INTO role_type (description, has_table, parent_type_id, role_type_id)
SELECT 'Calendar Host', 'N', 'CALENDAR_ROLE', 'CAL_HOST'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Calendar Host' AND has_table = 'N' AND parent_type_id = 'CALENDAR_ROLE' AND role_type_id = 'CAL_HOST');

INSERT INTO role_type (description, has_table, parent_type_id, role_type_id)
SELECT 'Calendar Organizer', 'N', 'CALENDAR_ROLE', 'CAL_ORGANIZER'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Calendar Organizer' AND has_table = 'N' AND parent_type_id = 'CALENDAR_ROLE' AND role_type_id = 'CAL_ORGANIZER');

INSERT INTO role_type (description, has_table, parent_type_id, role_type_id)
SELECT 'Calendar Owner', 'N', 'CALENDAR_ROLE', 'CAL_OWNER'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Calendar Owner' AND has_table = 'N' AND parent_type_id = 'CALENDAR_ROLE' AND role_type_id = 'CAL_OWNER');

INSERT INTO role_type (description, has_table, parent_type_id, role_type_id)
SELECT 'Carrier', 'N', 'ORGANIZATION_ROLE', 'CARRIER'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Carrier' AND has_table = 'N' AND parent_type_id = 'ORGANIZATION_ROLE' AND role_type_id = 'CARRIER');

INSERT INTO role_type (description, has_table, parent_type_id, role_type_id)
SELECT 'Competitor', 'N', 'ORGANIZATION_ROLE', 'COMPETITOR'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Competitor' AND has_table = 'N' AND parent_type_id = 'ORGANIZATION_ROLE' AND role_type_id = 'COMPETITOR');

INSERT INTO role_type (description, has_table, parent_type_id, role_type_id)
SELECT 'Contact', 'N', 'SFA_ROLE', 'CONTACT'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Contact' AND has_table = 'N' AND parent_type_id = 'SFA_ROLE' AND role_type_id = 'CONTACT');

INSERT INTO role_type (description, has_table, parent_type_id, role_type_id)
SELECT 'Carbon Copy', 'N', 'COMMEVENT_ROLE', 'CC'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Carbon Copy' AND has_table = 'N' AND parent_type_id = 'COMMEVENT_ROLE' AND role_type_id = 'CC');

INSERT INTO role_type (description, has_table, parent_type_id, role_type_id)
SELECT 'Originator', 'N', 'COMMEVENT_ROLE', 'ORIGINATOR'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Originator' AND has_table = 'N' AND parent_type_id = 'COMMEVENT_ROLE' AND role_type_id = 'ORIGINATOR');

INSERT INTO role_type (description, has_table, parent_type_id, role_type_id)
SELECT 'Distributor', 'N', 'DISTRIBUTION_CHANNEL', 'DISTRIBUTOR'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Distributor' AND has_table = 'N' AND parent_type_id = 'DISTRIBUTION_CHANNEL' AND role_type_id = 'DISTRIBUTOR');

INSERT INTO role_type (description, has_table, parent_type_id, role_type_id)
SELECT 'Employee', 'N', 'PERSON_ROLE', 'EMPLOYEE'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Employee' AND has_table = 'N' AND parent_type_id = 'PERSON_ROLE' AND role_type_id = 'EMPLOYEE');

INSERT INTO role_type (description, has_table, parent_type_id, role_type_id)
SELECT 'Employer', 'N', 'ORGANIZATION_ROLE', 'EMPLOYER'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Employer' AND has_table = 'N' AND parent_type_id = 'ORGANIZATION_ROLE' AND role_type_id = 'EMPLOYER');

INSERT INTO role_type (description, has_table, parent_type_id, role_type_id)
SELECT 'End-User Customer', 'N', 'CUSTOMER', 'END_USER_CUSTOMER'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'End-User Customer' AND has_table = 'N' AND parent_type_id = 'CUSTOMER' AND role_type_id = 'END_USER_CUSTOMER');

INSERT INTO role_type (description, has_table, parent_type_id, role_type_id)
SELECT 'Household', 'N', 'ORGANIZATION_ROLE', 'HOUSEHOLD'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Household' AND has_table = 'N' AND parent_type_id = 'ORGANIZATION_ROLE' AND role_type_id = 'HOUSEHOLD');

INSERT INTO role_type (description, has_table, parent_type_id, role_type_id)
SELECT 'Internal Organization', 'Y', 'ORGANIZATION_ROLE', 'INTERNAL_ORGANIZATIO'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Internal Organization' AND has_table = 'Y' AND parent_type_id = 'ORGANIZATION_ROLE' AND role_type_id = 'INTERNAL_ORGANIZATIO');

INSERT INTO role_type (description, has_table, parent_type_id, role_type_id)
SELECT 'Lead', 'N', 'SFA_ROLE', 'LEAD'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Lead' AND has_table = 'N' AND parent_type_id = 'SFA_ROLE' AND role_type_id = 'LEAD');

INSERT INTO role_type (description, has_table, parent_type_id, role_type_id)
SELECT 'Limited Administrator', 'N', 'ADMIN', 'LTD_ADMIN'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Limited Administrator' AND has_table = 'N' AND parent_type_id = 'ADMIN' AND role_type_id = 'LTD_ADMIN');

INSERT INTO role_type (description, has_table, parent_type_id, role_type_id)
SELECT 'Organization Unit', 'N', 'ORGANIZATION_ROLE', 'ORGANIZATION_UNIT'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Organization Unit' AND has_table = 'N' AND parent_type_id = 'ORGANIZATION_ROLE' AND role_type_id = 'ORGANIZATION_UNIT');

INSERT INTO role_type (description, has_table, parent_type_id, role_type_id)
SELECT 'Partner', 'N', 'ORGANIZATION_ROLE', 'PARTNER'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Partner' AND has_table = 'N' AND parent_type_id = 'ORGANIZATION_ROLE' AND role_type_id = 'PARTNER');

INSERT INTO role_type (description, has_table, parent_type_id, role_type_id)
SELECT 'Placing Customer', 'N', 'CUSTOMER', 'PLACING_CUSTOMER'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Placing Customer' AND has_table = 'N' AND parent_type_id = 'CUSTOMER' AND role_type_id = 'PLACING_CUSTOMER');

INSERT INTO role_type (description, has_table, parent_type_id, role_type_id)
SELECT 'Regulatory Agency', 'N', 'ORGANIZATION_ROLE', 'REGULATORY_AGENCY'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Regulatory Agency' AND has_table = 'N' AND parent_type_id = 'ORGANIZATION_ROLE' AND role_type_id = 'REGULATORY_AGENCY');

INSERT INTO role_type (description, has_table, parent_type_id, role_type_id)
SELECT 'Sales Representative', 'N', 'PERSON_ROLE', 'SALES_REP'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Sales Representative' AND has_table = 'N' AND parent_type_id = 'PERSON_ROLE' AND role_type_id = 'SALES_REP');

INSERT INTO role_type (description, has_table, parent_type_id, role_type_id)
SELECT 'Ship-From Vendor', 'N', 'VENDOR', 'SHIP_FROM_VENDOR'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Ship-From Vendor' AND has_table = 'N' AND parent_type_id = 'VENDOR' AND role_type_id = 'SHIP_FROM_VENDOR');

INSERT INTO role_type (description, has_table, parent_type_id, role_type_id)
SELECT 'Ship-To Customer', 'N', 'CUSTOMER', 'SHIP_TO_CUSTOMER'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Ship-To Customer' AND has_table = 'N' AND parent_type_id = 'CUSTOMER' AND role_type_id = 'SHIP_TO_CUSTOMER');

INSERT INTO role_type (description, has_table, parent_type_id, role_type_id)
SELECT 'Sponsor', 'N', 'PERSON_ROLE', 'SPONSOR'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Sponsor' AND has_table = 'N' AND parent_type_id = 'PERSON_ROLE' AND role_type_id = 'SPONSOR');

INSERT INTO role_type (description, has_table, parent_type_id, role_type_id)
SELECT 'Spouse', 'N', 'PERSON_ROLE', 'SPOUSE'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Spouse' AND has_table = 'N' AND parent_type_id = 'PERSON_ROLE' AND role_type_id = 'SPOUSE');

INSERT INTO role_type (description, has_table, parent_type_id, role_type_id)
SELECT 'Supplier Agent', 'N', 'PERSON_ROLE', 'SUPPLIER_AGENT'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Supplier Agent' AND has_table = 'N' AND parent_type_id = 'PERSON_ROLE' AND role_type_id = 'SUPPLIER_AGENT');

INSERT INTO role_type (description, has_table, parent_type_id, role_type_id)
SELECT 'Supplier', 'N', 'ORGANIZATION_ROLE', 'SUPPLIER'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Supplier' AND has_table = 'N' AND parent_type_id = 'ORGANIZATION_ROLE' AND role_type_id = 'SUPPLIER');

INSERT INTO role_type (description, has_table, parent_type_id, role_type_id)
SELECT 'Tax Authority', 'N', 'ORGANIZATION_ROLE', 'TAX_AUTHORITY'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Tax Authority' AND has_table = 'N' AND parent_type_id = 'ORGANIZATION_ROLE' AND role_type_id = 'TAX_AUTHORITY');

INSERT INTO role_type (description, has_table, parent_type_id, role_type_id)
SELECT 'Union', 'N', 'ORGANIZATION_ROLE', 'UNION'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Union' AND has_table = 'N' AND parent_type_id = 'ORGANIZATION_ROLE' AND role_type_id = 'UNION');

INSERT INTO role_type (description, has_table, parent_type_id, role_type_id)
SELECT 'Workflow Owner', 'N', 'WORKFLOW_ROLE', 'WF_OWNER'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Workflow Owner' AND has_table = 'N' AND parent_type_id = 'WORKFLOW_ROLE' AND role_type_id = 'WF_OWNER');

INSERT INTO role_type (description, has_table, parent_type_id, role_type_id)
SELECT 'Government Agency', 'N', 'ORGANIZATION_ROLE', 'GOV_AGENCY'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Government Agency' AND has_table = 'N' AND parent_type_id = 'ORGANIZATION_ROLE' AND role_type_id = 'GOV_AGENCY');

INSERT INTO role_type (description, has_table, parent_type_id, role_type_id)
SELECT 'Affiliate', 'N', 'SALES_REP', 'AFFILIATE'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Affiliate' AND has_table = 'N' AND parent_type_id = 'SALES_REP' AND role_type_id = 'AFFILIATE');

INSERT INTO role_type (description, has_table, parent_type_id, role_type_id)
SELECT 'Buyer', 'N', 'EMPLOYEE', 'BUYER'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Buyer' AND has_table = 'N' AND parent_type_id = 'EMPLOYEE' AND role_type_id = 'BUYER');

INSERT INTO role_type (description, has_table, parent_type_id, role_type_id)
SELECT 'Cashier', 'N', 'EMPLOYEE', 'CASHIER'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Cashier' AND has_table = 'N' AND parent_type_id = 'EMPLOYEE' AND role_type_id = 'CASHIER');

INSERT INTO role_type (description, has_table, parent_type_id, role_type_id)
SELECT 'Department', 'N', 'ORGANIZATION_UNIT', 'DEPARTMENT'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Department' AND has_table = 'N' AND parent_type_id = 'ORGANIZATION_UNIT' AND role_type_id = 'DEPARTMENT');

INSERT INTO role_type (description, has_table, parent_type_id, role_type_id)
SELECT 'Division', 'N', 'ORGANIZATION_UNIT', 'DIVISION'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Division' AND has_table = 'N' AND parent_type_id = 'ORGANIZATION_UNIT' AND role_type_id = 'DIVISION');

INSERT INTO role_type (description, has_table, parent_type_id, role_type_id)
SELECT 'Family Member', 'N', 'PERSON_ROLE', 'FAMILY_MEMBER'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Family Member' AND has_table = 'N' AND parent_type_id = 'PERSON_ROLE' AND role_type_id = 'FAMILY_MEMBER');

INSERT INTO role_type (description, has_table, parent_type_id, role_type_id)
SELECT 'Manager', 'N', 'EMPLOYEE', 'MANAGER'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Manager' AND has_table = 'N' AND parent_type_id = 'EMPLOYEE' AND role_type_id = 'MANAGER');

INSERT INTO role_type (description, has_table, parent_type_id, role_type_id)
SELECT 'Order Clerk', 'N', 'EMPLOYEE', 'ORDER_CLERK'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Order Clerk' AND has_table = 'N' AND parent_type_id = 'EMPLOYEE' AND role_type_id = 'ORDER_CLERK');

INSERT INTO role_type (description, has_table, parent_type_id, role_type_id)
SELECT 'Other Internal', 'N', 'INTERNAL_ORGANIZATIO', 'OTHER_INTERNAL_ORGAN'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Other Internal' AND has_table = 'N' AND parent_type_id = 'INTERNAL_ORGANIZATIO' AND role_type_id = 'OTHER_INTERNAL_ORGAN');

INSERT INTO role_type (description, has_table, parent_type_id, role_type_id)
SELECT 'Other Organization Unit', 'N', 'ORGANIZATION_UNIT', 'OTHER_ORGANIZATION_U'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Other Organization Unit' AND has_table = 'N' AND parent_type_id = 'ORGANIZATION_UNIT' AND role_type_id = 'OTHER_ORGANIZATION_U');

INSERT INTO role_type (description, has_table, parent_type_id, role_type_id)
SELECT 'Parent Organization', 'N', 'ORGANIZATION_UNIT', 'PARENT_ORGANIZATION'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Parent Organization' AND has_table = 'N' AND parent_type_id = 'ORGANIZATION_UNIT' AND role_type_id = 'PARENT_ORGANIZATION');

INSERT INTO role_type (description, has_table, parent_type_id, role_type_id)
SELECT 'Packer', 'N', 'EMPLOYEE', 'PACKER'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Packer' AND has_table = 'N' AND parent_type_id = 'EMPLOYEE' AND role_type_id = 'PACKER');

INSERT INTO role_type (description, has_table, parent_type_id, role_type_id)
SELECT 'Picker', 'N', 'EMPLOYEE', 'PICKER'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Picker' AND has_table = 'N' AND parent_type_id = 'EMPLOYEE' AND role_type_id = 'PICKER');

INSERT INTO role_type (description, has_table, parent_type_id, role_type_id)
SELECT 'Receiver', 'N', 'EMPLOYEE', 'RECEIVER'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Receiver' AND has_table = 'N' AND parent_type_id = 'EMPLOYEE' AND role_type_id = 'RECEIVER');

INSERT INTO role_type (description, has_table, parent_type_id, role_type_id)
SELECT 'Shipment Clerk', 'N', 'EMPLOYEE', 'SHIPMENT_CLERK'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Shipment Clerk' AND has_table = 'N' AND parent_type_id = 'EMPLOYEE' AND role_type_id = 'SHIPMENT_CLERK');

INSERT INTO role_type (description, has_table, parent_type_id, role_type_id)
SELECT 'Stocker', 'N', 'EMPLOYEE', 'STOCKER'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Stocker' AND has_table = 'N' AND parent_type_id = 'EMPLOYEE' AND role_type_id = 'STOCKER');

INSERT INTO role_type (description, has_table, parent_type_id, role_type_id)
SELECT 'Subsidiary', 'N', 'ORGANIZATION_UNIT', 'SUBSIDIARY'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Subsidiary' AND has_table = 'N' AND parent_type_id = 'ORGANIZATION_UNIT' AND role_type_id = 'SUBSIDIARY');

INSERT INTO role_type (description, has_table, parent_type_id, role_type_id)
SELECT 'Worker', 'N', 'EMPLOYEE', 'WORKER'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Worker' AND has_table = 'N' AND parent_type_id = 'EMPLOYEE' AND role_type_id = 'WORKER');

INSERT INTO role_type (description, has_table, parent_type_id, role_type_id)
SELECT 'Email Administrator', 'N', 'PERSON_ROLE', 'EMAIL_ADMIN'
WHERE NOT EXISTS (SELECT 1 FROM role_type WHERE description = 'Email Administrator' AND has_table = 'N' AND parent_type_id = 'PERSON_ROLE' AND role_type_id = 'EMAIL_ADMIN');

INSERT INTO party_classification_type (description, has_table, party_classification_type_id)
SELECT 'EEOC (Equal Opportunity)', 'N', 'EEOC_CLASSIFICATION'
WHERE NOT EXISTS (SELECT 1 FROM party_classification_type WHERE description = 'EEOC (Equal Opportunity)' AND has_table = 'N' AND party_classification_type_id = 'EEOC_CLASSIFICATION');

INSERT INTO party_classification_type (description, has_table, party_classification_type_id)
SELECT 'Minority', 'N', 'MINORITY_CLASSIFICAT'
WHERE NOT EXISTS (SELECT 1 FROM party_classification_type WHERE description = 'Minority' AND has_table = 'N' AND party_classification_type_id = 'MINORITY_CLASSIFICAT');

INSERT INTO party_classification_type (description, has_table, party_classification_type_id)
SELECT 'Income', 'N', 'INCOME_CLASSIFICATIO'
WHERE NOT EXISTS (SELECT 1 FROM party_classification_type WHERE description = 'Income' AND has_table = 'N' AND party_classification_type_id = 'INCOME_CLASSIFICATIO');

INSERT INTO party_classification_type (description, has_table, party_classification_type_id)
SELECT 'Industry', 'N', 'INDUSTRY_CLASSIFICAT'
WHERE NOT EXISTS (SELECT 1 FROM party_classification_type WHERE description = 'Industry' AND has_table = 'N' AND party_classification_type_id = 'INDUSTRY_CLASSIFICAT');

INSERT INTO party_classification_type (description, has_table, party_classification_type_id)
SELECT 'Organization', 'N', 'ORGANIZATION_CLASSIF'
WHERE NOT EXISTS (SELECT 1 FROM party_classification_type WHERE description = 'Organization' AND has_table = 'N' AND party_classification_type_id = 'ORGANIZATION_CLASSIF');

INSERT INTO party_classification_type (description, has_table, party_classification_type_id)
SELECT 'Person', 'N', 'PERSON_CLASSIFICATIO'
WHERE NOT EXISTS (SELECT 1 FROM party_classification_type WHERE description = 'Person' AND has_table = 'N' AND party_classification_type_id = 'PERSON_CLASSIFICATIO');

INSERT INTO party_classification_type (description, has_table, party_classification_type_id)
SELECT 'Size', 'N', 'SIZE_CLASSIFICATION'
WHERE NOT EXISTS (SELECT 1 FROM party_classification_type WHERE description = 'Size' AND has_table = 'N' AND party_classification_type_id = 'SIZE_CLASSIFICATION');

INSERT INTO party_classification_type (description, has_table, party_classification_type_id)
SELECT 'Trade', 'N', 'TRADE_CLASSIFICATION'
WHERE NOT EXISTS (SELECT 1 FROM party_classification_type WHERE description = 'Trade' AND has_table = 'N' AND party_classification_type_id = 'TRADE_CLASSIFICATION');

INSERT INTO party_classification_type (description, has_table, parent_type_id, party_classification_type_id)
SELECT 'Wholesale', 'N', 'TRADE_CLASSIFICATION', 'TRADE_WHOLE_CLASSIFI'
WHERE NOT EXISTS (SELECT 1 FROM party_classification_type WHERE description = 'Wholesale' AND has_table = 'N' AND parent_type_id = 'TRADE_CLASSIFICATION' AND party_classification_type_id = 'TRADE_WHOLE_CLASSIFI');

INSERT INTO party_classification_type (description, has_table, parent_type_id, party_classification_type_id)
SELECT 'Retail', 'N', 'TRADE_CLASSIFICATION', 'TRADE_RETAIL_CLASSIF'
WHERE NOT EXISTS (SELECT 1 FROM party_classification_type WHERE description = 'Retail' AND has_table = 'N' AND parent_type_id = 'TRADE_CLASSIFICATION' AND party_classification_type_id = 'TRADE_RETAIL_CLASSIF');

INSERT INTO party_classification_type (description, has_table, party_classification_type_id)
SELECT 'Annual Revenue', 'N', 'ANNUAL_REVENUE'
WHERE NOT EXISTS (SELECT 1 FROM party_classification_type WHERE description = 'Annual Revenue' AND has_table = 'N' AND party_classification_type_id = 'ANNUAL_REVENUE');

INSERT INTO party_classification_type (description, has_table, party_classification_type_id)
SELECT 'Number of Employees', 'N', 'NUMBER_OF_EMPLOYEES'
WHERE NOT EXISTS (SELECT 1 FROM party_classification_type WHERE description = 'Number of Employees' AND has_table = 'N' AND party_classification_type_id = 'NUMBER_OF_EMPLOYEES');

INSERT INTO party_classification_type (description, has_table, party_classification_type_id)
SELECT 'Value Rating', 'N', 'VALUE_RATING'
WHERE NOT EXISTS (SELECT 1 FROM party_classification_type WHERE description = 'Value Rating' AND has_table = 'N' AND party_classification_type_id = 'VALUE_RATING');

INSERT INTO party_classification_type (description, has_table, party_classification_type_id)
SELECT 'SIC Code', 'N', 'SIC_CODE'
WHERE NOT EXISTS (SELECT 1 FROM party_classification_type WHERE description = 'SIC Code' AND has_table = 'N' AND party_classification_type_id = 'SIC_CODE');

INSERT INTO party_classification_type (description, has_table, party_classification_type_id)
SELECT 'Ownership', 'N', 'OWNERSHIP'
WHERE NOT EXISTS (SELECT 1 FROM party_classification_type WHERE description = 'Ownership' AND has_table = 'N' AND party_classification_type_id = 'OWNERSHIP');

INSERT INTO party_classification_type (description, has_table, party_classification_type_id)
SELECT 'Region', 'N', 'REGION'
WHERE NOT EXISTS (SELECT 1 FROM party_classification_type WHERE description = 'Region' AND has_table = 'N' AND party_classification_type_id = 'REGION');

INSERT INTO party_relationship_type (has_table, party_relationship_name, party_relationship_type_id)
SELECT 'N', 'Agent', 'AGENT'
WHERE NOT EXISTS (SELECT 1 FROM party_relationship_type WHERE has_table = 'N' AND party_relationship_name = 'Agent' AND party_relationship_type_id = 'AGENT');

INSERT INTO party_relationship_type (has_table, party_relationship_name, party_relationship_type_id)
SELECT 'N', 'Child', 'CHILD'
WHERE NOT EXISTS (SELECT 1 FROM party_relationship_type WHERE has_table = 'N' AND party_relationship_name = 'Child' AND party_relationship_type_id = 'CHILD');

INSERT INTO party_relationship_type (has_table, party_relationship_name, party_relationship_type_id)
SELECT 'N', 'Contact Relation', 'CONTACT_REL'
WHERE NOT EXISTS (SELECT 1 FROM party_relationship_type WHERE has_table = 'N' AND party_relationship_name = 'Contact Relation' AND party_relationship_type_id = 'CONTACT_REL');

INSERT INTO party_relationship_type (has_table, party_relationship_name, party_relationship_type_id)
SELECT 'N', 'Lead Relation', 'LEAD_REL'
WHERE NOT EXISTS (SELECT 1 FROM party_relationship_type WHERE has_table = 'N' AND party_relationship_name = 'Lead Relation' AND party_relationship_type_id = 'LEAD_REL');

INSERT INTO party_relationship_type (has_table, party_relationship_name, party_relationship_type_id)
SELECT 'N', 'Lead Owned by', 'LEAD_OWNER'
WHERE NOT EXISTS (SELECT 1 FROM party_relationship_type WHERE has_table = 'N' AND party_relationship_name = 'Lead Owned by' AND party_relationship_type_id = 'LEAD_OWNER');

INSERT INTO party_relationship_type (has_table, party_relationship_name, party_relationship_type_id, role_type_id_valid_from)
SELECT 'N', 'Customer', 'CUSTOMER_REL', 'CUSTOMER'
WHERE NOT EXISTS (SELECT 1 FROM party_relationship_type WHERE has_table = 'N' AND party_relationship_name = 'Customer' AND party_relationship_type_id = 'CUSTOMER_REL' AND role_type_id_valid_from = 'CUSTOMER');

INSERT INTO party_relationship_type (has_table, party_relationship_name, party_relationship_type_id)
SELECT 'N', 'Distributor', 'DISTRIBUTION_CHANNEL'
WHERE NOT EXISTS (SELECT 1 FROM party_relationship_type WHERE has_table = 'N' AND party_relationship_name = 'Distributor' AND party_relationship_type_id = 'DISTRIBUTION_CHANNEL');

INSERT INTO party_relationship_type (has_table, party_relationship_name, party_relationship_type_id)
SELECT 'Y', 'Employment', 'EMPLOYMENT'
WHERE NOT EXISTS (SELECT 1 FROM party_relationship_type WHERE has_table = 'Y' AND party_relationship_name = 'Employment' AND party_relationship_type_id = 'EMPLOYMENT');

INSERT INTO party_relationship_type (has_table, party_relationship_name, party_relationship_type_id)
SELECT 'N', 'Friend', 'FRIEND'
WHERE NOT EXISTS (SELECT 1 FROM party_relationship_type WHERE has_table = 'N' AND party_relationship_name = 'Friend' AND party_relationship_type_id = 'FRIEND');

INSERT INTO party_relationship_type (has_table, party_relationship_name, party_relationship_type_id)
SELECT 'N', 'Group Member', 'GROUP_ROLLUP'
WHERE NOT EXISTS (SELECT 1 FROM party_relationship_type WHERE has_table = 'N' AND party_relationship_name = 'Group Member' AND party_relationship_type_id = 'GROUP_ROLLUP');

INSERT INTO party_relationship_type (has_table, party_relationship_name, party_relationship_type_id)
SELECT 'N', 'Host Server Visitor', 'HOST_SERVER_VISITOR'
WHERE NOT EXISTS (SELECT 1 FROM party_relationship_type WHERE has_table = 'N' AND party_relationship_name = 'Host Server Visitor' AND party_relationship_type_id = 'HOST_SERVER_VISITOR');

INSERT INTO party_relationship_type (has_table, party_relationship_name, party_relationship_type_id)
SELECT 'N', 'ISP Visitor', 'VISITOR_ISP'
WHERE NOT EXISTS (SELECT 1 FROM party_relationship_type WHERE has_table = 'N' AND party_relationship_name = 'ISP Visitor' AND party_relationship_type_id = 'VISITOR_ISP');

INSERT INTO party_relationship_type (has_table, party_relationship_name, party_relationship_type_id)
SELECT 'N', 'Manager', 'MANAGER'
WHERE NOT EXISTS (SELECT 1 FROM party_relationship_type WHERE has_table = 'N' AND party_relationship_name = 'Manager' AND party_relationship_type_id = 'MANAGER');

INSERT INTO party_relationship_type (has_table, party_relationship_name, party_relationship_type_id)
SELECT 'N', 'Parent', 'PARENT'
WHERE NOT EXISTS (SELECT 1 FROM party_relationship_type WHERE has_table = 'N' AND party_relationship_name = 'Parent' AND party_relationship_type_id = 'PARENT');

INSERT INTO party_relationship_type (has_table, party_relationship_name, party_relationship_type_id)
SELECT 'N', 'Partner', 'PARTNERSHIP'
WHERE NOT EXISTS (SELECT 1 FROM party_relationship_type WHERE has_table = 'N' AND party_relationship_name = 'Partner' AND party_relationship_type_id = 'PARTNERSHIP');

INSERT INTO party_relationship_type (has_table, party_relationship_name, party_relationship_type_id)
SELECT 'N', 'Sales Affiliate', 'SALES_AFFILIATE'
WHERE NOT EXISTS (SELECT 1 FROM party_relationship_type WHERE has_table = 'N' AND party_relationship_name = 'Sales Affiliate' AND party_relationship_type_id = 'SALES_AFFILIATE');

INSERT INTO party_relationship_type (has_table, party_relationship_name, party_relationship_type_id)
SELECT 'N', 'Spouse', 'SPOUSE'
WHERE NOT EXISTS (SELECT 1 FROM party_relationship_type WHERE has_table = 'N' AND party_relationship_name = 'Spouse' AND party_relationship_type_id = 'SPOUSE');

INSERT INTO party_relationship_type (has_table, party_relationship_name, party_relationship_type_id)
SELECT 'Y', 'Supplier', 'SUPPLIER_REL'
WHERE NOT EXISTS (SELECT 1 FROM party_relationship_type WHERE has_table = 'Y' AND party_relationship_name = 'Supplier' AND party_relationship_type_id = 'SUPPLIER_REL');

INSERT INTO party_relationship_type (has_table, party_relationship_name, party_relationship_type_id)
SELECT 'N', 'Web Master', 'WEB_MASTER_ASSIGNMEN'
WHERE NOT EXISTS (SELECT 1 FROM party_relationship_type WHERE has_table = 'N' AND party_relationship_name = 'Web Master' AND party_relationship_type_id = 'WEB_MASTER_ASSIGNMEN');

INSERT INTO party_relationship_type (has_table, party_relationship_name, party_relationship_type_id)
SELECT 'N', 'Account owned by', 'ACCOUNT'
WHERE NOT EXISTS (SELECT 1 FROM party_relationship_type WHERE has_table = 'N' AND party_relationship_name = 'Account owned by' AND party_relationship_type_id = 'ACCOUNT');

INSERT INTO party_relationship_type (has_table, party_relationship_name, party_relationship_type_id)
SELECT 'N', 'Assistant', 'ASSISTANT'
WHERE NOT EXISTS (SELECT 1 FROM party_relationship_type WHERE has_table = 'N' AND party_relationship_name = 'Assistant' AND party_relationship_type_id = 'ASSISTANT');

INSERT INTO party_relationship_type (has_table, party_relationship_name, party_relationship_type_id)
SELECT 'N', 'Owned by', 'OWNER'
WHERE NOT EXISTS (SELECT 1 FROM party_relationship_type WHERE has_table = 'N' AND party_relationship_name = 'Owned by' AND party_relationship_type_id = 'OWNER');

INSERT INTO party_relationship_type (has_table, party_relationship_name, party_relationship_type_id)
SELECT 'N', 'Parent Account', 'PARENT_ACCOUNT'
WHERE NOT EXISTS (SELECT 1 FROM party_relationship_type WHERE has_table = 'N' AND party_relationship_name = 'Parent Account' AND party_relationship_type_id = 'PARENT_ACCOUNT');

INSERT INTO party_relationship_type (has_table, party_relationship_name, party_relationship_type_id)
SELECT 'N', 'Reports To', 'REPORTS_TO'
WHERE NOT EXISTS (SELECT 1 FROM party_relationship_type WHERE has_table = 'N' AND party_relationship_name = 'Reports To' AND party_relationship_type_id = 'REPORTS_TO');

INSERT INTO party_relationship_type (has_table, party_relationship_name, party_relationship_type_id)
SELECT 'N', 'Lead Owners/Managers', 'LEAD_OWN_GRP_MEMBER'
WHERE NOT EXISTS (SELECT 1 FROM party_relationship_type WHERE has_table = 'N' AND party_relationship_name = 'Lead Owners/Managers' AND party_relationship_type_id = 'LEAD_OWN_GRP_MEMBER');

INSERT INTO party_type (description, has_table, party_type_id)
SELECT 'Automated Agent', 'N', 'AUTOMATED_AGENT'
WHERE NOT EXISTS (SELECT 1 FROM party_type WHERE description = 'Automated Agent' AND has_table = 'N' AND party_type_id = 'AUTOMATED_AGENT');

INSERT INTO party_type (description, has_table, party_type_id)
SELECT 'Person', 'Y', 'PERSON'
WHERE NOT EXISTS (SELECT 1 FROM party_type WHERE description = 'Person' AND has_table = 'Y' AND party_type_id = 'PERSON');

INSERT INTO party_type (description, has_table, party_type_id)
SELECT 'Party Group', 'Y', 'PARTY_GROUP'
WHERE NOT EXISTS (SELECT 1 FROM party_type WHERE description = 'Party Group' AND has_table = 'Y' AND party_type_id = 'PARTY_GROUP');

INSERT INTO party_type (description, has_table, parent_type_id, party_type_id)
SELECT 'Informal Group', 'N', 'PARTY_GROUP', 'INFORMAL_GROUP'
WHERE NOT EXISTS (SELECT 1 FROM party_type WHERE description = 'Informal Group' AND has_table = 'N' AND parent_type_id = 'PARTY_GROUP' AND party_type_id = 'INFORMAL_GROUP');

INSERT INTO party_type (description, has_table, parent_type_id, party_type_id)
SELECT 'Family', 'N', 'INFORMAL_GROUP', 'FAMILY'
WHERE NOT EXISTS (SELECT 1 FROM party_type WHERE description = 'Family' AND has_table = 'N' AND parent_type_id = 'INFORMAL_GROUP' AND party_type_id = 'FAMILY');

INSERT INTO party_type (description, has_table, parent_type_id, party_type_id)
SELECT 'Team', 'N', 'INFORMAL_GROUP', 'TEAM'
WHERE NOT EXISTS (SELECT 1 FROM party_type WHERE description = 'Team' AND has_table = 'N' AND parent_type_id = 'INFORMAL_GROUP' AND party_type_id = 'TEAM');

INSERT INTO party_type (description, has_table, parent_type_id, party_type_id)
SELECT 'Legal Organization', 'N', 'PARTY_GROUP', 'LEGAL_ORGANIZATION'
WHERE NOT EXISTS (SELECT 1 FROM party_type WHERE description = 'Legal Organization' AND has_table = 'N' AND parent_type_id = 'PARTY_GROUP' AND party_type_id = 'LEGAL_ORGANIZATION');

INSERT INTO party_type (description, has_table, parent_type_id, party_type_id)
SELECT 'Corporation', 'N', 'LEGAL_ORGANIZATION', 'CORPORATION'
WHERE NOT EXISTS (SELECT 1 FROM party_type WHERE description = 'Corporation' AND has_table = 'N' AND parent_type_id = 'LEGAL_ORGANIZATION' AND party_type_id = 'CORPORATION');

INSERT INTO party_type (description, has_table, parent_type_id, party_type_id)
SELECT 'Government Agency', 'N', 'LEGAL_ORGANIZATION', 'GOVERNMENT_AGENCY'
WHERE NOT EXISTS (SELECT 1 FROM party_type WHERE description = 'Government Agency' AND has_table = 'N' AND parent_type_id = 'LEGAL_ORGANIZATION' AND party_type_id = 'GOVERNMENT_AGENCY');

INSERT INTO party_identification_type (description, party_identification_type_id)
SELECT 'Original ID in the system where this record was imported from', 'PARTY_IMPORT'
WHERE NOT EXISTS (SELECT 1 FROM party_identification_type WHERE description = 'Original ID in the system where this record was imported from' AND party_identification_type_id = 'PARTY_IMPORT');

INSERT INTO security_permission (description, permission_id)
SELECT 'View operations in the Party Manager.', 'PARTYMGR_VIEW'
WHERE NOT EXISTS (SELECT 1 FROM security_permission WHERE description = 'View operations in the Party Manager.' AND permission_id = 'PARTYMGR_VIEW');

INSERT INTO security_permission (description, permission_id)
SELECT 'Create operations in the Party Manager.', 'PARTYMGR_CREATE'
WHERE NOT EXISTS (SELECT 1 FROM security_permission WHERE description = 'Create operations in the Party Manager.' AND permission_id = 'PARTYMGR_CREATE');

INSERT INTO security_permission (description, permission_id)
SELECT 'Update operations in the Party Manager.', 'PARTYMGR_UPDATE'
WHERE NOT EXISTS (SELECT 1 FROM security_permission WHERE description = 'Update operations in the Party Manager.' AND permission_id = 'PARTYMGR_UPDATE');

INSERT INTO security_permission (description, permission_id)
SELECT 'Delete operations in the Party Manager.', 'PARTYMGR_DELETE'
WHERE NOT EXISTS (SELECT 1 FROM security_permission WHERE description = 'Delete operations in the Party Manager.' AND permission_id = 'PARTYMGR_DELETE');

INSERT INTO security_permission (description, permission_id)
SELECT 'ALL operations in the Party Manager.', 'PARTYMGR_ADMIN'
WHERE NOT EXISTS (SELECT 1 FROM security_permission WHERE description = 'ALL operations in the Party Manager.' AND permission_id = 'PARTYMGR_ADMIN');

INSERT INTO security_permission (description, permission_id)
SELECT 'Create notes in the Party Manager.', 'PARTYMGR_NOTE'
WHERE NOT EXISTS (SELECT 1 FROM security_permission WHERE description = 'Create notes in the Party Manager.' AND permission_id = 'PARTYMGR_NOTE');

INSERT INTO security_permission (description, permission_id)
SELECT 'Update party status in the Party Manager.', 'PARTYMGR_STS_UPDATE'
WHERE NOT EXISTS (SELECT 1 FROM security_permission WHERE description = 'Update party status in the Party Manager.' AND permission_id = 'PARTYMGR_STS_UPDATE');

INSERT INTO security_permission (description, permission_id)
SELECT 'Update PartyGroup or Person detail information.', 'PARTYMGR_GRP_UPDATE'
WHERE NOT EXISTS (SELECT 1 FROM security_permission WHERE description = 'Update PartyGroup or Person detail information.' AND permission_id = 'PARTYMGR_GRP_UPDATE');

INSERT INTO security_permission (description, permission_id)
SELECT 'Create party relationships in the Party Manager.', 'PARTYMGR_REL_CREATE'
WHERE NOT EXISTS (SELECT 1 FROM security_permission WHERE description = 'Create party relationships in the Party Manager.' AND permission_id = 'PARTYMGR_REL_CREATE');

INSERT INTO security_permission (description, permission_id)
SELECT 'Update party relationships in the Party Manager.', 'PARTYMGR_REL_UPDATE'
WHERE NOT EXISTS (SELECT 1 FROM security_permission WHERE description = 'Update party relationships in the Party Manager.' AND permission_id = 'PARTYMGR_REL_UPDATE');

INSERT INTO security_permission (description, permission_id)
SELECT 'Delete party relationships in the Party Manager.', 'PARTYMGR_REL_DELETE'
WHERE NOT EXISTS (SELECT 1 FROM security_permission WHERE description = 'Delete party relationships in the Party Manager.' AND permission_id = 'PARTYMGR_REL_DELETE');

INSERT INTO security_permission (description, permission_id)
SELECT 'Create party roles in the Party Manager.', 'PARTYMGR_ROLE_CREATE'
WHERE NOT EXISTS (SELECT 1 FROM security_permission WHERE description = 'Create party roles in the Party Manager.' AND permission_id = 'PARTYMGR_ROLE_CREATE');

INSERT INTO security_permission (description, permission_id)
SELECT 'Delete party roles in the Party Manager.', 'PARTYMGR_ROLE_DELETE'
WHERE NOT EXISTS (SELECT 1 FROM security_permission WHERE description = 'Delete party roles in the Party Manager.' AND permission_id = 'PARTYMGR_ROLE_DELETE');

INSERT INTO security_permission (description, permission_id)
SELECT 'Create party contact mechs in the Party Manager.', 'PARTYMGR_PCM_CREATE'
WHERE NOT EXISTS (SELECT 1 FROM security_permission WHERE description = 'Create party contact mechs in the Party Manager.' AND permission_id = 'PARTYMGR_PCM_CREATE');

INSERT INTO security_permission (description, permission_id)
SELECT 'Update party contact mechs in the Party Manager.', 'PARTYMGR_PCM_UPDATE'
WHERE NOT EXISTS (SELECT 1 FROM security_permission WHERE description = 'Update party contact mechs in the Party Manager.' AND permission_id = 'PARTYMGR_PCM_UPDATE');

INSERT INTO security_permission (description, permission_id)
SELECT 'Delete party contact mechs in the Party Manager.', 'PARTYMGR_PCM_DELETE'
WHERE NOT EXISTS (SELECT 1 FROM security_permission WHERE description = 'Delete party contact mechs in the Party Manager.' AND permission_id = 'PARTYMGR_PCM_DELETE');

INSERT INTO security_permission (description, permission_id)
SELECT 'Create party to data source relations.', 'PARTYMGR_SRC_CREATE'
WHERE NOT EXISTS (SELECT 1 FROM security_permission WHERE description = 'Create party to data source relations.' AND permission_id = 'PARTYMGR_SRC_CREATE');

INSERT INTO security_permission (description, permission_id)
SELECT 'Create party quals in the Party Manager.', 'PARTYMGR_QAL_CREATE'
WHERE NOT EXISTS (SELECT 1 FROM security_permission WHERE description = 'Create party quals in the Party Manager.' AND permission_id = 'PARTYMGR_QAL_CREATE');

INSERT INTO security_permission (description, permission_id)
SELECT 'Update party quals in the Party Manager.', 'PARTYMGR_QAL_UPDATE'
WHERE NOT EXISTS (SELECT 1 FROM security_permission WHERE description = 'Update party quals in the Party Manager.' AND permission_id = 'PARTYMGR_QAL_UPDATE');

INSERT INTO security_permission (description, permission_id)
SELECT 'Delete party quals in the Party Manager.', 'PARTYMGR_QAL_DELETE'
WHERE NOT EXISTS (SELECT 1 FROM security_permission WHERE description = 'Delete party quals in the Party Manager.' AND permission_id = 'PARTYMGR_QAL_DELETE');

INSERT INTO security_permission (description, permission_id)
SELECT 'Create communication event, any from/to party.', 'PARTYMGR_CME_CREATE'
WHERE NOT EXISTS (SELECT 1 FROM security_permission WHERE description = 'Create communication event, any from/to party.' AND permission_id = 'PARTYMGR_CME_CREATE');

INSERT INTO security_permission (description, permission_id)
SELECT 'Update communication event, any from/to party.', 'PARTYMGR_CME_UPDATE'
WHERE NOT EXISTS (SELECT 1 FROM security_permission WHERE description = 'Update communication event, any from/to party.' AND permission_id = 'PARTYMGR_CME_UPDATE');

INSERT INTO security_permission (description, permission_id)
SELECT 'Delete communication event, any from/to party.', 'PARTYMGR_CME_DELETE'
WHERE NOT EXISTS (SELECT 1 FROM security_permission WHERE description = 'Delete communication event, any from/to party.' AND permission_id = 'PARTYMGR_CME_DELETE');

INSERT INTO security_permission (description, permission_id)
SELECT 'Can create Email communication events for logged-in user.', 'PARTYMGR_CME-EMAIL_CREATE'
WHERE NOT EXISTS (SELECT 1 FROM security_permission WHERE description = 'Can create Email communication events for logged-in user.' AND permission_id = 'PARTYMGR_CME-EMAIL_CREATE');

INSERT INTO security_permission (description, permission_id)
SELECT 'Can update Email communication events for logged-in user.', 'PARTYMGR_CME-EMAIL_UPDATE'
WHERE NOT EXISTS (SELECT 1 FROM security_permission WHERE description = 'Can update Email communication events for logged-in user.' AND permission_id = 'PARTYMGR_CME-EMAIL_UPDATE');

INSERT INTO security_permission (description, permission_id)
SELECT 'Can delete Email communication events for logged-in user.', 'PARTYMGR_CME-EMAIL_DELETE'
WHERE NOT EXISTS (SELECT 1 FROM security_permission WHERE description = 'Can delete Email communication events for logged-in user.' AND permission_id = 'PARTYMGR_CME-EMAIL_DELETE');

INSERT INTO security_permission (description, permission_id)
SELECT 'Can create Internal note communication event for logged-in user.', 'PARTYMGR_CME-NOTE_CREATE'
WHERE NOT EXISTS (SELECT 1 FROM security_permission WHERE description = 'Can create Internal note communication event for logged-in user.' AND permission_id = 'PARTYMGR_CME-NOTE_CREATE');

INSERT INTO security_permission (description, permission_id)
SELECT 'View operations in the Security Management Screens.', 'SECURITY_VIEW'
WHERE NOT EXISTS (SELECT 1 FROM security_permission WHERE description = 'View operations in the Security Management Screens.' AND permission_id = 'SECURITY_VIEW');

INSERT INTO security_permission (description, permission_id)
SELECT 'Create operations in the Security Management Screens.', 'SECURITY_CREATE'
WHERE NOT EXISTS (SELECT 1 FROM security_permission WHERE description = 'Create operations in the Security Management Screens.' AND permission_id = 'SECURITY_CREATE');

INSERT INTO security_permission (description, permission_id)
SELECT 'Update operations in the Security Management Screens.', 'SECURITY_UPDATE'
WHERE NOT EXISTS (SELECT 1 FROM security_permission WHERE description = 'Update operations in the Security Management Screens.' AND permission_id = 'SECURITY_UPDATE');

INSERT INTO security_permission (description, permission_id)
SELECT 'Delete operations in the Security Management Screens.', 'SECURITY_DELETE'
WHERE NOT EXISTS (SELECT 1 FROM security_permission WHERE description = 'Delete operations in the Security Management Screens.' AND permission_id = 'SECURITY_DELETE');

INSERT INTO security_permission (description, permission_id)
SELECT 'ALL operations in the Security Management Screens.', 'SECURITY_ADMIN'
WHERE NOT EXISTS (SELECT 1 FROM security_permission WHERE description = 'ALL operations in the Security Management Screens.' AND permission_id = 'SECURITY_ADMIN');

INSERT INTO security_group_permission (from_date, group_id, permission_id)
SELECT '2001-05-13 12:00:00.0', 'SUPER', 'PARTYMGR_ADMIN'
WHERE NOT EXISTS (SELECT 1 FROM security_group_permission WHERE from_date = '2001-05-13 12:00:00.0' AND group_id = 'SUPER' AND permission_id = 'PARTYMGR_ADMIN');

INSERT INTO security_group_permission (from_date, group_id, permission_id)
SELECT '2001-05-13 12:00:00.0', 'SUPER', 'SECURITY_ADMIN'
WHERE NOT EXISTS (SELECT 1 FROM security_group_permission WHERE from_date = '2001-05-13 12:00:00.0' AND group_id = 'SUPER' AND permission_id = 'SECURITY_ADMIN');
