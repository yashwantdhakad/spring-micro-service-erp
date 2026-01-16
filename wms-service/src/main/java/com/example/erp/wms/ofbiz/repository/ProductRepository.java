package com.example.erp.wms.ofbiz.repository;

import com.example.erp.wms.ofbiz.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}