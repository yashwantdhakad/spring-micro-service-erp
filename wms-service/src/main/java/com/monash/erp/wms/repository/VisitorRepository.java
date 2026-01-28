package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.Visitor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitorRepository extends JpaRepository<Visitor, Long> {
}