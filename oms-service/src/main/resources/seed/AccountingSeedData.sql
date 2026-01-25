INSERT INTO acctg_trans_type (acctg_trans_type_id, description, has_table)
SELECT '_NA_', 'Not Applicable', 0
WHERE NOT EXISTS (SELECT 1 FROM acctg_trans_type WHERE acctg_trans_type_id = '_NA_' AND description = 'Not Applicable' AND has_table = 0);

INSERT INTO acctg_trans_type (acctg_trans_type_id, description, has_table)
SELECT 'INTERNAL_ACCTG_TRANS', 'Internal', 1
WHERE NOT EXISTS (SELECT 1 FROM acctg_trans_type WHERE acctg_trans_type_id = 'INTERNAL_ACCTG_TRANS' AND description = 'Internal' AND has_table = 1);

INSERT INTO acctg_trans_type (acctg_trans_type_id, description, has_table, parent_type_id)
SELECT 'AMORTIZATION', 'Amortization', 0, 'INTERNAL_ACCTG_TRANS'
WHERE NOT EXISTS (SELECT 1 FROM acctg_trans_type WHERE acctg_trans_type_id = 'AMORTIZATION' AND description = 'Amortization' AND has_table = 0 AND parent_type_id = 'INTERNAL_ACCTG_TRANS');

INSERT INTO acctg_trans_type (acctg_trans_type_id, description, has_table, parent_type_id)
SELECT 'DEPRECIATION', 'Depreciation', 1, 'INTERNAL_ACCTG_TRANS'
WHERE NOT EXISTS (SELECT 1 FROM acctg_trans_type WHERE acctg_trans_type_id = 'DEPRECIATION' AND description = 'Depreciation' AND has_table = 1 AND parent_type_id = 'INTERNAL_ACCTG_TRANS');

INSERT INTO acctg_trans_type (acctg_trans_type_id, description, has_table, parent_type_id)
SELECT 'CAPITALIZATION', 'Capitalization', 0, 'INTERNAL_ACCTG_TRANS'
WHERE NOT EXISTS (SELECT 1 FROM acctg_trans_type WHERE acctg_trans_type_id = 'CAPITALIZATION' AND description = 'Capitalization' AND has_table = 0 AND parent_type_id = 'INTERNAL_ACCTG_TRANS');

INSERT INTO acctg_trans_type (acctg_trans_type_id, description, has_table, parent_type_id)
SELECT 'INVENTORY', 'Inventory', 0, 'INTERNAL_ACCTG_TRANS'
WHERE NOT EXISTS (SELECT 1 FROM acctg_trans_type WHERE acctg_trans_type_id = 'INVENTORY' AND description = 'Inventory' AND has_table = 0 AND parent_type_id = 'INTERNAL_ACCTG_TRANS');

INSERT INTO acctg_trans_type (acctg_trans_type_id, description, has_table, parent_type_id)
SELECT 'ITEM_VARIANCE', 'Inventory Item Variance', 1, 'INTERNAL_ACCTG_TRANS'
WHERE NOT EXISTS (SELECT 1 FROM acctg_trans_type WHERE acctg_trans_type_id = 'ITEM_VARIANCE' AND description = 'Inventory Item Variance' AND has_table = 1 AND parent_type_id = 'INTERNAL_ACCTG_TRANS');

INSERT INTO acctg_trans_type (acctg_trans_type_id, description, has_table, parent_type_id)
SELECT 'OTHER_INTERNAL', 'Other Internal', 0, 'INTERNAL_ACCTG_TRANS'
WHERE NOT EXISTS (SELECT 1 FROM acctg_trans_type WHERE acctg_trans_type_id = 'OTHER_INTERNAL' AND description = 'Other Internal' AND has_table = 0 AND parent_type_id = 'INTERNAL_ACCTG_TRANS');

INSERT INTO acctg_trans_type (acctg_trans_type_id, description, has_table, parent_type_id)
SELECT 'PERIOD_CLOSING', 'Period Closing', 0, 'INTERNAL_ACCTG_TRANS'
WHERE NOT EXISTS (SELECT 1 FROM acctg_trans_type WHERE acctg_trans_type_id = 'PERIOD_CLOSING' AND description = 'Period Closing' AND has_table = 0 AND parent_type_id = 'INTERNAL_ACCTG_TRANS');

INSERT INTO acctg_trans_type (acctg_trans_type_id, description, has_table)
SELECT 'EXTERNAL_ACCTG_TRANS', 'External', 1
WHERE NOT EXISTS (SELECT 1 FROM acctg_trans_type WHERE acctg_trans_type_id = 'EXTERNAL_ACCTG_TRANS' AND description = 'External' AND has_table = 1);

INSERT INTO acctg_trans_type (acctg_trans_type_id, description, has_table, parent_type_id)
SELECT 'OBLIGATION_ACCTG_TRA', 'Obligation', 0, 'EXTERNAL_ACCTG_TRANS'
WHERE NOT EXISTS (SELECT 1 FROM acctg_trans_type WHERE acctg_trans_type_id = 'OBLIGATION_ACCTG_TRA' AND description = 'Obligation' AND has_table = 0 AND parent_type_id = 'EXTERNAL_ACCTG_TRANS');

INSERT INTO acctg_trans_type (acctg_trans_type_id, description, has_table, parent_type_id)
SELECT 'CREDIT_LINE', 'Credit Line', 0, 'OBLIGATION_ACCTG_TRA'
WHERE NOT EXISTS (SELECT 1 FROM acctg_trans_type WHERE acctg_trans_type_id = 'CREDIT_LINE' AND description = 'Credit Line' AND has_table = 0 AND parent_type_id = 'OBLIGATION_ACCTG_TRA');

INSERT INTO acctg_trans_type (acctg_trans_type_id, description, has_table, parent_type_id)
SELECT 'CREDIT_MEMO', 'Credit Memo', 0, 'OBLIGATION_ACCTG_TRA'
WHERE NOT EXISTS (SELECT 1 FROM acctg_trans_type WHERE acctg_trans_type_id = 'CREDIT_MEMO' AND description = 'Credit Memo' AND has_table = 0 AND parent_type_id = 'OBLIGATION_ACCTG_TRA');

INSERT INTO acctg_trans_type (acctg_trans_type_id, description, has_table, parent_type_id)
SELECT 'NOTE', 'Note', 0, 'OBLIGATION_ACCTG_TRA'
WHERE NOT EXISTS (SELECT 1 FROM acctg_trans_type WHERE acctg_trans_type_id = 'NOTE' AND description = 'Note' AND has_table = 0 AND parent_type_id = 'OBLIGATION_ACCTG_TRA');

INSERT INTO acctg_trans_type (acctg_trans_type_id, description, has_table, parent_type_id)
SELECT 'OTHER_OBLIGATION', 'Other Obligation', 0, 'OBLIGATION_ACCTG_TRA'
WHERE NOT EXISTS (SELECT 1 FROM acctg_trans_type WHERE acctg_trans_type_id = 'OTHER_OBLIGATION' AND description = 'Other Obligation' AND has_table = 0 AND parent_type_id = 'OBLIGATION_ACCTG_TRA');

INSERT INTO acctg_trans_type (acctg_trans_type_id, description, has_table, parent_type_id)
SELECT 'SALES', 'Sales', 1, 'OBLIGATION_ACCTG_TRA'
WHERE NOT EXISTS (SELECT 1 FROM acctg_trans_type WHERE acctg_trans_type_id = 'SALES' AND description = 'Sales' AND has_table = 1 AND parent_type_id = 'OBLIGATION_ACCTG_TRA');

INSERT INTO acctg_trans_type (acctg_trans_type_id, description, has_table, parent_type_id)
SELECT 'TAX_DUE', 'Tax Due', 0, 'OBLIGATION_ACCTG_TRA'
WHERE NOT EXISTS (SELECT 1 FROM acctg_trans_type WHERE acctg_trans_type_id = 'TAX_DUE' AND description = 'Tax Due' AND has_table = 0 AND parent_type_id = 'OBLIGATION_ACCTG_TRA');

INSERT INTO acctg_trans_type (acctg_trans_type_id, description, has_table, parent_type_id)
SELECT 'PAYMENT_ACCTG_TRANS', 'Payment', 1, 'EXTERNAL_ACCTG_TRANS'
WHERE NOT EXISTS (SELECT 1 FROM acctg_trans_type WHERE acctg_trans_type_id = 'PAYMENT_ACCTG_TRANS' AND description = 'Payment' AND has_table = 1 AND parent_type_id = 'EXTERNAL_ACCTG_TRANS');

INSERT INTO acctg_trans_type (acctg_trans_type_id, description, has_table, parent_type_id)
SELECT 'DISBURSEMENT', 'Disbursement', 0, 'PAYMENT_ACCTG_TRANS'
WHERE NOT EXISTS (SELECT 1 FROM acctg_trans_type WHERE acctg_trans_type_id = 'DISBURSEMENT' AND description = 'Disbursement' AND has_table = 0 AND parent_type_id = 'PAYMENT_ACCTG_TRANS');

INSERT INTO acctg_trans_type (acctg_trans_type_id, description, has_table, parent_type_id)
SELECT 'RECEIPT', 'Receipt', 0, 'PAYMENT_ACCTG_TRANS'
WHERE NOT EXISTS (SELECT 1 FROM acctg_trans_type WHERE acctg_trans_type_id = 'RECEIPT' AND description = 'Receipt' AND has_table = 0 AND parent_type_id = 'PAYMENT_ACCTG_TRANS');

INSERT INTO acctg_trans_type (acctg_trans_type_id, description, has_table, parent_type_id)
SELECT 'INVENTORY_RETURN', 'Inventory from Return', 0, 'EXTERNAL_ACCTG_TRANS'
WHERE NOT EXISTS (SELECT 1 FROM acctg_trans_type WHERE acctg_trans_type_id = 'INVENTORY_RETURN' AND description = 'Inventory from Return' AND has_table = 0 AND parent_type_id = 'EXTERNAL_ACCTG_TRANS');

INSERT INTO acctg_trans_type (acctg_trans_type_id, description, has_table, parent_type_id)
SELECT 'SALES_INVOICE', 'Sales Invoice', 0, 'OBLIGATION_ACCTG_TRA'
WHERE NOT EXISTS (SELECT 1 FROM acctg_trans_type WHERE acctg_trans_type_id = 'SALES_INVOICE' AND description = 'Sales Invoice' AND has_table = 0 AND parent_type_id = 'OBLIGATION_ACCTG_TRA');

INSERT INTO acctg_trans_type (acctg_trans_type_id, description, has_table, parent_type_id)
SELECT 'PURCHASE_INVOICE', 'Purchase Invoice', 0, 'OBLIGATION_ACCTG_TRA'
WHERE NOT EXISTS (SELECT 1 FROM acctg_trans_type WHERE acctg_trans_type_id = 'PURCHASE_INVOICE' AND description = 'Purchase Invoice' AND has_table = 0 AND parent_type_id = 'OBLIGATION_ACCTG_TRA');

INSERT INTO acctg_trans_type (acctg_trans_type_id, description, has_table, parent_type_id)
SELECT 'CUST_RTN_INVOICE', 'Customer Return', 0, 'OBLIGATION_ACCTG_TRA'
WHERE NOT EXISTS (SELECT 1 FROM acctg_trans_type WHERE acctg_trans_type_id = 'CUST_RTN_INVOICE' AND description = 'Customer Return' AND has_table = 0 AND parent_type_id = 'OBLIGATION_ACCTG_TRA');

INSERT INTO acctg_trans_type (acctg_trans_type_id, description, has_table, parent_type_id)
SELECT 'SALES_SHIPMENT', 'Sales Shipment', 0, 'EXTERNAL_ACCTG_TRANS'
WHERE NOT EXISTS (SELECT 1 FROM acctg_trans_type WHERE acctg_trans_type_id = 'SALES_SHIPMENT' AND description = 'Sales Shipment' AND has_table = 0 AND parent_type_id = 'EXTERNAL_ACCTG_TRANS');

INSERT INTO acctg_trans_type (acctg_trans_type_id, description, has_table, parent_type_id)
SELECT 'SHIPMENT_RECEIPT', 'Shipment Receipt', 0, 'EXTERNAL_ACCTG_TRANS'
WHERE NOT EXISTS (SELECT 1 FROM acctg_trans_type WHERE acctg_trans_type_id = 'SHIPMENT_RECEIPT' AND description = 'Shipment Receipt' AND has_table = 0 AND parent_type_id = 'EXTERNAL_ACCTG_TRANS');

INSERT INTO acctg_trans_type (acctg_trans_type_id, description, has_table)
SELECT 'MANUFACTURING', 'Manufacturing', 0
WHERE NOT EXISTS (SELECT 1 FROM acctg_trans_type WHERE acctg_trans_type_id = 'MANUFACTURING' AND description = 'Manufacturing' AND has_table = 0);

INSERT INTO acctg_trans_type (acctg_trans_type_id, description, has_table)
SELECT 'INCOMING_PAYMENT', 'Incoming Payment', 0
WHERE NOT EXISTS (SELECT 1 FROM acctg_trans_type WHERE acctg_trans_type_id = 'INCOMING_PAYMENT' AND description = 'Incoming Payment' AND has_table = 0);

INSERT INTO acctg_trans_type (acctg_trans_type_id, description, has_table)
SELECT 'OUTGOING_PAYMENT', 'Outgoing Payment', 0
WHERE NOT EXISTS (SELECT 1 FROM acctg_trans_type WHERE acctg_trans_type_id = 'OUTGOING_PAYMENT' AND description = 'Outgoing Payment' AND has_table = 0);

INSERT INTO acctg_trans_type (acctg_trans_type_id, description, has_table)
SELECT 'PAYMENT_APPL', 'Payment Applied', 0
WHERE NOT EXISTS (SELECT 1 FROM acctg_trans_type WHERE acctg_trans_type_id = 'PAYMENT_APPL' AND description = 'Payment Applied' AND has_table = 0);

INSERT INTO acctg_trans_entry_type (acctg_trans_entry_type_id, description, has_table)
SELECT '_NA_', 'Not Applicable', 0
WHERE NOT EXISTS (SELECT 1 FROM acctg_trans_entry_type WHERE acctg_trans_entry_type_id = '_NA_' AND description = 'Not Applicable' AND has_table = 0);

INSERT INTO status_type (description, has_table, status_type_id)
SELECT 'Acctg Entry Reconcile', 0, 'ACCTG_ENREC_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_type WHERE description = 'Acctg Entry Reconcile' AND has_table = 0 AND status_type_id = 'ACCTG_ENREC_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Not Reconciled', '01', 'NOT_RECONCILED', 'AES_NOT_RECONCILED', 'ACCTG_ENREC_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Not Reconciled' AND sequence_id = '01' AND status_code = 'NOT_RECONCILED' AND status_id = 'AES_NOT_RECONCILED' AND status_type_id = 'ACCTG_ENREC_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Partly Reconciled', '02', 'PARTLY_RECONCILED', 'AES_PARTLY_RECON', 'ACCTG_ENREC_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Partly Reconciled' AND sequence_id = '02' AND status_code = 'PARTLY_RECONCILED' AND status_id = 'AES_PARTLY_RECON' AND status_type_id = 'ACCTG_ENREC_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Reconciled', '03', 'RECONCILED', 'AES_RECONCILED', 'ACCTG_ENREC_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Reconciled' AND sequence_id = '03' AND status_code = 'RECONCILED' AND status_id = 'AES_RECONCILED' AND status_type_id = 'ACCTG_ENREC_STATUS');

INSERT INTO budget_item_type (budget_item_type_id, description, has_table)
SELECT 'REQUIREMENT_BUDGET_A', 'Requirement', 1
WHERE NOT EXISTS (SELECT 1 FROM budget_item_type WHERE budget_item_type_id = 'REQUIREMENT_BUDGET_A' AND description = 'Requirement' AND has_table = 1);

INSERT INTO budget_type (budget_type_id, description, has_table)
SELECT 'CAPITAL_BUDGET', 'Capital', 0
WHERE NOT EXISTS (SELECT 1 FROM budget_type WHERE budget_type_id = 'CAPITAL_BUDGET' AND description = 'Capital' AND has_table = 0);

INSERT INTO budget_type (budget_type_id, description, has_table)
SELECT 'OPERATING_BUDGET', 'Operating', 0
WHERE NOT EXISTS (SELECT 1 FROM budget_type WHERE budget_type_id = 'OPERATING_BUDGET' AND description = 'Operating' AND has_table = 0);

INSERT INTO enumeration_type (description, enum_type_id, has_table)
SELECT 'Gift Card Fulfillment', 'GC_FULFILL', 0
WHERE NOT EXISTS (SELECT 1 FROM enumeration_type WHERE description = 'Gift Card Fulfillment' AND enum_type_id = 'GC_FULFILL' AND has_table = 0);

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Activate', 'ACTIVATE', 'GC_ACTIVATE', 'GC_FULFILL', '01'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Activate' AND enum_code = 'ACTIVATE' AND enum_id = 'GC_ACTIVATE' AND enum_type_id = 'GC_FULFILL' AND sequence_id = '01');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Reload', 'RELOAD', 'GC_RELOAD', 'GC_FULFILL', '02'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Reload' AND enum_code = 'RELOAD' AND enum_id = 'GC_RELOAD' AND enum_type_id = 'GC_FULFILL' AND sequence_id = '02');

INSERT INTO enumeration_type (description, enum_type_id, has_table)
SELECT 'Payment Gateway Transaction Code', 'PGT_CODE', 0
WHERE NOT EXISTS (SELECT 1 FROM enumeration_type WHERE description = 'Payment Gateway Transaction Code' AND enum_type_id = 'PGT_CODE' AND has_table = 0);

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Authorize', 'AUTHORIZE', 'PGT_AUTHORIZE', 'PGT_CODE', '01'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Authorize' AND enum_code = 'AUTHORIZE' AND enum_id = 'PGT_AUTHORIZE' AND enum_type_id = 'PGT_CODE' AND sequence_id = '01');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Capture', 'CAPTURE', 'PGT_CAPTURE', 'PGT_CODE', '02'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Capture' AND enum_code = 'CAPTURE' AND enum_id = 'PGT_CAPTURE' AND enum_type_id = 'PGT_CODE' AND sequence_id = '02');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Release', 'RELEASE', 'PGT_RELEASE', 'PGT_CODE', '03'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Release' AND enum_code = 'RELEASE' AND enum_id = 'PGT_RELEASE' AND enum_type_id = 'PGT_CODE' AND sequence_id = '03');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Refund', 'REFUND', 'PGT_REFUND', 'PGT_CODE', '04'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Refund' AND enum_code = 'REFUND' AND enum_id = 'PGT_REFUND' AND enum_type_id = 'PGT_CODE' AND sequence_id = '04');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Credit', 'CREDIT', 'PGT_CREDIT', 'PGT_CODE', '05'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Credit' AND enum_code = 'CREDIT' AND enum_id = 'PGT_CREDIT' AND enum_type_id = 'PGT_CODE' AND sequence_id = '05');

INSERT INTO enumeration_type (description, enum_type_id, has_table)
SELECT 'Financial Account Replenish Type', 'FARP_TYPE', 0
WHERE NOT EXISTS (SELECT 1 FROM enumeration_type WHERE description = 'Financial Account Replenish Type' AND enum_type_id = 'FARP_TYPE' AND has_table = 0);

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Automatic Replenish', 'AUTOMATIC', 'FARP_AUTOMATIC', 'FARP_TYPE', '01'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Automatic Replenish' AND enum_code = 'AUTOMATIC' AND enum_id = 'FARP_AUTOMATIC' AND enum_type_id = 'FARP_TYPE' AND sequence_id = '01');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Manual Replenish', 'MANUAL', 'FARP_MANUAL', 'FARP_TYPE', '02'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Manual Replenish' AND enum_code = 'MANUAL' AND enum_id = 'FARP_MANUAL' AND enum_type_id = 'FARP_TYPE' AND sequence_id = '02');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'No Replenish', 'NONE', 'FARP_NONE', 'FARP_TYPE', '03'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'No Replenish' AND enum_code = 'NONE' AND enum_id = 'FARP_NONE' AND enum_type_id = 'FARP_TYPE' AND sequence_id = '03');

INSERT INTO enumeration_type (description, enum_type_id, has_table)
SELECT 'Financial Account Replenish Method', 'FARP_METHOD', 0
WHERE NOT EXISTS (SELECT 1 FROM enumeration_type WHERE description = 'Financial Account Replenish Method' AND enum_type_id = 'FARP_METHOD' AND has_table = 0);

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Top-off', 'TOP_OFF', 'FARP_TOP_OFF', 'FARP_METHOD', '01'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Top-off' AND enum_code = 'TOP_OFF' AND enum_id = 'FARP_TOP_OFF' AND enum_type_id = 'FARP_METHOD' AND sequence_id = '01');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Replenish-level', 'REPLENISH_LEVEL', 'FARP_REPLENISH_LEVEL', 'FARP_METHOD', '02'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Replenish-level' AND enum_code = 'REPLENISH_LEVEL' AND enum_id = 'FARP_REPLENISH_LEVEL' AND enum_type_id = 'FARP_METHOD' AND sequence_id = '02');

INSERT INTO fin_account_trans_type (description, fin_account_trans_type_id, has_table)
SELECT 'Deposit', 'DEPOSIT', 0
WHERE NOT EXISTS (SELECT 1 FROM fin_account_trans_type WHERE description = 'Deposit' AND fin_account_trans_type_id = 'DEPOSIT' AND has_table = 0);

INSERT INTO fin_account_trans_type (description, fin_account_trans_type_id, has_table)
SELECT 'Withdraw', 'WITHDRAWAL', 0
WHERE NOT EXISTS (SELECT 1 FROM fin_account_trans_type WHERE description = 'Withdraw' AND fin_account_trans_type_id = 'WITHDRAWAL' AND has_table = 0);

INSERT INTO fin_account_trans_type (description, fin_account_trans_type_id, has_table)
SELECT 'Adjustment', 'ADJUSTMENT', 0
WHERE NOT EXISTS (SELECT 1 FROM fin_account_trans_type WHERE description = 'Adjustment' AND fin_account_trans_type_id = 'ADJUSTMENT' AND has_table = 0);

INSERT INTO fin_account_type (description, fin_account_type_id, has_table, is_refundable, replenish_enum_id)
SELECT 'Gift Certificate', 'GIFTCERT_ACCOUNT', 0, 0, 'FARP_MANUAL'
WHERE NOT EXISTS (SELECT 1 FROM fin_account_type WHERE description = 'Gift Certificate' AND fin_account_type_id = 'GIFTCERT_ACCOUNT' AND has_table = 0 AND is_refundable = 0 AND replenish_enum_id = 'FARP_MANUAL');

INSERT INTO fin_account_type (description, fin_account_type_id, has_table, is_refundable, replenish_enum_id)
SELECT 'Deposit Account', 'DEPOSIT_ACCOUNT', 0, 1, 'FARP_MANUAL'
WHERE NOT EXISTS (SELECT 1 FROM fin_account_type WHERE description = 'Deposit Account' AND fin_account_type_id = 'DEPOSIT_ACCOUNT' AND has_table = 0 AND is_refundable = 1 AND replenish_enum_id = 'FARP_MANUAL');

INSERT INTO fin_account_type (description, fin_account_type_id, has_table, is_refundable, parent_type_id, replenish_enum_id)
SELECT 'Bank Account', 'BANK_ACCOUNT', 0, 1, 'DEPOSIT_ACCOUNT', 'FARP_MANUAL'
WHERE NOT EXISTS (SELECT 1 FROM fin_account_type WHERE description = 'Bank Account' AND fin_account_type_id = 'BANK_ACCOUNT' AND has_table = 0 AND is_refundable = 1 AND parent_type_id = 'DEPOSIT_ACCOUNT' AND replenish_enum_id = 'FARP_MANUAL');

INSERT INTO fin_account_type (description, fin_account_type_id, has_table, is_refundable, parent_type_id, replenish_enum_id)
SELECT 'Store Credit Account', 'STORE_CREDIT_ACCT', 0, 1, 'DEPOSIT_ACCOUNT', 'FARP_MANUAL'
WHERE NOT EXISTS (SELECT 1 FROM fin_account_type WHERE description = 'Store Credit Account' AND fin_account_type_id = 'STORE_CREDIT_ACCT' AND has_table = 0 AND is_refundable = 1 AND parent_type_id = 'DEPOSIT_ACCOUNT' AND replenish_enum_id = 'FARP_MANUAL');

INSERT INTO fin_account_type (description, fin_account_type_id, has_table, is_refundable, parent_type_id, replenish_enum_id)
SELECT 'Investment Account', 'INVESTMENT_ACCOUNT', 0, 1, 'DEPOSIT_ACCOUNT', 'FARP_MANUAL'
WHERE NOT EXISTS (SELECT 1 FROM fin_account_type WHERE description = 'Investment Account' AND fin_account_type_id = 'INVESTMENT_ACCOUNT' AND has_table = 0 AND is_refundable = 1 AND parent_type_id = 'DEPOSIT_ACCOUNT' AND replenish_enum_id = 'FARP_MANUAL');

INSERT INTO fin_account_type (description, fin_account_type_id, has_table, is_refundable, parent_type_id, replenish_enum_id)
SELECT 'Replenish Account', 'REPLENISH_ACCOUNT', 0, 1, 'DEPOSIT_ACCOUNT', 'FARP_AUTOMATIC'
WHERE NOT EXISTS (SELECT 1 FROM fin_account_type WHERE description = 'Replenish Account' AND fin_account_type_id = 'REPLENISH_ACCOUNT' AND has_table = 0 AND is_refundable = 1 AND parent_type_id = 'DEPOSIT_ACCOUNT' AND replenish_enum_id = 'FARP_AUTOMATIC');

INSERT INTO fin_account_type (description, fin_account_type_id, has_table, is_refundable, replenish_enum_id)
SELECT 'Service Credit Account', 'SVCCRED_ACCOUNT', 0, 0, 'FARP_MANUAL'
WHERE NOT EXISTS (SELECT 1 FROM fin_account_type WHERE description = 'Service Credit Account' AND fin_account_type_id = 'SVCCRED_ACCOUNT' AND has_table = 0 AND is_refundable = 0 AND replenish_enum_id = 'FARP_MANUAL');

INSERT INTO fin_account_type (description, fin_account_type_id, has_table, is_refundable, replenish_enum_id)
SELECT 'Loan Account', 'LOAN_ACCOUNT', 0, 1, 'FARP_MANUAL'
WHERE NOT EXISTS (SELECT 1 FROM fin_account_type WHERE description = 'Loan Account' AND fin_account_type_id = 'LOAN_ACCOUNT' AND has_table = 0 AND is_refundable = 1 AND replenish_enum_id = 'FARP_MANUAL');

INSERT INTO fin_account_type (description, fin_account_type_id, has_table, is_refundable, parent_type_id, replenish_enum_id)
SELECT 'Credit Card Account', 'CREDIT_CARD_ACCOUNT', 0, 1, 'LOAN_ACCOUNT', 'FARP_MANUAL'
WHERE NOT EXISTS (SELECT 1 FROM fin_account_type WHERE description = 'Credit Card Account' AND fin_account_type_id = 'CREDIT_CARD_ACCOUNT' AND has_table = 0 AND is_refundable = 1 AND parent_type_id = 'LOAN_ACCOUNT' AND replenish_enum_id = 'FARP_MANUAL');

INSERT INTO fin_account_type (description, fin_account_type_id, has_table, is_refundable, parent_type_id, replenish_enum_id)
SELECT 'Equity Line Account', 'EQUITY_LINE_ACCOUNT', 0, 1, 'LOAN_ACCOUNT', 'FARP_MANUAL'
WHERE NOT EXISTS (SELECT 1 FROM fin_account_type WHERE description = 'Equity Line Account' AND fin_account_type_id = 'EQUITY_LINE_ACCOUNT' AND has_table = 0 AND is_refundable = 1 AND parent_type_id = 'LOAN_ACCOUNT' AND replenish_enum_id = 'FARP_MANUAL');

INSERT INTO status_type (description, has_table, status_type_id)
SELECT 'Financial Account Status', 0, 'FINACCT_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_type WHERE description = 'Financial Account Status' AND has_table = 0 AND status_type_id = 'FINACCT_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Active', '01', 'ACTIVE', 'FNACT_ACTIVE', 'FINACCT_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Active' AND sequence_id = '01' AND status_code = 'ACTIVE' AND status_id = 'FNACT_ACTIVE' AND status_type_id = 'FINACCT_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Negative Pending Replenishment', '02', 'NEGPENDREPL', 'FNACT_NEGPENDREPL', 'FINACCT_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Negative Pending Replenishment' AND sequence_id = '02' AND status_code = 'NEGPENDREPL' AND status_id = 'FNACT_NEGPENDREPL' AND status_type_id = 'FINACCT_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Manually Frozen', '03', 'MANFROZEN', 'FNACT_MANFROZEN', 'FINACCT_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Manually Frozen' AND sequence_id = '03' AND status_code = 'MANFROZEN' AND status_id = 'FNACT_MANFROZEN' AND status_type_id = 'FINACCT_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Cancelled', '09', 'CANCELLED', 'FNACT_CANCELLED', 'FINACCT_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Cancelled' AND sequence_id = '09' AND status_code = 'CANCELLED' AND status_id = 'FNACT_CANCELLED' AND status_type_id = 'FINACCT_STATUS');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'FNACT_ACTIVE', 'FNACT_NEGPENDREPL', 'Set Negative Pending Replenishment'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'FNACT_ACTIVE' AND status_id_to = 'FNACT_NEGPENDREPL' AND transition_name = 'Set Negative Pending Replenishment');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'FNACT_ACTIVE', 'FNACT_MANFROZEN', 'Set Manually Frozen'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'FNACT_ACTIVE' AND status_id_to = 'FNACT_MANFROZEN' AND transition_name = 'Set Manually Frozen');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'FNACT_ACTIVE', 'FNACT_CANCELLED', 'Cancel'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'FNACT_ACTIVE' AND status_id_to = 'FNACT_CANCELLED' AND transition_name = 'Cancel');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'FNACT_NEGPENDREPL', 'FNACT_ACTIVE', 'Re-activate'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'FNACT_NEGPENDREPL' AND status_id_to = 'FNACT_ACTIVE' AND transition_name = 'Re-activate');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'FNACT_NEGPENDREPL', 'FNACT_MANFROZEN', 'Manually Freeze'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'FNACT_NEGPENDREPL' AND status_id_to = 'FNACT_MANFROZEN' AND transition_name = 'Manually Freeze');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'FNACT_NEGPENDREPL', 'FNACT_CANCELLED', 'Cancel'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'FNACT_NEGPENDREPL' AND status_id_to = 'FNACT_CANCELLED' AND transition_name = 'Cancel');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'FNACT_MANFROZEN', 'FNACT_ACTIVE', 'Re-activate'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'FNACT_MANFROZEN' AND status_id_to = 'FNACT_ACTIVE' AND transition_name = 'Re-activate');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'FNACT_MANFROZEN', 'FNACT_CANCELLED', 'Cancel'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'FNACT_MANFROZEN' AND status_id_to = 'FNACT_CANCELLED' AND transition_name = 'Cancel');

INSERT INTO status_type (description, has_table, status_type_id)
SELECT 'Financial Account Trans Status', 0, 'FINACT_TRNS_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_type WHERE description = 'Financial Account Trans Status' AND has_table = 0 AND status_type_id = 'FINACT_TRNS_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Approved', '11', 'APPROVED', 'FINACT_TRNS_APPROVED', 'FINACT_TRNS_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Approved' AND sequence_id = '11' AND status_code = 'APPROVED' AND status_id = 'FINACT_TRNS_APPROVED' AND status_type_id = 'FINACT_TRNS_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Created', '12', 'CREATED', 'FINACT_TRNS_CREATED', 'FINACT_TRNS_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Created' AND sequence_id = '12' AND status_code = 'CREATED' AND status_id = 'FINACT_TRNS_CREATED' AND status_type_id = 'FINACT_TRNS_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Canceled', '13', 'CANCELED', 'FINACT_TRNS_CANCELED', 'FINACT_TRNS_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Canceled' AND sequence_id = '13' AND status_code = 'CANCELED' AND status_id = 'FINACT_TRNS_CANCELED' AND status_type_id = 'FINACT_TRNS_STATUS');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'FINACT_TRNS_CREATED', 'FINACT_TRNS_APPROVED', 'Set Created to Approved'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'FINACT_TRNS_CREATED' AND status_id_to = 'FINACT_TRNS_APPROVED' AND transition_name = 'Set Created to Approved');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'FINACT_TRNS_CREATED', 'FINACT_TRNS_CANCELED', 'Set Created to Canceled'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'FINACT_TRNS_CREATED' AND status_id_to = 'FINACT_TRNS_CANCELED' AND transition_name = 'Set Created to Canceled');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'FINACT_TRNS_APPROVED', 'FINACT_TRNS_CANCELED', 'Set Approved to Canceled'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'FINACT_TRNS_APPROVED' AND status_id_to = 'FINACT_TRNS_CANCELED' AND transition_name = 'Set Approved to Canceled');

INSERT INTO enumeration_type (description, enum_type_id, has_table)
SELECT 'Service Debit Reasons', 'FINACCT_TRANS_REASON', 0
WHERE NOT EXISTS (SELECT 1 FROM enumeration_type WHERE description = 'Service Debit Reasons' AND enum_type_id = 'FINACCT_TRANS_REASON' AND has_table = 0);

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Purchase', 'PURCHASE', 'FATR_PURCHASE', 'FINACCT_TRANS_REASON', '01'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Purchase' AND enum_code = 'PURCHASE' AND enum_id = 'FATR_PURCHASE' AND enum_type_id = 'FINACCT_TRANS_REASON' AND sequence_id = '01');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Initial Deposit', 'IDEPOSIT', 'FATR_IDEPOSIT', 'FINACCT_TRANS_REASON', '02'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Initial Deposit' AND enum_code = 'IDEPOSIT' AND enum_id = 'FATR_IDEPOSIT' AND enum_type_id = 'FINACCT_TRANS_REASON' AND sequence_id = '02');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Replenishment', 'REPLENISH', 'FATR_REPLENISH', 'FINACCT_TRANS_REASON', '03'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Replenishment' AND enum_code = 'REPLENISH' AND enum_id = 'FATR_REPLENISH' AND enum_type_id = 'FINACCT_TRANS_REASON' AND sequence_id = '03');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Refund', 'REFUND', 'FATR_REFUND', 'FINACCT_TRANS_REASON', '04'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Refund' AND enum_code = 'REFUND' AND enum_id = 'FATR_REFUND' AND enum_type_id = 'FINACCT_TRANS_REASON' AND sequence_id = '04');

INSERT INTO fixed_asset_type (description, fixed_asset_type_id, has_table)
SELECT 'Equipment', 'EQUIPMENT', 0
WHERE NOT EXISTS (SELECT 1 FROM fixed_asset_type WHERE description = 'Equipment' AND fixed_asset_type_id = 'EQUIPMENT' AND has_table = 0);

