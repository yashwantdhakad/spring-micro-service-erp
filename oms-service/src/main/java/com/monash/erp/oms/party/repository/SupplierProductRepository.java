package com.monash.erp.oms.party.repository;

import com.monash.erp.oms.party.entity.SupplierProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierProductRepository extends JpaRepository<SupplierProduct, Long> {
}