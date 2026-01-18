package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ProductStorePaymentSetting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductStorePaymentSettingRepository extends JpaRepository<ProductStorePaymentSetting, Long> {
}