package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.PicklistItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PicklistItemRepository extends JpaRepository<PicklistItem, Long> {
    List<PicklistItem> findByPicklistBinId(String picklistBinId);
}
