package com.monash.erp.wms.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.Table;

@Entity
@Table(
        name = "picklist_bin",
        indexes = {
                @Index(name = "idx_picklist_bin_picklist_id", columnList = "picklist_id"),
                @Index(name = "idx_picklist_bin_primary_order_id", columnList = "primary_order_id"),
                @Index(name = "idx_picklist_bin_picklist_bin_id", columnList = "picklist_bin_id")
        }
)
@NoArgsConstructor
@Setter
@Getter
public class PicklistBin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String picklistBinId;
    private String picklistId;
    private String binLocationNumber;
    private String primaryOrderId;
    private String primaryShipGroupSeqId;
public void setId(Long id) {
        this.id = id;
    }
public void setPicklistBinId(String picklistBinId) {
        this.picklistBinId = picklistBinId;
    }
public void setPicklistId(String picklistId) {
        this.picklistId = picklistId;
    }
public void setBinLocationNumber(String binLocationNumber) {
        this.binLocationNumber = binLocationNumber;
    }
public void setPrimaryOrderId(String primaryOrderId) {
        this.primaryOrderId = primaryOrderId;
    }
public void setPrimaryShipGroupSeqId(String primaryShipGroupSeqId) {
        this.primaryShipGroupSeqId = primaryShipGroupSeqId;
    }

}
