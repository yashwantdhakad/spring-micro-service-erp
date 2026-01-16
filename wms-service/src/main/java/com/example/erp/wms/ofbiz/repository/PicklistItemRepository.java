package com.example.erp.wms.ofbiz.repository;

import com.example.erp.wms.ofbiz.domain.PicklistItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PicklistItemRepository extends JpaRepository<PicklistItem, Long> {
}