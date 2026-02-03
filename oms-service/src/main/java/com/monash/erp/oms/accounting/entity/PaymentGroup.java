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
public class PaymentGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String paymentGroupId;

    private String paymentGroupTypeId;

    private String paymentGroupName;
public void setId(Long id) {
        this.id = id;
    }
public void setPaymentGroupId(String paymentGroupId) {
        this.paymentGroupId = paymentGroupId;
    }
public void setPaymentGroupTypeId(String paymentGroupTypeId) {
        this.paymentGroupTypeId = paymentGroupTypeId;
    }
public void setPaymentGroupName(String paymentGroupName) {
        this.paymentGroupName = paymentGroupName;
    }
}
