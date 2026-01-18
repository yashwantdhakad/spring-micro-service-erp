package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.FixedAssetIdent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FixedAssetIdentRepository extends JpaRepository<FixedAssetIdent, Long> {
}
