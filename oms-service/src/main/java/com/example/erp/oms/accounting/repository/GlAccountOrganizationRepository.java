package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.GlAccountOrganization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GlAccountOrganizationRepository extends JpaRepository<GlAccountOrganization, Long> {
}
