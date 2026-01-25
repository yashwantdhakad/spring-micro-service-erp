INSERT INTO status_type (description, has_table, status_type_id)
SELECT 'Marketing Campaign', 0, 'MKTG_CAMP_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_type WHERE description = 'Marketing Campaign' AND has_table = 0 AND status_type_id = 'MKTG_CAMP_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Planned', '01', 'PLANNED', 'MKTG_CAMP_PLANNED', 'MKTG_CAMP_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Planned' AND sequence_id = '01' AND status_code = 'PLANNED' AND status_id = 'MKTG_CAMP_PLANNED' AND status_type_id = 'MKTG_CAMP_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Approved', '02', 'APPROVED', 'MKTG_CAMP_APPROVED', 'MKTG_CAMP_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Approved' AND sequence_id = '02' AND status_code = 'APPROVED' AND status_id = 'MKTG_CAMP_APPROVED' AND status_type_id = 'MKTG_CAMP_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'In Progress', '03', 'INPROGRESS', 'MKTG_CAMP_INPROGRESS', 'MKTG_CAMP_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'In Progress' AND sequence_id = '03' AND status_code = 'INPROGRESS' AND status_id = 'MKTG_CAMP_INPROGRESS' AND status_type_id = 'MKTG_CAMP_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Completed', '04', 'COMPLETED', 'MKTG_CAMP_COMPLETED', 'MKTG_CAMP_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Completed' AND sequence_id = '04' AND status_code = 'COMPLETED' AND status_id = 'MKTG_CAMP_COMPLETED' AND status_type_id = 'MKTG_CAMP_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Cancelled', '05', 'CANCELLED', 'MKTG_CAMP_CANCELLED', 'MKTG_CAMP_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Cancelled' AND sequence_id = '05' AND status_code = 'CANCELLED' AND status_id = 'MKTG_CAMP_CANCELLED' AND status_type_id = 'MKTG_CAMP_STATUS');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'MKTG_CAMP_PLANNED', 'MKTG_CAMP_APPROVED', 'Approve Marketing Campaign'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'MKTG_CAMP_PLANNED' AND status_id_to = 'MKTG_CAMP_APPROVED' AND transition_name = 'Approve Marketing Campaign');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'MKTG_CAMP_APPROVED', 'MKTG_CAMP_INPROGRESS', 'Marketing Campaign In Progress'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'MKTG_CAMP_APPROVED' AND status_id_to = 'MKTG_CAMP_INPROGRESS' AND transition_name = 'Marketing Campaign In Progress');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'MKTG_CAMP_INPROGRESS', 'MKTG_CAMP_COMPLETED', 'Complete Marketing Campaign'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'MKTG_CAMP_INPROGRESS' AND status_id_to = 'MKTG_CAMP_COMPLETED' AND transition_name = 'Complete Marketing Campaign');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'MKTG_CAMP_PLANNED', 'MKTG_CAMP_CANCELLED', 'Cancel Marketing Campaign'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'MKTG_CAMP_PLANNED' AND status_id_to = 'MKTG_CAMP_CANCELLED' AND transition_name = 'Cancel Marketing Campaign');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'MKTG_CAMP_APPROVED', 'MKTG_CAMP_CANCELLED', 'Cancel Marketing Campaign'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'MKTG_CAMP_APPROVED' AND status_id_to = 'MKTG_CAMP_CANCELLED' AND transition_name = 'Cancel Marketing Campaign');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'MKTG_CAMP_INPROGRESS', 'MKTG_CAMP_CANCELLED', 'Cancel Marketing Campaign'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'MKTG_CAMP_INPROGRESS' AND status_id_to = 'MKTG_CAMP_CANCELLED' AND transition_name = 'Cancel Marketing Campaign');

