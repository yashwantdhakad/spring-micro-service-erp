CREATE TABLE INVENTORY_ITEM_DETAIL (
  INVENTORY_ITEM_ID varchar(20),
  INVENTORY_ITEM_DETAIL_SEQ_ID varchar(20),
  EFFECTIVE_DATE datetime,
  QUANTITY_ON_HAND_DIFF decimal(18,6),
  AVAILABLE_TO_PROMISE_DIFF decimal(18,6),
  UNIT_COST decimal(18,6),
  ORDER_ID varchar(20),
  ORDER_ITEM_SEQ_ID varchar(20),
  SHIP_GROUP_SEQ_ID varchar(20),
  SHIPMENT_ID varchar(20),
  SHIPMENT_ITEM_SEQ_ID varchar(20),
  RETURN_ID varchar(20),
  RETURN_ITEM_SEQ_ID varchar(20),
  WORK_EFFORT_ID varchar(20),
  FIXED_ASSET_ID varchar(20),
  MAINT_HIST_SEQ_ID varchar(20),
  ITEM_ISSUANCE_ID varchar(20),
  RECEIPT_ID varchar(20),
  PHYSICAL_INVENTORY_ID varchar(20),
  REASON_ENUM_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  INVENTORY_TRANSFER_ID varchar(20),
  ACCOUNTING_QUANTITY_DIFF decimal(18,6),
  CREATED_BY_USER_LOGIN_ID varchar(250)
);

CREATE TABLE ORDER_HEADER_NOTE (
  ORDER_ID varchar(20),
  NOTE_ID varchar(20),
  INTERNAL_NOTE char(1),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  SHIPPING_NOTE char(1)
);

CREATE TABLE PRODUCT_AVG_COST_DETAIL (
  PRODUCT_AVERAGE_COST_ID varchar(20),
  ORGANIZATION_PARTY_ID varchar(20),
  PRODUCT_AVERAGE_COST_TYPE_ID varchar(20),
  PRODUCT_ID varchar(20),
  FACILITY_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  BASE_PART_PRODUCT_ID varchar(20),
  AVERAGE_COST decimal(18,6),
  UNIT_COST decimal(18,6),
  STANDARD_COST decimal(18,6),
  AFFECTED_QUANTITY decimal(18,6),
  QUANTITY_ON_HAND decimal(18,6),
  BASE_PART_QUANTITY_ON_HAND decimal(18,6),
  BASE_PART_AVERAGE_COST decimal(18,6),
  EFFECTIVE_DATE datetime,
  ORDER_ID varchar(20),
  ORDER_ITEM_SEQ_ID varchar(20),
  SHIP_GROUP_SEQ_ID varchar(20),
  SHIPMENT_ID varchar(20),
  SHIPMENT_ITEM_SEQ_ID varchar(20),
  RETURN_ID varchar(20),
  RETURN_ITEM_SEQ_ID varchar(20),
  WORK_EFFORT_ID varchar(20),
  FIXED_ASSET_ID varchar(20),
  MAINT_HIST_SEQ_ID varchar(20),
  ITEM_ISSUANCE_ID varchar(20),
  RECEIPT_ID varchar(20),
  PHYSICAL_INVENTORY_ID varchar(20),
  INVENTORY_TRANSFER_ID varchar(20),
  COMMENTS varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  SEQUENCE_NUMBER decimal(20,0)
);

CREATE TABLE able015 (
  ORDER_ID varchar(20),
  ORDER_ITEM_SEQ_ID varchar(20),
  VERIFY_DOCUMENTATION varchar(20),
  VERIFY_PART_CONFORMS varchar(20),
  VERIFY_MAINTENANCE_PERFORMED varchar(20),
  QA_OVERRIDE_PARTY_ID varchar(20),
  QA_OVERRIDE_DATE datetime,
  QA_NOTES varchar(255),
  NOTES varchar(255),
  INSPECTOR_PARTY_ID varchar(20),
  INSPECTED_DATE datetime,
  INSPECTOR_PARTY_ID_S2 varchar(20),
  INSPECTED_DATE_S2 datetime,
  NOTES_S2 varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  RECEIPT_ID varchar(20),
  INVENTORY_ITEM_ID varchar(20)
);

