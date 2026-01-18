package com.monash.erp.mfg.repository;

import com.monash.erp.mfg.entity.WorkOrder;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkOrderRepository extends JpaRepository<WorkOrder, Long> {
    List<WorkOrder> findBySku(String sku);
}
