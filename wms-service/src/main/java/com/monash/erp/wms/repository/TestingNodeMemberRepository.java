package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.TestingNodeMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestingNodeMemberRepository extends JpaRepository<TestingNodeMember, Long> {
}