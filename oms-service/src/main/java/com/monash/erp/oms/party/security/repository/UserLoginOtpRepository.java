package com.monash.erp.oms.party.security.repository;

import com.monash.erp.oms.party.security.entity.UserLoginOtp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserLoginOtpRepository extends JpaRepository<UserLoginOtp, Long> {
}