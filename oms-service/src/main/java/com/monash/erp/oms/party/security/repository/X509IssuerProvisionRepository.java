package com.monash.erp.oms.party.security.repository;

import com.monash.erp.oms.party.security.entity.X509IssuerProvision;
import org.springframework.data.jpa.repository.JpaRepository;

public interface X509IssuerProvisionRepository extends JpaRepository<X509IssuerProvision, Long> {
}