INSERT INTO fixed_asset_type (description, fixed_asset_type_id, has_table)
SELECT 'The fixed asset used in the operation-routing definition', 'PRODUCTION_EQUIPMENT', 0
WHERE NOT EXISTS (SELECT 1 FROM fixed_asset_type WHERE description = 'The fixed asset used in the operation-routing definition' AND fixed_asset_type_id = 'PRODUCTION_EQUIPMENT' AND has_table = 0);

INSERT INTO fixed_asset_type (description, fixed_asset_type_id, has_table)
SELECT 'Group of machines, used for task and routing definition', 'GROUP_EQUIPMENT', 0
WHERE NOT EXISTS (SELECT 1 FROM fixed_asset_type WHERE description = 'Group of machines, used for task and routing definition' AND fixed_asset_type_id = 'GROUP_EQUIPMENT' AND has_table = 0);

INSERT INTO fixed_asset_type (description, fixed_asset_type_id, has_table)
SELECT 'Other Fixed Asset', 'OTHER_FIXED_ASSET', 0
WHERE NOT EXISTS (SELECT 1 FROM fixed_asset_type WHERE description = 'Other Fixed Asset' AND fixed_asset_type_id = 'OTHER_FIXED_ASSET' AND has_table = 0);

INSERT INTO fixed_asset_type (description, fixed_asset_type_id, has_table)
SELECT 'Property', 'PROPERTY', 0
WHERE NOT EXISTS (SELECT 1 FROM fixed_asset_type WHERE description = 'Property' AND fixed_asset_type_id = 'PROPERTY' AND has_table = 0);

INSERT INTO fixed_asset_type (description, fixed_asset_type_id, has_table)
SELECT 'Vehicle', 'VEHICLE', 0
WHERE NOT EXISTS (SELECT 1 FROM fixed_asset_type WHERE description = 'Vehicle' AND fixed_asset_type_id = 'VEHICLE' AND has_table = 0);

INSERT INTO fixed_asset_type (description, fixed_asset_type_id, has_table)
SELECT 'Real Estate', 'REAL_ESTATE', 0
WHERE NOT EXISTS (SELECT 1 FROM fixed_asset_type WHERE description = 'Real Estate' AND fixed_asset_type_id = 'REAL_ESTATE' AND has_table = 0);

INSERT INTO fixed_asset_type (description, fixed_asset_type_id, has_table)
SELECT 'Computer Software', 'COMPUTER_SOFTWARE', 0
WHERE NOT EXISTS (SELECT 1 FROM fixed_asset_type WHERE description = 'Computer Software' AND fixed_asset_type_id = 'COMPUTER_SOFTWARE' AND has_table = 0);

INSERT INTO fixed_asset_type (description, fixed_asset_type_id, has_table)
SELECT 'Computer Hardware', 'COMPUTER_HARDWARE', 0
WHERE NOT EXISTS (SELECT 1 FROM fixed_asset_type WHERE description = 'Computer Hardware' AND fixed_asset_type_id = 'COMPUTER_HARDWARE' AND has_table = 0);

INSERT INTO enumeration_type (description, enum_type_id, has_table)
SELECT 'Fixed Asset Class', 'FXAST_CLASS', 0
WHERE NOT EXISTS (SELECT 1 FROM enumeration_type WHERE description = 'Fixed Asset Class' AND enum_type_id = 'FXAST_CLASS' AND has_table = 0);

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Boat', 'BOAT', 'FAC_BOAT', 'FXAST_CLASS', '01'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Boat' AND enum_code = 'BOAT' AND enum_id = 'FAC_BOAT' AND enum_type_id = 'FXAST_CLASS' AND sequence_id = '01');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Forklift', 'FORKLIFT', 'FAC_FORKLIFT', 'FXAST_CLASS', '01'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Forklift' AND enum_code = 'FORKLIFT' AND enum_id = 'FAC_FORKLIFT' AND enum_type_id = 'FXAST_CLASS' AND sequence_id = '01');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Digger', 'DIGGER', 'FAC_DIGGER', 'FXAST_CLASS', '01'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Digger' AND enum_code = 'DIGGER' AND enum_id = 'FAC_DIGGER' AND enum_type_id = 'FXAST_CLASS' AND sequence_id = '01');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Manlift', 'MANLIFT', 'FAC_MANLIFT', 'FXAST_CLASS', '01'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Manlift' AND enum_code = 'MANLIFT' AND enum_id = 'FAC_MANLIFT' AND enum_type_id = 'FXAST_CLASS' AND sequence_id = '01');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Service Body', 'SERVICE_BODY', 'FAC_SERVICE_BODY', 'FXAST_CLASS', '01'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Service Body' AND enum_code = 'SERVICE_BODY' AND enum_id = 'FAC_SERVICE_BODY' AND enum_type_id = 'FXAST_CLASS' AND sequence_id = '01');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Tractor', 'TRACTOR', 'FAC_TRACTOR', 'FXAST_CLASS', '01'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Tractor' AND enum_code = 'TRACTOR' AND enum_id = 'FAC_TRACTOR' AND enum_type_id = 'FXAST_CLASS' AND sequence_id = '01');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Passenger Vehicle', 'PASSENGER', 'FAC_PASSENGER', 'FXAST_CLASS', '01'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Passenger Vehicle' AND enum_code = 'PASSENGER' AND enum_id = 'FAC_PASSENGER' AND enum_type_id = 'FXAST_CLASS' AND sequence_id = '01');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Compressor', 'COMPRESSOR', 'FAC_COMPRESSOR', 'FXAST_CLASS', '01'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Compressor' AND enum_code = 'COMPRESSOR' AND enum_id = 'FAC_COMPRESSOR' AND enum_type_id = 'FXAST_CLASS' AND sequence_id = '01');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Trencher', 'TRENCHER', 'FAC_TRENCHER', 'FXAST_CLASS', '01'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Trencher' AND enum_code = 'TRENCHER' AND enum_id = 'FAC_TRENCHER' AND enum_type_id = 'FXAST_CLASS' AND sequence_id = '01');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Puller', 'PULLER', 'FAC_PULLER', 'FXAST_CLASS', '01'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Puller' AND enum_code = 'PULLER' AND enum_id = 'FAC_PULLER' AND enum_type_id = 'FXAST_CLASS' AND sequence_id = '01');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Mobile', 'MOBILE', 'FAC_MOBILE', 'FXAST_CLASS', '01'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Mobile' AND enum_code = 'MOBILE' AND enum_id = 'FAC_MOBILE' AND enum_type_id = 'FXAST_CLASS' AND sequence_id = '01');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Tanker', 'TANKER', 'FAC_TANKER', 'FXAST_CLASS', '01'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Tanker' AND enum_code = 'TANKER' AND enum_id = 'FAC_TANKER' AND enum_type_id = 'FXAST_CLASS' AND sequence_id = '01');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Reel Stand', 'REEL_STAND', 'FAC_REEL_STAND', 'FXAST_CLASS', '01'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Reel Stand' AND enum_code = 'REEL_STAND' AND enum_id = 'FAC_REEL_STAND' AND enum_type_id = 'FXAST_CLASS' AND sequence_id = '01');

INSERT INTO enumeration_type (description, enum_type_id, has_table, parent_type_id)
SELECT 'Computer Hardware', 'FXAST_COMPU_HARDWARE', 0, 'FXAST_CLASS'
WHERE NOT EXISTS (SELECT 1 FROM enumeration_type WHERE description = 'Computer Hardware' AND enum_type_id = 'FXAST_COMPU_HARDWARE' AND has_table = 0 AND parent_type_id = 'FXAST_CLASS');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Desktop', 'DESKTOP', 'FAC_DESKTOP', 'FXAST_COMPU_HARDWARE', '01'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Desktop' AND enum_code = 'DESKTOP' AND enum_id = 'FAC_DESKTOP' AND enum_type_id = 'FXAST_COMPU_HARDWARE' AND sequence_id = '01');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Laptop', 'LAPTOP', 'FAC_LAPTOP', 'FXAST_COMPU_HARDWARE', '01'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Laptop' AND enum_code = 'LAPTOP' AND enum_id = 'FAC_LAPTOP' AND enum_type_id = 'FXAST_COMPU_HARDWARE' AND sequence_id = '01');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Monitor', 'MONITOR', 'FAC_MONITOR', 'FXAST_COMPU_HARDWARE', '01'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Monitor' AND enum_code = 'MONITOR' AND enum_id = 'FAC_MONITOR' AND enum_type_id = 'FXAST_COMPU_HARDWARE' AND sequence_id = '01');

INSERT INTO enumeration_type (description, enum_type_id, has_table, parent_type_id)
SELECT 'Computer Software', 'FXAST_COMPU_SOFTWARE', 0, 'FXAST_CLASS'
WHERE NOT EXISTS (SELECT 1 FROM enumeration_type WHERE description = 'Computer Software' AND enum_type_id = 'FXAST_COMPU_SOFTWARE' AND has_table = 0 AND parent_type_id = 'FXAST_CLASS');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Programming Software', 'PRG_SOFTWARE', 'FAC_PRG_SOFTWARE', 'FXAST_COMPU_SOFTWARE', '01'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Programming Software' AND enum_code = 'PRG_SOFTWARE' AND enum_id = 'FAC_PRG_SOFTWARE' AND enum_type_id = 'FXAST_COMPU_SOFTWARE' AND sequence_id = '01');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'System Software', 'SYS_SOFTWARE', 'FAC_SYS_SOFTWARE', 'FXAST_COMPU_SOFTWARE', '01'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'System Software' AND enum_code = 'SYS_SOFTWARE' AND enum_id = 'FAC_SYS_SOFTWARE' AND enum_type_id = 'FXAST_COMPU_SOFTWARE' AND sequence_id = '01');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Application Software', 'APP_SOFTWARE', 'FAC_APP_SOFTWARE', 'FXAST_COMPU_SOFTWARE', '01'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Application Software' AND enum_code = 'APP_SOFTWARE' AND enum_id = 'FAC_APP_SOFTWARE' AND enum_type_id = 'FXAST_COMPU_SOFTWARE' AND sequence_id = '01');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Utility Software', 'UTIL_SOFTWARE', 'FAC_UTIL_SOFTWARE', 'FXAST_COMPU_SOFTWARE', '01'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Utility Software' AND enum_code = 'UTIL_SOFTWARE' AND enum_id = 'FAC_UTIL_SOFTWARE' AND enum_type_id = 'FXAST_COMPU_SOFTWARE' AND sequence_id = '01');

INSERT INTO fixed_asset_ident_type (description, fixed_asset_ident_type_id)
SELECT 'Mfg Serial Number', 'MFG_SERIAL'
WHERE NOT EXISTS (SELECT 1 FROM fixed_asset_ident_type WHERE description = 'Mfg Serial Number' AND fixed_asset_ident_type_id = 'MFG_SERIAL');

INSERT INTO fixed_asset_ident_type (description, fixed_asset_ident_type_id)
SELECT 'Vendor Tracking/Inventory Number', 'TRACKING_VENDOR'
WHERE NOT EXISTS (SELECT 1 FROM fixed_asset_ident_type WHERE description = 'Vendor Tracking/Inventory Number' AND fixed_asset_ident_type_id = 'TRACKING_VENDOR');

INSERT INTO fixed_asset_ident_type (description, fixed_asset_ident_type_id)
SELECT 'Internal Tracking Label Number', 'TRACKING_LABEL'
WHERE NOT EXISTS (SELECT 1 FROM fixed_asset_ident_type WHERE description = 'Internal Tracking Label Number' AND fixed_asset_ident_type_id = 'TRACKING_LABEL');

INSERT INTO fixed_asset_ident_type (description, fixed_asset_ident_type_id)
SELECT 'Vehicle Identification Number (VIN)', 'VIN'
WHERE NOT EXISTS (SELECT 1 FROM fixed_asset_ident_type WHERE description = 'Vehicle Identification Number (VIN)' AND fixed_asset_ident_type_id = 'VIN');

INSERT INTO fixed_asset_ident_type (description, fixed_asset_ident_type_id)
SELECT 'Gas Card Number 1', 'GAS_CARD1'
WHERE NOT EXISTS (SELECT 1 FROM fixed_asset_ident_type WHERE description = 'Gas Card Number 1' AND fixed_asset_ident_type_id = 'GAS_CARD1');

INSERT INTO fixed_asset_ident_type (description, fixed_asset_ident_type_id)
SELECT 'Gas Card Number 2', 'GAS_CARD2'
WHERE NOT EXISTS (SELECT 1 FROM fixed_asset_ident_type WHERE description = 'Gas Card Number 2' AND fixed_asset_ident_type_id = 'GAS_CARD2');

INSERT INTO fixed_asset_ident_type (description, fixed_asset_ident_type_id)
SELECT 'Gas Card Number 3', 'GAS_CARD3'
WHERE NOT EXISTS (SELECT 1 FROM fixed_asset_ident_type WHERE description = 'Gas Card Number 3' AND fixed_asset_ident_type_id = 'GAS_CARD3');

INSERT INTO status_type (description, has_table, status_type_id)
SELECT 'Fixed Asset Maintenance', 0, 'FIXEDAST_MNT_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_type WHERE description = 'Fixed Asset Maintenance' AND has_table = 0 AND status_type_id = 'FIXEDAST_MNT_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Created', '01', 'CREATED', 'FAM_CREATED', 'FIXEDAST_MNT_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Created' AND sequence_id = '01' AND status_code = 'CREATED' AND status_id = 'FAM_CREATED' AND status_type_id = 'FIXEDAST_MNT_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Scheduled', '03', 'SCHEDULED', 'FAM_SCHEDULED', 'FIXEDAST_MNT_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Scheduled' AND sequence_id = '03' AND status_code = 'SCHEDULED' AND status_id = 'FAM_SCHEDULED' AND status_type_id = 'FIXEDAST_MNT_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'In Process', '05', 'IN_PROCESS', 'FAM_IN_PROCESS', 'FIXEDAST_MNT_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'In Process' AND sequence_id = '05' AND status_code = 'IN_PROCESS' AND status_id = 'FAM_IN_PROCESS' AND status_type_id = 'FIXEDAST_MNT_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Completed', '10', 'COMPLETED', 'FAM_COMPLETED', 'FIXEDAST_MNT_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Completed' AND sequence_id = '10' AND status_code = 'COMPLETED' AND status_id = 'FAM_COMPLETED' AND status_type_id = 'FIXEDAST_MNT_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Cancelled', '99', 'CANCELLED', 'FAM_CANCELLED', 'FIXEDAST_MNT_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Cancelled' AND sequence_id = '99' AND status_code = 'CANCELLED' AND status_id = 'FAM_CANCELLED' AND status_type_id = 'FIXEDAST_MNT_STATUS');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'FAM_CREATED', 'FAM_SCHEDULED', 'Created Maintenance Scheduled'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'FAM_CREATED' AND status_id_to = 'FAM_SCHEDULED' AND transition_name = 'Created Maintenance Scheduled');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'FAM_CREATED', 'FAM_IN_PROCESS', 'Created Maintenance In-Process'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'FAM_CREATED' AND status_id_to = 'FAM_IN_PROCESS' AND transition_name = 'Created Maintenance In-Process');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'FAM_CREATED', 'FAM_CANCELLED', 'Created Maintenace Cancelled'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'FAM_CREATED' AND status_id_to = 'FAM_CANCELLED' AND transition_name = 'Created Maintenace Cancelled');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'FAM_SCHEDULED', 'FAM_IN_PROCESS', 'Scheduled Maintenace In-Process'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'FAM_SCHEDULED' AND status_id_to = 'FAM_IN_PROCESS' AND transition_name = 'Scheduled Maintenace In-Process');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'FAM_SCHEDULED', 'FAM_CANCELLED', 'Scheduled Maintenace Cancelled'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'FAM_SCHEDULED' AND status_id_to = 'FAM_CANCELLED' AND transition_name = 'Scheduled Maintenace Cancelled');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'FAM_IN_PROCESS', 'FAM_COMPLETED', 'In-Process Maintenance Completed'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'FAM_IN_PROCESS' AND status_id_to = 'FAM_COMPLETED' AND transition_name = 'In-Process Maintenance Completed');

INSERT INTO fixed_asset_product_type (description, fixed_asset_product_type_id)
SELECT 'Use of Asset', 'FAPT_USE'
WHERE NOT EXISTS (SELECT 1 FROM fixed_asset_product_type WHERE description = 'Use of Asset' AND fixed_asset_product_type_id = 'FAPT_USE');

INSERT INTO fixed_asset_product_type (description, fixed_asset_product_type_id)
SELECT 'Sale of Asset', 'FAPT_SALE'
WHERE NOT EXISTS (SELECT 1 FROM fixed_asset_product_type WHERE description = 'Sale of Asset' AND fixed_asset_product_type_id = 'FAPT_SALE');

INSERT INTO gl_account_class (description, gl_account_class_id, sequence_num)
SELECT 'Debit', 'DEBIT', '100'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_class WHERE description = 'Debit' AND gl_account_class_id = 'DEBIT' AND sequence_num = '100');

INSERT INTO gl_account_class (description, gl_account_class_id, sequence_num)
SELECT 'Credit', 'CREDIT', '200'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_class WHERE description = 'Credit' AND gl_account_class_id = 'CREDIT' AND sequence_num = '200');

INSERT INTO gl_account_class (description, gl_account_class_id, sequence_num)
SELECT 'Resource', 'RESOURCE', '300'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_class WHERE description = 'Resource' AND gl_account_class_id = 'RESOURCE' AND sequence_num = '300');

INSERT INTO gl_account_class (description, gl_account_class_id, parent_class_id, sequence_num)
SELECT 'Asset', 'ASSET', 'DEBIT', '110'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_class WHERE description = 'Asset' AND gl_account_class_id = 'ASSET' AND parent_class_id = 'DEBIT' AND sequence_num = '110');

INSERT INTO gl_account_class (description, gl_account_class_id, parent_class_id, sequence_num)
SELECT 'Equity Distribution', 'DISTRIBUTION', 'DEBIT', '130'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_class WHERE description = 'Equity Distribution' AND gl_account_class_id = 'DISTRIBUTION' AND parent_class_id = 'DEBIT' AND sequence_num = '130');

INSERT INTO gl_account_class (description, gl_account_class_id, parent_class_id, sequence_num)
SELECT 'Expense', 'EXPENSE', 'DEBIT', '150'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_class WHERE description = 'Expense' AND gl_account_class_id = 'EXPENSE' AND parent_class_id = 'DEBIT' AND sequence_num = '150');

INSERT INTO gl_account_class (description, gl_account_class_id, parent_class_id, sequence_num)
SELECT 'Contra Revenue', 'CONTRA_REVENUE', 'DEBIT', '170'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_class WHERE description = 'Contra Revenue' AND gl_account_class_id = 'CONTRA_REVENUE' AND parent_class_id = 'DEBIT' AND sequence_num = '170');

INSERT INTO gl_account_class (description, gl_account_class_id, parent_class_id, sequence_num)
SELECT 'Non-Posting', 'NON_POSTING', 'DEBIT', '190'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_class WHERE description = 'Non-Posting' AND gl_account_class_id = 'NON_POSTING' AND parent_class_id = 'DEBIT' AND sequence_num = '190');

INSERT INTO gl_account_class (description, gl_account_class_id, parent_class_id, sequence_num)
SELECT 'Liability', 'LIABILITY', 'CREDIT', '210'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_class WHERE description = 'Liability' AND gl_account_class_id = 'LIABILITY' AND parent_class_id = 'CREDIT' AND sequence_num = '210');

INSERT INTO gl_account_class (description, gl_account_class_id, parent_class_id, sequence_num)
SELECT 'Equity', 'EQUITY', 'CREDIT', '230'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_class WHERE description = 'Equity' AND gl_account_class_id = 'EQUITY' AND parent_class_id = 'CREDIT' AND sequence_num = '230');

INSERT INTO gl_account_class (description, gl_account_class_id, parent_class_id, sequence_num)
SELECT 'Revenue', 'REVENUE', 'CREDIT', '250'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_class WHERE description = 'Revenue' AND gl_account_class_id = 'REVENUE' AND parent_class_id = 'CREDIT' AND sequence_num = '250');

INSERT INTO gl_account_class (description, gl_account_class_id, parent_class_id, sequence_num)
SELECT 'Contra Asset', 'CONTRA_ASSET', 'CREDIT', '270'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_class WHERE description = 'Contra Asset' AND gl_account_class_id = 'CONTRA_ASSET' AND parent_class_id = 'CREDIT' AND sequence_num = '270');

INSERT INTO gl_account_class (description, gl_account_class_id, parent_class_id, sequence_num)
SELECT 'Income', 'INCOME', 'CREDIT', '290'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_class WHERE description = 'Income' AND gl_account_class_id = 'INCOME' AND parent_class_id = 'CREDIT' AND sequence_num = '290');

INSERT INTO gl_account_class (description, gl_account_class_id, parent_class_id, sequence_num)
SELECT 'Current Asset', 'CURRENT_ASSET', 'ASSET', '115'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_class WHERE description = 'Current Asset' AND gl_account_class_id = 'CURRENT_ASSET' AND parent_class_id = 'ASSET' AND sequence_num = '115');

INSERT INTO gl_account_class (description, gl_account_class_id, parent_class_id, sequence_num)
SELECT 'Long Term Asset', 'LONGTERM_ASSET', 'ASSET', '125'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_class WHERE description = 'Long Term Asset' AND gl_account_class_id = 'LONGTERM_ASSET' AND parent_class_id = 'ASSET' AND sequence_num = '125');

INSERT INTO gl_account_class (description, gl_account_class_id, parent_class_id, sequence_num)
SELECT 'Cash and Equivalent', 'CASH_EQUIVALENT', 'CURRENT_ASSET', '120'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_class WHERE description = 'Cash and Equivalent' AND gl_account_class_id = 'CASH_EQUIVALENT' AND parent_class_id = 'CURRENT_ASSET' AND sequence_num = '120');

INSERT INTO gl_account_class (description, gl_account_class_id, parent_class_id, sequence_num)
SELECT 'Inventory Asset', 'INVENTORY_ASSET', 'CURRENT_ASSET', '122'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_class WHERE description = 'Inventory Asset' AND gl_account_class_id = 'INVENTORY_ASSET' AND parent_class_id = 'CURRENT_ASSET' AND sequence_num = '122');

INSERT INTO gl_account_class (description, gl_account_class_id, parent_class_id, sequence_num)
SELECT 'Return of Capital', 'RETURN_OF_CAPITAL', 'DISTRIBUTION', '135'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_class WHERE description = 'Return of Capital' AND gl_account_class_id = 'RETURN_OF_CAPITAL' AND parent_class_id = 'DISTRIBUTION' AND sequence_num = '135');

INSERT INTO gl_account_class (description, gl_account_class_id, parent_class_id, sequence_num)
SELECT 'Dividends', 'DIVIDEND', 'DISTRIBUTION', '145'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_class WHERE description = 'Dividends' AND gl_account_class_id = 'DIVIDEND' AND parent_class_id = 'DISTRIBUTION' AND sequence_num = '145');

INSERT INTO gl_account_class (description, gl_account_class_id, parent_class_id, sequence_num)
SELECT 'Cash Expense', 'CASH_EXPENSE', 'EXPENSE', '155'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_class WHERE description = 'Cash Expense' AND gl_account_class_id = 'CASH_EXPENSE' AND parent_class_id = 'EXPENSE' AND sequence_num = '155');

INSERT INTO gl_account_class (description, gl_account_class_id, parent_class_id, sequence_num)
SELECT 'Non-Cash Expense', 'NON_CASH_EXPENSE', 'EXPENSE', '165'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_class WHERE description = 'Non-Cash Expense' AND gl_account_class_id = 'NON_CASH_EXPENSE' AND parent_class_id = 'EXPENSE' AND sequence_num = '165');

INSERT INTO gl_account_class (description, gl_account_class_id, parent_class_id, sequence_num)
SELECT 'Interest Expense', 'INTEREST_EXPENSE', 'CASH_EXPENSE', '160'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_class WHERE description = 'Interest Expense' AND gl_account_class_id = 'INTEREST_EXPENSE' AND parent_class_id = 'CASH_EXPENSE' AND sequence_num = '160');

INSERT INTO gl_account_class (description, gl_account_class_id, parent_class_id, sequence_num)
SELECT 'Cost of Goods Sold Expense', 'COGS_EXPENSE', 'CASH_EXPENSE', '162'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_class WHERE description = 'Cost of Goods Sold Expense' AND gl_account_class_id = 'COGS_EXPENSE' AND parent_class_id = 'CASH_EXPENSE' AND sequence_num = '162');

INSERT INTO gl_account_class (description, gl_account_class_id, parent_class_id, sequence_num)
SELECT 'Selling, General, and Administrative Expense', 'SGA_EXPENSE', 'CASH_EXPENSE', '165'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_class WHERE description = 'Selling, General, and Administrative Expense' AND gl_account_class_id = 'SGA_EXPENSE' AND parent_class_id = 'CASH_EXPENSE' AND sequence_num = '165');

INSERT INTO gl_account_class (description, gl_account_class_id, parent_class_id, sequence_num)
SELECT 'Depreciation', 'DEPRECIATION', 'NON_CASH_EXPENSE', '166'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_class WHERE description = 'Depreciation' AND gl_account_class_id = 'DEPRECIATION' AND parent_class_id = 'NON_CASH_EXPENSE' AND sequence_num = '166');

INSERT INTO gl_account_class (description, gl_account_class_id, parent_class_id, sequence_num)
SELECT 'Amortization', 'AMORTIZATION', 'NON_CASH_EXPENSE', '168'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_class WHERE description = 'Amortization' AND gl_account_class_id = 'AMORTIZATION' AND parent_class_id = 'NON_CASH_EXPENSE' AND sequence_num = '168');

INSERT INTO gl_account_class (description, gl_account_class_id, parent_class_id, sequence_num)
SELECT 'Inventory Adjustment', 'INVENTORY_ADJUST', 'NON_CASH_EXPENSE', '169'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_class WHERE description = 'Inventory Adjustment' AND gl_account_class_id = 'INVENTORY_ADJUST' AND parent_class_id = 'NON_CASH_EXPENSE' AND sequence_num = '169');

INSERT INTO gl_account_class (description, gl_account_class_id, parent_class_id, sequence_num)
SELECT 'Current Liability', 'CURRENT_LIABILITY', 'LIABILITY', '215'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_class WHERE description = 'Current Liability' AND gl_account_class_id = 'CURRENT_LIABILITY' AND parent_class_id = 'LIABILITY' AND sequence_num = '215');

INSERT INTO gl_account_class (description, gl_account_class_id, parent_class_id, sequence_num)
SELECT 'Long Term Liability', 'LONGTERM_LIABILITY', 'LIABILITY', '225'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_class WHERE description = 'Long Term Liability' AND gl_account_class_id = 'LONGTERM_LIABILITY' AND parent_class_id = 'LIABILITY' AND sequence_num = '225');

INSERT INTO gl_account_class (description, gl_account_class_id, parent_class_id, sequence_num)
SELECT 'Owners Equity', 'OWNERS_EQUITY', 'EQUITY', '235'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_class WHERE description = 'Owners Equity' AND gl_account_class_id = 'OWNERS_EQUITY' AND parent_class_id = 'EQUITY' AND sequence_num = '235');

INSERT INTO gl_account_class (description, gl_account_class_id, parent_class_id, sequence_num)
SELECT 'Retained Earnings', 'RETAINED_EARNINGS', 'EQUITY', '245'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_class WHERE description = 'Retained Earnings' AND gl_account_class_id = 'RETAINED_EARNINGS' AND parent_class_id = 'EQUITY' AND sequence_num = '245');

INSERT INTO gl_account_class (description, gl_account_class_id, parent_class_id, sequence_num)
SELECT 'Accumulated Depreciation', 'ACCUM_DEPRECIATION', 'CONTRA_ASSET', '275'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_class WHERE description = 'Accumulated Depreciation' AND gl_account_class_id = 'ACCUM_DEPRECIATION' AND parent_class_id = 'CONTRA_ASSET' AND sequence_num = '275');

INSERT INTO gl_account_class (description, gl_account_class_id, parent_class_id, sequence_num)
SELECT 'Accumulated Amortization', 'ACCUM_AMORTIZATION', 'CONTRA_ASSET', '285'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_class WHERE description = 'Accumulated Amortization' AND gl_account_class_id = 'ACCUM_AMORTIZATION' AND parent_class_id = 'CONTRA_ASSET' AND sequence_num = '285');

INSERT INTO gl_account_class (description, gl_account_class_id, parent_class_id, sequence_num)
SELECT 'Cash Income', 'CASH_INCOME', 'INCOME', '295'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_class WHERE description = 'Cash Income' AND gl_account_class_id = 'CASH_INCOME' AND parent_class_id = 'INCOME' AND sequence_num = '295');

INSERT INTO gl_account_class (description, gl_account_class_id, parent_class_id, sequence_num)
SELECT 'Non-Cash Income', 'NON_CASH_INCOME', 'INCOME', '298'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_class WHERE description = 'Non-Cash Income' AND gl_account_class_id = 'NON_CASH_INCOME' AND parent_class_id = 'INCOME' AND sequence_num = '298');

INSERT INTO gl_account_type (description, gl_account_type_id, has_table)
SELECT 'Not Applicable', '_NA_', 0
WHERE NOT EXISTS (SELECT 1 FROM gl_account_type WHERE description = 'Not Applicable' AND gl_account_type_id = '_NA_' AND has_table = 0);

INSERT INTO gl_account_type (description, gl_account_type_id, has_table)
SELECT 'Accounts Receivable', 'ACCOUNTS_RECEIVABLE', 0
WHERE NOT EXISTS (SELECT 1 FROM gl_account_type WHERE description = 'Accounts Receivable' AND gl_account_type_id = 'ACCOUNTS_RECEIVABLE' AND has_table = 0);

INSERT INTO gl_account_type (description, gl_account_type_id, has_table)
SELECT 'Accounts Payable', 'ACCOUNTS_PAYABLE', 0
WHERE NOT EXISTS (SELECT 1 FROM gl_account_type WHERE description = 'Accounts Payable' AND gl_account_type_id = 'ACCOUNTS_PAYABLE' AND has_table = 0);

INSERT INTO gl_account_type (description, gl_account_type_id, has_table)
SELECT 'Balance', 'BALANCE_ACCOUNT', 0
WHERE NOT EXISTS (SELECT 1 FROM gl_account_type WHERE description = 'Balance' AND gl_account_type_id = 'BALANCE_ACCOUNT' AND has_table = 0);

INSERT INTO gl_account_type (description, gl_account_type_id, has_table)
SELECT 'Bank Settlement', 'BANK_STLMNT_ACCOUNT', 0
WHERE NOT EXISTS (SELECT 1 FROM gl_account_type WHERE description = 'Bank Settlement' AND gl_account_type_id = 'BANK_STLMNT_ACCOUNT' AND has_table = 0);

INSERT INTO gl_account_type (description, gl_account_type_id, has_table)
SELECT 'Undeposited Receipts', 'UNDEPOSITED_RECEIPTS', 0
WHERE NOT EXISTS (SELECT 1 FROM gl_account_type WHERE description = 'Undeposited Receipts' AND gl_account_type_id = 'UNDEPOSITED_RECEIPTS' AND has_table = 0);

INSERT INTO gl_account_type (description, gl_account_type_id, has_table, parent_type_id)
SELECT 'Merchant Account Settlement', 'MRCH_STLMNT_ACCOUNT', 0, 'ACCOUNTS_RECEIVABLE'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_type WHERE description = 'Merchant Account Settlement' AND gl_account_type_id = 'MRCH_STLMNT_ACCOUNT' AND has_table = 0 AND parent_type_id = 'ACCOUNTS_RECEIVABLE');

INSERT INTO gl_account_type (description, gl_account_type_id, has_table)
SELECT 'Current Asset', 'CURRENT_ASSET', 0
WHERE NOT EXISTS (SELECT 1 FROM gl_account_type WHERE description = 'Current Asset' AND gl_account_type_id = 'CURRENT_ASSET' AND has_table = 0);

INSERT INTO gl_account_type (description, gl_account_type_id, has_table)
SELECT 'Fixed Asset', 'FIXED_ASSET', 0
WHERE NOT EXISTS (SELECT 1 FROM gl_account_type WHERE description = 'Fixed Asset' AND gl_account_type_id = 'FIXED_ASSET' AND has_table = 0);

INSERT INTO gl_account_type (description, gl_account_type_id, has_table)
SELECT 'Fixed Asset Maintenance', 'FIXED_ASSET_MAINT', 0
WHERE NOT EXISTS (SELECT 1 FROM gl_account_type WHERE description = 'Fixed Asset Maintenance' AND gl_account_type_id = 'FIXED_ASSET_MAINT' AND has_table = 0);

INSERT INTO gl_account_type (description, gl_account_type_id, has_table)
SELECT 'Other Asset', 'OTHER_ASSET', 0
WHERE NOT EXISTS (SELECT 1 FROM gl_account_type WHERE description = 'Other Asset' AND gl_account_type_id = 'OTHER_ASSET' AND has_table = 0);

INSERT INTO gl_account_type (description, gl_account_type_id, has_table)
SELECT 'Credit Card', 'CREDIT_CARD', 0
WHERE NOT EXISTS (SELECT 1 FROM gl_account_type WHERE description = 'Credit Card' AND gl_account_type_id = 'CREDIT_CARD' AND has_table = 0);

INSERT INTO gl_account_type (description, gl_account_type_id, has_table)
SELECT 'Current Liability', 'CURRENT_LIABILITY', 0
WHERE NOT EXISTS (SELECT 1 FROM gl_account_type WHERE description = 'Current Liability' AND gl_account_type_id = 'CURRENT_LIABILITY' AND has_table = 0);

INSERT INTO gl_account_type (description, gl_account_type_id, has_table)
SELECT 'Long Term Liability', 'LONG_TERM_LIABILITY', 0
WHERE NOT EXISTS (SELECT 1 FROM gl_account_type WHERE description = 'Long Term Liability' AND gl_account_type_id = 'LONG_TERM_LIABILITY' AND has_table = 0);

INSERT INTO gl_account_type (description, gl_account_type_id, has_table)
SELECT 'Customer', 'CUSTOMER_ACCOUNT', 0
WHERE NOT EXISTS (SELECT 1 FROM gl_account_type WHERE description = 'Customer' AND gl_account_type_id = 'CUSTOMER_ACCOUNT' AND has_table = 0);

INSERT INTO gl_account_type (description, gl_account_type_id, has_table)
SELECT 'Supplier', 'SUPPLIER_ACCOUNT', 0
WHERE NOT EXISTS (SELECT 1 FROM gl_account_type WHERE description = 'Supplier' AND gl_account_type_id = 'SUPPLIER_ACCOUNT' AND has_table = 0);

INSERT INTO gl_account_type (description, gl_account_type_id, has_table)
SELECT 'Product', 'PRODUCT_ACCOUNT', 0
WHERE NOT EXISTS (SELECT 1 FROM gl_account_type WHERE description = 'Product' AND gl_account_type_id = 'PRODUCT_ACCOUNT' AND has_table = 0);

INSERT INTO gl_account_type (description, gl_account_type_id, has_table)
SELECT 'Inventory', 'INVENTORY_ACCOUNT', 0
WHERE NOT EXISTS (SELECT 1 FROM gl_account_type WHERE description = 'Inventory' AND gl_account_type_id = 'INVENTORY_ACCOUNT' AND has_table = 0);

