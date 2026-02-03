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
public class ProductFeatureGroupAndAppl {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productFeatureGroupId;
    private String productFeatureId;
    private LocalDateTime fromDate;
    private LocalDateTime thruDate;
    private String sequenceNum;
    private String productFeatureTypeId;
    private String productFeatureCategoryId;
    private String description;
    private String uomId;
    private String numberSpecified;
    private String defaultAmount;
    private String defaultSequenceNum;
    private String abbrev;
    private String idCode;
public void setId(Long id) {
        this.id = id;
    }
public void setProductFeatureGroupId(String productFeatureGroupId) {
        this.productFeatureGroupId = productFeatureGroupId;
    }
public void setProductFeatureId(String productFeatureId) {
        this.productFeatureId = productFeatureId;
    }
public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }
public void setSequenceNum(String sequenceNum) {
        this.sequenceNum = sequenceNum;
    }
public void setProductFeatureTypeId(String productFeatureTypeId) {
        this.productFeatureTypeId = productFeatureTypeId;
    }
public void setProductFeatureCategoryId(String productFeatureCategoryId) {
        this.productFeatureCategoryId = productFeatureCategoryId;
    }
public void setDescription(String description) {
        this.description = description;
    }
public void setUomId(String uomId) {
        this.uomId = uomId;
    }
public void setNumberSpecified(String numberSpecified) {
        this.numberSpecified = numberSpecified;
    }
public void setDefaultAmount(String defaultAmount) {
        this.defaultAmount = defaultAmount;
    }
public void setDefaultSequenceNum(String defaultSequenceNum) {
        this.defaultSequenceNum = defaultSequenceNum;
    }
public void setAbbrev(String abbrev) {
        this.abbrev = abbrev;
    }
public void setIdCode(String idCode) {
        this.idCode = idCode;
    }

}
