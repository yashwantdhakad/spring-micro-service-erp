INSERT INTO cost_component_type (cost_component_type_id, description, has_table)
SELECT 'MAT_COST', 'Materials Cost', 'N'
WHERE NOT EXISTS (SELECT 1 FROM cost_component_type WHERE cost_component_type_id = 'MAT_COST' AND description = 'Materials Cost' AND has_table = 'N');

INSERT INTO cost_component_type (cost_component_type_id, description, has_table)
SELECT 'ROUTE_COST', 'Route (fixed asset usage) Cost', 'N'
WHERE NOT EXISTS (SELECT 1 FROM cost_component_type WHERE cost_component_type_id = 'ROUTE_COST' AND description = 'Route (fixed asset usage) Cost' AND has_table = 'N');

INSERT INTO cost_component_type (cost_component_type_id, description, has_table)
SELECT 'LABOR_COST', 'Labor Cost', 'N'
WHERE NOT EXISTS (SELECT 1 FROM cost_component_type WHERE cost_component_type_id = 'LABOR_COST' AND description = 'Labor Cost' AND has_table = 'N');

INSERT INTO cost_component_type (cost_component_type_id, description, has_table)
SELECT 'GEN_COST', 'General Cost', 'N'
WHERE NOT EXISTS (SELECT 1 FROM cost_component_type WHERE cost_component_type_id = 'GEN_COST' AND description = 'General Cost' AND has_table = 'N');

INSERT INTO cost_component_type (cost_component_type_id, description, has_table)
SELECT 'IND_COST', 'Indirect Cost', 'N'
WHERE NOT EXISTS (SELECT 1 FROM cost_component_type WHERE cost_component_type_id = 'IND_COST' AND description = 'Indirect Cost' AND has_table = 'N');

INSERT INTO cost_component_type (cost_component_type_id, description, has_table)
SELECT 'OTHER_COST', 'Other Cost', 'N'
WHERE NOT EXISTS (SELECT 1 FROM cost_component_type WHERE cost_component_type_id = 'OTHER_COST' AND description = 'Other Cost' AND has_table = 'N');

INSERT INTO cost_component_type (cost_component_type_id, description, has_table, parent_type_id)
SELECT 'EST_STD_MAT_COST', 'Estimated Standard Materials Cost', 'N', 'MAT_COST'
WHERE NOT EXISTS (SELECT 1 FROM cost_component_type WHERE cost_component_type_id = 'EST_STD_MAT_COST' AND description = 'Estimated Standard Materials Cost' AND has_table = 'N' AND parent_type_id = 'MAT_COST');

INSERT INTO cost_component_type (cost_component_type_id, description, has_table, parent_type_id)
SELECT 'EST_STD_ROUTE_COST', 'Estimated Standard Route (fixed asset usage) Cost', 'N', 'ROUTE_COST'
WHERE NOT EXISTS (SELECT 1 FROM cost_component_type WHERE cost_component_type_id = 'EST_STD_ROUTE_COST' AND description = 'Estimated Standard Route (fixed asset usage) Cost' AND has_table = 'N' AND parent_type_id = 'ROUTE_COST');

INSERT INTO cost_component_type (cost_component_type_id, description, has_table, parent_type_id)
SELECT 'EST_STD_LABOR_COST', 'Estimated Standard Labor Cost', 'N', 'LABOR_COST'
WHERE NOT EXISTS (SELECT 1 FROM cost_component_type WHERE cost_component_type_id = 'EST_STD_LABOR_COST' AND description = 'Estimated Standard Labor Cost' AND has_table = 'N' AND parent_type_id = 'LABOR_COST');

INSERT INTO cost_component_type (cost_component_type_id, description, has_table, parent_type_id)
SELECT 'EST_STD_GEN_COST', 'Estimated Standard General Cost', 'N', 'GEN_COST'
WHERE NOT EXISTS (SELECT 1 FROM cost_component_type WHERE cost_component_type_id = 'EST_STD_GEN_COST' AND description = 'Estimated Standard General Cost' AND has_table = 'N' AND parent_type_id = 'GEN_COST');

INSERT INTO cost_component_type (cost_component_type_id, description, has_table, parent_type_id)
SELECT 'EST_STD_IND_COST', 'Estimated Standard Indirect Cost', 'N', 'IND_COST'
WHERE NOT EXISTS (SELECT 1 FROM cost_component_type WHERE cost_component_type_id = 'EST_STD_IND_COST' AND description = 'Estimated Standard Indirect Cost' AND has_table = 'N' AND parent_type_id = 'IND_COST');

INSERT INTO cost_component_type (cost_component_type_id, description, has_table, parent_type_id)
SELECT 'EST_STD_OTHER_COST', 'Estimated Standard Other Cost', 'N', 'OTHER_COST'
WHERE NOT EXISTS (SELECT 1 FROM cost_component_type WHERE cost_component_type_id = 'EST_STD_OTHER_COST' AND description = 'Estimated Standard Other Cost' AND has_table = 'N' AND parent_type_id = 'OTHER_COST');

INSERT INTO cost_component_type (cost_component_type_id, description, has_table, parent_type_id)
SELECT 'ACTUAL_MAT_COST', 'Actual Materials Cost', 'N', 'MAT_COST'
WHERE NOT EXISTS (SELECT 1 FROM cost_component_type WHERE cost_component_type_id = 'ACTUAL_MAT_COST' AND description = 'Actual Materials Cost' AND has_table = 'N' AND parent_type_id = 'MAT_COST');

INSERT INTO cost_component_type (cost_component_type_id, description, has_table, parent_type_id)
SELECT 'ACTUAL_ROUTE_COST', 'Actual Route (fixed asset usage) Cost', 'N', 'ROUTE_COST'
WHERE NOT EXISTS (SELECT 1 FROM cost_component_type WHERE cost_component_type_id = 'ACTUAL_ROUTE_COST' AND description = 'Actual Route (fixed asset usage) Cost' AND has_table = 'N' AND parent_type_id = 'ROUTE_COST');

INSERT INTO cost_component_type (cost_component_type_id, description, has_table, parent_type_id)
SELECT 'ACTUAL_LABOR_COST', 'Actual Labor Cost', 'N', 'LABOR_COST'
WHERE NOT EXISTS (SELECT 1 FROM cost_component_type WHERE cost_component_type_id = 'ACTUAL_LABOR_COST' AND description = 'Actual Labor Cost' AND has_table = 'N' AND parent_type_id = 'LABOR_COST');

INSERT INTO cost_component_type (cost_component_type_id, description, has_table, parent_type_id)
SELECT 'ACTUAL_OTHER_COST', 'Actual Other Cost', 'N', 'OTHER_COST'
WHERE NOT EXISTS (SELECT 1 FROM cost_component_type WHERE cost_component_type_id = 'ACTUAL_OTHER_COST' AND description = 'Actual Other Cost' AND has_table = 'N' AND parent_type_id = 'OTHER_COST');

INSERT INTO cost_component_type (cost_component_type_id, description, has_table, parent_type_id)
SELECT 'ACTUAL_GEN_COST', 'Actual General Cost', 'N', 'GEN_COST'
WHERE NOT EXISTS (SELECT 1 FROM cost_component_type WHERE cost_component_type_id = 'ACTUAL_GEN_COST' AND description = 'Actual General Cost' AND has_table = 'N' AND parent_type_id = 'GEN_COST');

INSERT INTO cost_component_type (cost_component_type_id, description, has_table, parent_type_id)
SELECT 'ACTUAL_IND_COST', 'Actual Indirect Cost', 'N', 'IND_COST'
WHERE NOT EXISTS (SELECT 1 FROM cost_component_type WHERE cost_component_type_id = 'ACTUAL_IND_COST' AND description = 'Actual Indirect Cost' AND has_table = 'N' AND parent_type_id = 'IND_COST');

INSERT INTO cost_component_type (cost_component_type_id, description, has_table, parent_type_id)
SELECT 'ACTUAL_OTHER_COST', 'Actual Other Cost', 'N', 'OTHER_COST'
WHERE NOT EXISTS (SELECT 1 FROM cost_component_type WHERE cost_component_type_id = 'ACTUAL_OTHER_COST' AND description = 'Actual Other Cost' AND has_table = 'N' AND parent_type_id = 'OTHER_COST');

INSERT INTO good_identification_type (description, good_identification_type_id, has_table)
SELECT 'ISBN', 'ISBN', 'N'
WHERE NOT EXISTS (SELECT 1 FROM good_identification_type WHERE description = 'ISBN' AND good_identification_type_id = 'ISBN' AND has_table = 'N');

INSERT INTO good_identification_type (description, good_identification_type_id, has_table)
SELECT 'Manufacturer (Model) Number', 'MANUFACTURER_ID_NO', 'N'
WHERE NOT EXISTS (SELECT 1 FROM good_identification_type WHERE description = 'Manufacturer (Model) Number' AND good_identification_type_id = 'MANUFACTURER_ID_NO' AND has_table = 'N');

INSERT INTO good_identification_type (description, good_identification_type_id, has_table)
SELECT 'Model Year', 'MODEL_YEAR', 'N'
WHERE NOT EXISTS (SELECT 1 FROM good_identification_type WHERE description = 'Model Year' AND good_identification_type_id = 'MODEL_YEAR' AND has_table = 'N');

INSERT INTO good_identification_type (description, good_identification_type_id, has_table)
SELECT 'Other', 'OTHER_ID', 'N'
WHERE NOT EXISTS (SELECT 1 FROM good_identification_type WHERE description = 'Other' AND good_identification_type_id = 'OTHER_ID' AND has_table = 'N');

INSERT INTO good_identification_type (description, good_identification_type_id, has_table)
SELECT 'SKU', 'SKU', 'N'
WHERE NOT EXISTS (SELECT 1 FROM good_identification_type WHERE description = 'SKU' AND good_identification_type_id = 'SKU' AND has_table = 'N');

INSERT INTO good_identification_type (description, good_identification_type_id, has_table)
SELECT 'UPCA', 'UPCA', 'N'
WHERE NOT EXISTS (SELECT 1 FROM good_identification_type WHERE description = 'UPCA' AND good_identification_type_id = 'UPCA' AND has_table = 'N');

INSERT INTO good_identification_type (description, good_identification_type_id, has_table)
SELECT 'UPCE', 'UPCE', 'N'
WHERE NOT EXISTS (SELECT 1 FROM good_identification_type WHERE description = 'UPCE' AND good_identification_type_id = 'UPCE' AND has_table = 'N');

INSERT INTO good_identification_type (description, good_identification_type_id, has_table)
SELECT 'EAN', 'EAN', 'N'
WHERE NOT EXISTS (SELECT 1 FROM good_identification_type WHERE description = 'EAN' AND good_identification_type_id = 'EAN' AND has_table = 'N');

INSERT INTO good_identification_type (description, good_identification_type_id, has_table)
SELECT 'Library of Congress', 'LOC', 'N'
WHERE NOT EXISTS (SELECT 1 FROM good_identification_type WHERE description = 'Library of Congress' AND good_identification_type_id = 'LOC' AND has_table = 'N');

INSERT INTO good_identification_type (description, good_identification_type_id, has_table)
SELECT 'Harmonized System Codes (HS Code)', 'HS_CODE', 'N'
WHERE NOT EXISTS (SELECT 1 FROM good_identification_type WHERE description = 'Harmonized System Codes (HS Code)' AND good_identification_type_id = 'HS_CODE' AND has_table = 'N');

INSERT INTO prod_catalog_category_type (description, prod_catalog_category_type_id)
SELECT 'Browse Root (One)', 'PCCT_BROWSE_ROOT'
WHERE NOT EXISTS (SELECT 1 FROM prod_catalog_category_type WHERE description = 'Browse Root (One)' AND prod_catalog_category_type_id = 'PCCT_BROWSE_ROOT');

INSERT INTO prod_catalog_category_type (description, prod_catalog_category_type_id)
SELECT 'Default Search (One)', 'PCCT_SEARCH'
WHERE NOT EXISTS (SELECT 1 FROM prod_catalog_category_type WHERE description = 'Default Search (One)' AND prod_catalog_category_type_id = 'PCCT_SEARCH');

INSERT INTO prod_catalog_category_type (description, prod_catalog_category_type_id)
SELECT 'Other Search (Many)', 'PCCT_OTHER_SEARCH'
WHERE NOT EXISTS (SELECT 1 FROM prod_catalog_category_type WHERE description = 'Other Search (Many)' AND prod_catalog_category_type_id = 'PCCT_OTHER_SEARCH');

INSERT INTO prod_catalog_category_type (description, prod_catalog_category_type_id)
SELECT 'Quick Add (Many)', 'PCCT_QUICK_ADD'
WHERE NOT EXISTS (SELECT 1 FROM prod_catalog_category_type WHERE description = 'Quick Add (Many)' AND prod_catalog_category_type_id = 'PCCT_QUICK_ADD');

INSERT INTO prod_catalog_category_type (description, prod_catalog_category_type_id)
SELECT 'Promotions (One)', 'PCCT_PROMOTIONS'
WHERE NOT EXISTS (SELECT 1 FROM prod_catalog_category_type WHERE description = 'Promotions (One)' AND prod_catalog_category_type_id = 'PCCT_PROMOTIONS');

