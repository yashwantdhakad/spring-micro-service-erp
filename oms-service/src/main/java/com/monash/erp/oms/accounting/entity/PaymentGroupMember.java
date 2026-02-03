package com.monash.erp.oms.accounting.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class PaymentGroupMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String paymentGroupId;

    private String paymentId;

    private LocalDateTime fromDate;

    private LocalDateTime thruDate;

    private BigDecimal sequenceNum;
public void setId(Long id) {
        this.id = id;
    }
public void setPaymentGroupId(String paymentGroupId) {
        this.paymentGroupId = paymentGroupId;
    }
public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }
public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }
public void setSequenceNum(BigDecimal sequenceNum) {
        this.sequenceNum = sequenceNum;
    }
}
