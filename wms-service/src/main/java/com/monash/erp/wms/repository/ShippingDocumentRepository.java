package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ShippingDocument;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShippingDocumentRepository extends JpaRepository<ShippingDocument, Long> {
}