package com.example.erp.party.ofbiz.repository;

import com.example.erp.party.ofbiz.domain.PostalAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostalAddressRepository extends JpaRepository<PostalAddress, Long> {
}