INSERT INTO gl_account_type (description, gl_account_type_id, has_table, parent_type_id)
SELECT 'Inventory Adjustment from Average Cost', 'INV_ADJ_AVG_COST', 0, 'INVENTORY_ACCOUNT'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_type WHERE description = 'Inventory Adjustment from Average Cost' AND gl_account_type_id = 'INV_ADJ_AVG_COST' AND has_table = 0 AND parent_type_id = 'INVENTORY_ACCOUNT');

INSERT INTO gl_account_type (description, gl_account_type_id, has_table)
SELECT 'Inventory Item Value Adjustment', 'INV_ADJ_VAL', 0
WHERE NOT EXISTS (SELECT 1 FROM gl_account_type WHERE description = 'Inventory Item Value Adjustment' AND gl_account_type_id = 'INV_ADJ_VAL' AND has_table = 0);

INSERT INTO gl_account_type (description, gl_account_type_id, has_table)
SELECT 'Raw Materials Inventory', 'RAWMAT_INVENTORY', 0
WHERE NOT EXISTS (SELECT 1 FROM gl_account_type WHERE description = 'Raw Materials Inventory' AND gl_account_type_id = 'RAWMAT_INVENTORY' AND has_table = 0);

INSERT INTO gl_account_type (description, gl_account_type_id, has_table)
SELECT 'Work In Progress Inventory', 'WIP_INVENTORY', 0
WHERE NOT EXISTS (SELECT 1 FROM gl_account_type WHERE description = 'Work In Progress Inventory' AND gl_account_type_id = 'WIP_INVENTORY' AND has_table = 0);

INSERT INTO gl_account_type (description, gl_account_type_id, has_table)
SELECT 'Tax', 'TAX_ACCOUNT', 0
WHERE NOT EXISTS (SELECT 1 FROM gl_account_type WHERE description = 'Tax' AND gl_account_type_id = 'TAX_ACCOUNT' AND has_table = 0);

INSERT INTO gl_account_type (description, gl_account_type_id, has_table)
SELECT 'Profit Loss', 'PROFIT_LOSS_ACCOUNT', 0
WHERE NOT EXISTS (SELECT 1 FROM gl_account_type WHERE description = 'Profit Loss' AND gl_account_type_id = 'PROFIT_LOSS_ACCOUNT' AND has_table = 0);

INSERT INTO gl_account_type (description, gl_account_type_id, has_table)
SELECT 'Sales', 'SALES_ACCOUNT', 0
WHERE NOT EXISTS (SELECT 1 FROM gl_account_type WHERE description = 'Sales' AND gl_account_type_id = 'SALES_ACCOUNT' AND has_table = 0);

INSERT INTO gl_account_type (description, gl_account_type_id, has_table)
SELECT 'Customer Returns', 'SALES_RETURNS', 0
WHERE NOT EXISTS (SELECT 1 FROM gl_account_type WHERE description = 'Customer Returns' AND gl_account_type_id = 'SALES_RETURNS' AND has_table = 0);

INSERT INTO gl_account_type (description, gl_account_type_id, has_table)
SELECT 'Discounts', 'DISCOUNTS_ACCOUNT', 0
WHERE NOT EXISTS (SELECT 1 FROM gl_account_type WHERE description = 'Discounts' AND gl_account_type_id = 'DISCOUNTS_ACCOUNT' AND has_table = 0);

INSERT INTO gl_account_type (description, gl_account_type_id, has_table)
SELECT 'Cost of Goods Sold', 'COGS_ACCOUNT', 0
WHERE NOT EXISTS (SELECT 1 FROM gl_account_type WHERE description = 'Cost of Goods Sold' AND gl_account_type_id = 'COGS_ACCOUNT' AND has_table = 0);

INSERT INTO gl_account_type (description, gl_account_type_id, has_table, parent_type_id)
SELECT 'COGS - Average Cost Adjustment', 'COGS_ADJ_AVG_COST', 0, 'COGS_ACCOUNT'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_type WHERE description = 'COGS - Average Cost Adjustment' AND gl_account_type_id = 'COGS_ADJ_AVG_COST' AND has_table = 0 AND parent_type_id = 'COGS_ACCOUNT');

INSERT INTO gl_account_type (description, gl_account_type_id, has_table)
SELECT 'Purchase', 'PURCHASE_ACCOUNT', 0
WHERE NOT EXISTS (SELECT 1 FROM gl_account_type WHERE description = 'Purchase' AND gl_account_type_id = 'PURCHASE_ACCOUNT' AND has_table = 0);

INSERT INTO gl_account_type (description, gl_account_type_id, has_table)
SELECT 'Inventory Change', 'INV_CHANGE_ACCOUNT', 0
WHERE NOT EXISTS (SELECT 1 FROM gl_account_type WHERE description = 'Inventory Change' AND gl_account_type_id = 'INV_CHANGE_ACCOUNT' AND has_table = 0);

INSERT INTO gl_account_type (description, gl_account_type_id, has_table)
SELECT 'Expense', 'EXPENSE', 0
WHERE NOT EXISTS (SELECT 1 FROM gl_account_type WHERE description = 'Expense' AND gl_account_type_id = 'EXPENSE' AND has_table = 0);

INSERT INTO gl_account_type (description, gl_account_type_id, has_table, parent_type_id)
SELECT 'Operating Expense', 'OPERATING_EXPENSE', 0, 'EXPENSE'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_type WHERE description = 'Operating Expense' AND gl_account_type_id = 'OPERATING_EXPENSE' AND has_table = 0 AND parent_type_id = 'EXPENSE');

INSERT INTO gl_account_type (description, gl_account_type_id, has_table, parent_type_id)
SELECT 'Other Expense', 'OTHER_EXPENSE', 0, 'EXPENSE'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_type WHERE description = 'Other Expense' AND gl_account_type_id = 'OTHER_EXPENSE' AND has_table = 0 AND parent_type_id = 'EXPENSE');

INSERT INTO gl_account_type (description, gl_account_type_id, has_table)
SELECT 'Owner''s Equity', 'OWNERS_EQUITY', 0
WHERE NOT EXISTS (SELECT 1 FROM gl_account_type WHERE description = 'Owner''s Equity' AND gl_account_type_id = 'OWNERS_EQUITY' AND has_table = 0);

INSERT INTO gl_account_type (description, gl_account_type_id, has_table)
SELECT 'Retained Earnings', 'RETAINED_EARNINGS', 0
WHERE NOT EXISTS (SELECT 1 FROM gl_account_type WHERE description = 'Retained Earnings' AND gl_account_type_id = 'RETAINED_EARNINGS' AND has_table = 0);

INSERT INTO gl_account_type (description, gl_account_type_id, has_table, parent_type_id)
SELECT 'Customer Deposits', 'CUSTOMER_DEPOSIT', 0, 'CURRENT_LIABILITY'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_type WHERE description = 'Customer Deposits' AND gl_account_type_id = 'CUSTOMER_DEPOSIT' AND has_table = 0 AND parent_type_id = 'CURRENT_LIABILITY');

INSERT INTO gl_account_type (description, gl_account_type_id, has_table, parent_type_id)
SELECT 'Customer Credits', 'CUSTOMER_CREDIT', 0, 'CURRENT_LIABILITY'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_type WHERE description = 'Customer Credits' AND gl_account_type_id = 'CUSTOMER_CREDIT' AND has_table = 0 AND parent_type_id = 'CURRENT_LIABILITY');

INSERT INTO gl_account_type (description, gl_account_type_id, has_table, parent_type_id)
SELECT 'Customer Gift Certificate Balances', 'CUSTOMER_GC_DEPOSIT', 0, 'CURRENT_LIABILITY'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_type WHERE description = 'Customer Gift Certificate Balances' AND gl_account_type_id = 'CUSTOMER_GC_DEPOSIT' AND has_table = 0 AND parent_type_id = 'CURRENT_LIABILITY');

INSERT INTO gl_account_type (description, gl_account_type_id, has_table, parent_type_id)
SELECT 'Uninvoiced Shipment Receipts', 'UNINVOICED_SHIP_RCPT', 0, 'CURRENT_LIABILITY'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_type WHERE description = 'Uninvoiced Shipment Receipts' AND gl_account_type_id = 'UNINVOICED_SHIP_RCPT' AND has_table = 0 AND parent_type_id = 'CURRENT_LIABILITY');

INSERT INTO gl_account_type (description, gl_account_type_id, has_table, parent_type_id)
SELECT 'Purchase Price Variance', 'PURCHASE_PRICE_VAR', 0, 'OTHER_EXPENSE'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_type WHERE description = 'Purchase Price Variance' AND gl_account_type_id = 'PURCHASE_PRICE_VAR' AND has_table = 0 AND parent_type_id = 'OTHER_EXPENSE');

INSERT INTO gl_account_type (description, gl_account_type_id, has_table)
SELECT 'Income', 'INCOME', 0
WHERE NOT EXISTS (SELECT 1 FROM gl_account_type WHERE description = 'Income' AND gl_account_type_id = 'INCOME' AND has_table = 0);

INSERT INTO gl_account_type (description, gl_account_type_id, has_table, parent_type_id)
SELECT 'Other Income', 'OTHER_INCOME', 0, 'INCOME'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_type WHERE description = 'Other Income' AND gl_account_type_id = 'OTHER_INCOME' AND has_table = 0 AND parent_type_id = 'INCOME');

INSERT INTO gl_account_type (description, gl_account_type_id, has_table, parent_type_id)
SELECT 'Interest Income', 'INTEREST_INCOME', 0, 'INCOME'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_type WHERE description = 'Interest Income' AND gl_account_type_id = 'INTEREST_INCOME' AND has_table = 0 AND parent_type_id = 'INCOME');

INSERT INTO gl_account_type (description, gl_account_type_id, has_table, parent_type_id)
SELECT 'Interest Income Receivables', 'INTRSTINC_RECEIVABLE', 0, 'ACCOUNTS_RECEIVABLE'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_type WHERE description = 'Interest Income Receivables' AND gl_account_type_id = 'INTRSTINC_RECEIVABLE' AND has_table = 0 AND parent_type_id = 'ACCOUNTS_RECEIVABLE');

INSERT INTO gl_account_type (description, gl_account_type_id, has_table, parent_type_id)
SELECT 'Prepaid Expenses', 'PREPAID_EXPENSES', 0, 'CURRENT_ASSET'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_type WHERE description = 'Prepaid Expenses' AND gl_account_type_id = 'PREPAID_EXPENSES' AND has_table = 0 AND parent_type_id = 'CURRENT_ASSET');

INSERT INTO gl_account_type (description, gl_account_type_id, has_table, parent_type_id)
SELECT 'Receivable from Inventory Transferred Out', 'INVENTORY_XFER_OUT', 0, 'CURRENT_ASSET'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_type WHERE description = 'Receivable from Inventory Transferred Out' AND gl_account_type_id = 'INVENTORY_XFER_OUT' AND has_table = 0 AND parent_type_id = 'CURRENT_ASSET');

INSERT INTO gl_account_type (description, gl_account_type_id, has_table, parent_type_id)
SELECT 'Payable from Inventory Transferred In', 'INVENTORY_XFER_IN', 0, 'CURRENT_LIABILITY'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_type WHERE description = 'Payable from Inventory Transferred In' AND gl_account_type_id = 'INVENTORY_XFER_IN' AND has_table = 0 AND parent_type_id = 'CURRENT_LIABILITY');

INSERT INTO gl_account_type (description, gl_account_type_id, has_table, parent_type_id)
SELECT 'Accounts Payable - Unapplied Payments', 'ACCPAYABLE_UNAPPLIED', 0, 'ACCOUNTS_PAYABLE'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_type WHERE description = 'Accounts Payable - Unapplied Payments' AND gl_account_type_id = 'ACCPAYABLE_UNAPPLIED' AND has_table = 0 AND parent_type_id = 'ACCOUNTS_PAYABLE');

INSERT INTO gl_account_type (description, gl_account_type_id, has_table, parent_type_id)
SELECT 'Accounts Receivable - Unapplied Payments', 'ACCREC_UNAPPLIED', 0, 'ACCOUNTS_RECEIVABLE'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_type WHERE description = 'Accounts Receivable - Unapplied Payments' AND gl_account_type_id = 'ACCREC_UNAPPLIED' AND has_table = 0 AND parent_type_id = 'ACCOUNTS_RECEIVABLE');

INSERT INTO gl_account_type (description, gl_account_type_id, has_table, parent_type_id)
SELECT 'Commission Expense', 'COMMISSION_EXPENSE', 0, 'OPERATING_EXPENSE'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_type WHERE description = 'Commission Expense' AND gl_account_type_id = 'COMMISSION_EXPENSE' AND has_table = 0 AND parent_type_id = 'OPERATING_EXPENSE');

INSERT INTO gl_account_type (description, gl_account_type_id, has_table, parent_type_id)
SELECT 'Commissions Payables', 'COMMISSIONS_PAYABLE', 0, 'CURRENT_LIABILITY'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_type WHERE description = 'Commissions Payables' AND gl_account_type_id = 'COMMISSIONS_PAYABLE' AND has_table = 0 AND parent_type_id = 'CURRENT_LIABILITY');

INSERT INTO gl_account_type (description, gl_account_type_id, has_table, parent_type_id)
SELECT 'Write Off', 'WRITEOFF', 0, 'OTHER_EXPENSE'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_type WHERE description = 'Write Off' AND gl_account_type_id = 'WRITEOFF' AND has_table = 0 AND parent_type_id = 'OTHER_EXPENSE');

INSERT INTO gl_account_type (description, gl_account_type_id, has_table, parent_type_id)
SELECT 'Accounts Receivables Write Off', 'ACCTRECV_WRITEOFF', 0, 'WRITEOFF'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_type WHERE description = 'Accounts Receivables Write Off' AND gl_account_type_id = 'ACCTRECV_WRITEOFF' AND has_table = 0 AND parent_type_id = 'WRITEOFF');

INSERT INTO gl_account_type (description, gl_account_type_id, has_table, parent_type_id)
SELECT 'Accounts Payables Write Off', 'ACCTPAY_WRITEOFF', 0, 'WRITEOFF'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_type WHERE description = 'Accounts Payables Write Off' AND gl_account_type_id = 'ACCTPAY_WRITEOFF' AND has_table = 0 AND parent_type_id = 'WRITEOFF');

INSERT INTO gl_account_type (description, gl_account_type_id, has_table, parent_type_id)
SELECT 'Commissions Payables Write Off', 'COMMISSIONS_WRITEOFF', 0, 'WRITEOFF'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_type WHERE description = 'Commissions Payables Write Off' AND gl_account_type_id = 'COMMISSIONS_WRITEOFF' AND has_table = 0 AND parent_type_id = 'WRITEOFF');

INSERT INTO gl_account_type (description, gl_account_type_id, has_table, parent_type_id)
SELECT 'Interest Income Write Off', 'INTRSTINC_WRITEOFF', 0, 'WRITEOFF'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_type WHERE description = 'Interest Income Write Off' AND gl_account_type_id = 'INTRSTINC_WRITEOFF' AND has_table = 0 AND parent_type_id = 'WRITEOFF');

INSERT INTO gl_account_type (description, gl_account_type_id, has_table, parent_type_id)
SELECT 'Foreign Exchange Gain/Loss', 'FX_GAIN_LOSS_ACCT', 0, 'OTHER_EXPENSE'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_type WHERE description = 'Foreign Exchange Gain/Loss' AND gl_account_type_id = 'FX_GAIN_LOSS_ACCT' AND has_table = 0 AND parent_type_id = 'OTHER_EXPENSE');

INSERT INTO gl_account_type (description, gl_account_type_id, has_table, parent_type_id)
SELECT 'Foreign Exchange Gain', 'FX_GAIN_ACCOUNT', 0, 'FX_GAIN_LOSS_ACCT'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_type WHERE description = 'Foreign Exchange Gain' AND gl_account_type_id = 'FX_GAIN_ACCOUNT' AND has_table = 0 AND parent_type_id = 'FX_GAIN_LOSS_ACCT');

INSERT INTO gl_account_type (description, gl_account_type_id, has_table, parent_type_id)
SELECT 'Foreign Exchange Loss', 'FX_LOSS_ACCOUNT', 0, 'FX_GAIN_LOSS_ACCT'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_type WHERE description = 'Foreign Exchange Loss' AND gl_account_type_id = 'FX_LOSS_ACCOUNT' AND has_table = 0 AND parent_type_id = 'FX_GAIN_LOSS_ACCT');

INSERT INTO gl_resource_type (description, gl_resource_type_id)
SELECT 'Not Applicable', '_NA_'
WHERE NOT EXISTS (SELECT 1 FROM gl_resource_type WHERE description = 'Not Applicable' AND gl_resource_type_id = '_NA_');

INSERT INTO gl_resource_type (description, gl_resource_type_id)
SELECT 'Money', 'MONEY'
WHERE NOT EXISTS (SELECT 1 FROM gl_resource_type WHERE description = 'Money' AND gl_resource_type_id = 'MONEY');

INSERT INTO gl_resource_type (description, gl_resource_type_id)
SELECT 'Raw Materials', 'RAW_MATERIALS'
WHERE NOT EXISTS (SELECT 1 FROM gl_resource_type WHERE description = 'Raw Materials' AND gl_resource_type_id = 'RAW_MATERIALS');

INSERT INTO gl_resource_type (description, gl_resource_type_id)
SELECT 'Labor', 'LABOR'
WHERE NOT EXISTS (SELECT 1 FROM gl_resource_type WHERE description = 'Labor' AND gl_resource_type_id = 'LABOR');

INSERT INTO gl_resource_type (description, gl_resource_type_id)
SELECT 'Services', 'SERVICES'
WHERE NOT EXISTS (SELECT 1 FROM gl_resource_type WHERE description = 'Services' AND gl_resource_type_id = 'SERVICES');

INSERT INTO gl_resource_type (description, gl_resource_type_id)
SELECT 'Finished Goods', 'FINISHED_GOODS'
WHERE NOT EXISTS (SELECT 1 FROM gl_resource_type WHERE description = 'Finished Goods' AND gl_resource_type_id = 'FINISHED_GOODS');

INSERT INTO gl_resource_type (description, gl_resource_type_id)
SELECT 'Delivered Goods', 'DELIVERED_GOODS'
WHERE NOT EXISTS (SELECT 1 FROM gl_resource_type WHERE description = 'Delivered Goods' AND gl_resource_type_id = 'DELIVERED_GOODS');

INSERT INTO gl_xbrl_class (description, gl_xbrl_class_id)
SELECT 'US GAAP', 'US_GAAP'
WHERE NOT EXISTS (SELECT 1 FROM gl_xbrl_class WHERE description = 'US GAAP' AND gl_xbrl_class_id = 'US_GAAP');

INSERT INTO gl_xbrl_class (description, gl_xbrl_class_id)
SELECT 'IAS', 'IAS'
WHERE NOT EXISTS (SELECT 1 FROM gl_xbrl_class WHERE description = 'IAS' AND gl_xbrl_class_id = 'IAS');

INSERT INTO gl_fiscal_type (description, gl_fiscal_type_id)
SELECT 'Actual', 'ACTUAL'
WHERE NOT EXISTS (SELECT 1 FROM gl_fiscal_type WHERE description = 'Actual' AND gl_fiscal_type_id = 'ACTUAL');

INSERT INTO gl_fiscal_type (description, gl_fiscal_type_id)
SELECT 'Budget', 'BUDGET'
WHERE NOT EXISTS (SELECT 1 FROM gl_fiscal_type WHERE description = 'Budget' AND gl_fiscal_type_id = 'BUDGET');

INSERT INTO gl_fiscal_type (description, gl_fiscal_type_id)
SELECT 'Forecast', 'FORECAST'
WHERE NOT EXISTS (SELECT 1 FROM gl_fiscal_type WHERE description = 'Forecast' AND gl_fiscal_type_id = 'FORECAST');

INSERT INTO gl_fiscal_type (description, gl_fiscal_type_id)
SELECT 'Plan', 'PLAN'
WHERE NOT EXISTS (SELECT 1 FROM gl_fiscal_type WHERE description = 'Plan' AND gl_fiscal_type_id = 'PLAN');

INSERT INTO gl_fiscal_type (description, gl_fiscal_type_id)
SELECT 'Scenario', 'SCENARIO'
WHERE NOT EXISTS (SELECT 1 FROM gl_fiscal_type WHERE description = 'Scenario' AND gl_fiscal_type_id = 'SCENARIO');

INSERT INTO gl_account_category_type (description, gl_account_category_type_id)
SELECT 'Cost Center Category', 'COST_CENTER'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_category_type WHERE description = 'Cost Center Category' AND gl_account_category_type_id = 'COST_CENTER');

