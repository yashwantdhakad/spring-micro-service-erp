package com.monash.erp.wms.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class ShippingDocument {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String documentId;
    private String shipmentId;
    private String shipmentItemSeqId;
    private String shipmentPackageSeqId;
    private String description;
public void setId(Long id) {
        this.id = id;
    }
public void setDocumentId(String documentId) {
        this.documentId = documentId;
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
public void setDescription(String description) {
        this.description = description;
    }

}
