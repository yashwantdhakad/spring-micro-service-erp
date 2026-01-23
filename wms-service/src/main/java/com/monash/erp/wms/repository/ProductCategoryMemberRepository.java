package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ProductCategoryMember;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductCategoryMemberRepository extends JpaRepository<ProductCategoryMember, Long> {
    List<ProductCategoryMember> findByProductId(String productId);

    Optional<ProductCategoryMember> findByProductIdAndProductCategoryId(String productId, String productCategoryId);

    List<ProductCategoryMember> findByProductCategoryId(String productCategoryId);
}