INSERT INTO invoice_content_type (description, has_table, invoice_content_type_id)
SELECT 'comments', 0, 'COMMENTS'
WHERE NOT EXISTS (SELECT 1 FROM invoice_content_type WHERE description = 'comments' AND has_table = 0 AND invoice_content_type_id = 'COMMENTS');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id)
SELECT 'Invoice Adjustment', 0, 'INVOICE_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Invoice Adjustment' AND has_table = 0 AND invoice_item_type_id = 'INVOICE_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Invoice Header Adjustment', 0, 'INVOICE_HEAD_ADJ', 'INVOICE_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Invoice Header Adjustment' AND has_table = 0 AND invoice_item_type_id = 'INVOICE_HEAD_ADJ' AND parent_type_id = 'INVOICE_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Invoice Item Adjustment', 0, 'INVOICE_ITM_ADJ', 'INVOICE_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Invoice Item Adjustment' AND has_table = 0 AND invoice_item_type_id = 'INVOICE_ITM_ADJ' AND parent_type_id = 'INVOICE_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Sales Invoice Header Adjustment', 0, 'SINVOICE_HEAD_ADJ', 'INVOICE_HEAD_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Sales Invoice Header Adjustment' AND has_table = 0 AND invoice_item_type_id = 'SINVOICE_HEAD_ADJ' AND parent_type_id = 'INVOICE_HEAD_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Sales Invoice Item Adjustment', 0, 'SINVOICE_ITM_ADJ', 'INVOICE_ITM_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Sales Invoice Item Adjustment' AND has_table = 0 AND invoice_item_type_id = 'SINVOICE_ITM_ADJ' AND parent_type_id = 'INVOICE_ITM_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Purchase Invoice Header Adjustment', 0, 'PINVOICE_ADJ', 'INVOICE_HEAD_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Purchase Invoice Header Adjustment' AND has_table = 0 AND invoice_item_type_id = 'PINVOICE_ADJ' AND parent_type_id = 'INVOICE_HEAD_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Purchase Invoice Item Adjustment', 0, 'PINVOICE_ITM_ADJ', 'INVOICE_ITM_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Purchase Invoice Item Adjustment' AND has_table = 0 AND invoice_item_type_id = 'PINVOICE_ITM_ADJ' AND parent_type_id = 'INVOICE_ITM_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Customer Return Adjustment', 0, 'CRETURN_ADJ', 'INVOICE_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Customer Return Adjustment' AND has_table = 0 AND invoice_item_type_id = 'CRETURN_ADJ' AND parent_type_id = 'INVOICE_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Supplier Return Adjustment', 0, 'SRETURN_ADJ', 'INVOICE_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Supplier Return Adjustment' AND has_table = 0 AND invoice_item_type_id = 'SRETURN_ADJ' AND parent_type_id = 'INVOICE_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Invoice Promotion(Sales)', 0, 'INV_PROMOTION_ADJ', 'SINVOICE_HEAD_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Invoice Promotion(Sales)' AND has_table = 0 AND invoice_item_type_id = 'INV_PROMOTION_ADJ' AND parent_type_id = 'SINVOICE_HEAD_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Invoice Discount(Sales)', 0, 'INV_DISCOUNT_ADJ', 'SINVOICE_HEAD_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Invoice Discount(Sales)' AND has_table = 0 AND invoice_item_type_id = 'INV_DISCOUNT_ADJ' AND parent_type_id = 'SINVOICE_HEAD_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Invoice Fee(Sales)', 0, 'FEE', 'SINVOICE_HEAD_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Invoice Fee(Sales)' AND has_table = 0 AND invoice_item_type_id = 'FEE' AND parent_type_id = 'SINVOICE_HEAD_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Invoice Miscellaneous Charges(Sales)', 0, 'INV_MISC_CHARGE', 'SINVOICE_HEAD_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Invoice Miscellaneous Charges(Sales)' AND has_table = 0 AND invoice_item_type_id = 'INV_MISC_CHARGE' AND parent_type_id = 'SINVOICE_HEAD_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Invoice Sales Tax(Sales)', 0, 'INV_SALES_TAX', 'SINVOICE_HEAD_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Invoice Sales Tax(Sales)' AND has_table = 0 AND invoice_item_type_id = 'INV_SALES_TAX' AND parent_type_id = 'SINVOICE_HEAD_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Invoice Shipping and Handling(Sales)', 0, 'INV_SHIPPING_CHARGES', 'SINVOICE_HEAD_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Invoice Shipping and Handling(Sales)' AND has_table = 0 AND invoice_item_type_id = 'INV_SHIPPING_CHARGES' AND parent_type_id = 'SINVOICE_HEAD_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Invoice Surcharge(Sales)', 0, 'INV_SURCHARGE_ADJ', 'SINVOICE_HEAD_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Invoice Surcharge(Sales)' AND has_table = 0 AND invoice_item_type_id = 'INV_SURCHARGE_ADJ' AND parent_type_id = 'SINVOICE_HEAD_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Invoice Additional Feature(Sales)', 0, 'INV_ADD_FEATURE', 'SINVOICE_HEAD_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Invoice Additional Feature(Sales)' AND has_table = 0 AND invoice_item_type_id = 'INV_ADD_FEATURE' AND parent_type_id = 'SINVOICE_HEAD_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Invoice Warranty(Sales)', 0, 'INV_WARRANTY_ADJ', 'SINVOICE_HEAD_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Invoice Warranty(Sales)' AND has_table = 0 AND invoice_item_type_id = 'INV_WARRANTY_ADJ' AND parent_type_id = 'SINVOICE_HEAD_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Invoice Interest Charge', 0, 'INV_INTRST_CHRG', 'SINVOICE_HEAD_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Invoice Interest Charge' AND has_table = 0 AND invoice_item_type_id = 'INV_INTRST_CHRG' AND parent_type_id = 'SINVOICE_HEAD_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Invoice Item Promotion(Sales)', 0, 'ITM_PROMOTION_ADJ', 'SINVOICE_ITM_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Invoice Item Promotion(Sales)' AND has_table = 0 AND invoice_item_type_id = 'ITM_PROMOTION_ADJ' AND parent_type_id = 'SINVOICE_ITM_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Invoice Item Replacement(Sales)', 0, 'ITM_REPLACE_ADJ', 'SINVOICE_ITM_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Invoice Item Replacement(Sales)' AND has_table = 0 AND invoice_item_type_id = 'ITM_REPLACE_ADJ' AND parent_type_id = 'SINVOICE_ITM_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Invoice Item Discount(Sales)', 0, 'ITM_DISCOUNT_ADJ', 'SINVOICE_ITM_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Invoice Item Discount(Sales)' AND has_table = 0 AND invoice_item_type_id = 'ITM_DISCOUNT_ADJ' AND parent_type_id = 'SINVOICE_ITM_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Invoice Item Fee(Sales)', 0, 'ITM_FEE', 'SINVOICE_ITM_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Invoice Item Fee(Sales)' AND has_table = 0 AND invoice_item_type_id = 'ITM_FEE' AND parent_type_id = 'SINVOICE_ITM_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Invoice Item Miscellaneous Charges(Sales)', 0, 'ITM_MISC_CHARGE', 'SINVOICE_ITM_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Invoice Item Miscellaneous Charges(Sales)' AND has_table = 0 AND invoice_item_type_id = 'ITM_MISC_CHARGE' AND parent_type_id = 'SINVOICE_ITM_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Invoice Item Sales Tax(Sales)', 0, 'ITM_SALES_TAX', 'SINVOICE_ITM_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Invoice Item Sales Tax(Sales)' AND has_table = 0 AND invoice_item_type_id = 'ITM_SALES_TAX' AND parent_type_id = 'SINVOICE_ITM_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Invoice Item Shipping and Handling(Sales)', 0, 'ITM_SHIPPING_CHARGES', 'SINVOICE_ITM_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Invoice Item Shipping and Handling(Sales)' AND has_table = 0 AND invoice_item_type_id = 'ITM_SHIPPING_CHARGES' AND parent_type_id = 'SINVOICE_ITM_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Invoice Item Surcharge(Sales)', 0, 'ITM_SURCHARGE_ADJ', 'SINVOICE_ITM_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Invoice Item Surcharge(Sales)' AND has_table = 0 AND invoice_item_type_id = 'ITM_SURCHARGE_ADJ' AND parent_type_id = 'SINVOICE_ITM_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Invoice Item Additional Feature(Sales)', 0, 'ITM_ADD_FEATURE', 'SINVOICE_ITM_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Invoice Item Additional Feature(Sales)' AND has_table = 0 AND invoice_item_type_id = 'ITM_ADD_FEATURE' AND parent_type_id = 'SINVOICE_ITM_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Invoice Item Warranty(Sales)', 0, 'ITM_WARRANTY_ADJ', 'SINVOICE_ITM_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Invoice Item Warranty(Sales)' AND has_table = 0 AND invoice_item_type_id = 'ITM_WARRANTY_ADJ' AND parent_type_id = 'SINVOICE_ITM_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Invoice Item VAT Tax(Sales)', 0, 'ITM_VAT_TAX', 'SINVOICE_ITM_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Invoice Item VAT Tax(Sales)' AND has_table = 0 AND invoice_item_type_id = 'ITM_VAT_TAX' AND parent_type_id = 'SINVOICE_ITM_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id)
SELECT 'Invoice Product Item(Sales)', 0, 'INV_PROD_ITEM'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Invoice Product Item(Sales)' AND has_table = 0 AND invoice_item_type_id = 'INV_PROD_ITEM');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Invoice Finished Good Item(Sales)', 0, 'INV_FPROD_ITEM', 'INV_PROD_ITEM'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Invoice Finished Good Item(Sales)' AND has_table = 0 AND invoice_item_type_id = 'INV_FPROD_ITEM' AND parent_type_id = 'INV_PROD_ITEM');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Invoice Digital Good Item(Sales)', 0, 'INV_DPROD_ITEM', 'INV_PROD_ITEM'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Invoice Digital Good Item(Sales)' AND has_table = 0 AND invoice_item_type_id = 'INV_DPROD_ITEM' AND parent_type_id = 'INV_PROD_ITEM');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Invoice Finished/Digital Good Item(Sales)', 0, 'INV_FDPROD_ITEM', 'INV_PROD_ITEM'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Invoice Finished/Digital Good Item(Sales)' AND has_table = 0 AND invoice_item_type_id = 'INV_FDPROD_ITEM' AND parent_type_id = 'INV_PROD_ITEM');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Invoice Product-Feature Item(Sales)', 0, 'INV_PROD_FEATR_ITEM', 'INV_PROD_ITEM'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Invoice Product-Feature Item(Sales)' AND has_table = 0 AND invoice_item_type_id = 'INV_PROD_FEATR_ITEM' AND parent_type_id = 'INV_PROD_ITEM');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Invoice Service Product Item(Sales)', 0, 'INV_SPROD_ITEM', 'INV_PROD_ITEM'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Invoice Service Product Item(Sales)' AND has_table = 0 AND invoice_item_type_id = 'INV_SPROD_ITEM' AND parent_type_id = 'INV_PROD_ITEM');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id)
SELECT 'Invoice Work-Effort Item(Sales)', 0, 'INV_WE_ITEM'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Invoice Work-Effort Item(Sales)' AND has_table = 0 AND invoice_item_type_id = 'INV_WE_ITEM');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id)
SELECT 'Invoice Time-Entry Item(Sales)', 0, 'INV_TE_ITEM'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Invoice Time-Entry Item(Sales)' AND has_table = 0 AND invoice_item_type_id = 'INV_TE_ITEM');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Invoice Promotion(Purchase)', 0, 'PINV_PROMOTION_ADJ', 'PINVOICE_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Invoice Promotion(Purchase)' AND has_table = 0 AND invoice_item_type_id = 'PINV_PROMOTION_ADJ' AND parent_type_id = 'PINVOICE_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Invoice Discount(Purchase)', 0, 'PINV_DISCOUNT_ADJ', 'PINVOICE_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Invoice Discount(Purchase)' AND has_table = 0 AND invoice_item_type_id = 'PINV_DISCOUNT_ADJ' AND parent_type_id = 'PINVOICE_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Invoice Fee(Purchase)', 0, 'P_FEE', 'PINVOICE_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Invoice Fee(Purchase)' AND has_table = 0 AND invoice_item_type_id = 'P_FEE' AND parent_type_id = 'PINVOICE_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Invoice Miscellaneous Charges(Purchase)', 0, 'PINV_MISC_CHARGE', 'PINVOICE_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Invoice Miscellaneous Charges(Purchase)' AND has_table = 0 AND invoice_item_type_id = 'PINV_MISC_CHARGE' AND parent_type_id = 'PINVOICE_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Invoice Sales Tax(Purchase)', 0, 'PINV_SALES_TAX', 'PINVOICE_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Invoice Sales Tax(Purchase)' AND has_table = 0 AND invoice_item_type_id = 'PINV_SALES_TAX' AND parent_type_id = 'PINVOICE_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Invoice Shipping and Handling(Purchase)', 0, 'PINV_SHIP_CHARGES', 'PINVOICE_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Invoice Shipping and Handling(Purchase)' AND has_table = 0 AND invoice_item_type_id = 'PINV_SHIP_CHARGES' AND parent_type_id = 'PINVOICE_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Invoice Surcharge(Purchase)', 0, 'PINV_SURCHARGE_ADJ', 'PINVOICE_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Invoice Surcharge(Purchase)' AND has_table = 0 AND invoice_item_type_id = 'PINV_SURCHARGE_ADJ' AND parent_type_id = 'PINVOICE_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Invoice Additional Feature(Purchase)', 0, 'PINV_ADD_FEATURE', 'PINVOICE_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Invoice Additional Feature(Purchase)' AND has_table = 0 AND invoice_item_type_id = 'PINV_ADD_FEATURE' AND parent_type_id = 'PINVOICE_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Invoice Warranty(Purchase)', 0, 'PINV_WARRANTY_ADJ', 'PINVOICE_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Invoice Warranty(Purchase)' AND has_table = 0 AND invoice_item_type_id = 'PINV_WARRANTY_ADJ' AND parent_type_id = 'PINVOICE_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Invoice Item Promotion(Purchase)', 0, 'PITM_PROMOTION_ADJ', 'PINVOICE_ITM_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Invoice Item Promotion(Purchase)' AND has_table = 0 AND invoice_item_type_id = 'PITM_PROMOTION_ADJ' AND parent_type_id = 'PINVOICE_ITM_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Invoice Item Replacement(Purchase)', 0, 'PITM_REPLACE_ADJ', 'PINVOICE_ITM_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Invoice Item Replacement(Purchase)' AND has_table = 0 AND invoice_item_type_id = 'PITM_REPLACE_ADJ' AND parent_type_id = 'PINVOICE_ITM_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Invoice Item Discount(Purchase)', 0, 'PITM_DISCOUNT_ADJ', 'PINVOICE_ITM_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Invoice Item Discount(Purchase)' AND has_table = 0 AND invoice_item_type_id = 'PITM_DISCOUNT_ADJ' AND parent_type_id = 'PINVOICE_ITM_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Invoice Item Fee(Purchase)', 0, 'PITM_FEE', 'PINVOICE_ITM_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Invoice Item Fee(Purchase)' AND has_table = 0 AND invoice_item_type_id = 'PITM_FEE' AND parent_type_id = 'PINVOICE_ITM_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Invoice Item Miscellaneous Charges(Purchase)', 0, 'PITM_MISC_CHARGE', 'PINVOICE_ITM_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Invoice Item Miscellaneous Charges(Purchase)' AND has_table = 0 AND invoice_item_type_id = 'PITM_MISC_CHARGE' AND parent_type_id = 'PINVOICE_ITM_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Invoice Item Sales Tax(Purchase)', 0, 'PITM_SALES_TAX', 'PINVOICE_ITM_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Invoice Item Sales Tax(Purchase)' AND has_table = 0 AND invoice_item_type_id = 'PITM_SALES_TAX' AND parent_type_id = 'PINVOICE_ITM_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Invoice Item Shipping and Handling(Purchase)', 0, 'PITM_SHIP_CHARGES', 'PINVOICE_ITM_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Invoice Item Shipping and Handling(Purchase)' AND has_table = 0 AND invoice_item_type_id = 'PITM_SHIP_CHARGES' AND parent_type_id = 'PINVOICE_ITM_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Invoice Item Surcharge(Purchase)', 0, 'PITM_SURCHARGE_ADJ', 'PINVOICE_ITM_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Invoice Item Surcharge(Purchase)' AND has_table = 0 AND invoice_item_type_id = 'PITM_SURCHARGE_ADJ' AND parent_type_id = 'PINVOICE_ITM_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Invoice Item Additional Feature(Purchase)', 0, 'PITM_ADD_FEATURE', 'PINVOICE_ITM_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Invoice Item Additional Feature(Purchase)' AND has_table = 0 AND invoice_item_type_id = 'PITM_ADD_FEATURE' AND parent_type_id = 'PINVOICE_ITM_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Invoice Item Warranty(Purchase)', 0, 'PITM_WARRANTY_ADJ', 'PINVOICE_ITM_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Invoice Item Warranty(Purchase)' AND has_table = 0 AND invoice_item_type_id = 'PITM_WARRANTY_ADJ' AND parent_type_id = 'PINVOICE_ITM_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id)
SELECT 'Invoice Product Item(Purchase)', 0, 'PINV_PROD_ITEM'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Invoice Product Item(Purchase)' AND has_table = 0 AND invoice_item_type_id = 'PINV_PROD_ITEM');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Invoice Finished Good Item(Purchase)', 0, 'PINV_FPROD_ITEM', 'PINV_PROD_ITEM'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Invoice Finished Good Item(Purchase)' AND has_table = 0 AND invoice_item_type_id = 'PINV_FPROD_ITEM' AND parent_type_id = 'PINV_PROD_ITEM');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Invoice Digital Good Item(Purchase)', 0, 'PINV_DPROD_ITEM', 'PINV_PROD_ITEM'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Invoice Digital Good Item(Purchase)' AND has_table = 0 AND invoice_item_type_id = 'PINV_DPROD_ITEM' AND parent_type_id = 'PINV_PROD_ITEM');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Invoice Finished/Digital Good Item(Purchase)', 0, 'PINV_FDPROD_ITEM', 'PINV_PROD_ITEM'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Invoice Finished/Digital Good Item(Purchase)' AND has_table = 0 AND invoice_item_type_id = 'PINV_FDPROD_ITEM' AND parent_type_id = 'PINV_PROD_ITEM');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Invoice Product-Feature Item(Purchase)', 0, 'PINV_PROD_FEATR_ITEM', 'PINV_PROD_ITEM'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Invoice Product-Feature Item(Purchase)' AND has_table = 0 AND invoice_item_type_id = 'PINV_PROD_FEATR_ITEM' AND parent_type_id = 'PINV_PROD_ITEM');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Invoice Raw Material(Purchase)', 0, 'PINV_RPROD_ITEM', 'PINV_PROD_ITEM'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Invoice Raw Material(Purchase)' AND has_table = 0 AND invoice_item_type_id = 'PINV_RPROD_ITEM' AND parent_type_id = 'PINV_PROD_ITEM');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Invoice Service Product Item(Purchase)', 0, 'PINV_SPROD_ITEM', 'PINV_PROD_ITEM'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Invoice Service Product Item(Purchase)' AND has_table = 0 AND invoice_item_type_id = 'PINV_SPROD_ITEM' AND parent_type_id = 'PINV_PROD_ITEM');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Invoice Inventory Product Item', 0, 'PINV_INVPRD_ITEM', 'PINV_PROD_ITEM'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Invoice Inventory Product Item' AND has_table = 0 AND invoice_item_type_id = 'PINV_INVPRD_ITEM' AND parent_type_id = 'PINV_PROD_ITEM');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Invoice Supplies (to Expense) Product Item', 0, 'PINV_SUPLPRD_ITEM', 'PINV_PROD_ITEM'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Invoice Supplies (to Expense) Product Item' AND has_table = 0 AND invoice_item_type_id = 'PINV_SUPLPRD_ITEM' AND parent_type_id = 'PINV_PROD_ITEM');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Invoice Fixed Asset Product Item', 0, 'PINV_FXASTPRD_ITEM', 'PINV_PROD_ITEM'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Invoice Fixed Asset Product Item' AND has_table = 0 AND invoice_item_type_id = 'PINV_FXASTPRD_ITEM' AND parent_type_id = 'PINV_PROD_ITEM');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id)
SELECT 'Invoice Work-Effort Item(Purchase)', 0, 'PINV_WE_ITEM'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Invoice Work-Effort Item(Purchase)' AND has_table = 0 AND invoice_item_type_id = 'PINV_WE_ITEM');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id)
SELECT 'Invoice Time-Entry Item(Purchase)', 0, 'PINV_TE_ITEM'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Invoice Time-Entry Item(Purchase)' AND has_table = 0 AND invoice_item_type_id = 'PINV_TE_ITEM');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id)
SELECT 'Return Product Item', 0, 'CRT_PROD_ITEM'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Return Product Item' AND has_table = 0 AND invoice_item_type_id = 'CRT_PROD_ITEM');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Return Finished Good Item', 0, 'CRT_FPROD_ITEM', 'CRT_PROD_ITEM'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Return Finished Good Item' AND has_table = 0 AND invoice_item_type_id = 'CRT_FPROD_ITEM' AND parent_type_id = 'CRT_PROD_ITEM');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Return Digital Good Item', 0, 'CRT_DPROD_ITEM', 'CRT_PROD_ITEM'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Return Digital Good Item' AND has_table = 0 AND invoice_item_type_id = 'CRT_DPROD_ITEM' AND parent_type_id = 'CRT_PROD_ITEM');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Return Finished/Digital Good Item', 0, 'CRT_FDPROD_ITEM', 'CRT_PROD_ITEM'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Return Finished/Digital Good Item' AND has_table = 0 AND invoice_item_type_id = 'CRT_FDPROD_ITEM' AND parent_type_id = 'CRT_PROD_ITEM');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Return Raw Material Good Item', 0, 'CRT_RPROD_ITEM', 'CRT_PROD_ITEM'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Return Raw Material Good Item' AND has_table = 0 AND invoice_item_type_id = 'CRT_RPROD_ITEM' AND parent_type_id = 'CRT_PROD_ITEM');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Return Product-Feature Item', 0, 'CRT_PROD_FEATR_ITEM', 'CRT_PROD_ITEM'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Return Product-Feature Item' AND has_table = 0 AND invoice_item_type_id = 'CRT_PROD_FEATR_ITEM' AND parent_type_id = 'CRT_PROD_ITEM');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Return Service Product Item', 0, 'CRT_SPROD_ITEM', 'CRT_PROD_ITEM'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Return Service Product Item' AND has_table = 0 AND invoice_item_type_id = 'CRT_SPROD_ITEM' AND parent_type_id = 'CRT_PROD_ITEM');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id)
SELECT 'Return Work-Effort Item', 0, 'CRT_WE_ITEM'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Return Work-Effort Item' AND has_table = 0 AND invoice_item_type_id = 'CRT_WE_ITEM');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id)
SELECT 'Return Time-Entry Item', 0, 'CRT_TE_ITEM'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Return Time-Entry Item' AND has_table = 0 AND invoice_item_type_id = 'CRT_TE_ITEM');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Return Promotion', 0, 'CRT_PROMOTION_ADJ', 'CRETURN_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Return Promotion' AND has_table = 0 AND invoice_item_type_id = 'CRT_PROMOTION_ADJ' AND parent_type_id = 'CRETURN_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Return Replacement', 0, 'CRT_REPLACE_ADJ', 'CRETURN_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Return Replacement' AND has_table = 0 AND invoice_item_type_id = 'CRT_REPLACE_ADJ' AND parent_type_id = 'CRETURN_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Return Discount', 0, 'CRT_DISCOUNT_ADJ', 'CRETURN_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Return Discount' AND has_table = 0 AND invoice_item_type_id = 'CRT_DISCOUNT_ADJ' AND parent_type_id = 'CRETURN_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Return Fee', 0, 'CRT_FEE_ADJ', 'CRETURN_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Return Fee' AND has_table = 0 AND invoice_item_type_id = 'CRT_FEE_ADJ' AND parent_type_id = 'CRETURN_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Return Miscellaneous Charges', 0, 'CRT_MISC_ADJ', 'CRETURN_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Return Miscellaneous Charges' AND has_table = 0 AND invoice_item_type_id = 'CRT_MISC_ADJ' AND parent_type_id = 'CRETURN_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Return Sales Tax', 0, 'CRT_SALES_TAX_ADJ', 'CRETURN_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Return Sales Tax' AND has_table = 0 AND invoice_item_type_id = 'CRT_SALES_TAX_ADJ' AND parent_type_id = 'CRETURN_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Return VAT Tax', 0, 'CRT_VAT_TAX_ADJ', 'CRETURN_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Return VAT Tax' AND has_table = 0 AND invoice_item_type_id = 'CRT_VAT_TAX_ADJ' AND parent_type_id = 'CRETURN_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Return VAT Price Correct', 0, 'CRT_VAT_PC_ADJ', 'CRETURN_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Return VAT Price Correct' AND has_table = 0 AND invoice_item_type_id = 'CRT_VAT_PC_ADJ' AND parent_type_id = 'CRETURN_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Return Shipping and Handling', 0, 'CRT_SHIPPING_ADJ', 'CRETURN_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Return Shipping and Handling' AND has_table = 0 AND invoice_item_type_id = 'CRT_SHIPPING_ADJ' AND parent_type_id = 'CRETURN_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Return Surcharge', 0, 'CRT_SURCHARGE_ADJ', 'CRETURN_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Return Surcharge' AND has_table = 0 AND invoice_item_type_id = 'CRT_SURCHARGE_ADJ' AND parent_type_id = 'CRETURN_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Return Additional Feature', 0, 'CRT_ADD_FEATURE_ADJ', 'CRETURN_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Return Additional Feature' AND has_table = 0 AND invoice_item_type_id = 'CRT_ADD_FEATURE_ADJ' AND parent_type_id = 'CRETURN_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Return Warranty', 0, 'CRT_WARRANTY_ADJ', 'CRETURN_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Return Warranty' AND has_table = 0 AND invoice_item_type_id = 'CRT_WARRANTY_ADJ' AND parent_type_id = 'CRETURN_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Return Marketing Package Adjustment', 0, 'CRT_MKTG_PKG_ADJ', 'CRETURN_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Return Marketing Package Adjustment' AND has_table = 0 AND invoice_item_type_id = 'CRT_MKTG_PKG_ADJ' AND parent_type_id = 'CRETURN_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Return Manual Adjustment', 0, 'CRT_MAN_ADJ', 'CRETURN_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Return Manual Adjustment' AND has_table = 0 AND invoice_item_type_id = 'CRT_MAN_ADJ' AND parent_type_id = 'CRETURN_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id)
SELECT 'Return Product Item', 0, 'SRT_PROD_ITEM'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Return Product Item' AND has_table = 0 AND invoice_item_type_id = 'SRT_PROD_ITEM');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Return Finished Good Item', 0, 'SRT_FPROD_ITEM', 'SRT_PROD_ITEM'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Return Finished Good Item' AND has_table = 0 AND invoice_item_type_id = 'SRT_FPROD_ITEM' AND parent_type_id = 'SRT_PROD_ITEM');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Return Digital Good Item', 0, 'SRT_DPROD_ITEM', 'SRT_PROD_ITEM'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Return Digital Good Item' AND has_table = 0 AND invoice_item_type_id = 'SRT_DPROD_ITEM' AND parent_type_id = 'SRT_PROD_ITEM');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Return Finished/Digital Good Item', 0, 'SRT_FDPROD_ITEM', 'SRT_PROD_ITEM'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Return Finished/Digital Good Item' AND has_table = 0 AND invoice_item_type_id = 'SRT_FDPROD_ITEM' AND parent_type_id = 'SRT_PROD_ITEM');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Return Raw Material Good Item', 0, 'SRT_RPROD_ITEM', 'SRT_PROD_ITEM'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Return Raw Material Good Item' AND has_table = 0 AND invoice_item_type_id = 'SRT_RPROD_ITEM' AND parent_type_id = 'SRT_PROD_ITEM');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Return Product-Feature Item', 0, 'SRT_PROD_FEATR_ITEM', 'SRT_PROD_ITEM'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Return Product-Feature Item' AND has_table = 0 AND invoice_item_type_id = 'SRT_PROD_FEATR_ITEM' AND parent_type_id = 'SRT_PROD_ITEM');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Return Service Product Item', 0, 'SRT_SPROD_ITEM', 'SRT_PROD_ITEM'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Return Service Product Item' AND has_table = 0 AND invoice_item_type_id = 'SRT_SPROD_ITEM' AND parent_type_id = 'SRT_PROD_ITEM');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id)
SELECT 'Return Work-Effort Item', 0, 'SRT_WE_ITEM'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Return Work-Effort Item' AND has_table = 0 AND invoice_item_type_id = 'SRT_WE_ITEM');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id)
SELECT 'Return Time-Entry Item', 0, 'SRT_TE_ITEM'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Return Time-Entry Item' AND has_table = 0 AND invoice_item_type_id = 'SRT_TE_ITEM');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Return Promotion', 0, 'SRT_PROMOTION_ADJ', 'SRETURN_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Return Promotion' AND has_table = 0 AND invoice_item_type_id = 'SRT_PROMOTION_ADJ' AND parent_type_id = 'SRETURN_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Return Replacement', 0, 'SRT_REPLACE_ADJ', 'SRETURN_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Return Replacement' AND has_table = 0 AND invoice_item_type_id = 'SRT_REPLACE_ADJ' AND parent_type_id = 'SRETURN_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Return Discount', 0, 'SRT_DISCOUNT_ADJ', 'SRETURN_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Return Discount' AND has_table = 0 AND invoice_item_type_id = 'SRT_DISCOUNT_ADJ' AND parent_type_id = 'SRETURN_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Return Fee', 0, 'SRT_FEE_ADJ', 'SRETURN_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Return Fee' AND has_table = 0 AND invoice_item_type_id = 'SRT_FEE_ADJ' AND parent_type_id = 'SRETURN_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Return Miscellaneous Charges', 0, 'SRT_MISC_ADJ', 'SRETURN_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Return Miscellaneous Charges' AND has_table = 0 AND invoice_item_type_id = 'SRT_MISC_ADJ' AND parent_type_id = 'SRETURN_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Return Sales Tax', 0, 'SRT_SALES_TAX_ADJ', 'SRETURN_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Return Sales Tax' AND has_table = 0 AND invoice_item_type_id = 'SRT_SALES_TAX_ADJ' AND parent_type_id = 'SRETURN_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Return VAT Tax', 0, 'SRT_VAT_TAX_ADJ', 'SRETURN_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Return VAT Tax' AND has_table = 0 AND invoice_item_type_id = 'SRT_VAT_TAX_ADJ' AND parent_type_id = 'SRETURN_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Return VAT Price Correct', 0, 'SRT_VAT_PC_ADJ', 'SRETURN_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Return VAT Price Correct' AND has_table = 0 AND invoice_item_type_id = 'SRT_VAT_PC_ADJ' AND parent_type_id = 'SRETURN_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Return Shipping and Handling', 0, 'SRT_SHIPPING_ADJ', 'SRETURN_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Return Shipping and Handling' AND has_table = 0 AND invoice_item_type_id = 'SRT_SHIPPING_ADJ' AND parent_type_id = 'SRETURN_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Return Surcharge', 0, 'SRT_SURCHARGE_ADJ', 'SRETURN_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Return Surcharge' AND has_table = 0 AND invoice_item_type_id = 'SRT_SURCHARGE_ADJ' AND parent_type_id = 'SRETURN_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Return Additional Feature', 0, 'SRT_ADD_FEATURE_ADJ', 'SRETURN_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Return Additional Feature' AND has_table = 0 AND invoice_item_type_id = 'SRT_ADD_FEATURE_ADJ' AND parent_type_id = 'SRETURN_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Return Warranty', 0, 'SRT_WARRANTY_ADJ', 'SRETURN_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Return Warranty' AND has_table = 0 AND invoice_item_type_id = 'SRT_WARRANTY_ADJ' AND parent_type_id = 'SRETURN_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Return Marketing Package Adjustment', 0, 'SRT_MKTG_PKG_ADJ', 'SRETURN_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Return Marketing Package Adjustment' AND has_table = 0 AND invoice_item_type_id = 'SRT_MKTG_PKG_ADJ' AND parent_type_id = 'SRETURN_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Return Manual Adjustment', 0, 'SRT_MAN_ADJ', 'SRETURN_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Return Manual Adjustment' AND has_table = 0 AND invoice_item_type_id = 'SRT_MAN_ADJ' AND parent_type_id = 'SRETURN_ADJ');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id)
SELECT 'Commission Invoice Line Item', 0, 'COMM_INV_ITEM'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Commission Invoice Line Item' AND has_table = 0 AND invoice_item_type_id = 'COMM_INV_ITEM');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Commission Invoice Adjustment', 0, 'COMM_INV_ADJ', 'INVOICE_ADJ'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Commission Invoice Adjustment' AND has_table = 0 AND invoice_item_type_id = 'COMM_INV_ADJ' AND parent_type_id = 'INVOICE_ADJ');

INSERT INTO invoice_type (description, has_table, invoice_type_id)
SELECT 'Invoice', 0, 'INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_type WHERE description = 'Invoice' AND has_table = 0 AND invoice_type_id = 'INVOICE');

INSERT INTO invoice_type (description, has_table, invoice_type_id, parent_type_id)
SELECT 'Purchase Invoice', 0, 'PURCHASE_INVOICE', 'INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_type WHERE description = 'Purchase Invoice' AND has_table = 0 AND invoice_type_id = 'PURCHASE_INVOICE' AND parent_type_id = 'INVOICE');

INSERT INTO invoice_type (description, has_table, invoice_type_id, parent_type_id)
SELECT 'Sales Invoice', 0, 'SALES_INVOICE', 'INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_type WHERE description = 'Sales Invoice' AND has_table = 0 AND invoice_type_id = 'SALES_INVOICE' AND parent_type_id = 'INVOICE');

INSERT INTO invoice_type (description, has_table, invoice_type_id, parent_type_id)
SELECT 'Customer Return', 0, 'CUST_RTN_INVOICE', 'PURCHASE_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_type WHERE description = 'Customer Return' AND has_table = 0 AND invoice_type_id = 'CUST_RTN_INVOICE' AND parent_type_id = 'PURCHASE_INVOICE');

INSERT INTO invoice_type (description, has_table, invoice_type_id, parent_type_id)
SELECT 'Purchase Return', 0, 'PURC_RTN_INVOICE', 'SALES_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_type WHERE description = 'Purchase Return' AND has_table = 0 AND invoice_type_id = 'PURC_RTN_INVOICE' AND parent_type_id = 'SALES_INVOICE');

INSERT INTO invoice_type (description, has_table, invoice_type_id, parent_type_id)
SELECT 'Commission', 0, 'COMMISSION_INVOICE', 'PURCHASE_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_type WHERE description = 'Commission' AND has_table = 0 AND invoice_type_id = 'COMMISSION_INVOICE' AND parent_type_id = 'PURCHASE_INVOICE');

INSERT INTO invoice_type (description, has_table, invoice_type_id, parent_type_id)
SELECT 'Interest', 0, 'INTEREST_INVOICE', 'SALES_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_type WHERE description = 'Interest' AND has_table = 0 AND invoice_type_id = 'INTEREST_INVOICE' AND parent_type_id = 'SALES_INVOICE');

INSERT INTO invoice_type (description, has_table, invoice_type_id, parent_type_id)
SELECT 'Invoice Template', 0, 'TEMPLATE', 'INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_type WHERE description = 'Invoice Template' AND has_table = 0 AND invoice_type_id = 'TEMPLATE' AND parent_type_id = 'INVOICE');

INSERT INTO invoice_type (description, has_table, invoice_type_id, parent_type_id)
SELECT 'Sales Invoice Template', 0, 'SALES_INV_TEMPLATE', 'TEMPLATE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_type WHERE description = 'Sales Invoice Template' AND has_table = 0 AND invoice_type_id = 'SALES_INV_TEMPLATE' AND parent_type_id = 'TEMPLATE');

INSERT INTO invoice_type (description, has_table, invoice_type_id, parent_type_id)
SELECT 'Purchase Invoice Template', 0, 'PUR_INV_TEMPLATE', 'TEMPLATE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_type WHERE description = 'Purchase Invoice Template' AND has_table = 0 AND invoice_type_id = 'PUR_INV_TEMPLATE' AND parent_type_id = 'TEMPLATE');

INSERT INTO invoice_item_assoc_type (description, has_table, invoice_item_assoc_type_id)
SELECT 'Commission', 0, 'COMMISSION_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_assoc_type WHERE description = 'Commission' AND has_table = 0 AND invoice_item_assoc_type_id = 'COMMISSION_INVOICE');

INSERT INTO invoice_item_assoc_type (description, has_table, invoice_item_assoc_type_id)
SELECT 'Withdraw', 0, 'WITHDRAW_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_assoc_type WHERE description = 'Withdraw' AND has_table = 0 AND invoice_item_assoc_type_id = 'WITHDRAW_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'FINISHED_GOOD', 'INV_FPROD_ITEM', 'SALES_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'FINISHED_GOOD' AND invoice_item_type_id = 'INV_FPROD_ITEM' AND invoice_type_id = 'SALES_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'SERVICE_PRODUCT', 'INV_SPROD_ITEM', 'SALES_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'SERVICE_PRODUCT' AND invoice_item_type_id = 'INV_SPROD_ITEM' AND invoice_type_id = 'SALES_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'SERVICE', 'INV_SPROD_ITEM', 'SALES_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'SERVICE' AND invoice_item_type_id = 'INV_SPROD_ITEM' AND invoice_type_id = 'SALES_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'DIGITAL_GOOD', 'INV_DPROD_ITEM', 'SALES_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'DIGITAL_GOOD' AND invoice_item_type_id = 'INV_DPROD_ITEM' AND invoice_type_id = 'SALES_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'FINDIG_GOOD', 'INV_FDPROD_ITEM', 'SALES_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'FINDIG_GOOD' AND invoice_item_type_id = 'INV_FDPROD_ITEM' AND invoice_type_id = 'SALES_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'PROMOTION_ADJUSTMENT', 'ITM_PROMOTION_ADJ', 'SALES_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'PROMOTION_ADJUSTMENT' AND invoice_item_type_id = 'ITM_PROMOTION_ADJ' AND invoice_type_id = 'SALES_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'REPLACE_ADJUSTMENT', 'ITM_REPLACE_ADJ', 'SALES_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'REPLACE_ADJUSTMENT' AND invoice_item_type_id = 'ITM_REPLACE_ADJ' AND invoice_type_id = 'SALES_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'DISCOUNT_ADJUSTMENT', 'ITM_DISCOUNT_ADJ', 'SALES_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'DISCOUNT_ADJUSTMENT' AND invoice_item_type_id = 'ITM_DISCOUNT_ADJ' AND invoice_type_id = 'SALES_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'FEE', 'ITM_FEE', 'SALES_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'FEE' AND invoice_item_type_id = 'ITM_FEE' AND invoice_type_id = 'SALES_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'MISCELLANEOUS_CHARGE', 'ITM_MISC_CHARGE', 'SALES_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'MISCELLANEOUS_CHARGE' AND invoice_item_type_id = 'ITM_MISC_CHARGE' AND invoice_type_id = 'SALES_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'SALES_TAX', 'ITM_SALES_TAX', 'SALES_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'SALES_TAX' AND invoice_item_type_id = 'ITM_SALES_TAX' AND invoice_type_id = 'SALES_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'SHIPPING_CHARGES', 'ITM_SHIPPING_CHARGES', 'SALES_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'SHIPPING_CHARGES' AND invoice_item_type_id = 'ITM_SHIPPING_CHARGES' AND invoice_type_id = 'SALES_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'SURCHARGE_ADJUSTMENT', 'ITM_SURCHARGE_ADJ', 'SALES_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'SURCHARGE_ADJUSTMENT' AND invoice_item_type_id = 'ITM_SURCHARGE_ADJ' AND invoice_type_id = 'SALES_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'ADDITIONAL_FEATURE', 'ITM_ADD_FEATURE', 'SALES_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'ADDITIONAL_FEATURE' AND invoice_item_type_id = 'ITM_ADD_FEATURE' AND invoice_type_id = 'SALES_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'WARRANTY_ADJUSTMENT', 'ITM_WARRANTY_ADJ', 'SALES_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'WARRANTY_ADJUSTMENT' AND invoice_item_type_id = 'ITM_WARRANTY_ADJ' AND invoice_type_id = 'SALES_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'VAT_TAX', 'ITM_VAT_TAX', 'SALES_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'VAT_TAX' AND invoice_item_type_id = 'ITM_VAT_TAX' AND invoice_type_id = 'SALES_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'INVENTORY_ORDER_ITEM', 'PINV_INVPRD_ITEM', 'PURCHASE_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'INVENTORY_ORDER_ITEM' AND invoice_item_type_id = 'PINV_INVPRD_ITEM' AND invoice_type_id = 'PURCHASE_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'SUPPLIES_ORDER_ITEM', 'PINV_SUPLPRD_ITEM', 'PURCHASE_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'SUPPLIES_ORDER_ITEM' AND invoice_item_type_id = 'PINV_SUPLPRD_ITEM' AND invoice_type_id = 'PURCHASE_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'ASSET_ORDER_ITEM', 'PINV_FXASTPRD_ITEM', 'PURCHASE_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'ASSET_ORDER_ITEM' AND invoice_item_type_id = 'PINV_FXASTPRD_ITEM' AND invoice_type_id = 'PURCHASE_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'FINISHED_GOOD', 'PINV_FPROD_ITEM', 'PURCHASE_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'FINISHED_GOOD' AND invoice_item_type_id = 'PINV_FPROD_ITEM' AND invoice_type_id = 'PURCHASE_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'DIGITAL_GOOD', 'PINV_DPROD_ITEM', 'PURCHASE_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'DIGITAL_GOOD' AND invoice_item_type_id = 'PINV_DPROD_ITEM' AND invoice_type_id = 'PURCHASE_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'FINDIG_GOOD', 'PINV_FDPROD_ITEM', 'PURCHASE_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'FINDIG_GOOD' AND invoice_item_type_id = 'PINV_FDPROD_ITEM' AND invoice_type_id = 'PURCHASE_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'SERVICE', 'PINV_SPROD_ITEM', 'PURCHASE_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'SERVICE' AND invoice_item_type_id = 'PINV_SPROD_ITEM' AND invoice_type_id = 'PURCHASE_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'RAW_MATERIAL', 'PINV_RPROD_ITEM', 'PURCHASE_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'RAW_MATERIAL' AND invoice_item_type_id = 'PINV_RPROD_ITEM' AND invoice_type_id = 'PURCHASE_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'PROMOTION_ADJUSTMENT', 'PITM_PROMOTION_ADJ', 'PURCHASE_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'PROMOTION_ADJUSTMENT' AND invoice_item_type_id = 'PITM_PROMOTION_ADJ' AND invoice_type_id = 'PURCHASE_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'REPLACE_ADJUSTMENT', 'PITM_REPLACE_ADJ', 'PURCHASE_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'REPLACE_ADJUSTMENT' AND invoice_item_type_id = 'PITM_REPLACE_ADJ' AND invoice_type_id = 'PURCHASE_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'DISCOUNT_ADJUSTMENT', 'PITM_DISCOUNT_ADJ', 'PURCHASE_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'DISCOUNT_ADJUSTMENT' AND invoice_item_type_id = 'PITM_DISCOUNT_ADJ' AND invoice_type_id = 'PURCHASE_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'FEE', 'PITM_FEE', 'PURCHASE_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'FEE' AND invoice_item_type_id = 'PITM_FEE' AND invoice_type_id = 'PURCHASE_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'MISCELLANEOUS_CHARGE', 'PITM_MISC_CHARGE', 'PURCHASE_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'MISCELLANEOUS_CHARGE' AND invoice_item_type_id = 'PITM_MISC_CHARGE' AND invoice_type_id = 'PURCHASE_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'SALES_TAX', 'PITM_SALES_TAX', 'PURCHASE_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'SALES_TAX' AND invoice_item_type_id = 'PITM_SALES_TAX' AND invoice_type_id = 'PURCHASE_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'SHIPPING_CHARGES', 'PITM_SHIP_CHARGES', 'PURCHASE_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'SHIPPING_CHARGES' AND invoice_item_type_id = 'PITM_SHIP_CHARGES' AND invoice_type_id = 'PURCHASE_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'SURCHARGE_ADJUSTMENT', 'PITM_SURCHARGE_ADJ', 'PURCHASE_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'SURCHARGE_ADJUSTMENT' AND invoice_item_type_id = 'PITM_SURCHARGE_ADJ' AND invoice_type_id = 'PURCHASE_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'ADDITIONAL_FEATURE', 'PITM_ADD_FEATURE', 'PURCHASE_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'ADDITIONAL_FEATURE' AND invoice_item_type_id = 'PITM_ADD_FEATURE' AND invoice_type_id = 'PURCHASE_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'WARRANTY_ADJUSTMENT', 'PITM_WARRANTY_ADJ', 'PURCHASE_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'WARRANTY_ADJUSTMENT' AND invoice_item_type_id = 'PITM_WARRANTY_ADJ' AND invoice_type_id = 'PURCHASE_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'RET_FPROD_ITEM', 'CRT_FPROD_ITEM', 'CUST_RTN_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'RET_FPROD_ITEM' AND invoice_item_type_id = 'CRT_FPROD_ITEM' AND invoice_type_id = 'CUST_RTN_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'RET_DPROD_ITEM', 'CRT_DPROD_ITEM', 'CUST_RTN_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'RET_DPROD_ITEM' AND invoice_item_type_id = 'CRT_DPROD_ITEM' AND invoice_type_id = 'CUST_RTN_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'RET_FDPROD_ITEM', 'CRT_FDPROD_ITEM', 'CUST_RTN_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'RET_FDPROD_ITEM' AND invoice_item_type_id = 'CRT_FDPROD_ITEM' AND invoice_type_id = 'CUST_RTN_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'RET_RPROD_ITEM', 'CRT_RPROD_ITEM', 'CUST_RTN_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'RET_RPROD_ITEM' AND invoice_item_type_id = 'CRT_RPROD_ITEM' AND invoice_type_id = 'CUST_RTN_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'RET_PROMOTION_ADJ', 'CRT_PROMOTION_ADJ', 'CUST_RTN_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'RET_PROMOTION_ADJ' AND invoice_item_type_id = 'CRT_PROMOTION_ADJ' AND invoice_type_id = 'CUST_RTN_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'RET_REPLACE_ADJ', 'CRT_REPLACE_ADJ', 'CUST_RTN_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'RET_REPLACE_ADJ' AND invoice_item_type_id = 'CRT_REPLACE_ADJ' AND invoice_type_id = 'CUST_RTN_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'RET_DISCOUNT_ADJ', 'CRT_DISCOUNT_ADJ', 'CUST_RTN_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'RET_DISCOUNT_ADJ' AND invoice_item_type_id = 'CRT_DISCOUNT_ADJ' AND invoice_type_id = 'CUST_RTN_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'RET_FEE_ADJ', 'CRT_FEE_ADJ', 'CUST_RTN_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'RET_FEE_ADJ' AND invoice_item_type_id = 'CRT_FEE_ADJ' AND invoice_type_id = 'CUST_RTN_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'RET_MISC_ADJ', 'CRT_MISC_ADJ', 'CUST_RTN_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'RET_MISC_ADJ' AND invoice_item_type_id = 'CRT_MISC_ADJ' AND invoice_type_id = 'CUST_RTN_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'RET_SALES_TAX_ADJ', 'CRT_SALES_TAX_ADJ', 'CUST_RTN_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'RET_SALES_TAX_ADJ' AND invoice_item_type_id = 'CRT_SALES_TAX_ADJ' AND invoice_type_id = 'CUST_RTN_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'RET_VAT_TAX_ADJ', 'CRT_VAT_TAX_ADJ', 'CUST_RTN_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'RET_VAT_TAX_ADJ' AND invoice_item_type_id = 'CRT_VAT_TAX_ADJ' AND invoice_type_id = 'CUST_RTN_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'RET_VAT_PC_ADJ', 'CRT_VAT_PC_ADJ', 'CUST_RTN_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'RET_VAT_PC_ADJ' AND invoice_item_type_id = 'CRT_VAT_PC_ADJ' AND invoice_type_id = 'CUST_RTN_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'RET_SHIPPING_ADJ', 'CRT_SHIPPING_ADJ', 'CUST_RTN_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'RET_SHIPPING_ADJ' AND invoice_item_type_id = 'CRT_SHIPPING_ADJ' AND invoice_type_id = 'CUST_RTN_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'RET_SURCHARGE_ADJ', 'CRT_SURCHARGE_ADJ', 'CUST_RTN_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'RET_SURCHARGE_ADJ' AND invoice_item_type_id = 'CRT_SURCHARGE_ADJ' AND invoice_type_id = 'CUST_RTN_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'RET_ADD_FEATURE_ADJ', 'CRT_ADD_FEATURE_ADJ', 'CUST_RTN_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'RET_ADD_FEATURE_ADJ' AND invoice_item_type_id = 'CRT_ADD_FEATURE_ADJ' AND invoice_type_id = 'CUST_RTN_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'RET_WARRANTY_ADJ', 'CRT_WARRANTY_ADJ', 'CUST_RTN_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'RET_WARRANTY_ADJ' AND invoice_item_type_id = 'CRT_WARRANTY_ADJ' AND invoice_type_id = 'CUST_RTN_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'RET_MAN_ADJ', 'CRT_MAN_ADJ', 'CUST_RTN_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'RET_MAN_ADJ' AND invoice_item_type_id = 'CRT_MAN_ADJ' AND invoice_type_id = 'CUST_RTN_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'RET_MKTG_PKG_ADJ', 'CRT_MKTG_PKG_ADJ', 'CUST_RTN_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'RET_MKTG_PKG_ADJ' AND invoice_item_type_id = 'CRT_MKTG_PKG_ADJ' AND invoice_type_id = 'CUST_RTN_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'RET_SPROD_ITEM', 'CRT_SPROD_ITEM', 'CUST_RTN_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'RET_SPROD_ITEM' AND invoice_item_type_id = 'CRT_SPROD_ITEM' AND invoice_type_id = 'CUST_RTN_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'RET_FPROD_ITEM', 'SRT_FPROD_ITEM', 'PURC_RTN_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'RET_FPROD_ITEM' AND invoice_item_type_id = 'SRT_FPROD_ITEM' AND invoice_type_id = 'PURC_RTN_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'RET_DPROD_ITEM', 'SRT_DPROD_ITEM', 'PURC_RTN_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'RET_DPROD_ITEM' AND invoice_item_type_id = 'SRT_DPROD_ITEM' AND invoice_type_id = 'PURC_RTN_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'RET_FDPROD_ITEM', 'SRT_FDPROD_ITEM', 'PURC_RTN_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'RET_FDPROD_ITEM' AND invoice_item_type_id = 'SRT_FDPROD_ITEM' AND invoice_type_id = 'PURC_RTN_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'RET_RPROD_ITEM', 'SRT_RPROD_ITEM', 'PURC_RTN_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'RET_RPROD_ITEM' AND invoice_item_type_id = 'SRT_RPROD_ITEM' AND invoice_type_id = 'PURC_RTN_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'RET_PROMOTION_ADJ', 'SRT_PROMOTION_ADJ', 'PURC_RTN_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'RET_PROMOTION_ADJ' AND invoice_item_type_id = 'SRT_PROMOTION_ADJ' AND invoice_type_id = 'PURC_RTN_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'RET_REPLACE_ADJ', 'SRT_REPLACE_ADJ', 'PURC_RTN_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'RET_REPLACE_ADJ' AND invoice_item_type_id = 'SRT_REPLACE_ADJ' AND invoice_type_id = 'PURC_RTN_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'RET_DISCOUNT_ADJ', 'SRT_DISCOUNT_ADJ', 'PURC_RTN_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'RET_DISCOUNT_ADJ' AND invoice_item_type_id = 'SRT_DISCOUNT_ADJ' AND invoice_type_id = 'PURC_RTN_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'RET_FEE_ADJ', 'SRT_FEE_ADJ', 'PURC_RTN_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'RET_FEE_ADJ' AND invoice_item_type_id = 'SRT_FEE_ADJ' AND invoice_type_id = 'PURC_RTN_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'RET_MISC_ADJ', 'SRT_MISC_ADJ', 'PURC_RTN_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'RET_MISC_ADJ' AND invoice_item_type_id = 'SRT_MISC_ADJ' AND invoice_type_id = 'PURC_RTN_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'RET_SALES_TAX_ADJ', 'SRT_SALES_TAX_ADJ', 'PURC_RTN_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'RET_SALES_TAX_ADJ' AND invoice_item_type_id = 'SRT_SALES_TAX_ADJ' AND invoice_type_id = 'PURC_RTN_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'RET_VAT_TAX_ADJ', 'SRT_VAT_TAX_ADJ', 'PURC_RTN_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'RET_VAT_TAX_ADJ' AND invoice_item_type_id = 'SRT_VAT_TAX_ADJ' AND invoice_type_id = 'PURC_RTN_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'RET_VAT_PC_ADJ', 'SRT_VAT_PC_ADJ', 'PURC_RTN_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'RET_VAT_PC_ADJ' AND invoice_item_type_id = 'SRT_VAT_PC_ADJ' AND invoice_type_id = 'PURC_RTN_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'RET_SHIPPING_ADJ', 'SRT_SHIPPING_ADJ', 'PURC_RTN_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'RET_SHIPPING_ADJ' AND invoice_item_type_id = 'SRT_SHIPPING_ADJ' AND invoice_type_id = 'PURC_RTN_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'RET_SURCHARGE_ADJ', 'SRT_SURCHARGE_ADJ', 'PURC_RTN_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'RET_SURCHARGE_ADJ' AND invoice_item_type_id = 'SRT_SURCHARGE_ADJ' AND invoice_type_id = 'PURC_RTN_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'RET_ADD_FEATURE_ADJ', 'SRT_ADD_FEATURE_ADJ', 'PURC_RTN_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'RET_ADD_FEATURE_ADJ' AND invoice_item_type_id = 'SRT_ADD_FEATURE_ADJ' AND invoice_type_id = 'PURC_RTN_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'RET_WARRANTY_ADJ', 'SRT_WARRANTY_ADJ', 'PURC_RTN_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'RET_WARRANTY_ADJ' AND invoice_item_type_id = 'SRT_WARRANTY_ADJ' AND invoice_type_id = 'PURC_RTN_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'RET_MAN_ADJ', 'SRT_MAN_ADJ', 'PURC_RTN_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'RET_MAN_ADJ' AND invoice_item_type_id = 'SRT_MAN_ADJ' AND invoice_type_id = 'PURC_RTN_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'RET_MKTG_PKG_ADJ', 'SRT_MKTG_PKG_ADJ', 'PURC_RTN_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'RET_MKTG_PKG_ADJ' AND invoice_item_type_id = 'SRT_MKTG_PKG_ADJ' AND invoice_type_id = 'PURC_RTN_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'COM_COMM_ITEM', 'COMM_INV_ITEM', 'COMMISSION_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'COM_COMM_ITEM' AND invoice_item_type_id = 'COMM_INV_ITEM' AND invoice_type_id = 'COMMISSION_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'COM_COMM_ADJ', 'COMM_INV_ADJ', 'COMMISSION_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'COM_COMM_ADJ' AND invoice_item_type_id = 'COMM_INV_ADJ' AND invoice_type_id = 'COMMISSION_INVOICE');

