package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ProductPrice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductPriceRepository extends JpaRepository<ProductPrice, Long> {
    List<ProductPrice> findByProductId(String productId);

    Optional<ProductPrice> findByIdAndProductId(Long id, String productId);
}