INSERT INTO status_type (description, has_table, status_type_id)
SELECT 'Contact List Party', 0, 'CONTACTLST_PARTY'
WHERE NOT EXISTS (SELECT 1 FROM status_type WHERE description = 'Contact List Party' AND has_table = 0 AND status_type_id = 'CONTACTLST_PARTY');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Pending Acceptance', '01', 'PENDING', 'CLPT_PENDING', 'CONTACTLST_PARTY'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Pending Acceptance' AND sequence_id = '01' AND status_code = 'PENDING' AND status_id = 'CLPT_PENDING' AND status_type_id = 'CONTACTLST_PARTY');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Accepted', '02', 'ACCEPTED', 'CLPT_ACCEPTED', 'CONTACTLST_PARTY'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Accepted' AND sequence_id = '02' AND status_code = 'ACCEPTED' AND status_id = 'CLPT_ACCEPTED' AND status_type_id = 'CONTACTLST_PARTY');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Rejected', '03', 'REJECTED', 'CLPT_REJECTED', 'CONTACTLST_PARTY'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Rejected' AND sequence_id = '03' AND status_code = 'REJECTED' AND status_id = 'CLPT_REJECTED' AND status_type_id = 'CONTACTLST_PARTY');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'In Use', '04', 'IN_USE', 'CLPT_IN_USE', 'CONTACTLST_PARTY'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'In Use' AND sequence_id = '04' AND status_code = 'IN_USE' AND status_id = 'CLPT_IN_USE' AND status_type_id = 'CONTACTLST_PARTY');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Invalid', '05', 'INVALID', 'CLPT_INVALID', 'CONTACTLST_PARTY'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Invalid' AND sequence_id = '05' AND status_code = 'INVALID' AND status_id = 'CLPT_INVALID' AND status_type_id = 'CONTACTLST_PARTY');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Unsubscription pending', '06', 'UNSUBS_PENDING', 'CLPT_UNSUBS_PENDING', 'CONTACTLST_PARTY'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Unsubscription pending' AND sequence_id = '06' AND status_code = 'UNSUBS_PENDING' AND status_id = 'CLPT_UNSUBS_PENDING' AND status_type_id = 'CONTACTLST_PARTY');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Unsubscribed', '07', 'UNSUBSCRIBED', 'CLPT_UNSUBSCRIBED', 'CONTACTLST_PARTY'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Unsubscribed' AND sequence_id = '07' AND status_code = 'UNSUBSCRIBED' AND status_id = 'CLPT_UNSUBSCRIBED' AND status_type_id = 'CONTACTLST_PARTY');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'CLPT_PENDING', 'CLPT_ACCEPTED', 'Accept'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'CLPT_PENDING' AND status_id_to = 'CLPT_ACCEPTED' AND transition_name = 'Accept');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'CLPT_PENDING', 'CLPT_REJECTED', 'Reject'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'CLPT_PENDING' AND status_id_to = 'CLPT_REJECTED' AND transition_name = 'Reject');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'CLPT_ACCEPTED', 'CLPT_REJECTED', 'Reject'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'CLPT_ACCEPTED' AND status_id_to = 'CLPT_REJECTED' AND transition_name = 'Reject');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'CLPT_REJECTED', 'CLPT_ACCEPTED', 'Accept'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'CLPT_REJECTED' AND status_id_to = 'CLPT_ACCEPTED' AND transition_name = 'Accept');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'CLPT_REJECTED', 'CLPT_PENDING', 'Pending Accept'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'CLPT_REJECTED' AND status_id_to = 'CLPT_PENDING' AND transition_name = 'Pending Accept');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'CLPT_ACCEPTED', 'CLPT_IN_USE', 'Locked - In Use'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'CLPT_ACCEPTED' AND status_id_to = 'CLPT_IN_USE' AND transition_name = 'Locked - In Use');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'CLPT_ACCEPTED', 'CLPT_INVALID', 'Invalid'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'CLPT_ACCEPTED' AND status_id_to = 'CLPT_INVALID' AND transition_name = 'Invalid');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'CLPT_ACCEPTED', 'CLPT_UNSUBS_PENDING', 'Subscription Accepted - Unsubscription Pending'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'CLPT_ACCEPTED' AND status_id_to = 'CLPT_UNSUBS_PENDING' AND transition_name = 'Subscription Accepted - Unsubscription Pending');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'CLPT_PENDING', 'CLPT_UNSUBS_PENDING', 'Subscription Pending - Unsubscription Pending'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'CLPT_PENDING' AND status_id_to = 'CLPT_UNSUBS_PENDING' AND transition_name = 'Subscription Pending - Unsubscription Pending');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'CLPT_IN_USE', 'CLPT_UNSUBS_PENDING', 'Subscription In Use - Unsubscription Pending'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'CLPT_IN_USE' AND status_id_to = 'CLPT_UNSUBS_PENDING' AND transition_name = 'Subscription In Use - Unsubscription Pending');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'CLPT_INVALID', 'CLPT_UNSUBS_PENDING', 'Subscription Invalid - Unsubscription Pending'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'CLPT_INVALID' AND status_id_to = 'CLPT_UNSUBS_PENDING' AND transition_name = 'Subscription Invalid - Unsubscription Pending');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'CLPT_ACCEPTED', 'CLPT_UNSUBSCRIBED', 'Subscription Accepted - Unsubscribed'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'CLPT_ACCEPTED' AND status_id_to = 'CLPT_UNSUBSCRIBED' AND transition_name = 'Subscription Accepted - Unsubscribed');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'CLPT_PENDING', 'CLPT_UNSUBSCRIBED', 'Subscription Accepted - Unsubscribed'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'CLPT_PENDING' AND status_id_to = 'CLPT_UNSUBSCRIBED' AND transition_name = 'Subscription Accepted - Unsubscribed');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'CLPT_IN_USE', 'CLPT_UNSUBSCRIBED', 'Subscription In Use - Unsubscribed'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'CLPT_IN_USE' AND status_id_to = 'CLPT_UNSUBSCRIBED' AND transition_name = 'Subscription In Use - Unsubscribed');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'CLPT_INVALID', 'CLPT_UNSUBSCRIBED', 'Subscription Invalid - Unsubscribed'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'CLPT_INVALID' AND status_id_to = 'CLPT_UNSUBSCRIBED' AND transition_name = 'Subscription Invalid - Unsubscribed');

