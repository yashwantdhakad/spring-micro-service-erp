package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ContentAssocPredicate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContentAssocPredicateRepository extends JpaRepository<ContentAssocPredicate, Long> {
}