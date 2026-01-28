package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.CartAbandonedLine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartAbandonedLineRepository extends JpaRepository<CartAbandonedLine, Long> {
}