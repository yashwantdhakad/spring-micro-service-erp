package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ProductAssoc;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductAssocRepository extends JpaRepository<ProductAssoc, Long> {
    List<ProductAssoc> findByProductId(String productId);

    List<ProductAssoc> findByProductIdTo(String productIdTo);
}
