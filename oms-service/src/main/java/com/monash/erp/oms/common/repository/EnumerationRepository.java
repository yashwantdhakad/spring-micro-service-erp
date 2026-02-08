package com.monash.erp.oms.common.repository;

import com.monash.erp.oms.common.entity.Enumeration;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EnumerationRepository extends JpaRepository<Enumeration, Long> {
    List<Enumeration> findByEnumTypeId(String enumTypeId);
}
