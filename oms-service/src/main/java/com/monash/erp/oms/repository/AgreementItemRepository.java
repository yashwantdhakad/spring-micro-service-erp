package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.AgreementItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgreementItemRepository extends JpaRepository<AgreementItem, Long> {
}