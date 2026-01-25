INSERT INTO work_effort_assoc_type (description, has_table, work_effort_assoc_type_id)
SELECT 'Breakdown/Detail', 'N', 'WORK_EFF_BREAKDOWN'
WHERE NOT EXISTS (SELECT 1 FROM work_effort_assoc_type WHERE description = 'Breakdown/Detail' AND has_table = 'N' AND work_effort_assoc_type_id = 'WORK_EFF_BREAKDOWN');

INSERT INTO work_effort_assoc_type (description, has_table, work_effort_assoc_type_id)
SELECT 'Dependency', 'N', 'WORK_EFF_DEPENDENCY'
WHERE NOT EXISTS (SELECT 1 FROM work_effort_assoc_type WHERE description = 'Dependency' AND has_table = 'N' AND work_effort_assoc_type_id = 'WORK_EFF_DEPENDENCY');

INSERT INTO work_effort_assoc_type (description, has_table, parent_type_id, work_effort_assoc_type_id)
SELECT 'Concurrency', 'N', 'WORK_EFF_DEPENDENCY', 'WORK_EFF_CONCURRENCY'
WHERE NOT EXISTS (SELECT 1 FROM work_effort_assoc_type WHERE description = 'Concurrency' AND has_table = 'N' AND parent_type_id = 'WORK_EFF_DEPENDENCY' AND work_effort_assoc_type_id = 'WORK_EFF_CONCURRENCY');

INSERT INTO work_effort_assoc_type (description, has_table, parent_type_id, work_effort_assoc_type_id)
SELECT 'Precedency', 'N', 'WORK_EFF_DEPENDENCY', 'WORK_EFF_PRECEDENCY'
WHERE NOT EXISTS (SELECT 1 FROM work_effort_assoc_type WHERE description = 'Precedency' AND has_table = 'N' AND parent_type_id = 'WORK_EFF_DEPENDENCY' AND work_effort_assoc_type_id = 'WORK_EFF_PRECEDENCY');

INSERT INTO work_effort_assoc_type (description, has_table, work_effort_assoc_type_id)
SELECT 'Template of', 'N', 'WORK_EFF_TEMPLATE'
WHERE NOT EXISTS (SELECT 1 FROM work_effort_assoc_type WHERE description = 'Template of' AND has_table = 'N' AND work_effort_assoc_type_id = 'WORK_EFF_TEMPLATE');

INSERT INTO work_effort_assoc_type (description, has_table, work_effort_assoc_type_id)
SELECT 'Routing and Routing Task Association', 'N', 'ROUTING_COMPONENT'
WHERE NOT EXISTS (SELECT 1 FROM work_effort_assoc_type WHERE description = 'Routing and Routing Task Association' AND has_table = 'N' AND work_effort_assoc_type_id = 'ROUTING_COMPONENT');

INSERT INTO work_effort_content_type (description, work_effort_content_type_id)
SELECT 'Proposal Media', 'PROPOSAL_MEDIA'
WHERE NOT EXISTS (SELECT 1 FROM work_effort_content_type WHERE description = 'Proposal Media' AND work_effort_content_type_id = 'PROPOSAL_MEDIA');

INSERT INTO work_effort_content_type (description, work_effort_content_type_id)
SELECT 'Supporting Media', 'SUPPORTING_MEDIA'
WHERE NOT EXISTS (SELECT 1 FROM work_effort_content_type WHERE description = 'Supporting Media' AND work_effort_content_type_id = 'SUPPORTING_MEDIA');

INSERT INTO work_effort_content_type (description, work_effort_content_type_id)
SELECT 'Created Media', 'CREATED_MEDIA'
WHERE NOT EXISTS (SELECT 1 FROM work_effort_content_type WHERE description = 'Created Media' AND work_effort_content_type_id = 'CREATED_MEDIA');

