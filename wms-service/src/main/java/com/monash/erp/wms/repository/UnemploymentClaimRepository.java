package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.UnemploymentClaim;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UnemploymentClaimRepository extends JpaRepository<UnemploymentClaim, Long> {
}