package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.Deliverable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliverableRepository extends JpaRepository<Deliverable, Long> {
}