package com.monash.erp.party.repository;

import com.monash.erp.party.entity.PaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentMethodRepository extends JpaRepository<PaymentMethod, String> {
    List<PaymentMethod> findByPartyId(String partyId);
}