INSERT INTO prod_catalog_category_type (description, prod_catalog_category_type_id)
SELECT 'Most Popular (One)', 'PCCT_MOST_POPULAR'
WHERE NOT EXISTS (SELECT 1 FROM prod_catalog_category_type WHERE description = 'Most Popular (One)' AND prod_catalog_category_type_id = 'PCCT_MOST_POPULAR');

INSERT INTO prod_catalog_category_type (description, prod_catalog_category_type_id)
SELECT 'What''s New (One)', 'PCCT_WHATS_NEW'
WHERE NOT EXISTS (SELECT 1 FROM prod_catalog_category_type WHERE description = 'What''s New (One)' AND prod_catalog_category_type_id = 'PCCT_WHATS_NEW');

INSERT INTO prod_catalog_category_type (description, prod_catalog_category_type_id)
SELECT 'View Allow (One)', 'PCCT_VIEW_ALLW'
WHERE NOT EXISTS (SELECT 1 FROM prod_catalog_category_type WHERE description = 'View Allow (One)' AND prod_catalog_category_type_id = 'PCCT_VIEW_ALLW');

INSERT INTO prod_catalog_category_type (description, prod_catalog_category_type_id)
SELECT 'Purchase Allow (One)', 'PCCT_PURCH_ALLW'
WHERE NOT EXISTS (SELECT 1 FROM prod_catalog_category_type WHERE description = 'Purchase Allow (One)' AND prod_catalog_category_type_id = 'PCCT_PURCH_ALLW');

INSERT INTO prod_catalog_category_type (description, prod_catalog_category_type_id)
SELECT 'Admin Allow (One)', 'PCCT_ADMIN_ALLW'
WHERE NOT EXISTS (SELECT 1 FROM prod_catalog_category_type WHERE description = 'Admin Allow (One)' AND prod_catalog_category_type_id = 'PCCT_ADMIN_ALLW');

INSERT INTO prod_catalog_category_type (description, prod_catalog_category_type_id)
SELECT 'Ebay Root (One)', 'PCCT_EBAY_ROOT'
WHERE NOT EXISTS (SELECT 1 FROM prod_catalog_category_type WHERE description = 'Ebay Root (One)' AND prod_catalog_category_type_id = 'PCCT_EBAY_ROOT');

INSERT INTO prod_catalog_category_type (description, prod_catalog_category_type_id)
SELECT 'Best Selling (One)', 'PCCT_BEST_SELL'
WHERE NOT EXISTS (SELECT 1 FROM prod_catalog_category_type WHERE description = 'Best Selling (One)' AND prod_catalog_category_type_id = 'PCCT_BEST_SELL');

INSERT INTO product_assoc_type (description, has_table, product_assoc_type_id)
SELECT 'Also Bought', 'N', 'ALSO_BOUGHT'
WHERE NOT EXISTS (SELECT 1 FROM product_assoc_type WHERE description = 'Also Bought' AND has_table = 'N' AND product_assoc_type_id = 'ALSO_BOUGHT');

INSERT INTO product_assoc_type (description, has_table, product_assoc_type_id)
SELECT 'Upgrade or Up-Sell', 'N', 'PRODUCT_UPGRADE'
WHERE NOT EXISTS (SELECT 1 FROM product_assoc_type WHERE description = 'Upgrade or Up-Sell' AND has_table = 'N' AND product_assoc_type_id = 'PRODUCT_UPGRADE');

INSERT INTO product_assoc_type (description, has_table, product_assoc_type_id)
SELECT 'Complementary or Cross-Sell', 'N', 'PRODUCT_COMPLEMENT'
WHERE NOT EXISTS (SELECT 1 FROM product_assoc_type WHERE description = 'Complementary or Cross-Sell' AND has_table = 'N' AND product_assoc_type_id = 'PRODUCT_COMPLEMENT');

INSERT INTO product_assoc_type (description, has_table, product_assoc_type_id)
SELECT 'Incompatible', 'N', 'PRODUCT_INCOMPATABLE'
WHERE NOT EXISTS (SELECT 1 FROM product_assoc_type WHERE description = 'Incompatible' AND has_table = 'N' AND product_assoc_type_id = 'PRODUCT_INCOMPATABLE');

INSERT INTO product_assoc_type (description, has_table, product_assoc_type_id)
SELECT 'New Version, Replacement', 'N', 'PRODUCT_OBSOLESCENCE'
WHERE NOT EXISTS (SELECT 1 FROM product_assoc_type WHERE description = 'New Version, Replacement' AND has_table = 'N' AND product_assoc_type_id = 'PRODUCT_OBSOLESCENCE');

INSERT INTO product_assoc_type (description, has_table, product_assoc_type_id)
SELECT 'Actual Product Component', 'N', 'PRODUCT_COMPONENT'
WHERE NOT EXISTS (SELECT 1 FROM product_assoc_type WHERE description = 'Actual Product Component' AND has_table = 'N' AND product_assoc_type_id = 'PRODUCT_COMPONENT');

INSERT INTO product_assoc_type (description, has_table, product_assoc_type_id)
SELECT 'Equivalent or Substitute', 'N', 'PRODUCT_SUBSTITUTE'
WHERE NOT EXISTS (SELECT 1 FROM product_assoc_type WHERE description = 'Equivalent or Substitute' AND has_table = 'N' AND product_assoc_type_id = 'PRODUCT_SUBSTITUTE');

INSERT INTO product_assoc_type (description, has_table, product_assoc_type_id)
SELECT 'Product Variant', 'N', 'PRODUCT_VARIANT'
WHERE NOT EXISTS (SELECT 1 FROM product_assoc_type WHERE description = 'Product Variant' AND has_table = 'N' AND product_assoc_type_id = 'PRODUCT_VARIANT');

INSERT INTO product_assoc_type (description, has_table, product_assoc_type_id)
SELECT 'Unique Item', 'N', 'UNIQUE_ITEM'
WHERE NOT EXISTS (SELECT 1 FROM product_assoc_type WHERE description = 'Unique Item' AND has_table = 'N' AND product_assoc_type_id = 'UNIQUE_ITEM');

INSERT INTO product_assoc_type (description, has_table, product_assoc_type_id)
SELECT 'Accessory', 'N', 'PRODUCT_ACCESSORY'
WHERE NOT EXISTS (SELECT 1 FROM product_assoc_type WHERE description = 'Accessory' AND has_table = 'N' AND product_assoc_type_id = 'PRODUCT_ACCESSORY');

INSERT INTO product_assoc_type (description, has_table, product_assoc_type_id)
SELECT 'Refurbished Equivalent', 'N', 'PRODUCT_REFURB'
WHERE NOT EXISTS (SELECT 1 FROM product_assoc_type WHERE description = 'Refurbished Equivalent' AND has_table = 'N' AND product_assoc_type_id = 'PRODUCT_REFURB');

INSERT INTO product_assoc_type (description, has_table, product_assoc_type_id)
SELECT 'Repair Service', 'N', 'PRODUCT_REPAIR_SRV'
WHERE NOT EXISTS (SELECT 1 FROM product_assoc_type WHERE description = 'Repair Service' AND has_table = 'N' AND product_assoc_type_id = 'PRODUCT_REPAIR_SRV');

INSERT INTO product_assoc_type (description, has_table, product_assoc_type_id)
SELECT 'Auto Reorder (needs recurrenceInfoId)', 'N', 'PRODUCT_AUTORO'
WHERE NOT EXISTS (SELECT 1 FROM product_assoc_type WHERE description = 'Auto Reorder (needs recurrenceInfoId)' AND has_table = 'N' AND product_assoc_type_id = 'PRODUCT_AUTORO');

INSERT INTO product_assoc_type (description, has_table, product_assoc_type_id)
SELECT 'Revision', 'N', 'PRODUCT_REVISION'
WHERE NOT EXISTS (SELECT 1 FROM product_assoc_type WHERE description = 'Revision' AND has_table = 'N' AND product_assoc_type_id = 'PRODUCT_REVISION');

INSERT INTO product_assoc_type (description, has_table, parent_type_id, product_assoc_type_id)
SELECT 'Manufacturing Bill of Materials', 'N', 'PRODUCT_COMPONENT', 'MANUF_COMPONENT'
WHERE NOT EXISTS (SELECT 1 FROM product_assoc_type WHERE description = 'Manufacturing Bill of Materials' AND has_table = 'N' AND parent_type_id = 'PRODUCT_COMPONENT' AND product_assoc_type_id = 'MANUF_COMPONENT');

INSERT INTO product_assoc_type (description, has_table, parent_type_id, product_assoc_type_id)
SELECT 'Engineering Bill of Materials', 'N', 'PRODUCT_COMPONENT', 'ENGINEER_COMPONENT'
WHERE NOT EXISTS (SELECT 1 FROM product_assoc_type WHERE description = 'Engineering Bill of Materials' AND has_table = 'N' AND parent_type_id = 'PRODUCT_COMPONENT' AND product_assoc_type_id = 'ENGINEER_COMPONENT');

INSERT INTO product_assoc_type (description, has_table, product_assoc_type_id)
SELECT 'Product Manufactured As', 'N', 'PRODUCT_MANUFACTURED'
WHERE NOT EXISTS (SELECT 1 FROM product_assoc_type WHERE description = 'Product Manufactured As' AND has_table = 'N' AND product_assoc_type_id = 'PRODUCT_MANUFACTURED');

INSERT INTO product_assoc_type (description, has_table, product_assoc_type_id)
SELECT 'Configurable product instance', 'N', 'PRODUCT_CONF'
WHERE NOT EXISTS (SELECT 1 FROM product_assoc_type WHERE description = 'Configurable product instance' AND has_table = 'N' AND product_assoc_type_id = 'PRODUCT_CONF');

INSERT INTO product_assoc_type (description, has_table, product_assoc_type_id)
SELECT 'Alternative Packaging', 'N', 'ALTERNATIVE_PACKAGE'
WHERE NOT EXISTS (SELECT 1 FROM product_assoc_type WHERE description = 'Alternative Packaging' AND has_table = 'N' AND product_assoc_type_id = 'ALTERNATIVE_PACKAGE');

INSERT INTO product_category_type (description, has_table, product_category_type_id)
SELECT 'Catalog', 'N', 'CATALOG_CATEGORY'
WHERE NOT EXISTS (SELECT 1 FROM product_category_type WHERE description = 'Catalog' AND has_table = 'N' AND product_category_type_id = 'CATALOG_CATEGORY');

INSERT INTO product_category_type (description, has_table, product_category_type_id)
SELECT 'Industry', 'N', 'INDUSTRY_CATEGORY'
WHERE NOT EXISTS (SELECT 1 FROM product_category_type WHERE description = 'Industry' AND has_table = 'N' AND product_category_type_id = 'INDUSTRY_CATEGORY');

INSERT INTO product_category_type (description, has_table, product_category_type_id)
SELECT 'Internal', 'N', 'INTERNAL_CATEGORY'
WHERE NOT EXISTS (SELECT 1 FROM product_category_type WHERE description = 'Internal' AND has_table = 'N' AND product_category_type_id = 'INTERNAL_CATEGORY');

INSERT INTO product_category_type (description, has_table, product_category_type_id)
SELECT 'Materials', 'N', 'MATERIALS_CATEGORY'
WHERE NOT EXISTS (SELECT 1 FROM product_category_type WHERE description = 'Materials' AND has_table = 'N' AND product_category_type_id = 'MATERIALS_CATEGORY');

INSERT INTO product_category_type (description, has_table, product_category_type_id)
SELECT 'Quick Add', 'N', 'QUICKADD_CATEGORY'
WHERE NOT EXISTS (SELECT 1 FROM product_category_type WHERE description = 'Quick Add' AND has_table = 'N' AND product_category_type_id = 'QUICKADD_CATEGORY');

INSERT INTO product_category_type (description, has_table, product_category_type_id)
SELECT 'Search', 'N', 'SEARCH_CATEGORY'
WHERE NOT EXISTS (SELECT 1 FROM product_category_type WHERE description = 'Search' AND has_table = 'N' AND product_category_type_id = 'SEARCH_CATEGORY');

INSERT INTO product_category_type (description, has_table, product_category_type_id)
SELECT 'Usage', 'N', 'USAGE_CATEGORY'
WHERE NOT EXISTS (SELECT 1 FROM product_category_type WHERE description = 'Usage' AND has_table = 'N' AND product_category_type_id = 'USAGE_CATEGORY');

INSERT INTO product_category_type (description, has_table, product_category_type_id)
SELECT 'Mix and Match', 'N', 'MIXMATCH_CATEGORY'
WHERE NOT EXISTS (SELECT 1 FROM product_category_type WHERE description = 'Mix and Match' AND has_table = 'N' AND product_category_type_id = 'MIXMATCH_CATEGORY');

INSERT INTO product_category_type (description, has_table, product_category_type_id)
SELECT 'Cross Sell', 'N', 'CROSS_SELL_CATEGORY'
WHERE NOT EXISTS (SELECT 1 FROM product_category_type WHERE description = 'Cross Sell' AND has_table = 'N' AND product_category_type_id = 'CROSS_SELL_CATEGORY');

INSERT INTO product_category_type (description, has_table, product_category_type_id)
SELECT 'Tax', 'N', 'TAX_CATEGORY'
WHERE NOT EXISTS (SELECT 1 FROM product_category_type WHERE description = 'Tax' AND has_table = 'N' AND product_category_type_id = 'TAX_CATEGORY');

