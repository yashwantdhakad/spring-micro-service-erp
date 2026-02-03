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
        name = "shipment_item",
        indexes = {
                @Index(name = "idx_shipment_item_shipment_id", columnList = "shipment_id"),
                @Index(name = "idx_shipment_item_shipment_item_seq", columnList = "shipment_id, shipment_item_seq_id"),
                @Index(name = "idx_shipment_item_product_id", columnList = "product_id")
        }
)
@NoArgsConstructor
@Setter
@Getter
public class ShipmentItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String shipmentId;
    private String shipmentItemSeqId;
    private String productId;
    private String quantity;
    private String shipmentContentDescription;
public void setId(Long id) {
        this.id = id;
    }
public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }
public void setShipmentItemSeqId(String shipmentItemSeqId) {
        this.shipmentItemSeqId = shipmentItemSeqId;
    }
public void setProductId(String productId) {
        this.productId = productId;
    }
public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
public void setShipmentContentDescription(String shipmentContentDescription) {
        this.shipmentContentDescription = shipmentContentDescription;
    }

}
