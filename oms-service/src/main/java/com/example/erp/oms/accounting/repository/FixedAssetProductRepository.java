package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.FixedAssetProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FixedAssetProductRepository extends JpaRepository<FixedAssetProduct, Long> {
}
