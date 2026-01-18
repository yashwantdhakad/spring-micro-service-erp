package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.FixedAssetType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FixedAssetTypeRepository extends JpaRepository<FixedAssetType, Long> {
}