INSERT INTO invoice_item_type_map (invoice_item_map_key, invoice_item_type_id, invoice_type_id)
SELECT 'INT_INV_CHRG', 'INV_INTRST_CHRG', 'INTEREST_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type_map WHERE invoice_item_map_key = 'INT_INV_CHRG' AND invoice_item_type_id = 'INV_INTRST_CHRG' AND invoice_type_id = 'INTEREST_INVOICE');

INSERT INTO invoice_type (description, has_table, invoice_type_id, parent_type_id)
SELECT 'Payrol', 0, 'PAYROL_INVOICE', 'PURCHASE_INVOICE'
WHERE NOT EXISTS (SELECT 1 FROM invoice_type WHERE description = 'Payrol' AND has_table = 0 AND invoice_type_id = 'PAYROL_INVOICE' AND parent_type_id = 'PURCHASE_INVOICE');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id)
SELECT 'Payrol', 0, 'PAYROL'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Payrol' AND has_table = 0 AND invoice_item_type_id = 'PAYROL');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Earnings and Hours', 0, 'PAYROL_EARN_HOURS', 'PAYROL'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Earnings and Hours' AND has_table = 0 AND invoice_item_type_id = 'PAYROL_EARN_HOURS' AND parent_type_id = 'PAYROL');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Hourly Rate', 0, 'PAYROL_HRLY_RATE', 'PAYROL_EARN_HOURS'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Hourly Rate' AND has_table = 0 AND invoice_item_type_id = 'PAYROL_HRLY_RATE' AND parent_type_id = 'PAYROL_EARN_HOURS');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Sick Hourly Rate', 0, 'PAYROL_HRLY_RATE_SIC', 'PAYROL_EARN_HOURS'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Sick Hourly Rate' AND has_table = 0 AND invoice_item_type_id = 'PAYROL_HRLY_RATE_SIC' AND parent_type_id = 'PAYROL_EARN_HOURS');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Salary', 0, 'PAYROL_SALARY', 'PAYROL_EARN_HOURS'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Salary' AND has_table = 0 AND invoice_item_type_id = 'PAYROL_SALARY' AND parent_type_id = 'PAYROL_EARN_HOURS');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Vacation Salary', 0, 'PAYROL_SALARY_VAC', 'PAYROL_EARN_HOURS'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Vacation Salary' AND has_table = 0 AND invoice_item_type_id = 'PAYROL_SALARY_VAC' AND parent_type_id = 'PAYROL_EARN_HOURS');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Sick Salary', 0, 'PAYROL_SALARY_SICK', 'PAYROL_EARN_HOURS'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Sick Salary' AND has_table = 0 AND invoice_item_type_id = 'PAYROL_SALARY_SICK' AND parent_type_id = 'PAYROL_EARN_HOURS');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Bonus', 0, 'PAYROL_BONUS', 'PAYROL_EARN_HOURS'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Bonus' AND has_table = 0 AND invoice_item_type_id = 'PAYROL_BONUS' AND parent_type_id = 'PAYROL_EARN_HOURS');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Commission', 0, 'PAYROL_COMMISSION', 'PAYROL_EARN_HOURS'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Commission' AND has_table = 0 AND invoice_item_type_id = 'PAYROL_COMMISSION' AND parent_type_id = 'PAYROL_EARN_HOURS');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Advance Pay', 0, 'PAYROL_ADV_PAY', 'PAYROL_EARN_HOURS'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Advance Pay' AND has_table = 0 AND invoice_item_type_id = 'PAYROL_ADV_PAY' AND parent_type_id = 'PAYROL_EARN_HOURS');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Mileage Reimboursement', 0, 'PAYROL_MIL_REIMB', 'PAYROL_EARN_HOURS'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Mileage Reimboursement' AND has_table = 0 AND invoice_item_type_id = 'PAYROL_MIL_REIMB' AND parent_type_id = 'PAYROL_EARN_HOURS');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Office Exp. reimboursement', 0, 'PAYROL_OFF_EXP_REIMB', 'PAYROL_EARN_HOURS'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Office Exp. reimboursement' AND has_table = 0 AND invoice_item_type_id = 'PAYROL_OFF_EXP_REIMB' AND parent_type_id = 'PAYROL_EARN_HOURS');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Pay Period adj(over pay)', 0, 'PAYROL_PAYPER_OVRPAY', 'PAYROL_EARN_HOURS'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Pay Period adj(over pay)' AND has_table = 0 AND invoice_item_type_id = 'PAYROL_PAYPER_OVRPAY' AND parent_type_id = 'PAYROL_EARN_HOURS');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Pay Period adj pay', 0, 'PAYROL_PAYPER_PAY', 'PAYROL_EARN_HOURS'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Pay Period adj pay' AND has_table = 0 AND invoice_item_type_id = 'PAYROL_PAYPER_PAY' AND parent_type_id = 'PAYROL_EARN_HOURS');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Deductions from Gross', 0, 'PAYROL_DD_FROM_GROSS', 'PAYROL'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Deductions from Gross' AND has_table = 0 AND invoice_item_type_id = 'PAYROL_DD_FROM_GROSS' AND parent_type_id = 'PAYROL');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT '125*Compy. Contr Other Prem.', 0, 'PAYROL_DD_125COMPY', 'PAYROL_DD_FROM_GROSS'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = '125*Compy. Contr Other Prem.' AND has_table = 0 AND invoice_item_type_id = 'PAYROL_DD_125COMPY' AND parent_type_id = 'PAYROL_DD_FROM_GROSS');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT '125*PPO (pre tax)', 0, 'PAYROL_DD_125PPO', 'PAYROL_DD_FROM_GROSS'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = '125*PPO (pre tax)' AND has_table = 0 AND invoice_item_type_id = 'PAYROL_DD_125PPO' AND parent_type_id = 'PAYROL_DD_FROM_GROSS');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT '125*HSA Contribution (pre tax)', 0, 'PAYROL_DD_125HSA', 'PAYROL_DD_FROM_GROSS'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = '125*HSA Contribution (pre tax)' AND has_table = 0 AND invoice_item_type_id = 'PAYROL_DD_125HSA' AND parent_type_id = 'PAYROL_DD_FROM_GROSS');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT '401K Emp.', 0, 'PAYROL_DD_401K', 'PAYROL_DD_FROM_GROSS'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = '401K Emp.' AND has_table = 0 AND invoice_item_type_id = 'PAYROL_DD_401K' AND parent_type_id = 'PAYROL_DD_FROM_GROSS');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Advance Repayment', 0, 'PAYROL_DD_REPAY', 'PAYROL_DD_FROM_GROSS'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Advance Repayment' AND has_table = 0 AND invoice_item_type_id = 'PAYROL_DD_REPAY' AND parent_type_id = 'PAYROL_DD_FROM_GROSS');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Charity Donation', 0, 'PAYROL_DD_CHAR_DONAT', 'PAYROL_DD_FROM_GROSS'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Charity Donation' AND has_table = 0 AND invoice_item_type_id = 'PAYROL_DD_CHAR_DONAT' AND parent_type_id = 'PAYROL_DD_FROM_GROSS');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Child Support Garnishment', 0, 'PAYROL_DD_CHILD_SUPP', 'PAYROL_DD_FROM_GROSS'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Child Support Garnishment' AND has_table = 0 AND invoice_item_type_id = 'PAYROL_DD_CHILD_SUPP' AND parent_type_id = 'PAYROL_DD_FROM_GROSS');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Miscellaneous Deduction', 0, 'PAYROL_DD_MISC', 'PAYROL_DD_FROM_GROSS'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Miscellaneous Deduction' AND has_table = 0 AND invoice_item_type_id = 'PAYROL_DD_MISC' AND parent_type_id = 'PAYROL_DD_FROM_GROSS');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Roth 401k Emp.', 0, 'PAYROL_DD_ROTH_401K', 'PAYROL_DD_FROM_GROSS'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Roth 401k Emp.' AND has_table = 0 AND invoice_item_type_id = 'PAYROL_DD_ROTH_401K' AND parent_type_id = 'PAYROL_DD_FROM_GROSS');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Simple IRA emp.', 0, 'PAYROL_DD_SIMP_IRA', 'PAYROL_DD_FROM_GROSS'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Simple IRA emp.' AND has_table = 0 AND invoice_item_type_id = 'PAYROL_DD_SIMP_IRA' AND parent_type_id = 'PAYROL_DD_FROM_GROSS');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Union Dues', 0, 'PAYROL_DD_UNION', 'PAYROL_DD_FROM_GROSS'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Union Dues' AND has_table = 0 AND invoice_item_type_id = 'PAYROL_DD_UNION' AND parent_type_id = 'PAYROL_DD_FROM_GROSS');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Unpaid Salary Time off.', 0, 'PAYROL_DD_SAL_TIMOFF', 'PAYROL_DD_FROM_GROSS'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Unpaid Salary Time off.' AND has_table = 0 AND invoice_item_type_id = 'PAYROL_DD_SAL_TIMOFF' AND parent_type_id = 'PAYROL_DD_FROM_GROSS');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Wage Garnishment', 0, 'PAYROL_DD_WAG_GARN', 'PAYROL_DD_FROM_GROSS'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Wage Garnishment' AND has_table = 0 AND invoice_item_type_id = 'PAYROL_DD_WAG_GARN' AND parent_type_id = 'PAYROL_DD_FROM_GROSS');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Taxes', 0, 'PAYROL_TAXES', 'PAYROL'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Taxes' AND has_table = 0 AND invoice_item_type_id = 'PAYROL_TAXES' AND parent_type_id = 'PAYROL');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Federal Witholding', 0, 'PAYROL_TAX_FEDERAL', 'PAYROL_TAXES'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Federal Witholding' AND has_table = 0 AND invoice_item_type_id = 'PAYROL_TAX_FEDERAL' AND parent_type_id = 'PAYROL_TAXES');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Social Security Employee', 0, 'PAYROL_SOC_SEC_EMPL', 'PAYROL_TAXES'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Social Security Employee' AND has_table = 0 AND invoice_item_type_id = 'PAYROL_SOC_SEC_EMPL' AND parent_type_id = 'PAYROL_TAXES');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'Medicare Employee', 0, 'PAYROL_TAX_MED_EMPL', 'PAYROL_TAXES'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'Medicare Employee' AND has_table = 0 AND invoice_item_type_id = 'PAYROL_TAX_MED_EMPL' AND parent_type_id = 'PAYROL_TAXES');

INSERT INTO invoice_item_type (description, has_table, invoice_item_type_id, parent_type_id)
SELECT 'MD Withholding', 0, 'PAYROL_TAX_MD_WITHOL', 'PAYROL_TAXES'
WHERE NOT EXISTS (SELECT 1 FROM invoice_item_type WHERE description = 'MD Withholding' AND has_table = 0 AND invoice_item_type_id = 'PAYROL_TAX_MD_WITHOL' AND parent_type_id = 'PAYROL_TAXES');

INSERT INTO enumeration_type (description, enum_type_id, has_table)
SELECT 'Taxable Invoice Item Types', 'TAXABLE_INV_ITM_TY', 0
WHERE NOT EXISTS (SELECT 1 FROM enumeration_type WHERE description = 'Taxable Invoice Item Types' AND enum_type_id = 'TAXABLE_INV_ITM_TY' AND has_table = 0);

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Sales Invoice Sales Tax', 'INV_SALES_TAX', 'INV_SALES_TAX', 'TAXABLE_INV_ITM_TY', '01'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Sales Invoice Sales Tax' AND enum_code = 'INV_SALES_TAX' AND enum_id = 'INV_SALES_TAX' AND enum_type_id = 'TAXABLE_INV_ITM_TY' AND sequence_id = '01');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Sales Invoice Line Item Sales Tax', 'ITM_SALES_TAX', 'ITM_SALES_TAX', 'TAXABLE_INV_ITM_TY', '02'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Sales Invoice Line Item Sales Tax' AND enum_code = 'ITM_SALES_TAX' AND enum_id = 'ITM_SALES_TAX' AND enum_type_id = 'TAXABLE_INV_ITM_TY' AND sequence_id = '02');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Purchase Invoice Sales Tax', 'PINV_SALES_TAX', 'PINV_SALES_TAX', 'TAXABLE_INV_ITM_TY', '03'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Purchase Invoice Sales Tax' AND enum_code = 'PINV_SALES_TAX' AND enum_id = 'PINV_SALES_TAX' AND enum_type_id = 'TAXABLE_INV_ITM_TY' AND sequence_id = '03');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Purchase Invoice Line Item Sales Tax', 'PITM_SALES_TAX', 'PITM_SALES_TAX', 'TAXABLE_INV_ITM_TY', '04'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Purchase Invoice Line Item Sales Tax' AND enum_code = 'PITM_SALES_TAX' AND enum_id = 'PITM_SALES_TAX' AND enum_type_id = 'TAXABLE_INV_ITM_TY' AND sequence_id = '04');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Customer Return Sales Tax Adjustment', 'CRT_SALES_TAX_ADJ', 'CRT_SALES_TAX_ADJ', 'TAXABLE_INV_ITM_TY', '05'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Customer Return Sales Tax Adjustment' AND enum_code = 'CRT_SALES_TAX_ADJ' AND enum_id = 'CRT_SALES_TAX_ADJ' AND enum_type_id = 'TAXABLE_INV_ITM_TY' AND sequence_id = '05');

INSERT INTO payment_method_type (description, payment_method_type_id)
SELECT 'Credit Card', 'CREDIT_CARD'
WHERE NOT EXISTS (SELECT 1 FROM payment_method_type WHERE description = 'Credit Card' AND payment_method_type_id = 'CREDIT_CARD');

INSERT INTO payment_method_type (description, payment_method_type_id)
SELECT 'Gift Card', 'GIFT_CARD'
WHERE NOT EXISTS (SELECT 1 FROM payment_method_type WHERE description = 'Gift Card' AND payment_method_type_id = 'GIFT_CARD');

INSERT INTO payment_method_type (description, payment_method_type_id)
SELECT 'Gift Certificate', 'GIFT_CERTIFICATE'
WHERE NOT EXISTS (SELECT 1 FROM payment_method_type WHERE description = 'Gift Certificate' AND payment_method_type_id = 'GIFT_CERTIFICATE');

INSERT INTO payment_method_type (description, payment_method_type_id)
SELECT 'Cash', 'CASH'
WHERE NOT EXISTS (SELECT 1 FROM payment_method_type WHERE description = 'Cash' AND payment_method_type_id = 'CASH');

INSERT INTO payment_method_type (description, payment_method_type_id)
SELECT 'Electronic Funds Transfer', 'EFT_ACCOUNT'
WHERE NOT EXISTS (SELECT 1 FROM payment_method_type WHERE description = 'Electronic Funds Transfer' AND payment_method_type_id = 'EFT_ACCOUNT');

INSERT INTO payment_method_type (description, payment_method_type_id)
SELECT 'Financial Account', 'FIN_ACCOUNT'
WHERE NOT EXISTS (SELECT 1 FROM payment_method_type WHERE description = 'Financial Account' AND payment_method_type_id = 'FIN_ACCOUNT');

INSERT INTO payment_method_type (description, payment_method_type_id)
SELECT 'Personal Check', 'PERSONAL_CHECK'
WHERE NOT EXISTS (SELECT 1 FROM payment_method_type WHERE description = 'Personal Check' AND payment_method_type_id = 'PERSONAL_CHECK');

INSERT INTO payment_method_type (description, payment_method_type_id)
SELECT 'Company Check', 'COMPANY_CHECK'
WHERE NOT EXISTS (SELECT 1 FROM payment_method_type WHERE description = 'Company Check' AND payment_method_type_id = 'COMPANY_CHECK');

INSERT INTO payment_method_type (description, payment_method_type_id)
SELECT 'Certified Check', 'CERTIFIED_CHECK'
WHERE NOT EXISTS (SELECT 1 FROM payment_method_type WHERE description = 'Certified Check' AND payment_method_type_id = 'CERTIFIED_CHECK');

INSERT INTO payment_method_type (description, payment_method_type_id)
SELECT 'Money Order', 'MONEY_ORDER'
WHERE NOT EXISTS (SELECT 1 FROM payment_method_type WHERE description = 'Money Order' AND payment_method_type_id = 'MONEY_ORDER');

INSERT INTO payment_method_type (description, payment_method_type_id)
SELECT 'Company Account', 'COMPANY_ACCOUNT'
WHERE NOT EXISTS (SELECT 1 FROM payment_method_type WHERE description = 'Company Account' AND payment_method_type_id = 'COMPANY_ACCOUNT');

INSERT INTO payment_method_type (description, payment_method_type_id)
SELECT 'Billing Account', 'EXT_BILLACT'
WHERE NOT EXISTS (SELECT 1 FROM payment_method_type WHERE description = 'Billing Account' AND payment_method_type_id = 'EXT_BILLACT');

INSERT INTO payment_method_type (description, payment_method_type_id)
SELECT 'Cash On Delivery', 'EXT_COD'
WHERE NOT EXISTS (SELECT 1 FROM payment_method_type WHERE description = 'Cash On Delivery' AND payment_method_type_id = 'EXT_COD');

INSERT INTO payment_method_type (description, payment_method_type_id)
SELECT 'eBay', 'EXT_EBAY'
WHERE NOT EXISTS (SELECT 1 FROM payment_method_type WHERE description = 'eBay' AND payment_method_type_id = 'EXT_EBAY');

INSERT INTO payment_method_type (description, payment_method_type_id)
SELECT 'Offline Payment', 'EXT_OFFLINE'
WHERE NOT EXISTS (SELECT 1 FROM payment_method_type WHERE description = 'Offline Payment' AND payment_method_type_id = 'EXT_OFFLINE');

INSERT INTO payment_method_type (description, payment_method_type_id)
SELECT 'PayPal', 'EXT_PAYPAL'
WHERE NOT EXISTS (SELECT 1 FROM payment_method_type WHERE description = 'PayPal' AND payment_method_type_id = 'EXT_PAYPAL');

INSERT INTO payment_method_type (description, payment_method_type_id)
SELECT 'RBS WorldPay', 'EXT_WORLDPAY'
WHERE NOT EXISTS (SELECT 1 FROM payment_method_type WHERE description = 'RBS WorldPay' AND payment_method_type_id = 'EXT_WORLDPAY');

INSERT INTO payment_type (description, has_table, payment_type_id)
SELECT 'Disbursement', 0, 'DISBURSEMENT'
WHERE NOT EXISTS (SELECT 1 FROM payment_type WHERE description = 'Disbursement' AND has_table = 0 AND payment_type_id = 'DISBURSEMENT');

INSERT INTO payment_type (description, has_table, parent_type_id, payment_type_id)
SELECT 'Customer Refund', 0, 'DISBURSEMENT', 'CUSTOMER_REFUND'
WHERE NOT EXISTS (SELECT 1 FROM payment_type WHERE description = 'Customer Refund' AND has_table = 0 AND parent_type_id = 'DISBURSEMENT' AND payment_type_id = 'CUSTOMER_REFUND');

INSERT INTO payment_type (description, has_table, parent_type_id, payment_type_id)
SELECT 'Vendor Payment', 0, 'DISBURSEMENT', 'VENDOR_PAYMENT'
WHERE NOT EXISTS (SELECT 1 FROM payment_type WHERE description = 'Vendor Payment' AND has_table = 0 AND parent_type_id = 'DISBURSEMENT' AND payment_type_id = 'VENDOR_PAYMENT');

INSERT INTO payment_type (description, has_table, parent_type_id, payment_type_id)
SELECT 'Vendor Prepayment', 0, 'DISBURSEMENT', 'VENDOR_PREPAY'
WHERE NOT EXISTS (SELECT 1 FROM payment_type WHERE description = 'Vendor Prepayment' AND has_table = 0 AND parent_type_id = 'DISBURSEMENT' AND payment_type_id = 'VENDOR_PREPAY');

INSERT INTO payment_type (description, has_table, parent_type_id, payment_type_id)
SELECT 'Commission Payment', 0, 'DISBURSEMENT', 'COMMISSION_PAYMENT'
WHERE NOT EXISTS (SELECT 1 FROM payment_type WHERE description = 'Commission Payment' AND has_table = 0 AND parent_type_id = 'DISBURSEMENT' AND payment_type_id = 'COMMISSION_PAYMENT');

INSERT INTO payment_type (description, has_table, parent_type_id, payment_type_id)
SELECT 'Payrol Payment', 0, 'DISBURSEMENT', 'PAYROL_PAYMENT'
WHERE NOT EXISTS (SELECT 1 FROM payment_type WHERE description = 'Payrol Payment' AND has_table = 0 AND parent_type_id = 'DISBURSEMENT' AND payment_type_id = 'PAYROL_PAYMENT');

INSERT INTO payment_type (description, has_table, parent_type_id, payment_type_id)
SELECT 'Pay Check', 0, 'DISBURSEMENT', 'PAY_CHECK'
WHERE NOT EXISTS (SELECT 1 FROM payment_type WHERE description = 'Pay Check' AND has_table = 0 AND parent_type_id = 'DISBURSEMENT' AND payment_type_id = 'PAY_CHECK');

INSERT INTO payment_type (description, has_table, parent_type_id, payment_type_id)
SELECT 'Tax Payment', 0, 'DISBURSEMENT', 'TAX_PAYMENT'
WHERE NOT EXISTS (SELECT 1 FROM payment_type WHERE description = 'Tax Payment' AND has_table = 0 AND parent_type_id = 'DISBURSEMENT' AND payment_type_id = 'TAX_PAYMENT');

INSERT INTO payment_type (description, has_table, parent_type_id, payment_type_id)
SELECT 'Sales Tax Payment', 0, 'TAX_PAYMENT', 'SALES_TAX_PAYMENT'
WHERE NOT EXISTS (SELECT 1 FROM payment_type WHERE description = 'Sales Tax Payment' AND has_table = 0 AND parent_type_id = 'TAX_PAYMENT' AND payment_type_id = 'SALES_TAX_PAYMENT');

INSERT INTO payment_type (description, has_table, parent_type_id, payment_type_id)
SELECT 'Payroll Tax Payment', 0, 'TAX_PAYMENT', 'PAYROLL_TAX_PAYMENT'
WHERE NOT EXISTS (SELECT 1 FROM payment_type WHERE description = 'Payroll Tax Payment' AND has_table = 0 AND parent_type_id = 'TAX_PAYMENT' AND payment_type_id = 'PAYROLL_TAX_PAYMENT');

INSERT INTO payment_type (description, has_table, parent_type_id, payment_type_id)
SELECT 'Income Tax Payment', 0, 'TAX_PAYMENT', 'INCOME_TAX_PAYMENT'
WHERE NOT EXISTS (SELECT 1 FROM payment_type WHERE description = 'Income Tax Payment' AND has_table = 0 AND parent_type_id = 'TAX_PAYMENT' AND payment_type_id = 'INCOME_TAX_PAYMENT');

INSERT INTO payment_type (description, has_table, parent_type_id, payment_type_id)
SELECT 'Gift Certificate Withdrawal', 0, 'DISBURSEMENT', 'GC_WITHDRAWAL'
WHERE NOT EXISTS (SELECT 1 FROM payment_type WHERE description = 'Gift Certificate Withdrawal' AND has_table = 0 AND parent_type_id = 'DISBURSEMENT' AND payment_type_id = 'GC_WITHDRAWAL');

INSERT INTO payment_type (description, has_table, payment_type_id)
SELECT 'Receipt', 0, 'RECEIPT'
WHERE NOT EXISTS (SELECT 1 FROM payment_type WHERE description = 'Receipt' AND has_table = 0 AND payment_type_id = 'RECEIPT');

INSERT INTO payment_type (description, has_table, parent_type_id, payment_type_id)
SELECT 'Customer Payment', 0, 'RECEIPT', 'CUSTOMER_PAYMENT'
WHERE NOT EXISTS (SELECT 1 FROM payment_type WHERE description = 'Customer Payment' AND has_table = 0 AND parent_type_id = 'RECEIPT' AND payment_type_id = 'CUSTOMER_PAYMENT');

INSERT INTO payment_type (description, has_table, parent_type_id, payment_type_id)
SELECT 'Customer Deposit', 0, 'RECEIPT', 'CUSTOMER_DEPOSIT'
WHERE NOT EXISTS (SELECT 1 FROM payment_type WHERE description = 'Customer Deposit' AND has_table = 0 AND parent_type_id = 'RECEIPT' AND payment_type_id = 'CUSTOMER_DEPOSIT');

INSERT INTO payment_type (description, has_table, parent_type_id, payment_type_id)
SELECT 'Interest Receipt', 0, 'RECEIPT', 'INTEREST_RECEIPT'
WHERE NOT EXISTS (SELECT 1 FROM payment_type WHERE description = 'Interest Receipt' AND has_table = 0 AND parent_type_id = 'RECEIPT' AND payment_type_id = 'INTEREST_RECEIPT');

INSERT INTO payment_type (description, has_table, parent_type_id, payment_type_id)
SELECT 'Gift Certificate Deposit', 0, 'RECEIPT', 'GC_DEPOSIT'
WHERE NOT EXISTS (SELECT 1 FROM payment_type WHERE description = 'Gift Certificate Deposit' AND has_table = 0 AND parent_type_id = 'RECEIPT' AND payment_type_id = 'GC_DEPOSIT');

INSERT INTO payment_group_type (description, has_table, payment_group_type_id)
SELECT 'Check Run', 0, 'CHECK_RUN'
WHERE NOT EXISTS (SELECT 1 FROM payment_group_type WHERE description = 'Check Run' AND has_table = 0 AND payment_group_type_id = 'CHECK_RUN');

INSERT INTO payment_group_type (description, has_table, payment_group_type_id)
SELECT 'Batch of Payments', 0, 'BATCH_PAYMENT'
WHERE NOT EXISTS (SELECT 1 FROM payment_group_type WHERE description = 'Batch of Payments' AND has_table = 0 AND payment_group_type_id = 'BATCH_PAYMENT');

INSERT INTO custom_method_type (custom_method_type_id, description, has_table)
SELECT 'CC_AUTH', 'Credit Card authorize methods', 0
WHERE NOT EXISTS (SELECT 1 FROM custom_method_type WHERE custom_method_type_id = 'CC_AUTH' AND description = 'Credit Card authorize methods' AND has_table = 0);

INSERT INTO custom_method_type (custom_method_type_id, description, has_table)
SELECT 'CC_CAPTURE', 'Credit Card capture methods', 0
WHERE NOT EXISTS (SELECT 1 FROM custom_method_type WHERE custom_method_type_id = 'CC_CAPTURE' AND description = 'Credit Card capture methods' AND has_table = 0);

INSERT INTO custom_method_type (custom_method_type_id, description, has_table)
SELECT 'CC_REFUND', 'Credit Card refund methods', 0
WHERE NOT EXISTS (SELECT 1 FROM custom_method_type WHERE custom_method_type_id = 'CC_REFUND' AND description = 'Credit Card refund methods' AND has_table = 0);

INSERT INTO custom_method_type (custom_method_type_id, description, has_table)
SELECT 'CC_RELEASE', 'Credit Card release methods', 0
WHERE NOT EXISTS (SELECT 1 FROM custom_method_type WHERE custom_method_type_id = 'CC_RELEASE' AND description = 'Credit Card release methods' AND has_table = 0);

INSERT INTO custom_method_type (custom_method_type_id, description, has_table)
SELECT 'CC_CREDIT', 'Credit Card credit methods', 0
WHERE NOT EXISTS (SELECT 1 FROM custom_method_type WHERE custom_method_type_id = 'CC_CREDIT' AND description = 'Credit Card credit methods' AND has_table = 0);

INSERT INTO custom_method_type (custom_method_type_id, description, has_table)
SELECT 'EFT_AUTH', 'EFT authorize methods', 0
WHERE NOT EXISTS (SELECT 1 FROM custom_method_type WHERE custom_method_type_id = 'EFT_AUTH' AND description = 'EFT authorize methods' AND has_table = 0);

INSERT INTO custom_method_type (custom_method_type_id, description, has_table)
SELECT 'EFT_RELEASE', 'EFT release methods', 0
WHERE NOT EXISTS (SELECT 1 FROM custom_method_type WHERE custom_method_type_id = 'EFT_RELEASE' AND description = 'EFT release methods' AND has_table = 0);

INSERT INTO custom_method_type (custom_method_type_id, description, has_table)
SELECT 'FIN_AUTH', 'FIN account authorize methods', 0
WHERE NOT EXISTS (SELECT 1 FROM custom_method_type WHERE custom_method_type_id = 'FIN_AUTH' AND description = 'FIN account authorize methods' AND has_table = 0);

INSERT INTO custom_method_type (custom_method_type_id, description, has_table)
SELECT 'FIN_CAPTURE', 'FIN account capture methods', 0
WHERE NOT EXISTS (SELECT 1 FROM custom_method_type WHERE custom_method_type_id = 'FIN_CAPTURE' AND description = 'FIN account capture methods' AND has_table = 0);

INSERT INTO custom_method_type (custom_method_type_id, description, has_table)
SELECT 'FIN_REFUND', 'FIN account refund methods', 0
WHERE NOT EXISTS (SELECT 1 FROM custom_method_type WHERE custom_method_type_id = 'FIN_REFUND' AND description = 'FIN account refund methods' AND has_table = 0);

