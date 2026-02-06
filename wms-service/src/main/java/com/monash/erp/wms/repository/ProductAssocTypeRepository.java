package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ProductAssocType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductAssocTypeRepository extends JpaRepository<ProductAssocType, Long> {
    Optional<ProductAssocType> findFirstByProductAssocTypeIdOrderByIdAsc(String productAssocTypeId);

    default Optional<ProductAssocType> findByProductAssocTypeId(String productAssocTypeId) {
        return findFirstByProductAssocTypeIdOrderByIdAsc(productAssocTypeId);
    }
}