INSERT INTO work_effort_purpose_type (description, work_effort_purpose_type_id)
SELECT 'Production Run', 'WEPT_PRODUCTION_RUN'
WHERE NOT EXISTS (SELECT 1 FROM work_effort_purpose_type WHERE description = 'Production Run' AND work_effort_purpose_type_id = 'WEPT_PRODUCTION_RUN');

INSERT INTO work_effort_purpose_type (description, work_effort_purpose_type_id)
SELECT 'Maintenance', 'WEPT_MAINTENANCE'
WHERE NOT EXISTS (SELECT 1 FROM work_effort_purpose_type WHERE description = 'Maintenance' AND work_effort_purpose_type_id = 'WEPT_MAINTENANCE');

INSERT INTO work_effort_purpose_type (description, work_effort_purpose_type_id)
SELECT 'Research', 'WEPT_RESEARCH'
WHERE NOT EXISTS (SELECT 1 FROM work_effort_purpose_type WHERE description = 'Research' AND work_effort_purpose_type_id = 'WEPT_RESEARCH');

INSERT INTO work_effort_purpose_type (description, work_effort_purpose_type_id)
SELECT 'Meeting', 'WEPT_MEETING'
WHERE NOT EXISTS (SELECT 1 FROM work_effort_purpose_type WHERE description = 'Meeting' AND work_effort_purpose_type_id = 'WEPT_MEETING');

INSERT INTO work_effort_purpose_type (description, work_effort_purpose_type_id)
SELECT 'Development', 'WEPT_DEVELOPMENT'
WHERE NOT EXISTS (SELECT 1 FROM work_effort_purpose_type WHERE description = 'Development' AND work_effort_purpose_type_id = 'WEPT_DEVELOPMENT');

INSERT INTO work_effort_purpose_type (description, work_effort_purpose_type_id)
SELECT 'Support', 'WEPT_SUPPORT'
WHERE NOT EXISTS (SELECT 1 FROM work_effort_purpose_type WHERE description = 'Support' AND work_effort_purpose_type_id = 'WEPT_SUPPORT');

INSERT INTO work_effort_purpose_type (description, work_effort_purpose_type_id)
SELECT 'Deployment', 'WEPT_DEPLOYMENT'
WHERE NOT EXISTS (SELECT 1 FROM work_effort_purpose_type WHERE description = 'Deployment' AND work_effort_purpose_type_id = 'WEPT_DEPLOYMENT');

INSERT INTO work_effort_purpose_type (description, work_effort_purpose_type_id)
SELECT 'Warehousing', 'WEPT_WAREHOUSING'
WHERE NOT EXISTS (SELECT 1 FROM work_effort_purpose_type WHERE description = 'Warehousing' AND work_effort_purpose_type_id = 'WEPT_WAREHOUSING');

INSERT INTO work_effort_purpose_type (description, work_effort_purpose_type_id)
SELECT 'Manufacturing', 'ROU_MANUFACTURING'
WHERE NOT EXISTS (SELECT 1 FROM work_effort_purpose_type WHERE description = 'Manufacturing' AND work_effort_purpose_type_id = 'ROU_MANUFACTURING');

INSERT INTO work_effort_purpose_type (description, work_effort_purpose_type_id)
SELECT 'Assembling', 'ROU_ASSEMBLING'
WHERE NOT EXISTS (SELECT 1 FROM work_effort_purpose_type WHERE description = 'Assembling' AND work_effort_purpose_type_id = 'ROU_ASSEMBLING');

INSERT INTO work_effort_purpose_type (description, work_effort_purpose_type_id)
SELECT 'Sub-contracting', 'ROU_SUBCONTRACTING'
WHERE NOT EXISTS (SELECT 1 FROM work_effort_purpose_type WHERE description = 'Sub-contracting' AND work_effort_purpose_type_id = 'ROU_SUBCONTRACTING');

