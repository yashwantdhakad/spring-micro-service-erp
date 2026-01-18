package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.FixedAssetMaintOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FixedAssetMaintOrderRepository extends JpaRepository<FixedAssetMaintOrder, Long> {
}
