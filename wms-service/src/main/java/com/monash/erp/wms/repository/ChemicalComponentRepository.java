package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ChemicalComponent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChemicalComponentRepository extends JpaRepository<ChemicalComponent, Long> {
}