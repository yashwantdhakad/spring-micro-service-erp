INSERT INTO content_assoc_type (content_assoc_type_id, description)
SELECT 'TEMPLATE_MEMBER', 'Template Member'
WHERE NOT EXISTS (SELECT 1 FROM content_assoc_type WHERE content_assoc_type_id = 'TEMPLATE_MEMBER' AND description = 'Template Member');

INSERT INTO content_assoc_type (content_assoc_type_id, description)
SELECT 'STRUCTURE_DEF', 'Document Structure Definition'
WHERE NOT EXISTS (SELECT 1 FROM content_assoc_type WHERE content_assoc_type_id = 'STRUCTURE_DEF' AND description = 'Document Structure Definition');

INSERT INTO content_assoc_type (content_assoc_type_id, description)
SELECT 'TXFORM_DEF', 'Transformation Definition'
WHERE NOT EXISTS (SELECT 1 FROM content_assoc_type WHERE content_assoc_type_id = 'TXFORM_DEF' AND description = 'Transformation Definition');

INSERT INTO content_assoc_type (content_assoc_type_id, description)
SELECT 'LIST_ENTRY', 'List Entry'
WHERE NOT EXISTS (SELECT 1 FROM content_assoc_type WHERE content_assoc_type_id = 'LIST_ENTRY' AND description = 'List Entry');

INSERT INTO content_assoc_type (content_assoc_type_id, description)
SELECT 'TREE_CHILD', 'Tree Child'
WHERE NOT EXISTS (SELECT 1 FROM content_assoc_type WHERE content_assoc_type_id = 'TREE_CHILD' AND description = 'Tree Child');

INSERT INTO content_assoc_type (content_assoc_type_id, description)
SELECT 'GRAPH_LINK', 'Graph Link'
WHERE NOT EXISTS (SELECT 1 FROM content_assoc_type WHERE content_assoc_type_id = 'GRAPH_LINK' AND description = 'Graph Link');

INSERT INTO content_assoc_type (content_assoc_type_id, description)
SELECT 'ALTERNATE_LOCALE', 'Alternate Locale'
WHERE NOT EXISTS (SELECT 1 FROM content_assoc_type WHERE content_assoc_type_id = 'ALTERNATE_LOCALE' AND description = 'Alternate Locale');

INSERT INTO content_assoc_type (content_assoc_type_id, description)
SELECT 'ALTERNATE_ROLE', 'Alternate Role'
WHERE NOT EXISTS (SELECT 1 FROM content_assoc_type WHERE content_assoc_type_id = 'ALTERNATE_ROLE' AND description = 'Alternate Role');

INSERT INTO content_assoc_type (content_assoc_type_id, description)
SELECT 'RESPONSE', 'Response'
WHERE NOT EXISTS (SELECT 1 FROM content_assoc_type WHERE content_assoc_type_id = 'RESPONSE' AND description = 'Response');

INSERT INTO content_assoc_type (content_assoc_type_id, description)
SELECT 'SUB_CONTENT', 'Sub-Content'
WHERE NOT EXISTS (SELECT 1 FROM content_assoc_type WHERE content_assoc_type_id = 'SUB_CONTENT' AND description = 'Sub-Content');

INSERT INTO content_assoc_type (content_assoc_type_id, description)
SELECT 'TOPIC', 'Topic'
WHERE NOT EXISTS (SELECT 1 FROM content_assoc_type WHERE content_assoc_type_id = 'TOPIC' AND description = 'Topic');

INSERT INTO content_assoc_type (content_assoc_type_id, description)
SELECT 'DESCRIPTION', 'Description'
WHERE NOT EXISTS (SELECT 1 FROM content_assoc_type WHERE content_assoc_type_id = 'DESCRIPTION' AND description = 'Description');

INSERT INTO content_assoc_type (content_assoc_type_id, description)
SELECT 'SUBSITE', 'SubSite'
WHERE NOT EXISTS (SELECT 1 FROM content_assoc_type WHERE content_assoc_type_id = 'SUBSITE' AND description = 'SubSite');

INSERT INTO content_assoc_type (content_assoc_type_id, description)
SELECT 'DEPARTMENT', 'Department'
WHERE NOT EXISTS (SELECT 1 FROM content_assoc_type WHERE content_assoc_type_id = 'DEPARTMENT' AND description = 'Department');

INSERT INTO content_assoc_type (content_assoc_type_id, description)
SELECT 'RELATED_CONTENT', 'Related content'
WHERE NOT EXISTS (SELECT 1 FROM content_assoc_type WHERE content_assoc_type_id = 'RELATED_CONTENT' AND description = 'Related content');

INSERT INTO content_assoc_type (content_assoc_type_id, description)
SELECT 'PUBLISH_LINK', 'Publish link'
WHERE NOT EXISTS (SELECT 1 FROM content_assoc_type WHERE content_assoc_type_id = 'PUBLISH_LINK' AND description = 'Publish link');

INSERT INTO content_assoc_type (content_assoc_type_id, description)
SELECT 'ATTRIBUTE', 'Attribute'
WHERE NOT EXISTS (SELECT 1 FROM content_assoc_type WHERE content_assoc_type_id = 'ATTRIBUTE' AND description = 'Attribute');

INSERT INTO content_assoc_type (content_assoc_type_id, description)
SELECT 'AUTHOR', 'Author'
WHERE NOT EXISTS (SELECT 1 FROM content_assoc_type WHERE content_assoc_type_id = 'AUTHOR' AND description = 'Author');

INSERT INTO content_assoc_type (content_assoc_type_id, description)
SELECT 'SUMMARY', 'Summary'
WHERE NOT EXISTS (SELECT 1 FROM content_assoc_type WHERE content_assoc_type_id = 'SUMMARY' AND description = 'Summary');

INSERT INTO content_assoc_type (content_assoc_type_id, description)
SELECT 'INSTANCE', 'Instance Of'
WHERE NOT EXISTS (SELECT 1 FROM content_assoc_type WHERE content_assoc_type_id = 'INSTANCE' AND description = 'Instance Of');

INSERT INTO content_assoc_type (content_assoc_type_id, description)
SELECT 'ALTERNATIVE_URL', 'Alternative URL'
WHERE NOT EXISTS (SELECT 1 FROM content_assoc_type WHERE content_assoc_type_id = 'ALTERNATIVE_URL' AND description = 'Alternative URL');

INSERT INTO content_assoc_predicate (content_assoc_predicate_id, description)
SELECT 'member-of', 'The object is a member of the subject.'
WHERE NOT EXISTS (SELECT 1 FROM content_assoc_predicate WHERE content_assoc_predicate_id = 'member-of' AND description = 'The object is a member of the subject.');

INSERT INTO content_assoc_predicate (content_assoc_predicate_id, description)
SELECT 'defines', 'The object defines the subject.'
WHERE NOT EXISTS (SELECT 1 FROM content_assoc_predicate WHERE content_assoc_predicate_id = 'defines' AND description = 'The object defines the subject.');

INSERT INTO content_assoc_predicate (content_assoc_predicate_id, description)
SELECT 'extends', 'The object extends the subject.'
WHERE NOT EXISTS (SELECT 1 FROM content_assoc_predicate WHERE content_assoc_predicate_id = 'extends' AND description = 'The object extends the subject.');

INSERT INTO content_assoc_predicate (content_assoc_predicate_id, description)
SELECT 'related-to', 'The object is related to the subject.'
WHERE NOT EXISTS (SELECT 1 FROM content_assoc_predicate WHERE content_assoc_predicate_id = 'related-to' AND description = 'The object is related to the subject.');

INSERT INTO content_assoc_predicate (content_assoc_predicate_id, description)
SELECT 'references', 'The object references the subject.'
WHERE NOT EXISTS (SELECT 1 FROM content_assoc_predicate WHERE content_assoc_predicate_id = 'references' AND description = 'The object references the subject.');

INSERT INTO content_assoc_predicate (content_assoc_predicate_id, description)
SELECT 'topifies', 'Topifies'
WHERE NOT EXISTS (SELECT 1 FROM content_assoc_predicate WHERE content_assoc_predicate_id = 'topifies' AND description = 'Topifies');

INSERT INTO content_assoc_predicate (content_assoc_predicate_id, description)
SELECT 'categorizes', 'Categorizes'
WHERE NOT EXISTS (SELECT 1 FROM content_assoc_predicate WHERE content_assoc_predicate_id = 'categorizes' AND description = 'Categorizes');

INSERT INTO meta_data_predicate (description, meta_data_predicate_id)
SELECT 'Name of the author or creator of the subject.', 'author-name'
WHERE NOT EXISTS (SELECT 1 FROM meta_data_predicate WHERE description = 'Name of the author or creator of the subject.' AND meta_data_predicate_id = 'author-name');

INSERT INTO meta_data_predicate (description, meta_data_predicate_id)
SELECT 'eMail address of the author or creator of the subject.', 'author-email'
WHERE NOT EXISTS (SELECT 1 FROM meta_data_predicate WHERE description = 'eMail address of the author or creator of the subject.' AND meta_data_predicate_id = 'author-email');

INSERT INTO meta_data_predicate (description, meta_data_predicate_id)
SELECT 'The date and time of the event in format [yyyy-MM-dd hh:mm:ss].', 'event-date'
WHERE NOT EXISTS (SELECT 1 FROM meta_data_predicate WHERE description = 'The date and time of the event in format [yyyy-MM-dd hh:mm:ss].' AND meta_data_predicate_id = 'event-date');

INSERT INTO meta_data_predicate (description, meta_data_predicate_id)
SELECT 'The location where subject event took place.', 'event-location'
WHERE NOT EXISTS (SELECT 1 FROM meta_data_predicate WHERE description = 'The location where subject event took place.' AND meta_data_predicate_id = 'event-location');

INSERT INTO meta_data_predicate (description, meta_data_predicate_id)
SELECT 'The name of a person involved in the subject event.', 'event-person-name'
WHERE NOT EXISTS (SELECT 1 FROM meta_data_predicate WHERE description = 'The name of a person involved in the subject event.' AND meta_data_predicate_id = 'event-person-name');

INSERT INTO content_type (content_type_id, description, has_table)
SELECT 'DOCUMENT', 'Document', 'N'
WHERE NOT EXISTS (SELECT 1 FROM content_type WHERE content_type_id = 'DOCUMENT' AND description = 'Document' AND has_table = 'N');

INSERT INTO content_type (content_type_id, description, has_table)
SELECT 'TEMPLATE', 'Template or Form', 'N'
WHERE NOT EXISTS (SELECT 1 FROM content_type WHERE content_type_id = 'TEMPLATE' AND description = 'Template or Form' AND has_table = 'N');

INSERT INTO content_type (content_type_id, description, has_table, parent_type_id)
SELECT 'DECORATOR', 'Decorator', 'N', 'TEMPLATE'
WHERE NOT EXISTS (SELECT 1 FROM content_type WHERE content_type_id = 'DECORATOR' AND description = 'Decorator' AND has_table = 'N' AND parent_type_id = 'TEMPLATE');

INSERT INTO content_type (content_type_id, description, has_table)
SELECT 'ANNOTATION', 'Annotation', 'N'
WHERE NOT EXISTS (SELECT 1 FROM content_type WHERE content_type_id = 'ANNOTATION' AND description = 'Annotation' AND has_table = 'N');

INSERT INTO content_type (content_type_id, description, has_table)
SELECT 'MENU_CONTAINER', 'Menu Container', 'N'
WHERE NOT EXISTS (SELECT 1 FROM content_type WHERE content_type_id = 'MENU_CONTAINER' AND description = 'Menu Container' AND has_table = 'N');

INSERT INTO content_type (content_type_id, description, has_table, parent_type_id)
SELECT 'OUTLINE_NODE', 'Outline Node', 'N', 'DOCUMENT'
WHERE NOT EXISTS (SELECT 1 FROM content_type WHERE content_type_id = 'OUTLINE_NODE' AND description = 'Outline Node' AND has_table = 'N' AND parent_type_id = 'DOCUMENT');

INSERT INTO content_type (content_type_id, description, has_table, parent_type_id)
SELECT 'PAGE_NODE', 'Page Node', 'N', 'DOCUMENT'
WHERE NOT EXISTS (SELECT 1 FROM content_type WHERE content_type_id = 'PAGE_NODE' AND description = 'Page Node' AND has_table = 'N' AND parent_type_id = 'DOCUMENT');

INSERT INTO content_type (content_type_id, description, has_table, parent_type_id)
SELECT 'SUBPAGE_NODE', 'Sub Page Node', 'N', 'DOCUMENT'
WHERE NOT EXISTS (SELECT 1 FROM content_type WHERE content_type_id = 'SUBPAGE_NODE' AND description = 'Sub Page Node' AND has_table = 'N' AND parent_type_id = 'DOCUMENT');

INSERT INTO content_type (content_type_id, description, has_table)
SELECT 'CONTENT_LIST', 'Content List', 'N'
WHERE NOT EXISTS (SELECT 1 FROM content_type WHERE content_type_id = 'CONTENT_LIST' AND description = 'Content List' AND has_table = 'N');

INSERT INTO content_type (content_type_id, description, has_table)
SELECT 'TREE_ROOT', 'Tree Root', 'N'
WHERE NOT EXISTS (SELECT 1 FROM content_type WHERE content_type_id = 'TREE_ROOT' AND description = 'Tree Root' AND has_table = 'N');

INSERT INTO content_type (content_type_id, description, has_table)
SELECT 'GRAPH_ROOT', 'Graph Root', 'N'
WHERE NOT EXISTS (SELECT 1 FROM content_type WHERE content_type_id = 'GRAPH_ROOT' AND description = 'Graph Root' AND has_table = 'N');

INSERT INTO content_type (content_type_id, description, has_table)
SELECT 'STRUCTURE_NODE', 'Structure Node', 'N'
WHERE NOT EXISTS (SELECT 1 FROM content_type WHERE content_type_id = 'STRUCTURE_NODE' AND description = 'Structure Node' AND has_table = 'N');

INSERT INTO content_type (content_type_id, description, has_table)
SELECT 'STRUCTURE_LEAF', 'Structure Leaf', 'N'
WHERE NOT EXISTS (SELECT 1 FROM content_type WHERE content_type_id = 'STRUCTURE_LEAF' AND description = 'Structure Leaf' AND has_table = 'N');

INSERT INTO content_type (content_type_id, description, has_table)
SELECT 'STRUCTURE_DEF', 'Structure Definition (like DTD)', 'N'
WHERE NOT EXISTS (SELECT 1 FROM content_type WHERE content_type_id = 'STRUCTURE_DEF' AND description = 'Structure Definition (like DTD)' AND has_table = 'N');

INSERT INTO content_type (content_type_id, description, has_table)
SELECT 'TXFORM_DEF', 'Transformation Definition (like XSLT)', 'N'
WHERE NOT EXISTS (SELECT 1 FROM content_type WHERE content_type_id = 'TXFORM_DEF' AND description = 'Transformation Definition (like XSLT)' AND has_table = 'N');

INSERT INTO content_type (content_type_id, description)
SELECT 'PLACEHOLDER', 'Place Holder'
WHERE NOT EXISTS (SELECT 1 FROM content_type WHERE content_type_id = 'PLACEHOLDER' AND description = 'Place Holder');

INSERT INTO content_type (content_type_id, description, has_table, parent_type_id)
SELECT 'WEB_SITE_PUB_PT', 'Web Site Publish Point', 'Y', 'PLACEHOLDER'
WHERE NOT EXISTS (SELECT 1 FROM content_type WHERE content_type_id = 'WEB_SITE_PUB_PT' AND description = 'Web Site Publish Point' AND has_table = 'Y' AND parent_type_id = 'PLACEHOLDER');

INSERT INTO content_type (content_type_id, description, has_table, parent_type_id)
SELECT 'FORUM_ROOT', 'Forum Root', 'N', 'PLACEHOLDER'
WHERE NOT EXISTS (SELECT 1 FROM content_type WHERE content_type_id = 'FORUM_ROOT' AND description = 'Forum Root' AND has_table = 'N' AND parent_type_id = 'PLACEHOLDER');

INSERT INTO content_type (content_type_id, description, has_table, parent_type_id)
SELECT 'BLOG_ROOT', 'Blog Root', 'N', 'PLACEHOLDER'
WHERE NOT EXISTS (SELECT 1 FROM content_type WHERE content_type_id = 'BLOG_ROOT' AND description = 'Blog Root' AND has_table = 'N' AND parent_type_id = 'PLACEHOLDER');

INSERT INTO content_type (content_type_id, description, has_table, parent_type_id)
SELECT 'FAQ_ROOT', 'FAQ Root', 'N', 'PLACEHOLDER'
WHERE NOT EXISTS (SELECT 1 FROM content_type WHERE content_type_id = 'FAQ_ROOT' AND description = 'FAQ Root' AND has_table = 'N' AND parent_type_id = 'PLACEHOLDER');

INSERT INTO content_type (content_type_id, description, parent_type_id)
SELECT 'DEPARTMENT', 'Department', 'PLACEHOLDER'
WHERE NOT EXISTS (SELECT 1 FROM content_type WHERE content_type_id = 'DEPARTMENT' AND description = 'Department' AND parent_type_id = 'PLACEHOLDER');

INSERT INTO content_type (content_type_id, description, parent_type_id)
SELECT 'PEOPLE', 'People', 'PLACEHOLDER'
WHERE NOT EXISTS (SELECT 1 FROM content_type WHERE content_type_id = 'PEOPLE' AND description = 'People' AND parent_type_id = 'PLACEHOLDER');

INSERT INTO content_type (content_type_id, description, parent_type_id)
SELECT 'PERSON', 'Person', 'PLACEHOLDER'
WHERE NOT EXISTS (SELECT 1 FROM content_type WHERE content_type_id = 'PERSON' AND description = 'Person' AND parent_type_id = 'PLACEHOLDER');

INSERT INTO content_type (content_type_id, description, parent_type_id)
SELECT 'TOPIC', 'Topic', 'PLACEHOLDER'
WHERE NOT EXISTS (SELECT 1 FROM content_type WHERE content_type_id = 'TOPIC' AND description = 'Topic' AND parent_type_id = 'PLACEHOLDER');

INSERT INTO data_resource_type (data_resource_type_id, description, has_table)
SELECT 'LOCAL_FILE', 'Local File', 'N'
WHERE NOT EXISTS (SELECT 1 FROM data_resource_type WHERE data_resource_type_id = 'LOCAL_FILE' AND description = 'Local File' AND has_table = 'N');

