package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ContentRevision;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContentRevisionRepository extends JpaRepository<ContentRevision, Long> {
}