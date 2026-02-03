package com.monash.erp.oms.accounting.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class FixedAssetProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fixedAssetId;

    private String productId;

    private String fixedAssetProductTypeId;

    private LocalDateTime fromDate;

    private LocalDateTime thruDate;

    private String comments;

    private BigDecimal sequenceNum;

    private BigDecimal quantity;

    private String quantityUomId;
public void setId(Long id) {
        this.id = id;
    }
public void setFixedAssetId(String fixedAssetId) {
        this.fixedAssetId = fixedAssetId;
    }
public void setProductId(String productId) {
        this.productId = productId;
    }
public void setFixedAssetProductTypeId(String fixedAssetProductTypeId) {
        this.fixedAssetProductTypeId = fixedAssetProductTypeId;
    }
public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }
public void setComments(String comments) {
        this.comments = comments;
    }
public void setSequenceNum(BigDecimal sequenceNum) {
        this.sequenceNum = sequenceNum;
    }
public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }
public void setQuantityUomId(String quantityUomId) {
        this.quantityUomId = quantityUomId;
    }
}
