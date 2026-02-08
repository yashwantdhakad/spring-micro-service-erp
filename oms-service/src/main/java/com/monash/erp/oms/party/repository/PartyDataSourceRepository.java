package com.monash.erp.oms.party.repository;

import com.monash.erp.oms.party.entity.PartyDataSource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyDataSourceRepository extends JpaRepository<PartyDataSource, Long> {
}