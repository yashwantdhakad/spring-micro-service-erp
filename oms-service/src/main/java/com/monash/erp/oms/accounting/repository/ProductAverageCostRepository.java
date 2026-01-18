package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.ProductAverageCost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductAverageCostRepository extends JpaRepository<ProductAverageCost, Long> {
}
