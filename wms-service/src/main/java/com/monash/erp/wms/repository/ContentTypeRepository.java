package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ContentType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContentTypeRepository extends JpaRepository<ContentType, Long> {
}