INSERT INTO custom_method_type (custom_method_type_id, description, has_table)
SELECT 'FIN_RELEASE', 'FIN account release methods', 0
WHERE NOT EXISTS (SELECT 1 FROM custom_method_type WHERE custom_method_type_id = 'FIN_RELEASE' AND description = 'FIN account release methods' AND has_table = 0);

INSERT INTO custom_method_type (custom_method_type_id, description, has_table)
SELECT 'FIN_PURCHASE', 'FIN account purchase methods', 0
WHERE NOT EXISTS (SELECT 1 FROM custom_method_type WHERE custom_method_type_id = 'FIN_PURCHASE' AND description = 'FIN account purchase methods' AND has_table = 0);

INSERT INTO custom_method_type (custom_method_type_id, description, has_table)
SELECT 'GIFT_AUTH', 'GIFT card authorize methods', 0
WHERE NOT EXISTS (SELECT 1 FROM custom_method_type WHERE custom_method_type_id = 'GIFT_AUTH' AND description = 'GIFT card authorize methods' AND has_table = 0);

INSERT INTO custom_method_type (custom_method_type_id, description, has_table)
SELECT 'GIFT_CAPTURE', 'GIFT card capture methods', 0
WHERE NOT EXISTS (SELECT 1 FROM custom_method_type WHERE custom_method_type_id = 'GIFT_CAPTURE' AND description = 'GIFT card capture methods' AND has_table = 0);

INSERT INTO custom_method_type (custom_method_type_id, description, has_table)
SELECT 'GIFT_REFUND', 'GIFT card refund methods', 0
WHERE NOT EXISTS (SELECT 1 FROM custom_method_type WHERE custom_method_type_id = 'GIFT_REFUND' AND description = 'GIFT card refund methods' AND has_table = 0);

INSERT INTO custom_method_type (custom_method_type_id, description, has_table)
SELECT 'GIFT_RELEASE', 'GIFT card release methods', 0
WHERE NOT EXISTS (SELECT 1 FROM custom_method_type WHERE custom_method_type_id = 'GIFT_RELEASE' AND description = 'GIFT card release methods' AND has_table = 0);

INSERT INTO custom_method_type (custom_method_type_id, description, has_table)
SELECT 'GIFT_PURCHASE', 'GIFT card purchase methods', 0
WHERE NOT EXISTS (SELECT 1 FROM custom_method_type WHERE custom_method_type_id = 'GIFT_PURCHASE' AND description = 'GIFT card purchase methods' AND has_table = 0);

INSERT INTO custom_method_type (custom_method_type_id, description, has_table)
SELECT 'PAYPAL_AUTH', 'PayPal authorize methods', 0
WHERE NOT EXISTS (SELECT 1 FROM custom_method_type WHERE custom_method_type_id = 'PAYPAL_AUTH' AND description = 'PayPal authorize methods' AND has_table = 0);

INSERT INTO custom_method_type (custom_method_type_id, description, has_table)
SELECT 'PAYPAL_CAPTURE', 'PayPal capture methods', 0
WHERE NOT EXISTS (SELECT 1 FROM custom_method_type WHERE custom_method_type_id = 'PAYPAL_CAPTURE' AND description = 'PayPal capture methods' AND has_table = 0);

INSERT INTO custom_method_type (custom_method_type_id, description, has_table)
SELECT 'PAYPAL_REFUND', 'PayPal refund methods', 0
WHERE NOT EXISTS (SELECT 1 FROM custom_method_type WHERE custom_method_type_id = 'PAYPAL_REFUND' AND description = 'PayPal refund methods' AND has_table = 0);

INSERT INTO custom_method_type (custom_method_type_id, description, has_table)
SELECT 'PAYPAL_RELEASE', 'PayPal release methods', 0
WHERE NOT EXISTS (SELECT 1 FROM custom_method_type WHERE custom_method_type_id = 'PAYPAL_RELEASE' AND description = 'PayPal release methods' AND has_table = 0);

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'CC_AUTH_TEST', 'testCCProcessor', 'CC_AUTH', 'CC Test authorize'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'CC_AUTH_TEST' AND custom_method_name = 'testCCProcessor' AND custom_method_type_id = 'CC_AUTH' AND description = 'CC Test authorize');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'CC_AUTH_CAPTURE_TST', 'testCCProcessorWithCapture', 'CC_AUTH', 'CC Test authorize and capture'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'CC_AUTH_CAPTURE_TST' AND custom_method_name = 'testCCProcessorWithCapture' AND custom_method_type_id = 'CC_AUTH' AND description = 'CC Test authorize and capture');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'CC_AUTH_RANDOM_TEST', 'testRandomAuthorize', 'CC_AUTH', 'CC Test random authorize'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'CC_AUTH_RANDOM_TEST' AND custom_method_name = 'testRandomAuthorize' AND custom_method_type_id = 'CC_AUTH' AND description = 'CC Test random authorize');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'CC_AUTH_AIM', 'aimCCAuth', 'CC_AUTH', 'CC Authorize dot net authorize'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'CC_AUTH_AIM' AND custom_method_name = 'aimCCAuth' AND custom_method_type_id = 'CC_AUTH' AND description = 'CC Authorize dot net authorize');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'CC_AUTH_CAPTURE_AIM', 'aimCCAuthCapture', 'CC_AUTH', 'CC Authorize dot net authorize and capture'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'CC_AUTH_CAPTURE_AIM' AND custom_method_name = 'aimCCAuthCapture' AND custom_method_type_id = 'CC_AUTH' AND description = 'CC Authorize dot net authorize and capture');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'CC_AUTH_CLEARCOMMERC', 'clearCommerceCCAuth', 'CC_AUTH', 'CC Clear Commerce authorize'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'CC_AUTH_CLEARCOMMERC' AND custom_method_name = 'clearCommerceCCAuth' AND custom_method_type_id = 'CC_AUTH' AND description = 'CC Clear Commerce authorize');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'CC_AUTH_CLEARCOM_REP', 'clearCommerceCCReport', 'CC_AUTH', 'CC Clear Commerce authorize reporting facility'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'CC_AUTH_CLEARCOM_REP' AND custom_method_name = 'clearCommerceCCReport' AND custom_method_type_id = 'CC_AUTH' AND description = 'CC Clear Commerce authorize reporting facility');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'CC_AUTH_CYBERSOURCE', 'cyberSourceCCAuth', 'CC_AUTH', 'CC CyberSource authorize'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'CC_AUTH_CYBERSOURCE' AND custom_method_name = 'cyberSourceCCAuth' AND custom_method_type_id = 'CC_AUTH' AND description = 'CC CyberSource authorize');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'CC_AUTH_PAYFLOW', 'payflowCCProcessor', 'CC_AUTH', 'CC Payflow Pro authorize'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'CC_AUTH_PAYFLOW' AND custom_method_name = 'payflowCCProcessor' AND custom_method_type_id = 'CC_AUTH' AND description = 'CC Payflow Pro authorize');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'CC_AUTH_PCCHARGE', 'pcChargeCCAuth', 'CC_AUTH', 'CC PCCharge authorize'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'CC_AUTH_PCCHARGE' AND custom_method_name = 'pcChargeCCAuth' AND custom_method_type_id = 'CC_AUTH' AND description = 'CC PCCharge authorize');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'CC_AUTH_RITA', 'ritaCCAuth', 'CC_AUTH', 'CC RiTA authorize'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'CC_AUTH_RITA' AND custom_method_name = 'ritaCCAuth' AND custom_method_type_id = 'CC_AUTH' AND description = 'CC RiTA authorize');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'CC_AUTH_RITA_REMOTE', 'ritaCCAuthRemote', 'CC_AUTH', 'CC RiTA remote authorize'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'CC_AUTH_RITA_REMOTE' AND custom_method_name = 'ritaCCAuthRemote' AND custom_method_type_id = 'CC_AUTH' AND description = 'CC RiTA remote authorize');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'CC_AUTH_ALWAYSAPPROV', 'alwaysApproveCCProcessor', 'CC_AUTH', 'CC Always authorize'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'CC_AUTH_ALWAYSAPPROV' AND custom_method_name = 'alwaysApproveCCProcessor' AND custom_method_type_id = 'CC_AUTH' AND description = 'CC Always authorize');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'CC_AUTH_ALWAYSDECLIN', 'alwaysDeclineCCProcessor', 'CC_AUTH', 'CC Always decline'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'CC_AUTH_ALWAYSDECLIN' AND custom_method_name = 'alwaysDeclineCCProcessor' AND custom_method_type_id = 'CC_AUTH' AND description = 'CC Always decline');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'CC_AUTH_ALWAYSNSF', 'alwaysNsfCCProcessor', 'CC_AUTH', 'CC Always decline for not sufficient funds'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'CC_AUTH_ALWAYSNSF' AND custom_method_name = 'alwaysNsfCCProcessor' AND custom_method_type_id = 'CC_AUTH' AND description = 'CC Always decline for not sufficient funds');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'CC_AUTH_ALWAYSBAD', 'alwaysBadExpireCCProcessor', 'CC_AUTH', 'CC Always decline for fail/bad expire date'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'CC_AUTH_ALWAYSBAD' AND custom_method_name = 'alwaysBadExpireCCProcessor' AND custom_method_type_id = 'CC_AUTH' AND description = 'CC Always decline for fail/bad expire date');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'CC_AUTH_ALWAYSEVEN', 'badExpireEvenCCProcessor', 'CC_AUTH', 'CC Always decline for fail/bad expire date when year is even'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'CC_AUTH_ALWAYSEVEN' AND custom_method_name = 'badExpireEvenCCProcessor' AND custom_method_type_id = 'CC_AUTH' AND description = 'CC Always decline for fail/bad expire date when year is even');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'CC_AUTH_ALWAYSBADNUM', 'alwaysBadCardNumberCCProcessor', 'CC_AUTH', 'CC Always decline for bad card number'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'CC_AUTH_ALWAYSBADNUM' AND custom_method_name = 'alwaysBadCardNumberCCProcessor' AND custom_method_type_id = 'CC_AUTH' AND description = 'CC Always decline for bad card number');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'CC_AUTH_ALWAYSFAIL', 'alwaysBadCardNumberCCProcessor', 'CC_AUTH', 'CC Always fail'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'CC_AUTH_ALWAYSFAIL' AND custom_method_name = 'alwaysBadCardNumberCCProcessor' AND custom_method_type_id = 'CC_AUTH' AND description = 'CC Always fail');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'CC_AUTH_CAPTURE_ALWA', 'alwaysApproveWithCaptureCCProcessor', 'CC_AUTH', 'CC Always authorize and capture'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'CC_AUTH_CAPTURE_ALWA' AND custom_method_name = 'alwaysApproveWithCaptureCCProcessor' AND custom_method_type_id = 'CC_AUTH' AND description = 'CC Always authorize and capture');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'CC_AUTH_ORBITAL', 'orbitalCCAuth', 'CC_AUTH', 'CC Orbital authorize'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'CC_AUTH_ORBITAL' AND custom_method_name = 'orbitalCCAuth' AND custom_method_type_id = 'CC_AUTH' AND description = 'CC Orbital authorize');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'CC_AUTH_CAPTR_ORBTL', 'orbitalCCAuthCapture', 'CC_AUTH', 'CC Orbital authorize and capture'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'CC_AUTH_CAPTR_ORBTL' AND custom_method_name = 'orbitalCCAuthCapture' AND custom_method_type_id = 'CC_AUTH' AND description = 'CC Orbital authorize and capture');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'CC_CAPTURE_TEST', 'testCCCapture', 'CC_CAPTURE', 'CC Test capture'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'CC_CAPTURE_TEST' AND custom_method_name = 'testCCCapture' AND custom_method_type_id = 'CC_CAPTURE' AND description = 'CC Test capture');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'CC_CAPTURE_REAUTH', 'testCCCaptureWithReAuth', 'CC_CAPTURE', 'CC Test reauth capture'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'CC_CAPTURE_REAUTH' AND custom_method_name = 'testCCCaptureWithReAuth' AND custom_method_type_id = 'CC_CAPTURE' AND description = 'CC Test reauth capture');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'CC_CAPTURE_ALWAYSDEC', 'testCCProcessorCaptureAlwaysDecline', 'CC_CAPTURE', 'CC Always decline capture'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'CC_CAPTURE_ALWAYSDEC' AND custom_method_name = 'testCCProcessorCaptureAlwaysDecline' AND custom_method_type_id = 'CC_CAPTURE' AND description = 'CC Always decline capture');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'CC_CAPTURE_AIM', 'aimCCCapture', 'CC_CAPTURE', 'CC Authorize dot net capture'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'CC_CAPTURE_AIM' AND custom_method_name = 'aimCCCapture' AND custom_method_type_id = 'CC_CAPTURE' AND description = 'CC Authorize dot net capture');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'CC_CAPTURE_CLEARCOMM', 'clearCommerceCCCapture', 'CC_CAPTURE', 'CC Clear Commerce capture'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'CC_CAPTURE_CLEARCOMM' AND custom_method_name = 'clearCommerceCCCapture' AND custom_method_type_id = 'CC_CAPTURE' AND description = 'CC Clear Commerce capture');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'CC_CAPTURE_CYBERSOUR', 'cyberSourceCCCapture', 'CC_CAPTURE', 'CC CyberSource capture'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'CC_CAPTURE_CYBERSOUR' AND custom_method_name = 'cyberSourceCCCapture' AND custom_method_type_id = 'CC_CAPTURE' AND description = 'CC CyberSource capture');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'CC_CAPTURE_PAYFLOW', 'payflowCCCapture', 'CC_CAPTURE', 'CC Payflow Pro capture'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'CC_CAPTURE_PAYFLOW' AND custom_method_name = 'payflowCCCapture' AND custom_method_type_id = 'CC_CAPTURE' AND description = 'CC Payflow Pro capture');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'CC_CAPTURE_PCCHARGE', 'pcChargeCCCapture', 'CC_CAPTURE', 'CC PCCharge capture'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'CC_CAPTURE_PCCHARGE' AND custom_method_name = 'pcChargeCCCapture' AND custom_method_type_id = 'CC_CAPTURE' AND description = 'CC PCCharge capture');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'CC_CAPTURE_RITA', 'ritaCCCapture', 'CC_CAPTURE', 'CC RiTA capture'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'CC_CAPTURE_RITA' AND custom_method_name = 'ritaCCCapture' AND custom_method_type_id = 'CC_CAPTURE' AND description = 'CC RiTA capture');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'CC_CAPTURE_RITA_REMO', 'ritaCCCaptureRemote', 'CC_CAPTURE', 'CC RiTA remote capture'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'CC_CAPTURE_RITA_REMO' AND custom_method_name = 'ritaCCCaptureRemote' AND custom_method_type_id = 'CC_CAPTURE' AND description = 'CC RiTA remote capture');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'CC_CAPTURE_ORBITAL', 'orbitalCCCapture', 'CC_CAPTURE', 'CC Orbital capture'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'CC_CAPTURE_ORBITAL' AND custom_method_name = 'orbitalCCCapture' AND custom_method_type_id = 'CC_CAPTURE' AND description = 'CC Orbital capture');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'CC_REFUND_TEST', 'testCCRefund', 'CC_REFUND', 'CC Test refund'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'CC_REFUND_TEST' AND custom_method_name = 'testCCRefund' AND custom_method_type_id = 'CC_REFUND' AND description = 'CC Test refund');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'CC_REFUND_TEST_FAIL', 'testCCRefundFailure', 'CC_REFUND', 'CC Test refund failure'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'CC_REFUND_TEST_FAIL' AND custom_method_name = 'testCCRefundFailure' AND custom_method_type_id = 'CC_REFUND' AND description = 'CC Test refund failure');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'CC_REFUND_AIM', 'aimCCRefund', 'CC_REFUND', 'CC Authorize dot net refund'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'CC_REFUND_AIM' AND custom_method_name = 'aimCCRefund' AND custom_method_type_id = 'CC_REFUND' AND description = 'CC Authorize dot net refund');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'CC_REFUND_CLEARCOMME', 'clearCommerceCCRefund', 'CC_REFUND', 'CC Clear Commerce refund'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'CC_REFUND_CLEARCOMME' AND custom_method_name = 'clearCommerceCCRefund' AND custom_method_type_id = 'CC_REFUND' AND description = 'CC Clear Commerce refund');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'CC_REFUND_CYBERSOURC', 'cyberSourceCCRefund', 'CC_REFUND', 'CC CyberSource refund'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'CC_REFUND_CYBERSOURC' AND custom_method_name = 'cyberSourceCCRefund' AND custom_method_type_id = 'CC_REFUND' AND description = 'CC CyberSource refund');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'CC_REFUND_PAYFLOW', 'payflowCCRefund', 'CC_REFUND', 'CC Payflow Pro refund'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'CC_REFUND_PAYFLOW' AND custom_method_name = 'payflowCCRefund' AND custom_method_type_id = 'CC_REFUND' AND description = 'CC Payflow Pro refund');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'CC_REFUND_PCCHARGE', 'pcChargeCCRefund', 'CC_REFUND', 'CC PCCharge refund'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'CC_REFUND_PCCHARGE' AND custom_method_name = 'pcChargeCCRefund' AND custom_method_type_id = 'CC_REFUND' AND description = 'CC PCCharge refund');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'CC_REFUND_RITA', 'ritaCCRefund', 'CC_REFUND', 'CC RiTA refund'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'CC_REFUND_RITA' AND custom_method_name = 'ritaCCRefund' AND custom_method_type_id = 'CC_REFUND' AND description = 'CC RiTA refund');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'CC_REFUND_RITA_REMOT', 'ritaCCRefundRemote', 'CC_REFUND', 'CC RiTA remote refund'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'CC_REFUND_RITA_REMOT' AND custom_method_name = 'ritaCCRefundRemote' AND custom_method_type_id = 'CC_REFUND' AND description = 'CC RiTA remote refund');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'CC_REFUND_ORBITAL', 'orbitalCCRefund', 'CC_REFUND', 'CC Orbital refund'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'CC_REFUND_ORBITAL' AND custom_method_name = 'orbitalCCRefund' AND custom_method_type_id = 'CC_REFUND' AND description = 'CC Orbital refund');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'CC_RELEASE_TEST', 'testCCRelease', 'CC_RELEASE', 'CC Test release'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'CC_RELEASE_TEST' AND custom_method_name = 'testCCRelease' AND custom_method_type_id = 'CC_RELEASE' AND description = 'CC Test release');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'CC_RELEASE_AIM', 'aimCCRelease', 'CC_RELEASE', 'CC Authorize dot net release'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'CC_RELEASE_AIM' AND custom_method_name = 'aimCCRelease' AND custom_method_type_id = 'CC_RELEASE' AND description = 'CC Authorize dot net release');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'CC_RELEASE_CLEARCOMM', 'clearCommerceCCRelease', 'CC_RELEASE', 'CC Clear Commerce release'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'CC_RELEASE_CLEARCOMM' AND custom_method_name = 'clearCommerceCCRelease' AND custom_method_type_id = 'CC_RELEASE' AND description = 'CC Clear Commerce release');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'CC_RELEASE_CYBERSOUR', 'cyberSourceCCRelease', 'CC_RELEASE', 'CC CyberSource release'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'CC_RELEASE_CYBERSOUR' AND custom_method_name = 'cyberSourceCCRelease' AND custom_method_type_id = 'CC_RELEASE' AND description = 'CC CyberSource release');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'CC_RELEASE_PAYFLOW', 'payflowCCVoid', 'CC_RELEASE', 'CC Payflow Pro release'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'CC_RELEASE_PAYFLOW' AND custom_method_name = 'payflowCCVoid' AND custom_method_type_id = 'CC_RELEASE' AND description = 'CC Payflow Pro release');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'CC_RELEASE_PCCHARGE', 'pcChargeCCRelease', 'CC_RELEASE', 'CC PCCharge release'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'CC_RELEASE_PCCHARGE' AND custom_method_name = 'pcChargeCCRelease' AND custom_method_type_id = 'CC_RELEASE' AND description = 'CC PCCharge release');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'CC_RELEASE_RITA', 'ritaCCRelease', 'CC_RELEASE', 'CC RiTA release'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'CC_RELEASE_RITA' AND custom_method_name = 'ritaCCRelease' AND custom_method_type_id = 'CC_RELEASE' AND description = 'CC RiTA release');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'CC_RELEASE_RITA_REMO', 'ritaCCReleaseRemote', 'CC_RELEASE', 'CC RiTA remote release'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'CC_RELEASE_RITA_REMO' AND custom_method_name = 'ritaCCReleaseRemote' AND custom_method_type_id = 'CC_RELEASE' AND description = 'CC RiTA remote release');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'CC_RELEASE_ORBITAL', 'orbitalCCRelease', 'CC_RELEASE', 'CC Orbital release'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'CC_RELEASE_ORBITAL' AND custom_method_name = 'orbitalCCRelease' AND custom_method_type_id = 'CC_RELEASE' AND description = 'CC Orbital release');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'CC_CREDIT_AIM', 'aimCCCredit', 'CC_CREDIT', 'CC Authorize dot net credit'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'CC_CREDIT_AIM' AND custom_method_name = 'aimCCCredit' AND custom_method_type_id = 'CC_CREDIT' AND description = 'CC Authorize dot net credit');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'CC_CREDIT_CLEARCOMME', 'clearCommerceCCCredit', 'CC_CREDIT', 'CC Clear Commerce credit'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'CC_CREDIT_CLEARCOMME' AND custom_method_name = 'clearCommerceCCCredit' AND custom_method_type_id = 'CC_CREDIT' AND description = 'CC Clear Commerce credit');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'CC_CREDIT_CYBERSOURC', 'cyberSourceCCCredit', 'CC_CREDIT', 'CC CyberSource credit'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'CC_CREDIT_CYBERSOURC' AND custom_method_name = 'cyberSourceCCCredit' AND custom_method_type_id = 'CC_CREDIT' AND description = 'CC CyberSource credit');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'CC_CREDIT_RITA', 'ritaCCCreditRefund', 'CC_CREDIT', 'CC RiTA credit'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'CC_CREDIT_RITA' AND custom_method_name = 'ritaCCCreditRefund' AND custom_method_type_id = 'CC_CREDIT' AND description = 'CC RiTA credit');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'EFT_AUTH_TEST', 'testEFTProcessor', 'EFT_AUTH', 'EFT test authorize'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'EFT_AUTH_TEST' AND custom_method_name = 'testEFTProcessor' AND custom_method_type_id = 'EFT_AUTH' AND description = 'EFT test authorize');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'EFT_AUTH_ALWAYSAPPRO', 'alwaysApproveEFTProcessor', 'EFT_AUTH', 'EFT always authorize'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'EFT_AUTH_ALWAYSAPPRO' AND custom_method_name = 'alwaysApproveEFTProcessor' AND custom_method_type_id = 'EFT_AUTH' AND description = 'EFT always authorize');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'EFT_AUTH_ALWAYSDECLI', 'alwaysDeclineEFTProcessor', 'EFT_AUTH', 'EFT always decline'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'EFT_AUTH_ALWAYSDECLI' AND custom_method_name = 'alwaysDeclineEFTProcessor' AND custom_method_type_id = 'EFT_AUTH' AND description = 'EFT always decline');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'EFT_RELEASE_TEST', 'testEFTRelease', 'EFT_RELEASE', 'EFT test release'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'EFT_RELEASE_TEST' AND custom_method_name = 'testEFTRelease' AND custom_method_type_id = 'EFT_RELEASE' AND description = 'EFT test release');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'FIN_AUTH_OFBIZ', 'ofbFaAuthorize', 'FIN_AUTH', 'FIN account authorize'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'FIN_AUTH_OFBIZ' AND custom_method_name = 'ofbFaAuthorize' AND custom_method_type_id = 'FIN_AUTH' AND description = 'FIN account authorize');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'FIN_CAPTURE_OFBIZ', 'ofbFaCapture', 'FIN_CAPTURE', 'FIN account capture'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'FIN_CAPTURE_OFBIZ' AND custom_method_name = 'ofbFaCapture' AND custom_method_type_id = 'FIN_CAPTURE' AND description = 'FIN account capture');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'FIN_REFUND_OFBIZ', 'ofbFaRefund', 'FIN_REFUND', 'FIN account refund'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'FIN_REFUND_OFBIZ' AND custom_method_name = 'ofbFaRefund' AND custom_method_type_id = 'FIN_REFUND' AND description = 'FIN account refund');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'FIN_RELEASE_OFBIZ', 'ofbFaRelease', 'FIN_RELEASE', 'FIN account release'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'FIN_RELEASE_OFBIZ' AND custom_method_name = 'ofbFaRelease' AND custom_method_type_id = 'FIN_RELEASE' AND description = 'FIN account release');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'FIN_PURCH_OFBIZ', 'createPartyFinAccountFromPurchase', 'FIN_PURCHASE', 'FIN account purchase'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'FIN_PURCH_OFBIZ' AND custom_method_name = 'createPartyFinAccountFromPurchase' AND custom_method_type_id = 'FIN_PURCHASE' AND description = 'FIN account purchase');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'GIFT_AUTH_OFBIZ', 'ofbGcAuthorize', 'GIFT_AUTH', 'GIFT card authorize'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'GIFT_AUTH_OFBIZ' AND custom_method_name = 'ofbGcAuthorize' AND custom_method_type_id = 'GIFT_AUTH' AND description = 'GIFT card authorize');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'GIFT_AUTH_ALWAYSAPPR', 'alwaysApproveGCProcessor', 'GIFT_AUTH', 'GIFT card always authorize'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'GIFT_AUTH_ALWAYSAPPR' AND custom_method_name = 'alwaysApproveGCProcessor' AND custom_method_type_id = 'GIFT_AUTH' AND description = 'GIFT card always authorize');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'GIFT_AUTH_ALWAYSDECL', 'alwaysDeclineGCProcessor', 'GIFT_AUTH', 'GIFT card always decline'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'GIFT_AUTH_ALWAYSDECL' AND custom_method_name = 'alwaysDeclineGCProcessor' AND custom_method_type_id = 'GIFT_AUTH' AND description = 'GIFT card always decline');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'GIFT_AUTH_VALUELINK', 'valueLinkProcessor', 'GIFT_AUTH', 'GIFT card ValueLink authorize'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'GIFT_AUTH_VALUELINK' AND custom_method_name = 'valueLinkProcessor' AND custom_method_type_id = 'GIFT_AUTH' AND description = 'GIFT card ValueLink authorize');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'GIFT_CAPTURE_OFBIZ', 'ofbGcProcessor', 'GIFT_CAPTURE', 'GIFT card capture'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'GIFT_CAPTURE_OFBIZ' AND custom_method_name = 'ofbGcProcessor' AND custom_method_type_id = 'GIFT_CAPTURE' AND description = 'GIFT card capture');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'GIFT_REFUND_OFBIZ', 'ofbGcRefund', 'GIFT_REFUND', 'GIFT card refund'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'GIFT_REFUND_OFBIZ' AND custom_method_name = 'ofbGcRefund' AND custom_method_type_id = 'GIFT_REFUND' AND description = 'GIFT card refund');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'GIFT_REFUND_VALUELI', 'valueLinkRefund', 'GIFT_REFUND', 'GIFT card ValueLink refund'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'GIFT_REFUND_VALUELI' AND custom_method_name = 'valueLinkRefund' AND custom_method_type_id = 'GIFT_REFUND' AND description = 'GIFT card ValueLink refund');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'GIFT_RELEASE_OFBIZ', 'ofbGcRelease', 'GIFT_RELEASE', 'GIFT card release'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'GIFT_RELEASE_OFBIZ' AND custom_method_name = 'ofbGcRelease' AND custom_method_type_id = 'GIFT_RELEASE' AND description = 'GIFT card release');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'GIFT_RELEASE_TEST', 'testGCRelease', 'GIFT_RELEASE', 'GIFT card test release'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'GIFT_RELEASE_TEST' AND custom_method_name = 'testGCRelease' AND custom_method_type_id = 'GIFT_RELEASE' AND description = 'GIFT card test release');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'GIFT_RELEASE_VALUEL', 'valueLinkRelease', 'GIFT_RELEASE', 'GIFT card ValueLink release'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'GIFT_RELEASE_VALUEL' AND custom_method_name = 'valueLinkRelease' AND custom_method_type_id = 'GIFT_RELEASE' AND description = 'GIFT card ValueLink release');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'GIFT_PURCH_OFBIZ', 'ofbGcPurchase', 'GIFT_PURCHASE', 'GIFT card Purchase Fulfillment Service'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'GIFT_PURCH_OFBIZ' AND custom_method_name = 'ofbGcPurchase' AND custom_method_type_id = 'GIFT_PURCHASE' AND description = 'GIFT card Purchase Fulfillment Service');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'PAYPAL_AUTH_PFP', 'payflowPayPalProcessor', 'PAYPAL_AUTH', 'Payflow PayPal payment authorize'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'PAYPAL_AUTH_PFP' AND custom_method_name = 'payflowPayPalProcessor' AND custom_method_type_id = 'PAYPAL_AUTH' AND description = 'Payflow PayPal payment authorize');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'PAYPAL_AUTH', 'payPalProcessor', 'PAYPAL_AUTH', 'PayPal payment authorize'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'PAYPAL_AUTH' AND custom_method_name = 'payPalProcessor' AND custom_method_type_id = 'PAYPAL_AUTH' AND description = 'PayPal payment authorize');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'PAYPAL_CAPTURE_PFP', 'payflowPayPalCapture', 'PAYPAL_CAPTURE', 'Payflow PayPal payment capture'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'PAYPAL_CAPTURE_PFP' AND custom_method_name = 'payflowPayPalCapture' AND custom_method_type_id = 'PAYPAL_CAPTURE' AND description = 'Payflow PayPal payment capture');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'PAYPAL_CAPTURE', 'payPalCapture', 'PAYPAL_CAPTURE', 'PayPal payment capture'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'PAYPAL_CAPTURE' AND custom_method_name = 'payPalCapture' AND custom_method_type_id = 'PAYPAL_CAPTURE' AND description = 'PayPal payment capture');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'PAYPAL_REFUND_PFP', 'payflowPayPalRefund', 'PAYPAL_REFUND', 'Payflow PayPal payment refund'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'PAYPAL_REFUND_PFP' AND custom_method_name = 'payflowPayPalRefund' AND custom_method_type_id = 'PAYPAL_REFUND' AND description = 'Payflow PayPal payment refund');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'PAYPAL_REFUND', 'payPalRefund', 'PAYPAL_REFUND', 'PayPal payment refund'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'PAYPAL_REFUND' AND custom_method_name = 'payPalRefund' AND custom_method_type_id = 'PAYPAL_REFUND' AND description = 'PayPal payment refund');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'PAYPAL_RELEASE_PFP', 'payflowPayPalVoid', 'PAYPAL_RELEASE', 'Payflow PayPal Order release'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'PAYPAL_RELEASE_PFP' AND custom_method_name = 'payflowPayPalVoid' AND custom_method_type_id = 'PAYPAL_RELEASE' AND description = 'Payflow PayPal Order release');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'PAYPAL_RELEASE', 'payPalVoid', 'PAYPAL_RELEASE', 'PayPal Order Release'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'PAYPAL_RELEASE' AND custom_method_name = 'payPalVoid' AND custom_method_type_id = 'PAYPAL_RELEASE' AND description = 'PayPal Order Release');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'CC_CHARGE_EWAY', 'ewayCharge', 'CC_AUTH', 'eWay CC Charge'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'CC_CHARGE_EWAY' AND custom_method_name = 'ewayCharge' AND custom_method_type_id = 'CC_AUTH' AND description = 'eWay CC Charge');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'CC_REFUND_EWAY', 'ewayRefund', 'CC_REFUND', 'eWay CC Refund'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'CC_REFUND_EWAY' AND custom_method_name = 'ewayRefund' AND custom_method_type_id = 'CC_REFUND' AND description = 'eWay CC Refund');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'CC_RELEASE_EWAY', 'ewayRelease', 'CC_RELEASE', 'eWay CC Release'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'CC_RELEASE_EWAY' AND custom_method_name = 'ewayRelease' AND custom_method_type_id = 'CC_RELEASE' AND description = 'eWay CC Release');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'SECURE_AUTH_OFBIZ', 'ofbScAuthorize', 'CC_AUTH', 'SecurePay payment authorize'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'SECURE_AUTH_OFBIZ' AND custom_method_name = 'ofbScAuthorize' AND custom_method_type_id = 'CC_AUTH' AND description = 'SecurePay payment authorize');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'SECURE_CAPTURE_OFBIZ', 'ofbScCapture', 'CC_CAPTURE', 'SecurePay payment capture'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'SECURE_CAPTURE_OFBIZ' AND custom_method_name = 'ofbScCapture' AND custom_method_type_id = 'CC_CAPTURE' AND description = 'SecurePay payment capture');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'SECURE_REFUND_OFBIZ', 'ofbScRefund', 'CC_REFUND', 'SecurePay payment refund'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'SECURE_REFUND_OFBIZ' AND custom_method_name = 'ofbScRefund' AND custom_method_type_id = 'CC_REFUND' AND description = 'SecurePay payment refund');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'SECURE_RELEASE_OFBIZ', 'ofbScRelease', 'CC_RELEASE', 'SecurePay payment release'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'SECURE_RELEASE_OFBIZ' AND custom_method_name = 'ofbScRelease' AND custom_method_type_id = 'CC_RELEASE' AND description = 'SecurePay payment release');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'SECURE_CREDIT_OFBIZ', 'ofbScCCCredit', 'CC_CREDIT', 'SecurePay Credit Card'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'SECURE_CREDIT_OFBIZ' AND custom_method_name = 'ofbScCCCredit' AND custom_method_type_id = 'CC_CREDIT' AND description = 'SecurePay Credit Card');

INSERT INTO custom_screen_type (custom_screen_type_id, description)
SELECT 'CST_INVOICE_TPL', 'Invoice types template'
WHERE NOT EXISTS (SELECT 1 FROM custom_screen_type WHERE custom_screen_type_id = 'CST_INVOICE_TPL' AND description = 'Invoice types template');

INSERT INTO custom_screen_type (custom_screen_type_id, description)
SELECT 'CST_ORDER_TPL', 'Order types template'
WHERE NOT EXISTS (SELECT 1 FROM custom_screen_type WHERE custom_screen_type_id = 'CST_ORDER_TPL' AND description = 'Order types template');

INSERT INTO custom_screen_type (custom_screen_type_id, description)
SELECT 'CST_QUOTE_TPL', 'Quote types template'
WHERE NOT EXISTS (SELECT 1 FROM custom_screen_type WHERE custom_screen_type_id = 'CST_QUOTE_TPL' AND description = 'Quote types template');

