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
import java.time.LocalDateTime;

@Entity
@Table(
        name = "shipment_receipt",
        indexes = {
                @Index(name = "idx_shipment_receipt_inventory_item_id", columnList = "inventory_item_id"),
                @Index(name = "idx_shipment_receipt_shipment_id", columnList = "shipment_id"),
                @Index(name = "idx_shipment_receipt_order_id", columnList = "order_id")
        }
)
@NoArgsConstructor
@Setter
@Getter
public class ShipmentReceipt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String receiptId;
    private String inventoryItemId;
    private String productId;
    private String shipmentId;
    private String shipmentItemSeqId;
    private String shipmentPackageSeqId;
    private String orderId;
    private String orderItemSeqId;
    private String returnId;
    private String returnItemSeqId;
    private String rejectionId;
    private String receivedByUserLoginId;
    private LocalDateTime datetimeReceived;
    private String itemDescription;
    private String quantityAccepted;
    private String quantityRejected;
public void setId(Long id) {
        this.id = id;
    }
public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
    }
public void setInventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }
public void setProductId(String productId) {
        this.productId = productId;
    }
public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }
public void setShipmentItemSeqId(String shipmentItemSeqId) {
        this.shipmentItemSeqId = shipmentItemSeqId;
    }
public void setShipmentPackageSeqId(String shipmentPackageSeqId) {
        this.shipmentPackageSeqId = shipmentPackageSeqId;
    }
public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
public void setOrderItemSeqId(String orderItemSeqId) {
        this.orderItemSeqId = orderItemSeqId;
    }
public void setReturnId(String returnId) {
        this.returnId = returnId;
    }
public void setReturnItemSeqId(String returnItemSeqId) {
        this.returnItemSeqId = returnItemSeqId;
    }
public void setRejectionId(String rejectionId) {
        this.rejectionId = rejectionId;
    }
public void setReceivedByUserLoginId(String receivedByUserLoginId) {
        this.receivedByUserLoginId = receivedByUserLoginId;
    }
public void setDatetimeReceived(LocalDateTime datetimeReceived) {
        this.datetimeReceived = datetimeReceived;
    }
public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }
public void setQuantityAccepted(String quantityAccepted) {
        this.quantityAccepted = quantityAccepted;
    }
public void setQuantityRejected(String quantityRejected) {
        this.quantityRejected = quantityRejected;
    }

}
