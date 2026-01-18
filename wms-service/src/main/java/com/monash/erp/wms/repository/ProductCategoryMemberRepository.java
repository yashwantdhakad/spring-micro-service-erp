package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ProductCategoryMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCategoryMemberRepository extends JpaRepository<ProductCategoryMember, Long> {
}