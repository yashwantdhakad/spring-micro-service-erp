package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ProductOrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductOrderItemRepository extends JpaRepository<ProductOrderItem, Long> {
}