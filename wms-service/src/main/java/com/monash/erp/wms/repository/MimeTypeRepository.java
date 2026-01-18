package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.MimeType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MimeTypeRepository extends JpaRepository<MimeType, Long> {
}