INSERT INTO enumeration_type (description, enum_type_id, has_table)
SELECT 'Credit Card Type', 'CREDIT_CARD_TYPE', 0
WHERE NOT EXISTS (SELECT 1 FROM enumeration_type WHERE description = 'Credit Card Type' AND enum_type_id = 'CREDIT_CARD_TYPE' AND has_table = 0);

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Visa', 'Visa', 'CCT_VISA', 'CREDIT_CARD_TYPE', '01'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Visa' AND enum_code = 'Visa' AND enum_id = 'CCT_VISA' AND enum_type_id = 'CREDIT_CARD_TYPE' AND sequence_id = '01');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Master Card', 'MasterCard', 'CCT_MASTERCARD', 'CREDIT_CARD_TYPE', '02'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Master Card' AND enum_code = 'MasterCard' AND enum_id = 'CCT_MASTERCARD' AND enum_type_id = 'CREDIT_CARD_TYPE' AND sequence_id = '02');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'American Express', 'AmericanExpress', 'CCT_AMERICANEXPRESS', 'CREDIT_CARD_TYPE', '03'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'American Express' AND enum_code = 'AmericanExpress' AND enum_id = 'CCT_AMERICANEXPRESS' AND enum_type_id = 'CREDIT_CARD_TYPE' AND sequence_id = '03');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Diners Club', 'DinersClub', 'CCT_DINERSCLUB', 'CREDIT_CARD_TYPE', '04'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Diners Club' AND enum_code = 'DinersClub' AND enum_id = 'CCT_DINERSCLUB' AND enum_type_id = 'CREDIT_CARD_TYPE' AND sequence_id = '04');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Discover', 'Discover', 'CCT_DISCOVER', 'CREDIT_CARD_TYPE', '05'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Discover' AND enum_code = 'Discover' AND enum_id = 'CCT_DISCOVER' AND enum_type_id = 'CREDIT_CARD_TYPE' AND sequence_id = '05');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'EnRoute', 'EnRoute', 'CCT_ENROUTE', 'CREDIT_CARD_TYPE', '06'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'EnRoute' AND enum_code = 'EnRoute' AND enum_id = 'CCT_ENROUTE' AND enum_type_id = 'CREDIT_CARD_TYPE' AND sequence_id = '06');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Carte Blanche', 'CarteBlanche', 'CCT_CARTEBLANCHE', 'CREDIT_CARD_TYPE', '07'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Carte Blanche' AND enum_code = 'CarteBlanche' AND enum_id = 'CCT_CARTEBLANCHE' AND enum_type_id = 'CREDIT_CARD_TYPE' AND sequence_id = '07');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'JCB', 'JCB', 'CCT_JCB', 'CREDIT_CARD_TYPE', '08'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'JCB' AND enum_code = 'JCB' AND enum_id = 'CCT_JCB' AND enum_type_id = 'CREDIT_CARD_TYPE' AND sequence_id = '08');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Solo', 'Solo', 'CCT_SOLO', 'CREDIT_CARD_TYPE', '09'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Solo' AND enum_code = 'Solo' AND enum_id = 'CCT_SOLO' AND enum_type_id = 'CREDIT_CARD_TYPE' AND sequence_id = '09');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Switch', 'Switch', 'CCT_SWITCH', 'CREDIT_CARD_TYPE', '10'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Switch' AND enum_code = 'Switch' AND enum_id = 'CCT_SWITCH' AND enum_type_id = 'CREDIT_CARD_TYPE' AND sequence_id = '10');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Visa Electron', 'VisaElectron', 'CCT_VISAELECTRON', 'CREDIT_CARD_TYPE', '11'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Visa Electron' AND enum_code = 'VisaElectron' AND enum_id = 'CCT_VISAELECTRON' AND enum_type_id = 'CREDIT_CARD_TYPE' AND sequence_id = '11');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Universal Air Travel Plan', 'UATP', 'CCT_UATP', 'CREDIT_CARD_TYPE', '12'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Universal Air Travel Plan' AND enum_code = 'UATP' AND enum_id = 'CCT_UATP' AND enum_type_id = 'CREDIT_CARD_TYPE' AND sequence_id = '12');

INSERT INTO status_type (description, has_table, status_type_id)
SELECT 'Budget', 0, 'BUDGET_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_type WHERE description = 'Budget' AND has_table = 0 AND status_type_id = 'BUDGET_STATUS');

INSERT INTO status_type (description, has_table, status_type_id)
SELECT 'Party Asset', 0, 'PARTY_ASSET_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_type WHERE description = 'Party Asset' AND has_table = 0 AND status_type_id = 'PARTY_ASSET_STATUS');

INSERT INTO status_type (description, has_table, status_type_id)
SELECT 'Invoice Status', 0, 'INVOICE_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_type WHERE description = 'Invoice Status' AND has_table = 0 AND status_type_id = 'INVOICE_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'In-Process', '01', 'IN_PROCESS', 'INVOICE_IN_PROCESS', 'INVOICE_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'In-Process' AND sequence_id = '01' AND status_code = 'IN_PROCESS' AND status_id = 'INVOICE_IN_PROCESS' AND status_type_id = 'INVOICE_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Approved', '02', 'APPROVED', 'INVOICE_APPROVED', 'INVOICE_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Approved' AND sequence_id = '02' AND status_code = 'APPROVED' AND status_id = 'INVOICE_APPROVED' AND status_type_id = 'INVOICE_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Sent', '10', 'SENT', 'INVOICE_SENT', 'INVOICE_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Sent' AND sequence_id = '10' AND status_code = 'SENT' AND status_id = 'INVOICE_SENT' AND status_type_id = 'INVOICE_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Received', '11', 'RECEIVED', 'INVOICE_RECEIVED', 'INVOICE_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Received' AND sequence_id = '11' AND status_code = 'RECEIVED' AND status_id = 'INVOICE_RECEIVED' AND status_type_id = 'INVOICE_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Ready for Posting', '20', 'READY', 'INVOICE_READY', 'INVOICE_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Ready for Posting' AND sequence_id = '20' AND status_code = 'READY' AND status_id = 'INVOICE_READY' AND status_type_id = 'INVOICE_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Paid', '30', 'PAID', 'INVOICE_PAID', 'INVOICE_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Paid' AND sequence_id = '30' AND status_code = 'PAID' AND status_id = 'INVOICE_PAID' AND status_type_id = 'INVOICE_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Write Off', '31', 'WRITE OFF', 'INVOICE_WRITEOFF', 'INVOICE_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Write Off' AND sequence_id = '31' AND status_code = 'WRITE OFF' AND status_id = 'INVOICE_WRITEOFF' AND status_type_id = 'INVOICE_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Cancelled', '99', 'CANCELLED', 'INVOICE_CANCELLED', 'INVOICE_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Cancelled' AND sequence_id = '99' AND status_code = 'CANCELLED' AND status_id = 'INVOICE_CANCELLED' AND status_type_id = 'INVOICE_STATUS');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'INVOICE_IN_PROCESS', 'INVOICE_READY', 'Mark Ready'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'INVOICE_IN_PROCESS' AND status_id_to = 'INVOICE_READY' AND transition_name = 'Mark Ready');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'INVOICE_IN_PROCESS', 'INVOICE_CANCELLED', 'Cancel'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'INVOICE_IN_PROCESS' AND status_id_to = 'INVOICE_CANCELLED' AND transition_name = 'Cancel');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'INVOICE_IN_PROCESS', 'INVOICE_SENT', 'Send'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'INVOICE_IN_PROCESS' AND status_id_to = 'INVOICE_SENT' AND transition_name = 'Send');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'INVOICE_IN_PROCESS', 'INVOICE_RECEIVED', 'Receive'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'INVOICE_IN_PROCESS' AND status_id_to = 'INVOICE_RECEIVED' AND transition_name = 'Receive');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'INVOICE_SENT', 'INVOICE_APPROVED', 'Mark Approved'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'INVOICE_SENT' AND status_id_to = 'INVOICE_APPROVED' AND transition_name = 'Mark Approved');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'INVOICE_SENT', 'INVOICE_READY', 'Mark Ready'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'INVOICE_SENT' AND status_id_to = 'INVOICE_READY' AND transition_name = 'Mark Ready');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'INVOICE_SENT', 'INVOICE_RECEIVED', 'Receive'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'INVOICE_SENT' AND status_id_to = 'INVOICE_RECEIVED' AND transition_name = 'Receive');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'INVOICE_RECEIVED', 'INVOICE_READY', 'Mark Receive'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'INVOICE_RECEIVED' AND status_id_to = 'INVOICE_READY' AND transition_name = 'Mark Receive');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'INVOICE_SENT', 'INVOICE_CANCELLED', 'Cancel'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'INVOICE_SENT' AND status_id_to = 'INVOICE_CANCELLED' AND transition_name = 'Cancel');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'INVOICE_RECEIVED', 'INVOICE_CANCELLED', 'Cancel'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'INVOICE_RECEIVED' AND status_id_to = 'INVOICE_CANCELLED' AND transition_name = 'Cancel');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'INVOICE_SENT', 'INVOICE_IN_PROCESS', 'Enable sales invoice update'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'INVOICE_SENT' AND status_id_to = 'INVOICE_IN_PROCESS' AND transition_name = 'Enable sales invoice update');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'INVOICE_RECEIVED', 'INVOICE_IN_PROCESS', 'Enable purch.invoice update'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'INVOICE_RECEIVED' AND status_id_to = 'INVOICE_IN_PROCESS' AND transition_name = 'Enable purch.invoice update');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'INVOICE_IN_PROCESS', 'INVOICE_APPROVED', 'Approve'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'INVOICE_IN_PROCESS' AND status_id_to = 'INVOICE_APPROVED' AND transition_name = 'Approve');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'INVOICE_APPROVED', 'INVOICE_SENT', 'Send'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'INVOICE_APPROVED' AND status_id_to = 'INVOICE_SENT' AND transition_name = 'Send');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'INVOICE_IN_PROCESS', 'INVOICE_RECEIVED', 'Receive'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'INVOICE_IN_PROCESS' AND status_id_to = 'INVOICE_RECEIVED' AND transition_name = 'Receive');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'INVOICE_RECEIVED', 'INVOICE_APPROVED', 'Approve'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'INVOICE_RECEIVED' AND status_id_to = 'INVOICE_APPROVED' AND transition_name = 'Approve');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'INVOICE_APPROVED', 'INVOICE_READY', 'Mark Ready'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'INVOICE_APPROVED' AND status_id_to = 'INVOICE_READY' AND transition_name = 'Mark Ready');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'INVOICE_APPROVED', 'INVOICE_CANCELLED', 'Cancel'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'INVOICE_APPROVED' AND status_id_to = 'INVOICE_CANCELLED' AND transition_name = 'Cancel');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'INVOICE_READY', 'INVOICE_PAID', 'Pay'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'INVOICE_READY' AND status_id_to = 'INVOICE_PAID' AND transition_name = 'Pay');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'INVOICE_READY', 'INVOICE_WRITEOFF', 'Write Off'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'INVOICE_READY' AND status_id_to = 'INVOICE_WRITEOFF' AND transition_name = 'Write Off');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'INVOICE_PAID', 'INVOICE_READY', 'Unpay'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'INVOICE_PAID' AND status_id_to = 'INVOICE_READY' AND transition_name = 'Unpay');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'INVOICE_READY', 'INVOICE_CANCELLED', 'Cancel'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'INVOICE_READY' AND status_id_to = 'INVOICE_CANCELLED' AND transition_name = 'Cancel');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'INVOICE_PAID', 'INVOICE_CANCELLED', 'Cancel'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'INVOICE_PAID' AND status_id_to = 'INVOICE_CANCELLED' AND transition_name = 'Cancel');

INSERT INTO status_type (description, has_table, status_type_id)
SELECT 'Payment Status', 0, 'PMNT_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_type WHERE description = 'Payment Status' AND has_table = 0 AND status_type_id = 'PMNT_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Not Paid', '01', 'NOT_PAID', 'PMNT_NOT_PAID', 'PMNT_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Not Paid' AND sequence_id = '01' AND status_code = 'NOT_PAID' AND status_id = 'PMNT_NOT_PAID' AND status_type_id = 'PMNT_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Sent', '03', 'SENT', 'PMNT_SENT', 'PMNT_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Sent' AND sequence_id = '03' AND status_code = 'SENT' AND status_id = 'PMNT_SENT' AND status_type_id = 'PMNT_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Received', '04', 'RECEIVED', 'PMNT_RECEIVED', 'PMNT_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Received' AND sequence_id = '04' AND status_code = 'RECEIVED' AND status_id = 'PMNT_RECEIVED' AND status_type_id = 'PMNT_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Confirmed', '05', 'CONFIRMED', 'PMNT_CONFIRMED', 'PMNT_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Confirmed' AND sequence_id = '05' AND status_code = 'CONFIRMED' AND status_id = 'PMNT_CONFIRMED' AND status_type_id = 'PMNT_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Cancelled', '10', 'CANCELLED', 'PMNT_CANCELLED', 'PMNT_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Cancelled' AND sequence_id = '10' AND status_code = 'CANCELLED' AND status_id = 'PMNT_CANCELLED' AND status_type_id = 'PMNT_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Voided', '11', 'VOID', 'PMNT_VOID', 'PMNT_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Voided' AND sequence_id = '11' AND status_code = 'VOID' AND status_id = 'PMNT_VOID' AND status_type_id = 'PMNT_STATUS');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'PMNT_NOT_PAID', 'PMNT_SENT', 'Payment Send'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'PMNT_NOT_PAID' AND status_id_to = 'PMNT_SENT' AND transition_name = 'Payment Send');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'PMNT_NOT_PAID', 'PMNT_RECEIVED', 'Payment Received'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'PMNT_NOT_PAID' AND status_id_to = 'PMNT_RECEIVED' AND transition_name = 'Payment Received');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'PMNT_NOT_PAID', 'PMNT_CANCELLED', 'Payment Cancelled'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'PMNT_NOT_PAID' AND status_id_to = 'PMNT_CANCELLED' AND transition_name = 'Payment Cancelled');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'PMNT_SENT', 'PMNT_CONFIRMED', 'Payment Confirmed'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'PMNT_SENT' AND status_id_to = 'PMNT_CONFIRMED' AND transition_name = 'Payment Confirmed');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'PMNT_RECEIVED', 'PMNT_CONFIRMED', 'Payment Confirmed'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'PMNT_RECEIVED' AND status_id_to = 'PMNT_CONFIRMED' AND transition_name = 'Payment Confirmed');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'PMNT_SENT', 'PMNT_VOID', 'Payment Voided'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'PMNT_SENT' AND status_id_to = 'PMNT_VOID' AND transition_name = 'Payment Voided');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'PMNT_RECEIVED', 'PMNT_VOID', 'Payment Voided'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'PMNT_RECEIVED' AND status_id_to = 'PMNT_VOID' AND transition_name = 'Payment Voided');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'PMNT_NOT_PAID', 'PMNT_VOID', 'Payment Voided'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'PMNT_NOT_PAID' AND status_id_to = 'PMNT_VOID' AND transition_name = 'Payment Voided');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'PMNT_SENT', 'PMNT_NOT_PAID', 'Payment Not Paid'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'PMNT_SENT' AND status_id_to = 'PMNT_NOT_PAID' AND transition_name = 'Payment Not Paid');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'PMNT_RECEIVED', 'PMNT_NOT_PAID', 'Payment Not Paid'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'PMNT_RECEIVED' AND status_id_to = 'PMNT_NOT_PAID' AND transition_name = 'Payment Not Paid');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'PMNT_CONFIRMED', 'PMNT_SENT', 'Payment Confirmed to Sent'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'PMNT_CONFIRMED' AND status_id_to = 'PMNT_SENT' AND transition_name = 'Payment Confirmed to Sent');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'PMNT_CONFIRMED', 'PMNT_RECEIVED', 'Payment Confirmed to Received'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'PMNT_CONFIRMED' AND status_id_to = 'PMNT_RECEIVED' AND transition_name = 'Payment Confirmed to Received');

INSERT INTO settlement_term (settlement_term_id, term_name, term_value, uom_id)
SELECT 'COD', 'Cash Due on Delivery', '0', 'TF_day'
WHERE NOT EXISTS (SELECT 1 FROM settlement_term WHERE settlement_term_id = 'COD' AND term_name = 'Cash Due on Delivery' AND term_value = '0' AND uom_id = 'TF_day');

INSERT INTO settlement_term (settlement_term_id, term_name, term_value, uom_id)
SELECT 'NET_15', 'Net Due in 15 Days', '15', 'TF_day'
WHERE NOT EXISTS (SELECT 1 FROM settlement_term WHERE settlement_term_id = 'NET_15' AND term_name = 'Net Due in 15 Days' AND term_value = '15' AND uom_id = 'TF_day');

INSERT INTO settlement_term (settlement_term_id, term_name, term_value, uom_id)
SELECT 'NET_30', 'Net Due in 30 Days', '30', 'TF_day'
WHERE NOT EXISTS (SELECT 1 FROM settlement_term WHERE settlement_term_id = 'NET_30' AND term_name = 'Net Due in 30 Days' AND term_value = '30' AND uom_id = 'TF_day');

INSERT INTO settlement_term (settlement_term_id, term_name, term_value, uom_id)
SELECT 'NET_60', 'Net Due in 60 Days', '60', 'TF_day'
WHERE NOT EXISTS (SELECT 1 FROM settlement_term WHERE settlement_term_id = 'NET_60' AND term_name = 'Net Due in 60 Days' AND term_value = '60' AND uom_id = 'TF_day');

INSERT INTO settlement_term (settlement_term_id, term_name, term_value, uom_id)
SELECT 'NET_90', 'Net Due in 90 Days', '90', 'TF_day'
WHERE NOT EXISTS (SELECT 1 FROM settlement_term WHERE settlement_term_id = 'NET_90' AND term_name = 'Net Due in 90 Days' AND term_value = '90' AND uom_id = 'TF_day');

INSERT INTO enumeration_type (description, enum_type_id, has_table)
SELECT 'Tax Forms', 'TAX_FORMS', 0
WHERE NOT EXISTS (SELECT 1 FROM enumeration_type WHERE description = 'Tax Forms' AND enum_type_id = 'TAX_FORMS' AND has_table = 0);

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Form 1120 (US IRS)', '1120', 'US_IRS_1120', 'TAX_FORMS', '01'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Form 1120 (US IRS)' AND enum_code = '1120' AND enum_id = 'US_IRS_1120' AND enum_type_id = 'TAX_FORMS' AND sequence_id = '01');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Form 1120S (US IRS)', '1120S', 'US_IRS_1120S', 'TAX_FORMS', '02'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Form 1120S (US IRS)' AND enum_code = '1120S' AND enum_id = 'US_IRS_1120S' AND enum_type_id = 'TAX_FORMS' AND sequence_id = '02');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Form 1065 (US IRS)', '1065', 'US_IRS_1065', 'TAX_FORMS', '03'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Form 1065 (US IRS)' AND enum_code = '1065' AND enum_id = 'US_IRS_1065' AND enum_type_id = 'TAX_FORMS' AND sequence_id = '03');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Form 990 (US IRS)', '990', 'US_IRS_990', 'TAX_FORMS', '04'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Form 990 (US IRS)' AND enum_code = '990' AND enum_id = 'US_IRS_990' AND enum_type_id = 'TAX_FORMS' AND sequence_id = '04');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Form 990-PF (US IRS)', '990PF', 'US_IRS_990PF', 'TAX_FORMS', '05'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Form 990-PF (US IRS)' AND enum_code = '990PF' AND enum_id = 'US_IRS_990PF' AND enum_type_id = 'TAX_FORMS' AND sequence_id = '05');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Form 990-T (US IRS)', '990T', 'US_IRS_990T', 'TAX_FORMS', '06'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Form 990-T (US IRS)' AND enum_code = '990T' AND enum_id = 'US_IRS_990T' AND enum_type_id = 'TAX_FORMS' AND sequence_id = '06');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Form 1040 (US IRS)', '1040', 'US_IRS_1040', 'TAX_FORMS', '07'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Form 1040 (US IRS)' AND enum_code = '1040' AND enum_id = 'US_IRS_1040' AND enum_type_id = 'TAX_FORMS' AND sequence_id = '07');

INSERT INTO enumeration_type (description, enum_type_id, has_table)
SELECT 'COGS Methods', 'COGS_METHODS', 0
WHERE NOT EXISTS (SELECT 1 FROM enumeration_type WHERE description = 'COGS Methods' AND enum_type_id = 'COGS_METHODS' AND has_table = 0);

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'LIFO', 'LIFO', 'COGS_LIFO', 'COGS_METHODS', '01'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'LIFO' AND enum_code = 'LIFO' AND enum_id = 'COGS_LIFO' AND enum_type_id = 'COGS_METHODS' AND sequence_id = '01');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'FIFO', 'FIFO', 'COGS_FIFO', 'COGS_METHODS', '02'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'FIFO' AND enum_code = 'FIFO' AND enum_id = 'COGS_FIFO' AND enum_type_id = 'COGS_METHODS' AND sequence_id = '02');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Average Cost', 'AVG_COST', 'COGS_AVG_COST', 'COGS_METHODS', '03'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Average Cost' AND enum_code = 'AVG_COST' AND enum_id = 'COGS_AVG_COST' AND enum_type_id = 'COGS_METHODS' AND sequence_id = '03');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Inventory Item Cost', 'INV_COST', 'COGS_INV_COST', 'COGS_METHODS', '04'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Inventory Item Cost' AND enum_code = 'INV_COST' AND enum_id = 'COGS_INV_COST' AND enum_type_id = 'COGS_METHODS' AND sequence_id = '04');

INSERT INTO custom_method_type (custom_method_type_id, description, has_table, parent_type_id)
SELECT 'HOOK', 'Custom Methode Type define HOOK method to resolve specific sequence', 0, 'HOOK'
WHERE NOT EXISTS (SELECT 1 FROM custom_method_type WHERE custom_method_type_id = 'HOOK' AND description = 'Custom Methode Type define HOOK method to resolve specific sequence' AND has_table = 0 AND parent_type_id = 'HOOK');

INSERT INTO custom_method_type (custom_method_type_id, description, has_table, parent_type_id)
SELECT 'INVOICE_HOOK', 'Invoice Sequence methods', 0, 'HOOK'
WHERE NOT EXISTS (SELECT 1 FROM custom_method_type WHERE custom_method_type_id = 'INVOICE_HOOK' AND description = 'Invoice Sequence methods' AND has_table = 0 AND parent_type_id = 'HOOK');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'INV_HOOK_ENF_SEQ', 'invoiceSequenceEnforced', 'INVOICE_HOOK', 'Enforced Sequence (no gaps, per organization)'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'INV_HOOK_ENF_SEQ' AND custom_method_name = 'invoiceSequenceEnforced' AND custom_method_type_id = 'INVOICE_HOOK' AND description = 'Enforced Sequence (no gaps, per organization)');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'INV_HOOK_RES_YR', 'invoiceSequenceRestart', 'INVOICE_HOOK', 'Restart on Fiscal Year (no gaps, per org, reset to 1 each year)'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'INV_HOOK_RES_YR' AND custom_method_name = 'invoiceSequenceRestart' AND custom_method_type_id = 'INVOICE_HOOK' AND description = 'Restart on Fiscal Year (no gaps, per org, reset to 1 each year)');

INSERT INTO custom_method_type (custom_method_type_id, description, has_table, parent_type_id)
SELECT 'QUOTE_HOOK', 'Quote Sequence methods', 0, 'HOOK'
WHERE NOT EXISTS (SELECT 1 FROM custom_method_type WHERE custom_method_type_id = 'QUOTE_HOOK' AND description = 'Quote Sequence methods' AND has_table = 0 AND parent_type_id = 'HOOK');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'QUOTE_HOOK_ENF_SEQ', 'quoteSequenceEnforced', 'QUOTE_HOOK', 'Enforced Sequence (no gaps, per organization)'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'QUOTE_HOOK_ENF_SEQ' AND custom_method_name = 'quoteSequenceEnforced' AND custom_method_type_id = 'QUOTE_HOOK' AND description = 'Enforced Sequence (no gaps, per organization)');

INSERT INTO custom_method_type (custom_method_type_id, description, has_table, parent_type_id)
SELECT 'ORDER_HOOK', 'Order Sequence methods', 0, 'HOOK'
WHERE NOT EXISTS (SELECT 1 FROM custom_method_type WHERE custom_method_type_id = 'ORDER_HOOK' AND description = 'Order Sequence methods' AND has_table = 0 AND parent_type_id = 'HOOK');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'ORDER_HOOK_ENF_SEQ', 'orderSequence_enforced', 'ORDER_HOOK', 'Enforced Sequence (no gaps, per organization)'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'ORDER_HOOK_ENF_SEQ' AND custom_method_name = 'orderSequence_enforced' AND custom_method_type_id = 'ORDER_HOOK' AND description = 'Enforced Sequence (no gaps, per organization)');

INSERT INTO enumeration_type (description, enum_type_id, has_table)
SELECT 'Invoice Sequence Mode', 'INVOICE_SEQMD', 0
WHERE NOT EXISTS (SELECT 1 FROM enumeration_type WHERE description = 'Invoice Sequence Mode' AND enum_type_id = 'INVOICE_SEQMD' AND has_table = 0);

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Standard (faster, may have gaps, per system)', 'STANDARD', 'INVSQ_STANDARD', 'INVOICE_SEQMD', '01'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Standard (faster, may have gaps, per system)' AND enum_code = 'STANDARD' AND enum_id = 'INVSQ_STANDARD' AND enum_type_id = 'INVOICE_SEQMD' AND sequence_id = '01');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Enforced Sequence (no gaps, per organization)', 'ENF_SEQ', 'INVSQ_ENF_SEQ', 'INVOICE_SEQMD', '02'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Enforced Sequence (no gaps, per organization)' AND enum_code = 'ENF_SEQ' AND enum_id = 'INVSQ_ENF_SEQ' AND enum_type_id = 'INVOICE_SEQMD' AND sequence_id = '02');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Restart on Fiscal Year (no gaps, per org, reset to 1 each year)', 'RESTARTYR', 'INVSQ_RESTARTYR', 'INVOICE_SEQMD', '03'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Restart on Fiscal Year (no gaps, per org, reset to 1 each year)' AND enum_code = 'RESTARTYR' AND enum_id = 'INVSQ_RESTARTYR' AND enum_type_id = 'INVOICE_SEQMD' AND sequence_id = '03');

INSERT INTO enumeration_type (description, enum_type_id, has_table)
SELECT 'Quote Sequence Mode', 'QUOTE_SEQMD', 0
WHERE NOT EXISTS (SELECT 1 FROM enumeration_type WHERE description = 'Quote Sequence Mode' AND enum_type_id = 'QUOTE_SEQMD' AND has_table = 0);

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Standard (faster, may have gaps, per system)', 'STANDARD', 'QTESQ_STANDARD', 'QUOTE_SEQMD', '01'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Standard (faster, may have gaps, per system)' AND enum_code = 'STANDARD' AND enum_id = 'QTESQ_STANDARD' AND enum_type_id = 'QUOTE_SEQMD' AND sequence_id = '01');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Enforced Sequence (no gaps, per organization)', 'ENF_SEQ', 'QTESQ_ENF_SEQ', 'QUOTE_SEQMD', '02'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Enforced Sequence (no gaps, per organization)' AND enum_code = 'ENF_SEQ' AND enum_id = 'QTESQ_ENF_SEQ' AND enum_type_id = 'QUOTE_SEQMD' AND sequence_id = '02');

INSERT INTO enumeration_type (description, enum_type_id, has_table)
SELECT 'Order Sequence Mode', 'ORDER_SEQMD', 0
WHERE NOT EXISTS (SELECT 1 FROM enumeration_type WHERE description = 'Order Sequence Mode' AND enum_type_id = 'ORDER_SEQMD' AND has_table = 0);

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Standard (faster, may have gaps, per system)', 'STANDARD', 'ODRSQ_STANDARD', 'ORDER_SEQMD', '01'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Standard (faster, may have gaps, per system)' AND enum_code = 'STANDARD' AND enum_id = 'ODRSQ_STANDARD' AND enum_type_id = 'ORDER_SEQMD' AND sequence_id = '01');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Enforced Sequence (no gaps, per organization)', 'ENF_SEQ', 'ODRSQ_ENF_SEQ', 'ORDER_SEQMD', '02'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Enforced Sequence (no gaps, per organization)' AND enum_code = 'ENF_SEQ' AND enum_id = 'ODRSQ_ENF_SEQ' AND enum_type_id = 'ORDER_SEQMD' AND sequence_id = '02');

INSERT INTO fixed_asset_std_cost_type (description, fixed_asset_std_cost_type_id, has_table)
SELECT 'Standard Setup Cost', 'SETUP_COST', 0
WHERE NOT EXISTS (SELECT 1 FROM fixed_asset_std_cost_type WHERE description = 'Standard Setup Cost' AND fixed_asset_std_cost_type_id = 'SETUP_COST' AND has_table = 0);

INSERT INTO fixed_asset_std_cost_type (description, fixed_asset_std_cost_type_id, has_table)
SELECT 'Standard Usage Cost', 'USAGE_COST', 0
WHERE NOT EXISTS (SELECT 1 FROM fixed_asset_std_cost_type WHERE description = 'Standard Usage Cost' AND fixed_asset_std_cost_type_id = 'USAGE_COST' AND has_table = 0);

INSERT INTO tax_authority_assoc_type (description, tax_authority_assoc_type_id)
SELECT 'Exemption Inheritance', 'EXEMPT_INHER'
WHERE NOT EXISTS (SELECT 1 FROM tax_authority_assoc_type WHERE description = 'Exemption Inheritance' AND tax_authority_assoc_type_id = 'EXEMPT_INHER');

INSERT INTO tax_authority_assoc_type (description, tax_authority_assoc_type_id)
SELECT 'Collection Agent', 'COLLECT_AGENT'
WHERE NOT EXISTS (SELECT 1 FROM tax_authority_assoc_type WHERE description = 'Collection Agent' AND tax_authority_assoc_type_id = 'COLLECT_AGENT');

INSERT INTO tax_authority_rate_type (description, tax_authority_rate_type_id)
SELECT 'Sales Tax', 'SALES_TAX'
WHERE NOT EXISTS (SELECT 1 FROM tax_authority_rate_type WHERE description = 'Sales Tax' AND tax_authority_rate_type_id = 'SALES_TAX');

INSERT INTO tax_authority_rate_type (description, tax_authority_rate_type_id)
SELECT 'Use Tax', 'USE_TAX'
WHERE NOT EXISTS (SELECT 1 FROM tax_authority_rate_type WHERE description = 'Use Tax' AND tax_authority_rate_type_id = 'USE_TAX');

INSERT INTO tax_authority_rate_type (description, tax_authority_rate_type_id)
SELECT 'Income Tax', 'INCOME_TAX'
WHERE NOT EXISTS (SELECT 1 FROM tax_authority_rate_type WHERE description = 'Income Tax' AND tax_authority_rate_type_id = 'INCOME_TAX');

INSERT INTO tax_authority_rate_type (description, tax_authority_rate_type_id)
SELECT 'Export Tax', 'EXPORT_TAX'
WHERE NOT EXISTS (SELECT 1 FROM tax_authority_rate_type WHERE description = 'Export Tax' AND tax_authority_rate_type_id = 'EXPORT_TAX');

INSERT INTO tax_authority_rate_type (description, tax_authority_rate_type_id)
SELECT 'Import Tax', 'IMPORT_TAX'
WHERE NOT EXISTS (SELECT 1 FROM tax_authority_rate_type WHERE description = 'Import Tax' AND tax_authority_rate_type_id = 'IMPORT_TAX');

INSERT INTO tax_authority_rate_type (description, tax_authority_rate_type_id)
SELECT 'Value Added Tax', 'VAT_TAX'
WHERE NOT EXISTS (SELECT 1 FROM tax_authority_rate_type WHERE description = 'Value Added Tax' AND tax_authority_rate_type_id = 'VAT_TAX');

INSERT INTO rate_type (description, rate_type_id)
SELECT 'Standard Rate', 'STANDARD'
WHERE NOT EXISTS (SELECT 1 FROM rate_type WHERE description = 'Standard Rate' AND rate_type_id = 'STANDARD');

INSERT INTO rate_type (description, rate_type_id)
SELECT 'Discounted Rate', 'DISCOUNTED'
WHERE NOT EXISTS (SELECT 1 FROM rate_type WHERE description = 'Discounted Rate' AND rate_type_id = 'DISCOUNTED');

INSERT INTO rate_type (description, rate_type_id)
SELECT 'Overtime Rate', 'OVERTIME'
WHERE NOT EXISTS (SELECT 1 FROM rate_type WHERE description = 'Overtime Rate' AND rate_type_id = 'OVERTIME');

INSERT INTO rate_type (description, rate_type_id)
SELECT 'Average Pay Rate', 'AVERAGE_PAY_RATE'
WHERE NOT EXISTS (SELECT 1 FROM rate_type WHERE description = 'Average Pay Rate' AND rate_type_id = 'AVERAGE_PAY_RATE');

INSERT INTO rate_type (description, rate_type_id)
SELECT 'Highest Pay Rate', 'HIGH_PAY_RATE'
WHERE NOT EXISTS (SELECT 1 FROM rate_type WHERE description = 'Highest Pay Rate' AND rate_type_id = 'HIGH_PAY_RATE');

INSERT INTO rate_type (description, rate_type_id)
SELECT 'Lowest Pay Rate', 'LOW_PAY_RATE'
WHERE NOT EXISTS (SELECT 1 FROM rate_type WHERE description = 'Lowest Pay Rate' AND rate_type_id = 'LOW_PAY_RATE');

INSERT INTO period_type (description, period_length, period_type_id, uom_id)
SELECT 'Rate amount per Hour', '1', 'RATE_HOUR', 'TF_hr'
WHERE NOT EXISTS (SELECT 1 FROM period_type WHERE description = 'Rate amount per Hour' AND period_length = '1' AND period_type_id = 'RATE_HOUR' AND uom_id = 'TF_hr');

INSERT INTO period_type (description, period_length, period_type_id, uom_id)
SELECT 'Rate amount per Week', '1', 'RATE_WEEK', 'TF_wk'
WHERE NOT EXISTS (SELECT 1 FROM period_type WHERE description = 'Rate amount per Week' AND period_length = '1' AND period_type_id = 'RATE_WEEK' AND uom_id = 'TF_wk');

INSERT INTO period_type (description, period_length, period_type_id, uom_id)
SELECT 'Rate amount per month', '1', 'RATE_MONTH', 'TF_mon'
WHERE NOT EXISTS (SELECT 1 FROM period_type WHERE description = 'Rate amount per month' AND period_length = '1' AND period_type_id = 'RATE_MONTH' AND uom_id = 'TF_mon');

INSERT INTO period_type (description, period_length, period_type_id, uom_id)
SELECT 'Rate amount per Quarter', '3', 'RATE_QUARTER', 'TF_mon'
WHERE NOT EXISTS (SELECT 1 FROM period_type WHERE description = 'Rate amount per Quarter' AND period_length = '3' AND period_type_id = 'RATE_QUARTER' AND uom_id = 'TF_mon');