INSERT INTO data_resource_type (data_resource_type_id, description, has_table)
SELECT 'OFBIZ_FILE', 'File (rel to OFBIZ_HOME)', 'N'
WHERE NOT EXISTS (SELECT 1 FROM data_resource_type WHERE data_resource_type_id = 'OFBIZ_FILE' AND description = 'File (rel to OFBIZ_HOME)' AND has_table = 'N');

INSERT INTO data_resource_type (data_resource_type_id, description, has_table)
SELECT 'CONTEXT_FILE', 'File (rel to webapp root)', 'N'
WHERE NOT EXISTS (SELECT 1 FROM data_resource_type WHERE data_resource_type_id = 'CONTEXT_FILE' AND description = 'File (rel to webapp root)' AND has_table = 'N');

INSERT INTO data_resource_type (data_resource_type_id, description, has_table)
SELECT 'LOCAL_FILE_BIN', 'Local Binary File', 'N'
WHERE NOT EXISTS (SELECT 1 FROM data_resource_type WHERE data_resource_type_id = 'LOCAL_FILE_BIN' AND description = 'Local Binary File' AND has_table = 'N');

INSERT INTO data_resource_type (data_resource_type_id, description, has_table)
SELECT 'OFBIZ_FILE_BIN', 'Binary File (rel to OFBIZ_HOME)', 'N'
WHERE NOT EXISTS (SELECT 1 FROM data_resource_type WHERE data_resource_type_id = 'OFBIZ_FILE_BIN' AND description = 'Binary File (rel to OFBIZ_HOME)' AND has_table = 'N');

INSERT INTO data_resource_type (data_resource_type_id, description, has_table)
SELECT 'CONTEXT_FILE_BIN', 'Binary File (rel to webapp root)', 'N'
WHERE NOT EXISTS (SELECT 1 FROM data_resource_type WHERE data_resource_type_id = 'CONTEXT_FILE_BIN' AND description = 'Binary File (rel to webapp root)' AND has_table = 'N');

INSERT INTO data_resource_type (data_resource_type_id, description, has_table)
SELECT 'LINK', 'HyperLink', 'N'
WHERE NOT EXISTS (SELECT 1 FROM data_resource_type WHERE data_resource_type_id = 'LINK' AND description = 'HyperLink' AND has_table = 'N');

INSERT INTO data_resource_type (data_resource_type_id, description, has_table)
SELECT 'URL_RESOURCE', 'URL Resource', 'N'
WHERE NOT EXISTS (SELECT 1 FROM data_resource_type WHERE data_resource_type_id = 'URL_RESOURCE' AND description = 'URL Resource' AND has_table = 'N');

INSERT INTO data_resource_type (data_resource_type_id, description, has_table)
SELECT 'SHORT_TEXT', 'Short Text', 'N'
WHERE NOT EXISTS (SELECT 1 FROM data_resource_type WHERE data_resource_type_id = 'SHORT_TEXT' AND description = 'Short Text' AND has_table = 'N');

INSERT INTO data_resource_type (data_resource_type_id, description, has_table)
SELECT 'ELECTRONIC_TEXT', 'Long Text', 'Y'
WHERE NOT EXISTS (SELECT 1 FROM data_resource_type WHERE data_resource_type_id = 'ELECTRONIC_TEXT' AND description = 'Long Text' AND has_table = 'Y');

INSERT INTO data_resource_type (data_resource_type_id, description, has_table)
SELECT 'AUDIO_OBJECT', 'Audio', 'Y'
WHERE NOT EXISTS (SELECT 1 FROM data_resource_type WHERE data_resource_type_id = 'AUDIO_OBJECT' AND description = 'Audio' AND has_table = 'Y');

INSERT INTO data_resource_type (data_resource_type_id, description, has_table)
SELECT 'IMAGE_OBJECT', 'Image', 'Y'
WHERE NOT EXISTS (SELECT 1 FROM data_resource_type WHERE data_resource_type_id = 'IMAGE_OBJECT' AND description = 'Image' AND has_table = 'Y');

INSERT INTO data_resource_type (data_resource_type_id, description, has_table)
SELECT 'OTHER_OBJECT', 'Other', 'Y'
WHERE NOT EXISTS (SELECT 1 FROM data_resource_type WHERE data_resource_type_id = 'OTHER_OBJECT' AND description = 'Other' AND has_table = 'Y');

INSERT INTO data_resource_type (data_resource_type_id, description, has_table)
SELECT 'VIDEO_OBJECT', 'Video', 'Y'
WHERE NOT EXISTS (SELECT 1 FROM data_resource_type WHERE data_resource_type_id = 'VIDEO_OBJECT' AND description = 'Video' AND has_table = 'Y');

INSERT INTO data_resource_type (data_resource_type_id, description, has_table)
SELECT 'SURVEY', 'Survey', 'N'
WHERE NOT EXISTS (SELECT 1 FROM data_resource_type WHERE data_resource_type_id = 'SURVEY' AND description = 'Survey' AND has_table = 'N');

INSERT INTO data_resource_type (data_resource_type_id, description, has_table)
SELECT 'SURVEY_RESPONSE', 'Survey Response', 'N'
WHERE NOT EXISTS (SELECT 1 FROM data_resource_type WHERE data_resource_type_id = 'SURVEY_RESPONSE' AND description = 'Survey Response' AND has_table = 'N');

INSERT INTO data_template_type (data_template_type_id, description)
SELECT 'NONE', 'No Template'
WHERE NOT EXISTS (SELECT 1 FROM data_template_type WHERE data_template_type_id = 'NONE' AND description = 'No Template');

INSERT INTO data_template_type (data_template_type_id, description, extension)
SELECT 'FTL', 'FreeMarker', 'ftl'
WHERE NOT EXISTS (SELECT 1 FROM data_template_type WHERE data_template_type_id = 'FTL' AND description = 'FreeMarker' AND extension = 'ftl');

INSERT INTO data_template_type (data_template_type_id, description, extension)
SELECT 'WM', 'WebMacro', 'wm'
WHERE NOT EXISTS (SELECT 1 FROM data_template_type WHERE data_template_type_id = 'WM' AND description = 'WebMacro' AND extension = 'wm');

INSERT INTO data_template_type (data_template_type_id, description, extension)
SELECT 'XSLT', 'XSLT', 'xsl'
WHERE NOT EXISTS (SELECT 1 FROM data_template_type WHERE data_template_type_id = 'XSLT' AND description = 'XSLT' AND extension = 'xsl');

INSERT INTO data_template_type (data_template_type_id, description, extension)
SELECT 'SCREEN_COMBINED', 'Screen widget', 'xml'
WHERE NOT EXISTS (SELECT 1 FROM data_template_type WHERE data_template_type_id = 'SCREEN_COMBINED' AND description = 'Screen widget' AND extension = 'xml');

INSERT INTO document_type (description, document_type_id, has_table)
SELECT 'Shipping', 'SHIPPING_DOCUMENT', 'Y'
WHERE NOT EXISTS (SELECT 1 FROM document_type WHERE description = 'Shipping' AND document_type_id = 'SHIPPING_DOCUMENT' AND has_table = 'Y');

INSERT INTO document_type (description, document_type_id, has_table, parent_type_id)
SELECT 'Bill Of Lading', 'BILL_OF_LADING', 'N', 'SHIPPING_DOCUMENT'
WHERE NOT EXISTS (SELECT 1 FROM document_type WHERE description = 'Bill Of Lading' AND document_type_id = 'BILL_OF_LADING' AND has_table = 'N' AND parent_type_id = 'SHIPPING_DOCUMENT');

INSERT INTO document_type (description, document_type_id, has_table, parent_type_id)
SELECT 'Export', 'EXPORT_DOCUMENTATION', 'N', 'SHIPPING_DOCUMENT'
WHERE NOT EXISTS (SELECT 1 FROM document_type WHERE description = 'Export' AND document_type_id = 'EXPORT_DOCUMENTATION' AND has_table = 'N' AND parent_type_id = 'SHIPPING_DOCUMENT');

INSERT INTO document_type (description, document_type_id, has_table, parent_type_id)
SELECT 'Haz Mat', 'HAZ_MAT_DOCUMENT', 'N', 'SHIPPING_DOCUMENT'
WHERE NOT EXISTS (SELECT 1 FROM document_type WHERE description = 'Haz Mat' AND document_type_id = 'HAZ_MAT_DOCUMENT' AND has_table = 'N' AND parent_type_id = 'SHIPPING_DOCUMENT');

INSERT INTO document_type (description, document_type_id, has_table, parent_type_id)
SELECT 'Manifest', 'MANIFEST', 'N', 'SHIPPING_DOCUMENT'
WHERE NOT EXISTS (SELECT 1 FROM document_type WHERE description = 'Manifest' AND document_type_id = 'MANIFEST' AND has_table = 'N' AND parent_type_id = 'SHIPPING_DOCUMENT');

INSERT INTO document_type (description, document_type_id, has_table, parent_type_id)
SELECT 'Other Shipping', 'OTHER_SHIP_DOCUMENT', 'N', 'SHIPPING_DOCUMENT'
WHERE NOT EXISTS (SELECT 1 FROM document_type WHERE description = 'Other Shipping' AND document_type_id = 'OTHER_SHIP_DOCUMENT' AND has_table = 'N' AND parent_type_id = 'SHIPPING_DOCUMENT');

INSERT INTO document_type (description, document_type_id, has_table, parent_type_id)
SELECT 'Packing Slip', 'PACKAGING_SLIP', 'N', 'SHIPPING_DOCUMENT'
WHERE NOT EXISTS (SELECT 1 FROM document_type WHERE description = 'Packing Slip' AND document_type_id = 'PACKAGING_SLIP' AND has_table = 'N' AND parent_type_id = 'SHIPPING_DOCUMENT');

INSERT INTO document_type (description, document_type_id, has_table, parent_type_id)
SELECT 'Port Charge', 'PORT_CHARGE_DOCUMENT', 'N', 'SHIPPING_DOCUMENT'
WHERE NOT EXISTS (SELECT 1 FROM document_type WHERE description = 'Port Charge' AND document_type_id = 'PORT_CHARGE_DOCUMENT' AND has_table = 'N' AND parent_type_id = 'SHIPPING_DOCUMENT');

INSERT INTO document_type (description, document_type_id, has_table, parent_type_id)
SELECT 'Tax Tariff', 'TAX_TARIFF_DOCUMENT', 'N', 'SHIPPING_DOCUMENT'
WHERE NOT EXISTS (SELECT 1 FROM document_type WHERE description = 'Tax Tariff' AND document_type_id = 'TAX_TARIFF_DOCUMENT' AND has_table = 'N' AND parent_type_id = 'SHIPPING_DOCUMENT');

INSERT INTO web_site_content_type (description, has_table, web_site_content_type_id)
SELECT 'Blog Root', 'N', 'BLOG_ROOT'
WHERE NOT EXISTS (SELECT 1 FROM web_site_content_type WHERE description = 'Blog Root' AND has_table = 'N' AND web_site_content_type_id = 'BLOG_ROOT');

INSERT INTO web_site_content_type (description, has_table, web_site_content_type_id)
SELECT 'Default Page', 'N', 'DEFAULT_PAGE'
WHERE NOT EXISTS (SELECT 1 FROM web_site_content_type WHERE description = 'Default Page' AND has_table = 'N' AND web_site_content_type_id = 'DEFAULT_PAGE');

INSERT INTO web_site_content_type (description, has_table, web_site_content_type_id)
SELECT 'Forum Root', 'N', 'FORUM_ROOT'
WHERE NOT EXISTS (SELECT 1 FROM web_site_content_type WHERE description = 'Forum Root' AND has_table = 'N' AND web_site_content_type_id = 'FORUM_ROOT');

INSERT INTO web_site_content_type (description, has_table, web_site_content_type_id)
SELECT 'Menu Containers', 'N', 'MENU_ROOT'
WHERE NOT EXISTS (SELECT 1 FROM web_site_content_type WHERE description = 'Menu Containers' AND has_table = 'N' AND web_site_content_type_id = 'MENU_ROOT');

INSERT INTO web_site_content_type (description, has_table, web_site_content_type_id)
SELECT 'Error Page Containers', 'N', 'ERROR_ROOT'
WHERE NOT EXISTS (SELECT 1 FROM web_site_content_type WHERE description = 'Error Page Containers' AND has_table = 'N' AND web_site_content_type_id = 'ERROR_ROOT');

INSERT INTO web_site_content_type (description, has_table, web_site_content_type_id)
SELECT 'Publish Point', 'N', 'PUBLISH_POINT'
WHERE NOT EXISTS (SELECT 1 FROM web_site_content_type WHERE description = 'Publish Point' AND has_table = 'N' AND web_site_content_type_id = 'PUBLISH_POINT');

INSERT INTO web_site_content_type (description, has_table, web_site_content_type_id)
SELECT 'Web Page', 'N', 'WEB_PAGE'
WHERE NOT EXISTS (SELECT 1 FROM web_site_content_type WHERE description = 'Web Page' AND has_table = 'N' AND web_site_content_type_id = 'WEB_PAGE');

INSERT INTO web_site_content_type (description, has_table, web_site_content_type_id)
SELECT 'Maintenance Page', 'N', 'MAINTENANCE_PAGE'
WHERE NOT EXISTS (SELECT 1 FROM web_site_content_type WHERE description = 'Maintenance Page' AND has_table = 'N' AND web_site_content_type_id = 'MAINTENANCE_PAGE');

INSERT INTO content (content_id, content_type_id, description)
SELECT 'TEMPLATE_MASTER', 'TREE_ROOT', 'Template Master'
WHERE NOT EXISTS (SELECT 1 FROM content WHERE content_id = 'TEMPLATE_MASTER' AND content_type_id = 'TREE_ROOT' AND description = 'Template Master');

INSERT INTO survey_appl_type (description, survey_appl_type_id)
SELECT 'Add-To Cart', 'CART_ADD'
WHERE NOT EXISTS (SELECT 1 FROM survey_appl_type WHERE description = 'Add-To Cart' AND survey_appl_type_id = 'CART_ADD');

INSERT INTO survey_appl_type (description, survey_appl_type_id)
SELECT 'Check-Out', 'CHECK_OUT'
WHERE NOT EXISTS (SELECT 1 FROM survey_appl_type WHERE description = 'Check-Out' AND survey_appl_type_id = 'CHECK_OUT');

INSERT INTO survey_appl_type (description, survey_appl_type_id)
SELECT 'General Poll', 'GENERAL_POLL'
WHERE NOT EXISTS (SELECT 1 FROM survey_appl_type WHERE description = 'General Poll' AND survey_appl_type_id = 'GENERAL_POLL');

INSERT INTO survey_appl_type (description, survey_appl_type_id)
SELECT 'Random Poll', 'RANDOM_POLL'
WHERE NOT EXISTS (SELECT 1 FROM survey_appl_type WHERE description = 'Random Poll' AND survey_appl_type_id = 'RANDOM_POLL');

INSERT INTO survey_appl_type (description, survey_appl_type_id)
SELECT 'Customer Profile', 'CUSTOMER_PROFILE'
WHERE NOT EXISTS (SELECT 1 FROM survey_appl_type WHERE description = 'Customer Profile' AND survey_appl_type_id = 'CUSTOMER_PROFILE');

INSERT INTO survey_appl_type (description, survey_appl_type_id)
SELECT 'Sales Order Placement', 'SORDER_PLACE'
WHERE NOT EXISTS (SELECT 1 FROM survey_appl_type WHERE description = 'Sales Order Placement' AND survey_appl_type_id = 'SORDER_PLACE');

INSERT INTO survey_appl_type (description, survey_appl_type_id)
SELECT 'Purchase Order Placement', 'PORDER_PLACE'
WHERE NOT EXISTS (SELECT 1 FROM survey_appl_type WHERE description = 'Purchase Order Placement' AND survey_appl_type_id = 'PORDER_PLACE');

INSERT INTO survey_appl_type (description, survey_appl_type_id)
SELECT 'Purchase Order Item Placement', 'PORDITM_PLACE'
WHERE NOT EXISTS (SELECT 1 FROM survey_appl_type WHERE description = 'Purchase Order Item Placement' AND survey_appl_type_id = 'PORDITM_PLACE');

INSERT INTO survey_question_type (description, survey_question_type_id)
SELECT 'Boolean (Yes/No)', 'BOOLEAN'
WHERE NOT EXISTS (SELECT 1 FROM survey_question_type WHERE description = 'Boolean (Yes/No)' AND survey_question_type_id = 'BOOLEAN');

INSERT INTO survey_question_type (description, survey_question_type_id)
SELECT 'Content Record', 'CONTENT'
WHERE NOT EXISTS (SELECT 1 FROM survey_question_type WHERE description = 'Content Record' AND survey_question_type_id = 'CONTENT');

INSERT INTO survey_question_type (description, survey_question_type_id)
SELECT 'Country', 'COUNTRY'
WHERE NOT EXISTS (SELECT 1 FROM survey_question_type WHERE description = 'Country' AND survey_question_type_id = 'COUNTRY');

INSERT INTO survey_question_type (description, survey_question_type_id)
SELECT 'Credit Card Number', 'CREDIT_CARD'
WHERE NOT EXISTS (SELECT 1 FROM survey_question_type WHERE description = 'Credit Card Number' AND survey_question_type_id = 'CREDIT_CARD');

INSERT INTO survey_question_type (description, survey_question_type_id)
SELECT 'Geo List', 'GEO'
WHERE NOT EXISTS (SELECT 1 FROM survey_question_type WHERE description = 'Geo List' AND survey_question_type_id = 'GEO');

INSERT INTO survey_question_type (description, survey_question_type_id)
SELECT 'Gift Card Number', 'GIFT_CARD'
WHERE NOT EXISTS (SELECT 1 FROM survey_question_type WHERE description = 'Gift Card Number' AND survey_question_type_id = 'GIFT_CARD');

INSERT INTO survey_question_type (description, survey_question_type_id)
SELECT 'Date String (mm/dd/yyyy)', 'DATE'
WHERE NOT EXISTS (SELECT 1 FROM survey_question_type WHERE description = 'Date String (mm/dd/yyyy)' AND survey_question_type_id = 'DATE');

INSERT INTO survey_question_type (description, survey_question_type_id)
SELECT 'Email Address', 'EMAIL'
WHERE NOT EXISTS (SELECT 1 FROM survey_question_type WHERE description = 'Email Address' AND survey_question_type_id = 'EMAIL');

INSERT INTO survey_question_type (description, survey_question_type_id)
SELECT 'Enumeration', 'ENUMERATION'
WHERE NOT EXISTS (SELECT 1 FROM survey_question_type WHERE description = 'Enumeration' AND survey_question_type_id = 'ENUMERATION');

