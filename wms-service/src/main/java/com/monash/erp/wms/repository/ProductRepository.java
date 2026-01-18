package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}