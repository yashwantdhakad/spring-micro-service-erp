package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.Document;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentRepository extends JpaRepository<Document, Long> {
}