package com.example.erp.wms.ofbiz.repository;

import com.example.erp.wms.ofbiz.domain.Document;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentRepository extends JpaRepository<Document, Long> {
}