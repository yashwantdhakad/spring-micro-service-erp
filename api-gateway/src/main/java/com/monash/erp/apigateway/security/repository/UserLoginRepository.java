package com.monash.erp.apigateway.security.repository;

import com.monash.erp.apigateway.security.entity.UserLogin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserLoginRepository extends JpaRepository<UserLogin, Long> {
    Optional<UserLogin> findByUserLoginId(String userLoginId);

    boolean existsByUserLoginId(String userLoginId);
}
