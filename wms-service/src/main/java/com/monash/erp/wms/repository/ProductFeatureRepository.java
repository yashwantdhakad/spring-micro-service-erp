package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ProductFeature;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductFeatureRepository extends JpaRepository<ProductFeature, Long> {
    Optional<ProductFeature> findFirstByProductFeatureIdOrderByIdAsc(String productFeatureId);

    Page<ProductFeature> findByProductFeatureIdContainingIgnoreCaseOrDescriptionContainingIgnoreCaseOrAbbrevContainingIgnoreCase(
            String productFeatureId,
            String description,
            String abbrev,
            Pageable pageable
    );
}