INSERT INTO enumeration_type (description, enum_type_id, has_table)
SELECT 'Tracking Code Source', 'TRACKINGCODE_SRC', 0
WHERE NOT EXISTS (SELECT 1 FROM enumeration_type WHERE description = 'Tracking Code Source' AND enum_type_id = 'TRACKINGCODE_SRC' AND has_table = 0);

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'Cookie', 'COOKIE', 'TKCDSRC_COOKIE', 'TRACKINGCODE_SRC', '01'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'Cookie' AND enum_code = 'COOKIE' AND enum_id = 'TKCDSRC_COOKIE' AND enum_type_id = 'TRACKINGCODE_SRC' AND sequence_id = '01');

INSERT INTO enumeration (description, enum_code, enum_id, enum_type_id, sequence_id)
SELECT 'URL Parameter', 'URL_PARAM', 'TKCDSRC_URL_PARAM', 'TRACKINGCODE_SRC', '01'
WHERE NOT EXISTS (SELECT 1 FROM enumeration WHERE description = 'URL Parameter' AND enum_code = 'URL_PARAM' AND enum_id = 'TKCDSRC_URL_PARAM' AND enum_type_id = 'TRACKINGCODE_SRC' AND sequence_id = '01');

INSERT INTO data_source_type (data_source_type_id, description)
SELECT 'LEAD_SOURCE', 'Lead Source'
WHERE NOT EXISTS (SELECT 1 FROM data_source_type WHERE data_source_type_id = 'LEAD_SOURCE' AND description = 'Lead Source');

