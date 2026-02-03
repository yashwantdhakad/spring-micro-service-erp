package com.monash.erp.oms.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class OrderItemInventoryRes extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String orderId;
    private String orderItemSeqId;
    private String inventoryItemId;
    private String reserveOrderEnumId;
    private BigDecimal quantity;
    private BigDecimal quantityNotAvailable;
    private LocalDateTime reservedDatetime;
    private LocalDateTime createdDatetime;
    private LocalDateTime promisedDatetime;
    private LocalDateTime currentPromisedDate;
    private LocalDateTime pickStartDate;
public void setId(Long id) {
        this.id = id;
    }
public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
public void setOrderItemSeqId(String orderItemSeqId) {
        this.orderItemSeqId = orderItemSeqId;
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
public void setPickStartDate(LocalDateTime pickStartDate) {
        this.pickStartDate = pickStartDate;
    }

}
