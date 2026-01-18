package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.GoodIdentification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoodIdentificationRepository extends JpaRepository<GoodIdentification, Long> {
}