INSERT INTO data_source (data_source_id, data_source_type_id, description)
SELECT 'OTHER', 'LEAD_SOURCE', 'Other'
WHERE NOT EXISTS (SELECT 1 FROM data_source WHERE data_source_id = 'OTHER' AND data_source_type_id = 'LEAD_SOURCE' AND description = 'Other');

INSERT INTO data_source (data_source_id, data_source_type_id, description)
SELECT 'COLD_CALL', 'LEAD_SOURCE', 'Cold Call'
WHERE NOT EXISTS (SELECT 1 FROM data_source WHERE data_source_id = 'COLD_CALL' AND data_source_type_id = 'LEAD_SOURCE' AND description = 'Cold Call');

INSERT INTO data_source (data_source_id, data_source_type_id, description)
SELECT 'EXISTING_CUSTOMER', 'LEAD_SOURCE', 'Existing Customer'
WHERE NOT EXISTS (SELECT 1 FROM data_source WHERE data_source_id = 'EXISTING_CUSTOMER' AND data_source_type_id = 'LEAD_SOURCE' AND description = 'Existing Customer');

INSERT INTO data_source (data_source_id, data_source_type_id, description)
SELECT 'SELF_GENERATED', 'LEAD_SOURCE', 'Self Generated'
WHERE NOT EXISTS (SELECT 1 FROM data_source WHERE data_source_id = 'SELF_GENERATED' AND data_source_type_id = 'LEAD_SOURCE' AND description = 'Self Generated');

INSERT INTO data_source (data_source_id, data_source_type_id, description)
SELECT 'EMPLOYEE', 'LEAD_SOURCE', 'Employee'
WHERE NOT EXISTS (SELECT 1 FROM data_source WHERE data_source_id = 'EMPLOYEE' AND data_source_type_id = 'LEAD_SOURCE' AND description = 'Employee');

INSERT INTO data_source (data_source_id, data_source_type_id, description)
SELECT 'PARTNER', 'LEAD_SOURCE', 'Partner'
WHERE NOT EXISTS (SELECT 1 FROM data_source WHERE data_source_id = 'PARTNER' AND data_source_type_id = 'LEAD_SOURCE' AND description = 'Partner');

INSERT INTO data_source (data_source_id, data_source_type_id, description)
SELECT 'PUBLIC_RELATIONS', 'LEAD_SOURCE', 'Public Relations'
WHERE NOT EXISTS (SELECT 1 FROM data_source WHERE data_source_id = 'PUBLIC_RELATIONS' AND data_source_type_id = 'LEAD_SOURCE' AND description = 'Public Relations');

INSERT INTO data_source (data_source_id, data_source_type_id, description)
SELECT 'DIRECT_MAIL', 'LEAD_SOURCE', 'Direct Mail'
WHERE NOT EXISTS (SELECT 1 FROM data_source WHERE data_source_id = 'DIRECT_MAIL' AND data_source_type_id = 'LEAD_SOURCE' AND description = 'Direct Mail');

INSERT INTO data_source (data_source_id, data_source_type_id, description)
SELECT 'CONFERENCE', 'LEAD_SOURCE', 'Conference'
WHERE NOT EXISTS (SELECT 1 FROM data_source WHERE data_source_id = 'CONFERENCE' AND data_source_type_id = 'LEAD_SOURCE' AND description = 'Conference');

INSERT INTO data_source (data_source_id, data_source_type_id, description)
SELECT 'TRADE_SHOW', 'LEAD_SOURCE', 'Trade Show'
WHERE NOT EXISTS (SELECT 1 FROM data_source WHERE data_source_id = 'TRADE_SHOW' AND data_source_type_id = 'LEAD_SOURCE' AND description = 'Trade Show');

INSERT INTO data_source (data_source_id, data_source_type_id, description)
SELECT 'WEB_SITE', 'LEAD_SOURCE', 'Web Site'
WHERE NOT EXISTS (SELECT 1 FROM data_source WHERE data_source_id = 'WEB_SITE' AND data_source_type_id = 'LEAD_SOURCE' AND description = 'Web Site');

