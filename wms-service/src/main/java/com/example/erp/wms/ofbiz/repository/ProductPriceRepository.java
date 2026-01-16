package com.example.erp.wms.ofbiz.repository;

import com.example.erp.wms.ofbiz.domain.ProductPrice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductPriceRepository extends JpaRepository<ProductPrice, Long> {
}