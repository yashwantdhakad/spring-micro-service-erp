package com.monash.erp.party.security.repository;

import com.monash.erp.party.security.entity.UserLoginOtp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserLoginOtpRepository extends JpaRepository<UserLoginOtp, Long> {
}