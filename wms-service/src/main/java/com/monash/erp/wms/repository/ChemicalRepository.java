package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.Chemical;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChemicalRepository extends JpaRepository<Chemical, Long> {
}