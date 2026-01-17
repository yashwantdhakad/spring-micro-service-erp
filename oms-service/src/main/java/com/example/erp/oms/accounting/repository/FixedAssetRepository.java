package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.FixedAsset;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FixedAssetRepository extends JpaRepository<FixedAsset, Long> {
}
