package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ProductCalculatedInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCalculatedInfoRepository extends JpaRepository<ProductCalculatedInfo, Long> {
}