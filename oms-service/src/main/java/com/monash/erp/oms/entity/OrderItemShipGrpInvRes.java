package com.monash.erp.oms.entity;

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
        name = "order_item_ship_grp_inv_res",
        indexes = {
                @Index(name = "idx_order_item_ship_grp_inv_res_order_id", columnList = "order_id"),
                @Index(name = "idx_order_item_ship_grp_inv_res_inventory_item_id", columnList = "inventory_item_id"),
                @Index(name = "idx_order_item_ship_grp_inv_res_order_item", columnList = "order_id, order_item_seq_id"),
                @Index(name = "idx_order_item_ship_grp_inv_res_qty_not_avail", columnList = "quantity_not_available")
        }
)
public class OrderItemShipGrpInvRes extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String orderId;
    private String shipGroupSeqId;
    private String orderItemSeqId;
    private String inventoryItemId;
    private String reserveOrderEnumId;
    private BigDecimal quantity;
    private BigDecimal quantityNotAvailable;
    private LocalDateTime reservedDatetime;
    private LocalDateTime createdDatetime;
    private LocalDateTime promisedDatetime;
    private LocalDateTime currentPromisedDate;
    private String priority;
    private BigDecimal sequenceId;
    private LocalDateTime pickStartDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getShipGroupSeqId() {
        return shipGroupSeqId;
    }

    public void setShipGroupSeqId(String shipGroupSeqId) {
        this.shipGroupSeqId = shipGroupSeqId;
    }

    public String getOrderItemSeqId() {
        return orderItemSeqId;
    }

    public void setOrderItemSeqId(String orderItemSeqId) {
        this.orderItemSeqId = orderItemSeqId;
    }

    public String getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public String getReserveOrderEnumId() {
        return reserveOrderEnumId;
    }

    public void setReserveOrderEnumId(String reserveOrderEnumId) {
        this.reserveOrderEnumId = reserveOrderEnumId;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getQuantityNotAvailable() {
        return quantityNotAvailable;
    }

    public void setQuantityNotAvailable(BigDecimal quantityNotAvailable) {
        this.quantityNotAvailable = quantityNotAvailable;
    }

    public LocalDateTime getReservedDatetime() {
        return reservedDatetime;
    }

    public void setReservedDatetime(LocalDateTime reservedDatetime) {
        this.reservedDatetime = reservedDatetime;
    }

    public LocalDateTime getCreatedDatetime() {
        return createdDatetime;
    }

    public void setCreatedDatetime(LocalDateTime createdDatetime) {
        this.createdDatetime = createdDatetime;
    }

    public LocalDateTime getPromisedDatetime() {
        return promisedDatetime;
    }

    public void setPromisedDatetime(LocalDateTime promisedDatetime) {
        this.promisedDatetime = promisedDatetime;
    }

    public LocalDateTime getCurrentPromisedDate() {
        return currentPromisedDate;
    }

    public void setCurrentPromisedDate(LocalDateTime currentPromisedDate) {
        this.currentPromisedDate = currentPromisedDate;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public BigDecimal getSequenceId() {
        return sequenceId;
    }

    public void setSequenceId(BigDecimal sequenceId) {
        this.sequenceId = sequenceId;
    }

    public LocalDateTime getPickStartDate() {
        return pickStartDate;
    }

    public void setPickStartDate(LocalDateTime pickStartDate) {
        this.pickStartDate = pickStartDate;
    }




}
