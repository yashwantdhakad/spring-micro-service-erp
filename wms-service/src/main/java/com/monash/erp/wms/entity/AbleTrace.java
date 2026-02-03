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
public class AbleTrace {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String traceId;
    private String inventoryItemId;
    private String cageCodeId;
    private String uniqueId;
    private String productId;
    private LocalDateTime timeStamp;
    private String actionCode;
    private String conditionCode;
    private String oemPartyId;
    private String oemSerialNumber;
    private String shpPartyId;
    private String insJobNumber;
    private String rmvJobNumber;
    private String newLimits;
    private String excCageCode;
    private String excSerialNumber;
    private String excPartNumber;
    private String excPartyCageCode;
    private String sldPartyId;
    private String buyPartyId;
    private String desMethod;
    private String rcdPartyId;
    private String upgDescription;
    private String inpComments;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
public void setId(Long id) {
        this.id = id;
    }
public void setTraceId(String traceId) {
        this.traceId = traceId;
    }
public void setInventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }
public void setCageCodeId(String cageCodeId) {
        this.cageCodeId = cageCodeId;
    }
public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }
public void setProductId(String productId) {
        this.productId = productId;
    }
public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }
public void setActionCode(String actionCode) {
        this.actionCode = actionCode;
    }
public void setConditionCode(String conditionCode) {
        this.conditionCode = conditionCode;
    }
public void setOemPartyId(String oemPartyId) {
        this.oemPartyId = oemPartyId;
    }
public void setOemSerialNumber(String oemSerialNumber) {
        this.oemSerialNumber = oemSerialNumber;
    }
public void setShpPartyId(String shpPartyId) {
        this.shpPartyId = shpPartyId;
    }
public void setInsJobNumber(String insJobNumber) {
        this.insJobNumber = insJobNumber;
    }
public void setRmvJobNumber(String rmvJobNumber) {
        this.rmvJobNumber = rmvJobNumber;
    }
public void setNewLimits(String newLimits) {
        this.newLimits = newLimits;
    }
public void setExcCageCode(String excCageCode) {
        this.excCageCode = excCageCode;
    }
public void setExcSerialNumber(String excSerialNumber) {
        this.excSerialNumber = excSerialNumber;
    }
public void setExcPartNumber(String excPartNumber) {
        this.excPartNumber = excPartNumber;
    }
public void setExcPartyCageCode(String excPartyCageCode) {
        this.excPartyCageCode = excPartyCageCode;
    }
public void setSldPartyId(String sldPartyId) {
        this.sldPartyId = sldPartyId;
    }
public void setBuyPartyId(String buyPartyId) {
        this.buyPartyId = buyPartyId;
    }
public void setDesMethod(String desMethod) {
        this.desMethod = desMethod;
    }
public void setRcdPartyId(String rcdPartyId) {
        this.rcdPartyId = rcdPartyId;
    }
public void setUpgDescription(String upgDescription) {
        this.upgDescription = upgDescription;
    }
public void setInpComments(String inpComments) {
        this.inpComments = inpComments;
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
