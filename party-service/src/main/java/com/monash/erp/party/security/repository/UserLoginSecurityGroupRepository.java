package com.monash.erp.party.security.repository;

import com.monash.erp.party.security.entity.UserLoginSecurityGroup;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserLoginSecurityGroupRepository extends JpaRepository<UserLoginSecurityGroup, Long> {
    List<UserLoginSecurityGroup> findByUserLoginId(String userLoginId);

    List<UserLoginSecurityGroup> findByUserLoginIdIn(List<String> userLoginIds);

    void deleteByUserLoginId(String userLoginId);

    void deleteByUserLoginIdAndGroupId(String userLoginId, String groupId);
}
