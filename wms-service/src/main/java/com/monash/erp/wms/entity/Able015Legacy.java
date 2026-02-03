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
public class Able015Legacy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String purchaseOrderId;
    private String damage;
    private String quantity;
    private String generalDesc;
    private String vendorIdent;
    private String partNumber;
    private String vendorTagAgree;
    private String confirmSerial;
    private String shelfLifeLimit;
    private String serialAgree;
    private String maintRecords;
    private String foreignParts;
    private String approvedVendor;
    private String workRequested;
    private String fAR121;
    private String notes;
    private String inspectorPartyId;
    private LocalDateTime inspectedDate;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
    private String inspectorPartyIdS2;
    private LocalDateTime inspectedDateS2;
    private String notesS2;
public void setId(Long id) {
        this.id = id;
    }
public void setPurchaseOrderId(String purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }
public void setDamage(String damage) {
        this.damage = damage;
    }
public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
public void setGeneralDesc(String generalDesc) {
        this.generalDesc = generalDesc;
    }
public void setVendorIdent(String vendorIdent) {
        this.vendorIdent = vendorIdent;
    }
public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }
public void setVendorTagAgree(String vendorTagAgree) {
        this.vendorTagAgree = vendorTagAgree;
    }
public void setConfirmSerial(String confirmSerial) {
        this.confirmSerial = confirmSerial;
    }
public void setShelfLifeLimit(String shelfLifeLimit) {
        this.shelfLifeLimit = shelfLifeLimit;
    }
public void setSerialAgree(String serialAgree) {
        this.serialAgree = serialAgree;
    }
public void setMaintRecords(String maintRecords) {
        this.maintRecords = maintRecords;
    }
public void setForeignParts(String foreignParts) {
        this.foreignParts = foreignParts;
    }
public void setApprovedVendor(String approvedVendor) {
        this.approvedVendor = approvedVendor;
    }
public void setWorkRequested(String workRequested) {
        this.workRequested = workRequested;
    }
public void setFAR121(String fAR121) {
        this.fAR121 = fAR121;
    }
public void setNotes(String notes) {
        this.notes = notes;
    }
public void setInspectorPartyId(String inspectorPartyId) {
        this.inspectorPartyId = inspectorPartyId;
    }
public void setInspectedDate(LocalDateTime inspectedDate) {
        this.inspectedDate = inspectedDate;
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
public void setInspectorPartyIdS2(String inspectorPartyIdS2) {
        this.inspectorPartyIdS2 = inspectorPartyIdS2;
    }
public void setInspectedDateS2(LocalDateTime inspectedDateS2) {
        this.inspectedDateS2 = inspectedDateS2;
    }
public void setNotesS2(String notesS2) {
        this.notesS2 = notesS2;
    }

}
