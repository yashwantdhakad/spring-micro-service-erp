package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.OrderHeaderNote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderHeaderNoteRepository extends JpaRepository<OrderHeaderNote, Long> {
}