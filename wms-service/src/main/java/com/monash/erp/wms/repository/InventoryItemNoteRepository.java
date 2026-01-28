package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.InventoryItemNote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryItemNoteRepository extends JpaRepository<InventoryItemNote, Long> {
}