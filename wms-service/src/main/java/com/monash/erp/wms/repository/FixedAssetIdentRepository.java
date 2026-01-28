package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.FixedAssetIdent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FixedAssetIdentRepository extends JpaRepository<FixedAssetIdent, Long> {
}