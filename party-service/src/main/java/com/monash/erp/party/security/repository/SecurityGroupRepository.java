package com.monash.erp.party.security.repository;

import com.monash.erp.party.security.entity.SecurityGroup;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SecurityGroupRepository extends JpaRepository<SecurityGroup, Long> {
    Optional<SecurityGroup> findByGroupId(String groupId);

    List<SecurityGroup> findByGroupIdIn(List<String> groupIds);
}
