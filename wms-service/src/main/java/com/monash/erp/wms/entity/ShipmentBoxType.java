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
public class ShipmentBoxType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String shipmentBoxTypeId;
    private String description;
    private String dimensionUomId;
    private String boxLength;
    private String boxWidth;
    private String boxHeight;
    private String weightUomId;
    private String boxWeight;
public void setId(Long id) {
        this.id = id;
    }
public void setShipmentBoxTypeId(String shipmentBoxTypeId) {
        this.shipmentBoxTypeId = shipmentBoxTypeId;
    }
public void setDescription(String description) {
        this.description = description;
    }
public void setDimensionUomId(String dimensionUomId) {
        this.dimensionUomId = dimensionUomId;
    }
public void setBoxLength(String boxLength) {
        this.boxLength = boxLength;
    }
public void setBoxWidth(String boxWidth) {
        this.boxWidth = boxWidth;
    }
public void setBoxHeight(String boxHeight) {
        this.boxHeight = boxHeight;
    }
public void setWeightUomId(String weightUomId) {
        this.weightUomId = weightUomId;
    }
public void setBoxWeight(String boxWeight) {
        this.boxWeight = boxWeight;
    }

}
