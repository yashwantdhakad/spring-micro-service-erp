package com.monash.erp.oms.common.repository;

import com.monash.erp.oms.common.entity.StatusValidChange;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface StatusValidChangeRepository extends JpaRepository<StatusValidChange, Long> {
    List<StatusValidChange> findByStatusId(String statusId);
}
