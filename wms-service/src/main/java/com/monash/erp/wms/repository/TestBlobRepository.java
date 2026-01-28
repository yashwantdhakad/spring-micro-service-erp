package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.TestBlob;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestBlobRepository extends JpaRepository<TestBlob, Long> {
}