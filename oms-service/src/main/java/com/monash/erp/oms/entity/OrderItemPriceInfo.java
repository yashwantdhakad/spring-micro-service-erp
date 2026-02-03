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
public class OrderItemPriceInfo extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String orderItemPriceInfoId;
    private String orderId;
    private String orderItemSeqId;
    private String productPriceRuleId;
    private String productPriceActionSeqId;
    private BigDecimal modifyAmount;
    private String description;
    private String rateCode;
public void setId(Long id) {
        this.id = id;
    }
public void setOrderItemPriceInfoId(String orderItemPriceInfoId) {
        this.orderItemPriceInfoId = orderItemPriceInfoId;
    }
public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
public void setOrderItemSeqId(String orderItemSeqId) {
        this.orderItemSeqId = orderItemSeqId;
    }
public void setProductPriceRuleId(String productPriceRuleId) {
        this.productPriceRuleId = productPriceRuleId;
    }
public void setProductPriceActionSeqId(String productPriceActionSeqId) {
        this.productPriceActionSeqId = productPriceActionSeqId;
    }
public void setModifyAmount(BigDecimal modifyAmount) {
        this.modifyAmount = modifyAmount;
    }
public void setDescription(String description) {
        this.description = description;
    }
public void setRateCode(String rateCode) {
        this.rateCode = rateCode;
    }

}
