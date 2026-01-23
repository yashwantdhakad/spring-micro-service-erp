package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ProductCategory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
    Optional<ProductCategory> findByProductCategoryId(String productCategoryId);

    Page<ProductCategory> findByCategoryNameContainingIgnoreCase(String categoryName, Pageable pageable);

    List<ProductCategory> findByProductCategoryIdIn(Collection<String> productCategoryIds);
}
