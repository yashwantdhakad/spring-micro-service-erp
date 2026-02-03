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
public class AbleMasterBuy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String buyListId;
    private String workEffortId;
    private String workEffortParentId;
    private String workEffortName;
    private String facilityId;
    private String productId;
    private BigDecimal reqQty;
    private BigDecimal runningDemand;
    private LocalDateTime reqDate;
    private String recType;
    private String orderId;
    private String orderItemId;
    private String partId;
    private String partDescription;
    private BigDecimal orderQty;
    private BigDecimal runningSupply;
    private LocalDateTime dueDate;
    private String logic;
    private String attribute;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
    private String itemCondition;
    private String isNonProcurable;
    private String isCustomerSupplied;
    private String fromWholeAssembly;
    private String drawingItemNumber;
    private String noPmaAllowed;
    private String isExpedite;
public void setId(Long id) {
        this.id = id;
    }
public void setBuyListId(String buyListId) {
        this.buyListId = buyListId;
    }
public void setWorkEffortId(String workEffortId) {
        this.workEffortId = workEffortId;
    }
public void setWorkEffortParentId(String workEffortParentId) {
        this.workEffortParentId = workEffortParentId;
    }
public void setWorkEffortName(String workEffortName) {
        this.workEffortName = workEffortName;
    }
public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }
public void setProductId(String productId) {
        this.productId = productId;
    }
public void setReqQty(BigDecimal reqQty) {
        this.reqQty = reqQty;
    }
public void setRunningDemand(BigDecimal runningDemand) {
        this.runningDemand = runningDemand;
    }
public void setReqDate(LocalDateTime reqDate) {
        this.reqDate = reqDate;
    }
public void setRecType(String recType) {
        this.recType = recType;
    }
public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
public void setOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
    }
public void setPartId(String partId) {
        this.partId = partId;
    }
public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }
public void setOrderQty(BigDecimal orderQty) {
        this.orderQty = orderQty;
    }
public void setRunningSupply(BigDecimal runningSupply) {
        this.runningSupply = runningSupply;
    }
public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }
public void setLogic(String logic) {
        this.logic = logic;
    }
public void setAttribute(String attribute) {
        this.attribute = attribute;
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
public void setItemCondition(String itemCondition) {
        this.itemCondition = itemCondition;
    }
public void setIsNonProcurable(String isNonProcurable) {
        this.isNonProcurable = isNonProcurable;
    }
public void setIsCustomerSupplied(String isCustomerSupplied) {
        this.isCustomerSupplied = isCustomerSupplied;
    }
public void setFromWholeAssembly(String fromWholeAssembly) {
        this.fromWholeAssembly = fromWholeAssembly;
    }
public void setDrawingItemNumber(String drawingItemNumber) {
        this.drawingItemNumber = drawingItemNumber;
    }
public void setNoPmaAllowed(String noPmaAllowed) {
        this.noPmaAllowed = noPmaAllowed;
    }
public void setIsExpedite(String isExpedite) {
        this.isExpedite = isExpedite;
    }

}
