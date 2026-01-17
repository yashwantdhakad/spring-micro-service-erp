package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.PaymentGroupMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentGroupMemberRepository extends JpaRepository<PaymentGroupMember, Long> {
}