CREATE TABLE able015_inventory (
  INVENTORY_ITEM_ID varchar(20),
  VERIFY_DOCUMENTATION varchar(20),
  VERIFY_PART_CONFORMS varchar(20),
  VERIFY_MAINTENANCE_PERFORMED varchar(20),
  QA_OVERRIDE_PARTY_ID varchar(20),
  QA_OVERRIDE_DATE datetime,
  QA_NOTES varchar(255),
  NOTES varchar(255),
  INSPECTOR_PARTY_ID varchar(20),
  INSPECTED_DATE datetime,
  INSPECTOR_PARTY_ID_S2 varchar(20),
  INSPECTED_DATE_S2 datetime,
  NOTES_S2 varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE able015_legacy (
  PURCHASE_ORDER_ID varchar(20),
  DAMAGE varchar(20),
  QUANTITY varchar(20),
  GENERAL_DESC varchar(20),
  VENDOR_IDENT varchar(20),
  PART_NUMBER varchar(20),
  VENDOR_TAG_AGREE varchar(20),
  CONFIRM_SERIAL varchar(20),
  SHELF_LIFE_LIMIT varchar(20),
  SERIAL_AGREE varchar(20),
  MAINT_RECORDS varchar(20),
  FOREIGN_PARTS varchar(20),
  APPROVED_VENDOR varchar(20),
  WORK_REQUESTED varchar(20),
  F_A_R121 varchar(20),
  NOTES varchar(255),
  INSPECTOR_PARTY_ID varchar(20),
  INSPECTED_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  INSPECTOR_PARTY_ID_S2 varchar(20),
  INSPECTED_DATE_S2 datetime,
  NOTES_S2 varchar(255)
);

CREATE TABLE able015_v2 (
  PURCHASE_ORDER_ID varchar(20),
  ORDER_ITEM_SEQ_ID varchar(20),
  INVENTORY_ITEM_ID varchar(20),
  VERIFY_DOCUMENTATION varchar(20),
  VERIFY_PART_CONFORMS varchar(20),
  VERIFY_MAINTENANCE varchar(20),
  NOTES varchar(255),
  QA_NOTES varchar(255),
  INSPECTOR_PARTY_ID varchar(20),
  INSPECTED_DATE datetime,
  QA_INSPECTOR_PARTY_ID varchar(20),
  QA_INSPECTED_DATE datetime,
  INSPECTOR_PARTY_ID_S2 varchar(20),
  INSPECTED_DATE_S2 datetime,
  NOTES_S2 varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE able_business_definition (
  ATTR_NAME varchar(60),
  ATTR_VALUE varchar(255),
  ATTR_TYPE varchar(255),
  SEQ_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE able_master_buy (
  BUY_LIST_ID varchar(20),
  WORK_EFFORT_ID varchar(20),
  WORK_EFFORT_PARENT_ID varchar(20),
  WORK_EFFORT_NAME varchar(20),
  FACILITY_ID varchar(20),
  PRODUCT_ID varchar(20),
  REQ_QTY decimal(18,6),
  RUNNING_DEMAND decimal(18,6),
  REQ_DATE datetime,
  REC_TYPE varchar(255),
  ORDER_ID varchar(20),
  ORDER_ITEM_ID varchar(20),
  PART_ID varchar(20),
  PART_DESCRIPTION varchar(255),
  ORDER_QTY decimal(18,6),
  RUNNING_SUPPLY decimal(18,6),
  DUE_DATE datetime,
  LOGIC varchar(255),
  ATTRIBUTE varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  ITEM_CONDITION varchar(20),
  IS_NON_PROCURABLE char(1),
  IS_CUSTOMER_SUPPLIED char(1),
  FROM_WHOLE_ASSEMBLY char(1),
  DRAWING_ITEM_NUMBER varchar(100),
  NO_PMA_ALLOWED char(1),
  IS_EXPEDITE char(1)
);

CREATE TABLE able_order_approval_tier (
  TIER_ID varchar(20),
  THRESHOLD decimal(18,2),
  CURRENCY_UOM_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE able_qual (
  QUAL_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  MAINTENANCE char(1),
  INSPECT char(1),
  DOCUMENTATION char(1)
);

CREATE TABLE able_trace (
  TRACE_ID varchar(20),
  INVENTORY_ITEM_ID varchar(20),
  CAGE_CODE_ID varchar(20),
  UNIQUE_ID varchar(255),
  PRODUCT_ID varchar(20),
  TIME_STAMP datetime,
  ACTION_CODE varchar(20),
  CONDITION_CODE varchar(20),
  OEM_PARTY_ID varchar(20),
  OEM_SERIAL_NUMBER varchar(255),
  SHP_PARTY_ID varchar(20),
  INS_JOB_NUMBER varchar(20),
  RMV_JOB_NUMBER varchar(20),
  NEW_LIMITS varchar(255),
  EXC_CAGE_CODE varchar(20),
  EXC_SERIAL_NUMBER varchar(255),
  EXC_PART_NUMBER varchar(255),
  EXC_PARTY_CAGE_CODE varchar(255),
  SLD_PARTY_ID varchar(20),
  BUY_PARTY_ID varchar(20),
  DES_METHOD varchar(255),
  RCD_PARTY_ID varchar(20),
  UPG_DESCRIPTION varchar(255),
  INP_COMMENTS varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE accommodation_class (
  ACCOMMODATION_CLASS_ID varchar(20),
  PARENT_CLASS_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE accommodation_map (
  ACCOMMODATION_MAP_ID varchar(20),
  ACCOMMODATION_CLASS_ID varchar(20),
  FIXED_ASSET_ID varchar(20),
  ACCOMMODATION_MAP_TYPE_ID varchar(20),
  NUMBER_OF_SPACES decimal(20,0),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE accommodation_map_type (
  ACCOMMODATION_MAP_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE accommodation_spot (
  ACCOMMODATION_SPOT_ID varchar(20),
  ACCOMMODATION_CLASS_ID varchar(20),
  FIXED_ASSET_ID varchar(20),
  NUMBER_OF_SPACES decimal(20,0),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE addendum (
  ADDENDUM_ID varchar(20),
  AGREEMENT_ID varchar(20),
  AGREEMENT_ITEM_SEQ_ID varchar(20),
  ADDENDUM_CREATION_DATE datetime,
  ADDENDUM_EFFECTIVE_DATE datetime,
  ADDENDUM_TEXT varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE address_match_map (
  MAP_KEY varchar(250),
  MAP_VALUE varchar(250),
  SEQUENCE_NUM decimal(20,0),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE affiliate (
  PARTY_ID varchar(20),
  AFFILIATE_NAME varchar(100),
  AFFILIATE_DESCRIPTION varchar(255),
  YEAR_ESTABLISHED varchar(10),
  SITE_TYPE varchar(255),
  SITE_PAGE_VIEWS varchar(255),
  SITE_VISITORS varchar(255),
  DATE_TIME_CREATED datetime,
  DATE_TIME_APPROVED datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE api_gateway_request (
  GATEWAY_REQUEST_ID varchar(60),
  GATEWAY_REQUEST longtext,
  GATEWAY_RESPONSE longtext,
  STATUS_ID varchar(60),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  EXTERNAL_ID varchar(60),
  INTERNAL_ID varchar(60),
  FLOW_TYPE varchar(60),
  DESCRIPTION varchar(255)
);

CREATE TABLE application_sandbox (
  APPLICATION_ID varchar(20),
  WORK_EFFORT_ID varchar(20),
  PARTY_ID varchar(20),
  ROLE_TYPE_ID varchar(20),
  FROM_DATE datetime,
  RUNTIME_DATA_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE audio_data_resource (
  DATA_RESOURCE_ID varchar(20),
  AUDIO_DATA longblob,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE benefit_type (
  BENEFIT_TYPE_ID varchar(20),
  BENEFIT_NAME varchar(100),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  EMPLOYER_PAID_PERCENTAGE decimal(18,6),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE browser_type (
  BROWSER_TYPE_ID varchar(20),
  BROWSER_NAME varchar(100),
  BROWSER_VERSION varchar(10),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE c_a_g_code (
  C_A_G_CODE_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE carrier_account_purpose_type (
  CARRIER_ACCT_PURPOSE_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE carrier_shipment_box_type (
  SHIPMENT_BOX_TYPE_ID varchar(20),
  PARTY_ID varchar(20),
  PACKAGING_TYPE_CODE varchar(20),
  OVERSIZE_CODE varchar(10),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE carrier_shipment_method (
  SHIPMENT_METHOD_TYPE_ID varchar(20),
  PARTY_ID varchar(20),
  ROLE_TYPE_ID varchar(20),
  SEQUENCE_NUMBER decimal(20,0),
  CARRIER_SERVICE_CODE varchar(60),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE cart_abandoned_line (
  VISIT_ID varchar(20),
  CART_ABANDONED_LINE_SEQ_ID varchar(20),
  PRODUCT_ID varchar(20),
  PROD_CATALOG_ID varchar(20),
  QUANTITY decimal(18,6),
  RESERV_START datetime,
  RESERV_LENGTH decimal(18,6),
  RESERV_PERSONS decimal(18,6),
  UNIT_PRICE decimal(18,2),
  RESERV2ND_P_P_PERC decimal(18,6),
  RESERV_NTH_P_P_PERC decimal(18,6),
  CONFIG_ID varchar(20),
  TOTAL_WITH_ADJUSTMENTS decimal(18,2),
  WAS_RESERVED char(1),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE catalina_session (
  SESSION_ID varchar(60),
  SESSION_SIZE decimal(20,0),
  SESSION_INFO longblob,
  IS_VALID char(1),
  MAX_IDLE decimal(20,0),
  LAST_ACCESSED decimal(20,0),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE character_set (
  CHARACTER_SET_ID varchar(60),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE chemical (
  PRODUCT_ID varchar(20),
  PHYSICAL_STATE_ENUM_ID varchar(20),
  SPECIFIC_GRAVITY decimal(18,6),
  HMIS_HEALTH decimal(20,0),
  HMIS_FLAMMABILITY decimal(20,0),
  HMIS_REACTIVITY decimal(20,0),
  HMIS_PPE varchar(255),
  BASE_VOC decimal(18,6),
  MIX_VOC decimal(18,6),
  MSDS_MANUFACTURE varchar(100),
  MSDS_REVISED_DATE datetime,
  ENCOMPSOL_ENTRY char(1),
  WASTE_TYPE_ENUM_ID varchar(20),
  WASTE_PROFILE_NUMBER varchar(20),
  WASTE_COMMENTS varchar(255),
  REPORT_QTY decimal(18,6),
  REPORT_QTY_UOM_ID varchar(20),
  TIER2 char(1),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE chemical_component (
  PRODUCT_ID varchar(20),
  CHEMICAL_COMP_SEQ_ID varchar(20),
  COMPONENT_NAME varchar(100),
  COMPONENT_CAS_NUMBER varchar(20),
  COMPONENT_PERCENT decimal(18,6),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE chemical_hazard (
  PRODUCT_ID varchar(20),
  CHEMICAL_HAZARD_SEQ_ID varchar(20),
  HAZARD_NAME varchar(100),
  HAZARD_TYPE_ENUM_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE config_option_product_option (
  CONFIG_ID varchar(20),
  CONFIG_ITEM_ID varchar(20),
  SEQUENCE_NUM decimal(20,0),
  CONFIG_OPTION_ID varchar(20),
  PRODUCT_ID varchar(20),
  PRODUCT_OPTION_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE contact_list (
  CONTACT_LIST_ID varchar(20),
  CONTACT_LIST_TYPE_ID varchar(20),
  CONTACT_MECH_TYPE_ID varchar(20),
  MARKETING_CAMPAIGN_ID varchar(20),
  CONTACT_LIST_NAME varchar(100),
  DESCRIPTION varchar(255),
  COMMENTS varchar(255),
  IS_PUBLIC char(1),
  SINGLE_USE char(1),
  OWNER_PARTY_ID varchar(20),
  VERIFY_EMAIL_FROM varchar(255),
  VERIFY_EMAIL_SCREEN varchar(255),
  VERIFY_EMAIL_SUBJECT varchar(255),
  VERIFY_EMAIL_WEB_SITE_ID varchar(20),
  OPT_OUT_SCREEN varchar(255),
  CREATED_BY_USER_LOGIN varchar(250),
  LAST_MODIFIED_BY_USER_LOGIN varchar(250),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE contact_list_comm_status (
  CONTACT_LIST_ID varchar(20),
  COMMUNICATION_EVENT_ID varchar(20),
  CONTACT_MECH_ID varchar(20),
  PARTY_ID varchar(20),
  MESSAGE_ID varchar(255),
  STATUS_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE contact_list_type (
  CONTACT_LIST_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE container (
  CONTAINER_ID varchar(20),
  CONTAINER_TYPE_ID varchar(20),
  FACILITY_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE container_geo_point (
  CONTAINER_ID varchar(20),
  GEO_POINT_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE container_type (
  CONTAINER_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE content (
  CONTENT_ID varchar(20),
  CONTENT_TYPE_ID varchar(20),
  OWNER_CONTENT_ID varchar(20),
  DECORATOR_CONTENT_ID varchar(20),
  INSTANCE_OF_CONTENT_ID varchar(20),
  DATA_RESOURCE_ID varchar(20),
  TEMPLATE_DATA_RESOURCE_ID varchar(20),
  DATA_SOURCE_ID varchar(20),
  STATUS_ID varchar(20),
  PRIVILEGE_ENUM_ID varchar(20),
  SERVICE_NAME varchar(255),
  CONTENT_NAME varchar(100),
  DESCRIPTION varchar(255),
  LOCALE_STRING varchar(10),
  MIME_TYPE_ID varchar(250),
  CHARACTER_SET_ID varchar(60),
  CHILD_LEAF_COUNT decimal(20,0),
  CHILD_BRANCH_COUNT decimal(20,0),
  CREATED_DATE datetime,
  CREATED_BY_USER_LOGIN varchar(250),
  LAST_MODIFIED_DATE datetime,
  LAST_MODIFIED_BY_USER_LOGIN varchar(250),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE content_approval (
  CONTENT_APPROVAL_ID varchar(20),
  CONTENT_ID varchar(20),
  CONTENT_REVISION_SEQ_ID varchar(20),
  PARTY_ID varchar(20),
  ROLE_TYPE_ID varchar(20),
  APPROVAL_STATUS_ID varchar(20),
  APPROVAL_DATE datetime,
  SEQUENCE_NUM decimal(20,0),
  COMMENTS varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE content_assoc (
  CONTENT_ID varchar(20),
  CONTENT_ID_TO varchar(20),
  CONTENT_ASSOC_TYPE_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  CONTENT_ASSOC_PREDICATE_ID varchar(20),
  DATA_SOURCE_ID varchar(20),
  SEQUENCE_NUM decimal(20,0),
  MAP_KEY varchar(100),
  UPPER_COORDINATE decimal(20,0),
  LEFT_COORDINATE decimal(20,0),
  CREATED_DATE datetime,
  CREATED_BY_USER_LOGIN varchar(250),
  LAST_MODIFIED_DATE datetime,
  LAST_MODIFIED_BY_USER_LOGIN varchar(250),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE content_assoc_predicate (
  CONTENT_ASSOC_PREDICATE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE content_assoc_type (
  CONTENT_ASSOC_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE content_attribute (
  CONTENT_ID varchar(20),
  ATTR_NAME varchar(60),
  ATTR_VALUE varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE content_meta_data (
  CONTENT_ID varchar(20),
  META_DATA_PREDICATE_ID varchar(20),
  META_DATA_VALUE varchar(255),
  DATA_SOURCE_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE content_operation (
  CONTENT_OPERATION_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE content_purpose (
  CONTENT_ID varchar(20),
  CONTENT_PURPOSE_TYPE_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  SEQUENCE_NUM decimal(20,0)
);

CREATE TABLE content_purpose_operation (
  CONTENT_PURPOSE_TYPE_ID varchar(20),
  CONTENT_OPERATION_ID varchar(20),
  ROLE_TYPE_ID varchar(20),
  STATUS_ID varchar(20),
  PRIVILEGE_ENUM_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE content_purpose_type (
  CONTENT_PURPOSE_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE content_revision (
  CONTENT_ID varchar(20),
  CONTENT_REVISION_SEQ_ID varchar(20),
  COMMITTED_BY_PARTY_ID varchar(20),
  COMMENTS varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE content_revision_item (
  CONTENT_ID varchar(20),
  CONTENT_REVISION_SEQ_ID varchar(20),
  ITEM_CONTENT_ID varchar(20),
  OLD_DATA_RESOURCE_ID varchar(20),
  NEW_DATA_RESOURCE_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE content_role (
  CONTENT_ID varchar(20),
  PARTY_ID varchar(20),
  ROLE_TYPE_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE content_type (
  CONTENT_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE content_type_attr (
  CONTENT_TYPE_ID varchar(20),
  ATTR_NAME varchar(60),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE cost_component (
  COST_COMPONENT_ID varchar(20),
  COST_COMPONENT_TYPE_ID varchar(20),
  PRODUCT_ID varchar(20),
  PRODUCT_FEATURE_ID varchar(20),
  PARTY_ID varchar(20),
  GEO_ID varchar(20),
  WORK_EFFORT_ID varchar(20),
  COST_COMPONENT_CALC_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  COST decimal(18,6),
  COST_UOM_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  FIXED_ASSET_ID varchar(20),
  WORK_EFFORT_START_DATE datetime,
  WORK_EFFORT_END_DATE datetime,
  TOTAL_HOURS decimal(18,6)
);

CREATE TABLE cost_component_attribute (
  COST_COMPONENT_ID varchar(20),
  ATTR_NAME varchar(60),
  ATTR_VALUE varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE cost_component_calc (
  COST_COMPONENT_CALC_ID varchar(20),
  DESCRIPTION varchar(255),
  COST_GL_ACCOUNT_TYPE_ID varchar(20),
  OFFSETTING_GL_ACCOUNT_TYPE_ID varchar(20),
  FIXED_COST decimal(18,2),
  VARIABLE_COST decimal(18,2),
  PER_MILLI_SECOND decimal(20,0),
  CURRENCY_UOM_ID varchar(20),
  COST_CUSTOM_METHOD_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE cost_component_type (
  COST_COMPONENT_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE cost_component_type_attr (
  COST_COMPONENT_TYPE_ID varchar(20),
  ATTR_NAME varchar(60),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE country_capital (
  COUNTRY_CODE varchar(20),
  COUNTRY_CAPITAL varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE country_code (
  COUNTRY_CODE varchar(20),
  COUNTRY_ABBR varchar(60),
  COUNTRY_NUMBER varchar(60),
  COUNTRY_NAME varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE country_tele_code (
  COUNTRY_CODE varchar(20),
  TELE_CODE varchar(60),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE credit_card (
  PAYMENT_METHOD_ID varchar(20),
  CARD_TYPE varchar(60),
  CARD_NUMBER varchar(255),
  VALID_FROM_DATE varchar(20),
  EXPIRE_DATE varchar(20),
  ISSUE_NUMBER varchar(20),
  COMPANY_NAME_ON_CARD varchar(100),
  TITLE_ON_CARD varchar(100),
  FIRST_NAME_ON_CARD varchar(100),
  MIDDLE_NAME_ON_CARD varchar(100),
  LAST_NAME_ON_CARD varchar(100),
  SUFFIX_ON_CARD varchar(100),
  CONTACT_MECH_ID varchar(20),
  CONSECUTIVE_FAILED_AUTHS decimal(20,0),
  LAST_FAILED_AUTH_DATE datetime,
  CONSECUTIVE_FAILED_NSF decimal(20,0),
  LAST_FAILED_NSF_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE credit_card_type_gl_account (
  CARD_TYPE varchar(60),
  ORGANIZATION_PARTY_ID varchar(20),
  GL_ACCOUNT_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE currency_dimension (
  DIMENSION_ID varchar(20),
  CURRENCY_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE custom_method (
  CUSTOM_METHOD_ID varchar(20),
  CUSTOM_METHOD_TYPE_ID varchar(20),
  CUSTOM_METHOD_NAME varchar(255),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE custom_method_type (
  CUSTOM_METHOD_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE customer_part_number (
  PARTY_ID varchar(20),
  PRODUCT_ID varchar(20),
  PARTY_PRODUCT_ASSOC_TYPE_ID varchar(20),
  EFFECTIVE_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE data_category (
  DATA_CATEGORY_ID varchar(20),
  PARENT_CATEGORY_ID varchar(20),
  CATEGORY_NAME varchar(100),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE data_resource (
  DATA_RESOURCE_ID varchar(20),
  DATA_RESOURCE_TYPE_ID varchar(20),
  DATA_TEMPLATE_TYPE_ID varchar(20),
  DATA_CATEGORY_ID varchar(20),
  DATA_SOURCE_ID varchar(20),
  STATUS_ID varchar(20),
  DATA_RESOURCE_NAME varchar(100),
  LOCALE_STRING varchar(10),
  MIME_TYPE_ID varchar(250),
  CHARACTER_SET_ID varchar(60),
  OBJECT_INFO varchar(255),
  SURVEY_ID varchar(20),
  SURVEY_RESPONSE_ID varchar(20),
  RELATED_DETAIL_ID varchar(20),
  IS_PUBLIC char(1),
  CREATED_DATE datetime,
  CREATED_BY_USER_LOGIN varchar(250),
  LAST_MODIFIED_DATE datetime,
  LAST_MODIFIED_BY_USER_LOGIN varchar(250),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE data_resource_attribute (
  DATA_RESOURCE_ID varchar(20),
  ATTR_NAME varchar(60),
  ATTR_VALUE varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE data_resource_meta_data (
  DATA_RESOURCE_ID varchar(20),
  META_DATA_PREDICATE_ID varchar(20),
  META_DATA_VALUE varchar(255),
  DATA_SOURCE_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE data_resource_purpose (
  DATA_RESOURCE_ID varchar(20),
  CONTENT_PURPOSE_TYPE_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE data_resource_role (
  DATA_RESOURCE_ID varchar(20),
  PARTY_ID varchar(20),
  ROLE_TYPE_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE data_resource_type (
  DATA_RESOURCE_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE data_resource_type_attr (
  DATA_RESOURCE_TYPE_ID varchar(20),
  ATTR_NAME varchar(60),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE data_source (
  DATA_SOURCE_ID varchar(20),
  DATA_SOURCE_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE data_source_type (
  DATA_SOURCE_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE data_template_type (
  DATA_TEMPLATE_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  EXTENSION varchar(60),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE date_dimension (
  DIMENSION_ID varchar(20),
  DATE_VALUE date,
  DESCRIPTION varchar(255),
  DAY_NAME varchar(60),
  DAY_OF_MONTH decimal(20,0),
  DAY_OF_YEAR decimal(20,0),
  MONTH_NAME varchar(60),
  MONTH_OF_YEAR decimal(20,0),
  YEAR_NAME decimal(20,0),
  WEEK_OF_MONTH decimal(20,0),
  WEEK_OF_YEAR decimal(20,0),
  YEAR_MONTH_DAY varchar(60),
  YEAR_AND_MONTH varchar(60),
  WEEKDAY_TYPE varchar(60),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE deduction (
  DEDUCTION_ID varchar(20),
  DEDUCTION_TYPE_ID varchar(20),
  PAYMENT_ID varchar(20),
  AMOUNT decimal(18,2),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE deduction_type (
  DEDUCTION_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE default_product_qual (
  QUAL_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE deliverable (
  DELIVERABLE_ID varchar(20),
  DELIVERABLE_TYPE_ID varchar(20),
  DELIVERABLE_NAME varchar(100),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE deliverable_type (
  DELIVERABLE_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE delivery (
  DELIVERY_ID varchar(20),
  ORIGIN_FACILITY_ID varchar(20),
  DEST_FACILITY_ID varchar(20),
  ACTUAL_START_DATE datetime,
  ACTUAL_ARRIVAL_DATE datetime,
  ESTIMATED_START_DATE datetime,
  ESTIMATED_ARRIVAL_DATE datetime,
  FIXED_ASSET_ID varchar(20),
  START_MILEAGE decimal(18,6),
  END_MILEAGE decimal(18,6),
  FUEL_USED decimal(18,6),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE depreciation_method (
  DEPRECIATION_METHOD_ID varchar(20),
  DESCRIPTION varchar(255),
  FORMULA varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE desired_feature (
  DESIRED_FEATURE_ID varchar(20),
  REQUIREMENT_ID varchar(20),
  PRODUCT_FEATURE_ID varchar(20),
  OPTIONAL_IND char(1),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE document (
  DOCUMENT_ID varchar(20),
  DOCUMENT_TYPE_ID varchar(20),
  DATE_CREATED datetime,
  COMMENTS varchar(255),
  DOCUMENT_LOCATION varchar(255),
  DOCUMENT_TEXT varchar(255),
  IMAGE_DATA longblob,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE document_attribute (
  DOCUMENT_ID varchar(20),
  ATTR_NAME varchar(60),
  ATTR_VALUE varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE document_type (
  DOCUMENT_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE document_type_attr (
  DOCUMENT_TYPE_ID varchar(20),
  ATTR_NAME varchar(60),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE eft_account (
  PAYMENT_METHOD_ID varchar(20),
  BANK_NAME varchar(100),
  ROUTING_NUMBER varchar(60),
  ACCOUNT_TYPE varchar(60),
  ACCOUNT_NUMBER varchar(255),
  NAME_ON_ACCOUNT varchar(100),
  COMPANY_NAME_ON_ACCOUNT varchar(100),
  CONTACT_MECH_ID varchar(20),
  YEARS_AT_BANK decimal(20,0),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE electronic_text (
  DATA_RESOURCE_ID varchar(20),
  TEXT_DATA longtext,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE email_address_verification (
  EMAIL_ADDRESS varchar(250),
  VERIFY_HASH varchar(255),
  EXPIRE_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE email_template_setting (
  EMAIL_TEMPLATE_SETTING_ID varchar(20),
  DESCRIPTION varchar(255),
  BODY_SCREEN_LOCATION varchar(255),
  XSLFO_ATTACH_SCREEN_LOCATION varchar(255),
  FROM_ADDRESS varchar(255),
  CC_ADDRESS varchar(255),
  BCC_ADDRESS varchar(255),
  SUBJECT varchar(255),
  CONTENT_TYPE varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE entity_audit_log (
  AUDIT_HISTORY_SEQ_ID varchar(20),
  CHANGED_ENTITY_NAME varchar(255),
  CHANGED_FIELD_NAME varchar(255),
  PK_COMBINED_VALUE_TEXT varchar(255),
  OLD_VALUE_TEXT varchar(255),
  NEW_VALUE_TEXT varchar(255),
  CHANGED_DATE datetime,
  CHANGED_BY_INFO varchar(255),
  CHANGED_SESSION_INFO varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE entity_group (
  ENTITY_GROUP_ID varchar(20),
  ENTITY_GROUP_NAME varchar(100),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE entity_group_entry (
  ENTITY_GROUP_ID varchar(20),
  ENTITY_OR_PACKAGE varchar(255),
  APPL_ENUM_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE entity_key_store (
  KEY_NAME varchar(250),
  KEY_TEXT varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE entity_sync (
  ENTITY_SYNC_ID varchar(20),
  RUN_STATUS_ID varchar(20),
  LAST_SUCCESSFUL_SYNCH_TIME datetime,
  LAST_HISTORY_START_DATE datetime,
  PRE_OFFLINE_SYNCH_TIME datetime,
  OFFLINE_SYNC_SPLIT_MILLIS decimal(20,0),
  SYNC_SPLIT_MILLIS decimal(20,0),
  SYNC_END_BUFFER_MILLIS decimal(20,0),
  MAX_RUNNING_NO_UPDATE_MILLIS decimal(20,0),
  TARGET_SERVICE_NAME varchar(255),
  TARGET_DELEGATOR_NAME varchar(255),
  KEEP_REMOVE_INFO_HOURS decimal(18,6),
  FOR_PULL_ONLY char(1),
  FOR_PUSH_ONLY char(1),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE entity_sync_history (
  ENTITY_SYNC_ID varchar(20),
  START_DATE datetime,
  RUN_STATUS_ID varchar(20),
  BEGINNING_SYNCH_TIME datetime,
  LAST_SUCCESSFUL_SYNCH_TIME datetime,
  LAST_CANDIDATE_END_TIME datetime,
  LAST_SPLIT_START_TIME decimal(20,0),
  TO_CREATE_INSERTED decimal(20,0),
  TO_CREATE_UPDATED decimal(20,0),
  TO_CREATE_NOT_UPDATED decimal(20,0),
  TO_STORE_INSERTED decimal(20,0),
  TO_STORE_UPDATED decimal(20,0),
  TO_STORE_NOT_UPDATED decimal(20,0),
  TO_REMOVE_DELETED decimal(20,0),
  TO_REMOVE_ALREADY_DELETED decimal(20,0),
  TOTAL_ROWS_EXPORTED decimal(20,0),
  TOTAL_ROWS_TO_CREATE decimal(20,0),
  TOTAL_ROWS_TO_STORE decimal(20,0),
  TOTAL_ROWS_TO_REMOVE decimal(20,0),
  TOTAL_SPLITS decimal(20,0),
  TOTAL_STORE_CALLS decimal(20,0),
  RUNNING_TIME_MILLIS decimal(20,0),
  PER_SPLIT_MIN_MILLIS decimal(20,0),
  PER_SPLIT_MAX_MILLIS decimal(20,0),
  PER_SPLIT_MIN_ITEMS decimal(20,0),
  PER_SPLIT_MAX_ITEMS decimal(20,0),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE entity_sync_include (
  ENTITY_SYNC_ID varchar(20),
  ENTITY_OR_PACKAGE varchar(255),
  APPL_ENUM_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE entity_sync_include_group (
  ENTITY_SYNC_ID varchar(20),
  ENTITY_GROUP_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE entity_sync_remove (
  ENTITY_SYNC_REMOVE_ID varchar(20),
  PRIMARY_KEY_REMOVED longtext,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE facility (
  FACILITY_ID varchar(20),
  FACILITY_TYPE_ID varchar(20),
  PARENT_FACILITY_ID varchar(20),
  OWNER_PARTY_ID varchar(20),
  DEFAULT_INVENTORY_ITEM_TYPE_ID varchar(20),
  FACILITY_NAME varchar(100),
  PRIMARY_FACILITY_GROUP_ID varchar(20),
  SQUARE_FOOTAGE decimal(20,0),
  PRODUCT_STORE_ID varchar(20),
  DEFAULT_DAYS_TO_SHIP decimal(20,0),
  OPENED_DATE datetime,
  CLOSED_DATE datetime,
  DESCRIPTION varchar(255),
  DEFAULT_DIMENSION_UOM_ID varchar(20),
  DEFAULT_WEIGHT_UOM_ID varchar(20),
  GEO_POINT_ID varchar(20),
  QA_RESTRICTED char(1),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  FACILITY_SIZE decimal(18,6),
  FACILITY_SIZE_UOM_ID varchar(20)
);

CREATE TABLE facility_area (
  FACILITY_ID varchar(20),
  AREA_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE facility_attribute (
  FACILITY_ID varchar(20),
  ATTR_NAME varchar(60),
  ATTR_VALUE varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE facility_carrier_shipment (
  FACILITY_ID varchar(20),
  PARTY_ID varchar(20),
  ROLE_TYPE_ID varchar(20),
  SHIPMENT_METHOD_TYPE_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE facility_contact_mech (
  FACILITY_ID varchar(20),
  CONTACT_MECH_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  EXTENSION varchar(10),
  COMMENTS varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE facility_contact_mech_purpose (
  FACILITY_ID varchar(20),
  CONTACT_MECH_ID varchar(20),
  CONTACT_MECH_PURPOSE_TYPE_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE facility_content (
  FACILITY_ID varchar(20),
  CONTENT_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE facility_dimension (
  DIMENSION_ID varchar(20),
  FACILITY_ID varchar(20),
  FACILITY_NAME varchar(100),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE facility_group (
  FACILITY_GROUP_ID varchar(20),
  FACILITY_GROUP_TYPE_ID varchar(20),
  PRIMARY_PARENT_GROUP_ID varchar(20),
  FACILITY_GROUP_NAME varchar(100),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE facility_group_member (
  FACILITY_ID varchar(20),
  FACILITY_GROUP_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  SEQUENCE_NUM decimal(20,0),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE facility_group_role (
  FACILITY_GROUP_ID varchar(20),
  PARTY_ID varchar(20),
  ROLE_TYPE_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE facility_group_rollup (
  FACILITY_GROUP_ID varchar(20),
  PARENT_FACILITY_GROUP_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  SEQUENCE_NUM decimal(20,0),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE facility_group_type (
  FACILITY_GROUP_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE facility_location (
  FACILITY_ID varchar(20),
  LOCATION_SEQ_ID varchar(20),
  LOCATION_TYPE_ENUM_ID varchar(20),
  AREA_ID varchar(20),
  AISLE_ID varchar(20),
  SECTION_ID varchar(20),
  LEVEL_ID varchar(20),
  POSITION_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  LOCATION_NAME varchar(100),
  LOCKED char(1),
  LAST_COUNT_DATE date,
  NEXT_COUNT_DATE date
);

CREATE TABLE facility_location_geo_point (
  FACILITY_ID varchar(20),
  LOCATION_SEQ_ID varchar(20),
  GEO_POINT_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE facility_party (
  FACILITY_ID varchar(20),
  PARTY_ID varchar(20),
  ROLE_TYPE_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE facility_role (
  FACILITY_ID varchar(20),
  PARTY_ID varchar(20),
  ROLE_TYPE_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE facility_type (
  FACILITY_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE facility_type_attr (
  FACILITY_TYPE_ID varchar(20),
  ATTR_NAME varchar(60),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE file_extension (
  FILE_EXTENSION_ID varchar(60),
  MIME_TYPE_ID varchar(250),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE fixed_asset (
  FIXED_ASSET_ID varchar(20),
  FIXED_ASSET_TYPE_ID varchar(20),
  PARENT_FIXED_ASSET_ID varchar(20),
  INSTANCE_OF_PRODUCT_ID varchar(20),
  CLASS_ENUM_ID varchar(20),
  PARTY_ID varchar(20),
  ROLE_TYPE_ID varchar(20),
  FIXED_ASSET_NAME varchar(100),
  ACQUIRE_ORDER_ID varchar(20),
  ACQUIRE_ORDER_ITEM_SEQ_ID varchar(20),
  DATE_ACQUIRED datetime,
  DATE_LAST_SERVICED datetime,
  DATE_NEXT_SERVICE datetime,
  EXPECTED_END_OF_LIFE date,
  ACTUAL_END_OF_LIFE date,
  PRODUCTION_CAPACITY decimal(18,6),
  UOM_ID varchar(20),
  CALENDAR_ID varchar(20),
  SERIAL_NUMBER varchar(255),
  LOCATED_AT_FACILITY_ID varchar(20),
  LOCATED_AT_LOCATION_SEQ_ID varchar(20),
  SALVAGE_VALUE decimal(18,2),
  DEPRECIATION decimal(18,2),
  PURCHASE_COST decimal(18,2),
  PURCHASE_COST_UOM_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  QUANTITY decimal(18,6),
  ANNUAL_FLIGHT_HOURS decimal(20,0),
  OEM_DISCOUNT decimal(20,0),
  INVENTORY_ITEM_ID varchar(20),
  WORK_EFFORT_ID varchar(20),
  ACQUIRE_JOB_ID varchar(20),
  CURRENT_STATUS_ID varchar(20),
  RECEIPT_ID varchar(20),
  TA_ACQUISITION_SLOT varchar(20),
  REASON_ENUM_ID varchar(20),
  BUILD_COST char(1)
);

CREATE TABLE fixed_asset_attribute (
  FIXED_ASSET_ID varchar(20),
  ATTR_NAME varchar(60),
  ATTR_VALUE varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE fixed_asset_dep_method (
  DEPRECIATION_CUSTOM_METHOD_ID varchar(20),
  FIXED_ASSET_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE fixed_asset_geo_point (
  FIXED_ASSET_ID varchar(20),
  GEO_POINT_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE fixed_asset_ident (
  FIXED_ASSET_ID varchar(20),
  FIXED_ASSET_IDENT_TYPE_ID varchar(20),
  ID_VALUE varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE fixed_asset_ident_type (
  FIXED_ASSET_IDENT_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE fixed_asset_maint (
  FIXED_ASSET_ID varchar(20),
  MAINT_HIST_SEQ_ID varchar(20),
  STATUS_ID varchar(20),
  PRODUCT_MAINT_TYPE_ID varchar(20),
  PRODUCT_MAINT_SEQ_ID varchar(20),
  SCHEDULE_WORK_EFFORT_ID varchar(20),
  INTERVAL_QUANTITY decimal(18,6),
  INTERVAL_UOM_ID varchar(20),
  INTERVAL_METER_TYPE_ID varchar(20),
  PURCHASE_ORDER_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  PARTY_ID varchar(20),
  STATUS_DATE_TIME datetime,
  PRICE decimal(18,6),
  QUANTITY decimal(18,6),
  CATEGORY_CHANGE_START_DATE datetime,
  CATEGORY_CHANGE_END_DATE datetime,
  REASON_ENUM_ID varchar(20),
  INVENTORY_ITEM_ID varchar(20),
  RECEIPT_ID varchar(20),
  BUILD_COST char(1)
);

CREATE TABLE fixed_asset_maint_meter (
  FIXED_ASSET_ID varchar(20),
  MAINT_HIST_SEQ_ID varchar(20),
  PRODUCT_METER_TYPE_ID varchar(20),
  METER_VALUE decimal(18,6),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE fixed_asset_maint_order (
  FIXED_ASSET_ID varchar(20),
  MAINT_HIST_SEQ_ID varchar(20),
  ORDER_ID varchar(20),
  ORDER_ITEM_SEQ_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE fixed_asset_meter (
  FIXED_ASSET_ID varchar(20),
  PRODUCT_METER_TYPE_ID varchar(20),
  READING_DATE datetime,
  METER_VALUE decimal(18,6),
  READING_REASON_ENUM_ID varchar(20),
  MAINT_HIST_SEQ_ID varchar(20),
  WORK_EFFORT_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE fixed_asset_note (
  FIXED_ASSET_ID varchar(20),
  NOTE_ID varchar(20),
  INTERNAL_NOTE char(1),
  NOTE_DATE_TIME datetime,
  STATUS_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE fixed_asset_product (
  FIXED_ASSET_ID varchar(20),
  PRODUCT_ID varchar(20),
  FIXED_ASSET_PRODUCT_TYPE_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  COMMENTS varchar(255),
  SEQUENCE_NUM decimal(20,0),
  QUANTITY decimal(18,6),
  QUANTITY_UOM_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  MIX decimal(20,0),
  USAGE_HOURS decimal(20,0)
);

CREATE TABLE fixed_asset_product_type (
  FIXED_ASSET_PRODUCT_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE fixed_asset_registration (
  FIXED_ASSET_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  REGISTRATION_DATE datetime,
  GOV_AGENCY_PARTY_ID varchar(20),
  REGISTRATION_NUMBER varchar(255),
  LICENSE_NUMBER varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE fixed_asset_std_cost (
  FIXED_ASSET_ID varchar(20),
  FIXED_ASSET_STD_COST_TYPE_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  AMOUNT_UOM_ID varchar(20),
  AMOUNT decimal(18,2),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE fixed_asset_std_cost_type (
  FIXED_ASSET_STD_COST_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE fixed_asset_type (
  FIXED_ASSET_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE fixed_asset_type_attr (
  FIXED_ASSET_TYPE_ID varchar(20),
  ATTR_NAME varchar(60),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE fixed_asset_type_gl_account (
  FIXED_ASSET_TYPE_ID varchar(20),
  FIXED_ASSET_ID varchar(20),
  ORGANIZATION_PARTY_ID varchar(20),
  ASSET_GL_ACCOUNT_ID varchar(20),
  ACC_DEP_GL_ACCOUNT_ID varchar(20),
  DEP_GL_ACCOUNT_ID varchar(20),
  PROFIT_GL_ACCOUNT_ID varchar(20),
  LOSS_GL_ACCOUNT_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE gift_card (
  PAYMENT_METHOD_ID varchar(20),
  CARD_NUMBER varchar(255),
  PIN_NUMBER varchar(255),
  EXPIRE_DATE varchar(20),
  CONTACT_MECH_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE gift_card_fulfillment (
  FULFILLMENT_ID varchar(20),
  TYPE_ENUM_ID varchar(20),
  MERCHANT_ID varchar(250),
  PARTY_ID varchar(20),
  ORDER_ID varchar(20),
  ORDER_ITEM_SEQ_ID varchar(20),
  SURVEY_RESPONSE_ID varchar(20),
  CARD_NUMBER varchar(255),
  PIN_NUMBER varchar(255),
  AMOUNT decimal(18,2),
  RESPONSE_CODE varchar(60),
  REFERENCE_NUM varchar(60),
  AUTH_CODE varchar(60),
  FULFILLMENT_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE good_identification (
  GOOD_IDENTIFICATION_TYPE_ID varchar(20),
  PRODUCT_ID varchar(20),
  ID_VALUE varchar(60),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE good_identification_type (
  GOOD_IDENTIFICATION_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE google_base_config (
  PRODUCT_STORE_ID varchar(20),
  DEVELOPER_KEY varchar(255),
  AUTHENTICATION_URL varchar(255),
  ACCOUNT_EMAIL varchar(100),
  ACCOUNT_PASSWORD varchar(100),
  POST_ITEMS_URL varchar(255),
  WEB_SITE_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE google_co_configuration (
  PRODUCT_STORE_ID varchar(20),
  MERCHANT_ID varchar(255),
  MERCHANT_KEY varchar(255),
  ENV_ENUM_ID varchar(20),
  WEB_SITE_ID varchar(20),
  PROD_CATALOG_ID varchar(20),
  CURRENCY_UOM_ID varchar(20),
  REQUEST_AUTH_DETAILS char(1),
  REQUEST_PHONE char(1),
  SEND_PROMO_ITEMS char(1),
  ERROR_ON_BAD_ITEM char(1),
  ACCEPT_COUPONS char(1),
  ACCEPT_GIFT_CERTS char(1),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE google_co_shipping_method (
  SHIPMENT_METHOD_NAME varchar(60),
  PRODUCT_STORE_ID varchar(20),
  AMOUNT decimal(18,2),
  ADDITIONAL_AMOUNT decimal(18,2),
  ADDITIONAL_PERCENT decimal(18,6),
  METHOD_TYPE_ENUM_ID varchar(20),
  CARRIER_PARTY_ID varchar(20),
  SHIPMENT_METHOD_TYPE_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE hold_reason_type (
  HOLD_REASON_TYPE_ID varchar(20),
  DEPARTMENT_PARTY_ID varchar(20),
  HOLD_TYPE_ENUM_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE image_data_resource (
  DATA_RESOURCE_ID varchar(20),
  IMAGE_DATA longblob,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE intacct_function (
  FUNCTION_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE intacct_request (
  REQUEST_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE inventory_count (
  INVENTORY_COUNT_ID varchar(20),
  UPLOADED_BY_USER_LOGIN varchar(250),
  FACILITY_ID varchar(20),
  LINKED_SESSION_ID varchar(20),
  STATUS_ID varchar(20),
  CREATED_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE inventory_count_item (
  INVENTORY_COUNT_ID varchar(20),
  INVENTORY_COUNT_ITEM_SEQ_ID varchar(20),
  INVENTORY_ITEM_ID varchar(20),
  ITEM_STATUS_ID varchar(20),
  LOCATION_SEQ_ID varchar(60),
  PRODUCT_ID varchar(20),
  PRODUCT_IDENTIFIER varchar(60),
  QUANTITY decimal(18,6),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE inventory_count_variance (
  INVENTORY_COUNT_ID varchar(20),
  INVENTORY_COUNT_ITEM_SEQ_ID varchar(20),
  INVENTORY_ITEM_ID varchar(20),
  PRODUCT_ID varchar(20),
  PRODUCT_IDENTIFIER varchar(60),
  LOCATION_SEQ_ID varchar(20),
  SYSTEM_QUANTITY_ON_HAND decimal(18,6),
  ACTUAL_QUANTITY_ON_HAND decimal(18,6),
  VARIANCE_QUANTITY_ON_HAND decimal(18,6),
  UNIT_COST decimal(18,6),
  TOTAL_COST decimal(18,6),
  ACTUAL_COST decimal(18,6),
  COST_VARIANCE decimal(18,6),
  ACTUAL_VALUE decimal(18,6),
  TOTAL_VALUE decimal(18,6),
  VALUE_VARIANCE decimal(18,6),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE inventory_item (
  INVENTORY_ITEM_ID varchar(20),
  INVENTORY_ITEM_TYPE_ID varchar(20),
  PRODUCT_ID varchar(20),
  PARTY_ID varchar(20),
  OWNER_PARTY_ID varchar(20),
  STATUS_ID varchar(20),
  DATETIME_RECEIVED datetime,
  DATETIME_MANUFACTURED datetime,
  EXPIRE_DATE datetime,
  FACILITY_ID varchar(20),
  CONTAINER_ID varchar(20),
  LOT_ID varchar(20),
  UOM_ID varchar(20),
  BIN_NUMBER varchar(20),
  LOCATION_SEQ_ID varchar(20),
  COMMENTS varchar(255),
  QUANTITY_ON_HAND_TOTAL decimal(18,6),
  AVAILABLE_TO_PROMISE_TOTAL decimal(18,6),
  QUANTITY_ON_HAND decimal(18,6),
  AVAILABLE_TO_PROMISE decimal(18,6),
  SERIAL_NUMBER varchar(255),
  SOFT_IDENTIFIER varchar(255),
  ACTIVATION_NUMBER varchar(255),
  ACTIVATION_VALID_THRU datetime,
  UNIT_COST decimal(18,6),
  CURRENCY_UOM_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  OEM_TRACEABILITY char(1),
  TAG_TYPE varchar(255),
  TAG_DATE datetime,
  TAG_BY varchar(255),
  TRACE_TO varchar(255),
  ITEM_CONDITION varchar(20),
  KIT_COMPONENT char(1),
  KSI varchar(255),
  DOCUMENTATION char(1),
  MAINTENANCE char(1),
  INSPECTION char(1),
  ACCOUNTING_QUANTITY_TOTAL decimal(18,6),
  INV_AUTH_ENUM_ID varchar(20),
  MLTR_USE_AUTH char(1),
  COMM_USE_AUTH char(1),
  MRGT_AUTH char(1),
  MRSL_AUTH char(1),
  PROP_REP_AUTH char(1)
);

CREATE TABLE inventory_item_attribute (
  INVENTORY_ITEM_ID varchar(20),
  ATTR_NAME varchar(60),
  ATTR_VALUE varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE inventory_item_content (
  INVENTORY_ITEM_ID varchar(20),
  CONTENT_ID varchar(20),
  INVENTORY_ITEM_CONTENT_TYPE_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE inventory_item_content_type (
  INVENTORY_ITEM_CONTENT_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE inventory_item_defect (
  INVENTORY_ITEM_ID varchar(20),
  ITEM_DEFECT varchar(20),
  SEQ_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE inventory_item_fact (
  INVENTORY_ITEM_ID varchar(20),
  FACILITY_ID varchar(20),
  PRODUCT_DIM_ID varchar(20),
  ORIG_CURRENCY_DIM_ID varchar(20),
  INVENTORY_DATE_DIM_ID varchar(20),
  QUANTITY_ON_HAND_TOTAL decimal(18,6),
  AVAILABLE_TO_PROMISE_TOTAL decimal(18,6),
  UNIT_COST decimal(18,6),
  SOLDOUT_AMOUNT decimal(18,6),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE inventory_item_kit_history (
  INVENTORY_ITEM_ID varchar(20),
  COMPONENT_ITEM_ID varchar(20),
  BREAKUP_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE inventory_item_label (
  INVENTORY_ITEM_LABEL_ID varchar(20),
  INVENTORY_ITEM_LABEL_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE inventory_item_label_appl (
  INVENTORY_ITEM_ID varchar(20),
  INVENTORY_ITEM_LABEL_TYPE_ID varchar(20),
  INVENTORY_ITEM_LABEL_ID varchar(20),
  SEQUENCE_NUM decimal(20,0),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE inventory_item_label_type (
  INVENTORY_ITEM_LABEL_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE inventory_item_note (
  INVENTORY_ITEM_ID varchar(20),
  NOTE_ID varchar(20),
  INTERNAL_NOTE char(1),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE inventory_item_status (
  INVENTORY_ITEM_ID varchar(20),
  STATUS_ID varchar(20),
  STATUS_DATETIME datetime,
  STATUS_END_DATETIME datetime,
  OWNER_PARTY_ID varchar(20),
  PRODUCT_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  USER_LOGIN_ID varchar(250)
);

CREATE TABLE inventory_item_temp_res (
  VISIT_ID varchar(20),
  PRODUCT_ID varchar(20),
  PRODUCT_STORE_ID varchar(20),
  QUANTITY decimal(18,6),
  RESERVED_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE inventory_item_type (
  INVENTORY_ITEM_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE inventory_item_type_attr (
  INVENTORY_ITEM_TYPE_ID varchar(20),
  ATTR_NAME varchar(60),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE inventory_item_variance (
  INVENTORY_ITEM_ID varchar(20),
  PHYSICAL_INVENTORY_ID varchar(20),
  VARIANCE_REASON_ID varchar(20),
  AVAILABLE_TO_PROMISE_VAR decimal(18,6),
  QUANTITY_ON_HAND_VAR decimal(18,6),
  COMMENTS varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE inventory_transfer (
  INVENTORY_TRANSFER_ID varchar(20),
  STATUS_ID varchar(20),
  INVENTORY_ITEM_ID varchar(20),
  FACILITY_ID varchar(20),
  LOCATION_SEQ_ID varchar(20),
  CONTAINER_ID varchar(20),
  FACILITY_ID_TO varchar(20),
  LOCATION_SEQ_ID_TO varchar(20),
  CONTAINER_ID_TO varchar(20),
  ITEM_ISSUANCE_ID varchar(20),
  SEND_DATE datetime,
  RECEIVE_DATE datetime,
  COMMENTS varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  SOURCE_INVENTORY_ITEM_ID varchar(20)
);

CREATE TABLE ios_badge (
  BADGE_ID varchar(20),
  PIN varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE item_issuance (
  ITEM_ISSUANCE_ID varchar(20),
  ORDER_ID varchar(20),
  ORDER_ITEM_SEQ_ID varchar(20),
  SHIP_GROUP_SEQ_ID varchar(20),
  INVENTORY_ITEM_ID varchar(20),
  SHIPMENT_ID varchar(20),
  SHIPMENT_ITEM_SEQ_ID varchar(20),
  FIXED_ASSET_ID varchar(20),
  MAINT_HIST_SEQ_ID varchar(20),
  WORK_EFFORT_ID varchar(20),
  ISSUED_DATE_TIME datetime,
  ISSUED_BY_USER_LOGIN_ID varchar(250),
  QUANTITY decimal(18,6),
  CANCEL_QUANTITY decimal(18,6),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  ISSUANCE_TYPE_ID varchar(20),
  CURRENT_STATUS_ID varchar(20),
  CANCELLED_DATE_TIME datetime,
  CANCELLED_BY_USER_LOGIN_ID varchar(250),
  TRANSFER_QUANTITY decimal(18,6),
  RETURNED_EXCESS_ISSUED_QTY decimal(18,6),
  WEGS_REFERENCE_NUMBER varchar(20),
  LOCATION_SEQ_ID varchar(20),
  DELIVERED_TO_PARTY varchar(20)
);

CREATE TABLE item_issuance_role (
  ITEM_ISSUANCE_ID varchar(20),
  PARTY_ID varchar(20),
  ROLE_TYPE_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE keyword_thesaurus (
  ENTERED_KEYWORD varchar(255),
  ALTERNATE_KEYWORD varchar(255),
  RELATIONSHIP_ENUM_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE lot (
  LOT_ID varchar(20),
  CREATION_DATE datetime,
  QUANTITY decimal(18,6),
  EXPIRATION_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE market_interest (
  PRODUCT_CATEGORY_ID varchar(20),
  PARTY_CLASSIFICATION_GROUP_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE meta_data_predicate (
  META_DATA_PREDICATE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE mime_type (
  MIME_TYPE_ID varchar(250),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE mime_type_html_template (
  MIME_TYPE_ID varchar(250),
  TEMPLATE_LOCATION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE need_type (
  NEED_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE note_data (
  NOTE_ID varchar(20),
  NOTE_NAME varchar(100),
  NOTE_INFO longtext,
  NOTE_DATE_TIME datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  MORE_INFO_PORTLET_ID varchar(255),
  MORE_INFO_ITEM_ID varchar(255),
  NOTE_PARTY varchar(20),
  CREATED_BY_USER_LOGIN varchar(250)
);

CREATE TABLE oagis_message_error_info (
  LOGICAL_ID varchar(10),
  COMPONENT varchar(10),
  TASK varchar(60),
  REFERENCE_ID varchar(60),
  ERROR_SEQ_ID varchar(20),
  REASON_CODE varchar(60),
  DESCRIPTION longtext,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE oagis_message_info (
  LOGICAL_ID varchar(10),
  COMPONENT varchar(10),
  TASK varchar(60),
  REFERENCE_ID varchar(60),
  AUTH_ID varchar(60),
  OUTGOING_MESSAGE char(1),
  SENT_DATE datetime,
  RECEIVED_DATE datetime,
  CONFIRMATION varchar(20),
  BSR_VERB varchar(60),
  BSR_NOUN varchar(60),
  BSR_REVISION varchar(60),
  PROCESSING_STATUS_ID varchar(20),
  ORDER_ID varchar(20),
  RETURN_ID varchar(20),
  SHIPMENT_ID varchar(20),
  ORIG_REF varchar(60),
  FULL_MESSAGE_XML longtext,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE other_data_resource (
  DATA_RESOURCE_ID varchar(20),
  DATA_RESOURCE_CONTENT longblob,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE perf_rating_type (
  PERF_RATING_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE perf_review (
  EMPLOYEE_PARTY_ID varchar(20),
  EMPLOYEE_ROLE_TYPE_ID varchar(20),
  PERF_REVIEW_ID varchar(20),
  MANAGER_PARTY_ID varchar(20),
  MANAGER_ROLE_TYPE_ID varchar(20),
  PAYMENT_ID varchar(20),
  EMPL_POSITION_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  COMMENTS varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE perf_review_item (
  EMPLOYEE_PARTY_ID varchar(20),
  EMPLOYEE_ROLE_TYPE_ID varchar(20),
  PERF_REVIEW_ID varchar(20),
  PERF_REVIEW_ITEM_SEQ_ID varchar(20),
  PERF_RATING_TYPE_ID varchar(20),
  PERF_REVIEW_ITEM_TYPE_ID varchar(20),
  COMMENTS varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE perf_review_item_type (
  PERF_REVIEW_ITEM_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE performance_note (
  PARTY_ID varchar(20),
  ROLE_TYPE_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  COMMUNICATION_DATE datetime,
  COMMENTS varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE physical_inventory (
  PHYSICAL_INVENTORY_ID varchar(20),
  PHYSICAL_INVENTORY_DATE datetime,
  PARTY_ID varchar(20),
  GENERAL_COMMENTS varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE picklist (
  PICKLIST_ID varchar(20),
  DESCRIPTION varchar(255),
  FACILITY_ID varchar(20),
  SHIPMENT_METHOD_TYPE_ID varchar(20),
  STATUS_ID varchar(20),
  PICKLIST_DATE datetime,
  CREATED_BY_USER_LOGIN varchar(250),
  LAST_MODIFIED_BY_USER_LOGIN varchar(250),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE picklist_bin (
  PICKLIST_BIN_ID varchar(20),
  PICKLIST_ID varchar(20),
  BIN_LOCATION_NUMBER decimal(20,0),
  PRIMARY_ORDER_ID varchar(20),
  PRIMARY_SHIP_GROUP_SEQ_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE picklist_item (
  PICKLIST_BIN_ID varchar(20),
  ORDER_ID varchar(20),
  ORDER_ITEM_SEQ_ID varchar(20),
  SHIP_GROUP_SEQ_ID varchar(20),
  INVENTORY_ITEM_ID varchar(20),
  ITEM_STATUS_ID varchar(20),
  QUANTITY decimal(18,6),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE picklist_role (
  PICKLIST_ID varchar(20),
  PARTY_ID varchar(20),
  ROLE_TYPE_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  CREATED_BY_USER_LOGIN varchar(250),
  LAST_MODIFIED_BY_USER_LOGIN varchar(250),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE picklist_status_history (
  PICKLIST_ID varchar(20),
  CHANGE_DATE datetime,
  CHANGE_USER_LOGIN_ID varchar(250),
  STATUS_ID varchar(20),
  STATUS_ID_TO varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE platform_type (
  PLATFORM_TYPE_ID varchar(20),
  PLATFORM_NAME varchar(100),
  PLATFORM_VERSION varchar(10),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE portal_page (
  PORTAL_PAGE_ID varchar(20),
  PORTAL_PAGE_NAME varchar(100),
  DESCRIPTION varchar(255),
  OWNER_USER_LOGIN_ID varchar(20),
  ORIGINAL_PORTAL_PAGE_ID varchar(20),
  PARENT_PORTAL_PAGE_ID varchar(20),
  SEQUENCE_NUM decimal(20,0),
  SECURITY_GROUP_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE portal_page_column (
  PORTAL_PAGE_ID varchar(20),
  COLUMN_SEQ_ID varchar(20),
  COLUMN_WIDTH_PIXELS decimal(20,0),
  COLUMN_WIDTH_PERCENTAGE decimal(20,0),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE portal_page_portlet (
  PORTAL_PAGE_ID varchar(20),
  PORTAL_PORTLET_ID varchar(20),
  PORTLET_SEQ_ID varchar(20),
  COLUMN_SEQ_ID varchar(20),
  SEQUENCE_NUM decimal(20,0),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE portal_portlet (
  PORTAL_PORTLET_ID varchar(20),
  PORTLET_NAME varchar(100),
  SCREEN_NAME varchar(255),
  SCREEN_LOCATION varchar(255),
  EDIT_FORM_NAME varchar(255),
  EDIT_FORM_LOCATION varchar(255),
  DESCRIPTION varchar(255),
  SCREENSHOT varchar(255),
  SECURITY_SERVICE_NAME varchar(255),
  SECURITY_MAIN_ACTION varchar(60),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE portlet_attribute (
  PORTAL_PAGE_ID varchar(20),
  PORTAL_PORTLET_ID varchar(20),
  PORTLET_SEQ_ID varchar(20),
  ATTR_NAME varchar(60),
  ATTR_VALUE varchar(255),
  ATTR_TYPE varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE portlet_category (
  PORTLET_CATEGORY_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE portlet_portlet_category (
  PORTAL_PORTLET_ID varchar(20),
  PORTLET_CATEGORY_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE pos_terminal (
  POS_TERMINAL_ID varchar(20),
  FACILITY_ID varchar(20),
  PUSH_ENTITY_SYNC_ID varchar(20),
  TERMINAL_NAME varchar(100),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE pos_terminal_intern_tx (
  POS_TERMINAL_LOG_ID varchar(20),
  PAID_AMOUNT decimal(18,2),
  REASON_COMMENT varchar(255),
  REASON_ENUM_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE pos_terminal_log (
  POS_TERMINAL_LOG_ID varchar(20),
  POS_TERMINAL_ID varchar(20),
  TRANSACTION_ID varchar(20),
  ITEM_COUNT decimal(20,0),
  ORDER_ID varchar(20),
  RETURN_ID varchar(20),
  USER_LOGIN_ID varchar(250),
  STATUS_ID varchar(20),
  LOG_START_DATE_TIME datetime,
  LOG_END_DATE_TIME datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE pos_terminal_state (
  POS_TERMINAL_ID varchar(20),
  OPENED_DATE datetime,
  CLOSED_DATE datetime,
  STARTING_TX_ID varchar(60),
  ENDING_TX_ID varchar(60),
  OPENED_BY_USER_LOGIN_ID varchar(250),
  CLOSED_BY_USER_LOGIN_ID varchar(250),
  STARTING_DRAWER_AMOUNT decimal(18,2),
  ACTUAL_ENDING_CASH decimal(18,2),
  ACTUAL_ENDING_CHECK decimal(18,2),
  ACTUAL_ENDING_CC decimal(18,2),
  ACTUAL_ENDING_GC decimal(18,2),
  ACTUAL_ENDING_OTHER decimal(18,2),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE priority_type (
  PRIORITY_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE prod_conf_item_content (
  CONFIG_ITEM_ID varchar(20),
  CONTENT_ID varchar(20),
  CONF_ITEM_CONTENT_TYPE_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE prod_conf_item_content_type (
  CONF_ITEM_CONTENT_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product (
  PRODUCT_ID varchar(20),
  PRODUCT_TYPE_ID varchar(20),
  PRIMARY_PRODUCT_CATEGORY_ID varchar(20),
  MANUFACTURER_PARTY_ID varchar(20),
  FACILITY_ID varchar(20),
  INTRODUCTION_DATE datetime,
  SUPPORT_DISCONTINUATION_DATE datetime,
  SALES_DISCONTINUATION_DATE datetime,
  SALES_DISC_WHEN_NOT_AVAIL char(1),
  INTERNAL_NAME varchar(255),
  BRAND_NAME varchar(100),
  COMMENTS varchar(255),
  PRODUCT_NAME varchar(100),
  DESCRIPTION varchar(255),
  LONG_DESCRIPTION longtext,
  PRICE_DETAIL_TEXT varchar(255),
  SMALL_IMAGE_URL varchar(255),
  MEDIUM_IMAGE_URL varchar(255),
  LARGE_IMAGE_URL varchar(255),
  DETAIL_IMAGE_URL varchar(255),
  ORIGINAL_IMAGE_URL varchar(255),
  DETAIL_SCREEN varchar(255),
  INVENTORY_MESSAGE varchar(255),
  REQUIRE_INVENTORY char(1),
  QUANTITY_UOM_ID varchar(20),
  QUANTITY_INCLUDED decimal(18,6),
  PIECES_INCLUDED decimal(20,0),
  REQUIRE_AMOUNT char(1),
  FIXED_AMOUNT decimal(18,2),
  AMOUNT_UOM_TYPE_ID varchar(20),
  WEIGHT_UOM_ID varchar(20),
  WEIGHT decimal(18,6),
  HEIGHT_UOM_ID varchar(20),
  PRODUCT_HEIGHT decimal(18,6),
  SHIPPING_HEIGHT decimal(18,6),
  WIDTH_UOM_ID varchar(20),
  PRODUCT_WIDTH decimal(18,6),
  SHIPPING_WIDTH decimal(18,6),
  DEPTH_UOM_ID varchar(20),
  PRODUCT_DEPTH decimal(18,6),
  SHIPPING_DEPTH decimal(18,6),
  PRODUCT_RATING decimal(18,6),
  RATING_TYPE_ENUM varchar(20),
  RETURNABLE char(1),
  TAXABLE char(1),
  CHARGE_SHIPPING char(1),
  AUTO_CREATE_KEYWORDS char(1),
  INCLUDE_IN_PROMOTIONS char(1),
  IS_VIRTUAL char(1),
  IS_VARIANT char(1),
  VIRTUAL_VARIANT_METHOD_ENUM varchar(20),
  ORIGIN_GEO_ID varchar(20),
  REQUIREMENT_METHOD_ENUM_ID varchar(20),
  BILL_OF_MATERIAL_LEVEL decimal(20,0),
  RESERV_MAX_PERSONS decimal(18,6),
  RESERV2ND_P_P_PERC decimal(18,6),
  RESERV_NTH_P_P_PERC decimal(18,6),
  CONFIG_ID varchar(20),
  CREATED_DATE datetime,
  CREATED_BY_USER_LOGIN varchar(250),
  LAST_MODIFIED_DATE datetime,
  LAST_MODIFIED_BY_USER_LOGIN varchar(250),
  IN_SHIPPING_BOX char(1),
  DEFAULT_SHIPMENT_BOX_TYPE_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  IS_CHEMICAL char(1),
  SERIALIZED char(1),
  SHELF_LIFE char(1),
  EXTERNAL_ID varchar(20),
  DEFAULT_LEAD_TIME_DAYS decimal(18,6),
  RECEIVING_NOTE varchar(255),
  RELEASE_DATE datetime,
  PRODUCT_WEIGHT decimal(18,6),
  DIAMETER_UOM_ID varchar(20),
  PRODUCT_DIAMETER decimal(18,6),
  ANNUAL_FLIGHT_HOURS decimal(20,0),
  HAS_SLEEVES char(1),
  LIFE_LIMITATION char(1)
);

CREATE TABLE product_assoc (
  PRODUCT_ID varchar(20),
  PRODUCT_ID_TO varchar(20),
  PRODUCT_ASSOC_TYPE_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  SEQUENCE_NUM decimal(20,0),
  REASON varchar(255),
  QUANTITY decimal(18,6),
  SCRAP_FACTOR decimal(18,6),
  INSTRUCTION varchar(255),
  ROUTING_WORK_EFFORT_ID varchar(20),
  ESTIMATE_CALC_METHOD varchar(20),
  RECURRENCE_INFO_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  DRAWING_ITEM_NUMBER varchar(100),
  USAGE_HOURS decimal(20,0),
  OEM_PARTY_ID varchar(20)
);

CREATE TABLE product_assoc_type (
  PRODUCT_ASSOC_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_attribute (
  PRODUCT_ID varchar(20),
  ATTR_NAME varchar(60),
  ATTR_VALUE varchar(255),
  ATTR_TYPE varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_average_cost (
  PRODUCT_AVERAGE_COST_TYPE_ID varchar(20),
  ORGANIZATION_PARTY_ID varchar(20),
  PRODUCT_ID varchar(20),
  FACILITY_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  AVERAGE_COST decimal(18,6),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  ITEM_CONDITION varchar(20),
  STANDARD_COST decimal(18,6),
  AFFECTED_QUANTITY decimal(18,6),
  QUANTITY_ON_HAND decimal(18,6),
  EFFECTIVE_DATE datetime,
  ORDER_ID varchar(20),
  ORDER_ITEM_SEQ_ID varchar(20),
  SHIP_GROUP_SEQ_ID varchar(20),
  SHIPMENT_ID varchar(20),
  SHIPMENT_ITEM_SEQ_ID varchar(20),
  RETURN_ID varchar(20),
  RETURN_ITEM_SEQ_ID varchar(20),
  WORK_EFFORT_ID varchar(20),
  FIXED_ASSET_ID varchar(20),
  MAINT_HIST_SEQ_ID varchar(20),
  ITEM_ISSUANCE_ID varchar(20),
  RECEIPT_ID varchar(20),
  PHYSICAL_INVENTORY_ID varchar(20),
  INVENTORY_TRANSFER_ID varchar(20),
  COMMENTS varchar(255)
);

CREATE TABLE product_average_cost_type (
  PRODUCT_AVERAGE_COST_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_calculated_info (
  PRODUCT_ID varchar(20),
  TOTAL_QUANTITY_ORDERED decimal(18,6),
  TOTAL_TIMES_VIEWED decimal(20,0),
  AVERAGE_CUSTOMER_RATING decimal(18,6),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_category (
  PRODUCT_CATEGORY_ID varchar(20),
  PRODUCT_CATEGORY_TYPE_ID varchar(20),
  PRIMARY_PARENT_CATEGORY_ID varchar(20),
  CATEGORY_NAME varchar(100),
  DESCRIPTION varchar(255),
  LONG_DESCRIPTION longtext,
  CATEGORY_IMAGE_URL varchar(255),
  LINK_ONE_IMAGE_URL varchar(255),
  LINK_TWO_IMAGE_URL varchar(255),
  DETAIL_SCREEN varchar(255),
  SHOW_IN_SELECT char(1),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  IS_COUNTABLE char(1)
);

CREATE TABLE product_category_attribute (
  PRODUCT_CATEGORY_ID varchar(20),
  ATTR_NAME varchar(60),
  ATTR_VALUE varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_category_content (
  PRODUCT_CATEGORY_ID varchar(20),
  CONTENT_ID varchar(20),
  PROD_CAT_CONTENT_TYPE_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  PURCHASE_FROM_DATE datetime,
  PURCHASE_THRU_DATE datetime,
  USE_COUNT_LIMIT decimal(20,0),
  USE_DAYS_LIMIT decimal(18,6),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_category_content_type (
  PROD_CAT_CONTENT_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_category_facility_location (
  FACILITY_ID varchar(20),
  LOCATION_SEQ_ID varchar(20),
  PRODUCT_CATEGORY_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  IS_COUNTABLE char(1),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_category_gl_account (
  PRODUCT_CATEGORY_ID varchar(20),
  ORGANIZATION_PARTY_ID varchar(20),
  GL_ACCOUNT_TYPE_ID varchar(20),
  GL_ACCOUNT_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_category_link (
  PRODUCT_CATEGORY_ID varchar(20),
  LINK_SEQ_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  COMMENTS varchar(255),
  SEQUENCE_NUM decimal(20,0),
  TITLE_TEXT varchar(255),
  DETAIL_TEXT longtext,
  IMAGE_URL varchar(255),
  IMAGE_TWO_URL varchar(255),
  LINK_TYPE_ENUM_ID varchar(20),
  LINK_INFO varchar(255),
  DETAIL_SUB_SCREEN varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_category_member (
  PRODUCT_CATEGORY_ID varchar(20),
  PRODUCT_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  COMMENTS varchar(255),
  SEQUENCE_NUM decimal(20,0),
  QUANTITY decimal(18,6),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_category_role (
  PRODUCT_CATEGORY_ID varchar(20),
  PARTY_ID varchar(20),
  ROLE_TYPE_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  COMMENTS varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_category_rollup (
  PRODUCT_CATEGORY_ID varchar(20),
  PARENT_PRODUCT_CATEGORY_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  SEQUENCE_NUM decimal(20,0),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_category_type (
  PRODUCT_CATEGORY_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_category_type_attr (
  PRODUCT_CATEGORY_TYPE_ID varchar(20),
  ATTR_NAME varchar(60),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_config (
  PRODUCT_ID varchar(20),
  CONFIG_ITEM_ID varchar(20),
  SEQUENCE_NUM decimal(20,0),
  FROM_DATE datetime,
  DESCRIPTION varchar(255),
  LONG_DESCRIPTION longtext,
  CONFIG_TYPE_ID varchar(20),
  DEFAULT_CONFIG_OPTION_ID varchar(20),
  THRU_DATE datetime,
  IS_MANDATORY char(1),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_config_config (
  CONFIG_ID varchar(20),
  CONFIG_ITEM_ID varchar(20),
  SEQUENCE_NUM decimal(20,0),
  CONFIG_OPTION_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_config_item (
  CONFIG_ITEM_ID varchar(20),
  CONFIG_ITEM_TYPE_ID varchar(20),
  CONFIG_ITEM_NAME varchar(100),
  DESCRIPTION varchar(255),
  LONG_DESCRIPTION longtext,
  IMAGE_URL varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_config_option (
  CONFIG_ITEM_ID varchar(20),
  CONFIG_OPTION_ID varchar(20),
  CONFIG_OPTION_NAME varchar(100),
  DESCRIPTION varchar(255),
  SEQUENCE_NUM decimal(20,0),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_config_option_iactn (
  CONFIG_ITEM_ID varchar(20),
  CONFIG_OPTION_ID varchar(20),
  CONFIG_ITEM_ID_TO varchar(20),
  CONFIG_OPTION_ID_TO varchar(20),
  SEQUENCE_NUM decimal(20,0),
  CONFIG_IACTN_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_config_product (
  CONFIG_ITEM_ID varchar(20),
  CONFIG_OPTION_ID varchar(20),
  PRODUCT_ID varchar(20),
  QUANTITY decimal(18,6),
  SEQUENCE_NUM decimal(20,0),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_config_stats (
  CONFIG_ID varchar(20),
  PRODUCT_ID varchar(20),
  NUM_OF_CONFS decimal(20,0),
  CONFIG_TYPE_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_content (
  PRODUCT_ID varchar(20),
  CONTENT_ID varchar(20),
  PRODUCT_CONTENT_TYPE_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  PURCHASE_FROM_DATE datetime,
  PURCHASE_THRU_DATE datetime,
  USE_COUNT_LIMIT decimal(20,0),
  USE_TIME decimal(20,0),
  USE_TIME_UOM_ID varchar(20),
  USE_ROLE_TYPE_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  PRODUCT_STORE_ID varchar(20),
  SEQUENCE_NUM varchar(20),
  IS_MANDATORY varchar(20),
  IS_PUBLIC char(1)
);

CREATE TABLE product_content_type (
  PRODUCT_CONTENT_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_cost_component_calc (
  PRODUCT_ID varchar(20),
  COST_COMPONENT_TYPE_ID varchar(20),
  COST_COMPONENT_CALC_ID varchar(20),
  FROM_DATE datetime,
  SEQUENCE_NUM decimal(20,0),
  THRU_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_dimension (
  DIMENSION_ID varchar(20),
  PRODUCT_ID varchar(20),
  PRODUCT_TYPE varchar(255),
  BRAND_NAME varchar(100),
  INTERNAL_NAME varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_facility (
  PRODUCT_ID varchar(20),
  FACILITY_ID varchar(20),
  MINIMUM_STOCK decimal(18,6),
  REORDER_QUANTITY decimal(18,6),
  DAYS_TO_SHIP decimal(20,0),
  LAST_INVENTORY_COUNT decimal(18,6),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  FORECASTING_ENUM_ID varchar(20),
  PURCHASE_DISCONTINUATION_DATE datetime,
  CREATED_DATE datetime,
  CREATED_BY_USER_LOGIN varchar(20),
  LAST_MODIFIED_DATE datetime,
  LAST_MODIFIED_BY_USER_LOGIN varchar(20),
  ITEM_CONDITION varchar(20)
);

CREATE TABLE product_facility_condition (
  PRODUCT_ID varchar(20),
  FACILITY_ID varchar(20),
  ITEM_CONDITION varchar(20),
  MINIMUM_STOCK decimal(18,6),
  REORDER_QUANTITY decimal(18,6),
  DAYS_TO_SHIP decimal(20,0),
  PURCHASE_DISCONTINUATION_DATE datetime,
  FORECASTING_ENUM_ID varchar(20),
  CREATED_DATE datetime,
  CREATED_BY_USER_LOGIN varchar(20),
  LAST_MODIFIED_DATE datetime,
  LAST_MODIFIED_BY_USER_LOGIN varchar(20),
  LAST_INVENTORY_COUNT decimal(18,6),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_facility_location (
  PRODUCT_ID varchar(20),
  FACILITY_ID varchar(20),
  LOCATION_SEQ_ID varchar(20),
  MINIMUM_STOCK decimal(18,6),
  MOVE_QUANTITY decimal(18,6),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_feature (
  PRODUCT_FEATURE_ID varchar(20),
  PRODUCT_FEATURE_TYPE_ID varchar(20),
  PRODUCT_FEATURE_CATEGORY_ID varchar(20),
  DESCRIPTION varchar(255),
  UOM_ID varchar(20),
  NUMBER_SPECIFIED decimal(18,6),
  DEFAULT_AMOUNT decimal(18,2),
  DEFAULT_SEQUENCE_NUM decimal(20,0),
  ABBREV varchar(20),
  ID_CODE varchar(60),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_feature_appl (
  PRODUCT_ID varchar(20),
  PRODUCT_FEATURE_ID varchar(20),
  PRODUCT_FEATURE_APPL_TYPE_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  SEQUENCE_NUM decimal(20,0),
  AMOUNT decimal(18,2),
  RECURRING_AMOUNT decimal(18,2),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_feature_appl_attr (
  PRODUCT_ID varchar(20),
  PRODUCT_FEATURE_ID varchar(20),
  FROM_DATE datetime,
  ATTR_NAME varchar(60),
  ATTR_VALUE varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_feature_appl_type (
  PRODUCT_FEATURE_APPL_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_feature_cat_grp_appl (
  PRODUCT_CATEGORY_ID varchar(20),
  PRODUCT_FEATURE_GROUP_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_feature_category (
  PRODUCT_FEATURE_CATEGORY_ID varchar(20),
  PARENT_CATEGORY_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_feature_category_appl (
  PRODUCT_CATEGORY_ID varchar(20),
  PRODUCT_FEATURE_CATEGORY_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_feature_data_resource (
  DATA_RESOURCE_ID varchar(20),
  PRODUCT_FEATURE_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_feature_group (
  PRODUCT_FEATURE_GROUP_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_feature_group_appl (
  PRODUCT_FEATURE_GROUP_ID varchar(20),
  PRODUCT_FEATURE_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  SEQUENCE_NUM decimal(20,0),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_feature_iactn (
  PRODUCT_FEATURE_ID varchar(20),
  PRODUCT_FEATURE_ID_TO varchar(20),
  PRODUCT_FEATURE_IACTN_TYPE_ID varchar(20),
  PRODUCT_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_feature_iactn_type (
  PRODUCT_FEATURE_IACTN_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_feature_price (
  PRODUCT_FEATURE_ID varchar(20),
  PRODUCT_PRICE_TYPE_ID varchar(20),
  CURRENCY_UOM_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  PRICE decimal(18,3),
  CREATED_DATE datetime,
  CREATED_BY_USER_LOGIN varchar(250),
  LAST_MODIFIED_DATE datetime,
  LAST_MODIFIED_BY_USER_LOGIN varchar(250),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_feature_type (
  PRODUCT_FEATURE_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_geo (
  PRODUCT_ID varchar(20),
  GEO_ID varchar(20),
  PRODUCT_GEO_ENUM_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_gl_account (
  PRODUCT_ID varchar(20),
  ORGANIZATION_PARTY_ID varchar(20),
  GL_ACCOUNT_TYPE_ID varchar(20),
  GL_ACCOUNT_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_identification (
  PRODUCT_ID varchar(20),
  IDENTIFICATION_TYPE_ID varchar(20),
  IDENTIFICATION_VALUE varchar(255),
  FROM_DATE datetime,
  THRU_DATE datetime,
  CREATED_BY varchar(250),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_identification_type (
  PROD_IDENTIFICATION_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_keyword (
  PRODUCT_ID varchar(20),
  KEYWORD varchar(60),
  RELEVANCY_WEIGHT decimal(20,0),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_keyword_result (
  PRODUCT_KEYWORD_RESULT_ID varchar(20),
  VISIT_ID varchar(20),
  PRODUCT_CATEGORY_ID varchar(20),
  SEARCH_STRING varchar(60),
  INTRA_KEYWORD_OPERATOR varchar(10),
  ANY_PREFIX char(1),
  ANY_SUFFIX char(1),
  REMOVE_STEMS char(1),
  NUM_RESULTS decimal(20,0),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_maint (
  PRODUCT_ID varchar(20),
  PRODUCT_MAINT_SEQ_ID varchar(20),
  PRODUCT_MAINT_TYPE_ID varchar(20),
  MAINT_NAME varchar(100),
  MAINT_TEMPLATE_WORK_EFFORT_ID varchar(20),
  INTERVAL_QUANTITY decimal(18,6),
  INTERVAL_UOM_ID varchar(20),
  INTERVAL_METER_TYPE_ID varchar(20),
  REPEAT_COUNT decimal(20,0),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_maint_type (
  PRODUCT_MAINT_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  PARENT_TYPE_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_manufacturing_rule (
  RULE_ID varchar(20),
  PRODUCT_ID varchar(20),
  PRODUCT_ID_FOR varchar(20),
  PRODUCT_ID_IN varchar(20),
  RULE_SEQ_ID varchar(20),
  FROM_DATE datetime,
  PRODUCT_ID_IN_SUBST varchar(20),
  PRODUCT_FEATURE varchar(20),
  RULE_OPERATOR varchar(20),
  QUANTITY decimal(18,6),
  DESCRIPTION varchar(255),
  THRU_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_meter (
  PRODUCT_ID varchar(20),
  PRODUCT_METER_TYPE_ID varchar(20),
  METER_UOM_ID varchar(20),
  METER_NAME varchar(100),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_meter_type (
  PRODUCT_METER_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  DEFAULT_UOM_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_order_item (
  ORDER_ID varchar(20),
  ORDER_ITEM_SEQ_ID varchar(20),
  ENGAGEMENT_ID varchar(20),
  ENGAGEMENT_ITEM_SEQ_ID varchar(20),
  PRODUCT_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_payment_method_type (
  PRODUCT_ID varchar(20),
  PAYMENT_METHOD_TYPE_ID varchar(20),
  PRODUCT_PRICE_PURPOSE_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  SEQUENCE_NUM decimal(20,0),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_price (
  PRODUCT_ID varchar(20),
  PRODUCT_PRICE_TYPE_ID varchar(20),
  PRODUCT_PRICE_PURPOSE_ID varchar(20),
  CURRENCY_UOM_ID varchar(20),
  PRODUCT_STORE_GROUP_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  PRICE decimal(18,3),
  TERM_UOM_ID varchar(20),
  CUSTOM_PRICE_CALC_SERVICE varchar(20),
  CREATED_DATE datetime,
  CREATED_BY_USER_LOGIN varchar(250),
  LAST_MODIFIED_DATE datetime,
  LAST_MODIFIED_BY_USER_LOGIN varchar(250),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  OEM_PARTY_ID varchar(20)
);

CREATE TABLE product_price_action (
  PRODUCT_PRICE_RULE_ID varchar(20),
  PRODUCT_PRICE_ACTION_SEQ_ID varchar(20),
  PRODUCT_PRICE_ACTION_TYPE_ID varchar(20),
  AMOUNT decimal(18,6),
  RATE_CODE varchar(60),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_price_action_type (
  PRODUCT_PRICE_ACTION_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_price_auto_notice (
  PRODUCT_PRICE_NOTICE_ID varchar(20),
  FACILITY_ID varchar(20),
  RUN_DATE datetime,
  FROM_DATE datetime,
  THRU_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_price_change (
  PRODUCT_PRICE_CHANGE_ID varchar(20),
  PRODUCT_ID varchar(20),
  PRODUCT_PRICE_TYPE_ID varchar(20),
  PRODUCT_PRICE_PURPOSE_ID varchar(20),
  CURRENCY_UOM_ID varchar(20),
  PRODUCT_STORE_GROUP_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  PRICE decimal(18,2),
  OLD_PRICE decimal(18,2),
  CHANGED_DATE datetime,
  CHANGED_BY_USER_LOGIN varchar(250),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  COMMENTS varchar(255)
);

CREATE TABLE product_price_cond (
  PRODUCT_PRICE_RULE_ID varchar(20),
  PRODUCT_PRICE_COND_SEQ_ID varchar(20),
  INPUT_PARAM_ENUM_ID varchar(20),
  OPERATOR_ENUM_ID varchar(20),
  COND_VALUE varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_price_purpose (
  PRODUCT_PRICE_PURPOSE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_price_rule (
  PRODUCT_PRICE_RULE_ID varchar(20),
  RULE_NAME varchar(100),
  DESCRIPTION varchar(255),
  IS_SALE char(1),
  FROM_DATE datetime,
  THRU_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_price_type (
  PRODUCT_PRICE_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_promo (
  PRODUCT_PROMO_ID varchar(20),
  PROMO_NAME varchar(100),
  PROMO_TEXT varchar(255),
  USER_ENTERED char(1),
  SHOW_TO_CUSTOMER char(1),
  REQUIRE_CODE char(1),
  USE_LIMIT_PER_ORDER decimal(20,0),
  USE_LIMIT_PER_CUSTOMER decimal(20,0),
  USE_LIMIT_PER_PROMOTION decimal(20,0),
  BILLBACK_FACTOR decimal(18,6),
  OVERRIDE_ORG_PARTY_ID varchar(20),
  CREATED_DATE datetime,
  CREATED_BY_USER_LOGIN varchar(250),
  LAST_MODIFIED_DATE datetime,
  LAST_MODIFIED_BY_USER_LOGIN varchar(250),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_promo_action (
  PRODUCT_PROMO_ID varchar(20),
  PRODUCT_PROMO_RULE_ID varchar(20),
  PRODUCT_PROMO_ACTION_SEQ_ID varchar(20),
  PRODUCT_PROMO_ACTION_ENUM_ID varchar(20),
  ORDER_ADJUSTMENT_TYPE_ID varchar(20),
  QUANTITY decimal(18,6),
  AMOUNT decimal(18,6),
  PRODUCT_ID varchar(20),
  PARTY_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  SERVICE_NAME varchar(255)
);

CREATE TABLE product_promo_category (
  PRODUCT_PROMO_ID varchar(20),
  PRODUCT_PROMO_RULE_ID varchar(20),
  PRODUCT_PROMO_ACTION_SEQ_ID varchar(20),
  PRODUCT_PROMO_COND_SEQ_ID varchar(20),
  PRODUCT_CATEGORY_ID varchar(20),
  AND_GROUP_ID varchar(20),
  PRODUCT_PROMO_APPL_ENUM_ID varchar(20),
  INCLUDE_SUB_CATEGORIES char(1),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_promo_code (
  PRODUCT_PROMO_CODE_ID varchar(20),
  PRODUCT_PROMO_ID varchar(20),
  USER_ENTERED char(1),
  REQUIRE_EMAIL_OR_PARTY char(1),
  USE_LIMIT_PER_CODE decimal(20,0),
  USE_LIMIT_PER_CUSTOMER decimal(20,0),
  FROM_DATE datetime,
  THRU_DATE datetime,
  CREATED_DATE datetime,
  CREATED_BY_USER_LOGIN varchar(250),
  LAST_MODIFIED_DATE datetime,
  LAST_MODIFIED_BY_USER_LOGIN varchar(250),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_promo_code_email (
  PRODUCT_PROMO_CODE_ID varchar(20),
  EMAIL_ADDRESS varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_promo_code_party (
  PRODUCT_PROMO_CODE_ID varchar(20),
  PARTY_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_promo_cond (
  PRODUCT_PROMO_ID varchar(20),
  PRODUCT_PROMO_RULE_ID varchar(20),
  PRODUCT_PROMO_COND_SEQ_ID varchar(20),
  INPUT_PARAM_ENUM_ID varchar(20),
  OPERATOR_ENUM_ID varchar(20),
  COND_VALUE varchar(255),
  OTHER_VALUE varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_promo_content (
  PRODUCT_PROMO_ID varchar(20),
  CONTENT_ID varchar(20),
  PRODUCT_PROMO_CONTENT_TYPE_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_promo_product (
  PRODUCT_PROMO_ID varchar(20),
  PRODUCT_PROMO_RULE_ID varchar(20),
  PRODUCT_PROMO_ACTION_SEQ_ID varchar(20),
  PRODUCT_PROMO_COND_SEQ_ID varchar(20),
  PRODUCT_ID varchar(20),
  PRODUCT_PROMO_APPL_ENUM_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_promo_rule (
  PRODUCT_PROMO_ID varchar(20),
  PRODUCT_PROMO_RULE_ID varchar(20),
  RULE_NAME varchar(100),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_promo_use (
  ORDER_ID varchar(20),
  PROMO_SEQUENCE_ID varchar(20),
  PRODUCT_PROMO_ID varchar(20),
  PRODUCT_PROMO_CODE_ID varchar(20),
  PARTY_ID varchar(20),
  TOTAL_DISCOUNT_AMOUNT decimal(18,2),
  QUANTITY_LEFT_IN_ACTIONS decimal(18,6),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_qual (
  PRODUCT_ID varchar(20),
  QUAL_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  USER_ID varchar(20)
);

CREATE TABLE product_review (
  PRODUCT_REVIEW_ID varchar(20),
  PRODUCT_STORE_ID varchar(20),
  PRODUCT_ID varchar(20),
  USER_LOGIN_ID varchar(250),
  STATUS_ID varchar(20),
  POSTED_ANONYMOUS char(1),
  POSTED_DATE_TIME datetime,
  PRODUCT_RATING decimal(18,6),
  PRODUCT_REVIEW longtext,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_role (
  PRODUCT_ID varchar(20),
  PARTY_ID varchar(20),
  ROLE_TYPE_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  COMMENTS varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  SEQUENCE_NUM decimal(20,0)
);

CREATE TABLE product_search_constraint (
  PRODUCT_SEARCH_RESULT_ID varchar(20),
  CONSTRAINT_SEQ_ID varchar(20),
  CONSTRAINT_NAME varchar(255),
  INFO_STRING varchar(255),
  INCLUDE_SUB_CATEGORIES char(1),
  IS_AND char(1),
  ANY_PREFIX char(1),
  ANY_SUFFIX char(1),
  REMOVE_STEMS char(1),
  LOW_VALUE varchar(60),
  HIGH_VALUE varchar(60),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_search_result (
  PRODUCT_SEARCH_RESULT_ID varchar(20),
  VISIT_ID varchar(20),
  ORDER_BY_NAME varchar(255),
  IS_ASCENDING char(1),
  NUM_RESULTS decimal(20,0),
  SECONDS_TOTAL decimal(18,6),
  SEARCH_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_store (
  PRODUCT_STORE_ID varchar(20),
  PRIMARY_STORE_GROUP_ID varchar(20),
  STORE_NAME varchar(100),
  COMPANY_NAME varchar(100),
  TITLE varchar(100),
  SUBTITLE varchar(255),
  PAY_TO_PARTY_ID varchar(20),
  DAYS_TO_CANCEL_NON_PAY decimal(20,0),
  MANUAL_AUTH_IS_CAPTURE char(1),
  PRORATE_SHIPPING char(1),
  PRORATE_TAXES char(1),
  VIEW_CART_ON_ADD char(1),
  AUTO_SAVE_CART char(1),
  AUTO_APPROVE_REVIEWS char(1),
  IS_DEMO_STORE char(1),
  IS_IMMEDIATELY_FULFILLED char(1),
  INVENTORY_FACILITY_ID varchar(20),
  ONE_INVENTORY_FACILITY char(1),
  CHECK_INVENTORY char(1),
  RESERVE_INVENTORY char(1),
  RESERVE_ORDER_ENUM_ID varchar(20),
  REQUIRE_INVENTORY char(1),
  BALANCE_RES_ON_ORDER_CREATION char(1),
  REQUIREMENT_METHOD_ENUM_ID varchar(20),
  ORDER_NUMBER_PREFIX varchar(60),
  DEFAULT_LOCALE_STRING varchar(10),
  DEFAULT_CURRENCY_UOM_ID varchar(20),
  DEFAULT_SALES_CHANNEL_ENUM_ID varchar(20),
  ALLOW_PASSWORD char(1),
  DEFAULT_PASSWORD varchar(255),
  EXPLODE_ORDER_ITEMS char(1),
  CHECK_GC_BALANCE char(1),
  RETRY_FAILED_AUTHS char(1),
  HEADER_APPROVED_STATUS varchar(20),
  ITEM_APPROVED_STATUS varchar(20),
  DIGITAL_ITEM_APPROVED_STATUS varchar(20),
  HEADER_DECLINED_STATUS varchar(20),
  ITEM_DECLINED_STATUS varchar(20),
  HEADER_CANCEL_STATUS varchar(20),
  ITEM_CANCEL_STATUS varchar(20),
  AUTH_DECLINED_MESSAGE varchar(255),
  AUTH_FRAUD_MESSAGE varchar(255),
  AUTH_ERROR_MESSAGE varchar(255),
  VISUAL_THEME_ID varchar(20),
  STORE_CREDIT_ACCOUNT_ENUM_ID varchar(20),
  USE_PRIMARY_EMAIL_USERNAME char(1),
  REQUIRE_CUSTOMER_ROLE char(1),
  AUTO_INVOICE_DIGITAL_ITEMS char(1),
  REQ_SHIP_ADDR_FOR_DIG_ITEMS char(1),
  SHOW_CHECKOUT_GIFT_OPTIONS char(1),
  SELECT_PAYMENT_TYPE_PER_ITEM char(1),
  SHOW_PRICES_WITH_VAT_TAX char(1),
  SHOW_TAX_IS_EXEMPT char(1),
  VAT_TAX_AUTH_GEO_ID varchar(20),
  VAT_TAX_AUTH_PARTY_ID varchar(20),
  ENABLE_AUTO_SUGGESTION_LIST char(1),
  ENABLE_DIG_PROD_UPLOAD char(1),
  PROD_SEARCH_EXCLUDE_VARIANTS char(1),
  DIG_PROD_UPLOAD_CATEGORY_ID varchar(20),
  AUTO_ORDER_CC_TRY_EXP char(1),
  AUTO_ORDER_CC_TRY_OTHER_CARDS char(1),
  AUTO_ORDER_CC_TRY_LATER_NSF char(1),
  AUTO_ORDER_CC_TRY_LATER_MAX decimal(20,0),
  STORE_CREDIT_VALID_DAYS decimal(20,0),
  AUTO_APPROVE_INVOICE char(1),
  AUTO_APPROVE_ORDER char(1),
  SHIP_IF_CAPTURE_FAILS char(1),
  SET_OWNER_UPON_ISSUANCE char(1),
  REQ_RETURN_INVENTORY_RECEIVE char(1),
  ADD_TO_CART_REMOVE_INCOMPAT char(1),
  ADD_TO_CART_REPLACE_UPSELL char(1),
  SPLIT_PAY_PREF_PER_SHP_GRP char(1),
  SHOW_OUT_OF_STOCK_PRODUCTS char(1),
  STYLE_SHEET varchar(255),
  HEADER_LOGO varchar(255),
  HEADER_MIDDLE_BACKGROUND varchar(255),
  HEADER_RIGHT_BACKGROUND varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_store_catalog (
  PRODUCT_STORE_ID varchar(20),
  PROD_CATALOG_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  SEQUENCE_NUM decimal(20,0),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_store_email_setting (
  PRODUCT_STORE_ID varchar(20),
  EMAIL_TYPE varchar(20),
  BODY_SCREEN_LOCATION varchar(255),
  XSLFO_ATTACH_SCREEN_LOCATION varchar(255),
  FROM_ADDRESS varchar(255),
  CC_ADDRESS varchar(255),
  BCC_ADDRESS varchar(255),
  SUBJECT varchar(255),
  CONTENT_TYPE varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_store_facility (
  PRODUCT_STORE_ID varchar(20),
  FACILITY_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  SEQUENCE_NUM decimal(20,0),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_store_fin_act_setting (
  PRODUCT_STORE_ID varchar(20),
  FIN_ACCOUNT_TYPE_ID varchar(20),
  REQUIRE_PIN_CODE char(1),
  VALIDATE_G_C_FIN_ACCT char(1),
  ACCOUNT_CODE_LENGTH decimal(20,0),
  PIN_CODE_LENGTH decimal(20,0),
  ACCOUNT_VALID_DAYS decimal(20,0),
  AUTH_VALID_DAYS decimal(20,0),
  PURCHASE_SURVEY_ID varchar(20),
  PURCH_SURVEY_SEND_TO varchar(20),
  PURCH_SURVEY_COPY_ME varchar(20),
  ALLOW_AUTH_TO_NEGATIVE char(1),
  MIN_BALANCE decimal(18,2),
  REPLENISH_THRESHOLD decimal(18,2),
  REPLENISH_METHOD_ENUM_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_store_group (
  PRODUCT_STORE_GROUP_ID varchar(20),
  PRODUCT_STORE_GROUP_TYPE_ID varchar(20),
  PRIMARY_PARENT_GROUP_ID varchar(20),
  PRODUCT_STORE_GROUP_NAME varchar(100),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_store_group_member (
  PRODUCT_STORE_ID varchar(20),
  PRODUCT_STORE_GROUP_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  SEQUENCE_NUM decimal(20,0),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_store_group_role (
  PRODUCT_STORE_GROUP_ID varchar(20),
  PARTY_ID varchar(20),
  ROLE_TYPE_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_store_group_rollup (
  PRODUCT_STORE_GROUP_ID varchar(20),
  PARENT_GROUP_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  SEQUENCE_NUM decimal(20,0),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_store_group_type (
  PRODUCT_STORE_GROUP_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_store_keyword_ovrd (
  PRODUCT_STORE_ID varchar(20),
  KEYWORD varchar(60),
  FROM_DATE datetime,
  THRU_DATE datetime,
  TARGET varchar(255),
  TARGET_TYPE_ENUM_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_store_payment_setting (
  PRODUCT_STORE_ID varchar(20),
  PAYMENT_METHOD_TYPE_ID varchar(20),
  PAYMENT_SERVICE_TYPE_ENUM_ID varchar(20),
  PAYMENT_SERVICE varchar(255),
  PAYMENT_CUSTOM_METHOD_ID varchar(20),
  PAYMENT_GATEWAY_CONFIG_ID varchar(20),
  PAYMENT_PROPERTIES_PATH varchar(255),
  APPLY_TO_ALL_PRODUCTS char(1),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_store_promo_appl (
  PRODUCT_STORE_ID varchar(20),
  PRODUCT_PROMO_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  SEQUENCE_NUM decimal(20,0),
  MANUAL_ONLY char(1),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_store_role (
  PARTY_ID varchar(20),
  ROLE_TYPE_ID varchar(20),
  PRODUCT_STORE_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  SEQUENCE_NUM decimal(20,0),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_store_shipment_meth (
  PRODUCT_STORE_SHIP_METH_ID varchar(20),
  PRODUCT_STORE_ID varchar(20),
  SHIPMENT_METHOD_TYPE_ID varchar(20),
  PARTY_ID varchar(20),
  ROLE_TYPE_ID varchar(20),
  COMPANY_PARTY_ID varchar(20),
  MIN_WEIGHT decimal(18,6),
  MAX_WEIGHT decimal(18,6),
  MIN_SIZE decimal(18,6),
  MAX_SIZE decimal(18,6),
  MIN_TOTAL decimal(18,2),
  MAX_TOTAL decimal(18,2),
  ALLOW_USPS_ADDR char(1),
  REQUIRE_USPS_ADDR char(1),
  ALLOW_COMPANY_ADDR char(1),
  REQUIRE_COMPANY_ADDR char(1),
  INCLUDE_NO_CHARGE_ITEMS char(1),
  INCLUDE_FEATURE_GROUP varchar(20),
  EXCLUDE_FEATURE_GROUP varchar(20),
  INCLUDE_GEO_ID varchar(20),
  EXCLUDE_GEO_ID varchar(20),
  SERVICE_NAME varchar(255),
  CONFIG_PROPS varchar(255),
  SHIPMENT_CUSTOM_METHOD_ID varchar(20),
  SHIPMENT_GATEWAY_CONFIG_ID varchar(20),
  SEQUENCE_NUMBER decimal(20,0),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_store_survey_appl (
  PRODUCT_STORE_SURVEY_ID varchar(20),
  PRODUCT_STORE_ID varchar(20),
  SURVEY_APPL_TYPE_ID varchar(20),
  GROUP_NAME varchar(100),
  SURVEY_ID varchar(20),
  PRODUCT_ID varchar(20),
  PRODUCT_CATEGORY_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  SURVEY_TEMPLATE varchar(255),
  RESULT_TEMPLATE varchar(255),
  SEQUENCE_NUM decimal(20,0),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_store_vendor_payment (
  PRODUCT_STORE_ID varchar(20),
  VENDOR_PARTY_ID varchar(20),
  PAYMENT_METHOD_TYPE_ID varchar(20),
  CREDIT_CARD_ENUM_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_store_vendor_shipment (
  PRODUCT_STORE_ID varchar(20),
  VENDOR_PARTY_ID varchar(20),
  SHIPMENT_METHOD_TYPE_ID varchar(20),
  CARRIER_PARTY_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_subscription_resource (
  PRODUCT_ID varchar(20),
  SUBSCRIPTION_RESOURCE_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  PURCHASE_FROM_DATE datetime,
  PURCHASE_THRU_DATE datetime,
  MAX_LIFE_TIME decimal(20,0),
  MAX_LIFE_TIME_UOM_ID varchar(20),
  AVAILABLE_TIME decimal(20,0),
  AVAILABLE_TIME_UOM_ID varchar(20),
  USE_COUNT_LIMIT decimal(20,0),
  USE_TIME decimal(20,0),
  USE_TIME_UOM_ID varchar(20),
  USE_ROLE_TYPE_ID varchar(20),
  AUTOMATIC_EXTEND char(1),
  CANCL_AUTM_EXT_TIME decimal(20,0),
  CANCL_AUTM_EXT_TIME_UOM_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE product_type (
  PRODUCT_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  IS_PHYSICAL char(1),
  IS_DIGITAL char(1),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  SOVOS_GOOD_SERVICE_CODE varchar(60)
);

CREATE TABLE product_type_attr (
  PRODUCT_TYPE_ID varchar(20),
  ATTR_NAME varchar(60),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE protected_view (
  GROUP_ID varchar(20),
  VIEW_NAME_ID varchar(60),
  MAX_HITS decimal(20,0),
  MAX_HITS_DURATION decimal(20,0),
  TARPIT_DURATION decimal(20,0),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE protocol_type (
  PROTOCOL_TYPE_ID varchar(20),
  PROTOCOL_NAME varchar(100),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE quantity_break (
  QUANTITY_BREAK_ID varchar(20),
  QUANTITY_BREAK_TYPE_ID varchar(20),
  FROM_QUANTITY decimal(18,6),
  THRU_QUANTITY decimal(18,6),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE quantity_break_type (
  QUANTITY_BREAK_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE rate_amount (
  RATE_TYPE_ID varchar(20),
  RATE_CURRENCY_UOM_ID varchar(20),
  PERIOD_TYPE_ID varchar(20),
  WORK_EFFORT_ID varchar(20),
  PARTY_ID varchar(20),
  EMPL_POSITION_TYPE_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  RATE_AMOUNT decimal(18,2),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE rate_type (
  RATE_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE recurrence_info (
  RECURRENCE_INFO_ID varchar(20),
  START_DATE_TIME datetime,
  EXCEPTION_DATE_TIMES longtext,
  RECURRENCE_DATE_TIMES longtext,
  EXCEPTION_RULE_ID varchar(20),
  RECURRENCE_RULE_ID varchar(20),
  RECURRENCE_COUNT decimal(20,0),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE recurrence_rule (
  RECURRENCE_RULE_ID varchar(20),
  FREQUENCY varchar(60),
  UNTIL_DATE_TIME datetime,
  COUNT_NUMBER decimal(20,0),
  INTERVAL_NUMBER decimal(20,0),
  BY_SECOND_LIST longtext,
  BY_MINUTE_LIST longtext,
  BY_HOUR_LIST longtext,
  BY_DAY_LIST longtext,
  BY_MONTH_DAY_LIST longtext,
  BY_YEAR_DAY_LIST longtext,
  BY_WEEK_NO_LIST longtext,
  BY_MONTH_LIST longtext,
  BY_SET_POS_LIST longtext,
  WEEK_START varchar(60),
  X_NAME longtext,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE rejection_reason (
  REJECTION_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE reorder_guideline (
  REORDER_GUIDELINE_ID varchar(20),
  PRODUCT_ID varchar(20),
  PARTY_ID varchar(20),
  ROLE_TYPE_ID varchar(20),
  FACILITY_ID varchar(20),
  GEO_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  REORDER_QUANTITY decimal(18,6),
  REORDER_LEVEL decimal(18,6),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE requirement (
  REQUIREMENT_ID varchar(20),
  REQUIREMENT_TYPE_ID varchar(20),
  FACILITY_ID varchar(20),
  DELIVERABLE_ID varchar(20),
  FIXED_ASSET_ID varchar(20),
  PRODUCT_ID varchar(20),
  STATUS_ID varchar(20),
  DESCRIPTION varchar(255),
  REQUIREMENT_START_DATE datetime,
  REQUIRED_BY_DATE datetime,
  ESTIMATED_BUDGET decimal(18,2),
  QUANTITY decimal(18,6),
  USE_CASE longtext,
  REASON varchar(255),
  CREATED_DATE datetime,
  CREATED_BY_USER_LOGIN varchar(250),
  LAST_MODIFIED_DATE datetime,
  LAST_MODIFIED_BY_USER_LOGIN varchar(250),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  ITEM_CONDITION varchar(20),
  LAST_SUPPLIER_ID varchar(20),
  LAST_SUPPLIER_NAME varchar(100),
  LAST_SUPPLIER_PRICE decimal(18,3),
  OPEN_PO_QTY decimal(18,6),
  MIN_ORDER_QTY decimal(18,6)
);

CREATE TABLE requirement_attribute (
  REQUIREMENT_ID varchar(20),
  ATTR_NAME varchar(60),
  ATTR_VALUE varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE requirement_budget_allocation (
  BUDGET_ID varchar(20),
  BUDGET_ITEM_SEQ_ID varchar(20),
  REQUIREMENT_ID varchar(20),
  AMOUNT decimal(18,2),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE requirement_cust_request (
  CUST_REQUEST_ID varchar(20),
  CUST_REQUEST_ITEM_SEQ_ID varchar(20),
  REQUIREMENT_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE requirement_role (
  REQUIREMENT_ID varchar(20),
  PARTY_ID varchar(20),
  ROLE_TYPE_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE requirement_status (
  REQUIREMENT_ID varchar(20),
  STATUS_ID varchar(20),
  STATUS_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE requirement_type (
  REQUIREMENT_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE requirement_type_attr (
  REQUIREMENT_TYPE_ID varchar(20),
  ATTR_NAME varchar(60),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE responsibility_type (
  RESPONSIBILITY_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE return_adjustment (
  RETURN_ADJUSTMENT_ID varchar(20),
  RETURN_ADJUSTMENT_TYPE_ID varchar(20),
  RETURN_ID varchar(20),
  RETURN_ITEM_SEQ_ID varchar(20),
  SHIP_GROUP_SEQ_ID varchar(20),
  COMMENTS varchar(255),
  DESCRIPTION varchar(255),
  RETURN_TYPE_ID varchar(20),
  ORDER_ADJUSTMENT_ID varchar(20),
  AMOUNT decimal(18,3),
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
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE return_adjustment_type (
  RETURN_ADJUSTMENT_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE return_header (
  RETURN_ID varchar(20),
  RETURN_HEADER_TYPE_ID varchar(20),
  STATUS_ID varchar(20),
  CREATED_BY varchar(250),
  FROM_PARTY_ID varchar(20),
  TO_PARTY_ID varchar(20),
  PAYMENT_METHOD_ID varchar(20),
  FIN_ACCOUNT_ID varchar(20),
  BILLING_ACCOUNT_ID varchar(20),
  ENTRY_DATE datetime,
  ORIGIN_CONTACT_MECH_ID varchar(20),
  DESTINATION_FACILITY_ID varchar(20),
  NEEDS_INVENTORY_RECEIVE char(1),
  CURRENCY_UOM_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  RMA_NUMBER varchar(255)
);

CREATE TABLE return_header_type (
  RETURN_HEADER_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE return_item (
  RETURN_ID varchar(20),
  RETURN_ITEM_SEQ_ID varchar(20),
  RETURN_REASON_ID varchar(20),
  RETURN_TYPE_ID varchar(20),
  RETURN_ITEM_TYPE_ID varchar(20),
  PRODUCT_ID varchar(20),
  DESCRIPTION varchar(255),
  ORDER_ID varchar(20),
  ORDER_ITEM_SEQ_ID varchar(20),
  STATUS_ID varchar(20),
  EXPECTED_ITEM_STATUS varchar(20),
  RETURN_QUANTITY decimal(18,6),
  RECEIVED_QUANTITY decimal(18,6),
  RETURN_PRICE decimal(18,2),
  RETURN_ITEM_RESPONSE_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE return_item_billing (
  RETURN_ID varchar(20),
  RETURN_ITEM_SEQ_ID varchar(20),
  INVOICE_ID varchar(20),
  INVOICE_ITEM_SEQ_ID varchar(20),
  SHIPMENT_RECEIPT_ID varchar(20),
  QUANTITY decimal(18,6),
  AMOUNT decimal(18,2),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE return_item_response (
  RETURN_ITEM_RESPONSE_ID varchar(20),
  ORDER_PAYMENT_PREFERENCE_ID varchar(20),
  REPLACEMENT_ORDER_ID varchar(20),
  PAYMENT_ID varchar(20),
  BILLING_ACCOUNT_ID varchar(20),
  FIN_ACCOUNT_TRANS_ID varchar(20),
  RESPONSE_AMOUNT decimal(18,2),
  RESPONSE_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE return_item_shipment (
  RETURN_ID varchar(20),
  RETURN_ITEM_SEQ_ID varchar(20),
  SHIPMENT_ID varchar(20),
  SHIPMENT_ITEM_SEQ_ID varchar(20),
  QUANTITY decimal(18,6),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE return_item_type (
  RETURN_ITEM_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE return_item_type_map (
  RETURN_ITEM_MAP_KEY varchar(20),
  RETURN_HEADER_TYPE_ID varchar(20),
  RETURN_ITEM_TYPE_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE return_reason (
  RETURN_REASON_ID varchar(20),
  DESCRIPTION varchar(255),
  SEQUENCE_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE return_status (
  RETURN_STATUS_ID varchar(20),
  STATUS_ID varchar(20),
  RETURN_ID varchar(20),
  RETURN_ITEM_SEQ_ID varchar(20),
  CHANGE_BY_USER_LOGIN_ID varchar(250),
  STATUS_DATETIME datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE return_type (
  RETURN_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  SEQUENCE_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE runtime_data (
  RUNTIME_DATA_ID varchar(20),
  RUNTIME_INFO longtext,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE salary_step (
  SALARY_STEP_SEQ_ID varchar(20),
  PAY_GRADE_ID varchar(20),
  DATE_MODIFIED datetime,
  AMOUNT decimal(18,2),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE sale_type (
  SALE_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE sales_forecast (
  SALES_FORECAST_ID varchar(20),
  PARENT_SALES_FORECAST_ID varchar(20),
  ORGANIZATION_PARTY_ID varchar(20),
  INTERNAL_PARTY_ID varchar(20),
  CUSTOM_TIME_PERIOD_ID varchar(20),
  CURRENCY_UOM_ID varchar(20),
  QUOTA_AMOUNT decimal(18,2),
  FORECAST_AMOUNT decimal(18,2),
  BEST_CASE_AMOUNT decimal(18,2),
  CLOSED_AMOUNT decimal(18,2),
  PERCENT_OF_QUOTA_FORECAST decimal(18,6),
  PERCENT_OF_QUOTA_CLOSED decimal(18,6),
  PIPELINE_AMOUNT decimal(18,2),
  CREATED_BY_USER_LOGIN_ID varchar(250),
  MODIFIED_BY_USER_LOGIN_ID varchar(250),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE sales_forecast_detail (
  SALES_FORECAST_ID varchar(20),
  SALES_FORECAST_DETAIL_ID varchar(20),
  AMOUNT decimal(18,2),
  QUANTITY_UOM_ID varchar(20),
  QUANTITY decimal(18,6),
  PRODUCT_ID varchar(20),
  PRODUCT_CATEGORY_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE sales_forecast_history (
  SALES_FORECAST_HISTORY_ID varchar(20),
  SALES_FORECAST_ID varchar(20),
  PARENT_SALES_FORECAST_ID varchar(20),
  ORGANIZATION_PARTY_ID varchar(20),
  INTERNAL_PARTY_ID varchar(20),
  CUSTOM_TIME_PERIOD_ID varchar(20),
  CURRENCY_UOM_ID varchar(20),
  QUOTA_AMOUNT decimal(18,2),
  FORECAST_AMOUNT decimal(18,2),
  BEST_CASE_AMOUNT decimal(18,2),
  CLOSED_AMOUNT decimal(18,2),
  PERCENT_OF_QUOTA_FORECAST decimal(18,6),
  PERCENT_OF_QUOTA_CLOSED decimal(18,6),
  CHANGE_NOTE longtext,
  MODIFIED_BY_USER_LOGIN_ID varchar(250),
  MODIFIED_TIMESTAMP datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE sales_invoice_item_fact (
  INVOICE_ID varchar(20),
  INVOICE_ITEM_SEQ_ID varchar(20),
  ORDER_ID varchar(20),
  INVOICE_DATE_DIM_ID varchar(20),
  PRODUCT_DIM_ID varchar(20),
  BILL_TO_CUSTOMER_DIM_ID varchar(20),
  ORIG_CURRENCY_DIM_ID varchar(20),
  QUANTITY decimal(18,6),
  EXT_GROSS_AMOUNT decimal(18,3),
  EXT_DISCOUNT_AMOUNT decimal(18,3),
  EXT_NET_AMOUNT decimal(18,3),
  EXT_TAX_AMOUNT decimal(18,3),
  EXT_MAN_FIXED_COST decimal(18,3),
  EXT_MAN_VAR_COST decimal(18,3),
  EXT_STORAGE_COST decimal(18,3),
  EXT_DISTRIBUTION_COST decimal(18,3),
  CONTRIBUTION_AMOUNT decimal(18,3),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE sales_opportunity (
  SALES_OPPORTUNITY_ID varchar(20),
  OPPORTUNITY_NAME varchar(100),
  DESCRIPTION longtext,
  NEXT_STEP longtext,
  ESTIMATED_AMOUNT decimal(18,2),
  ESTIMATED_PROBABILITY decimal(18,6),
  CURRENCY_UOM_ID varchar(20),
  MARKETING_CAMPAIGN_ID varchar(20),
  DATA_SOURCE_ID varchar(20),
  ESTIMATED_CLOSE_DATE datetime,
  OPPORTUNITY_STAGE_ID varchar(20),
  TYPE_ENUM_ID varchar(20),
  CREATED_BY_USER_LOGIN varchar(250),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE sales_opportunity_competitor (
  SALES_OPPORTUNITY_ID varchar(20),
  COMPETITOR_PARTY_ID varchar(20),
  POSITION_ENUM_ID varchar(20),
  STRENGTHS longtext,
  WEAKNESSES longtext,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE sales_opportunity_history (
  SALES_OPPORTUNITY_HISTORY_ID varchar(20),
  SALES_OPPORTUNITY_ID varchar(20),
  DESCRIPTION longtext,
  NEXT_STEP longtext,
  ESTIMATED_AMOUNT decimal(18,2),
  ESTIMATED_PROBABILITY decimal(18,6),
  CURRENCY_UOM_ID varchar(20),
  ESTIMATED_CLOSE_DATE datetime,
  OPPORTUNITY_STAGE_ID varchar(20),
  CHANGE_NOTE longtext,
  MODIFIED_BY_USER_LOGIN varchar(250),
  MODIFIED_TIMESTAMP datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE sales_opportunity_quote (
  SALES_OPPORTUNITY_ID varchar(20),
  QUOTE_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE sales_opportunity_role (
  SALES_OPPORTUNITY_ID varchar(20),
  PARTY_ID varchar(20),
  ROLE_TYPE_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE sales_opportunity_stage (
  OPPORTUNITY_STAGE_ID varchar(20),
  DESCRIPTION varchar(255),
  DEFAULT_PROBABILITY decimal(18,6),
  SEQUENCE_NUM decimal(20,0),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE sales_opportunity_trck_code (
  SALES_OPPORTUNITY_ID varchar(20),
  TRACKING_CODE_ID varchar(20),
  RECEIVED_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE sales_opportunity_work_effort (
  SALES_OPPORTUNITY_ID varchar(20),
  WORK_EFFORT_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE sales_order_item_fact (
  ORDER_ID varchar(20),
  ORDER_ITEM_SEQ_ID varchar(20),
  ORDER_DATE_DIM_ID varchar(20),
  PRODUCT_DIM_ID varchar(20),
  ORIG_CURRENCY_DIM_ID varchar(20),
  BILL_TO_CUSTOMER_DIM_ID varchar(20),
  PRODUCT_STORE_ID varchar(20),
  SALES_CHANNEL_ENUM_ID varchar(20),
  SALE_CHANNEL varchar(255),
  ORDER_STATUS varchar(255),
  VISIT_ID varchar(20),
  INITIAL_REFERRER varchar(255),
  PRODUCT_PROMO_CODE varchar(20),
  CATEGORY_NAME varchar(20),
  QUANTITY decimal(18,6),
  EXT_GROSS_AMOUNT decimal(18,3),
  EXT_GROSS_COST decimal(18,3),
  EXT_DISCOUNT_AMOUNT decimal(18,3),
  EXT_NET_AMOUNT decimal(18,3),
  EXT_SHIPPING_AMOUNT decimal(18,3),
  EXT_TAX_AMOUNT decimal(18,3),
  GROSS_SALES decimal(18,3),
  GROSS_MERCHANDIZE_SALES decimal(18,3),
  GROSS_MERCHANDIZE_PROFIT decimal(18,3),
  GROSS_SHIPPING_PROFIT decimal(18,3),
  GROSS_PROFIT decimal(18,3),
  E_BAY decimal(18,3),
  R_R_C decimal(18,3),
  OTHER_FREE decimal(18,3),
  N_B_O decimal(18,3),
  COUNT_DATE decimal(18,3),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE segment_group (
  SEGMENT_GROUP_ID varchar(20),
  SEGMENT_GROUP_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  PRODUCT_STORE_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE segment_group_classification (
  SEGMENT_GROUP_ID varchar(20),
  PARTY_CLASSIFICATION_GROUP_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE segment_group_geo (
  SEGMENT_GROUP_ID varchar(20),
  GEO_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE segment_group_role (
  SEGMENT_GROUP_ID varchar(20),
  PARTY_ID varchar(20),
  ROLE_TYPE_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE segment_group_type (
  SEGMENT_GROUP_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE selenium_test_suite_path (
  TEST_SUITE_ID varchar(20),
  TEST_SUITE_NAME varchar(100),
  TEST_SUITE_PATH varchar(255),
  DESCRIPTION longtext,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE sequence_value_item (
  SEQ_NAME varchar(60),
  SEQ_ID decimal(20,0),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE server_hit (
  VISIT_ID varchar(20),
  CONTENT_ID varchar(250),
  HIT_START_DATE_TIME datetime,
  HIT_TYPE_ID varchar(20),
  NUM_OF_BYTES decimal(20,0),
  RUNNING_TIME_MILLIS decimal(20,0),
  USER_LOGIN_ID varchar(250),
  STATUS_ID varchar(20),
  REQUEST_URL varchar(255),
  REFERRER_URL varchar(255),
  SERVER_IP_ADDRESS varchar(20),
  SERVER_HOST_NAME varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  INTERNAL_CONTENT_ID varchar(20),
  PARTY_ID varchar(20),
  ID_BY_IP_CONTACT_MECH_ID varchar(20),
  REF_BY_WEB_CONTACT_MECH_ID varchar(20)
);

CREATE TABLE server_hit_bin (
  SERVER_HIT_BIN_ID varchar(20),
  CONTENT_ID varchar(250),
  HIT_TYPE_ID varchar(20),
  SERVER_IP_ADDRESS varchar(20),
  SERVER_HOST_NAME varchar(255),
  BIN_START_DATE_TIME datetime,
  BIN_END_DATE_TIME datetime,
  NUMBER_HITS decimal(20,0),
  TOTAL_TIME_MILLIS decimal(20,0),
  MIN_TIME_MILLIS decimal(20,0),
  MAX_TIME_MILLIS decimal(20,0),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  INTERNAL_CONTENT_ID varchar(20)
);

CREATE TABLE server_hit_type (
  HIT_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE service_semaphore (
  SERVICE_NAME varchar(100),
  LOCK_THREAD varchar(100),
  LOCK_TIME datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE settlement_term (
  SETTLEMENT_TERM_ID varchar(20),
  TERM_NAME varchar(100),
  TERM_VALUE decimal(20,0),
  UOM_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE shipment (
  SHIPMENT_ID varchar(20),
  SHIPMENT_TYPE_ID varchar(20),
  STATUS_ID varchar(20),
  PRIMARY_ORDER_ID varchar(20),
  PRIMARY_RETURN_ID varchar(20),
  PRIMARY_SHIP_GROUP_SEQ_ID varchar(20),
  PICKLIST_BIN_ID varchar(20),
  ESTIMATED_READY_DATE datetime,
  ESTIMATED_SHIP_DATE datetime,
  ESTIMATED_SHIP_WORK_EFF_ID varchar(20),
  ESTIMATED_ARRIVAL_DATE datetime,
  ESTIMATED_ARRIVAL_WORK_EFF_ID varchar(20),
  LATEST_CANCEL_DATE datetime,
  ESTIMATED_SHIP_COST decimal(18,2),
  CURRENCY_UOM_ID varchar(20),
  HANDLING_INSTRUCTIONS varchar(255),
  ORIGIN_FACILITY_ID varchar(20),
  DESTINATION_FACILITY_ID varchar(20),
  ORIGIN_CONTACT_MECH_ID varchar(20),
  ORIGIN_TELECOM_NUMBER_ID varchar(20),
  DESTINATION_CONTACT_MECH_ID varchar(20),
  DESTINATION_TELECOM_NUMBER_ID varchar(20),
  PARTY_ID_TO varchar(20),
  PARTY_ID_FROM varchar(20),
  ADDITIONAL_SHIPPING_CHARGE decimal(18,2),
  ADDTL_SHIPPING_CHARGE_DESC varchar(255),
  CREATED_DATE datetime,
  CREATED_BY_USER_LOGIN varchar(250),
  LAST_MODIFIED_DATE datetime,
  LAST_MODIFIED_BY_USER_LOGIN varchar(250),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE shipment_attribute (
  SHIPMENT_ID varchar(20),
  ATTR_NAME varchar(60),
  ATTR_VALUE varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE shipment_box_type (
  SHIPMENT_BOX_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  DIMENSION_UOM_ID varchar(20),
  BOX_LENGTH decimal(18,6),
  BOX_WIDTH decimal(18,6),
  BOX_HEIGHT decimal(18,6),
  WEIGHT_UOM_ID varchar(20),
  BOX_WEIGHT decimal(18,6),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE shipment_contact_mech (
  SHIPMENT_ID varchar(20),
  SHIPMENT_CONTACT_MECH_TYPE_ID varchar(20),
  CONTACT_MECH_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE shipment_contact_mech_type (
  SHIPMENT_CONTACT_MECH_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE shipment_cost_estimate (
  SHIPMENT_COST_ESTIMATE_ID varchar(20),
  SHIPMENT_METHOD_TYPE_ID varchar(20),
  CARRIER_PARTY_ID varchar(20),
  CARRIER_ROLE_TYPE_ID varchar(20),
  PRODUCT_STORE_SHIP_METH_ID varchar(20),
  PRODUCT_STORE_ID varchar(20),
  PARTY_ID varchar(20),
  ROLE_TYPE_ID varchar(20),
  GEO_ID_TO varchar(20),
  GEO_ID_FROM varchar(20),
  WEIGHT_BREAK_ID varchar(20),
  WEIGHT_UOM_ID varchar(20),
  WEIGHT_UNIT_PRICE decimal(18,2),
  QUANTITY_BREAK_ID varchar(20),
  QUANTITY_UOM_ID varchar(20),
  QUANTITY_UNIT_PRICE decimal(18,2),
  PRICE_BREAK_ID varchar(20),
  PRICE_UOM_ID varchar(20),
  PRICE_UNIT_PRICE decimal(18,2),
  ORDER_FLAT_PRICE decimal(18,2),
  ORDER_PRICE_PERCENT decimal(18,6),
  ORDER_ITEM_FLAT_PRICE decimal(18,2),
  SHIPPING_PRICE_PERCENT decimal(18,6),
  PRODUCT_FEATURE_GROUP_ID varchar(20),
  OVERSIZE_UNIT decimal(18,6),
  OVERSIZE_PRICE decimal(18,2),
  FEATURE_PERCENT decimal(18,6),
  FEATURE_PRICE decimal(18,2),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE shipment_gateway_config (
  SHIPMENT_GATEWAY_CONFIG_ID varchar(20),
  SHIPMENT_GATEWAY_CONF_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE shipment_gateway_config_type (
  SHIPMENT_GATEWAY_CONF_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE shipment_gateway_dhl (
  SHIPMENT_GATEWAY_CONFIG_ID varchar(20),
  CONNECT_URL varchar(255),
  CONNECT_TIMEOUT decimal(20,0),
  HEAD_VERSION varchar(60),
  HEAD_ACTION varchar(255),
  ACCESS_USER_ID varchar(255),
  ACCESS_PASSWORD varchar(255),
  ACCESS_ACCOUNT_NBR varchar(255),
  ACCESS_SHIPPING_KEY varchar(255),
  LABEL_IMAGE_FORMAT varchar(60),
  RATE_ESTIMATE_TEMPLATE varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE shipment_gateway_fedex (
  SHIPMENT_GATEWAY_CONFIG_ID varchar(20),
  CONNECT_URL varchar(255),
  CONNECT_SOAP_URL varchar(255),
  CONNECT_TIMEOUT decimal(20,0),
  ACCESS_ACCOUNT_NBR varchar(255),
  ACCESS_METER_NUMBER varchar(255),
  ACCESS_USER_KEY varchar(255),
  ACCESS_USER_PWD varchar(255),
  LABEL_IMAGE_TYPE varchar(60),
  DEFAULT_DROPOFF_TYPE varchar(255),
  DEFAULT_PACKAGING_TYPE varchar(255),
  TEMPLATE_SHIPMENT varchar(255),
  TEMPLATE_SUBSCRIPTION varchar(255),
  RATE_ESTIMATE_TEMPLATE varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  REQUEST_VERSION varchar(255),
  HOME_DELIVERY_SERVICE varchar(255),
  ALLOW_COD char(1)
);

CREATE TABLE shipment_gateway_field_mapping (
  CARRIER_PARTY_ID varchar(20),
  FIELD_NAME varchar(60),
  MIN_LENGTH decimal(20,0),
  MAX_LENGTH decimal(20,0),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE shipment_gateway_ups (
  SHIPMENT_GATEWAY_CONFIG_ID varchar(20),
  CONNECT_URL varchar(255),
  CONNECT_TIMEOUT decimal(20,0),
  SHIPPER_NUMBER varchar(255),
  BILL_SHIPPER_ACCOUNT_NUMBER varchar(255),
  ACCESS_LICENSE_NUMBER varchar(255),
  ACCESS_USER_ID varchar(255),
  ACCESS_PASSWORD varchar(255),
  SAVE_CERT_INFO varchar(60),
  SAVE_CERT_PATH varchar(255),
  SHIPPER_PICKUP_TYPE varchar(60),
  MAX_ESTIMATE_WEIGHT decimal(18,6),
  MIN_ESTIMATE_WEIGHT decimal(18,6),
  COD_ALLOW_COD varchar(255),
  COD_SURCHARGE_AMOUNT decimal(18,6),
  COD_SURCHARGE_CURRENCY_UOM_ID varchar(60),
  COD_SURCHARGE_APPLY_TO_PACKAGE varchar(60),
  COD_FUNDS_CODE varchar(60),
  DEFAULT_RETURN_LABEL_MEMO varchar(255),
  DEFAULT_RETURN_LABEL_SUBJECT varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  LABEL_PRINT_METHOD varchar(255)
);

CREATE TABLE shipment_gateway_usps (
  SHIPMENT_GATEWAY_CONFIG_ID varchar(20),
  CONNECT_URL varchar(255),
  CONNECT_TIMEOUT decimal(20,0),
  ACCESS_USER_ID varchar(255),
  ACCESS_PASSWORD varchar(255),
  MAX_ESTIMATE_WEIGHT decimal(20,0),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE shipment_item (
  SHIPMENT_ID varchar(20),
  SHIPMENT_ITEM_SEQ_ID varchar(20),
  PRODUCT_ID varchar(20),
  QUANTITY decimal(18,6),
  SHIPMENT_CONTENT_DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE shipment_item_billing (
  SHIPMENT_ID varchar(20),
  SHIPMENT_ITEM_SEQ_ID varchar(20),
  INVOICE_ID varchar(20),
  INVOICE_ITEM_SEQ_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE shipment_item_feature (
  SHIPMENT_ID varchar(20),
  SHIPMENT_ITEM_SEQ_ID varchar(20),
  PRODUCT_FEATURE_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE shipment_method_type (
  SHIPMENT_METHOD_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  SEQUENCE_NUM decimal(20,0),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE shipment_package (
  SHIPMENT_ID varchar(20),
  SHIPMENT_PACKAGE_SEQ_ID varchar(20),
  SHIPMENT_BOX_TYPE_ID varchar(20),
  DATE_CREATED datetime,
  BOX_LENGTH decimal(18,6),
  BOX_HEIGHT decimal(18,6),
  BOX_WIDTH decimal(18,6),
  DIMENSION_UOM_ID varchar(20),
  WEIGHT decimal(18,6),
  WEIGHT_UOM_ID varchar(20),
  INSURED_VALUE decimal(18,2),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE shipment_package_content (
  SHIPMENT_ID varchar(20),
  SHIPMENT_PACKAGE_SEQ_ID varchar(20),
  SHIPMENT_ITEM_SEQ_ID varchar(20),
  QUANTITY decimal(18,6),
  SUB_PRODUCT_ID varchar(20),
  SUB_PRODUCT_QUANTITY decimal(18,6),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE shipment_package_route_seg (
  SHIPMENT_ID varchar(20),
  SHIPMENT_PACKAGE_SEQ_ID varchar(20),
  SHIPMENT_ROUTE_SEGMENT_ID varchar(20),
  TRACKING_CODE varchar(60),
  BOX_NUMBER varchar(60),
  LABEL_IMAGE longblob,
  LABEL_INTL_SIGN_IMAGE longblob,
  LABEL_HTML longtext,
  LABEL_PRINTED char(1),
  INTERNATIONAL_INVOICE longblob,
  PACKAGE_TRANSPORT_COST decimal(18,2),
  PACKAGE_SERVICE_COST decimal(18,2),
  PACKAGE_OTHER_COST decimal(18,2),
  COD_AMOUNT decimal(18,2),
  INSURED_AMOUNT decimal(18,2),
  CURRENCY_UOM_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE shipment_receipt (
  RECEIPT_ID varchar(20),
  INVENTORY_ITEM_ID varchar(20),
  PRODUCT_ID varchar(20),
  SHIPMENT_ID varchar(20),
  SHIPMENT_PACKAGE_SEQ_ID varchar(20),
  ORDER_ID varchar(20),
  ORDER_ITEM_SEQ_ID varchar(20),
  RETURN_ID varchar(20),
  RETURN_ITEM_SEQ_ID varchar(20),
  REJECTION_ID varchar(20),
  RECEIVED_BY_USER_LOGIN_ID varchar(250),
  DATETIME_RECEIVED datetime,
  ITEM_DESCRIPTION varchar(255),
  QUANTITY_ACCEPTED decimal(18,6),
  QUANTITY_REJECTED decimal(18,6),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  SHIPMENT_ITEM_SEQ_ID varchar(20),
  INVOICE_MATCHED char(1)
);

CREATE TABLE shipment_receipt_role (
  RECEIPT_ID varchar(20),
  PARTY_ID varchar(20),
  ROLE_TYPE_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE shipment_route_segment (
  SHIPMENT_ID varchar(20),
  SHIPMENT_ROUTE_SEGMENT_ID varchar(20),
  DELIVERY_ID varchar(20),
  ORIGIN_FACILITY_ID varchar(20),
  DEST_FACILITY_ID varchar(20),
  ORIGIN_CONTACT_MECH_ID varchar(20),
  ORIGIN_TELECOM_NUMBER_ID varchar(20),
  DEST_CONTACT_MECH_ID varchar(20),
  DEST_TELECOM_NUMBER_ID varchar(20),
  CARRIER_PARTY_ID varchar(20),
  SHIPMENT_METHOD_TYPE_ID varchar(20),
  CARRIER_SERVICE_STATUS_ID varchar(20),
  CARRIER_DELIVERY_ZONE varchar(60),
  CARRIER_RESTRICTION_CODES varchar(60),
  CARRIER_RESTRICTION_DESC longtext,
  BILLING_WEIGHT decimal(18,6),
  BILLING_WEIGHT_UOM_ID varchar(20),
  ACTUAL_TRANSPORT_COST decimal(18,2),
  ACTUAL_SERVICE_COST decimal(18,2),
  ACTUAL_OTHER_COST decimal(18,2),
  ACTUAL_COST decimal(18,2),
  CURRENCY_UOM_ID varchar(20),
  ACTUAL_START_DATE datetime,
  ACTUAL_ARRIVAL_DATE datetime,
  ESTIMATED_START_DATE datetime,
  ESTIMATED_ARRIVAL_DATE datetime,
  TRACKING_ID_NUMBER varchar(60),
  TRACKING_DIGEST longtext,
  UPDATED_BY_USER_LOGIN_ID varchar(250),
  LAST_UPDATED_DATE datetime,
  HOME_DELIVERY_TYPE varchar(20),
  HOME_DELIVERY_DATE datetime,
  THIRD_PARTY_ACCOUNT_NUMBER varchar(20),
  THIRD_PARTY_POSTAL_CODE varchar(20),
  THIRD_PARTY_COUNTRY_GEO_CODE varchar(20),
  UPS_HIGH_VALUE_REPORT longblob,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  ACTUAL_OTHER_COST_NOTE varchar(20),
  COMMODITY_DESCRIPTION varchar(60),
  COMMODITY_COUNTRY_OF_MANUFACTURE varchar(20),
  COMMODITY_NUMBER_OF_PIECES varchar(20),
  COMMODITY_QUANTITY varchar(20),
  COMMODITY_UNIT_PRICE decimal(18,2),
  TOTAL_CUSTOMS_VALUE decimal(18,2),
  INTERNATIONAL_INVOICE longblob,
  COD_RETURN_LABEL_IMAGE longblob,
  COD_RETURN_LABEL_HTML longtext,
  COD_COLLECTION_AMOUNT decimal(18,2),
  CARRIER_ACCOUNT_NUMBER varchar(20),
  CARRIER_SERVICE varchar(100),
  IS_SATURDAY_DELIVERY char(1)
);

CREATE TABLE shipment_status (
  STATUS_ID varchar(20),
  SHIPMENT_ID varchar(20),
  STATUS_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE shipment_type (
  SHIPMENT_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE shipment_type_attr (
  SHIPMENT_TYPE_ID varchar(20),
  ATTR_NAME varchar(60),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE shipping_document (
  DOCUMENT_ID varchar(20),
  SHIPMENT_ID varchar(20),
  SHIPMENT_ITEM_SEQ_ID varchar(20),
  SHIPMENT_PACKAGE_SEQ_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE shopping_list (
  SHOPPING_LIST_ID varchar(20),
  SHOPPING_LIST_TYPE_ID varchar(20),
  PARENT_SHOPPING_LIST_ID varchar(20),
  PRODUCT_STORE_ID varchar(20),
  VISITOR_ID varchar(20),
  PARTY_ID varchar(20),
  LIST_NAME varchar(100),
  DESCRIPTION varchar(255),
  IS_PUBLIC char(1),
  IS_ACTIVE char(1),
  CURRENCY_UOM varchar(20),
  SHIPMENT_METHOD_TYPE_ID varchar(20),
  CARRIER_PARTY_ID varchar(20),
  CARRIER_ROLE_TYPE_ID varchar(20),
  CONTACT_MECH_ID varchar(20),
  PAYMENT_METHOD_ID varchar(20),
  RECURRENCE_INFO_ID varchar(20),
  LAST_ORDERED_DATE datetime,
  LAST_ADMIN_MODIFIED datetime,
  PRODUCT_PROMO_CODE_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE shopping_list_item (
  SHOPPING_LIST_ID varchar(20),
  SHOPPING_LIST_ITEM_SEQ_ID varchar(20),
  PRODUCT_ID varchar(20),
  QUANTITY decimal(18,6),
  RESERV_START datetime,
  RESERV_LENGTH decimal(18,6),
  RESERV_PERSONS decimal(18,6),
  QUANTITY_PURCHASED decimal(18,6),
  CONFIG_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE shopping_list_item_survey (
  SHOPPING_LIST_ID varchar(20),
  SHOPPING_LIST_ITEM_SEQ_ID varchar(20),
  SURVEY_RESPONSE_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE shopping_list_type (
  SHOPPING_LIST_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE shopping_list_work_effort (
  SHOPPING_LIST_ID varchar(20),
  WORK_EFFORT_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE subscription (
  SUBSCRIPTION_ID varchar(20),
  DESCRIPTION varchar(255),
  SUBSCRIPTION_RESOURCE_ID varchar(20),
  COMMUNICATION_EVENT_ID varchar(20),
  CONTACT_MECH_ID varchar(20),
  ORIGINATED_FROM_PARTY_ID varchar(20),
  ORIGINATED_FROM_ROLE_TYPE_ID varchar(20),
  PARTY_ID varchar(20),
  ROLE_TYPE_ID varchar(20),
  PARTY_NEED_ID varchar(20),
  NEED_TYPE_ID varchar(20),
  ORDER_ID varchar(20),
  ORDER_ITEM_SEQ_ID varchar(20),
  PRODUCT_ID varchar(20),
  PRODUCT_CATEGORY_ID varchar(20),
  INVENTORY_ITEM_ID varchar(20),
  SUBSCRIPTION_TYPE_ID varchar(20),
  EXTERNAL_SUBSCRIPTION_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  PURCHASE_FROM_DATE datetime,
  PURCHASE_THRU_DATE datetime,
  MAX_LIFE_TIME decimal(20,0),
  MAX_LIFE_TIME_UOM_ID varchar(20),
  AVAILABLE_TIME decimal(20,0),
  AVAILABLE_TIME_UOM_ID varchar(20),
  USE_COUNT_LIMIT decimal(20,0),
  USE_TIME decimal(20,0),
  USE_TIME_UOM_ID varchar(20),
  AUTOMATIC_EXTEND char(1),
  CANCL_AUTM_EXT_TIME decimal(20,0),
  CANCL_AUTM_EXT_TIME_UOM_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE subscription_activity (
  SUBSCRIPTION_ACTIVITY_ID varchar(20),
  COMMENTS varchar(255),
  DATE_SENT datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE subscription_attribute (
  SUBSCRIPTION_ID varchar(20),
  ATTR_NAME varchar(60),
  ATTR_VALUE varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE subscription_comm_event (
  SUBSCRIPTION_ID varchar(20),
  COMMUNICATION_EVENT_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE subscription_fulfillment_piece (
  SUBSCRIPTION_ACTIVITY_ID varchar(20),
  SUBSCRIPTION_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE subscription_resource (
  SUBSCRIPTION_RESOURCE_ID varchar(20),
  PARENT_RESOURCE_ID varchar(20),
  DESCRIPTION varchar(255),
  CONTENT_ID varchar(20),
  WEB_SITE_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE subscription_type (
  SUBSCRIPTION_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE subscription_type_attr (
  SUBSCRIPTION_TYPE_ID varchar(20),
  ATTR_NAME varchar(60),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE survey (
  SURVEY_ID varchar(20),
  SURVEY_NAME varchar(100),
  DESCRIPTION varchar(255),
  COMMENTS varchar(255),
  SUBMIT_CAPTION varchar(60),
  RESPONSE_SERVICE varchar(255),
  IS_ANONYMOUS char(1),
  ALLOW_MULTIPLE char(1),
  ALLOW_UPDATE char(1),
  ACRO_FORM_CONTENT_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE survey_appl_type (
  SURVEY_APPL_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE survey_multi_resp (
  SURVEY_ID varchar(20),
  SURVEY_MULTI_RESP_ID varchar(20),
  MULTI_RESP_TITLE varchar(100),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE survey_multi_resp_column (
  SURVEY_ID varchar(20),
  SURVEY_MULTI_RESP_ID varchar(20),
  SURVEY_MULTI_RESP_COL_ID varchar(20),
  COLUMN_TITLE varchar(100),
  SEQUENCE_NUM decimal(20,0),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE survey_page (
  SURVEY_ID varchar(20),
  SURVEY_PAGE_SEQ_ID varchar(20),
  PAGE_NAME varchar(100),
  SEQUENCE_NUM decimal(20,0),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE survey_question (
  SURVEY_QUESTION_ID varchar(20),
  SURVEY_QUESTION_CATEGORY_ID varchar(20),
  SURVEY_QUESTION_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  QUESTION longtext,
  HINT longtext,
  ENUM_TYPE_ID varchar(20),
  GEO_ID varchar(20),
  FORMAT_STRING varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE survey_question_appl (
  SURVEY_ID varchar(20),
  SURVEY_QUESTION_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  SURVEY_PAGE_SEQ_ID varchar(20),
  SURVEY_MULTI_RESP_ID varchar(20),
  SURVEY_MULTI_RESP_COL_ID varchar(20),
  REQUIRED_FIELD char(1),
  SEQUENCE_NUM decimal(20,0),
  EXTERNAL_FIELD_REF varchar(255),
  WITH_SURVEY_QUESTION_ID varchar(20),
  WITH_SURVEY_OPTION_SEQ_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE survey_question_category (
  SURVEY_QUESTION_CATEGORY_ID varchar(20),
  PARENT_CATEGORY_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE survey_question_option (
  SURVEY_QUESTION_ID varchar(20),
  SURVEY_OPTION_SEQ_ID varchar(20),
  DESCRIPTION varchar(255),
  SEQUENCE_NUM decimal(20,0),
  AMOUNT_BASE decimal(18,2),
  AMOUNT_BASE_UOM_ID varchar(20),
  WEIGHT_FACTOR decimal(18,6),
  DURATION decimal(20,0),
  DURATION_UOM_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE survey_question_type (
  SURVEY_QUESTION_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE survey_response (
  SURVEY_RESPONSE_ID varchar(20),
  SURVEY_ID varchar(20),
  PARTY_ID varchar(20),
  RESPONSE_DATE datetime,
  LAST_MODIFIED_DATE datetime,
  REFERENCE_ID varchar(250),
  GENERAL_FEEDBACK longtext,
  ORDER_ID varchar(20),
  ORDER_ITEM_SEQ_ID varchar(20),
  STATUS_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE survey_response_answer (
  SURVEY_RESPONSE_ID varchar(20),
  SURVEY_QUESTION_ID varchar(20),
  SURVEY_MULTI_RESP_COL_ID varchar(20),
  SURVEY_MULTI_RESP_ID varchar(20),
  BOOLEAN_RESPONSE char(1),
  CURRENCY_RESPONSE decimal(18,2),
  FLOAT_RESPONSE decimal(18,6),
  NUMERIC_RESPONSE decimal(20,0),
  TEXT_RESPONSE longtext,
  SURVEY_OPTION_SEQ_ID varchar(20),
  CONTENT_ID varchar(20),
  ANSWERED_DATE datetime,
  AMOUNT_BASE decimal(18,2),
  AMOUNT_BASE_UOM_ID varchar(20),
  WEIGHT_FACTOR decimal(18,6),
  DURATION decimal(20,0),
  DURATION_UOM_ID varchar(20),
  SEQUENCE_NUM decimal(20,0),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE survey_trigger (
  SURVEY_ID varchar(20),
  SURVEY_APPL_TYPE_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE system_property (
  SYSTEM_RESOURCE_ID varchar(60),
  SYSTEM_PROPERTY_ID varchar(60),
  SYSTEM_PROPERTY_VALUE varchar(255),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE tarpitted_login_view (
  VIEW_NAME_ID varchar(60),
  USER_LOGIN_ID varchar(20),
  TARPIT_RELEASE_DATE_TIME decimal(20,0),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE temporal_expression (
  TEMP_EXPR_ID varchar(20),
  TEMP_EXPR_TYPE_ID varchar(20),
  DATE1 datetime,
  DATE2 datetime,
  INTEGER1 decimal(20,0),
  INTEGER2 decimal(20,0),
  STRING1 varchar(20),
  STRING2 varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  DESCRIPTION varchar(255)
);

CREATE TABLE temporal_expression_assoc (
  FROM_TEMP_EXPR_ID varchar(20),
  TO_TEMP_EXPR_ID varchar(20),
  EXPR_ASSOC_TYPE varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE tenant (
  TENANT_ID varchar(20),
  TENANT_NAME varchar(100),
  DISABLED char(1),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE tenant_data_source (
  TENANT_ID varchar(20),
  ENTITY_GROUP_NAME varchar(100),
  JDBC_URI varchar(255),
  JDBC_USERNAME varchar(255),
  JDBC_PASSWORD varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE term_type (
  TERM_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE term_type_attr (
  TERM_TYPE_ID varchar(20),
  ATTR_NAME varchar(60),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE termination_reason (
  TERMINATION_REASON_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE termination_type (
  TERMINATION_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE test_blob (
  TEST_BLOB_ID varchar(20),
  TEST_BLOB_FIELD longblob,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE test_field_type (
  TEST_FIELD_TYPE_ID varchar(20),
  BLOB_FIELD longblob,
  DATE_FIELD date,
  TIME_FIELD time,
  DATE_TIME_FIELD datetime,
  FIXED_POINT_FIELD decimal(18,6),
  FLOATING_POINT_FIELD decimal(18,6),
  NUMERIC_FIELD decimal(20,0),
  CLOB_FIELD longtext,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE testing (
  TESTING_ID varchar(20),
  TESTING_TYPE_ID varchar(20),
  TESTING_NAME varchar(100),
  DESCRIPTION varchar(255),
  COMMENTS varchar(255),
  TESTING_SIZE decimal(20,0),
  TESTING_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE testing_node (
  TESTING_NODE_ID varchar(20),
  PRIMARY_PARENT_NODE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE testing_node_member (
  TESTING_NODE_ID varchar(20),
  TESTING_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE testing_subtype (
  TESTING_TYPE_ID varchar(20),
  SUBTYPE_DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE testing_type (
  TESTING_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE time_entry (
  TIME_ENTRY_ID varchar(20),
  PARTY_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  RATE_TYPE_ID varchar(20),
  WORK_EFFORT_ID varchar(20),
  TIMESHEET_ID varchar(20),
  INVOICE_ID varchar(20),
  INVOICE_ITEM_SEQ_ID varchar(20),
  HOURS decimal(18,6),
  COMMENTS varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE timesheet (
  TIMESHEET_ID varchar(20),
  PARTY_ID varchar(20),
  CLIENT_PARTY_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  STATUS_ID varchar(20),
  APPROVED_BY_USER_LOGIN_ID varchar(250),
  COMMENTS varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE timesheet_role (
  TIMESHEET_ID varchar(20),
  PARTY_ID varchar(20),
  ROLE_TYPE_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE tracking_code (
  TRACKING_CODE_ID varchar(20),
  TRACKING_CODE_TYPE_ID varchar(20),
  MARKETING_CAMPAIGN_ID varchar(20),
  REDIRECT_URL varchar(255),
  OVERRIDE_LOGO varchar(255),
  OVERRIDE_CSS varchar(255),
  PROD_CATALOG_ID varchar(20),
  COMMENTS varchar(255),
  DESCRIPTION varchar(255),
  TRACKABLE_LIFETIME decimal(20,0),
  BILLABLE_LIFETIME decimal(20,0),
  FROM_DATE datetime,
  THRU_DATE datetime,
  GROUP_ID varchar(20),
  SUBGROUP_ID varchar(20),
  CREATED_DATE datetime,
  CREATED_BY_USER_LOGIN varchar(250),
  LAST_MODIFIED_DATE datetime,
  LAST_MODIFIED_BY_USER_LOGIN varchar(250),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE tracking_code_order (
  ORDER_ID varchar(20),
  TRACKING_CODE_TYPE_ID varchar(20),
  TRACKING_CODE_ID varchar(20),
  IS_BILLABLE char(1),
  SITE_ID varchar(255),
  HAS_EXPORTED char(1),
  AFFILIATE_REFERRED_TIME_STAMP datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE tracking_code_order_return (
  RETURN_ID varchar(20),
  ORDER_ID varchar(20),
  ORDER_ITEM_SEQ_ID varchar(20),
  TRACKING_CODE_TYPE_ID varchar(20),
  TRACKING_CODE_ID varchar(20),
  IS_BILLABLE char(1),
  SITE_ID varchar(255),
  HAS_EXPORTED char(1),
  AFFILIATE_REFERRED_TIME_STAMP datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE tracking_code_type (
  TRACKING_CODE_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE tracking_code_visit (
  TRACKING_CODE_ID varchar(20),
  VISIT_ID varchar(20),
  FROM_DATE datetime,
  SOURCE_ENUM_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE traveler_hold_reason (
  WORK_EFFORT_ID varchar(20),
  HOLD_REASON_TYPE_ID varchar(20),
  HOLD_BY_USER_LOGIN_ID varchar(250),
  FROM_DATE datetime,
  THRU_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE unemployment_claim (
  UNEMPLOYMENT_CLAIM_ID varchar(20),
  UNEMPLOYMENT_CLAIM_DATE datetime,
  DESCRIPTION varchar(255),
  STATUS_ID varchar(20),
  PARTY_ID_FROM varchar(20),
  PARTY_ID_TO varchar(20),
  ROLE_TYPE_ID_FROM varchar(20),
  ROLE_TYPE_ID_TO varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE valid_contact_mech_role (
  ROLE_TYPE_ID varchar(20),
  CONTACT_MECH_TYPE_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE valid_responsibility (
  EMPL_POSITION_TYPE_ID varchar(20),
  RESPONSIBILITY_TYPE_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  COMMENTS varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE value_link_fulfillment (
  FULFILLMENT_ID varchar(20),
  TYPE_ENUM_ID varchar(20),
  MERCHANT_ID varchar(250),
  PARTY_ID varchar(20),
  ORDER_ID varchar(20),
  ORDER_ITEM_SEQ_ID varchar(20),
  SURVEY_RESPONSE_ID varchar(20),
  CARD_NUMBER varchar(60),
  PIN_NUMBER varchar(60),
  AMOUNT decimal(18,2),
  RESPONSE_CODE varchar(60),
  REFERENCE_NUM varchar(60),
  AUTH_CODE varchar(60),
  FULFILLMENT_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE value_link_key (
  MERCHANT_ID varchar(250),
  PUBLIC_KEY longtext,
  PRIVATE_KEY longtext,
  EXCHANGE_KEY longtext,
  WORKING_KEY longtext,
  WORKING_KEY_INDEX decimal(20,0),
  LAST_WORKING_KEY longtext,
  LAST_MODIFIED_DATE datetime,
  LAST_MODIFIED_BY_TERMINAL varchar(60),
  LAST_MODIFIED_BY_USER_LOGIN varchar(250),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE variance_reason (
  VARIANCE_REASON_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE variance_reason_gl_account (
  VARIANCE_REASON_ID varchar(20),
  ORGANIZATION_PARTY_ID varchar(20),
  GL_ACCOUNT_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE video_data_resource (
  DATA_RESOURCE_ID varchar(20),
  VIDEO_DATA longblob,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE visit (
  VISIT_ID varchar(20),
  VISITOR_ID varchar(20),
  USER_LOGIN_ID varchar(250),
  USER_CREATED char(1),
  SESSION_ID varchar(250),
  SERVER_IP_ADDRESS varchar(20),
  SERVER_HOST_NAME varchar(255),
  WEBAPP_NAME varchar(60),
  INITIAL_LOCALE varchar(60),
  INITIAL_REQUEST varchar(255),
  INITIAL_REFERRER varchar(255),
  INITIAL_USER_AGENT varchar(255),
  USER_AGENT_ID varchar(20),
  CLIENT_IP_ADDRESS varchar(20),
  CLIENT_HOST_NAME varchar(255),
  CLIENT_USER varchar(60),
  CLIENT_IP_ISP_NAME varchar(60),
  CLIENT_IP_POSTAL_CODE varchar(60),
  CLIENT_IP_STATE_PROV_GEO_ID varchar(20),
  CLIENT_IP_COUNTRY_GEO_ID varchar(20),
  COOKIE varchar(60),
  FROM_DATE datetime,
  THRU_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  CONTACT_MECH_ID varchar(20),
  PARTY_ID varchar(20),
  ROLE_TYPE_ID varchar(20)
);

CREATE TABLE visitor (
  VISITOR_ID varchar(20),
  USER_LOGIN_ID varchar(250),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  PARTY_ID varchar(20)
);

CREATE TABLE visual_theme (
  VISUAL_THEME_ID varchar(20),
  VISUAL_THEME_SET_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE visual_theme_resource (
  VISUAL_THEME_ID varchar(20),
  RESOURCE_TYPE_ENUM_ID varchar(20),
  SEQUENCE_ID varchar(20),
  RESOURCE_VALUE varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE visual_theme_set (
  VISUAL_THEME_SET_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE web_analytics_config (
  PRODUCT_STORE_ID varchar(20),
  WEB_ANALYTICS_TYPE_ID varchar(20),
  WEB_SITE_ID varchar(20),
  WEB_ANALYTICS_CODE varchar(255),
  IS_ENABLED char(1),
  DESCRIPTION varchar(255),
  CONTENT_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE web_analytics_type (
  WEB_ANALYTICS_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE web_page (
  WEB_PAGE_ID varchar(20),
  PAGE_NAME varchar(100),
  WEB_SITE_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  CONTENT_ID varchar(20)
);

CREATE TABLE web_preference_type (
  WEB_PREFERENCE_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE web_site (
  WEB_SITE_ID varchar(20),
  SITE_NAME varchar(100),
  HTTP_HOST varchar(255),
  HTTP_PORT varchar(10),
  HTTPS_HOST varchar(255),
  HTTPS_PORT varchar(10),
  ENABLE_HTTPS char(1),
  STANDARD_CONTENT_PREFIX varchar(255),
  SECURE_CONTENT_PREFIX varchar(255),
  COOKIE_DOMAIN varchar(255),
  VISUAL_THEME_SET_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  PRODUCT_STORE_ID varchar(20),
  ALLOW_PRODUCT_STORE_CHANGE char(1)
);

CREATE TABLE web_site_content (
  WEB_SITE_ID varchar(20),
  CONTENT_ID varchar(20),
  WEB_SITE_CONTENT_TYPE_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE web_site_content_type (
  WEB_SITE_CONTENT_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE web_site_path_alias (
  WEB_SITE_ID varchar(20),
  PATH_ALIAS varchar(250),
  ALIAS_TO varchar(255),
  CONTENT_ID varchar(20),
  MAP_KEY varchar(100),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE web_site_publish_point (
  CONTENT_ID varchar(20),
  TEMPLATE_TITLE varchar(255),
  STYLE_SHEET_FILE varchar(255),
  LOGO varchar(255),
  MEDALLION_LOGO varchar(255),
  LINE_LOGO varchar(255),
  LEFT_BAR_ID varchar(20),
  RIGHT_BAR_ID varchar(20),
  CONTENT_DEPT varchar(20),
  ABOUT_CONTENT_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE web_site_role (
  PARTY_ID varchar(20),
  ROLE_TYPE_ID varchar(20),
  WEB_SITE_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  SEQUENCE_NUM decimal(20,0),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE web_user_preference (
  USER_LOGIN_ID varchar(250),
  PARTY_ID varchar(20),
  VISIT_ID varchar(20),
  WEB_PREFERENCE_TYPE_ID varchar(20),
  WEB_PREFERENCE_VALUE varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE webslinger_host_mapping (
  HOST_NAME varchar(100),
  CONTEXT_PATH varchar(255),
  WEBSLINGER_SERVER_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE webslinger_host_suffix (
  HOST_SUFFIX_ID varchar(20),
  HOST_SUFFIX varchar(100),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE webslinger_server (
  WEBSLINGER_SERVER_ID varchar(20),
  DELEGATOR_NAME varchar(100),
  DISPATCHER_NAME varchar(100),
  SERVER_NAME varchar(100),
  WEB_SITE_ID varchar(20),
  TARGET varchar(100),
  LOAD_AT_START char(1),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE webslinger_server_base (
  WEBSLINGER_SERVER_ID varchar(20),
  BASE_NAME varchar(100),
  SEQ_NUM decimal(20,0),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE work_order_item_fulfillment (
  WORK_EFFORT_ID varchar(20),
  ORDER_ID varchar(20),
  ORDER_ITEM_SEQ_ID varchar(20),
  SHIP_GROUP_SEQ_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE work_req_fulf_type (
  WORK_REQ_FULF_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE work_requirement_fulfillment (
  REQUIREMENT_ID varchar(20),
  WORK_EFFORT_ID varchar(20),
  WORK_REQ_FULF_TYPE_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE x509_issuer_provision (
  CERT_PROVISION_ID varchar(20),
  COMMON_NAME varchar(255),
  ORGANIZATIONAL_UNIT varchar(255),
  ORGANIZATION_NAME varchar(255),
  CITY_LOCALITY varchar(255),
  STATE_PROVINCE varchar(255),
  COUNTRY varchar(255),
  SERIAL_NUMBER varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE zip_sales_rule_lookup (
  STATE_CODE varchar(60),
  CITY varchar(60),
  COUNTY varchar(60),
  FROM_DATE datetime,
  ID_CODE varchar(60),
  TAXABLE varchar(60),
  SHIP_COND varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE zip_sales_tax_lookup (
  ZIP_CODE varchar(60),
  STATE_CODE varchar(60),
  CITY varchar(60),
  COUNTY varchar(60),
  FROM_DATE datetime,
  COUNTY_FIPS varchar(60),
  COUNTY_DEFAULT char(1),
  GENERAL_DEFAULT char(1),
  INSIDE_CITY char(1),
  GEO_CODE varchar(60),
  STATE_SALES_TAX decimal(18,6),
  CITY_SALES_TAX decimal(18,6),
  CITY_LOCAL_SALES_TAX decimal(18,6),
  COUNTY_SALES_TAX decimal(18,6),
  COUNTY_LOCAL_SALES_TAX decimal(18,6),
  COMBO_SALES_TAX decimal(18,6),
  STATE_USE_TAX decimal(18,6),
  CITY_USE_TAX decimal(18,6),
  CITY_LOCAL_USE_TAX decimal(18,6),
  COUNTY_USE_TAX decimal(18,6),
  COUNTY_LOCAL_USE_TAX decimal(18,6),
  COMBO_USE_TAX decimal(18,6),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE zpl_printer (
  ZPL_PRINTER_ID varchar(20),
  DESCRIPTION varchar(255),
  URL varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);
