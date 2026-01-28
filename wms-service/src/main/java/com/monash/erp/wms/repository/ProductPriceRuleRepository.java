package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ProductPriceRule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductPriceRuleRepository extends JpaRepository<ProductPriceRule, Long> {
}