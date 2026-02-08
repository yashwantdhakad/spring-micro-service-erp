INSERT INTO work_effort (current_status_id, description, quantity_to_produce, revision_number, work_effort_id, work_effort_name, work_effort_type_id)
SELECT 'ROU_ACTIVE', 'Default Routing', '0', '1', 'DEFAULT_ROUTING', 'Default Routing', 'ROUTING'
WHERE NOT EXISTS (SELECT 1 FROM work_effort WHERE work_effort_id = 'DEFAULT_ROUTING');

INSERT INTO work_effort (current_status_id, description, estimated_milli_seconds, estimated_setup_millis, revision_number, work_effort_id, work_effort_name, work_effort_purpose_type_id, work_effort_type_id)
SELECT 'ROU_ACTIVE', 'Default Routing Task', '0', '0', '1', 'DEFAULT_TASK', 'Default Routing Task', 'ROU_ASSEMBLING', 'ROU_TASK'
WHERE NOT EXISTS (SELECT 1 FROM work_effort WHERE work_effort_id = 'DEFAULT_TASK');

INSERT INTO work_effort_assoc (from_date, sequence_num, work_effort_assoc_type_id, work_effort_id_from, work_effort_id_to)
SELECT '2004-09-24 15:09:38.736', '10', 'ROUTING_COMPONENT', 'DEFAULT_ROUTING', 'DEFAULT_TASK'
WHERE NOT EXISTS (
  SELECT 1 FROM work_effort_assoc
  WHERE work_effort_id_from = 'DEFAULT_ROUTING'
    AND work_effort_id_to = 'DEFAULT_TASK'
    AND work_effort_assoc_type_id = 'ROUTING_COMPONENT'
);
