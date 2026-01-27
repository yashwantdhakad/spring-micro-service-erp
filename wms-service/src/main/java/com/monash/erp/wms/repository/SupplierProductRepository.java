package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.SupplierProduct;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SupplierProductRepository extends JpaRepository<SupplierProduct, Long> {
    List<SupplierProduct> findByPartyId(String partyId);

    Optional<SupplierProduct> findTopByPartyIdAndProductIdOrderByIdDesc(String partyId, String productId);
}
