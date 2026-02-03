package com.monash.erp.wms.entity;

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
public class ProductPromoAction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productPromoId;
    private String productPromoRuleId;
    private String productPromoActionSeqId;
    private String productPromoActionEnumId;
    private String orderAdjustmentTypeId;
    private BigDecimal quantity;
    private BigDecimal amount;
    private String productId;
    private String partyId;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
    private String serviceName;
public void setId(Long id) {
        this.id = id;
    }
public void setProductPromoId(String productPromoId) {
        this.productPromoId = productPromoId;
    }
public void setProductPromoRuleId(String productPromoRuleId) {
        this.productPromoRuleId = productPromoRuleId;
    }
public void setProductPromoActionSeqId(String productPromoActionSeqId) {
        this.productPromoActionSeqId = productPromoActionSeqId;
    }
public void setProductPromoActionEnumId(String productPromoActionEnumId) {
        this.productPromoActionEnumId = productPromoActionEnumId;
    }
public void setOrderAdjustmentTypeId(String orderAdjustmentTypeId) {
        this.orderAdjustmentTypeId = orderAdjustmentTypeId;
    }
public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }
public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
public void setProductId(String productId) {
        this.productId = productId;
    }
public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
public void setLastUpdatedStamp(LocalDateTime lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }
public void setLastUpdatedTxStamp(LocalDateTime lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }
public void setCreatedStamp(LocalDateTime createdStamp) {
        this.createdStamp = createdStamp;
    }
public void setCreatedTxStamp(LocalDateTime createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }
public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

}
