package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.NoteData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteDataRepository extends JpaRepository<NoteData, Long> {
}