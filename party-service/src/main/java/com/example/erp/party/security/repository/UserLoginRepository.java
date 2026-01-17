package com.example.erp.party.security.repository;

import com.example.erp.party.security.domain.UserLogin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserLoginRepository extends JpaRepository<UserLogin, Long> {
}
