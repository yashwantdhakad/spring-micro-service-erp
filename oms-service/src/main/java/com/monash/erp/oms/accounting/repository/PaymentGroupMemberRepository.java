package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.PaymentGroupMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentGroupMemberRepository extends JpaRepository<PaymentGroupMember, Long> {
}
