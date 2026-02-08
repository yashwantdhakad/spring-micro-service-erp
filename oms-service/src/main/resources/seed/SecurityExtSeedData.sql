INSERT INTO party (party_id, party_type_id, status_id)
SELECT 'system', 'PERSON', 'PARTY_ENABLED'
WHERE NOT EXISTS (SELECT 1 FROM party WHERE party_id = 'system' AND party_type_id = 'PERSON' AND status_id = 'PARTY_ENABLED');

INSERT INTO person (first_name, last_name, party_id)
SELECT 'System', 'Account', 'system'
WHERE NOT EXISTS (SELECT 1 FROM person WHERE first_name = 'System' AND last_name = 'Account' AND party_id = 'system');

INSERT INTO party_status (party_id, status_date, status_id)
SELECT 'system', '2001-01-01 12:00:00.0', 'PARTY_ENABLED'
WHERE NOT EXISTS (SELECT 1 FROM party_status WHERE party_id = 'system' AND status_date = '2001-01-01 12:00:00.0' AND status_id = 'PARTY_ENABLED');

INSERT INTO party_role (party_id, role_type_id)
SELECT 'system', 'PACKER'
WHERE NOT EXISTS (SELECT 1 FROM party_role WHERE party_id = 'system' AND role_type_id = 'PACKER');

INSERT INTO user_login (party_id, user_login_id)
SELECT 'system', 'system'
WHERE NOT EXISTS (SELECT 1 FROM user_login WHERE party_id = 'system' AND user_login_id = 'system');
