package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.GlAccountCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GlAccountCategoryRepository extends JpaRepository<GlAccountCategory, Long> {
}
