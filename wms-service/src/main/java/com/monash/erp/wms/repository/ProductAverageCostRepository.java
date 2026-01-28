package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ProductAverageCost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductAverageCostRepository extends JpaRepository<ProductAverageCost, Long> {
}