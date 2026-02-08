package com.monash.erp.oms.party.repository;

import com.monash.erp.oms.party.entity.PaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PartyServicePaymentMethodRepository extends JpaRepository<PaymentMethod, String> {
    List<PaymentMethod> findByPartyId(String partyId);

    List<PaymentMethod> findByPartyIdAndPaymentMethodTypeId(String partyId, String paymentMethodTypeId);
}
