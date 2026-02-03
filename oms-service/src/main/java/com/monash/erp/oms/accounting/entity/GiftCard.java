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
public class GiftCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String paymentMethodId;

    private String cardNumber;

    private String pinNumber;

    private String expireDate;

    private String contactMechId;
public void setId(Long id) {
        this.id = id;
    }
public void setPaymentMethodId(String paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }
public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
public void setPinNumber(String pinNumber) {
        this.pinNumber = pinNumber;
    }
public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }
public void setContactMechId(String contactMechId) {
        this.contactMechId = contactMechId;
    }
}
