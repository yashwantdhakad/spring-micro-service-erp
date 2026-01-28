package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.EntityKeyStore;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntityKeyStoreRepository extends JpaRepository<EntityKeyStore, Long> {
}