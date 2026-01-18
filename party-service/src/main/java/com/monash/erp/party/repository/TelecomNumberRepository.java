package com.monash.erp.party.repository;

import com.monash.erp.party.entity.TelecomNumber;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TelecomNumberRepository extends JpaRepository<TelecomNumber, Long> {
}