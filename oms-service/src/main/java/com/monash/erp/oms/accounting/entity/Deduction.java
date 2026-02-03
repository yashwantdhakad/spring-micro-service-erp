package com.monash.erp.oms.accounting.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class Deduction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String deductionId;

    private String deductionTypeId;

    private String paymentId;

    private BigDecimal amount;
public void setId(Long id) {
        this.id = id;
    }
public void setDeductionId(String deductionId) {
        this.deductionId = deductionId;
    }
public void setDeductionTypeId(String deductionTypeId) {
        this.deductionTypeId = deductionTypeId;
    }
public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }
public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
