package com.monash.erp.oms.common.repository;

import com.monash.erp.oms.common.entity.StatusItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StatusItemRepository extends JpaRepository<StatusItem, Long> {
    Optional<StatusItem> findByStatusId(String statusId);
}
