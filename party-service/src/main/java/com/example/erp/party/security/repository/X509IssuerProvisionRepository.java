package com.example.erp.party.security.repository;

import com.example.erp.party.security.domain.X509IssuerProvision;
import org.springframework.data.jpa.repository.JpaRepository;

public interface X509IssuerProvisionRepository extends JpaRepository<X509IssuerProvision, Long> {
}
