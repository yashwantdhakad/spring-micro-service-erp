package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.FixedAssetAttribute;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FixedAssetAttributeRepository extends JpaRepository<FixedAssetAttribute, Long> {
}
