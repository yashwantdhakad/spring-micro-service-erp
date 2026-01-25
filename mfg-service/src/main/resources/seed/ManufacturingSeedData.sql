INSERT INTO mrp_event_type (description, mrp_event_type_id)
SELECT 'Required planning because QOH is less than minimum quantity', 'REQUIRED_MRP'
WHERE NOT EXISTS (SELECT 1 FROM mrp_event_type WHERE description = 'Required planning because QOH is less than minimum quantity' AND mrp_event_type_id = 'REQUIRED_MRP');

INSERT INTO mrp_event_type (description, mrp_event_type_id)
SELECT 'Initial QOH', 'INITIAL_QOH'
WHERE NOT EXISTS (SELECT 1 FROM mrp_event_type WHERE description = 'Initial QOH' AND mrp_event_type_id = 'INITIAL_QOH');

INSERT INTO mrp_event_type (description, mrp_event_type_id)
SELECT 'Mrp requirement', 'MRP_REQUIREMENT'
WHERE NOT EXISTS (SELECT 1 FROM mrp_event_type WHERE description = 'Mrp requirement' AND mrp_event_type_id = 'MRP_REQUIREMENT');

INSERT INTO mrp_event_type (description, mrp_event_type_id)
SELECT 'Manufacturing Order receipt', 'MANUF_ORDER_RECP'
WHERE NOT EXISTS (SELECT 1 FROM mrp_event_type WHERE description = 'Manufacturing Order receipt' AND mrp_event_type_id = 'MANUF_ORDER_RECP');

INSERT INTO mrp_event_type (description, mrp_event_type_id)
SELECT 'Manufacturing Order requirement', 'MANUF_ORDER_REQ'
WHERE NOT EXISTS (SELECT 1 FROM mrp_event_type WHERE description = 'Manufacturing Order requirement' AND mrp_event_type_id = 'MANUF_ORDER_REQ');

INSERT INTO mrp_event_type (description, mrp_event_type_id)
SELECT 'Proposed Manufacturing Order receipt', 'PROP_MANUF_O_RECP'
WHERE NOT EXISTS (SELECT 1 FROM mrp_event_type WHERE description = 'Proposed Manufacturing Order receipt' AND mrp_event_type_id = 'PROP_MANUF_O_RECP');

INSERT INTO mrp_event_type (description, mrp_event_type_id)
SELECT 'Purchase Order receipt', 'PUR_ORDER_RECP'
WHERE NOT EXISTS (SELECT 1 FROM mrp_event_type WHERE description = 'Purchase Order receipt' AND mrp_event_type_id = 'PUR_ORDER_RECP');

INSERT INTO mrp_event_type (description, mrp_event_type_id)
SELECT 'Product Requirement Receipt', 'PROD_REQ_RECP'
WHERE NOT EXISTS (SELECT 1 FROM mrp_event_type WHERE description = 'Product Requirement Receipt' AND mrp_event_type_id = 'PROD_REQ_RECP');

INSERT INTO mrp_event_type (description, mrp_event_type_id)
SELECT 'Proposed Purchase Order receipt', 'PROP_PUR_O_RECP'
WHERE NOT EXISTS (SELECT 1 FROM mrp_event_type WHERE description = 'Proposed Purchase Order receipt' AND mrp_event_type_id = 'PROP_PUR_O_RECP');

INSERT INTO mrp_event_type (description, mrp_event_type_id)
SELECT 'Sales order shipment', 'SALES_ORDER_SHIP'
WHERE NOT EXISTS (SELECT 1 FROM mrp_event_type WHERE description = 'Sales order shipment' AND mrp_event_type_id = 'SALES_ORDER_SHIP');

INSERT INTO mrp_event_type (description, mrp_event_type_id)
SELECT 'Sales Forecast', 'SALES_FORECAST'
WHERE NOT EXISTS (SELECT 1 FROM mrp_event_type WHERE description = 'Sales Forecast' AND mrp_event_type_id = 'SALES_FORECAST');

INSERT INTO mrp_event_type (description, mrp_event_type_id)
SELECT 'Error', 'ERROR'
WHERE NOT EXISTS (SELECT 1 FROM mrp_event_type WHERE description = 'Error' AND mrp_event_type_id = 'ERROR');

INSERT INTO mrp_event_type (description, mrp_event_type_id)
SELECT 'Proposed Transfer receipt', 'PROP_TRANSFER_RECP'
WHERE NOT EXISTS (SELECT 1 FROM mrp_event_type WHERE description = 'Proposed Transfer receipt' AND mrp_event_type_id = 'PROP_TRANSFER_RECP');

