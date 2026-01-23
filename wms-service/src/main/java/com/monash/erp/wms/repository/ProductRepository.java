package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Optional<Product> findByProductId(String productId);

    Page<Product> findByProductNameContainingIgnoreCaseOrProductIdContainingIgnoreCase(
            String productName,
            String productId,
            Pageable pageable
    );
}