INSERT INTO survey_question_type (description, survey_question_type_id)
SELECT 'Numeric (Currency)', 'NUMBER_CURRENCY'
WHERE NOT EXISTS (SELECT 1 FROM survey_question_type WHERE description = 'Numeric (Currency)' AND survey_question_type_id = 'NUMBER_CURRENCY');

INSERT INTO survey_question_type (description, survey_question_type_id)
SELECT 'Numeric (Float)', 'NUMBER_FLOAT'
WHERE NOT EXISTS (SELECT 1 FROM survey_question_type WHERE description = 'Numeric (Float)' AND survey_question_type_id = 'NUMBER_FLOAT');

INSERT INTO survey_question_type (description, survey_question_type_id)
SELECT 'Numeric (Long)', 'NUMBER_LONG'
WHERE NOT EXISTS (SELECT 1 FROM survey_question_type WHERE description = 'Numeric (Long)' AND survey_question_type_id = 'NUMBER_LONG');

INSERT INTO survey_question_type (description, survey_question_type_id)
SELECT 'Selected Option', 'OPTION'
WHERE NOT EXISTS (SELECT 1 FROM survey_question_type WHERE description = 'Selected Option' AND survey_question_type_id = 'OPTION');

INSERT INTO survey_question_type (description, survey_question_type_id)
SELECT 'Password', 'PASSWORD'
WHERE NOT EXISTS (SELECT 1 FROM survey_question_type WHERE description = 'Password' AND survey_question_type_id = 'PASSWORD');

INSERT INTO survey_question_type (description, survey_question_type_id)
SELECT 'Seperator Line', 'SEPERATOR_LINE'
WHERE NOT EXISTS (SELECT 1 FROM survey_question_type WHERE description = 'Seperator Line' AND survey_question_type_id = 'SEPERATOR_LINE');

INSERT INTO survey_question_type (description, survey_question_type_id)
SELECT 'Seperator Text', 'SEPERATOR_TEXT'
WHERE NOT EXISTS (SELECT 1 FROM survey_question_type WHERE description = 'Seperator Text' AND survey_question_type_id = 'SEPERATOR_TEXT');

INSERT INTO survey_question_type (description, survey_question_type_id)
SELECT 'State/Province', 'STATE_PROVINCE'
WHERE NOT EXISTS (SELECT 1 FROM survey_question_type WHERE description = 'State/Province' AND survey_question_type_id = 'STATE_PROVINCE');

INSERT INTO survey_question_type (description, survey_question_type_id)
SELECT 'Short Text (single-line)', 'TEXT_SHORT'
WHERE NOT EXISTS (SELECT 1 FROM survey_question_type WHERE description = 'Short Text (single-line)' AND survey_question_type_id = 'TEXT_SHORT');

INSERT INTO survey_question_type (description, survey_question_type_id)
SELECT 'Long Text (single-line)', 'TEXT_LONG'
WHERE NOT EXISTS (SELECT 1 FROM survey_question_type WHERE description = 'Long Text (single-line)' AND survey_question_type_id = 'TEXT_LONG');

INSERT INTO survey_question_type (description, survey_question_type_id)
SELECT 'Text (multi-line)', 'TEXTAREA'
WHERE NOT EXISTS (SELECT 1 FROM survey_question_type WHERE description = 'Text (multi-line)' AND survey_question_type_id = 'TEXTAREA');

INSERT INTO survey_question_type (description, survey_question_type_id)
SELECT 'URL', 'URL'
WHERE NOT EXISTS (SELECT 1 FROM survey_question_type WHERE description = 'URL' AND survey_question_type_id = 'URL');

INSERT INTO data_resource (data_resource_id, data_resource_name, data_resource_type_id, data_template_type_id, mime_type_id)
SELECT 'STDWRAP001', 'Standard SubContent Wrapper', 'ELECTRONIC_TEXT', 'FTL', 'text/html'
WHERE NOT EXISTS (SELECT 1 FROM data_resource WHERE data_resource_id = 'STDWRAP001' AND data_resource_name = 'Standard SubContent Wrapper' AND data_resource_type_id = 'ELECTRONIC_TEXT' AND data_template_type_id = 'FTL' AND mime_type_id = 'text/html');

INSERT INTO electronic_text (data_resource_id)
SELECT 'STDWRAP001'
WHERE NOT EXISTS (SELECT 1 FROM electronic_text WHERE data_resource_id = 'STDWRAP001');

INSERT INTO content (content_id, content_name, content_type_id, data_resource_id, description, mime_type_id)
SELECT 'STDWRAP001', 'Standard SubContent Wrapper', 'DOCUMENT', 'STDWRAP001', 'Standard SubContent Wrapper', 'text/html'
WHERE NOT EXISTS (SELECT 1 FROM content WHERE content_id = 'STDWRAP001' AND content_name = 'Standard SubContent Wrapper' AND content_type_id = 'DOCUMENT' AND data_resource_id = 'STDWRAP001' AND description = 'Standard SubContent Wrapper' AND mime_type_id = 'text/html');

INSERT INTO web_analytics_type (description, has_table, web_analytics_type_id)
SELECT 'Web Analytics', 'N', 'WEB_ANALYTICS'
WHERE NOT EXISTS (SELECT 1 FROM web_analytics_type WHERE description = 'Web Analytics' AND has_table = 'N' AND web_analytics_type_id = 'WEB_ANALYTICS');

INSERT INTO web_analytics_type (description, has_table, parent_type_id, web_analytics_type_id)
SELECT 'Google Analytics', 'N', 'WEB_ANALYTICS', 'GOOGLE_ANALYTICS'
WHERE NOT EXISTS (SELECT 1 FROM web_analytics_type WHERE description = 'Google Analytics' AND has_table = 'N' AND parent_type_id = 'WEB_ANALYTICS' AND web_analytics_type_id = 'GOOGLE_ANALYTICS');

INSERT INTO web_analytics_type (description, has_table, parent_type_id, web_analytics_type_id)
SELECT 'Bing Analytics', 'N', 'WEB_ANALYTICS', 'BING_ANALYTICS'
WHERE NOT EXISTS (SELECT 1 FROM web_analytics_type WHERE description = 'Bing Analytics' AND has_table = 'N' AND parent_type_id = 'WEB_ANALYTICS' AND web_analytics_type_id = 'BING_ANALYTICS');

INSERT INTO web_analytics_type (description, has_table, parent_type_id, web_analytics_type_id)
SELECT 'Backend Analytics', 'N', 'WEB_ANALYTICS', 'BACKEND_ANALYTICS'
WHERE NOT EXISTS (SELECT 1 FROM web_analytics_type WHERE description = 'Backend Analytics' AND has_table = 'N' AND parent_type_id = 'WEB_ANALYTICS' AND web_analytics_type_id = 'BACKEND_ANALYTICS');

INSERT INTO content_operation (content_operation_id, description)
SELECT 'CONTENT_ADMIN', 'Content Admin'
WHERE NOT EXISTS (SELECT 1 FROM content_operation WHERE content_operation_id = 'CONTENT_ADMIN' AND description = 'Content Admin');

INSERT INTO content_operation (content_operation_id, description)
SELECT 'CONTENT_CREATE', 'Content Create'
WHERE NOT EXISTS (SELECT 1 FROM content_operation WHERE content_operation_id = 'CONTENT_CREATE' AND description = 'Content Create');

INSERT INTO content_operation (content_operation_id, description)
SELECT 'CONTENT_UPDATE', 'Content Update'
WHERE NOT EXISTS (SELECT 1 FROM content_operation WHERE content_operation_id = 'CONTENT_UPDATE' AND description = 'Content Update');

INSERT INTO content_operation (content_operation_id, description)
SELECT 'CONTENT_DELETE', 'Content Delete'
WHERE NOT EXISTS (SELECT 1 FROM content_operation WHERE content_operation_id = 'CONTENT_DELETE' AND description = 'Content Delete');

INSERT INTO content_operation (content_operation_id, description)
SELECT 'CONTENT_VIEW', 'Content View'
WHERE NOT EXISTS (SELECT 1 FROM content_operation WHERE content_operation_id = 'CONTENT_VIEW' AND description = 'Content View');

INSERT INTO content_operation (content_operation_id, description)
SELECT 'CONTENT_PUBLISH', 'Content Publish'
WHERE NOT EXISTS (SELECT 1 FROM content_operation WHERE content_operation_id = 'CONTENT_PUBLISH' AND description = 'Content Publish');

INSERT INTO content_operation (content_operation_id, description)
SELECT 'CONTENT_RESPOND', 'Content Respond'
WHERE NOT EXISTS (SELECT 1 FROM content_operation WHERE content_operation_id = 'CONTENT_RESPOND' AND description = 'Content Respond');

INSERT INTO content_operation (content_operation_id, description)
SELECT 'CONTENT_PUBLISH_SELF', 'Content Publish'
WHERE NOT EXISTS (SELECT 1 FROM content_operation WHERE content_operation_id = 'CONTENT_PUBLISH_SELF' AND description = 'Content Publish');

INSERT INTO content_operation (content_operation_id, description)
SELECT '_NA_', 'Not Applicable'
WHERE NOT EXISTS (SELECT 1 FROM content_operation WHERE content_operation_id = '_NA_' AND description = 'Not Applicable');

INSERT INTO content_operation (content_operation_id, description)
SELECT 'HAS_OWNER_ROLE', 'Has User Role'
WHERE NOT EXISTS (SELECT 1 FROM content_operation WHERE content_operation_id = 'HAS_OWNER_ROLE' AND description = 'Has User Role');

INSERT INTO content_operation (content_operation_id, description)
SELECT 'HAS_USER_ROLE', 'Has User Role'
WHERE NOT EXISTS (SELECT 1 FROM content_operation WHERE content_operation_id = 'HAS_USER_ROLE' AND description = 'Has User Role');

INSERT INTO content_operation (content_operation_id, description)
SELECT 'HAS_AUTHOR_ROLE', 'Has Author Role'
WHERE NOT EXISTS (SELECT 1 FROM content_operation WHERE content_operation_id = 'HAS_AUTHOR_ROLE' AND description = 'Has Author Role');

INSERT INTO content_operation (content_operation_id, description)
SELECT 'HAS_EDITOR_ROLE', 'Has Editor Role'
WHERE NOT EXISTS (SELECT 1 FROM content_operation WHERE content_operation_id = 'HAS_EDITOR_ROLE' AND description = 'Has Editor Role');

INSERT INTO content_operation (content_operation_id, description)
SELECT 'HAS_ADMIN_ROLE', 'Has Admin Role'
WHERE NOT EXISTS (SELECT 1 FROM content_operation WHERE content_operation_id = 'HAS_ADMIN_ROLE' AND description = 'Has Admin Role');

INSERT INTO content_operation (content_operation_id, description)
SELECT 'HAS_PUBLISHER_ROLE', 'Has Publisher Role'
WHERE NOT EXISTS (SELECT 1 FROM content_operation WHERE content_operation_id = 'HAS_PUBLISHER_ROLE' AND description = 'Has Publisher Role');

INSERT INTO content_operation (content_operation_id, description)
SELECT 'CONTENT_CREATE_SUB', 'Create SubContent'
WHERE NOT EXISTS (SELECT 1 FROM content_operation WHERE content_operation_id = 'CONTENT_CREATE_SUB' AND description = 'Create SubContent');

INSERT INTO content_operation (content_operation_id, description)
SELECT 'CONTENT_VIEW_SHORT', 'View Short Desc'
WHERE NOT EXISTS (SELECT 1 FROM content_operation WHERE content_operation_id = 'CONTENT_VIEW_SHORT' AND description = 'View Short Desc');

INSERT INTO content_operation (content_operation_id, description)
SELECT 'CHILD_CREATE', 'Child Create'
WHERE NOT EXISTS (SELECT 1 FROM content_operation WHERE content_operation_id = 'CHILD_CREATE' AND description = 'Child Create');

INSERT INTO content_operation (content_operation_id, description)
SELECT 'CHILD_UPDATE', 'Child Update'
WHERE NOT EXISTS (SELECT 1 FROM content_operation WHERE content_operation_id = 'CHILD_UPDATE' AND description = 'Child Update');

INSERT INTO content_operation (content_operation_id, description)
SELECT 'CHILD_DELETE', 'Child Delete'
WHERE NOT EXISTS (SELECT 1 FROM content_operation WHERE content_operation_id = 'CHILD_DELETE' AND description = 'Child Delete');

INSERT INTO content_operation (content_operation_id, description)
SELECT 'CHILD_VIEW', 'Child View'
WHERE NOT EXISTS (SELECT 1 FROM content_operation WHERE content_operation_id = 'CHILD_VIEW' AND description = 'Child View');

INSERT INTO content_operation (content_operation_id, description)
SELECT 'CONTENT_LINK', 'Content Link'
WHERE NOT EXISTS (SELECT 1 FROM content_operation WHERE content_operation_id = 'CONTENT_LINK' AND description = 'Content Link');

INSERT INTO content_operation (content_operation_id, description)
SELECT 'CONTENT_LINK_TO', 'Content Link To'
WHERE NOT EXISTS (SELECT 1 FROM content_operation WHERE content_operation_id = 'CONTENT_LINK_TO' AND description = 'Content Link To');

INSERT INTO content_operation (content_operation_id, description)
SELECT 'CONTENT_LINK_FROM', 'Content Link From'
WHERE NOT EXISTS (SELECT 1 FROM content_operation WHERE content_operation_id = 'CONTENT_LINK_FROM' AND description = 'Content Link From');

INSERT INTO content_purpose_type (content_purpose_type_id, description)
SELECT 'ARTICLE', 'Article'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_type WHERE content_purpose_type_id = 'ARTICLE' AND description = 'Article');

INSERT INTO content_purpose_type (content_purpose_type_id, description)
SELECT 'MESSAGE', 'Message'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_type WHERE content_purpose_type_id = 'MESSAGE' AND description = 'Message');

INSERT INTO content_purpose_type (content_purpose_type_id, description)
SELECT 'FEEDBACK', 'Feedback'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_type WHERE content_purpose_type_id = 'FEEDBACK' AND description = 'Feedback');

INSERT INTO content_purpose_type (content_purpose_type_id, description)
SELECT 'COMMENT', 'Comment'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_type WHERE content_purpose_type_id = 'COMMENT' AND description = 'Comment');

INSERT INTO content_purpose_type (content_purpose_type_id, description)
SELECT 'PRODUCT_INFO', 'Product Info'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_type WHERE content_purpose_type_id = 'PRODUCT_INFO' AND description = 'Product Info');

INSERT INTO content_purpose_type (content_purpose_type_id, description)
SELECT 'PROJECT_INFO', 'Project Info'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_type WHERE content_purpose_type_id = 'PROJECT_INFO' AND description = 'Project Info');

INSERT INTO content_purpose_type (content_purpose_type_id, description)
SELECT 'COMPANY_INFO', 'Company Info'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_type WHERE content_purpose_type_id = 'COMPANY_INFO' AND description = 'Company Info');

INSERT INTO content_purpose_type (content_purpose_type_id, description)
SELECT 'ADVERTISEMENT', 'Advertisement'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_type WHERE content_purpose_type_id = 'ADVERTISEMENT' AND description = 'Advertisement');

INSERT INTO content_purpose_type (content_purpose_type_id, description)
SELECT 'GENERAL_INFO', 'General Info'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_type WHERE content_purpose_type_id = 'GENERAL_INFO' AND description = 'General Info');

INSERT INTO content_purpose_type (content_purpose_type_id, description)
SELECT 'LEGAL_INFO', 'Legal Info'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_type WHERE content_purpose_type_id = 'LEGAL_INFO' AND description = 'Legal Info');

INSERT INTO content_purpose_type (content_purpose_type_id, description)
SELECT 'DESCRIPTION', 'Description'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_type WHERE content_purpose_type_id = 'DESCRIPTION' AND description = 'Description');

INSERT INTO content_purpose_type (content_purpose_type_id, description)
SELECT 'OWNER', 'Owner'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_type WHERE content_purpose_type_id = 'OWNER' AND description = 'Owner');

INSERT INTO content_purpose_type (content_purpose_type_id, description)
SELECT 'ARTICLE', 'Article'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_type WHERE content_purpose_type_id = 'ARTICLE' AND description = 'Article');

INSERT INTO content_purpose_type (content_purpose_type_id, description)
SELECT 'RESPONSE', 'Response'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_type WHERE content_purpose_type_id = 'RESPONSE' AND description = 'Response');

INSERT INTO content_purpose_type (content_purpose_type_id, description)
SELECT '_NA_', 'Not Applicable'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_type WHERE content_purpose_type_id = '_NA_' AND description = 'Not Applicable');

INSERT INTO content_purpose_type (content_purpose_type_id, description)
SELECT 'SECTION', 'Section'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_type WHERE content_purpose_type_id = 'SECTION' AND description = 'Section');

INSERT INTO content_purpose_type (content_purpose_type_id, description)
SELECT 'TOPIC', 'Topic'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_type WHERE content_purpose_type_id = 'TOPIC' AND description = 'Topic');

INSERT INTO content_purpose_type (content_purpose_type_id, description)
SELECT 'SUMMARY', 'Summary'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_type WHERE content_purpose_type_id = 'SUMMARY' AND description = 'Summary');

INSERT INTO content_purpose_type (content_purpose_type_id, description)
SELECT 'MAIN_ARTICLE', 'Main Content'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_type WHERE content_purpose_type_id = 'MAIN_ARTICLE' AND description = 'Main Content');

INSERT INTO content_purpose_type (content_purpose_type_id, description)
SELECT 'SUB_ARTICLE', 'Sub Content'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_type WHERE content_purpose_type_id = 'SUB_ARTICLE' AND description = 'Sub Content');

INSERT INTO content_purpose_type (content_purpose_type_id, description)
SELECT 'USER', 'User'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_type WHERE content_purpose_type_id = 'USER' AND description = 'User');

INSERT INTO content_purpose_type (content_purpose_type_id, description)
SELECT 'FAQ', 'FAQ'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_type WHERE content_purpose_type_id = 'FAQ' AND description = 'FAQ');

INSERT INTO content_purpose_type (content_purpose_type_id, description)
SELECT 'SOURCE', 'General Source'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_type WHERE content_purpose_type_id = 'SOURCE' AND description = 'General Source');

INSERT INTO content_purpose_type (content_purpose_type_id, description)
SELECT 'LANDING_PAGE_IMAGE', 'Landing Page Image'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_type WHERE content_purpose_type_id = 'LANDING_PAGE_IMAGE' AND description = 'Landing Page Image');

