package com.monash.erp.mfg.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(
        name = "work_effort_inv_reservation",
        indexes = {
                @Index(name = "idx_work_effort_inv_res_work_effort_id", columnList = "work_effort_id"),
                @Index(name = "idx_work_effort_inv_res_inventory_item_id", columnList = "inventory_item_id"),
                @Index(name = "idx_work_effort_inv_res_reference_number", columnList = "wegs_reference_number")
        }
)
@NoArgsConstructor
@Setter
@Getter
public class WorkEffortInvReservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String workEffortId;
    private String inventoryItemId;
    private String reserveOrderEnumId;
    private BigDecimal quantity;
    private BigDecimal quantityNotAvailable;
    private LocalDateTime reservedDatetime;
    private LocalDateTime createdDatetime;
    private LocalDateTime promisedDatetime;
    private LocalDateTime currentPromisedDate;
    private BigDecimal sequenceId;
    private String wegsReferenceNumber;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
public void setId(Long id) {
        this.id = id;
    }
public void setWorkEffortId(String workEffortId) {
        this.workEffortId = workEffortId;
    }
public void setInventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }
public void setReserveOrderEnumId(String reserveOrderEnumId) {
        this.reserveOrderEnumId = reserveOrderEnumId;
    }
public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }
public void setQuantityNotAvailable(BigDecimal quantityNotAvailable) {
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
public void setSequenceId(BigDecimal sequenceId) {
        this.sequenceId = sequenceId;
    }
public void setWegsReferenceNumber(String wegsReferenceNumber) {
        this.wegsReferenceNumber = wegsReferenceNumber;
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
