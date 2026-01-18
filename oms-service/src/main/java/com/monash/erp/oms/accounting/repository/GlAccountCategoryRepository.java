package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.GlAccountCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GlAccountCategoryRepository extends JpaRepository<GlAccountCategory, Long> {
}
