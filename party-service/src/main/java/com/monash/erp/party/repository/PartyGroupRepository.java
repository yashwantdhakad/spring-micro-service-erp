package com.monash.erp.party.repository;

import com.monash.erp.party.entity.PartyGroup;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PartyGroupRepository extends JpaRepository<PartyGroup, Long> {
    Optional<PartyGroup> findByPartyId(String partyId);

    Page<PartyGroup> findByGroupNameContainingIgnoreCase(String groupName, Pageable pageable);
}
