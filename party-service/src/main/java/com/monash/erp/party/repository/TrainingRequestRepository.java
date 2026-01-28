package com.monash.erp.party.repository;

import com.monash.erp.party.entity.TrainingRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainingRequestRepository extends JpaRepository<TrainingRequest, Long> {
}