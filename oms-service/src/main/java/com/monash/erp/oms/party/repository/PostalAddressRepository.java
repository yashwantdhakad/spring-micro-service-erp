package com.monash.erp.oms.party.repository;

import com.monash.erp.oms.party.entity.PostalAddress;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PostalAddressRepository extends JpaRepository<PostalAddress, Long> {
    Optional<PostalAddress> findByContactMechId(String contactMechId);

    List<PostalAddress> findByContactMechIdIn(List<String> contactMechIds);

    void deleteByContactMechId(String contactMechId);
}
