package com.monash.erp.oms.order.repository;

import com.monash.erp.oms.order.entity.PostalAddress;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PostalAddressRepository extends JpaRepository<PostalAddress, Long> {
    Optional<PostalAddress> findByContactMechId(String contactMechId);
}
