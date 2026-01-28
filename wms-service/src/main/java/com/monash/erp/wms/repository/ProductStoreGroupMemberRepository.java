package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ProductStoreGroupMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductStoreGroupMemberRepository extends JpaRepository<ProductStoreGroupMember, Long> {
}