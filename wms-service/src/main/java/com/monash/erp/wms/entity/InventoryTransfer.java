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
public class InventoryTransfer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String inventoryTransferId;
    private String statusId;
    private String inventoryItemId;
    private String facilityId;
    private String locationSeqId;
    private String containerId;
    private String facilityIdTo;
    private String locationSeqIdTo;
    private String containerIdTo;
    private String itemIssuanceId;
    private LocalDateTime sendDate;
    private LocalDateTime receiveDate;
    private String comments;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
    private String sourceInventoryItemId;
public void setId(Long id) {
        this.id = id;
    }
public void setInventoryTransferId(String inventoryTransferId) {
        this.inventoryTransferId = inventoryTransferId;
    }
public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
public void setInventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }
public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }
public void setLocationSeqId(String locationSeqId) {
        this.locationSeqId = locationSeqId;
    }
public void setContainerId(String containerId) {
        this.containerId = containerId;
    }
public void setFacilityIdTo(String facilityIdTo) {
        this.facilityIdTo = facilityIdTo;
    }
public void setLocationSeqIdTo(String locationSeqIdTo) {
        this.locationSeqIdTo = locationSeqIdTo;
    }
public void setContainerIdTo(String containerIdTo) {
        this.containerIdTo = containerIdTo;
    }
public void setItemIssuanceId(String itemIssuanceId) {
        this.itemIssuanceId = itemIssuanceId;
    }
public void setSendDate(LocalDateTime sendDate) {
        this.sendDate = sendDate;
    }
public void setReceiveDate(LocalDateTime receiveDate) {
        this.receiveDate = receiveDate;
    }
public void setComments(String comments) {
        this.comments = comments;
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
public void setSourceInventoryItemId(String sourceInventoryItemId) {
        this.sourceInventoryItemId = sourceInventoryItemId;
    }

}
