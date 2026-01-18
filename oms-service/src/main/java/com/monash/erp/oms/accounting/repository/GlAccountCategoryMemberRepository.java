package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.GlAccountCategoryMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GlAccountCategoryMemberRepository extends JpaRepository<GlAccountCategoryMember, Long> {
}
