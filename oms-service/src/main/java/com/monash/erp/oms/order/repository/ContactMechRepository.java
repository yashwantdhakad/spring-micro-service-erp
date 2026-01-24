package com.monash.erp.oms.order.repository;

import com.monash.erp.oms.order.entity.ContactMech;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ContactMechRepository extends JpaRepository<ContactMech, Long> {
    Optional<ContactMech> findByContactMechId(String contactMechId);
}
