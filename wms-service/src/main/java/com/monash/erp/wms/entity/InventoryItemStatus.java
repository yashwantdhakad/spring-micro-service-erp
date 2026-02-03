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
public class InventoryItemStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String inventoryItemId;
    private String statusId;
    private LocalDateTime statusDatetime;
    private LocalDateTime statusEndDatetime;
    private String changeByUserLoginId;
    private String ownerPartyId;
    private String productId;
public void setId(Long id) {
        this.id = id;
    }
public void setInventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }
public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
public void setStatusDatetime(LocalDateTime statusDatetime) {
        this.statusDatetime = statusDatetime;
    }
public void setStatusEndDatetime(LocalDateTime statusEndDatetime) {
        this.statusEndDatetime = statusEndDatetime;
    }
public void setChangeByUserLoginId(String changeByUserLoginId) {
        this.changeByUserLoginId = changeByUserLoginId;
    }
public void setOwnerPartyId(String ownerPartyId) {
        this.ownerPartyId = ownerPartyId;
    }
public void setProductId(String productId) {
        this.productId = productId;
    }

}
