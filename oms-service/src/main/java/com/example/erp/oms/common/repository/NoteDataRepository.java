package com.example.erp.oms.common.repository;

import com.example.erp.oms.common.domain.NoteData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteDataRepository extends JpaRepository<NoteData, Long> {
}
