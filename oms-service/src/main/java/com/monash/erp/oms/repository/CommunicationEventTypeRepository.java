package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.CommunicationEventType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommunicationEventTypeRepository extends JpaRepository<CommunicationEventType, Long> {
}