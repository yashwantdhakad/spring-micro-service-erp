package com.monash.erp.party.repository;

import com.monash.erp.party.entity.VendorProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorProductRepository extends JpaRepository<VendorProduct, Long> {
}