package com.monash.erp.oms.party.repository;

import com.monash.erp.oms.party.entity.TelecomNumber;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TelecomNumberRepository extends JpaRepository<TelecomNumber, Long> {
    Optional<TelecomNumber> findByContactMechId(String contactMechId);

    List<TelecomNumber> findByContactMechIdIn(List<String> contactMechIds);

    void deleteByContactMechId(String contactMechId);
}
