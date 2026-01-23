package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ProductAssocType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductAssocTypeRepository extends JpaRepository<ProductAssocType, Long> {
    Optional<ProductAssocType> findByProductAssocTypeId(String productAssocTypeId);
}
