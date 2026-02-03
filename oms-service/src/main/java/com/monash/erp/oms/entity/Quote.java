package com.monash.erp.oms.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class Quote extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String quoteId;
    private String quoteTypeId;
    private String partyId;
    private LocalDateTime issueDate;
    private String statusId;
    private String currencyUomId;
    private String productStoreId;
    private String salesChannelEnumId;
    private LocalDateTime validFromDate;
    private LocalDateTime validThruDate;
    private String quoteName;
    private String description;
    private String externalId;
public void setId(Long id) {
        this.id = id;
    }
public void setQuoteId(String quoteId) {
        this.quoteId = quoteId;
    }
public void setQuoteTypeId(String quoteTypeId) {
        this.quoteTypeId = quoteTypeId;
    }
public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
public void setIssueDate(LocalDateTime issueDate) {
        this.issueDate = issueDate;
    }
public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId;
    }
public void setProductStoreId(String productStoreId) {
        this.productStoreId = productStoreId;
    }
public void setSalesChannelEnumId(String salesChannelEnumId) {
        this.salesChannelEnumId = salesChannelEnumId;
    }
public void setValidFromDate(LocalDateTime validFromDate) {
        this.validFromDate = validFromDate;
    }
public void setValidThruDate(LocalDateTime validThruDate) {
        this.validThruDate = validThruDate;
    }
public void setQuoteName(String quoteName) {
        this.quoteName = quoteName;
    }
public void setDescription(String description) {
        this.description = description;
    }
public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

}
