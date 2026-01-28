package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.WebPage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WebPageRepository extends JpaRepository<WebPage, Long> {
}