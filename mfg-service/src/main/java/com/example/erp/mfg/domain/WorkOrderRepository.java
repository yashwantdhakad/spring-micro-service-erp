package com.example.erp.mfg.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WorkOrderRepository extends JpaRepository<WorkOrder, Long> {
    List<WorkOrder> findBySku(String sku);
}
