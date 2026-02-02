CREATE TABLE acctg_trans (
  ACCTG_TRANS_ID varchar(20),
  ACCTG_TRANS_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  TRANSACTION_DATE datetime,
  IS_POSTED char(1),
  POSTED_DATE datetime,
  SCHEDULED_POSTING_DATE datetime,
  GL_JOURNAL_ID varchar(20),
  GL_FISCAL_TYPE_ID varchar(20),
  VOUCHER_REF varchar(60),
  VOUCHER_DATE datetime,
  GROUP_STATUS_ID varchar(20),
  FIXED_ASSET_ID varchar(20),
  INVENTORY_ITEM_ID varchar(20),
  PHYSICAL_INVENTORY_ID varchar(20),
  PARTY_ID varchar(20),
  ROLE_TYPE_ID varchar(20),
  INVOICE_ID varchar(20),
  PAYMENT_ID varchar(20),
  FIN_ACCOUNT_TRANS_ID varchar(20),
  SHIPMENT_ID varchar(20),
  RECEIPT_ID varchar(20),
  WORK_EFFORT_ID varchar(20),
  THEIR_ACCTG_TRANS_ID varchar(60),
  CREATED_BY_USER_LOGIN varchar(250),
  LAST_MODIFIED_BY_USER_LOGIN varchar(250),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE acctg_trans_attribute (
  ACCTG_TRANS_ID varchar(20),
  ATTR_NAME varchar(60),
  ATTR_VALUE varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE acctg_trans_entry (
  ACCTG_TRANS_ID varchar(20),
  ACCTG_TRANS_ENTRY_SEQ_ID varchar(20),
  ACCTG_TRANS_ENTRY_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  VOUCHER_REF varchar(60),
  PARTY_ID varchar(20),
  ROLE_TYPE_ID varchar(20),
  THEIR_PARTY_ID varchar(20),
  PRODUCT_ID varchar(20),
  THEIR_PRODUCT_ID varchar(20),
  GL_ACCOUNT_TYPE_ID varchar(20),
  GL_ACCOUNT_ID varchar(20),
  ORGANIZATION_PARTY_ID varchar(20),
  AMOUNT decimal(18,2),
  CURRENCY_UOM_ID varchar(20),
  ORIG_AMOUNT decimal(18,2),
  ORIG_CURRENCY_UOM_ID varchar(20),
  DEBIT_CREDIT_FLAG char(1),
  DUE_DATE date,
  GROUP_ID varchar(20),
  TAX_ID varchar(20),
  RECONCILE_STATUS_ID varchar(20),
  SETTLEMENT_TERM_ID varchar(20),
  IS_SUMMARY char(1),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  INVENTORY_ITEM_ID varchar(20)
);

CREATE TABLE acctg_trans_entry_type (
  ACCTG_TRANS_ENTRY_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE acctg_trans_type (
  ACCTG_TRANS_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE acctg_trans_type_attr (
  ACCTG_TRANS_TYPE_ID varchar(20),
  ATTR_NAME varchar(60),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE agreement (
  AGREEMENT_ID varchar(20),
  PRODUCT_ID varchar(20),
  PARTY_ID_FROM varchar(20),
  PARTY_ID_TO varchar(20),
  ROLE_TYPE_ID_FROM varchar(20),
  ROLE_TYPE_ID_TO varchar(20),
  AGREEMENT_TYPE_ID varchar(20),
  AGREEMENT_DATE datetime,
  FROM_DATE datetime,
  THRU_DATE datetime,
  DESCRIPTION varchar(255),
  TEXT_DATA longtext,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE agreement_attribute (
  AGREEMENT_ID varchar(20),
  ATTR_NAME varchar(60),
  ATTR_VALUE varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE agreement_employment_appl (
  AGREEMENT_ID varchar(20),
  AGREEMENT_ITEM_SEQ_ID varchar(20),
  PARTY_ID_FROM varchar(20),
  PARTY_ID_TO varchar(20),
  ROLE_TYPE_ID_FROM varchar(20),
  ROLE_TYPE_ID_TO varchar(20),
  FROM_DATE datetime,
  AGREEMENT_DATE datetime,
  THRU_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE agreement_geographical_applic (
  AGREEMENT_ID varchar(20),
  AGREEMENT_ITEM_SEQ_ID varchar(20),
  GEO_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE agreement_item (
  AGREEMENT_ID varchar(20),
  AGREEMENT_ITEM_SEQ_ID varchar(20),
  AGREEMENT_ITEM_TYPE_ID varchar(20),
  CURRENCY_UOM_ID varchar(20),
  AGREEMENT_TEXT longtext,
  AGREEMENT_IMAGE longblob,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE agreement_item_attribute (
  AGREEMENT_ID varchar(20),
  AGREEMENT_ITEM_SEQ_ID varchar(20),
  ATTR_NAME varchar(60),
  ATTR_VALUE varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE agreement_item_type (
  AGREEMENT_ITEM_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE agreement_item_type_attr (
  AGREEMENT_ITEM_TYPE_ID varchar(20),
  ATTR_NAME varchar(60),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE agreement_party_applic (
  AGREEMENT_ID varchar(20),
  AGREEMENT_ITEM_SEQ_ID varchar(20),
  PARTY_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE agreement_product_appl (
  AGREEMENT_ID varchar(20),
  AGREEMENT_ITEM_SEQ_ID varchar(20),
  PRODUCT_ID varchar(20),
  PRICE decimal(18,3),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  COMMENTS varchar(255)
);

CREATE TABLE agreement_promo_appl (
  AGREEMENT_ID varchar(20),
  AGREEMENT_ITEM_SEQ_ID varchar(20),
  PRODUCT_PROMO_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  SEQUENCE_NUM decimal(20,0),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE agreement_role (
  AGREEMENT_ID varchar(20),
  PARTY_ID varchar(20),
  ROLE_TYPE_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE agreement_term (
  AGREEMENT_TERM_ID varchar(20),
  TERM_TYPE_ID varchar(20),
  AGREEMENT_ID varchar(20),
  AGREEMENT_ITEM_SEQ_ID varchar(20),
  INVOICE_ITEM_TYPE_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  TERM_VALUE decimal(18,3),
  TERM_DAYS decimal(20,0),
  TEXT_VALUE varchar(255),
  MIN_QUANTITY decimal(18,6),
  MAX_QUANTITY decimal(18,6),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE agreement_term_attribute (
  AGREEMENT_TERM_ID varchar(20),
  ATTR_NAME varchar(60),
  ATTR_VALUE varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE agreement_type (
  AGREEMENT_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE agreement_type_attr (
  AGREEMENT_TYPE_ID varchar(20),
  ATTR_NAME varchar(60),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE agreement_work_effort_applic (
  AGREEMENT_ID varchar(20),
  AGREEMENT_ITEM_SEQ_ID varchar(20),
  WORK_EFFORT_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE agreement_workeffort_appl (
  AGREEMENT_ID varchar(20),
  AGREEMENT_ITEM_SEQ_ID varchar(20),
  WORK_EFFORT_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE approval (
  APPROVAL_ID varchar(20),
  APPROVAL_TYPE_ID varchar(20),
  SEQUENCE_NUM decimal(20,0),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE approval_type (
  APPROVAL_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE billing_account (
  BILLING_ACCOUNT_ID varchar(20),
  ACCOUNT_LIMIT decimal(18,2),
  ACCOUNT_CURRENCY_UOM_ID varchar(20),
  CONTACT_MECH_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  DESCRIPTION varchar(255),
  EXTERNAL_ACCOUNT_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE billing_account_role (
  BILLING_ACCOUNT_ID varchar(20),
  PARTY_ID varchar(20),
  ROLE_TYPE_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE billing_account_term (
  BILLING_ACCOUNT_TERM_ID varchar(20),
  BILLING_ACCOUNT_ID varchar(20),
  TERM_TYPE_ID varchar(20),
  TERM_VALUE decimal(18,2),
  TERM_DAYS decimal(20,0),
  UOM_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE billing_account_term_attr (
  BILLING_ACCOUNT_TERM_ID varchar(20),
  ATTR_NAME varchar(60),
  ATTR_VALUE varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE budget (
  BUDGET_ID varchar(20),
  BUDGET_TYPE_ID varchar(20),
  CUSTOM_TIME_PERIOD_ID varchar(20),
  COMMENTS varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE budget_attribute (
  BUDGET_ID varchar(20),
  ATTR_NAME varchar(60),
  ATTR_VALUE varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE budget_item (
  BUDGET_ID varchar(20),
  BUDGET_ITEM_SEQ_ID varchar(20),
  BUDGET_ITEM_TYPE_ID varchar(20),
  AMOUNT decimal(18,2),
  PURPOSE varchar(255),
  JUSTIFICATION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE budget_item_attribute (
  BUDGET_ID varchar(20),
  BUDGET_ITEM_SEQ_ID varchar(20),
  ATTR_NAME varchar(60),
  ATTR_VALUE varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE budget_item_type (
  BUDGET_ITEM_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE budget_item_type_attr (
  BUDGET_ITEM_TYPE_ID varchar(20),
  ATTR_NAME varchar(60),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE budget_review (
  BUDGET_ID varchar(20),
  BUDGET_REVIEW_ID varchar(20),
  PARTY_ID varchar(20),
  BUDGET_REVIEW_RESULT_TYPE_ID varchar(20),
  REVIEW_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE budget_review_result_type (
  BUDGET_REVIEW_RESULT_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  COMMENTS varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE budget_revision (
  BUDGET_ID varchar(20),
  REVISION_SEQ_ID varchar(20),
  DATE_REVISED datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE budget_revision_impact (
  BUDGET_ID varchar(20),
  BUDGET_ITEM_SEQ_ID varchar(20),
  REVISION_SEQ_ID varchar(20),
  REVISED_AMOUNT decimal(18,2),
  ADD_DELETE_FLAG char(1),
  REVISION_REASON varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE budget_role (
  BUDGET_ID varchar(20),
  PARTY_ID varchar(20),
  ROLE_TYPE_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE budget_scenario (
  BUDGET_SCENARIO_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE budget_scenario_application (
  BUDGET_SCENARIO_APPLIC_ID varchar(20),
  BUDGET_SCENARIO_ID varchar(20),
  BUDGET_ID varchar(20),
  BUDGET_ITEM_SEQ_ID varchar(20),
  AMOUNT_CHANGE decimal(18,2),
  PERCENTAGE_CHANGE decimal(18,6),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE budget_scenario_rule (
  BUDGET_SCENARIO_ID varchar(20),
  BUDGET_ITEM_TYPE_ID varchar(20),
  AMOUNT_CHANGE decimal(18,2),
  PERCENTAGE_CHANGE decimal(18,6),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE budget_status (
  BUDGET_ID varchar(20),
  STATUS_ID varchar(20),
  STATUS_DATE datetime,
  COMMENTS varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE budget_type (
  BUDGET_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE budget_type_attr (
  BUDGET_TYPE_ID varchar(20),
  ATTR_NAME varchar(60),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE comm_content_assoc_type (
  COMM_CONTENT_ASSOC_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE comm_event_content_assoc (
  CONTENT_ID varchar(20),
  COMMUNICATION_EVENT_ID varchar(20),
  COMM_CONTENT_ASSOC_TYPE_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  SEQUENCE_NUM decimal(20,0),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE communication_event (
  COMMUNICATION_EVENT_ID varchar(20),
  COMMUNICATION_EVENT_TYPE_ID varchar(20),
  ORIG_COMM_EVENT_ID varchar(20),
  PARENT_COMM_EVENT_ID varchar(20),
  STATUS_ID varchar(20),
  CONTACT_MECH_TYPE_ID varchar(20),
  CONTACT_MECH_ID_FROM varchar(20),
  CONTACT_MECH_ID_TO varchar(20),
  ROLE_TYPE_ID_FROM varchar(20),
  ROLE_TYPE_ID_TO varchar(20),
  PARTY_ID_FROM varchar(20),
  PARTY_ID_TO varchar(20),
  ENTRY_DATE datetime,
  DATETIME_STARTED datetime,
  DATETIME_ENDED datetime,
  SUBJECT varchar(255),
  CONTENT_MIME_TYPE_ID varchar(60),
  CONTENT longtext,
  NOTE varchar(255),
  REASON_ENUM_ID varchar(20),
  CONTACT_LIST_ID varchar(20),
  HEADER_STRING longtext,
  FROM_STRING longtext,
  TO_STRING longtext,
  CC_STRING longtext,
  BCC_STRING longtext,
  MESSAGE_ID varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE communication_event_order (
  ORDER_ID varchar(20),
  COMMUNICATION_EVENT_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE communication_event_product (
  PRODUCT_ID varchar(20),
  COMMUNICATION_EVENT_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE communication_event_prp_typ (
  COMMUNICATION_EVENT_PRP_TYP_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE communication_event_purpose (
  COMMUNICATION_EVENT_PRP_TYP_ID varchar(20),
  COMMUNICATION_EVENT_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE communication_event_role (
  COMMUNICATION_EVENT_ID varchar(20),
  PARTY_ID varchar(20),
  ROLE_TYPE_ID varchar(20),
  CONTACT_MECH_ID varchar(20),
  STATUS_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE communication_event_type (
  COMMUNICATION_EVENT_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  CONTACT_MECH_TYPE_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE communication_event_work_eff (
  WORK_EFFORT_ID varchar(20),
  COMMUNICATION_EVENT_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE cust_request (
  CUST_REQUEST_ID varchar(20),
  CUST_REQUEST_TYPE_ID varchar(20),
  CUST_REQUEST_CATEGORY_ID varchar(20),
  STATUS_ID varchar(20),
  FROM_PARTY_ID varchar(20),
  PRIORITY decimal(20,0),
  CUST_REQUEST_DATE datetime,
  RESPONSE_REQUIRED_DATE datetime,
  CUST_REQUEST_NAME varchar(100),
  DESCRIPTION varchar(255),
  MAXIMUM_AMOUNT_UOM_ID varchar(20),
  PRODUCT_STORE_ID varchar(20),
  SALES_CHANNEL_ENUM_ID varchar(20),
  FULFILL_CONTACT_MECH_ID varchar(20),
  CURRENCY_UOM_ID varchar(20),
  OPEN_DATE_TIME datetime,
  CLOSED_DATE_TIME datetime,
  INTERNAL_COMMENT varchar(255),
  REASON varchar(255),
  CREATED_DATE datetime,
  CREATED_BY_USER_LOGIN varchar(250),
  LAST_MODIFIED_DATE datetime,
  LAST_MODIFIED_BY_USER_LOGIN varchar(250),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE cust_request_attribute (
  CUST_REQUEST_ID varchar(20),
  ATTR_NAME varchar(60),
  ATTR_VALUE varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE cust_request_category (
  CUST_REQUEST_CATEGORY_ID varchar(20),
  CUST_REQUEST_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE cust_request_comm_event (
  CUST_REQUEST_ID varchar(20),
  COMMUNICATION_EVENT_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE cust_request_content (
  CUST_REQUEST_ID varchar(20),
  CONTENT_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE cust_request_item (
  CUST_REQUEST_ID varchar(20),
  CUST_REQUEST_ITEM_SEQ_ID varchar(20),
  CUST_REQUEST_RESOLUTION_ID varchar(20),
  STATUS_ID varchar(20),
  PRIORITY decimal(20,0),
  SEQUENCE_NUM decimal(20,0),
  REQUIRED_BY_DATE datetime,
  PRODUCT_ID varchar(20),
  QUANTITY decimal(18,6),
  SELECTED_AMOUNT decimal(18,6),
  MAXIMUM_AMOUNT decimal(18,2),
  RESERV_START datetime,
  RESERV_LENGTH decimal(18,6),
  RESERV_PERSONS decimal(18,6),
  CONFIG_ID varchar(20),
  DESCRIPTION varchar(255),
  STORY longtext,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE cust_request_item_note (
  CUST_REQUEST_ID varchar(20),
  CUST_REQUEST_ITEM_SEQ_ID varchar(20),
  NOTE_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE cust_request_item_work_effort (
  CUST_REQUEST_ID varchar(20),
  CUST_REQUEST_ITEM_SEQ_ID varchar(20),
  WORK_EFFORT_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE cust_request_note (
  CUST_REQUEST_ID varchar(20),
  NOTE_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE cust_request_party (
  CUST_REQUEST_ID varchar(20),
  PARTY_ID varchar(20),
  ROLE_TYPE_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE cust_request_resolution (
  CUST_REQUEST_RESOLUTION_ID varchar(20),
  CUST_REQUEST_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE cust_request_role (
  CUST_REQUEST_ID varchar(20),
  PARTY_ID varchar(20),
  ROLE_TYPE_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE cust_request_status (
  CUST_REQUEST_STATUS_ID varchar(20),
  STATUS_ID varchar(20),
  CUST_REQUEST_ID varchar(20),
  CUST_REQUEST_ITEM_SEQ_ID varchar(20),
  STATUS_DATETIME datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE cust_request_type (
  CUST_REQUEST_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  PARTY_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE cust_request_type_attr (
  CUST_REQUEST_TYPE_ID varchar(20),
  ATTR_NAME varchar(60),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE cust_request_work_effort (
  CUST_REQUEST_ID varchar(20),
  WORK_EFFORT_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE custom_time_period (
  CUSTOM_TIME_PERIOD_ID varchar(20),
  PARENT_PERIOD_ID varchar(20),
  PERIOD_TYPE_ID varchar(20),
  PERIOD_NUM decimal(20,0),
  PERIOD_NAME varchar(100),
  FROM_DATE date,
  THRU_DATE date,
  IS_CLOSED char(1),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  ORGANIZATION_PARTY_ID varchar(20)
);

CREATE TABLE enumeration (
  ENUM_ID varchar(20),
  ENUM_TYPE_ID varchar(20),
  ENUM_CODE varchar(60),
  SEQUENCE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE enumeration_type (
  ENUM_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE fin_account (
  FIN_ACCOUNT_ID varchar(20),
  FIN_ACCOUNT_TYPE_ID varchar(20),
  STATUS_ID varchar(20),
  FIN_ACCOUNT_NAME varchar(100),
  FIN_ACCOUNT_CODE varchar(255),
  FIN_ACCOUNT_PIN varchar(255),
  CURRENCY_UOM_ID varchar(20),
  ORGANIZATION_PARTY_ID varchar(20),
  OWNER_PARTY_ID varchar(20),
  POST_TO_GL_ACCOUNT_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  IS_REFUNDABLE char(1),
  REPLENISH_PAYMENT_ID varchar(20),
  REPLENISH_LEVEL decimal(18,2),
  ACTUAL_BALANCE decimal(18,2),
  AVAILABLE_BALANCE decimal(18,2),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE fin_account_attribute (
  FIN_ACCOUNT_ID varchar(20),
  ATTR_NAME varchar(60),
  ATTR_VALUE varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE fin_account_auth (
  FIN_ACCOUNT_AUTH_ID varchar(20),
  FIN_ACCOUNT_ID varchar(20),
  AMOUNT decimal(18,2),
  CURRENCY_UOM_ID varchar(20),
  AUTHORIZATION_DATE datetime,
  FROM_DATE datetime,
  THRU_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE fin_account_role (
  FIN_ACCOUNT_ID varchar(20),
  PARTY_ID varchar(20),
  ROLE_TYPE_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE fin_account_status (
  FIN_ACCOUNT_ID varchar(20),
  STATUS_ID varchar(20),
  STATUS_DATE datetime,
  STATUS_END_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE fin_account_trans (
  FIN_ACCOUNT_TRANS_ID varchar(20),
  FIN_ACCOUNT_TRANS_TYPE_ID varchar(20),
  FIN_ACCOUNT_ID varchar(20),
  PARTY_ID varchar(20),
  GL_RECONCILIATION_ID varchar(20),
  TRANSACTION_DATE datetime,
  ENTRY_DATE datetime,
  AMOUNT decimal(18,2),
  PAYMENT_ID varchar(20),
  ORDER_ID varchar(20),
  ORDER_ITEM_SEQ_ID varchar(20),
  PERFORMED_BY_PARTY_ID varchar(20),
  REASON_ENUM_ID varchar(20),
  COMMENTS varchar(255),
  STATUS_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE fin_account_trans_attribute (
  FIN_ACCOUNT_TRANS_ID varchar(20),
  ATTR_NAME varchar(60),
  ATTR_VALUE varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE fin_account_trans_type (
  FIN_ACCOUNT_TRANS_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE fin_account_trans_type_attr (
  FIN_ACCOUNT_TRANS_TYPE_ID varchar(20),
  ATTR_NAME varchar(60),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE fin_account_type (
  FIN_ACCOUNT_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  REPLENISH_ENUM_ID varchar(20),
  IS_REFUNDABLE char(1),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE fin_account_type_attr (
  FIN_ACCOUNT_TYPE_ID varchar(20),
  ATTR_NAME varchar(60),
  ATTR_VALUE varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE fin_account_type_gl_account (
  FIN_ACCOUNT_TYPE_ID varchar(20),
  ORGANIZATION_PARTY_ID varchar(20),
  GL_ACCOUNT_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE geo (
  GEO_ID varchar(20),
  GEO_TYPE_ID varchar(20),
  GEO_NAME varchar(100),
  GEO_CODE varchar(60),
  GEO_SEC_CODE varchar(60),
  ABBREVIATION varchar(60),
  WELL_KNOWN_TEXT longtext,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE geo_assoc (
  GEO_ID varchar(20),
  GEO_ID_TO varchar(20),
  GEO_ASSOC_TYPE_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE geo_assoc_type (
  GEO_ASSOC_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE geo_point (
  GEO_POINT_ID varchar(20),
  DATA_SOURCE_ID varchar(20),
  LATITUDE decimal(18,6),
  LONGITUDE decimal(18,6),
  ELEVATION decimal(18,6),
  ELEVATION_UOM_ID varchar(20),
  INFORMATION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE geo_type (
  GEO_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE gl_account (
  GL_ACCOUNT_ID varchar(20),
  GL_ACCOUNT_TYPE_ID varchar(20),
  GL_ACCOUNT_CLASS_ID varchar(20),
  GL_RESOURCE_TYPE_ID varchar(20),
  GL_XBRL_CLASS_ID varchar(20),
  PARENT_GL_ACCOUNT_ID varchar(20),
  ACCOUNT_CODE varchar(100),
  ACCOUNT_NAME varchar(100),
  DESCRIPTION varchar(255),
  PRODUCT_ID varchar(20),
  POSTED_BALANCE decimal(18,2),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  EXTERNAL_ID varchar(20)
);

CREATE TABLE gl_account_category (
  GL_ACCOUNT_CATEGORY_ID varchar(20),
  GL_ACCOUNT_CATEGORY_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE gl_account_category_member (
  GL_ACCOUNT_ID varchar(20),
  GL_ACCOUNT_CATEGORY_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  AMOUNT_PERCENTAGE decimal(18,6),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE gl_account_category_type (
  GL_ACCOUNT_CATEGORY_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE gl_account_class (
  GL_ACCOUNT_CLASS_ID varchar(20),
  PARENT_CLASS_ID varchar(20),
  DESCRIPTION varchar(255),
  IS_ASSET_CLASS char(1),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE gl_account_group (
  GL_ACCOUNT_GROUP_ID varchar(20),
  GL_ACCOUNT_GROUP_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE gl_account_group_member (
  GL_ACCOUNT_ID varchar(20),
  GL_ACCOUNT_GROUP_TYPE_ID varchar(20),
  GL_ACCOUNT_GROUP_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE gl_account_group_type (
  GL_ACCOUNT_GROUP_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE gl_account_history (
  GL_ACCOUNT_ID varchar(20),
  ORGANIZATION_PARTY_ID varchar(20),
  CUSTOM_TIME_PERIOD_ID varchar(20),
  POSTED_DEBITS decimal(18,2),
  POSTED_CREDITS decimal(18,2),
  ENDING_BALANCE decimal(18,2),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE gl_account_organization (
  GL_ACCOUNT_ID varchar(20),
  ORGANIZATION_PARTY_ID varchar(20),
  ROLE_TYPE_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  POSTED_BALANCE decimal(18,2),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE gl_account_role (
  GL_ACCOUNT_ID varchar(20),
  PARTY_ID varchar(20),
  ROLE_TYPE_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE gl_account_type (
  GL_ACCOUNT_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE gl_account_type_default (
  GL_ACCOUNT_TYPE_ID varchar(20),
  ORGANIZATION_PARTY_ID varchar(20),
  GL_ACCOUNT_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE gl_budget_xref (
  GL_ACCOUNT_ID varchar(20),
  BUDGET_ITEM_TYPE_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  ALLOCATION_PERCENTAGE decimal(18,6),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE gl_fiscal_type (
  GL_FISCAL_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE gl_journal (
  GL_JOURNAL_ID varchar(20),
  GL_JOURNAL_NAME varchar(100),
  ORGANIZATION_PARTY_ID varchar(20),
  IS_POSTED char(1),
  POSTED_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE gl_reconciliation (
  GL_RECONCILIATION_ID varchar(20),
  GL_RECONCILIATION_NAME varchar(100),
  DESCRIPTION varchar(255),
  CREATED_BY_USER_LOGIN varchar(250),
  LAST_MODIFIED_BY_USER_LOGIN varchar(250),
  GL_ACCOUNT_ID varchar(20),
  ORGANIZATION_PARTY_ID varchar(20),
  RECONCILED_BALANCE decimal(18,2),
  RECONCILED_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  STATUS_ID varchar(20),
  OPENING_BALANCE decimal(18,2)
);

CREATE TABLE gl_reconciliation_entry (
  GL_RECONCILIATION_ID varchar(20),
  ACCTG_TRANS_ID varchar(20),
  ACCTG_TRANS_ENTRY_SEQ_ID varchar(20),
  RECONCILED_AMOUNT decimal(18,2),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE gl_resource_type (
  GL_RESOURCE_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE gl_xbrl_class (
  GL_XBRL_CLASS_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE invoice (
  INVOICE_ID varchar(20),
  INVOICE_TYPE_ID varchar(20),
  PARTY_ID_FROM varchar(20),
  PARTY_ID varchar(20),
  ROLE_TYPE_ID varchar(20),
  STATUS_ID varchar(20),
  BILLING_ACCOUNT_ID varchar(20),
  CONTACT_MECH_ID varchar(20),
  INVOICE_DATE datetime,
  DUE_DATE datetime,
  PAID_DATE datetime,
  INVOICE_MESSAGE varchar(255),
  REFERENCE_NUMBER varchar(60),
  DESCRIPTION varchar(255),
  CURRENCY_UOM_ID varchar(20),
  RECURRENCE_INFO_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  EXTERNAL_ID varchar(60)
);

CREATE TABLE invoice_attribute (
  INVOICE_ID varchar(20),
  ATTR_NAME varchar(60),
  ATTR_VALUE varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE invoice_contact_mech (
  INVOICE_ID varchar(20),
  CONTACT_MECH_PURPOSE_TYPE_ID varchar(20),
  CONTACT_MECH_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE invoice_item (
  INVOICE_ID varchar(20),
  INVOICE_ITEM_SEQ_ID varchar(20),
  INVOICE_ITEM_TYPE_ID varchar(20),
  OVERRIDE_GL_ACCOUNT_ID varchar(20),
  OVERRIDE_ORG_PARTY_ID varchar(20),
  INVENTORY_ITEM_ID varchar(20),
  PRODUCT_ID varchar(20),
  PRODUCT_FEATURE_ID varchar(20),
  PARENT_INVOICE_ID varchar(20),
  PARENT_INVOICE_ITEM_SEQ_ID varchar(20),
  UOM_ID varchar(20),
  TAXABLE_FLAG char(1),
  QUANTITY decimal(18,6),
  AMOUNT decimal(18,3),
  DESCRIPTION varchar(255),
  TAX_AUTH_PARTY_ID varchar(20),
  TAX_AUTH_GEO_ID varchar(20),
  TAX_AUTHORITY_RATE_SEQ_ID varchar(20),
  SALES_OPPORTUNITY_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE invoice_item_assoc (
  INVOICE_ID_FROM varchar(20),
  INVOICE_ITEM_SEQ_ID_FROM varchar(20),
  INVOICE_ID_TO varchar(20),
  INVOICE_ITEM_SEQ_ID_TO varchar(20),
  INVOICE_ITEM_ASSOC_TYPE_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  PARTY_ID_FROM varchar(20),
  PARTY_ID_TO varchar(20),
  QUANTITY decimal(18,6),
  AMOUNT decimal(18,2),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE invoice_item_assoc_type (
  INVOICE_ITEM_ASSOC_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE invoice_item_attribute (
  INVOICE_ID varchar(20),
  INVOICE_ITEM_SEQ_ID varchar(20),
  ATTR_NAME varchar(60),
  ATTR_VALUE varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE invoice_item_type (
  INVOICE_ITEM_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  DEFAULT_GL_ACCOUNT_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE invoice_item_type_attr (
  INVOICE_ITEM_TYPE_ID varchar(20),
  ATTR_NAME varchar(60),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE invoice_item_type_gl_account (
  INVOICE_ITEM_TYPE_ID varchar(20),
  ORGANIZATION_PARTY_ID varchar(20),
  GL_ACCOUNT_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE invoice_item_type_map (
  INVOICE_ITEM_MAP_KEY varchar(20),
  INVOICE_TYPE_ID varchar(20),
  INVOICE_ITEM_TYPE_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE invoice_role (
  INVOICE_ID varchar(20),
  PARTY_ID varchar(20),
  ROLE_TYPE_ID varchar(20),
  DATETIME_PERFORMED datetime,
  PERCENTAGE decimal(18,6),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE invoice_status (
  STATUS_ID varchar(20),
  INVOICE_ID varchar(20),
  STATUS_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE invoice_term (
  INVOICE_TERM_ID varchar(20),
  TERM_TYPE_ID varchar(20),
  INVOICE_ID varchar(20),
  INVOICE_ITEM_SEQ_ID varchar(20),
  TERM_VALUE decimal(18,2),
  TERM_DAYS decimal(20,0),
  TEXT_VALUE varchar(255),
  DESCRIPTION varchar(255),
  UOM_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE invoice_term_attribute (
  INVOICE_TERM_ID varchar(20),
  ATTR_NAME varchar(60),
  ATTR_VALUE varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE invoice_type (
  INVOICE_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE invoice_type_attr (
  INVOICE_TYPE_ID varchar(20),
  ATTR_NAME varchar(60),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE marketing_campaign (
  MARKETING_CAMPAIGN_ID varchar(20),
  PARENT_CAMPAIGN_ID varchar(20),
  STATUS_ID varchar(20),
  CAMPAIGN_NAME varchar(100),
  CAMPAIGN_SUMMARY longtext,
  BUDGETED_COST decimal(18,2),
  ACTUAL_COST decimal(18,2),
  ESTIMATED_COST decimal(18,2),
  CURRENCY_UOM_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  IS_ACTIVE char(1),
  CONVERTED_LEADS varchar(20),
  EXPECTED_RESPONSE_PERCENT decimal(18,6),
  EXPECTED_REVENUE decimal(18,2),
  NUM_SENT decimal(20,0),
  START_DATE datetime,
  CREATED_BY_USER_LOGIN varchar(250),
  LAST_MODIFIED_BY_USER_LOGIN varchar(250),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE marketing_campaign_note (
  MARKETING_CAMPAIGN_ID varchar(20),
  NOTE_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE marketing_campaign_price (
  MARKETING_CAMPAIGN_ID varchar(20),
  PRODUCT_PRICE_RULE_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE marketing_campaign_promo (
  MARKETING_CAMPAIGN_ID varchar(20),
  PRODUCT_PROMO_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE marketing_campaign_role (
  MARKETING_CAMPAIGN_ID varchar(20),
  PARTY_ID varchar(20),
  ROLE_TYPE_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE order_adjustment (
  ORDER_ADJUSTMENT_ID varchar(20),
  ORDER_ADJUSTMENT_TYPE_ID varchar(20),
  ORDER_ID varchar(20),
  ORDER_ITEM_SEQ_ID varchar(20),
  SHIP_GROUP_SEQ_ID varchar(20),
  COMMENTS varchar(255),
  DESCRIPTION varchar(255),
  AMOUNT decimal(18,3),
  RECURRING_AMOUNT decimal(18,3),
  PRODUCT_PROMO_ID varchar(20),
  PRODUCT_PROMO_RULE_ID varchar(20),
  PRODUCT_PROMO_ACTION_SEQ_ID varchar(20),
  PRODUCT_FEATURE_ID varchar(20),
  CORRESPONDING_PRODUCT_ID varchar(20),
  TAX_AUTHORITY_RATE_SEQ_ID varchar(20),
  SOURCE_REFERENCE_ID varchar(60),
  SOURCE_PERCENTAGE decimal(18,6),
  CUSTOMER_REFERENCE_ID varchar(60),
  PRIMARY_GEO_ID varchar(20),
  SECONDARY_GEO_ID varchar(20),
  EXEMPT_AMOUNT decimal(18,2),
  TAX_AUTH_GEO_ID varchar(20),
  TAX_AUTH_PARTY_ID varchar(20),
  OVERRIDE_GL_ACCOUNT_ID varchar(20),
  INCLUDE_IN_TAX char(1),
  INCLUDE_IN_SHIPPING char(1),
  CREATED_DATE datetime,
  CREATED_BY_USER_LOGIN varchar(250),
  ORIGINAL_ADJUSTMENT_ID varchar(20),
  AMOUNT_PER_QUANTITY decimal(18,2),
  PERCENTAGE decimal(18,6),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE order_adjustment_attribute (
  ORDER_ADJUSTMENT_ID varchar(20),
  ATTR_NAME varchar(60),
  ATTR_VALUE varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE order_adjustment_billing (
  ORDER_ADJUSTMENT_ID varchar(20),
  INVOICE_ID varchar(20),
  INVOICE_ITEM_SEQ_ID varchar(20),
  AMOUNT decimal(18,2),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE order_adjustment_type (
  ORDER_ADJUSTMENT_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE order_adjustment_type_attr (
  ORDER_ADJUSTMENT_TYPE_ID varchar(20),
  ATTR_NAME varchar(60),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE order_attribute (
  ORDER_ID varchar(20),
  ATTR_NAME varchar(60),
  ATTR_VALUE varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE order_blacklist (
  BLACKLIST_STRING varchar(255),
  ORDER_BLACKLIST_TYPE_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE order_blacklist_type (
  ORDER_BLACKLIST_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE order_contact_mech (
  ORDER_ID varchar(20),
  CONTACT_MECH_PURPOSE_TYPE_ID varchar(20),
  CONTACT_MECH_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE order_content (
  ORDER_ID varchar(20),
  ORDER_ITEM_SEQ_ID varchar(20),
  CONTENT_ID varchar(20),
  ORDER_CONTENT_TYPE_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  IS_MANDATORY varchar(20),
  IS_PUBLIC char(1)
);

CREATE TABLE order_content_type (
  ORDER_CONTENT_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE order_delivery_schedule (
  ORDER_ID varchar(20),
  ORDER_ITEM_SEQ_ID varchar(20),
  ESTIMATED_READY_DATE datetime,
  CARTONS decimal(20,0),
  SKIDS_PALLETS decimal(20,0),
  UNITS_PIECES decimal(18,6),
  TOTAL_CUBIC_SIZE decimal(18,6),
  TOTAL_CUBIC_UOM_ID varchar(20),
  TOTAL_WEIGHT decimal(18,6),
  TOTAL_WEIGHT_UOM_ID varchar(20),
  STATUS_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE order_finished_goods_shipment (
  ORDER_ID varchar(20),
  SHIPMENT_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE order_header (
  ORDER_ID varchar(20),
  ORDER_TYPE_ID varchar(20),
  ORDER_NAME varchar(100),
  EXTERNAL_ID varchar(20),
  SALES_CHANNEL_ENUM_ID varchar(20),
  ORDER_DATE datetime,
  PRIORITY char(1),
  ENTRY_DATE datetime,
  PICK_SHEET_PRINTED_DATE datetime,
  VISIT_ID varchar(20),
  STATUS_ID varchar(20),
  CREATED_BY varchar(250),
  FIRST_ATTEMPT_ORDER_ID varchar(20),
  CURRENCY_UOM varchar(20),
  SYNC_STATUS_ID varchar(20),
  BILLING_ACCOUNT_ID varchar(20),
  ORIGIN_FACILITY_ID varchar(20),
  WEB_SITE_ID varchar(20),
  PRODUCT_STORE_ID varchar(20),
  TERMINAL_ID varchar(60),
  TRANSACTION_ID varchar(60),
  AUTO_ORDER_SHOPPING_LIST_ID varchar(20),
  NEEDS_INVENTORY_ISSUANCE char(1),
  IS_RUSH_ORDER char(1),
  INTERNAL_CODE varchar(60),
  REMAINING_SUB_TOTAL decimal(18,2),
  GRAND_TOTAL decimal(18,2),
  IS_VIEWED char(1),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  WORK_EFFORT_ID varchar(20),
  OVERRIDE_CREDIT_LIMIT char(1)
);

CREATE TABLE order_header_work_effort (
  ORDER_ID varchar(20),
  WORK_EFFORT_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE order_inventory_item_appl (
  ORDER_ID varchar(20),
  ORDER_ITEM_SEQ_ID varchar(20),
  INVENTORY_ITEM_SEQ_ID varchar(20),
  INVENTORY_ITEM_ID varchar(20),
  STATUS_ID varchar(20),
  QUANTITY decimal(18,6),
  AMOUNT_CONSUMED decimal(18,6),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE order_item (
  ORDER_ID varchar(20),
  ORDER_ITEM_SEQ_ID varchar(20),
  EXTERNAL_ID varchar(20),
  ORDER_ITEM_TYPE_ID varchar(20),
  ORDER_ITEM_GROUP_SEQ_ID varchar(20),
  IS_ITEM_GROUP_PRIMARY char(1),
  FROM_INVENTORY_ITEM_ID varchar(20),
  BUDGET_ID varchar(20),
  BUDGET_ITEM_SEQ_ID varchar(20),
  PRODUCT_ID varchar(20),
  PRODUCT_FEATURE_ID varchar(20),
  PROD_CATALOG_ID varchar(20),
  PRODUCT_CATEGORY_ID varchar(20),
  IS_PROMO char(1),
  QUOTE_ID varchar(20),
  QUOTE_ITEM_SEQ_ID varchar(20),
  SHOPPING_LIST_ID varchar(20),
  SHOPPING_LIST_ITEM_SEQ_ID varchar(20),
  SUBSCRIPTION_ID varchar(20),
  DEPLOYMENT_ID varchar(20),
  QUANTITY decimal(18,6),
  CANCEL_QUANTITY decimal(18,6),
  SELECTED_AMOUNT decimal(18,6),
  UNIT_PRICE decimal(18,3),
  UNIT_LIST_PRICE decimal(18,3),
  UNIT_AVERAGE_COST decimal(18,3),
  UNIT_RECURRING_PRICE decimal(18,3),
  IS_MODIFIED_PRICE char(1),
  RECURRING_FREQ_UOM_ID varchar(20),
  ITEM_DESCRIPTION varchar(255),
  COMMENTS varchar(255),
  CORRESPONDING_PO_ID varchar(20),
  STATUS_ID varchar(20),
  SYNC_STATUS_ID varchar(20),
  ESTIMATED_SHIP_DATE datetime,
  ESTIMATED_DELIVERY_DATE datetime,
  AUTO_CANCEL_DATE datetime,
  DONT_CANCEL_SET_DATE datetime,
  DONT_CANCEL_SET_USER_LOGIN varchar(250),
  SHIP_BEFORE_DATE datetime,
  SHIP_AFTER_DATE datetime,
  CANCEL_BACK_ORDER_DATE datetime,
  OVERRIDE_GL_ACCOUNT_ID varchar(20),
  SALES_OPPORTUNITY_ID varchar(20),
  CHANGE_BY_USER_LOGIN_ID varchar(250),
  QA_APPROVED char(1),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  QA_OVERRIDE_PARTY_ID varchar(20),
  QA_OVERRIDE char(1),
  QA_OVERRIDE_VALID_FROM datetime,
  QA_OVERRIDE_VALID_THRU datetime,
  INITIAL_DELIVERY_DATE datetime,
  QA_OVERRIDE_NOTE varchar(255),
  SUPPLIER_PRODUCT_ID varchar(20),
  INV_AUTH_ENUM_ID varchar(20),
  MLTR_USE_AUTH char(1),
  COMM_USE_AUTH char(1),
  MRGT_AUTH char(1),
  MRSL_AUTH char(1),
  PROP_REP_AUTH char(1),
  PRIORITY_CODE varchar(20)
);

CREATE TABLE order_item_assoc (
  ORDER_ID varchar(20),
  ORDER_ITEM_SEQ_ID varchar(20),
  SHIP_GROUP_SEQ_ID varchar(20),
  TO_ORDER_ID varchar(20),
  TO_ORDER_ITEM_SEQ_ID varchar(20),
  TO_SHIP_GROUP_SEQ_ID varchar(20),
  ORDER_ITEM_ASSOC_TYPE_ID varchar(20),
  QUANTITY decimal(18,6),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE order_item_assoc_type (
  ORDER_ITEM_ASSOC_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE order_item_association (
  SALES_ORDER_ID varchar(20),
  SO_ITEM_SEQ_ID varchar(20),
  PURCHASE_ORDER_ID varchar(20),
  PO_ITEM_SEQ_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE order_item_attribute (
  ORDER_ID varchar(20),
  ORDER_ITEM_SEQ_ID varchar(20),
  ATTR_NAME varchar(60),
  ATTR_VALUE varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE order_item_billing (
  ORDER_ID varchar(20),
  ORDER_ITEM_SEQ_ID varchar(20),
  INVOICE_ID varchar(20),
  INVOICE_ITEM_SEQ_ID varchar(20),
  ITEM_ISSUANCE_ID varchar(20),
  SHIPMENT_RECEIPT_ID varchar(20),
  QUANTITY decimal(18,6),
  AMOUNT decimal(18,2),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE order_item_change (
  ORDER_ITEM_CHANGE_ID varchar(20),
  ORDER_ID varchar(20),
  ORDER_ITEM_SEQ_ID varchar(20),
  CHANGE_TYPE_ENUM_ID varchar(20),
  CHANGE_DATETIME datetime,
  CHANGE_USER_LOGIN varchar(250),
  QUANTITY decimal(18,6),
  CANCEL_QUANTITY decimal(18,6),
  UNIT_PRICE decimal(18,2),
  ITEM_DESCRIPTION varchar(255),
  REASON_ENUM_ID varchar(20),
  CHANGE_COMMENTS varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE order_item_contact_mech (
  ORDER_ID varchar(20),
  ORDER_ITEM_SEQ_ID varchar(20),
  CONTACT_MECH_PURPOSE_TYPE_ID varchar(20),
  CONTACT_MECH_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE order_item_group (
  ORDER_ID varchar(20),
  ORDER_ITEM_GROUP_SEQ_ID varchar(20),
  PARENT_GROUP_SEQ_ID varchar(20),
  GROUP_NAME varchar(100),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE order_item_inventory_res (
  ORDER_ID varchar(20),
  ORDER_ITEM_SEQ_ID varchar(20),
  INVENTORY_ITEM_ID varchar(20),
  RESERVE_ORDER_ENUM_ID varchar(20),
  QUANTITY decimal(18,6),
  QUANTITY_NOT_AVAILABLE decimal(18,6),
  RESERVED_DATETIME datetime,
  CREATED_DATETIME datetime,
  PROMISED_DATETIME datetime,
  CURRENT_PROMISED_DATE datetime,
  PICK_START_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE order_item_note (
  ORDER_ID varchar(20),
  ORDER_ITEM_SEQ_ID varchar(20),
  NOTE_ID varchar(20),
  INTERNAL_NOTE char(1),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE order_item_price_info (
  ORDER_ITEM_PRICE_INFO_ID varchar(20),
  ORDER_ID varchar(20),
  ORDER_ITEM_SEQ_ID varchar(20),
  PRODUCT_PRICE_RULE_ID varchar(20),
  PRODUCT_PRICE_ACTION_SEQ_ID varchar(20),
  MODIFY_AMOUNT decimal(18,3),
  DESCRIPTION varchar(255),
  RATE_CODE varchar(60),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE order_item_q_a_override (
  ORDER_ID varchar(20),
  ORDER_ITEM_SEQ_ID varchar(20),
  USER_LOGIN_ID varchar(250),
  NOTE varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE order_item_role (
  ORDER_ID varchar(20),
  ORDER_ITEM_SEQ_ID varchar(20),
  PARTY_ID varchar(20),
  ROLE_TYPE_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE order_item_ship_group (
  ORDER_ID varchar(20),
  SHIP_GROUP_SEQ_ID varchar(20),
  SHIPMENT_METHOD_TYPE_ID varchar(20),
  SUPPLIER_PARTY_ID varchar(20),
  VENDOR_PARTY_ID varchar(20),
  CARRIER_PARTY_ID varchar(20),
  CARRIER_ROLE_TYPE_ID varchar(20),
  FACILITY_ID varchar(20),
  CONTACT_MECH_ID varchar(20),
  TELECOM_CONTACT_MECH_ID varchar(20),
  TRACKING_NUMBER varchar(60),
  SHIPPING_INSTRUCTIONS varchar(255),
  MAY_SPLIT char(1),
  GIFT_MESSAGE varchar(255),
  IS_GIFT char(1),
  SHIP_AFTER_DATE datetime,
  SHIP_BY_DATE datetime,
  ESTIMATED_SHIP_DATE datetime,
  ESTIMATED_DELIVERY_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  CARRIER_ACCOUNT_NUMBER varchar(20),
  CARRIER_SERVICE varchar(100),
  IS_SATURDAY_DELIVERY char(1)
);

CREATE TABLE order_item_ship_group_assoc (
  ORDER_ID varchar(20),
  ORDER_ITEM_SEQ_ID varchar(20),
  SHIP_GROUP_SEQ_ID varchar(20),
  QUANTITY decimal(18,6),
  CANCEL_QUANTITY decimal(18,6),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE order_item_ship_grp_inv_res (
  ORDER_ID varchar(20),
  SHIP_GROUP_SEQ_ID varchar(20),
  ORDER_ITEM_SEQ_ID varchar(20),
  INVENTORY_ITEM_ID varchar(20),
  RESERVE_ORDER_ENUM_ID varchar(20),
  QUANTITY decimal(18,6),
  QUANTITY_NOT_AVAILABLE decimal(18,6),
  RESERVED_DATETIME datetime,
  CREATED_DATETIME datetime,
  PROMISED_DATETIME datetime,
  CURRENT_PROMISED_DATE datetime,
  PRIORITY char(1),
  SEQUENCE_ID decimal(20,0),
  PICK_START_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE order_item_type (
  ORDER_ITEM_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE order_item_type_attr (
  ORDER_ITEM_TYPE_ID varchar(20),
  ATTR_NAME varchar(60),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE order_item_work_effort (
  ORDER_ID varchar(20),
  ORDER_ITEM_SEQ_ID varchar(20),
  WORK_EFFORT_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE order_label (
  ORDER_ID varchar(20),
  ORDER_ITEM_SEQ_ID varchar(20),
  LABEL varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE order_notification (
  ORDER_NOTIFICATION_ID varchar(20),
  ORDER_ID varchar(20),
  EMAIL_TYPE varchar(20),
  COMMENTS varchar(255),
  NOTIFICATION_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE order_payment_preference (
  ORDER_PAYMENT_PREFERENCE_ID varchar(20),
  ORDER_ID varchar(20),
  ORDER_ITEM_SEQ_ID varchar(20),
  SHIP_GROUP_SEQ_ID varchar(20),
  PRODUCT_PRICE_PURPOSE_ID varchar(20),
  PAYMENT_METHOD_TYPE_ID varchar(20),
  PAYMENT_METHOD_ID varchar(20),
  FIN_ACCOUNT_ID varchar(20),
  SECURITY_CODE varchar(255),
  TRACK2 varchar(255),
  PRESENT_FLAG char(1),
  SWIPED_FLAG char(1),
  OVERFLOW_FLAG char(1),
  MAX_AMOUNT decimal(18,2),
  PROCESS_ATTEMPT decimal(20,0),
  BILLING_POSTAL_CODE varchar(60),
  MANUAL_AUTH_CODE varchar(60),
  MANUAL_REF_NUM varchar(60),
  STATUS_ID varchar(20),
  NEEDS_NSF_RETRY char(1),
  CREATED_DATE datetime,
  CREATED_BY_USER_LOGIN varchar(250),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE order_product_promo_code (
  ORDER_ID varchar(20),
  PRODUCT_PROMO_CODE_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE order_requirement_commitment (
  ORDER_ID varchar(20),
  ORDER_ITEM_SEQ_ID varchar(20),
  REQUIREMENT_ID varchar(20),
  QUANTITY decimal(18,6),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE order_role (
  ORDER_ID varchar(20),
  PARTY_ID varchar(20),
  ROLE_TYPE_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE order_shipment (
  ORDER_ID varchar(20),
  ORDER_ITEM_SEQ_ID varchar(20),
  SHIPMENT_ID varchar(20),
  SHIPMENT_ITEM_SEQ_ID varchar(20),
  QUANTITY decimal(18,6),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  SHIP_GROUP_SEQ_ID varchar(20)
);

CREATE TABLE order_shipment_preference (
  ORDER_ID varchar(20),
  ORDER_ITEM_SEQ_ID varchar(20),
  SHIPMENT_METHOD_TYPE_ID varchar(20),
  CARRIER_PARTY_ID varchar(20),
  CARRIER_ROLE_TYPE_ID varchar(20),
  TRACKING_NUMBER varchar(60),
  SHIPPING_INSTRUCTIONS varchar(255),
  MAY_SPLIT char(1),
  GIFT_MESSAGE varchar(255),
  IS_GIFT char(1),
  SHIP_AFTER_DATE datetime,
  SHIP_BEFORE_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE order_status (
  ORDER_STATUS_ID varchar(20),
  STATUS_ID varchar(20),
  ORDER_ID varchar(20),
  ORDER_ITEM_SEQ_ID varchar(20),
  ORDER_PAYMENT_PREFERENCE_ID varchar(20),
  STATUS_DATETIME datetime,
  STATUS_USER_LOGIN varchar(250),
  CHANGE_REASON varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE order_summary_entry (
  ENTRY_DATE date,
  PRODUCT_ID varchar(20),
  FACILITY_ID varchar(20),
  TOTAL_QUANTITY decimal(18,6),
  GROSS_SALES decimal(18,2),
  PRODUCT_COST decimal(18,2),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE order_term (
  TERM_TYPE_ID varchar(20),
  ORDER_ID varchar(20),
  ORDER_ITEM_SEQ_ID varchar(20),
  TERM_VALUE decimal(18,2),
  TERM_DAYS decimal(20,0),
  TEXT_VALUE varchar(255),
  DESCRIPTION varchar(255),
  UOM_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE order_term_attribute (
  TERM_TYPE_ID varchar(20),
  ORDER_ID varchar(20),
  ORDER_ITEM_SEQ_ID varchar(20),
  ATTR_NAME varchar(60),
  ATTR_VALUE varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE order_type (
  ORDER_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE order_type_attr (
  ORDER_TYPE_ID varchar(20),
  ATTR_NAME varchar(60),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE order_work_effort_appl (
  ORDER_ID varchar(20),
  ORDER_ITEM_SEQ_ID varchar(20),
  WORK_EFFORT_ID varchar(20),
  WORK_EFFORT_SEQ_ID varchar(20),
  STATUS_ID varchar(20),
  QUANTITY decimal(18,6),
  SERIAL_NUMBER varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  ORDER_WORK_EFFT_APPL_TYPE_ID varchar(20),
  ASSIGNED_QUANTITY decimal(18,6)
);

CREATE TABLE order_work_effort_appl_type (
  ORDER_WORK_EFFT_APPL_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE pay_pal_payment_method (
  PAYMENT_METHOD_ID varchar(20),
  PAYER_ID varchar(20),
  EXPRESS_CHECKOUT_TOKEN varchar(60),
  PAYER_STATUS varchar(60),
  AVS_ADDR char(1),
  AVS_ZIP char(1),
  CORRELATION_ID varchar(20),
  CONTACT_MECH_ID varchar(20),
  TRANSACTION_ID varchar(60),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE payment (
  PAYMENT_ID varchar(20),
  PAYMENT_TYPE_ID varchar(20),
  PAYMENT_METHOD_TYPE_ID varchar(20),
  PAYMENT_METHOD_ID varchar(20),
  PAYMENT_GATEWAY_RESPONSE_ID varchar(20),
  PAYMENT_PREFERENCE_ID varchar(20),
  PARTY_ID_FROM varchar(20),
  PARTY_ID_TO varchar(20),
  ROLE_TYPE_ID_TO varchar(20),
  STATUS_ID varchar(20),
  EFFECTIVE_DATE datetime,
  PAYMENT_REF_NUM varchar(60),
  AMOUNT decimal(18,2),
  CURRENCY_UOM_ID varchar(20),
  COMMENTS varchar(255),
  FIN_ACCOUNT_TRANS_ID varchar(20),
  OVERRIDE_GL_ACCOUNT_ID varchar(20),
  ACTUAL_CURRENCY_AMOUNT decimal(18,2),
  ACTUAL_CURRENCY_UOM_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE payment_application (
  PAYMENT_APPLICATION_ID varchar(20),
  PAYMENT_ID varchar(20),
  INVOICE_ID varchar(20),
  INVOICE_ITEM_SEQ_ID varchar(20),
  BILLING_ACCOUNT_ID varchar(20),
  OVERRIDE_GL_ACCOUNT_ID varchar(20),
  TO_PAYMENT_ID varchar(20),
  TAX_AUTH_GEO_ID varchar(20),
  AMOUNT_APPLIED decimal(18,2),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE payment_attribute (
  PAYMENT_ID varchar(20),
  ATTR_NAME varchar(60),
  ATTR_VALUE varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE payment_budget_allocation (
  BUDGET_ID varchar(20),
  BUDGET_ITEM_SEQ_ID varchar(20),
  PAYMENT_ID varchar(20),
  AMOUNT decimal(18,2),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE payment_gateway_authorize_net (
  PAYMENT_GATEWAY_CONFIG_ID varchar(20),
  TRANSACTION_URL varchar(255),
  CERTIFICATE_ALIAS varchar(255),
  API_VERSION varchar(60),
  DELIMITED_DATA varchar(60),
  DELIMITER_CHAR varchar(60),
  METHOD varchar(60),
  EMAIL_CUSTOMER varchar(60),
  EMAIL_MERCHANT varchar(60),
  TEST_MODE varchar(60),
  RELAY_RESPONSE varchar(60),
  TRAN_KEY varchar(255),
  USER_ID varchar(255),
  PWD varchar(255),
  TRANS_DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  DUPLICATE_WINDOW decimal(20,0)
);

CREATE TABLE payment_gateway_clear_commerce (
  PAYMENT_GATEWAY_CONFIG_ID varchar(20),
  SOURCE_ID varchar(60),
  GROUP_ID varchar(60),
  CLIENT_ID varchar(60),
  USERNAME varchar(60),
  PWD varchar(255),
  USER_ALIAS varchar(60),
  EFFECTIVE_ALIAS varchar(60),
  PROCESS_MODE char(1),
  SERVER_U_R_L varchar(255),
  ENABLE_C_V_M char(1),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE payment_gateway_config (
  PAYMENT_GATEWAY_CONFIG_ID varchar(20),
  PAYMENT_GATEWAY_CONFIG_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE payment_gateway_config_type (
  PAYMENT_GATEWAY_CONFIG_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE payment_gateway_cyber_source (
  PAYMENT_GATEWAY_CONFIG_ID varchar(20),
  MERCHANT_ID varchar(255),
  API_VERSION varchar(60),
  PRODUCTION varchar(60),
  KEYS_DIR varchar(255),
  KEYS_FILE varchar(255),
  LOG_ENABLED varchar(60),
  LOG_DIR varchar(255),
  LOG_FILE varchar(255),
  LOG_SIZE decimal(20,0),
  MERCHANT_DESCR varchar(255),
  MERCHANT_CONTACT varchar(255),
  AUTO_BILL varchar(60),
  ENABLE_DAV char(1),
  FRAUD_SCORE char(1),
  IGNORE_AVS varchar(60),
  DISABLE_BILL_AVS char(1),
  AVS_DECLINE_CODES varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE payment_gateway_orbital (
  PAYMENT_GATEWAY_CONFIG_ID varchar(20),
  USERNAME varchar(60),
  CONNECTION_PASSWORD varchar(255),
  MERCHANT_ID varchar(255),
  ENGINE_CLASS varchar(255),
  HOST_NAME varchar(255),
  PORT decimal(20,0),
  HOST_NAME_FAILOVER varchar(255),
  PORT_FAILOVER decimal(20,0),
  CONNECTION_TIMEOUT_SECONDS decimal(20,0),
  READ_TIMEOUT_SECONDS decimal(20,0),
  AUTHORIZATION_U_R_I varchar(255),
  SDK_VERSION varchar(60),
  SSL_SOCKET_FACTORY varchar(60),
  RESPONSE_TYPE varchar(60),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE payment_gateway_pay_pal (
  PAYMENT_GATEWAY_CONFIG_ID varchar(20),
  BUSINESS_EMAIL varchar(255),
  NOTIFY_URL varchar(255),
  RETURN_URL varchar(255),
  CANCEL_RETURN_URL varchar(255),
  IMAGE_URL varchar(255),
  CONFIRM_TEMPLATE varchar(255),
  REDIRECT_URL varchar(255),
  CONFIRM_URL varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  API_USER_NAME varchar(60),
  API_PASSWORD varchar(60),
  API_SIGNATURE varchar(60),
  API_ENVIRONMENT varchar(60),
  SHIPPING_CALLBACK_URL varchar(255),
  REQUIRE_CONFIRMED_SHIPPING char(1)
);

CREATE TABLE payment_gateway_payflow_pro (
  PAYMENT_GATEWAY_CONFIG_ID varchar(20),
  CERTS_PATH varchar(255),
  HOST_ADDRESS varchar(255),
  HOST_PORT decimal(20,0),
  TIMEOUT decimal(20,0),
  PROXY_ADDRESS varchar(255),
  PROXY_PORT decimal(20,0),
  PROXY_LOGON varchar(255),
  PROXY_PASSWORD varchar(255),
  VENDOR varchar(60),
  USER_ID varchar(60),
  PWD varchar(255),
  PARTNER varchar(60),
  CHECK_AVS char(1),
  CHECK_CVV2 char(1),
  PRE_AUTH char(1),
  ENABLE_TRANSMIT varchar(255),
  LOG_FILE_NAME varchar(255),
  LOGGING_LEVEL decimal(20,0),
  MAX_LOG_FILE_SIZE decimal(20,0),
  STACK_TRACE_ON char(1),
  REDIRECT_URL varchar(255),
  RETURN_URL varchar(255),
  CANCEL_RETURN_URL varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE payment_gateway_resp_msg (
  PAYMENT_GATEWAY_RESP_MSG_ID varchar(20),
  PAYMENT_GATEWAY_RESPONSE_ID varchar(20),
  PGR_MESSAGE longtext,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE payment_gateway_response (
  PAYMENT_GATEWAY_RESPONSE_ID varchar(20),
  PAYMENT_SERVICE_TYPE_ENUM_ID varchar(20),
  ORDER_PAYMENT_PREFERENCE_ID varchar(20),
  PAYMENT_METHOD_TYPE_ID varchar(20),
  PAYMENT_METHOD_ID varchar(20),
  TRANS_CODE_ENUM_ID varchar(20),
  AMOUNT decimal(18,2),
  CURRENCY_UOM_ID varchar(20),
  REFERENCE_NUM varchar(60),
  ALT_REFERENCE varchar(60),
  SUB_REFERENCE varchar(60),
  GATEWAY_CODE varchar(60),
  GATEWAY_FLAG varchar(60),
  GATEWAY_AVS_RESULT varchar(60),
  GATEWAY_CV_RESULT varchar(60),
  GATEWAY_SCORE_RESULT varchar(60),
  GATEWAY_MESSAGE varchar(255),
  TRANSACTION_DATE datetime,
  RESULT_DECLINED char(1),
  RESULT_NSF char(1),
  RESULT_BAD_EXPIRE char(1),
  RESULT_BAD_CARD_NUMBER char(1),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE payment_gateway_sage_pay (
  PAYMENT_GATEWAY_CONFIG_ID varchar(20),
  VENDOR varchar(60),
  PRODUCTION_HOST varchar(60),
  TESTING_HOST varchar(60),
  SAGE_PAY_MODE varchar(60),
  PROTOCOL_VERSION varchar(10),
  AUTHENTICATION_TRANS_TYPE varchar(60),
  AUTHENTICATION_URL varchar(255),
  AUTHORISE_TRANS_TYPE varchar(60),
  AUTHORISE_URL varchar(255),
  RELEASE_TRANS_TYPE varchar(60),
  RELEASE_URL varchar(255),
  VOID_URL varchar(255),
  REFUND_URL varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE payment_gateway_world_pay (
  PAYMENT_GATEWAY_CONFIG_ID varchar(20),
  REDIRECT_URL varchar(255),
  INST_ID varchar(255),
  AUTH_MODE char(1),
  FIX_CONTACT char(1),
  HIDE_CONTACT char(1),
  HIDE_CURRENCY char(1),
  LANG_ID varchar(60),
  NO_LANGUAGE_MENU char(1),
  WITH_DELIVERY char(1),
  TEST_MODE decimal(20,0),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE payment_gl_account_type_map (
  PAYMENT_TYPE_ID varchar(20),
  ORGANIZATION_PARTY_ID varchar(20),
  GL_ACCOUNT_TYPE_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE payment_group (
  PAYMENT_GROUP_ID varchar(20),
  PAYMENT_GROUP_TYPE_ID varchar(20),
  PAYMENT_GROUP_NAME varchar(100),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE payment_group_member (
  PAYMENT_GROUP_ID varchar(20),
  PAYMENT_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  SEQUENCE_NUM decimal(20,0),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE payment_group_type (
  PAYMENT_GROUP_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE payment_method (
  PAYMENT_METHOD_ID varchar(20),
  PAYMENT_METHOD_TYPE_ID varchar(20),
  PARTY_ID varchar(20),
  GL_ACCOUNT_ID varchar(20),
  DESCRIPTION varchar(255),
  FROM_DATE datetime,
  THRU_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  FIN_ACCOUNT_ID varchar(20)
);

CREATE TABLE payment_method_type (
  PAYMENT_METHOD_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  DEFAULT_GL_ACCOUNT_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE payment_method_type_gl_account (
  PAYMENT_METHOD_TYPE_ID varchar(20),
  ORGANIZATION_PARTY_ID varchar(20),
  GL_ACCOUNT_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE payment_type (
  PAYMENT_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE payment_type_attr (
  PAYMENT_TYPE_ID varchar(20),
  ATTR_NAME varchar(60),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE period_type (
  PERIOD_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  PERIOD_LENGTH decimal(20,0),
  UOM_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE prod_catalog (
  PROD_CATALOG_ID varchar(20),
  CATALOG_NAME varchar(100),
  USE_QUICK_ADD char(1),
  STYLE_SHEET varchar(255),
  HEADER_LOGO varchar(255),
  CONTENT_PATH_PREFIX varchar(255),
  TEMPLATE_PATH_PREFIX varchar(255),
  VIEW_ALLOW_PERM_REQD char(1),
  PURCHASE_ALLOW_PERM_REQD char(1),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE prod_catalog_category (
  PROD_CATALOG_ID varchar(20),
  PRODUCT_CATEGORY_ID varchar(20),
  PROD_CATALOG_CATEGORY_TYPE_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  SEQUENCE_NUM decimal(20,0),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE prod_catalog_category_type (
  PROD_CATALOG_CATEGORY_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE prod_catalog_inv_facility (
  PROD_CATALOG_ID varchar(20),
  FACILITY_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  SEQUENCE_NUM decimal(20,0),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE prod_catalog_role (
  PARTY_ID varchar(20),
  ROLE_TYPE_ID varchar(20),
  PROD_CATALOG_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  SEQUENCE_NUM decimal(20,0),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE quote (
  QUOTE_ID varchar(20),
  QUOTE_TYPE_ID varchar(20),
  PARTY_ID varchar(20),
  ISSUE_DATE datetime,
  STATUS_ID varchar(20),
  CURRENCY_UOM_ID varchar(20),
  PRODUCT_STORE_ID varchar(20),
  SALES_CHANNEL_ENUM_ID varchar(20),
  VALID_FROM_DATE datetime,
  VALID_THRU_DATE datetime,
  QUOTE_NAME varchar(100),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  EXTERNAL_ID varchar(20)
);

CREATE TABLE quote_adjustment (
  QUOTE_ADJUSTMENT_ID varchar(20),
  QUOTE_ADJUSTMENT_TYPE_ID varchar(20),
  QUOTE_ID varchar(20),
  QUOTE_ITEM_SEQ_ID varchar(20),
  COMMENTS varchar(255),
  DESCRIPTION varchar(255),
  AMOUNT decimal(18,2),
  PRODUCT_PROMO_ID varchar(20),
  PRODUCT_PROMO_RULE_ID varchar(20),
  PRODUCT_PROMO_ACTION_SEQ_ID varchar(20),
  PRODUCT_FEATURE_ID varchar(20),
  CORRESPONDING_PRODUCT_ID varchar(20),
  SOURCE_REFERENCE_ID varchar(60),
  SOURCE_PERCENTAGE decimal(18,6),
  CUSTOMER_REFERENCE_ID varchar(60),
  PRIMARY_GEO_ID varchar(20),
  SECONDARY_GEO_ID varchar(20),
  EXEMPT_AMOUNT decimal(18,2),
  TAX_AUTH_GEO_ID varchar(20),
  TAX_AUTH_PARTY_ID varchar(20),
  OVERRIDE_GL_ACCOUNT_ID varchar(20),
  INCLUDE_IN_TAX char(1),
  INCLUDE_IN_SHIPPING char(1),
  CREATED_DATE datetime,
  CREATED_BY_USER_LOGIN varchar(250),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE quote_attribute (
  QUOTE_ID varchar(20),
  ATTR_NAME varchar(60),
  ATTR_VALUE varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE quote_coefficient (
  QUOTE_ID varchar(20),
  COEFF_NAME varchar(60),
  COEFF_VALUE decimal(18,6),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE quote_contact_mech (
  QUOTE_ID varchar(20),
  CONTACT_MECH_PURPOSE_TYPE_ID varchar(20),
  CONTACT_MECH_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE quote_content (
  QUOTE_ID varchar(20),
  QUOTE_ITEM_SEQ_ID varchar(20),
  CONTENT_ID varchar(20),
  QUOTE_CONTENT_TYPE_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE quote_content_type (
  QUOTE_CONTENT_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE quote_item (
  QUOTE_ID varchar(20),
  QUOTE_ITEM_SEQ_ID varchar(20),
  PRODUCT_ID varchar(20),
  PRODUCT_FEATURE_ID varchar(20),
  DELIVERABLE_TYPE_ID varchar(20),
  SKILL_TYPE_ID varchar(20),
  UOM_ID varchar(20),
  WORK_EFFORT_ID varchar(20),
  CUST_REQUEST_ID varchar(20),
  CUST_REQUEST_ITEM_SEQ_ID varchar(20),
  QUANTITY decimal(18,6),
  SELECTED_AMOUNT decimal(18,6),
  QUOTE_UNIT_PRICE decimal(18,2),
  RESERV_START datetime,
  RESERV_LENGTH decimal(18,6),
  RESERV_PERSONS decimal(18,6),
  CONFIG_ID varchar(20),
  ESTIMATED_DELIVERY_DATE datetime,
  COMMENTS varchar(255),
  IS_PROMO char(1),
  LEAD_TIME_DAYS decimal(18,6),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  EXTERNAL_ID varchar(20),
  ITEM_CONDITION varchar(20),
  STANDARD_LEAD_TIME_DAYS decimal(18,6),
  TRACE varchar(255),
  PRIORITY_CODE varchar(20)
);

CREATE TABLE quote_item_attribute (
  QUOTE_ID varchar(20),
  QUOTE_ITEM_SEQ_ID varchar(20),
  ATTR_NAME varchar(60),
  ATTR_VALUE varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE quote_note (
  QUOTE_ID varchar(20),
  NOTE_ID varchar(20),
  INTERNAL_NOTE char(1),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE quote_role (
  QUOTE_ID varchar(20),
  PARTY_ID varchar(20),
  ROLE_TYPE_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE quote_term (
  TERM_TYPE_ID varchar(20),
  QUOTE_ID varchar(20),
  QUOTE_ITEM_SEQ_ID varchar(20),
  TERM_VALUE decimal(20,0),
  UOM_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  DESCRIPTION varchar(255)
);

CREATE TABLE quote_term_attribute (
  TERM_TYPE_ID varchar(20),
  QUOTE_ID varchar(20),
  QUOTE_ITEM_SEQ_ID varchar(20),
  ATTR_NAME varchar(60),
  ATTR_VALUE varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE quote_type (
  QUOTE_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE quote_type_attr (
  QUOTE_TYPE_ID varchar(20),
  ATTR_NAME varchar(60),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE quote_work_effort (
  QUOTE_ID varchar(20),
  WORK_EFFORT_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE standard_language (
  STANDARD_LANGUAGE_ID varchar(20),
  LANG_CODE3T varchar(10),
  LANG_CODE3B varchar(10),
  LANG_CODE2 varchar(10),
  LANG_NAME varchar(60),
  LANG_FAMILY varchar(60),
  LANG_CHARSET varchar(60),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE standard_time_period (
  STANDARD_TIME_PERIOD_ID varchar(20),
  PERIOD_TYPE_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE status_item (
  STATUS_ID varchar(20),
  STATUS_TYPE_ID varchar(20),
  STATUS_CODE varchar(60),
  SEQUENCE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE status_type (
  STATUS_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE status_valid_change (
  STATUS_ID varchar(20),
  STATUS_ID_TO varchar(20),
  CONDITION_EXPRESSION varchar(255),
  TRANSITION_NAME varchar(100),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE tax_authority (
  TAX_AUTH_GEO_ID varchar(20),
  TAX_AUTH_PARTY_ID varchar(20),
  REQUIRE_TAX_ID_FOR_EXEMPTION char(1),
  TAX_ID_FORMAT_PATTERN varchar(255),
  INCLUDE_TAX_IN_PRICE char(1),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE tax_authority_assoc (
  TAX_AUTH_GEO_ID varchar(20),
  TAX_AUTH_PARTY_ID varchar(20),
  TO_TAX_AUTH_GEO_ID varchar(20),
  TO_TAX_AUTH_PARTY_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  TAX_AUTHORITY_ASSOC_TYPE_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE tax_authority_assoc_type (
  TAX_AUTHORITY_ASSOC_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE tax_authority_category (
  TAX_AUTH_GEO_ID varchar(20),
  TAX_AUTH_PARTY_ID varchar(20),
  PRODUCT_CATEGORY_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE tax_authority_gl_account (
  TAX_AUTH_GEO_ID varchar(20),
  TAX_AUTH_PARTY_ID varchar(20),
  ORGANIZATION_PARTY_ID varchar(20),
  GL_ACCOUNT_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE tax_authority_rate_product (
  TAX_AUTHORITY_RATE_SEQ_ID varchar(20),
  TAX_AUTH_GEO_ID varchar(20),
  TAX_AUTH_PARTY_ID varchar(20),
  TAX_AUTHORITY_RATE_TYPE_ID varchar(20),
  PRODUCT_STORE_ID varchar(20),
  PRODUCT_CATEGORY_ID varchar(20),
  TITLE_TRANSFER_ENUM_ID varchar(20),
  MIN_ITEM_PRICE decimal(18,2),
  MIN_PURCHASE decimal(18,2),
  TAX_SHIPPING char(1),
  TAX_PERCENTAGE decimal(18,6),
  TAX_PROMOTIONS char(1),
  FROM_DATE datetime,
  THRU_DATE datetime,
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE tax_authority_rate_type (
  TAX_AUTHORITY_RATE_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE tax_gateway_config (
  TAX_GATEWAY_CONFIG_ID varchar(20),
  TAX_GATEWAY_CONF_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE tax_gateway_config_type (
  TAX_GATEWAY_CONF_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE tax_gateway_sovos (
  TAX_GATEWAY_CONFIG_ID varchar(20),
  CONNECT_URL varchar(255),
  CONNECT_TIMEOUT decimal(20,0),
  USERNAME varchar(255),
  PASSWORD varchar(255),
  ORG_CODE varchar(60),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE uom (
  UOM_ID varchar(20),
  UOM_TYPE_ID varchar(20),
  ABBREVIATION varchar(60),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE uom_conversion (
  UOM_ID varchar(20),
  UOM_ID_TO varchar(20),
  CONVERSION_FACTOR decimal(18,6),
  CUSTOM_METHOD_ID varchar(20),
  DECIMAL_SCALE decimal(20,0),
  ROUNDING_MODE varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE uom_conversion_dated (
  UOM_ID varchar(20),
  UOM_ID_TO varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  CONVERSION_FACTOR decimal(18,6),
  CUSTOM_METHOD_ID varchar(20),
  DECIMAL_SCALE decimal(20,0),
  ROUNDING_MODE varchar(20),
  PURPOSE_ENUM_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE uom_group (
  UOM_GROUP_ID varchar(20),
  UOM_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE uom_type (
  UOM_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE INDEX idx_order_header_order_id ON order_header (ORDER_ID);
CREATE INDEX idx_order_header_order_type ON order_header (ORDER_TYPE_ID);
CREATE INDEX idx_order_header_status_id ON order_header (STATUS_ID);
CREATE INDEX idx_order_header_type_order_id ON order_header (ORDER_TYPE_ID, ORDER_ID);
CREATE INDEX idx_order_header_type_order_name ON order_header (ORDER_TYPE_ID, ORDER_NAME);

CREATE INDEX idx_order_item_order_id ON order_item (ORDER_ID);
CREATE INDEX idx_order_item_order_item_seq ON order_item (ORDER_ID, ORDER_ITEM_SEQ_ID);
CREATE INDEX idx_order_item_product_id ON order_item (PRODUCT_ID);

CREATE INDEX idx_order_item_ship_group_order_id ON order_item_ship_group (ORDER_ID);
CREATE INDEX idx_order_item_ship_group_order_ship_group ON order_item_ship_group (ORDER_ID, SHIP_GROUP_SEQ_ID);

CREATE INDEX idx_order_item_ship_group_assoc_order_id ON order_item_ship_group_assoc (ORDER_ID);
CREATE INDEX idx_order_item_ship_group_assoc_order_ship_group ON order_item_ship_group_assoc (ORDER_ID, SHIP_GROUP_SEQ_ID);

CREATE INDEX idx_order_item_ship_grp_inv_res_order_id ON order_item_ship_grp_inv_res (ORDER_ID);
CREATE INDEX idx_order_item_ship_grp_inv_res_inventory_item_id ON order_item_ship_grp_inv_res (INVENTORY_ITEM_ID);
CREATE INDEX idx_order_item_ship_grp_inv_res_order_item ON order_item_ship_grp_inv_res (ORDER_ID, ORDER_ITEM_SEQ_ID);
CREATE INDEX idx_order_item_ship_grp_inv_res_qty_not_avail ON order_item_ship_grp_inv_res (QUANTITY_NOT_AVAILABLE);

CREATE INDEX idx_order_role_order_role ON order_role (ORDER_ID, ROLE_TYPE_ID);
CREATE INDEX idx_order_item_role_order_role ON order_item_role (ORDER_ID, ROLE_TYPE_ID);

CREATE INDEX idx_order_contact_mech_order_purpose ON order_contact_mech (ORDER_ID, CONTACT_MECH_PURPOSE_TYPE_ID);
CREATE INDEX idx_order_item_contact_mech_order_purpose ON order_item_contact_mech (ORDER_ID, CONTACT_MECH_PURPOSE_TYPE_ID);

CREATE INDEX idx_order_adjustment_order_id ON order_adjustment (ORDER_ID);
CREATE INDEX idx_order_item_billing_order_id ON order_item_billing (ORDER_ID);
CREATE INDEX idx_order_item_note_order_id ON order_item_note (ORDER_ID);
CREATE INDEX idx_order_content_order_id ON order_content (ORDER_ID);
CREATE INDEX idx_order_content_order_content ON order_content (ORDER_ID, CONTENT_ID);

CREATE INDEX idx_order_status_order_status_datetime ON order_status (ORDER_ID, STATUS_DATETIME);
