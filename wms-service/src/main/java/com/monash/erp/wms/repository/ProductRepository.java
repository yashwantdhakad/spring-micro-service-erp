package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Optional<Product> findByProductId(String productId);

    List<Product> findByProductIdIn(List<String> productIds);

    Page<Product> findByProductNameContainingIgnoreCaseOrProductIdContainingIgnoreCase(
            String productName,
            String productId,
            Pageable pageable
    );
}
