package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.CommunicationEventOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommunicationEventOrderRepository extends JpaRepository<CommunicationEventOrder, Long> {
}