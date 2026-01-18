package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.Content;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContentRepository extends JpaRepository<Content, Long> {
}