package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ProductStoreEmailSetting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductStoreEmailSettingRepository extends JpaRepository<ProductStoreEmailSetting, Long> {
}