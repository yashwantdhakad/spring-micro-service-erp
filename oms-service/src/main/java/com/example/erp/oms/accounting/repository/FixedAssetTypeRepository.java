package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.FixedAssetType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FixedAssetTypeRepository extends JpaRepository<FixedAssetType, Long> {
}
