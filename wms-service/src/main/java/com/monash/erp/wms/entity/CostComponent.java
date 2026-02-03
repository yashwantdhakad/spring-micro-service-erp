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
public class CostComponent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String costComponentId;
    private String costComponentTypeId;
    private String productId;
    private String productFeatureId;
    private String partyId;
    private String geoId;
    private String workEffortId;
    private String fixedAssetId;
    private String costComponentCalcId;
    private LocalDateTime fromDate;
    private LocalDateTime thruDate;
    private String cost;
    private String costUomId;
public void setId(Long id) {
        this.id = id;
    }
public void setCostComponentId(String costComponentId) {
        this.costComponentId = costComponentId;
    }
public void setCostComponentTypeId(String costComponentTypeId) {
        this.costComponentTypeId = costComponentTypeId;
    }
public void setProductId(String productId) {
        this.productId = productId;
    }
public void setProductFeatureId(String productFeatureId) {
        this.productFeatureId = productFeatureId;
    }
public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
public void setGeoId(String geoId) {
        this.geoId = geoId;
    }
public void setWorkEffortId(String workEffortId) {
        this.workEffortId = workEffortId;
    }
public void setFixedAssetId(String fixedAssetId) {
        this.fixedAssetId = fixedAssetId;
    }
public void setCostComponentCalcId(String costComponentCalcId) {
        this.costComponentCalcId = costComponentCalcId;
    }
public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }
public void setCost(String cost) {
        this.cost = cost;
    }
public void setCostUomId(String costUomId) {
        this.costUomId = costUomId;
    }

}