INSERT INTO enumeration_type (description, enum_type_id, has_table)
SELECT 'Points of Title Transfer', 'PTSOFTTFR', 0
WHERE NOT EXISTS (SELECT 1 FROM enumeration_type WHERE description = 'Points of Title Transfer' AND enum_type_id = 'PTSOFTTFR' AND has_table = 0);

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Desination', 'DEST', 'POTT_DEST', 'PTSOFTTFR', '01'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Desination' AND enum_code = 'DEST' AND enum_id = 'POTT_DEST' AND enum_type_id = 'PTSOFTTFR' AND sequence_id = '01');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Origin', 'ORIG', 'POTT_ORIG', 'PTSOFTTFR', '02'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Origin' AND enum_code = 'ORIG' AND enum_id = 'POTT_ORIG' AND enum_type_id = 'PTSOFTTFR' AND sequence_id = '02');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'In Transit', 'INTR', 'POTT_INTR', 'PTSOFTTFR', '03'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'In Transit' AND enum_code = 'INTR' AND enum_id = 'POTT_INTR' AND enum_type_id = 'PTSOFTTFR' AND sequence_id = '03');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'EX-Works', 'EXW', 'POTT_EXW', 'PTSOFTTFR', '11'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'EX-Works' AND enum_code = 'EXW' AND enum_id = 'POTT_EXW' AND enum_type_id = 'PTSOFTTFR' AND sequence_id = '11');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Free On Board', 'FOB', 'POTT_FOB', 'PTSOFTTFR', '12'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Free On Board' AND enum_code = 'FOB' AND enum_id = 'POTT_FOB' AND enum_type_id = 'PTSOFTTFR' AND sequence_id = '12');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Free Carrier', 'FCA', 'POTT_FCA', 'PTSOFTTFR', '13'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Free Carrier' AND enum_code = 'FCA' AND enum_id = 'POTT_FCA' AND enum_type_id = 'PTSOFTTFR' AND sequence_id = '13');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Free Alongside Ship', 'FAS', 'POTT_FAS', 'PTSOFTTFR', '14'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Free Alongside Ship' AND enum_code = 'FAS' AND enum_id = 'POTT_FAS' AND enum_type_id = 'PTSOFTTFR' AND sequence_id = '14');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Cost and Freight', 'CFR', 'POTT_CFR', 'PTSOFTTFR', '15'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Cost and Freight' AND enum_code = 'CFR' AND enum_id = 'POTT_CFR' AND enum_type_id = 'PTSOFTTFR' AND sequence_id = '15');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Cost, Insurance and Freight', 'CIF', 'POTT_CIF', 'PTSOFTTFR', '16'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Cost, Insurance and Freight' AND enum_code = 'CIF' AND enum_id = 'POTT_CIF' AND enum_type_id = 'PTSOFTTFR' AND sequence_id = '16');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Carriage Paid To', 'CPT', 'POTT_CPT', 'PTSOFTTFR', '17'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Carriage Paid To' AND enum_code = 'CPT' AND enum_id = 'POTT_CPT' AND enum_type_id = 'PTSOFTTFR' AND sequence_id = '17');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Carriage and Insurance Paid To', 'CIP', 'POTT_CIP', 'PTSOFTTFR', '18'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Carriage and Insurance Paid To' AND enum_code = 'CIP' AND enum_id = 'POTT_CIP' AND enum_type_id = 'PTSOFTTFR' AND sequence_id = '18');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Delivered At Frontier', 'DAF', 'POTT_DAF', 'PTSOFTTFR', '19'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Delivered At Frontier' AND enum_code = 'DAF' AND enum_id = 'POTT_DAF' AND enum_type_id = 'PTSOFTTFR' AND sequence_id = '19');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Delivered Ex Ship', 'DES', 'POTT_DES', 'PTSOFTTFR', '20'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Delivered Ex Ship' AND enum_code = 'DES' AND enum_id = 'POTT_DES' AND enum_type_id = 'PTSOFTTFR' AND sequence_id = '20');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Delivered Ex Quay', 'DEQ', 'POTT_DEQ', 'PTSOFTTFR', '21'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Delivered Ex Quay' AND enum_code = 'DEQ' AND enum_id = 'POTT_DEQ' AND enum_type_id = 'PTSOFTTFR' AND sequence_id = '21');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Delivered Duty Paid', 'DDP', 'POTT_DDP', 'PTSOFTTFR', '22'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Delivered Duty Paid' AND enum_code = 'DDP' AND enum_id = 'POTT_DDP' AND enum_type_id = 'PTSOFTTFR' AND sequence_id = '22');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Delivered Duty Unpaid', 'DDQ', 'POTT_DDQ', 'PTSOFTTFR', '23'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Delivered Duty Unpaid' AND enum_code = 'DDQ' AND enum_id = 'POTT_DDQ' AND enum_type_id = 'PTSOFTTFR' AND sequence_id = '23');

INSERT INTO product_average_cost_type (description, has_table, product_average_cost_type_id)
SELECT 'Simple Average Cost', 0, 'SIMPLE_AVG_COST'
WHERE NOT EXISTS (SELECT 1 FROM product_average_cost_type WHERE description = 'Simple Average Cost' AND has_table = 0 AND product_average_cost_type_id = 'SIMPLE_AVG_COST');

INSERT INTO product_average_cost_type (description, has_table, product_average_cost_type_id)
SELECT 'Weighted Average Cost', 0, 'WEIGHTED_AVG_COST'
WHERE NOT EXISTS (SELECT 1 FROM product_average_cost_type WHERE description = 'Weighted Average Cost' AND has_table = 0 AND product_average_cost_type_id = 'WEIGHTED_AVG_COST');

INSERT INTO product_average_cost_type (description, has_table, product_average_cost_type_id)
SELECT 'Moving Average Cost', 0, 'MOVING_AVG_COST'
WHERE NOT EXISTS (SELECT 1 FROM product_average_cost_type WHERE description = 'Moving Average Cost' AND has_table = 0 AND product_average_cost_type_id = 'MOVING_AVG_COST');

INSERT INTO enumeration_type (description, enum_type_id, has_table)
SELECT 'Store Credit Account', 'STR_CRDT_ACT', 0
WHERE NOT EXISTS (SELECT 1 FROM enumeration_type WHERE description = 'Store Credit Account' AND enum_type_id = 'STR_CRDT_ACT' AND has_table = 0);

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Financial Account', 'FINACCOUNT', 'FIN_ACCOUNT', 'STR_CRDT_ACT', '01'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Financial Account' AND enum_code = 'FINACCOUNT' AND enum_id = 'FIN_ACCOUNT' AND enum_type_id = 'STR_CRDT_ACT' AND sequence_id = '01');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Billing Account', 'BILLACCOUNT', 'BILLING_ACCOUNT', 'STR_CRDT_ACT', '02'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Billing Account' AND enum_code = 'BILLACCOUNT' AND enum_id = 'BILLING_ACCOUNT' AND enum_type_id = 'STR_CRDT_ACT' AND sequence_id = '02');

INSERT INTO status_type (description, has_table, status_type_id)
SELECT 'Gl Reconciliation Status', 0, 'GLREC_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_type WHERE description = 'Gl Reconciliation Status' AND has_table = 0 AND status_type_id = 'GLREC_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Created', '11', 'CREATED', 'GLREC_CREATED', 'GLREC_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Created' AND sequence_id = '11' AND status_code = 'CREATED' AND status_id = 'GLREC_CREATED' AND status_type_id = 'GLREC_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Reconciled', '12', 'RECONCILED', 'GLREC_RECONCILED', 'GLREC_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Reconciled' AND sequence_id = '12' AND status_code = 'RECONCILED' AND status_id = 'GLREC_RECONCILED' AND status_type_id = 'GLREC_STATUS');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'GLREC_CREATED', 'GLREC_RECONCILED', 'Set Created to Reconciled'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'GLREC_CREATED' AND status_id_to = 'GLREC_RECONCILED' AND transition_name = 'Set Created to Reconciled');

INSERT INTO custom_method_type (custom_method_type_id, description)
SELECT 'DEPRECIATION_FORMULA', 'Formula for calculating depreciation for fixed asset'
WHERE NOT EXISTS (SELECT 1 FROM custom_method_type WHERE custom_method_type_id = 'DEPRECIATION_FORMULA' AND description = 'Formula for calculating depreciation for fixed asset');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'STR_LINE_DEP_FORMULA', 'straightLineDepreciation', 'DEPRECIATION_FORMULA', 'Straight Line depreciation algorithm for fixed asset ((purchaseCost - salvageCost)/expectedLifeInYears)'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'STR_LINE_DEP_FORMULA' AND custom_method_name = 'straightLineDepreciation' AND custom_method_type_id = 'DEPRECIATION_FORMULA' AND description = 'Straight Line depreciation algorithm for fixed asset ((purchaseCost - salvageCost)/expectedLifeInYears)');

INSERT INTO custom_method (custom_method_id, custom_method_name, custom_method_type_id, description)
SELECT 'DBL_DECL_DEP_FORMULA', 'doubleDecliningBalanceDepreciation', 'DEPRECIATION_FORMULA', 'Double decline depreciation algorithm for fixed asset ((NetBookValue - salvageCost)*2/remainingLifeInYears)'
WHERE NOT EXISTS (SELECT 1 FROM custom_method WHERE custom_method_id = 'DBL_DECL_DEP_FORMULA' AND custom_method_name = 'doubleDecliningBalanceDepreciation' AND custom_method_type_id = 'DEPRECIATION_FORMULA' AND description = 'Double decline depreciation algorithm for fixed asset ((NetBookValue - salvageCost)*2/remainingLifeInYears)');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Created', '00', 'CREATED', 'BG_CREATED', 'BUDGET_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Created' AND sequence_id = '00' AND status_code = 'CREATED' AND status_id = 'BG_CREATED' AND status_type_id = 'BUDGET_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Reviewed', '01', 'REVIEWED', 'BG_REVIEWED', 'BUDGET_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Reviewed' AND sequence_id = '01' AND status_code = 'REVIEWED' AND status_id = 'BG_REVIEWED' AND status_type_id = 'BUDGET_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Approved', '02', 'APPROVED', 'BG_APPROVED', 'BUDGET_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Approved' AND sequence_id = '02' AND status_code = 'APPROVED' AND status_id = 'BG_APPROVED' AND status_type_id = 'BUDGET_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Rejected', '03', 'REJECTED', 'BG_REJECTED', 'BUDGET_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Rejected' AND sequence_id = '03' AND status_code = 'REJECTED' AND status_id = 'BG_REJECTED' AND status_type_id = 'BUDGET_STATUS');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'BG_CREATED', 'BG_REVIEWED', 'Review Budget'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'BG_CREATED' AND status_id_to = 'BG_REVIEWED' AND transition_name = 'Review Budget');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'BG_CREATED', 'BG_APPROVED', 'Submit Budget'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'BG_CREATED' AND status_id_to = 'BG_APPROVED' AND transition_name = 'Submit Budget');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'BG_CREATED', 'BG_REJECTED', 'Reject Budget'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'BG_CREATED' AND status_id_to = 'BG_REJECTED' AND transition_name = 'Reject Budget');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'BG_REVIEWED', 'BG_APPROVED', 'Approved Budget'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'BG_REVIEWED' AND status_id_to = 'BG_APPROVED' AND transition_name = 'Approved Budget');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'BG_REVIEWED', 'BG_REJECTED', 'Reject Budget'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'BG_REVIEWED' AND status_id_to = 'BG_REJECTED' AND transition_name = 'Reject Budget');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'BG_APPROVED', 'BG_CREATED', 'Accept Budget'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'BG_APPROVED' AND status_id_to = 'BG_CREATED' AND transition_name = 'Accept Budget');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'BG_APPROVED', 'BG_REJECTED', 'Reject Budget'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'BG_APPROVED' AND status_id_to = 'BG_REJECTED' AND transition_name = 'Reject Budget');

INSERT INTO budget_review_result_type (budget_review_result_type_id, description)
SELECT 'BGR_ACCEPTED', 'Accepted'
WHERE NOT EXISTS (SELECT 1 FROM budget_review_result_type WHERE budget_review_result_type_id = 'BGR_ACCEPTED' AND description = 'Accepted');

INSERT INTO budget_review_result_type (budget_review_result_type_id, description)
SELECT 'BGR_REJECTED', 'Rejected'
WHERE NOT EXISTS (SELECT 1 FROM budget_review_result_type WHERE budget_review_result_type_id = 'BGR_REJECTED' AND description = 'Rejected');

INSERT INTO payment_gateway_config_type (description, has_table, payment_gateway_config_type_id)
SELECT 'Payment Gateway SagePay', 1, 'PAY_GATWY_SAGEPAY'
WHERE NOT EXISTS (SELECT 1 FROM payment_gateway_config_type WHERE description = 'Payment Gateway SagePay' AND has_table = 1 AND payment_gateway_config_type_id = 'PAY_GATWY_SAGEPAY');

INSERT INTO payment_gateway_config_type (description, has_table, payment_gateway_config_type_id)
SELECT 'Payment Gateway Authorize Dot Net', 1, 'PAY_GATWY_AUTH_NET'
WHERE NOT EXISTS (SELECT 1 FROM payment_gateway_config_type WHERE description = 'Payment Gateway Authorize Dot Net' AND has_table = 1 AND payment_gateway_config_type_id = 'PAY_GATWY_AUTH_NET');

INSERT INTO payment_gateway_config_type (description, has_table, payment_gateway_config_type_id)
SELECT 'Payment Gateway CyberSource', 1, 'PAY_GATWY_CYBERSRC'
WHERE NOT EXISTS (SELECT 1 FROM payment_gateway_config_type WHERE description = 'Payment Gateway CyberSource' AND has_table = 1 AND payment_gateway_config_type_id = 'PAY_GATWY_CYBERSRC');

INSERT INTO payment_gateway_config_type (description, has_table, payment_gateway_config_type_id)
SELECT 'Payment Gateway eWay', 1, 'PAY_GATWY_EWAY'
WHERE NOT EXISTS (SELECT 1 FROM payment_gateway_config_type WHERE description = 'Payment Gateway eWay' AND has_table = 1 AND payment_gateway_config_type_id = 'PAY_GATWY_EWAY');

INSERT INTO payment_gateway_config_type (description, has_table, payment_gateway_config_type_id)
SELECT 'Payment Gateway Payflow Pro', 1, 'PAY_GATWY_PAYFLOWPRO'
WHERE NOT EXISTS (SELECT 1 FROM payment_gateway_config_type WHERE description = 'Payment Gateway Payflow Pro' AND has_table = 1 AND payment_gateway_config_type_id = 'PAY_GATWY_PAYFLOWPRO');

INSERT INTO payment_gateway_config_type (description, has_table, payment_gateway_config_type_id)
SELECT 'Payment Gateway PayPal', 1, 'PAY_GATWY_PAYPAL'
WHERE NOT EXISTS (SELECT 1 FROM payment_gateway_config_type WHERE description = 'Payment Gateway PayPal' AND has_table = 1 AND payment_gateway_config_type_id = 'PAY_GATWY_PAYPAL');

INSERT INTO payment_gateway_config_type (description, has_table, payment_gateway_config_type_id)
SELECT 'Payment Gateway Clear Commerce', 1, 'PAY_GATWY_CLRCOMRC'
WHERE NOT EXISTS (SELECT 1 FROM payment_gateway_config_type WHERE description = 'Payment Gateway Clear Commerce' AND has_table = 1 AND payment_gateway_config_type_id = 'PAY_GATWY_CLRCOMRC');

INSERT INTO payment_gateway_config_type (description, has_table, payment_gateway_config_type_id)
SELECT 'Payment Gateway RBS WorldPay', 1, 'PAY_GATWY_WORLDPAY'
WHERE NOT EXISTS (SELECT 1 FROM payment_gateway_config_type WHERE description = 'Payment Gateway RBS WorldPay' AND has_table = 1 AND payment_gateway_config_type_id = 'PAY_GATWY_WORLDPAY');

INSERT INTO payment_gateway_config_type (description, has_table, payment_gateway_config_type_id)
SELECT 'Payment Gateway Orbital', 1, 'PAY_GATWY_ORBITAL'
WHERE NOT EXISTS (SELECT 1 FROM payment_gateway_config_type WHERE description = 'Payment Gateway Orbital' AND has_table = 1 AND payment_gateway_config_type_id = 'PAY_GATWY_ORBITAL');

INSERT INTO payment_gateway_config_type (description, has_table, payment_gateway_config_type_id)
SELECT 'Payment Gateway SecurePay', 1, 'PAY_GATWY_SECUREPAY'
WHERE NOT EXISTS (SELECT 1 FROM payment_gateway_config_type WHERE description = 'Payment Gateway SecurePay' AND has_table = 1 AND payment_gateway_config_type_id = 'PAY_GATWY_SECUREPAY');

INSERT INTO gl_account_group_type (description, gl_account_group_type_id)
SELECT 'Tax Form Field: USA', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group_type WHERE description = 'Tax Form Field: USA' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Form 1040: Other income, misc.', '9001', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Form 1040: Other income, misc.' AND gl_account_group_id = '9001' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Form 1040: IRA contribution, self', '9002', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Form 1040: IRA contribution, self' AND gl_account_group_id = '9002' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Form 1040: IRA contribution, spouse', '9003', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Form 1040: IRA contribution, spouse' AND gl_account_group_id = '9003' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Form 1040: Keogh deduction, self', '9004', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Form 1040: Keogh deduction, self' AND gl_account_group_id = '9004' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Form 1040: Keogh deduction, spouse', '9005', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Form 1040: Keogh deduction, spouse' AND gl_account_group_id = '9005' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Form 1040: SEP deduction, self', '9006', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Form 1040: SEP deduction, self' AND gl_account_group_id = '9006' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Form 1040: SEP deduction, spouse', '9007', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Form 1040: SEP deduction, spouse' AND gl_account_group_id = '9007' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Form 1040: SIMPLE contribution, self', '9008', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Form 1040: SIMPLE contribution, self' AND gl_account_group_id = '9008' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Form 1040: SIMPLE contribution, spouse', '9009', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Form 1040: SIMPLE contribution, spouse' AND gl_account_group_id = '9009' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Form 1040: Federal estimated tax, quarterly', '9010', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Form 1040: Federal estimated tax, quarterly' AND gl_account_group_id = '9010' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule B: Interest income', '9021', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule B: Interest income' AND gl_account_group_id = '9021' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule B: Dividend income', '9022', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule B: Dividend income' AND gl_account_group_id = '9022' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule C: Gross receipts or sales', '9031', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule C: Gross receipts or sales' AND gl_account_group_id = '9031' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule C: Returns and allowances', '9032', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule C: Returns and allowances' AND gl_account_group_id = '9032' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule C: Other business income', '9033', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule C: Other business income' AND gl_account_group_id = '9033' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule C: Advertising', '9034', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule C: Advertising' AND gl_account_group_id = '9034' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule C: Bad debts from sales/services', '9035', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule C: Bad debts from sales/services' AND gl_account_group_id = '9035' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule C: Car and truck expenses', '9036', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule C: Car and truck expenses' AND gl_account_group_id = '9036' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule C: Commissions and fees', '9037', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule C: Commissions and fees' AND gl_account_group_id = '9037' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule C: Depletion', '9038', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule C: Depletion' AND gl_account_group_id = '9038' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule C: Employee benefit programs', '9039', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule C: Employee benefit programs' AND gl_account_group_id = '9039' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule C: Insurance (other than health)', '9040', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule C: Insurance (other than health)' AND gl_account_group_id = '9040' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule C: Interest expense, mortgage', '9041', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule C: Interest expense, mortgage' AND gl_account_group_id = '9041' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule C: Interest expense, other', '9042', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule C: Interest expense, other' AND gl_account_group_id = '9042' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule C: Legal and professional fees', '9043', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule C: Legal and professional fees' AND gl_account_group_id = '9043' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule C: Office expenses', '9044', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule C: Office expenses' AND gl_account_group_id = '9044' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule C: Pension/profit-sharing plans', '9045', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule C: Pension/profit-sharing plans' AND gl_account_group_id = '9045' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule C: Rent/lease vehicles, equipment', '9046', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule C: Rent/lease vehicles, equipment' AND gl_account_group_id = '9046' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule C: Rent/lease other business property', '9047', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule C: Rent/lease other business property' AND gl_account_group_id = '9047' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule C: Repairs and maintenance', '9048', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule C: Repairs and maintenance' AND gl_account_group_id = '9048' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule C: Supplies purchased (not from COGS)', '9049', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule C: Supplies purchased (not from COGS)' AND gl_account_group_id = '9049' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule C: Taxes and licenses', '9050', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule C: Taxes and licenses' AND gl_account_group_id = '9050' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule C: Travel', '9051', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule C: Travel' AND gl_account_group_id = '9051' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule C: Meals and entertainment', '9052', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule C: Meals and entertainment' AND gl_account_group_id = '9052' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule C: Utilities', '9053', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule C: Utilities' AND gl_account_group_id = '9053' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule C: Wages paid', '9054', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule C: Wages paid' AND gl_account_group_id = '9054' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule C: Other business expenses', '9055', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule C: Other business expenses' AND gl_account_group_id = '9055' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule C: COGS purchases', '9056', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule C: COGS purchases' AND gl_account_group_id = '9056' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule C: COGS labor', '9057', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule C: COGS labor' AND gl_account_group_id = '9057' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule C: COGS materials/supplies', '9058', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule C: COGS materials/supplies' AND gl_account_group_id = '9058' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule C: COGS other', '9059', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule C: COGS other' AND gl_account_group_id = '9059' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule E: Rents received', '9071', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule E: Rents received' AND gl_account_group_id = '9071' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule E: Royalties received', '9072', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule E: Royalties received' AND gl_account_group_id = '9072' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule E: Advertising', '9073', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule E: Advertising' AND gl_account_group_id = '9073' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule E: Auto and travel', '9074', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule E: Auto and travel' AND gl_account_group_id = '9074' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule E: Cleaning and maintenance', '9075', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule E: Cleaning and maintenance' AND gl_account_group_id = '9075' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule E: Commissions', '9076', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule E: Commissions' AND gl_account_group_id = '9076' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule E: Insurance', '9077', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule E: Insurance' AND gl_account_group_id = '9077' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule E: Legal and professional fees', '9078', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule E: Legal and professional fees' AND gl_account_group_id = '9078' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule E: Management fees', '9079', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule E: Management fees' AND gl_account_group_id = '9079' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule E: Interest expense, mortgage', '9080', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule E: Interest expense, mortgage' AND gl_account_group_id = '9080' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule E: Interest expense, other', '9081', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule E: Interest expense, other' AND gl_account_group_id = '9081' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule E: Repairs and maintenance', '9082', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule E: Repairs and maintenance' AND gl_account_group_id = '9082' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule E: Supplies purchased', '9083', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule E: Supplies purchased' AND gl_account_group_id = '9083' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule E: Taxes', '9084', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule E: Taxes' AND gl_account_group_id = '9084' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule E: Utilities', '9085', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule E: Utilities' AND gl_account_group_id = '9085' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule E: Other expenses', '9086', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule E: Other expenses' AND gl_account_group_id = '9086' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule F: Resales livestock/items', '9101', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule F: Resales livestock/items' AND gl_account_group_id = '9101' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule F: Cost of resale livestock/items', '9102', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule F: Cost of resale livestock/items' AND gl_account_group_id = '9102' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule F: Sale of livestock/produce', '9103', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule F: Sale of livestock/produce' AND gl_account_group_id = '9103' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule F: Total co-op distributions', '9104', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule F: Total co-op distributions' AND gl_account_group_id = '9104' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule F: Agricultural program payments', '9105', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule F: Agricultural program payments' AND gl_account_group_id = '9105' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule F: CCC loans reported/election', '9106', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule F: CCC loans reported/election' AND gl_account_group_id = '9106' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule F: CCC loans forfeited/repaid', '9107', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule F: CCC loans forfeited/repaid' AND gl_account_group_id = '9107' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule F: Crop insurance proceeds received', '9108', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule F: Crop insurance proceeds received' AND gl_account_group_id = '9108' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule F: Crop insurance proceeds deferred', '9109', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule F: Crop insurance proceeds deferred' AND gl_account_group_id = '9109' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule F: Custom hire income', '9110', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule F: Custom hire income' AND gl_account_group_id = '9110' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule F: Other farm income', '9111', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule F: Other farm income' AND gl_account_group_id = '9111' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule F: Car and truck expenses', '9112', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule F: Car and truck expenses' AND gl_account_group_id = '9112' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule F: Chemicals', '9113', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule F: Chemicals' AND gl_account_group_id = '9113' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule F: Conservation expenses', '9114', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule F: Conservation expenses' AND gl_account_group_id = '9114' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule F: Custom hire expenses', '9115', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule F: Custom hire expenses' AND gl_account_group_id = '9115' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule F: Employee benefit programs', '9116', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule F: Employee benefit programs' AND gl_account_group_id = '9116' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule F: Feed purchased', '9117', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule F: Feed purchased' AND gl_account_group_id = '9117' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule F: Fertilizers and lime', '9118', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule F: Fertilizers and lime' AND gl_account_group_id = '9118' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule F: Freight and trucking', '9119', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule F: Freight and trucking' AND gl_account_group_id = '9119' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule F: Gasoline, fuel, and oil', '9120', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule F: Gasoline, fuel, and oil' AND gl_account_group_id = '9120' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule F: Insurance (other than health)', '9121', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule F: Insurance (other than health)' AND gl_account_group_id = '9121' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule F: Interest expense, mortgage', '9122', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule F: Interest expense, mortgage' AND gl_account_group_id = '9122' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule F: Interest expense, other', '9123', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule F: Interest expense, other' AND gl_account_group_id = '9123' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule F: Labor hired', '9124', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule F: Labor hired' AND gl_account_group_id = '9124' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule F: Pension/profit-sharing plans', '9125', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule F: Pension/profit-sharing plans' AND gl_account_group_id = '9125' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule F: Rent/lease vehicles, equipment', '9126', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule F: Rent/lease vehicles, equipment' AND gl_account_group_id = '9126' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule F: Rent/lease land, animals', '9127', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule F: Rent/lease land, animals' AND gl_account_group_id = '9127' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule F: Repairs and maintenance', '9128', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule F: Repairs and maintenance' AND gl_account_group_id = '9128' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule F: Seeds and plants purchased', '9129', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule F: Seeds and plants purchased' AND gl_account_group_id = '9129' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule F: Storage and warehousing', '9130', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule F: Storage and warehousing' AND gl_account_group_id = '9130' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule F: Supplies purchased', '9131', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule F: Supplies purchased' AND gl_account_group_id = '9131' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule F: Taxes', '9132', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule F: Taxes' AND gl_account_group_id = '9132' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule F: Utilities', '9133', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule F: Utilities' AND gl_account_group_id = '9133' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule F: Vet, breeding, medicine', '9134', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule F: Vet, breeding, medicine' AND gl_account_group_id = '9134' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule F: Other farm expenses', '9135', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule F: Other farm expenses' AND gl_account_group_id = '9135' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule K-1: Ordinary income or loss', '9151', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule K-1: Ordinary income or loss' AND gl_account_group_id = '9151' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule K-1: Rental RE income or loss', '9152', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule K-1: Rental RE income or loss' AND gl_account_group_id = '9152' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule K-1: Other rental income or loss', '9153', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule K-1: Other rental income or loss' AND gl_account_group_id = '9153' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule K-1: Interest income', '9154', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule K-1: Interest income' AND gl_account_group_id = '9154' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule K-1: Dividends', '9155', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule K-1: Dividends' AND gl_account_group_id = '9155' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule K-1: Royalties', '9156', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule K-1: Royalties' AND gl_account_group_id = '9156' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule K-1: Net ST capital gain or loss', '9157', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule K-1: Net ST capital gain or loss' AND gl_account_group_id = '9157' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule K-1: Net LT capital gain or loss', '9158', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule K-1: Net LT capital gain or loss' AND gl_account_group_id = '9158' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule K-1: 28% rate gain or loss', '9159', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule K-1: 28% rate gain or loss' AND gl_account_group_id = '9159' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule K-1: Qualified 5-year gain', '9160', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule K-1: Qualified 5-year gain' AND gl_account_group_id = '9160' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule K-1: Guaranteed partner payments', '9161', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule K-1: Guaranteed partner payments' AND gl_account_group_id = '9161' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule K-1: Net Section 1231 gain or loss', '9162', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule K-1: Net Section 1231 gain or loss' AND gl_account_group_id = '9162' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule K-1: Other income or loss', '9163', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule K-1: Other income or loss' AND gl_account_group_id = '9163' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule K-1: Tax-exempt interest income', '9164', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule K-1: Tax-exempt interest income' AND gl_account_group_id = '9164' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Schedule K-1: Total foreign tax', '9165', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Schedule K-1: Total foreign tax' AND gl_account_group_id = '9165' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Form 1099-MISC: Prizes and awards', '9201', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Form 1099-MISC: Prizes and awards' AND gl_account_group_id = '9201' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Form 1099-MISC: Rents', '9202', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Form 1099-MISC: Rents' AND gl_account_group_id = '9202' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Form 1099-MISC: Royalties', '9203', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Form 1099-MISC: Royalties' AND gl_account_group_id = '9203' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Form 1099-MISC: Other income', '9204', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Form 1099-MISC: Other income' AND gl_account_group_id = '9204' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Form 1099-MISC: Federal tax withheld', '9205', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Form 1099-MISC: Federal tax withheld' AND gl_account_group_id = '9205' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Form 1099-MISC: Fishing boat proceeds', '9206', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Form 1099-MISC: Fishing boat proceeds' AND gl_account_group_id = '9206' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Form 1099-MISC: Medical/health payments', '9207', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Form 1099-MISC: Medical/health payments' AND gl_account_group_id = '9207' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Form 1099-MISC: Nonemployee compensation', '9208', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Form 1099-MISC: Nonemployee compensation' AND gl_account_group_id = '9208' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Form 1099-MISC: Crop insurance proceeds', '9209', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Form 1099-MISC: Crop insurance proceeds' AND gl_account_group_id = '9209' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Form 1099-MISC: State tax withheld', '9210', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Form 1099-MISC: State tax withheld' AND gl_account_group_id = '9210' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Form 4835: Sale of livestock/produce', '9401', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Form 4835: Sale of livestock/produce' AND gl_account_group_id = '9401' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Form 4835: Total co-op distributions', '9402', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Form 4835: Total co-op distributions' AND gl_account_group_id = '9402' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Form 4835: Agricultural program payments', '9403', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Form 4835: Agricultural program payments' AND gl_account_group_id = '9403' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Form 4835: CCC loans reported/election', '9404', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Form 4835: CCC loans reported/election' AND gl_account_group_id = '9404' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Form 4835: CCC loans forfeited/repaid', '9405', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Form 4835: CCC loans forfeited/repaid' AND gl_account_group_id = '9405' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Form 4835: Crop insurance proceeds received', '9406', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Form 4835: Crop insurance proceeds received' AND gl_account_group_id = '9406' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Form 4835: Crop insurance proceeds deferred', '9407', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Form 4835: Crop insurance proceeds deferred' AND gl_account_group_id = '9407' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Form 4835: Other income', '9408', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Form 4835: Other income' AND gl_account_group_id = '9408' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Form 4835: Car and truck expenses', '9409', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Form 4835: Car and truck expenses' AND gl_account_group_id = '9409' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Form 4835: Chemicals', '9410', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Form 4835: Chemicals' AND gl_account_group_id = '9410' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Form 4835: Conservation expenses', '9411', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Form 4835: Conservation expenses' AND gl_account_group_id = '9411' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Form 4835: Custom hire expenses', '9412', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Form 4835: Custom hire expenses' AND gl_account_group_id = '9412' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Form 4835: Employee benefit programs', '9413', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Form 4835: Employee benefit programs' AND gl_account_group_id = '9413' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Form 4835: Feed purchased', '9414', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Form 4835: Feed purchased' AND gl_account_group_id = '9414' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Form 4835: Fertilizers and lime', '9415', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Form 4835: Fertilizers and lime' AND gl_account_group_id = '9415' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Form 4835: Freight and trucking', '9416', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Form 4835: Freight and trucking' AND gl_account_group_id = '9416' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Form 4835: Gasoline, fuel, and oil', '9417', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Form 4835: Gasoline, fuel, and oil' AND gl_account_group_id = '9417' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Form 4835: Insurance (other than health)', '9418', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Form 4835: Insurance (other than health)' AND gl_account_group_id = '9418' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Form 4835: Interest expense, mortgage', '9419', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Form 4835: Interest expense, mortgage' AND gl_account_group_id = '9419' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Form 4835: Interest expense, other', '9420', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Form 4835: Interest expense, other' AND gl_account_group_id = '9420' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Form 4835: Labor hired', '9421', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Form 4835: Labor hired' AND gl_account_group_id = '9421' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Form 4835: Pension/profit-sharing plans', '9422', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Form 4835: Pension/profit-sharing plans' AND gl_account_group_id = '9422' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Form 4835: Rent/lease vehicles, equipment', '9423', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Form 4835: Rent/lease vehicles, equipment' AND gl_account_group_id = '9423' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Form 4835: Rent/lease land, animals', '9424', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Form 4835: Rent/lease land, animals' AND gl_account_group_id = '9424' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Form 4835: Repairs and maintenance', '9425', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Form 4835: Repairs and maintenance' AND gl_account_group_id = '9425' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Form 4835: Seeds and plants purchased', '9426', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Form 4835: Seeds and plants purchased' AND gl_account_group_id = '9426' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Form 4835: Storage and warehousing', '9427', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Form 4835: Storage and warehousing' AND gl_account_group_id = '9427' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Form 4835: Supplies purchased', '9428', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Form 4835: Supplies purchased' AND gl_account_group_id = '9428' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Form 4835: Taxes', '9429', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Form 4835: Taxes' AND gl_account_group_id = '9429' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Form 4835: Utilities', '9430', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Form 4835: Utilities' AND gl_account_group_id = '9430' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Form 4835: Vet, breeding, medicine', '9431', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Form 4835: Vet, breeding, medicine' AND gl_account_group_id = '9431' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Form 4835: Other expenses', '9432', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Form 4835: Other expenses' AND gl_account_group_id = '9432' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Form 8829: Deductable mortgage expense', '9801', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Form 8829: Deductable mortgage expense' AND gl_account_group_id = '9801' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Form 8829: Real estate taxes', '9802', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Form 8829: Real estate taxes' AND gl_account_group_id = '9802' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Form 8829: Insurance', '9803', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Form 8829: Insurance' AND gl_account_group_id = '9803' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Form 8829: Repairs and maintenance', '9804', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Form 8829: Repairs and maintenance' AND gl_account_group_id = '9804' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Form 8829: Utilities', '9805', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Form 8829: Utilities' AND gl_account_group_id = '9805' AND gl_account_group_type_id = 'TAX_FIELD_US');

INSERT INTO gl_account_group (description, gl_account_group_id, gl_account_group_type_id)
SELECT 'Form 8829: Other expenses', '9806', 'TAX_FIELD_US'
WHERE NOT EXISTS (SELECT 1 FROM gl_account_group WHERE description = 'Form 8829: Other expenses' AND gl_account_group_id = '9806' AND gl_account_group_type_id = 'TAX_FIELD_US');
