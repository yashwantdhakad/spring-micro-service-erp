CREATE TABLE mrp_event (
  MRP_ID varchar(20),
  PRODUCT_ID varchar(20),
  EVENT_DATE datetime,
  MRP_EVENT_TYPE_ID varchar(20),
  FACILITY_ID varchar(20),
  QUANTITY decimal(18,6),
  EVENT_NAME longtext,
  IS_LATE char(1),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  ITEM_CONDITION varchar(20)
);

CREATE TABLE mrp_event_type (
  MRP_EVENT_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  CLEAN_EVENTS_SERVICE_NAME varchar(255),
  CREATE_EVENTS_SERVICE_NAME varchar(255)
);

CREATE TABLE tech_data_calendar (
  CALENDAR_ID varchar(20),
  DESCRIPTION varchar(255),
  CALENDAR_WEEK_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE tech_data_calendar_exc_day (
  CALENDAR_ID varchar(20),
  EXCEPTION_DATE_START_TIME datetime,
  EXCEPTION_CAPACITY decimal(18,6),
  USED_CAPACITY decimal(18,6),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE tech_data_calendar_exc_week (
  CALENDAR_ID varchar(20),
  EXCEPTION_DATE_START date,
  CALENDAR_WEEK_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE tech_data_calendar_week (
  CALENDAR_WEEK_ID varchar(20),
  DESCRIPTION varchar(255),
  MONDAY_START_TIME time,
  MONDAY_CAPACITY decimal(18,6),
  TUESDAY_START_TIME time,
  TUESDAY_CAPACITY decimal(18,6),
  WEDNESDAY_START_TIME time,
  WEDNESDAY_CAPACITY decimal(18,6),
  THURSDAY_START_TIME time,
  THURSDAY_CAPACITY decimal(18,6),
  FRIDAY_START_TIME time,
  FRIDAY_CAPACITY decimal(18,6),
  SATURDAY_START_TIME time,
  SATURDAY_CAPACITY decimal(18,6),
  SUNDAY_START_TIME time,
  SUNDAY_CAPACITY decimal(18,6),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE work_effort (
  WORK_EFFORT_ID varchar(20),
  WORK_EFFORT_TYPE_ID varchar(20),
  CURRENT_STATUS_ID varchar(20),
  LAST_STATUS_UPDATE datetime,
  WORK_EFFORT_PURPOSE_TYPE_ID varchar(20),
  WORK_EFFORT_PARENT_ID varchar(20),
  SCOPE_ENUM_ID varchar(20),
  PRIORITY decimal(20,0),
  PERCENT_COMPLETE decimal(20,0),
  WORK_EFFORT_NAME varchar(100),
  SHOW_AS_ENUM_ID varchar(20),
  SEND_NOTIFICATION_EMAIL char(1),
  DESCRIPTION varchar(255),
  LOCATION_DESC varchar(255),
  ESTIMATED_START_DATE datetime,
  ESTIMATED_COMPLETION_DATE datetime,
  ACTUAL_START_DATE datetime,
  ACTUAL_COMPLETION_DATE datetime,
  ESTIMATED_MILLI_SECONDS decimal(18,6),
  ESTIMATED_SETUP_MILLIS decimal(18,6),
  ESTIMATE_CALC_METHOD varchar(20),
  ACTUAL_MILLI_SECONDS decimal(18,6),
  ACTUAL_SETUP_MILLIS decimal(18,6),
  TOTAL_MILLI_SECONDS_ALLOWED decimal(18,6),
  TOTAL_MONEY_ALLOWED decimal(18,2),
  MONEY_UOM_ID varchar(20),
  SPECIAL_TERMS varchar(255),
  TIME_TRANSPARENCY decimal(20,0),
  UNIVERSAL_ID varchar(60),
  SOURCE_REFERENCE_ID varchar(60),
  FIXED_ASSET_ID varchar(20),
  FACILITY_ID varchar(20),
  INFO_URL varchar(255),
  RECURRENCE_INFO_ID varchar(20),
  TEMP_EXPR_ID varchar(20),
  RUNTIME_DATA_ID varchar(20),
  NOTE_ID varchar(20),
  SERVICE_LOADER_NAME varchar(100),
  QUANTITY_TO_PRODUCE decimal(18,6),
  QUANTITY_PRODUCED decimal(18,6),
  QUANTITY_REJECTED decimal(18,6),
  RESERV_PERSONS decimal(18,6),
  RESERV2ND_P_P_PERC decimal(18,6),
  RESERV_NTH_P_P_PERC decimal(18,6),
  ACCOMMODATION_MAP_ID varchar(20),
  ACCOMMODATION_SPOT_ID varchar(20),
  REVISION_NUMBER decimal(20,0),
  CREATED_DATE datetime,
  CREATED_BY_USER_LOGIN varchar(250),
  LAST_MODIFIED_DATE datetime,
  LAST_MODIFIED_BY_USER_LOGIN varchar(250),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  DUE_DATE datetime,
  SEQUENCE_NUM decimal(20,0),
  PARENT_MATERIAL varchar(255),
  ORDER_ID varchar(20),
  SERIAL_NUMBER varchar(60),
  INVOICED_AMOUNT decimal(18,2),
  OEM_PRICING_AMOUNT decimal(18,2),
  NOTES varchar(255),
  PROBLEM_STATEMENT varchar(255),
  PROBLEM_SOLUTION varchar(255),
  VERBIAGE varchar(255),
  FROM_DATE datetime,
  THRU_DATE datetime,
  WARNING varchar(255),
  MILITARY char(1),
  AUTO_RESERVATION char(1),
  WORK_TYPE varchar(20),
  IS_EXPEDITE char(1)
);

CREATE TABLE work_effort_approval (
  WORK_EFFORT_ID varchar(20),
  WORK_EFFORT_APPROVAL_ID varchar(20),
  APPROVED_BY_USER_LOGIN_ID varchar(250),
  APPROVAL_DATE datetime,
  APPROVED char(1),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE work_effort_assignment_rate (
  WORK_EFFORT_ID varchar(20),
  RATE_TYPE_ID varchar(20),
  PARTY_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  RATE decimal(18,2),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE work_effort_assoc (
  WORK_EFFORT_ID_FROM varchar(20),
  WORK_EFFORT_ID_TO varchar(20),
  WORK_EFFORT_ASSOC_TYPE_ID varchar(20),
  SEQUENCE_NUM decimal(20,0),
  FROM_DATE datetime,
  THRU_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  LAST_MODIFIED_BY_USER_LOGIN varchar(250)
);

CREATE TABLE work_effort_assoc_attribute (
  WORK_EFFORT_ID_FROM varchar(20),
  WORK_EFFORT_ID_TO varchar(20),
  WORK_EFFORT_ASSOC_TYPE_ID varchar(20),
  FROM_DATE datetime,
  ATTR_NAME varchar(60),
  ATTR_VALUE varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE work_effort_assoc_type (
  WORK_EFFORT_ASSOC_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE work_effort_assoc_type_attr (
  WORK_EFFORT_ASSOC_TYPE_ID varchar(20),
  ATTR_NAME varchar(60),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE work_effort_attribute (
  WORK_EFFORT_ID varchar(20),
  ATTR_NAME varchar(60),
  ATTR_VALUE varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE work_effort_billing (
  WORK_EFFORT_ID varchar(20),
  INVOICE_ID varchar(20),
  INVOICE_ITEM_SEQ_ID varchar(20),
  PERCENTAGE decimal(18,6),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE work_effort_contact_mech (
  WORK_EFFORT_ID varchar(20),
  CONTACT_MECH_ID varchar(20),
  COMMENTS varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE work_effort_contact_mech_new (
  WORK_EFFORT_ID varchar(20),
  CONTACT_MECH_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  COMMENTS varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE work_effort_content (
  WORK_EFFORT_ID varchar(20),
  CONTENT_ID varchar(20),
  WORK_EFFORT_CONTENT_TYPE_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  REVISION varchar(60),
  REVISION_DATE datetime
);

CREATE TABLE work_effort_content_type (
  WORK_EFFORT_CONTENT_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE work_effort_cost_calc (
  WORK_EFFORT_ID varchar(20),
  COST_COMPONENT_TYPE_ID varchar(20),
  COST_COMPONENT_CALC_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE work_effort_deliverable_prod (
  WORK_EFFORT_ID varchar(20),
  DELIVERABLE_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE work_effort_event_reminder (
  WORK_EFFORT_ID varchar(20),
  SEQUENCE_ID varchar(20),
  CONTACT_MECH_ID varchar(20),
  PARTY_ID varchar(20),
  REMINDER_DATE_TIME datetime,
  REPEAT_COUNT decimal(20,0),
  REPEAT_INTERVAL decimal(20,0),
  CURRENT_COUNT decimal(20,0),
  REMINDER_OFFSET decimal(20,0),
  LOCALE_ID varchar(20),
  TIME_ZONE_ID varchar(60),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE work_effort_fixed_asset_assign (
  WORK_EFFORT_ID varchar(20),
  FIXED_ASSET_ID varchar(20),
  STATUS_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  AVAILABILITY_STATUS_ID varchar(20),
  ALLOCATED_COST decimal(18,2),
  COMMENTS varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE work_effort_fixed_asset_std (
  WORK_EFFORT_ID varchar(20),
  FIXED_ASSET_TYPE_ID varchar(20),
  ESTIMATED_QUANTITY decimal(18,6),
  ESTIMATED_DURATION decimal(18,6),
  ESTIMATED_COST decimal(18,2),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE work_effort_good_standard (
  WORK_EFFORT_ID varchar(20),
  PRODUCT_ID varchar(20),
  WORK_EFFORT_GOOD_STD_TYPE_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  STATUS_ID varchar(20),
  ESTIMATED_QUANTITY decimal(18,6),
  ESTIMATED_COST decimal(18,2),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  DRAWING_ITEM_NUMBER varchar(100),
  IS_NON_PROCURABLE char(1),
  IS_CUSTOMER_SUPPLIED char(1),
  FROM_WHOLE_ASSEMBLY char(1),
  ITEM_CONDITION varchar(20),
  REASON_ENUM_ID varchar(20),
  COMMENT varchar(100),
  EXPEDITE_DATE datetime,
  IS_EXPEDITE char(1),
  CANCEL_QUANTITY decimal(18,6),
  RECREATE_QUANTITY decimal(18,6),
  WEGS_REFERENCE_NUMBER varchar(20),
  IS_PMA_ALLOWED char(1),
  NO_PMA_ALLOWED char(1),
  INV_AUTH_ENUM_ID varchar(20),
  MLTR_USE_AUTH char(1),
  COMM_USE_AUTH char(1),
  MRGT_AUTH char(1),
  MRSL_AUTH char(1),
  PROP_REP_AUTH char(1)
);

CREATE TABLE work_effort_good_standard_type (
  WORK_EFFORT_GOOD_STD_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE work_effort_ical_data (
  WORK_EFFORT_ID varchar(20),
  ICAL_DATA longtext,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE work_effort_inv_reservation (
  WORK_EFFORT_ID varchar(20),
  INVENTORY_ITEM_ID varchar(20),
  RESERVE_ORDER_ENUM_ID varchar(20),
  QUANTITY decimal(18,6),
  QUANTITY_NOT_AVAILABLE decimal(18,6),
  RESERVED_DATETIME datetime,
  CREATED_DATETIME datetime,
  PROMISED_DATETIME datetime,
  CURRENT_PROMISED_DATE datetime,
  SEQUENCE_ID decimal(20,0),
  WEGS_REFERENCE_NUMBER varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE work_effort_inventory_assign (
  WORK_EFFORT_ID varchar(20),
  INVENTORY_ITEM_ID varchar(20),
  STATUS_ID varchar(20),
  QUANTITY decimal(18,6),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE work_effort_inventory_produced (
  WORK_EFFORT_ID varchar(20),
  INVENTORY_ITEM_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE work_effort_inventory_standard (
  WORK_EFFORT_ID varchar(20),
  INVENTORY_ITEM_ID varchar(20),
  STATUS_ID varchar(20),
  ESTIMATED_QUANTITY decimal(18,6),
  ESTIMATED_COST decimal(18,2),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE work_effort_keyword (
  WORK_EFFORT_ID varchar(20),
  KEYWORD varchar(60),
  RELEVANCY_WEIGHT decimal(20,0),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE work_effort_note (
  WORK_EFFORT_ID varchar(20),
  NOTE_ID varchar(20),
  INTERNAL_NOTE char(1),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE work_effort_part_location (
  WORK_EFFORT_ID varchar(20),
  PRODUCT_ID varchar(20),
  FROM_DATE datetime,
  FROM_TASK varchar(20),
  LOCATION_SEQ_ID varchar(20),
  CREATED_BY_USER_LOGIN_ID varchar(250),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE work_effort_party_assignment (
  WORK_EFFORT_ID varchar(20),
  PARTY_ID varchar(20),
  ROLE_TYPE_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  ASSIGNED_BY_USER_LOGIN_ID varchar(250),
  STATUS_ID varchar(20),
  STATUS_DATE_TIME datetime,
  EXPECTATION_ENUM_ID varchar(20),
  DELEGATE_REASON_ENUM_ID varchar(20),
  FACILITY_ID varchar(20),
  COMMENTS varchar(255),
  MUST_RSVP char(1),
  AVAILABILITY_STATUS_ID varchar(20),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE work_effort_purpose_type (
  WORK_EFFORT_PURPOSE_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE work_effort_review (
  WORK_EFFORT_ID varchar(20),
  USER_LOGIN_ID varchar(250),
  REVIEW_DATE datetime,
  STATUS_ID varchar(20),
  POSTED_ANONYMOUS char(1),
  RATING decimal(18,6),
  REVIEW_TEXT longtext,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE work_effort_revision (
  WORK_EFFORT_ID varchar(20),
  REVISION_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  REVISED_BY_USER_LOGIN_ID varchar(60),
  CHANGE_TYPE_ENUM_ID varchar(60),
  REASON varchar(60),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE work_effort_search_constraint (
  WORK_EFFORT_SEARCH_RESULT_ID varchar(20),
  CONSTRAINT_SEQ_ID varchar(20),
  CONSTRAINT_NAME varchar(255),
  INFO_STRING varchar(255),
  INCLUDE_SUB_WORK_EFFORTS char(1),
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

CREATE TABLE work_effort_search_result (
  WORK_EFFORT_SEARCH_RESULT_ID varchar(20),
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

CREATE TABLE work_effort_skill_standard (
  WORK_EFFORT_ID varchar(20),
  SKILL_TYPE_ID varchar(20),
  ESTIMATED_NUM_PEOPLE decimal(18,6),
  ESTIMATED_DURATION decimal(18,6),
  ESTIMATED_COST decimal(18,2),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE work_effort_status (
  WORK_EFFORT_ID varchar(20),
  STATUS_ID varchar(20),
  STATUS_DATETIME datetime,
  SET_BY_USER_LOGIN varchar(250),
  REASON varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime,
  REASON_ENUM_ID varchar(20)
);

CREATE TABLE work_effort_survey_appl (
  WORK_EFFORT_ID varchar(20),
  SURVEY_ID varchar(20),
  FROM_DATE datetime,
  THRU_DATE datetime,
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE work_effort_trans_box (
  PROCESS_WORK_EFFORT_ID varchar(20),
  TO_ACTIVITY_ID varchar(60),
  TRANSITION_ID varchar(60),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE work_effort_type (
  WORK_EFFORT_TYPE_ID varchar(20),
  PARENT_TYPE_ID varchar(20),
  HAS_TABLE char(1),
  DESCRIPTION varchar(255),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);

CREATE TABLE work_effort_type_attr (
  WORK_EFFORT_TYPE_ID varchar(20),
  ATTR_NAME varchar(60),
  LAST_UPDATED_STAMP datetime,
  LAST_UPDATED_TX_STAMP datetime,
  CREATED_STAMP datetime,
  CREATED_TX_STAMP datetime
);
