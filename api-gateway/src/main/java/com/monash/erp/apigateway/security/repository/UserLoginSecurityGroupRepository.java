package com.monash.erp.apigateway.security.repository;

import com.monash.erp.apigateway.security.entity.UserLoginSecurityGroup;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserLoginSecurityGroupRepository extends JpaRepository<UserLoginSecurityGroup, Long> {
    List<UserLoginSecurityGroup> findByUserLoginId(String userLoginId);
}