INSERT INTO content_purpose_operation (content_operation_id, content_purpose_type_id, privilege_enum_id, role_type_id, status_id)
SELECT 'CONTENT_CREATE', 'ARTICLE', 'CNT_PRV_NA_', 'CONTENT_AUTHOR', 'CTNT_PUBLISHED'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_operation WHERE content_operation_id = 'CONTENT_CREATE' AND content_purpose_type_id = 'ARTICLE' AND privilege_enum_id = 'CNT_PRV_NA_' AND role_type_id = 'CONTENT_AUTHOR' AND status_id = 'CTNT_PUBLISHED');

INSERT INTO content_purpose_operation (content_operation_id, content_purpose_type_id, privilege_enum_id, role_type_id, status_id)
SELECT 'CONTENT_CREATE', 'ARTICLE', 'CNT_PRV_NA_', 'CONTENT_AUTHOR', '_NA_'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_operation WHERE content_operation_id = 'CONTENT_CREATE' AND content_purpose_type_id = 'ARTICLE' AND privilege_enum_id = 'CNT_PRV_NA_' AND role_type_id = 'CONTENT_AUTHOR' AND status_id = '_NA_');

INSERT INTO content_purpose_operation (content_operation_id, content_purpose_type_id, privilege_enum_id, role_type_id, status_id)
SELECT 'CONTENT_CREATE', 'ARTICLE', 'CNT_PRV_NA_', 'CONTENT_EDITOR', '_NA_'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_operation WHERE content_operation_id = 'CONTENT_CREATE' AND content_purpose_type_id = 'ARTICLE' AND privilege_enum_id = 'CNT_PRV_NA_' AND role_type_id = 'CONTENT_EDITOR' AND status_id = '_NA_');

INSERT INTO content_purpose_operation (content_operation_id, content_purpose_type_id, privilege_enum_id, role_type_id, status_id)
SELECT 'CONTENT_CREATE_SUB', 'ARTICLE', 'CNT_PRV_NA_', 'OWNER', '_NA_'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_operation WHERE content_operation_id = 'CONTENT_CREATE_SUB' AND content_purpose_type_id = 'ARTICLE' AND privilege_enum_id = 'CNT_PRV_NA_' AND role_type_id = 'OWNER' AND status_id = '_NA_');

INSERT INTO content_purpose_operation (content_operation_id, content_purpose_type_id, privilege_enum_id, role_type_id, status_id)
SELECT 'CONTENT_UPDATE', 'ARTICLE', 'CNT_PRV_NA_', 'CONTENT_AUTHOR', '_NA_'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_operation WHERE content_operation_id = 'CONTENT_UPDATE' AND content_purpose_type_id = 'ARTICLE' AND privilege_enum_id = 'CNT_PRV_NA_' AND role_type_id = 'CONTENT_AUTHOR' AND status_id = '_NA_');

INSERT INTO content_purpose_operation (content_operation_id, content_purpose_type_id, privilege_enum_id, role_type_id, status_id)
SELECT 'CONTENT_UPDATE', 'ARTICLE', 'CNT_PRV_NA_', 'CONTENT_EDITOR', '_NA_'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_operation WHERE content_operation_id = 'CONTENT_UPDATE' AND content_purpose_type_id = 'ARTICLE' AND privilege_enum_id = 'CNT_PRV_NA_' AND role_type_id = 'CONTENT_EDITOR' AND status_id = '_NA_');

INSERT INTO content_purpose_operation (content_operation_id, content_purpose_type_id, privilege_enum_id, role_type_id, status_id)
SELECT 'CONTENT_UPDATE', 'ARTICLE', 'CNT_PRV_NA_', 'OWNER', 'CTNT_INITIAL_DRAFT'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_operation WHERE content_operation_id = 'CONTENT_UPDATE' AND content_purpose_type_id = 'ARTICLE' AND privilege_enum_id = 'CNT_PRV_NA_' AND role_type_id = 'OWNER' AND status_id = 'CTNT_INITIAL_DRAFT');

INSERT INTO content_purpose_operation (content_operation_id, content_purpose_type_id, privilege_enum_id, role_type_id, status_id)
SELECT 'CONTENT_PUBLISH', 'ARTICLE', 'CNT_PRV_NA_', 'CONTENT_EDITOR', '_NA_'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_operation WHERE content_operation_id = 'CONTENT_PUBLISH' AND content_purpose_type_id = 'ARTICLE' AND privilege_enum_id = 'CNT_PRV_NA_' AND role_type_id = 'CONTENT_EDITOR' AND status_id = '_NA_');

INSERT INTO content_purpose_operation (content_operation_id, content_purpose_type_id, privilege_enum_id, role_type_id, status_id)
SELECT 'CONTENT_PUBLISH', 'ARTICLE', 'CNT_PRV_NA_', 'CONTENT_PUBLISHER', 'CTNT_PUBLISHED'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_operation WHERE content_operation_id = 'CONTENT_PUBLISH' AND content_purpose_type_id = 'ARTICLE' AND privilege_enum_id = 'CNT_PRV_NA_' AND role_type_id = 'CONTENT_PUBLISHER' AND status_id = 'CTNT_PUBLISHED');

INSERT INTO content_purpose_operation (content_operation_id, content_purpose_type_id, privilege_enum_id, role_type_id, status_id)
SELECT 'CONTENT_PUBLISH', 'ARTICLE', 'CNT_PRV_NA_', 'OWNER', '_NA_'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_operation WHERE content_operation_id = 'CONTENT_PUBLISH' AND content_purpose_type_id = 'ARTICLE' AND privilege_enum_id = 'CNT_PRV_NA_' AND role_type_id = 'OWNER' AND status_id = '_NA_');

INSERT INTO content_purpose_operation (content_operation_id, content_purpose_type_id, privilege_enum_id, role_type_id, status_id)
SELECT 'CONTENT_PUBLISH_SELF', 'ARTICLE', 'CNT_PRV_NA_', 'CONTENT_AUTHOR', 'CTNT_PUBLISHED'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_operation WHERE content_operation_id = 'CONTENT_PUBLISH_SELF' AND content_purpose_type_id = 'ARTICLE' AND privilege_enum_id = 'CNT_PRV_NA_' AND role_type_id = 'CONTENT_AUTHOR' AND status_id = 'CTNT_PUBLISHED');

INSERT INTO content_purpose_operation (content_operation_id, content_purpose_type_id, privilege_enum_id, role_type_id, status_id)
SELECT 'CONTENT_RESPOND', 'ARTICLE', 'CNT_PRV_NA_', 'CONTENT_USER', 'CTNT_PUBLISHED'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_operation WHERE content_operation_id = 'CONTENT_RESPOND' AND content_purpose_type_id = 'ARTICLE' AND privilege_enum_id = 'CNT_PRV_NA_' AND role_type_id = 'CONTENT_USER' AND status_id = 'CTNT_PUBLISHED');

INSERT INTO content_purpose_operation (content_operation_id, content_purpose_type_id, privilege_enum_id, role_type_id, status_id)
SELECT 'CONTENT_VIEW', 'ARTICLE', 'CNT_PRV_NA_', 'CONTENT_AUTHOR', 'CTNT_PUBLISHED'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_operation WHERE content_operation_id = 'CONTENT_VIEW' AND content_purpose_type_id = 'ARTICLE' AND privilege_enum_id = 'CNT_PRV_NA_' AND role_type_id = 'CONTENT_AUTHOR' AND status_id = 'CTNT_PUBLISHED');

INSERT INTO content_purpose_operation (content_operation_id, content_purpose_type_id, privilege_enum_id, role_type_id, status_id)
SELECT 'CONTENT_VIEW', 'ARTICLE', 'CNT_PRV_NA_', 'CONTENT_EDITOR', '_NA_'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_operation WHERE content_operation_id = 'CONTENT_VIEW' AND content_purpose_type_id = 'ARTICLE' AND privilege_enum_id = 'CNT_PRV_NA_' AND role_type_id = 'CONTENT_EDITOR' AND status_id = '_NA_');

INSERT INTO content_purpose_operation (content_operation_id, content_purpose_type_id, privilege_enum_id, role_type_id, status_id)
SELECT 'CONTENT_VIEW', 'ARTICLE', 'CNT_PRV_NA_', 'OWNER', 'CTNT_INITIAL_DRAFT'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_operation WHERE content_operation_id = 'CONTENT_VIEW' AND content_purpose_type_id = 'ARTICLE' AND privilege_enum_id = 'CNT_PRV_NA_' AND role_type_id = 'OWNER' AND status_id = 'CTNT_INITIAL_DRAFT');

INSERT INTO content_purpose_operation (content_operation_id, content_purpose_type_id, privilege_enum_id, role_type_id, status_id)
SELECT 'CONTENT_LINK_FROM', 'ARTICLE', 'CNT_PRV_NA_', '_NA_', '_NA_'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_operation WHERE content_operation_id = 'CONTENT_LINK_FROM' AND content_purpose_type_id = 'ARTICLE' AND privilege_enum_id = 'CNT_PRV_NA_' AND role_type_id = '_NA_' AND status_id = '_NA_');

INSERT INTO content_purpose_operation (content_operation_id, content_purpose_type_id, privilege_enum_id, role_type_id, status_id)
SELECT 'CONTENT_LINK_TO', 'ARTICLE', 'CNT_PRV_NA_', '_NA_', '_NA_'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_operation WHERE content_operation_id = 'CONTENT_LINK_TO' AND content_purpose_type_id = 'ARTICLE' AND privilege_enum_id = 'CNT_PRV_NA_' AND role_type_id = '_NA_' AND status_id = '_NA_');

INSERT INTO content_purpose_operation (content_operation_id, content_purpose_type_id, privilege_enum_id, role_type_id, status_id)
SELECT 'CONTENT_CREATE', 'RESPONSE', 'CNT_PRV_NA_', 'CONTENT_EDITOR', '_NA_'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_operation WHERE content_operation_id = 'CONTENT_CREATE' AND content_purpose_type_id = 'RESPONSE' AND privilege_enum_id = 'CNT_PRV_NA_' AND role_type_id = 'CONTENT_EDITOR' AND status_id = '_NA_');

INSERT INTO content_purpose_operation (content_operation_id, content_purpose_type_id, privilege_enum_id, role_type_id, status_id)
SELECT 'CONTENT_UPDATE', 'RESPONSE', 'CNT_PRV_NA_', 'CONTENT_EDITOR', '_NA_'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_operation WHERE content_operation_id = 'CONTENT_UPDATE' AND content_purpose_type_id = 'RESPONSE' AND privilege_enum_id = 'CNT_PRV_NA_' AND role_type_id = 'CONTENT_EDITOR' AND status_id = '_NA_');

INSERT INTO content_purpose_operation (content_operation_id, content_purpose_type_id, privilege_enum_id, role_type_id, status_id)
SELECT 'CONTENT_UPDATE', 'RESPONSE', 'CNT_PRV_NA_', 'OWNER', '_NA_'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_operation WHERE content_operation_id = 'CONTENT_UPDATE' AND content_purpose_type_id = 'RESPONSE' AND privilege_enum_id = 'CNT_PRV_NA_' AND role_type_id = 'OWNER' AND status_id = '_NA_');

INSERT INTO content_purpose_operation (content_operation_id, content_purpose_type_id, privilege_enum_id, role_type_id, status_id)
SELECT 'CONTENT_PUBLISH', 'RESPONSE', 'CNT_PRV_NA_', 'CONTENT_PUBLISHER', 'CTNT_PUBLISHED'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_operation WHERE content_operation_id = 'CONTENT_PUBLISH' AND content_purpose_type_id = 'RESPONSE' AND privilege_enum_id = 'CNT_PRV_NA_' AND role_type_id = 'CONTENT_PUBLISHER' AND status_id = 'CTNT_PUBLISHED');

INSERT INTO content_purpose_operation (content_operation_id, content_purpose_type_id, privilege_enum_id, role_type_id, status_id)
SELECT 'CONTENT_PUBLISH', 'RESPONSE', 'CNT_PRV_NA_', 'CONTENT_USER', 'CTNT_PUBLISHED'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_operation WHERE content_operation_id = 'CONTENT_PUBLISH' AND content_purpose_type_id = 'RESPONSE' AND privilege_enum_id = 'CNT_PRV_NA_' AND role_type_id = 'CONTENT_USER' AND status_id = 'CTNT_PUBLISHED');

INSERT INTO content_purpose_operation (content_operation_id, content_purpose_type_id, privilege_enum_id, role_type_id, status_id)
SELECT 'CONTENT_RESPOND', 'RESPONSE', 'CNT_PRV_NA_', 'CONTENT_USER', 'CTNT_PUBLISHED'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_operation WHERE content_operation_id = 'CONTENT_RESPOND' AND content_purpose_type_id = 'RESPONSE' AND privilege_enum_id = 'CNT_PRV_NA_' AND role_type_id = 'CONTENT_USER' AND status_id = 'CTNT_PUBLISHED');

INSERT INTO content_purpose_operation (content_operation_id, content_purpose_type_id, privilege_enum_id, role_type_id, status_id)
SELECT 'CONTENT_LINK_FROM', 'RESPONSE', 'CNT_PRV_NA_', '_NA_', '_NA_'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_operation WHERE content_operation_id = 'CONTENT_LINK_FROM' AND content_purpose_type_id = 'RESPONSE' AND privilege_enum_id = 'CNT_PRV_NA_' AND role_type_id = '_NA_' AND status_id = '_NA_');

INSERT INTO content_purpose_operation (content_operation_id, content_purpose_type_id, privilege_enum_id, role_type_id, status_id)
SELECT 'CONTENT_LINK_TO', 'RESPONSE', 'CNT_PRV_NA_', '_NA_', '_NA_'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_operation WHERE content_operation_id = 'CONTENT_LINK_TO' AND content_purpose_type_id = 'RESPONSE' AND privilege_enum_id = 'CNT_PRV_NA_' AND role_type_id = '_NA_' AND status_id = '_NA_');

INSERT INTO content_purpose_operation (content_operation_id, content_purpose_type_id, privilege_enum_id, role_type_id, status_id)
SELECT 'CONTENT_UPDATE', 'SECTION', 'CNT_PRV_NA_', 'CONTENT_AUTHOR', '_NA_'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_operation WHERE content_operation_id = 'CONTENT_UPDATE' AND content_purpose_type_id = 'SECTION' AND privilege_enum_id = 'CNT_PRV_NA_' AND role_type_id = 'CONTENT_AUTHOR' AND status_id = '_NA_');

INSERT INTO content_purpose_operation (content_operation_id, content_purpose_type_id, privilege_enum_id, role_type_id, status_id)
SELECT 'CONTENT_UPDATE', 'SECTION', 'CNT_PRV_NA_', 'CONTENT_EDITOR', '_NA_'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_operation WHERE content_operation_id = 'CONTENT_UPDATE' AND content_purpose_type_id = 'SECTION' AND privilege_enum_id = 'CNT_PRV_NA_' AND role_type_id = 'CONTENT_EDITOR' AND status_id = '_NA_');

INSERT INTO content_purpose_operation (content_operation_id, content_purpose_type_id, privilege_enum_id, role_type_id, status_id)
SELECT 'CONTENT_UPDATE', 'SECTION', 'CNT_PRV_NA_', 'OWNER', 'CTNT_INITIAL_DRAFT'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_operation WHERE content_operation_id = 'CONTENT_UPDATE' AND content_purpose_type_id = 'SECTION' AND privilege_enum_id = 'CNT_PRV_NA_' AND role_type_id = 'OWNER' AND status_id = 'CTNT_INITIAL_DRAFT');

INSERT INTO content_purpose_operation (content_operation_id, content_purpose_type_id, privilege_enum_id, role_type_id, status_id)
SELECT 'CONTENT_PUBLISH', 'SECTION', 'CNT_PRV_NA_', 'CONTENT_EDITOR', '_NA_'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_operation WHERE content_operation_id = 'CONTENT_PUBLISH' AND content_purpose_type_id = 'SECTION' AND privilege_enum_id = 'CNT_PRV_NA_' AND role_type_id = 'CONTENT_EDITOR' AND status_id = '_NA_');

INSERT INTO content_purpose_operation (content_operation_id, content_purpose_type_id, privilege_enum_id, role_type_id, status_id)
SELECT 'CONTENT_PUBLISH', 'SECTION', 'CNT_PRV_NA_', 'CONTENT_PUBLISHER', 'CTNT_PUBLISHED'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_operation WHERE content_operation_id = 'CONTENT_PUBLISH' AND content_purpose_type_id = 'SECTION' AND privilege_enum_id = 'CNT_PRV_NA_' AND role_type_id = 'CONTENT_PUBLISHER' AND status_id = 'CTNT_PUBLISHED');

INSERT INTO content_purpose_operation (content_operation_id, content_purpose_type_id, privilege_enum_id, role_type_id, status_id)
SELECT 'CONTENT_PUBLISH', 'SECTION', 'CNT_PRV_NA_', 'OWNER', '_NA_'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_operation WHERE content_operation_id = 'CONTENT_PUBLISH' AND content_purpose_type_id = 'SECTION' AND privilege_enum_id = 'CNT_PRV_NA_' AND role_type_id = 'OWNER' AND status_id = '_NA_');

INSERT INTO content_purpose_operation (content_operation_id, content_purpose_type_id, privilege_enum_id, role_type_id, status_id)
SELECT 'CONTENT_VIEW', 'SECTION', 'CNT_PRV_NA_', 'CONTENT_AUTHOR', '_NA_'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_operation WHERE content_operation_id = 'CONTENT_VIEW' AND content_purpose_type_id = 'SECTION' AND privilege_enum_id = 'CNT_PRV_NA_' AND role_type_id = 'CONTENT_AUTHOR' AND status_id = '_NA_');

INSERT INTO content_purpose_operation (content_operation_id, content_purpose_type_id, privilege_enum_id, role_type_id, status_id)
SELECT 'CONTENT_VIEW', 'SECTION', 'CNT_PRV_NA_', 'CONTENT_EDITOR', '_NA_'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_operation WHERE content_operation_id = 'CONTENT_VIEW' AND content_purpose_type_id = 'SECTION' AND privilege_enum_id = 'CNT_PRV_NA_' AND role_type_id = 'CONTENT_EDITOR' AND status_id = '_NA_');

INSERT INTO content_purpose_operation (content_operation_id, content_purpose_type_id, privilege_enum_id, role_type_id, status_id)
SELECT 'CONTENT_VIEW', 'SECTION', 'CNT_PRV_NA_', 'OWNER', '_NA_'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_operation WHERE content_operation_id = 'CONTENT_VIEW' AND content_purpose_type_id = 'SECTION' AND privilege_enum_id = 'CNT_PRV_NA_' AND role_type_id = 'OWNER' AND status_id = '_NA_');

