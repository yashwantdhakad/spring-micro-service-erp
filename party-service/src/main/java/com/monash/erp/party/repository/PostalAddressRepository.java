package com.monash.erp.party.repository;

import com.monash.erp.party.entity.PostalAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostalAddressRepository extends JpaRepository<PostalAddress, Long> {
}