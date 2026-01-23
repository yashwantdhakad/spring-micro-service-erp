package com.monash.erp.party.repository;

import com.monash.erp.party.entity.ContactMech;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ContactMechRepository extends JpaRepository<ContactMech, Long> {
    Optional<ContactMech> findByContactMechId(String contactMechId);

    List<ContactMech> findByContactMechIdIn(List<String> contactMechIds);
}
