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
public void setId(Long id) {
        this.id = id;
    }
public void setCustRequestId(String custRequestId) {
        this.custRequestId = custRequestId;
    }
public void setCustRequestTypeId(String custRequestTypeId) {
        this.custRequestTypeId = custRequestTypeId;
    }
public void setCustRequestCategoryId(String custRequestCategoryId) {
        this.custRequestCategoryId = custRequestCategoryId;
    }
public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
public void setFromPartyId(String fromPartyId) {
        this.fromPartyId = fromPartyId;
    }
public void setPriority(BigDecimal priority) {
        this.priority = priority;
    }
public void setCustRequestDate(LocalDateTime custRequestDate) {
        this.custRequestDate = custRequestDate;
    }
public void setResponseRequiredDate(LocalDateTime responseRequiredDate) {
        this.responseRequiredDate = responseRequiredDate;
    }
public void setCustRequestName(String custRequestName) {
        this.custRequestName = custRequestName;
    }
public void setDescription(String description) {
        this.description = description;
    }
public void setMaximumAmountUomId(String maximumAmountUomId) {
        this.maximumAmountUomId = maximumAmountUomId;
    }
public void setProductStoreId(String productStoreId) {
        this.productStoreId = productStoreId;
    }
public void setSalesChannelEnumId(String salesChannelEnumId) {
        this.salesChannelEnumId = salesChannelEnumId;
    }
public void setFulfillContactMechId(String fulfillContactMechId) {
        this.fulfillContactMechId = fulfillContactMechId;
    }
public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId;
    }
public void setOpenDateTime(LocalDateTime openDateTime) {
        this.openDateTime = openDateTime;
    }
public void setClosedDateTime(LocalDateTime closedDateTime) {
        this.closedDateTime = closedDateTime;
    }
public void setInternalComment(String internalComment) {
        this.internalComment = internalComment;
    }
public void setReason(String reason) {
        this.reason = reason;
    }
public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }
public void setCreatedByUserLogin(String createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin;
    }
public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
public void setLastModifiedByUserLogin(String lastModifiedByUserLogin) {
        this.lastModifiedByUserLogin = lastModifiedByUserLogin;
    }

}
