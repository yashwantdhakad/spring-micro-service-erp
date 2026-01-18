package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.FixedAssetRegistration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FixedAssetRegistrationRepository extends JpaRepository<FixedAssetRegistration, Long> {
}
