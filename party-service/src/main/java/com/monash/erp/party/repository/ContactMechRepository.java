package com.monash.erp.party.repository;

import com.monash.erp.party.entity.ContactMech;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactMechRepository extends JpaRepository<ContactMech, Long> {
}