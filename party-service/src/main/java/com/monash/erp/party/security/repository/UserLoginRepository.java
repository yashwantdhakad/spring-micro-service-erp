package com.monash.erp.party.security.repository;

import com.monash.erp.party.security.entity.UserLogin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserLoginRepository extends JpaRepository<UserLogin, Long> {
}
