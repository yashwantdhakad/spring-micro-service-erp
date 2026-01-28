package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.Uom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UomRepository extends JpaRepository<Uom, Long> {
}