INSERT INTO content_purpose_operation (content_operation_id, content_purpose_type_id, privilege_enum_id, role_type_id, status_id)
SELECT 'CONTENT_VIEW', 'SECTION', 'CNT_PRV_NA_', '_NA_', 'CTNT_PUBLISHED'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_operation WHERE content_operation_id = 'CONTENT_VIEW' AND content_purpose_type_id = 'SECTION' AND privilege_enum_id = 'CNT_PRV_NA_' AND role_type_id = '_NA_' AND status_id = 'CTNT_PUBLISHED');

INSERT INTO content_purpose_operation (content_operation_id, content_purpose_type_id, privilege_enum_id, role_type_id, status_id)
SELECT 'CONTENT_UPDATE', 'USER', 'CNT_PRV_NA_', 'OWNER', '_NA_'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_operation WHERE content_operation_id = 'CONTENT_UPDATE' AND content_purpose_type_id = 'USER' AND privilege_enum_id = 'CNT_PRV_NA_' AND role_type_id = 'OWNER' AND status_id = '_NA_');

INSERT INTO content_purpose_operation (content_operation_id, content_purpose_type_id, privilege_enum_id, role_type_id, status_id)
SELECT 'HAS_OWNER_ROLE', '_NA_', 'CNT_PRV_NA_', 'OWNER', '_NA_'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_operation WHERE content_operation_id = 'HAS_OWNER_ROLE' AND content_purpose_type_id = '_NA_' AND privilege_enum_id = 'CNT_PRV_NA_' AND role_type_id = 'OWNER' AND status_id = '_NA_');

INSERT INTO content_purpose_operation (content_operation_id, content_purpose_type_id, privilege_enum_id, role_type_id, status_id)
SELECT 'HAS_USER_ROLE', '_NA_', 'CNT_PRV_NA_', 'CONTENT_USER', '_NA_'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_operation WHERE content_operation_id = 'HAS_USER_ROLE' AND content_purpose_type_id = '_NA_' AND privilege_enum_id = 'CNT_PRV_NA_' AND role_type_id = 'CONTENT_USER' AND status_id = '_NA_');

INSERT INTO content_purpose_operation (content_operation_id, content_purpose_type_id, privilege_enum_id, role_type_id, status_id)
SELECT 'HAS_AUTHOR_ROLE', '_NA_', 'CNT_PRV_NA_', 'CONTENT_AUTHOR', '_NA_'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_operation WHERE content_operation_id = 'HAS_AUTHOR_ROLE' AND content_purpose_type_id = '_NA_' AND privilege_enum_id = 'CNT_PRV_NA_' AND role_type_id = 'CONTENT_AUTHOR' AND status_id = '_NA_');

INSERT INTO content_purpose_operation (content_operation_id, content_purpose_type_id, privilege_enum_id, role_type_id, status_id)
SELECT 'HAS_EDITOR_ROLE', '_NA_', 'CNT_PRV_NA_', 'CONTENT_EDITOR', '_NA_'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_operation WHERE content_operation_id = 'HAS_EDITOR_ROLE' AND content_purpose_type_id = '_NA_' AND privilege_enum_id = 'CNT_PRV_NA_' AND role_type_id = 'CONTENT_EDITOR' AND status_id = '_NA_');

INSERT INTO content_purpose_operation (content_operation_id, content_purpose_type_id, privilege_enum_id, role_type_id, status_id)
SELECT 'HAS_ADMIN_ROLE', '_NA_', 'CNT_PRV_NA_', 'CONTENT_ADMIN', '_NA_'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_operation WHERE content_operation_id = 'HAS_ADMIN_ROLE' AND content_purpose_type_id = '_NA_' AND privilege_enum_id = 'CNT_PRV_NA_' AND role_type_id = 'CONTENT_ADMIN' AND status_id = '_NA_');

INSERT INTO content_purpose_operation (content_operation_id, content_purpose_type_id, privilege_enum_id, role_type_id, status_id)
SELECT 'HAS_PUBLISHER_ROLE', '_NA_', 'CNT_PRV_NA_', 'CONTENT_PUBLISHER', '_NA_'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_operation WHERE content_operation_id = 'HAS_PUBLISHER_ROLE' AND content_purpose_type_id = '_NA_' AND privilege_enum_id = 'CNT_PRV_NA_' AND role_type_id = 'CONTENT_PUBLISHER' AND status_id = '_NA_');

INSERT INTO content_purpose_operation (content_operation_id, content_purpose_type_id, privilege_enum_id, role_type_id, status_id)
SELECT 'CONTENT_PUBLISH', '_NA_', 'CNT_PRV_NA_', 'CONTENT_PUBLISHER', '_NA_'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_operation WHERE content_operation_id = 'CONTENT_PUBLISH' AND content_purpose_type_id = '_NA_' AND privilege_enum_id = 'CNT_PRV_NA_' AND role_type_id = 'CONTENT_PUBLISHER' AND status_id = '_NA_');

INSERT INTO content_purpose_operation (content_operation_id, content_purpose_type_id, privilege_enum_id, role_type_id, status_id)
SELECT 'CONTENT_VIEW', '_NA_', 'CNT_PRV_NA_', 'CONTENT_ADMIN', '_NA_'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_operation WHERE content_operation_id = 'CONTENT_VIEW' AND content_purpose_type_id = '_NA_' AND privilege_enum_id = 'CNT_PRV_NA_' AND role_type_id = 'CONTENT_ADMIN' AND status_id = '_NA_');

INSERT INTO content_purpose_operation (content_operation_id, content_purpose_type_id, privilege_enum_id, role_type_id, status_id)
SELECT 'CONTENT_VIEW', '_NA_', 'CNT_PRV_NA_', 'CONTENT_USER', 'CTNT_PUBLISHED'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_operation WHERE content_operation_id = 'CONTENT_VIEW' AND content_purpose_type_id = '_NA_' AND privilege_enum_id = 'CNT_PRV_NA_' AND role_type_id = 'CONTENT_USER' AND status_id = 'CTNT_PUBLISHED');

INSERT INTO content_purpose_operation (content_operation_id, content_purpose_type_id, privilege_enum_id, role_type_id, status_id)
SELECT 'CONTENT_LINK_TO', '_NA_', 'CNT_PRV_NA_', 'OWNER', '_NA_'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_operation WHERE content_operation_id = 'CONTENT_LINK_TO' AND content_purpose_type_id = '_NA_' AND privilege_enum_id = 'CNT_PRV_NA_' AND role_type_id = 'OWNER' AND status_id = '_NA_');

INSERT INTO content_purpose_operation (content_operation_id, content_purpose_type_id, privilege_enum_id, role_type_id, status_id)
SELECT 'CONTENT_LINK_FROM', '_NA_', 'CNT_PRV_NA_', 'OWNER', '_NA_'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_operation WHERE content_operation_id = 'CONTENT_LINK_FROM' AND content_purpose_type_id = '_NA_' AND privilege_enum_id = 'CNT_PRV_NA_' AND role_type_id = 'OWNER' AND status_id = '_NA_');

INSERT INTO content_purpose_operation (content_operation_id, content_purpose_type_id, privilege_enum_id, role_type_id, status_id)
SELECT 'CONTENT_LINK_TO', '_NA_', 'CNT_PRV_NA_', 'CONTENT_ADMIN', '_NA_'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_operation WHERE content_operation_id = 'CONTENT_LINK_TO' AND content_purpose_type_id = '_NA_' AND privilege_enum_id = 'CNT_PRV_NA_' AND role_type_id = 'CONTENT_ADMIN' AND status_id = '_NA_');

INSERT INTO content_purpose_operation (content_operation_id, content_purpose_type_id, privilege_enum_id, role_type_id, status_id)
SELECT 'CONTENT_LINK_FROM', '_NA_', 'CNT_PRV_NA_', 'CONTENT_ADMIN', '_NA_'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_operation WHERE content_operation_id = 'CONTENT_LINK_FROM' AND content_purpose_type_id = '_NA_' AND privilege_enum_id = 'CNT_PRV_NA_' AND role_type_id = 'CONTENT_ADMIN' AND status_id = '_NA_');

INSERT INTO content_purpose_operation (content_operation_id, content_purpose_type_id, privilege_enum_id, role_type_id, status_id)
SELECT '_NA_', '_NA_', 'CNT_PRV_NA_', 'CONTENT_ADMIN', '_NA_'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_operation WHERE content_operation_id = '_NA_' AND content_purpose_type_id = '_NA_' AND privilege_enum_id = 'CNT_PRV_NA_' AND role_type_id = 'CONTENT_ADMIN' AND status_id = '_NA_');

INSERT INTO character_set (character_set_id, description)
SELECT 'ISO-8859-1', 'ISO-8859-1 English'
WHERE NOT EXISTS (SELECT 1 FROM character_set WHERE character_set_id = 'ISO-8859-1' AND description = 'ISO-8859-1 English');

INSERT INTO character_set (character_set_id, description)
SELECT 'ISO-8859-2', 'ISO-8859-2 ?'
WHERE NOT EXISTS (SELECT 1 FROM character_set WHERE character_set_id = 'ISO-8859-2' AND description = 'ISO-8859-2 ?');

INSERT INTO character_set (character_set_id, description)
SELECT 'ISO-8859-3', 'ISO-8859-3 ?'
WHERE NOT EXISTS (SELECT 1 FROM character_set WHERE character_set_id = 'ISO-8859-3' AND description = 'ISO-8859-3 ?');

INSERT INTO character_set (character_set_id, description)
SELECT 'ISO-8859-4', 'ISO-8859-4 ?'
WHERE NOT EXISTS (SELECT 1 FROM character_set WHERE character_set_id = 'ISO-8859-4' AND description = 'ISO-8859-4 ?');

INSERT INTO character_set (character_set_id, description)
SELECT 'ISO-8859-5', 'ISO-8859-5 ?'
WHERE NOT EXISTS (SELECT 1 FROM character_set WHERE character_set_id = 'ISO-8859-5' AND description = 'ISO-8859-5 ?');

INSERT INTO character_set (character_set_id, description)
SELECT 'ISO-8859-6', 'ISO-8859-6 Latin/Arabic'
WHERE NOT EXISTS (SELECT 1 FROM character_set WHERE character_set_id = 'ISO-8859-6' AND description = 'ISO-8859-6 Latin/Arabic');

INSERT INTO character_set (character_set_id, description)
SELECT 'ISO-8859-7', 'ISO-8859-7 ?'
WHERE NOT EXISTS (SELECT 1 FROM character_set WHERE character_set_id = 'ISO-8859-7' AND description = 'ISO-8859-7 ?');

INSERT INTO character_set (character_set_id, description)
SELECT 'ISO-8859-8', 'ISO-8859-8 Latin/Hebrew'
WHERE NOT EXISTS (SELECT 1 FROM character_set WHERE character_set_id = 'ISO-8859-8' AND description = 'ISO-8859-8 Latin/Hebrew');

INSERT INTO character_set (character_set_id, description)
SELECT 'ISO-8859-9', 'ISO-8859-9 ?'
WHERE NOT EXISTS (SELECT 1 FROM character_set WHERE character_set_id = 'ISO-8859-9' AND description = 'ISO-8859-9 ?');

INSERT INTO character_set (character_set_id, description)
SELECT 'ISO-8859-10', 'ISO-8859-10 ?'
WHERE NOT EXISTS (SELECT 1 FROM character_set WHERE character_set_id = 'ISO-8859-10' AND description = 'ISO-8859-10 ?');

INSERT INTO character_set (character_set_id, description)
SELECT 'US-ASCII', 'US-ASCII as defined in ANSI X3.4-1986'
WHERE NOT EXISTS (SELECT 1 FROM character_set WHERE character_set_id = 'US-ASCII' AND description = 'US-ASCII as defined in ANSI X3.4-1986');

INSERT INTO character_set (character_set_id, description)
SELECT 'UTF-8', 'Unicode 8 bit'
WHERE NOT EXISTS (SELECT 1 FROM character_set WHERE character_set_id = 'UTF-8' AND description = 'Unicode 8 bit');

INSERT INTO character_set (character_set_id, description)
SELECT 'UTF-16', 'Unicode 16 bit'
WHERE NOT EXISTS (SELECT 1 FROM character_set WHERE character_set_id = 'UTF-16' AND description = 'Unicode 16 bit');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'Arbitrary Binary Data', 'application/octet-stream'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'Arbitrary Binary Data' AND mime_type_id = 'application/octet-stream');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'PKCS7 Signature', 'application/pkcs7-signature'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'PKCS7 Signature' AND mime_type_id = 'application/pkcs7-signature');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'Postsctipt Application/Script', 'application/postscript'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'Postsctipt Application/Script' AND mime_type_id = 'application/postscript');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'ZIP Data', 'application/zip'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'ZIP Data' AND mime_type_id = 'application/zip');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'Adobe Portable Document Format (PDF)', 'application/pdf'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'Adobe Portable Document Format (PDF)' AND mime_type_id = 'application/pdf');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'Microsoft Word', 'application/msword'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'Microsoft Word' AND mime_type_id = 'application/msword');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'Shockwave Flash Movie', 'application/x-shockwave-flash'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'Shockwave Flash Movie' AND mime_type_id = 'application/x-shockwave-flash');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'ZIP compressed file', 'application/x-zip-compressed'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'ZIP compressed file' AND mime_type_id = 'application/x-zip-compressed');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'Gzipped Tar archive file', 'application/x-tgz'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'Gzipped Tar archive file' AND mime_type_id = 'application/x-tgz');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'OpenOffice OpenDocument Text', 'application/vnd.oasis.opendocument.text'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'OpenOffice OpenDocument Text' AND mime_type_id = 'application/vnd.oasis.opendocument.text');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'OpenOffice OpenDocument Spreadsheet', 'application/vnd.oasis.opendocument.spreadsheet'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'OpenOffice OpenDocument Spreadsheet' AND mime_type_id = 'application/vnd.oasis.opendocument.spreadsheet');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'Survey', 'application/vnd.ofbiz.survey'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'Survey' AND mime_type_id = 'application/vnd.ofbiz.survey');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'Survey Response', 'application/vnd.ofbiz.survey.response'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'Survey Response' AND mime_type_id = 'application/vnd.ofbiz.survey.response');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'Microsoft PowerPoint', 'application/vnd.ms-powerpoint'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'Microsoft PowerPoint' AND mime_type_id = 'application/vnd.ms-powerpoint');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'Microsoft Excel', 'application/vnd.ms-excel'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'Microsoft Excel' AND mime_type_id = 'application/vnd.ms-excel');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'Basic Audio', 'audio/basic'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'Basic Audio' AND mime_type_id = 'audio/basic');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'MP3 Audio', 'audio/mpeg'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'MP3 Audio' AND mime_type_id = 'audio/mpeg');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'MP4 Audio', 'audio/mp4'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'MP4 Audio' AND mime_type_id = 'audio/mp4');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'WAX Audio', 'audio/x-ms-wax'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'WAX Audio' AND mime_type_id = 'audio/x-ms-wax');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'WAV Audio', 'audio/wav'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'WAV Audio' AND mime_type_id = 'audio/wav');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'OGG Audio', 'audio/ogg'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'OGG Audio' AND mime_type_id = 'audio/ogg');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'OGG Audio', 'audio/x-ogg'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'OGG Audio' AND mime_type_id = 'audio/x-ogg');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'Vorbis Audio', 'audio/vorbis'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'Vorbis Audio' AND mime_type_id = 'audio/vorbis');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'FLAC Audio', 'audio/x-flac'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'FLAC Audio' AND mime_type_id = 'audio/x-flac');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'FLAC Audio', 'audio/flac'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'FLAC Audio' AND mime_type_id = 'audio/flac');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'JPEG/JPG Image', 'image/jpeg'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'JPEG/JPG Image' AND mime_type_id = 'image/jpeg');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'Progressive JPEG/JPG Image', 'image/pjpeg'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'Progressive JPEG/JPG Image' AND mime_type_id = 'image/pjpeg');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'GIF Image', 'image/gif'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'GIF Image' AND mime_type_id = 'image/gif');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'TIFF Image', 'image/tiff'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'TIFF Image' AND mime_type_id = 'image/tiff');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'PNG Image', 'image/png'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'PNG Image' AND mime_type_id = 'image/png');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'Image SVG', 'image/svg+xml'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'Image SVG' AND mime_type_id = 'image/svg+xml');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'External Body Message', 'message/external-body'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'External Body Message' AND mime_type_id = 'message/external-body');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'HTTP Message', 'message/http'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'HTTP Message' AND mime_type_id = 'message/http');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'HTTPS/S-HTTP Message', 'message/s-http'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'HTTPS/S-HTTP Message' AND mime_type_id = 'message/s-http');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'News Message', 'message/news'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'News Message' AND mime_type_id = 'message/news');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'Partial Message', 'message/partial'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'Partial Message' AND mime_type_id = 'message/partial');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'RFC 822 Headered Message', 'message/rfc822'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'RFC 822 Headered Message' AND mime_type_id = 'message/rfc822');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'Mesh Model', 'model/mesh'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'Mesh Model' AND mime_type_id = 'model/mesh');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'VRML Model', 'model/vrml'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'VRML Model' AND mime_type_id = 'model/vrml');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'Mutliple Alternative Multipart', 'multipart/alternative'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'Mutliple Alternative Multipart' AND mime_type_id = 'multipart/alternative');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'Digest of Messages Multipart', 'multipart/digest'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'Digest of Messages Multipart' AND mime_type_id = 'multipart/digest');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'Encrypted Multipart', 'multipart/encrypted'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'Encrypted Multipart' AND mime_type_id = 'multipart/encrypted');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'Form Data Multipart', 'multipart/form-data'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'Form Data Multipart' AND mime_type_id = 'multipart/form-data');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'Mixed Type Multipart', 'multipart/mixed'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'Mixed Type Multipart' AND mime_type_id = 'multipart/mixed');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'Related Multipart', 'multipart/related'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'Related Multipart' AND mime_type_id = 'multipart/related');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'Signed Multipart', 'multipart/signed'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'Signed Multipart' AND mime_type_id = 'multipart/signed');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'CSS Text', 'text/css'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'CSS Text' AND mime_type_id = 'text/css');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'Comma Separated Value Text', 'text/csv'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'Comma Separated Value Text' AND mime_type_id = 'text/csv');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'Enriched Text', 'text/enriched'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'Enriched Text' AND mime_type_id = 'text/enriched');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'HTML Text', 'text/html'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'HTML Text' AND mime_type_id = 'text/html');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'Plain Text', 'text/plain'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'Plain Text' AND mime_type_id = 'text/plain');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'RTF Rich Text', 'text/rtf'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'RTF Rich Text' AND mime_type_id = 'text/rtf');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'Rich Text', 'text/richtext'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'Rich Text' AND mime_type_id = 'text/richtext');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'SGML Text', 'text/sgml'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'SGML Text' AND mime_type_id = 'text/sgml');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'Tab Separated Value Text', 'text/tab-separated-values'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'Tab Separated Value Text' AND mime_type_id = 'text/tab-separated-values');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'diff for patching files', 'text/x-diff'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'diff for patching files' AND mime_type_id = 'text/x-diff');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'XML Text', 'text/xml'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'XML Text' AND mime_type_id = 'text/xml');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'electronic business card', 'text/x-vcard'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'electronic business card' AND mime_type_id = 'text/x-vcard');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'AVI Video', 'video/avi'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'AVI Video' AND mime_type_id = 'video/avi');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'MPEG/MPG Video', 'video/mpeg'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'MPEG/MPG Video' AND mime_type_id = 'video/mpeg');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'MPEG-4 (H.264) Video', 'video/mp4'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'MPEG-4 (H.264) Video' AND mime_type_id = 'video/mp4');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'Quicktime Video', 'video/quicktime'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'Quicktime Video' AND mime_type_id = 'video/quicktime');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'ASF Video', 'video/x-ms-asf'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'ASF Video' AND mime_type_id = 'video/x-ms-asf');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'Flash Streaming Video', 'video/x-flv'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'Flash Streaming Video' AND mime_type_id = 'video/x-flv');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'WVX Video', 'video/x-ms-wvx'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'WVX Video' AND mime_type_id = 'video/x-ms-wvx');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'WM Video', 'video/x-ms-wm'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'WM Video' AND mime_type_id = 'video/x-ms-wm');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'WMV Video', 'video/x-ms-wmv'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'WMV Video' AND mime_type_id = 'video/x-ms-wmv');

