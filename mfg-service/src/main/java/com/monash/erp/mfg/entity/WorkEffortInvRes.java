package com.monash.erp.mfg.entity;

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
public class WorkEffortInvRes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String workEffortId;
    private String inventoryItemId;
    private String wegsProductId;
    private String reserveOrderEnumId;
    private String quantity;
    private String quantityNotAvailable;
    private LocalDateTime reservedDatetime;
    private LocalDateTime createdDatetime;
    private LocalDateTime promisedDatetime;
    private LocalDateTime currentPromisedDate;
    private String sequenceId;
public void setId(Long id) {
        this.id = id;
    }
public void setWorkEffortId(String workEffortId) {
        this.workEffortId = workEffortId;
    }
public void setInventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }
public void setWegsProductId(String wegsProductId) {
        this.wegsProductId = wegsProductId;
    }
public void setReserveOrderEnumId(String reserveOrderEnumId) {
        this.reserveOrderEnumId = reserveOrderEnumId;
    }
public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
public void setQuantityNotAvailable(String quantityNotAvailable) {
        this.quantityNotAvailable = quantityNotAvailable;
    }
public void setReservedDatetime(LocalDateTime reservedDatetime) {
        this.reservedDatetime = reservedDatetime;
    }
public void setCreatedDatetime(LocalDateTime createdDatetime) {
        this.createdDatetime = createdDatetime;
    }
public void setPromisedDatetime(LocalDateTime promisedDatetime) {
        this.promisedDatetime = promisedDatetime;
    }
public void setCurrentPromisedDate(LocalDateTime currentPromisedDate) {
        this.currentPromisedDate = currentPromisedDate;
    }
public void setSequenceId(String sequenceId) {
        this.sequenceId = sequenceId;
    }

}
