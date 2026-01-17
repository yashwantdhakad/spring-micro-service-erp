package com.example.erp.wms.ofbiz.repository;

import com.example.erp.wms.ofbiz.domain.FileExtension;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileExtensionRepository extends JpaRepository<FileExtension, Long> {
}