package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ContactList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactListRepository extends JpaRepository<ContactList, Long> {
}