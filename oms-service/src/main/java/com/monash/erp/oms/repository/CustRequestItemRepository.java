package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.CustRequestItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustRequestItemRepository extends JpaRepository<CustRequestItem, Long> {
}