INSERT INTO work_effort_purpose_type (description, work_effort_purpose_type_id)
SELECT 'Phone Call', 'WEPT_TASK_PHONE_CALL'
WHERE NOT EXISTS (SELECT 1 FROM work_effort_purpose_type WHERE description = 'Phone Call' AND work_effort_purpose_type_id = 'WEPT_TASK_PHONE_CALL');

INSERT INTO work_effort_purpose_type (description, work_effort_purpose_type_id)
SELECT 'Email', 'WEPT_TASK_EMAIL'
WHERE NOT EXISTS (SELECT 1 FROM work_effort_purpose_type WHERE description = 'Email' AND work_effort_purpose_type_id = 'WEPT_TASK_EMAIL');

INSERT INTO work_effort_type (description, has_table, work_effort_type_id)
SELECT 'Routing', 'N', 'ROUTING'
WHERE NOT EXISTS (SELECT 1 FROM work_effort_type WHERE description = 'Routing' AND has_table = 'N' AND work_effort_type_id = 'ROUTING');

INSERT INTO work_effort_type (description, has_table, work_effort_type_id)
SELECT 'Routing Task', 'N', 'ROU_TASK'
WHERE NOT EXISTS (SELECT 1 FROM work_effort_type WHERE description = 'Routing Task' AND has_table = 'N' AND work_effort_type_id = 'ROU_TASK');

INSERT INTO work_effort_type (description, has_table, work_effort_type_id)
SELECT 'Production Run Header', 'N', 'PROD_ORDER_HEADER'
WHERE NOT EXISTS (SELECT 1 FROM work_effort_type WHERE description = 'Production Run Header' AND has_table = 'N' AND work_effort_type_id = 'PROD_ORDER_HEADER');

INSERT INTO work_effort_type (description, has_table, work_effort_type_id)
SELECT 'Production Run Task', 'N', 'PROD_ORDER_TASK'
WHERE NOT EXISTS (SELECT 1 FROM work_effort_type WHERE description = 'Production Run Task' AND has_table = 'N' AND work_effort_type_id = 'PROD_ORDER_TASK');

INSERT INTO work_effort_type (description, has_table, work_effort_type_id)
SELECT 'Fixed Asset Usage (rental)', 'N', 'ASSET_USAGE'
WHERE NOT EXISTS (SELECT 1 FROM work_effort_type WHERE description = 'Fixed Asset Usage (rental)' AND has_table = 'N' AND work_effort_type_id = 'ASSET_USAGE');

INSERT INTO work_effort_type (description, has_table, work_effort_type_id)
SELECT 'Event', 'N', 'EVENT'
WHERE NOT EXISTS (SELECT 1 FROM work_effort_type WHERE description = 'Event' AND has_table = 'N' AND work_effort_type_id = 'EVENT');

INSERT INTO work_effort_type (description, has_table, parent_type_id, work_effort_type_id)
SELECT 'Inbound Shipment', 'N', 'EVENT', 'SHIPMENT_INBOUND'
WHERE NOT EXISTS (SELECT 1 FROM work_effort_type WHERE description = 'Inbound Shipment' AND has_table = 'N' AND parent_type_id = 'EVENT' AND work_effort_type_id = 'SHIPMENT_INBOUND');

INSERT INTO work_effort_type (description, has_table, parent_type_id, work_effort_type_id)
SELECT 'Outbound Shipment', 'N', 'EVENT', 'SHIPMENT_OUTBOUND'
WHERE NOT EXISTS (SELECT 1 FROM work_effort_type WHERE description = 'Outbound Shipment' AND has_table = 'N' AND parent_type_id = 'EVENT' AND work_effort_type_id = 'SHIPMENT_OUTBOUND');

INSERT INTO work_effort_good_standard_type (description, has_table, work_effort_good_std_type_id)
SELECT 'Product and Routing Association', 'N', 'ROU_PROD_TEMPLATE'
WHERE NOT EXISTS (SELECT 1 FROM work_effort_good_standard_type WHERE description = 'Product and Routing Association' AND has_table = 'N' AND work_effort_good_std_type_id = 'ROU_PROD_TEMPLATE');

