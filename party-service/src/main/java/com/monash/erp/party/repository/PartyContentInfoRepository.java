package com.monash.erp.party.repository;

import com.monash.erp.party.entity.PartyContentInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PartyContentInfoRepository extends JpaRepository<PartyContentInfo, Long> {
    List<PartyContentInfo> findByPartyId(String partyId);

    Optional<PartyContentInfo> findByPartyIdAndContentId(String partyId, String contentId);
}
