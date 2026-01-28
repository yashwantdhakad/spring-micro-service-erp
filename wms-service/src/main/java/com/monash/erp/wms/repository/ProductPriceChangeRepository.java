package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ProductPriceChange;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductPriceChangeRepository extends JpaRepository<ProductPriceChange, Long> {
}