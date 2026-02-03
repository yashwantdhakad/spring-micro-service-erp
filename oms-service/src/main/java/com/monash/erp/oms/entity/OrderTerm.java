package com.monash.erp.oms.entity;

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
public class OrderTerm extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String termTypeId;
    private String orderId;
    private String orderItemSeqId;
    private BigDecimal termValue;
    private BigDecimal termDays;
    private String textValue;
    private String description;
    private String uomId;
public void setId(Long id) {
        this.id = id;
    }
public void setTermTypeId(String termTypeId) {
        this.termTypeId = termTypeId;
    }
public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
public void setOrderItemSeqId(String orderItemSeqId) {
        this.orderItemSeqId = orderItemSeqId;
    }
public void setTermValue(BigDecimal termValue) {
        this.termValue = termValue;
    }
public void setTermDays(BigDecimal termDays) {
        this.termDays = termDays;
    }
public void setTextValue(String textValue) {
        this.textValue = textValue;
    }
public void setDescription(String description) {
        this.description = description;
    }
public void setUomId(String uomId) {
        this.uomId = uomId;
    }

}
