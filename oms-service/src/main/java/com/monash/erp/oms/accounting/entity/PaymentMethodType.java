package com.monash.erp.oms.accounting.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class PaymentMethodType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String paymentMethodTypeId;

    private String description;

    private String defaultGlAccountId;
public void setId(Long id) {
        this.id = id;
    }
public void setPaymentMethodTypeId(String paymentMethodTypeId) {
        this.paymentMethodTypeId = paymentMethodTypeId;
    }
public void setDescription(String description) {
        this.description = description;
    }
public void setDefaultGlAccountId(String defaultGlAccountId) {
        this.defaultGlAccountId = defaultGlAccountId;
    }
}