INSERT INTO tech_data_calendar_week (calendar_week_id, description, friday_capacity, friday_start_time, monday_capacity, monday_start_time, thursday_capacity, thursday_start_time, tuesday_capacity, tuesday_start_time, wednesday_capacity, wednesday_start_time)
SELECT 'SUPPLIER', '8hours/days, currently the Re-Order Process convert day to mms with 8h/days', '2.88E7', '08:30:00', '2.88E7', '08:30:00', '2.88E7', '08:30:00', '2.88E7', '08:30:00', '2.88E7', '08:30:00'
WHERE NOT EXISTS (SELECT 1 FROM tech_data_calendar_week WHERE calendar_week_id = 'SUPPLIER' AND description = '8hours/days, currently the Re-Order Process convert day to mms with 8h/days' AND friday_capacity = '2.88E7' AND friday_start_time = '08:30:00' AND monday_capacity = '2.88E7' AND monday_start_time = '08:30:00' AND thursday_capacity = '2.88E7' AND thursday_start_time = '08:30:00' AND tuesday_capacity = '2.88E7' AND tuesday_start_time = '08:30:00' AND wednesday_capacity = '2.88E7' AND wednesday_start_time = '08:30:00');

INSERT INTO tech_data_calendar (calendar_id, calendar_week_id, description)
SELECT 'SUPPLIER', 'SUPPLIER', 'Calendar used for Re-Order date calculation for bought product'
WHERE NOT EXISTS (SELECT 1 FROM tech_data_calendar WHERE calendar_id = 'SUPPLIER' AND calendar_week_id = 'SUPPLIER' AND description = 'Calendar used for Re-Order date calculation for bought product');

INSERT INTO tech_data_calendar_week (calendar_week_id, description, friday_capacity, friday_start_time, monday_capacity, monday_start_time, thursday_capacity, thursday_start_time, tuesday_capacity, tuesday_start_time, wednesday_capacity, wednesday_start_time)
SELECT 'DEFAULT', '8hours/days', '2.88E7', '08:30:00', '2.88E7', '08:30:00', '2.88E7', '08:30:00', '2.88E7', '08:30:00', '2.88E7', '08:30:00'
WHERE NOT EXISTS (SELECT 1 FROM tech_data_calendar_week WHERE calendar_week_id = 'DEFAULT' AND description = '8hours/days' AND friday_capacity = '2.88E7' AND friday_start_time = '08:30:00' AND monday_capacity = '2.88E7' AND monday_start_time = '08:30:00' AND thursday_capacity = '2.88E7' AND thursday_start_time = '08:30:00' AND tuesday_capacity = '2.88E7' AND tuesday_start_time = '08:30:00' AND wednesday_capacity = '2.88E7' AND wednesday_start_time = '08:30:00');

INSERT INTO tech_data_calendar (calendar_id, calendar_week_id, description)
SELECT 'DEFAULT', 'DEFAULT', 'Default calendar used when no specific calendar is defined'
WHERE NOT EXISTS (SELECT 1 FROM tech_data_calendar WHERE calendar_id = 'DEFAULT' AND calendar_week_id = 'DEFAULT' AND description = 'Default calendar used when no specific calendar is defined');

INSERT INTO work_effort (current_status_id, description, quantity_to_produce, revision_number, work_effort_id, work_effort_name, work_effort_type_id)
SELECT 'ROU_ACTIVE', 'Default Routing', '0', '1', 'DEFAULT_ROUTING', 'Default Routing', 'ROUTING'
WHERE NOT EXISTS (SELECT 1 FROM work_effort WHERE current_status_id = 'ROU_ACTIVE' AND description = 'Default Routing' AND quantity_to_produce = '0' AND revision_number = '1' AND work_effort_id = 'DEFAULT_ROUTING' AND work_effort_name = 'Default Routing' AND work_effort_type_id = 'ROUTING');

INSERT INTO work_effort (current_status_id, description, estimated_milli_seconds, estimated_setup_millis, revision_number, work_effort_id, work_effort_name, work_effort_purpose_type_id, work_effort_type_id)
SELECT 'ROU_ACTIVE', 'Default Routing Task', '0', '0', '1', 'DEFAULT_TASK', 'Default Routing Task', 'ROU_ASSEMBLING', 'ROU_TASK'
WHERE NOT EXISTS (SELECT 1 FROM work_effort WHERE current_status_id = 'ROU_ACTIVE' AND description = 'Default Routing Task' AND estimated_milli_seconds = '0' AND estimated_setup_millis = '0' AND revision_number = '1' AND work_effort_id = 'DEFAULT_TASK' AND work_effort_name = 'Default Routing Task' AND work_effort_purpose_type_id = 'ROU_ASSEMBLING' AND work_effort_type_id = 'ROU_TASK');

INSERT INTO work_effort_assoc (from_date, sequence_num, work_effort_assoc_type_id, work_effort_id_from, work_effort_id_to)
SELECT '2004-09-24 15:09:38.736', '10', 'ROUTING_COMPONENT', 'DEFAULT_ROUTING', 'DEFAULT_TASK'
WHERE NOT EXISTS (SELECT 1 FROM work_effort_assoc WHERE from_date = '2004-09-24 15:09:38.736' AND sequence_num = '10' AND work_effort_assoc_type_id = 'ROUTING_COMPONENT' AND work_effort_id_from = 'DEFAULT_ROUTING' AND work_effort_id_to = 'DEFAULT_TASK');
