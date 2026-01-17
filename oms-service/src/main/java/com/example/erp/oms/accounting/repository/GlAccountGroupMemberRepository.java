package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.GlAccountGroupMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GlAccountGroupMemberRepository extends JpaRepository<GlAccountGroupMember, Long> {
}
