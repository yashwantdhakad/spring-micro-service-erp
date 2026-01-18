package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.Container;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContainerRepository extends JpaRepository<Container, Long> {
}