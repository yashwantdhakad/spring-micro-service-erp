package com.example.erp.wms.ofbiz.repository;

import com.example.erp.wms.ofbiz.domain.Picklist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PicklistRepository extends JpaRepository<Picklist, Long> {
}