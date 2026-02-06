package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ProductFeatureGroup;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductFeatureGroupRepository extends JpaRepository<ProductFeatureGroup, Long> {
    Optional<ProductFeatureGroup> findFirstByProductFeatureGroupIdOrderByIdAsc(String productFeatureGroupId);

    Page<ProductFeatureGroup> findByProductFeatureGroupIdContainingIgnoreCaseOrDescriptionContainingIgnoreCase(
            String productFeatureGroupId,
            String description,
            Pageable pageable
    );
}
