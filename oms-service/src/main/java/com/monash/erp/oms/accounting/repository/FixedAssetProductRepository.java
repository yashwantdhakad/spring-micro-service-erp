package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.FixedAssetProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FixedAssetProductRepository extends JpaRepository<FixedAssetProduct, Long> {
}