INSERT INTO product_category_type (description, has_table, product_category_type_id)
SELECT 'Google Base', 'N', 'GOOGLE_BASE_CATEGORY'
WHERE NOT EXISTS (SELECT 1 FROM product_category_type WHERE description = 'Google Base' AND has_table = 'N' AND product_category_type_id = 'GOOGLE_BASE_CATEGORY');

INSERT INTO product_category_type (description, has_table, product_category_type_id)
SELECT 'Gift Cards', 'N', 'GIFT_CARD_CATEGORY'
WHERE NOT EXISTS (SELECT 1 FROM product_category_type WHERE description = 'Gift Cards' AND has_table = 'N' AND product_category_type_id = 'GIFT_CARD_CATEGORY');

INSERT INTO product_category_type (description, has_table, product_category_type_id)
SELECT 'Best Selling', 'N', 'BEST_SELL_CATEGORY'
WHERE NOT EXISTS (SELECT 1 FROM product_category_type WHERE description = 'Best Selling' AND has_table = 'N' AND product_category_type_id = 'BEST_SELL_CATEGORY');

INSERT INTO product_content_type (description, has_table, product_content_type_id)
SELECT 'Online Access', 'N', 'ONLINE_ACCESS'
WHERE NOT EXISTS (SELECT 1 FROM product_content_type WHERE description = 'Online Access' AND has_table = 'N' AND product_content_type_id = 'ONLINE_ACCESS');

INSERT INTO product_content_type (description, has_table, product_content_type_id)
SELECT 'Digital Download', 'N', 'DIGITAL_DOWNLOAD'
WHERE NOT EXISTS (SELECT 1 FROM product_content_type WHERE description = 'Digital Download' AND has_table = 'N' AND product_content_type_id = 'DIGITAL_DOWNLOAD');

INSERT INTO product_content_type (description, has_table, product_content_type_id)
SELECT 'Fulfillment Email', 'N', 'FULFILLMENT_EMAIL'
WHERE NOT EXISTS (SELECT 1 FROM product_content_type WHERE description = 'Fulfillment Email' AND has_table = 'N' AND product_content_type_id = 'FULFILLMENT_EMAIL');

INSERT INTO product_content_type (description, has_table, product_content_type_id)
SELECT 'Fulfillment External (Async)', 'N', 'FULFILLMENT_EXTASYNC'
WHERE NOT EXISTS (SELECT 1 FROM product_content_type WHERE description = 'Fulfillment External (Async)' AND has_table = 'N' AND product_content_type_id = 'FULFILLMENT_EXTASYNC');

INSERT INTO product_content_type (description, has_table, product_content_type_id)
SELECT 'Fulfillment External (Sync)', 'N', 'FULFILLMENT_EXTSYNC'
WHERE NOT EXISTS (SELECT 1 FROM product_content_type WHERE description = 'Fulfillment External (Sync)' AND has_table = 'N' AND product_content_type_id = 'FULFILLMENT_EXTSYNC');

INSERT INTO product_content_type (description, has_table, product_content_type_id)
SELECT 'Product Name', 'N', 'PRODUCT_NAME'
WHERE NOT EXISTS (SELECT 1 FROM product_content_type WHERE description = 'Product Name' AND has_table = 'N' AND product_content_type_id = 'PRODUCT_NAME');

INSERT INTO product_content_type (description, has_table, product_content_type_id)
SELECT 'Description', 'N', 'DESCRIPTION'
WHERE NOT EXISTS (SELECT 1 FROM product_content_type WHERE description = 'Description' AND has_table = 'N' AND product_content_type_id = 'DESCRIPTION');

INSERT INTO product_content_type (description, has_table, product_content_type_id)
SELECT 'Description - Long', 'N', 'LONG_DESCRIPTION'
WHERE NOT EXISTS (SELECT 1 FROM product_content_type WHERE description = 'Description - Long' AND has_table = 'N' AND product_content_type_id = 'LONG_DESCRIPTION');

INSERT INTO product_content_type (description, has_table, product_content_type_id)
SELECT 'Alternative URL', 'N', 'ALTERNATIVE_URL'
WHERE NOT EXISTS (SELECT 1 FROM product_content_type WHERE description = 'Alternative URL' AND has_table = 'N' AND product_content_type_id = 'ALTERNATIVE_URL');

INSERT INTO product_content_type (description, has_table, product_content_type_id)
SELECT 'Price Detail Text', 'N', 'PRICE_DETAIL_TEXT'
WHERE NOT EXISTS (SELECT 1 FROM product_content_type WHERE description = 'Price Detail Text' AND has_table = 'N' AND product_content_type_id = 'PRICE_DETAIL_TEXT');

INSERT INTO product_content_type (description, has_table, product_content_type_id)
SELECT 'Ingredients', 'N', 'INGREDIENTS'
WHERE NOT EXISTS (SELECT 1 FROM product_content_type WHERE description = 'Ingredients' AND has_table = 'N' AND product_content_type_id = 'INGREDIENTS');

INSERT INTO product_content_type (description, has_table, product_content_type_id)
SELECT 'Unique Ingredients', 'N', 'UNIQUE_INGREDIENTS'
WHERE NOT EXISTS (SELECT 1 FROM product_content_type WHERE description = 'Unique Ingredients' AND has_table = 'N' AND product_content_type_id = 'UNIQUE_INGREDIENTS');

INSERT INTO product_content_type (description, has_table, product_content_type_id)
SELECT 'Special Instructions', 'N', 'SPECIALINSTRUCTIONS'
WHERE NOT EXISTS (SELECT 1 FROM product_content_type WHERE description = 'Special Instructions' AND has_table = 'N' AND product_content_type_id = 'SPECIALINSTRUCTIONS');

INSERT INTO product_content_type (description, has_table, product_content_type_id)
SELECT 'Warnings', 'N', 'WARNINGS'
WHERE NOT EXISTS (SELECT 1 FROM product_content_type WHERE description = 'Warnings' AND has_table = 'N' AND product_content_type_id = 'WARNINGS');

INSERT INTO product_content_type (description, has_table, product_content_type_id)
SELECT 'Directions', 'N', 'DIRECTIONS'
WHERE NOT EXISTS (SELECT 1 FROM product_content_type WHERE description = 'Directions' AND has_table = 'N' AND product_content_type_id = 'DIRECTIONS');

INSERT INTO product_content_type (description, has_table, product_content_type_id)
SELECT 'Terms and Conditions', 'N', 'TERMS_AND_CONDS'
WHERE NOT EXISTS (SELECT 1 FROM product_content_type WHERE description = 'Terms and Conditions' AND has_table = 'N' AND product_content_type_id = 'TERMS_AND_CONDS');

INSERT INTO product_content_type (description, has_table, product_content_type_id)
SELECT 'Delivery Info', 'N', 'DELIVERY_INFO'
WHERE NOT EXISTS (SELECT 1 FROM product_content_type WHERE description = 'Delivery Info' AND has_table = 'N' AND product_content_type_id = 'DELIVERY_INFO');

INSERT INTO product_content_type (description, has_table, product_content_type_id)
SELECT 'Image - Small', 'N', 'SMALL_IMAGE_URL'
WHERE NOT EXISTS (SELECT 1 FROM product_content_type WHERE description = 'Image - Small' AND has_table = 'N' AND product_content_type_id = 'SMALL_IMAGE_URL');

INSERT INTO product_content_type (description, has_table, product_content_type_id)
SELECT 'Image - Medium', 'N', 'MEDIUM_IMAGE_URL'
WHERE NOT EXISTS (SELECT 1 FROM product_content_type WHERE description = 'Image - Medium' AND has_table = 'N' AND product_content_type_id = 'MEDIUM_IMAGE_URL');

INSERT INTO product_content_type (description, has_table, product_content_type_id)
SELECT 'Image - Large', 'N', 'LARGE_IMAGE_URL'
WHERE NOT EXISTS (SELECT 1 FROM product_content_type WHERE description = 'Image - Large' AND has_table = 'N' AND product_content_type_id = 'LARGE_IMAGE_URL');

INSERT INTO product_content_type (description, has_table, product_content_type_id)
SELECT 'Image - Detail', 'N', 'DETAIL_IMAGE_URL'
WHERE NOT EXISTS (SELECT 1 FROM product_content_type WHERE description = 'Image - Detail' AND has_table = 'N' AND product_content_type_id = 'DETAIL_IMAGE_URL');

INSERT INTO product_content_type (description, has_table, product_content_type_id)
SELECT 'Image - Original', 'N', 'ORIGINAL_IMAGE_URL'
WHERE NOT EXISTS (SELECT 1 FROM product_content_type WHERE description = 'Image - Original' AND has_table = 'N' AND product_content_type_id = 'ORIGINAL_IMAGE_URL');

INSERT INTO product_content_type (description, has_table, product_content_type_id)
SELECT 'Image Alt Text - Small', 'N', 'SMALL_IMAGE_ALT'
WHERE NOT EXISTS (SELECT 1 FROM product_content_type WHERE description = 'Image Alt Text - Small' AND has_table = 'N' AND product_content_type_id = 'SMALL_IMAGE_ALT');

INSERT INTO product_content_type (description, has_table, product_content_type_id)
SELECT 'Image Alt Text - Medium', 'N', 'MEDIUM_IMAGE_ALT'
WHERE NOT EXISTS (SELECT 1 FROM product_content_type WHERE description = 'Image Alt Text - Medium' AND has_table = 'N' AND product_content_type_id = 'MEDIUM_IMAGE_ALT');

INSERT INTO product_content_type (description, has_table, product_content_type_id)
SELECT 'Image Alt Text - Large', 'N', 'LARGE_IMAGE_ALT'
WHERE NOT EXISTS (SELECT 1 FROM product_content_type WHERE description = 'Image Alt Text - Large' AND has_table = 'N' AND product_content_type_id = 'LARGE_IMAGE_ALT');

INSERT INTO product_content_type (description, has_table, product_content_type_id)
SELECT 'Image Alt Text - Detail', 'N', 'DETAIL_IMAGE_ALT'
WHERE NOT EXISTS (SELECT 1 FROM product_content_type WHERE description = 'Image Alt Text - Detail' AND has_table = 'N' AND product_content_type_id = 'DETAIL_IMAGE_ALT');

INSERT INTO product_content_type (description, has_table, product_content_type_id)
SELECT 'Image - Additional View 1', 'N', 'ADDITIONAL_IMAGE_1'
WHERE NOT EXISTS (SELECT 1 FROM product_content_type WHERE description = 'Image - Additional View 1' AND has_table = 'N' AND product_content_type_id = 'ADDITIONAL_IMAGE_1');

INSERT INTO product_content_type (description, has_table, product_content_type_id)
SELECT 'Image - Additional View 2', 'N', 'ADDITIONAL_IMAGE_2'
WHERE NOT EXISTS (SELECT 1 FROM product_content_type WHERE description = 'Image - Additional View 2' AND has_table = 'N' AND product_content_type_id = 'ADDITIONAL_IMAGE_2');

INSERT INTO product_content_type (description, has_table, product_content_type_id)
SELECT 'Image - Additional View 3', 'N', 'ADDITIONAL_IMAGE_3'
WHERE NOT EXISTS (SELECT 1 FROM product_content_type WHERE description = 'Image - Additional View 3' AND has_table = 'N' AND product_content_type_id = 'ADDITIONAL_IMAGE_3');

INSERT INTO product_content_type (description, has_table, product_content_type_id)
SELECT 'Image - Additional View 4', 'N', 'ADDITIONAL_IMAGE_4'
WHERE NOT EXISTS (SELECT 1 FROM product_content_type WHERE description = 'Image - Additional View 4' AND has_table = 'N' AND product_content_type_id = 'ADDITIONAL_IMAGE_4');

INSERT INTO product_content_type (description, has_table, product_content_type_id)
SELECT 'Image - Additional View 1 Small', 'N', 'XTRA_IMG_1_SMALL'
WHERE NOT EXISTS (SELECT 1 FROM product_content_type WHERE description = 'Image - Additional View 1 Small' AND has_table = 'N' AND product_content_type_id = 'XTRA_IMG_1_SMALL');

INSERT INTO product_content_type (description, has_table, product_content_type_id)
SELECT 'Image - Additional View 1 Medium', 'N', 'XTRA_IMG_1_MEDIUM'
WHERE NOT EXISTS (SELECT 1 FROM product_content_type WHERE description = 'Image - Additional View 1 Medium' AND has_table = 'N' AND product_content_type_id = 'XTRA_IMG_1_MEDIUM');

INSERT INTO product_content_type (description, has_table, product_content_type_id)
SELECT 'Image - Additional View 1 Large', 'N', 'XTRA_IMG_1_LARGE'
WHERE NOT EXISTS (SELECT 1 FROM product_content_type WHERE description = 'Image - Additional View 1 Large' AND has_table = 'N' AND product_content_type_id = 'XTRA_IMG_1_LARGE');

INSERT INTO product_content_type (description, has_table, product_content_type_id)
SELECT 'Image - Additional View 1 Detail', 'N', 'XTRA_IMG_1_DETAIL'
WHERE NOT EXISTS (SELECT 1 FROM product_content_type WHERE description = 'Image - Additional View 1 Detail' AND has_table = 'N' AND product_content_type_id = 'XTRA_IMG_1_DETAIL');

