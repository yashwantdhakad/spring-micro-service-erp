package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.EmailAddressVerification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailAddressVerificationRepository extends JpaRepository<EmailAddressVerification, Long> {
}