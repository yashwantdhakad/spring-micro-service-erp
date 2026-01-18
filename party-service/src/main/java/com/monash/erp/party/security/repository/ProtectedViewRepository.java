package com.monash.erp.party.security.repository;

import com.monash.erp.party.security.entity.ProtectedView;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProtectedViewRepository extends JpaRepository<ProtectedView, Long> {
}