INSERT INTO product_content_type (description, has_table, product_content_type_id)
SELECT 'Image - Additional View 2 Small', 'N', 'XTRA_IMG_2_SMALL'
WHERE NOT EXISTS (SELECT 1 FROM product_content_type WHERE description = 'Image - Additional View 2 Small' AND has_table = 'N' AND product_content_type_id = 'XTRA_IMG_2_SMALL');

INSERT INTO product_content_type (description, has_table, product_content_type_id)
SELECT 'Image - Additional View 2 Medium', 'N', 'XTRA_IMG_2_MEDIUM'
WHERE NOT EXISTS (SELECT 1 FROM product_content_type WHERE description = 'Image - Additional View 2 Medium' AND has_table = 'N' AND product_content_type_id = 'XTRA_IMG_2_MEDIUM');

INSERT INTO product_content_type (description, has_table, product_content_type_id)
SELECT 'Image - Additional View 2 Large', 'N', 'XTRA_IMG_2_LARGE'
WHERE NOT EXISTS (SELECT 1 FROM product_content_type WHERE description = 'Image - Additional View 2 Large' AND has_table = 'N' AND product_content_type_id = 'XTRA_IMG_2_LARGE');

INSERT INTO product_content_type (description, has_table, product_content_type_id)
SELECT 'Image - Additional View 2 Detail', 'N', 'XTRA_IMG_2_DETAIL'
WHERE NOT EXISTS (SELECT 1 FROM product_content_type WHERE description = 'Image - Additional View 2 Detail' AND has_table = 'N' AND product_content_type_id = 'XTRA_IMG_2_DETAIL');

INSERT INTO product_content_type (description, has_table, product_content_type_id)
SELECT 'Image - Additional View 3 Small', 'N', 'XTRA_IMG_3_SMALL'
WHERE NOT EXISTS (SELECT 1 FROM product_content_type WHERE description = 'Image - Additional View 3 Small' AND has_table = 'N' AND product_content_type_id = 'XTRA_IMG_3_SMALL');

INSERT INTO product_content_type (description, has_table, product_content_type_id)
SELECT 'Image - Additional View 3 Medium', 'N', 'XTRA_IMG_3_MEDIUM'
WHERE NOT EXISTS (SELECT 1 FROM product_content_type WHERE description = 'Image - Additional View 3 Medium' AND has_table = 'N' AND product_content_type_id = 'XTRA_IMG_3_MEDIUM');

INSERT INTO product_content_type (description, has_table, product_content_type_id)
SELECT 'Image - Additional View 3 Large', 'N', 'XTRA_IMG_3_LARGE'
WHERE NOT EXISTS (SELECT 1 FROM product_content_type WHERE description = 'Image - Additional View 3 Large' AND has_table = 'N' AND product_content_type_id = 'XTRA_IMG_3_LARGE');

INSERT INTO product_content_type (description, has_table, product_content_type_id)
SELECT 'Image - Additional View 3 Detail', 'N', 'XTRA_IMG_3_DETAIL'
WHERE NOT EXISTS (SELECT 1 FROM product_content_type WHERE description = 'Image - Additional View 3 Detail' AND has_table = 'N' AND product_content_type_id = 'XTRA_IMG_3_DETAIL');

INSERT INTO product_content_type (description, has_table, product_content_type_id)
SELECT 'Image - Additional View 4 Small', 'N', 'XTRA_IMG_4_SMALL'
WHERE NOT EXISTS (SELECT 1 FROM product_content_type WHERE description = 'Image - Additional View 4 Small' AND has_table = 'N' AND product_content_type_id = 'XTRA_IMG_4_SMALL');

INSERT INTO product_content_type (description, has_table, product_content_type_id)
SELECT 'Image - Additional View 4 Medium', 'N', 'XTRA_IMG_4_MEDIUM'
WHERE NOT EXISTS (SELECT 1 FROM product_content_type WHERE description = 'Image - Additional View 4 Medium' AND has_table = 'N' AND product_content_type_id = 'XTRA_IMG_4_MEDIUM');

INSERT INTO product_content_type (description, has_table, product_content_type_id)
SELECT 'Image - Additional View 4 Large', 'N', 'XTRA_IMG_4_LARGE'
WHERE NOT EXISTS (SELECT 1 FROM product_content_type WHERE description = 'Image - Additional View 4 Large' AND has_table = 'N' AND product_content_type_id = 'XTRA_IMG_4_LARGE');

INSERT INTO product_content_type (description, has_table, product_content_type_id)
SELECT 'Image - Additional View 4 Detail', 'N', 'XTRA_IMG_4_DETAIL'
WHERE NOT EXISTS (SELECT 1 FROM product_content_type WHERE description = 'Image - Additional View 4 Detail' AND has_table = 'N' AND product_content_type_id = 'XTRA_IMG_4_DETAIL');

INSERT INTO product_content_type (description, has_table, product_content_type_id)
SELECT 'Image - Additional View Small', 'N', 'XTRA_IMG_L_SMALL'
WHERE NOT EXISTS (SELECT 1 FROM product_content_type WHERE description = 'Image - Additional View Small' AND has_table = 'N' AND product_content_type_id = 'XTRA_IMG_L_SMALL');

INSERT INTO product_content_type (description, has_table, product_content_type_id)
SELECT 'Image - Additional View Medium', 'N', 'XTRA_IMG_L_MEDIUM'
WHERE NOT EXISTS (SELECT 1 FROM product_content_type WHERE description = 'Image - Additional View Medium' AND has_table = 'N' AND product_content_type_id = 'XTRA_IMG_L_MEDIUM');

INSERT INTO product_content_type (description, has_table, product_content_type_id)
SELECT 'Image - Additional View Large', 'N', 'XTRA_IMG_L_LARGE'
WHERE NOT EXISTS (SELECT 1 FROM product_content_type WHERE description = 'Image - Additional View Large' AND has_table = 'N' AND product_content_type_id = 'XTRA_IMG_L_LARGE');

INSERT INTO product_content_type (description, has_table, product_content_type_id)
SELECT 'Image - Additional View Detail', 'N', 'XTRA_IMG_L_DETAIL'
WHERE NOT EXISTS (SELECT 1 FROM product_content_type WHERE description = 'Image - Additional View Detail' AND has_table = 'N' AND product_content_type_id = 'XTRA_IMG_L_DETAIL');

INSERT INTO product_content_type (description, has_table, product_content_type_id)
SELECT 'Add To Cart Label', 'N', 'ADDTOCART_LABEL'
WHERE NOT EXISTS (SELECT 1 FROM product_content_type WHERE description = 'Add To Cart Label' AND has_table = 'N' AND product_content_type_id = 'ADDTOCART_LABEL');

INSERT INTO product_content_type (description, has_table, product_content_type_id)
SELECT 'Add To Cart Image', 'N', 'ADDTOCART_IMAGE'
WHERE NOT EXISTS (SELECT 1 FROM product_content_type WHERE description = 'Add To Cart Image' AND has_table = 'N' AND product_content_type_id = 'ADDTOCART_IMAGE');

INSERT INTO product_content_type (description, has_table, product_content_type_id)
SELECT 'Short Sales Pitch', 'N', 'SHORT_SALES_PITCH'
WHERE NOT EXISTS (SELECT 1 FROM product_content_type WHERE description = 'Short Sales Pitch' AND has_table = 'N' AND product_content_type_id = 'SHORT_SALES_PITCH');

INSERT INTO product_content_type (description, has_table, parent_type_id, product_content_type_id)
SELECT 'Installation', 'N', 'DIGITAL_DOWNLOAD', 'INSTALLATION'
WHERE NOT EXISTS (SELECT 1 FROM product_content_type WHERE description = 'Installation' AND has_table = 'N' AND parent_type_id = 'DIGITAL_DOWNLOAD' AND product_content_type_id = 'INSTALLATION');

INSERT INTO product_content_type (description, has_table, parent_type_id, product_content_type_id)
SELECT 'Specification', 'N', 'DIGITAL_DOWNLOAD', 'SPECIFICATION'
WHERE NOT EXISTS (SELECT 1 FROM product_content_type WHERE description = 'Specification' AND has_table = 'N' AND parent_type_id = 'DIGITAL_DOWNLOAD' AND product_content_type_id = 'SPECIFICATION');

INSERT INTO product_content_type (description, has_table, parent_type_id, product_content_type_id)
SELECT 'Warranty', 'N', 'DIGITAL_DOWNLOAD', 'WARRANTY'
WHERE NOT EXISTS (SELECT 1 FROM product_content_type WHERE description = 'Warranty' AND has_table = 'N' AND parent_type_id = 'DIGITAL_DOWNLOAD' AND product_content_type_id = 'WARRANTY');

INSERT INTO product_content_type (description, has_table, product_content_type_id)
SELECT 'Page Title', 'N', 'PAGE_TITLE'
WHERE NOT EXISTS (SELECT 1 FROM product_content_type WHERE description = 'Page Title' AND has_table = 'N' AND product_content_type_id = 'PAGE_TITLE');

INSERT INTO product_content_type (description, has_table, product_content_type_id)
SELECT 'Meta Keyword', 'N', 'META_KEYWORD'
WHERE NOT EXISTS (SELECT 1 FROM product_content_type WHERE description = 'Meta Keyword' AND has_table = 'N' AND product_content_type_id = 'META_KEYWORD');

INSERT INTO product_content_type (description, has_table, product_content_type_id)
SELECT 'Meta Description', 'N', 'META_DESCRIPTION'
WHERE NOT EXISTS (SELECT 1 FROM product_content_type WHERE description = 'Meta Description' AND has_table = 'N' AND product_content_type_id = 'META_DESCRIPTION');

INSERT INTO product_feature_appl_type (description, has_table, product_feature_appl_type_id)
SELECT 'Optional', 'N', 'OPTIONAL_FEATURE'
WHERE NOT EXISTS (SELECT 1 FROM product_feature_appl_type WHERE description = 'Optional' AND has_table = 'N' AND product_feature_appl_type_id = 'OPTIONAL_FEATURE');

INSERT INTO product_feature_appl_type (description, has_table, product_feature_appl_type_id)
SELECT 'Required', 'N', 'REQUIRED_FEATURE'
WHERE NOT EXISTS (SELECT 1 FROM product_feature_appl_type WHERE description = 'Required' AND has_table = 'N' AND product_feature_appl_type_id = 'REQUIRED_FEATURE');

INSERT INTO product_feature_appl_type (description, has_table, product_feature_appl_type_id)
SELECT 'Selectable', 'N', 'SELECTABLE_FEATURE'
WHERE NOT EXISTS (SELECT 1 FROM product_feature_appl_type WHERE description = 'Selectable' AND has_table = 'N' AND product_feature_appl_type_id = 'SELECTABLE_FEATURE');

INSERT INTO product_feature_appl_type (description, has_table, product_feature_appl_type_id)
SELECT 'Standard', 'N', 'STANDARD_FEATURE'
WHERE NOT EXISTS (SELECT 1 FROM product_feature_appl_type WHERE description = 'Standard' AND has_table = 'N' AND product_feature_appl_type_id = 'STANDARD_FEATURE');

INSERT INTO product_feature_appl_type (description, has_table, product_feature_appl_type_id)
SELECT 'Distinguishing', 'N', 'DISTINGUISHING_FEAT'
WHERE NOT EXISTS (SELECT 1 FROM product_feature_appl_type WHERE description = 'Distinguishing' AND has_table = 'N' AND product_feature_appl_type_id = 'DISTINGUISHING_FEAT');

INSERT INTO product_feature_type (description, has_table, product_feature_type_id)
SELECT 'Accessory', 'N', 'ACCESSORY'
WHERE NOT EXISTS (SELECT 1 FROM product_feature_type WHERE description = 'Accessory' AND has_table = 'N' AND product_feature_type_id = 'ACCESSORY');

INSERT INTO product_feature_type (description, has_table, product_feature_type_id)
SELECT 'Amount', 'N', 'AMOUNT'
WHERE NOT EXISTS (SELECT 1 FROM product_feature_type WHERE description = 'Amount' AND has_table = 'N' AND product_feature_type_id = 'AMOUNT');

INSERT INTO product_feature_type (description, has_table, parent_type_id, product_feature_type_id)
SELECT 'Net Weight', 'N', 'AMOUNT', 'NET_WEIGHT'
WHERE NOT EXISTS (SELECT 1 FROM product_feature_type WHERE description = 'Net Weight' AND has_table = 'N' AND parent_type_id = 'AMOUNT' AND product_feature_type_id = 'NET_WEIGHT');

INSERT INTO product_feature_type (description, has_table, product_feature_type_id)
SELECT 'Artist', 'N', 'ARTIST'
WHERE NOT EXISTS (SELECT 1 FROM product_feature_type WHERE description = 'Artist' AND has_table = 'N' AND product_feature_type_id = 'ARTIST');

INSERT INTO product_feature_type (description, has_table, product_feature_type_id)
SELECT 'Billing Feature', 'N', 'BILLING_FEATURE'
WHERE NOT EXISTS (SELECT 1 FROM product_feature_type WHERE description = 'Billing Feature' AND has_table = 'N' AND product_feature_type_id = 'BILLING_FEATURE');

