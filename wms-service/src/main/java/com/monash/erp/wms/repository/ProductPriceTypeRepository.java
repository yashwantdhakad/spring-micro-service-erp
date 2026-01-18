package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ProductPriceType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductPriceTypeRepository extends JpaRepository<ProductPriceType, Long> {
}