package com.example.erp.party.security.repository;

import com.example.erp.party.security.domain.ProtectedView;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProtectedViewRepository extends JpaRepository<ProtectedView, Long> {
}