INSERT INTO product_feature_type (description, has_table, product_feature_type_id)
SELECT 'Brand', 'N', 'BRAND'
WHERE NOT EXISTS (SELECT 1 FROM product_feature_type WHERE description = 'Brand' AND has_table = 'N' AND product_feature_type_id = 'BRAND');

INSERT INTO product_feature_type (description, has_table, product_feature_type_id)
SELECT 'Care', 'N', 'CARE'
WHERE NOT EXISTS (SELECT 1 FROM product_feature_type WHERE description = 'Care' AND has_table = 'N' AND product_feature_type_id = 'CARE');

INSERT INTO product_feature_type (description, has_table, product_feature_type_id)
SELECT 'Color', 'N', 'COLOR'
WHERE NOT EXISTS (SELECT 1 FROM product_feature_type WHERE description = 'Color' AND has_table = 'N' AND product_feature_type_id = 'COLOR');

INSERT INTO product_feature_type (description, has_table, product_feature_type_id)
SELECT 'Dimension', 'N', 'DIMENSION'
WHERE NOT EXISTS (SELECT 1 FROM product_feature_type WHERE description = 'Dimension' AND has_table = 'N' AND product_feature_type_id = 'DIMENSION');

INSERT INTO product_feature_type (description, has_table, product_feature_type_id)
SELECT 'Equipment Class', 'N', 'EQUIP_CLASS'
WHERE NOT EXISTS (SELECT 1 FROM product_feature_type WHERE description = 'Equipment Class' AND has_table = 'N' AND product_feature_type_id = 'EQUIP_CLASS');

INSERT INTO product_feature_type (description, has_table, product_feature_type_id)
SELECT 'Fabric', 'N', 'FABRIC'
WHERE NOT EXISTS (SELECT 1 FROM product_feature_type WHERE description = 'Fabric' AND has_table = 'N' AND product_feature_type_id = 'FABRIC');

INSERT INTO product_feature_type (description, has_table, product_feature_type_id)
SELECT 'Genre', 'N', 'GENRE'
WHERE NOT EXISTS (SELECT 1 FROM product_feature_type WHERE description = 'Genre' AND has_table = 'N' AND product_feature_type_id = 'GENRE');

INSERT INTO product_feature_type (description, has_table, product_feature_type_id)
SELECT 'Gift Wrap', 'N', 'GIFT_WRAP'
WHERE NOT EXISTS (SELECT 1 FROM product_feature_type WHERE description = 'Gift Wrap' AND has_table = 'N' AND product_feature_type_id = 'GIFT_WRAP');

INSERT INTO product_feature_type (description, has_table, product_feature_type_id)
SELECT 'Hardware Feature', 'N', 'HARDWARE_FEATURE'
WHERE NOT EXISTS (SELECT 1 FROM product_feature_type WHERE description = 'Hardware Feature' AND has_table = 'N' AND product_feature_type_id = 'HARDWARE_FEATURE');

INSERT INTO product_feature_type (description, has_table, product_feature_type_id)
SELECT 'Hazmat', 'N', 'HAZMAT'
WHERE NOT EXISTS (SELECT 1 FROM product_feature_type WHERE description = 'Hazmat' AND has_table = 'N' AND product_feature_type_id = 'HAZMAT');

INSERT INTO product_feature_type (description, has_table, product_feature_type_id)
SELECT 'License', 'N', 'LICENSE'
WHERE NOT EXISTS (SELECT 1 FROM product_feature_type WHERE description = 'License' AND has_table = 'N' AND product_feature_type_id = 'LICENSE');

INSERT INTO product_feature_type (description, has_table, product_feature_type_id)
SELECT 'Origin', 'N', 'ORIGIN'
WHERE NOT EXISTS (SELECT 1 FROM product_feature_type WHERE description = 'Origin' AND has_table = 'N' AND product_feature_type_id = 'ORIGIN');

INSERT INTO product_feature_type (description, has_table, product_feature_type_id)
SELECT 'Other Feature', 'N', 'OTHER_FEATURE'
WHERE NOT EXISTS (SELECT 1 FROM product_feature_type WHERE description = 'Other Feature' AND has_table = 'N' AND product_feature_type_id = 'OTHER_FEATURE');

INSERT INTO product_feature_type (description, has_table, product_feature_type_id)
SELECT 'Product Quality', 'N', 'PRODUCT_QUALITY'
WHERE NOT EXISTS (SELECT 1 FROM product_feature_type WHERE description = 'Product Quality' AND has_table = 'N' AND product_feature_type_id = 'PRODUCT_QUALITY');

INSERT INTO product_feature_type (description, has_table, product_feature_type_id)
SELECT 'Size', 'N', 'SIZE'
WHERE NOT EXISTS (SELECT 1 FROM product_feature_type WHERE description = 'Size' AND has_table = 'N' AND product_feature_type_id = 'SIZE');

INSERT INTO product_feature_type (description, has_table, product_feature_type_id)
SELECT 'Software Feature', 'N', 'SOFTWARE_FEATURE'
WHERE NOT EXISTS (SELECT 1 FROM product_feature_type WHERE description = 'Software Feature' AND has_table = 'N' AND product_feature_type_id = 'SOFTWARE_FEATURE');

INSERT INTO product_feature_type (description, has_table, product_feature_type_id)
SELECT 'Style', 'N', 'STYLE'
WHERE NOT EXISTS (SELECT 1 FROM product_feature_type WHERE description = 'Style' AND has_table = 'N' AND product_feature_type_id = 'STYLE');

INSERT INTO product_feature_type (description, has_table, product_feature_type_id)
SELECT 'Symptom', 'N', 'SYMPTOM'
WHERE NOT EXISTS (SELECT 1 FROM product_feature_type WHERE description = 'Symptom' AND has_table = 'N' AND product_feature_type_id = 'SYMPTOM');

INSERT INTO product_feature_type (description, has_table, product_feature_type_id)
SELECT 'Topic', 'N', 'TOPIC'
WHERE NOT EXISTS (SELECT 1 FROM product_feature_type WHERE description = 'Topic' AND has_table = 'N' AND product_feature_type_id = 'TOPIC');

INSERT INTO product_feature_type (description, has_table, product_feature_type_id)
SELECT 'Type', 'N', 'TYPE'
WHERE NOT EXISTS (SELECT 1 FROM product_feature_type WHERE description = 'Type' AND has_table = 'N' AND product_feature_type_id = 'TYPE');

INSERT INTO product_feature_type (description, has_table, product_feature_type_id)
SELECT 'Warranty', 'N', 'WARRANTY'
WHERE NOT EXISTS (SELECT 1 FROM product_feature_type WHERE description = 'Warranty' AND has_table = 'N' AND product_feature_type_id = 'WARRANTY');

INSERT INTO product_feature_type (description, has_table, product_feature_type_id)
SELECT 'Model Year', 'N', 'MODEL_YEAR'
WHERE NOT EXISTS (SELECT 1 FROM product_feature_type WHERE description = 'Model Year' AND has_table = 'N' AND product_feature_type_id = 'MODEL_YEAR');

INSERT INTO product_feature_type (description, has_table, product_feature_type_id)
SELECT 'Year Made', 'N', 'YEAR_MADE'
WHERE NOT EXISTS (SELECT 1 FROM product_feature_type WHERE description = 'Year Made' AND has_table = 'N' AND product_feature_type_id = 'YEAR_MADE');

INSERT INTO product_price_type (description, product_price_type_id)
SELECT 'List Price', 'LIST_PRICE'
WHERE NOT EXISTS (SELECT 1 FROM product_price_type WHERE description = 'List Price' AND product_price_type_id = 'LIST_PRICE');

INSERT INTO product_price_type (description, product_price_type_id)
SELECT 'Default Price', 'DEFAULT_PRICE'
WHERE NOT EXISTS (SELECT 1 FROM product_price_type WHERE description = 'Default Price' AND product_price_type_id = 'DEFAULT_PRICE');

INSERT INTO product_price_type (description, product_price_type_id)
SELECT 'Average Cost', 'AVERAGE_COST'
WHERE NOT EXISTS (SELECT 1 FROM product_price_type WHERE description = 'Average Cost' AND product_price_type_id = 'AVERAGE_COST');

INSERT INTO product_price_type (description, product_price_type_id)
SELECT 'Minimum Price', 'MINIMUM_PRICE'
WHERE NOT EXISTS (SELECT 1 FROM product_price_type WHERE description = 'Minimum Price' AND product_price_type_id = 'MINIMUM_PRICE');

INSERT INTO product_price_type (description, product_price_type_id)
SELECT 'Maximum Price', 'MAXIMUM_PRICE'
WHERE NOT EXISTS (SELECT 1 FROM product_price_type WHERE description = 'Maximum Price' AND product_price_type_id = 'MAXIMUM_PRICE');

INSERT INTO product_price_type (description, product_price_type_id)
SELECT 'Promotional Price', 'PROMO_PRICE'
WHERE NOT EXISTS (SELECT 1 FROM product_price_type WHERE description = 'Promotional Price' AND product_price_type_id = 'PROMO_PRICE');

INSERT INTO product_price_type (description, product_price_type_id)
SELECT 'Competitive Price', 'COMPETITIVE_PRICE'
WHERE NOT EXISTS (SELECT 1 FROM product_price_type WHERE description = 'Competitive Price' AND product_price_type_id = 'COMPETITIVE_PRICE');

INSERT INTO product_price_type (description, product_price_type_id)
SELECT 'Wholesale Price', 'WHOLESALE_PRICE'
WHERE NOT EXISTS (SELECT 1 FROM product_price_type WHERE description = 'Wholesale Price' AND product_price_type_id = 'WHOLESALE_PRICE');

INSERT INTO product_price_type (description, product_price_type_id)
SELECT 'Special Promo Price', 'SPECIAL_PROMO_PRICE'
WHERE NOT EXISTS (SELECT 1 FROM product_price_type WHERE description = 'Special Promo Price' AND product_price_type_id = 'SPECIAL_PROMO_PRICE');

INSERT INTO product_price_type (description, product_price_type_id)
SELECT 'Box Price', 'BOX_PRICE'
WHERE NOT EXISTS (SELECT 1 FROM product_price_type WHERE description = 'Box Price' AND product_price_type_id = 'BOX_PRICE');

INSERT INTO product_price_type (description, product_price_type_id)
SELECT 'Minimum Order Price', 'MINIMUM_ORDER_PRICE'
WHERE NOT EXISTS (SELECT 1 FROM product_price_type WHERE description = 'Minimum Order Price' AND product_price_type_id = 'MINIMUM_ORDER_PRICE');

INSERT INTO product_price_type (description, product_price_type_id)
SELECT 'Shipping Allowance Price', 'SHIPPING_ALLOWANCE'
WHERE NOT EXISTS (SELECT 1 FROM product_price_type WHERE description = 'Shipping Allowance Price' AND product_price_type_id = 'SHIPPING_ALLOWANCE');

INSERT INTO product_type (description, has_table, is_digital, is_physical, product_type_id)
SELECT 'Fixed Asset Usage', 'N', 'N', 'Y', 'ASSET_USAGE'
WHERE NOT EXISTS (SELECT 1 FROM product_type WHERE description = 'Fixed Asset Usage' AND has_table = 'N' AND is_digital = 'N' AND is_physical = 'Y' AND product_type_id = 'ASSET_USAGE');

INSERT INTO product_type (description, has_table, is_digital, is_physical, product_type_id)
SELECT 'Service', 'N', 'N', 'N', 'SERVICE'
WHERE NOT EXISTS (SELECT 1 FROM product_type WHERE description = 'Service' AND has_table = 'N' AND is_digital = 'N' AND is_physical = 'N' AND product_type_id = 'SERVICE');

INSERT INTO product_type (description, has_table, is_digital, is_physical, product_type_id)
SELECT 'Good', 'N', 'N', 'Y', 'GOOD'
WHERE NOT EXISTS (SELECT 1 FROM product_type WHERE description = 'Good' AND has_table = 'N' AND is_digital = 'N' AND is_physical = 'Y' AND product_type_id = 'GOOD');

INSERT INTO product_type (description, has_table, is_digital, is_physical, parent_type_id, product_type_id)
SELECT 'Raw Material', 'N', 'N', 'Y', 'GOOD', 'RAW_MATERIAL'
WHERE NOT EXISTS (SELECT 1 FROM product_type WHERE description = 'Raw Material' AND has_table = 'N' AND is_digital = 'N' AND is_physical = 'Y' AND parent_type_id = 'GOOD' AND product_type_id = 'RAW_MATERIAL');

INSERT INTO product_type (description, has_table, is_digital, is_physical, parent_type_id, product_type_id)
SELECT 'Subassembly', 'N', 'N', 'Y', 'GOOD', 'SUBASSEMBLY'
WHERE NOT EXISTS (SELECT 1 FROM product_type WHERE description = 'Subassembly' AND has_table = 'N' AND is_digital = 'N' AND is_physical = 'Y' AND parent_type_id = 'GOOD' AND product_type_id = 'SUBASSEMBLY');

INSERT INTO product_type (description, has_table, is_digital, is_physical, parent_type_id, product_type_id)
SELECT 'Finished Good', 'N', 'N', 'Y', 'GOOD', 'FINISHED_GOOD'
WHERE NOT EXISTS (SELECT 1 FROM product_type WHERE description = 'Finished Good' AND has_table = 'N' AND is_digital = 'N' AND is_physical = 'Y' AND parent_type_id = 'GOOD' AND product_type_id = 'FINISHED_GOOD');

