package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.FixedAssetMeter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FixedAssetMeterRepository extends JpaRepository<FixedAssetMeter, Long> {
}
