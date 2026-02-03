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
public class Subscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String subscriptionId;
    private String description;
    private String subscriptionResourceId;
    private String communicationEventId;
    private String contactMechId;
    private String originatedFromPartyId;
    private String originatedFromRoleTypeId;
    private String partyId;
    private String roleTypeId;
    private String partyNeedId;
    private String needTypeId;
    private String orderId;
    private String orderItemSeqId;
    private String productId;
    private String productCategoryId;
    private String inventoryItemId;
    private String subscriptionTypeId;
    private String externalSubscriptionId;
    private LocalDateTime fromDate;
    private LocalDateTime thruDate;
    private LocalDateTime purchaseFromDate;
    private LocalDateTime purchaseThruDate;
    private BigDecimal maxLifeTime;
    private String maxLifeTimeUomId;
    private BigDecimal availableTime;
    private String availableTimeUomId;
    private BigDecimal useCountLimit;
    private BigDecimal useTime;
    private String useTimeUomId;
    private String automaticExtend;
    private BigDecimal canclAutmExtTime;
    private String canclAutmExtTimeUomId;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
public void setId(Long id) {
        this.id = id;
    }
public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }
public void setDescription(String description) {
        this.description = description;
    }
public void setSubscriptionResourceId(String subscriptionResourceId) {
        this.subscriptionResourceId = subscriptionResourceId;
    }
public void setCommunicationEventId(String communicationEventId) {
        this.communicationEventId = communicationEventId;
    }
public void setContactMechId(String contactMechId) {
        this.contactMechId = contactMechId;
    }
public void setOriginatedFromPartyId(String originatedFromPartyId) {
        this.originatedFromPartyId = originatedFromPartyId;
    }
public void setOriginatedFromRoleTypeId(String originatedFromRoleTypeId) {
        this.originatedFromRoleTypeId = originatedFromRoleTypeId;
    }
public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
public void setRoleTypeId(String roleTypeId) {
        this.roleTypeId = roleTypeId;
    }
public void setPartyNeedId(String partyNeedId) {
        this.partyNeedId = partyNeedId;
    }
public void setNeedTypeId(String needTypeId) {
        this.needTypeId = needTypeId;
    }
public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
public void setOrderItemSeqId(String orderItemSeqId) {
        this.orderItemSeqId = orderItemSeqId;
    }
public void setProductId(String productId) {
        this.productId = productId;
    }
public void setProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId;
    }
public void setInventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }
public void setSubscriptionTypeId(String subscriptionTypeId) {
        this.subscriptionTypeId = subscriptionTypeId;
    }
public void setExternalSubscriptionId(String externalSubscriptionId) {
        this.externalSubscriptionId = externalSubscriptionId;
    }
public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }
public void setPurchaseFromDate(LocalDateTime purchaseFromDate) {
        this.purchaseFromDate = purchaseFromDate;
    }
public void setPurchaseThruDate(LocalDateTime purchaseThruDate) {
        this.purchaseThruDate = purchaseThruDate;
    }
public void setMaxLifeTime(BigDecimal maxLifeTime) {
        this.maxLifeTime = maxLifeTime;
    }
public void setMaxLifeTimeUomId(String maxLifeTimeUomId) {
        this.maxLifeTimeUomId = maxLifeTimeUomId;
    }
public void setAvailableTime(BigDecimal availableTime) {
        this.availableTime = availableTime;
    }
public void setAvailableTimeUomId(String availableTimeUomId) {
        this.availableTimeUomId = availableTimeUomId;
    }
public void setUseCountLimit(BigDecimal useCountLimit) {
        this.useCountLimit = useCountLimit;
    }
public void setUseTime(BigDecimal useTime) {
        this.useTime = useTime;
    }
public void setUseTimeUomId(String useTimeUomId) {
        this.useTimeUomId = useTimeUomId;
    }
public void setAutomaticExtend(String automaticExtend) {
        this.automaticExtend = automaticExtend;
    }
public void setCanclAutmExtTime(BigDecimal canclAutmExtTime) {
        this.canclAutmExtTime = canclAutmExtTime;
    }
public void setCanclAutmExtTimeUomId(String canclAutmExtTimeUomId) {
        this.canclAutmExtTimeUomId = canclAutmExtTimeUomId;
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

}
