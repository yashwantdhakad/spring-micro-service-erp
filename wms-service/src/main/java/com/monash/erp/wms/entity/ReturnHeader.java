package com.monash.erp.wms.entity;

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
public class ReturnHeader {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String returnId;
    private String returnHeaderTypeId;
    private String statusId;
    private String createdBy;
    private String fromPartyId;
    private String toPartyId;
    private String paymentMethodId;
    private String finAccountId;
    private String billingAccountId;
    private LocalDateTime entryDate;
    private String originContactMechId;
    private String destinationFacilityId;
    private String needsInventoryReceive;
    private String currencyUomId;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
    private String rmaNumber;
public void setId(Long id) {
        this.id = id;
    }
public void setReturnId(String returnId) {
        this.returnId = returnId;
    }
public void setReturnHeaderTypeId(String returnHeaderTypeId) {
        this.returnHeaderTypeId = returnHeaderTypeId;
    }
public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
public void setFromPartyId(String fromPartyId) {
        this.fromPartyId = fromPartyId;
    }
public void setToPartyId(String toPartyId) {
        this.toPartyId = toPartyId;
    }
public void setPaymentMethodId(String paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }
public void setFinAccountId(String finAccountId) {
        this.finAccountId = finAccountId;
    }
public void setBillingAccountId(String billingAccountId) {
        this.billingAccountId = billingAccountId;
    }
public void setEntryDate(LocalDateTime entryDate) {
        this.entryDate = entryDate;
    }
public void setOriginContactMechId(String originContactMechId) {
        this.originContactMechId = originContactMechId;
    }
public void setDestinationFacilityId(String destinationFacilityId) {
        this.destinationFacilityId = destinationFacilityId;
    }
public void setNeedsInventoryReceive(String needsInventoryReceive) {
        this.needsInventoryReceive = needsInventoryReceive;
    }
public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId;
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
public void setRmaNumber(String rmaNumber) {
        this.rmaNumber = rmaNumber;
    }

}
