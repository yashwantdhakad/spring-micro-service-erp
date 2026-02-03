package com.monash.erp.oms.accounting.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class PaymentMethod {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String paymentMethodId;

    private String paymentMethodTypeId;

    private String partyId;

    private String glAccountId;

    private String finAccountId;

    private String description;

    private LocalDateTime fromDate;

    private LocalDateTime thruDate;
public void setId(Long id) {
        this.id = id;
    }
public void setPaymentMethodId(String paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }
public void setPaymentMethodTypeId(String paymentMethodTypeId) {
        this.paymentMethodTypeId = paymentMethodTypeId;
    }
public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
public void setGlAccountId(String glAccountId) {
        this.glAccountId = glAccountId;
    }
public void setFinAccountId(String finAccountId) {
        this.finAccountId = finAccountId;
    }
public void setDescription(String description) {
        this.description = description;
    }
public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }
}
