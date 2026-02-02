package com.monash.erp.wms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.Table;

@Entity
@Table(
        name = "picklist_item",
        indexes = {
                @Index(name = "idx_picklist_item_picklist_bin_id", columnList = "picklist_bin_id"),
                @Index(name = "idx_picklist_item_order_id", columnList = "order_id"),
                @Index(name = "idx_picklist_item_inventory_item_id", columnList = "inventory_item_id"),
                @Index(name = "idx_picklist_item_status_id", columnList = "item_status_id")
        }
)
public class PicklistItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String picklistBinId;
    private String orderId;
    private String orderItemSeqId;
    private String shipGroupSeqId;
    private String inventoryItemId;
    private String itemStatusId;
    private String quantity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPicklistBinId() {
        return picklistBinId;
    }

    public void setPicklistBinId(String picklistBinId) {
        this.picklistBinId = picklistBinId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderItemSeqId() {
        return orderItemSeqId;
    }

    public void setOrderItemSeqId(String orderItemSeqId) {
        this.orderItemSeqId = orderItemSeqId;
    }

    public String getShipGroupSeqId() {
        return shipGroupSeqId;
    }

    public void setShipGroupSeqId(String shipGroupSeqId) {
        this.shipGroupSeqId = shipGroupSeqId;
    }

    public String getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public String getItemStatusId() {
        return itemStatusId;
    }

    public void setItemStatusId(String itemStatusId) {
        this.itemStatusId = itemStatusId;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

}
