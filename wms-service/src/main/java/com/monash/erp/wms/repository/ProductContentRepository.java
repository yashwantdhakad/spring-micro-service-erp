package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ProductContent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductContentRepository extends JpaRepository<ProductContent, Long> {
    List<ProductContent> findByProductId(String productId);

    Optional<ProductContent> findByProductIdAndContentId(String productId, String contentId);
}
