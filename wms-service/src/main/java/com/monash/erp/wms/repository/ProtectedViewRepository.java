package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ProtectedView;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProtectedViewRepository extends JpaRepository<ProtectedView, Long> {
}