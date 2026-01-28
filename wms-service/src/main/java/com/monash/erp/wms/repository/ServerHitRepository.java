package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ServerHit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServerHitRepository extends JpaRepository<ServerHit, Long> {
}