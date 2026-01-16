package com.example.erp.wms.ofbiz.repository;

import com.example.erp.wms.ofbiz.domain.ShippingDocument;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShippingDocumentRepository extends JpaRepository<ShippingDocument, Long> {
}