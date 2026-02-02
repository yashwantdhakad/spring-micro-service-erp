package com.monash.erp.oms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class CustRequest extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String custRequestId;
    private String custRequestTypeId;
    private String custRequestCategoryId;
    private String statusId;
    private String fromPartyId;
    private BigDecimal priority;
    private LocalDateTime custRequestDate;
    private LocalDateTime responseRequiredDate;
    private String custRequestName;
    private String description;
    private String maximumAmountUomId;
    private String productStoreId;
    private String salesChannelEnumId;
    private String fulfillContactMechId;
    private String currencyUomId;
    private LocalDateTime openDateTime;
    private LocalDateTime closedDateTime;
    private String internalComment;
    private String reason;
    private LocalDateTime createdDate;
    private String createdByUserLogin;
    private LocalDateTime lastModifiedDate;
    private String lastModifiedByUserLogin;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustRequestId() {
        return custRequestId;
    }

    public void setCustRequestId(String custRequestId) {
        this.custRequestId = custRequestId;
    }

    public String getCustRequestTypeId() {
        return custRequestTypeId;
    }

    public void setCustRequestTypeId(String custRequestTypeId) {
        this.custRequestTypeId = custRequestTypeId;
    }

    public String getCustRequestCategoryId() {
        return custRequestCategoryId;
    }

    public void setCustRequestCategoryId(String custRequestCategoryId) {
        this.custRequestCategoryId = custRequestCategoryId;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public String getFromPartyId() {
        return fromPartyId;
    }

    public void setFromPartyId(String fromPartyId) {
        this.fromPartyId = fromPartyId;
    }

    public BigDecimal getPriority() {
        return priority;
    }

    public void setPriority(BigDecimal priority) {
        this.priority = priority;
    }

    public LocalDateTime getCustRequestDate() {
        return custRequestDate;
    }

    public void setCustRequestDate(LocalDateTime custRequestDate) {
        this.custRequestDate = custRequestDate;
    }

    public LocalDateTime getResponseRequiredDate() {
        return responseRequiredDate;
    }

    public void setResponseRequiredDate(LocalDateTime responseRequiredDate) {
        this.responseRequiredDate = responseRequiredDate;
    }

    public String getCustRequestName() {
        return custRequestName;
    }

    public void setCustRequestName(String custRequestName) {
        this.custRequestName = custRequestName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMaximumAmountUomId() {
        return maximumAmountUomId;
    }

    public void setMaximumAmountUomId(String maximumAmountUomId) {
        this.maximumAmountUomId = maximumAmountUomId;
    }

    public String getProductStoreId() {
        return productStoreId;
    }

    public void setProductStoreId(String productStoreId) {
        this.productStoreId = productStoreId;
    }

    public String getSalesChannelEnumId() {
        return salesChannelEnumId;
    }

    public void setSalesChannelEnumId(String salesChannelEnumId) {
        this.salesChannelEnumId = salesChannelEnumId;
    }

    public String getFulfillContactMechId() {
        return fulfillContactMechId;
    }

    public void setFulfillContactMechId(String fulfillContactMechId) {
        this.fulfillContactMechId = fulfillContactMechId;
    }

    public String getCurrencyUomId() {
        return currencyUomId;
    }

    public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId;
    }

    public LocalDateTime getOpenDateTime() {
        return openDateTime;
    }

    public void setOpenDateTime(LocalDateTime openDateTime) {
        this.openDateTime = openDateTime;
    }

    public LocalDateTime getClosedDateTime() {
        return closedDateTime;
    }

    public void setClosedDateTime(LocalDateTime closedDateTime) {
        this.closedDateTime = closedDateTime;
    }

    public String getInternalComment() {
        return internalComment;
    }

    public void setInternalComment(String internalComment) {
        this.internalComment = internalComment;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedByUserLogin() {
        return createdByUserLogin;
    }

    public void setCreatedByUserLogin(String createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin;
    }

    public LocalDateTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getLastModifiedByUserLogin() {
        return lastModifiedByUserLogin;
    }

    public void setLastModifiedByUserLogin(String lastModifiedByUserLogin) {
        this.lastModifiedByUserLogin = lastModifiedByUserLogin;
    }




}