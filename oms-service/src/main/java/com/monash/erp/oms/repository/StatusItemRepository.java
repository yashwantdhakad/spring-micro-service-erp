package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.StatusItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusItemRepository extends JpaRepository<StatusItem, Long> {
}