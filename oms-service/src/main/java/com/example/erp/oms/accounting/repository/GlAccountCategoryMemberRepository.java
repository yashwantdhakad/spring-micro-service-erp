package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.GlAccountCategoryMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GlAccountCategoryMemberRepository extends JpaRepository<GlAccountCategoryMember, Long> {
}
