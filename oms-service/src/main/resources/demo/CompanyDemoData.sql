INSERT INTO gl_journal (gl_journal_id, gl_journal_name, organization_party_id)
SELECT 'ERROR_JOURNAL', 'Suspense transactions', 'COMPANY'
WHERE NOT EXISTS (SELECT 1 FROM gl_journal WHERE gl_journal_id = 'ERROR_JOURNAL' AND gl_journal_name = 'Suspense transactions' AND organization_party_id = 'COMPANY');

INSERT INTO email_template_setting (email_template_setting_id, email_type, from_address, subject, xslfo_attach_screen_location)
SELECT 'PRDS_ODR_COMPLETE', 'PRDS_ODR_COMPLETE', 'no-reply@hermeus.com', 'Order Complete Notification for Order #${orderId}', 'component://hwmapps/widget/customerservice/OrderPrintScreens.xml#OrderPDF'
WHERE NOT EXISTS (SELECT 1 FROM email_template_setting WHERE email_template_setting_id = 'PRDS_ODR_COMPLETE' AND email_type = 'PRDS_ODR_COMPLETE' AND from_address = 'no-reply@hermeus.com' AND subject = 'Order Complete Notification for Order #${orderId}' AND xslfo_attach_screen_location = 'component://hwmapps/widget/customerservice/OrderPrintScreens.xml#OrderPDF');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Hold', 'HOLDLOC', 'FLT_HOLDLOC', 'FACLOC_TYPE', '03'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Hold' AND enum_code = 'HOLDLOC' AND enum_id = 'FLT_HOLDLOC' AND enum_type_id = 'FACLOC_TYPE' AND sequence_id = '03');
