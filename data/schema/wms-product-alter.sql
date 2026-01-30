-- Apply on wmsdb to reduce row size and add missing product columns
-- Run: mysql -u root -p wmsdb < data/schema/wms-product-alter.sql

ALTER TABLE product
  MODIFY comments TEXT,
  MODIFY description TEXT,
  MODIFY price_detail_text TEXT,
  MODIFY small_image_url TEXT,
  MODIFY medium_image_url TEXT,
  MODIFY large_image_url TEXT,
  MODIFY detail_image_url TEXT,
  MODIFY original_image_url TEXT,
  MODIFY detail_screen TEXT,
  MODIFY inventory_message TEXT,
  MODIFY receiving_note TEXT;

ALTER TABLE product
  ADD COLUMN IF NOT EXISTS manufacturer_party_id varchar(20),
  ADD COLUMN IF NOT EXISTS weight decimal(18,6),
  ADD COLUMN IF NOT EXISTS is_chemical char(1),
  ADD COLUMN IF NOT EXISTS serialized char(1),
  ADD COLUMN IF NOT EXISTS shelf_life char(1),
  ADD COLUMN IF NOT EXISTS external_id varchar(20),
  ADD COLUMN IF NOT EXISTS default_lead_time_days decimal(18,6),
  ADD COLUMN IF NOT EXISTS receiving_note text,
  ADD COLUMN IF NOT EXISTS release_date datetime,
  ADD COLUMN IF NOT EXISTS product_weight decimal(18,6),
  ADD COLUMN IF NOT EXISTS diameter_uom_id varchar(20),
  ADD COLUMN IF NOT EXISTS product_diameter decimal(18,6),
  ADD COLUMN IF NOT EXISTS annual_flight_hours decimal(20,0),
  ADD COLUMN IF NOT EXISTS has_sleeves char(1),
  ADD COLUMN IF NOT EXISTS life_limitation char(1);
