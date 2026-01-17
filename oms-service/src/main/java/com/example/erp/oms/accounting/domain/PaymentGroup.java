package com.example.erp.oms.accounting.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PaymentGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String paymentGroupId;

    private String paymentGroupTypeId;

    private String paymentGroupName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPaymentGroupId() {
        return paymentGroupId;
    }

    public void setPaymentGroupId(String paymentGroupId) {
        this.paymentGroupId = paymentGroupId;
    }

    public String getPaymentGroupTypeId() {
        return paymentGroupTypeId;
    }

    public void setPaymentGroupTypeId(String paymentGroupTypeId) {
        this.paymentGroupTypeId = paymentGroupTypeId;
    }

    public String getPaymentGroupName() {
        return paymentGroupName;
    }

    public void setPaymentGroupName(String paymentGroupName) {
        this.paymentGroupName = paymentGroupName;
    }
}
