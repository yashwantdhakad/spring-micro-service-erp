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
public class ProductCostComponentCalc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productId;
    private String costComponentTypeId;
    private String costComponentCalcId;
    private LocalDateTime fromDate;
    private String sequenceNum;
    private LocalDateTime thruDate;
public void setId(Long id) {
        this.id = id;
    }
public void setProductId(String productId) {
        this.productId = productId;
    }
public void setCostComponentTypeId(String costComponentTypeId) {
        this.costComponentTypeId = costComponentTypeId;
    }
public void setCostComponentCalcId(String costComponentCalcId) {
        this.costComponentCalcId = costComponentCalcId;
    }
public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
public void setSequenceNum(String sequenceNum) {
        this.sequenceNum = sequenceNum;
    }
public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }

}
