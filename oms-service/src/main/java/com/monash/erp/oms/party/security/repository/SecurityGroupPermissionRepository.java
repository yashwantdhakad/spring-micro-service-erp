package com.monash.erp.oms.party.security.repository;

import com.monash.erp.oms.party.security.entity.SecurityGroupPermission;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SecurityGroupPermissionRepository extends JpaRepository<SecurityGroupPermission, Long> {
    List<SecurityGroupPermission> findByGroupIdIn(List<String> groupIds);

    List<SecurityGroupPermission> findByGroupId(String groupId);

    void deleteByGroupId(String groupId);
}