INSERT INTO work_effort_good_standard_type (description, has_table, work_effort_good_std_type_id)
SELECT 'Production Run and Product to Deliver Association', 'N', 'PRUN_PROD_DELIV'
WHERE NOT EXISTS (SELECT 1 FROM work_effort_good_standard_type WHERE description = 'Production Run and Product to Deliver Association' AND has_table = 'N' AND work_effort_good_std_type_id = 'PRUN_PROD_DELIV');

INSERT INTO work_effort_good_standard_type (description, has_table, work_effort_good_std_type_id)
SELECT 'Production Run Task and Needed Product Association', 'N', 'PRUNT_PROD_NEEDED'
WHERE NOT EXISTS (SELECT 1 FROM work_effort_good_standard_type WHERE description = 'Production Run Task and Needed Product Association' AND has_table = 'N' AND work_effort_good_std_type_id = 'PRUNT_PROD_NEEDED');

INSERT INTO work_effort_good_standard_type (description, has_table, work_effort_good_std_type_id)
SELECT 'Production Run Task and Deliverable Product Association', 'N', 'PRUNT_PROD_DELIV'
WHERE NOT EXISTS (SELECT 1 FROM work_effort_good_standard_type WHERE description = 'Production Run Task and Deliverable Product Association' AND has_table = 'N' AND work_effort_good_std_type_id = 'PRUNT_PROD_DELIV');

INSERT INTO work_effort_good_standard_type (description, has_table, work_effort_good_std_type_id)
SELECT 'Product to Represent General Sales of the WorkEffort', 'N', 'GENERAL_SALES'
WHERE NOT EXISTS (SELECT 1 FROM work_effort_good_standard_type WHERE description = 'Product to Represent General Sales of the WorkEffort' AND has_table = 'N' AND work_effort_good_std_type_id = 'GENERAL_SALES');

INSERT INTO work_effort_type (description, has_table, parent_type_id, work_effort_type_id)
SELECT 'Business Travel', 'N', 'EVENT', 'BUSINESS_TRAVEL'
WHERE NOT EXISTS (SELECT 1 FROM work_effort_type WHERE description = 'Business Travel' AND has_table = 'N' AND parent_type_id = 'EVENT' AND work_effort_type_id = 'BUSINESS_TRAVEL');

INSERT INTO work_effort_type (description, has_table, parent_type_id, work_effort_type_id)
SELECT 'Meeting', 'N', 'EVENT', 'MEETING'
WHERE NOT EXISTS (SELECT 1 FROM work_effort_type WHERE description = 'Meeting' AND has_table = 'N' AND parent_type_id = 'EVENT' AND work_effort_type_id = 'MEETING');

INSERT INTO work_effort_type (description, has_table, parent_type_id, work_effort_type_id)
SELECT 'Training', 'N', 'EVENT', 'TRAINING'
WHERE NOT EXISTS (SELECT 1 FROM work_effort_type WHERE description = 'Training' AND has_table = 'N' AND parent_type_id = 'EVENT' AND work_effort_type_id = 'TRAINING');

INSERT INTO work_effort_type (description, has_table, parent_type_id, work_effort_type_id)
SELECT 'Personal Time Off', 'N', 'EVENT', 'PERSONAL_TIMEOFF'
WHERE NOT EXISTS (SELECT 1 FROM work_effort_type WHERE description = 'Personal Time Off' AND has_table = 'N' AND parent_type_id = 'EVENT' AND work_effort_type_id = 'PERSONAL_TIMEOFF');

INSERT INTO work_effort_type (description, has_table, work_effort_type_id)
SELECT 'Publish Properties', 'N', 'PUBLISH_PROPS'
WHERE NOT EXISTS (SELECT 1 FROM work_effort_type WHERE description = 'Publish Properties' AND has_table = 'N' AND work_effort_type_id = 'PUBLISH_PROPS');