INSERT INTO product_type (description, has_table, is_digital, is_physical, parent_type_id, product_type_id)
SELECT 'Digital Good', 'N', 'Y', 'N', 'GOOD', 'DIGITAL_GOOD'
WHERE NOT EXISTS (SELECT 1 FROM product_type WHERE description = 'Digital Good' AND has_table = 'N' AND is_digital = 'Y' AND is_physical = 'N' AND parent_type_id = 'GOOD' AND product_type_id = 'DIGITAL_GOOD');

INSERT INTO product_type (description, has_table, is_digital, is_physical, parent_type_id, product_type_id)
SELECT 'Finished/Digital Good', 'N', 'Y', 'Y', 'GOOD', 'FINDIG_GOOD'
WHERE NOT EXISTS (SELECT 1 FROM product_type WHERE description = 'Finished/Digital Good' AND has_table = 'N' AND is_digital = 'Y' AND is_physical = 'Y' AND parent_type_id = 'GOOD' AND product_type_id = 'FINDIG_GOOD');

INSERT INTO product_type (description, has_table, is_digital, is_physical, parent_type_id, product_type_id)
SELECT 'Configurable Good', 'N', 'N', 'Y', 'GOOD', 'AGGREGATED'
WHERE NOT EXISTS (SELECT 1 FROM product_type WHERE description = 'Configurable Good' AND has_table = 'N' AND is_digital = 'N' AND is_physical = 'Y' AND parent_type_id = 'GOOD' AND product_type_id = 'AGGREGATED');

INSERT INTO product_type (description, has_table, is_digital, is_physical, parent_type_id, product_type_id)
SELECT 'Marketing Package', 'N', 'N', 'Y', 'GOOD', 'MARKETING_PKG'
WHERE NOT EXISTS (SELECT 1 FROM product_type WHERE description = 'Marketing Package' AND has_table = 'N' AND is_digital = 'N' AND is_physical = 'Y' AND parent_type_id = 'GOOD' AND product_type_id = 'MARKETING_PKG');

INSERT INTO product_type (description, has_table, is_digital, is_physical, parent_type_id, product_type_id)
SELECT 'Marketing Package: Auto Manufactured', 'N', 'N', 'Y', 'MARKETING_PKG', 'MARKETING_PKG_AUTO'
WHERE NOT EXISTS (SELECT 1 FROM product_type WHERE description = 'Marketing Package: Auto Manufactured' AND has_table = 'N' AND is_digital = 'N' AND is_physical = 'Y' AND parent_type_id = 'MARKETING_PKG' AND product_type_id = 'MARKETING_PKG_AUTO');

INSERT INTO product_type (description, has_table, is_digital, is_physical, parent_type_id, product_type_id)
SELECT 'Marketing Package: Pick Assembly', 'N', 'N', 'Y', 'MARKETING_PKG', 'MARKETING_PKG_PICK'
WHERE NOT EXISTS (SELECT 1 FROM product_type WHERE description = 'Marketing Package: Pick Assembly' AND has_table = 'N' AND is_digital = 'N' AND is_physical = 'Y' AND parent_type_id = 'MARKETING_PKG' AND product_type_id = 'MARKETING_PKG_PICK');

INSERT INTO product_type (description, has_table, is_digital, is_physical, parent_type_id, product_type_id)
SELECT 'Work In Process', 'N', 'N', 'Y', 'GOOD', 'WIP'
WHERE NOT EXISTS (SELECT 1 FROM product_type WHERE description = 'Work In Process' AND has_table = 'N' AND is_digital = 'N' AND is_physical = 'Y' AND parent_type_id = 'GOOD' AND product_type_id = 'WIP');

INSERT INTO product_type (description, has_table, is_digital, is_physical, parent_type_id, product_type_id)
SELECT 'Configurable Good Configuration', 'N', 'N', 'Y', 'AGGREGATED', 'AGGREGATED_CONF'
WHERE NOT EXISTS (SELECT 1 FROM product_type WHERE description = 'Configurable Good Configuration' AND has_table = 'N' AND is_digital = 'N' AND is_physical = 'Y' AND parent_type_id = 'AGGREGATED' AND product_type_id = 'AGGREGATED_CONF');

INSERT INTO product_type (description, has_table, is_digital, is_physical, product_type_id)
SELECT 'Fixed Asset Usage For Rental of an asset which is shipped from and returned to inventory', 'N', 'N', 'Y', 'ASSET_USAGE_OUT_IN'
WHERE NOT EXISTS (SELECT 1 FROM product_type WHERE description = 'Fixed Asset Usage For Rental of an asset which is shipped from and returned to inventory' AND has_table = 'N' AND is_digital = 'N' AND is_physical = 'Y' AND product_type_id = 'ASSET_USAGE_OUT_IN');

INSERT INTO product_type (description, has_table, is_digital, is_physical, product_type_id)
SELECT 'Service a product using inventory', 'N', 'N', 'Y', 'SERVICE_PRODUCT'
WHERE NOT EXISTS (SELECT 1 FROM product_type WHERE description = 'Service a product using inventory' AND has_table = 'N' AND is_digital = 'N' AND is_physical = 'Y' AND product_type_id = 'SERVICE_PRODUCT');

INSERT INTO product_type (description, has_table, is_digital, is_physical, parent_type_id, product_type_id)
SELECT 'Configurable Service using inventory', 'N', 'N', 'Y', 'SERVICE_PRODUCT', 'AGGREGATED_SERVICE'
WHERE NOT EXISTS (SELECT 1 FROM product_type WHERE description = 'Configurable Service using inventory' AND has_table = 'N' AND is_digital = 'N' AND is_physical = 'Y' AND parent_type_id = 'SERVICE_PRODUCT' AND product_type_id = 'AGGREGATED_SERVICE');

INSERT INTO product_type (description, has_table, is_digital, is_physical, parent_type_id, product_type_id)
SELECT 'Configurable Service Configuration', 'N', 'N', 'Y', 'AGGREGATED', 'AGGREGATEDSERV_CONF'
WHERE NOT EXISTS (SELECT 1 FROM product_type WHERE description = 'Configurable Service Configuration' AND has_table = 'N' AND is_digital = 'N' AND is_physical = 'Y' AND parent_type_id = 'AGGREGATED' AND product_type_id = 'AGGREGATEDSERV_CONF');

INSERT INTO product_content_type (description, has_table, product_content_type_id)
SELECT 'Image', 'N', 'IMAGE'
WHERE NOT EXISTS (SELECT 1 FROM product_content_type WHERE description = 'Image' AND has_table = 'N' AND product_content_type_id = 'IMAGE');

INSERT INTO product_content_type (description, has_table, product_content_type_id)
SELECT 'Default Image', 'N', 'DEFAULT_IMAGE'
WHERE NOT EXISTS (SELECT 1 FROM product_content_type WHERE description = 'Default Image' AND has_table = 'N' AND product_content_type_id = 'DEFAULT_IMAGE');

INSERT INTO facility_type (description, facility_type_id, has_table)
SELECT 'Building', 'BUILDING', 'N'
WHERE NOT EXISTS (SELECT 1 FROM facility_type WHERE description = 'Building' AND facility_type_id = 'BUILDING' AND has_table = 'N');

INSERT INTO facility_type (description, facility_type_id, has_table)
SELECT 'Floor', 'FLOOR', 'N'
WHERE NOT EXISTS (SELECT 1 FROM facility_type WHERE description = 'Floor' AND facility_type_id = 'FLOOR' AND has_table = 'N');

INSERT INTO facility_type (description, facility_type_id, has_table)
SELECT 'Office', 'OFFICE', 'N'
WHERE NOT EXISTS (SELECT 1 FROM facility_type WHERE description = 'Office' AND facility_type_id = 'OFFICE' AND has_table = 'N');

INSERT INTO facility_type (description, facility_type_id, has_table)
SELECT 'Call Center', 'CALL_CENTER', 'N'
WHERE NOT EXISTS (SELECT 1 FROM facility_type WHERE description = 'Call Center' AND facility_type_id = 'CALL_CENTER' AND has_table = 'N');

INSERT INTO facility_type (description, facility_type_id, has_table)
SELECT 'Plant', 'PLANT', 'N'
WHERE NOT EXISTS (SELECT 1 FROM facility_type WHERE description = 'Plant' AND facility_type_id = 'PLANT' AND has_table = 'N');

INSERT INTO facility_type (description, facility_type_id, has_table)
SELECT 'Room', 'ROOM', 'N'
WHERE NOT EXISTS (SELECT 1 FROM facility_type WHERE description = 'Room' AND facility_type_id = 'ROOM' AND has_table = 'N');

INSERT INTO facility_type (description, facility_type_id, has_table)
SELECT 'Retail Store', 'RETAIL_STORE', 'N'
WHERE NOT EXISTS (SELECT 1 FROM facility_type WHERE description = 'Retail Store' AND facility_type_id = 'RETAIL_STORE' AND has_table = 'N');

INSERT INTO facility_type (description, facility_type_id, has_table)
SELECT 'Warehouse', 'WAREHOUSE', 'N'
WHERE NOT EXISTS (SELECT 1 FROM facility_type WHERE description = 'Warehouse' AND facility_type_id = 'WAREHOUSE' AND has_table = 'N');

INSERT INTO inventory_item_type (description, has_table, inventory_item_type_id)
SELECT 'Serialized', 'N', 'SERIALIZED_INV_ITEM'
WHERE NOT EXISTS (SELECT 1 FROM inventory_item_type WHERE description = 'Serialized' AND has_table = 'N' AND inventory_item_type_id = 'SERIALIZED_INV_ITEM');

INSERT INTO inventory_item_type (description, has_table, inventory_item_type_id)
SELECT 'Non-Serialized', 'N', 'NON_SERIAL_INV_ITEM'
WHERE NOT EXISTS (SELECT 1 FROM inventory_item_type WHERE description = 'Non-Serialized' AND has_table = 'N' AND inventory_item_type_id = 'NON_SERIAL_INV_ITEM');

INSERT INTO variance_reason (description, variance_reason_id)
SELECT 'Lost', 'VAR_LOST'
WHERE NOT EXISTS (SELECT 1 FROM variance_reason WHERE description = 'Lost' AND variance_reason_id = 'VAR_LOST');

INSERT INTO variance_reason (description, variance_reason_id)
SELECT 'Stolen', 'VAR_STOLEN'
WHERE NOT EXISTS (SELECT 1 FROM variance_reason WHERE description = 'Stolen' AND variance_reason_id = 'VAR_STOLEN');

INSERT INTO variance_reason (description, variance_reason_id)
SELECT 'Found', 'VAR_FOUND'
WHERE NOT EXISTS (SELECT 1 FROM variance_reason WHERE description = 'Found' AND variance_reason_id = 'VAR_FOUND');

INSERT INTO variance_reason (description, variance_reason_id)
SELECT 'Damaged', 'VAR_DAMAGED'
WHERE NOT EXISTS (SELECT 1 FROM variance_reason WHERE description = 'Damaged' AND variance_reason_id = 'VAR_DAMAGED');

INSERT INTO variance_reason (description, variance_reason_id)
SELECT 'Integration', 'VAR_INTEGR'
WHERE NOT EXISTS (SELECT 1 FROM variance_reason WHERE description = 'Integration' AND variance_reason_id = 'VAR_INTEGR');

INSERT INTO variance_reason (description, variance_reason_id)
SELECT 'Sample (Giveaway)', 'VAR_SAMPLE'
WHERE NOT EXISTS (SELECT 1 FROM variance_reason WHERE description = 'Sample (Giveaway)' AND variance_reason_id = 'VAR_SAMPLE');

INSERT INTO variance_reason (description, variance_reason_id)
SELECT 'Mis-shipped Item Ordered (+)', 'VAR_MISSHIP_ORDERED'
WHERE NOT EXISTS (SELECT 1 FROM variance_reason WHERE description = 'Mis-shipped Item Ordered (+)' AND variance_reason_id = 'VAR_MISSHIP_ORDERED');

INSERT INTO variance_reason (description, variance_reason_id)
SELECT 'Mis-shipped Item Shipped (-)', 'VAR_MISSHIP_SHIPPED'
WHERE NOT EXISTS (SELECT 1 FROM variance_reason WHERE description = 'Mis-shipped Item Shipped (-)' AND variance_reason_id = 'VAR_MISSHIP_SHIPPED');

INSERT INTO content_type (content_type_id, description)
SELECT 'IMAGE_FRAME', 'Frame Image'
WHERE NOT EXISTS (SELECT 1 FROM content_type WHERE content_type_id = 'IMAGE_FRAME' AND description = 'Frame Image');

INSERT INTO content_assoc_type (content_assoc_type_id, description)
SELECT 'IMAGE_THUMBNAIL', 'Image Thumbnail'
WHERE NOT EXISTS (SELECT 1 FROM content_assoc_type WHERE content_assoc_type_id = 'IMAGE_THUMBNAIL' AND description = 'Image Thumbnail');

INSERT INTO product_feature_category (description, product_feature_category_id)
SELECT 'Image', 'IMAGE'
WHERE NOT EXISTS (SELECT 1 FROM product_feature_category WHERE description = 'Image' AND product_feature_category_id = 'IMAGE');