INSERT INTO mime_type (description, mime_type_id)
SELECT 'WMX Video', 'video/x-ms-wmx'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = 'WMX Video' AND mime_type_id = 'video/x-ms-wmx');

INSERT INTO mime_type (description, mime_type_id)
SELECT '3GP Mobile Video', 'video/3gpp'
WHERE NOT EXISTS (SELECT 1 FROM mime_type WHERE description = '3GP Mobile Video' AND mime_type_id = 'video/3gpp');

INSERT INTO file_extension (file_extension_id, mime_type_id)
SELECT 'asf', 'video/x-ms-asf'
WHERE NOT EXISTS (SELECT 1 FROM file_extension WHERE file_extension_id = 'asf' AND mime_type_id = 'video/x-ms-asf');

INSERT INTO file_extension (file_extension_id, mime_type_id)
SELECT 'asx', 'video/x-ms-asf'
WHERE NOT EXISTS (SELECT 1 FROM file_extension WHERE file_extension_id = 'asx' AND mime_type_id = 'video/x-ms-asf');

INSERT INTO file_extension (file_extension_id, mime_type_id)
SELECT 'avi', 'video/avi'
WHERE NOT EXISTS (SELECT 1 FROM file_extension WHERE file_extension_id = 'avi' AND mime_type_id = 'video/avi');

INSERT INTO file_extension (file_extension_id, mime_type_id)
SELECT 'css', 'text/css'
WHERE NOT EXISTS (SELECT 1 FROM file_extension WHERE file_extension_id = 'css' AND mime_type_id = 'text/css');

INSERT INTO file_extension (file_extension_id, mime_type_id)
SELECT 'flv', 'video/x-flv'
WHERE NOT EXISTS (SELECT 1 FROM file_extension WHERE file_extension_id = 'flv' AND mime_type_id = 'video/x-flv');

INSERT INTO file_extension (file_extension_id, mime_type_id)
SELECT 'jpg', 'image/jpeg'
WHERE NOT EXISTS (SELECT 1 FROM file_extension WHERE file_extension_id = 'jpg' AND mime_type_id = 'image/jpeg');

INSERT INTO file_extension (file_extension_id, mime_type_id)
SELECT 'jpeg', 'image/jpeg'
WHERE NOT EXISTS (SELECT 1 FROM file_extension WHERE file_extension_id = 'jpeg' AND mime_type_id = 'image/jpeg');

INSERT INTO file_extension (file_extension_id, mime_type_id)
SELECT 'tif', 'image/tiff'
WHERE NOT EXISTS (SELECT 1 FROM file_extension WHERE file_extension_id = 'tif' AND mime_type_id = 'image/tiff');

INSERT INTO file_extension (file_extension_id, mime_type_id)
SELECT 'tiff', 'image/tiff'
WHERE NOT EXISTS (SELECT 1 FROM file_extension WHERE file_extension_id = 'tiff' AND mime_type_id = 'image/tiff');

INSERT INTO file_extension (file_extension_id, mime_type_id)
SELECT 'gif', 'image/gif'
WHERE NOT EXISTS (SELECT 1 FROM file_extension WHERE file_extension_id = 'gif' AND mime_type_id = 'image/gif');

INSERT INTO file_extension (file_extension_id, mime_type_id)
SELECT 'svg', 'image/svg+xml'
WHERE NOT EXISTS (SELECT 1 FROM file_extension WHERE file_extension_id = 'svg' AND mime_type_id = 'image/svg+xml');

INSERT INTO file_extension (file_extension_id, mime_type_id)
SELECT 'png', 'image/png'
WHERE NOT EXISTS (SELECT 1 FROM file_extension WHERE file_extension_id = 'png' AND mime_type_id = 'image/png');

INSERT INTO file_extension (file_extension_id, mime_type_id)
SELECT 'mp4', 'video/mp4'
WHERE NOT EXISTS (SELECT 1 FROM file_extension WHERE file_extension_id = 'mp4' AND mime_type_id = 'video/mp4');

INSERT INTO file_extension (file_extension_id, mime_type_id)
SELECT 'm4v', 'video/mp4'
WHERE NOT EXISTS (SELECT 1 FROM file_extension WHERE file_extension_id = 'm4v' AND mime_type_id = 'video/mp4');

INSERT INTO file_extension (file_extension_id, mime_type_id)
SELECT 'mpg', 'video/mpeg'
WHERE NOT EXISTS (SELECT 1 FROM file_extension WHERE file_extension_id = 'mpg' AND mime_type_id = 'video/mpeg');

INSERT INTO file_extension (file_extension_id, mime_type_id)
SELECT 'mpeg', 'video/mpeg'
WHERE NOT EXISTS (SELECT 1 FROM file_extension WHERE file_extension_id = 'mpeg' AND mime_type_id = 'video/mpeg');

INSERT INTO file_extension (file_extension_id, mime_type_id)
SELECT 'mov', 'video/quicktime'
WHERE NOT EXISTS (SELECT 1 FROM file_extension WHERE file_extension_id = 'mov' AND mime_type_id = 'video/quicktime');

INSERT INTO file_extension (file_extension_id, mime_type_id)
SELECT 'pdf', 'application/pdf'
WHERE NOT EXISTS (SELECT 1 FROM file_extension WHERE file_extension_id = 'pdf' AND mime_type_id = 'application/pdf');

INSERT INTO file_extension (file_extension_id, mime_type_id)
SELECT 'ps', 'application/postscript'
WHERE NOT EXISTS (SELECT 1 FROM file_extension WHERE file_extension_id = 'ps' AND mime_type_id = 'application/postscript');

INSERT INTO file_extension (file_extension_id, mime_type_id)
SELECT 'qt', 'video/quicktime'
WHERE NOT EXISTS (SELECT 1 FROM file_extension WHERE file_extension_id = 'qt' AND mime_type_id = 'video/quicktime');

INSERT INTO file_extension (file_extension_id, mime_type_id)
SELECT 'rtf', 'text/rtf'
WHERE NOT EXISTS (SELECT 1 FROM file_extension WHERE file_extension_id = 'rtf' AND mime_type_id = 'text/rtf');

INSERT INTO file_extension (file_extension_id, mime_type_id)
SELECT 'swf', 'application/x-shockwave-flash'
WHERE NOT EXISTS (SELECT 1 FROM file_extension WHERE file_extension_id = 'swf' AND mime_type_id = 'application/x-shockwave-flash');

INSERT INTO file_extension (file_extension_id, mime_type_id)
SELECT 'txt', 'text/plain'
WHERE NOT EXISTS (SELECT 1 FROM file_extension WHERE file_extension_id = 'txt' AND mime_type_id = 'text/plain');

INSERT INTO file_extension (file_extension_id, mime_type_id)
SELECT 'htm', 'text/html'
WHERE NOT EXISTS (SELECT 1 FROM file_extension WHERE file_extension_id = 'htm' AND mime_type_id = 'text/html');

INSERT INTO file_extension (file_extension_id, mime_type_id)
SELECT 'html', 'text/html'
WHERE NOT EXISTS (SELECT 1 FROM file_extension WHERE file_extension_id = 'html' AND mime_type_id = 'text/html');

INSERT INTO file_extension (file_extension_id, mime_type_id)
SELECT 'xml', 'text/xml'
WHERE NOT EXISTS (SELECT 1 FROM file_extension WHERE file_extension_id = 'xml' AND mime_type_id = 'text/xml');

INSERT INTO file_extension (file_extension_id, mime_type_id)
SELECT 'vrml', 'model/vrml'
WHERE NOT EXISTS (SELECT 1 FROM file_extension WHERE file_extension_id = 'vrml' AND mime_type_id = 'model/vrml');

INSERT INTO file_extension (file_extension_id, mime_type_id)
SELECT 'doc', 'application/msword'
WHERE NOT EXISTS (SELECT 1 FROM file_extension WHERE file_extension_id = 'doc' AND mime_type_id = 'application/msword');

INSERT INTO file_extension (file_extension_id, mime_type_id)
SELECT 'odt', 'application/vnd.oasis.opendocument.text'
WHERE NOT EXISTS (SELECT 1 FROM file_extension WHERE file_extension_id = 'odt' AND mime_type_id = 'application/vnd.oasis.opendocument.text');

INSERT INTO file_extension (file_extension_id, mime_type_id)
SELECT 'wvx', 'video/x-ms-wvx'
WHERE NOT EXISTS (SELECT 1 FROM file_extension WHERE file_extension_id = 'wvx' AND mime_type_id = 'video/x-ms-wvx');

INSERT INTO file_extension (file_extension_id, mime_type_id)
SELECT 'wm', 'video/x-ms-wm'
WHERE NOT EXISTS (SELECT 1 FROM file_extension WHERE file_extension_id = 'wm' AND mime_type_id = 'video/x-ms-wm');

INSERT INTO file_extension (file_extension_id, mime_type_id)
SELECT 'wmv', 'video/x-ms-wmv'
WHERE NOT EXISTS (SELECT 1 FROM file_extension WHERE file_extension_id = 'wmv' AND mime_type_id = 'video/x-ms-wmv');

INSERT INTO file_extension (file_extension_id, mime_type_id)
SELECT 'wmx', 'video/x-ms-wmx'
WHERE NOT EXISTS (SELECT 1 FROM file_extension WHERE file_extension_id = 'wmx' AND mime_type_id = 'video/x-ms-wmx');

INSERT INTO file_extension (file_extension_id, mime_type_id)
SELECT 'zip', 'application/zip'
WHERE NOT EXISTS (SELECT 1 FROM file_extension WHERE file_extension_id = 'zip' AND mime_type_id = 'application/zip');

INSERT INTO file_extension (file_extension_id, mime_type_id)
SELECT 'vcf', 'text/x-vcard'
WHERE NOT EXISTS (SELECT 1 FROM file_extension WHERE file_extension_id = 'vcf' AND mime_type_id = 'text/x-vcard');

INSERT INTO file_extension (file_extension_id, mime_type_id)
SELECT 'wav', 'audio/wav'
WHERE NOT EXISTS (SELECT 1 FROM file_extension WHERE file_extension_id = 'wav' AND mime_type_id = 'audio/wav');

INSERT INTO file_extension (file_extension_id, mime_type_id)
SELECT 'mpeg', 'audio/mpeg'
WHERE NOT EXISTS (SELECT 1 FROM file_extension WHERE file_extension_id = 'mpeg' AND mime_type_id = 'audio/mpeg');

INSERT INTO file_extension (file_extension_id, mime_type_id)
SELECT 'mp3', 'audio/mpeg'
WHERE NOT EXISTS (SELECT 1 FROM file_extension WHERE file_extension_id = 'mp3' AND mime_type_id = 'audio/mpeg');

INSERT INTO file_extension (file_extension_id, mime_type_id)
SELECT 'mp4', 'audio/mpeg'
WHERE NOT EXISTS (SELECT 1 FROM file_extension WHERE file_extension_id = 'mp4' AND mime_type_id = 'audio/mpeg');

INSERT INTO file_extension (file_extension_id, mime_type_id)
SELECT 'ogg', 'audio/ogg'
WHERE NOT EXISTS (SELECT 1 FROM file_extension WHERE file_extension_id = 'ogg' AND mime_type_id = 'audio/ogg');

INSERT INTO file_extension (file_extension_id, mime_type_id)
SELECT 'flac', 'audio/flac'
WHERE NOT EXISTS (SELECT 1 FROM file_extension WHERE file_extension_id = 'flac' AND mime_type_id = 'audio/flac');

INSERT INTO file_extension (file_extension_id, mime_type_id)
SELECT 'vorbis', 'audio/ogg'
WHERE NOT EXISTS (SELECT 1 FROM file_extension WHERE file_extension_id = 'vorbis' AND mime_type_id = 'audio/ogg');

INSERT INTO file_extension (file_extension_id, mime_type_id)
SELECT 'dflt', 'application/octet-stream'
WHERE NOT EXISTS (SELECT 1 FROM file_extension WHERE file_extension_id = 'dflt' AND mime_type_id = 'application/octet-stream');

INSERT INTO file_extension (file_extension_id, mime_type_id)
SELECT '3gp', 'video/3gpp'
WHERE NOT EXISTS (SELECT 1 FROM file_extension WHERE file_extension_id = '3gp' AND mime_type_id = 'video/3gpp');

INSERT INTO mime_type_html_template (mime_type_id, template_location)
SELECT 'application/x-shockwave-flash', 'component://content/template/mime-type/Flash-swf.ftl'
WHERE NOT EXISTS (SELECT 1 FROM mime_type_html_template WHERE mime_type_id = 'application/x-shockwave-flash' AND template_location = 'component://content/template/mime-type/Flash-swf.ftl');

INSERT INTO mime_type_html_template (mime_type_id, template_location)
SELECT 'image/jpeg', 'component://content/template/mime-type/Image.ftl'
WHERE NOT EXISTS (SELECT 1 FROM mime_type_html_template WHERE mime_type_id = 'image/jpeg' AND template_location = 'component://content/template/mime-type/Image.ftl');

INSERT INTO mime_type_html_template (mime_type_id, template_location)
SELECT 'image/pjpeg', 'component://content/template/mime-type/Image.ftl'
WHERE NOT EXISTS (SELECT 1 FROM mime_type_html_template WHERE mime_type_id = 'image/pjpeg' AND template_location = 'component://content/template/mime-type/Image.ftl');

INSERT INTO mime_type_html_template (mime_type_id, template_location)
SELECT 'image/gif', 'component://content/template/mime-type/Image.ftl'
WHERE NOT EXISTS (SELECT 1 FROM mime_type_html_template WHERE mime_type_id = 'image/gif' AND template_location = 'component://content/template/mime-type/Image.ftl');

INSERT INTO mime_type_html_template (mime_type_id, template_location)
SELECT 'image/tiff', 'component://content/template/mime-type/Image.ftl'
WHERE NOT EXISTS (SELECT 1 FROM mime_type_html_template WHERE mime_type_id = 'image/tiff' AND template_location = 'component://content/template/mime-type/Image.ftl');

INSERT INTO mime_type_html_template (mime_type_id, template_location)
SELECT 'image/png', 'component://content/template/mime-type/Image.ftl'
WHERE NOT EXISTS (SELECT 1 FROM mime_type_html_template WHERE mime_type_id = 'image/png' AND template_location = 'component://content/template/mime-type/Image.ftl');

INSERT INTO mime_type_html_template (mime_type_id, template_location)
SELECT 'video/quicktime', 'component://content/template/mime-type/QuickTime.ftl'
WHERE NOT EXISTS (SELECT 1 FROM mime_type_html_template WHERE mime_type_id = 'video/quicktime' AND template_location = 'component://content/template/mime-type/QuickTime.ftl');

INSERT INTO mime_type_html_template (mime_type_id, template_location)
SELECT 'video/mp4', 'component://content/template/mime-type/QuickTime.ftl'
WHERE NOT EXISTS (SELECT 1 FROM mime_type_html_template WHERE mime_type_id = 'video/mp4' AND template_location = 'component://content/template/mime-type/QuickTime.ftl');

INSERT INTO mime_type_html_template (mime_type_id, template_location)
SELECT 'video/x-flv', 'component://content/template/mime-type/Flash-flv.ftl'
WHERE NOT EXISTS (SELECT 1 FROM mime_type_html_template WHERE mime_type_id = 'video/x-flv' AND template_location = 'component://content/template/mime-type/Flash-flv.ftl');

INSERT INTO data_category (data_category_id)
SELECT 'ROOT'
WHERE NOT EXISTS (SELECT 1 FROM data_category WHERE data_category_id = 'ROOT');

INSERT INTO data_category (category_name, data_category_id, parent_category_id)
SELECT 'Business', 'BUSINESS', 'ROOT'
WHERE NOT EXISTS (SELECT 1 FROM data_category WHERE category_name = 'Business' AND data_category_id = 'BUSINESS' AND parent_category_id = 'ROOT');

INSERT INTO data_category (category_name, data_category_id, parent_category_id)
SELECT 'Technology', 'TECHNOLOGY', 'ROOT'
WHERE NOT EXISTS (SELECT 1 FROM data_category WHERE category_name = 'Technology' AND data_category_id = 'TECHNOLOGY' AND parent_category_id = 'ROOT');

INSERT INTO data_category (category_name, data_category_id, parent_category_id)
SELECT 'Personal', 'PERSONAL', 'ROOT'
WHERE NOT EXISTS (SELECT 1 FROM data_category WHERE category_name = 'Personal' AND data_category_id = 'PERSONAL' AND parent_category_id = 'ROOT');

