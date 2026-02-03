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
public class ShipmentPackage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String shipmentId;
    private String shipmentPackageSeqId;
    private String shipmentBoxTypeId;
    private LocalDateTime dateCreated;
    private String boxLength;
    private String boxHeight;
    private String boxWidth;
    private String dimensionUomId;
    private String weight;
    private String weightUomId;
    private String insuredValue;
public void setId(Long id) {
        this.id = id;
    }
public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }
public void setShipmentPackageSeqId(String shipmentPackageSeqId) {
        this.shipmentPackageSeqId = shipmentPackageSeqId;
    }
public void setShipmentBoxTypeId(String shipmentBoxTypeId) {
        this.shipmentBoxTypeId = shipmentBoxTypeId;
    }
public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }
public void setBoxLength(String boxLength) {
        this.boxLength = boxLength;
    }
public void setBoxHeight(String boxHeight) {
        this.boxHeight = boxHeight;
    }
public void setBoxWidth(String boxWidth) {
        this.boxWidth = boxWidth;
    }
public void setDimensionUomId(String dimensionUomId) {
        this.dimensionUomId = dimensionUomId;
    }
public void setWeight(String weight) {
        this.weight = weight;
    }
public void setWeightUomId(String weightUomId) {
        this.weightUomId = weightUomId;
    }
public void setInsuredValue(String insuredValue) {
        this.insuredValue = insuredValue;
    }

}
