package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ItemIssuance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemIssuanceRepository extends JpaRepository<ItemIssuance, Long> {
}