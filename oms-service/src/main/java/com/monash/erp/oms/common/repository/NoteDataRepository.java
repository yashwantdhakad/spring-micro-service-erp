package com.monash.erp.oms.common.repository;

import com.monash.erp.oms.common.entity.NoteData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteDataRepository extends JpaRepository<NoteData, Long> {
}
