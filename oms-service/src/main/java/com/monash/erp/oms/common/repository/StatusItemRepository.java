package com.monash.erp.oms.common.repository;

import com.monash.erp.oms.common.entity.StatusItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusItemRepository extends JpaRepository<StatusItem, Long> {
}