INSERT INTO data_source (data_source_id, data_source_type_id, description)
SELECT 'WORD_OF_MOUTH', 'LEAD_SOURCE', 'Word of Mouth'
WHERE NOT EXISTS (SELECT 1 FROM data_source WHERE data_source_id = 'WORD_OF_MOUTH' AND data_source_type_id = 'LEAD_SOURCE' AND description = 'Word of Mouth');

INSERT INTO data_source (data_source_id, data_source_type_id, description)
SELECT 'EMAIL', 'LEAD_SOURCE', 'Email'
WHERE NOT EXISTS (SELECT 1 FROM data_source WHERE data_source_id = 'EMAIL' AND data_source_type_id = 'LEAD_SOURCE' AND description = 'Email');

INSERT INTO data_source (data_source_id, data_source_type_id, description)
SELECT 'CAMPAIGN', 'LEAD_SOURCE', 'Campaign'
WHERE NOT EXISTS (SELECT 1 FROM data_source WHERE data_source_id = 'CAMPAIGN' AND data_source_type_id = 'LEAD_SOURCE' AND description = 'Campaign');

INSERT INTO status_type (description, parent_type_id, status_type_id)
SELECT 'Lead Status', 'PARTY_STATUS', 'LEAD_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_type WHERE description = 'Lead Status' AND parent_type_id = 'PARTY_STATUS' AND status_type_id = 'LEAD_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Assigned', '01', 'ASSIGNED', 'LEAD_ASSIGNED', 'LEAD_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Assigned' AND sequence_id = '01' AND status_code = 'ASSIGNED' AND status_id = 'LEAD_ASSIGNED' AND status_type_id = 'LEAD_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Converted', '02', 'CONVERTED', 'LEAD_CONVERTED', 'LEAD_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Converted' AND sequence_id = '02' AND status_code = 'CONVERTED' AND status_id = 'LEAD_CONVERTED' AND status_type_id = 'LEAD_STATUS');

INSERT INTO status_item (description, sequence_id, status_code, status_id, status_type_id)
SELECT 'Qualified', '03', 'QUALIFIED', 'LEAD_QUALIFIED', 'LEAD_STATUS'
WHERE NOT EXISTS (SELECT 1 FROM status_item WHERE description = 'Qualified' AND sequence_id = '03' AND status_code = 'QUALIFIED' AND status_id = 'LEAD_QUALIFIED' AND status_type_id = 'LEAD_STATUS');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'PARTY_ENABLED', 'LEAD_ASSIGNED', 'Assigned'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'PARTY_ENABLED' AND status_id_to = 'LEAD_ASSIGNED' AND transition_name = 'Assigned');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'LEAD_ASSIGNED', 'LEAD_CONVERTED', 'Converted'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'LEAD_ASSIGNED' AND status_id_to = 'LEAD_CONVERTED' AND transition_name = 'Converted');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'LEAD_ASSIGNED', 'LEAD_QUALIFIED', 'Qualified'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'LEAD_ASSIGNED' AND status_id_to = 'LEAD_QUALIFIED' AND transition_name = 'Qualified');

INSERT INTO status_valid_change (status_id, status_id_to, transition_name)
SELECT 'LEAD_ASSIGNED', 'PARTY_DISABLED', 'Disabled'
WHERE NOT EXISTS (SELECT 1 FROM status_valid_change WHERE status_id = 'LEAD_ASSIGNED' AND status_id_to = 'PARTY_DISABLED' AND transition_name = 'Disabled');

INSERT INTO enumeration_type (description, enum_type_id)
SELECT 'Sales Opportunity Type', 'SLSOPP_TYP_ENUM'
WHERE NOT EXISTS (SELECT 1 FROM enumeration_type WHERE description = 'Sales Opportunity Type' AND enum_type_id = 'SLSOPP_TYP_ENUM');
