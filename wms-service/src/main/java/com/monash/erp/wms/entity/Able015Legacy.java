package com.monash.erp.wms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPurchaseOrderId() {
        return purchaseOrderId;
    }

    public void setPurchaseOrderId(String purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }

    public String getDamage() {
        return damage;
    }

    public void setDamage(String damage) {
        this.damage = damage;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getGeneralDesc() {
        return generalDesc;
    }

    public void setGeneralDesc(String generalDesc) {
        this.generalDesc = generalDesc;
    }

    public String getVendorIdent() {
        return vendorIdent;
    }

    public void setVendorIdent(String vendorIdent) {
        this.vendorIdent = vendorIdent;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getVendorTagAgree() {
        return vendorTagAgree;
    }

    public void setVendorTagAgree(String vendorTagAgree) {
        this.vendorTagAgree = vendorTagAgree;
    }

    public String getConfirmSerial() {
        return confirmSerial;
    }

    public void setConfirmSerial(String confirmSerial) {
        this.confirmSerial = confirmSerial;
    }

    public String getShelfLifeLimit() {
        return shelfLifeLimit;
    }

    public void setShelfLifeLimit(String shelfLifeLimit) {
        this.shelfLifeLimit = shelfLifeLimit;
    }

    public String getSerialAgree() {
        return serialAgree;
    }

    public void setSerialAgree(String serialAgree) {
        this.serialAgree = serialAgree;
    }

    public String getMaintRecords() {
        return maintRecords;
    }

    public void setMaintRecords(String maintRecords) {
        this.maintRecords = maintRecords;
    }

    public String getForeignParts() {
        return foreignParts;
    }

    public void setForeignParts(String foreignParts) {
        this.foreignParts = foreignParts;
    }

    public String getApprovedVendor() {
        return approvedVendor;
    }

    public void setApprovedVendor(String approvedVendor) {
        this.approvedVendor = approvedVendor;
    }

    public String getWorkRequested() {
        return workRequested;
    }

    public void setWorkRequested(String workRequested) {
        this.workRequested = workRequested;
    }

    public String getFAR121() {
        return fAR121;
    }

    public void setFAR121(String fAR121) {
        this.fAR121 = fAR121;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getInspectorPartyId() {
        return inspectorPartyId;
    }

    public void setInspectorPartyId(String inspectorPartyId) {
        this.inspectorPartyId = inspectorPartyId;
    }

    public LocalDateTime getInspectedDate() {
        return inspectedDate;
    }

    public void setInspectedDate(LocalDateTime inspectedDate) {
        this.inspectedDate = inspectedDate;
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

    public String getInspectorPartyIdS2() {
        return inspectorPartyIdS2;
    }

    public void setInspectorPartyIdS2(String inspectorPartyIdS2) {
        this.inspectorPartyIdS2 = inspectorPartyIdS2;
    }

    public LocalDateTime getInspectedDateS2() {
        return inspectedDateS2;
    }

    public void setInspectedDateS2(LocalDateTime inspectedDateS2) {
        this.inspectedDateS2 = inspectedDateS2;
    }

    public String getNotesS2() {
        return notesS2;
    }

    public void setNotesS2(String notesS2) {
        this.notesS2 = notesS2;
    }

}