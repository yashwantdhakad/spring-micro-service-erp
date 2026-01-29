package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.PicklistBin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PicklistBinRepository extends JpaRepository<PicklistBin, Long> {
    List<PicklistBin> findByPrimaryOrderId(String primaryOrderId);

    List<PicklistBin> findByPicklistId(String picklistId);

    List<PicklistBin> findByPicklistIdIn(List<String> picklistIds);
}
