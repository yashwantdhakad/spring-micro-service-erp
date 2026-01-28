package com.monash.erp.wms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBuyListId() {
        return buyListId;
    }

    public void setBuyListId(String buyListId) {
        this.buyListId = buyListId;
    }

    public String getWorkEffortId() {
        return workEffortId;
    }

    public void setWorkEffortId(String workEffortId) {
        this.workEffortId = workEffortId;
    }

    public String getWorkEffortParentId() {
        return workEffortParentId;
    }

    public void setWorkEffortParentId(String workEffortParentId) {
        this.workEffortParentId = workEffortParentId;
    }

    public String getWorkEffortName() {
        return workEffortName;
    }

    public void setWorkEffortName(String workEffortName) {
        this.workEffortName = workEffortName;
    }

    public String getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public BigDecimal getReqQty() {
        return reqQty;
    }

    public void setReqQty(BigDecimal reqQty) {
        this.reqQty = reqQty;
    }

    public BigDecimal getRunningDemand() {
        return runningDemand;
    }

    public void setRunningDemand(BigDecimal runningDemand) {
        this.runningDemand = runningDemand;
    }

    public LocalDateTime getReqDate() {
        return reqDate;
    }

    public void setReqDate(LocalDateTime reqDate) {
        this.reqDate = reqDate;
    }

    public String getRecType() {
        return recType;
    }

    public void setRecType(String recType) {
        this.recType = recType;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
    }

    public String getPartId() {
        return partId;
    }

    public void setPartId(String partId) {
        this.partId = partId;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public BigDecimal getOrderQty() {
        return orderQty;
    }

    public void setOrderQty(BigDecimal orderQty) {
        this.orderQty = orderQty;
    }

    public BigDecimal getRunningSupply() {
        return runningSupply;
    }

    public void setRunningSupply(BigDecimal runningSupply) {
        this.runningSupply = runningSupply;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    public String getLogic() {
        return logic;
    }

    public void setLogic(String logic) {
        this.logic = logic;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public LocalDateTime getLastUpdatedStamp() {
        return lastUpdatedStamp;
    }

    public void setLastUpdatedStamp(LocalDateTime lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }

    public LocalDateTime getLastUpdatedTxStamp() {
        return lastUpdatedTxStamp;
    }

    public void setLastUpdatedTxStamp(LocalDateTime lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }

    public LocalDateTime getCreatedStamp() {
        return createdStamp;
    }

    public void setCreatedStamp(LocalDateTime createdStamp) {
        this.createdStamp = createdStamp;
    }

    public LocalDateTime getCreatedTxStamp() {
        return createdTxStamp;
    }

    public void setCreatedTxStamp(LocalDateTime createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }

    public String getItemCondition() {
        return itemCondition;
    }

    public void setItemCondition(String itemCondition) {
        this.itemCondition = itemCondition;
    }

    public String getIsNonProcurable() {
        return isNonProcurable;
    }

    public void setIsNonProcurable(String isNonProcurable) {
        this.isNonProcurable = isNonProcurable;
    }

    public String getIsCustomerSupplied() {
        return isCustomerSupplied;
    }

    public void setIsCustomerSupplied(String isCustomerSupplied) {
        this.isCustomerSupplied = isCustomerSupplied;
    }

    public String getFromWholeAssembly() {
        return fromWholeAssembly;
    }

    public void setFromWholeAssembly(String fromWholeAssembly) {
        this.fromWholeAssembly = fromWholeAssembly;
    }

    public String getDrawingItemNumber() {
        return drawingItemNumber;
    }

    public void setDrawingItemNumber(String drawingItemNumber) {
        this.drawingItemNumber = drawingItemNumber;
    }

    public String getNoPmaAllowed() {
        return noPmaAllowed;
    }

    public void setNoPmaAllowed(String noPmaAllowed) {
        this.noPmaAllowed = noPmaAllowed;
    }

    public String getIsExpedite() {
        return isExpedite;
    }

    public void setIsExpedite(String isExpedite) {
        this.isExpedite = isExpedite;
    }

}