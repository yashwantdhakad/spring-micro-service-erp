package com.example.erp.oms.common.repository;

import com.example.erp.oms.common.domain.DataSource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataSourceRepository extends JpaRepository<DataSource, Long> {
}