INSERT INTO data_category (category_name, data_category_id, parent_category_id)
SELECT 'Legal', 'LEGAL', 'ROOT'
WHERE NOT EXISTS (SELECT 1 FROM data_category WHERE category_name = 'Legal' AND data_category_id = 'LEGAL' AND parent_category_id = 'ROOT');

INSERT INTO data_category (category_name, data_category_id, parent_category_id)
SELECT 'Political', 'POLITICAL', 'ROOT'
WHERE NOT EXISTS (SELECT 1 FROM data_category WHERE category_name = 'Political' AND data_category_id = 'POLITICAL' AND parent_category_id = 'ROOT');

INSERT INTO data_category (category_name, data_category_id, parent_category_id)
SELECT 'Financial', 'FINANCIAL', 'ROOT'
WHERE NOT EXISTS (SELECT 1 FROM data_category WHERE category_name = 'Financial' AND data_category_id = 'FINANCIAL' AND parent_category_id = 'ROOT');

INSERT INTO data_category (category_name, data_category_id, parent_category_id)
SELECT 'Retail', 'BUS_RETAIL', 'BUSINESS'
WHERE NOT EXISTS (SELECT 1 FROM data_category WHERE category_name = 'Retail' AND data_category_id = 'BUS_RETAIL' AND parent_category_id = 'BUSINESS');

INSERT INTO data_category (category_name, data_category_id, parent_category_id)
SELECT 'Service', 'BUS_SERVICE', 'BUSINESS'
WHERE NOT EXISTS (SELECT 1 FROM data_category WHERE category_name = 'Service' AND data_category_id = 'BUS_SERVICE' AND parent_category_id = 'BUSINESS');

INSERT INTO data_category (category_name, data_category_id, parent_category_id)
SELECT 'Manufacturing', 'BUS_MANU', 'BUSINESS'
WHERE NOT EXISTS (SELECT 1 FROM data_category WHERE category_name = 'Manufacturing' AND data_category_id = 'BUS_MANU' AND parent_category_id = 'BUSINESS');

INSERT INTO data_category (category_name, data_category_id, parent_category_id)
SELECT 'Software', 'TECH_SOFT', 'TECHNOLOGY'
WHERE NOT EXISTS (SELECT 1 FROM data_category WHERE category_name = 'Software' AND data_category_id = 'TECH_SOFT' AND parent_category_id = 'TECHNOLOGY');

INSERT INTO data_category (category_name, data_category_id, parent_category_id)
SELECT 'Apache OFBiz', 'TECH_SOFT_OFBIZ', 'TECH_SOFT'
WHERE NOT EXISTS (SELECT 1 FROM data_category WHERE category_name = 'Apache OFBiz' AND data_category_id = 'TECH_SOFT_OFBIZ' AND parent_category_id = 'TECH_SOFT');

INSERT INTO data_category (category_name, data_category_id, parent_category_id)
SELECT 'Linux', 'TECH_SOFT_LINUX', 'TECH_SOFT'
WHERE NOT EXISTS (SELECT 1 FROM data_category WHERE category_name = 'Linux' AND data_category_id = 'TECH_SOFT_LINUX' AND parent_category_id = 'TECH_SOFT');

INSERT INTO data_category (category_name, data_category_id, parent_category_id)
SELECT 'Java', 'TECH_SOFT_JAVA', 'TECH_SOFT'
WHERE NOT EXISTS (SELECT 1 FROM data_category WHERE category_name = 'Java' AND data_category_id = 'TECH_SOFT_JAVA' AND parent_category_id = 'TECH_SOFT');

INSERT INTO data_category (category_name, data_category_id, parent_category_id)
SELECT 'Hardware', 'TECH_HARD', 'TECHNOLOGY'
WHERE NOT EXISTS (SELECT 1 FROM data_category WHERE category_name = 'Hardware' AND data_category_id = 'TECH_HARD' AND parent_category_id = 'TECHNOLOGY');

INSERT INTO data_category (category_name, data_category_id, parent_category_id)
SELECT 'Service', 'TECH_SERV', 'TECHNOLOGY'
WHERE NOT EXISTS (SELECT 1 FROM data_category WHERE category_name = 'Service' AND data_category_id = 'TECH_SERV' AND parent_category_id = 'TECHNOLOGY');

INSERT INTO data_category (category_name, data_category_id, parent_category_id)
SELECT 'Template', 'TEMPLATE', 'ROOT'
WHERE NOT EXISTS (SELECT 1 FROM data_category WHERE category_name = 'Template' AND data_category_id = 'TEMPLATE' AND parent_category_id = 'ROOT');

INSERT INTO content (child_branch_count, child_leaf_count, content_id, content_name, content_type_id, description)
SELECT '1', '1', 'BLOGROOT', 'Blog Root', 'WEB_SITE_PUB_PT', 'Blog Root'
WHERE NOT EXISTS (SELECT 1 FROM content WHERE child_branch_count = '1' AND child_leaf_count = '1' AND content_id = 'BLOGROOT' AND content_name = 'Blog Root' AND content_type_id = 'WEB_SITE_PUB_PT' AND description = 'Blog Root');

INSERT INTO content_purpose_operation (content_operation_id, content_purpose_type_id, privilege_enum_id, role_type_id, status_id)
SELECT 'CONTENT_ADMIN', '_NA_', 'CNT_PRV_NA_', 'CONTENT_ADMIN', '_NA_'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_operation WHERE content_operation_id = 'CONTENT_ADMIN' AND content_purpose_type_id = '_NA_' AND privilege_enum_id = 'CNT_PRV_NA_' AND role_type_id = 'CONTENT_ADMIN' AND status_id = '_NA_');

INSERT INTO content_purpose_operation (content_operation_id, content_purpose_type_id, privilege_enum_id, role_type_id, status_id)
SELECT 'CONTENT_UPDATE', '_NA_', 'CNT_PRV_NA_', 'CONTENT_ADMIN', '_NA_'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_operation WHERE content_operation_id = 'CONTENT_UPDATE' AND content_purpose_type_id = '_NA_' AND privilege_enum_id = 'CNT_PRV_NA_' AND role_type_id = 'CONTENT_ADMIN' AND status_id = '_NA_');

INSERT INTO content_purpose_operation (content_operation_id, content_purpose_type_id, privilege_enum_id, role_type_id, status_id)
SELECT 'CONTENT_CREATE', 'RESPONSE', 'CNT_PRV_NA_', '_NA_', '_NA_'
WHERE NOT EXISTS (SELECT 1 FROM content_purpose_operation WHERE content_operation_id = 'CONTENT_CREATE' AND content_purpose_type_id = 'RESPONSE' AND privilege_enum_id = 'CNT_PRV_NA_' AND role_type_id = '_NA_' AND status_id = '_NA_');

INSERT INTO data_resource (created_date, data_resource_id, data_resource_name, data_resource_type_id, data_template_type_id, last_modified_date, mime_type_id, object_info)
SELECT '2004-01-16 01:24:06.522', 'BLOG_TPL_TOPLEFT', 'Float left', 'URL_RESOURCE', 'SCREEN_COMBINED', '2004-01-16 19:20:58.891', 'text/html', 'component://ecommerce/widget/blog/BlogTemplates.xml#FloatLeft'
WHERE NOT EXISTS (SELECT 1 FROM data_resource WHERE created_date = '2004-01-16 01:24:06.522' AND data_resource_id = 'BLOG_TPL_TOPLEFT' AND data_resource_name = 'Float left' AND data_resource_type_id = 'URL_RESOURCE' AND data_template_type_id = 'SCREEN_COMBINED' AND last_modified_date = '2004-01-16 19:20:58.891' AND mime_type_id = 'text/html' AND object_info = 'component://ecommerce/widget/blog/BlogTemplates.xml#FloatLeft');

INSERT INTO data_resource (created_date, data_resource_id, data_resource_name, data_resource_type_id, data_template_type_id, last_modified_date, mime_type_id, object_info)
SELECT '2004-01-16 01:24:06.522', 'BLOG_TPL_TOPCENTER', 'Top centered', 'URL_RESOURCE', 'SCREEN_COMBINED', '2004-01-16 19:20:58.891', 'text/html', 'component://ecommerce/widget/blog/BlogTemplates.xml#TopCenter'
WHERE NOT EXISTS (SELECT 1 FROM data_resource WHERE created_date = '2004-01-16 01:24:06.522' AND data_resource_id = 'BLOG_TPL_TOPCENTER' AND data_resource_name = 'Top centered' AND data_resource_type_id = 'URL_RESOURCE' AND data_template_type_id = 'SCREEN_COMBINED' AND last_modified_date = '2004-01-16 19:20:58.891' AND mime_type_id = 'text/html' AND object_info = 'component://ecommerce/widget/blog/BlogTemplates.xml#TopCenter');

INSERT INTO data_resource (created_date, data_category_id, data_resource_id, data_resource_name, data_resource_type_id, data_template_type_id, last_modified_date, mime_type_id, object_info)
SELECT '2004-01-16 01:24:06.522', 'TEMPLATE', 'ECOM_BLANK', 'Plain Decorator', 'URL_RESOURCE', 'SCREEN_COMBINED', '2004-01-16 19:20:58.891', 'text/html', 'component://ecommerce/widget/CommonScreens.xml#CommonEmptyDecorator'
WHERE NOT EXISTS (SELECT 1 FROM data_resource WHERE created_date = '2004-01-16 01:24:06.522' AND data_category_id = 'TEMPLATE' AND data_resource_id = 'ECOM_BLANK' AND data_resource_name = 'Plain Decorator' AND data_resource_type_id = 'URL_RESOURCE' AND data_template_type_id = 'SCREEN_COMBINED' AND last_modified_date = '2004-01-16 19:20:58.891' AND mime_type_id = 'text/html' AND object_info = 'component://ecommerce/widget/CommonScreens.xml#CommonEmptyDecorator');

INSERT INTO data_resource (created_date, data_category_id, data_resource_id, data_resource_name, data_resource_type_id, data_template_type_id, last_modified_date, mime_type_id, object_info)
SELECT '2004-01-16 01:24:06.522', 'TEMPLATE', 'ECOM_LEFT', 'Left Decorator', 'URL_RESOURCE', 'SCREEN_COMBINED', '2004-01-16 19:20:58.891', 'text/html', 'component://ecommerce/widget/CommonScreens.xml#CommonLeftDecorator'
WHERE NOT EXISTS (SELECT 1 FROM data_resource WHERE created_date = '2004-01-16 01:24:06.522' AND data_category_id = 'TEMPLATE' AND data_resource_id = 'ECOM_LEFT' AND data_resource_name = 'Left Decorator' AND data_resource_type_id = 'URL_RESOURCE' AND data_template_type_id = 'SCREEN_COMBINED' AND last_modified_date = '2004-01-16 19:20:58.891' AND mime_type_id = 'text/html' AND object_info = 'component://ecommerce/widget/CommonScreens.xml#CommonLeftDecorator');

INSERT INTO data_resource (created_date, data_category_id, data_resource_id, data_resource_name, data_resource_type_id, data_template_type_id, last_modified_date, mime_type_id, object_info)
SELECT '2004-01-16 01:24:06.522', 'TEMPLATE', 'ECOM_RIGHT', 'Right Decorator', 'URL_RESOURCE', 'SCREEN_COMBINED', '2004-01-16 19:20:58.891', 'text/html', 'component://ecommerce/widget/CommonScreens.xml#CommonRightDecorator'
WHERE NOT EXISTS (SELECT 1 FROM data_resource WHERE created_date = '2004-01-16 01:24:06.522' AND data_category_id = 'TEMPLATE' AND data_resource_id = 'ECOM_RIGHT' AND data_resource_name = 'Right Decorator' AND data_resource_type_id = 'URL_RESOURCE' AND data_template_type_id = 'SCREEN_COMBINED' AND last_modified_date = '2004-01-16 19:20:58.891' AND mime_type_id = 'text/html' AND object_info = 'component://ecommerce/widget/CommonScreens.xml#CommonRightDecorator');

INSERT INTO data_resource (created_date, data_category_id, data_resource_id, data_resource_name, data_resource_type_id, data_template_type_id, last_modified_date, mime_type_id, object_info)
SELECT '2004-01-16 01:24:06.522', 'TEMPLATE', 'ECOM_LEFTRIGHT', 'Left/Right Decorator', 'URL_RESOURCE', 'SCREEN_COMBINED', '2004-01-16 19:20:58.891', 'text/html', 'component://ecommerce/widget/CommonScreens.xml#CommonLeftRightDecorator'
WHERE NOT EXISTS (SELECT 1 FROM data_resource WHERE created_date = '2004-01-16 01:24:06.522' AND data_category_id = 'TEMPLATE' AND data_resource_id = 'ECOM_LEFTRIGHT' AND data_resource_name = 'Left/Right Decorator' AND data_resource_type_id = 'URL_RESOURCE' AND data_template_type_id = 'SCREEN_COMBINED' AND last_modified_date = '2004-01-16 19:20:58.891' AND mime_type_id = 'text/html' AND object_info = 'component://ecommerce/widget/CommonScreens.xml#CommonLeftRightDecorator');

INSERT INTO data_resource (data_resource_id, data_resource_name, data_resource_type_id, data_template_type_id, mime_type_id)
SELECT 'WRAP_STD_LOOP', 'Loop Wrap', 'ELECTRONIC_TEXT', 'FTL', 'text/html'
WHERE NOT EXISTS (SELECT 1 FROM data_resource WHERE data_resource_id = 'WRAP_STD_LOOP' AND data_resource_name = 'Loop Wrap' AND data_resource_type_id = 'ELECTRONIC_TEXT' AND data_template_type_id = 'FTL' AND mime_type_id = 'text/html');

INSERT INTO data_resource (data_resource_id, data_resource_name, data_resource_type_id, data_template_type_id, object_info)
SELECT 'AFIBC_LOGO', 'SFIBC Logo', 'IMAGE_OBJECT', 'NONE', 'sfibc_logo.png'
WHERE NOT EXISTS (SELECT 1 FROM data_resource WHERE data_resource_id = 'AFIBC_LOGO' AND data_resource_name = 'SFIBC Logo' AND data_resource_type_id = 'IMAGE_OBJECT' AND data_template_type_id = 'NONE' AND object_info = 'sfibc_logo.png');

INSERT INTO data_resource (data_resource_id, data_resource_name, data_resource_type_id, data_template_type_id, object_info)
SELECT 'AGEP_LOGO', 'AGEP Logo', 'IMAGE_OBJECT', 'NONE', 'agep_logo.png'
WHERE NOT EXISTS (SELECT 1 FROM data_resource WHERE data_resource_id = 'AGEP_LOGO' AND data_resource_name = 'AGEP Logo' AND data_resource_type_id = 'IMAGE_OBJECT' AND data_template_type_id = 'NONE' AND object_info = 'agep_logo.png');

INSERT INTO data_resource (data_resource_id, data_resource_name, data_resource_type_id, data_template_type_id, object_info)
SELECT 'AGINC_LOGO', 'AGINC Logo', 'IMAGE_OBJECT', 'NONE', 'aginc_logo.png'
WHERE NOT EXISTS (SELECT 1 FROM data_resource WHERE data_resource_id = 'AGINC_LOGO' AND data_resource_name = 'AGINC Logo' AND data_resource_type_id = 'IMAGE_OBJECT' AND data_template_type_id = 'NONE' AND object_info = 'aginc_logo.png');

INSERT INTO data_resource (data_resource_id, data_resource_type_id, data_template_type_id)
SELECT 'ARTICLE_WRAP', 'OFBIZ_FILE', 'FTL'
WHERE NOT EXISTS (SELECT 1 FROM data_resource WHERE data_resource_id = 'ARTICLE_WRAP' AND data_resource_type_id = 'OFBIZ_FILE' AND data_template_type_id = 'FTL');

INSERT INTO data_resource (data_resource_id, data_resource_name, data_resource_type_id, data_template_type_id, object_info)
SELECT 'LEFTBAR', 'Left Bar', 'ELECTRONIC_TEXT', 'FTL', 'LEFT BAR'
WHERE NOT EXISTS (SELECT 1 FROM data_resource WHERE data_resource_id = 'LEFTBAR' AND data_resource_name = 'Left Bar' AND data_resource_type_id = 'ELECTRONIC_TEXT' AND data_template_type_id = 'FTL' AND object_info = 'LEFT BAR');

INSERT INTO data_resource (data_resource_id, data_resource_name, data_resource_type_id, data_template_type_id, object_info)
SELECT 'RP_MEDAL', 'Project Reliance Medallion Logo', 'IMAGE_OBJECT', 'NONE', 'pr_medal.png'
WHERE NOT EXISTS (SELECT 1 FROM data_resource WHERE data_resource_id = 'RP_MEDAL' AND data_resource_name = 'Project Reliance Medallion Logo' AND data_resource_type_id = 'IMAGE_OBJECT' AND data_template_type_id = 'NONE' AND object_info = 'pr_medal.png');

INSERT INTO data_resource (data_resource_id, data_resource_name, data_resource_type_id, data_template_type_id, mime_type_id)
SELECT 'TMPLT_IMG_CENTER', 'Image Centered', 'ELECTRONIC_TEXT', 'FTL', 'text/html'
WHERE NOT EXISTS (SELECT 1 FROM data_resource WHERE data_resource_id = 'TMPLT_IMG_CENTER' AND data_resource_name = 'Image Centered' AND data_resource_type_id = 'ELECTRONIC_TEXT' AND data_template_type_id = 'FTL' AND mime_type_id = 'text/html');

INSERT INTO data_resource (data_resource_id, data_resource_name, data_resource_type_id, data_template_type_id, mime_type_id)
SELECT 'TEMPLATE_IMAGE_LEFT', 'Image Left', 'ELECTRONIC_TEXT', 'FTL', 'text/html'
WHERE NOT EXISTS (SELECT 1 FROM data_resource WHERE data_resource_id = 'TEMPLATE_IMAGE_LEFT' AND data_resource_name = 'Image Left' AND data_resource_type_id = 'ELECTRONIC_TEXT' AND data_template_type_id = 'FTL' AND mime_type_id = 'text/html');

INSERT INTO data_resource (data_resource_id, data_resource_name, data_resource_type_id, data_template_type_id, mime_type_id)
SELECT 'TEMPLATE_TEXT_ONLY', 'Template Text', 'ELECTRONIC_TEXT', 'FTL', 'text/html'
WHERE NOT EXISTS (SELECT 1 FROM data_resource WHERE data_resource_id = 'TEMPLATE_TEXT_ONLY' AND data_resource_name = 'Template Text' AND data_resource_type_id = 'ELECTRONIC_TEXT' AND data_template_type_id = 'FTL' AND mime_type_id = 'text/html');

