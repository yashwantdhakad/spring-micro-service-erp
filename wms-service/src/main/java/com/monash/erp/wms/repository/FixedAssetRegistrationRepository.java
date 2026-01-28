package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.FixedAssetRegistration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FixedAssetRegistrationRepository extends JpaRepository<FixedAssetRegistration, Long> {
}