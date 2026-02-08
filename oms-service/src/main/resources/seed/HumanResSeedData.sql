INSERT INTO security_permission (description, permission_id)
SELECT 'Employee can check the status of his requests and trainings assigned to him with this permission.', 'EMPLOYEE_VIEW'
WHERE NOT EXISTS (SELECT 1 FROM security_permission WHERE description = 'Employee can check the status of his requests and trainings assigned to him with this permission.' AND permission_id = 'EMPLOYEE_VIEW');
