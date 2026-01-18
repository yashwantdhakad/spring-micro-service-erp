package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.DocumentAttribute;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentAttributeRepository extends JpaRepository<DocumentAttribute, Long> {
}