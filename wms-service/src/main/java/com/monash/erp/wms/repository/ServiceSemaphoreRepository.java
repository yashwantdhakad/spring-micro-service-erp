package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ServiceSemaphore;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceSemaphoreRepository extends JpaRepository<ServiceSemaphore, Long> {
}