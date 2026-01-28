package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.PaymentGroupMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentGroupMemberRepository extends JpaRepository<PaymentGroupMember, Long> {
}