package com.example.erp.wms.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OldProductRepository extends JpaRepository<OldProduct, Long> {
    Optional<OldProduct> findBySku(String sku);
    boolean existsBySku(String sku);
}