INSERT INTO data_resource (data_resource_id, data_resource_type_id, data_template_type_id)
SELECT 'VIEW_WRAP', 'OFBIZ_FILE', 'FTL'
WHERE NOT EXISTS (SELECT 1 FROM data_resource WHERE data_resource_id = 'VIEW_WRAP' AND data_resource_type_id = 'OFBIZ_FILE' AND data_template_type_id = 'FTL');

INSERT INTO data_resource (data_resource_id, data_resource_type_id, data_template_type_id)
SELECT 'WRAP_ARTICLE', 'ELECTRONIC_TEXT', 'FTL'
WHERE NOT EXISTS (SELECT 1 FROM data_resource WHERE data_resource_id = 'WRAP_ARTICLE' AND data_resource_type_id = 'ELECTRONIC_TEXT' AND data_template_type_id = 'FTL');

INSERT INTO data_resource (data_resource_id, data_resource_name, data_resource_type_id, data_template_type_id)
SELECT 'WRAP_ARTICLE_TABLE', 'Article wrap with table elements', 'ELECTRONIC_TEXT', 'FTL'
WHERE NOT EXISTS (SELECT 1 FROM data_resource WHERE data_resource_id = 'WRAP_ARTICLE_TABLE' AND data_resource_name = 'Article wrap with table elements' AND data_resource_type_id = 'ELECTRONIC_TEXT' AND data_template_type_id = 'FTL');

INSERT INTO data_resource (data_resource_id, data_resource_name, data_resource_type_id, data_template_type_id)
SELECT 'WRAP_NEXT_PREV', 'Next/Prev wrapper', 'ELECTRONIC_TEXT', 'FTL'
WHERE NOT EXISTS (SELECT 1 FROM data_resource WHERE data_resource_id = 'WRAP_NEXT_PREV' AND data_resource_name = 'Next/Prev wrapper' AND data_resource_type_id = 'ELECTRONIC_TEXT' AND data_template_type_id = 'FTL');

INSERT INTO data_resource (data_resource_id, data_resource_name, data_resource_type_id, data_template_type_id, mime_type_id)
SELECT 'WRAP_STD_001', 'Standard SubContent Wrapper', 'ELECTRONIC_TEXT', 'FTL', 'text/html'
WHERE NOT EXISTS (SELECT 1 FROM data_resource WHERE data_resource_id = 'WRAP_STD_001' AND data_resource_name = 'Standard SubContent Wrapper' AND data_resource_type_id = 'ELECTRONIC_TEXT' AND data_template_type_id = 'FTL' AND mime_type_id = 'text/html');

INSERT INTO data_resource (data_resource_id, data_resource_type_id, data_template_type_id)
SELECT 'WRAP_VIEW', 'ELECTRONIC_TEXT', 'FTL'
WHERE NOT EXISTS (SELECT 1 FROM data_resource WHERE data_resource_id = 'WRAP_VIEW' AND data_resource_type_id = 'ELECTRONIC_TEXT' AND data_template_type_id = 'FTL');

INSERT INTO data_resource (data_resource_id, data_resource_name, data_resource_type_id, data_template_type_id, mime_type_id)
SELECT 'IMAGE_CENTERED', 'Image Centered', 'ELECTRONIC_TEXT', 'FTL', 'text/html'
WHERE NOT EXISTS (SELECT 1 FROM data_resource WHERE data_resource_id = 'IMAGE_CENTERED' AND data_resource_name = 'Image Centered' AND data_resource_type_id = 'ELECTRONIC_TEXT' AND data_template_type_id = 'FTL' AND mime_type_id = 'text/html');

INSERT INTO data_resource (data_resource_id, data_resource_name, data_resource_type_id, data_template_type_id, mime_type_id)
SELECT 'IMAGE_LEFT', 'Image Left', 'ELECTRONIC_TEXT', 'FTL', 'text/html'
WHERE NOT EXISTS (SELECT 1 FROM data_resource WHERE data_resource_id = 'IMAGE_LEFT' AND data_resource_name = 'Image Left' AND data_resource_type_id = 'ELECTRONIC_TEXT' AND data_template_type_id = 'FTL' AND mime_type_id = 'text/html');

INSERT INTO data_resource (data_resource_id, data_resource_name, data_resource_type_id, data_template_type_id, mime_type_id)
SELECT 'TEMPLATE_TEXT', 'Template Text', 'ELECTRONIC_TEXT', 'FTL', 'text/html'
WHERE NOT EXISTS (SELECT 1 FROM data_resource WHERE data_resource_id = 'TEMPLATE_TEXT' AND data_resource_name = 'Template Text' AND data_resource_type_id = 'ELECTRONIC_TEXT' AND data_template_type_id = 'FTL' AND mime_type_id = 'text/html');

INSERT INTO data_resource (data_resource_id, data_resource_name, data_resource_type_id, data_template_type_id, mime_type_id)
SELECT 'TMPLT_IMG_CENTER_FL', 'Image Centered', 'ELECTRONIC_TEXT', 'FTL', 'text/html'
WHERE NOT EXISTS (SELECT 1 FROM data_resource WHERE data_resource_id = 'TMPLT_IMG_CENTER_FL' AND data_resource_name = 'Image Centered' AND data_resource_type_id = 'ELECTRONIC_TEXT' AND data_template_type_id = 'FTL' AND mime_type_id = 'text/html');

INSERT INTO data_resource (data_resource_id, data_resource_type_id, data_template_type_id, object_info)
SELECT 'TEMPLATE_COMPOSITE', 'CONTEXT_FILE', 'FTL', '/content/TemplateComposite.ftl'
WHERE NOT EXISTS (SELECT 1 FROM data_resource WHERE data_resource_id = 'TEMPLATE_COMPOSITE' AND data_resource_type_id = 'CONTEXT_FILE' AND data_template_type_id = 'FTL' AND object_info = '/content/TemplateComposite.ftl');

INSERT INTO content (content_id, content_name, content_type_id, data_resource_id, description)
SELECT 'LEFTBAR', 'Left Bar', 'DOCUMENT', 'LEFTBAR', 'Left Bar'
WHERE NOT EXISTS (SELECT 1 FROM content WHERE content_id = 'LEFTBAR' AND content_name = 'Left Bar' AND content_type_id = 'DOCUMENT' AND data_resource_id = 'LEFTBAR' AND description = 'Left Bar');

INSERT INTO content (content_id, content_name, content_type_id)
SELECT 'OWNER_BLOG_CONTENT', 'Blog Content Owner', 'PLACEHOLDER'
WHERE NOT EXISTS (SELECT 1 FROM content WHERE content_id = 'OWNER_BLOG_CONTENT' AND content_name = 'Blog Content Owner' AND content_type_id = 'PLACEHOLDER');

INSERT INTO content (content_id, content_name, content_type_id, data_resource_id, description, mime_type_id)
SELECT 'TMPLT_IMG_CENTER', 'Image Centered', 'DOCUMENT', 'IMAGE_CENTERED', 'Image centered above text', 'text/html'
WHERE NOT EXISTS (SELECT 1 FROM content WHERE content_id = 'TMPLT_IMG_CENTER' AND content_name = 'Image Centered' AND content_type_id = 'DOCUMENT' AND data_resource_id = 'IMAGE_CENTERED' AND description = 'Image centered above text' AND mime_type_id = 'text/html');

INSERT INTO content (content_id, content_name, content_type_id, data_resource_id, description, mime_type_id)
SELECT 'TEMPLATE_IMAGE_LEFT', 'Image Left', 'DOCUMENT', 'IMAGE_LEFT', 'Image with text flowing around', 'text/html'
WHERE NOT EXISTS (SELECT 1 FROM content WHERE content_id = 'TEMPLATE_IMAGE_LEFT' AND content_name = 'Image Left' AND content_type_id = 'DOCUMENT' AND data_resource_id = 'IMAGE_LEFT' AND description = 'Image with text flowing around' AND mime_type_id = 'text/html');

INSERT INTO content (content_id, content_type_id, description)
SELECT 'TEMPLATE_MASTER', 'TREE_ROOT', 'Template Master'
WHERE NOT EXISTS (SELECT 1 FROM content WHERE content_id = 'TEMPLATE_MASTER' AND content_type_id = 'TREE_ROOT' AND description = 'Template Master');

INSERT INTO content (content_id, content_name, content_type_id, data_resource_id, description, mime_type_id)
SELECT 'TEMPLATE_TEXT_ONLY', 'Template Text', 'DOCUMENT', 'TEMPLATE_TEXT', 'Template Text Only', 'text/html'
WHERE NOT EXISTS (SELECT 1 FROM content WHERE content_id = 'TEMPLATE_TEXT_ONLY' AND content_name = 'Template Text' AND content_type_id = 'DOCUMENT' AND data_resource_id = 'TEMPLATE_TEXT' AND description = 'Template Text Only' AND mime_type_id = 'text/html');

INSERT INTO content (content_id, content_name, content_type_id, data_resource_id)
SELECT 'VIEW_WRAP', 'View Wrap', 'DOCUMENT', 'VIEW_WRAP'
WHERE NOT EXISTS (SELECT 1 FROM content WHERE content_id = 'VIEW_WRAP' AND content_name = 'View Wrap' AND content_type_id = 'DOCUMENT' AND data_resource_id = 'VIEW_WRAP');

INSERT INTO content (content_id, content_type_id, data_resource_id)
SELECT 'WRAP_ARTICLE', 'DOCUMENT', 'WRAP_ARTICLE'
WHERE NOT EXISTS (SELECT 1 FROM content WHERE content_id = 'WRAP_ARTICLE' AND content_type_id = 'DOCUMENT' AND data_resource_id = 'WRAP_ARTICLE');

INSERT INTO content (content_id, content_name, content_type_id, data_resource_id, description)
SELECT 'WRAP_NEXT_PREV', 'Next-Prev wrapper', 'ANNOTATION', 'WRAP_NEXT_PREV', 'Next and Previous wrapper'
WHERE NOT EXISTS (SELECT 1 FROM content WHERE content_id = 'WRAP_NEXT_PREV' AND content_name = 'Next-Prev wrapper' AND content_type_id = 'ANNOTATION' AND data_resource_id = 'WRAP_NEXT_PREV' AND description = 'Next and Previous wrapper');

INSERT INTO content (content_id, content_name, content_type_id, data_resource_id, mime_type_id)
SELECT 'WRAP_STD_LOOP', 'Loop Wrap', 'DOCUMENT', 'WRAP_STD_LOOP', 'text/html'
WHERE NOT EXISTS (SELECT 1 FROM content WHERE content_id = 'WRAP_STD_LOOP' AND content_name = 'Loop Wrap' AND content_type_id = 'DOCUMENT' AND data_resource_id = 'WRAP_STD_LOOP' AND mime_type_id = 'text/html');

INSERT INTO content (content_id, content_type_id, data_resource_id)
SELECT 'WRAP_VIEW', 'DOCUMENT', 'WRAP_VIEW'
WHERE NOT EXISTS (SELECT 1 FROM content WHERE content_id = 'WRAP_VIEW' AND content_type_id = 'DOCUMENT' AND data_resource_id = 'WRAP_VIEW');

INSERT INTO content (content_id, content_type_id, data_resource_id)
SELECT 'ARTICLE_WRAP', 'DOCUMENT', 'ARTICLE_WRAP'
WHERE NOT EXISTS (SELECT 1 FROM content WHERE content_id = 'ARTICLE_WRAP' AND content_type_id = 'DOCUMENT' AND data_resource_id = 'ARTICLE_WRAP');

INSERT INTO content (content_id, content_name, content_type_id)
SELECT 'BLOG_MASTER', 'Blog Master', 'DOCUMENT'
WHERE NOT EXISTS (SELECT 1 FROM content WHERE content_id = 'BLOG_MASTER' AND content_name = 'Blog Master' AND content_type_id = 'DOCUMENT');

INSERT INTO electronic_text (data_resource_id)
SELECT 'LEFTBAR'
WHERE NOT EXISTS (SELECT 1 FROM electronic_text WHERE data_resource_id = 'LEFTBAR');

INSERT INTO electronic_text (data_resource_id)
SELECT 'TMPLT_IMG_CENTER'
WHERE NOT EXISTS (SELECT 1 FROM electronic_text WHERE data_resource_id = 'TMPLT_IMG_CENTER');

INSERT INTO electronic_text (data_resource_id)
SELECT 'TEMPLATE_IMAGE_LEFT'
WHERE NOT EXISTS (SELECT 1 FROM electronic_text WHERE data_resource_id = 'TEMPLATE_IMAGE_LEFT');

INSERT INTO electronic_text (data_resource_id)
SELECT 'TEMPLATE_TEXT_ONLY'
WHERE NOT EXISTS (SELECT 1 FROM electronic_text WHERE data_resource_id = 'TEMPLATE_TEXT_ONLY');

INSERT INTO electronic_text (data_resource_id)
SELECT 'WRAP_ARTICLE'
WHERE NOT EXISTS (SELECT 1 FROM electronic_text WHERE data_resource_id = 'WRAP_ARTICLE');

INSERT INTO electronic_text (data_resource_id)
SELECT 'WRAP_ARTICLE_TABLE'
WHERE NOT EXISTS (SELECT 1 FROM electronic_text WHERE data_resource_id = 'WRAP_ARTICLE_TABLE');

INSERT INTO electronic_text (data_resource_id)
SELECT 'WRAP_NEXT_PREV'
WHERE NOT EXISTS (SELECT 1 FROM electronic_text WHERE data_resource_id = 'WRAP_NEXT_PREV');

INSERT INTO electronic_text (data_resource_id)
SELECT 'WRAP_STD_001'
WHERE NOT EXISTS (SELECT 1 FROM electronic_text WHERE data_resource_id = 'WRAP_STD_001');

INSERT INTO electronic_text (data_resource_id)
SELECT 'WRAP_STD_LOOP'
WHERE NOT EXISTS (SELECT 1 FROM electronic_text WHERE data_resource_id = 'WRAP_STD_LOOP');

INSERT INTO electronic_text (data_resource_id)
SELECT 'WRAP_VIEW'
WHERE NOT EXISTS (SELECT 1 FROM electronic_text WHERE data_resource_id = 'WRAP_VIEW');

INSERT INTO electronic_text (data_resource_id)
SELECT 'IMAGE_CENTERED'
WHERE NOT EXISTS (SELECT 1 FROM electronic_text WHERE data_resource_id = 'IMAGE_CENTERED');

INSERT INTO electronic_text (data_resource_id)
SELECT 'IMAGE_LEFT'
WHERE NOT EXISTS (SELECT 1 FROM electronic_text WHERE data_resource_id = 'IMAGE_LEFT');

INSERT INTO electronic_text (data_resource_id)
SELECT 'TEMPLATE_TEXT'
WHERE NOT EXISTS (SELECT 1 FROM electronic_text WHERE data_resource_id = 'TEMPLATE_TEXT');

INSERT INTO electronic_text (data_resource_id)
SELECT 'TMPLT_IMG_CENTER_FL'
WHERE NOT EXISTS (SELECT 1 FROM electronic_text WHERE data_resource_id = 'TMPLT_IMG_CENTER_FL');

INSERT INTO data_resource (data_resource_id, data_resource_name, data_resource_type_id, data_template_type_id, is_public, mime_type_id, object_info, status_id)
SELECT 'HELP_TEMPL', 'Help template file', 'OFBIZ_FILE', 'FTL', 'Y', 'text/html', 'applications/content/template/HelpTemplate.ftl', 'CTNT_IN_PROGRESS'
WHERE NOT EXISTS (SELECT 1 FROM data_resource WHERE data_resource_id = 'HELP_TEMPL' AND data_resource_name = 'Help template file' AND data_resource_type_id = 'OFBIZ_FILE' AND data_template_type_id = 'FTL' AND is_public = 'Y' AND mime_type_id = 'text/html' AND object_info = 'applications/content/template/HelpTemplate.ftl' AND status_id = 'CTNT_IN_PROGRESS');

INSERT INTO data_resource (created_date, data_resource_id, data_resource_type_id, data_template_type_id, mime_type_id, object_info)
SELECT '2004-08-06 11:40:15.818', 'NOCONTENTFOUND', 'OFBIZ_FILE', 'NONE', 'image/png', '/applications/content/webapp/content/images/nocontentfound.png'
WHERE NOT EXISTS (SELECT 1 FROM data_resource WHERE created_date = '2004-08-06 11:40:15.818' AND data_resource_id = 'NOCONTENTFOUND' AND data_resource_type_id = 'OFBIZ_FILE' AND data_template_type_id = 'NONE' AND mime_type_id = 'image/png' AND object_info = '/applications/content/webapp/content/images/nocontentfound.png');

INSERT INTO content (content_id, content_name, content_type_id, created_date, data_resource_id, description)
SELECT 'NOCONTENTFOUND', 'No Content Found', 'DOCUMENT', '2004-08-06 11:40:15.818', 'NOCONTENTFOUND', 'No Content Found'
WHERE NOT EXISTS (SELECT 1 FROM content WHERE content_id = 'NOCONTENTFOUND' AND content_name = 'No Content Found' AND content_type_id = 'DOCUMENT' AND created_date = '2004-08-06 11:40:15.818' AND data_resource_id = 'NOCONTENTFOUND' AND description = 'No Content Found');

INSERT INTO data_resource (created_date, data_resource_id, data_resource_type_id, data_template_type_id, mime_type_id, object_info)
SELECT '2004-08-06 11:40:15.818', 'NOTEXTFOUND', 'OFBIZ_FILE', 'NONE', 'text/html', '/applications/content/webapp/content/images/notextfound.html'
WHERE NOT EXISTS (SELECT 1 FROM data_resource WHERE created_date = '2004-08-06 11:40:15.818' AND data_resource_id = 'NOTEXTFOUND' AND data_resource_type_id = 'OFBIZ_FILE' AND data_template_type_id = 'NONE' AND mime_type_id = 'text/html' AND object_info = '/applications/content/webapp/content/images/notextfound.html');

INSERT INTO content (content_id, content_name, content_type_id, created_date, data_resource_id, description)
SELECT 'NOTEXTFOUND', 'No Text Found', 'DOCUMENT', '2004-08-06 11:40:15.818', 'NOTEXTFOUND', 'No Text Found'
WHERE NOT EXISTS (SELECT 1 FROM content WHERE content_id = 'NOTEXTFOUND' AND content_name = 'No Text Found' AND content_type_id = 'DOCUMENT' AND created_date = '2004-08-06 11:40:15.818' AND data_resource_id = 'NOTEXTFOUND' AND description = 'No Text Found');