INSERT INTO product_feature_category (description, product_feature_category_id)
SELECT 'Text', 'TEXT'
WHERE NOT EXISTS (SELECT 1 FROM product_feature_category WHERE description = 'Text' AND product_feature_category_id = 'TEXT');

INSERT INTO product_feature (abbrev, default_sequence_num, description, product_feature_category_id, product_feature_id, product_feature_type_id)
SELECT '100x75', '1', '100 X 75 (avatar)', 'IMAGE', 'IMAGE_AVATAR', 'SIZE'
WHERE NOT EXISTS (SELECT 1 FROM product_feature WHERE abbrev = '100x75' AND default_sequence_num = '1' AND description = '100 X 75 (avatar)' AND product_feature_category_id = 'IMAGE' AND product_feature_id = 'IMAGE_AVATAR' AND product_feature_type_id = 'SIZE');

INSERT INTO product_feature (abbrev, default_sequence_num, description, product_feature_category_id, product_feature_id, product_feature_type_id)
SELECT '150x112', '2', '150 X 112 (thumbnail)', 'IMAGE', 'IMAGE_THUMBNAIL', 'SIZE'
WHERE NOT EXISTS (SELECT 1 FROM product_feature WHERE abbrev = '150x112' AND default_sequence_num = '2' AND description = '150 X 112 (thumbnail)' AND product_feature_category_id = 'IMAGE' AND product_feature_id = 'IMAGE_THUMBNAIL' AND product_feature_type_id = 'SIZE');

INSERT INTO product_feature (abbrev, default_sequence_num, description, product_feature_category_id, product_feature_id, product_feature_type_id)
SELECT '320x240', '3', '320 X 240 (for websites and email)', 'IMAGE', 'IMAGE_WEBSITE', 'SIZE'
WHERE NOT EXISTS (SELECT 1 FROM product_feature WHERE abbrev = '320x240' AND default_sequence_num = '3' AND description = '320 X 240 (for websites and email)' AND product_feature_category_id = 'IMAGE' AND product_feature_id = 'IMAGE_WEBSITE' AND product_feature_type_id = 'SIZE');

INSERT INTO product_feature (abbrev, default_sequence_num, description, product_feature_category_id, product_feature_id, product_feature_type_id)
SELECT '640x480', '4', '640 X 480 (for message boards)', 'IMAGE', 'IMAGE_BOARD', 'SIZE'
WHERE NOT EXISTS (SELECT 1 FROM product_feature WHERE abbrev = '640x480' AND default_sequence_num = '4' AND description = '640 X 480 (for message boards)' AND product_feature_category_id = 'IMAGE' AND product_feature_id = 'IMAGE_BOARD' AND product_feature_type_id = 'SIZE');

INSERT INTO product_feature (abbrev, default_sequence_num, description, product_feature_category_id, product_feature_id, product_feature_type_id)
SELECT '800x600', '5', '800 X 600 (15-inch monitor)', 'IMAGE', 'IMAGE_MONITOR15', 'SIZE'
WHERE NOT EXISTS (SELECT 1 FROM product_feature WHERE abbrev = '800x600' AND default_sequence_num = '5' AND description = '800 X 600 (15-inch monitor)' AND product_feature_category_id = 'IMAGE' AND product_feature_id = 'IMAGE_MONITOR15' AND product_feature_type_id = 'SIZE');

INSERT INTO product_feature (abbrev, default_sequence_num, description, product_feature_category_id, product_feature_id, product_feature_type_id)
SELECT '1024x768', '6', '1024 X 768 (17-inch monitor)', 'IMAGE', 'IMAGE_MONITOR17', 'SIZE'
WHERE NOT EXISTS (SELECT 1 FROM product_feature WHERE abbrev = '1024x768' AND default_sequence_num = '6' AND description = '1024 X 768 (17-inch monitor)' AND product_feature_category_id = 'IMAGE' AND product_feature_id = 'IMAGE_MONITOR17' AND product_feature_type_id = 'SIZE');

INSERT INTO product_feature (abbrev, default_sequence_num, description, product_feature_category_id, product_feature_id, product_feature_type_id)
SELECT '1280x1024', '7', '1280 X 1024 (19-inch monitor)', 'IMAGE', 'IMAGE_MONITOR19', 'SIZE'
WHERE NOT EXISTS (SELECT 1 FROM product_feature WHERE abbrev = '1280x1024' AND default_sequence_num = '7' AND description = '1280 X 1024 (19-inch monitor)' AND product_feature_category_id = 'IMAGE' AND product_feature_id = 'IMAGE_MONITOR19' AND product_feature_type_id = 'SIZE');

INSERT INTO product_feature (abbrev, default_sequence_num, description, product_feature_category_id, product_feature_id, product_feature_type_id)
SELECT '1600x1200', '8', '1600 X 1200 (21-inch monitor)', 'IMAGE', 'IMAGE_MONITOR21', 'SIZE'
WHERE NOT EXISTS (SELECT 1 FROM product_feature WHERE abbrev = '1600x1200' AND default_sequence_num = '8' AND description = '1600 X 1200 (21-inch monitor)' AND product_feature_category_id = 'IMAGE' AND product_feature_id = 'IMAGE_MONITOR21' AND product_feature_type_id = 'SIZE');

INSERT INTO product_feature (default_sequence_num, description, product_feature_category_id, product_feature_id, product_feature_type_id)
SELECT '1', 'Small', 'TEXT', 'TEXT_SMALL', 'SIZE'
WHERE NOT EXISTS (SELECT 1 FROM product_feature WHERE default_sequence_num = '1' AND description = 'Small' AND product_feature_category_id = 'TEXT' AND product_feature_id = 'TEXT_SMALL' AND product_feature_type_id = 'SIZE');

INSERT INTO product_feature (default_sequence_num, description, product_feature_category_id, product_feature_id, product_feature_type_id)
SELECT '2', 'Middle', 'TEXT', 'TEXT_MIDDLE', 'SIZE'
WHERE NOT EXISTS (SELECT 1 FROM product_feature WHERE default_sequence_num = '2' AND description = 'Middle' AND product_feature_category_id = 'TEXT' AND product_feature_id = 'TEXT_MIDDLE' AND product_feature_type_id = 'SIZE');

INSERT INTO product_feature (default_sequence_num, description, product_feature_category_id, product_feature_id, product_feature_type_id)
SELECT '3', 'Large', 'TEXT', 'TEXT_LARGE', 'SIZE'
WHERE NOT EXISTS (SELECT 1 FROM product_feature WHERE default_sequence_num = '3' AND description = 'Large' AND product_feature_category_id = 'TEXT' AND product_feature_id = 'TEXT_LARGE' AND product_feature_type_id = 'SIZE');

INSERT INTO product_feature (default_sequence_num, description, product_feature_category_id, product_feature_id, product_feature_type_id)
SELECT '4', 'Very Large', 'TEXT', 'TEXT_VERYLARGE', 'SIZE'
WHERE NOT EXISTS (SELECT 1 FROM product_feature WHERE default_sequence_num = '4' AND description = 'Very Large' AND product_feature_category_id = 'TEXT' AND product_feature_id = 'TEXT_VERYLARGE' AND product_feature_type_id = 'SIZE');

INSERT INTO product_feature (default_sequence_num, description, product_feature_category_id, product_feature_id, product_feature_type_id)
SELECT '1', 'White', 'TEXT', 'TEXT_WHITE', 'COLOR'
WHERE NOT EXISTS (SELECT 1 FROM product_feature WHERE default_sequence_num = '1' AND description = 'White' AND product_feature_category_id = 'TEXT' AND product_feature_id = 'TEXT_WHITE' AND product_feature_type_id = 'COLOR');

INSERT INTO product_feature (default_sequence_num, description, product_feature_category_id, product_feature_id, product_feature_type_id)
SELECT '2', 'Gray', 'TEXT', 'TEXT_GRAY', 'COLOR'
WHERE NOT EXISTS (SELECT 1 FROM product_feature WHERE default_sequence_num = '2' AND description = 'Gray' AND product_feature_category_id = 'TEXT' AND product_feature_id = 'TEXT_GRAY' AND product_feature_type_id = 'COLOR');

INSERT INTO product_feature (default_sequence_num, description, product_feature_category_id, product_feature_id, product_feature_type_id)
SELECT '3', 'Black', 'TEXT', 'TEXT_BLACK', 'COLOR'
WHERE NOT EXISTS (SELECT 1 FROM product_feature WHERE default_sequence_num = '3' AND description = 'Black' AND product_feature_category_id = 'TEXT' AND product_feature_id = 'TEXT_BLACK' AND product_feature_type_id = 'COLOR');

INSERT INTO product_feature (default_sequence_num, description, product_feature_category_id, product_feature_id, product_feature_type_id)
SELECT '4', 'Red', 'TEXT', 'TEXT_RED', 'COLOR'
WHERE NOT EXISTS (SELECT 1 FROM product_feature WHERE default_sequence_num = '4' AND description = 'Red' AND product_feature_category_id = 'TEXT' AND product_feature_id = 'TEXT_RED' AND product_feature_type_id = 'COLOR');

INSERT INTO product_feature (default_sequence_num, description, product_feature_category_id, product_feature_id, product_feature_type_id)
SELECT '5', 'Green', 'TEXT', 'TEXT_GREEN', 'COLOR'
WHERE NOT EXISTS (SELECT 1 FROM product_feature WHERE default_sequence_num = '5' AND description = 'Green' AND product_feature_category_id = 'TEXT' AND product_feature_id = 'TEXT_GREEN' AND product_feature_type_id = 'COLOR');

INSERT INTO product_feature (default_sequence_num, description, product_feature_category_id, product_feature_id, product_feature_type_id)
SELECT '6', 'Blue', 'TEXT', 'TEXT_BLUE', 'COLOR'
WHERE NOT EXISTS (SELECT 1 FROM product_feature WHERE default_sequence_num = '6' AND description = 'Blue' AND product_feature_category_id = 'TEXT' AND product_feature_id = 'TEXT_BLUE' AND product_feature_type_id = 'COLOR');

INSERT INTO product_feature (default_sequence_num, description, product_feature_category_id, product_feature_id, product_feature_type_id)
SELECT '7', 'Yellow', 'TEXT', 'TEXT_YELLOW', 'COLOR'
WHERE NOT EXISTS (SELECT 1 FROM product_feature WHERE default_sequence_num = '7' AND description = 'Yellow' AND product_feature_category_id = 'TEXT' AND product_feature_id = 'TEXT_YELLOW' AND product_feature_type_id = 'COLOR');

INSERT INTO shipment_contact_mech_type (description, shipment_contact_mech_type_id)
SELECT 'Ship-To Address', 'SHIP_TO_ADDRESS'
WHERE NOT EXISTS (SELECT 1 FROM shipment_contact_mech_type WHERE description = 'Ship-To Address' AND shipment_contact_mech_type_id = 'SHIP_TO_ADDRESS');

INSERT INTO shipment_contact_mech_type (description, shipment_contact_mech_type_id)
SELECT 'Ship-From Address', 'SHIP_FROM_ADDRESS'
WHERE NOT EXISTS (SELECT 1 FROM shipment_contact_mech_type WHERE description = 'Ship-From Address' AND shipment_contact_mech_type_id = 'SHIP_FROM_ADDRESS');

INSERT INTO shipment_contact_mech_type (description, shipment_contact_mech_type_id)
SELECT 'Ship-To Telecom Number', 'SHIP_TO_TELECOM'
WHERE NOT EXISTS (SELECT 1 FROM shipment_contact_mech_type WHERE description = 'Ship-To Telecom Number' AND shipment_contact_mech_type_id = 'SHIP_TO_TELECOM');

INSERT INTO shipment_contact_mech_type (description, shipment_contact_mech_type_id)
SELECT 'Ship-From Telecom Number', 'SHIP_FROM_TELECOM'
WHERE NOT EXISTS (SELECT 1 FROM shipment_contact_mech_type WHERE description = 'Ship-From Telecom Number' AND shipment_contact_mech_type_id = 'SHIP_FROM_TELECOM');

INSERT INTO shipment_contact_mech_type (description, shipment_contact_mech_type_id)
SELECT 'Ship-To E-Mail', 'SHIP_TO_EMAIL'
WHERE NOT EXISTS (SELECT 1 FROM shipment_contact_mech_type WHERE description = 'Ship-To E-Mail' AND shipment_contact_mech_type_id = 'SHIP_TO_EMAIL');

INSERT INTO shipment_contact_mech_type (description, shipment_contact_mech_type_id)
SELECT 'Ship-From E-Mail', 'SHIP_FROM_EMAIL'
WHERE NOT EXISTS (SELECT 1 FROM shipment_contact_mech_type WHERE description = 'Ship-From E-Mail' AND shipment_contact_mech_type_id = 'SHIP_FROM_EMAIL');

INSERT INTO shipment_type (description, has_table, shipment_type_id)
SELECT 'Incoming', 'N', 'INCOMING_SHIPMENT'
WHERE NOT EXISTS (SELECT 1 FROM shipment_type WHERE description = 'Incoming' AND has_table = 'N' AND shipment_type_id = 'INCOMING_SHIPMENT');

