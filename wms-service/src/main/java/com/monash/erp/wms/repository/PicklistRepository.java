package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.Picklist;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PicklistRepository extends JpaRepository<Picklist, Long> {
    Optional<Picklist> findByPicklistId(String picklistId);
}
