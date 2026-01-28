package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ProductIdentification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductIdentificationRepository extends JpaRepository<ProductIdentification, Long> {
}