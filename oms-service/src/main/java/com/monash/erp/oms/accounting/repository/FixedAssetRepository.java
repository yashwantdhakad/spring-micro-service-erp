package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.FixedAsset;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FixedAssetRepository extends JpaRepository<FixedAsset, Long> {
}
