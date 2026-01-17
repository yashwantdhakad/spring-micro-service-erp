package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.FixedAssetIdent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FixedAssetIdentRepository extends JpaRepository<FixedAssetIdent, Long> {
}
