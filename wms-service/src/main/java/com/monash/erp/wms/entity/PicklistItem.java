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
        name = "picklist_item",
        indexes = {
                @Index(name = "idx_picklist_item_picklist_bin_id", columnList = "picklist_bin_id"),
                @Index(name = "idx_picklist_item_order_id", columnList = "order_id"),
                @Index(name = "idx_picklist_item_inventory_item_id", columnList = "inventory_item_id"),
                @Index(name = "idx_picklist_item_status_id", columnList = "item_status_id")
        }
)
@NoArgsConstructor
@Setter
@Getter
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
public void setId(Long id) {
        this.id = id;
    }
public void setPicklistBinId(String picklistBinId) {
        this.picklistBinId = picklistBinId;
    }
public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
public void setOrderItemSeqId(String orderItemSeqId) {
        this.orderItemSeqId = orderItemSeqId;
    }
public void setShipGroupSeqId(String shipGroupSeqId) {
        this.shipGroupSeqId = shipGroupSeqId;
    }
public void setInventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }
public void setItemStatusId(String itemStatusId) {
        this.itemStatusId = itemStatusId;
    }
public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

}
