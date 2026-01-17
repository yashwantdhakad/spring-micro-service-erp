package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.FixedAssetMaintOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FixedAssetMaintOrderRepository extends JpaRepository<FixedAssetMaintOrder, Long> {
}
