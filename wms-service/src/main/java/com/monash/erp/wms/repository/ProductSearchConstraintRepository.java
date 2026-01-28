package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ProductSearchConstraint;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductSearchConstraintRepository extends JpaRepository<ProductSearchConstraint, Long> {
}