INSERT INTO shipment_type (description, has_table, shipment_type_id)
SELECT 'Outgoing', 'N', 'OUTGOING_SHIPMENT'
WHERE NOT EXISTS (SELECT 1 FROM shipment_type WHERE description = 'Outgoing' AND has_table = 'N' AND shipment_type_id = 'OUTGOING_SHIPMENT');

INSERT INTO shipment_type (description, has_table, parent_type_id, shipment_type_id)
SELECT 'Sales Return', 'N', 'INCOMING_SHIPMENT', 'SALES_RETURN'
WHERE NOT EXISTS (SELECT 1 FROM shipment_type WHERE description = 'Sales Return' AND has_table = 'N' AND parent_type_id = 'INCOMING_SHIPMENT' AND shipment_type_id = 'SALES_RETURN');

INSERT INTO shipment_type (description, has_table, parent_type_id, shipment_type_id)
SELECT 'Sales Shipment', 'N', 'OUTGOING_SHIPMENT', 'SALES_SHIPMENT'
WHERE NOT EXISTS (SELECT 1 FROM shipment_type WHERE description = 'Sales Shipment' AND has_table = 'N' AND parent_type_id = 'OUTGOING_SHIPMENT' AND shipment_type_id = 'SALES_SHIPMENT');

INSERT INTO shipment_type (description, has_table, parent_type_id, shipment_type_id)
SELECT 'Purchase Shipment', 'N', 'INCOMING_SHIPMENT', 'PURCHASE_SHIPMENT'
WHERE NOT EXISTS (SELECT 1 FROM shipment_type WHERE description = 'Purchase Shipment' AND has_table = 'N' AND parent_type_id = 'INCOMING_SHIPMENT' AND shipment_type_id = 'PURCHASE_SHIPMENT');

INSERT INTO shipment_type (description, has_table, parent_type_id, shipment_type_id)
SELECT 'Purchase Return', 'N', 'OUTGOING_SHIPMENT', 'PURCHASE_RETURN'
WHERE NOT EXISTS (SELECT 1 FROM shipment_type WHERE description = 'Purchase Return' AND has_table = 'N' AND parent_type_id = 'OUTGOING_SHIPMENT' AND shipment_type_id = 'PURCHASE_RETURN');

INSERT INTO shipment_type (description, has_table, shipment_type_id)
SELECT 'Drop Shipment', 'N', 'DROP_SHIPMENT'
WHERE NOT EXISTS (SELECT 1 FROM shipment_type WHERE description = 'Drop Shipment' AND has_table = 'N' AND shipment_type_id = 'DROP_SHIPMENT');

INSERT INTO shipment_type (description, has_table, shipment_type_id)
SELECT 'Transfer', 'N', 'TRANSFER'
WHERE NOT EXISTS (SELECT 1 FROM shipment_type WHERE description = 'Transfer' AND has_table = 'N' AND shipment_type_id = 'TRANSFER');

INSERT INTO rejection_reason (description, rejection_id)
SELECT 'Damaged', 'SRJ_DAMAGED'
WHERE NOT EXISTS (SELECT 1 FROM rejection_reason WHERE description = 'Damaged' AND rejection_id = 'SRJ_DAMAGED');

INSERT INTO rejection_reason (description, rejection_id)
SELECT 'Not Ordered', 'SRJ_NOT_ORDERED'
WHERE NOT EXISTS (SELECT 1 FROM rejection_reason WHERE description = 'Not Ordered' AND rejection_id = 'SRJ_NOT_ORDERED');

INSERT INTO rejection_reason (description, rejection_id)
SELECT 'Over Shipped', 'SRJ_OVER_SHIPPED'
WHERE NOT EXISTS (SELECT 1 FROM rejection_reason WHERE description = 'Over Shipped' AND rejection_id = 'SRJ_OVER_SHIPPED');

INSERT INTO shipment_gateway_config_type (description, has_table, shipment_gateway_conf_type_id)
SELECT 'Shipment Gateway DHL', 'Y', 'SHIP_GATEWAY_DHL'
WHERE NOT EXISTS (SELECT 1 FROM shipment_gateway_config_type WHERE description = 'Shipment Gateway DHL' AND has_table = 'Y' AND shipment_gateway_conf_type_id = 'SHIP_GATEWAY_DHL');

INSERT INTO shipment_gateway_config (description, shipment_gateway_conf_type_id, shipment_gateway_config_id)
SELECT 'DHL Config', 'SHIP_GATEWAY_DHL', 'DHL_CONFIG'
WHERE NOT EXISTS (SELECT 1 FROM shipment_gateway_config WHERE description = 'DHL Config' AND shipment_gateway_conf_type_id = 'SHIP_GATEWAY_DHL' AND shipment_gateway_config_id = 'DHL_CONFIG');

INSERT INTO shipment_gateway_dhl (access_account_nbr, access_password, access_shipping_key, access_user_id, connect_timeout, connect_url, head_action, head_version, label_image_format, rate_estimate_template, shipment_gateway_config_id)
SELECT 'YOUR DHL ShipIT ACCOUNT NUMBER', 'YOUR DHL ShipIT ACCESS PASSWORD', 'YOUR DHL ShipIT SHIPPING KEY', 'YOUR DHL ShipIT USER ID', '60', 'https://eCommerce.airborne.com/ApiLandingTest.asp', 'Request', '1.1', 'PNG', 'api.schema.DHL', 'DHL_CONFIG'
WHERE NOT EXISTS (SELECT 1 FROM shipment_gateway_dhl WHERE access_account_nbr = 'YOUR DHL ShipIT ACCOUNT NUMBER' AND access_password = 'YOUR DHL ShipIT ACCESS PASSWORD' AND access_shipping_key = 'YOUR DHL ShipIT SHIPPING KEY' AND access_user_id = 'YOUR DHL ShipIT USER ID' AND connect_timeout = '60' AND connect_url = 'https://eCommerce.airborne.com/ApiLandingTest.asp' AND head_action = 'Request' AND head_version = '1.1' AND label_image_format = 'PNG' AND rate_estimate_template = 'api.schema.DHL' AND shipment_gateway_config_id = 'DHL_CONFIG');

INSERT INTO shipment_gateway_config_type (description, has_table, shipment_gateway_conf_type_id)
SELECT 'Shipment Gateway Fedex', 'Y', 'SHIP_GATEWAY_FEDEX'
WHERE NOT EXISTS (SELECT 1 FROM shipment_gateway_config_type WHERE description = 'Shipment Gateway Fedex' AND has_table = 'Y' AND shipment_gateway_conf_type_id = 'SHIP_GATEWAY_FEDEX');

INSERT INTO shipment_gateway_config (description, shipment_gateway_conf_type_id, shipment_gateway_config_id)
SELECT 'Fedex Config', 'SHIP_GATEWAY_FEDEX', 'FEDEX_CONFIG'
WHERE NOT EXISTS (SELECT 1 FROM shipment_gateway_config WHERE description = 'Fedex Config' AND shipment_gateway_conf_type_id = 'SHIP_GATEWAY_FEDEX' AND shipment_gateway_config_id = 'FEDEX_CONFIG');

INSERT INTO shipment_gateway_fedex (connect_soap_url, connect_timeout, connect_url, default_dropoff_type, default_packaging_type, label_image_type, rate_estimate_template, shipment_gateway_config_id, template_shipment, template_subscription)
SELECT 'https://gatewaybeta.fedex.com:443/web-services', '60', 'https://gatewaybeta.fedex.com/GatewayDC', 'REGULARPICKUP', 'YOURPACKNG', 'PNG', 'component://product/template/shipment/FedexRateEstimateRequestTemplate.xml.ftl', 'FEDEX_CONFIG', 'component://product/template/shipment/FedexShipRequestTemplate.xml.ftl', 'component://product/template/shipment/FedexSubscriptionRequestTemplate.xml.ftl'
WHERE NOT EXISTS (SELECT 1 FROM shipment_gateway_fedex WHERE connect_soap_url = 'https://gatewaybeta.fedex.com:443/web-services' AND connect_timeout = '60' AND connect_url = 'https://gatewaybeta.fedex.com/GatewayDC' AND default_dropoff_type = 'REGULARPICKUP' AND default_packaging_type = 'YOURPACKNG' AND label_image_type = 'PNG' AND rate_estimate_template = 'component://product/template/shipment/FedexRateEstimateRequestTemplate.xml.ftl' AND shipment_gateway_config_id = 'FEDEX_CONFIG' AND template_shipment = 'component://product/template/shipment/FedexShipRequestTemplate.xml.ftl' AND template_subscription = 'component://product/template/shipment/FedexSubscriptionRequestTemplate.xml.ftl');

INSERT INTO shipment_gateway_config_type (description, has_table, shipment_gateway_conf_type_id)
SELECT 'Shipment Gateway UPS', 'Y', 'SHIP_GATEWAY_UPS'
WHERE NOT EXISTS (SELECT 1 FROM shipment_gateway_config_type WHERE description = 'Shipment Gateway UPS' AND has_table = 'Y' AND shipment_gateway_conf_type_id = 'SHIP_GATEWAY_UPS');

INSERT INTO shipment_gateway_config (description, shipment_gateway_conf_type_id, shipment_gateway_config_id)
SELECT 'UPS Config', 'SHIP_GATEWAY_UPS', 'UPS_CONFIG'
WHERE NOT EXISTS (SELECT 1 FROM shipment_gateway_config WHERE description = 'UPS Config' AND shipment_gateway_conf_type_id = 'SHIP_GATEWAY_UPS' AND shipment_gateway_config_id = 'UPS_CONFIG');

INSERT INTO shipment_gateway_ups (access_license_number, access_password, access_user_id, bill_shipper_account_number, cod_allow_cod, cod_funds_code, cod_surcharge_amount, cod_surcharge_apply_to_package, cod_surcharge_currency_uom_id, connect_timeout, connect_url, customer_classification, default_return_label_memo, default_return_label_subject, max_estimate_weight, min_estimate_weight, save_cert_info, save_cert_path, shipment_gateway_config_id, shipper_number, shipper_pickup_type)
SELECT 'TEST262223144CAT', 'REG111111', 'REG111111', '12345E', 'true', '0', '9', 'first', 'USD', '60', 'https://wwwcie.ups.com/ups.app/xml', '03', 'UPS Shipment Return Memo', 'UPS Shipment Return Label', '90', '0.1', 'true', '${sys:getProperty(''ofbiz.home'')}/runtime/output/upscert', 'UPS_CONFIG', '12345E', '06'
WHERE NOT EXISTS (SELECT 1 FROM shipment_gateway_ups WHERE access_license_number = 'TEST262223144CAT' AND access_password = 'REG111111' AND access_user_id = 'REG111111' AND bill_shipper_account_number = '12345E' AND cod_allow_cod = 'true' AND cod_funds_code = '0' AND cod_surcharge_amount = '9' AND cod_surcharge_apply_to_package = 'first' AND cod_surcharge_currency_uom_id = 'USD' AND connect_timeout = '60' AND connect_url = 'https://wwwcie.ups.com/ups.app/xml' AND customer_classification = '03' AND default_return_label_memo = 'UPS Shipment Return Memo' AND default_return_label_subject = 'UPS Shipment Return Label' AND max_estimate_weight = '90' AND min_estimate_weight = '0.1' AND save_cert_info = 'true' AND save_cert_path = '${sys:getProperty(''ofbiz.home'')}/runtime/output/upscert' AND shipment_gateway_config_id = 'UPS_CONFIG' AND shipper_number = '12345E' AND shipper_pickup_type = '06');

INSERT INTO shipment_gateway_config_type (description, has_table, shipment_gateway_conf_type_id)
SELECT 'Shipment Gateway USPS', 'Y', 'SHIP_GATEWAY_USPS'
WHERE NOT EXISTS (SELECT 1 FROM shipment_gateway_config_type WHERE description = 'Shipment Gateway USPS' AND has_table = 'Y' AND shipment_gateway_conf_type_id = 'SHIP_GATEWAY_USPS');

INSERT INTO shipment_gateway_config (description, shipment_gateway_conf_type_id, shipment_gateway_config_id)
SELECT 'USPS Config', 'SHIP_GATEWAY_USPS', 'USPS_CONFIG'
WHERE NOT EXISTS (SELECT 1 FROM shipment_gateway_config WHERE description = 'USPS Config' AND shipment_gateway_conf_type_id = 'SHIP_GATEWAY_USPS' AND shipment_gateway_config_id = 'USPS_CONFIG');

INSERT INTO shipment_gateway_usps (access_password, access_user_id, connect_timeout, connect_url, connect_url_labels, max_estimate_weight, shipment_gateway_config_id, test)
SELECT '999999999999', '000000000000', '60', 'http://production.shippingapis.com/ShippingAPITest.dll', 'http://production.shippingapis.com/ShippingAPITest.dll', '70', 'USPS_CONFIG', 'N'
WHERE NOT EXISTS (SELECT 1 FROM shipment_gateway_usps WHERE access_password = '999999999999' AND access_user_id = '000000000000' AND connect_timeout = '60' AND connect_url = 'http://production.shippingapis.com/ShippingAPITest.dll' AND connect_url_labels = 'http://production.shippingapis.com/ShippingAPITest.dll' AND max_estimate_weight = '70' AND shipment_gateway_config_id = 'USPS_CONFIG' AND test = 'N');
