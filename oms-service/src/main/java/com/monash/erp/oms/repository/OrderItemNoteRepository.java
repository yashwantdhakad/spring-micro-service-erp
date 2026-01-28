package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.OrderItemNote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemNoteRepository extends JpaRepository<OrderItemNote, Long> {
}