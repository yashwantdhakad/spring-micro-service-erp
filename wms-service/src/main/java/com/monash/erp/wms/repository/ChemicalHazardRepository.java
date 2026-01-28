package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ChemicalHazard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChemicalHazardRepository extends JpaRepository<ChemicalHazard, Long> {
}