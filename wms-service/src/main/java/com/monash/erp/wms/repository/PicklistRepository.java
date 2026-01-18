package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.Picklist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PicklistRepository extends JpaRepository<Picklist, Long> {
}