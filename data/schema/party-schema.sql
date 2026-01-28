CREATE TABLE PARTY_BLACKLIST (
  PARTY_BLACKLIST_ID varchar(20),
  PARTY_ID varchar(20),
  NOTE_ID varchar(20),
  END_REASON_NOTE_ID varchar(20),
  IS_BLACKLIST char(1),
  FROM_DATE datetime,
  THRU_DATE datetime,
  CREATED_BY_USER_LOGIN_ID varchar(250),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE contact_list_party (
  CONTACT_LIST_ID varchar(20),
  PARTY_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  STATUS_ID varchar(20),
  PREFERRED_CONTACT_MECH_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE contact_list_party_status (
  CONTACT_LIST_ID varchar(20),
  PARTY_ID varchar(20),
  FROM_DATE datetime,
  STATUS_DATE datetime,
  STATUS_ID varchar(20),
  SET_BY_USER_LOGIN_ID varchar(255),
  OPT_IN_VERIFY_CODE varchar(60),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE contact_mech (
  CONTACT_MECH_ID varchar(20),
  CONTACT_MECH_TYPE_ID varchar(20),
  INFO_STRING varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE contact_mech_attribute (
  CONTACT_MECH_ID varchar(20),
  ATTR_NAME varchar(60),
  ATTR_VALUE varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE contact_mech_link (
  CONTACT_MECH_ID_FROM varchar(20),
  CONTACT_MECH_ID_TO varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE contact_mech_purpose_type (
  CONTACT_MECH_PURPOSE_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE contact_mech_type (
  CONTACT_MECH_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE contact_mech_type_attr (
  CONTACT_MECH_TYPE_ID varchar(20),
  ATTR_NAME varchar(60),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE contact_mech_type_purpose (
  CONTACT_MECH_TYPE_ID varchar(20),
  CONTACT_MECH_PURPOSE_TYPE_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE empl_leave (
  PARTY_ID varchar(20),
  LEAVE_TYPE_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  EMPL_LEAVE_REASON_TYPE_ID varchar(20),
  APPROVER_PARTY_ID varchar(20),
  LEAVE_STATUS varchar(60)
);

CREATE TABLE empl_leave_reason_type (
  EMPL_LEAVE_REASON_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE empl_leave_type (
  LEAVE_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE empl_position (
  EMPL_POSITION_ID varchar(20),
  STATUS_ID varchar(20),
  PARTY_ID varchar(20),
  BUDGET_ID varchar(20),
  BUDGET_ITEM_SEQ_ID varchar(20),
  EMPL_POSITION_TYPE_ID varchar(20),
  ESTIMATED_FROM_DATE datetime,
  ESTIMATED_THRU_DATE datetime,
  SALARY_FLAG char(1),
  EXEMPT_FLAG char(1),
  FULLTIME_FLAG char(1),
  TEMPORARY_FLAG char(1),
  ACTUAL_FROM_DATE datetime,
  ACTUAL_THRU_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE empl_position_class_type (
  EMPL_POSITION_CLASS_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE empl_position_fulfillment (
  EMPL_POSITION_ID varchar(20),
  PARTY_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  COMMENTS varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE empl_position_reporting_struct (
  EMPL_POSITION_ID_REPORTING_TO varchar(20),
  EMPL_POSITION_ID_MANAGED_BY varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  COMMENTS varchar(255),
  PRIMARY_FLAG char(1),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE empl_position_responsibility (
  EMPL_POSITION_ID varchar(20),
  RESPONSIBILITY_TYPE_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  COMMENTS varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE empl_position_type (
  EMPL_POSITION_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE empl_position_type_class (
  EMPL_POSITION_TYPE_ID varchar(20),
  EMPL_POSITION_CLASS_TYPE_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  STANDARD_HOURS_PER_WEEK decimal(18,6),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE empl_position_type_rate (
  EMPL_POSITION_TYPE_ID varchar(20),
  PERIOD_TYPE_ID varchar(20),
  PAY_GRADE_ID varchar(20),
  SALARY_STEP_SEQ_ID varchar(20),
  RATE_TYPE_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  RATE varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE empl_position_type_rate_new (
  EMPL_POSITION_TYPE_ID varchar(20),
  RATE_TYPE_ID varchar(20),
  PAY_GRADE_ID varchar(20),
  SALARY_STEP_SEQ_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE employment (
  ROLE_TYPE_ID_FROM varchar(20),
  ROLE_TYPE_ID_TO varchar(20),
  PARTY_ID_FROM varchar(20),
  PARTY_ID_TO varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  TERMINATION_REASON_ID varchar(20),
  TERMINATION_TYPE_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE employment_app (
  APPLICATION_ID varchar(20),
  EMPL_POSITION_ID varchar(20),
  STATUS_ID varchar(20),
  EMPLOYMENT_APP_SOURCE_TYPE_ID varchar(20),
  APPLYING_PARTY_ID varchar(20),
  REFERRED_BY_PARTY_ID varchar(20),
  APPLICATION_DATE datetime,
  APPROVER_PARTY_ID varchar(20),
  JOB_REQUISITION_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE employment_app_source_type (
  EMPLOYMENT_APP_SOURCE_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE job_interview (
  JOB_INTERVIEW_ID varchar(20),
  JOB_INTERVIEWEE_PARTY_ID varchar(20),
  JOB_REQUISITION_ID varchar(20),
  JOB_INTERVIEWER_PARTY_ID varchar(20),
  JOB_INTERVIEW_TYPE_ID varchar(20),
  GRADE_SECURED_ENUM_ID varchar(20),
  JOB_INTERVIEW_RESULT varchar(20),
  JOB_INTERVIEW_DATE date,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE job_interview_type (
  JOB_INTERVIEW_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE job_requisition (
  JOB_REQUISITION_ID varchar(20),
  DURATION_MONTHS decimal(20,0),
  AGE decimal(20,0),
  GENDER char(1),
  EXPERIENCE_MONTHS decimal(20,0),
  EXPERIENCE_YEARS decimal(20,0),
  QUALIFICATION varchar(60),
  JOB_LOCATION varchar(20),
  SKILL_TYPE_ID varchar(20),
  NO_OF_RESOURCES decimal(20,0),
  JOB_POSTING_TYPE_ENUM_ID varchar(20),
  JOB_REQUISITION_DATE date,
  EXAM_TYPE_ENUM_ID varchar(20),
  REQUIRED_ON_DATE date,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE job_sandbox (
  JOB_ID varchar(20),
  JOB_NAME varchar(100),
  RUN_TIME datetime,
  POOL_ID varchar(100),
  STATUS_ID varchar(20),
  PARENT_JOB_ID varchar(20),
  PREVIOUS_JOB_ID varchar(20),
  SERVICE_NAME varchar(100),
  LOADER_NAME varchar(100),
  MAX_RETRY decimal(20,0),
  AUTH_USER_LOGIN_ID varchar(250),
  RUN_AS_USER varchar(250),
  RUNTIME_DATA_ID varchar(20),
  RECURRENCE_INFO_ID varchar(20),
  TEMP_EXPR_ID varchar(20),
  CURRENT_RECURRENCE_COUNT decimal(20,0),
  MAX_RECURRENCE_COUNT decimal(20,0),
  RUN_BY_INSTANCE_ID varchar(20),
  START_DATE_TIME datetime,
  FINISH_DATE_TIME datetime,
  CANCEL_DATE_TIME datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE party (
  PARTY_ID varchar(20),
  PARTY_TYPE_ID varchar(20),
  EXTERNAL_ID varchar(20),
  PREFERRED_CURRENCY_UOM_ID varchar(20),
  DESCRIPTION longtext,
  STATUS_ID varchar(20),
  CREATED_DATE datetime,
  CREATED_BY_USER_LOGIN varchar(250),
  LAST_MODIFIED_DATE datetime,
  LAST_MODIFIED_BY_USER_LOGIN varchar(250),
  DATA_SOURCE_ID varchar(20),
  IS_UNREAD char(1),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  APPROVED_P_M_A varchar(20)
);

CREATE TABLE party_acctg_preference (
  PARTY_ID varchar(20),
  FISCAL_YEAR_START_MONTH decimal(20,0),
  FISCAL_YEAR_START_DAY decimal(20,0),
  TAX_FORM_ID varchar(20),
  COGS_METHOD_ID varchar(20),
  BASE_CURRENCY_UOM_ID varchar(20),
  INVOICE_SEQUENCE_ENUM_ID varchar(20),
  INVOICE_ID_PREFIX varchar(10),
  LAST_INVOICE_NUMBER decimal(20,0),
  LAST_INVOICE_RESTART_DATE datetime,
  USE_INVOICE_ID_FOR_RETURNS char(1),
  QUOTE_SEQUENCE_ENUM_ID varchar(20),
  QUOTE_ID_PREFIX varchar(10),
  LAST_QUOTE_NUMBER decimal(20,0),
  ORDER_SEQUENCE_ENUM_ID varchar(20),
  ORDER_ID_PREFIX varchar(10),
  LAST_ORDER_NUMBER decimal(20,0),
  REFUND_PAYMENT_METHOD_ID varchar(20),
  ERROR_GL_JOURNAL_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  PURCHASE_ORDER_ID_PREFIX varchar(10),
  LAST_PURCHASE_ORDER_NUMBER decimal(20,0),
  PURCHASE_INVOICE_ID_PREFIX varchar(10),
  LAST_PURCHASE_INVOICE_NUMBER decimal(20,0),
  INVENTORY_ITEM_ID_PREFIX varchar(10)
);

CREATE TABLE party_attribute (
  PARTY_ID varchar(20),
  ATTR_NAME varchar(60),
  ATTR_VALUE varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE party_benefit (
  ROLE_TYPE_ID_FROM varchar(20),
  ROLE_TYPE_ID_TO varchar(20),
  PARTY_ID_FROM varchar(20),
  PARTY_ID_TO varchar(20),
  BENEFIT_TYPE_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  PERIOD_TYPE_ID varchar(20),
  COST decimal(18,2),
  ACTUAL_EMPLOYER_PAID_PERCENT decimal(18,6),
  AVAILABLE_TIME decimal(20,0),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE party_c_a_g_code (
  PARTY_ID varchar(20),
  C_A_G_CODE_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE party_carrier_account (
  PARTY_ID varchar(20),
  CARRIER_PARTY_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  ACCOUNT_NUMBER varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  SERVICE varchar(100),
  FREIGHT_TYPE_ENUM_ID varchar(100),
  SERVICE_ENUM_ID varchar(100),
  PURPOSE_ENUM_ID varchar(100)
);

CREATE TABLE party_carrier_account_purpose (
  PARTY_ID varchar(20),
  CARRIER_PARTY_ID varchar(20),
  CARRIER_ACCT_PURPOSE_TYPE_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE party_classification (
  PARTY_ID varchar(20),
  PARTY_CLASSIFICATION_GROUP_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  NOTES varchar(255)
);

CREATE TABLE party_classification_group (
  PARTY_CLASSIFICATION_GROUP_ID varchar(20),
  PARTY_CLASSIFICATION_TYPE_ID varchar(20),
  PARENT_GROUP_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE party_classification_type (
  PARTY_CLASSIFICATION_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE party_contact_mech (
  PARTY_ID varchar(20),
  CONTACT_MECH_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  ROLE_TYPE_ID varchar(20),
  ALLOW_SOLICITATION char(1),
  EXTENSION varchar(255),
  VERIFIED char(1),
  COMMENTS varchar(255),
  YEARS_WITH_CONTACT_MECH decimal(20,0),
  MONTHS_WITH_CONTACT_MECH decimal(20,0),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE party_contact_mech_purpose (
  PARTY_ID varchar(20),
  CONTACT_MECH_ID varchar(20),
  CONTACT_MECH_PURPOSE_TYPE_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE party_content (
  PARTY_ID varchar(20),
  CONTENT_ID varchar(20),
  PARTY_CONTENT_TYPE_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  IS_PUBLIC char(1)
);

CREATE TABLE party_content_type (
  PARTY_CONTENT_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE party_data_source (
  PARTY_ID varchar(20),
  DATA_SOURCE_ID varchar(20),
  FROM_DATE datetime,
  VISIT_ID varchar(20),
  COMMENTS varchar(255),
  IS_CREATE char(1),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE party_dimension (
  DIMENSION_ID varchar(20),
  PARTY_ID varchar(20),
  PARTY_TYPE varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE party_fixed_asset_assignment (
  PARTY_ID varchar(20),
  ROLE_TYPE_ID varchar(20),
  FIXED_ASSET_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  ALLOCATED_DATE datetime,
  STATUS_ID varchar(20),
  COMMENTS varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE party_geo_point (
  PARTY_ID varchar(20),
  GEO_POINT_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE party_gl_account (
  ORGANIZATION_PARTY_ID varchar(20),
  PARTY_ID varchar(20),
  ROLE_TYPE_ID varchar(20),
  GL_ACCOUNT_TYPE_ID varchar(20),
  GL_ACCOUNT_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE party_group (
  PARTY_ID varchar(20),
  GROUP_NAME varchar(100),
  GROUP_NAME_LOCAL varchar(100),
  OFFICE_SITE_NAME varchar(100),
  ANNUAL_REVENUE decimal(18,2),
  NUM_EMPLOYEES decimal(20,0),
  TICKER_SYMBOL varchar(10),
  COMMENTS varchar(255),
  LOGO_IMAGE_URL varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  EASA_CER_REQ char(1),
  IS_BLACK_LISTED char(1),
  DRUG_PROG_REQ char(1),
  MILITARY_CONTRACT char(1),
  PMA_ALLOWED char(1),
  EXCHG_ALLOWED char(1),
  PROP_REP_ALLOWED char(1),
  TRACE_REQ char(1),
  CREDIT_LIMIT decimal(18,3),
  CREDIT_TERMS varchar(255),
  PRICE_SHOW_ON_PACK_SLIP char(1),
  SALES_CHANNEL varchar(100),
  SALES_CAT_REGION varchar(100),
  DIVISION varchar(255)
);

CREATE TABLE party_ics_avs_override (
  PARTY_ID varchar(20),
  AVS_DECLINE_STRING varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE party_identification (
  PARTY_ID varchar(20),
  PARTY_IDENTIFICATION_TYPE_ID varchar(20),
  ID_VALUE varchar(60),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE party_identification_type (
  PARTY_IDENTIFICATION_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE party_invitation (
  PARTY_INVITATION_ID varchar(20),
  PARTY_ID_FROM varchar(20),
  PARTY_ID varchar(20),
  TO_NAME varchar(100),
  EMAIL_ADDRESS varchar(255),
  STATUS_ID varchar(20),
  LAST_INVITE_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE party_invitation_group_assoc (
  PARTY_INVITATION_ID varchar(20),
  PARTY_ID_TO varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE party_invitation_role_assoc (
  PARTY_INVITATION_ID varchar(20),
  ROLE_TYPE_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE party_name_history (
  PARTY_ID varchar(20),
  CHANGE_DATE datetime,
  GROUP_NAME varchar(100),
  FIRST_NAME varchar(100),
  MIDDLE_NAME varchar(100),
  LAST_NAME varchar(100),
  PERSONAL_TITLE varchar(100),
  SUFFIX varchar(100),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE party_need (
  PARTY_NEED_ID varchar(20),
  PARTY_ID varchar(20),
  ROLE_TYPE_ID varchar(20),
  PARTY_TYPE_ID varchar(20),
  NEED_TYPE_ID varchar(20),
  COMMUNICATION_EVENT_ID varchar(20),
  PRODUCT_ID varchar(20),
  PRODUCT_CATEGORY_ID varchar(20),
  VISIT_ID varchar(20),
  DATETIME_RECORDED datetime,
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE party_note (
  PARTY_ID varchar(20),
  NOTE_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE party_profile_default (
  PARTY_ID varchar(20),
  PRODUCT_STORE_ID varchar(20),
  DEFAULT_SHIP_ADDR varchar(20),
  DEFAULT_BILL_ADDR varchar(20),
  DEFAULT_PAY_METH varchar(20),
  DEFAULT_SHIP_METH varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE party_qual (
  PARTY_ID varchar(20),
  PARTY_QUAL_TYPE_ID varchar(20),
  QUALIFICATION_DESC varchar(60),
  TITLE varchar(60),
  STATUS_ID varchar(20),
  VERIF_STATUS_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE party_qual_type (
  PARTY_QUAL_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE party_rate (
  PARTY_ID varchar(20),
  RATE_TYPE_ID varchar(20),
  CURRENCY_UOM_ID varchar(20),
  DEFAULT_RATE char(1),
  FROM_DATE datetime,
  THRU_DATE datetime,
  RATE decimal(18,2),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE party_rate_new (
  PARTY_ID varchar(20),
  RATE_TYPE_ID varchar(20),
  DEFAULT_RATE char(1),
  PERCENTAGE_USED decimal(18,6),
  FROM_DATE datetime,
  THRU_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE party_relationship (
  PARTY_ID_FROM varchar(20),
  PARTY_ID_TO varchar(20),
  ROLE_TYPE_ID_FROM varchar(20),
  ROLE_TYPE_ID_TO varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  STATUS_ID varchar(20),
  RELATIONSHIP_NAME varchar(100),
  SECURITY_GROUP_ID varchar(20),
  PRIORITY_TYPE_ID varchar(20),
  PARTY_RELATIONSHIP_TYPE_ID varchar(20),
  PERMISSIONS_ENUM_ID varchar(20),
  POSITION_TITLE varchar(100),
  COMMENTS varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE party_relationship_type (
  PARTY_RELATIONSHIP_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  PARTY_RELATIONSHIP_NAME varchar(100),
  DESCRIPTION varchar(255),
  ROLE_TYPE_ID_VALID_FROM varchar(20),
  ROLE_TYPE_ID_VALID_TO varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE party_resume (
  RESUME_ID varchar(20),
  PARTY_ID varchar(20),
  CONTENT_ID varchar(20),
  RESUME_DATE datetime,
  RESUME_TEXT varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE party_role (
  PARTY_ID varchar(20),
  ROLE_TYPE_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE party_skill (
  PARTY_ID varchar(20),
  SKILL_TYPE_ID varchar(20),
  YEARS_EXPERIENCE decimal(20,0),
  RATING decimal(20,0),
  SKILL_LEVEL decimal(20,0),
  STARTED_USING_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE party_status (
  STATUS_ID varchar(20),
  PARTY_ID varchar(20),
  STATUS_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE party_tax_auth_info (
  PARTY_ID varchar(20),
  TAX_AUTH_GEO_ID varchar(20),
  TAX_AUTH_PARTY_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  PARTY_TAX_ID varchar(60),
  IS_EXEMPT char(1),
  IS_NEXUS char(1),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE party_tax_info (
  PARTY_ID varchar(20),
  GEO_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  PARTY_TAX_ID varchar(60),
  IS_EXEMPT char(1),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE party_type (
  PARTY_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE party_type_attr (
  PARTY_TYPE_ID varchar(20),
  ATTR_NAME varchar(60),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE pay_grade (
  PAY_GRADE_ID varchar(20),
  PAY_GRADE_NAME varchar(100),
  COMMENTS varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE pay_history (
  ROLE_TYPE_ID_FROM varchar(20),
  ROLE_TYPE_ID_TO varchar(20),
  PARTY_ID_FROM varchar(20),
  PARTY_ID_TO varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  SALARY_STEP_SEQ_ID varchar(20),
  PAY_GRADE_ID varchar(20),
  PERIOD_TYPE_ID varchar(20),
  AMOUNT decimal(18,2),
  COMMENTS varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE payroll_preference (
  PARTY_ID varchar(20),
  ROLE_TYPE_ID varchar(20),
  PAYROLL_PREFERENCE_SEQ_ID varchar(20),
  DEDUCTION_TYPE_ID varchar(20),
  PAYMENT_METHOD_TYPE_ID varchar(20),
  PERIOD_TYPE_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  PERCENTAGE decimal(18,6),
  FLAT_AMOUNT decimal(18,2),
  ROUTING_NUMBER varchar(60),
  ACCOUNT_NUMBER varchar(60),
  BANK_NAME varchar(100),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE person (
  PARTY_ID varchar(20),
  SALUTATION varchar(100),
  FIRST_NAME varchar(100),
  MIDDLE_NAME varchar(100),
  LAST_NAME varchar(100),
  PERSONAL_TITLE varchar(100),
  SUFFIX varchar(100),
  NICKNAME varchar(100),
  FIRST_NAME_LOCAL varchar(100),
  MIDDLE_NAME_LOCAL varchar(100),
  LAST_NAME_LOCAL varchar(100),
  OTHER_LOCAL varchar(100),
  MEMBER_ID varchar(20),
  GENDER char(1),
  BIRTH_DATE date,
  HEIGHT decimal(18,6),
  WEIGHT decimal(18,6),
  MOTHERS_MAIDEN_NAME varchar(255),
  MARITAL_STATUS char(1),
  SOCIAL_SECURITY_NUMBER varchar(255),
  PASSPORT_NUMBER varchar(255),
  PASSPORT_EXPIRE_DATE date,
  TOTAL_YEARS_WORK_EXPERIENCE decimal(18,6),
  COMMENTS varchar(255),
  EMPLOYMENT_STATUS_ENUM_ID varchar(20),
  RESIDENCE_STATUS_ENUM_ID varchar(20),
  OCCUPATION varchar(100),
  YEARS_WITH_EMPLOYER decimal(20,0),
  MONTHS_WITH_EMPLOYER decimal(20,0),
  EXISTING_CUSTOMER char(1),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  DECEASED_DATE date,
  CARD_ID varchar(60)
);

CREATE TABLE person_training (
  PARTY_ID varchar(20),
  TRAINING_CLASS_TYPE_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  TRAINING_REQUEST_ID varchar(20),
  WORK_EFFORT_ID varchar(20),
  APPROVER_ID varchar(20),
  APPROVAL_STATUS varchar(60),
  REASON varchar(255)
);

CREATE TABLE postal_address (
  CONTACT_MECH_ID varchar(20),
  TO_NAME varchar(100),
  ATTN_NAME varchar(100),
  ADDRESS1 varchar(255),
  ADDRESS2 varchar(255),
  DIRECTIONS varchar(255),
  CITY varchar(100),
  POSTAL_CODE varchar(60),
  POSTAL_CODE_EXT varchar(60),
  COUNTRY_GEO_ID varchar(20),
  STATE_PROVINCE_GEO_ID varchar(20),
  COUNTY_GEO_ID varchar(20),
  POSTAL_CODE_GEO_ID varchar(20),
  GEO_POINT_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  SHIP_TO_CODE varchar(20)
);

CREATE TABLE postal_address_boundary (
  CONTACT_MECH_ID varchar(20),
  GEO_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE responding_party (
  RESPONDING_PARTY_SEQ_ID varchar(20),
  CUST_REQUEST_ID varchar(20),
  PARTY_ID varchar(20),
  CONTACT_MECH_ID varchar(20),
  DATE_SENT datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE role_type (
  ROLE_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE role_type_attr (
  ROLE_TYPE_ID varchar(20),
  ATTR_NAME varchar(60),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE security_group (
  GROUP_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE security_group_permission (
  GROUP_ID varchar(20),
  PERMISSION_ID varchar(60),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE security_permission (
  PERMISSION_ID varchar(60),
  DESCRIPTION varchar(255),
  DYNAMIC_ACCESS varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE security_permission_auto_grant (
  PERMISSION_ID varchar(60),
  GRANT_PERMISSION varchar(250),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE skill_type (
  SKILL_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE supplier_pref_order (
  SUPPLIER_PREF_ORDER_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE supplier_product (
  PRODUCT_ID varchar(20),
  PARTY_ID varchar(20),
  AVAILABLE_FROM_DATE datetime,
  AVAILABLE_THRU_DATE datetime,
  SUPPLIER_PREF_ORDER_ID varchar(20),
  SUPPLIER_RATING_TYPE_ID varchar(20),
  STANDARD_LEAD_TIME_DAYS decimal(18,6),
  MINIMUM_ORDER_QUANTITY decimal(18,6),
  ORDER_QTY_INCREMENTS decimal(18,6),
  UNITS_INCLUDED decimal(18,6),
  QUANTITY_UOM_ID varchar(20),
  AGREEMENT_ID varchar(20),
  AGREEMENT_ITEM_SEQ_ID varchar(20),
  LAST_PRICE decimal(18,3),
  CURRENCY_UOM_ID varchar(20),
  SUPPLIER_PRODUCT_NAME varchar(100),
  SUPPLIER_PRODUCT_ID varchar(20),
  CAN_DROP_SHIP char(1),
  SUPPLIER_COMMISSION_PERC decimal(18,6),
  COMMENTS varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  SUPPLIER_QUANTITY_UOM_ID varchar(20)
);

CREATE TABLE supplier_product_feature (
  PARTY_ID varchar(20),
  PRODUCT_FEATURE_ID varchar(20),
  DESCRIPTION varchar(100),
  UOM_ID varchar(20),
  ID_CODE varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE supplier_qual (
  PARTY_ID varchar(20),
  QUAL_ID varchar(20),
  NOTES varchar(255),
  FROM_DATE datetime,
  THRU_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  USER_ID varchar(20)
);

CREATE TABLE supplier_rating_type (
  SUPPLIER_RATING_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE telecom_number (
  CONTACT_MECH_ID varchar(20),
  COUNTRY_CODE varchar(10),
  AREA_CODE varchar(10),
  CONTACT_NUMBER varchar(60),
  ASK_FOR_NAME varchar(100),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE training_class_type (
  TRAINING_CLASS_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE training_request (
  TRAINING_REQUEST_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE user_agent (
  USER_AGENT_ID varchar(20),
  BROWSER_TYPE_ID varchar(20),
  PLATFORM_TYPE_ID varchar(20),
  PROTOCOL_TYPE_ID varchar(20),
  USER_AGENT_TYPE_ID varchar(20),
  USER_AGENT_METHOD_TYPE_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE user_agent_method_type (
  USER_AGENT_METHOD_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE user_agent_type (
  USER_AGENT_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE user_login (
  USER_LOGIN_ID varchar(250),
  CURRENT_PASSWORD varchar(60),
  PASSWORD_HINT varchar(255),
  IS_SYSTEM char(1),
  ENABLED char(1),
  HAS_LOGGED_OUT char(1),
  REQUIRE_PASSWORD_CHANGE char(1),
  LAST_CURRENCY_UOM varchar(20),
  LAST_LOCALE varchar(10),
  LAST_TIME_ZONE varchar(60),
  DISABLED_DATE_TIME datetime,
  SUCCESSIVE_FAILED_LOGINS decimal(20,0),
  EXTERNAL_AUTH_ID varchar(250),
  USER_LDAP_DN varchar(250),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  PARTY_ID varchar(20)
);

CREATE TABLE user_login_history (
  USER_LOGIN_ID varchar(250),
  VISIT_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  PASSWORD_USED varchar(60),
  SUCCESSFUL_LOGIN char(1),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  PARTY_ID varchar(20)
);

CREATE TABLE user_login_ios_badge (
  USER_LOGIN_ID varchar(250),
  BADGE_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE user_login_otp (
  USER_LOGIN_ID varchar(250),
  OTP varchar(10),
  FROM_DATE datetime,
  THRU_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE user_login_password_history (
  USER_LOGIN_ID varchar(250),
  FROM_DATE datetime,
  THRU_DATE datetime,
  CURRENT_PASSWORD varchar(60),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE user_login_security_group (
  USER_LOGIN_ID varchar(250),
  GROUP_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE user_login_session (
  USER_LOGIN_ID varchar(250),
  SAVED_DATE datetime,
  SESSION_DATA longtext,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE user_pref_group_type (
  USER_PREF_GROUP_TYPE_ID varchar(60),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE user_preference (
  USER_LOGIN_ID varchar(250),
  USER_PREF_TYPE_ID varchar(60),
  USER_PREF_GROUP_TYPE_ID varchar(60),
  USER_PREF_VALUE varchar(255),
  USER_PREF_DATA_TYPE varchar(60),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE vendor (
  PARTY_ID varchar(20),
  MANIFEST_COMPANY_NAME varchar(100),
  MANIFEST_COMPANY_TITLE varchar(100),
  MANIFEST_LOGO_URL varchar(255),
  MANIFEST_POLICIES longtext,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE vendor_product (
  PRODUCT_ID varchar(20),
  VENDOR_PARTY_ID varchar(20),
  PRODUCT_STORE_GROUP_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);
