package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.MetaDataPredicate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MetaDataPredicateRepository extends JpaRepository<MetaDataPredicate, Long> {
}