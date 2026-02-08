package com.monash.erp.oms.party.repository;

import com.monash.erp.oms.party.entity.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorRepository extends JpaRepository<Vendor, Long> {
}