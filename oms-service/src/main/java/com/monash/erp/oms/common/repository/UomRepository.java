package com.monash.erp.oms.common.repository;

import com.monash.erp.oms.common.entity.Uom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UomRepository extends JpaRepository<Uom, Long> {
}
