package com.monash.erp.party.repository;

import com.monash.erp.party.entity.PartyDataSource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyDataSourceRepository extends JpaRepository<PartyDataSource, Long> {
}