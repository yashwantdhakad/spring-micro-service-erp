package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.GlAccountGroupMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GlAccountGroupMemberRepository extends JpaRepository<GlAccountGroupMember, Long> {
}
