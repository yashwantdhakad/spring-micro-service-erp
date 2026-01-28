package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.Affiliate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AffiliateRepository extends JpaRepository<Affiliate, Long> {
}