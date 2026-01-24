package com.monash.erp.oms.order.repository;

import com.monash.erp.oms.order.entity.OrderNote;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderNoteRepository extends JpaRepository<OrderNote, Long> {
    List<OrderNote> findByOrderId(String orderId);
}
