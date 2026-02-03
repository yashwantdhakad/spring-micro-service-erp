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
public class Able015Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String inventoryItemId;
    private String verifyDocumentation;
    private String verifyPartConforms;
    private String verifyMaintenancePerformed;
    private String qaOverridePartyId;
    private LocalDateTime qaOverrideDate;
    private String qaNotes;
    private String notes;
    private String inspectorPartyId;
    private LocalDateTime inspectedDate;
    private String inspectorPartyIdS2;
    private LocalDateTime inspectedDateS2;
    private String notesS2;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
public void setId(Long id) {
        this.id = id;
    }
public void setInventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }
public void setVerifyDocumentation(String verifyDocumentation) {
        this.verifyDocumentation = verifyDocumentation;
    }
public void setVerifyPartConforms(String verifyPartConforms) {
        this.verifyPartConforms = verifyPartConforms;
    }
public void setVerifyMaintenancePerformed(String verifyMaintenancePerformed) {
        this.verifyMaintenancePerformed = verifyMaintenancePerformed;
    }
public void setQaOverridePartyId(String qaOverridePartyId) {
        this.qaOverridePartyId = qaOverridePartyId;
    }
public void setQaOverrideDate(LocalDateTime qaOverrideDate) {
        this.qaOverrideDate = qaOverrideDate;
    }
public void setQaNotes(String qaNotes) {
        this.qaNotes = qaNotes;
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
public void setInspectorPartyIdS2(String inspectorPartyIdS2) {
        this.inspectorPartyIdS2 = inspectorPartyIdS2;
    }
public void setInspectedDateS2(LocalDateTime inspectedDateS2) {
        this.inspectedDateS2 = inspectedDateS2;
    }
public void setNotesS2(String notesS2) {
        this.notesS2 = notesS2;
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
